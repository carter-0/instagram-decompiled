package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4Jb  reason: invalid class name */
public final class AnonymousClass4Jb implements C262904Gl {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C256003v4 A02;
    public final /* synthetic */ 1Xj A03;

    public final void DqS() {
    }

    public final void DqT() {
    }

    public final void DqU() {
    }

    public AnonymousClass4Jb(Context context, UserSession userSession, C256003v4 r3, 1Xj r4) {
        this.A01 = userSession;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = context;
    }

    public final void DqR() {
        String str;
        C256003v4 r4;
        View A012;
        int i;
        UserSession userSession = this.A01;
        1Xj r0 = this.A03;
        boolean CeS = r0.CeS();
        boolean A51 = r0.A51();
        boolean A4L = r0.A4L();
        User CCd = r0.A0C.CCd();
        if (CCd != null) {
            str = CCd.getId();
        } else {
            str = null;
        }
        if (CeS && A51) {
            if ((!2R8.A05(userSession, str) || A4L) && (r4 = this.A02) != null && (A012 = r4.A03.A01()) != null) {
                int dimensionPixelSize = this.A00.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
                RectF rectF = 0nA.A01;
                if (A012.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.LayoutParams layoutParams = A012.getLayoutParams();
                    0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    i = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                } else {
                    i = 0;
                }
                C294975nL A013 = C294975nL.A01(A012, 1);
                A013.A0G();
                C294975nL A0D = A013.A0D(new C271654jN());
                A0D.A06 = new C65728Lyi(r4, i, dimensionPixelSize);
                A0D.A0H();
            }
        }
    }
}
