package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.instagram.common.session.UserSession;

/* renamed from: X.3yo  reason: invalid class name and case insensitive filesystem */
public final class C258313yo {
    public final C307346Pt A00;

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, X.6Ps] */
    public C258313yo(View view, UserSession userSession) {
        ViewGroup viewGroup;
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            0Tu r5 = 0Tu.A05;
            if (182.A06(r5, userSession, 36323994416328345L)) {
                AnonymousClass9I8 r8 = new AnonymousClass9I8(182.A06(r5, userSession, 2342167003630218908L), 182.A06(r5, userSession, 2342167003630481056L), 0);
                0sn r10 = 0sn.A00;
                0qQ.A0B(r10, 1);
                Context context = view.getContext();
                0qQ.A07(context);
                C307346Pt r4 = new C307346Pt(context, (C307326Pr) null, (C58840Ae) null, r8, new Object(), r10);
                this.A00 = r4;
                viewGroup.addView(r4, viewGroup.indexOfChild(view) + 1, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }
}
