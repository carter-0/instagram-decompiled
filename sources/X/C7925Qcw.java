package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.facebook.smartcapture.ui.ResourcesButton;
import com.facebook.smartcapture.ui.ResourcesTextView;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.Qcw  reason: case insensitive filesystem */
public class C7925Qcw extends C7916Qcn {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04 = 1.0f;
    public int A05 = -1;
    public Bitmap A06;
    public ScaleGestureDetector A07;
    public View A08;
    public ViewGroup A09;
    public FrameLayout A0A;
    public FrameLayout A0B;
    public FrameLayout A0C;
    public ImageView A0D;
    public ImageView A0E;
    public ImageView A0F;
    public ImageView A0G;
    public ImageView A0H;
    public LinearLayout A0I;
    public ProgressBar A0J;
    public RelativeLayout A0K;
    public ResourcesButton A0L;
    public ResourcesButton A0M;
    public ResourcesTextView A0N;
    public ResourcesTextView A0O;
    public ResourcesTextView A0P;
    public ResourcesTextView A0Q;
    public ResourcesTextView A0R;
    public C7376Q9n A0S;
    public Q9N A0T;
    public String A0U;
    public String A0V;
    public ArrayList A0W;
    public boolean A0X;
    public boolean A0Y;
    public ImageView A0Z;
    public RE7 A0a;
    public C8878RDv A0b;
    public Point[] A0c;

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        Drawable drawable;
        ImageView imageView;
        ImageView imageView2;
        C8878RDv rDv;
        ResourcesButton resourcesButton;
        int i2;
        0qQ.A0B(view, 0);
        this.A09 = (ViewGroup) view;
        this.A0D = SKW.A01(view, R.id.iv_photo_review);
        this.A0F = SKW.A01(view, R.id.iv_photo_review_expand);
        this.A0J = (ProgressBar) SKW.A00(view, R.id.pb_photo_review_loading);
        FrameLayout frameLayout = this.A0B;
        0qQ.A0A(frameLayout);
        this.A0G = SKW.A01(frameLayout, R.id.iv_photo_review_full);
        this.A0E = SKW.A01(view, R.id.iv_back_button);
        FrameLayout frameLayout2 = this.A0B;
        0qQ.A0A(frameLayout2);
        this.A0H = SKW.A01(frameLayout2, R.id.iv_photo_review_full_close);
        this.A0I = (LinearLayout) SKW.A00(view, R.id.ll_photo_review_text);
        this.A0P = (ResourcesTextView) view.findViewById(R.id.tv_photo_review_header);
        this.A0Q = (ResourcesTextView) SKW.A00(view, R.id.tv_photo_review_title);
        this.A0N = (ResourcesTextView) SKW.A00(view, R.id.tv_photo_review_body);
        this.A0O = (ResourcesTextView) SKW.A00(view, R.id.tv_photo_review_body_info);
        this.A0C = (FrameLayout) SKW.A00(view, R.id.fl_privacy_disclaimer_container);
        this.A0L = (ResourcesButton) SKW.A00(view, R.id.btn_primary);
        this.A0M = (ResourcesButton) SKW.A00(view, R.id.btn_secondary);
        this.A0K = (RelativeLayout) SKW.A00(view, R.id.rl_sync_feedback_container);
        this.A0Z = SKW.A01(view, R.id.iv_sync_feedback_icon);
        this.A0R = (ResourcesTextView) SKW.A00(view, R.id.tv_sync_feedback_error);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A0X = bundle2.getBoolean("is_cancel_confirmation_action_sheet_enabled");
            this.A0a = (RE7) bundle2.getSerializable("capture_mode");
            this.A0b = (C8878RDv) bundle2.getSerializable("capture_stage");
            this.A0V = bundle2.getString("sync_feedback_error");
            this.A0U = bundle2.getString("photo_file_path");
            Parcelable[] parcelableArray = bundle2.getParcelableArray("skewed_crop_points");
            if (parcelableArray != null) {
                this.A0c = (Point[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Point[].class);
            }
        }
        RE7 re7 = this.A0a;
        if (!(re7 == null || (rDv = this.A0b) == null)) {
            if (re7 == RE7.TWO_SIDES && rDv == C8878RDv.ID_FRONT_SIDE) {
                resourcesButton = this.A0L;
                0qQ.A0A(resourcesButton);
                i2 = R.string.f0nameremoved;
            } else {
                Pxi.A18(this.A0O);
                resourcesButton = this.A0L;
                0qQ.A0A(resourcesButton);
                i2 = R.string.f0nameremoved;
            }
            resourcesButton.setText(i2);
        }
        Context requireContext = requireContext();
        C13857Tic tic = this.A00;
        if (tic != null) {
            Drawable drawable2 = requireContext().getDrawable(R.drawable.instagram_arrow_left_pano_outline_24);
            if (!(drawable2 == null || (imageView2 = this.A0E) == null)) {
                imageView2.setImageDrawable(drawable2);
            }
            if (!(this.A00 == null || (drawable = requireContext().getDrawable(R.drawable.instagram_arrow_left_pano_outline_24)) == null || (imageView = this.A0H) == null)) {
                imageView.setImageDrawable(drawable);
            }
            Drawable C7e = tic.C7e(requireContext);
            ImageView imageView3 = this.A0F;
            if (C7e != null) {
                0qQ.A0A(imageView3);
                imageView3.setImageDrawable(C7e);
            } else {
                Pxi.A18(imageView3);
            }
        }
        C11497SbK sbK = new C11497SbK(this, 37);
        ResourcesButton resourcesButton2 = this.A0M;
        0qQ.A0A(resourcesButton2);
        AnonymousClass0fU.A00(sbK, resourcesButton2);
        boolean z = this.A0X;
        ImageView imageView4 = this.A0E;
        if (z) {
            0qQ.A0A(imageView4);
            i = 32;
        } else {
            0qQ.A0A(imageView4);
            i = 33;
        }
        C11497SbK.A01(imageView4, i, this);
        ImageView imageView5 = this.A0D;
        0qQ.A0A(imageView5);
        C11497SbK.A01(imageView5, 34, this);
        FrameLayout frameLayout3 = this.A0B;
        0qQ.A0A(frameLayout3);
        C11497SbK.A01(SKW.A00(frameLayout3, R.id.iv_photo_review_full_close), 35, this);
        ResourcesButton resourcesButton3 = this.A0L;
        0qQ.A0A(resourcesButton3);
        C11497SbK.A01(resourcesButton3, 36, this);
        String str = this.A0V;
        if (str != null) {
            ResourcesTextView resourcesTextView = this.A0Q;
            0qQ.A0A(resourcesTextView);
            resourcesTextView.setVisibility(8);
            ResourcesTextView resourcesTextView2 = this.A0N;
            0qQ.A0A(resourcesTextView2);
            resourcesTextView2.setVisibility(8);
            ResourcesTextView resourcesTextView3 = this.A0O;
            0qQ.A0A(resourcesTextView3);
            resourcesTextView3.setVisibility(8);
            ResourcesButton resourcesButton4 = this.A0M;
            0qQ.A0A(resourcesButton4);
            resourcesButton4.setVisibility(8);
            RelativeLayout relativeLayout = this.A0K;
            0qQ.A0A(relativeLayout);
            relativeLayout.setVisibility(0);
            ResourcesTextView resourcesTextView4 = this.A0R;
            0qQ.A0A(resourcesTextView4);
            resourcesTextView4.setText(Html.fromHtml(str, 0));
            ResourcesButton resourcesButton5 = this.A0L;
            0qQ.A0A(resourcesButton5);
            resourcesButton5.setText(R.string.f0nameremoved);
        }
        LinearLayout linearLayout = this.A0I;
        0qQ.A0A(linearLayout);
        linearLayout.post(new C12896TCk(this));
        Context requireContext2 = requireContext();
        ProgressBar progressBar = this.A0J;
        0qQ.A0A(progressBar);
        C11408SSf.A03(requireContext2, progressBar, R.attr.sc_accent);
        Context requireContext3 = requireContext();
        TypedValue typedValue = new TypedValue();
        requireContext3.getTheme().resolveAttribute(R.attr.id_photo_review_hide_header, typedValue, false);
        if (typedValue.data != 0) {
            Pxi.A18(this.A0P);
        }
        TypedValue typedValue2 = new TypedValue();
        requireContext3.getTheme().resolveAttribute(R.attr.id_photo_review_centered_text, typedValue2, false);
        if (typedValue2.data != 0) {
            ResourcesTextView resourcesTextView5 = this.A0Q;
            0qQ.A0A(resourcesTextView5);
            resourcesTextView5.setGravity(49);
            ResourcesTextView resourcesTextView6 = this.A0N;
            0qQ.A0A(resourcesTextView6);
            resourcesTextView6.setGravity(49);
            ResourcesTextView resourcesTextView7 = this.A0O;
            0qQ.A0A(resourcesTextView7);
            resourcesTextView7.setGravity(49);
        }
        TypedValue typedValue3 = new TypedValue();
        requireContext3.getTheme().resolveAttribute(R.attr.id_photo_review_title_text, typedValue3, true);
        CharSequence charSequence = typedValue3.string;
        if (!(charSequence == null || charSequence.length() == 0)) {
            ResourcesTextView resourcesTextView8 = this.A0Q;
            0qQ.A0A(resourcesTextView8);
            resourcesTextView8.setText(charSequence);
        }
        TypedValue typedValue4 = new TypedValue();
        requireContext3.getTheme().resolveAttribute(R.attr.id_photo_review_body_text, typedValue4, true);
        CharSequence charSequence2 = typedValue4.string;
        if (!(charSequence2 == null || charSequence2.length() == 0)) {
            ResourcesTextView resourcesTextView9 = this.A0N;
            0qQ.A0A(resourcesTextView9);
            resourcesTextView9.setText(charSequence2);
        }
        if (this.A02 != null) {
            ViewGroup viewGroup = this.A09;
            0qQ.A0A(viewGroup);
            viewGroup.removeView(this.A0C);
        }
        this.A0W = AnonymousClass7TE.A1C();
        this.A08 = view;
        this.A0A = (FrameLayout) view.findViewById(R.id.sc_action_sheet_container);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-631015450);
        0qQ.A0B(layoutInflater, 0);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.default_photo_review_fragment, viewGroup, false);
        this.A0B = (FrameLayout) layoutInflater.inflate(R.layout.photo_review_full, viewGroup2, false);
        AnonymousClass0fD.A09(386002183, A022);
        return viewGroup2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(869798615);
        C7925Qcw.super.onDestroyView();
        this.A0A = null;
        this.A0S = null;
        this.A0W = null;
        this.A08 = null;
        AnonymousClass0fD.A09(289513727, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(373062709);
        C7925Qcw.super.onStart();
        if (this.A06 == null) {
            XtE.A00(new TNH(this, 7)).A05(new C11767SgD(this, 3), XtE.A0B);
        }
        AnonymousClass0fD.A09(-769808181, A022);
    }
}
