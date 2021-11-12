/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {

    public int firstBadVersion(int n) {
    int firstBad = n;
    int low=1,high=n;
        // if only one version
        if(firstBad==1 && isBadVersion(firstBad) ){
            return firstBad;
        }
        while (low <= high) {
        int mid = low  + ((high - low) / 2);
        if (!isBadVersion(mid) && !isBadVersion(mid-1)) {
            low = mid + 1;
                System.out.println("mid low "+mid);
        } else if (isBadVersion(mid-1)&&isBadVersion(mid) && isBadVersion(mid+1)) {
            high = mid - 1;
                System.out.println("mid high"+mid);
        }
            else if (isBadVersion(mid) && !isBadVersion(mid+1)) {
            firstBad = mid;
                System.out.println(firstBad);
                break;
        }else if(isBadVersion(mid) && !isBadVersion(mid-1))     {
                firstBad = mid;
                System.out.println(firstBad);
                break;
            }     else{
                firstBad=0;
                
            }
            
    }  
        // default return
        return firstBad;
    }
}
// link : https://leetcode.com/problems/first-bad-version/