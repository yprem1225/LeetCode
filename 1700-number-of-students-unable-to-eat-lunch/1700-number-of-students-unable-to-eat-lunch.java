class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> q = new LinkedList<>();

        // Put all students into queue
        for(int std : students){
            q.add(std);
        }

        int i = 0;// points to top sandwich
        int count = 0;  // students who refused consecutively

        while(!q.isEmpty()){
            if(q.peek() == sandwiches[i]){
                // Student takes sandwich
                q.remove();
                i++;

                count = 0;  // reset because someone ate
            }else{
                // Student goes to the end
                q.add(q.remove());
                count++;
            }

              // Nobody in the queue wants the current sandwich
            if(count == q.size()){
                break;
            }

        }

        return count;
        
    }
}