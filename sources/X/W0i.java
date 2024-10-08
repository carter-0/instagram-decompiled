package X;

import com.facebook.proxygen.LigerSamplePolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class W0i {
    public static final boolean A02(X8K x8k, X3A x3a) {
        0qQ.A0B(x3a, 1);
        for (Object next : x3a.FMr(x8k)) {
            if (!((X8L) next).CYw()) {
                if (next != null) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    public static final boolean A03(X8K x8k, List list) {
        0qQ.A0B(list, 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            0eP A1A = JTO.A1A(it);
            if (!0qQ.A0K(A1A.A01, x8k.getStringForKey((String) A1A.A00))) {
                return false;
            }
        }
        return true;
    }

    public static final List A01(List list, long j) {
        ArrayList A0q = AnonymousClass7TF.A0q(list, 2);
        for (Object next : list) {
            X8K x8k = (X8K) next;
            0qQ.A0B(x8k, 0);
            if (j - x8k.C7M() >= LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
                A0q.add(next);
            }
        }
        return A0q;
    }

    public static final String A00(X8K x8k, String str) {
        if (!00l.A0d(x8k.BwS(), "gnv", false) || !str.equals("m_pk")) {
            return x8k.getStringForKey(str);
        }
        return 002.A0T(x8k.getStringForKey("content_id"), x8k.getStringForKey(AnonymousClass000.A00(1222)), '_');
    }
}
