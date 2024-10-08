package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper;
import com.instagram.sup.voltron.SUPMediaStreamControllerDownloader;

/* renamed from: X.WvU  reason: case insensitive filesystem */
public final class C20591WvU extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public final int A08 = 1;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;
    public final String A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20591WvU(Context context, UserSession userSession, X58 x58, SUPMediaStreamControllerDownloader sUPMediaStreamControllerDownloader, String str, AnonymousClass4D7 r7) {
        super(2, r7);
        this.A0A = sUPMediaStreamControllerDownloader;
        this.A0B = context;
        this.A01 = userSession;
        this.A09 = x58;
        this.A0C = str;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.4D7, X.WvU] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.4D7, X.WvU] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        AnonymousClass4D7 r6 = r9;
        if (this.A08 != 0) {
            return new C20591WvU((Context) this.A0B, (UserSession) this.A01, (X58) this.A09, (SUPMediaStreamControllerDownloader) this.A0A, this.A0C, r6);
        }
        String str = this.A0C;
        return new C20591WvU((Context) this.A09, (UserSession) this.A0B, (IGQuickPromotionFetcherHelper) this.A0A, str, r9);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.4D7, X.WvU] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0068, code lost:
        if (X.1RH.A00().A07(r1) != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cf, code lost:
        if (com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper.A00(r8, r9, r10, (com.instagram.quickpromotion.intf.QuickPromotionSlot) r3.next(), r12, r13) == r1) goto L_0x00d1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r2 = r13.A08
            X.1Hj r1 = X.1Hj.A02
            int r0 = r13.A00
            if (r2 == 0) goto L_0x0087
            r5 = 0
            r9 = 1
            if (r0 == 0) goto L_0x0026
            java.lang.Object r2 = r13.A07
            java.lang.Object r6 = r13.A06
            X.X58 r6 = (X.X58) r6
            java.lang.Object r3 = r13.A05
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r8 = r13.A04
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r7 = r13.A03
            com.instagram.sup.voltron.SUPMediaStreamControllerDownloader r7 = (com.instagram.sup.voltron.SUPMediaStreamControllerDownloader) r7
            java.lang.Object r4 = r13.A02
            X.136 r4 = (X.136) r4
            X.0eS.A00(r14)
            goto L_0x0053
        L_0x0026:
            X.0eS.A00(r14)
            java.lang.Object r0 = r13.A0A
            com.instagram.sup.voltron.SUPMediaStreamControllerDownloader r0 = (com.instagram.sup.voltron.SUPMediaStreamControllerDownloader) r0
            X.136 r4 = r0.A08
            r7 = r0
            java.lang.Object r8 = r13.A0B
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r3 = r13.A01
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r6 = r13.A09
            X.X58 r6 = (X.X58) r6
            java.lang.String r2 = r13.A0C
            r13.A02 = r4
            r13.A03 = r0
            r13.A04 = r8
            r13.A05 = r3
            r13.A06 = r6
            r13.A07 = r2
            r13.A00 = r9
            java.lang.Object r0 = X.136.A00(r13, r4)
            if (r0 != r1) goto L_0x0053
            return r1
        L_0x0053:
            X.1RH r0 = X.1RH.A00()     // Catch:{ all -> 0x0082 }
            X.1US r1 = X.1US.A1G     // Catch:{ all -> 0x0082 }
            boolean r0 = r0.A06(r1)     // Catch:{ all -> 0x0082 }
            if (r0 != 0) goto L_0x006a
            X.1RH r0 = X.1RH.A00()     // Catch:{ all -> 0x0082 }
            boolean r1 = r0.A07(r1)     // Catch:{ all -> 0x0082 }
            r0 = 0
            if (r1 == 0) goto L_0x006b
        L_0x006a:
            r0 = 1
        L_0x006b:
            if (r0 == 0) goto L_0x0071
            com.instagram.sup.voltron.SUPMediaStreamControllerDownloader.A01(r8, r3, r6, r7)     // Catch:{ all -> 0x0082 }
            goto L_0x007c
        L_0x0071:
            X.0eM r0 = r7.A06     // Catch:{ all -> 0x0082 }
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)     // Catch:{ all -> 0x0082 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0082 }
            r0.put(r2, r6)     // Catch:{ all -> 0x0082 }
        L_0x007c:
            X.0gF r1 = X.C60340gF.A00     // Catch:{ all -> 0x0082 }
            r4.A05(r5)
            return r1
        L_0x0082:
            r0 = move-exception
            r4.A05(r5)
            throw r0
        L_0x0087:
            r7 = 1
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r4 = r13.A07
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r3 = r13.A06
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r2 = r13.A05
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r9 = r13.A04
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            java.lang.Object r8 = r13.A03
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r10 = r13.A02
            com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper r10 = (com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper) r10
            java.lang.Object r12 = r13.A01
            java.util.Map r12 = (java.util.Map) r12
            X.0eS.A00(r14)
        L_0x00a9:
            X.0gF r0 = X.C60340gF.A00
            r4.add(r0)
        L_0x00ae:
            r4 = r2
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r11 = r3.next()
            com.instagram.quickpromotion.intf.QuickPromotionSlot r11 = (com.instagram.quickpromotion.intf.QuickPromotionSlot) r11
            r13.A01 = r12
            r13.A02 = r10
            r13.A03 = r8
            r13.A04 = r9
            r13.A05 = r2
            r13.A06 = r3
            r13.A07 = r2
            r13.A00 = r7
            java.lang.Object r0 = com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper.A00(r8, r9, r10, r11, r12, r13)
            if (r0 != r1) goto L_0x00a9
        L_0x00d1:
            return r1
        L_0x00d2:
            java.lang.String r0 = r13.A0C
            java.lang.Object r1 = r12.get(r0)
            if (r1 != 0) goto L_0x00d1
            X.0sn r1 = X.0sn.A00
            return r1
        L_0x00dd:
            X.0eS.A00(r14)
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            com.instagram.quickpromotion.intf.QuickPromotionSlot[] r6 = com.instagram.quickpromotion.intf.QuickPromotionSlot.values()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r4 = r6.length
            r3 = 0
        L_0x00f0:
            if (r3 >= r4) goto L_0x00fe
            r2 = r6[r3]
            com.instagram.quickpromotion.intf.QuickPromotionSlot r0 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A1A
            if (r0 == r2) goto L_0x00fb
            r5.add(r2)
        L_0x00fb:
            int r3 = r3 + 1
            goto L_0x00f0
        L_0x00fe:
            java.lang.Object r10 = r13.A0A
            com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper r10 = (com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper) r10
            java.lang.Object r8 = r13.A09
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r9 = r13.A0B
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r5)
            java.util.Iterator r3 = r5.iterator()
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20591WvU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C20591WvU) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20591WvU(Context context, UserSession userSession, IGQuickPromotionFetcherHelper iGQuickPromotionFetcherHelper, String str, AnonymousClass4D7 r6) {
        super(2, r6);
        this.A0C = str;
        this.A0A = iGQuickPromotionFetcherHelper;
        this.A09 = context;
        this.A0B = userSession;
    }
}
