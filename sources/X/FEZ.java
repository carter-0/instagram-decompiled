package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.List;

public final class FEZ {
    public final int A00;
    public final Context A01;
    public final AnonymousClass2t9 A02;
    public final UserSession A03;
    public final C74498Pvs A04;
    public final C251033mS A05;
    public final C250993mO A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public FEZ(Context context, AnonymousClass2t9 r7, UserSession userSession, C74498Pvs pvs, C251033mS r10, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = context;
        this.A05 = r10;
        this.A02 = r7;
        this.A03 = userSession;
        this.A04 = pvs;
        this.A08 = z;
        this.A0B = z2;
        this.A0E = z3;
        this.A09 = z4;
        this.A0D = z5;
        this.A0C = DbV.A1Y(userSession);
        C250993mO A012 = C250993mO.A01(userSession);
        0qQ.A07(A012);
        this.A06 = A012;
        0Tu r4 = 0Tu.A05;
        this.A0A = 182.A06(r4, userSession, 36320416709419416L);
        long A013 = 182.A01(r4, userSession, 36596286753081730L);
        0qQ.A0C(Long.valueOf(A013), AnonymousClass000.A00(17));
        this.A00 = (int) A013;
        this.A07 = 182.A06(r4, userSession, 36314811776961332L);
    }

    public static final ArrayList A00(FEZ fez, Integer num, List list, int i, int i2) {
        ArrayList A0v = DbS.A0v(list.size() + 1);
        A0v.add(new C71982OuE((C16744V4b) null, num, AnonymousClass05K.A0N));
        FEZ fez2 = fez;
        UserSession userSession = fez2.A03;
        C70167NyL.A00(userSession).A00.getBoolean("debug_overlay_enabled", false);
        boolean z = fez2.A0E;
        C74184PqQ pqQ = new C74184PqQ(fez2, 40);
        C74184PqQ pqQ2 = new C74184PqQ(fez2, 41);
        C74184PqQ pqQ3 = new C74184PqQ(fez2, 42);
        C74184PqQ pqQ4 = new C74184PqQ(fez2, 43);
        C74184PqQ pqQ5 = new C74184PqQ(fez2, 44);
        C74184PqQ pqQ6 = new C74184PqQ(fez2, 45);
        C74184PqQ pqQ7 = new C74184PqQ(fez2, 46);
        C74184PqQ pqQ8 = new C74184PqQ(fez2, 47);
        C74184PqQ pqQ9 = new C74184PqQ(fez2, 48);
        C74184PqQ pqQ10 = new C74184PqQ(fez2, 39);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (!A01(next, pqQ3)) {
                A1C.add(next);
            }
        }
        ArrayList A0p = AnonymousClass7TF.A0p(A1C);
        int i3 = 0;
        for (Object next2 : A1C) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            DirectShareTarget directShareTarget = (DirectShareTarget) next2;
            int i5 = i;
            DirectShareTarget directShareTarget2 = directShareTarget;
            boolean z2 = z;
            UserSession userSession2 = userSession;
            A0p.add(new FYM(userSession2, directShareTarget2, i5, i2 + i3, i3, AnonymousClass7TE.A0M(pqQ4.invoke(directShareTarget)), z2, A01(directShareTarget, pqQ), A01(directShareTarget, pqQ2), A01(directShareTarget, pqQ5), A01(directShareTarget, pqQ6), A01(directShareTarget, pqQ7), A01(directShareTarget, pqQ8), A01(directShareTarget, pqQ10), A01(directShareTarget, pqQ9)));
            i3 = i4;
        }
        A0v.addAll(A0p);
        return A0v;
    }

    public static boolean A01(Object obj, C74184PqQ pqQ) {
        return ((Boolean) pqQ.invoke(obj)).booleanValue();
    }
}
