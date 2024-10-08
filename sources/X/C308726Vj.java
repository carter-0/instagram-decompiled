package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.6Vj  reason: invalid class name and case insensitive filesystem */
public abstract class C308726Vj {
    public static final ArrayList A00(Context context, UserSession userSession, C249863kU r15, String str) {
        C249863kU r4 = r15;
        0qQ.A0B(r15, 0);
        String str2 = str;
        0qQ.A0B(str2, 3);
        ArrayList arrayList = new ArrayList();
        UserSession userSession2 = userSession;
        AnonymousClass624 A00 = AnonymousClass624.A03.A00(userSession);
        UserSession A002 = AnonymousClass624.A00(A00);
        0Tu r2 = 0Tu.A05;
        int A01 = (int) 182.A01(r2, A002, 36592253780689278L);
        if (A01 >= 0) {
            boolean A06 = 182.A06(r2, AnonymousClass624.A00(A00), 2342153788018524439L);
            Context context2 = context;
            C308736Vk r5 = new C308736Vk(context2, userSession2, new C308766Vn(), A01, (int) 182.A01(r2, AnonymousClass624.A00(A00), 36592253781475713L), A06);
            r15.A06(r5);
            arrayList.add(r5);
        }
        int A012 = (int) 182.A01(r2, userSession, 36594207988844174L);
        if (A012 >= 0) {
            C308746Vl r10 = new C308746Vl(userSession2, str2, A012, (int) 182.A01(r2, userSession, 36594207990548115L), 182.A06(r2, userSession2, 2342155742227465460L));
            r4.A06(r10);
            arrayList.add(r10);
        }
        return arrayList;
    }
}
