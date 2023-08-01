public class CompanyBranches {
    public static class Branch {
        private String branchName;
        private String city;
        private String state;
        private String pinCode;
        private String address;
        private String branchHead;
        public Branch(String branchName, String city, String state, String pinCode, String address, String branchHead) {
            this.branchName = branchName;
            this.city = city;
            this.state = state;
            this.pinCode = pinCode;
            this.address = address;
            this.branchHead = branchHead;
        }
        public void displayInfo() {
            System.out.println("Branch Name: " + branchName);
            System.out.println("City: " + city);
            System.out.println("State: " + state);
            System.out.println("Pin Code: " + pinCode);
            System.out.println("Address: " + address);
            System.out.println("Branch Head: " + branchHead);
        }
    }
    public static class ClothingBranch extends Branch {
        private String specialty;
        public ClothingBranch(String branchName, String city, String state, String pinCode, String address, String branchHead, String specialty) {
            super(branchName, city, state, pinCode, address, branchHead);
            this.specialty = specialty;
        }
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Specialty: " + specialty);
        }
    }
    public static class FoodBranch extends Branch {
        private String specialty;
        public FoodBranch(String branchName, String city, String state, String pinCode, String address, String branchHead, String specialty) {
            super(branchName, city, state, pinCode, address, branchHead);
            this.specialty = specialty;
        }
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Specialty: " + specialty);
        }
    }
    public static class PaintsBranch extends Branch {
        private String specialty;

        public PaintsBranch(String branchName, String city, String state, String pinCode, String address, String branchHead, String specialty) {
            super(branchName, city, state, pinCode, address, branchHead);
            this.specialty = specialty;
        }
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Specialty: " + specialty);
        }
    }
    public static class SteelBranch extends Branch {
        private String specialty;

        public SteelBranch(String branchName, String city, String state, String pinCode, String address, String branchHead, String specialty) {
            super(branchName, city, state, pinCode, address, branchHead);
            this.specialty = specialty;
        }
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Specialty: " + specialty);
        }
    }
    public static void main(String[] args) {
        ClothingBranch clothingBranch = new ClothingBranch("Saravana Stores", "Madurai", "TN", "608954", "Mattu Thavani", "Ajith", "More than 200 Branches in Tamilnadu");
        clothingBranch.displayInfo();
        System.out.println();

        FoodBranch foodBranch = new FoodBranch("Aanandha Bavan", "Coimbatore", "TN", "658001", "Raja Street", "Rajini", "This restaurant contains more than 10,000 customers");
        foodBranch.displayInfo();
        System.out.println();

        PaintsBranch paintsBranch = new PaintsBranch("Nippon", "Chennai", "Tamil Nadu", "608498", "Anna Nagar", "Vijay", "No.1 Painting in India");
        paintsBranch.displayInfo();
        System.out.println();

        SteelBranch steelBranch = new SteelBranch("Lalitha Steels", "Puducherry", "Puducherry", "605008", "Ecr Road", "Kamalahasan", "Largest Steel Store in Puducherry");
        steelBranch.displayInfo();
    }
}
