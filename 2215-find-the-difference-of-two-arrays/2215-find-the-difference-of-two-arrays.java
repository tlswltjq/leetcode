class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> nm1set = new HashSet<>();
        Set<Integer> nm2set = new HashSet<>();
        List<List<Integer>> answer = new ArrayList<>();

        for (int i : nums1) {
            nm1set.add(i);
        }
        for (int i : nums2) {
            nm2set.add(i);
        }

        answer.add(new ArrayList<>(nm1set));
        answer.add(new ArrayList<>(nm2set));

        Set<Integer> intersection = new HashSet<>(nm1set);
        intersection.retainAll(nm2set);

        for(Integer i : intersection){
            answer.get(0).remove(i);
            answer.get(1).remove(i);
        }
        return answer;
    }
}
