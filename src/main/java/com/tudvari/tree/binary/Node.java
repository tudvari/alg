package com.tudvari.tree.binary;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter @Setter @EqualsAndHashCode public class Node<T extends Number> implements Comparable<T>
{
    private Node<T> left;
    private Node<T> right;
    private T value;

    public Node(T value)
    {
        this.value = value;
    }

    @Override public int compareTo(T o)
    {
        return (new BigDecimal(value.toString()).compareTo(new BigDecimal(o.toString())));
    }
}
