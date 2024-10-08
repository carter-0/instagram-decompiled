package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Currency;

/* renamed from: X.UcV  reason: case insensitive filesystem */
public final class C15419UcV extends C15623Ufp {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ C16678UzE A02;
    public final /* synthetic */ C18784W1k A03;
    public final /* synthetic */ SpinnerImageView A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15419UcV(Bundle bundle, FragmentActivity fragmentActivity, C16678UzE uzE, WGU wgu, C18784W1k w1k, SpinnerImageView spinnerImageView, String str, String str2) {
        super(wgu, str);
        this.A03 = w1k;
        this.A02 = uzE;
        this.A00 = bundle;
        this.A01 = fragmentActivity;
        this.A05 = str2;
        this.A04 = spinnerImageView;
    }

    public final void onFail(C268654dm r7) {
        int A032 = AnonymousClass0fD.A03(1785528396);
        C18784W1k w1k = this.A03;
        VA1.A00(w1k.A08).A09(this.A02.toString(), "campaign_controls", w1k.A03.A1S, "failed to fetch init data");
        super.onFail(r7);
        AnonymousClass0fD.A0A(-638383893, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(241088117);
        super.onStart();
        AnonymousClass0fD.A0A(1165837071, A032);
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [X.UXo, X.1XT] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1320615889);
        ? r10 = (C15254UXo) obj;
        int A033 = AnonymousClass0fD.A03(-829786114);
        C18784W1k w1k = this.A03;
        WGU wgu = w1k.A02;
        C16678UzE uzE = this.A02;
        wgu.A0D(uzE, "initial_fetch");
        C17746VdF vdF = r10.A03;
        vdF.getClass();
        PromoteData promoteData = w1k.A03;
        promoteData.A1n = vdF.A0a;
        promoteData.A06 = vdF.A00;
        promoteData.A1j = Currency.getInstance(vdF.A0O);
        promoteData.A0X = r10.A00;
        promoteData.A1B = vdF.A0M;
        C13990Tnq.A0h();
        C15279UZh uZh = new C15279UZh();
        uZh.setArguments(this.A00);
        FragmentActivity fragmentActivity = this.A01;
        UserSession userSession = w1k.A08;
        C309516Yo r1 = new C309516Yo(fragmentActivity, userSession);
        r1.A0A = this.A05;
        r1.A0D = false;
        r1.A0E(uZh);
        r1.A04();
        SpinnerImageView spinnerImageView = this.A04;
        if (spinnerImageView != null) {
            JTO.A1X(spinnerImageView);
        }
        VA1.A00(userSession).A04("campaign_controls_budget_duration", "campaign_controls_fetch", promoteData.A1S);
        A03(r10);
        w1k.A07(uzE.toString());
        AnonymousClass0fD.A0A(1225245616, A033);
        AnonymousClass0fD.A0A(1640580530, A032);
    }
}
