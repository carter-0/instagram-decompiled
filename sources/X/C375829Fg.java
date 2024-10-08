package X;

import com.instagram.common.notifications.push.intf.PushChannelType;
import java.util.Date;

/* renamed from: X.9Fg  reason: invalid class name and case insensitive filesystem */
public final class C375829Fg extends 1P0 {
    public final PushChannelType A00;
    public final AnonymousClass9FS A01;
    public final AnonymousClass9FY A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public C375829Fg(PushChannelType pushChannelType, 0lg r3, AnonymousClass9FS r4, AnonymousClass9FY r5, String str, String str2, boolean z) {
        this.A03 = str;
        this.A00 = pushChannelType;
        this.A06 = z;
        this.A01 = r4;
        this.A05 = r3.getToken();
        this.A02 = r5;
        this.A04 = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        if (r13 != null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r13) {
        /*
            r12 = this;
            r0 = -1631467676(0xffffffff9ec1c764, float:-2.0517136E-20)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.9FY r1 = r12.A02
            java.lang.String r10 = r12.A04
            r0 = 1
            X.0qQ.A0B(r10, r0)
            r6 = 0
            if (r13 == 0) goto L_0x0047
            java.lang.Object r0 = r13.A00()
            X.1XT r0 = (X.AnonymousClass1XT) r0
            if (r0 == 0) goto L_0x0047
            java.lang.String r5 = r0.getErrorMessage()
        L_0x001e:
            java.lang.Throwable r0 = r13.A01()
            if (r0 == 0) goto L_0x0028
            java.lang.String r6 = r0.toString()
        L_0x0028:
            java.lang.String r4 = "registration_result_received"
            r11 = 0
            java.lang.String r7 = r1.A01
            java.lang.String r8 = r1.A03
            java.lang.String r9 = r1.A02
            X.0wc r3 = r1.A00
            X.C3733695b.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.9FS r0 = r12.A01
            if (r0 == 0) goto L_0x0040
            X.0Jv r1 = r0.A01
            r0 = 0
            r1.AId(r0)
        L_0x0040:
            r0 = -628076546(0xffffffffda904ffe, float:-2.03101745E16)
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x0047:
            r5 = r6
            if (r13 == 0) goto L_0x0028
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C375829Fg.onFail(X.4dm):void");
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(928600001);
        int A033 = AnonymousClass0fD.A03(-2066554949);
        PushChannelType pushChannelType = this.A00;
        AnonymousClass9FY r2 = this.A02;
        String str = this.A04;
        0qQ.A0B(str, 0);
        C3733695b.A00(r2.A00, "registration_result_received", (String) null, (String) null, r2.A01, r2.A03, r2.A02, str, true);
        if (this.A06) {
            AnonymousClass3FH.A01();
            0xm A002 = AnonymousClass0xl.A00(C61170le.A00);
            long time = new Date().getTime();
            String str2 = pushChannelType.A01;
            0qQ.A0B(str2, 1);
            0xY AR4 = A002.A00.AR4();
            AR4.E5c(002.A0R("push_reg_date", str2), time);
            AR4.apply();
        }
        String str3 = pushChannelType.A01;
        long time2 = new Date().getTime();
        C62880wX r11 = C61170le.A00;
        0xY AR42 = AnonymousClass0xl.A00(r11).A00.AR4();
        AR42.E5c("last_push_token_successful_refresh", time2);
        AR42.apply();
        0xm A003 = AnonymousClass0xl.A00(r11);
        String str4 = this.A03;
        0qQ.A0B(str4, 0);
        0qQ.A0B(str3, 1);
        0xY AR43 = A003.A00.AR4();
        AR43.E5g(002.A0R("push_token_", str3), str4);
        AR43.apply();
        0xY AR44 = AnonymousClass0xl.A00(r11).A00.AR4();
        AR44.E5c(002.A0R("last_push_token_successful_refresh", str3), time2);
        AR44.apply();
        AnonymousClass9FS r0 = this.A01;
        if (r0 != null) {
            r0.A01.AId((Object) null);
        }
        1xC.A01.A00(new AnonymousClass3H0(this.A05));
        AnonymousClass0fD.A0A(-2146666383, A033);
        AnonymousClass0fD.A0A(1067706687, A032);
    }
}
