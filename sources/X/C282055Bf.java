package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.5Bf  reason: invalid class name and case insensitive filesystem */
public abstract class C282055Bf implements AnonymousClass2eo {
    public View A00;
    public final int A01;
    public final View A02;

    public void A00(Rect rect, int i) {
        rect.left = ((C282045Be) this).A00 - i;
    }

    public final void Ann(Rect rect) {
        0qQ.A0B(rect, 0);
        View view = this.A00;
        if (view == null) {
            view = this.A02.findViewById(R.id.carousel_viewpager);
            this.A00 = view;
            if (view == null) {
                return;
            }
        }
        view.getGlobalVisibleRect(rect);
        A00(rect, this.A01);
    }

    public C282055Bf(View view, UserSession userSession) {
        this.A02 = view;
        0Tu r6 = 0Tu.A05;
        Context context = view.getContext();
        0qQ.A07(context);
        this.A01 = C61380mr.A01(context, (int) ((182.A01(r6, userSession, 36612259736787259L) / Math.max(182.A01(r6, userSession, 36612259736852796L), 1)) + 182.A01(r6, userSession, 36612259736721722L) + 1));
    }
}
