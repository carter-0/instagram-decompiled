package X;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.ERq  reason: case insensitive filesystem */
public final class C48027ERq extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CCUTestFragment";
    public C68504NKx A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1C(r2, "CCU");
    }

    public final String getModuleName() {
        return "dev_options_ccu_test_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList A1C = AnonymousClass7TE.A1C();
        C50989Fmc.A01(requireContext(), new C50109FOz((Object) this, 27), "Reset CCU Timestamps", A1C);
        C50989Fmc.A01(requireContext(), new C50109FOz((Object) this, 28), "Run Actual CCU when App is Backgrounded", A1C);
        C68504NKx nKx = this.A00;
        if (nKx != null) {
            nKx.setItems(A1C);
            C238133Ar scrollingViewProxy = getScrollingViewProxy();
            C68504NKx nKx2 = this.A00;
            if (nKx2 != null) {
                scrollingViewProxy.ENw(nKx2);
                return;
            }
        }
        0qQ.A0F("adapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-2119709616);
        super.onCreate(bundle);
        this.A00 = new C68504NKx(requireContext(), DbT.A0X(this.A01), this);
        AnonymousClass0fD.A09(-735932366, A02);
    }
}
