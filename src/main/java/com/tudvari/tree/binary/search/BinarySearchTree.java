package com.tudvari.tree.binary.search;

import com.tudvari.tree.binary.Node;

import java.util.List;

public class BinarySearchTree<T extends Number>
{

    public Node buildBinarySearchTree(List<T> values)
    {
        if (values.isEmpty())
        {
            throw new IllegalArgumentException("values should be contains least 1 element");
        }

        T firstItem = values.stream().findFirst().get();

        Node root = new Node(firstItem);

        if (values.size() > 1)
        {
            values.subList(1, values.size()).stream().forEach(item -> { insertValue(root, item); });
        }

        return root;
    }

    private void insertValue(Node root, T item)
    {

        if (root.compareTo(item) == 0)
        {
            throw new IllegalStateException("Item already in the tree.");
        }
        else if ((root.compareTo(item) > 0) && (root.getLeft() != null))
        {
            insertValue(root.getLeft(), item);
        }
        else if ((root.compareTo(item) > 0) && (root.getLeft() == null))
        {
            root.setLeft(new Node(item));
        }
        else if ((root.compareTo(item) < 0) && (root.getRight() != null))
        {
            insertValue(root.getRight(), item);
        }
        else if ((root.compareTo(item) < 0) && (root.getRight() == null))
        {
            root.setRight(new Node(item));
        }
    }
}
