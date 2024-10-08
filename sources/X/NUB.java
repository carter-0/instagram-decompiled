package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

public final class NUB extends C61887KQc implements C273494mf {
    public static final /* synthetic */ AnonymousClass0YZ[] A05 = NJT.A0A(NUB.class);
    public static final String __redex_internal_original_name = "EncryptedBackupsGDriveOnboardingSetupSoftBlockFragment";
    public IgdsBottomButtonLayout A00;
    public C62320sa A01 = new C73904Plf(this, 36);
    public Integer A02;
    public final C319956rV A03;
    public final AnonymousClass0eM A04;

    public final void A0H() {
        A0L(false);
        ((C67713MtS) this.A03.getValue()).A02.A0B("GDRIVE_SETUP_ACCOUNT_PICKER_DISMISS");
        A0L(false);
    }

    public final void A0J(C74223PrB prB) {
        ((C67713MtS) this.A03.getValue()).A0E(prB);
        A0L(false);
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "encrypted_backups_gdrive_onboarding_setup_soft_block_fragment";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void A0E() {
        Integer num = this.A02;
        0qQ.A0B(num, 0);
        NUN nun = ((C67720MtZ) this.A04.getValue()).A01;
        nun.A0D("END_REASON", "SOFT_BLOCK_3P_LEADING_SCREEN_CLOSED");
        nun.A0B("SOFT_BLOCK_3P_LEADING_SCREEN_CLOSED");
        nun.A0A(num);
    }

    public final void A0F() {
        ((C67720MtZ) this.A04.getValue()).A01.A0B("GDRIVE_SETUP_ACCOUNT_PICKER_IMPRESSION");
    }

    public final void A0L(boolean z) {
        View view = this.mView;
        if (view != null) {
            view.post(new C73184PYO(this, z));
        }
    }

    public final void afterOnViewCreated() {
        String str;
        DbZ.A1C(this, new C66162MFz(this, (AnonymousClass4D7) null, 32), new MC9(((C67713MtS) this.A03.getValue()).A07, 40));
        Integer A022 = C71145Oe2.A02(this);
        Integer A032 = C71145Oe2.A03(this);
        Integer A012 = C71145Oe2.A01(this);
        0qQ.A0B(A022, 0);
        0qQ.A0B(A032, 1);
        NUN nun = ((C67720MtZ) this.A04.getValue()).A01;
        nun.A09();
        nun.A0B("SOFT_BLOCK_3P_LEADING_SCREEN_IMPRESSION");
        int intValue = A022.intValue();
        if (intValue == 10) {
            str = "THREAD_EXIT";
        } else if (intValue == 11) {
            str = "INBOX_BANNER";
        } else if (intValue != 4) {
            if (intValue == 2) {
                str = "SETTINGS";
            }
            nun.A0D("PERIOD", C69893Ntv.A00(A032));
            C66913Mex.A02(nun, A012, "SETUP_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        } else {
            str = "FISHFOODING";
        }
        nun.A0D("ENTRY_POINT", str);
        nun.A0D("PERIOD", C69893Ntv.A00(A032));
        C66913Mex.A02(nun, A012, "SETUP_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
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
        return NJT.A09(this.A03, this, A05, 0);
    }

    public final boolean onBackPressed() {
        ((C67720MtZ) this.A04.getValue()).A01.A0B("SOFT_BLOCK_3P_LEADING_SCREEN_NAVIGATE_BACK");
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.Dde, X.6rV] */
    public NUB() {
        C73904Plf plf = new C73904Plf(this, 33);
        AnonymousClass0eM A002 = C73904Plf.A00(new C73904Plf(this, 37), 0eO.A02, 38);
        this.A04 = DbS.A0I(new C73904Plf(A002, 39), plf, new C73664Phd(41, A002, (Object) null), DbS.A0z(C67720MtZ.class));
        this.A02 = AnonymousClass05K.A0C;
        this.A03 = new C46362Dde(this, new C73904Plf(this, 35));
    }

    public final void A0G() {
        C59689JTv.A09(requireContext(), DbV.A05(this).getString(2131963009));
        AnonymousClass0eM r2 = this.A03;
        NJT.A06((C67713MtS) r2.getValue(), this, r2, 34);
        this.A02 = AnonymousClass05K.A00;
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
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        int A022 = AnonymousClass0fD.A02(-1297451111);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_eb_gdrive_onboarding_settings_soft_block_layout, viewGroup, false);
        IgdsHeadline A0O = C66584MXp.A0O(inflate);
        View A0G = AnonymousClass7TF.A0G(inflate, R.id.text);
        A0O.setHeadline((CharSequence) getString(2131961133));
        if (C71145Oe2.A03(this) == AnonymousClass05K.A0N || C71145Oe2.A03(this) == AnonymousClass05K.A0Y) {
            A0G.setVisibility(8);
            FGX A012 = FGX.A01(requireContext(), AnonymousClass7TE.A0v());
            NJT.A05(this, A012, 2131961120);
            A012.A05((CharSequence) null, getString(2131961121), R.drawable.instagram_id_card_pano_outline_24);
            FGX.A03(A012, A0O, (CharSequence) null, getString(2131961122), R.drawable.instagram_circle_block_off_pano_outline_24);
        } else {
            A0O.setBody((CharSequence) getString(2131961132));
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = (IgdsBottomButtonLayout) inflate.requireViewById(R.id.bottom_buttons);
        this.A00 = igdsBottomButtonLayout2;
        if (igdsBottomButtonLayout2 != null) {
            C71407Ok6.A02(igdsBottomButtonLayout2, this, 4);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A00;
        if (igdsBottomButtonLayout3 != null) {
            NJT.A07(igdsBottomButtonLayout3, this, 5);
        }
        Bundle bundle2 = this.mArguments;
        if (!(bundle2 == null || !bundle2.getBoolean("BUNDLE_HIDE_MORE_OPTIONS", false) || (igdsBottomButtonLayout = this.A00) == null)) {
            igdsBottomButtonLayout.setSecondaryActionText((CharSequence) null);
        }
        NJT.A04(inflate, this);
        AnonymousClass0fD.A09(-255662613, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(287688489);
        this.A00 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(-1961268593, A022);
    }

    public final void onResume() {
        View view;
        int A022 = AnonymousClass0fD.A02(-1613280677);
        super.onResume();
        if (!C69901Nu3.A00(((C67720MtZ) this.A04.getValue()).A00, AnonymousClass05K.A15).A08() && (view = this.mView) != null) {
            view.post(new PV6(this));
        }
        AnonymousClass0fD.A09(1640792251, A022);
    }
}
