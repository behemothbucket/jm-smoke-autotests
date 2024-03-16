package constants;

import java.io.File;

public class Constant {
    public static class TimeoutVariables {
        public static final int IMPLICIT_WAIT = 5;
        public static final int EXPLICIT_WAIT = 10;
    }

    public static class URLS {
        public static final String AUTHORIZATION_PAGE = "*-*-*-*-*-";
        public static final String LK_PAGE = "*-*-*-*-*-";
        public static final String LANDING_PAGE = "*-*-*-*-*-";
        public static final String SERVICES_PAGE = "*-*-*-*-*-";
        public static final String JIRA_PAGE = "*-*-*-*-*-";
    }

    public static class UserData {
        public static final String LOGIN_PHONE_NUMBER = "*-*-*-*-*-";
        public static final String REGISTRATION_PHONE_NUMBER = "*-*-*-*-*-";
        public static final String RECOVERY_PHONE_NUMBER = "*-*-*-*-*-";
        public static final String PASSWORD = "*-*-*-*-*-";
        public static final String SMS = "*-*-*-*-*-";
        public static final String RECOVERY_SMS = "*-*-*-*-*-";
        public static final String PASSPORT_PHOTO_PATH = "*-*-*-*-*-";
        public static final File ACCOUNTS_LOG_FILE = new File("*-*-*-*-*-");
        public static final File ACCOUNTS_LOG_DIR = new File("*-*-*-*-*-");

    }


}
