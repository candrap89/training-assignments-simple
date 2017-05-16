package eu.sig.training.ch05.buildandsendmail;

public class BuildAndSendMail {
    // tag::buildAndSendMail[]
    public void buildAndSendMail(MailMan m, MailObject parameterObject, MailFont font) {
        // Format the email address
        String mId = parameterObject.getFirstName().charAt(0) + "." + parameterObject.getLastName().substring(0, 7) + "@"
            + parameterObject.getDivision().substring(0, 5) + ".compa.ny";
        // Format the message given the content type and raw message
        MailMessage mMessage = parameterObject.getmMessage(); // Send message
        m.send(mId, parameterObject.getSubject(), mMessage);
    }
    // end::buildAndSendMail[]

//    @SuppressWarnings("unused")
//    private MailMessage formatMessage(MailFont font, String string) {
//        return null;
//    }

    private class MailMan {

        @SuppressWarnings("unused")
        public void send(String mId, String subject, MailMessage mMessage) {}

    }

//    private class MailFont {
//
//    }

//    private class MailMessage {
//
//    }

}