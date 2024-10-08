package X;

import android.content.Context;
import android.util.Pair;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.Lh5  reason: case insensitive filesystem */
public final class C64728Lh5 implements 1DN {
    public final C21478XcN A00;
    public final /* synthetic */ C64100LMu A01;

    public final void DWm(Map map) {
        Map map2 = map;
        0qQ.A0B(map, 0);
        C346927vz A012 = 1DL.A01(map, C64100LMu.A05);
        0qQ.A07(A012);
        C346927vz r0 = C346927vz.GRANTED;
        C64100LMu lMu = this.A01;
        if (A012 == r0) {
            C339797kB r02 = lMu.A00;
            if (r02 != null) {
                r02.A00();
            }
            this.A00.A01();
        } else {
            C339797kB r3 = lMu.A00;
            if (r3 == null) {
                ViewGroup viewGroup = lMu.A04.A00;
                Context context = viewGroup.getContext();
                String A0K = 2Yu.A0K(context);
                r3 = JTQ.A0O(viewGroup);
                r3.A05(DbW.A0h(context, A0K, 2131954560));
                r3.A04(DbW.A0h(context, A0K, 2131954559));
                r3.A02(2131954558);
                r3.A03(LY5.A00(this, 50));
            }
            lMu.A00 = r3;
            if (r3 != null) {
                r3.A06(map);
            }
        }
        AnonymousClass4O9 r03 = AnonymousClass4O9.CAMERA;
        AnonymousClass4OA r32 = AnonymousClass4OA.UNSPECIFIED;
        List A1P = 0sr.A1P(new Pair[]{new Pair(r03, r32), new Pair(AnonymousClass4O9.MICROPHONE, r32)});
        UserSession userSession = lMu.A03;
        new AnonymousClass4O6(DbS.A0O("IgLivePermissionsController"), userSession).A01(AnonymousClass4O7.A00(userSession), "IG_LIVE_PERMISSIONS_CONTROLLER", A1P, AnonymousClass7TE.A1I(AnonymousClass4O8.UNKNOWN), map2);
    }

    public C64728Lh5(C21478XcN xcN, C64100LMu lMu) {
        this.A01 = lMu;
        this.A00 = xcN;
    }
}
