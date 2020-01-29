package demo;

public class Prime {
  public boolean primeNumberCheck(int no) {
	  int count=0;
	  for(int i=1;i<=no;i++) {
		  if(no%i==0)
			  count++;
	  }
	  if(count==2)
		  return true;
	  else
		  return false;
  }
}
