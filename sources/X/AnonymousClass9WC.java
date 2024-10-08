package X;

import android.content.Context;
import android.util.SparseArray;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.9WC  reason: invalid class name */
public final class AnonymousClass9WC {
    public int A00;
    public int A01;
    public C349027zT A02 = null;
    public AnonymousClass9WB A03;
    public C39801A9w A04;
    public boolean A05;
    public C365358my A06;
    public final int A07;
    public final Context A08;
    public final SparseArray A09 = new SparseArray();
    public final SparseArray A0A = new SparseArray();
    public final SparseArray A0B = new SparseArray();
    public final UserSession A0C;
    public final C282765Eq A0D = new Object();
    public final A91 A0E;
    public final C41799B1e A0F;
    public final List A0G;
    public final Map A0H = AnonymousClass7TE.A1E();
    public final AnonymousClass0eM A0I = AnonymousClass0eN.A01(new C41398AtK(1));
    public final AnonymousClass0eM A0J = AnonymousClass0eN.A01(new C41398AtK(2));

    /* JADX WARNING: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass9WD A00(X.C367508qr r20, X.C367508qr r21, int r22) {
        /*
            r19 = this;
            r0 = r19
            java.util.List r4 = r0.A0G
            r4.getClass()
            boolean r1 = r0.A05
            if (r1 != 0) goto L_0x0093
            r5 = 1
            r3 = 0
            r0.A05 = r5
            android.content.Context r11 = r0.A08
            com.instagram.common.session.UserSession r14 = r0.A0C
            X.A91 r15 = r0.A0E
            int r2 = r0.A07
            X.9WB r1 = new X.9WB
            r1.<init>(r11, r14, r15, r2)
            r0.A03 = r1
            java.util.Iterator r9 = r4.iterator()
        L_0x0022:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0093
            java.lang.Object r2 = r9.next()
            X.5Eo r2 = (X.C282745Eo) r2
            java.util.Set r1 = r2.A07
            java.util.TreeSet r7 = new java.util.TreeSet
            r7.<init>(r1)
            java.util.Map r1 = r0.A0H
            r1.put(r2, r7)
            X.5Er r6 = r2.A03
            int r8 = r6.ordinal()
            if (r8 == r3) goto L_0x006e
            if (r8 == r5) goto L_0x006e
            r1 = 3
            if (r8 == r1) goto L_0x006e
            r1 = 2
            if (r8 == r1) goto L_0x006e
            r1 = 4
            if (r8 != r1) goto L_0x0078
            X.B1e r1 = r0.A0F
            X.A9w r10 = new X.A9w
            r12 = r20
            r13 = r21
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r0.A04 = r10
            X.5Eq r1 = new X.5Eq
            r1.<init>()
            java.lang.Object r1 = r7.floor(r1)
            r1.getClass()
            X.5Eq r1 = (X.C282765Eq) r1
            r10.A02(r2, r1)
            goto L_0x0022
        L_0x006e:
            X.9WB r1 = r0.A03
            X.B2e r1 = r1.A00(r6)
            r1.A8e(r2)
            goto L_0x0022
        L_0x0078:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 482(0x1e2, float:6.75E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0093:
            r3 = r22
            java.lang.Object r11 = r4.get(r3)
            X.5Eo r11 = (X.C282745Eo) r11
            X.A5d r5 = r11.A02
            r14 = 0
            if (r5 == 0) goto L_0x00aa
            int r2 = r0.A01
            int r1 = r5.A01
            if (r1 > r2) goto L_0x0186
            int r1 = r5.A00
            if (r2 > r1) goto L_0x0186
        L_0x00aa:
            X.5Er r4 = r11.A03
            int r2 = r4.ordinal()
            r9 = 0
            if (r2 == r9) goto L_0x00fe
            r1 = 1
            if (r2 == r1) goto L_0x00fe
            r1 = 3
            if (r2 == r1) goto L_0x00fe
            r1 = 2
            if (r2 == r1) goto L_0x00fe
            r1 = 4
            if (r2 != r1) goto L_0x00e3
            int r2 = r0.A01
            if (r5 == 0) goto L_0x00ca
            int r1 = r5.A01
            int r2 = r2 - r1
            int r2 = java.lang.Math.max(r2, r9)
        L_0x00ca:
            X.A9w r4 = r0.A04
            r4.getClass()
            long r1 = (long) r2
            r4.A01(r11, r1)
            X.A9w r1 = r0.A04
            X.Thi r1 = r1.A01
            if (r1 != 0) goto L_0x0124
            java.lang.String r0 = "videoOutputSurface"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00e3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 482(0x1e2, float:6.75E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00fe:
            X.9WB r2 = r0.A03
            r2.getClass()
            X.5Er r1 = r11.A03
            X.B2e r10 = r2.A00(r1)
            boolean r1 = r10 instanceof X.AhC
            if (r1 == 0) goto L_0x0116
            X.7zT r2 = r0.A02
            if (r2 == 0) goto L_0x0116
            r1 = r10
            X.AhC r1 = (X.AhC) r1
            r1.A00 = r2
        L_0x0116:
            int r1 = r0.A01
            long r12 = (long) r1
            int r1 = r0.A00
            long r14 = (long) r1
            X.8my r13 = r10.C5l(r11, r12, r14)
        L_0x0120:
            if (r13 != 0) goto L_0x0144
            r4 = 0
        L_0x0123:
            return r4
        L_0x0124:
            X.QM0 r1 = (X.QM0) r1
            int r15 = r1.A03
            X.8my r13 = r0.A06
            if (r13 != 0) goto L_0x0120
            X.A91 r1 = r0.A0E
            android.graphics.drawable.Drawable r1 = r1.A00(r11)
            int r17 = r1.getIntrinsicWidth()
            int r18 = r1.getIntrinsicHeight()
            r16 = 36197(0x8d65, float:5.0723E-41)
            X.8mx r13 = new X.8mx
            r13.<init>(r14, r15, r16, r17, r18)
            r0.A06 = r13
        L_0x0144:
            android.util.SparseArray r1 = r0.A09
            java.lang.Object r4 = r1.get(r3)
            X.9WD r4 = (X.AnonymousClass9WD) r4
            if (r4 != 0) goto L_0x015b
            X.7sq r0 = new X.7sq
            r0.<init>()
            X.9WD r4 = new X.9WD
            r4.<init>(r0)
            r1.put(r3, r4)
        L_0x015b:
            r4.A04 = r9
            int r5 = r13.getWidth()
            int r6 = r13.getHeight()
            r7 = r5
            r8 = r6
            r10 = r9
            r11 = r9
            r12 = r9
            r4.FKc(r5, r6, r7, r8, r9, r10, r11, r12)
            X.7v0 r2 = r13.getTexture()
            r4.A02 = r2
            X.7sy r0 = r4.A05
            r0.A04 = r2
            int r1 = r4.A01
            int r0 = r4.A00
            r2.A00(r1, r0)
            X.7ut r0 = r4.A03
            if (r0 == 0) goto L_0x0123
            r0.DGm()
            return r4
        L_0x0186:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9WC.A00(X.8qr, X.8qr, int):X.9WD");
    }

    public final void A01(int i) {
        AnonymousClass9WD r0;
        C346337v0 r02;
        List list = this.A0G;
        list.getClass();
        C282775Er r1 = ((C282745Eo) list.get(i)).A03;
        if ((r1 == C282775Er.A08 || r1 == C282775Er.A06 || r1 == C282775Er.A05) && (r0 = (AnonymousClass9WD) this.A09.get(i)) != null && (r02 = r0.A05.A04) != null) {
            r02.A01();
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.5Eq, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, X.B1e] */
    public AnonymousClass9WC(Context context, UserSession userSession, String str, List list, int i) {
        this.A08 = context;
        this.A0G = list;
        this.A0C = userSession;
        this.A0F = new Object();
        this.A0E = new A91(context, userSession, str);
        this.A07 = i;
        0Tu r2 = 0Tu.A06;
        if (182.A06(r2, userSession, 36323139717901188L) || 182.A06(r2, userSession, 36323139718294410L)) {
            this.A02 = new C349027zT(userSession, context, false);
        }
    }
}
