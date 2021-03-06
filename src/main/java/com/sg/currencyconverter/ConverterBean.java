package com.sg.currencyconverter;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote({IConverterBean.class})
public class ConverterBean
  implements IConverterBean
{
  private double yenRate = 83.0602;
  private double euroRate = 0.0093016;
  private double inrRate = 0.015;
  
  public double dollarToYen(double dollers)
  {
    return dollers * yenRate;
  }
  
  public double yenToEuro(double yen)
  {
    return yen * euroRate;
  }
  
  public double dollerToINR(double dollers){
	  return dollers * inrRate;
  }
}
