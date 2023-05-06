package Medcare;

public class QueueUnderflowExceptionSD extends RuntimeException
{
  public QueueUnderflowExceptionSD()
  {
    super();
  }

  public QueueUnderflowExceptionSD(String message)
  {
    super(message);
  }
}