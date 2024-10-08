package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.Ft3  reason: case insensitive filesystem */
public final class C51371Ft3 implements Runnable {
    public final /* synthetic */ DwU A00;
    public final /* synthetic */ C47435E2h A01;

    public C51371Ft3(DwU dwU, C47435E2h e2h) {
        this.A00 = dwU;
        this.A01 = e2h;
    }

    public final void run() {
        Bundle bundle;
        DwU dwU = this.A00;
        C47435E2h e2h = this.A01;
        e2h.A00 = dwU.A00();
        if (!e2h.requireArguments().getBoolean("skip_landing_screen") && !dwU.A08 && !dwU.A07) {
            ViewStub viewStub = e2h.A02;
            if (viewStub != null) {
                if (viewStub.getParent() != null) {
                    ViewStub viewStub2 = e2h.A02;
                    if (viewStub2 != null) {
                        View inflate = viewStub2.inflate();
                        if (inflate != null) {
                            inflate.setVisibility(0);
                            IgdsHeadline A0U = DbZ.A0U(inflate, R.id.two_factor_headline);
                            A0U.setImageResource(R.drawable.ig_illustrations_illo_2fac_off_refresh);
                            A0U.setHeadline(2131975701);
                            A0U.setBody(2131975700);
                            A0U.ENc((View.OnClickListener) e2h.A05.getValue(), 2131975702);
                            ((C3021461u) inflate.requireViewById(R.id.start_bottom_button)).setPrimaryActionOnClickListener((View.OnClickListener) e2h.A07.getValue());
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F("successViewStub");
            throw AnonymousClass00P.createAndThrow();
        } else if (e2h.isResumed() && (bundle = e2h.A00) != null) {
            FFR.A03();
            bundle.putBoolean("direct_launch_backup_codes", e2h.requireArguments().getBoolean("direct_launch_backup_codes"));
            ESP esp = new ESP();
            C309516Yo A0N = DbX.A0N(DbU.A0I(bundle, esp, e2h), e2h.A06);
            A0N.A0D(esp);
            A0N.A0A = Dbb.A0X();
            A0N.A04();
        }
    }
}
