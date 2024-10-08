package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.7Uq  reason: invalid class name and case insensitive filesystem */
public final class C332357Uq {
    public final UserSession A00;
    public final C332377Us A01;
    public final AnonymousClass0Gt A02;

    public static final Set A00(C332357Uq r11, Set set) {
        long j;
        long j2;
        ArrayList arrayList = new ArrayList();
        for (Object next : set) {
            AnonymousClass9VE r3 = (AnonymousClass9VE) next;
            Integer num = r3.A04;
            if (num == null || num == AnonymousClass05K.A00) {
                C332377Us r2 = r11.A01;
                String str = r3.A06;
                0qQ.A0B(str, 0);
                Object obj = r2.A03.get(str);
                if (obj == null) {
                    obj = null;
                }
                A6J a6j = (A6J) obj;
                if (a6j != null) {
                    AnonymousClass9VH r9 = r3.A01;
                    long j3 = (long) r9.A00;
                    C381629c4 r8 = a6j.A00;
                    if (r8 != null) {
                        j = r8.A01;
                    } else {
                        j = 0;
                    }
                    if (j3 > j) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (r8 != null) {
                            j2 = r8.A00;
                        } else {
                            j2 = 0;
                        }
                        if (currentTimeMillis <= j2 + AnonymousClass30M.A03(r9.A02)) {
                        }
                    }
                }
                arrayList.add(next);
            }
        }
        return 00k.A0k(arrayList);
    }

    public C332357Uq(AnonymousClass0Gt r1, UserSession userSession, C332377Us r3) {
        this.A01 = r3;
        this.A00 = userSession;
        this.A02 = r1;
    }
}
