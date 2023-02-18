package testtestToday;

public class test {
	
	
//	messageInput에 입력한 값을 sendButton을 클릭시 contentView에 보내는 코드
	
//	String message = textField.getText();
//    textArea.append("나: " + message + "\n");
//    textField.setText("");
	
	
//	기존 수업에서 clearTextFields와 동일한 메소드
	
//	 private void clearTextFieldsAndArea(Component[] components) {
//	        for (Component component : components) {
//	            if (component instanceof JTextField) {
//	                ((JTextField) component).setText("");
//	            } else if (component instanceof JTextArea) {
//	                ((J

	
//	addButton 추가시 userList에 담기게 하는 코드
//	nameListModel = new DefaultListModel<String>();
//	nameListModel.addElement(name);
//    nameField.setText("");
	
	
	
//	1. userList에 ListSelectionListener를 추가합니다
	
//	userList.addListSelectionListener(new ListSelectionListener() {
//	    public void valueChanged(ListSelectionEvent e) {
//	        String selectedUserName = userList.getSelectedValue();
//	        // TODO: messagePanel의 상단에 selectedUserName을 표시
//	    }
//	});
//	
//	2. userList에서 선택된 값(selectedUserName)을 messagePanel의 JLabel에 표시합니다
	
//	JLabel selectedUserLabel = new JLabel(selectedUserName);
//	messagePanel.add(selectedUserLabel);
//
//	
//	위 두가지를 합친 코드
	
//	JList<String> userList = new JList<>(userNames);
//	userList.addListSelectionListener(new ListSelectionListener() {
//	    public void valueChanged(ListSelectionEvent e) {
//	        String selectedUserName = userList.getSelectedValue();
//	        JLabel selectedUserLabel = new JLabel(selectedUserName);
//	        messagePanel.removeAll();
//	        messagePanel.add(selectedUserLabel);
//	        // TODO: messagePanel에 대화 내용 등을 추가
//	        messagePanel.revalidate();
//	        messagePanel.repaint();
//	    }
//	});
	
	// DefaultListModel 생성
//	DefaultListModel<String> nameListModel = new DefaultListModel<>();
	
	
}
