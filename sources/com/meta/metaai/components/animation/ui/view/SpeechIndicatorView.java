package com.meta.metaai.components.animation.ui.view;

import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C355538Qj;
import X.C51965G9l;
import X.C55219HeA;
import X.C56567I1w;
import X.C58201Io5;
import X.DbU;
import X.G9w;
import X.HME;
import X.HMJ;
import X.I9s;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import java.util.LinkedList;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SpeechIndicatorView extends View {
    public static final float[] A0Y = {0.0f, 0.7f, 0.7f, 0.85f, 1.0f};
    public static final float[] A0Z = {0.03f, 0.31f, 0.36f, 0.41f, 0.57f, 0.64f, 0.66f, 0.7f, 0.84f, 0.95f};
    public static final float[] A0a = {0.0f, 0.7f, 0.85f, 1.0f};
    public static final int[] A0b = {0, 0, Color.argb(100, 255, 255, 255), 0, Color.argb(100, 255, 255, 255)};
    public static final int[] A0c = {Color.rgb(1, 126, 221), Color.rgb(95, C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION, 193), Color.rgb(95, C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION, 193), Color.rgb(8, 167, 242), Color.rgb(0, 95, 227), Color.rgb(236, 125, 217), Color.rgb(252, 145, 217), Color.rgb(228, 120, 216), Color.rgb(68, 109, 223), Color.rgb(1, 85, 221)};
    public static final int[] A0d = {0, 0, Color.argb(65, 0, 97, 229), 0};
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public LinearGradient A0A;
    public RadialGradient A0B;
    public RadialGradient A0C;
    public C56567I1w A0D;
    public boolean A0E;
    public float A0F;
    public float A0G;
    public float A0H;
    public float A0I;
    public float A0J;
    public long A0K;
    public HME A0L;
    public C56567I1w A0M;
    public final float A0N;
    public final int A0O;
    public final Matrix A0P;
    public final Matrix A0Q;
    public final Paint A0R;
    public final Path A0S;
    public final I9s A0T;
    public final LinkedList A0U;
    public final float[] A0V;
    public final Path A0W;
    public final float[] A0X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpeechIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        Paint paint = new Paint();
        AnonymousClass7TE.A1Q(paint);
        paint.setAntiAlias(true);
        this.A0R = paint;
        this.A0L = HME.None;
        this.A0D = new C56567I1w(0.5f, 1.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
        this.A0M = new C56567I1w(0.5f, 1.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
        this.A0H = 1.0f;
        this.A0N = 0.1f;
        this.A05 = 1.0f;
        this.A0Q = new Matrix();
        this.A0P = new Matrix();
        this.A0S = C51965G9l.A0C();
        this.A0W = C51965G9l.A0C();
        this.A0I = 1.0f;
        this.A0U = new LinkedList();
        this.A0O = 10;
        this.A0V = new float[]{1.0f, 1.0f, 1.0f};
        this.A0X = new float[]{1.0f, 1.0f, 1.0f};
        this.A0F = 1.0f;
        this.A0J = 1.0f;
        this.A0T = new I9s(this);
        getWidth();
        getHeight();
        A00();
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        G9w.A10(canvas, new C58201Io5(canvas, this, AnonymousClass7TE.A02(this) / 2.0f, AnonymousClass7TE.A03(this) / 2.0f, (this.A0D.A04 * 0.05f) + 1.0f));
        this.A0Q.reset();
        this.A0P.reset();
    }

    public final void onVisibilityChanged(View view, int i) {
        0qQ.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        if (i == 4 || i == 8) {
            if (this.A0E) {
                Choreographer.getInstance().removeFrameCallback(this.A0T);
                this.A0E = false;
            }
        } else if (!this.A0E) {
            Choreographer.getInstance().postFrameCallback(this.A0T);
            this.A0E = true;
        }
    }

    public final void setSpeechIndicatorState(HMJ hmj) {
        HME hme;
        switch (DbU.A02(hmj, 0)) {
            case 0:
                hme = HME.Connecting;
                break;
            case 1:
            case 2:
                hme = HME.Listening;
                break;
            case 3:
                hme = HME.Thinking;
                break;
            case 4:
                hme = HME.Responding;
                break;
            case 5:
            case 6:
                hme = HME.Disconnected;
                break;
            default:
                throw AnonymousClass7TE.A1K();
        }
        setState(hme);
    }

    private final void A00() {
        int[] iArr = A0c;
        float[] fArr = A0Z;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A0A = new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, iArr, fArr, tileMode);
        Shader.TileMode tileMode2 = tileMode;
        this.A0B = new RadialGradient(0.0f, 0.0f, 50.0f, A0b, A0Y, tileMode2);
        this.A0C = new RadialGradient(0.0f, 0.0f, 50.0f, A0d, A0a, tileMode2);
    }

    public static final void A01(SpeechIndicatorView speechIndicatorView, long j) {
        float A002;
        float f;
        SpeechIndicatorView speechIndicatorView2 = speechIndicatorView;
        long j2 = speechIndicatorView2.A0K;
        long j3 = j;
        if (j2 == 0) {
            speechIndicatorView2.A0K = j3;
            j2 = j3;
        }
        long j4 = j - j2;
        speechIndicatorView2.A0K = j3;
        C56567I1w i1w = speechIndicatorView2.A0D;
        C56567I1w i1w2 = speechIndicatorView2.A0M;
        i1w.A05 = C55219HeA.A00(i1w2.A05, i1w.A05, 0.01f, j4);
        i1w.A00 = C55219HeA.A00(i1w2.A00, i1w.A00, 0.01f, j4);
        i1w.A02 = C55219HeA.A00(i1w2.A02, i1w.A02, 0.1f, j4);
        i1w.A03 = C55219HeA.A00(i1w2.A03, i1w.A03, 0.01f, j4);
        i1w.A08 = C55219HeA.A00(i1w2.A08, i1w.A08, 0.1f, j4);
        i1w.A01 = C55219HeA.A00(i1w2.A01, i1w.A01, 0.1f, j4);
        i1w.A04 = C55219HeA.A00(i1w2.A04, i1w.A04, 0.04f, j4);
        float A003 = C55219HeA.A00(i1w2.A06, i1w.A06, 0.01f, j4);
        i1w.A06 = A003;
        float A004 = C55219HeA.A00(i1w2.A07, i1w.A07, 0.1f, j4);
        i1w.A07 = A004;
        float f2 = speechIndicatorView2.A07;
        if (f2 >= 12.0f) {
            speechIndicatorView2.A0J = -1.0f;
        } else if (f2 <= 0.01f) {
            speechIndicatorView2.A0J = 1.0f;
        }
        float f3 = (float) j4;
        speechIndicatorView2.A07 = Math.min(Math.max((((f2 + (speechIndicatorView2.A0J * A003)) * A004) * f3) / 1.6666667E7f, 0.01f), 12.0f);
        speechIndicatorView2.A0H = C55219HeA.A00(Math.min((speechIndicatorView2.A02 * 0.18f) + 0.82f + speechIndicatorView2.A06, 1.0f), speechIndicatorView2.A0H, 0.002f, j4);
        speechIndicatorView2.A00 = (speechIndicatorView2.A0H * ((AnonymousClass7TE.A02(speechIndicatorView2) / 2.0f) * 0.82f)) / 50.0f;
        speechIndicatorView2.A08 += ((i1w.A08 + speechIndicatorView2.A07) * f3) / 1.6666667E7f;
        speechIndicatorView2.A01 += (i1w.A01 * f3) / 1.6666667E7f;
        float f4 = speechIndicatorView2.A04;
        if (f4 >= 75.0f) {
            speechIndicatorView2.A0I = -1.0f;
        } else if (f4 <= -75.0f) {
            speechIndicatorView2.A0I = 1.0f;
        }
        float f5 = i1w.A02;
        if (speechIndicatorView2.A0L == HME.Thinking || f5 == 0.0f) {
            A002 = C55219HeA.A00(0.0f, f4, Math.max(f5, 1.0f), j4);
        } else {
            A002 = Math.max(Math.min(f4 + (((speechIndicatorView2.A0I * f5) * f3) / 1.6666667E7f), 75.0f), -75.0f);
        }
        speechIndicatorView2.A04 = A002;
        Path path = speechIndicatorView2.A0S;
        path.reset();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(0.0f, 0.0f, 35.0f, direction);
        Path path2 = speechIndicatorView2.A0W;
        path2.reset();
        path2.addCircle(0.0f, 0.0f, 50.0f, direction);
        float f6 = i1w.A04;
        float min = Math.min((((speechIndicatorView2.A02 * 0.25f * 0.4f) + (speechIndicatorView2.A09 * 0.25f * 16.0f)) * f6) + 1.0f, 1.25f);
        float f7 = (f6 * 0.14999998f) + 1.0f;
        float f8 = speechIndicatorView2.A0G;
        if (f8 >= 2.0f) {
            speechIndicatorView2.A0F = -1.0f;
        } else if (f8 <= 0.0f) {
            speechIndicatorView2.A0F = 1.0f;
        }
        float f9 = f8 + (speechIndicatorView2.A0F * 0.01f);
        speechIndicatorView2.A0G = f9;
        int rint = (int) ((float) Math.rint((double) f9));
        float[] fArr = speechIndicatorView2.A0X;
        if (rint != 0) {
            fArr[0] = f7;
            if (rint != 1) {
                fArr[1] = f7;
                fArr[2] = min;
            } else {
                fArr[1] = min;
                fArr[2] = f7;
            }
        } else {
            fArr[0] = min;
            fArr[1] = f7;
            fArr[2] = f7;
        }
        float[] fArr2 = speechIndicatorView2.A0V;
        fArr2[0] = C55219HeA.A00(fArr[0], fArr2[0], 0.01f, j4);
        fArr2[1] = C55219HeA.A00(fArr[1], fArr2[1], 0.01f, j4);
        fArr2[2] = C55219HeA.A00(fArr[2], fArr2[2], 0.01f, j4);
        float f10 = speechIndicatorView2.A06;
        if (f10 > speechIndicatorView2.A0N) {
            f = -1.0f;
        } else {
            if (f10 <= 0.001f) {
                f = 1.0f;
            }
            speechIndicatorView2.A06 = f10 + (speechIndicatorView2.A05 * i1w.A03);
        }
        speechIndicatorView2.A05 = f;
        speechIndicatorView2.A06 = f10 + (speechIndicatorView2.A05 * i1w.A03);
    }

    private final void setState(HME hme) {
        C56567I1w i1w;
        if (this.A0L != hme) {
            this.A0L = hme;
            switch (hme.ordinal()) {
                case 0:
                    i1w = new C56567I1w(0.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
                    break;
                case 1:
                case 5:
                    i1w = new C56567I1w(0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
                    break;
                case 2:
                    i1w = new C56567I1w(1.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0013f, 0.0f, 1.0f);
                    break;
                case 3:
                    i1w = new C56567I1w(1.0f, 0.3f, 2.0f, 0.0f, 0.0f, 3.0f, 0.001f, 1.0f, 1.0f);
                    break;
                case 4:
                    i1w = new C56567I1w(1.0f, 0.0f, 4.0f, 0.3f, 1.0f, 0.0f, 0.001f, 0.0f, 1.0f);
                    break;
                default:
                    throw AnonymousClass7TE.A1K();
            }
            this.A0M = i1w;
        }
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(1297412515);
        super.onDetachedFromWindow();
        if (this.A0E) {
            Choreographer.getInstance().removeFrameCallback(this.A0T);
            this.A0E = false;
        }
        AnonymousClass0fD.A0D(-1665155838, A062);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(1428374511);
        super.onSizeChanged(i, i2, i3, i4);
        A01(this, this.A0K);
        A00();
        invalidate();
        AnonymousClass0fD.A0D(-1743219331, A062);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SpeechIndicatorView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SpeechIndicatorView(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
