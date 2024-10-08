package X;

import android.content.Context;
import com.instagram.api.schemas.CameraTool;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;

public final class MB6 implements Callable {
    public final LBC A00;
    public final boolean A01;

    public MB6(LBC lbc) {
        0qQ.A0B(lbc, 1);
        this.A00 = lbc;
        this.A01 = lbc.A06.A5F;
    }

    private final void A00() {
        AnonymousClass3Q2 r3 = this.A00.A06;
        r3.A4a = null;
        r3.A2k = null;
        r3.A0i((String) null);
        r3.A0h((String) null);
        r3.A16 = null;
        r3.A5F = this.A01;
        r3.A1V = new AnonymousClass3QS(0.0f, 31);
    }

    /* renamed from: A01 */
    public final String call() {
        String str;
        String str2;
        LBC lbc = this.A00;
        Context context = lbc.A00;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            1GK r0 = lbc.A02;
            if (r0 != null) {
                File file = (File) OX4.A01(r0);
                AnonymousClass3Q2 r1 = lbc.A06;
                if (file != null) {
                    str2 = file.getAbsolutePath();
                } else {
                    str2 = null;
                }
                r1.A2k = str2;
            }
            Map map = lbc.A07;
            if (!map.isEmpty()) {
                AB8.A01(lbc.A01, lbc.A06, 0Yt.A03(map));
            }
            TransformMatrixConfig transformMatrixConfig = lbc.A03;
            if (transformMatrixConfig != null) {
                lbc.A06.A16 = transformMatrixConfig;
            }
            if (lbc.A08) {
                lbc.A06.A5F = true;
            } else {
                AnonymousClass3QS r12 = lbc.A05;
                if (r12 != null) {
                    lbc.A06.A1V = r12;
                }
            }
            AnonymousClass51W r6 = lbc.A04;
            if (r6 != null) {
                AnonymousClass3Q2 r4 = lbc.A06;
                r4.A1P = r6;
                UserSession userSession = lbc.A01;
                0qQ.A0B(userSession, 1);
                r4.A0r = AHJ.A01(context, userSession, r6, 2Nm.A00(context, userSession), false);
            }
            boolean z = lbc.A0A;
            Integer A0j = JTP.A0j(z ? 1 : 0);
            UserSession userSession2 = lbc.A01;
            AnonymousClass3Q2 r7 = lbc.A06;
            if (!C9841RiD.A00(applicationContext, (N4L) null, userSession2, r7, A0j)) {
                if (182.A06(0Tu.A05, userSession2, 36326305108604604L) && (str = r7.A3V) != null) {
                    JTR.A1O(AnonymousClass7TE.A0t(str));
                }
                A00();
                throw JTO.A0u("Failed to save video to gallery");
            }
            String str3 = r7.A3V;
            if (str3 != null) {
                if (z) {
                    AnonymousClass9U5 r3 = new AnonymousClass9U5(str3);
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    String str4 = r7.A2o;
                    if (str4 != null) {
                        A1C.add(str4);
                    }
                    ArrayList A0J = r7.A0J();
                    if (A0J != null) {
                        A1C.addAll(A0J);
                    }
                    r3.A0A = A1C;
                    r3.A07 = r7.A2n;
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    for (AnonymousClass55X r02 : r7.A4D) {
                        String obj = r02.A01.toString();
                        if (0qQ.A0K(obj, CameraTool.HORIZON.A00)) {
                            A1C2.add(obj);
                        }
                    }
                    r3.A09 = A1C2;
                    r3.A06 = r7.A2V;
                    r3.A00 = r7.A1b;
                    r3.A0B = lbc.A09;
                    AnonymousClass8VQ.A04(userSession2, r3);
                }
                A00();
                return str3;
            }
            A00();
            0kD.A0D("SaveVideoCallable", "Pending media file path was null", (Throwable) null);
            throw JTO.A0u("Pending media file path was null");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
