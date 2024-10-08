package X;

import com.instagram.fx.access.constants.FxcalAccountType;
import java.io.StringWriter;
import kotlin.enums.EnumEntries;

/* renamed from: X.EmE  reason: case insensitive filesystem */
public abstract class C48914EmE {
    public static String A00(F0H f0h) {
        StringWriter stringWriter = new StringWriter();
        17W A0K = AnonymousClass7TF.A0K(stringWriter);
        FxcalAccountType fxcalAccountType = f0h.A00;
        if (fxcalAccountType != null) {
            EnumEntries enumEntries = FxcalAccountType.A02;
            A0K.A0R("account_type", fxcalAccountType.A00);
        }
        A0K.A0P("token_id", 0);
        String str = f0h.A04;
        if (str != null) {
            A0K.A0R("token_str", str);
        }
        String str2 = f0h.A05;
        if (str2 != null) {
            A0K.A0R("user_fbid", str2);
        }
        EX1 ex1 = f0h.A01;
        if (ex1 != null) {
            EnumEntries enumEntries2 = EX1.A02;
            A0K.A0R("token_type", ex1.A00);
        }
        String str3 = f0h.A02;
        if (str3 != null) {
            A0K.A0R("token_app", str3);
        }
        String str4 = f0h.A03;
        if (str4 != null) {
            A0K.A0R("token_source", str4);
        }
        return AnonymousClass7TG.A0k(A0K, stringWriter);
    }
}
