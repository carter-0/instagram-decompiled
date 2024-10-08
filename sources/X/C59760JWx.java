package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.JWx  reason: case insensitive filesystem */
public final class C59760JWx extends C232232tF {
    public final UserSession A00;
    public final JWM A01;
    public final boolean A02;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        0qQ.A0B(viewGroup, 0);
        int i4 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        UserSession userSession = this.A00;
        if (this.A02) {
            i = this.A01.A0I;
        } else {
            i = 0;
        }
        Integer valueOf = Integer.valueOf(i);
        0qQ.A0B(userSession, 1);
        Context context = viewGroup.getContext();
        View A0A = DbU.A0A(LayoutInflater.from(context), viewGroup, R.layout.gallery_info_panel, false);
        0qQ.A07(context);
        0qQ.A0B(A0A, 1);
        C249703kE r7 = new C249703kE(A0A);
        TextView A0R = AnonymousClass7TG.A0R(A0A, R.id.text);
        03v.A07(A0R);
        DbT.A1H(A0R);
        String A012 = C63551Kz0.A00.A01(context, userSession);
        Object A002 = LNH.A00(context, userSession, A012, AnonymousClass7TE.A16(context, 2131962939), 182.A04(0Tu.A05, userSession, 36882683762049482L));
        if (A002 == null) {
            A002 = A012;
        }
        DbZ.A14(A0R, A002);
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            ViewGroup.MarginLayoutParams A0G = DbX.A0G(A0A);
            ViewGroup.LayoutParams layoutParams = A0A.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            int i5 = 0;
            if (marginLayoutParams != null) {
                i2 = marginLayoutParams.leftMargin;
            } else {
                i2 = 0;
            }
            ViewGroup.LayoutParams layoutParams2 = A0A.getLayoutParams();
            if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
                i3 = 0;
            } else {
                i3 = marginLayoutParams3.topMargin;
            }
            ViewGroup.LayoutParams layoutParams3 = A0A.getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                i5 = marginLayoutParams2.rightMargin;
            }
            A0G.setMargins(i2, i3, i5, intValue);
            A0A.setLayoutParams(A0G);
        }
        return r7;
    }

    public final Class modelClass() {
        return C64758Lha.class;
    }

    public C59760JWx(UserSession userSession, JWM jwm, boolean z) {
        this.A00 = userSession;
        this.A01 = jwm;
        this.A02 = z;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r1, C249703kE r2) {
    }
}
