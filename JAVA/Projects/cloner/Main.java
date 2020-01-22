FileDialog fd = new FileDialog(yourJFrame, "Choose a file", FileDialog.LOAD);
fd.setDirectory("C:\\");
fd.setFile("*.xml");
fd.setVisible(true);
String filename = fd.getFile();
if (filename == null)
  System.out.println("You cancelled the choice");
else
  System.out.println("You chose " + filename);