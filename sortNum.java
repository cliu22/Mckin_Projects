
public class sortNum {
	int[] list = new int[14];
	int[] element = new int[14];
	int[] count = new int[14];
	int pass;
	int indexOfLargest;
	int i,j;
	
	sortNum(int[] _list){
		list=_list;
	}
	
	void count(){
		int a=0;
		while(a<list.length){
			for(j=0;j<=i;j++){
				if(list[i]==element[j]){
					count[j]++;
					j++;
					i++;
					break;
				}
				else{
					if(j==i){
						element[j]=list[i];
						count[j]=1;
						i++;
						j++;
					}
				}
			}
			a++;
		}
		selectionSort();
		for(int p=0;p<element.length;p++){
			if(count[p]>1){
				System.out.print(element[p]);
				System.out.print(' ');
				System.out.print(count[p]);
				System.out.println();
			}
		}
	}
	
	void selectionSort(){
		int pass=0, indexOfSmallest;
		while(pass<count.length){
			indexOfSmallest=pass;
			for(int i=pass+1;i<count.length;i++){
				if(count[indexOfSmallest]>count[i])
					indexOfSmallest=i;
			}
		swap(count[pass],count[indexOfSmallest],element[pass],element[indexOfSmallest]);
		pass++;
		}
	}
	
	void swap(int a,int b,int c,int d){
		int temp1=0,temp2=0;
		temp1=a;
		a=b;
		b=temp1;
		temp2=c;
		c=d;
		d=temp2;
	}
	
	public static void main(String[] args){
		int[] list = new int[14];
		for(int m=0;m<list.length;m++){
			list[m]=1+(int)(Math.random()*7);	
			System.out.print(list[m]);
			System.out.print(' ');
		}
		System.out.println('\n');
		sortNum num = new sortNum(list);
		num.count();
	}
		
}
