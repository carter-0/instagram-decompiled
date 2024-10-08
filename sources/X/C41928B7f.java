package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.B7f  reason: case insensitive filesystem */
public final class C41928B7f implements 1NF {
    public final int A00;

    public C41928B7f(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object E1p(String str) {
        if (this.A00 != 0) {
            return C45116Cqa.parseFromJson(16P.A00(str));
        }
        0qQ.A0B(str, 0);
        C45209CsM parseFromJson = C44648CiS.parseFromJson(16P.A00(str));
        0qQ.A07(parseFromJson);
        return parseFromJson;
    }

    public final /* bridge */ /* synthetic */ String END(Object obj) {
        if (this.A00 != 0) {
            C45254CtH ctH = (C45254CtH) obj;
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            if (ctH.A00 != null) {
                A0K.A0q("pending_felix_seen_states");
                A0K.A0c();
                Iterator A0s = AnonymousClass7TF.A0s(ctH.A00);
                while (A0s.hasNext()) {
                    Map.Entry entry = (Map.Entry) A0s.next();
                    if (!16P.A04(A0K, entry)) {
                        C45365Cv7 cv7 = (C45365Cv7) entry.getValue();
                        A0K.A0c();
                        String str = cv7.A02;
                        if (str != null) {
                            A0K.A0R(TraceFieldType.RequestID, str);
                        }
                        if (cv7.A01 != null) {
                            A0K.A0q("seen_state");
                            C45707D2g.A00(A0K, cv7.A01);
                        }
                        A0K.A0Z();
                    }
                }
                A0K.A0Z();
            }
            return AnonymousClass7TG.A0k(A0K, stringWriter);
        }
        C45209CsM csM = (C45209CsM) obj;
        0qQ.A0B(csM, 0);
        StringWriter stringWriter2 = new StringWriter();
        17W A0K2 = AnonymousClass7TF.A0K(stringWriter2);
        if (csM.A00 != null) {
            16P.A03(A0K2, "gif_tray_saved_gif");
            for (C68137N2b n2b : csM.A00) {
                if (n2b != null) {
                    C70894OQm.A00(A0K2, n2b);
                }
            }
            A0K2.A0Y();
        }
        String A0k = AnonymousClass7TG.A0k(A0K2, stringWriter2);
        0qQ.A07(A0k);
        return A0k;
    }
}
