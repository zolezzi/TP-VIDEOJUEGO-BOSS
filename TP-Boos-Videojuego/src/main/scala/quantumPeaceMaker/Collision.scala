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
      if (detector.collidesRectAgainstRect(enemy.position.x1, enemy.position.x2,
                                           enemy.ancho, enemy.alto, 
                                           laser.position.x1, laser.position.x1, 
                                           laser.ancho, laser.alto)){
          
        getScene.removeComponent(enemy)
        hayCollision = true
          
       }
  //    if(laser.rec.intersects(enemy.rec)){
    //    getScene.removeComponent(enemy)
      //  hayCollision = true
      //}
    }       
    hayCollision  
  }
    /*detector.collidesCircleAgainstRect(enemy.position.x1, enemy.position.x2, 
                                               radius, laser.position.x1,
                                               laser.position.x2, laser.ancho, laser.alto)*/
}