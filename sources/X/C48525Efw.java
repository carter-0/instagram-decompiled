package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.Efw  reason: case insensitive filesystem */
public abstract class C48525Efw {
    public static final void A00(C307896Rx r5, C277014uI r6, C277014uI r7, SimpleWebViewConfig simpleWebViewConfig) {
        FragmentActivity A04 = C308206Td.A04(r5);
        0lg A0R = DbW.A0R(r5);
        0qQ.A0B(A0R, 0);
        C50323FYd fYd = (C50323FYd) A0R.A01(C50323FYd.class, new MMG(A0R, 2));
        fYd.A00 = new C49450Evr(r5, r6);
        fYd.A01 = new ExK(fYd, r5, r7);
        DbU.A0w(A04, DbY.A0B("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", simpleWebViewConfig), A0R, ModalActivity.class, C273654mx.A00(3106));
    }
}
