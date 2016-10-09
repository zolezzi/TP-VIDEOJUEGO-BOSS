package quantumPeaceMaker

import com.uqbar.vainilla.GameComponent


object Collision extends GameComponent[QuantumPeaceMakerScene] {
  
    val detector = com.uqbar.vainilla.colissions.CollisionDetector.INSTANCE
  
    val diameter = 40
    val radius = diameter.toDouble / 2
    
    val collisionMargin = 30
    
    def isCollisionE(laser: LaserShot, enemigos: List[Enemy]) = {
      
    var hayCollision = false
      
    for(enemy <- enemigos){
      /*if (detector.collidesRectAgainstRect(enemy.position.x1, enemy.position.x2,
                                           enemy.ancho, enemy.alto, 
                                           laser.position.x1, laser.position.x1, 
                                           laser.ancho, laser.alto)){
          
        getScene.removeComponent(enemy)
        hayCollision = true
          
       }
      if (this.hayColision(laser, enemy)){
        getScene.removeComponent(enemy)
        hayCollision = true
      }
    }       
    hayCollision  */
     
        hayCollision = hayCollision || this.hayColision(laser, enemy) 
      }
    
    hayCollision
    }
    
   def hayColision (laser: LaserShot, enemy: Enemy) = {
     val rec1 = laser.rec
     val rec2 = enemy.rec
      
     val right1 = rec1.getWidth + rec1.getX
     val right2 = rec2.getX + rec2.getWidth
     val bottom1 =  rec1.getY + rec1.getHeight;
     val bottom2 = rec2.getHeight + rec1.getY

    (rec1.getX <= rec2.getX && rec2.getX < right1 || rec2.getX <= rec1.getX && rec1.getX < right2) && (rec1.getY <= rec2.getY && rec2.getY < bottom1 || rec2.getY <= rec1.getY && rec1.getY < bottom2)
   }
}