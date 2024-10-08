package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.JpH  reason: case insensitive filesystem */
public final class C60670JpH extends C249703kE {
    public C65824M0q A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final UserSession A04;
    public final AnonymousClass3NL A05 = new C61685KHt(this, 18);
    public final C60429JlM A06;
    public final MediaFrameLayout A07;

    /* JADX WARNING: type inference failed for: r0v5, types: [X.M0q, java.lang.Object] */
    public C60670JpH(View view, UserSession userSession, C60429JlM jlM) {
        super(view);
        Context context = view.getContext();
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) view;
        this.A07 = mediaFrameLayout;
        TextView A062 = Dba.A06(view);
        this.A03 = A062;
        this.A02 = DbU.A0G(view, R.id.headline);
        this.A01 = DbU.A0G(view, R.id.action_button);
        this.A04 = userSession;
        this.A06 = jlM;
        ? obj = new Object();
        obj.A00 = context;
        obj.A01 = userSession;
        this.A00 = obj;
        if (context != null) {
            A062.setTypeface(AnonymousClass7TG.A0O(context));
            int A09 = 0nA.A09(context);
            0nA.A0f(mediaFrameLayout, A09);
            0nA.A0V(mediaFrameLayout, A09);
        }
    }
}
