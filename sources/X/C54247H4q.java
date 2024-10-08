package X;

/* renamed from: X.H4q  reason: case insensitive filesystem */
public final class C54247H4q extends 1P0 {
    public final /* synthetic */ 0px A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ String A03;

    public C54247H4q(0px r1, Integer num, Object obj, String str) {
        this.A00 = r1;
        this.A03 = str;
        this.A01 = num;
        this.A02 = obj;
    }

    public final void onFailInBackground(C268654dm r4) {
        int A032 = AnonymousClass0fD.A03(1146028032);
        this.A00.A0C(this.A03);
        AnonymousClass0fD.A0A(1951337870, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if ((r6 instanceof X.C268674do) == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r1 != 3) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r6) {
        /*
            r5 = this;
            r0 = -1267044871(0xffffffffb47a6df9, float:-2.3323072E-7)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.0px r4 = r5.A00
            java.lang.String r2 = r5.A03
            r4.A0C(r2)
            java.lang.Integer r0 = r5.A01
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x003c
            r0 = 2
            if (r1 == r0) goto L_0x0024
            r0 = 3
            if (r1 == r0) goto L_0x0040
        L_0x001d:
            r0 = 2053775685(0x7a6a2145, float:3.0391806E35)
        L_0x0020:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x0024:
            java.lang.Object r0 = r6.A00()
            X.1XR r0 = (X.1XR) r0
            if (r0 == 0) goto L_0x0040
            int r1 = r0.getStatusCode()
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 >= r0) goto L_0x0040
            r0 = 400(0x190, float:5.6E-43)
            if (r1 < r0) goto L_0x0040
            r0 = 1947448045(0x7413b2ed, float:4.680766E31)
            goto L_0x0020
        L_0x003c:
            boolean r0 = r6 instanceof X.C268674do
            if (r0 != 0) goto L_0x001d
        L_0x0040:
            java.lang.Object r0 = r5.A02
            r4.A0D(r2, r0)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54247H4q.onFail(X.4dm):void");
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1808484106);
        int A033 = AnonymousClass0fD.A03(1689205273);
        this.A00.A0C(this.A03);
        AnonymousClass0fD.A0A(1907779555, A033);
        AnonymousClass0fD.A0A(323480862, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1305430030);
        int A033 = AnonymousClass0fD.A03(958141155);
        this.A00.A0C(this.A03);
        AnonymousClass0fD.A0A(1473186715, A033);
        AnonymousClass0fD.A0A(-1672225608, A032);
    }
}
