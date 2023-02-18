package testtestToday;

public class Test1 {
	
//	loginbutton 부분
//	public void actionPerformed(ActionEvent e) {
        // 사용자 이름을 추가
//        String name = username.getText();
//        nameListModel.addElement(name);

        // 리스트 패널로 이동
//        CardLayout cardLayout = (CardLayout) (frame.getContentPane().getLayout());
//        cardLayout.show(frame.getContentPane(), "List Panel");
//    }
//});
//loginPanel.add(loginButton, BorderLayout.CENTER);
//frame.getContentPane().add(loginPanel, "Login Panel");

// 리스트 패널
//listPanel = new JPanel(new BorderLayout());
//nameListModel = new DefaultListModel<>();
//userList = new JList<>(nameListModel);
	
//	userList에 입력된 username을 클릭 시  userLabel에 표시되도록하는 부분
//userList.addListSelectionListener(e -> {
//    String selectedUsername = userList.getSelectedValue();
//    userLabel.setText(selectedUsername);
//    CardLayout cardLayout = (CardLayout) (frame.getContentPane().getLayout());
//    cardLayout.show(frame.getContentPane(), "Message Panel");
//});
//JScrollPane scrollPane = new JScrollPane(userList);
//listPanel.add(scrollPane, BorderLayout.CENTER);
//addUserButton = new JButton("Add User");
//addUserButton.addActionListener(new ActionListener() {
	
//}
//	username 추가하는 부분
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        String name = JOptionPane.showInputDialog(frame, "Enter user name");
//        nameListModel.addElement(name);
//    }
//});
//listPanel.add(addUserButton, BorderLayout.SOUTH);
//frame.getContentPane().add(listPanel, "List Panel");

// 메시지 패널
//messagePanel = new JPanel(new BorderLayout());
//userLabel = new JLabel();
//messagePanel.add(userLabel, BorderLayout.NORTH);
//contentView = new JTextArea();
//contentView.setEditable(false);
//JScrollPane contentViewScrollPane = new JScrollPane(contentView);
//messagePanel.add(contentViewScrollPane, BorderLayout.CENTER);
//JPanel inputPanel = new JPanel(new BorderLayout());
//messageInput = new JTextField();
//inputPanel.add(messageInput, BorderLayout.CENTER);
//sendButton = new JButton("Send");
	
//	sendButton클릭시 messageInput에 있는 입력값 contentView에 보내는 부분
//sendButton.addActionListener(new ActionListener() {
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        String message = messageInput.getText();
//        contentView.append(message + "\n");
//        messageInput.setText("");
//    }
//});
//inputPanel.add(sendButton, BorderLayout.EAST);
//messagePanel.add(inputPanel, BorderLayout.SOUTH);
//exitButton = new JButton("Exit");
	
//	exitButton클릭시 messagePanel에 있는 모든 입력값들 지워주는 부분
//exitButton.addActionListener(new ActionListener() {
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        contentView.setText("");
//        CardLayout cardLayout = (CardLayout) (frame.getContentPane().getLayout());
//        cardLayout.show(frame.getContentPane(), "List Panel");
//   
//
	
//	contentView에 입력값 계속 담기게 하는 부분
//sendButton.addActionListener(new ActionListener() {
//    public void actionPerformed(ActionEvent e) {
//        String message = messageInput.getText();
//        if (!message.equals("")) {
//            contentView.append(username.getText() + ": " + message + "\n");
//            messageInput.setText("");
//        }
//    }
//});
////
////
////}
