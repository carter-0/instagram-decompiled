package X;

import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.rtc.activity.RtcCallIntentHandlerActivity;

/* renamed from: X.OQu  reason: case insensitive filesystem */
public abstract /* synthetic */ class C70902OQu {
    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.rtc.activity.RtcCallIntentHandlerActivity, android.content.Context] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006c, code lost:
        if (((android.telephony.TelephonyManager) r0).getCallState() == 2) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0038, code lost:
        if (((android.telecom.TelecomManager) r1).isInCall() != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        r2 = X.C73925Pm5.A01(r5, 4);
        r1 = X.DbS.A0Y(r3);
        r1.A09(2131976549);
        r1.A08(2131976548);
        r1.A06();
        r1.A04();
        X.C71250OgH.A00(r1, r2, 6);
        X.DbT.A1V(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C74496Pvq r5) {
        /*
            com.instagram.rtc.activity.RtcCallIntentHandlerActivity r3 = r5.Bos()
            r0 = 130(0x82, float:1.82E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.1DL.A07(r3, r0)
            if (r0 == 0) goto L_0x006f
            boolean r0 = X.C69733NrI.A00()
            if (r0 == 0) goto L_0x005d
            com.instagram.common.session.UserSession r4 = r5.CCy()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326322288670414(0x810e99000336ce, double:3.036250717489674E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = "telecom"
            java.lang.Object r1 = r3.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.telecom.TelecomManager"
            X.0qQ.A0C(r1, r0)
            android.telecom.TelecomManager r1 = (android.telecom.TelecomManager) r1
            boolean r0 = r1.isInCall()
            if (r0 == 0) goto L_0x006f
        L_0x003a:
            r0 = 4
            X.Pm5 r2 = X.C73925Pm5.A01(r5, r0)
            X.8ab r1 = X.DbS.A0Y(r3)
            r0 = 2131976549(0x7f136165, float:1.9590222E38)
            r1.A09(r0)
            r0 = 2131976548(0x7f136164, float:1.959022E38)
            r1.A08(r0)
            r1.A06()
            r1.A04()
            r0 = 6
            X.C71250OgH.A00(r1, r2, r0)
            X.DbT.A1V(r1)
            return
        L_0x005d:
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r3.getSystemService(r0)
            if (r0 == 0) goto L_0x006f
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            int r1 = r0.getCallState()
            r0 = 2
            if (r1 != r0) goto L_0x006f
            goto L_0x003a
        L_0x006f:
            r5.Exw()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70902OQu.A00(X.Pvq):void");
    }

    public static void A01(C74496Pvq pvq) {
        if (pvq.Ae4()) {
            RtcCallIntentHandlerActivity Bos = pvq.Bos();
            Bos.A02.postDelayed(new C73253PZX(pvq, Bos), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        }
    }
}
