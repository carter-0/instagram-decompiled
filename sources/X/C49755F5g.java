package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.F5g  reason: case insensitive filesystem */
public abstract class C49755F5g {
    public static 1OC A00(UserSession userSession, String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, boolean z) {
        String str5;
        1NY A0O = DbU.A0O(userSession);
        A0O.A0A("direct_v2/ranked_recipients/");
        A0O.A0F = str4;
        A0O.A0R(C47366Dwc.class, C49756F5h.class);
        if (str != null && !str.isEmpty()) {
            A0O.A9m("query", str);
        }
        A0O.A9m(DatePickerDialogModule.ARG_MODE, str2);
        if (z) {
            str5 = "true";
        } else {
            str5 = "false";
        }
        A0O.A9m("show_threads", str5);
        A0O.A0C("max_ig_results", i);
        A0O.A0C("max_fb_results", 0);
        A0O.A0C("max_ig_bus_results", i2);
        if (i3 > 0) {
            A0O.A0C("max_ibc_results", i3);
        }
        A0O.A0C("max_ai_bot_results", i4);
        if (str3 != null) {
            A0O.A9m("poster_id", str3);
        }
        return A0O.A0M();
    }

    public static String A01(List list) {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            A0A.A0b();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0A.A0t(AnonymousClass7TE.A18(it));
            }
            A0A.A0Y();
            A0A.close();
            return stringWriter.toString();
        } catch (IOException e) {
            0wb.A06("DirectRecipientsApi", C66579MXk.A00(53), e);
            return null;
        }
    }
}
