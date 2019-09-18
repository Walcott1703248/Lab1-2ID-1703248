import java.util.Scanner;
import java.io.*;
public class House {
	private int id;
	private float price;
	private String location;
	private String advertiser;
	private photo image;
	public House() {
		id=0;
		price= 0.0f;
		location= "";
		advertiser= "";
		
	}
	    public House(int id,float price,String location,String advertiser, photo image) {
		this.id=id;
		this.price=price;
		this.location=location;
		this.advertiser=advertiser;
		this.image= new photo();
	}
	
	
	
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAdvertiser() {
		return advertiser;
	}
	public void setAdvertiser(String advertiser) {
		this.advertiser = advertiser;
	}
	
	public photo getImage() {
		return image;
	}
	public void setImage(photo image) {
		this.image = image;
	}
	
	public void collect() {
	int i=0;
	while(i<4) {
			
	
		 Scanner scanner = new Scanner(System.in); //reader 
		System.out.println("Enter your ID #:");//printer
		 int id =  scanner.nextInt();//r
		 
		 
		 
		System.out.println("Enter the value of the property:");
		 float price =  scanner.nextInt();
		 
		System.out.println("Enter the location of the property:");
		String location = scanner.next();
		
		System.out.println("Enter the name of the advertister:");
		String advertiser = scanner.next();
		i++;
	}
		try {
	
			
			FileWriter file =new FileWriter("house.text", true);
			file.write(id + "\t" + price + "\t" + location + "\t" + advertiser + "\t"  + "\r\n");
			
			file.close();
		}
		catch(Exception e) {
			e.getMessage(); 
		} 
		
		System.out.println("results" + id);
		System.out.println("results" + price);
		System.out.println("name of locaton is :"+ location);
		System.out.println("name of advertiser is :"+ advertiser); 
	}
	
	}

