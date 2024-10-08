package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class FBP {
    public List A00;
    public final C49888FBo A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final Set A03 = DbS.A0y();
    public final UserSession A04;
    public final boolean A05;

    public static final void A00(C49331Etm etm, FBP fbp, List list) {
        DirectShareTarget A012;
        fbp.A00 = list;
        fbp.A03.clear();
        ArrayList A013 = fbp.A01();
        EEP eep = etm.A00;
        EEP.A0B(eep, AnonymousClass05K.A01);
        C337257fy r0 = eep.A0E;
        if (!(r0 == null || (A012 = EEP.A01(eep, r0)) == null)) {
            A013.add(0, A012);
        }
        ArrayList A052 = EEP.A05(eep, A013);
        eep.A08.A05(A052);
        EEP.A0E(eep, A052);
    }

    public final ArrayList A01() {
        if (this.A05) {
            Set set = this.A03;
            if (set.isEmpty() && this.A02.isEmpty()) {
                List list = this.A00;
                if (list != null) {
                    set.addAll(list);
                }
                return AnonymousClass7TE.A1D(this.A03);
            }
        }
        List list2 = this.A02;
        if (AnonymousClass7TE.A1b(list2)) {
            List list3 = this.A00;
            if (list3 != null) {
                this.A03.addAll(list3);
            }
            Set set2 = this.A03;
            ArrayList A1D = AnonymousClass7TE.A1D(set2);
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                A1D.add(i, list2.get(i));
            }
            set2.clear();
            set2.addAll(A1D);
        }
        return AnonymousClass7TE.A1D(this.A03);
    }

    public FBP(UserSession userSession, Context context, boolean z) {
        this.A04 = userSession;
        this.A05 = z;
        this.A01 = new C49888FBo(context, (C290645fe) null, userSession, 1bJ.A00(userSession));
    }
}
