package X;

import com.facebook.proxygen.RequestStats;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

public final class S28 {
    public String A00 = null;
    public final 1QU A01;
    public final List A02;

    public final void A00(RequestStats requestStats) {
        int i;
        for (C10627RvL rvL : this.A02) {
            1QU r6 = this.A01;
            String str = this.A00;
            C12202Sou sou = rvL.A01;
            if (sou.A01) {
                Map flowTimeData = requestStats.getFlowTimeData();
                flowTimeData.put(AnonymousClass000.A00(364), str);
                flowTimeData.put("weight", String.valueOf(C12202Sou.A02));
                String str2 = r6.A0E;
                String str3 = "undefined";
                if (str2 == null) {
                    str2 = str3;
                }
                switch (r6.A09.ordinal()) {
                    case 1:
                        str3 = MediaStreamTrack.VIDEO_TRACK_KIND;
                        break;
                    case 3:
                        str3 = "image";
                        break;
                    case 4:
                        str3 = "other";
                        break;
                    case 5:
                        str3 = "api";
                        break;
                    case 6:
                        str3 = "critical-api";
                        break;
                    case 7:
                        str3 = "media-upload";
                        break;
                    case 8:
                        str3 = "analytics";
                        break;
                    case 10:
                        str3 = r6.A0D;
                        break;
                }
                flowTimeData.put("request_friendly_name", 002.A0g(str2, ":", str3));
                switch (rvL.A02.intValue()) {
                    case 0:
                        i = 1;
                        break;
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 0;
                        break;
                    default:
                        i = -1;
                        break;
                }
                flowTimeData.put("startup_status_on_added", String.valueOf(i));
                flowTimeData.put("http_stack", "Liger");
                AnonymousClass1x6 r62 = rvL.A00;
                0xI A002 = 0xI.A00(AnonymousClass1x6.A01, "mobile_http_flow");
                Iterator A0u = AnonymousClass7TF.A0u(flowTimeData);
                while (A0u.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    A002.A0C(DbT.A13(A1J), DbS.A0s(A1J));
                }
                C60640iu r0 = (C60640iu) r62.A00.get();
                if (r0 != null) {
                    r0.EFq(A002);
                }
            }
            if (sou.A00) {
                Map certificateVerificationData = requestStats.getCertificateVerificationData();
                certificateVerificationData.put("weight", String.valueOf(5000));
                AnonymousClass1x6 r4 = rvL.A00;
                0xI A003 = 0xI.A00(AnonymousClass1x6.A01, AnonymousClass000.A00(4577));
                Iterator A0u2 = AnonymousClass7TF.A0u(certificateVerificationData);
                while (A0u2.hasNext()) {
                    Map.Entry A1J2 = AnonymousClass7TE.A1J(A0u2);
                    A003.A0C(DbT.A13(A1J2), DbS.A0s(A1J2));
                }
                C60640iu r02 = (C60640iu) r4.A00.get();
                if (r02 != null) {
                    r02.EFq(A003);
                }
            }
        }
    }

    public S28(1QU r2, C10627RvL rvL) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A02 = A1C;
        this.A01 = r2;
        A1C.add(rvL);
    }
}
