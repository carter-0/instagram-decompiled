package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.reels.store.ReelStore;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5kT  reason: invalid class name and case insensitive filesystem */
public final class C293285kT implements C228132kq {
    public final UserSession A00;
    public final C2365934i A01;
    public final AnonymousClass5GH A02;
    public final WeakReference A03;
    public final WeakReference A04;

    public C293285kT(Context context, UserSession userSession, C2365934i r4, C230232pF r5, AnonymousClass5GH r6) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r6, 3);
        0qQ.A0B(r5, 5);
        this.A00 = userSession;
        this.A02 = r6;
        this.A01 = r4;
        this.A03 = new WeakReference(context);
        this.A04 = new WeakReference(r5);
    }

    public final void DJL(boolean z) {
    }

    public final void DcX(boolean z, boolean z2) {
    }

    public final void Dcg(Integer num, int i, long j, boolean z) {
    }

    public final void Dch(1OE r1, String str, int i, long j, boolean z, boolean z2) {
    }

    public final /* synthetic */ void Dcj() {
    }

    public final void DWD(long j, int i) {
        C230232pF r0 = (C230232pF) this.A04.get();
        if (r0 != null) {
            r0.EGP(j, i);
        }
        this.A01.notifyDataSetChanged();
        Context context = (Context) this.A03.get();
        if (context != null) {
            C59689JTv.A0F(context, "stories_tray_load_more_failure", 2131974345);
        }
    }

    public final void DWE(long j) {
        ArrayList A0Q;
        C230232pF r0 = (C230232pF) this.A04.get();
        if (r0 != null) {
            r0.EGQ(j);
        }
        UserSession userSession = this.A00;
        ReelStore A05 = 1OP.A05(userSession);
        boolean A06 = 182.A06(0Tu.A05, userSession, 36324286475153359L);
        AnonymousClass5GH r1 = this.A02;
        if (A06) {
            A0Q = A05.A0T((List) null);
        } else {
            A0Q = A05.A0Q(r1.A00.getId());
        }
        r1.A04 = A0Q;
        this.A01.Ei9(new ArrayList(A0Q), false, userSession);
    }
}
