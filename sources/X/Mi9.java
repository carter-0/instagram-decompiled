package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.navigation.ttrc.MPLTracker;
import java.util.Set;

public final class Mi9 extends AnonymousClass9HT {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C2366634p A04;
    public final C2366634p A05;
    public final C2366634p A06;
    public final C2366634p A07;
    public final C2366634p A08 = A02("on_resume_controller");
    public final C2366634p A09;
    public final C2366634p A0A;
    public final C2366634p A0B;
    public final C2366634p A0C;
    public final C2366634p A0D;
    public final AnonymousClass0eM A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public final void A05() {
        if (this.A0F && this.A0G) {
            AnonymousClass0eM r1 = this.A0E;
            if (((MPLTracker) r1.getValue()).isReady()) {
                ((MPLTracker) r1.getValue()).stopTrackingInteraction(this.A03, this.A00);
            }
        }
        A0K("is_tracking_offline_sync", AnonymousClass7TF.A1V(this.A0C));
        super.A05();
    }

    public final boolean A0S() {
        return !this.A0H;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Mi9(UserSession userSession, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(userSession, "threads", 1060769838, z, true);
        C2366634p r0;
        C2366634p r02;
        0qQ.A0B(userSession, 1);
        this.A0H = z2;
        this.A0G = z3;
        this.A0F = z5;
        C2366634p r03 = new C2366634p(this, "on_pause_controller");
        Set set = this.A06;
        set.add(r03);
        this.A07 = r03;
        C2366634p r04 = new C2366634p(this, "threads_metadata_retrieval");
        set.add(r04);
        this.A0D = r04;
        C2366634p r05 = new C2366634p(this, "open_threads_retrieval");
        set.add(r05);
        this.A09 = r05;
        this.A0A = A02("open_threads_view_model_calculation");
        this.A0B = A02("sub_iris");
        C2366634p r06 = new C2366634p(this, "initial_snapshot");
        set.add(r06);
        this.A06 = r06;
        C2366634p r1 = null;
        if (z3) {
            r0 = A02("armadillo_threads_retrieval");
        } else {
            r0 = null;
        }
        this.A04 = r0;
        if (z3) {
            r02 = A02("armadillo_threads_view_model_calculation");
        } else {
            r02 = null;
        }
        this.A05 = r02;
        if (z3 && z4) {
            r1 = A02("tam_sync_group_complete");
        }
        this.A0C = r1;
        AnonymousClass0eM A002 = AnonymousClass1YB.A00(C67202Mjy.A00);
        this.A0E = A002;
        this.A01 = 1;
        this.A00 = 1;
        this.A02 = 10;
        this.A03 = 1060769838;
        if (!182.A06(0Tu.A05, userSession, 36327576418925072L)) {
            A002.getValue();
        }
    }
}
