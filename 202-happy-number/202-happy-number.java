class Solution {
         public boolean isHappy(int n)
        {
            int slow=n;
            int fast=n;

            do {
                slow=findsquaree(slow);
                fast=findsquaree(findsquaree(fast));
            }while (slow!=fast);

            if (slow==1)
            {
                return true;
            }
            return false;
        }

        private int findsquaree(int number)
        {
            int ans=0;
            while(number>0)
            {
                int rem=number%10;
                ans+=rem*rem;
                number/=10;
            }
            return ans;
        }
}