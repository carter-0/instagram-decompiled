package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2pa  reason: invalid class name and case insensitive filesystem */
public final class C230412pa implements C230422pb {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C230412pa(UserSession userSession, String str, String str2) {
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = str2;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass9JO AUM(Object obj, Object obj2) {
        C53288Gla gla = (C53288Gla) obj;
        int intValue = ((Number) obj2).intValue();
        0qQ.A0B(gla, 0);
        return C254373sN.A01(((C55923Hpk) gla.A03.A0B.get(intValue)).A00());
    }

    public final /* bridge */ /* synthetic */ C253533qw AUN(C230472pg r28, Object obj, Object obj2, float f, long j, long j2) {
        String str;
        C53288Gla gla = (C53288Gla) obj;
        int intValue = ((Number) obj2).intValue();
        0qQ.A0B(gla, 0);
        C230472pg r7 = r28;
        0qQ.A0B(r7, 2);
        C54077Gz1 gz1 = gla.A03;
        1Xj A002 = ((C55923Hpk) gz1.A0B.get(intValue)).A00();
        UserSession userSession = this.A00;
        if (!182.A06(0Tu.A06, userSession, 36312887637902769L) || (str = C231122qu.A07(userSession, A002)) == null) {
            str = A002.getId();
        }
        if (str != null) {
            String str2 = this.A02;
            String id = A002.getId();
            if (id != null) {
                return new C253533qw(r7, str, str2, id, this.A01, AnonymousClass000.A00(1485), "", f, gz1.A00, -1, -1, -1, -1, -1, -1, -1, j, j2);
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
