package X;

import android.app.Activity;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.OLt  reason: case insensitive filesystem */
public final class C70798OLt {
    public final Handler A00;
    public final Fragment A01;
    public final AvatarStore A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final OJR A05;
    public final AnonymousClass7SM A06;
    public final 1ap A07;
    public final C72206OyW A08;
    public final WeakReference A09;
    public final WeakReference A0A;

    public /* synthetic */ C70798OLt(Fragment fragment, FragmentActivity fragmentActivity, RecyclerView recyclerView, AnonymousClass0iw r10, UserSession userSession, AnonymousClass7SM r12) {
        1ap r5 = 1as.A04.A02;
        C72206OyW oyW = new C72206OyW(userSession);
        OJR ojr = new OJR(userSession);
        AvatarStore A002 = 25x.A00(userSession);
        Handler A0D = AnonymousClass7TF.A0D();
        0qQ.A0B(r10, 2);
        AnonymousClass7TG.A1S(recyclerView, r5);
        0qQ.A0B(A002, 10);
        this.A04 = userSession;
        this.A03 = r10;
        this.A01 = fragment;
        this.A07 = r5;
        this.A08 = oyW;
        this.A06 = r12;
        this.A05 = ojr;
        this.A02 = A002;
        this.A00 = A0D;
        this.A09 = C51965G9l.A0v(fragmentActivity);
        this.A0A = C51965G9l.A0v(recyclerView);
    }

    public final void A00(boolean z) {
        AnonymousClass37D A0i;
        Activity activity = (Activity) this.A09.get();
        if (activity != null && (A0i = DbT.A0i(activity)) != null && A0i.A09() != null) {
            if (z) {
                C72964PQw.A00(this, 1, A0i);
            }
            A0i.A0B();
        } else if (z) {
            this.A00.postDelayed(new PV2(this), 100);
        }
    }
}
