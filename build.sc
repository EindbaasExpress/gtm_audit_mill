// build.sc
import mill._, scalalib._

object GtmAudit extends ScalaModule{
  def scalaVersion = "2.13.7"
  object test extends Tests{
    def ivyDeps = Agg(ivy"com.lihaoyi::utest:0.7.10",
                      ivy"com.google.api-client:google-api-client:1.31.5")
    def testFrameworks = Seq("utest.runner.Framework")
  }
}
