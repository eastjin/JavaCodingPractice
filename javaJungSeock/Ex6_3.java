package javaJungSeock;

class Ex6_3{
    public static void main(String[] args) {
        //javaJungSeock.Card car= new javaJungSeock.Card();
        System.out.println("width : "+Card.width);
    }
}


class Card{
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}

class Card2{
    int cardwidth= Card.width;
}