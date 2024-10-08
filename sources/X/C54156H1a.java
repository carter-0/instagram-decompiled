package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.H1a  reason: case insensitive filesystem */
public final class C54156H1a extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "PartialAttributionBottomsheetFragment";
    public OriginalAudioPartMetadataIntf A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "partial_attribution_bottomsheet";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ImageUrl imageUrl;
        String str;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        Context requireContext = requireContext();
        ImageView imageView = (ImageView) view2.findViewById(R.id.album_art);
        TextView textView = (TextView) view2.findViewById(R.id.track_title);
        TextView textView2 = (TextView) view2.findViewById(R.id.artist_name);
        View findViewById = view2.findViewById(R.id.container);
        boolean z = false;
        imageView.setImageDrawable(new GIH(requireContext, (GJO) null, DbV.A05(this).getDimensionPixelSize(R.dimen.abc_list_item_height_material), DbZ.A02(this), 0, AnonymousClass7TF.A03(requireContext, R.attr.avatarInnerStroke), DbV.A05(this).getDimensionPixelSize(R.dimen.abc_control_corner_material), -1, false));
        OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf = this.A00;
        String str2 = null;
        if (originalAudioPartMetadataIntf != null) {
            imageUrl = originalAudioPartMetadataIntf.C72();
        } else {
            imageUrl = null;
        }
        JYP.A00(imageView, imageUrl);
        0qQ.A0A(textView);
        GVO gvo = new GVO(textView, requireContext().getColor(2Yu.A08(requireContext)));
        OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf2 = this.A00;
        if (originalAudioPartMetadataIntf2 != null) {
            str = originalAudioPartMetadataIntf2.getDisplayTitle();
        } else {
            str = null;
        }
        OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf3 = this.A00;
        if (originalAudioPartMetadataIntf3 != null && originalAudioPartMetadataIntf3.isExplicit()) {
            z = true;
        }
        GVM.A00((Drawable) null, gvo, str, z, false);
        OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf4 = this.A00;
        if (originalAudioPartMetadataIntf4 != null) {
            str2 = originalAudioPartMetadataIntf4.getDisplayArtist();
        }
        textView2.setText(str2);
        C56801ICy.A01(findViewById, 3, this);
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

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
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

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
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
        int A02 = AnonymousClass0fD.A02(1378680819);
        C54156H1a.super.onCreate(bundle);
        this.A00 = (OriginalAudioPartMetadataIntf) requireArguments().getParcelable("audio_part_metadata");
        AnonymousClass0fD.A09(-607341863, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(530592224);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_partial_attribution_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1257277380, A02);
        return inflate;
    }
}
