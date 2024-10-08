package X;

import android.text.TextUtils;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import java.util.Map;

/* renamed from: X.ECh  reason: case insensitive filesystem */
public final class C47673ECh extends 1P0 {
    public final /* synthetic */ E7B A00;

    public C47673ECh(E7B e7b) {
        this.A00 = e7b;
    }

    public final void onFail(C268654dm r13) {
        int A03 = AnonymousClass0fD.A03(-1991111091);
        E7B e7b = this.A00;
        String string = e7b.getString(2131961757);
        if (r13 instanceof C268674do) {
            1XP r1 = (1XP) r13.A00();
            if (!TextUtils.isEmpty(r1.getErrorMessage())) {
                string = r1.getErrorMessage();
            }
        }
        C59689JTv.A0G(string);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = e7b.A03;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Ckh(new C22030Xtl("business_contact_info", e7b.A07, (String) null, string, (String) null, (Map) null, E7B.A00(e7b), (Map) null));
        }
        AnonymousClass0fD.A0A(-568924760, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1890940640);
        E7B e7b = this.A00;
        e7b.A0B = false;
        Dbb.A0u(e7b);
        AnonymousClass0fD.A0A(1745158325, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-1147531691);
        E7B e7b = this.A00;
        e7b.A0B = true;
        Dbb.A0u(e7b);
        AnonymousClass0fD.A0A(-1693893026, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1135510658);
        int A032 = AnonymousClass0fD.A03(-366053818);
        E7B e7b = this.A00;
        e7b.A0F = true;
        e7b.A0G.post(new C51171Fph(this));
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = e7b.A03;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Ckg(new C22030Xtl("business_contact_info", e7b.A07, "contact_option", (String) null, (String) null, (Map) null, E7B.A00(e7b), (Map) null));
        }
        AnonymousClass0fD.A0A(987570797, A032);
        AnonymousClass0fD.A0A(1120817697, A03);
    }
}
