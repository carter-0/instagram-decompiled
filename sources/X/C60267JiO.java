package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JiO  reason: case insensitive filesystem */
public final class C60267JiO extends 2YL {
    public C250673ls A00;
    public final C63756L5o A01;
    public final UserSession A02;
    public final 05G A03;
    public final AnonymousClass0Ud A04;

    public C60267JiO(C63756L5o l5o, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A01 = l5o;
        this.A02 = userSession;
        02z A10 = DbS.A10(new C61060Jvy(1));
        this.A03 = A10;
        this.A04 = A10;
    }

    public static final C45407Cvn A00(C250673ls r4) {
        C250663lr A032;
        Class cls;
        int i;
        String str;
        int i2;
        if (r4 instanceof C43149BtZ) {
            A032 = ((C250663lr) r4).A03(C43148BtY.class, AnonymousClass000.A00(830), -1537798237);
            if (A032 == null) {
                return null;
            }
            cls = C43146BtW.class;
            i = 0;
            str = "edges";
            i2 = -1839407389;
        } else if (!(r4 instanceof C43144BtU) || (A032 = ((C250663lr) r4).A03(C43143BtT.class, AnonymousClass000.A00(1953), -1771340093)) == null) {
            return null;
        } else {
            cls = C43141BtR.class;
            i = 0;
            str = "edges";
            i2 = 1369971682;
        }
        return A032.getRequiredCompactedPaginableListEdgesField(i, str, cls, i2);
    }
}
