package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.7JH  reason: invalid class name */
public abstract class AnonymousClass7JH {
    public static final AnonymousClass7JI A00(Context context, UserSession userSession, C331037Pg r5, AnonymousClass7JG r6, AnonymousClass7JE r7, C254783t2 r8, boolean z, boolean z2) {
        0qQ.A0B(context, 1);
        AnonymousClass7JI r2 = new AnonymousClass7JI(context, userSession, r5, r6, r7, r8, z, z2);
        GestureDetector gestureDetector = new GestureDetector(r2.A0L, r2);
        r2.A06 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        AnonymousClass7JE r0 = r2.A0R;
        View view = r0.A00;
        if (view != null) {
            r0.A00 = view;
            view.setOnTouchListener(new AnonymousClass7JS(r2));
        }
        return r2;
    }
}
