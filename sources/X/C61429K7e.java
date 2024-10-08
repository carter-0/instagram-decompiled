package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* renamed from: X.K7e  reason: case insensitive filesystem */
public final class C61429K7e extends AnonymousClass4DH implements C273494mf, AnonymousClass8ML {
    public static final String __redex_internal_original_name = "ClipsAssetHubMemeBackgroundSelectionFragment";
    public int A00 = 15000;
    public C64968Ll7 A01;
    public ClipsAssetHubViewModel A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0iw A04 = new C64579LeL(this);

    public final void D7Z() {
    }

    public final void D7a(Medium medium, Integer num) {
    }

    public final void DR4(Medium medium) {
        0qQ.A0B(medium, 0);
        if (!medium.CeS() || medium.A03 >= this.A00) {
            ClipsAssetHubViewModel clipsAssetHubViewModel = this.A02;
            if (clipsAssetHubViewModel == null) {
                0qQ.A0F("clipsAssetHubViewModel");
                throw AnonymousClass00P.createAndThrow();
            }
            clipsAssetHubViewModel.A02 = true;
            AnonymousClass7TE.A1Z(new MH1(medium, clipsAssetHubViewModel, (AnonymousClass4D7) null, 1), C318116oQ.A00(clipsAssetHubViewModel));
            return;
        }
        1xC r8 = 1xC.A01;
        C310336ap A0W = DbV.A0W();
        A0W.A02();
        A0W.A04 = requireContext().getDrawable(R.drawable.instagram_info_pano_outline_24);
        A0W.A0J = true;
        A0W.A0D = AnonymousClass7TF.A0e(DbV.A05(this), new BigDecimal((double) (((float) this.A00) / 1000.0f)).setScale(1, RoundingMode.CEILING).toString(), 2131955207);
        DbY.A1K(r8, A0W);
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean doNotDismissOnDraggingDown() {
        return true;
    }

    public final boolean doNotDragWhenDismissLocked() {
        return true;
    }

    public final boolean doNotFlingWhenDismissLocked() {
        return true;
    }

    public final String getModuleName() {
        return "clips_asset_hub_meme_background_selection";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.07Z, androidx.fragment.app.Fragment, X.K7e, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewStub viewStub = (ViewStub) AnonymousClass7TF.A0G(view, R.id.clips_asset_hub_meme_background_selection_gallery_stub);
        FragmentActivity requireActivity = requireActivity();
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(this.A03);
        AnonymousClass0iw r6 = this.A04;
        0gy A002 = AnonymousClass07i.A00(this);
        requireContext().getColor(R.color.grey_9);
        int width = C226132fh.A01(requireContext()).getWidth();
        C64968Ll7 ll7 = new C64968Ll7(requireActivity, requireContext, viewStub, A002, r6, A0l, this, AnonymousClass05K.A02, Integer.valueOf(this.A00), width, true, false);
        this.A01 = ll7;
        ll7.E0h();
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
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

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
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
        C64968Ll7 ll7 = this.A01;
        if (ll7 != null) {
            return C2808154f.A03(ll7.A0G);
        }
        0qQ.A0F("cutoutStickerGalleryController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1406456485);
        C61429K7e.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A00 = bundle2.getInt(AnonymousClass000.A00(3944));
            FragmentActivity requireActivity = requireActivity();
            0qQ.A0C(requireActivity, AnonymousClass000.A00(177));
            this.A02 = JTO.A0L(new AnonymousClass85R(DbY.A05(this), AnonymousClass7TE.A0l(this.A03)), requireActivity).A00(ClipsAssetHubViewModel.class);
            AnonymousClass0fD.A09(550149673, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(310480617, A022);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1203969289);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.clips_asset_hub_meme_background_selection_fragment_layout, viewGroup, false);
        AnonymousClass0fD.A09(1963258581, A022);
        return inflate;
    }
}
