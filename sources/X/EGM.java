package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

public final class EGM extends C232222tE {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final G8F A03;

    public EGM(Context context, AnonymousClass0iw r3, UserSession userSession, G8F g8f) {
        AnonymousClass7TG.A0w(2, userSession, g8f, r3);
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = g8f;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        Context context = this.A00;
        FrameLayout frameLayout = (FrameLayout) DbT.A0C(LayoutInflater.from(context), viewGroup, R.layout.directshare_row_user);
        frameLayout.setTag(new C47035DpR(context, frameLayout));
        Object tag = frameLayout.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.direct.ui.DirectRecipientRowViewBinder.Holder");
        return (C249703kE) tag;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r32, C249703kE r33) {
        FYM fym = (FYM) r32;
        C47035DpR dpR = (C47035DpR) r33;
        AnonymousClass7TF.A1H(fym, dpR);
        Context context = this.A00;
        UserSession userSession = this.A02;
        AnonymousClass0iw r28 = this.A01;
        int i = fym.A03;
        int i2 = fym.A00;
        int i3 = fym.A02;
        boolean z = fym.A0D;
        boolean z2 = fym.A0E;
        int i4 = fym.A01;
        DirectShareTarget directShareTarget = fym.A05;
        G8F g8f = this.A03;
        boolean z3 = fym.A0F;
        boolean z4 = fym.A0C;
        boolean z5 = fym.A0B;
        boolean z6 = fym.A0A;
        boolean z7 = fym.A09;
        C70167NyL.A00(userSession).A00.getBoolean("debug_overlay_enabled", false);
        boolean z8 = z7;
        DirectShareTarget directShareTarget2 = directShareTarget;
        int i5 = i2;
        int i6 = i3;
        AnonymousClass0iw r12 = r28;
        UserSession userSession2 = userSession;
        G8F g8f2 = g8f;
        C47035DpR dpR2 = dpR;
        Context context2 = context;
        C49759F5k.A01(context2, r12, userSession2, g8f2, dpR2, directShareTarget2, i, i5, i6, i4, z, z2, z3, z4, z5, z6, z8);
    }

    public final Class modelClass() {
        return FYM.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r3) {
        C47035DpR dpR = (C47035DpR) r3;
        0qQ.A0B(dpR, 0);
        this.A03.Dbs(dpR.A06);
    }
}
