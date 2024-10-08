package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mcf.MsysError;
import com.facebook.msys.mci.PlatformLogger;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import java.util.List;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.Op4  reason: case insensitive filesystem */
public final class C71685Op4 implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public C71685Op4(TransportPayload transportPayload, AnonymousClass2Ep r2, C74551Pwk pwk, 1OS r4, C66638Ma7 ma7, 0rm r6, int i) {
        this.A00 = i;
        this.A06 = ma7;
        this.A01 = r2;
        this.A04 = r6;
        this.A03 = r4;
        this.A02 = pwk;
        this.A05 = transportPayload;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        boolean z;
        C66638Ma7 ma7;
        AnonymousClass2Ep r4;
        int intValue;
        MsysError msysError;
        String str;
        String str2;
        String str3;
        C69414Nku nku;
        C270214gN r11;
        String str4;
        String str5;
        String str6;
        int code;
        Object obj2 = obj;
        if (this.A00 != 0) {
            C70543OAr oAr = (C70543OAr) obj2;
            z = false;
            0qQ.A0B(oAr, 0);
            ma7 = (C66638Ma7) this.A06;
            r4 = (AnonymousClass2Ep) this.A01;
            intValue = oAr.A01.intValue();
            msysError = oAr.A00;
        } else {
            C70542OAq oAq = (C70542OAq) obj2;
            z = false;
            0qQ.A0B(oAq, 0);
            ma7 = (C66638Ma7) this.A06;
            r4 = (AnonymousClass2Ep) this.A01;
            intValue = oAq.A01.intValue();
            msysError = oAq.A00;
        }
        1OS r1 = (1OS) this.A03;
        C74551Pwk pwk = (C74551Pwk) this.A02;
        TransportPayload transportPayload = (TransportPayload) this.A05;
        ma7.A03.A03((List) null, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, (String) ((0rm) this.A04).A00);
        PlatformLogger.platformEventStructuredLoggerInsertMsysApiCallBackStart(r1.A05);
        if (intValue == 0) {
            nku = C69414Nku.A06;
            if (msysError == null || (r13 = Integer.valueOf(msysError.getCode()).toString()) == null) {
                String str7 = "0";
            }
            str2 = "ae";
            str = "Unknown error during MEM send";
            r11 = new C270214gN(nku, str3, str2, str, z, z);
        } else if (intValue == 2) {
            C69414Nku nku2 = C69414Nku.A06;
            if (msysError == null || (str4 = Integer.valueOf(msysError.getCode()).toString()) == null) {
                str4 = "0";
            }
            if (msysError == null || (str5 = msysError.getMessage()) == null) {
                str5 = "unknown error";
            }
            r11 = new C270214gN(nku2, str4, "ae", 002.A0R("Retriable error: ", str5), true, true);
        } else if (intValue == 3) {
            if (msysError != null && (code = msysError.getCode()) == 1 && r4.CYU()) {
                UserSession userSession = ma7.A00;
                if (r4.CVZ(userSession)) {
                    0Tu r112 = 0Tu.A05;
                    if (((long) r1.A00) < 182.A01(r112, userSession, 36609317683664733L) && 182.A06(r112, userSession, 36327842706897655L)) {
                        r11 = new C270214gN((C254403sQ) null, C69414Nku.A06, String.valueOf(code), (String) null, "ae", (String) null, AnonymousClass7TF.A0m("Retriable error: ", msysError), (String) null, true, z, z, z, z, true);
                    }
                }
            }
            nku = C69414Nku.A06;
            if (msysError == null || (str3 = Integer.valueOf(msysError.getCode()).toString()) == null) {
                str3 = "0";
            }
            if (msysError == null || (str6 = msysError.getMessage()) == null) {
                str6 = "unknown error";
            }
            str = 002.A0R("Permanent error: ", str6);
            str2 = "ae";
            r11 = new C270214gN(nku, str3, str2, str, z, z);
        } else {
            return;
        }
        ma7.A02.A01(transportPayload, pwk, r11, r1.A05);
    }
}
