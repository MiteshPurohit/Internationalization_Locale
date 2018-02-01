/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.java;

import java.util.Locale;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 *
 * @author f1cmpica-1
 */
public class Internationalization {
    
    private ResourceBundleMessageSource rbm;

    public ResourceBundleMessageSource getRbm() {
        return rbm;
    }

    public void setRbm(ResourceBundleMessageSource rbm) {
        this.rbm = rbm;
    }
    
    public void display(){
        
        System.out.println("--------------------------------");
        System.out.println(".....In English.....");
        System.out.println(getRbm().getMessage("msg", null, "default English", Locale.ENGLISH));
        System.out.println(getRbm().getMessage("msg1", null, "default English", Locale.ENGLISH));
        System.out.println("--------------------------------");
        System.out.println(".....In French.....");
        System.out.println(getRbm().getMessage("msg", null, "default English", Locale.FRENCH));
        System.out.println(getRbm().getMessage("msg1", null, "default English", Locale.FRENCH));
        System.out.println("--------------------------------");
        System.out.println(".....In Japanes.....");
        System.out.println(getRbm().getMessage("msg", null, "default English", Locale.JAPAN));
        System.out.println(getRbm().getMessage("msg1", null, "default English", Locale.JAPAN));
        System.out.println("--------------------------------");
    }
    
}
