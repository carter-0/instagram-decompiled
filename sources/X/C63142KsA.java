package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.KsA  reason: case insensitive filesystem */
public abstract class C63142KsA {
    public static final void A00(Activity activity, Context context, C48143EZl eZl, 28D r10, UserSession userSession, C227382jA r12) {
        C51973G9u.A0r(0, userSession, r10, r12);
        LF8 A00 = C63143KsB.A00(userSession);
        String obj = eZl.toString();
        if (A00.A00 == 0) {
            29E r4 = A00.A03;
            long A03 = r4.A03(246622982, 20000);
            A00.A00 = A03;
            r4.A0A(A03, C273654mx.A00(1427), String.valueOf(obj));
        }
        AnonymousClass2jC.A00(context, userSession, r12).A01();
        Bundle A09 = DbY.A09(userSession);
        A09.putSerializable("CAMERA_ACR_BROWSER_ENTRY_POINT_ARGS", eZl);
        A09.putSerializable("CAMERA_ENTRY_POINT_ARGS", r10);
        AnonymousClass6W8 A02 = AnonymousClass6W8.A02(activity, A09, userSession, ModalActivity.class, "clips_acr_browser");
        A02.A07();
        A02.A0C(context);
    }
}
