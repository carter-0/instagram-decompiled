package X;

import java.util.List;

/* renamed from: X.FTm  reason: case insensitive filesystem */
public final class C50206FTm implements AnonymousClass9FE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ FRY A02;
    public final /* synthetic */ List A03;

    public final void onError(Throwable th) {
    }

    public C50206FTm(AnonymousClass0iw r1, FRY fry, List list, int i) {
        this.A02 = fry;
        this.A01 = r1;
        this.A00 = i;
        this.A03 = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0048, code lost:
        r5.A06.setItems(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        r1.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        if (r2 == null) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r1.A2K() != false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r4 = 2131956537;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r1.A2K() != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        r4 = 2131955123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        r3 = X.C50989Fmc.A00(X.DbS.A08(r5), new X.FPG(54, (java.lang.Object) r6.A01, (java.lang.Object) r5), r4);
        r3.A09 = X.C324536zU.A00(r5.A02);
        r2 = r6.A00;
        r1 = r6.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0043, code lost:
        if (r2 >= r1.size()) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
        r1.add(r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r7) {
        /*
            r6 = this;
            X.Dfh r7 = (X.C46478Dfh) r7
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.FRY r5 = r6.A02
            java.lang.String r0 = X.FRY.A09
            X.9Gd r2 = r7.A00
            if (r2 != 0) goto L_0x0052
            com.instagram.user.model.User r1 = r5.A07
            boolean r0 = r1.A2K()
            if (r0 == 0) goto L_0x0052
        L_0x0016:
            boolean r0 = r1.A2K()
            r4 = 2131956537(0x7f131339, float:1.9549633E38)
            if (r0 != 0) goto L_0x0022
        L_0x001f:
            r4 = 2131955123(0x7f130db3, float:1.9546765E38)
        L_0x0022:
            X.0iw r3 = r6.A01
            android.content.Context r2 = X.DbS.A08(r5)
            r1 = 54
            X.FPG r0 = new X.FPG
            r0.<init>((int) r1, (java.lang.Object) r3, (java.lang.Object) r5)
            X.Fmc r3 = X.C50989Fmc.A00(r2, r0, r4)
            com.instagram.common.session.UserSession r0 = r5.A02
            boolean r0 = X.C324536zU.A00(r0)
            r3.A09 = r0
            int r2 = r6.A00
            java.util.List r1 = r6.A03
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x004e
            r1.add(r2, r3)
        L_0x0048:
            X.ESS r0 = r5.A06
            r0.setItems(r1)
        L_0x004d:
            return
        L_0x004e:
            r1.add(r3)
            goto L_0x0048
        L_0x0052:
            com.instagram.user.model.User r1 = r5.A07
            boolean r0 = r1.A1N()
            if (r0 == 0) goto L_0x004d
            if (r2 != 0) goto L_0x001f
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50206FTm.onSuccess(java.lang.Object):void");
    }
}
