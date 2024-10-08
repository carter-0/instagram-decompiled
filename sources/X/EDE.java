package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class EDE extends 1P0 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ 0hq A02;
    public final /* synthetic */ AnonymousClass0iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ User A05;
    public final /* synthetic */ Runnable A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ boolean A0E;

    public EDE(Activity activity, View view, 0hq r3, AnonymousClass0iw r4, UserSession userSession, User user, Runnable runnable, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        this.A0D = str;
        this.A00 = activity;
        this.A01 = view;
        this.A0C = str2;
        this.A0B = str3;
        this.A09 = str4;
        this.A0E = z;
        this.A07 = str5;
        this.A05 = user;
        this.A08 = str6;
        this.A03 = r4;
        this.A04 = userSession;
        this.A0A = str7;
        this.A06 = runnable;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a6, code lost:
        r0 = r3.equals(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00aa, code lost:
        if (r0 == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ac, code lost:
        r14 = r7.A0B;
        r12 = r7.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b0, code lost:
        if (r3 == "system_share_sheet") goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b2, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b3, code lost:
        r11 = r7.A0E;
        r15 = r7.A00;
        r10 = r7.A07;
        r9 = r7.A05;
        r8 = r7.A08;
        r1 = r7.A03;
        r23 = r10;
        r22 = r4;
        r21 = r12;
        r20 = r14;
        r19 = r9;
        r18 = r7.A04;
        r17 = r1;
        X.C46395DeI.A02(r15, r16, r17, r18, r19, r20, r21, r22, r23, r8, r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0028, code lost:
        r9 = r7.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0039, code lost:
        if (X.AnonymousClass7TF.A0R(X.0Tu.A05, r9, 36323942876589693L).booleanValue() != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x003b, code lost:
        X.C22031Xty.A0I(r7.A03, r9, r7.A0A, r7.A08, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0048, code lost:
        X.C46395DeI.A0V(r7.A03, r9, r7.A0A, r7.A08, r3, r7.A05.getId(), r4);
        r0 = r7.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x005c, code lost:
        if (r3 == "copy_link") goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005e, code lost:
        r0.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0061, code lost:
        X.AnonymousClass0fD.A0A(1195965765, r5);
        X.AnonymousClass0fD.A0A(1088842919, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r28) {
        /*
            r27 = this;
            r1 = r28
            r0 = 1787228014(0x6a86ef6e, float:8.156337E25)
            int r6 = X.AnonymousClass0fD.A03(r0)
            X.DvH r1 = (X.DvH) r1
            r0 = 1377137919(0x521574ff, float:1.60478249E11)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.String r4 = r1.A00
            android.os.Bundle r16 = X.DbX.A0D(r4)
            r7 = r27
            java.lang.String r3 = r7.A0D
            int r0 = r3.hashCode()
            java.lang.String r2 = "copy_link"
            java.lang.String r1 = "system_share_sheet"
            r13 = 1
            switch(r0) {
                case -1436108013: goto L_0x00a4;
                case -916346253: goto L_0x00a1;
                case -266143003: goto L_0x0091;
                case 284397090: goto L_0x008e;
                case 389639919: goto L_0x0089;
                case 497130182: goto L_0x0086;
                case 1505434244: goto L_0x0074;
                case 1539093419: goto L_0x0071;
                case 1934780818: goto L_0x006e;
                default: goto L_0x0028;
            }
        L_0x0028:
            com.instagram.common.session.UserSession r9 = r7.A04
            X.0Tu r8 = X.0Tu.A05
            r0 = 36323942876589693(0x810c6f00002e7d, double:3.0347459677087025E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r8, r9, r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0048
            X.0iw r8 = r7.A03
            java.lang.String r1 = r7.A0A
            java.lang.String r0 = r7.A08
            r10 = r1
            r11 = r0
            r12 = r3
            r13 = r4
            X.C22031Xty.A0I(r8, r9, r10, r11, r12, r13)
        L_0x0048:
            java.lang.String r10 = r7.A0A
            java.lang.String r1 = r7.A08
            com.instagram.user.model.User r0 = r7.A05
            java.lang.String r13 = r0.getId()
            X.0iw r8 = r7.A03
            r11 = r1
            r12 = r3
            r14 = r4
            X.C46395DeI.A0V(r8, r9, r10, r11, r12, r13, r14)
            java.lang.Runnable r0 = r7.A06
            if (r3 == r2) goto L_0x0061
            r0.run()
        L_0x0061:
            r0 = 1195965765(0x4748fd45, float:51453.27)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1088842919(0x40e66ca7, float:7.200763)
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        L_0x006e:
            java.lang.String r0 = "whatsapp"
            goto L_0x00a6
        L_0x0071:
            java.lang.String r0 = "barcelona"
            goto L_0x00a6
        L_0x0074:
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L_0x0028
            android.app.Activity r8 = r7.A00
            X.0nC.A00(r8, r4)
            android.view.View r1 = r7.A01
            r0 = 0
            X.C49118Eph.A00(r8, r1, r0, r13)
            goto L_0x0028
        L_0x0086:
            java.lang.String r0 = "facebook"
            goto L_0x00a6
        L_0x0089:
            boolean r0 = r3.equals(r1)
            goto L_0x00aa
        L_0x008e:
            java.lang.String r0 = "snapchat"
            goto L_0x00a6
        L_0x0091:
            java.lang.String r0 = "user_sms"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0028
            java.lang.String r1 = r7.A0C
            android.app.Activity r0 = r7.A00
            X.C49899FCc.A02(r0, r1, r4)
            goto L_0x0028
        L_0x00a1:
            java.lang.String r0 = "twitter"
            goto L_0x00a6
        L_0x00a4:
            java.lang.String r0 = "messenger"
        L_0x00a6:
            boolean r0 = r3.equals(r0)
        L_0x00aa:
            if (r0 == 0) goto L_0x0028
            java.lang.String r14 = r7.A0B
            java.lang.String r12 = r7.A09
            if (r3 == r1) goto L_0x00b3
            r13 = 0
        L_0x00b3:
            boolean r11 = r7.A0E
            android.app.Activity r15 = r7.A00
            java.lang.String r10 = r7.A07
            com.instagram.user.model.User r9 = r7.A05
            java.lang.String r8 = r7.A08
            X.0iw r1 = r7.A03
            com.instagram.common.session.UserSession r0 = r7.A04
            r26 = r11
            r24 = r8
            r25 = r13
            r23 = r10
            r22 = r4
            r21 = r12
            r20 = r14
            r19 = r9
            r18 = r0
            r17 = r1
            X.C46395DeI.A02(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EDE.onSuccess(java.lang.Object):void");
    }

    public final void onFail(C268654dm r11) {
        int A032 = AnonymousClass0fD.A03(-1139693721);
        EDE.super.onFail(r11);
        UserSession userSession = this.A04;
        AnonymousClass0iw r3 = this.A03;
        String str = this.A0A;
        String str2 = this.A08;
        String str3 = this.A0D;
        C22031Xty.A0H(r3, userSession, str, str2, str3, r11.A01());
        C46395DeI.A0V(r3, userSession, str, str2, str3, this.A05.getId(), (String) null);
        Runnable runnable = this.A06;
        if (str3 != "copy_link") {
            runnable.run();
        }
        AnonymousClass0fD.A0A(1528930948, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-1562215266);
        if (this.A0D != "copy_link") {
            11Z.A03(new C51311Fs4(this));
        }
        AnonymousClass0fD.A0A(519021110, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(1276691802);
        if (this.A0D != "copy_link") {
            11Z.A03(new C51310Fs3(this));
        }
        AnonymousClass0fD.A0A(1474796297, A032);
    }
}
