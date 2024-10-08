package X;

import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class PVS implements Runnable {
    public final /* synthetic */ NKR A00;

    public PVS(NKR nkr) {
        this.A00 = nkr;
    }

    public final void run() {
        NKR nkr = this.A00;
        N4P n4p = nkr.A03;
        if (n4p != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            A1C.add(nkr.A08.getValue());
            C73426PcQ pcQ = C73426PcQ.A00;
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            C68303N9q A07 = n4p.A07();
            if (A07 != null && !A07.A0D) {
                A1C2.add(A07);
            }
            List<C68303N9q> A15 = JTO.A15(n4p.A0a);
            00k.A0g(A15, pcQ);
            ArrayList A0r = AnonymousClass7TG.A0r(A15);
            for (C68303N9q n9q : A15) {
                User user = n9q.A00;
                boolean z = n9q.A07;
                boolean z2 = n9q.A08;
                boolean z3 = n9q.A0A;
                boolean z4 = n9q.A04;
                boolean z5 = n9q.A09;
                boolean z6 = n9q.A0D;
                boolean z7 = n9q.A0C;
                boolean z8 = n9q.A0B;
                boolean z9 = n9q.A05;
                boolean z10 = n9q.A06;
                boolean z11 = z2;
                boolean z12 = z3;
                boolean z13 = z4;
                User user2 = user;
                String str = n9q.A01;
                boolean z14 = z;
                DbY.A1U(new C68303N9q(user2, str, z14, z11, z12, z13, z5, z6, z7, z8, z9, false, false, z10), A1C2, A0r);
            }
            A1C.addAll(A1C2);
            NLD nld = nkr.A02;
            if (nld != null) {
                nld.A00(A1C);
            }
        }
    }
}
