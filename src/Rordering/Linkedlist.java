/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rordering;

import javax.swing.JOptionPane;
import static rordering.menu1.jCheckBox1;

/**
 *
 * @author meet
 */
public class Linkedlist {
    Node head=null;
    
    public void adduser(String name1, String yourcode, String referalcode)
      {
     //   System.out.println("adding"+name1+" "+yourcode+" "+referalcode);
        Node n= new Node();
        n.name = name1;
        n.code = yourcode;
        n.referalcode = referalcode;
        n.fromref = null;
        n.listref = null;
        n.next = null;
        n.reffirst = null;
         n.bonus = 0;
            
        if(head == null)
        {
            head = n;
        }
        else
        {
            
         Node  p = head;
            while(p.next!=null)
            {
                p = p.next;
                
            }
            p.next = n;
            p=head;
            while(p!=null)
            {
                
                if(p.code.equals(n.referalcode))
                    
                {
                   // p.bonus = p.bonus+40;
                    n.fromref=p;
                    if(p.reffirst==null)
                    {
                        p.reffirst=n;
                        break;
                    }
                
                    else if(p.reffirst!=null)
                    {
                        p=p.reffirst;
                        while(p.listref!=null)
                        {
                        p=p.listref;
                        }
                    p.listref=n;
                    break;
                }
                    
                }
                p=p.next;
            }
            if(p==null)
            {
                 //JOptionPane.showMessageDialog(null,"NO SUCH REFERRAL CODE");
             // n.referalcode="-";
            }
            
        }
      /*   Node p = head;
        while(p.next!=null)
        {
            System.out.println(p.name);
            p = p.next;
        }
        System.out.println(p.name);
        */
    }
     public void displaylist(String name1)
    {
        Node d = head;
        while(d!=null)
        {
            if(d.name.equals(name1))
            {
                if(d.reffirst==null)
                {
                    System.out.println("No refered List");
                    break;
                }
                else if(d.reffirst!=null)
                {
                    d=d.reffirst;
                    System.out.println(d.name);
                    
                    
                    while(d.listref!=null)
                    {
                        d=d.listref;
                        System.out.println(d.name);
                         
                        
                    }
                    break;
                }
                
            }
            d=d.next;
        }
        
}
      public void printlist()
    {
        
  
        Node p = head;
        while(p.next!=null)
        {
            System.out.println(p.name);
            p = p.next;
        }
        System.out.println(p.name);
         
                 
        
    }
     public String bonusdisp(String name2)
     {
         Node p = head;
         String cash = null;
         
        int c =0;
         // int s = 0 ;
          //System.out.println(p.bonus);
         // jTextField4.setText("111111");
         while(p!=null)
         {
            // System.out.println("here too");
             // jTextField4.setText("0");
           // s=40;
             if(p.name.equals(name2))
             {
                  if(p.reffirst==null)
                    {
                        p.bonus=0;
                       // break;
                    }
                
                    else if(p.reffirst!=null)
                    {
                        
                      c++;// p.bonus=p.bonus+40;
                       p=p.reffirst;
                     // c++;
                        while(p.listref!=null)
                        {
                        p=p.listref;
                        c++;
                      //  p.bonus=p.bonus+40;
                        }
                       
                  //  p.listref=n;
                   // break;
                }
                 // jTextField4.setText("1");
                // s=40;
               //s=p.bonus;
                //System.out.println(p.bonus);
                cash= String.valueOf(c*40);
                        
              return cash;  
                //s=p.bonus;
              //   break;
               
               // jTextField4.setText(String.valueOf(p.bonus));
             }
             p=p.next;
             
      // jTextField4.setText("111");
     }
         if(p==null)
         {
             //System.out.println("entered here");
             cash="0";
             //return cash;
         }
        /* if(jCheckBox1.isSelected())
            {
                jTextField3.setText();
            }*/
         return cash;
         
      //  return s;
        //return s;
       //System.out.println(cash);
           //jTextField4.setText(cash);
           //return cash;
}
}
