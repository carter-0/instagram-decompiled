package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.SeekBar;
import com.instagram.android.R;

/* renamed from: X.GeD  reason: case insensitive filesystem */
public final class C52878GeD extends SeekBar implements SeekBar.OnSeekBarChangeListener {
    public int A00;
    public int A01;
    public boolean A02 = true;
    public ValueAnimator A03;
    public SeekBar.OnSeekBarChangeListener A04;
    public final int A05;
    public final int A06;
    public final Paint A07 = new Paint();
    public final RectF A08 = AnonymousClass7TE.A0Y();

    public C52878GeD(Context context) {
        super(context, (AttributeSet) null, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C71382cm.A0P, 0, 0);
        0qQ.A07(obtainStyledAttributes);
        this.A00 = obtainStyledAttributes.getColor(1, context.getColor(R.color.body_parametric_default_progress_color));
        this.A01 = obtainStyledAttributes.getColor(1, context.getColor(R.color.black_10_transparent));
        this.A06 = obtainStyledAttributes.getDimensionPixelSize(3, 30);
        this.A05 = obtainStyledAttributes.getDimensionPixelSize(0, 30);
        obtainStyledAttributes.recycle();
    }

    public final synchronized void onDraw(Canvas canvas) {
        Object valueOf;
        Object valueOf2;
        0qQ.A0B(canvas, 0);
        Drawable thumb = getThumb();
        0qQ.A07(getThumb().getBounds());
        float trackRange = (float) getTrackRange();
        float trackRange2 = ((float) getTrackRange()) / 2.0f;
        float f = ((float) this.A06) / 2.0f;
        int height = getHeight() / 2;
        float trackWidth = (float) getTrackWidth();
        float f2 = trackWidth / 2.0f;
        RectF rectF = this.A08;
        float f3 = (float) height;
        float f4 = f3 - f;
        float f5 = f3 + f;
        rectF.set((float) getPaddingLeft(), f4, trackWidth, f5);
        Paint paint = this.A07;
        paint.setColor(this.A01);
        float f6 = (float) this.A05;
        canvas.drawRoundRect(rectF, f6, f6, paint);
        if (((float) getProgress()) < trackRange2) {
            float progress = f2 - ((trackWidth / trackRange) * (trackRange2 - ((float) getProgress())));
            if (((float) thumb.getBounds().left) > progress) {
                valueOf2 = Integer.valueOf(thumb.getBounds().left);
            } else {
                valueOf2 = Float.valueOf(progress);
            }
            rectF.set(AnonymousClass7TE.A04(valueOf2), f4, f2, f5);
            paint.setColor(this.A00);
            canvas.drawRoundRect(rectF, f6, f6, paint);
        }
        if (((float) getProgress()) > trackRange2) {
            float progress2 = ((trackWidth / trackRange) * (((float) getProgress()) - trackRange2)) + f2;
            if (thumb.getBounds().right < getLeft()) {
                valueOf = Integer.valueOf(thumb.getBounds().right);
            } else {
                valueOf = Float.valueOf(progress2);
            }
            rectF.set(f2, f4, AnonymousClass7TE.A04(valueOf), f5);
            paint.setColor(this.A00);
            canvas.drawRoundRect(rectF, f6, f6, paint);
        }
        thumb.draw(canvas);
    }

    public final synchronized void onMeasure(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getMode(i) != 0) {
            i3 = View.MeasureSpec.getSize(i);
        } else {
            i3 = 0;
        }
        int intrinsicHeight = getThumb().getIntrinsicHeight();
        if (View.MeasureSpec.getMode(i2) != 0) {
            intrinsicHeight = (int) Math.min((double) intrinsicHeight, (double) View.MeasureSpec.getSize(i2));
        }
        setMeasuredDimension(i3, intrinsicHeight);
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener;
        0qQ.A0B(seekBar, 0);
        if ((z || this.A02) && (onSeekBarChangeListener = this.A04) != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        0qQ.A0B(seekBar, 0);
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.A04;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        0qQ.A0B(seekBar, 0);
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.A04;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }

    public void setInitialProgress(int i) {
        A01(this, i, 0);
    }

    public void setInitialProgress$SmoothSeekBar(int i) {
        A01(this, i, 0);
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.A04 = onSeekBarChangeListener;
        super.setOnSeekBarChangeListener(this);
    }

    public static final void A01(C52878GeD geD, int i, long j) {
        int progress = geD.getProgress();
        ValueAnimator valueAnimator = geD.A03;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
        }
        geD.A03 = null;
        geD.A02 = true;
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{progress, i});
        ofInt.setDuration(j);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new C56686I7r(geD, i, 0));
        ofInt.start();
        geD.A03 = ofInt;
    }

    private final int getTrackRange() {
        return getMax() - getMin();
    }

    private final int getTrackWidth() {
        return (getWidth() - getPaddingRight()) - getPaddingLeft();
    }

    public void setProgress(int i) {
        A01(this, i, (long) getResources().getInteger(17694721));
    }

    public final void setFilledTrackColor(int i) {
        this.A00 = i;
    }

    public final void setUnFilledTrackColor(int i) {
        this.A01 = i;
    }
}
