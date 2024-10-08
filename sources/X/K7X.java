package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import java.util.Map;

public final class K7X extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "SavedAudioCreationGalleryFragment";
    public View A00;
    public C61423K6w A01;
    public C66447MSb A02;
    public boolean A03 = true;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "saved_audio_creation_gallery";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = view.findViewById(R.id.audio_loading_spinner);
        A00(this, C64181LSn.A02("bookmarked", ""));
    }

    public static final void A00(K7X k7x, MusicBrowseCategory musicBrowseCategory) {
        K7X k7x2 = k7x;
        UserSession A0l = AnonymousClass7TE.A0l(k7x2.A04);
        MusicProduct musicProduct = MusicProduct.CLIPS_CAMERA_FORMAT_V2;
        ImmutableList of = ImmutableList.of();
        0qQ.A07(of);
        AnonymousClass80X r11 = AnonymousClass80X.PRE_CAPTURE;
        MusicBrowseCategory musicBrowseCategory2 = musicBrowseCategory;
        C61423K6w A002 = C63352KvZ.A00(C3515589i.PRE_CAPTURE, C59725JVj.PRE_CAPTURE, of, (ImmutableList) null, musicProduct, A0l, (MusicAttributionConfig) null, musicBrowseCategory2, (MusicOverlaySearchTab) null, r11, "", (String) null, "full_list", (Map) null, 0, false, false);
        k7x2.A01 = A002;
        C66447MSb mSb = k7x2.A02;
        if (mSb != null) {
            A002.A05 = mSb;
        }
        0s1 A0C = DbW.A0C(k7x2);
        C61423K6w k6w = k7x2.A01;
        if (k6w == null) {
            0qQ.A0F("musicOverlayBrowseResultsFragment");
            throw AnonymousClass00P.createAndThrow();
        }
        A0C.A0A(k6w, R.id.audio_list_fragment_container);
        A0C.A00();
        07U r10 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = k7x2.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHG(viewLifecycleOwner, musicBrowseCategory2, k7x2, r10, (AnonymousClass4D7) null, 46), AnonymousClass07a.A00(viewLifecycleOwner));
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

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
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
        C61423K6w k6w = this.A01;
        if (k6w != null) {
            return k6w.isScrolledToTop();
        }
        0qQ.A0F("musicOverlayBrowseResultsFragment");
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

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1681949162);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.saved_audio_creation_gallery_fragment_layout, viewGroup, false);
        AnonymousClass0fD.A09(299586766, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1952557115);
        super.onDestroyView();
        this.A00 = null;
        AnonymousClass0fD.A09(1844949794, A022);
    }
}
