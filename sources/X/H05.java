package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.List;

public final class H05 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "SuggestedCreatorsReelsFragment";
    public List A00;
    public boolean A01;
    public C54583HJs A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final String getModuleName() {
        return "dev_options_suggested_creators_reels_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (!this.A01) {
            1NY A0b = AnonymousClass7TG.A0b(DbT.A0X(this.A03));
            A0b.A0A("discover/get_creators_in_reels_equivalent/");
            1OC A0S = DbU.A0S(A0b, C43844CFk.class, D37.class);
            A0S.A00 = new CH8(this, 3);
            schedule(A0S);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1129694469);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_clips_viewer_suggested_creators, false);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        AnonymousClass0eM r3 = this.A03;
        C54583HJs hJs = new C54583HJs(A0D, AnonymousClass7TE.A0l(r3));
        this.A02 = hJs;
        View view = hJs.itemView;
        DbT.A16(view.getContext(), view, 17170444);
        C317756nm.A03(requireActivity(), this, AnonymousClass7TE.A0l(r3), true, false);
        AnonymousClass0fD.A09(245150806, A022);
        return A0D;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1817547576);
        H05.super.onPause();
        C56658I6n.A03(this, AnonymousClass7TE.A0l(this.A03));
        AnonymousClass0fD.A09(-829037637, A022);
    }

    public final void onResume() {
        List list;
        C54583HJs hJs;
        int A022 = AnonymousClass0fD.A02(-80025185);
        super.onResume();
        if (!(!this.A01 || (list = this.A00) == null || (hJs = this.A02) == null)) {
            GBU.A0B.A06(requireActivity(), this, AnonymousClass7TE.A0l(this.A03), hJs, list);
        }
        AnonymousClass0fD.A09(1946134484, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1308589795);
        H05.super.onStop();
        C317756nm.A02(requireActivity(), this, AnonymousClass7TE.A0l(this.A03), true, false);
        AnonymousClass0fD.A09(1569193122, A022);
    }
}
