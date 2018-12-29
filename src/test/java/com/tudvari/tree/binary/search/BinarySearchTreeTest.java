package com.tudvari.tree.binary.search;

import com.tudvari.tree.binary.Node;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BinarySearchTreeTest
{

    @Test public void test_build_tree_with_root()
    {
        BinarySearchTree tree = new BinarySearchTree<Integer>();

        Node root = tree.buildBinarySearchTree(Arrays.asList(1));

        Assert.assertNull(root.getLeft());
        Assert.assertNull(root.getRight());
        Assert.assertNotNull(root.getValue());
        Assert.assertEquals(1, root.getValue());
    }

    @Test public void test_build_tree_with_two_node()
    {
        BinarySearchTree tree = new BinarySearchTree<Integer>();

        Node root = tree.buildBinarySearchTree(Arrays.asList(1, 2));

        Assert.assertNull(root.getLeft());

        Assert.assertNotNull(root.getRight());
        Assert.assertNotNull(root.getValue());

        Assert.assertNotNull(root.getRight().getValue());

        Assert.assertEquals(1, root.getValue());
        Assert.assertEquals(2, root.getRight().getValue());
    }

    @Test public void test_build_tree_with_three_node()
    {
        BinarySearchTree tree = new BinarySearchTree<Integer>();

        Node root = tree.buildBinarySearchTree(Arrays.asList(1, 2, -1));

        Assert.assertNotNull(root.getLeft());

        Assert.assertNotNull(root.getRight());
        Assert.assertNotNull(root.getValue());

        Assert.assertNotNull(root.getRight().getValue());
        Assert.assertNotNull(root.getLeft().getValue());

        Assert.assertEquals(1, root.getValue());
        Assert.assertEquals(2, root.getRight().getValue());
        Assert.assertEquals(-1, root.getLeft().getValue());
    }

    @Test public void test_build_tree_with_four_node()
    {
        BinarySearchTree tree = new BinarySearchTree<Integer>();

        Node root = tree.buildBinarySearchTree(Arrays.asList(1, 2, -1, 4));

        Assert.assertNotNull(root.getLeft());
        Assert.assertNotNull(root.getRight());

        Assert.assertNotNull(root.getValue());

        Assert.assertNotNull(root.getRight().getValue());
        Assert.assertNotNull(root.getRight().getRight().getValue());

        Assert.assertNotNull(root.getLeft().getValue());

        Assert.assertEquals(-1, root.getLeft().getValue());

        Assert.assertEquals(2, root.getRight().getValue());
        Assert.assertEquals(4, root.getRight().getRight().getValue());

        Assert.assertEquals(1, root.getValue());
    }
}
