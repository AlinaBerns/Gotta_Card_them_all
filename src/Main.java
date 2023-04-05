import java.util.*;

public class Main {
    public static void main(String[] args) {

        //your cards
        PostCard belgium = new PostCard("Belgium", "Europe");
        PostCard france = new PostCard("France", "Europe");
        PostCard japan = new PostCard("Japan", "Asia");
        PostCard rdc = new PostCard("Democratic Republic of Congo", "Africa");
        PostCard southKorea = new PostCard("South Korea", "Asia");
        PostCard belgium2 = new PostCard("Belgium", "Europe");
        PostCard southAfrica = new PostCard("South Africa", "Africa");
        PostCard france2 = new PostCard("France", "Europe");
        PostCard belgium3 = new PostCard("Belgium", "Europe");
        PostCard usa = new PostCard("United States of America", "North America");
        PostCard canada = new PostCard("Canada", "North America");
        PostCard peru = new PostCard("Peru", "South America");
        PostCard samoa = new PostCard("Samoa", "Oceania");
        PostCard belgium4 = new PostCard("Belgium", "Europe");
        PostCard france3 = new PostCard("France", "Europe");


        List<PostCard> yourPostCardList = new ArrayList<>();
        yourPostCardList.add(belgium);
        yourPostCardList.add(france);
        yourPostCardList.add(japan);
        yourPostCardList.add(rdc);
        yourPostCardList.add(southKorea);
        yourPostCardList.add(belgium2);
        yourPostCardList.add(southAfrica);
        yourPostCardList.add(france2);
        yourPostCardList.add(belgium3);
        yourPostCardList.add(usa);
        yourPostCardList.add(canada);
        yourPostCardList.add(peru);
        yourPostCardList.add(samoa);
        yourPostCardList.add(belgium4);
        yourPostCardList.add(france3);


//your friend’s cards
        PostCard northKorea = new PostCard("North Korea", "Asia");
        PostCard usa2 = new PostCard("United States of America", "North America");
        PostCard botswana = new PostCard("Botswana", "Africa");
        PostCard northKorea2 = new PostCard("North Korea", "Asia");


        List<PostCard> yourFriendsPostCardList = new ArrayList<>();
        yourFriendsPostCardList.add(northKorea);
        yourFriendsPostCardList.add(usa2);
        yourFriendsPostCardList.add(botswana);
        yourFriendsPostCardList.add(northKorea2);


//your friends
        Friend bobby = new Friend("Bobby",false, 3, 5);
        Friend melissa = new Friend("Melissa",false, 1, 6);
        Friend darla = new Friend("Darla",true, 14, 2);
        Friend bert = new Friend("Bert",false, 10, 4);
        Friend grandma = new Friend("Nana",true, 12, 7);
        Friend fester = new Friend("Fester",false, 1, 2);
        Friend anna = new Friend("Anna",false, 8, 4);

        System.out.println("***Opdracht 1***");

        PostCard yourCard = yourPostCardList.get(3);
        PostCard friendCard = yourFriendsPostCardList.get(0);

        int yourIndex = yourPostCardList.indexOf(yourCard);
        int friendIndex = yourFriendsPostCardList.indexOf(friendCard);

        yourPostCardList.set(yourIndex, friendCard);
        yourFriendsPostCardList.set(friendIndex, yourCard);

        System.out.println("\nMy\n");

        yourPostCardList.forEach(System.out::println);

        System.out.println("\nFriend\n");
        yourFriendsPostCardList.forEach(System.out::println);

        System.out.println("\n***Opdracht 2***");

        System.out.println("\n My \n");
        yourPostCardList
                .sort(Comparator.comparing(PostCard::getCountry));

        yourPostCardList.forEach(System.out::println);

        System.out.println("\n Friend \n");
        yourFriendsPostCardList
                .sort(Comparator.comparing(PostCard::getCountry));

        yourFriendsPostCardList.forEach(System.out::println);

        System.out.println("\n***Opdracht 3***");

        System.out.println("Count all with frequency\n");
        Set<PostCard> set = new HashSet<>(yourPostCardList);
        List<PostCard> duplicates = new ArrayList<>();
        Set<PostCard> set1 = new HashSet<>();


        for (PostCard postCard : set) {
            int dubbeleKaarten = Collections.frequency(yourPostCardList, postCard);
            System.out.println(postCard + ": " + dubbeleKaarten);
        }
        for (PostCard card : yourPostCardList) {
            if (!set1.add(card)) {
                duplicates.add(card);
            }
        }
        System.out.println("\nDelete: " + duplicates);
        yourPostCardList.removeAll(duplicates);

        System.out.println("\n***Opdracht 4***");

        PriorityQueue<Friend> sortedFriends = new PriorityQueue<>();

        sortedFriends.offer(bobby);
        sortedFriends.offer(melissa);
        sortedFriends.offer(darla);
        sortedFriends.offer(bert);
        sortedFriends.offer(grandma);
        sortedFriends.offer(fester);
        sortedFriends.offer(anna);

        sortedFriends
                .stream()
                //familieleden
                .sorted(Comparator.comparing(Friend::isFamily).reversed())
                //beste vriend
                .sorted(Comparator.comparing(Friend::getFriendShipLevel).reversed())
                // de mensen die je het langste kent
                .sorted(Comparator.comparing(Friend::getYearsKnown).reversed())
                .forEach(System.out::println);








    }
}