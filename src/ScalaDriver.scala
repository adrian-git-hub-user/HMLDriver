import data.Similarity
import data.SimilarityData
import data.CaseClasses.User


object ScalaDriver {

    def main(args: Array[String]) {
     
      val s = new Similarity
      val sd = new SimilarityData();
      
      val userList : List[User] = sd.getUsers;
      
      s.getJaccardCoefficient(List(1,1,1,1) , List(0,1,0,0))

    }

}