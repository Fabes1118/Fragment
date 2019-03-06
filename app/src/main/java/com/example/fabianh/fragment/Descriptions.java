package com.example.fabianh.fragment;


public class Descriptions {

        private String name;
        private String desc;
        private int imgRes;


        private Descriptions (String n, String d, int i )

        {
            this.name = n;
            this.desc = d;
            this.imgRes = i;

        }

        public static final Descriptions[] descriptionArray = {

                new Descriptions("Team Playa","Power play\n" +
                        "Creating gamified experiences that change behaviour.\n" +
                        "\n"+
                        "Your data\n" +
                        "A view of your data like never before and as immediate as you need.\n"+
                        "\n"+
                        "Improve everything\n" +
                        "Once we know your business goals a viable solution.\n"+
                        "\n"+
                        "Happy teams\n" +
                        "Happy people are productive people.",
                        R.drawable.playas),

                new Descriptions("Team List","Solutions Director:             Andrew Solomon \n"+
                                                     "                                          \n"+
                                                    "Solutions Architect:            Fabian Haridien\n" +
                                                     "                                           \n"+
                                                    "Senior Developer:               Muzzammil Brown\n",
                        R.drawable.playateam),

                new Descriptions("Variety of rewards","Virtual Rewards: Points, Badges, Leaderboards\n" +
                                                             "\n"+
                                                             "Card: MasterCard \n" +
                                                             "\n"+
                                                             "Merchandise: 10000 items\n" +
                                                             "\n"+
                                                             "Incentive Travel: Travel Mall",
                        R.drawable.rewards),
                new Descriptions("Book a demo", "         click the image to book a demo", R.drawable.demo),
                new Descriptions("Contact Us", "                 Email: info@getplaya.co.za\n" +
                        "\n"+
                                                      "                 Tel: +2721-700 5201\n" +
                        "\n"+
                                                      "                 Address: 14 Stibitz Street\n" +
                        "\n"+
                                                      "                                   Westlake", R.drawable.contactus)

        };

        public String getName()
        {
            return  name;
        }

        public String getDesc() {
            return desc;
        }

        public int getImgRes() {
        return imgRes; }

        public String toString()
        {
            return name;
        }
}


