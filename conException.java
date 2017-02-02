public class conException extends Exception 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String emessage;
	
	public conException(String g)
	{
		emessage=g;
	}
	public String toString()
	{
		return emessage;
	}

}
	