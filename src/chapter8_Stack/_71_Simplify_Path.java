package chapter8_Stack;

import java.util.Stack;
//time complexity O(n), space complexity O(n)
public class _71_Simplify_Path {
	/*public String simplifyPath(String path) {
    //in string, path question using stack to solve
    Stack<String> stack = new Stack<>();
    String[] paths = path.split("/+");  //split the string to ".." "." "" "character"
    for(String s: paths){
        if(s.equals("..")){
            if(!stack.isEmpty()){
                stack.pop();
            }
        }else if(!s.equals("") && !s.equals(".")){
            stack.push(s);
        }
    }
    String res = "";
    while(!stack.isEmpty()){
        res = "/" + stack.pop() + res;
    }
    if(res.length() == 0){
        return "/";
    }
    return res;
}*/

//same method, just practice
	public String simplifyPath(String path) {
	    String[] paths = path.split("/");
	    Stack<String> stack = new Stack<>();
	    for(int i = 0; i < paths.length; i++){
	        if(paths[i].equals("..")){  //two string compare use .equals() donot use ==
	            if(!stack.isEmpty()){
	                stack.pop();
	            }
	        }else if(!paths[i].equals("") && !paths[i].equals(".")){    //""means null; " "means space
	            stack.push(paths[i]);
	        }
	    }
	    String res = "";
	    while(!stack.isEmpty()){
	        res = "/" + stack.pop() + res;
	    }
	    if(res.length() == 0){
	        return "/";
	    }
	    return res;
	}
}
