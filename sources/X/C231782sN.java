package X;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.litho.LithoView;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.2sN  reason: invalid class name and case insensitive filesystem */
public final class C231782sN extends C231632rz {
    public C2364233r A00;
    public C2363633l A01;
    public final FragmentActivity A02;
    public final AnonymousClass07Z A03;
    public final UserSession A04;
    public final C230072os A05;
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A00(0eO.A02, new C377219Kz(this, 14));
    public final boolean A07;
    public final boolean A08;
    public final AnonymousClass0iw A09;
    public final boolean A0A;

    public C231782sN(FragmentActivity fragmentActivity, AnonymousClass07Z r5, AnonymousClass0iw r6, UserSession userSession, C230072os r8, boolean z) {
        0qQ.A0B(fragmentActivity, 1);
        0qQ.A0B(r8, 3);
        0qQ.A0B(r5, 4);
        this.A02 = fragmentActivity;
        this.A04 = userSession;
        this.A05 = r8;
        this.A03 = r5;
        this.A09 = r6;
        this.A0A = z;
        this.A08 = C231492rl.A00(userSession).A0U;
        this.A07 = 182.A06(0Tu.A05, userSession, 36326339468801753L);
    }

    public final void A00(AnonymousClass322 r7, C2363233h r8) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(r8, 1);
        this.A01 = new C2363633l(r8, true);
        FragmentActivity fragmentActivity = this.A02;
        UserSession userSession = this.A04;
        this.A00 = new C2364233r(fragmentActivity, this.A09, userSession, r7, this.A0A);
    }

    public final String getBinderGroupName() {
        return "TifuNetego";
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        String str = ((C274594oe) obj).A03.A09;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        String str = ((C274594oe) obj).A03.A09;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final int getViewTypeCount() {
        return 3;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r5, Object obj, Object obj2) {
        C274594oe r6 = (C274594oe) obj;
        AnonymousClass5O4 r7 = (AnonymousClass5O4) obj2;
        0qQ.A0B(r5, 0);
        0qQ.A0B(r6, 1);
        0qQ.A0B(r7, 2);
        if (r7.CdP()) {
            r5.A7U(1);
        } else if (this.A08) {
            r5.A7U(2);
        } else {
            r5.A7U(0);
        }
        this.A05.A9R(r6, r7);
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        IllegalStateException illegalStateException;
        int i2;
        int A032 = AnonymousClass0fD.A03(354450609);
        0qQ.A0B(view, 1);
        0qQ.A0B(obj, 2);
        0qQ.A0B(obj2, 3);
        C274594oe r11 = (C274594oe) obj;
        if (i == 0) {
            C2364233r r5 = this.A00;
            if (r5 != null) {
                r5.A02(view, r11.A06, new AnonymousClass9IV(r11, (AnonymousClass5O4) obj2), new C377219Kz(r11, 13));
            } else {
                illegalStateException = new IllegalStateException("Required value was null.");
                i2 = -550443643;
                AnonymousClass0fD.A0A(i2, A032);
                throw illegalStateException;
            }
        } else if (i == 1) {
            C2363633l r2 = this.A01;
            if (r2 != null) {
                r2.A01(view, this.A04, r11, obj2);
            }
        } else if (i == 2) {
            C232502tp r22 = (C232502tp) this.A06.getValue();
            if (r22 != null) {
                LithoView lithoView = (LithoView) view;
                String str = r11.A03.A09;
                if (str == null) {
                    str = "";
                }
                r22.A05(lithoView, str, DJ4.A00, new C58178Ini(r11, 38), DJ5.A00);
            }
        } else {
            illegalStateException = new IllegalStateException(002.A0O(AnonymousClass000.A00(235), i));
            i2 = 965278981;
            AnonymousClass0fD.A0A(i2, A032);
            throw illegalStateException;
        }
        this.A05.EBq(view, r11);
        AnonymousClass0fD.A0A(-709786581, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        IllegalStateException th;
        int i2;
        LithoView composeView;
        LithoView lithoView;
        int A032 = AnonymousClass0fD.A03(12352804);
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup, 1);
        if (i == 0) {
            C2364233r r7 = this.A00;
            if (r7 != null) {
                UserSession userSession = this.A04;
                0qQ.A0B(userSession, 1);
                if (Systrace.A0E(1)) {
                    0fS.A01("TifuNetegoComposeBinder.newView", 472590740);
                }
                try {
                    if (182.A06(0Tu.A05, userSession, 36326339468539605L)) {
                        LayoutInflater from = LayoutInflater.from(r7.A00);
                        0qQ.A07(from);
                        composeView = 2Su.A01(from, (ViewGroup.LayoutParams) null, viewGroup2, R.layout.tifu_unit, false, false);
                    } else {
                        composeView = new ComposeView(r7.A00, (AttributeSet) null, 0);
                    }
                    0qQ.A0C(composeView, "null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
                    lithoView = (ComposeView) composeView;
                    composeView.setTag(new C293715lE(lithoView));
                    if (Systrace.A0E(1)) {
                        0fS.A00(-1017870819);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (Systrace.A0E(1)) {
                        0fS.A00(-2107865961);
                        throw th;
                    }
                }
            } else {
                th = new IllegalStateException("Required value was null.");
                i2 = 2113266376;
                AnonymousClass0fD.A0A(i2, A032);
                throw th;
            }
        } else if (i != 1) {
            if (i == 2) {
                C232502tp r0 = (C232502tp) this.A06.getValue();
                if (r0 != null) {
                    lithoView = r0.A03();
                } else {
                    th = new IllegalStateException("Litho binder is null");
                    i2 = 156804146;
                }
            } else {
                th = new IllegalStateException(002.A0O(AnonymousClass000.A00(235), i));
                i2 = -1671763874;
            }
            AnonymousClass0fD.A0A(i2, A032);
            throw th;
        } else {
            lithoView = C2363733m.A00(this.A02, viewGroup, "v1", 2);
        }
        AnonymousClass0fD.A0A(1090380564, A032);
        return lithoView;
    }
}
