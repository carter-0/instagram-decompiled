package X;

import com.instagram.api.schemas.IGClickToMessagingCardTypeEnum;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CYo  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44175CYo {
    public static Map A00(C46247DSc dSc) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dSc.Alj() != null) {
            IGClickToMessagingCardTypeEnum Alj = dSc.Alj();
            if (Alj != null) {
                str = Alj.A00;
            } else {
                str = null;
            }
            A1H.put("cardType", str);
        }
        if (dSc.BE4() != null) {
            A1H.put("icebreakerDisclaimerText", dSc.BE4());
        }
        return 0Yt.A0B(A1H);
    }
}
