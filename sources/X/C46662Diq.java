package X;

import android.content.BroadcastReceiver;
import java.util.Map;

/* renamed from: X.Diq  reason: case insensitive filesystem */
public final class C46662Diq extends BroadcastReceiver {
    public final 0lg A00;
    public final G68 A01;
    public final String A02;
    public final Map A03;

    public C46662Diq(0lg r2, G68 g68, String str) {
        this.A03 = new 0yf();
        this.A00 = r2;
        this.A02 = str;
        this.A01 = g68;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d6, code lost:
        r11.A01.DgP(r12, r2, r11.A02);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r12, android.content.Intent r13) {
        /*
            r11 = this;
            r0 = -804451650(0xffffffffd00d0abe, float:-9.4651658E9)
            int r6 = X.AnonymousClass0fD.A01(r0)
            X.AnonymousClass0fQ.A01(r11, r12, r13)
            X.AnonymousClass7TG.A1N(r12, r13)
            java.lang.String r3 = "SmsReceivedBroadcastReceiver"
            java.lang.String r0 = r13.getAction()
            java.lang.String r2 = "android.provider.Telephony.SMS_RECEIVED"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0032
            java.lang.String r1 = r13.getAction()
            java.lang.String r0 = "Registered to wrong action - expected action: %s, received action: %s"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r2, r1)
            X.0qQ.A07(r0)
            X.0wb.A03(r3, r0)
            r0 = 1087811695(0x40d6b06f, float:6.7090373)
        L_0x002e:
            X.AnonymousClass0fD.A0E(r0, r6, r13)
            return
        L_0x0032:
            android.telephony.SmsMessage[] r8 = android.provider.Telephony.Sms.Intents.getMessagesFromIntent(r13)
            if (r8 == 0) goto L_0x009b
            int r7 = r8.length
            r5 = 0
            r4 = 0
        L_0x003b:
            if (r4 >= r7) goto L_0x0077
            r10 = r8[r4]
            java.lang.String r1 = r10.getMessageBody()
            if (r1 == 0) goto L_0x0077
            java.util.regex.Pattern r0 = X.FES.A03
            X.0qQ.A08(r0)
            java.lang.String r2 = X.FES.A00(r1, r0)
            if (r2 != 0) goto L_0x00d6
            java.util.regex.Pattern r0 = X.FES.A01
            X.0qQ.A08(r0)
            java.lang.String r9 = X.FES.A00(r1, r0)
            if (r9 == 0) goto L_0x009f
            java.lang.String r3 = r10.getDisplayOriginatingAddress()
            if (r3 == 0) goto L_0x00d2
            java.util.Map r2 = r11.A03
            java.lang.Object r1 = r2.get(r3)
            java.lang.String r0 = "#ig"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00cf
            X.G68 r1 = r11.A01
            java.lang.String r0 = r11.A02
            r1.DgP(r12, r9, r0)
        L_0x0076:
            r5 = 1
        L_0x0077:
            X.0lg r1 = r11.A00
            X.1Q0 r0 = X.1Q0.A0F
            X.FGI r2 = r0.A02(r1)
            X.EXD r1 = X.EXD.PHONE
            r0 = 0
            X.FBm r2 = r2.A06(r1, r0)
            java.lang.String r0 = "code_found"
            r2.A05(r0, r5)
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "locale"
            r2.A04(r0, r1)
            r2.A02()
        L_0x009b:
            r0 = 296864560(0x11b1cb30, float:2.80509E-28)
            goto L_0x002e
        L_0x009f:
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00d2
            java.lang.String r3 = "#ig"
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x00bd
            java.lang.String r0 = " #ig"
            boolean r0 = X.00p.A0i(r1, r0, r5)
            if (r0 != 0) goto L_0x00bd
            java.lang.String r0 = "。#ig"
            boolean r0 = X.00p.A0i(r1, r0, r5)
            if (r0 == 0) goto L_0x00d2
        L_0x00bd:
            java.lang.String r1 = r10.getDisplayOriginatingAddress()
            if (r1 == 0) goto L_0x00d2
            java.util.Map r0 = r11.A03
            java.lang.String r2 = X.DbT.A11(r1, r0)
            if (r2 != 0) goto L_0x00d6
            r0.put(r1, r3)
            goto L_0x00d2
        L_0x00cf:
            r2.put(r3, r9)
        L_0x00d2:
            int r4 = r4 + 1
            goto L_0x003b
        L_0x00d6:
            X.G68 r1 = r11.A01
            java.lang.String r0 = r11.A02
            r1.DgP(r12, r2, r0)
            goto L_0x0076
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46662Diq.onReceive(android.content.Context, android.content.Intent):void");
    }

    public C46662Diq() {
    }
}
