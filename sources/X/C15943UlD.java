package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.ui.FixedAspectRatioVideoLayout;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.UlD  reason: case insensitive filesystem */
public final class C15943UlD extends C14906UEl implements C20976X7p, X1S {
    public final FixedAspectRatioVideoLayout A00;
    public final C14332TuD A01;
    public final Activity A02;
    public final Context A03;
    public final View A04;
    public final UserSession A05;
    public final X9Q A06;

    public final void ABK(C232822uV r1, int i) {
    }

    public final void DQp(AnonymousClass3W1 r4, int i) {
        0qQ.A0B(r4, 0);
        super.DQp(r4, i);
        C52435GSn gSn = this.A00;
        if (gSn != null) {
            X9Q x9q = this.A06;
            if (i == 2) {
                x9q.Eqa(gSn.BPf(), r4.A22);
            } else if (i == 3) {
                x9q.EXG(gSn.BPf(), r4.A2H);
            }
        }
    }

    public final IgImageButton BGE() {
        return this.A0G;
    }

    public final /* bridge */ /* synthetic */ FixedAspectRatioVideoLayout BLn() {
        return this.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15943UlD(Activity activity, Context context, View view, UserSession userSession, X9Q x9q) {
        super(activity, context, view, userSession);
        C14332TuD tuD;
        C51974G9v.A1M(context, x9q, userSession);
        this.A04 = view;
        this.A03 = context;
        this.A06 = x9q;
        this.A05 = userSession;
        this.A02 = activity;
        FixedAspectRatioVideoLayout fixedAspectRatioVideoLayout = (FixedAspectRatioVideoLayout) AnonymousClass7TE.A0b(view, R.id.layout_container);
        this.A00 = fixedAspectRatioVideoLayout;
        if (fixedAspectRatioVideoLayout instanceof ViewGroup) {
            tuD = new C14332TuD((Activity) null, this.A01, fixedAspectRatioVideoLayout, (UserSession) null);
        } else {
            tuD = null;
        }
        this.A01 = tuD;
        view.setTag(this);
    }
}
