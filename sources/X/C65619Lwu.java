package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Lwu  reason: case insensitive filesystem */
public final class C65619Lwu implements C74428Pui {
    public final int A00;
    public final Object A01;

    public C65619Lwu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D1s() {
    }

    public final void DiF(Integer num) {
        C66390MPw ldR;
        String str;
        C60996Jus jus;
        C309516Yo A0M;
        switch (this.A00) {
            case 0:
                C61446K8a k8a = (C61446K8a) this.A01;
                C64519LdL ldL = new C64519LdL(k8a);
                K88 k88 = new K88();
                List list = k8a.A06;
                List list2 = k8a.A04;
                String str2 = k8a.A03;
                AnonymousClass7TG.A1U(list, list2, str2);
                k88.A00 = ldL;
                k88.A03 = list;
                k88.A02 = list2;
                k88.A01 = str2;
                A0M = DbV.A0M(k88, k8a.requireActivity(), k8a.A06());
                break;
            case 1:
                C60318JjM jjM = (C60318JjM) ((K8Z) this.A01).A05.getValue();
                if (num == AnonymousClass05K.A01) {
                    Iterator A0v = AnonymousClass7TF.A0v(jjM.A08);
                    while (true) {
                        str = null;
                        if (A0v.hasNext()) {
                            Object next = A0v.next();
                            Map map = jjM.A09;
                            if (map.containsKey(next)) {
                                if (!(next == null || (jus = (C60996Jus) map.get(next)) == null)) {
                                    str = jus.A05;
                                }
                            }
                        }
                    }
                    ldR = new C64521LdN(str);
                } else {
                    ldR = new C64525LdR(new C64520LdM(jjM), jjM.A07, 00k.A0U(jjM.A08.values()));
                }
                C60318JjM.A04(jjM, ldR);
                return;
            case 2:
                C61448K8c k8c = (C61448K8c) this.A01;
                C61448K8c.A00(k8c, "see_all", (String) null);
                A0M = C49892FBu.A00(k8c.requireActivity(), k8c.A06());
                List list3 = k8c.A01;
                0qQ.A0B(list3, 0);
                K83 k83 = new K83();
                k83.A01 = list3;
                k83.A00 = "approve_creators";
                A0M.A0B((Bundle) null, k83);
                break;
            default:
                C61447K8b k8b = (C61447K8b) this.A01;
                A0M = C49892FBu.A00(k8b.requireActivity(), k8b.A06());
                List list4 = k8b.A01;
                0qQ.A0B(list4, 0);
                K83 k832 = new K83();
                k832.A01 = list4;
                k832.A00 = "request_approvals";
                A0M.A0D(k832);
                break;
        }
        A0M.A08();
        A0M.A04();
    }
}
