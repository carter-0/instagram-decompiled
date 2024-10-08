package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

public final class NUA extends C61887KQc implements C273494mf {
    public static final /* synthetic */ AnonymousClass0YZ[] A06 = NJT.A0A(NUA.class);
    public static final String __redex_internal_original_name = "EncryptedBackupsGDriveOnboardingSetupHardBlockFragment";
    public IgdsBottomButtonLayout A00;
    public C62320sa A01 = new C73904Plf(this, 25);
    public final C319956rV A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;

    public final void A0E() {
    }

    public final void A0H() {
        A0L(false);
        ((C67713MtS) this.A03.getValue()).A02.A0B("GDRIVE_SETUP_ACCOUNT_PICKER_DISMISS");
    }

    public final void A0J(C74223PrB prB) {
        A0L(false);
        ((C67713MtS) this.A03.getValue()).A0E(prB);
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "encrypted_backups_gdrive_onboarding_setup_hard_block_fragment";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void A0L(boolean z) {
        View view = this.mView;
        if (view != null) {
            view.post(new C73183PYN(this, z));
        }
    }

    public final void afterOnViewCreated() {
        String str;
        DbZ.A1C(this, new C66162MFz(this, (AnonymousClass4D7) null, 31), new MC9(((C67713MtS) this.A03.getValue()).A07, 39));
        C67723Mtc mtc = (C67723Mtc) this.A03.getValue();
        Integer A032 = C71145Oe2.A03(this);
        Integer A012 = C71145Oe2.A01(this);
        0qQ.A0B(A032, 0);
        int intValue = mtc.A02.intValue();
        if (intValue == 10) {
            str = "THREAD_EXIT";
        } else if (intValue == 11) {
            str = "INBOX_BANNER";
        } else if (intValue == 4) {
            str = "FISHFOODING";
        } else if (intValue == 2) {
            str = "SETTINGS";
        } else if (intValue != 3) {
            str = "HARD_BLOCK_3P_LEADING";
        } else {
            str = "SETTINGS_GDRIVE_TOGGLE";
        }
        NUN nun = mtc.A01;
        nun.A09();
        nun.A0D("ENTRY_POINT", str);
        nun.A0D("SETUP_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        nun.A0B("HARD_BLOCK_3P_LEADING_SCREEN_IMPRESSION");
        C66913Mex.A02(nun, A012, "PERIOD", C69893Ntv.A00(A032));
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final boolean isScrolledToTop() {
        return NJT.A09(this.A02, this, A06, 0);
    }

    public final boolean onBackPressed() {
        String str;
        C67723Mtc mtc = (C67723Mtc) this.A03.getValue();
        if (mtc.A02.intValue() == 2) {
            str = "SETTINGS_TOGGLE_CLOSED";
        } else {
            str = "HARD_BLOCK_CLOSED";
        }
        NUN nun = mtc.A01;
        nun.A0D("END_REASON", str);
        nun.A0B("HARD_BLOCK_3P_LEADING_SCREEN_CLOSED");
        nun.A07();
        requireActivity().setResult(106183331);
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [X.Dde, X.6rV] */
    public NUA() {
        C73904Plf plf = new C73904Plf(this, 24);
        AnonymousClass0eM A002 = C73904Plf.A00(new C73904Plf(this, 30), 0eO.A02, 31);
        this.A03 = DbS.A0I(new C73904Plf(A002, 32), plf, new C73664Phd(40, A002, (Object) null), DbS.A0z(C67723Mtc.class));
        this.A02 = new C46362Dde(this, new C73904Plf(this, 29));
        this.A05 = AnonymousClass1YB.A00(new C73904Plf(this, 27));
        this.A04 = AnonymousClass1YB.A00(new C73904Plf(this, 26));
    }

    public final void A0G() {
        Context requireContext;
        Resources A052;
        int i;
        if (C71145Oe2.A02(this) == AnonymousClass05K.A0C) {
            requireContext = requireContext();
            A052 = DbV.A05(this);
            i = 2131975433;
        } else {
            Integer A022 = C71145Oe2.A02(this);
            Integer num = AnonymousClass05K.A0N;
            requireContext = requireContext();
            A052 = DbV.A05(this);
            if (A022 == num) {
                i = 2131963011;
            } else {
                i = 2131963009;
            }
        }
        C59689JTv.A09(requireContext, A052.getString(i));
        AnonymousClass0eM r2 = this.A03;
        NJT.A06((C67713MtS) r2.getValue(), this, r2, 28);
        ((C67723Mtc) this.A03.getValue()).A01.A08();
    }

    public final void A0K(S5E s5e) {
        super.A0K(s5e);
        AnonymousClass0eM r2 = this.A03;
        ((C67713MtS) r2.getValue()).A02.A0B("GDRIVE_LOGIN_SUCCESS");
        ((C67713MtS) r2.getValue()).A0F(s5e);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CharSequence charSequence;
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        FGX fgx;
        int A022 = AnonymousClass0fD.A02(-1428089758);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_eb_gdrive_onboarding_settings_hard_block_layout, viewGroup, false);
        IgdsHeadline A0O = C66584MXp.A0O(inflate);
        if (AnonymousClass7TF.A1Z(this.A05)) {
            AnonymousClass0eM r8 = this.A04;
            boolean A1Z = AnonymousClass7TF.A1Z(r8);
            NUN nun = ((C67723Mtc) this.A03.getValue()).A01;
            nun.A0E("IS_HARD_BLOCK_RELEASE", true);
            nun.A0E("HAS_IMPLICIT_BACKUP", A1Z);
            boolean A1Z2 = AnonymousClass7TF.A1Z(r8);
            Boolean A0v = AnonymousClass7TE.A0v();
            Context requireContext = requireContext();
            charSequence = null;
            if (A1Z2) {
                NJT.A05(this, fgx, 2131961123);
                fgx.A05((CharSequence) null, getString(2131961124), R.drawable.instagram_id_card_pano_outline_24);
                fgx.A05((CharSequence) null, getString(2131961125), R.drawable.instagram_circle_block_off_pano_outline_24);
            } else {
                fgx = new FGX(requireContext, A0v, 4);
                NJT.A05(this, fgx, 2131961128);
                fgx.A05((CharSequence) null, getString(2131961129), R.drawable.instagram_id_card_pano_outline_24);
                fgx.A05((CharSequence) null, getString(2131961130), R.drawable.instagram_circle_block_off_pano_outline_24);
            }
            A0O.setBulletList(fgx.A04());
            int i = 2131961127;
            if (AnonymousClass7TF.A1Z(r8)) {
                i = 2131961126;
            }
            A0O.setHeadline(i);
            A0O.setImageResource(R.drawable.ig_illustrations_illo_device_warning_refresh);
        } else {
            charSequence = null;
            FGX A012 = FGX.A01(requireContext(), AnonymousClass7TE.A0v());
            NJT.A05(this, A012, 2131961120);
            A012.A05((CharSequence) null, getString(2131961121), R.drawable.instagram_id_card_pano_outline_24);
            FGX.A03(A012, A0O, (CharSequence) null, getString(2131961122), R.drawable.instagram_circle_block_off_pano_outline_24);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = (IgdsBottomButtonLayout) inflate.requireViewById(R.id.bottom_buttons);
        this.A00 = igdsBottomButtonLayout2;
        if (igdsBottomButtonLayout2 != null) {
            C71407Ok6.A02(igdsBottomButtonLayout2, this, 2);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A00;
        if (igdsBottomButtonLayout3 != null) {
            NJT.A07(igdsBottomButtonLayout3, this, 3);
        }
        Bundle bundle2 = this.mArguments;
        if (((bundle2 != null && bundle2.getBoolean("BUNDLE_HIDE_MORE_OPTIONS", false)) || C71145Oe2.A02(this) == AnonymousClass05K.A0C || C71145Oe2.A02(this) == AnonymousClass05K.A0N) && (igdsBottomButtonLayout = this.A00) != null) {
            igdsBottomButtonLayout.setSecondaryActionText(charSequence);
        }
        NJT.A04(inflate, this);
        AnonymousClass0fD.A09(755886452, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1901036587);
        this.A00 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(940039407, A022);
    }

    public final void onResume() {
        View view;
        int A022 = AnonymousClass0fD.A02(-748757475);
        super.onResume();
        if (!C69901Nu3.A00(((C67723Mtc) this.A03.getValue()).A00, AnonymousClass05K.A15).A08() && (view = this.mView) != null) {
            view.post(new PV5(this));
        }
        AnonymousClass0fD.A09(-2126200455, A022);
    }
}
