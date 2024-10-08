package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.android.R;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;

/* renamed from: X.Lp1  reason: case insensitive filesystem */
public final class C65197Lp1 implements MVS {
    public KHY A00;
    public final AnonymousClass80P A01 = AnonymousClass80P.MONETIZATION_OVERLAY;
    public final AnonymousClass4DH A02;
    public final UserSession A03;
    public final C61847KOm A04;
    public final C62674Kka A05 = C62674Kka.A0D;
    public final boolean A06;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        SpannableStringBuilder A012;
        AnonymousClass4DH r7 = this.A02;
        Context requireContext = r7.requireContext();
        UserSession userSession = this.A03;
        LFB lfb = new LFB(requireContext, userSession, AnonymousClass2o3.A00(userSession));
        MonetizationRepository monetizationRepository = lfb.A02;
        UserMonetizationProductType userMonetizationProductType = UserMonetizationProductType.IGTV_REVSHARE;
        int i = 2131963606;
        if (!monetizationRepository.A04(userMonetizationProductType)) {
            i = 2131963605;
        }
        String A16 = AnonymousClass7TE.A16(requireContext, i);
        boolean z = this.A06;
        if (z) {
            A16 = 002.A0g(AnonymousClass7TE.A16(requireContext, 2131963622), " - ", A16);
        }
        if (!monetizationRepository.A04(userMonetizationProductType)) {
            A012 = lfb.A01(new C65489LuD(this, 0), "https://www.facebook.com/help/instagram/793848097773634", true);
        } else {
            A012 = lfb.A01(new C65489LuD(this, 1), "https://help.instagram.com/2635536099905516", false);
        }
        Context requireContext2 = r7.requireContext();
        Integer num = null;
        if (z) {
            num = Integer.valueOf(R.drawable.instagram_ad_pano_outline_24);
        }
        KHY khy = new KHY(requireContext2);
        DbY.A0z(khy);
        khy.setOrientation(1);
        khy.setTitle(A16);
        if (num != null) {
            khy.setIcon(JTP.A0E(requireContext2, num));
        }
        khy.setSubtitle(A012);
        khy.setInlineSubtitleLinkable(true);
        this.A00 = khy;
        khy.setHideSwitchView(true);
        KHY khy2 = this.A00;
        if (khy2 != null) {
            return khy2;
        }
        0qQ.A0F("monetizationRowView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return this.A05;
    }

    public final AnonymousClass80P BHl() {
        return this.A01;
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A02;
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 36), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public C65197Lp1(AnonymousClass4DH r2, UserSession userSession, C61847KOm kOm, boolean z) {
        C51974G9v.A1L(r2, userSession, kOm);
        this.A02 = r2;
        this.A03 = userSession;
        this.A06 = z;
        this.A04 = kOm;
    }
}
