
class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        HashSet<Long> set= new HashSet<>();
        
        for(int i=0; i<n;i++){
            if(!set.contains(a1[i])){
                set.add(a1[i]);
            }
        }
        for(int i=0; i<m;i++){
            if(!set.contains(a2[i])){
               return "No";
            }
        }
        return "Yes";
    }
}
