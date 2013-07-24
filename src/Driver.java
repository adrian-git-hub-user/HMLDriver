import com.algorithms.simmilarity.JaccardCoefficient;
import com.driver.java.DendrogramPanel;
import com.hml.generator.Combinations;
import com.hml.weka.WekaKmeansDriver;

import data.Data;

public class Driver {

	public static void main(String args[]){
		
		new Combinations().generateCombinations();
        
		new WekaKmeansDriver().runKMeans(6);
		
		//JaccardCoefficient.main(args);
		
		//new DendrogramPanel().createCluster(new Data().getDistances9by9() , new Combinations().generateStringHeadersForClustering(9));
	}

}
