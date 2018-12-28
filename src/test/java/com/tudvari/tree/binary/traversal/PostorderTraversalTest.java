package com.tudvari.tree.binary.traversal;

import com.tudvari.tree.binary.Node;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PostorderTraversalTest
{
    @Test public void empty_root()
    {
        List result = PreorderTraversal.traverse(null, Collections.EMPTY_LIST);
        Assert.assertTrue(result.isEmpty());
    }

    @Test public void one_left_item()
    {
        Node<Integer> root = new Node(0);
        Node<Integer> left = new Node(1);
        root.setLeft(left);

        List result = PostorderTraversal.traverse(root, new ArrayList<Integer>());

        Assert.assertEquals(2, result.size());

        List<Node> expected = new ArrayList<>();

        expected.add(left);
        expected.add(root);

        Assert.assertEquals(expected, result);
    }

    @Test public void one_left_and_right_item()
    {
        Node<Integer> root = new Node(0);
        Node<Integer> left = new Node(1);
        Node<Integer> right = new Node(2);

        root.setRight(right);
        root.setLeft(left);

        List result = PostorderTraversal.traverse(root, new ArrayList<Integer>());

        Assert.assertEquals(3, result.size());

        List<Node> expected = new ArrayList<>();

        expected.add(left);
        expected.add(right);
        expected.add(root);

        Assert.assertEquals(expected, result);
    }

    @Test public void two_left_two_right_item()
    {
        Node<Integer> root = new Node(0);
        Node<Integer> left = new Node(1);
        Node<Integer> right = new Node(2);

        Node<Integer> left21 = new Node(3);
        Node<Integer> left22 = new Node(4);

        Node<Integer> right21 = new Node(5);
        Node<Integer> right22 = new Node(6);

        left.setLeft(left21);
        left.setRight(left22);

        right.setLeft(right21);
        right.setRight(right22);

        root.setRight(right);
        root.setLeft(left);

        List result = PostorderTraversal.traverse(root, new ArrayList<Integer>());

        Assert.assertEquals(7, result.size());

        List<Node> expected = new ArrayList<>();

        expected.add(left21);
        expected.add(left22);
        expected.add(left);

        expected.add(right21);
        expected.add(right22);
        expected.add(right);

        expected.add(root);

        Assert.assertEquals(expected, result);
    }
}
