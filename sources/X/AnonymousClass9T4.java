package X;

import android.graphics.Rect;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.pendingmedia.model.ClipInfo;

/* renamed from: X.9T4  reason: invalid class name */
public abstract class AnonymousClass9T4 {
    public static final ClipInfo A00(UserSession userSession, C349307zv r16, C59796JYp jYp, int i, int i2) {
        ClipInfo clipInfo;
        int i3;
        int i4;
        int A00;
        C59796JYp jYp2 = jYp;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 3);
        C349307zv r2 = r16;
        if (jYp == null) {
            if (r2.A00 == 2) {
                jYp2 = new C59796JYp(r2.A0k, r2.A01, (long) r2.A07, false);
            } else {
                jYp2 = C59796JYp.A01(r2.A0k, 0);
            }
            0qQ.A07(jYp2);
        }
        int i5 = i;
        int i6 = i2;
        float f = ((float) i5) / ((float) i6);
        if (r2.A0v != null || !r2.A18) {
            clipInfo = new ClipInfo((String) null, 16777215);
            clipInfo.A03 = r2.A01;
            if (r2.A19) {
                int i7 = r2.A0K;
                int i8 = r2.A08;
                clipInfo.A09 = i7;
                clipInfo.A06 = i8;
                clipInfo.A0C = Integer.valueOf(r2.A09);
            } else {
                int i9 = r2.A08;
                int i10 = r2.A0K;
                clipInfo.A09 = i9;
                clipInfo.A06 = i10;
            }
            int i11 = r2.A0B;
            if (i11 > 0 && (i3 = r2.A0A) > 0) {
                f = ((float) i11) / ((float) i3);
            }
            clipInfo.A00 = f;
            if (r2.A1I || r2.A13) {
                clipInfo.A0J = true;
                clipInfo.A0E = "boomerang";
            }
            long j = jYp2.A03;
            clipInfo.A07 = r2.A0H;
            int i12 = r2.A06;
            if (i12 <= 0) {
                i12 = (int) j;
            }
            clipInfo.A05 = i12;
            clipInfo.A0A = j;
            clipInfo.A0F = r2.A0k;
        } else {
            String str = jYp2.A07;
            0qQ.A07(str);
            clipInfo = Q0X.A03(userSession2, str, jYp2.A03, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
            clipInfo.A00 = f;
            clipInfo.A07 = r2.A0H;
            if (r2.A1G) {
                clipInfo.A07 = r2.A0J;
                i4 = r2.A0I;
            } else {
                i4 = r2.A06;
                if (i4 <= 0) {
                    int i13 = clipInfo.A05;
                    if (i13 > 15000) {
                        if (!r2.A1C) {
                            A00 = 60000;
                        } else {
                            A00 = 1KU.A00(userSession2);
                        }
                        i4 = Math.min(i13, A00);
                    }
                }
            }
            clipInfo.A05 = i4;
        }
        if (r2.A15) {
            clipInfo.A0K = true;
        }
        Rect A01 = r2.A01();
        if (!(A01 == null || A01.width() != A01.height() || i5 == i6)) {
            clipInfo.A0N = true;
        }
        clipInfo.A0O = jYp2.A09;
        return clipInfo;
    }
}
