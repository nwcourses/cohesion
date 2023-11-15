/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cohesion;

/**
 *
 * @author nick
 */
public class Game {
    
            
    int monsterX, monsterY, heroX, heroY, heroOrigX, heroOrigY, monsterOrigX, monsterOrigY;
    int heroLives = 3;
    
    public Game(int hx, int hy, int mx, int my) {
        heroX = hx;
        heroY = hy;
        monsterX = mx;
        monsterY = my;
        heroOrigX = hx;
        heroOrigY = hy;
        monsterOrigX = mx;
        monsterOrigY = my;
    }
    
    public void monsterChaseHero() {
        if(monsterX > heroX) {
            monsterX--;
        } else if (monsterX < heroX) {
            monsterX++;
        }
         if(monsterY > heroY) {
            monsterY--;
        } else if (monsterY < heroY) {
            monsterY++;
        }
    }
    
    public boolean monsterHasCaughtHero() {
        return monsterX==heroX && monsterY == heroY;
    }
    
    public void playGame() {
        while(heroLives > 0) {
            monsterChaseHero();
            if(monsterHasCaughtHero()) {
                heroLives--;
                resetHeroAndMonster();
            }
            printHero();
            printMonster();
        }
    }
    
    public void printHero() {
        System.out.println("Hero x=" + heroX + " hero y=" + heroY + " hero lives=" + heroLives);
    }
    
       
    public void printMonster() {
        System.out.println("Monstrer x=" + monsterX + " monster y=" + monsterY);
    }
    
    // resets characters to their original position
    
    public void resetHeroAndMonster() {
        heroX = heroOrigX;
        heroY = heroOrigY;
        monsterX = monsterOrigX;
        monsterY = monsterOrigY;
    }
    
}
