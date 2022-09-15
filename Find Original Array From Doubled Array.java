class Solution {
    public int[] findOriginalArray(int[] changed) {
       
        List<Integer> temp = new ArrayList<>();
        Queue<Integer> x = new LinkedList<>();
        Arrays.sort(changed);

        for(int num : changed)
        {
            if(num%2==0 && !x.isEmpty() && x.peek()==num/2)
                temp.add(x.poll());
            else x.add(num);
        }

        if(x.size()>0) return new int[]{};
        
        return temp.stream().mapToInt(i->i).toArray();
    }
}
