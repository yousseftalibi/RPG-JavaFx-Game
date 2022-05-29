package com.isep.rpg;

class Food implements Consumable {
  String name;
  int lifePointsAdded;

  Food() {
  }

  Food(String name, int lifePointsAdded) {
    this.name = name;
    this.lifePointsAdded = lifePointsAdded;
  }

}
