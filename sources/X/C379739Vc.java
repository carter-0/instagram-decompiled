package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.9Vc  reason: invalid class name and case insensitive filesystem */
public class C379739Vc extends C360678ey {
    public final 1OC A00;

    public final int getRunnableId() {
        return -8;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.8fd] */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, X.8fd] */
    public final C361098ff A01(C379749Vd r13) {
        boolean z = this instanceof C379789Vh;
        C270864hR A002 = r13.A00();
        if (z) {
            C246643ew A01 = A002.A01();
            C277014uI r2 = A01.A03;
            String str = null;
            if (r2 == null) {
                throw new Exception("Could not parse response into BloksActionParseResult");
            }
            List list = A01.A07;
            List list2 = A01.A09;
            Map A06 = C3034368u.A06(A01.A08);
            C3034268t r4 = A01.A02;
            List list3 = A01.A0A;
            Map map = A01.A0F;
            List list4 = A01.A0E;
            C277054uM r0 = A01.A01;
            if (r0 != null) {
                str = r0.A00;
            }
            r13.A00();
            r13.A00();
            return new C379799Vi(new C46620Di0(new Object(), new C3034468v(r4, list, list3, (List) null, list2, list4, A06, map), r2, str), 1, r13.A01, r13.A00);
        } else if (A002.A01().A00 == null) {
            throw new Exception("Could not parse response into BloksParseResult");
        } else {
            r13.A00();
            r13.A00();
            return new C361088fe(C3034368u.A02(new Object(), r13.A00().A01()), r13.A01, r13.A00);
        }
    }

    public final String getName() {
        return this.A00.A05;
    }

    public final void onCancel() {
        this.A00.onCancel();
    }

    public final void onFinish() {
        this.A00.onFinish();
    }

    public final void onStart() {
        this.A00.onStart();
    }

    public final void run() {
        this.A00.run();
    }

    public C379739Vc(1OC r3) {
        this.A00 = r3;
        r3.A00 = new C385479j0(this, 2);
    }
}
