public class Record {
    //Должность,Язык программирования,Специализация,Общий опыт работы,Опыт работы на текущем месте,Зарплата в месяц,
    // Изменение зарплаты за 12 месяцев,Город,Размер компании,Тип компании,Пол,Возраст,Образование,Университет,Еще студент
    // ,Уровень английского,Предметная область,Дата заполнения,User-Agent

    private String jobTitle;
    private String programmingLanguage;
    private String speciality;
    private String generalWorkingExperience;
    private String currentWorkingExperience;
    private int salary;
    private String salaryChangeLast12Months;
    private String city;
    private String companySize;
    private String companyType;
    private String sex;
    private String age;
    private String education;
    private String university;
    private String isStudent;
    private String englishLevel;
    private String domainArea;
    private String submissionDate;
    private String userAgent;

    public Record(String[] record) {
        this.jobTitle = record[0];
        this.programmingLanguage = record[1];
        this.speciality = record[2];
        this.generalWorkingExperience = record[3];
        this.currentWorkingExperience = record[4];
        this.salary = Integer.parseInt(record[5]);
        this.salaryChangeLast12Months = record[6];
        this.city = record[7];
        this.companySize = record[8];
        this.companyType = record[9];
        this.sex = record[10];
        this.age = record[11];
        this.education = record[12];
        this.university = record[13];
        this.isStudent = record[14];
        this.englishLevel = record[15];
        this.domainArea = record[16];
        this.submissionDate = record[17];
        this.userAgent = record[18];
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getGeneralWorkingExperience() {
        return generalWorkingExperience;
    }

    public String getCurrentWorkingExperience() {
        return currentWorkingExperience;
    }

    public int getSalary() {
        return salary;
    }

    public String getSalaryChangeLast12Months() {
        return salaryChangeLast12Months;
    }

    public String getCity() {
        return city;
    }

    public String getCompanySize() {
        return companySize;
    }

    public String getCompanyType() {
        return companyType;
    }

    public String getSex() {
        return sex;
    }

    public String getAge() {
        return age;
    }

    public String getEducation() {
        return education;
    }

    public String getUniversity() {
        return university;
    }

    public String getIsStudent() {
        return isStudent;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public String getDomainArea() {
        return domainArea;
    }

    public String getSubmissionDate() {
        return submissionDate;
    }

    public String getUserAgent() {
        return userAgent;
    }
}
