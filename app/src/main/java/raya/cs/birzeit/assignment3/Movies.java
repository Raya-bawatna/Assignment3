package raya.cs.birzeit.assignment3;

public class Movies {
    private  int id;
private String name;
private  String type;
private String description;
private int year;
private int imageID;


    public static final Movies[] movies = {
            new Movies(1,"Home Alone","Comedy","An eight-year-old troublemaker must protect his house from a pair of burglars when he is accidentally left home alone by his family during Christmas vacation.",
                          1990,R.drawable.homealone),
            new Movies(2,"Arrival","Sci-Fi","A linguist works with the military to communicate with alien lifeforms after twelve mysterious spacecrafts appear around the world.",
                               2016,R.drawable.arrival),
            new Movies(3,"Hereditary","Horror","A grieving family is haunted by tragic and disturbing occurrences.",
                    2018,R.drawable.hereditary),
            new Movies(4,"The Invisible Guest","Mystery","A successful entrepreneur accused of murder and a witness preparation expert have less than three hours to come up with an impregnable defense.",
                    2016,R.drawable.theinvisibleguest),
            new Movies(5,"Toy Story","Comedy","Led by Woody, Andy's toys live happily in his room until Andy's birthday brings Buzz Lightyear onto the scene. Afraid of losing his place in Andy's heart, Woody plots against Buzz. But when circumstances separate Buzz and Woody from their owner, the duo eventually learns to put aside their differences.",
                    1995,R.drawable.toystory),

            new Movies(6,"Finding Nemo","Adventure","After his son is captured in the Great Barrier Reef and taken to Sydney, a timid clownfish sets out on a journey to bring him home.",
                    2003,R.drawable.nemo),

            new Movies(7,"Frozen","Adventure","When the newly crowned Queen Elsa accidentally uses her power to turn things into ice to curse her home in infinite winter, her sister Anna teams up with a mountain man, his playful reindeer, and a snowman to change the weather condition.",
                    2013,R.drawable.frozen),

            new Movies(8,"Matilda","Fantasy","Story of a wonderful little girl, who happens to be a genius, and her wonderful teacher vs. the worst parents ever and the worst school principal imaginable.",
                    1996,R.drawable.matilda),

            new Movies(9,"The Meg","Action","A group of scientists exploring the Marianas Trench encounter the largest marine predator that has ever existed - the Megalodon.",
                    2018,R.drawable.themeg),

            new Movies(10,"Booksmart","Comedy","On the eve of their high school graduation, two academic superstars and best friends realize they should have worked less and played more. Determined not to fall short of their peers, the girls try to cram four years of fun into one night.",
                    2019,R.drawable.booksmart),


    };
    public Movies(int id, String name, String type, String description, int year, int imageID) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.year = year;
        this.imageID = imageID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}

