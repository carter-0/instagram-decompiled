package X;

import android.content.Context;
import android.widget.Filter;
import android.widget.Filterable;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.E8v  reason: case insensitive filesystem */
public final class C47583E8v extends C331047Ph implements Filterable {
    public CharSequence A00 = "";
    public List A01 = AnonymousClass7TE.A1C();
    public List A02 = AnonymousClass7TE.A1C();
    public List A03 = AnonymousClass7TE.A1C();
    public List A04 = AnonymousClass7TE.A1C();
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final EAW A08;
    public final C46448DfA A09;
    public final C39695A5l A0A;
    public final C336947fR A0B;
    public final E9R A0C;
    public final Context A0D;
    public final Filter A0E;
    public final C47639EAz A0F;
    public final C232472tm A0G;
    public final String A0H;

    public final Filter getFilter() {
        return this.A0E;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.A5l] */
    /* JADX WARNING: type inference failed for: r0v9, types: [X.2s0, X.E9R, java.lang.Object] */
    public C47583E8v(Context context, C19388WXf wXf, AnonymousClass0iw r8, UserSession userSession, G6X g6x, String str, boolean z) {
        this.A0D = context;
        this.A0H = str;
        EAW eaw = new EAW(context, wXf, r8, userSession);
        this.A08 = eaw;
        C232472tm r3 = new C232472tm(context);
        this.A0G = r3;
        C47639EAz eAz = new C47639EAz(context);
        this.A0F = eAz;
        C336947fR r1 = new C336947fR(context);
        this.A0B = r1;
        this.A0A = new Object();
        this.A09 = C46448DfA.A00(2131974685);
        this.A0E = new C46714Djl(this);
        this.A05 = z;
        ? obj = new Object();
        obj.A00 = g6x;
        this.A0C = obj;
        A0B(eaw, r3, eAz, r1, obj);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.F0f, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048 A[LOOP:0: B:16:0x0042->B:18:0x0048, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C47583E8v r6) {
        /*
            r6.A06()
            boolean r0 = r6.A07
            if (r0 != 0) goto L_0x0017
            java.util.List r0 = r6.A04
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0017
            java.util.List r0 = r6.A03
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x001d
        L_0x0017:
            r1 = 0
            X.E9R r0 = r6.A0C
            r6.A08(r0, r1)
        L_0x001d:
            boolean r0 = r6.A06
            if (r0 != 0) goto L_0x0052
            r3 = 0
            X.EAz r0 = r6.A0F
        L_0x0024:
            r6.A08(r0, r3)
        L_0x0027:
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x00b7
            java.util.List r0 = r6.A04
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b7
            X.DfA r2 = r6.A09
            X.A5l r1 = r6.A0A
            X.7fR r0 = r6.A0B
            r6.A09(r0, r2, r1)
            java.util.List r0 = r6.A04
            java.util.Iterator r2 = r0.iterator()
        L_0x0042:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r1 = r2.next()
            X.EAW r0 = r6.A08
            r6.A08(r0, r1)
            goto L_0x0042
        L_0x0052:
            java.util.List r0 = r6.A03
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00a1
            java.lang.CharSequence r0 = r6.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0027
            android.content.Context r1 = r6.A0D
            boolean r5 = r6.A05
            java.lang.String r4 = r6.A0H
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.F0f r3 = new X.F0f
            r3.<init>()
            android.content.res.Resources r2 = r1.getResources()
            r0 = 2131237324(0x7f0819cc, float:1.8090895E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A01 = r0
            r0 = 2131962559(0x7f132abf, float:1.9561847E38)
            if (r5 == 0) goto L_0x0086
            r0 = 2131962560(0x7f132ac0, float:1.9561849E38)
        L_0x0086:
            java.lang.String r0 = r2.getString(r0)     // Catch:{ NotFoundException -> 0x009e }
            r3.A04 = r0     // Catch:{ NotFoundException -> 0x009e }
            r1 = 2131962557(0x7f132abd, float:1.9561843E38)
            if (r5 == 0) goto L_0x0094
            r1 = 2131962558(0x7f132abe, float:1.9561845E38)
        L_0x0094:
            java.lang.Object[] r0 = new java.lang.Object[]{r4}     // Catch:{ NotFoundException -> 0x009e }
            java.lang.String r0 = r2.getString(r1, r0)     // Catch:{ NotFoundException -> 0x009e }
            r3.A03 = r0     // Catch:{ NotFoundException -> 0x009e }
        L_0x009e:
            X.2tm r0 = r6.A0G
            goto L_0x0024
        L_0x00a1:
            java.util.List r0 = r6.A03
            java.util.Iterator r2 = r0.iterator()
        L_0x00a7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r1 = r2.next()
            X.EAW r0 = r6.A08
            r6.A08(r0, r1)
            goto L_0x00a7
        L_0x00b7:
            r6.A07()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47583E8v.A00(X.E8v):void");
    }
}
