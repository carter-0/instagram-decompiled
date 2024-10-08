package X;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;

/* renamed from: X.9ve  reason: invalid class name and case insensitive filesystem */
public abstract class C392949ve {
    public static boolean A00(String str, String str2, Map map, Callable callable) {
        map.getClass();
        if (str != null) {
            Iterator it = map.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String A18 = AnonymousClass7TE.A18(it);
                if (A18.equals(str)) {
                    Object obj = map.get(A18);
                    if (obj instanceof TreeMap) {
                        AbstractMap abstractMap = (AbstractMap) obj;
                        Iterator A0s = AnonymousClass7TF.A0s(abstractMap);
                        while (A0s.hasNext()) {
                            if (((String) AnonymousClass7TE.A1J(A0s).getKey()).equals(str2)) {
                            }
                        }
                        try {
                            String str3 = (String) callable.call();
                            if (str3 != null) {
                                abstractMap.put(str2, str3);
                                return true;
                            }
                        } catch (Exception unused) {
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }
}
