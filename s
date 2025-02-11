public class pop {}
        // 
void mege( int arr[],int left,int mid , int right )
{
int n1= mid-left+1;
int n2  = right0mid ;
int leftarr[n],rightarr[n2]
for(int i =0;i<n1;i++){
leftarr[i]=arr[left+i];
}
fpr( int i=0;i<n2;i++)
{
rightarr[i]=ar[mid-1-i]
}
int i =0;i<0;k=left ;
while(1<n1&&j<n2)
 {
    if(leftarr[i]<=rightarr[j])
    {

    }
 }
    while(j<n2){
        arr[k]=right[j];
        j++;
        k++;
    } 
    }

    void mergesort(int arr[], int left, int right )
{
    if(left<right){
        int mid =(left+right)/2;

        mergesort(arr, left, mid);
        mergesort(arr,mid+1,right);
        merge(arr,mid,right);
    }
}}
