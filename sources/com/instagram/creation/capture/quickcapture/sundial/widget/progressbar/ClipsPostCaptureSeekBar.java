package com.instagram.creation.capture.quickcapture.sundial.widget.progressbar;

import X.0mi;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass8HH;
import X.C359268cW;
import X.C71492dQ;
import X.SN3;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.nestablescrollingview.NestableRecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ClipsPostCaptureSeekBar extends View {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public UserSession A04;
    public CreationActionBar A05;
    public TargetViewSizeProvider A06;
    public AnonymousClass8HH A07;
    public NestableRecyclerView A08;
    public final int A09;
    public final Paint A0A;
    public final Paint A0B;
    public final C359268cW A0C;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ClipsPostCaptureSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public static /* synthetic */ void getViewMode$annotations() {
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        float width = (float) getWidth();
        int i = this.A09;
        Paint paint = this.A0A;
        paint.setColor(i);
        float f = (float) this.A01;
        float f2 = f / 2.0f;
        canvas.drawRoundRect(0.0f, f2, 0.0f + width, (f * 3.0f) / 2.0f, f2, f2, paint);
        this.A0C.draw(canvas);
        int i2 = this.A03;
        int i3 = this.A02;
        int width2 = getWidth();
        canvas.drawCircle(((float) width2) * 0mi.A00(((float) i2) / ((float) i3), 0.0f, 1.0f), f, 0.0f, this.A0B);
    }

    public final void setCreationActionBar(CreationActionBar creationActionBar) {
        0qQ.A0B(creationActionBar, 0);
        this.A05 = creationActionBar;
    }

    public final void setTargetViewSizeProvider(TargetViewSizeProvider targetViewSizeProvider) {
        0qQ.A0B(targetViewSizeProvider, 0);
        this.A06 = targetViewSizeProvider;
    }

    public final void setUserSession(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        this.A04 = userSession;
    }

    public static final void A00(ClipsPostCaptureSeekBar clipsPostCaptureSeekBar) {
        C359268cW r5 = clipsPostCaptureSeekBar.A0C;
        int i = clipsPostCaptureSeekBar.A01;
        int i2 = i / 2;
        int i3 = clipsPostCaptureSeekBar.A03;
        int i4 = clipsPostCaptureSeekBar.A02;
        r5.setBounds(0, i2, (int) (((float) clipsPostCaptureSeekBar.getWidth()) * 0mi.A00(((float) i3) / ((float) i4), 0.0f, 1.0f)), (i * 3) / 2);
        r5.A00 = i2;
    }

    public final int getAdditionalMargin() {
        return this.A00;
    }

    public final CreationActionBar getCreationActionBar() {
        CreationActionBar creationActionBar = this.A05;
        if (creationActionBar != null) {
            return creationActionBar;
        }
        0qQ.A0F("creationActionBar");
        throw AnonymousClass00P.createAndThrow();
    }

    public final int getMaxDurationInMs() {
        return this.A02;
    }

    public final int getPlaybackPositionInMs() {
        return this.A03;
    }

    public final TargetViewSizeProvider getTargetViewSizeProvider() {
        TargetViewSizeProvider targetViewSizeProvider = this.A06;
        if (targetViewSizeProvider != null) {
            return targetViewSizeProvider;
        }
        0qQ.A0F("targetViewSizeProvider");
        throw AnonymousClass00P.createAndThrow();
    }

    public final NestableRecyclerView getTimedStickersContainer() {
        return this.A08;
    }

    public final UserSession getUserSession() {
        UserSession userSession = this.A04;
        if (userSession != null) {
            return userSession;
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            A00(this);
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.A01 * 2, SN3.MAX_SIGNED_POWER_OF_TWO));
    }

    public final void setPlaybackPositionInMs(int i) {
        this.A03 = Math.min(i, this.A02);
        A00(this);
        invalidate();
    }

    public final void setTimedStickersContainer(NestableRecyclerView nestableRecyclerView) {
        NestableRecyclerView nestableRecyclerView2;
        this.A08 = nestableRecyclerView;
        if (getTargetViewSizeProvider().CTv() && (nestableRecyclerView2 = this.A08) != null) {
            ViewGroup.LayoutParams layoutParams = nestableRecyclerView2.getLayoutParams();
            if (layoutParams != null) {
                C71492dQ r1 = (C71492dQ) layoutParams;
                r1.A0G = R.id.clips_post_capture_seek_bar;
                nestableRecyclerView2.setLayoutParams(r1);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(-1907730703);
        this.A0C.A00(i, i2);
        AnonymousClass0fD.A0D(949966870, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0fD.A05(1276885831);
        0qQ.A0B(motionEvent, 0);
        AnonymousClass0fD.A0C(-538180318, A052);
        return false;
    }

    public final void setAdditionalMargin(int i) {
        this.A00 = i;
    }

    public final void setListener(AnonymousClass8HH r1) {
        this.A07 = r1;
    }

    public final void setMaxDurationInMs(int i) {
        this.A02 = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsPostCaptureSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        Resources resources = getResources();
        resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
        this.A0C = new C359268cW(context, context.getColor(R.color.canvas_bottom_sheet_description_text_color), context.getColor(R.color.canvas_bottom_sheet_description_text_color));
        this.A09 = context.getColor(R.color.clips_progress_bar_background_color);
        int color = context.getColor(R.color.canvas_bottom_sheet_description_text_color);
        this.A0A = new Paint(1);
        Paint paint = new Paint(1);
        paint.setColor(color);
        this.A0B = paint;
        this.A01 = dimensionPixelSize;
        this.A02 = 15000;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ClipsPostCaptureSeekBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ClipsPostCaptureSeekBar(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
