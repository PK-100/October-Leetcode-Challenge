class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length==0)
            return 0;
        int n=points.length;
      Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int count=1;
        int end=points[0][1];
        for(int i=1;i<n;i++)
        {
            if(points[i][0]>end)
            {
                count++;
                end=points[i][1];
            }
            else
            {
                end=Math.min(end,points[i][1]);
            }
        }
        return count;
    }
}