package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.QhD  reason: case insensitive filesystem */
public final class C8121QhD extends RRI {
    public final Context A00;
    public final C340027ka A01;
    public final C340027ka A02;
    public final C13895TjI A03;
    public final UserSession A04;

    public C8121QhD(Context context, C340027ka r3, C13895TjI tjI, UserSession userSession) {
        if (context != null) {
            this.A00 = Q6J.A00(context);
        }
        this.A01 = r3;
        this.A00 = context;
        this.A03 = tjI;
        this.A04 = userSession;
        this.A02 = r3;
    }

    public static final void A00(View view, int i) {
        View findViewById;
        if (182.A06(0Tu.A05, C11431STx.A00(), 36313514697164844L) && (findViewById = view.findViewById(R.id.webview_container)) != null) {
            findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), i);
            findViewById.requestLayout();
        }
    }
}
