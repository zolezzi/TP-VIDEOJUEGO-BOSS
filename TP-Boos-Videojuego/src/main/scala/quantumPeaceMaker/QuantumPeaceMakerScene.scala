package quantumPeaceMaker

import com.uqbar.vainilla.GameScene

class QuantumPeaceMakerScene extends GameScene{
  
  val player = new QuantumShip(this)
  
  this.addComponent(EnemySpawner)
  this.addComponent(player)
}