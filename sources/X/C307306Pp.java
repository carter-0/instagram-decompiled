package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.instagram.common.session.UserSession;

/* renamed from: X.6Pp  reason: invalid class name and case insensitive filesystem */
public final class C307306Pp {
    public 0sP A00;
    public final C307346Pt A01;
    public final C58840Ae A02;

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.6Ps] */
    public C307306Pp(View view, UserSession userSession) {
        ViewGroup viewGroup;
        0qQ.A0B(view, 2);
        0wc A002 = new AnonymousClass0kM(userSession).A00();
        this.A02 = A002;
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            0Tu r5 = 0Tu.A05;
            if (182.A06(r5, userSession, 36323994416262808L)) {
                AnonymousClass9I8 r7 = new AnonymousClass9I8(182.A06(r5, userSession, 2342167003630218908L), 182.A06(r5, userSession, 2342167003630481056L), 0);
                0sn r9 = 0sn.A00;
                0qQ.A0B(r9, 1);
                Context context = view.getContext();
                0qQ.A07(context);
                C307346Pt r3 = new C307346Pt(context, new C307316Pq(this), A002, r7, new Object(), r9);
                this.A01 = r3;
                viewGroup.addView(r3, viewGroup.indexOfChild(view), new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }
}
