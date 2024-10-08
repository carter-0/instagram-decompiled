package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.textview.IgTextLayoutView;

/* renamed from: X.5w1  reason: invalid class name */
public final class AnonymousClass5w1 extends C249703kE implements AnonymousClass2xU {
    public AnonymousClass9IE A00;
    public UserSession A01;
    public AnonymousClass4DU A02;
    public AnonymousClass3W1 A03;
    public final IgTextLayoutView A04;
    public final 0Pl A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5w1(View view, 0Pl r3) {
        super(view);
        0qQ.A0B(view, 1);
        this.A05 = r3;
        View findViewById = view.findViewById(R.id.row_feed_headline);
        0qQ.A07(findViewById);
        this.A04 = (IgTextLayoutView) findViewById;
    }

    public final void DQp(AnonymousClass3W1 r10, int i) {
        0qQ.A0B(r10, 0);
        if (i == 4) {
            Context context = this.A04.getContext();
            0qQ.A07(context);
            AnonymousClass9IE r0 = this.A00;
            if (r0 != null) {
                1Xj r5 = (1Xj) r0.A00;
                int i2 = r10.A02;
                0Pl r7 = this.A05;
                AnonymousClass4DU r6 = this.A02;
                if (r6 != null) {
                    UserSession userSession = this.A01;
                    if (userSession != null) {
                        AnonymousClass5w0.A02(context, userSession, this, r5, r6, r7, i2);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
