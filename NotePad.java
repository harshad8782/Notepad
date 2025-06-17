import java.awt.*;
import java.awt.Font.*;
import java.awt.event.*;
import java.io.*;
class My_Notepad extends Frame implements ActionListener
{
    private TextArea txta_show;
    private Menu file,edit,size,color,style;
    private MenuItem New,Open,Save,Exit,size1,size2,size3,size4,size5,size6,size7,size8,size9,size10,size11,size12,size13,size14,size15,color1,color2,color3,color4,style1,style2,style3,style4;
    private MenuBar mb=new MenuBar();
    private MenuShortcut mn,mo,ms,mx;
    int s;
    public My_Notepad()
    {
        file=new Menu("File");
        edit=new Menu("Edit");
        mn=new MenuShortcut(KeyEvent.VK_N);
        New=new MenuItem("New",mn);
        mo=new MenuShortcut(KeyEvent.VK_O);
        Open=new MenuItem("Open",mo);
        ms=new MenuShortcut(KeyEvent.VK_S);
        Save=new MenuItem("Save",ms);
        mx=new MenuShortcut(KeyEvent.VK_X);
        Exit=new MenuItem("Exit",mx);
        color=new Menu("Font Color");
        color1=new MenuItem("Red");
        color2=new MenuItem("Blue");
        color3=new MenuItem("Green");
        color4=new MenuItem("Yellow");
        size=new Menu("Font Size");
        size1=new MenuItem("8");
        size2=new MenuItem("10");
        size3=new MenuItem("12");
        size4=new MenuItem("14");
        size5=new MenuItem("16");
        size6=new MenuItem("18");
        size7=new MenuItem("20");
        size8=new MenuItem("22");
        size9=new MenuItem("24");
        size10=new MenuItem("26");
        size11=new MenuItem("28");
        size12=new MenuItem("30");
        size13=new MenuItem("32");
        size14=new MenuItem("34");
        size15=new MenuItem("36");
        style=new Menu("Font Style");
        style1=new MenuItem("Normal");
        style2=new MenuItem("Bold");
        style3=new MenuItem("Italic");
        style4=new MenuItem("Bold+Italic");


        file.add(New);
        file.add(Open);
        file.add(Save);
        file.add(Exit);

        color.add(color1);
        color.add(color2);
        color.add(color3);
        color.add(color4);
        edit.add(color);
        
        size.add(size1);
        size.add(size2);
        size.add(size3);
        size.add(size4);
        size.add(size5);
        size.add(size6);
        size.add(size7);
        size.add(size8);
        size.add(size9);
        size.add(size10);
        size.add(size11);
        size.add(size12);
        size.add(size13);
        size.add(size14);
        size.add(size15);
        edit.add(size);

        style.add(style1);
        style.add(style2);
        style.add(style3);
        style.add(style4);
        edit.add(style);

        mb.add(file);
        mb.add(edit);


        New.addActionListener(this);
        Open.addActionListener(this);
        Save.addActionListener(this);
        Exit.addActionListener(this);
        size1.addActionListener(this);
        size2.addActionListener(this);
        size3.addActionListener(this);
        size4.addActionListener(this);
        size5.addActionListener(this);
        size6.addActionListener(this);
        size7.addActionListener(this);
        size8.addActionListener(this);
        size9.addActionListener(this);
        size10.addActionListener(this);
        size11.addActionListener(this);
        size12.addActionListener(this);
        size13.addActionListener(this);
        size14.addActionListener(this);
        size15.addActionListener(this);
        color1.addActionListener(this);
        color2.addActionListener(this);
        color3.addActionListener(this);
        color4.addActionListener(this);
        style1.addActionListener(this);
        style2.addActionListener(this);
        style3.addActionListener(this);
        style4.addActionListener(this);

        setTitle("Text Editor");
        setSize(500,500);
        setLocation(100,100);
        setMenuBar(mb);
       
        txta_show=new TextArea();
        add(txta_show);
       
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==New)
        {
            txta_show.setText(" ");
        }
        else if(ae.getSource()==Open)
        {
            try
            {
                FileDialog fd=new FileDialog(this,"Open File",FileDialog.LOAD);
                fd.setVisible(true);
                String dir=fd.getDirectory();
                String fname=fd.getFile();
                FileInputStream fis=new FileInputStream(dir+fname);
                DataInputStream dis=new DataInputStream(fis);
                String str=" ",msg=" ";
                while((str=dis.readLine())!=null)
                {
                    msg=msg+str;
                    msg+="\n";
                }
                txta_show.setText(msg);
                dis.close();
            }
            catch(Exception e){}
        }
        else if(ae.getSource()==Save)
        {
            try
            {
                FileDialog fd=new FileDialog(this,"Save File",FileDialog.SAVE);
                fd.setVisible(true);
                String txt=txta_show.getText();
                String dir=fd.getDirectory();
                String fname=fd.getFile();
                FileOutputStream fos=new FileOutputStream(dir+fname);
                DataOutputStream dos=new DataOutputStream(fos);
                dos.writeBytes(txt);
                dos.close();
            }
            catch(Exception e)
            {
            }
        }
        else if(ae.getSource()==Exit)
        {
            System.exit(0);
        }
        else if (ae.getSource()==color1) 
        {
            txta_show.getText();
            txta_show.setForeground(Color.red);
        }
        else if (ae.getSource()==color2) 
        {
            txta_show.getText();
            txta_show.setForeground(Color.blue);
        }
        else if (ae.getSource()==color3) 
        {
            txta_show.getText();
            txta_show.setForeground(Color.green);
        }
        else if (ae.getSource()==color4) 
        {
            txta_show.getText();
            txta_show.setForeground(Color.yellow);
        }
        else if (ae.getSource()== size1) 
        {
            s = 8;
            txta_show.getText();
            txta_show.setFont(new Font("Normal", Font.PLAIN,s));
        }
        else if (ae.getSource()== size2) 
        {
            s = 10;
            txta_show.getText();
            txta_show.setFont(new Font("Normal", Font.PLAIN,s));
        }
        else if (ae.getSource()== size3) 
        {
            s = 12;
            txta_show.getText();
            txta_show.setFont(new Font("Normal", Font.PLAIN,s));
        }
        else if (ae.getSource()== size4) 
        {
            s = 14;
            txta_show.getText();
            txta_show.setFont(new Font("Normal", Font.PLAIN,s));
        }
        else if (ae.getSource()== size5) 
        {
            s = 16;
            txta_show.getText();
            txta_show.setFont(new Font("Normal", Font.PLAIN,s));
        }else if (ae.getSource()== size6) 
        {
            s = 18;
            txta_show.getText();
            txta_show.setFont(new Font("Normal", Font.PLAIN,s));
        }else if (ae.getSource()== size7) 
        {
            s = 20;
            txta_show.getText();
            txta_show.setFont(new Font("Normal", Font.PLAIN,s));
        }
        else if (ae.getSource()== size8) 
        {
            s = 22;
            txta_show.getText();
            txta_show.setFont(new Font("Normal", Font.PLAIN,s));
        }
        else if (ae.getSource()== size9) 
        {
            s = 24;
            txta_show.getText();
            txta_show.setFont(new Font("Normal", Font.PLAIN,s));
        }
        else if (ae.getSource()== size10) 
        {
            s = 26;
            txta_show.getText();
            txta_show.setFont(new Font("Normal", Font.PLAIN,s));
        }
        else if (ae.getSource()== size11) 
        {
            s = 28;
            txta_show.getText();
            txta_show.setFont(new Font("Normal", Font.PLAIN,s));
        }
        else if (ae.getSource()== size12) 
        {
            s = 30;
            txta_show.getText();
            txta_show.setFont(new Font("Normal", Font.PLAIN,s));   
        }
        else if (ae.getSource()== size13) 
        {
            s = 32;
            txta_show.getText();
            txta_show.setFont(new Font("Normal", Font.PLAIN,s));   
        }
        else if (ae.getSource()== size14) 
        {
            s = 34;
            txta_show.getText();
            txta_show.setFont(new Font("Normal", Font.PLAIN,s));   
        }
        else if (ae.getSource()== size15) 
        {
            s = 36;
            txta_show.getText();
            txta_show.setFont(new Font("Normal", Font.PLAIN,s));
        }
        else if (ae.getSource()== style1) 
        {
            txta_show.getText();
            txta_show.setFont(new Font("Normal", Font.PLAIN,s));
        }
        else if (ae.getSource()== style2) 
        {
            txta_show.getText();
            txta_show.setFont(new Font("Normal", Font.BOLD,s));
        }
        else if (ae.getSource()== style3) 
        {
            txta_show.getText();
            txta_show.setFont(new Font("Normal", Font.ITALIC,s));
        }
        else if (ae.getSource()== style4) 
        {
            txta_show.getText();
            txta_show.setFont(new Font("Normal", Font.BOLD+Font.ITALIC,s));
        }
    }
}
class NotePad
{
    public static void main(String []args)
    {
        new My_Notepad().setVisible(true);
    }
}

