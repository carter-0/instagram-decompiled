package X;

import com.instagram.api.schemas.CommentRestrictStatus;

public final class B6M extends 0Yg implements 0sP {
    public static final B6M A00 = new B6M();

    public B6M() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = CommentRestrictStatus.A01.get(obj);
        if (obj2 == null) {
            return CommentRestrictStatus.UNRECOGNIZED;
        }
        return obj2;
    }
}
