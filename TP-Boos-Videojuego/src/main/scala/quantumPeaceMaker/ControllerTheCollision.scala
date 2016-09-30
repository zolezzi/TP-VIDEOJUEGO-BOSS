package quantumPeaceMaker



object ControllerTheCollision {
   
  var enemigos: List[(Enemy)] = List()
  
  var lasers: List[(LaserShot)] = List()
  
  def addEnemy (enemy: Enemy){
    enemy :: enemigos
  }

  def addLaser(laser: LaserShot){
    laser :: lasers
  }
 
  def removeLaser(laser : LaserShot){
    for(l <- this.lasers){
      if(l != laser){
        l :: lasers
      }
    }  
  }
  
  def removeEnemy(enemy : Enemy){
    for(e <- enemigos){
      if(e != enemy){
        e :: enemigos
      }
    }
  }
  
}