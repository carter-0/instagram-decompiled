package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.2fN  reason: invalid class name */
public final class AnonymousClass2fN {
    public String A00 = UUID.randomUUID().toString();
    public HashMap A01 = new HashMap();
    public Set A02 = new HashSet();

    public final int A00() {
        int size = this.A02.size();
        int i = 0;
        for (Map.Entry value : this.A01.entrySet()) {
            i += new HashSet(Arrays.asList(((String) value.getValue()).split(","))).size();
        }
        return size + i;
    }

    public final 1OC A01(UserSession userSession) {
        String str;
        String str2;
        1NY r4 = new 1NY(userSession);
        r4.A08(AnonymousClass05K.A01);
        r4.A0A("clips/write_seen_state/");
        Set<String> set = this.A02;
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            A0A.A0b();
            for (String A0t : set) {
                A0A.A0t(A0t);
            }
            A0A.A0Y();
            A0A.close();
            str = stringWriter.toString();
        } catch (IOException unused) {
            str = "[]";
        }
        r4.A9m("impressions", str);
        HashMap hashMap = this.A01;
        try {
            StringWriter stringWriter2 = new StringWriter();
            17W A0A2 = AnonymousClass15o.A00.A0A(stringWriter2);
            A0A2.A0b();
            for (Map.Entry entry : hashMap.entrySet()) {
                A0A2.A0c();
                A0A2.A0R("blend_id", (String) entry.getKey());
                A0A2.A0q(AnonymousClass000.A00(3935));
                A0A2.A0b();
                for (String A0t2 : ((String) entry.getValue()).split(",")) {
                    A0A2.A0t(A0t2);
                }
                A0A2.A0Y();
                A0A2.A0Z();
            }
            A0A2.A0Y();
            A0A2.close();
            str2 = stringWriter2.toString();
        } catch (IOException unused2) {
            str2 = "[]";
        }
        r4.A9m("blend_impressions", str2);
        r4.A0R(1XP.class, 1XY.class);
        r4.A0R = true;
        return r4.A0M();
    }
}
