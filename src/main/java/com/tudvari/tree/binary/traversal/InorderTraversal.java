package com.tudvari.tree.binary.traversal;

import com.tudvari.tree.binary.Node;

import java.util.Collections;
import java.util.List;

public class InorderTraversal
{
    public static List traverse(Node root, List items)
    {
        if (root == null)
        {
            return Collections.EMPTY_LIST;
        }

        if (root.getLeft() != null)
        {
            traverse(root.getLeft(), items);
        }

        items.add(root);

        if (root.getRight() != null)
        {
            traverse(root.getRight(), items);
        }

        return items;
    }
}
