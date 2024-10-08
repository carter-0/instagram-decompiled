package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5gL  reason: invalid class name and case insensitive filesystem */
public final class C290995gL extends 1XP {
    public C293605l3 A00;
    public Boolean A01;
    public String A02;
    public List A03 = new ArrayList();
    public List A04 = new ArrayList();

    public final C290935gF A00(String str) {
        0qQ.A0B(str, 0);
        for (C290935gF r1 : this.A03) {
            if (0qQ.A0K(r1.A03, str)) {
                return r1;
            }
        }
        return null;
    }

    public final HashMap A01() {
        HashMap hashMap = new HashMap();
        for (C290935gF r0 : this.A03) {
            String str = r0.A03;
            if (str != null) {
                hashMap.put(str, Integer.valueOf(r0.A04.size()));
            }
        }
        return hashMap;
    }
}
