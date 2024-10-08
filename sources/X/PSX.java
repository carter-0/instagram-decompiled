package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Map;

public final class PSX implements 1aV {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public PSX(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A04 = str;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        T7R t7r;
        String str;
        int i;
        switch (this.A00) {
            case 0:
                C8918RFl rFl = (C8918RFl) obj;
                T7Q t7q = (T7Q) this.A03;
                boolean z = rFl.A01;
                boolean z2 = !z;
                t7q.A03 = z2;
                if (z) {
                    boolean A0K = 0qQ.A0K(this.A04, "FETCH_PRICE");
                    Map map = (Map) this.A02;
                    if (A0K) {
                        map.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, "ERROR_IN_FETCH");
                        map.put(Pxd.A00(738), rFl.name());
                        str = rFl.A00;
                        i = 739;
                    } else {
                        map.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, "PURCHASE_FAILURE");
                        map.put("purchase_status_error_code", rFl.name());
                        str = rFl.A00;
                        i = 847;
                    }
                    map.put(Pxd.A00(i), str);
                }
                1IX r1 = (1IX) this.A01;
                if (r1.isActive()) {
                    if (z2) {
                        t7r = t7q.A01;
                    } else if (!z2) {
                        t7r = null;
                    } else {
                        throw AnonymousClass7TE.A1K();
                    }
                    r1.resumeWith(t7r);
                    return;
                }
                return;
            case 1:
                C74233PrM prM = (C74233PrM) obj;
                if (prM instanceof C72176Oxl) {
                    0wb.A07(this.A04, (Throwable) C66996MgU.A01(prM));
                    C59689JTv.A0A((Context) this.A01, "error");
                    return;
                }
                0Aj A0e = AnonymousClass7TE.A0e(C66580MXl.A0N(DbY.A0M((0lg) this.A03), "ig_upload_flow"), "ig_media_publish_success");
                if (A0e.isSampled()) {
                    A0e.AAJ(DcV.A02(114, 10, 118), "N/A");
                    A0e.AAJ("publish_id", "N/A");
                    A0e.AAJ(Pxd.A00(774), "unknown");
                    A0e.AAJ("target_surface", "unknown");
                    A0e.AAJ("media_type", "photo");
                    A0e.AAJ("connection", C61970qY.A08((Context) this.A01));
                    A0e.AAJ(C273654mx.A00(1467), AnonymousClass5BB.A00());
                    A0e.A9F("occamadillo_thread_id", AnonymousClass4KK.A01(DbS.A0c((DirectShareTarget) this.A02)));
                    C66581MXm.A1H(A0e, true);
                    A0e.Cgf();
                    return;
                }
                return;
            case 2:
                Fragment fragment = (Fragment) this.A01;
                TextView textView = (TextView) this.A02;
                String str2 = this.A04;
                View view = (View) this.A03;
                if (TextUtils.isEmpty((String) obj)) {
                    textView.setText(2131957521);
                } else {
                    DbX.A1F(textView, fragment, str2, 2131957673);
                }
                C59689JTv.A07(view.getContext(), 2131972500);
                return;
            default:
                return;
        }
    }
}
