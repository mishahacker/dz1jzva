class dz4 {
​
    public static void main(String[] args) {
        m1();
        m2();
    }
​
    private static void m1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "reg", "java", "apple",
                "cat", "Beta", "apple",
                "reg", "cat", "java",
                "plane", "dog", "coffee",
                "pithon", "Beta", "apple",
                "cat", "java", "plane", "dog"
        };
​
        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }
​
    private static void m2() {
        Directory directory = new Directory();

        directory.add("matveev", "7988377349");
        directory.add("smernov", "7943783873");
        directory.add("matveev", "7917155552");
        directory.add("ivanov", "7388794389");
        directory.add("antonyan", "7983988998");
        directory.add("popov", "795787737887");
        directory.add("matveev", "79923231999");
        directory.add("smernov", "7947838784");
        directory.add("ivanov", "76498778348");
​
        System.out.println(directory.get("matveev"));
        System.out.println(directory.get("ivanov"));
        System.out.println(directory.get("smernov"));
        System.out.println(directory.get("popov"));
    }
}
​
class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;
​
    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }
​
    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }
​
}