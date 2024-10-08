package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Set;

public final class OVU {
    public N4P A00;
    public OLT A01;
    public final int A02;
    public final Context A03;
    public final FragmentActivity A04;
    public final UserSession A05;
    public final NKQ A06;
    public final Set A07 = DbS.A0y();
    public final AnonymousClass0iw A08;

    public OVU(Context context, FragmentActivity fragmentActivity, AnonymousClass0iw r6, UserSession userSession, NKQ nkq, boolean z) {
        0qQ.A0B(userSession, 2);
        this.A03 = context;
        this.A05 = userSession;
        this.A04 = fragmentActivity;
        this.A06 = nkq;
        this.A08 = r6;
        this.A02 = C71026OZd.A00(userSession).A02(C67350MmR.DEFAULT, 0, z);
    }

    public static final void A00(OVU ovu) {
        N4P n4p = ovu.A00;
        OLT olt = ovu.A01;
        if (n4p != null && olt != null) {
            AnonymousClass1Nd.A00(ovu.A05).A00(new AnonymousClass7MR(C300965yF.A06(n4p.A0L), olt.A00));
        }
    }

    public final void A01() {
        N4P n4p = this.A00;
        if (n4p != null) {
            int size = this.A07.size();
            int size2 = 00k.A0a(n4p.A0T).size() + size;
            boolean z = true;
            boolean A1R = AnonymousClass7TF.A1R(size);
            if (size2 <= this.A02 / 2) {
                z = false;
            }
            NLD nld = this.A06.A04;
            if (nld != null) {
                C69656Npe npe = nld.A02;
                npe.A00 = A1R;
                npe.A02 = z;
                nld.notifyDataSetChanged();
            }
        }
    }
}
