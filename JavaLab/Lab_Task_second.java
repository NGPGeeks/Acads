package InitialPrograms;

public class Lab02 {
	 public static void main(String[] args) {
	 
	 int population=312032486;
	 int seconds=365*24*60*60;
	 int births=seconds/7;
	 int deaths=seconds/13;
	 int immigrant=seconds/45;
	 for(int i=0;i<5;i++)
	 {
	 population=population+births+immigrant-deaths;
	 System.out.println("Population after "+(i+1)+" year: "+population);
	 }
	 }
}
