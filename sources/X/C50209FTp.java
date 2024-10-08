package X;

import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Map;

/* renamed from: X.FTp  reason: case insensitive filesystem */
public final class C50209FTp implements G7X {
    public final /* synthetic */ C47493E4x A00;

    public C50209FTp(C47493E4x e4x) {
        this.A00 = e4x;
    }

    public final void DFG(C268654dm r12) {
        C47493E4x e4x = this.A00;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = e4x.A00;
        if (businessFlowAnalyticsLogger == null) {
            DbS.A12();
            throw AnonymousClass00P.createAndThrow();
        }
        businessFlowAnalyticsLogger.Ci6(new C22030Xtl("renew", e4x.A03, "quick_conversion_settings", C319126q5.A02(r12), C319126q5.A01(r12), (Map) null, (Map) null, (Map) null));
        C47493E4x.A00(e4x);
    }

    public final void DFH() {
        String str;
        C47493E4x e4x = this.A00;
        G8D g8d = e4x.A01;
        if (g8d == null) {
            str = "controller";
        } else {
            Dba.A0C(g8d).A07 = true;
            SpinnerImageView spinnerImageView = e4x.A02;
            if (spinnerImageView == null) {
                str = "loadingSpinner";
            } else {
                spinnerImageView.setVisibility(8);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DFI(F16 f16) {
        String str;
        C47493E4x e4x = this.A00;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = e4x.A00;
        if (businessFlowAnalyticsLogger == null) {
            str = "logger";
        } else {
            businessFlowAnalyticsLogger.Ci5(new C22030Xtl("renew", e4x.A03, "quick_conversion_settings", (String) null, (String) null, (Map) null, (Map) null, C49893FBw.A01(f16)));
            if (f16 != null) {
                G8D g8d = e4x.A01;
                str = "controller";
                if (g8d != null) {
                    Dba.A0C(g8d).A03 = C49893FBw.A00(e4x.requireContext(), f16);
                    G8D g8d2 = e4x.A01;
                    if (g8d2 != null) {
                        ((BusinessConversionActivity) g8d2).A09.getValue();
                    }
                }
            }
            C47493E4x.A00(e4x);
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
