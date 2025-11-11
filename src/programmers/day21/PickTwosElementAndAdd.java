package programmers.day21;

public class PickTwosElementAndAdd {
	public int[] solution(int[] numbers) {
        int[] answer = {};
        
        Set<Integer> set = new HashSet<>();
        
        for (int idx=0; idx<numbers.length; idx++){
            for (int iterIdx=idx+1; iterIdx<numbers.length; iterIdx++){
                set.add(numbers[idx]+numbers[iterIdx]);
            }
        }
        
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}