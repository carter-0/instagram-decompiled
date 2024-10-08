package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OTs  reason: case insensitive filesystem */
public final class C70971OTs {
    public final int A00;
    public final long A01;
    public final long A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final UserSession A09;
    public final AnonymousClass65E A0A;
    public final C67460MoF A0B;

    public C70971OTs(UserSession userSession) {
        int i;
        0qQ.A0B(userSession, 1);
        this.A09 = userSession;
        AnonymousClass65E A002 = AnonymousClass65D.A00(userSession);
        this.A0A = A002;
        C67460MoF A003 = C70003Nvh.A00(userSession);
        this.A0B = A003;
        UserSession userSession2 = A002.A00;
        String A012 = AnonymousClass65A.A01(userSession2, 36878899902677214L);
        A012 = 00l.A0W(A012) ? "-7,-3" : A012;
        String A013 = AnonymousClass65A.A01(userSession2, 36878899902546140L);
        A013 = 00l.A0W(A013) ? RealtimeSubscription.GRAPHQL_MQTT_VERSION : A013;
        String A014 = AnonymousClass65A.A01(userSession2, 36878899902283992L);
        A014 = 00l.A0W(A014) ? "6" : A014;
        String A015 = AnonymousClass65A.A01(userSession2, 36878899902611677L);
        A015 = 00l.A0W(A015) ? "8" : A015;
        String A016 = AnonymousClass65A.A01(userSession2, 36878899902349529L);
        A016 = 00l.A0W(A016) ? "1,2,3,4,5,6,7,10,14,20,30,40,60" : A016;
        UserSession userSession3 = A003.A01;
        0Tu r2 = A003.A00;
        String A042 = 182.A04(r2, userSession3, 36889405386195787L);
        A042 = 00l.A0W(A042) ? "2" : A042;
        String A043 = 182.A04(r2, userSession3, 36889405386261324L);
        A043 = 00l.A0W(A043) ? "7" : A043;
        this.A03 = A00(A012);
        this.A07 = A00(A013);
        this.A08 = A00(A014);
        Integer A0l = 00y.A0l(DbV.A12(A015));
        if (A0l != null) {
            i = A0l.intValue();
        } else {
            i = 8;
        }
        this.A00 = i;
        this.A01 = AnonymousClass65A.A00(userSession2, 36597424928066357L);
        this.A02 = AnonymousClass65A.A00(userSession2, 36597424928131894L);
        this.A06 = A00(A016);
        this.A05 = A00(A042);
        this.A04 = A00(A043);
    }

    public static final List A00(String str) {
        List A0x = DbX.A0x(str);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A0x.iterator();
        while (it.hasNext()) {
            Integer A0l = 00y.A0l(DbV.A12(AnonymousClass7TE.A18(it)));
            if (A0l != null) {
                A1C.add(A0l);
            }
        }
        return A1C;
    }
}
