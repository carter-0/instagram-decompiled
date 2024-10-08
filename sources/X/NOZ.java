package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class NOZ extends C232222tE {
    public final UserSession A00;
    public final OLM A01;
    public final O6G A02;
    public final String A03;
    public final boolean A04;

    public NOZ(UserSession userSession, OLM olm, O6G o6g, String str, boolean z) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = olm;
        this.A03 = str;
        this.A04 = z;
        this.A02 = o6g;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        String str;
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int A002 = C70343O2v.A00(viewGroup);
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 0);
        boolean A012 = C70867OPg.A01(userSession);
        int i = R.layout.card_gallery_card_base_legacy_layout;
        if (A012) {
            i = R.layout.card_gallery_card_base_layout;
        }
        String str2 = this.A03;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -1782234803:
                    if (str2.equals("questions")) {
                        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                        return new NV2(DbT.A0D(layoutInflater, viewGroup, i, false), userSession, this.A01, A002, this.A04);
                    }
                    break;
                case -697290194:
                    str = "shared_stack";
                    break;
                case 348943746:
                    str = "add_yours";
                    break;
                case 531959920:
                    if (str2.equals("challenges")) {
                        int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                        OLM olm = this.A01;
                        return new NVA(DbT.A0D(layoutInflater, viewGroup, i, false), userSession, olm, this.A02, A002, this.A04);
                    }
                    break;
                case 535918816:
                    if (str2.equals("roll_call")) {
                        int i4 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                        return new NV9(DbT.A0D(layoutInflater, viewGroup, i, false), userSession, this.A01, A002, this.A04);
                    }
                    break;
            }
            if (str2.equals(str)) {
                int i5 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                return new NVB(DbT.A0D(layoutInflater, viewGroup, i, false), userSession, this.A01, A002, this.A04);
            }
        }
        int i6 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new NVC(DbT.A0D(layoutInflater, viewGroup, i, false), userSession, this.A01, A002, this.A04);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r1, C249703kE r2) {
        NVH nvh = (NVH) r1;
        C68058MzP mzP = (C68058MzP) r2;
        AnonymousClass7TG.A1N(nvh, mzP);
        mzP.A01(nvh);
    }

    public final Class modelClass() {
        return NVH.class;
    }
}
