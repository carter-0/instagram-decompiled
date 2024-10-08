package X;

import android.webkit.MimeTypeMap;
import com.facebook.smartcapture.logging.SmartCaptureLogger;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.ArrayList;

/* renamed from: X.Qcf  reason: case insensitive filesystem */
public final class C7909Qcf extends C10984S3u {
    public static UserSession A05;
    public static final C7909Qcf A06 = new C10984S3u();
    public static final AnonymousClass12U A07;
    public static final AnonymousClass4CZ A08;
    public static final AnonymousClass4CZ A09;
    public static final C262224Cq A0A;
    public C66498MUb A00;
    public SmartCaptureLogger A01;
    public AnonymousClass4CZ A02;
    public AnonymousClass4CZ A03;
    public C262224Cq A04;

    public static final Object A00(C307896Rx r20, AnonymousClass6Tm r21) {
        String str;
        File file;
        C7909Qcf qcf = A06;
        C307896Rx r12 = r20;
        A05 = DbW.A0R(r12);
        C308206Td.A09(r12);
        0lg A0B = C308206Td.A0B(r12);
        0qQ.A0B(A0B, 1);
        C12277SqZ sqZ = new C12277SqZ(A0B);
        UserSession userSession = A05;
        if (userSession != null) {
            C12075SmU A0e = JTR.A0e(userSession);
            AnonymousClass4CZ r5 = A09;
            AnonymousClass4CZ r3 = A08;
            C262224Cq r1 = A0A;
            0qQ.A0B(r3, 2);
            0qQ.A0B(r1, 3);
            if (qcf.A00 == null) {
                qcf.A00 = A0e;
                qcf.A03 = r5;
                qcf.A02 = r3;
                qcf.A04 = r1;
                qcf.A01 = sqZ;
            }
            SmartCaptureLogger smartCaptureLogger = qcf.A01;
            if (smartCaptureLogger != null) {
                smartCaptureLogger.logEvent("docupload_started");
            }
            AnonymousClass6Tm r13 = r21;
            ArrayList A012 = qcf.A01(r12, r13);
            if (!(A012 == null || (file = (File) 00k.A0J(A012)) == null)) {
                C277014uI A0P = DbW.A0P(r13, 0);
                C277014uI A0P2 = DbW.A0P(r13, 1);
                C277014uI A0P3 = DbW.A0P(r13, 2);
                String A0h = DbY.A0h(r13, 3);
                0qQ.A0B(A0h, 1);
                String A0Z = JTQ.A0Z();
                String A002 = C9842RiE.A00(JTP.A0t(file), A0Z, 0);
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(file.getName()));
                if (mimeTypeFromExtension == null) {
                    mimeTypeFromExtension = "application/octet-stream";
                }
                C11420SSw sSw = new C11420SSw(file, mimeTypeFromExtension, A002);
                String absolutePath = file.getAbsolutePath();
                0qQ.A07(absolutePath);
                UserSession userSession2 = A05;
                if (userSession2 != null) {
                    C11224SFy A003 = C63392KwD.A00(userSession2, A0Z, A0h, absolutePath, 1, false);
                    C262224Cq r0 = qcf.A04;
                    if (r0 == null) {
                        str = "uiScope";
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    AnonymousClass7TE.A1Z(new C59700JUh(A0P, A0P2, qcf, A003, file, A0P3, r12, sSw, (AnonymousClass4D7) null, 1), r0);
                }
            }
            return null;
        }
        str = "userSession";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Qcf, X.S3u] */
    static {
        AnonymousClass12U r4 = new AnonymousClass12U();
        A07 = r4;
        AnonymousClass4CZ r3 = r4.A04;
        A09 = r3;
        C262084Cb r1 = r4.CO6(1515051608, 3).get(C262104Cd.A00);
        0qQ.A0C(r1, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        A08 = (AnonymousClass4CZ) r1;
        A0A = 19E.A02(AnonymousClass199.A02(r3, new AnonymousClass19G((C262204Co) null)));
    }
}
