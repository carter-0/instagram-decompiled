package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

public final class H06 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "SuggestedUsersReelsFragment";
    public List A00;
    public boolean A01;
    public C46578DhK A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final String getModuleName() {
        return "dev_options_suggested_users_reels_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (!this.A01) {
            1NY A0b = AnonymousClass7TG.A0b(DbT.A0X(this.A03));
            A0b.A0A("discover/su_in_reels_equivalent/");
            1OC A0S = DbU.A0S(A0b, C43844CFk.class, D37.class);
            A0S.A00 = new CH8(this, 4);
            schedule(A0S);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1262825986);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_clips_viewer_suggested_users, false);
        C46578DhK dhK = new C46578DhK(A0D);
        this.A02 = dhK;
        View view = dhK.itemView;
        DbT.A16(view.getContext(), view, 17170444);
        C317756nm.A03(requireActivity(), this, AnonymousClass7TE.A0l(this.A03), true, false);
        AnonymousClass0fD.A09(469861893, A022);
        return A0D;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(569220059);
        H06.super.onPause();
        if (!GBV.A08) {
            GBV.A04 = 0;
            GBV.A06 = null;
            GBV.A07.clear();
        }
        AnonymousClass0fD.A09(-605602074, A022);
    }

    public final void onResume() {
        List list;
        C46578DhK dhK;
        int A022 = AnonymousClass0fD.A02(-934244883);
        super.onResume();
        if (!(!this.A01 || (list = this.A00) == null || (dhK = this.A02) == null)) {
            C46575DhH dhH = GBV.A09;
            ArrayList A1D = AnonymousClass7TE.A1D(list);
            dhH.A03(requireActivity(), this, AnonymousClass7TE.A0l(this.A03), dhK, (C51981GAe) null, (String) null, (String) null, (String) null, A1D);
        }
        AnonymousClass0fD.A09(687339711, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-597795564);
        H06.super.onStop();
        C317756nm.A02(requireActivity(), this, AnonymousClass7TE.A0l(this.A03), true, false);
        AnonymousClass0fD.A09(1472068346, A022);
    }
}
