package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ud9  reason: case insensitive filesystem */
public final class C15458Ud9 extends C331047Ph {
    public Reel A00;
    public C255773uh A01;
    public String A02;
    public List A03;
    public final List A04 = new ArrayList();
    public final AnonymousClass2s2 A05;
    public final C251033mS A06;
    public final C250993mO A07;
    public final C14632Tze A08;
    public final C229122ms A09;
    public final C231762sK A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARNING: type inference failed for: r4v0, types: [X.2s2, java.lang.Object] */
    public C15458Ud9(Context context, AnonymousClass0iw r8, UserSession userSession, X9R x9r, C229122ms r11) {
        AnonymousClass7TG.A1Q(userSession, r11);
        C14632Tze tze = new C14632Tze(context, r8, userSession, x9r);
        this.A08 = tze;
        C231762sK r5 = new C231762sK(context);
        this.A0A = r5;
        ? obj = new Object();
        this.A05 = obj;
        this.A09 = r11;
        this.A0B = DbV.A1Y(userSession);
        this.A0C = 182.A06(0Tu.A06, userSession, 36312544033440929L);
        this.A06 = C251033mS.A00(userSession);
        C250993mO A012 = C250993mO.A01(userSession);
        0qQ.A07(A012);
        this.A07 = A012;
        C13990Tnq.A1I(this, tze, r5, obj, JTR.A05(context));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        if (r10.A07.A0C(r10.A06, r2) == false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C15458Ud9 r10) {
        /*
            r10.A06()
            X.2s2 r4 = r10.A05
            r3 = 0
            r10.A08(r4, r3)
            boolean r0 = r10.A0C
            r5 = 1
            if (r0 == 0) goto L_0x0026
            java.util.List r0 = r10.A03
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0026
            com.instagram.model.reels.Reel r2 = r10.A00
            X.3uh r0 = r10.A01
            X.Tzd r1 = new X.Tzd
            r1.<init>((com.instagram.model.reels.Reel) r2, (X.C255773uh) r0)
            X.Tze r0 = r10.A08
            r10.A08(r0, r1)
        L_0x0026:
            java.util.List r0 = r10.A04
            java.util.Iterator r9 = r0.iterator()
        L_0x002c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0067
            java.lang.Object r8 = r9.next()
            X.BIs r8 = (X.C42137BIs) r8
            com.instagram.model.reels.Reel r7 = r10.A00
            X.3uh r6 = r10.A01
            com.instagram.user.model.User r2 = r8.A01
            boolean r0 = r10.A0B
            if (r0 == 0) goto L_0x004f
            if (r2 == 0) goto L_0x004f
            X.3mO r1 = r10.A07
            X.3mS r0 = r10.A06
            boolean r1 = r1.A0C(r0, r2)
            r0 = 1
            if (r1 != 0) goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            X.Tzd r1 = new X.Tzd
            r1.<init>(r7, r6, r2, r0)
            java.lang.Integer r0 = r8.A04
            if (r0 == 0) goto L_0x005b
            r1.A04 = r0
        L_0x005b:
            java.lang.String r0 = r10.A02
            if (r0 == 0) goto L_0x0061
            r1.A06 = r0
        L_0x0061:
            X.Tze r0 = r10.A08
            r10.A08(r0, r1)
            goto L_0x002c
        L_0x0067:
            X.2ms r1 = r10.A09
            if (r1 == 0) goto L_0x0076
            boolean r0 = r1.CKB()
            if (r0 != r5) goto L_0x0076
            X.2sK r0 = r10.A0A
            r10.A08(r0, r1)
        L_0x0076:
            r10.A08(r4, r3)
            r10.A07()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15458Ud9.A00(X.Ud9):void");
    }
}
