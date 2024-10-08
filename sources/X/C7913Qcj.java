package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.smartcapture.components.ContourView;
import com.facebook.smartcapture.components.DottedAlignmentView;
import com.facebook.smartcapture.components.RectDetectionVisualizerView;
import com.facebook.smartcapture.docauth.CaptureState;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import com.facebook.smartcapture.ui.PhotoRequirementsView;
import com.facebook.smartcapture.ui.TextTipView;
import com.instagram.android.R;
import java.util.Map;

/* renamed from: X.Qcj  reason: case insensitive filesystem */
public final class C7913Qcj extends C7915Qcm {
    public ObjectAnimator A00;
    public View A01;
    public Button A02;
    public ImageButton A03;
    public ImageView A04;
    public LinearLayout A05;
    public ProgressBar A06;
    public ProgressBar A07;
    public ProgressBar A08;
    public TextView A09;
    public ContourView A0A;
    public RectDetectionVisualizerView A0B;
    public PhotoRequirementsView A0C;
    public TextTipView A0D;
    public final Animator.AnimatorListener A0E = new C71161Oea(this, 1);
    public final View.OnClickListener A0F = new C11497SbK(this, 25);

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        this.A04 = SKW.A01(view, R.id.iv_back_button);
        this.A0A = (ContourView) SKW.A00(view, R.id.contour_view);
        this.A0D = (TextTipView) SKW.A00(view, R.id.text_tip_view);
        this.A0B = (RectDetectionVisualizerView) SKW.A00(view, R.id.rect_detection_visualizer_view);
        this.A03 = (ImageButton) SKW.A00(view, R.id.btn_shutter);
        this.A06 = (ProgressBar) SKW.A00(view, R.id.pb_downloading);
        this.A07 = (ProgressBar) SKW.A00(view, R.id.pb_shutter_loading);
        this.A08 = (ProgressBar) SKW.A00(view, R.id.pb_shutter_motion_sensor_guidance);
        this.A01 = SKW.A00(view, R.id.help_button);
        this.A05 = (LinearLayout) SKW.A00(view, R.id.ll_download_failed_container);
        this.A02 = (Button) SKW.A00(view, R.id.btn_download_retry);
        this.A09 = SKW.A02(view, R.id.tv_credit_card_results);
        PhotoRequirementsView photoRequirementsView = (PhotoRequirementsView) SKW.A00(view, R.id.photo_requirements_view);
        this.A0C = photoRequirementsView;
        C13857Tic tic = this.A00;
        if (!(tic == null || photoRequirementsView == null)) {
            boolean z = this.A04;
            Context context = photoRequirementsView.getContext();
            LayoutInflater from = LayoutInflater.from(context);
            View inflate = from.inflate(R.layout.photo_requirements_view, photoRequirementsView, false);
            photoRequirementsView.A00 = inflate;
            0qQ.A0A(inflate);
            ViewGroup viewGroup = (ViewGroup) SKW.A00(inflate, R.id.photo_requirements_item_container);
            AnonymousClass030 r4 = new AnonymousClass030(context, new C380319Xn(photoRequirementsView, 2));
            View view2 = photoRequirementsView.A00;
            if (view2 != null) {
                view2.setOnTouchListener(new C64286LYm((Object) r4, 0));
            }
            Integer valueOf = Integer.valueOf(R.string.f0nameremoved);
            int i = R.string.f0nameremoved;
            if (z) {
                i = R.string.f0nameremoved;
            }
            Integer valueOf2 = Integer.valueOf(i);
            0qQ.A07(context);
            AnonymousClass59G r6 = new AnonymousClass59G(valueOf, valueOf2, tic.Bc8(context));
            AnonymousClass59G r42 = new AnonymousClass59G(Integer.valueOf(R.string.f0nameremoved), Integer.valueOf(R.string.f0nameremoved), tic.Bc7(context));
            int i2 = R.string.f0nameremoved;
            if (z) {
                i2 = R.string.f0nameremoved;
            }
            Integer valueOf3 = Integer.valueOf(i2);
            int i3 = R.string.f0nameremoved;
            if (z) {
                i3 = R.string.f0nameremoved;
            }
            for (AnonymousClass59G r1 : 0sr.A1P(new AnonymousClass59G[]{r6, r42, new AnonymousClass59G(valueOf3, Integer.valueOf(i3), tic.Bc9(context))})) {
                int A0M = AnonymousClass7TE.A0M(r1.A00);
                int A0M2 = AnonymousClass7TE.A0M(r1.A01);
                Drawable drawable = (Drawable) r1.A02;
                View inflate2 = from.inflate(R.layout.photo_requirements_item, viewGroup, false);
                0qQ.A0C(inflate2, AnonymousClass000.A00(5));
                0qQ.A0B(inflate2, 3);
                ImageView A012 = SKW.A01(inflate2, R.id.iv_photo_requirements_item_icon);
                TextView A022 = SKW.A02(inflate2, R.id.tv_photo_requirements_item_title);
                TextView A023 = SKW.A02(inflate2, R.id.tv_photo_requirements_item_subtext);
                if (drawable != null) {
                    A012.setImageDrawable(drawable);
                } else {
                    A012.setVisibility(8);
                }
                A022.setText(A0M);
                A023.setText(A0M2);
                viewGroup.addView(inflate2);
            }
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) SKW.A00(view, R.id.cl_bottom_actions_container);
        C270354gb r2 = new C270354gb();
        r2.A0I(constraintLayout);
        if (AnonymousClass7TF.A0E(requireContext()).density < 2.0f) {
            C270354gb.A02(r2, R.id.help_button).A03.A0u = (int) DbV.A05(this).getDimension(R.dimen.ad_not_delivering_thumbnail_height);
        }
        r2.A0G(constraintLayout);
        ImageView imageView = this.A04;
        0qQ.A0A(imageView);
        C11497SbK.A01(imageView, 26, this);
        View view3 = this.A01;
        if (view3 == null) {
            0qQ.A0F("helpButton");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fU.A00(this.A0F, view3);
        ImageButton imageButton = this.A03;
        0qQ.A0A(imageButton);
        C11497SbK.A01(imageButton, 27, this);
        Button button = this.A02;
        0qQ.A0A(button);
        C11497SbK.A01(button, 28, this);
        ProgressBar progressBar = this.A08;
        0qQ.A0A(progressBar);
        progressBar.setProgress(0);
        ProgressBar progressBar2 = this.A08;
        0qQ.A0A(progressBar2);
        progressBar2.setMax(100);
        ProgressBar progressBar3 = this.A08;
        0qQ.A0C(progressBar3, C273654mx.A00(348));
        ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar3, ReactProgressBarViewManager.PROP_PROGRESS, new int[]{0, 100});
        this.A00 = ofInt;
        0qQ.A0A(ofInt);
        ofInt.setStartDelay(500);
        ObjectAnimator objectAnimator = this.A00;
        0qQ.A0A(objectAnimator);
        objectAnimator.setDuration(2000);
        RectDetectionVisualizerView rectDetectionVisualizerView = this.A0B;
        0qQ.A0A(rectDetectionVisualizerView);
        rectDetectionVisualizerView.setVisibility(8);
        TextTipView textTipView = this.A0D;
        0qQ.A0A(textTipView);
        textTipView.setVisibility(8);
        if (this.A04) {
            ImageButton imageButton2 = this.A03;
            0qQ.A0A(imageButton2);
            imageButton2.setVisibility(8);
            ProgressBar progressBar4 = this.A07;
            0qQ.A0A(progressBar4);
            progressBar4.setVisibility(8);
            ProgressBar progressBar5 = this.A08;
            0qQ.A0A(progressBar5);
            progressBar5.setVisibility(8);
        }
        TextTipView textTipView2 = this.A0D;
        if (textTipView2 != null) {
            C13857Tic tic2 = this.A00;
            0qQ.A0A(tic2);
            IdCaptureLogger idCaptureLogger = this.A01;
            0qQ.A0B(tic2, 0);
            textTipView2.A00 = idCaptureLogger;
            ImageView imageView2 = textTipView2.A01;
            Context A0S = AnonymousClass7TE.A0S(textTipView2);
            imageView2.setImageDrawable(tic2.Bc7(A0S));
            0qQ.A0A(A0S);
            C11408SSf.A01(A0S, R.attr.sc_accent);
            Map map = textTipView2.A05;
            A00(CaptureState.MANUAL_CAPTURE, map);
            A00(CaptureState.ID_TYPE_DETECTION, map);
            C11408SSf.A01(A0S, R.attr.sc_warning);
            A00(CaptureState.ID_FOUND, map);
            C11408SSf.A01(A0S, R.attr.sc_positive);
            A00(CaptureState.HOLDING_STEADY, map);
            CaptureState captureState = CaptureState.CAPTURING_AUTOMATIC;
            A00(captureState, map);
            map.put(Integer.valueOf(CaptureState.CAPTURING_MANUAL.ordinal()), C51968G9o.A10(map, captureState.ordinal()));
        }
        Context requireContext = requireContext();
        ProgressBar progressBar6 = this.A06;
        0qQ.A0A(progressBar6);
        C11408SSf.A03(requireContext, progressBar6, R.attr.sc_always_white);
        Context requireContext2 = requireContext();
        ProgressBar progressBar7 = this.A07;
        0qQ.A0A(progressBar7);
        C11408SSf.A03(requireContext2, progressBar7, R.attr.sc_accent);
    }

    public static void A00(Enum enumR, Map map) {
        map.put(Integer.valueOf(enumR.ordinal()), new Object());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(753185334);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.default_capture_overlay_fragment, false);
        FrameLayout frameLayout = new FrameLayout(requireContext(), (AttributeSet) null);
        frameLayout.setId(R.id.photo_requirements_view);
        C71492dQ r1 = new C71492dQ(-1, -1);
        0qQ.A0C(A0D2, C273654mx.A00(24));
        ((ViewGroup) A0D2).addView(frameLayout, r1);
        AnonymousClass0fD.A09(36369608, A022);
        return A0D2;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1078982505);
        C7913Qcj.super.onPause();
        ContourView contourView = this.A0A;
        0qQ.A0A(contourView);
        DottedAlignmentView dottedAlignmentView = contourView.A0C;
        dottedAlignmentView.post(new C12893TCh(dottedAlignmentView));
        AnonymousClass0fD.A09(-282832122, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-2052897385);
        C7913Qcj.super.onResume();
        RectDetectionVisualizerView rectDetectionVisualizerView = this.A0B;
        0qQ.A0A(rectDetectionVisualizerView);
        rectDetectionVisualizerView.postInvalidate();
        AnonymousClass0fD.A09(-2008896361, A022);
    }
}
