package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class E18 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ReelsTuningFragment";
    public C51950G8t A00;
    public final String A01 = AnonymousClass7TG.A0j();
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03;

    public final String getModuleName() {
        return "reels_tuning";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public E18() {
        C41562AwU awU = new C41562AwU(this, 20);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C41562AwU(new C41562AwU(this, 17), 18));
        this.A03 = DbS.A0I(new C41562AwU(A002, 19), awU, new MJ7(24, (Object) null, A002), DbS.A0z(C46747Dka.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(785325813);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.nux_reels_tuning_fragment, viewGroup, false);
        this.A00 = C49047EoR.A00(this);
        DbX.A0I(inflate, R.id.reels_tuning_container).addView(GTX.A01(this, AnonymousClass5PI.A03(new C59345JFx(this, 34), 492709886), false, false));
        AnonymousClass0fD.A09(-1710797989, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(821442037);
        super.onDestroyView();
        AnonymousClass0fD.A09(24591508, A022);
    }
}
