package ten_minute_walk;

public class App {
    public boolean ten_minute_walk(char[] walk) {

    // ten_minute_walk?(['w', 's', 'e', 'e', 'n', 'n', 'e', 's', 'w', 'w']) # => true

        // north counter: n n 
        // south counter: s s

        // west counter:  w w w
        // east counter: e e e

        int y = 0; // this will keep track of north and south
        int x = 0; // this will keep track of west and east

        for (char letter : walk) {
            switch(letter) {
                case 'n':
                    y++;
                    break;
                case 's':
                    y--;
                    break;
                case 'w':
                    x++;
                    break;
                case 'e':
                    x--;
                    break;
            }
        }

        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        App app = new App();

        char[] first_test = {'w', 's', 'e', 'n', 'n', 'e', 's', 'w', 'w', 'w'};
        System.out.println(app.ten_minute_walk(first_test));
    }
}

// each block take 1 min to traverse 
// return true if walk takes 10 mins
//  the walker should be back where they began
// there should at 10 chars in the arr



// TEST CASES:


// ten_minute_walk?(['w', 's', 'e', 'n', 'n', 'e', 's', 'w', 'w', 'w']) # => false
// ten_minute_walk?(['w', 's', 'e', 's', 's', 'e', 's', 'w', 'n', 'n']) # => false