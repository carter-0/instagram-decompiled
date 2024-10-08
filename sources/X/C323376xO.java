package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.6xO  reason: invalid class name and case insensitive filesystem */
public final class C323376xO implements 2YM {
    public final UserSession A00;

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final 2YL create(Class cls) {
        0qQ.A0B(cls, 0);
        if (cls.isAssignableFrom(C323386xP.class)) {
            return new C323386xP(this.A00);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Attempting to create a ");
        sb.append(cls);
        sb.append(" using ");
        Class<?> cls2 = getClass();
        Map map = 0Yh.A03;
        0qQ.A0B(cls2, 1);
        sb.append(0q1.A00(cls2));
        throw new IllegalArgumentException(sb.toString());
    }

    public C323376xO(UserSession userSession) {
        this.A00 = userSession;
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        0qQ.A0B(cls, 1);
        return create(cls);
    }
}
