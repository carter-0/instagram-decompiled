package X;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.9KN  reason: invalid class name */
public final class AnonymousClass9KN extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03 = 1;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KN(2E4 r2, List list, List list2, AnonymousClass4D7 r5, boolean z) {
        super(2, r5);
        this.A02 = r2;
        this.A06 = z;
        this.A05 = list;
        this.A04 = list2;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.9KN, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        AnonymousClass4D7 r4 = r9;
        if (this.A03 != 0) {
            ? r0 = new AnonymousClass9KN((2E4) this.A02, (List) this.A05, (List) this.A04, r4, this.A06);
            r0.A01 = obj;
            return r0;
        }
        boolean z = this.A06;
        AnonymousClass9KN r1 = new AnonymousClass9KN((C251983oI) this.A05, (Callable) this.A04, r4, (String[]) this.A01, z);
        r1.A02 = obj;
        return r1;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass9KN) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.9KN, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        if (r6 != 5) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.A03
            if (r0 == 0) goto L_0x0093
            X.1Hj r0 = X.1Hj.A02
            int r1 = r13.A00
            r5 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0019
            if (r1 == r4) goto L_0x007d
            java.lang.Object r2 = r13.A01
            X.0eS.A00(r14)
        L_0x0013:
            X.0eP r0 = new X.0eP
            r0.<init>(r2, r14)
        L_0x0018:
            return r0
        L_0x0019:
            X.0eS.A00(r14)
            java.lang.Object r3 = r13.A01
            X.4Cq r3 = (X.C262224Cq) r3
            java.lang.Object r8 = r13.A02
            X.2E4 r8 = (X.2E4) r8
            com.instagram.common.session.UserSession r7 = r8.A00
            X.0Tu r6 = X.0Tu.A05
            r1 = 36604047759709178(0x820b30000f13fa, double:3.211885423685298E-306)
            long r1 = X.182.A01(r6, r7, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            long r1 = r1.longValue()
            int r6 = (int) r1
            r11 = 5
            r2 = 4
            r1 = 3
            if (r6 == r4) goto L_0x0047
            if (r6 == r5) goto L_0x007b
            if (r6 == r1) goto L_0x0079
            if (r6 == r2) goto L_0x0077
            if (r6 == r11) goto L_0x0048
        L_0x0047:
            r11 = 1
        L_0x0048:
            boolean r1 = r13.A06
            if (r1 != 0) goto L_0x004d
            r11 = 1
        L_0x004d:
            r10 = 0
            java.lang.Object r9 = r13.A05
            r12 = 12
            X.JTZ r7 = new X.JTZ
            r7.<init>(r8, r9, r10, r11, r12)
            X.19B r6 = X.19B.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.2Q8 r2 = X.1Eo.A01(r1, r6, r7, r3)
            java.lang.Object r9 = r13.A04
            r12 = 11
            X.JTZ r7 = new X.JTZ
            r7.<init>(r8, r9, r10, r11, r12)
            X.2Q8 r1 = X.1Eo.A01(r1, r6, r7, r3)
            r13.A01 = r1
            r13.A00 = r4
            java.lang.Object r14 = r2.A0E(r13)
            if (r14 != r0) goto L_0x0084
            return r0
        L_0x0077:
            r11 = 4
            goto L_0x0048
        L_0x0079:
            r11 = 3
            goto L_0x0048
        L_0x007b:
            r11 = 2
            goto L_0x0048
        L_0x007d:
            java.lang.Object r1 = r13.A01
            X.2Q9 r1 = (X.AnonymousClass2Q9) r1
            X.0eS.A00(r14)
        L_0x0084:
            r13.A01 = r14
            r13.A00 = r5
            X.4Cp r1 = (X.C262214Cp) r1
            java.lang.Object r1 = r1.A0E(r13)
            if (r1 == r0) goto L_0x0018
            r2 = r14
            r14 = r1
            goto L_0x0013
        L_0x0093:
            X.1Hj r0 = X.1Hj.A02
            int r2 = r13.A00
            r1 = 1
            if (r2 == 0) goto L_0x00a2
            if (r2 != r1) goto L_0x00c6
            X.0eS.A00(r14)
        L_0x009f:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00a2:
            X.0eS.A00(r14)
            java.lang.Object r6 = r13.A02
            X.02o r6 = (X.02o) r6
            boolean r8 = r13.A06
            java.lang.Object r3 = r13.A05
            X.3oI r3 = (X.C251983oI) r3
            java.lang.Object r7 = r13.A01
            java.lang.String[] r7 = (java.lang.String[]) r7
            java.lang.Object r4 = r13.A04
            java.util.concurrent.Callable r4 = (java.util.concurrent.Callable) r4
            r5 = 0
            X.JTu r2 = new X.JTu
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r13.A00 = r1
            java.lang.Object r1 = X.19E.A00(r13, r2)
            if (r1 != r0) goto L_0x009f
            return r0
        L_0x00c6:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9KN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KN(C251983oI r2, Callable callable, AnonymousClass4D7 r4, String[] strArr, boolean z) {
        super(2, r4);
        this.A06 = z;
        this.A05 = r2;
        this.A01 = strArr;
        this.A04 = callable;
    }
}
