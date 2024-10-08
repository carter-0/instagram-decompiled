package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.78M  reason: invalid class name */
public final class AnonymousClass78M implements AnonymousClass78N {
    public final C328967Gz A00;
    public final UserSession A01;
    public final List A02;

    public AnonymousClass78M(UserSession userSession, C328967Gz r3, List list) {
        0qQ.A0B(r3, 2);
        this.A02 = list;
        this.A00 = r3;
        this.A01 = userSession;
    }

    private final ArrayList A00(String str) {
        ArrayList arrayList = new ArrayList();
        String str2 = str;
        if (str2.length() != 0) {
            String substring = str2.substring(1);
            0qQ.A07(substring);
            String A012 = 0mp.A01(substring);
            if (A012 != null) {
                if (O00.A00(this.A01, AnonymousClass7OR.MENTION, str2)) {
                    for (AnonymousClass77I r4 : this.A02) {
                        String str3 = r4.A0A;
                        String str4 = r4.A09;
                        Locale locale = Locale.ROOT;
                        String lowerCase = str4.toLowerCase(locale);
                        0qQ.A07(lowerCase);
                        String lowerCase2 = A012.toLowerCase(locale);
                        0qQ.A07(lowerCase2);
                        if (lowerCase.startsWith(lowerCase2)) {
                            arrayList.add(r4);
                        } else if (!(str3 == null || str3.length() == 0)) {
                            String lowerCase3 = str3.toLowerCase(locale);
                            0qQ.A07(lowerCase3);
                            0qQ.A07(lowerCase2);
                            if (lowerCase3.startsWith(lowerCase2)) {
                                String str5 = r4.A08;
                                String str6 = r4.A06;
                                String str7 = r4.A07;
                                int i = r4.A00;
                                arrayList.add(new AnonymousClass77I(r4.A01, str4, str3, str5, str6, str7, r4.A0C, i, r4.A0D));
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final /* bridge */ /* synthetic */ Object filter(Object obj) {
        String str = (String) obj;
        0qQ.A0B(str, 0);
        if (!A00(str).isEmpty()) {
            0wc r2 = this.A00.A00;
            0Aj A002 = r2.A00(r2.A00, "msg_mention_list_impression");
            if (A002.isSampled()) {
                A002.A7p("is_xac_thread", false);
                A002.A7p(C66579MXk.A00(140), true);
                A002.Cgf();
            }
        }
        return A00(str);
    }
}
