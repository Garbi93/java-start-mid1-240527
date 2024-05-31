package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        // 인자로 넘어온 id 를 변수에 담기 Object 에는 id가 없어서 다운 캐스팅
//        UserV2 user = (UserV2) obj;
//        // 내 id와 넘어온 id 같은지 비교 하기
//        return id.equals(user.id);
//    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UserV2 userV2 = (UserV2) object;
        return Objects.equals(id, userV2.id);
    }

}
