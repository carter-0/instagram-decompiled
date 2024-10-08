package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectSearchPrompt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9B6  reason: invalid class name */
public final class AnonymousClass9B6 {
    public final C290655fg A00;
    public final 0xa A01;
    public final UserSession A02;

    public final ImmutableList A00() {
        AnonymousClass9VB r1;
        this.A00.A00();
        Map all = this.A01.getAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : all.entrySet()) {
            String str = (String) entry.getKey();
            0qQ.A0A(str);
            if (00p.A0k(str, "prompt:", false) && 00l.A0R(str, new String[]{"prompt:"}, 0).size() == 2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object value = entry2.getValue();
            0qQ.A0A(value);
            if (00l.A0R(value.toString(), new String[]{","}, 0).size() == 3) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Object key = entry3.getKey();
            0qQ.A0A(key);
            String str2 = (String) 00l.A0R((CharSequence) key, new String[]{"prompt:"}, 0).get(1);
            Object obj = 00l.A0R(String.valueOf(entry3.getValue()), new String[]{","}, 0).get(0);
            String str3 = (String) 00l.A0R(String.valueOf(entry3.getValue()), new String[]{","}, 0).get(1);
            String str4 = (String) 00l.A0R(String.valueOf(entry3.getValue()), new String[]{","}, 0).get(2);
            0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.String");
            0qQ.A0B(obj, 0);
            AnonymousClass9VB[] values = AnonymousClass9VB.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    r1 = AnonymousClass9VB.TEXT;
                    break;
                }
                r1 = values[i];
                if (0qQ.A0K(r1.A00, obj)) {
                    break;
                }
                i++;
            }
            arrayList.add(new DirectSearchPrompt(r1, str2, str3, str4));
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList);
        0qQ.A07(copyOf);
        return copyOf;
    }

    public AnonymousClass9B6(C290655fg r4, UserSession userSession) {
        this.A00 = r4;
        this.A02 = userSession;
        this.A01 = 1Al.A01(userSession).A04(1An.A06, getClass());
    }
}
