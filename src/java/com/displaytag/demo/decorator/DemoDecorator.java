/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.displaytag.demo.decorator;

import com.displaytag.demo.ActorData;
import org.displaytag.decorator.TableDecorator ;

/**
 *
 * @author Sandipan
 */
public class DemoDecorator extends TableDecorator {
    
     public String addRowClass()
            {
                return ((ActorData)getCurrentRowObject()).getTvShow().equals("The Office") ? "good" : "bad";
            }
    
}
