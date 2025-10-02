// Parent class
class Post {
    String author;
    String content;
    String time;

    Post(String author, String content, String time) {
        this.author = author;
        this.content = content;
        this.time = time;
    }

    void display() {
        System.out.println("Post by: " + author);
        System.out.println("Time: " + time);
        System.out.println("Content: " + content);
    }
}

// Child class for Instagram
class InstagramPost extends Post {
    int likes;
    String hashtags;

    InstagramPost(String author, String content, String time, int likes, String hashtags) {
        super(author, content, time);
        this.likes = likes;
        this.hashtags = hashtags;
    }

    @Override
    void display() {
        System.out.println("\n--- Instagram Post ---");
        super.display();
        System.out.println("Likes: " + likes);
        System.out.println("Hashtags: " + hashtags);
    }
}

// Child class for Twitter
class TwitterPost extends Post {
    int retweets;

    TwitterPost(String author, String content, String time, int retweets) {
        super(author, content, time);
        this.retweets = retweets;
    }

    @Override
    void display() {
        System.out.println("\n--- Twitter Post ---");
        super.display();
        System.out.println("Character Count: " + content.length());
        System.out.println("Retweets: " + retweets);
    }
}

// Child class for LinkedIn
class LinkedInPost extends Post {
    int connections;

    LinkedInPost(String author, String content, String time, int connections) {
        super(author, content, time);
        this.connections = connections;
    }

    @Override
    void display() {
        System.out.println("\n--- LinkedIn Post ---");
        super.display();
        System.out.println("Professional Formatting Enabled");
        System.out.println("Connections: " + connections);
    }
}

// Main program
public class SocialMediaFeed {
    public static void main(String[] args) {
        Post insta = new InstagramPost("Alice", "Enjoying the sunset!", "10:00 AM", 120, "#sunset #nature");
        Post twitter = new TwitterPost("Bob", "Just launched my new project!", "11:00 AM", 35);
        Post linkedin = new LinkedInPost("Carol", "Sharing industry insights on AI.", "12:00 PM", 500);

        insta.display();
        twitter.display();
        linkedin.display();
    }
}
