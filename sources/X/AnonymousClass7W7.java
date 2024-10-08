package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7W7  reason: invalid class name */
public final class AnonymousClass7W7 implements 27S {
    public final /* synthetic */ C332677Vy A00;

    public AnonymousClass7W7(C332677Vy r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        2Cy r6 = (2Cy) obj;
        0qQ.A0B(r6, 0);
        C332677Vy r4 = this.A00;
        AnonymousClass7S7 C6l = ((C333517Zg) r4.A0W.get()).C6l();
        AnonymousClass2Ep Cms = C6l.Cms();
        if (Cms == null || Cms.C6a() != 1014) {
            return false;
        }
        List C6O = C6l.C6O();
        User user = r6.A00;
        if (!C6O.contains(user.getId()) || !0qQ.A0K(r4.A0J.A06, user.A03.AaR())) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-2037876452);
        int A032 = AnonymousClass0fD.A03(1820798245);
        AnonymousClass7FA r2 = (AnonymousClass7FA) this.A00.A0R.get();
        if (r2 != null) {
            r2.A0A.reset();
            AnonymousClass7FA.A00(r2);
            r2.A05 = false;
            AnonymousClass7FA.A01(r2);
        }
        AnonymousClass0fD.A0A(-42322481, A032);
        AnonymousClass0fD.A0A(659937739, A03);
    }
}
