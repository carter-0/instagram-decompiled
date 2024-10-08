package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.Utx  reason: case insensitive filesystem */
public final class C16380Utx extends C18014Vjq {
    public X5L A00;
    public final AnonymousClass4DH A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C270194gL A04;
    public final 0sL A05;
    public final boolean A06;

    public final void A03(String str) {
        C62258Kcs kcs;
        0qQ.A0B(str, 0);
        Object obj = this.A05.get(str);
        if ((obj instanceof C62258Kcs) && (kcs = (C62258Kcs) obj) != null) {
            GradientSpinner gradientSpinner = kcs.A06;
            gradientSpinner.A08();
            C294975nL.A05(new View[]{gradientSpinner}, false);
        }
    }

    public final void A04(String str) {
        C62258Kcs kcs;
        0qQ.A0B(str, 0);
        Object obj = this.A05.get(str);
        if ((obj instanceof C62258Kcs) && (kcs = (C62258Kcs) obj) != null) {
            GradientSpinner gradientSpinner = kcs.A06;
            gradientSpinner.A06();
            C294975nL.A07(new View[]{gradientSpinner}, true);
        }
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [X.X82, java.lang.Object] */
    public static final void A00(C16380Utx utx) {
        Context context;
        C18740VzL vzL = utx.A04;
        int size = vzL.A08.size();
        boolean z = true;
        ViewGroup.LayoutParams layoutParams = utx.A03.getLayoutParams();
        0qQ.A0C(layoutParams, C273654mx.A00(3));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (size > 1) {
            context = utx.A02;
            marginLayoutParams.setMargins(context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), 0, AnonymousClass7TF.A02(context, R.dimen.abc_edit_text_inset_top_material), 0);
        } else {
            boolean z2 = false;
            marginLayoutParams.setMargins(0, 0, 0, 0);
            context = utx.A02;
            0qQ.A07(context);
            DisplayMetrics A0H = 0nA.A0H(context);
            0qQ.A0B(A0H, 0);
            if (((float) A0H.widthPixels) / ((float) A0H.heightPixels) == 0.5625f) {
                z2 = true;
            }
            z = !z2;
        }
        int A012 = DbY.A01(context);
        vzL.A01 = new C18002Vje(new Object(), AnonymousClass7TF.A02(context, R.dimen.abc_edit_text_inset_top_material), context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), A012, z);
        vzL.A06.A01(new C17281VPi(vzL));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16380Utx(ConstraintLayout constraintLayout, AnonymousClass4DH r4, AnonymousClass0iw r5, UserSession userSession, C270194gL r7, X5L x5l, 0sL r9, boolean z) {
        super(constraintLayout);
        AnonymousClass7TG.A1Q(constraintLayout, userSession);
        this.A01 = r4;
        this.A03 = userSession;
        this.A00 = x5l;
        this.A05 = r9;
        this.A02 = r5;
        this.A06 = z;
        this.A04 = r7;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        0qQ.A0C(layoutParams, C273654mx.A00(3));
        ((C71492dQ) layoutParams).A0z = "9:16";
        A00(this);
    }
}
