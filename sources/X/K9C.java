package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

public final class K9C extends C331047Ph implements AnonymousClass71P {
    public final C3499582p A00;
    public final KA2 A01;
    public final KA1 A02;
    public final C61494K9z A03;
    public final AnonymousClass32Q A04;
    public final List A05 = AnonymousClass7TE.A1C();
    public final Map A06 = AnonymousClass7TE.A1E();

    public final AnonymousClass6u8 BQA(String str) {
        Map map = this.A06;
        AnonymousClass6u8 r0 = (AnonymousClass6u8) map.get(str);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass6u8 r02 = new AnonymousClass6u8();
        map.put(str, r02);
        return r02;
    }

    public K9C(Context context, AnonymousClass0iw r10, UserSession userSession, C3499582p r12, C267834cI r13, AnonymousClass32Q r14, float f) {
        this.A00 = r12;
        this.A04 = r14;
        r13.EBv(new M9T(context, r12.A00(), this, r13));
        KA2 ka2 = new KA2(context, r10, userSession, r13, f);
        this.A01 = ka2;
        C61494K9z k9z = new C61494K9z();
        this.A03 = k9z;
        KA1 ka1 = new KA1(r10, userSession, r14);
        this.A02 = ka1;
        A0B(ka2, k9z, ka1);
    }

    public final void A0C() {
        A06();
        A08(this.A01, this.A00);
        List list = this.A05;
        if (list.size() > 1) {
            A08(this.A03, (Object) null);
            int size = list.size() / 3;
            for (int i = 0; i < size; i++) {
                C3251571g r2 = new C3251571g(list, i * 3, 3);
                AnonymousClass6u8 BQA = BQA(AnonymousClass7TF.A0h(r2));
                BQA.A00(i, AnonymousClass7TF.A1S(i, size - 1));
                A09(this.A02, r2, BQA);
            }
        }
        A07();
    }
}
