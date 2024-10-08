package X;

import com.instagram.user.model.User;

/* renamed from: X.Eno  reason: case insensitive filesystem */
public abstract class C49012Eno {
    public static final Integer A00(User user) {
        if (user.CPV()) {
            return AnonymousClass05K.A1F;
        }
        switch (user.B6o().ordinal()) {
            case 0:
            case 1:
                return AnonymousClass05K.A1I;
            case 2:
                return AnonymousClass05K.A0j;
            case 3:
                if (user.A2A()) {
                    return AnonymousClass05K.A0C;
                }
                return AnonymousClass05K.A01;
            case 4:
                return AnonymousClass05K.A0N;
            case 5:
                return AnonymousClass05K.A15;
            default:
                throw AnonymousClass7TE.A1K();
        }
    }
}
