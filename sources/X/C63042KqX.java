package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.KqX  reason: case insensitive filesystem */
public abstract class C63042KqX {
    public static final C59721JVf A00(C61081JwJ jwJ) {
        C266444Yx A00;
        List list;
        if (jwJ == null) {
            A00 = DbS.A0Q(new Object[0], 2131953020);
            list = 0sr.A1P(new C61081JwJ[]{new C61081JwJ((C266444Yx) DbS.A0Q(new Object[0], 2131953019), "https://help.instagram.com/491230782877226"), new C61081JwJ((C266444Yx) DbS.A0Q(new Object[0], 2131953017), "https://help.instagram.com/2136147216424213")});
        } else {
            A00 = JUH.A00(jwJ.A01);
            List<N49> list2 = (List) jwJ.A00;
            ArrayList A0r = AnonymousClass7TG.A0r(list2);
            for (N49 n49 : list2) {
                A0r.add(new C61081JwJ((C266444Yx) JUH.A00(n49.A01), n49.A00));
            }
            list = A0r;
        }
        return new C59721JVf(A00, list);
    }
}
