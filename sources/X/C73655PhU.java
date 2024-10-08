package X;

import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.simplewebview.SimpleWebViewActivity;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.PhU  reason: case insensitive filesystem */
public final class C73655PhU extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73655PhU(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean CHE;
        UserSession userSession;
        Bundle bundle;
        switch (this.A00) {
            case 0:
                OU2 ou2 = (OU2) this.A01;
                C74552Pwl pwl = ou2.A01;
                boolean z = ou2.A0S;
                int i = ou2.A00;
                if (z) {
                    return pwl.BmT(i);
                }
                return pwl.Act(i);
            case 1:
                OU2 ou22 = (OU2) this.A01;
                C74552Pwl pwl2 = ou22.A01;
                boolean z2 = ou22.A0S;
                int i2 = ou22.A00;
                if (z2) {
                    return pwl2.BmA(i2);
                }
                return pwl2.Bf0(i2);
            case 2:
                OU2 ou23 = (OU2) this.A01;
                C74552Pwl pwl3 = ou23.A01;
                boolean z3 = ou23.A0S;
                int i3 = ou23.A00;
                if (z3) {
                    return pwl3.BmB(i3);
                }
                return pwl3.BfB(i3);
            case 3:
                OU2 ou24 = (OU2) this.A01;
                C74552Pwl pwl4 = ou24.A01;
                boolean z4 = ou24.A0S;
                int i4 = ou24.A00;
                if (z4) {
                    return pwl4.BmQ(i4);
                }
                return pwl4.C4n(i4);
            case 4:
                OU2 ou25 = (OU2) this.A01;
                C74552Pwl pwl5 = ou25.A01;
                boolean z5 = ou25.A0S;
                int i5 = ou25.A00;
                if (z5) {
                    return pwl5.Bma(i5);
                }
                return pwl5.CH2(i5);
            case 5:
                OU2 ou26 = (OU2) this.A01;
                C74552Pwl pwl6 = ou26.A01;
                boolean z6 = ou26.A0S;
                int i6 = ou26.A00;
                if (z6) {
                    return pwl6.Bmc(i6);
                }
                return pwl6.CH5(i6);
            case 6:
                OU2 ou27 = (OU2) this.A01;
                return ou27.A01.CH6(ou27.A00);
            case 7:
                OU2 ou28 = (OU2) this.A01;
                C74552Pwl pwl7 = ou28.A01;
                boolean z7 = ou28.A0S;
                int i7 = ou28.A00;
                if (z7) {
                    return pwl7.Bme(i7);
                }
                return pwl7.CH9(i7);
            case 8:
                OU2 ou29 = (OU2) this.A01;
                C74552Pwl pwl8 = ou29.A01;
                boolean z8 = ou29.A0S;
                int i8 = ou29.A00;
                if (z8) {
                    return pwl8.Bmf(i8);
                }
                return pwl8.CHA(i8);
            case 9:
                OU2 ou210 = (OU2) this.A01;
                C74552Pwl pwl9 = ou210.A01;
                boolean z9 = ou210.A0S;
                int i9 = ou210.A00;
                if (z9) {
                    return pwl9.Bmg(i9);
                }
                return pwl9.CHB(i9);
            case 10:
                OU2 ou211 = (OU2) this.A01;
                C74552Pwl pwl10 = ou211.A01;
                boolean z10 = ou211.A0S;
                int i10 = ou211.A00;
                if (z10) {
                    return pwl10.Bmh(i10);
                }
                return pwl10.CHC(i10);
            case 11:
                OU2 ou212 = (OU2) this.A01;
                C74552Pwl pwl11 = ou212.A01;
                boolean z11 = ou212.A0S;
                int i11 = ou212.A00;
                if (z11) {
                    return pwl11.Bmi(i11);
                }
                return pwl11.CHD(i11);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                OU2 ou213 = (OU2) this.A01;
                C74552Pwl pwl12 = ou213.A01;
                boolean z12 = ou213.A0S;
                int i12 = ou213.A00;
                if (z12) {
                    CHE = pwl12.Bmj(i12);
                } else {
                    CHE = pwl12.CHE(i12);
                }
                return Boolean.valueOf(CHE);
            case 13:
                OU2 ou214 = (OU2) this.A01;
                C74552Pwl pwl13 = ou214.A01;
                boolean z13 = ou214.A0S;
                int i13 = ou214.A00;
                if (z13) {
                    return pwl13.Bmk(i13);
                }
                return pwl13.CHF(i13);
            case 14:
                OU2 ou215 = (OU2) this.A01;
                C74552Pwl pwl14 = ou215.A01;
                boolean z14 = ou215.A0S;
                int i14 = ou215.A00;
                if (z14) {
                    return pwl14.Bml(i14);
                }
                return pwl14.CHG(i14);
            case 15:
                OU2 ou216 = (OU2) this.A01;
                C74552Pwl pwl15 = ou216.A01;
                boolean z15 = ou216.A0S;
                int i15 = ou216.A00;
                if (z15) {
                    return pwl15.Bmm(i15);
                }
                return pwl15.CHH(i15);
            case 16:
                OU2 ou217 = (OU2) this.A01;
                C74552Pwl pwl16 = ou217.A01;
                boolean z16 = ou217.A0S;
                int i16 = ou217.A00;
                if (z16) {
                    return pwl16.Bmn(i16);
                }
                return pwl16.CHI(i16);
            case 17:
                OU2 ou218 = (OU2) this.A01;
                C74552Pwl pwl17 = ou218.A01;
                boolean z17 = ou218.A0S;
                int i17 = ou218.A00;
                if (z17) {
                    return pwl17.Bmp(i17);
                }
                return pwl17.CHK(i17);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return DbS.A0B(this.A01).getString("DirectThreadInviteLinkSettingsFragment.BROADCAST_CHAT_CREATOR_ID");
            case 19:
                return DbU.A0g(DbS.A0B(this.A01), "DirectThreadInviteLinkSettingsFragment.ARGUMENT_GROUP_INVITE_FORCE_DISABLE_TOGGLE");
            case 20:
                return DbU.A0g(DbS.A0B(this.A01), "DirectThreadInviteLinkSettingsFragment.IS_ADMIN");
            case 21:
                return DbU.A0g(DbS.A0B(this.A01), "DirectThreadInviteLinkSettingsFragment.IS_MODERATOR");
            case 22:
                return DbU.A0g(DbS.A0B(this.A01), "DirectThreadInviteLinkSettingsFragment.IS_SUBSCRIBER_ONLY");
            case 23:
                NJ7 nj7 = (NJ7) this.A01;
                UserSession A0l = AnonymousClass7TE.A0l(nj7.A0G);
                0qQ.A0B(A0l, 0);
                return new OJb(nj7, A0l);
            case 24:
                C254783t2 A002 = AnonymousClass9H0.A00(DbS.A0B(this.A01), "DirectThreadInviteLinkSettingsFragment.THREAD_ID");
                if (A002 != null) {
                    return A002;
                }
                throw AnonymousClass7TE.A0y();
            case 25:
                return DbS.A0B(this.A01).getParcelable("DirectThreadInviteLinkSettingsFragment.IMAGE_URL");
            case 26:
                return DbS.A0B(this.A01).getString("DirectThreadInviteLinkSettingsFragment.THREAD_TITLE");
            case 27:
                return DbS.A0B(this.A01).getString("DirectThreadInviteLinkSettingsFragment.THREAD_V2_ID");
            case 28:
                return DbS.A0B(this.A01).getString("DirectThreadInviteLinkSettingsFragment.ARGUMENT_THREAD_USERTYPE");
            case 30:
            case 36:
                return DbT.A0r(this.A01);
            case 31:
            case 37:
                return DbY.A0I(this.A01);
            case 32:
                C68474NJr nJr = (C68474NJr) this.A01;
                userSession = AnonymousClass7TE.A0l(nJr.A00);
                bundle = nJr.mArguments;
                if (bundle == null) {
                    throw AnonymousClass7TE.A0y();
                }
                break;
            case 33:
                ((C67751Mu4) this.A01).A00();
                return C60340gF.A00;
            case 34:
                C49906FEe fEe = SimpleWebViewActivity.A02;
                C68475NJs nJs = (C68475NJs) this.A01;
                C49906FEe.A01(nJs.requireContext(), DbT.A0X(nJs.A00), fEe, new C11225SFz(SQU.A01(nJs.requireContext(), "https://help.instagram.com/491565145294150")), nJs.getString(2131958983));
                return C60340gF.A00;
            case 38:
                C68475NJs nJs2 = (C68475NJs) this.A01;
                userSession = AnonymousClass7TE.A0l(nJs2.A00);
                bundle = nJs2.mArguments;
                if (bundle == null) {
                    throw AnonymousClass7TE.A0y();
                }
                break;
            case 39:
                return new 0eP[((AnonymousClass0r6[]) this.A01).length];
            case 40:
                return DbV.A0n(DbT.A08(this.A01), R.color.meta_ai_voice_default_background);
            case Seq.NULL_REFNUM:
                NJ8 nj8 = (NJ8) this.A01;
                return AnonymousClass0kN.A01(nj8, DbT.A0X(nj8.A0Q));
            case Seq.RefTracker.REF_OFFSET:
                NJ8 nj82 = (NJ8) this.A01;
                if (NJ8.A0E(nj82)) {
                    NJ8.A05(nj82);
                }
                return C60340gF.A00;
            case 43:
                ((NJ8) this.A01).A0K.markerEnd(894512288, 2);
                return C60340gF.A00;
            case 44:
                NJ8 nj83 = (NJ8) this.A01;
                return new C71504Olt(C73912Pln.A00(DbT.A0X(nj83.A0Q)), AnonymousClass12T.A00.AOJ(231292917, 2), new C73655PhU(nj83, 42), new C73655PhU(nj83, 43));
            case 45:
                return DbT.A08(this.A01).getDrawable(R.drawable.instagram_microphone_off_pano_outline_24);
            case 46:
                return DbT.A08(this.A01).getDrawable(R.drawable.instagram_microphone_pano_outline_24);
            case 47:
                return DbT.A08(this.A01).getDrawable(R.drawable.instagram_volume_off_pano_outline_24);
            case 48:
                return DbT.A08(this.A01).getDrawable(R.drawable.instagram_volume_pano_outline_24);
            default:
                return this.A01;
        }
        return new C71502Olr(bundle, userSession);
    }
}
