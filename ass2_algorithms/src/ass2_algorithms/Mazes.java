package ass2_algorithms;

import java.util.Random;

public class Mazes {
	private int hight;
	private int width;
	private int maze[][];
	int wall[];
	public Mazes(int hight,int width)
	{
		this.hight=hight;
		this.width=width;
		initialize();
		initializeWall();
		
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int[][] getMaze() {
		return maze;
	}
	public void setMaze(int maze[][]) {
		this.maze = maze;
	}
	public void initialize()
	{
		for(int i=0;i<hight;i++)
			for(int j=0;j<width;j++)
				maze[i][j]=i*width+j;
	}
	public int find(int parent[], int i)
	{
	    if (parent[i] == -1)
	        return i;
	    return find(parent, parent[i]);
	}
	void Union(int parent[], int x, int y)
	{
	    int xset = find(parent, x);
	    int yset = find(parent, y);
	    parent[xset] = yset;
	}
	public void mazeAlg()
	{
		int start=0;
		int end=width*hight-1;
		while(find(wall,start)!=find(wall,end))
		{
			
		}
	}

	public void initializeWall()
	{
		for(int i=0;i<hight*width;i++)
			wall[i]=-1;
	}
	public int randInt(int min, int max) {

	    Random rand = null;
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
	
	

}
