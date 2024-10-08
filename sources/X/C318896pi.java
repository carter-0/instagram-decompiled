package X;

import com.instagram.profile.fragment.UserDetailTabController;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6pi  reason: invalid class name and case insensitive filesystem */
public final class C318896pi implements C13907Tl7 {
    public C238133Ar A00;
    public final C228172ku A01 = new C228172ku();
    public final List A02 = new ArrayList();
    public final C318906pj A03 = new C318906pj(this);
    public final UserDetailTabController A04;

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onDestroy(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    public final void A00() {
        C238133Ar r1 = this.A00;
        if (r1 != null) {
            r1.EEZ(this.A03);
        }
        C238133Ar A0A = this.A04.A0A();
        this.A00 = A0A;
        if (A0A != null) {
            A0A.AAD(this.A03);
        }
        for (C318916pk r12 : this.A02) {
            r12.A02 = -1;
        }
    }

    public final void onPause(AnonymousClass07Z r3) {
        C238133Ar r1 = this.A00;
        if (r1 != null) {
            r1.EEZ(this.A03);
        }
        this.A00 = null;
    }

    public C318896pi(UserDetailTabController userDetailTabController) {
        this.A04 = userDetailTabController;
    }

    public final void onResume(AnonymousClass07Z r1) {
        A00();
    }
}
