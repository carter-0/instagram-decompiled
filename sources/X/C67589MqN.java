package X;

import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.user.model.User;

/* renamed from: X.MqN  reason: case insensitive filesystem */
public abstract class C67589MqN {
    public static final C67590MqO A00(N4t n4t) {
        String str;
        String str2;
        NotePogImageDict notePogImageDict;
        0qQ.A0B(n4t, 0);
        AnonymousClass4AB r1 = n4t.A05;
        if (r1 == null || (notePogImageDict = r1.A07) == null || (str = notePogImageDict.A01) == null) {
            str = DbU.A0p(n4t.A06);
            0qQ.A07(str);
        }
        String str3 = n4t.A0B;
        AnonymousClass3WR A03 = n4t.A03();
        if (r1 != null) {
            NotePogVideoDict notePogVideoDict = r1.A08;
            if (notePogVideoDict == null || (str2 = notePogVideoDict.A01) == null) {
                NotePogImageDict notePogImageDict2 = r1.A07;
                if (notePogImageDict2 != null) {
                    str2 = notePogImageDict2.A00;
                }
            }
            return new C67590MqO(A03, str, str3, str2, n4t.A0H, AnonymousClass7TF.A1W(n4t.A07, AnonymousClass05K.A00));
        }
        str2 = null;
        return new C67590MqO(A03, str, str3, str2, n4t.A0H, AnonymousClass7TF.A1W(n4t.A07, AnonymousClass05K.A00));
    }

    public static final C67590MqO A01(User user) {
        0qQ.A0B(user, 0);
        String A0p = DbU.A0p(user);
        0qQ.A07(A0p);
        return new C67590MqO((AnonymousClass3WR) null, A0p, user.getId(), (String) null, false, false);
    }
}
