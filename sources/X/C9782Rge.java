package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;

/* renamed from: X.Rge  reason: case insensitive filesystem */
public abstract class C9782Rge {
    public static final Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        List list = r10.A00;
        String A0t = DbU.A0t(list, 0);
        String A0t2 = DbU.A0t(list, 1);
        C277014uI A0R = DbV.A0R(list, 2);
        C277014uI A0R2 = DbV.A0R(list, 3);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putInt("STYLE_RES", 2132017771);
        Bundle A0a2 = AnonymousClass7TE.A0a();
        A0a2.putSerializable("viewmodel_class", C8270QnC.class);
        C11249SHj sHj = new C11249SHj();
        sHj.A01(A0t2);
        Pxi.A0y(A0a2, sHj);
        A0a2.putString(IgReactPurchaseExperienceBridgeModule.RN_PAYMENT_TYPE_KEY, A0t);
        Fragment fragment = new Fragment();
        fragment.setArguments(A0a2);
        C8608Qxp qxp = new C8608Qxp();
        qxp.setArguments(A0a);
        0hq supportFragmentManager = C308206Td.A04(r9).getSupportFragmentManager();
        0qQ.A07(supportFragmentManager);
        0qQ.A0B(fragment, 1);
        qxp.A06 = fragment;
        qxp.A0B(supportFragmentManager, (String) null);
        fragment.A00 = new C12500SvW(qxp, r9, A0R, A0R2);
        return null;
    }
}
