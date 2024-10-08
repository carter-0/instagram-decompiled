package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4DF  reason: invalid class name */
public final class AnonymousClass4DF {
    public int A00 = R.id.modal_container;
    public WeakReference A01;
    public WeakReference A02;
    public WeakReference A03;
    public WeakReference A04;
    public boolean A05 = true;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final UserSession A09;
    public final List A0A = new ArrayList();
    public final AnonymousClass2Za A0B;

    public AnonymousClass4DF(UserSession userSession, AnonymousClass2Za r4) {
        0qQ.A0B(userSession, 1);
        this.A09 = userSession;
        this.A0B = r4;
    }

    public static final 0hq A00(AnonymousClass4DF r1) {
        Fragment fragment;
        if (!r1.A08) {
            return r1.A0B.B7w();
        }
        WeakReference weakReference = r1.A01;
        if (weakReference == null || (fragment = (Fragment) weakReference.get()) == null) {
            return null;
        }
        return fragment.getChildFragmentManager();
    }

    public static final C66914Mey A01(AnonymousClass4DF r0) {
        WeakReference weakReference = r0.A02;
        if (weakReference != null) {
            return (C66914Mey) weakReference.get();
        }
        return null;
    }

    public static final void A02(AnonymousClass4DF r1) {
        C2356430q r0;
        WeakReference weakReference = r1.A03;
        if (!(weakReference == null || (r0 = (C2356430q) weakReference.get()) == null)) {
            r0.DSB();
        }
        for (C2356430q DSB : r1.A0A) {
            DSB.DSB();
        }
    }

    public final void A04() {
        this.A0A.clear();
        if (A05() && this.A07) {
            if (182.A06(0Tu.A06, this.A09, 36311569077830264L)) {
                A03();
            }
        }
    }

    public final void A03() {
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        AnonymousClass0iw r8;
        0hq A002;
        C66914Mey A012 = A01(this);
        if (A012 == null || !A012.isAdded()) {
            throw new IllegalStateException("Check failed.");
        }
        0hq A003 = A00(this);
        if (A003 != null) {
            UserSession userSession = this.A09;
            C71342cb.A00(userSession).A0D(A012, "back", A003.A0M());
            FragmentActivity activity = A012.getActivity();
            if (activity != null && !activity.isFinishing() && !A003.A12()) {
                0Tu r82 = 0Tu.A05;
                if (182.A06(r82, userSession, 36311569076912746L)) {
                    0s1 r0 = new 0s1(A003);
                    r0.A03(A012);
                    r0.A00();
                }
                if (!182.A06(r82, userSession, 36311569076978283L) || !((A002 = A00(this)) == null || A002.A0R(AnonymousClass000.A00(979)) == null)) {
                    A003.A0y(AnonymousClass000.A00(979), 1);
                    A003.A0a();
                }
            }
            this.A02 = null;
            A02(this);
            AnonymousClass2Za r1 = this.A0B;
            AnonymousClass0iw AuG = r1.AuG();
            WeakReference weakReference = this.A04;
            if (weakReference != null && (r8 = (AnonymousClass0iw) weakReference.get()) != null && 0qQ.A0K(r1.AuG().getModuleName(), "direct_inbox") && 182.A06(0Tu.A05, userSession, 36311569076650598L)) {
                0Tu r7 = 0Tu.A06;
                if (182.A06(r7, userSession, 36311569076126302L) || 182.A06(r7, userSession, 36311569077109357L)) {
                    AuG = r8;
                }
            }
            C71342cb.A00(userSession).A0E("unknown", AuG);
            if (activity != null) {
                if (!(this.A06 || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (viewTreeObserver = decorView.getViewTreeObserver()) == null)) {
                    viewTreeObserver.addOnGlobalLayoutListener(new C71446Okl(activity, decorView));
                }
                C66732Mbd.A01(activity, (View) null, userSession);
            }
            this.A08 = false;
            this.A07 = false;
            this.A01 = null;
            this.A04 = null;
            this.A06 = false;
        }
    }

    public final boolean A05() {
        C66914Mey A012 = A01(this);
        if (A012 == null || !A012.isAdded()) {
            return false;
        }
        return true;
    }

    public final boolean A06() {
        C66914Mey A012 = A01(this);
        if (A012 == null || !A012.isVisible()) {
            return false;
        }
        return true;
    }
}
