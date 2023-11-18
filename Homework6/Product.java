package Homework6;

public class Product {
        // Поля класу
        private String name;
        private String articleCode;
        private double price;
        private String description;
        private boolean availability;

        // Конструктор класу
        public Product(String name, String articleCode, double price, String description, boolean availability) {
            this.name = name;
            this.articleCode = articleCode;
            this.price = price;
            this.description = description;
            this.availability = availability;
        }

        // Геттери
        public String getName() {
            return name;
        }

        public String getArticleCode() {
            return articleCode;
        }

        public double getPrice() {
            return price;
        }

        public String getDescription() {
            return description;
        }

        public boolean isAvailable() {
            return availability;
        }

        // Сеттери
        public void setName(String name) {
            this.name = name;
        }

        public void setArticleCode(String articleCode) {
            this.articleCode = articleCode;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setAvailability(boolean availability) {
            this.availability = availability;
        }
}
