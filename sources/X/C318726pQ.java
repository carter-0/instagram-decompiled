package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.6pQ  reason: invalid class name and case insensitive filesystem */
public abstract class C318726pQ {
    public static final void A01(Context context, SpannableStringBuilder spannableStringBuilder, UserSession userSession, C318716pP r10, List list) {
        StringBuilder sb;
        String name;
        0qQ.A0B(userSession, 1);
        if (list != null && !list.isEmpty()) {
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C255253tp r3 = (C255253tp) it.next();
                if (C3253371z.A00(r3) == AnonymousClass05K.A00) {
                    sb.append('@');
                    C255233tn CCb = r3.CCb();
                    CCb.getClass();
                    name = CCb.getUsername();
                } else {
                    sb = new StringBuilder();
                    sb.append('#');
                    Hashtag BCW = r3.BCW();
                    BCW.getClass();
                    name = BCW.getName();
                }
                sb.append(name);
                hashMap.put(sb.toString(), r3);
            }
            String obj = spannableStringBuilder.toString();
            0qQ.A07(obj);
            AnonymousClass5H7 r2 = new AnonymousClass5H7(502, A00(obj, C253053q8.A03(obj), hashMap), A00(obj, C253053q8.A05(obj, false), hashMap), (List) null);
            int A0F = 2Yu.A0F(context, R.attr.igds_color_link);
            C253003q3 r1 = new C253003q3(spannableStringBuilder, userSession, r2);
            r1.A0M = false;
            r1.A03 = A0F;
            r1.A0L = false;
            r1.A01 = A0F;
            r1.A03(new AnonymousClass720(r10, hashMap));
            r1.A02(new AnonymousClass721(r10, hashMap));
            r1.A00();
        }
    }

    public static final ArrayList A00(String str, List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C255723uc r2 = (C255723uc) it.next();
            String substring = str.substring(r2.A01, r2.A00);
            0qQ.A07(substring);
            Locale locale = Locale.getDefault();
            0qQ.A07(locale);
            String lowerCase = substring.toLowerCase(locale);
            0qQ.A07(lowerCase);
            if (map.containsKey(lowerCase)) {
                arrayList.add(r2);
            }
        }
        return arrayList;
    }
}
