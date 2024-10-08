package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.io.Serializable;

/* renamed from: X.Gzr  reason: case insensitive filesystem */
public final class C54122Gzr extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ContactPointUpdateUpsellsBottomSheetFragment";
    public C56154Hth A00;
    public C54668HMz A01;
    public C54660HMr A02;
    public C56058Hs7 A03;
    public String A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final String getModuleName() {
        return "contact_point_update_upsell_bottom_sheet";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        Serializable serializable;
        int A022 = AnonymousClass0fD.A02(392452175);
        C54122Gzr.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Serializable serializable2 = null;
        if (bundle2 != null) {
            str = bundle2.getString(AnonymousClass9NE.A00());
        } else {
            str = null;
        }
        this.A04 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            serializable = bundle3.getSerializable("entrypoint");
        } else {
            serializable = null;
        }
        this.A02 = (C54660HMr) serializable;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            serializable2 = bundle4.getSerializable("copy_version");
        }
        0qQ.A0C(serializable2, "null cannot be cast to non-null type com.instagram.wellbeing.upsells.analytics.ContactPointUpdateUpsellVersion");
        this.A01 = (C54668HMz) serializable2;
        C56058Hs7 hs7 = new C56058Hs7(this, AnonymousClass7TE.A0l(this.A05));
        this.A03 = hs7;
        this.A00 = new C56154Hth(this.A02, hs7, C54658HMp.CONTACT_POINT_UPDATE, this.A04);
        AnonymousClass0fD.A09(-761118687, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1567723028);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.contact_point_upsell_bottom_sheet, viewGroup, false);
        Context requireContext = requireContext();
        C54668HMz hMz = this.A01;
        if (hMz != null) {
            String A16 = AnonymousClass7TE.A16(requireContext, hMz.A02);
            Context requireContext2 = requireContext();
            C54668HMz hMz2 = this.A01;
            if (hMz2 != null) {
                String string = requireContext2.getString(hMz2.A00);
                IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TF.A0F(inflate, R.id.upsell_bottom_sheet_headline);
                0qQ.A0B(igdsHeadline, 0);
                igdsHeadline.A02 = true;
                igdsHeadline.setHeadline((CharSequence) A16);
                if (string != null) {
                    igdsHeadline.setBody((CharSequence) string);
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass7TF.A0F(inflate, R.id.bottom_bar);
                ID1 A002 = ID1.A00(this, 55);
                AnonymousClass37D A0i = DbX.A0i(this);
                C54668HMz hMz3 = this.A01;
                if (hMz3 != null) {
                    C55179HdV.A00(igdsBottomButtonLayout, new C55790HnP(A002, A0i, hMz3.A01, 2131976147));
                    igdsBottomButtonLayout.setPrimaryButtonEnabled(true);
                    AnonymousClass0fD.A09(2025294122, A022);
                    return inflate;
                }
            }
        }
        0qQ.A0F("copyVersion");
        throw AnonymousClass00P.createAndThrow();
    }
}
