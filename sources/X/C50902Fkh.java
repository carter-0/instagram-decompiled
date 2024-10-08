package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Fkh  reason: case insensitive filesystem */
public final class C50902Fkh implements G7K {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C50902Fkh(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void Dje(List list) {
        if (this.A00 != 0) {
            0qQ.A0B(list, 0);
            C19200WPg wPg = (C19200WPg) this.A02;
            Object obj = this.A01;
            boolean A1a = AnonymousClass7TE.A1a(list.get(0));
            Activity activity = wPg.A01;
            C290815g0 A022 = C59730JVo.A02(activity, wPg.A07, wPg.A0A, AnonymousClass000.A00(4396), false, A1a);
            A022.A00 = new EHO(3, obj, wPg);
            SQH.A02(wPg.A04);
            1ES.A00(activity, wPg.A05, A022);
            return;
        }
        0qQ.A0B(list, 0);
        List<1Xj> list2 = (List) this.A01;
        if (list2.size() == 1 && DbZ.A0T(list2, 0).CeS()) {
            E5G e5g = (E5G) this.A02;
            if (!182.A06(0Tu.A05, DbT.A0X(e5g.A05), 36319884132753096L)) {
                C358248ab A0U = DbW.A0U(e5g);
                A0U.A09(2131963474);
                A0U.A08(2131963473);
                Dba.A1L(A0U);
                return;
            }
        }
        Fragment fragment = (E5G) this.A02;
        Object A14 = AnonymousClass7TE.A14(fragment.A02);
        ArrayList A0r = AnonymousClass7TG.A0r(list2);
        for (1Xj A002 : list2) {
            A0r.add(((AnonymousClass72Q) fragment.A04.getValue()).A00(A002));
        }
        List A0a = 00k.A0a(A0r);
        0gy A003 = AnonymousClass07i.A00(fragment);
        C290815g0 A012 = ((AnonymousClass72Q) fragment.A04.getValue()).A01(A0a, list);
        A012.A00 = new C61675KGz(0, fragment, list2, A003, A14);
        1ES.A00(fragment.requireActivity(), A003, A012);
    }

    public final void onCancel() {
        throw AnonymousClass00P.createAndThrow();
    }
}
