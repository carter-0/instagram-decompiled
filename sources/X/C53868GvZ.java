package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.GvZ  reason: case insensitive filesystem */
public final class C53868GvZ extends C251343mx {
    public final C52129GFx A00;
    public final int A01;
    public final int A02;
    public final 2WX A03;
    public final UserSession A04;
    public final GFO A05;
    public final JP2 A06;
    public final C51987GAk A07;
    public final WeakReference A08;
    public final HashMap A09;
    public final boolean A0A;
    public final boolean A0B;

    public final C251263mp A0X(AnonymousClass3Y5 r32) {
        1Xj r1;
        ExtendedImageUrl A1n;
        AnonymousClass3Y5 r8 = r32;
        0qQ.A0B(r8, 0);
        GGH ggh = GGH.A00;
        AnonymousClass3XV r16 = 2WX.A02;
        2WX A0L = C51974G9v.A0L(G9t.A12(AnonymousClass05K.A0Y, C244413b9.ABSOLUTE, 3), AnonymousClass05K.A01);
        JP2 jp2 = this.A06;
        GFO gfo = this.A05;
        UserSession userSession = gfo.A0H;
        2WX A0Y = C51971G9r.A0Y(C51971G9r.A0Y(ggh.A00(C243803a8.A00(r8), ggh.A01(C243803a8.A00(r8), A0L, userSession, jp2), userSession), AnonymousClass05K.A02, C59085J5s.A00, 4), AnonymousClass05K.A04, J6E.A00(this, 40), 4);
        2Wb A0Q = C51972G9s.A0Q(r8);
        C267324bN r2 = gfo.A0D;
        List list = r2.A0R;
        if (!(((list == null || (r1 = DbZ.A0T(list, this.A02)) == null) && (r1 = r2.A02) == null) || (A1n = r1.A1n(C51966G9m.A0O(A0Q))) == null)) {
            UserSession userSession2 = this.A04;
            if (!this.A0A && 182.A06(DbS.A0J(userSession2, 0), userSession2, 36324952193970709L)) {
                A0Q.A00(new C53750Gtf(O1D.A00(A1n), gfo.A0G));
            }
        }
        2WX r11 = this.A03;
        2Wb A0w = G9t.A0w(A0Q);
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap hashMap = this.A09;
        AnonymousClass0iw r13 = gfo.A0G;
        WeakReference weakReference = this.A08;
        UserSession userSession3 = userSession;
        AnonymousClass0iw r19 = r13;
        C52058GDe gDe = gfo.A0E;
        C267324bN r17 = r2;
        C51971G9r.A1D(new C52152GGu(r16, r17, gDe, r19, userSession3, Integer.valueOf(this.A02), weakReference, A1E, hashMap, false, this.A0B, false, false, false, false), A0w, A0Q, r11);
        return C51967G9n.A0N(new C52587GYm(gfo, this.A07, this.A01), A0Q, r8, A0Y);
    }

    public C53868GvZ(2WX r2, UserSession userSession, GFO gfo, JP2 jp2, C51987GAk gAk, C52129GFx gFx, WeakReference weakReference, HashMap hashMap, int i, int i2, boolean z, boolean z2) {
        AnonymousClass7TG.A1O(userSession, gfo);
        AnonymousClass7TF.A1F(hashMap, 5, gFx);
        0qQ.A0B(r2, 10);
        this.A04 = userSession;
        this.A05 = gfo;
        this.A01 = i;
        this.A08 = weakReference;
        this.A09 = hashMap;
        this.A06 = jp2;
        this.A02 = i2;
        this.A00 = gFx;
        this.A07 = gAk;
        this.A03 = r2;
        this.A0A = z;
        this.A0B = z2;
    }
}
