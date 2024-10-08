package X;

import com.instagram.nux.fragment.OneTapLoginLandingFragment;
import java.util.Collections;
import java.util.List;

/* renamed from: X.E8l  reason: case insensitive filesystem */
public final class C47573E8l extends C331047Ph {
    public final EA3 A00;
    public final List A01 = AnonymousClass7TE.A1C();

    public final void A0C(List list) {
        List<Object> list2 = this.A01;
        list2.clear();
        list2.addAll(list);
        Collections.sort(list2, C49301Esk.A00);
        A06();
        for (Object A08 : list2) {
            A08(this.A00, A08);
        }
        A07();
    }

    public C47573E8l(AnonymousClass0iw r3, OneTapLoginLandingFragment oneTapLoginLandingFragment) {
        EA3 ea3 = new EA3(r3, oneTapLoginLandingFragment);
        this.A00 = ea3;
        A0B(ea3);
    }
}
