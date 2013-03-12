public class testNum {
	public static void main(String[] args){
		int[] list = new int[14];
		int[] element = new int[14];
		int[] count = new int[14];
		int a=0;
		int i=0,j=0;
		int temp1=0,temp2=0;
		
		for(int m=0;m<list.length;m++){
			list[m]=1+(int)(Math.random()*7);	
			System.out.print(list[m]);
			System.out.print(' ');
		}
		System.out.println('\n');
		
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
		
		int pass=0, indexOfLargest;
		while(pass<count.length){
			indexOfLargest=pass;
			for(i=pass+1;i<count.length;i++){
				if(count[indexOfLargest]<count[i])
					indexOfLargest=i;
			}

			temp1=count[pass];
			count[pass]=count[indexOfLargest];
			count[indexOfLargest]=temp1;
			temp2=element[pass];
			element[pass]=element[indexOfLargest];
			element[indexOfLargest]=temp2;
			pass++;
		}
		
		for(int p=0;p<element.length;p++){
			if(count[p]>1){
				System.out.print(element[p]);
				System.out.print(' ');
				System.out.print(count[p]);
				System.out.println();
			}
		}
	}
}
