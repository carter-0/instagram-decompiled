package X;

import java.util.Iterator;
import java.util.Map;

public final class AE4 {
    public int A00;
    public long A01;
    public String A02 = "default_trigger";
    public final 1QP A03;
    public final Map A04 = AnonymousClass7TE.A1H();

    public final long A01() {
        1QP r5 = this.A03;
        this.A01 = r5.flowStartForMarker(this.A00, this.A02, false);
        Iterator A0u = AnonymousClass7TF.A0u(this.A04);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            r5.flowAnnotate(this.A01, (String) A1J.getKey(), (String) A1J.getValue());
        }
        return this.A01;
    }

    public final void A02() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A04);
        while (A0u.hasNext()) {
            A00(this, A0u);
        }
        this.A03.flowEndSuccess(this.A01);
    }

    public final void A03(String str) {
        Iterator A0u = AnonymousClass7TF.A0u(this.A04);
        while (A0u.hasNext()) {
            A00(this, A0u);
        }
        this.A03.flowEndCancel(this.A01, str);
    }

    public final void A04(String str) {
        Iterator A0u = AnonymousClass7TF.A0u(this.A04);
        while (A0u.hasNext()) {
            A00(this, A0u);
        }
        this.A03.flowMarkPoint(this.A01, str);
    }

    public final void A05(String str, int i) {
        this.A04.put(str, String.valueOf(i));
    }

    public final void A06(String str, String str2) {
        Iterator A0u = AnonymousClass7TF.A0u(this.A04);
        while (A0u.hasNext()) {
            A00(this, A0u);
        }
        this.A03.flowEndFail(this.A01, str, str2);
    }

    public AE4(1QP r2) {
        this.A03 = r2;
    }

    public static void A00(AE4 ae4, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        ae4.A03.flowAnnotate(ae4.A01, (String) entry.getKey(), (String) entry.getValue());
    }
}
