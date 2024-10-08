package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.concurrent.TimeUnit;

public final class OWL {
    public static final OWL A00 = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C254703su A01(X.OIH r12, com.instagram.direct.armadilloexpress.memtransporteventpayload.TransportEvent.Event.DeviceChange r13) {
        /*
            r11 = this;
            r10 = 0
            r3 = 1
            X.3su r2 = new X.3su
            r2.<init>()
            r11.A02(r12, r2)
            X.Nmv r0 = r13.A0L()
            int r1 = r0.ordinal()
            if (r1 == r3) goto L_0x0024
            r0 = 3
            if (r1 == r0) goto L_0x0027
            X.2FW r1 = X.2FW.A1M
            java.lang.String r0 = "need_update"
            X.57z r3 = new X.57z
            r3.<init>(r0)
        L_0x0020:
            r2.A17(r1, r3)
            return r2
        L_0x0024:
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            goto L_0x0029
        L_0x0027:
            java.lang.Integer r0 = X.AnonymousClass05K.A02
        L_0x0029:
            int r0 = r0.intValue()
            int r0 = 9 - r0
            if (r0 == 0) goto L_0x0048
            java.lang.String r1 = "security_alert_key_change"
        L_0x0033:
            r0 = 21
            X.BBV r4 = new X.BBV
            r4.<init>(r1, r0)
            X.2FW r1 = X.2FW.A0G
            r6 = 0
            java.lang.String r5 = ""
            X.46n r3 = new X.46n
            r7 = r6
            r8 = r6
            r9 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0020
        L_0x0048:
            java.lang.String r1 = "security_alert_new_login"
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OWL.A01(X.OIH, com.instagram.direct.armadilloexpress.memtransporteventpayload.TransportEvent$Event$DeviceChange):X.3su");
    }

    public final void A02(OIH oih, C254703su r10) {
        String str = oih.A0B;
        r10.A16(C66581MXm.A0e(str));
        r10.A15(C66580MXl.A0g(str));
        r10.A1C(oih.A05);
        r10.A1E(oih.A06);
        long j = oih.A01;
        r10.A1A(Long.valueOf(j));
        r10.A1D(oih.A0A);
        boolean z = oih.A0C;
        if (z != r10.A2F) {
            r10.A2C = true;
            r10.A2F = z;
        }
        r10.A1L(true);
        r10.A0w(new N4L(oih.A03, oih.A0D));
        Boolean bool = r10.A19;
        if (!(bool == null || false == bool.booleanValue())) {
            r10.A19 = false;
            r10.A2C = true;
        }
        Integer num = oih.A04;
        Integer num2 = r10.A1F;
        if (num2 != num) {
            r10.A2C = true;
            if (num2 == AnonymousClass05K.A00 || num == AnonymousClass05K.A0N) {
                r10.A1F = num;
            } else {
                r10.A1m(num);
            }
        }
        C70621ODs oDs = oih.A02;
        long seconds = TimeUnit.MICROSECONDS.toSeconds(j);
        if (oDs != null) {
            if (oDs.A00 == C69405Nkj.DISAPPEARING_MESSAGE) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Long l = oDs.A01;
                if (l != null) {
                    long millis = timeUnit.toMillis(l.longValue());
                    Long valueOf = Long.valueOf(millis);
                    synchronized (r10) {
                        r10.A1K = valueOf;
                    }
                    r10.A1B(Long.valueOf(millis + timeUnit.toMillis(seconds)));
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            boolean A1W = AnonymousClass7TF.A1W(oDs.A00, C69405Nkj.SHH_MODE);
            if (r10.A2P != A1W) {
                r10.A2C = true;
                r10.A2P = A1W;
            }
        }
        boolean z2 = oih.A0E;
        if (z2 != r10.A2O) {
            r10.A2C = true;
            r10.A2O = z2;
        }
        r10.A1h = oih.A07;
    }

    public final C254703su A00(UserSession userSession, OIH oih, int i) {
        int i2;
        C254703su r3 = new C254703su();
        A02(oih, r3);
        boolean A06 = 182.A06(0Tu.A05, userSession, 36318891997928078L);
        String str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        if (!A06) {
            if (i == -3) {
                i2 = 3449;
            } else if (i == -2) {
                str = "need_update";
            } else if (i == -1) {
                i2 = 2235;
            }
            str = C273654mx.A00(i2);
        }
        r3.A17(2FW.A1M, new C2814857z(str));
        return r3;
    }
}
