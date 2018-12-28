package com.tudvari.tree.binary;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @EqualsAndHashCode public class Node<T>
{
    private Node<T> left;
    private Node<T> right;
    private T value;

    public Node(T value)
    {
        this.value = value;
    }
}
