package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.PunchedOverlayView;
import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;
import com.instagram.creation.base.ui.grid.GridLinesView;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;

/* renamed from: X.K6t  reason: case insensitive filesystem */
public final class C61422K6t extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DR, AnonymousClass4DS, C66517MUv {
    public static final String __redex_internal_original_name = "IGTVUploadEditFeedPreviewCropFragment";
    public float A00;
    public int A01;
    public RectF A02;
    public ImageView A03;
    public SeekBar A04;
    public TextView A05;
    public IgTextView A06;
    public PunchedOverlayView A07;
    public VideoPreviewView A08;
    public GridLinesView A09;
    public boolean A0A;
    public LinearLayout A0B;
    public C64720Lgx A0C;
    public final AnonymousClass0eM A0D = C227642jf.A02(this);
    public final AnonymousClass0eM A0E = C66306MMp.A00(this, C66306MMp.A02(this, 36), new C73666Phf(12, (Object) null, this), DbS.A0z(IGTVUploadViewModel.class), 37);
    public final C64883Ljj A0F = new KIK(this, 1);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.setTitle(getString(2131964023));
        DbX.A19(LY6.A00(this, 16), LJA.A00(this, r3), r3);
    }

    public final String getModuleName() {
        return "igtv_edit_feed_crop_fragment";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        GridLinesView gridLinesView = (GridLinesView) view.findViewById(R.id.grid_overlay);
        gridLinesView.A02 = false;
        this.A09 = gridLinesView;
        PunchedOverlayView punchedOverlayView = (PunchedOverlayView) view.findViewById(R.id.punched_overlay_view);
        punchedOverlayView.A01 = AnonymousClass7TF.A03(requireContext, R.attr.backgroundColorSecondary);
        LYT.A00(punchedOverlayView, 10, this);
        this.A07 = punchedOverlayView;
        VideoPreviewView videoPreviewView = (VideoPreviewView) view.findViewById(R.id.video_preview);
        videoPreviewView.setVideoPath(JTR.A0o(this.A0E).A02.A1N.A0F, this.A0F);
        C64286LYm.A00(videoPreviewView, 21, this);
        this.A08 = videoPreviewView;
        int A062 = 0nA.A06(requireContext) - (DbV.A05(this).getDimensionPixelOffset(R.dimen.account_group_management_clickable_width) * 2);
        int A052 = JTO.A05((float) A062, 0.5625f);
        VideoPreviewView videoPreviewView2 = this.A08;
        if (videoPreviewView2 == null) {
            0qQ.A0F("videoPreviewView");
            throw AnonymousClass00P.createAndThrow();
        }
        ViewGroup.LayoutParams layoutParams = videoPreviewView2.getLayoutParams();
        layoutParams.width = A062;
        layoutParams.height = A052;
        videoPreviewView2.setLayoutParams(layoutParams);
        IgTextView A0X = JTO.A0X(view, R.id.edit_feed_preview_crop_helper_text);
        int i = this.A01;
        if (i != 60000) {
            DbX.A1F(A0X, this, Integer.valueOf(i / IgNetworkConsentStorage.MAX_ENTRIES), 2131964103);
        }
        Resources resources = A0X.getResources();
        0nA.A0V(A0X, AnonymousClass1GB.A01(((((float) 0nA.A08(requireContext)) / 2.0f) - (((((float) 0nA.A09(requireContext)) - (0nA.A00(requireContext, resources.getDimension(R.dimen.account_group_management_clickable_width)) * 2.0f)) / 0.8f) / 2.0f)) - 0nA.A00(requireContext, resources.getDimension(R.dimen.account_group_management_clickable_width))));
        this.A06 = A0X;
        int A022 = DbS.A02(requireContext, 11);
        C59984Jct jct = new C59984Jct(A022, A022, JTP.A02(getContext(), requireContext, R.attr.glyphColorPrimary), DbS.A02(requireContext, 1));
        jct.setAlpha(255);
        SeekBar seekBar = (SeekBar) view.findViewById(R.id.scrubber);
        seekBar.setThumb(jct);
        seekBar.setMax(this.A01);
        seekBar.setProgressDrawable(seekBar.getResources().getDrawable(2Yu.A0H(requireContext, R.attr.videoScrubberProgressBarDrawable)));
        seekBar.setOnSeekBarChangeListener(new LZO(this, 0));
        this.A04 = seekBar;
        ImageView A0G = DbS.A0G(view, R.id.pause_button);
        DbU.A14(requireContext, A0G, 2Yu.A0B(requireContext));
        LY6.A01(A0G, 17, this);
        this.A03 = A0G;
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.timer);
        DbT.A17(requireContext, A0d, 2Yu.A0B(requireContext));
        this.A05 = A0d;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.video_controls_container);
        linearLayout.setBackgroundColor(2Yu.A00(linearLayout.getContext()));
        this.A0B = linearLayout;
    }

    public static final void A00(C61422K6t k6t) {
        String str;
        VideoPreviewView videoPreviewView = k6t.A08;
        if (videoPreviewView == null) {
            str = "videoPreviewView";
        } else {
            videoPreviewView.A06();
            ImageView imageView = k6t.A03;
            if (imageView == null) {
                str = "scrubberButton";
            } else {
                imageView.setImageResource(R.drawable.pause);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean BCK() {
        return this.A0A;
    }

    public final void Cxb() {
        C63299Kui.A00(this, this.A0E);
    }

    public final void D92() {
        JTO.A0k(this.A0E).A04(this, KTQ.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0D);
    }

    public final boolean onBackPressed() {
        C64720Lgx lgx = this.A0C;
        if (lgx != null) {
            return lgx.onBackPressed();
        }
        0qQ.A0F("backHandlerDelegate");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1960208330);
        C61422K6t.super.onCreate(bundle);
        this.A0C = new C64720Lgx(requireContext(), this);
        this.A0D.getValue();
        this.A01 = 60000;
        AnonymousClass0fD.A09(-27574740, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1152446759);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.upload_edit_feed_preview_crop_fragment, false);
        AnonymousClass0fD.A09(-897375254, A022);
        return A0D2;
    }
}
