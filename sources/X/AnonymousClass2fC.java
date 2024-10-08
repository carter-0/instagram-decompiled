package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.StringWriter;

/* renamed from: X.2fC  reason: invalid class name */
public final class AnonymousClass2fC implements 1NF {
    public final /* synthetic */ UserSession A00;

    public AnonymousClass2fC(UserSession userSession) {
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ Object E1p(String str) {
        return C55166HdI.parseFromJson(0c9.A04.A01(this.A00, str));
    }

    public final /* bridge */ /* synthetic */ String END(Object obj) {
        AnonymousClass45G r9 = (AnonymousClass45G) obj;
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A0A.A0c();
        if (r9.A00 != null) {
            16P.A03(A0A, AnonymousClass000.A00(3727));
            for (C56538I0n i0n : r9.A00) {
                if (i0n != null) {
                    A0A.A0c();
                    A0A.A0Q("creation_time", i0n.A03);
                    if (i0n.A04 != null) {
                        A0A.A0q(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
                        AnonymousClass1Zw.A00(A0A, i0n.A04);
                    }
                    String str = i0n.A05;
                    if (str != null) {
                        A0A.A0R("container_module", str);
                    }
                    String str2 = i0n.A06;
                    if (str2 != null) {
                        A0A.A0R("radio_type", str2);
                    }
                    A0A.A0S(AnonymousClass000.A00(669), i0n.A07);
                    A0A.A0P(AnonymousClass000.A00(603), i0n.A01);
                    A0A.A0P("carousel_index", i0n.A00);
                    A0A.A0P(AnonymousClass000.A00(1742), i0n.A02);
                    A0A.A0S(AnonymousClass000.A00(674), i0n.A09);
                    A0A.A0S(AnonymousClass000.A00(1512), i0n.A0A);
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
