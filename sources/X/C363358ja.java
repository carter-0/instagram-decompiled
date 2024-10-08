package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.StringWriter;
import java.util.Map;

/* renamed from: X.8ja  reason: invalid class name and case insensitive filesystem */
public final class C363358ja implements C363348jZ {
    public final /* synthetic */ C363288jT A00;

    public C363358ja(C363288jT r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ String Ah7(Object obj) {
        return ((C293645l7) obj).A01;
    }

    public final /* bridge */ /* synthetic */ String END(Object obj) {
        C293645l7 r6 = (C293645l7) obj;
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A0A.A0c();
        String str = r6.A01;
        if (str != null) {
            A0A.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        }
        if (r6.A03 != null) {
            A0A.A0q("scores");
            A0A.A0c();
            for (Map.Entry entry : r6.A03.entrySet()) {
                if (!16P.A04(A0A, entry)) {
                    A0A.A0e(((Number) entry.getValue()).doubleValue());
                }
            }
            A0A.A0Z();
        }
        String str2 = r6.A02;
        if (str2 != null) {
            A0A.A0R("rank_token", str2);
        }
        A0A.A0Q("ttl_secs", r6.A00);
        A0A.A0Z();
        A0A.close();
        return stringWriter.toString();
    }

    public final /* bridge */ /* synthetic */ Object AOn(String str) {
        return C294755my.parseFromJson(16P.A00(str));
    }
}
