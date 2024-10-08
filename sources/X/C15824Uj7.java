package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelViewerConfig;

/* renamed from: X.Uj7  reason: case insensitive filesystem */
public final class C15824Uj7 extends C232232tF implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "ImmersiveCatchUpStoryItemDefinition";
    public final int A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final C310636bN A03;

    public C15824Uj7(FragmentActivity fragmentActivity, UserSession userSession, int i) {
        0qQ.A0B(userSession, 2);
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        this.A00 = i;
        this.A03 = new C310636bN(userSession, (C310596bJ) null, true);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        Object tag = C315686kL.A00(this.A01, viewGroup, (C247833gz) null, this.A02, (C226642hc) null, AnonymousClass3BQ.DIRECT, AnonymousClass05K.A01).getTag();
        0qQ.A0C(tag, AnonymousClass000.A00(179));
        return (C249703kE) tag;
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r28, C249703kE r29) {
        C15072UNp uNp = (C15072UNp) r28;
        C316006kx r0 = (C316006kx) r29;
        AnonymousClass7TF.A1H(uNp, r0);
        C250973mM r8 = uNp.A00;
        UserSession userSession = this.A02;
        C255773uh A08 = r8.A08(userSession);
        AnonymousClass32D r2 = new AnonymousClass32D();
        r2.A01 = Integer.valueOf(this.A00);
        ReelViewerConfig reelViewerConfig = new ReelViewerConfig(r2);
        C309426Yf Bz3 = this.A03.Bz3(A08);
        int A022 = r8.A02(userSession);
        int A032 = r8.A03(userSession, A08);
        boolean z = r8.A0H.A1a;
        C317116mk r16 = C317116mk.A01;
        C317566nT r15 = C317566nT.A01;
        AnonymousClass3BQ r10 = AnonymousClass3BQ.DIRECT;
        C315686kL.A01(this, new C22349Xzy(userSession), userSession, new AnonymousClass34Y(), A08, r8, reelViewerConfig, r10, (C231002qi) null, (C230882qT) null, (C310016aI) null, Bz3, r15, r16, r0, (C317286n1) null, (AnonymousClass6a7) null, (C309936a9) null, "0", A022, A032, -1, z, false);
    }

    public final Class modelClass() {
        return C15072UNp.class;
    }
}
