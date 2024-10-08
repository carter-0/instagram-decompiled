package androidx.paging;

import X.0sP;
import X.AnonymousClass0r6;
import X.AnonymousClass4D7;
import X.C62958KpA;
import X.C64109LNp;
import X.MHP;

public final class PageFetcher {
    public final C64109LNp A00 = new C64109LNp((Object) null);
    public final C64109LNp A01 = new C64109LNp((Object) null);
    public final PagingConfig A02;
    public final AnonymousClass0r6 A03 = C62958KpA.A00(new MHP((Object) this, (Object) null, (AnonymousClass4D7) null, 27, 42));
    public final 0sP A04;

    public PageFetcher(PagingConfig pagingConfig, 0sP r8) {
        this.A04 = r8;
        this.A02 = pagingConfig;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(androidx.paging.PageFetcher r6, androidx.paging.PagingSource r7, X.AnonymousClass4D7 r8) {
        /*
            r3 = 7
            boolean r0 = X.C66146MDy.A02(r3, r8)
            if (r0 == 0) goto L_0x005c
            r4 = r8
            X.MDy r4 = (X.C66146MDy) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005c
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r3 = r4.A03
            X.1Hj r1 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x004d
            if (r0 != r2) goto L_0x00a0
            java.lang.Object r7 = r4.A02
            androidx.paging.PagingSource r7 = (androidx.paging.PagingSource) r7
            java.lang.Object r6 = r4.A01
            androidx.paging.PageFetcher r6 = (androidx.paging.PageFetcher) r6
            X.0eS.A00(r3)
        L_0x002b:
            androidx.paging.PagingSource r3 = (androidx.paging.PagingSource) r3
            boolean r0 = r3 instanceof X.C60348Jjt
            if (r0 == 0) goto L_0x0064
            r5 = r3
            X.Jjt r5 = (X.C60348Jjt) r5
            androidx.paging.PagingConfig r0 = r6.A02
            int r1 = r0.A01
            int r4 = r5.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r0) goto L_0x0062
            if (r1 == r4) goto L_0x0062
            java.lang.String r1 = "Page size is already set to "
            r0 = 46
            java.lang.String r0 = X.002.A0I(r1, r0, r4)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x004d:
            X.0eS.A00(r3)
            X.0sP r0 = r6.A04
            X.C66146MDy.A00(r6, r7, r4, r2)
            java.lang.Object r3 = r0.invoke(r4)
            if (r3 != r1) goto L_0x002b
            return r1
        L_0x005c:
            X.MDy r4 = new X.MDy
            r4.<init>(r6, r8, r3)
            goto L_0x0015
        L_0x0062:
            r5.A00 = r1
        L_0x0064:
            if (r3 == r7) goto L_0x0099
            X.MIW r1 = new X.MIW
            r1.<init>(r6, r2)
            X.LFy r0 = r3.A00
            r0.A00(r1)
            if (r7 == 0) goto L_0x0080
            r0 = 2
            X.MIW r1 = new X.MIW
            r1.<init>(r6, r0)
            X.LFy r0 = r7.A00
            r0.A01(r1)
            r7.A03()
        L_0x0080:
            X.MPb r0 = X.C62914KoS.A00
            if (r0 == 0) goto L_0x0098
            r0 = 3
            boolean r0 = X.JTO.A1b(r0)
            if (r0 != r2) goto L_0x0098
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Generated new PagingSource "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r3, r0, r1)
            X.0qQ.A0B(r0, r2)
        L_0x0098:
            return r3
        L_0x0099:
            java.lang.String r0 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00a0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher.A00(androidx.paging.PageFetcher, androidx.paging.PagingSource, X.4D7):java.lang.Object");
    }
}
