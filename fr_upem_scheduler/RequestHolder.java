package fr_upem_scheduler;

/**
* fr_upem_scheduler/RequestHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from scheduler.idl
* mardi 13 mars 2018 14 h 11 CET
*/

public final class RequestHolder implements org.omg.CORBA.portable.Streamable
{
  public fr_upem_scheduler.Request value = null;

  public RequestHolder ()
  {
  }

  public RequestHolder (fr_upem_scheduler.Request initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = fr_upem_scheduler.RequestHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    fr_upem_scheduler.RequestHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return fr_upem_scheduler.RequestHelper.type ();
  }

}
