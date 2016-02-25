package aixuran.com.butterknifedemo;

/**
 * Created by haihong on 2016/2/16.
 */
public class aaa {

    /**
     * data : 很多钱
     * name : line
     * age : 1
     */

    private DataEntity data;

    public void setData(DataEntity data) {
        this.data = data;
    }

    public DataEntity getData() {
        return data;
    }

    public static class DataEntity {
        private String data;
        private String name;
        private String age;

        public void setData(String data) {
            this.data = data;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getData() {
            return data;
        }

        public String getName() {
            return name;
        }

        public String getAge() {
            return age;
        }
    }
}
