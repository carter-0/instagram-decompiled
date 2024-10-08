package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.Eoy  reason: case insensitive filesystem */
public abstract class C49080Eoy {
    public static final void A00(Activity activity, Bundle bundle, UserSession userSession, String str, boolean z) {
        AnonymousClass6W8 A0b;
        0qQ.A0B(userSession, 0);
        boolean A1Z = DbW.A1Z(str);
        if (activity != null) {
            C367968rr r5 = ((T7M) userSession.A01(T7M.class, G2D.A00)).A00;
            if (r5.BEh(str) == null) {
                View rootView = activity.getWindow().getDecorView().getRootView();
                0qQ.A07(rootView);
                rootView.setDrawingCacheEnabled(A1Z);
                Bitmap drawingCache = rootView.getDrawingCache();
                0fO.A03(drawingCache);
                Bitmap createBitmap = Bitmap.createBitmap(drawingCache);
                0qQ.A07(createBitmap);
                rootView.setDrawingCacheEnabled(false);
                ((C367958rq) r5).A00.put(str, createBitmap);
            }
        }
        if (!z || !AnonymousClass2Rc.A00 || 0qQ.A0K(userSession.A06, str)) {
            A0b = DbS.A0b(activity, bundle, userSession, ModalActivity.class, "profile_card");
            A0b.A0J = AnonymousClass6W8.A0Q;
            A0b.A0H = A1Z;
        } else {
            A0b = DbS.A0b(activity, bundle, userSession, TransparentModalActivity.class, "profile_card");
            A0b.A0J = AnonymousClass6W8.A0Q;
            A0b.A0H = A1Z;
            A0b.A0J = new int[]{R.anim.modal_zoom_enter, 0, 0, R.anim.modal_zoom_exit};
        }
        A0b.A0C(activity);
    }
}
