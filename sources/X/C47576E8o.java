package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.E8o  reason: case insensitive filesystem */
public final class C47576E8o extends C331047Ph {
    public final C47603E9p A00;
    public final C47604E9q A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final Map A03 = AnonymousClass7TE.A1E();
    public final Set A04 = AnonymousClass7TE.A1F();

    public final void A0C(String str, boolean z) {
        C49445Evm evm = (C49445Evm) this.A03.get(str);
        if (evm != null) {
            evm.A00 = z;
            Set set = this.A04;
            if (z) {
                set.add(str);
            } else {
                set.remove(str);
            }
            FK4();
        }
    }

    public final void A0D(List list) {
        List<Object> list2 = this.A02;
        list2.clear();
        Map map = this.A03;
        map.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                User A0k = DbT.A0k(it);
                C49445Evm evm = new C49445Evm(A0k);
                list2.add(evm);
                map.put(A0k.getId(), evm);
            }
            A06();
            for (Object A08 : list2) {
                A08(this.A00, A08);
            }
            A07();
        }
    }

    public C47576E8o(FragmentActivity fragmentActivity, E4j e4j, E4j e4j2, AnonymousClass0iw r7) {
        C47604E9q e9q = new C47604E9q(fragmentActivity, e4j2);
        this.A01 = e9q;
        C47603E9p e9p = new C47603E9p(e4j, r7);
        this.A00 = e9p;
        A0B(e9p, e9q);
    }
}
