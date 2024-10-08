package X;

import android.content.res.Resources;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import java.util.HashMap;
import java.util.List;

public final class WZN implements C322716wI {
    public final Resources A00;
    public final UserDetailFragment A01;
    public final UserDetailTabController A02;
    public final HashMap A03 = new HashMap();
    public final FragmentActivity A04;
    public final AnonymousClass4DH A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final AnonymousClass4DU A08;
    public final C322206vQ A09;
    public final AnonymousClass32Q A0A;
    public final List A0B;
    public final boolean A0C;

    public WZN(Resources resources, FragmentActivity fragmentActivity, AnonymousClass4DH r9, AnonymousClass0iw r10, UserSession userSession, AnonymousClass4DU r12, UserDetailFragment userDetailFragment, UserDetailTabController userDetailTabController, C322206vQ r15, AnonymousClass32Q r16, List list, boolean z) {
        AnonymousClass32Q r2 = r16;
        C51969G9p.A1N(resources, 3, r2);
        this.A04 = fragmentActivity;
        this.A05 = r9;
        this.A00 = resources;
        this.A02 = userDetailTabController;
        this.A0C = z;
        this.A01 = userDetailFragment;
        this.A09 = r15;
        this.A08 = r12;
        List<C294255m9> list2 = list;
        this.A0B = list2;
        this.A0A = r2;
        this.A07 = userSession;
        this.A06 = r10;
        for (C294255m9 r7 : list2) {
            C294265mA r1 = r7.A00;
            if (r1 == C294265mA.MAIN_GRID) {
                HashMap hashMap = this.A03;
                FragmentActivity fragmentActivity2 = this.A04;
                UserDetailFragment userDetailFragment2 = this.A01;
                C322206vQ r92 = this.A09;
                boolean z2 = this.A0C;
                hashMap.put(r1, new WZM(fragmentActivity2, this.A07, this, r7, userDetailFragment2, r92, this.A0A, z2));
            } else {
                throw new IllegalArgumentException("Unsupported feed source");
            }
        }
    }

    public static final WZM A00(WZN wzn, C294265mA r1) {
        Object obj = wzn.A03.get(r1);
        if (obj != null) {
            return (WZM) obj;
        }
        throw DbU.A0h();
    }
}
