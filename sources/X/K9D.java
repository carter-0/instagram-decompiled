package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

public final class K9D extends C331047Ph implements AnonymousClass71P {
    public final List A00 = AnonymousClass7TE.A1C();
    public final List A01 = AnonymousClass7TE.A1C();
    public final int A02;
    public final Context A03;
    public final K9U A04;
    public final C385239ic A05;
    public final Map A06 = AnonymousClass7TE.A1E();

    public final AnonymousClass6u8 BQA(String str) {
        0qQ.A0B(str, 0);
        Map map = this.A06;
        AnonymousClass6u8 r0 = (AnonymousClass6u8) map.get(str);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass6u8 r02 = new AnonymousClass6u8();
        map.put(str, r02);
        return r02;
    }

    public K9D(Context context, AnonymousClass0iw r10, UserSession userSession, AnonymousClass7Q6 r12, int i, int i2) {
        this.A03 = context;
        this.A02 = i;
        C385239ic r2 = new C385239ic(r10, userSession, r12, i, i2);
        this.A05 = r2;
        K9U k9u = new K9U(context, (AnonymousClass8MM) null);
        this.A04 = k9u;
        A0B(r2, k9u);
    }

    public static final void A00(K9D k9d) {
        k9d.A06();
        List list = k9d.A01;
        if (!list.isEmpty()) {
            k9d.A08(k9d.A04, new C61081JwJ((C61081JwJ) null, AnonymousClass7TF.A0d(k9d.A03.getResources(), 2131971356)));
            int i = k9d.A02;
            int A012 = JTP.A01((double) list.size(), (double) i);
            for (int i2 = 0; i2 < A012; i2++) {
                C3251571g r2 = new C3251571g(list, i2 * i, i);
                AnonymousClass6u8 BQA = k9d.BQA(AnonymousClass7TF.A0h(r2));
                BQA.A00(i2, AnonymousClass7TF.A1S(i2, A012 - 1));
                k9d.A09(k9d.A05, r2, BQA);
            }
        }
        k9d.A08(k9d.A04, new C61081JwJ((C61081JwJ) null, AnonymousClass7TF.A0d(k9d.A03.getResources(), 2131952878)));
        List list2 = k9d.A00;
        int i3 = k9d.A02;
        int A013 = JTP.A01((double) list2.size(), (double) i3);
        for (int i4 = 0; i4 < A013; i4++) {
            C3251571g r22 = new C3251571g(list2, i4 * i3, i3);
            AnonymousClass6u8 BQA2 = k9d.BQA(AnonymousClass7TF.A0h(r22));
            BQA2.A00(i4, AnonymousClass7TF.A1S(i4, A013 - 1));
            k9d.A09(k9d.A05, r22, BQA2);
        }
        k9d.A07();
    }
}
