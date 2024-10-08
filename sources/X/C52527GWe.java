package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.GWe  reason: case insensitive filesystem */
public final class C52527GWe implements X41 {
    public final /* synthetic */ AnonymousClass32L A00;

    public C52527GWe(AnonymousClass32L r1) {
        this.A00 = r1;
    }

    public final void ECL(View view, C296995qz r11, C296905qq r12, C296935qt r13, boolean z) {
        0qQ.A0B(view, 0);
        0qQ.A0B(r11, 3);
        GXK gxk = this.A00.A0K;
        if (gxk == null) {
            0qQ.A0F("exploreHomeViewpointHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        C2354830a A002 = AnonymousClass30Y.A00(r13, new C52528GWf(r11, r12), r13.getKey());
        A002.A00(gxk.A05);
        boolean z2 = r13 instanceof C52435GSn;
        if (z2) {
            A002.A00(gxk.A01);
            A002.A00(gxk.A06);
            if (182.A06(0Tu.A05, gxk.A00, 36315155374017576L)) {
                GXM gxm = gxk.A04;
                gxm.A00.put(r13, view);
                A002.A00(gxm);
            }
        }
        UserSession userSession = gxk.A00;
        0Tu r6 = 0Tu.A05;
        if (182.A06(r6, userSession, 36315902699966127L)) {
            try {
                for (C233612w1 r4 : gxk.A08) {
                    if (z2) {
                        r4.ABg(A002);
                    } else if (182.A06(r6, userSession, 36315902700162738L)) {
                        r4.ABd(A002);
                    }
                }
            } catch (Exception unused) {
                0wj.A01.AEf("exception while casting viewpointDataBuilder", 817903268).report();
            }
        }
        GWX gwx = gxk.A03;
        if (gwx != null && z && (r13 instanceof C296955qv) && ((C296955qv) r13).CP9()) {
            A002.A00(gwx);
        }
        GWU gwu = gxk.A07;
        if (gwu != null) {
            A002.A00(gwu);
        }
        gxk.A02.A05(view, A002.A01());
    }
}
