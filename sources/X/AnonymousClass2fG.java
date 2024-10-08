package X;

import com.instagram.common.session.UserSession;
import java.io.StringWriter;

/* renamed from: X.2fG  reason: invalid class name */
public final class AnonymousClass2fG implements 1NF {
    public UserSession A00;

    public final /* bridge */ /* synthetic */ Object E1p(String str) {
        return C45124Cqi.parseFromJson(0c9.A04.A01(this.A00, str));
    }

    public final /* bridge */ /* synthetic */ String END(Object obj) {
        AnonymousClass47E r7 = (AnonymousClass47E) obj;
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A0A.A0c();
        if (r7.A00 != null) {
            16P.A03(A0A, "votes");
            for (C45419Cvz cvz : r7.A00) {
                if (cvz != null) {
                    A0A.A0c();
                    String str = cvz.A03;
                    if (str != null) {
                        A0A.A0R("media_id", str);
                    }
                    String str2 = cvz.A05;
                    if (str2 != null) {
                        A0A.A0R("slider_id", str2);
                    }
                    if (cvz.A01 != null) {
                        A0A.A0q("vote");
                        D2J.A00(A0A, cvz.A01);
                    }
                    String str3 = cvz.A04;
                    if (str3 != null) {
                        A0A.A0R(AnonymousClass000.A00(755), str3);
                    }
                    String str4 = cvz.A02;
                    if (str4 != null) {
                        A0A.A0R(AnonymousClass000.A00(321), str4);
                    }
                    String str5 = cvz.A06;
                    if (str5 != null) {
                        A0A.A0R("tray_session_id", str5);
                    }
                    A0A.A0P("tray_position", cvz.A00);
                    A0A.A0Z();
                }
            }
            A0A.A0Y();
        }
        A0A.A0Z();
        A0A.close();
        return stringWriter.toString();
    }
}
