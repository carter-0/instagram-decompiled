package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: X.GYo  reason: case insensitive filesystem */
public final class C52589GYo extends C243963aQ {
    public final float A00;
    public final float A01;
    public final C14065TpD A02;
    public final C267324bN A03;
    public final C52058GDe A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final JTB A07;
    public final GZC A08;
    public final GZD A09;
    public final GFO A0A;
    public final JP2 A0B;
    public final C51987GAk A0C;
    public final C52129GFx A0D;
    public final HashMap A0E;
    public final S6e A0F;
    public final boolean A0G;

    public C52589GYo(C14065TpD tpD, C267324bN r3, C52058GDe gDe, AnonymousClass0iw r5, UserSession userSession, S6e s6e, JTB jtb, GZC gzc, GZD gzd, GFO gfo, JP2 jp2, C51987GAk gAk, C52129GFx gFx, HashMap hashMap, float f, float f2, boolean z) {
        0qQ.A0B(userSession, 1);
        C51974G9v.A0d(3, gDe, jtb, hashMap, gfo);
        C51974G9v.A1Q(gFx, gzc, gzd, r5);
        this.A06 = userSession;
        this.A03 = r3;
        this.A04 = gDe;
        this.A07 = jtb;
        this.A0E = hashMap;
        this.A0A = gfo;
        this.A0D = gFx;
        this.A08 = gzc;
        this.A09 = gzd;
        this.A05 = r5;
        this.A0C = gAk;
        this.A0B = jp2;
        this.A01 = f;
        this.A00 = f2;
        this.A0G = z;
        this.A0F = s6e;
        this.A02 = tpD;
    }

    public final C244523bK A0X(C244463bE r10) {
        0qQ.A0B(r10, 0);
        2WO r3 = new 2WO(Integer.MAX_VALUE, Integer.MAX_VALUE);
        2WX r4 = null;
        AnonymousClass2WG A0f = C51969G9p.A0f(r10, C51971G9r.A0e(C52590GYp.A00, false), C52645GaJ.A00, J6R.A00(this, r10, 20));
        AnonymousClass3XV r0 = 2WX.A02;
        Integer num = AnonymousClass05K.A01;
        2WX A0X = C51971G9r.A0X((2WX) null, num, 100.0f, 0);
        Integer num2 = AnonymousClass05K.A00;
        2WX A0Z = C51971G9r.A0Z(C51971G9r.A0Z(C51971G9r.A0Y(C51971G9r.A0X(A0X, num2, 100.0f, 0), AnonymousClass05K.A04, J6E.A00(this, 36), 4), num2, J6E.A00(this, 37), (String) null), num, J6E.A00(this, 38), (String) null);
        if (this.A03.CcK()) {
            r4 = C51973G9u.A0N(C244063aa.MEDIA, (2WX) null);
        }
        return C51965G9l.A0W(A0Z.A00(r4), r3, A0f);
    }

    public static final C52588GYn A00(2WX r12, 1Xj r13, C52589GYo gYo, int i) {
        UserSession userSession = gYo.A06;
        GFO gfo = gYo.A0A;
        C52058GDe gDe = gYo.A04;
        GZC gzc = gYo.A08;
        AnonymousClass9JS A0e = C51968G9o.A0e(AnonymousClass05K.A02, C52591GYq.A00);
        if (r12 == 2WX.A02) {
            r12 = null;
        }
        2WX A0X = C51965G9l.A0X(r12, A0e);
        C51987GAk gAk = gYo.A0C;
        S6e s6e = gYo.A0F;
        float f = gYo.A00;
        C267324bN r0 = gYo.A03;
        return new C52588GYn(A0X, gDe, userSession, r13, s6e, gzc, gfo, gAk, f, i, r0.A0E(), r0.A0H());
    }

    public static final C53868GvZ A04(2WX r13, C52589GYo gYo, int i) {
        UserSession userSession = gYo.A06;
        GFO gfo = gYo.A0A;
        WeakReference A0v = C51965G9l.A0v(gYo.A07);
        HashMap hashMap = gYo.A0E;
        return new C53868GvZ(r13, userSession, gfo, gYo.A0B, gYo.A0C, gYo.A09, A0v, hashMap, i, i, gYo.A03.A0E(), gYo.A0G);
    }
}
