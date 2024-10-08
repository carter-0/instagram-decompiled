package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.ScrubberPreviewThumbnailView;

/* renamed from: X.3gw  reason: invalid class name and case insensitive filesystem */
public abstract class C247803gw {
    public static final void A00(Context context, C246873fN r5, C256063vA r6, boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        View A01;
        View A012;
        0qQ.A0B(r5, 5);
        C256003v4 r2 = r6.A01;
        if (!z4 && (A012 = r2.A03.A01()) != null) {
            2eQ.A04(A012, 4);
        }
        if (z) {
            if (z4 && (A01 = r2.A03.A01()) != null) {
                2eQ.A04(A01, 4);
            }
            r2.A02 = true;
            r2.A01 = r5;
            Resources resources = context.getResources();
            if (z3) {
                i = R.dimen.caption_overlay_offset_with_social_bubble;
                if (z2) {
                    i = R.dimen.caption_overlay_offset_with_social_bubble_and_uas;
                }
            } else {
                i = R.dimen.action_bar_item_spacing_right;
                if (z2) {
                    i = R.dimen.abc_alert_dialog_button_dimen;
                }
            }
            r2.A00 = resources.getDimensionPixelSize(i);
        } else {
            r2.A01 = null;
            r2.A02 = false;
        }
        C263164Jj.A00(r2);
    }

    public static final void A01(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener, C246483eg r9, C258253yi r10) {
        0qQ.A0B(r9, 1);
        0qQ.A0B(onSeekBarChangeListener, 2);
        if (r9.A04) {
            AnonymousClass0eM r6 = r10.A03;
            ProgressBar progressBar = (ProgressBar) r6.getValue();
            Context context = progressBar.getContext();
            0qQ.A07(context);
            int A04 = (int) 0nA.A04(context, (int) r9.A00);
            progressBar.setMax((int) r9.A01);
            progressBar.setPadding(progressBar.getPaddingLeft(), A04, progressBar.getPaddingRight(), progressBar.getPaddingBottom());
            AnonymousClass3WR r1 = r9.A02;
            if (r1 != null) {
                ((ScrubberPreviewThumbnailView) r10.A05.getValue()).A01(r1);
            }
            View view = (View) r6.getValue();
            if (!view.isLaidOut() || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new ID6(r10));
            } else {
                Context context2 = ((View) r6.getValue()).getContext();
                0qQ.A07(context2);
                int A042 = (int) 0nA.A04(context2, 16);
                03v.A0H((View) r6.getValue(), 0sr.A1P(new Rect[]{new Rect(0, 0, A042, view.getHeight()), new Rect(view.getWidth() - A042, 0, view.getWidth(), view.getHeight())}));
            }
            ((SeekBar) r6.getValue()).setOnSeekBarChangeListener(new IEH(onSeekBarChangeListener, r9, r10));
            ((View) r10.A01.getValue()).setVisibility(0);
            return;
        }
        r10.A00();
    }

    public static final void A02(C226642hc r5, AnonymousClass4DU r6, C246953fX r7, C246753fB r8, AnonymousClass3W1 r9, IgProgressImageView igProgressImageView, String str, 0sP r12, 0sP r13, boolean z) {
        int color;
        0qQ.A0B(r7, 1);
        0qQ.A0B(r9, 2);
        0qQ.A0B(r8, 4);
        0qQ.A0B(r5, 6);
        boolean A0E = Systrace.A0E(1);
        if (A0E) {
            0fS.A01("MediaViewBinder#bindImageMedia", -33197817);
        }
        if (str != null) {
            color = Color.parseColor(str);
        } else {
            Context context = igProgressImageView.getContext();
            color = context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_background));
        }
        igProgressImageView.setPlaceHolderColor(new ColorDrawable(color));
        igProgressImageView.setAlpha(255.0f);
        igProgressImageView.getIgImageView().clearColorFilter();
        igProgressImageView.A0A(new GA4(r9, r12), R.id.listener_id_for_media_view_binder);
        igProgressImageView.setOnFallbackListener(new GA5(r8));
        igProgressImageView.A0D.put(R.id.listener_id_for_media_view_binder, new GA6(r9));
        igProgressImageView.setPostProcessor(r5);
        igProgressImageView.setProgressiveImageConfig(new C247833gz());
        r9.A0U = 0;
        C247843h0.A01(r6, r7, igProgressImageView, z, false);
        r13.invoke(igProgressImageView);
        if (A0E) {
            0fS.A00(89972057);
        }
    }
}
