package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.filmstriptimeline.ScrollingTimelineView;

public final class LZ5 implements ViewTreeObserver.OnScrollChangedListener {
    public final int A00;
    public final Object A01;

    public LZ5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onScrollChanged() {
        C60063Jel jel;
        ViewTreeObserver viewTreeObserver;
        switch (this.A00) {
            case 0:
                C8131QhP qhP = (C8131QhP) this.A01;
                NestedScrollView nestedScrollView = qhP.A0E;
                if (nestedScrollView == null) {
                    0qQ.A0F("nestedScrollView");
                    throw AnonymousClass00P.createAndThrow();
                } else if (!nestedScrollView.canScrollVertically(1)) {
                    C8131QhP.A05(qhP);
                    return;
                } else {
                    return;
                }
            case 1:
                ScrollingTimelineView scrollingTimelineView = (ScrollingTimelineView) this.A01;
                if (scrollingTimelineView.A00) {
                    scrollingTimelineView.A03.getScrollX();
                    return;
                }
                return;
            case 2:
                LFW lfw = (LFW) this.A01;
                C60063Jel jel2 = lfw.A04;
                if (jel2.isShown() && jel2.getGlobalVisibleRect(AnonymousClass7TE.A0W())) {
                    0xa r2 = lfw.A09.A00;
                    boolean z = true;
                    if (!r2.getBoolean("PREFERENCE_SHARE_TO_BARCELONA_TOGGLE_SHOWN", false)) {
                        DbX.A1V(r2, "PREFERENCE_SHARE_TO_BARCELONA_TOGGLE_SHOWN", true);
                    }
                    LE1 le1 = lfw.A05;
                    Integer num = le1.A01;
                    boolean A1W = AnonymousClass7TF.A1W(num, AnonymousClass05K.A00);
                    LT4 lt4 = LT4.A00;
                    UserSession userSession = lfw.A03;
                    String str = null;
                    if (!A1W) {
                        str = XWV.A00(num).name();
                    }
                    MXB mxb = lfw.A07;
                    if (mxb == null || mxb.getId() == null) {
                        z = false;
                    }
                    lt4.A04(userSession, str, A1W, z);
                    lfw.A01.getViewTreeObserver().removeOnScrollChangedListener(this);
                    le1.A04 = false;
                    return;
                }
                return;
            case 3:
                C65229LpZ lpZ = (C65229LpZ) this.A01;
                C60063Jel jel3 = lpZ.A09;
                boolean z2 = true;
                if (jel3 != null && jel3.isShown() && (jel = lpZ.A09) != null && jel.getGlobalVisibleRect(AnonymousClass7TE.A0W())) {
                    0xa r3 = lpZ.A0O.A00;
                    if (!r3.getBoolean("PREFERENCE_SHARE_TO_BARCELONA_TOGGLE_SHOWN", false)) {
                        DbX.A1V(r3, "PREFERENCE_SHARE_TO_BARCELONA_TOGGLE_SHOWN", true);
                    }
                    AnonymousClass0Ud r6 = lpZ.A0K.A06;
                    LE1 le12 = (LE1) ((JU0) r6.getValue()).A03;
                    le12.A04 = false;
                    Integer num2 = le12.A01;
                    boolean A1W2 = AnonymousClass7TF.A1W(num2, AnonymousClass05K.A00);
                    LT4 lt42 = LT4.A00;
                    UserSession userSession2 = lpZ.A0J;
                    String str2 = null;
                    if (!A1W2) {
                        str2 = XWV.A00(num2).name();
                    }
                    MXB mxb2 = (MXB) ((JU0) r6.getValue()).A02;
                    if (mxb2 == null || mxb2.getId() == null) {
                        z2 = false;
                    }
                    lt42.A04(userSession2, str2, A1W2, z2);
                    View view = lpZ.A0I.mView;
                    if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                        viewTreeObserver.removeOnScrollChangedListener(this);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                C46656Dib dib = (C46656Dib) this.A01;
                if (dib.isResumed()) {
                    Dba.A0A(dib).A0Y(JTP.A1Y(dib.A0D));
                }
                Rect A0W = AnonymousClass7TE.A0W();
                View view2 = dib.A04;
                if (view2 != null) {
                    boolean globalVisibleRect = view2.getGlobalVisibleRect(A0W);
                    1Av A002 = 1Au.A00(dib.A0V);
                    if (globalVisibleRect && !AnonymousClass7TG.A1a(A002, A002.A28, 1Av.A8a, 290)) {
                        AnonymousClass5Gv r0 = dib.A0d;
                        if (r0 == null) {
                            AnonymousClass5Gt r32 = new AnonymousClass5Gt(dib.requireActivity(), new C315476jx((CharSequence) dib.getString(2131964814)));
                            r32.A04(dib.A04, 0, 0, true);
                            r32.A02();
                            r32.A0A = true;
                            r0 = r32.A00();
                            dib.A0d = r0;
                        }
                        if (!r0.A09()) {
                            dib.A04.postDelayed(new C66004M7p(A002, dib), 100);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                C64125LOw.A00((C64125LOw) this.A01);
                return;
        }
    }
}
