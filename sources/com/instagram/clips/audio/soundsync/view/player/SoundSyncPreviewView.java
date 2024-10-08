package com.instagram.clips.audio.soundsync.view.player;

import X.0qQ;
import X.2cs;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C52789Gcg;
import X.C52798Gcp;
import X.C52800Gcr;
import X.C55452Hhw;
import X.C56945IIp;
import X.C58188Ins;
import X.C58710IwJ;
import X.C71392co;
import X.DbT;
import X.I2S;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SoundSyncPreviewView extends FrameLayout {
    public Bitmap A00;
    public Path A01;
    public PointF A02;
    public final float A03;
    public final RectF A04;
    public final TextureView A05;
    public final IgImageView A06;
    public final int A07;
    public final C56945IIp A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SoundSyncPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void dispatchDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.save();
        Path path = this.A01;
        if (path != null) {
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void setCornerRadius(PointF pointF) {
        0qQ.A0B(pointF, 0);
        this.A02 = pointF;
        this.A01 = I2S.A00(this.A04, AnonymousClass05K.A01, pointF.x, pointF.y);
        invalidate();
    }

    public final void setLoadingText(String str) {
        0qQ.A0B(str, 0);
        C52800Gcr foreGroundDrawable = getForeGroundDrawable();
        if (!0qQ.A0K(foreGroundDrawable.A02, str)) {
            foreGroundDrawable.A02 = str;
            foreGroundDrawable.A01 = C52800Gcr.A00(foreGroundDrawable, str);
        }
    }

    /* access modifiers changed from: private */
    public final C52800Gcr getForeGroundDrawable() {
        return (C52800Gcr) this.A09.getValue();
    }

    private final LayerDrawable getLayerDrawable() {
        return (LayerDrawable) this.A0A.getValue();
    }

    /* access modifiers changed from: private */
    public final C52789Gcg getLoadingDrawable() {
        return (C52789Gcg) this.A0B.getValue();
    }

    /* access modifiers changed from: private */
    public final C52798Gcp getStrokeProgress() {
        return (C52798Gcp) this.A0C.getValue();
    }

    public final PointF getCornerRadius() {
        return this.A02;
    }

    public final IgImageView getLoadingImageView() {
        return this.A06;
    }

    public final Bitmap getPreviewImage() {
        return this.A00;
    }

    public final TextureView getVideoTextureView() {
        return this.A05;
    }

    public final void setLoadingState(boolean z) {
        C56945IIp iIp;
        Integer num;
        Double valueOf;
        Double valueOf2;
        if (z) {
            this.A06.setImageDrawable(getLayerDrawable());
            AnonymousClass0eM r1 = getForeGroundDrawable().A0B;
            if (!((Animator) r1.getValue()).isStarted()) {
                ((Animator) r1.getValue()).start();
            }
            iIp = this.A08;
            num = AnonymousClass05K.A01;
        } else {
            iIp = this.A08;
            num = AnonymousClass05K.A00;
        }
        if (num != iIp.A00) {
            iIp.A00 = num;
            C71392co r3 = iIp.A02;
            double d = 5.0d;
            int intValue = num.intValue();
            if (intValue != 0) {
                valueOf = Double.valueOf(80.0d);
            } else {
                valueOf = Double.valueOf(110.0d);
                d = 3.0d;
            }
            Double valueOf3 = Double.valueOf(d);
            r3.A01 = valueOf.doubleValue();
            r3.A00 = valueOf3.doubleValue();
            C71392co r7 = iIp.A01;
            double d2 = 5.0d;
            if (intValue != 0) {
                valueOf2 = Double.valueOf(90.0d);
                d2 = 8.0d;
            } else {
                valueOf2 = Double.valueOf(100.0d);
            }
            Double valueOf4 = Double.valueOf(d2);
            r7.A01 = valueOf2.doubleValue();
            r7.A00 = valueOf4.doubleValue();
            2cs r0 = (2cs) iIp.A03.getValue();
            0qQ.A07(r0);
            r0.A09(r3);
            r0.A03();
        }
    }

    public final void setPreviewImage(Bitmap bitmap) {
        this.A00 = bitmap;
        C52789Gcg loadingDrawable = getLoadingDrawable();
        loadingDrawable.A00 = bitmap;
        loadingDrawable.invalidateSelf();
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(1192110711);
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.A04;
        rectF.set(0.0f, 0.0f, (float) i, (float) i2);
        float f = (float) this.A07;
        rectF.inset(f, f);
        PointF pointF = this.A02;
        this.A01 = I2S.A00(rectF, AnonymousClass05K.A01, pointF.x, pointF.y);
        AnonymousClass0fD.A0D(452300098, A062);
    }

    public final void setProgress(double d) {
        getStrokeProgress().A02(d);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SoundSyncPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A04 = AnonymousClass7TE.A0Y();
        float dimension = context.getResources().getDimension(R.dimen.abc_dialog_padding_top_material);
        this.A03 = dimension;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.abc_control_corner_material);
        this.A07 = dimensionPixelOffset;
        this.A02 = new PointF(dimension, dimension);
        this.A0B = C58710IwJ.A01(this, 5);
        this.A09 = C58710IwJ.A01(context, 3);
        this.A0C = AnonymousClass0eN.A01(new C58188Ins(2, context, this));
        this.A0A = C58710IwJ.A01(this, 4);
        setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        setForeground(getStrokeProgress());
        setWillNotDraw(false);
        View.inflate(getContext(), R.layout.layout_sound_sync_player, this);
        this.A05 = (TextureView) requireViewById(R.id.texture);
        IgImageView A0b = DbT.A0b(this, R.id.loading_image);
        this.A06 = A0b;
        this.A08 = new C56945IIp(A0b, new C55452Hhw(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SoundSyncPreviewView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SoundSyncPreviewView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
