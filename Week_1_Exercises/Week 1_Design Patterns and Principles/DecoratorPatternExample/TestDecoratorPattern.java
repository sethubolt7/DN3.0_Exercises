public class TestDecoratorPattern {
    public static void main(String[] args) {

        Notifier emailNotifier = new EmailNotifier();
        

        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        

        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);


        slackNotifier.send("Hello, this is a test notification!");


        Notifier emailAndSlackNotifier = new SlackNotifierDecorator(new EmailNotifier());
        emailAndSlackNotifier.send("Hello, this is another test notification!");
    }
}