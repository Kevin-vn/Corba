package fr_upem_scheduler;


/**
* fr_upem_scheduler/_SchedulerStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from scheduler.idl
* mardi 13 mars 2018 14 h 11 CET
*/

public class _SchedulerStub extends org.omg.CORBA.portable.ObjectImpl implements fr_upem_scheduler.Scheduler
{

  public boolean postRequest (fr_upem_scheduler.Request r)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("postRequest", true);
                fr_upem_scheduler.RequestHelper.write ($out, r);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return postRequest (r        );
            } finally {
                _releaseReply ($in);
            }
  } // postRequest

  public fr_upem_scheduler.Request getRequest (short index)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getRequest", true);
                $out.write_short (index);
                $in = _invoke ($out);
                fr_upem_scheduler.Request $result = fr_upem_scheduler.RequestHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getRequest (index        );
            } finally {
                _releaseReply ($in);
            }
  } // getRequest

  public boolean checkValues (fr_upem_scheduler.Request r) throws fr_upem_scheduler.unknown_values
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("checkValues", true);
                fr_upem_scheduler.RequestHelper.write ($out, r);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:fr_upem_scheduler/unknown_values:1.0"))
                    throw fr_upem_scheduler.unknown_valuesHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return checkValues (r        );
            } finally {
                _releaseReply ($in);
            }
  } // checkValues

  public void removeRequest (short index)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("removeRequest", true);
                $out.write_short (index);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                removeRequest (index        );
            } finally {
                _releaseReply ($in);
            }
  } // removeRequest

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:fr_upem_scheduler/Scheduler:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _SchedulerStub
