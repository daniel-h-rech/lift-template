package bootstrap.liftweb

import net.liftweb.http.LiftRules
import rech.haeser.daniel.RootPackageMarker

class Boot {

  def boot(): Unit = LiftRules.addToPackages(RootPackageMarker.getClass.getPackage)
}
