public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.phone = "+79111234567";
        post.passport = "4444 № 123456";
        post.subscription = true;
        // заполните другие поля
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 12;
        post.birthday.years = 1999;
        // заполните другие поля даты рождения
    }

}