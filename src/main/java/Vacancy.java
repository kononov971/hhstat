public class Vacancy {
    private long id;
    private String name;
    private boolean premium;
    private String department;
    private Area area;
    private Salary salary;
    private String published_at;
    private String created_at;
    private boolean archived;
    private String url;
    private String url_api;
    private Employer employer;
    private Snippet snippet;
    private String schedule;
    private boolean accept_temporary;
    private String[] working_days;
    private String[] working_time_intervals;
    private String[] working_time_modes;

    private class Area {
        private long id;
        private String name;
        private String url;
    }

    private class Salary {
        private Integer from;
        private Integer to;
        private String currency;
        private boolean gross;
    }

    private class Address {
        private long id;
        private String city;
        private String street;
        private String building;
        private String description;
        private String raw;
        private String metro;
        private String[] metro_stations;
    }

    private class Employer {
        private long id;
        private String name;
        private String url;
        private String url_api;
        private boolean trusted;
    }

    private class Snippet {
        private String requirement;
        private String responsibility;
    }

}
