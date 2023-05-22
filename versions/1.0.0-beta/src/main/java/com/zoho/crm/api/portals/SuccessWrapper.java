package com.zoho.crm.api.portals;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class SuccessWrapper implements Model
{
	private List<Success> portals;

	private HashMap<String, Integer> keyModified = new HashMap<String, Integer>();


	/**
	 * The method to get the value of portals
	 * @return An instance of List<Success>
	 */
	public List<Success> getPortals()
	{
		return  this.portals;

	}

	/**
	 * The method to set the value to portals
	 * @param portals An instance of List<Success>
	 */
	public void setPortals(List<Success> portals)
	{
		 this.portals = portals;

		 this.keyModified.put("portals", 1);

	}

	/**
	 * The method to check if the user has modified the given key
	 * @param key A String representing the key
	 * @return An Integer representing the modification
	 */
	public Integer isKeyModified(String key)
	{
		if((( this.keyModified.containsKey(key))))
		{
			return  this.keyModified.get(key);

		}
		return null;

	}

	/**
	 * The method to mark the given key as modified
	 * @param key A String representing the key
	 * @param modification An Integer representing the modification
	 */
	public void setKeyModified(String key, Integer modification)
	{
		 this.keyModified.put(key, modification);

	}
}