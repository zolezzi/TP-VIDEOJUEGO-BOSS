package quantumPeaceMaker

import com.uqbar.vainilla.GameScene

class QuantumPeaceMakerScene extends GameScene{
  
  val player = new QuantumShip(this)
  val n1 = new Enemy
  val n2 = new Enemy
  val n3 = new Enemy
  
  ControllerTheCollision.addEnemy(n1)
  ControllerTheCollision.addEnemy(n2)
  ControllerTheCollision.addEnemy(n3)
  
  val n = ControllerTheCollision.enemigos.size
  
  this.addComponent(EnemySpawner)
  this.addComponent(player)
}