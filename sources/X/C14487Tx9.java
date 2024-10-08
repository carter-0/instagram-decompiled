package X;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Tx9  reason: case insensitive filesystem */
public final class C14487Tx9 extends C14199Tre {
    public final void A06(String str, List list, boolean z) {
        String str2;
        0qQ.A0B(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C66942Mfb mfb = (C66942Mfb) it.next();
            if (!(mfb instanceof C67387Mn4) || !0qQ.A0K(((C67387Mn4) mfb).A01.A07, "meta_ai_suggestion")) {
                str2 = "null_state_recent";
            } else if (z) {
                str2 = "meta_ai_recent";
            }
            C66966Mfz mfz = new C66966Mfz();
            mfz.A09 = str2;
            mfz.A08 = "RECENT";
            mfz.A06 = str;
            mfz.A0F = true;
            Locale locale = Locale.getDefault();
            0qQ.A07(locale);
            String lowerCase = "RECENT".toLowerCase(locale);
            0qQ.A07(lowerCase);
            mfz.A05 = lowerCase;
            A02(mfz, mfb);
        }
    }
}
