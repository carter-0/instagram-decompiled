package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ud8  reason: case insensitive filesystem */
public final class C15457Ud8 extends C331047Ph {
    public Reel A00;
    public C255773uh A01;
    public String A02;
    public final List A03 = new ArrayList();
    public final AnonymousClass2s2 A04;
    public final C251033mS A05;
    public final C250993mO A06;
    public final C14632Tze A07;
    public final C229122ms A08;
    public final C231762sK A09;
    public final boolean A0A;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.2s2, java.lang.Object] */
    public C15457Ud8(Context context, AnonymousClass0iw r6, UserSession userSession, X9R x9r, C229122ms r9) {
        C14632Tze tze = new C14632Tze(context, r6, userSession, x9r);
        this.A07 = tze;
        C231762sK r2 = new C231762sK(context);
        this.A09 = r2;
        ? obj = new Object();
        this.A04 = obj;
        this.A08 = r9;
        this.A0A = DbV.A1Y(userSession);
        this.A05 = C251033mS.A00(userSession);
        C250993mO A012 = C250993mO.A01(userSession);
        0qQ.A07(A012);
        this.A06 = A012;
        C13990Tnq.A1I(this, tze, r2, obj, JTR.A05(context));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (r1 == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C15457Ud8 r10) {
        /*
            r10.A06()
            X.2s2 r3 = r10.A04
            r2 = 0
            r10.A08(r3, r2)
            java.util.List r0 = r10.A03
            java.util.Iterator r9 = r0.iterator()
        L_0x000f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r8 = r9.next()
            X.BIu r8 = (X.C42139BIu) r8
            com.instagram.model.reels.Reel r7 = r10.A00
            X.3uh r6 = r10.A01
            com.instagram.user.model.User r5 = r8.A00
            boolean r0 = r10.A0A
            java.lang.String r4 = "Required value was null."
            if (r0 == 0) goto L_0x0034
            X.3mO r1 = r10.A06
            X.3mS r0 = r10.A05
            if (r5 == 0) goto L_0x0058
            boolean r1 = r1.A0C(r0, r5)
            r0 = 1
            if (r1 != 0) goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            X.Tzd r1 = new X.Tzd
            r1.<init>(r7, r6, r5, r0)
            java.lang.String r0 = r10.A02
            if (r0 == 0) goto L_0x0052
            r1.A0A = r0
            java.lang.Float r0 = r8.A01
            float r0 = X.C13989Tnp.A05(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.A03 = r0
            X.Tze r0 = r10.A07
            r10.A08(r0, r1)
            goto L_0x000f
        L_0x0052:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0058:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x005e:
            X.2ms r1 = r10.A08
            boolean r0 = r1.CKB()
            if (r0 == 0) goto L_0x006b
            X.2sK r0 = r10.A09
            r10.A08(r0, r1)
        L_0x006b:
            r10.A08(r3, r2)
            r10.A07()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15457Ud8.A00(X.Ud8):void");
    }
}
