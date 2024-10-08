package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KrG  reason: case insensitive filesystem */
public abstract class C63087KrG {
    public static Object A00(C307896Rx r13, AnonymousClass6Tm r14) {
        C62446Kfw kfw;
        List list = r14.A00;
        if (list.size() == 2) {
            C277014uI A00 = C280064zw.A00(list.get(0));
            C276544tV r3 = (C276544tV) list.get(1);
            if (!(A00 == null || r3 == null)) {
                C307896Rx r11 = r13;
                Context requireContext = C308206Td.A01(r13).requireContext();
                0hq A05 = C308206Td.A05(r13);
                List A0N = r3.A0N(35);
                String A0F = r3.A0F();
                boolean A0T = r3.A0T(false);
                if (!A0N.isEmpty()) {
                    FragmentActivity A04 = C308206Td.A04(r11);
                    ArrayList A0m = C51970G9q.A0m(A0N);
                    Iterator it = A0N.iterator();
                    while (it.hasNext()) {
                        String A18 = AnonymousClass7TE.A18(it);
                        if (A18.equals("feed_media")) {
                            kfw = C62446Kfw.POSTS;
                        } else if (A18.equals("camera_roll")) {
                            kfw = C62446Kfw.GALLERY;
                        }
                        A0m.add(kfw);
                    }
                    L9U l9u = new L9U(requireContext, A04, A05, r11, A00, A0T);
                    Fragment r1 = new C273374mT();
                    r1.A00 = l9u;
                    r1.A02 = A0m;
                    r1.A01 = A0F;
                    C309516Yo A0M = DbS.A0M(A04, C308206Td.A0B(r11));
                    A0M.A0E = true;
                    A0M.A0E(r1);
                    A0M.A04();
                }
            }
        }
        return null;
    }
}
