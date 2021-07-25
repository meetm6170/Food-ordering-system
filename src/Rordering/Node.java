/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rordering;

/**
 *
 * @author meet
 */
public class Node {
    String name;
    String code;
    String referalcode;
    Node fromref;
    Node next;
    Node reffirst;
    Node listref;
    int bonus;
    int cashused;
}
