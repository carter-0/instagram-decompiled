package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.NOh  reason: case insensitive filesystem */
public final class C68585NOh extends C232222tE {
    public final int A00;
    public final int A01 = 6;
    public final Context A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final AnonymousClass7Q6 A05;
    public final boolean A06;

    public C68585NOh(Context context, AnonymousClass0iw r3, UserSession userSession, AnonymousClass7Q6 r5, int i, boolean z) {
        this.A04 = userSession;
        this.A02 = context;
        this.A03 = r3;
        this.A00 = i;
        this.A05 = r5;
        this.A06 = z;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r14, C249703kE r15) {
        Object obj;
        C71974Otz otz = (C71974Otz) r14;
        C67911Mwt mwt = (C67911Mwt) r15;
        boolean A1Z = AnonymousClass7TG.A1Z(otz, mwt);
        UserSession userSession = this.A04;
        AnonymousClass0iw r6 = this.A03;
        C3251571g r3 = otz.A01;
        float f = otz.A00;
        AnonymousClass7Q6 r9 = this.A05;
        boolean z = this.A06;
        DbZ.A0t(A1Z ? 1 : 0, userSession, r6, r3);
        0qQ.A0B(r9, 5);
        View[] viewArr = mwt.A00;
        int length = viewArr.length;
        for (int i = 0; i < length; i++) {
            View view = viewArr[i];
            if (view != null) {
                obj = view.getTag();
            } else {
                obj = null;
            }
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.ui.widget.emojigrid.EmojiGridRowItemViewBinder.Holder");
            C337057fc r10 = (C337057fc) obj;
            if (i < r3.A01()) {
                C337077fe.A03(r6, userSession, (C317486nL) r3.A02(i), r9, r10, f, !z);
            } else {
                C337077fe.A04(r10);
            }
        }
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        Context context = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        0qQ.A0B(context, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(i, -2));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
        linearLayout.setPadding(dimensionPixelSize, 0, dimensionPixelSize, AnonymousClass7TG.A05(context));
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.container_height);
        C67911Mwt mwt = new C67911Mwt(linearLayout, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            IgFrameLayout A012 = C337077fe.A01(context, dimensionPixelSize2, AnonymousClass7TF.A1T(i3, i2 - 1));
            mwt.A00[i3] = A012;
            linearLayout.addView(A012);
        }
        return mwt;
    }

    public final Class modelClass() {
        return C71974Otz.class;
    }
}
