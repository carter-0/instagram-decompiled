package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.ui.widget.segmentedprogressbar.ProgressAnchorContainer;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import com.instagram.ui.widget.textureview.ScalingTextureView;

/* renamed from: X.6Ji  reason: invalid class name and case insensitive filesystem */
public final class C305736Ji extends C316016ky implements C316086l5, C316106l7 {
    public C255773uh A00;
    public C250973mM A01;
    public C309426Yf A02;
    public C62151Kb6 A03;
    public final ViewGroup A04;
    public final C309646Zb A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F = AnonymousClass1YB.A00(new C73901Plc(this, 49));
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I;
    public final AnonymousClass0eM A0J;
    public final AnonymousClass0eM A0K;
    public final AnonymousClass0eM A0L;
    public final AnonymousClass0eM A0M;
    public final AnonymousClass0eM A0N;
    public final AnonymousClass0eM A0O;
    public final AnonymousClass0eM A0P;
    public final AnonymousClass0eM A0Q;
    public final AnonymousClass0eM A0R;
    public final FrameLayout A0S;
    public final IgProgressImageView A0T;
    public final ScalingTextureView A0U;
    public final AnonymousClass0eM A0V;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C305736Ji(View view, UserSession userSession, C309646Zb r8) {
        super(view);
        ScalingTextureView scalingTextureView;
        0qQ.A0B(view, 1);
        this.A05 = r8;
        this.A0G = AnonymousClass1YB.A00(new C73927Pm7(view, 1));
        this.A0B = AnonymousClass1YB.A00(new C73901Plc(view, 45));
        this.A0D = AnonymousClass1YB.A00(new C73901Plc(view, 47));
        this.A07 = AnonymousClass1YB.A00(new C73901Plc(view, 41));
        this.A0V = AnonymousClass1YB.A00(new C73927Pm7(view, 0));
        this.A0N = AnonymousClass1YB.A00(new MJ8(42, userSession, view));
        this.A0O = AnonymousClass1YB.A00(new C73927Pm7(view, 8));
        this.A0K = AnonymousClass1YB.A00(new C73927Pm7(view, 5));
        this.A0L = AnonymousClass1YB.A00(new C73927Pm7(view, 6));
        this.A0C = AnonymousClass1YB.A00(new C73901Plc(view, 46));
        this.A0M = AnonymousClass1YB.A00(new C73927Pm7(view, 7));
        this.A0P = AnonymousClass1YB.A00(new C73927Pm7(view, 9));
        this.A06 = AnonymousClass1YB.A00(new C73901Plc(view, 40));
        this.A0Q = AnonymousClass1YB.A00(new C73927Pm7(view, 10));
        this.A0I = AnonymousClass1YB.A00(new C73927Pm7(view, 3));
        this.A0H = AnonymousClass1YB.A00(new C73927Pm7(view, 2));
        this.A0E = AnonymousClass1YB.A00(new C73901Plc(view, 48));
        this.A0R = AnonymousClass1YB.A00(new C73927Pm7(view, 11));
        this.A0J = AnonymousClass1YB.A00(new C73927Pm7(view, 4));
        this.A09 = AnonymousClass1YB.A00(new C73901Plc(view, 43));
        this.A0A = AnonymousClass1YB.A00(new C73901Plc(view, 44));
        this.A08 = AnonymousClass1YB.A00(new C73901Plc(view, 42));
        Object value = this.A0D.getValue();
        0qQ.A07(value);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        ((ImageView) value).setScaleType(scaleType);
        A00().getIgImageView().setScaleType(scaleType);
        IgProgressImageView A002 = A00();
        Context context = view.getContext();
        A002.setPlaceHolderColor(context.getColor(2Yu.A0H(context, R.attr.igds_color_stories_loading_background)));
        IgProgressImageView A003 = A00();
        Drawable drawable = context.getDrawable(R.drawable.video_determinate_progress);
        0qQ.A0A(drawable);
        A003.setProgressBarDrawable(drawable);
        AnonymousClass0eM r1 = this.A0G;
        Object value2 = r1.getValue();
        0qQ.A07(value2);
        Context context2 = ((View) value2).getContext();
        0qQ.A07(context2);
        C14980UHy uHy = new C14980UHy(context2, r8);
        Object value3 = r1.getValue();
        0qQ.A07(value3);
        GestureDetector gestureDetector = new GestureDetector(((View) value3).getContext(), uHy);
        gestureDetector.setIsLongpressEnabled(false);
        Object value4 = r1.getValue();
        0qQ.A07(value4);
        ((View) value4).setOnTouchListener(new C18901WBu(gestureDetector, uHy, r8));
        this.A0T = A00();
        C71662eb r12 = (C71662eb) this.A0N.getValue();
        RoundedCornerFrameLayout roundedCornerFrameLayout = null;
        if (r12 != null) {
            scalingTextureView = (ScalingTextureView) r12.A01();
        } else {
            scalingTextureView = null;
        }
        this.A0U = scalingTextureView;
        Object value5 = this.A0G.getValue();
        0qQ.A07(value5);
        View view2 = (View) value5;
        0qQ.A0C(view2, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.A04 = (ViewGroup) view2;
        this.A0S = C263454Mb.A00(userSession, "reel_live_archive_viewer") ? BQU() : roundedCornerFrameLayout;
    }

    public final void DcL(C309426Yf r3, int i) {
        0qQ.A0B(r3, 0);
        if (i == 1) {
            ((SegmentedProgressBar) this.A0F.getValue()).setProgress(r3.A0B);
        }
    }

    public final IgProgressImageView A00() {
        Object value = this.A0V.getValue();
        0qQ.A07(value);
        return (IgProgressImageView) value;
    }

    public final void A01() {
        Object value = this.A0D.getValue();
        0qQ.A07(value);
        ((IgImageView) value).A09();
        Object value2 = this.A0O.getValue();
        0qQ.A07(value2);
        ((TextView) value2).setText("");
        Object value3 = this.A0K.getValue();
        0qQ.A07(value3);
        ((TextView) value3).setText("");
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        A00().getIgImageView().A09();
        ((SegmentedProgressBar) this.A0F.getValue()).setProgress(0.0f);
        Object value4 = this.A0C.getValue();
        0qQ.A07(value4);
        ((TextView) value4).setText("");
        Object value5 = this.A07.getValue();
        0qQ.A07(value5);
        ((IgImageView) value5).A09();
        C62151Kb6 kb6 = this.A03;
        if (kb6 != null) {
            kb6.setVisibility(8);
        }
    }

    public final void A02(long j, long j2) {
        C62151Kb6 kb6 = this.A03;
        if (kb6 == null) {
            Object value = this.A0G.getValue();
            0qQ.A07(value);
            Context context = ((View) value).getContext();
            0qQ.A07(context);
            kb6 = new C62151Kb6(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = kb6.getContext().getResources().getDimensionPixelSize(R.dimen.annotation_cluster_name_plate_padding_top);
            kb6.setLayoutParams(layoutParams);
            kb6.setVisibility(8);
            Object value2 = this.A0E.getValue();
            0qQ.A07(value2);
            ((ProgressAnchorContainer) value2).setAnchorView(kb6);
            this.A03 = kb6;
        }
        kb6.setProgress(1G0.A02(j));
        ((SegmentedProgressBar) this.A0F.getValue()).setProgress(((float) j) / ((float) j2));
    }

    public final IgProgressImageView BGP() {
        return this.A0T;
    }

    public final C255773uh Bkg() {
        return this.A00;
    }

    public final FrameLayout Bkk() {
        return this.A0S;
    }

    public final ScalingTextureView C5p() {
        return this.A0U;
    }

    public final void ERT(float f) {
        Object value = this.A0P.getValue();
        0qQ.A07(value);
        ((View) value).setAlpha(f);
        Object value2 = this.A06.getValue();
        0qQ.A07(value2);
        ((View) value2).setAlpha(f);
    }
}
