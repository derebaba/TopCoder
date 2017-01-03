import java.util.Arrays;

public class ATaleOfThreeCities {

	public double connect(int[] ax, int[] ay, int[] bx, int[] by, int[] cx, int[] cy)
	{
		double ab = Double.MAX_VALUE, ac = Double.MAX_VALUE, bc = Double.MAX_VALUE;	//	min distances between cities
		//	find mininum distance between an a-city station and a b-city station
		for(int i = 0; i < ax.length; i++)
		{
			for(int j = 0; j < bx.length; j++)
			{
				double len = Math.pow((ax[i] - bx[j]), 2) + Math.pow(ay[i] - by[j], 2);
				if(len < ab)
					ab = len;
			}
		}
		for(int i = 0; i < ax.length; i++)
		{
			for(int j = 0; j < cx.length; j++)
			{
				double len = Math.pow((ax[i] - cx[j]), 2) + Math.pow(ay[i] - cy[j], 2);
				if(len < ac)
					ac = len;
			}
		}
		for(int i = 0; i < cx.length; i++)
		{
			for(int j = 0; j < bx.length; j++)
			{
				double len = Math.pow((cx[i] - bx[j]), 2) + Math.pow(cy[i] - by[j], 2);
				if(len < bc)
					bc = len;
			}
		}
		double[] arr = {ab, ac, bc};
		Arrays.sort(arr);
		return Math.sqrt(arr[0]) + Math.sqrt(arr[1]);
	}
}
