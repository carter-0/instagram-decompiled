package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: X.3Ci  reason: invalid class name and case insensitive filesystem */
public final class C238553Ci extends 1P0 {
    public final /* synthetic */ AnonymousClass3CK A00;
    public final /* synthetic */ C238523Ce A01;
    public final /* synthetic */ UUID A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public C238553Ci(AnonymousClass3CK r1, C238523Ce r2, UUID uuid, boolean z, boolean z2) {
        this.A00 = r1;
        this.A02 = uuid;
        this.A03 = z;
        this.A01 = r2;
        this.A04 = z2;
    }

    public final void onFail(C268654dm r13) {
        int i;
        String str;
        String str2;
        Throwable th;
        int A032 = AnonymousClass0fD.A03(-477152706);
        Object A002 = r13.A00();
        if (A002 != null) {
            i = ((1XQ) A002).mStatusCode;
            ((C250903mF) A002).A08 = this.A02;
        } else {
            i = 0;
        }
        AnonymousClass3CK r3 = this.A00;
        AnonymousClass3CK.A01(r3, (List) null, i);
        AnonymousClass3CP r4 = r3.A09;
        long currentTimeMillis = System.currentTimeMillis() - r3.A06;
        if (182.A06(0Tu.A05, r3.A0D, 36322280724310052L)) {
            String A003 = AnonymousClass000.A00(1379);
            1XP r5 = (1XP) A002;
            if (r5 != null) {
                str2 = r5.getErrorMessage();
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "n/a";
            }
            String A0R = 002.A0R(A003, str2);
            StringBuilder sb = new StringBuilder();
            sb.append(AnonymousClass000.A00(1376));
            Throwable A012 = r13.A01();
            if (A012 == null || (th = A012.getCause()) == null) {
                th = "n/a";
            }
            sb.append(th);
            str = 002.A0g(A0R, " | ", sb.toString());
        } else {
            str = null;
        }
        r4.A0H.Ch0(str, i, currentTimeMillis, r4.A07);
        r4.A07 = false;
        r3.A07.onFail(r13);
        if (r3.A0K) {
            r3.A09.A03 = AnonymousClass05K.A00;
            r3.A07.onFinish();
        }
        AnonymousClass0fD.A0A(-2033850194, A032);
    }

    public final void onFailInBackground(C268654dm r5) {
        int A032 = AnonymousClass0fD.A03(-1469770298);
        this.A00.A05 = System.currentTimeMillis();
        AnonymousClass0fD.A0A(1304807265, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(839069815);
        AnonymousClass3CK r2 = this.A00;
        System.currentTimeMillis();
        if (!r2.A0K) {
            r2.A09.A03 = AnonymousClass05K.A00;
            r2.A07.onFinish();
        }
        AnonymousClass0fD.A0A(-1337743265, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(1044020279);
        AnonymousClass3CK r0 = this.A00;
        long currentTimeMillis = System.currentTimeMillis();
        r0.A06 = currentTimeMillis;
        r0.A0E.A0M = Long.valueOf(currentTimeMillis);
        AnonymousClass0fD.A0A(201722647, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0048, code lost:
        if (r2.A0I.getSessionId().equals(r15.A05) != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = -721501703(0xffffffffd4fec1f9, float:-8.7534081E12)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.3mF r15 = (X.C250903mF) r15
            r0 = -842395646(0xffffffffcdca1002, float:-4.2375584E8)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.util.UUID r0 = r14.A02
            r15.A08 = r0
            boolean r6 = r14.A03
            if (r6 != 0) goto L_0x0145
            X.3Ce r0 = r14.A01
            r15.A00 = r0
            X.3CK r2 = r14.A00
            X.3CP r1 = r2.A09
            boolean r0 = r14.A04
            java.lang.Integer r0 = r1.A02(r0)
            r0.getClass()
            r15.A02 = r0
        L_0x002b:
            java.lang.Integer r0 = r15.A02
            r2.A0A = r0
            X.3mF r0 = r2.A08
            if (r0 != 0) goto L_0x0035
            r2.A08 = r15
        L_0x0035:
            boolean r7 = r14.A04
            java.lang.String r5 = "ReelAdsAndNetegoController#onSuccess"
            if (r6 != 0) goto L_0x004a
            X.3kK r0 = r2.A0I
            java.lang.String r1 = r0.getSessionId()
            java.lang.String r0 = r15.A05
            boolean r0 = r1.equals(r0)
            r1 = 0
            if (r0 == 0) goto L_0x004b
        L_0x004a:
            r1 = 1
        L_0x004b:
            boolean r0 = r2.A0J
            if (r0 != 0) goto L_0x00d6
            if (r1 != 0) goto L_0x00d6
            X.3CP r6 = r2.A09
            int r10 = r15.mStatusCode
            long r11 = java.lang.System.currentTimeMillis()
            long r0 = r2.A06
            long r11 = r11 - r0
            X.2vI r7 = r6.A0H
            X.0sn r9 = X.0sn.A00
            boolean r13 = r6.A07
            X.4LN r8 = X.AnonymousClass4LN.A0D
            r7.Ch2(r8, r9, r10, r11, r13)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "mViewerSource: "
            r1.append(r0)
            X.3BQ r0 = r2.A0G
            java.lang.String r0 = r0.A00
            r1.append(r0)
            java.lang.String r0 = " || mViewerSessionId: "
            r1.append(r0)
            X.3kK r0 = r2.A0I
            java.lang.String r0 = r0.getSessionId()
            r1.append(r0)
            java.lang.String r0 = " || Response viewer session id: "
            r1.append(r0)
            java.lang.String r0 = r15.A05
            r1.append(r0)
            java.lang.String r0 = "|| mNextAdAndNetegoRequestIndex: "
            r1.append(r0)
            int r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = "|| mAdsPoolThreshold: "
            r1.append(r0)
            int r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = "|| mEarliestRequestPosition: "
            r1.append(r0)
            int r0 = r2.A01
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.0wb.A03(r5, r0)
        L_0x00b5:
            X.1P0 r0 = r2.A07
            r0.onSuccess(r15)
            boolean r0 = r2.A0K
            if (r0 == 0) goto L_0x00c9
            X.3CP r1 = r2.A09
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A03 = r0
            X.1P0 r0 = r2.A07
            r0.onFinish()
        L_0x00c9:
            r0 = -176929902(0xfffffffff5744392, float:-3.0964134E32)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1123716934(0x42fa8f46, float:125.27983)
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x00d6:
            int r0 = r2.A02
            r2.A03 = r0
            if (r6 == 0) goto L_0x00e0
            boolean r0 = r2.A0L
            if (r0 != 0) goto L_0x0120
        L_0x00e0:
            com.instagram.common.session.UserSession r8 = r2.A0D
            X.0Tu r5 = X.0Tu.A05
            r0 = 36310542579073151(0x81003f0007007f, double:3.026271565600574E-306)
            boolean r0 = X.182.A06(r5, r8, r0)
            if (r0 != 0) goto L_0x0120
            X.4dB r5 = X.AnonymousClass3CK.A00(r15, r2, r6, r7)
            int r1 = r2.A04
            java.lang.Integer r0 = r15.A02(r1)
            int r0 = r0.intValue()
            r2.A02 = r0
            java.lang.Integer r0 = r15.A01(r1)
            int r0 = r0.intValue()
            r2.A01 = r0
            java.lang.Integer r0 = r15.A00()
            int r0 = r0.intValue()
            r2.A00 = r0
        L_0x0113:
            com.instagram.common.session.UserSession r6 = r2.A0D
            X.2mN r1 = r2.A0H
            int r0 = r2.A01
            int r0 = X.C291225go.A00(r6, r1, r5, r0)
            r2.A01 = r0
            goto L_0x00b5
        L_0x0120:
            int r1 = r2.A04
            java.lang.Integer r0 = r15.A02(r1)
            int r0 = r0.intValue()
            r2.A02 = r0
            java.lang.Integer r0 = r15.A01(r1)
            int r0 = r0.intValue()
            r2.A01 = r0
            java.lang.Integer r0 = r15.A00()
            int r0 = r0.intValue()
            r2.A00 = r0
            X.4dB r5 = X.AnonymousClass3CK.A00(r15, r2, r6, r7)
            goto L_0x0113
        L_0x0145:
            X.3CK r2 = r14.A00
            X.3kK r0 = r2.A0I
            java.lang.String r5 = r0.getSessionId()
            int r1 = r2.A04
            int r0 = r2.A0B
            r15.A04(r5, r1, r0)
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C238553Ci.onSuccess(java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        Collection<AnonymousClass3HX> emptyList;
        int A032 = AnonymousClass0fD.A03(-1130207672);
        C250903mF r11 = (C250903mF) obj;
        int A033 = AnonymousClass0fD.A03(-1311160572);
        AnonymousClass3CK r6 = this.A00;
        r6.A05 = System.currentTimeMillis();
        UserSession userSession = r6.A0D;
        if (r11.A03(userSession) != null) {
            emptyList = r11.A03(userSession).values();
        } else {
            emptyList = Collections.emptyList();
        }
        for (AnonymousClass3HX A05 : emptyList) {
            for (1Xj r7 : AnonymousClass3P9.A05(A05)) {
                Context context = r6.A0C;
                ExtendedImageUrl A1n = r7.A1n(context);
                C297715sD.A00(context, userSession, r7, "");
                if (A1n != null) {
                    1OO A0J = 1NK.A00().A0J(A1n, r6.A0F.getModuleName());
                    A0J.A0I = true;
                    A0J.A01();
                }
                if (r7.CeS() && (!r7.A5D() || (r7 = r7.A1c(r7.A0w())) != null)) {
                    r7.CEL();
                    C255593uO.A00(userSession).A01(new C256203vO(r7.CEL(), r6.A0F.getModuleName()));
                }
            }
        }
        AnonymousClass0fD.A0A(627467388, A033);
        AnonymousClass0fD.A0A(1946812885, A032);
    }
}
