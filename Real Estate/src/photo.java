public class photo extends House {
String name;
float Size;

public photo() {
	name="";
	Size=0;
}
public photo(String name,float Size){
	this.name=name;
	this.Size=Size;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSize() {
	return Size;
}
public void setSize(float size) {
	Size = size;
}

public void cd() {
	
}
}
