package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class E19 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "PotatoReplyLikesListFragment";
    public final String A00;
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new C51802G2l((Object) this, 44));
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        DbX.A0f(this.A02).A00().A02(requireActivity(), this);
        07U r2 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MH5(r2, this, viewLifecycleOwner, (AnonymousClass4D7) null, 2), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final String getModuleName() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public E19() {
        C51802G2l g2l = new C51802G2l((Object) this, 48);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51802G2l((Object) new C51802G2l((Object) this, 45), 46));
        this.A03 = DbS.A0I(new C51802G2l((Object) A002, 47), g2l, new MJ4(14, (Object) null, A002), DbS.A0z(C46759Dkm.class));
        this.A02 = C227642jf.A02(this);
        this.A00 = "potato_reply_likes_list_fragment";
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1583505277);
        ComposeView A0H = DbV.A0H(this, new C59343JFv(this, 5), 1758636598);
        AnonymousClass0fD.A09(-1188318739, A022);
        return A0H;
    }
}
