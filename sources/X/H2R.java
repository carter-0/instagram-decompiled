package X;

import com.instagram.user.model.User;

public final class H2R extends C247303g7 {
    public static final JNE A00(1Xj r3) {
        JNE jne;
        User A11 = C51966G9m.A11(r3);
        if (A11 != null) {
            jne = new C53591Gr6(A11.Bh3(), A11.getUsername(), A11.isVerified());
        } else {
            jne = C57668IeX.A00;
        }
        return jne;
    }
}
