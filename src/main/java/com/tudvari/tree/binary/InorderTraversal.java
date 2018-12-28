package com.tudvari.tree.binary;

import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class InorderTraversal
{
    private final static Logger LOGGER = Logger.getLogger(InorderTraversal.class.getName());

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
