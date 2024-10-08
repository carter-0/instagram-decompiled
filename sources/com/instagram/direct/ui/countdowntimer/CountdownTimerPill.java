package com.instagram.direct.ui.countdowntimer;

import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass7TF;
import X.C16495Uvr;
import X.C51966G9m;
import X.C62320sa;
import X.C66581MXm;
import X.C67642MrV;
import X.C73371PbU;
import X.DbU;
import X.DbY;
import X.JTT;
import android.content.Context;
import android.graphics.Paint;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.direct.ui.countertextview.CounterTextView;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CountdownTimerPill extends IgFrameLayout {
    public static final long A04 = TimeUnit.SECONDS.toMillis(1);
    public static final long A05 = TimeUnit.MINUTES.toMillis(15);
    public static final long A06 = TimeUnit.DAYS.toMillis(1);
    public CountDownTimer A00;
    public Runnable A01;
    public final C67642MrV A02;
    public final CounterTextView A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CountdownTimerPill(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public static /* synthetic */ void setRemainingTimeInMillis$default(CountdownTimerPill countdownTimerPill, long j, boolean z, boolean z2, C62320sa r11, int i, Object obj) {
        C62320sa r1 = r11;
        boolean A1Q = C51966G9m.A1Q(i & 2, z);
        boolean A1Q2 = C51966G9m.A1Q(i & 4, z2);
        if ((i & 8) != 0) {
            r1 = null;
        }
        countdownTimerPill.A02(r1, j, A1Q, A1Q2);
    }

    public final void A02(C62320sa r11, long j, boolean z, boolean z2) {
        CountDownTimer countDownTimer = this.A00;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CounterTextView counterTextView = this.A03;
        counterTextView.setVisibility(0);
        Runnable runnable = this.A01;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        C67642MrV mrV = this.A02;
        int A032 = AnonymousClass7TF.A03(mrV.A07, R.attr.igds_color_controls);
        Paint paint = mrV.A09;
        paint.setColor(A032);
        mrV.invalidateSelf();
        mrV.A06.cancel();
        mrV.A05.cancel();
        mrV.A02 = 0.0f;
        mrV.A00 = 0.0f;
        paint.setAlpha(255);
        mrV.invalidateSelf();
        long j2 = 0;
        if (0 < j) {
            j2 = j;
        }
        counterTextView.A06((int) j2, A00(this, j2), false);
        if (!z) {
            long j3 = A06;
            if (j2 <= j3 || j2 % j3 < A05) {
                C73371PbU pbU = new C73371PbU(this, r11, j2, z2);
                this.A01 = pbU;
                postDelayed(pbU, A04);
            }
        }
    }

    public static final String A00(CountdownTimerPill countdownTimerPill, long j) {
        if (j <= A06) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            String format = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(j)), Long.valueOf(timeUnit.toMinutes(j) % TimeUnit.HOURS.toMinutes(1)), Long.valueOf(timeUnit.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1))}, 3));
            0qQ.A07(format);
            return format;
        }
        String A0d = DbY.A0d(DbU.A05(countdownTimerPill), ((int) TimeUnit.MILLISECONDS.toDays(j)) + 1, R.plurals.countdown_timer_days_remaining);
        0qQ.A0A(A0d);
        return A0d;
    }

    public final void A01() {
        CountDownTimer countDownTimer = this.A00;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        Runnable runnable = this.A01;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        CounterTextView counterTextView = this.A03;
        counterTextView.setVisibility(0);
        Context context = getContext();
        counterTextView.A06(0, context.getString(2131961713), false);
        setPillColor(C66581MXm.A02(context));
    }

    public final void setPillColor(int i) {
        C67642MrV mrV = this.A02;
        mrV.A09.setColor(i);
        mrV.invalidateSelf();
    }

    public final void setPillTextColor(int i) {
        this.A03.setTextColor(i);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(1265280724);
        super.onDetachedFromWindow();
        CountDownTimer countDownTimer = this.A00;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        Runnable runnable = this.A01;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        AnonymousClass0fD.A0D(-274481403, A062);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CountdownTimerPill(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        C67642MrV mrV = new C67642MrV(context);
        this.A02 = mrV;
        View.inflate(context, R.layout.countdown_timer_layout, this);
        CounterTextView counterTextView = (CounterTextView) findViewById(R.id.timer_textview);
        this.A03 = counterTextView;
        counterTextView.setAnimationStyle(C16495Uvr.STRAIGHT_TO_TARGET);
        setBackground(mrV);
    }

    public /* synthetic */ CountdownTimerPill(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CountdownTimerPill(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
