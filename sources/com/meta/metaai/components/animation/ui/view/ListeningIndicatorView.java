package com.meta.metaai.components.animation.ui.view;

import X.0h9;
import X.0qQ;
import X.AnonymousClass07V;
import X.AnonymousClass07Z;
import X.AnonymousClass0Ud;
import X.AnonymousClass0fD;
import X.AnonymousClass0r6;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C262204Co;
import X.C51966G9m;
import X.C51976G9y;
import X.C58216IoK;
import X.C58687Ivw;
import X.DbW;
import X.G9w;
import X.I9r;
import X.MHK;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import java.util.Random;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ListeningIndicatorView extends View implements AnonymousClass07Z {
    public static final RadialGradient A0M;
    public static final RadialGradient A0N;
    public static final RadialGradient A0O;
    public static final RadialGradient A0P;
    public static final RadialGradient A0Q;
    public static final RadialGradient A0R;
    public static final RadialGradient A0S;
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public long A07;
    public C262204Co A08;
    public boolean A09;
    public final Paint A0A;
    public final RectF A0B;
    public final RectF A0C;
    public final RectF A0D;
    public final RectF A0E;
    public final RectF A0F;
    public final RectF A0G;
    public final RectF A0H;
    public final I9r A0I;
    public final Random A0J;
    public final AnonymousClass07V A0K;
    public final 0h9 A0L;

    static {
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        A0R = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-16738616, 38600}, new float[]{0.0f, 1.0f}, tileMode);
        A0Q = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-5902106, 10875110}, new float[]{0.0f, 1.0f}, tileMode);
        A0S = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-14298266, 2478950}, new float[]{0.0f, 1.0f}, tileMode);
        A0M = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-9546271, 7230945}, new float[]{0.0f, 1.0f}, tileMode);
        A0P = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-7900161, 8877055}, new float[]{0.0f, 1.0f}, tileMode);
        A0O = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-353321, 16423895}, new float[]{0.0f, 1.0f}, tileMode);
        A0N = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-7691, 1090511349, 16769525}, new float[]{0.0f, 0.4f, 1.0f}, tileMode);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListeningIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        this.A0J = new Random();
        this.A02 = 1.0f;
        this.A00 = 1.0f;
        this.A03 = 1.0f;
        this.A0A = new Paint();
        this.A01 = 1.0f;
        this.A04 = 1.0f;
        this.A0G = AnonymousClass7TE.A0Y();
        this.A0F = AnonymousClass7TE.A0Y();
        this.A0H = AnonymousClass7TE.A0Y();
        this.A0B = AnonymousClass7TE.A0Y();
        this.A0E = AnonymousClass7TE.A0Y();
        this.A0D = AnonymousClass7TE.A0Y();
        this.A0C = AnonymousClass7TE.A0Y();
        this.A0I = new I9r(this);
        0h9 r0 = new 0h9(this);
        this.A0L = r0;
        this.A0K = r0;
    }

    public static final void A00(Canvas canvas, RadialGradient radialGradient, ListeningIndicatorView listeningIndicatorView, float f, float f2, float f3, float f4) {
        listeningIndicatorView.A0A.setShader(radialGradient);
        int[] iArr = SpeechIndicatorView.A0b;
        Canvas canvas2 = canvas;
        G9w.A10(canvas2, new C58216IoK(canvas2, listeningIndicatorView, f, f2, f3, f4));
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        int[] iArr = SpeechIndicatorView.A0b;
        G9w.A10(canvas, C58687Ivw.A00(canvas, this, 30));
    }

    public final void onVisibilityChanged(View view, int i) {
        0qQ.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        if (i == 4 || i == 8) {
            if (this.A09) {
                Choreographer.getInstance().removeFrameCallback(this.A0I);
                this.A09 = false;
            }
        } else if (!this.A09) {
            Choreographer.getInstance().postFrameCallback(this.A0I);
            this.A09 = true;
        }
    }

    public final void setUpdateVolumeFlow(AnonymousClass0Ud r8, AnonymousClass0r6 r9) {
        AnonymousClass0Ud r2 = r8;
        AnonymousClass0r6 r3 = r9;
        AnonymousClass7TG.A1N(r8, r9);
        C262204Co r0 = this.A08;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        this.A08 = null;
        this.A08 = C51966G9m.A1L(new MHK((Object) r2, (Object) r3, (Object) this, (AnonymousClass4D7) null, 37), DbW.A0E(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r7 == X.HMJ.AMBIENT) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.HMJ r7, float r8) {
        /*
            r6 = this;
            X.HMJ r0 = X.HMJ.LISTENING
            if (r7 == r0) goto L_0x0009
            X.HMJ r0 = X.HMJ.AMBIENT
            r5 = 1
            if (r7 != r0) goto L_0x000a
        L_0x0009:
            r5 = 0
        L_0x000a:
            r0 = 1060320051(0x3f333333, float:0.7)
            float r8 = r8 - r0
            r4 = 1050253722(0x3e99999a, float:0.3)
            float r8 = r8 / r4
            r1 = 0
            float r0 = java.lang.Math.max(r8, r1)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r0, r3)
            if (r5 == 0) goto L_0x0041
            r2 = 0
        L_0x0020:
            float r1 = java.lang.Math.max(r2, r1)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = java.lang.Math.min(r1, r0)
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            r6.A06 = r0
            float r2 = r2 + r3
            float r1 = java.lang.Math.max(r2, r3)
            r0 = 1069547520(0x3fc00000, float:1.5)
            float r0 = java.lang.Math.min(r1, r0)
            r6.A04 = r0
            r6.invalidate()
            return
        L_0x0041:
            float r2 = r2 * r3
            float r2 = r2 + r4
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.components.animation.ui.view.ListeningIndicatorView.A01(X.HMJ, float):void");
    }

    public AnonymousClass07V getLifecycle() {
        return this.A0K;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(1507169481);
        super.onSizeChanged(i, i2, i3, i4);
        float A022 = (AnonymousClass7TE.A02(this) * 4.0f) / 5.0f;
        float A032 = (AnonymousClass7TE.A03(this) * 0.5f) / 2.0f;
        float f = (A022 * 2.0f) / 3.0f;
        this.A0G.set((-A022) / 3.0f, AnonymousClass7TE.A03(this) - A032, f, AnonymousClass7TE.A03(this) + A032);
        float f2 = A022 / 2.0f;
        this.A0F.set((AnonymousClass7TE.A02(this) / 2.0f) - f2, AnonymousClass7TE.A03(this) - A032, (AnonymousClass7TE.A02(this) / 2.0f) + f2, AnonymousClass7TE.A03(this) + A032);
        this.A0H.set(AnonymousClass7TE.A02(this) - f, AnonymousClass7TE.A03(this) - A032, AnonymousClass7TE.A02(this) + ((A022 * 1.0f) / 3.0f), AnonymousClass7TE.A03(this) + A032);
        float A023 = (AnonymousClass7TE.A02(this) * 1.2f) / 2.0f;
        float A033 = ((AnonymousClass7TE.A03(this) * 5.0f) / 10.0f) / 2.0f;
        this.A0B.set((AnonymousClass7TE.A02(this) / 2.0f) - A023, AnonymousClass7TE.A03(this) - A033, (AnonymousClass7TE.A02(this) / 2.0f) + A023, AnonymousClass7TE.A03(this) + A033);
        C51976G9y.A0Q(this.A0E, this, A023, (AnonymousClass7TE.A03(this) * 4.0f) / 10.0f);
        C51976G9y.A0Q(this.A0D, this, A023, AnonymousClass7TE.A03(this) * 0.18f);
        C51976G9y.A0Q(this.A0C, this, A023, AnonymousClass7TE.A03(this) * 0.083f);
        AnonymousClass0fD.A0D(2081272947, A062);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListeningIndicatorView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ListeningIndicatorView(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
