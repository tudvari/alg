package com.tudvari.tree.binary.traversal;

import com.tudvari.tree.binary.Node;

import java.util.Collections;
import java.util.List;

public class PreorderTraversal
{
    public static List traverse(Node root, List items)
    {
        if (root == null)
        {
            return Collections.EMPTY_LIST;
        }

        items.add(root);

        if (root.getLeft() != null)
        {
            traverse(root.getLeft(), items);
        }

        if (root.getRight() != null)
        {
            traverse(root.getRight(), items);
        }

        return items;
    }
}
