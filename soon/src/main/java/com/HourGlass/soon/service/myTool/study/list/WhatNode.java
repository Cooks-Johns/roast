//package com.HourGlass.soon.service.myTool.study.list;
//
//import java.io.*;
//import java.util.LinkedList;
//
//public class WhatNode {
//
//
//// Insertion into Linked List -------------> Start
//    Node head; // The start of list
//
//    static class Node {
//
//        int data;
//        Node next;
//        Node(int nodeData) {
//            data = nodeData;
//            next = null;
//        }
//    }
//
//// With this method java will Insert a for a new node
//    public static LinkedList insert(LinkedList listWithData, int newData) {
//
//        Node newBeeNode = new Node(newData);
//        newBeeNode.next = null;
//
//        // When our list is empty this will make the new node the head
//        if (listWithData.head == null) {
//            listWithData.head = newBeeNode;
//        } else {
//            Node last = listWithData.head;
//            while (last.next != null) {
//                last = last.next;
//            }
//            last.next = newBeeNode;
//        }
//        // With given data make a new node
//        return listWithData;
//    }
//
//
//
//    private static void listInsert() {
//        LinkedList mainList = new LinkedList();
//
//        mainList = insert(mainList, 11);
//        mainList = insert(mainList, 12);
//        mainList = insert(mainList, 13);
//        mainList = insert(mainList, 14);
//        mainList = insert(mainList, 15);
//        mainList = insert(mainList, 16);
//        mainList = insert(mainList, 17);
//    }
//
//// End
//
//
//}
