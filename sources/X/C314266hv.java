package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6hv  reason: invalid class name and case insensitive filesystem */
public final class C314266hv extends C314276hw {
    public static final C314296hy A03 = new Object();
    public boolean A00;
    public final UserSession A01;
    public final 1Av A02;

    public static final ArrayList A00(C314266hv r8) {
        int i;
        ArrayList arrayList = new ArrayList();
        String string = r8.A02.A01.getString("PREFERENCE_CACHED_QUICK_REACTION_EMOJIS_V2", "");
        0qQ.A07(string);
        if (0mp.A0B(string)) {
            return null;
        }
        for (String str : 00l.A0R(string, new String[]{";"}, 0)) {
            if (str.length() != 0) {
                List A0R = 00l.A0R(str, new String[]{","}, 0);
                ImmutableList immutableList = C254853tA.A07;
                String str2 = (String) A0R.get(0);
                String str3 = (String) A0R.get(1);
                if (A0R.size() == 3) {
                    i = Integer.parseInt((String) A0R.get(2));
                } else {
                    i = 0;
                }
                arrayList.add(new C254853tA(str2, str3, i));
            }
        }
        return arrayList;
    }

    public C314266hv(UserSession userSession) {
        this.A01 = userSession;
        this.A02 = 1Au.A00(userSession);
    }
}
