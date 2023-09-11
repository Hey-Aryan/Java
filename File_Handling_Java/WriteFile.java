import java.io.*;

//character in java is of 2 bytes
//as it is used for printing in any language
class WriteFile
{
    public static void main(String arg[]) throws Exception
    {
        FileOutputStream fobj = new FileOutputStream("Marvellous.txt");
        //FileOutputStream used only for writing just create obj of it and write.obj
        String Data = "Marvellous Infosystem Pune";

        byte bdata[] = Data.getBytes();

        fobj.write(bdata);
        fobj.close();
    }
}
