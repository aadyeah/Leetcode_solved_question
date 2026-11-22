class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int n = image.length;
        int m = image[0].length;

        for(int i =0;i<n;i++)
        {
            for(int j=0;j<m/2;j++)
            {
                int temp = image[i][j];
                image[i][j] = image[i][m-1-j];
                image[i][m-1-j] = temp;
            }
        }

        for(int i =0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(image[i][j] == 0)
                {
                    image[i][j] =1;
                }
                else
                {
                image[i][j] =0;

                }

            }
        }
        return image;
        
        
    }
}