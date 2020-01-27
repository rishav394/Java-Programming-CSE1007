import java.util.*;

class Film {
    String name, language, lead_actor, category;
    int duration;
    Film(){
    }
    Film(String name, String language, String lead_actor, String category, int duration){
        this.name = name;
        this.language = language;
        this.lead_actor = lead_actor;
        this.category = category;
        this.duration = duration;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setLanguage(String language){
        this.language = language;
    }
    public String getLanguage(){
        return this.language;
    }
    public void setLead_actor(String lead_actor){
        this.lead_actor = lead_actor;
    }
    public String getLead_actor(){
        return this.lead_actor;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public String getCategory(){
        return this.category;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }
    public int getDuration(){
        return this.duration;
    }
    public void display(){
        System.out.println("name -> " + name);
        System.out.println("language -> " + language);
        System.out.println("lead_actor -> " + lead_actor);
        System.out.println("category -> " + category);
        System.out.println("duration -> " + duration);
        System.out.println("-----------------------");
    }
}

public class q5
{
	public static void main(String[] args) {
        Vector<Film> v = new Vector<Film>();
        v.add(new Film("Robot", "Tamil", "Rajini", "fiction", 200));
        v.add(new Film("Don no 1", "English", "Thor", "comedy", 190));
        v.add(new Film("Singham", "Tamil", "Rajini", "drama", 120));
        v.add(new Film("Singham 2", "English", "Arnold", "action", 100));
        v.add(new Film("Singham 3", "Hindi", "Arnold", "comedy", 150));
	    
        Film a = null;    
	    Vector<Film> b = new Vector<Film>();
	    Vector<Film> c = new Vector<Film>();
	    
	    Iterator itr = v.iterator();
	    while(itr.hasNext()){
	        Film temp = (Film)itr.next();
	        if (temp.getLead_actor() == "Arnold"){
	            if (a == null || a.getDuration() > temp.getDuration()){
	                a = temp;
	            }
	        }
	        else if(temp.getLead_actor() == "Rajini" && temp.getLanguage() == "Tamil"){
	            b.add(temp);
	        }
	        
	        if(temp.getCategory() == "comedy"){
	            c.add(temp);
	        }
	    }
	    
	    System.out.println("The English film that has Arnold as its lead actor and that runs for shortest duration is ");
	    a.display();
	    System.out.println("The Tamil film with Rajini as lead actor ");
	    Iterator bIt = b.iterator();
	    while(bIt.hasNext()){
	        ((Film)bIt.next()).display();
	    }
	    System.out.println("All the comedy movies ");
	    Iterator cIt = c.iterator();
	    while(cIt.hasNext()){
	        ((Film)cIt.next()).display();
	    }
	}
}




