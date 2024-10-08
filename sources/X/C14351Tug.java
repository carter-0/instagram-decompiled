package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.ui.FixedAspectRatioVideoLayout;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.Tug  reason: case insensitive filesystem */
public final class C14351Tug extends C14331TuC implements C20976X7p, X1S {
    public final FixedAspectRatioVideoLayout A00;
    public final Activity A01;
    public final Context A02;
    public final View A03;
    public final UserSession A04;
    public final X9Q A05;

    public final void ABK(C232822uV r1, int i) {
    }

    public final void DQp(AnonymousClass3W1 r4, int i) {
        0qQ.A0B(r4, 0);
        super.DQp(r4, i);
        C52435GSn gSn = this.A00;
        if (gSn != null) {
            X9Q x9q = this.A05;
            if (i == 2) {
                x9q.Eqa(gSn.BPf(), r4.A22);
            } else if (i == 3) {
                x9q.EXG(gSn.BPf(), r4.A2H);
            }
        }
    }

    public final IgImageButton BGE() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ FixedAspectRatioVideoLayout BLn() {
        return this.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14351Tug(Activity activity, Context context, View view, UserSession userSession, X9Q x9q) {
        super(activity, context, view, userSession);
        C51974G9v.A1M(context, x9q, userSession);
        this.A03 = view;
        this.A02 = context;
        this.A05 = x9q;
        this.A04 = userSession;
        this.A01 = activity;
        this.A00 = (FixedAspectRatioVideoLayout) AnonymousClass7TE.A0b(view, R.id.layout_container);
        view.setTag(this);
    }
}
