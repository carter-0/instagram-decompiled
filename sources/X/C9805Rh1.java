package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.Rh1  reason: case insensitive filesystem */
public abstract class C9805Rh1 {
    public static final Object A00(C307896Rx r22, AnonymousClass6Tm r23) {
        AnonymousClass6Tm r0 = r23;
        String A0h = DbY.A0h(r0, 0);
        C277014uI A0P = DbW.A0P(r0, 1);
        C277014uI r2 = ((C280064zw) r0.A00()).A00;
        SimpleWebViewConfig simpleWebViewConfig = new SimpleWebViewConfig(A0h, (String) null, (String) null, (String) null, false, false, false, false, false, true, false, true, false, false, false, false);
        C307896Rx r4 = r22;
        FragmentActivity A04 = C308206Td.A04(r4);
        0lg A0R = DbW.A0R(r4);
        0qQ.A0B(A0R, 0);
        T7P t7p = (T7P) A0R.A01(T7P.class, new MMG(A0R, 0));
        t7p.A00 = new C12747T5h(r4, A0P);
        t7p.A01 = new C12749T5j(t7p, r4, r2);
        new AnonymousClass6W8(A04, DbY.A0B("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", simpleWebViewConfig), A0R, ModalActivity.class, C273654mx.A00(865)).A0C(A04);
        return null;
    }
}
