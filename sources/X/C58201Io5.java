package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import com.meta.metaai.components.animation.ui.view.SpeechIndicatorView;

/* renamed from: X.Io5  reason: case insensitive filesystem */
public final class C58201Io5 extends 0Yg implements C62320sa {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ Canvas A03;
    public final /* synthetic */ SpeechIndicatorView A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58201Io5(Canvas canvas, SpeechIndicatorView speechIndicatorView, float f, float f2, float f3) {
        super(0);
        this.A03 = canvas;
        this.A01 = f;
        this.A02 = f2;
        this.A04 = speechIndicatorView;
        this.A00 = f3;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Canvas canvas = this.A03;
        canvas.translate(this.A01, this.A02);
        SpeechIndicatorView speechIndicatorView = this.A04;
        int[] iArr = SpeechIndicatorView.A0b;
        float f = speechIndicatorView.A00;
        canvas.scale(f, f, 0.0f, 0.0f);
        canvas.clipOutPath(speechIndicatorView.A0S);
        Matrix matrix = speechIndicatorView.A0P;
        matrix.setScale(2.3f, 2.3f, 0.0f, 0.0f);
        matrix.preTranslate(-50.0f, -50.0f);
        LinearGradient linearGradient = speechIndicatorView.A0A;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
        speechIndicatorView.A0R.setShader(speechIndicatorView.A0A);
        float f2 = this.A00;
        G9w.A10(canvas, new GLP(canvas, speechIndicatorView, f2, 3));
        G9w.A10(canvas, new GLP(canvas, speechIndicatorView, f2, 4));
        G9w.A10(canvas, new GLP(canvas, speechIndicatorView, f2, 5));
        G9w.A10(canvas, C58687Ivw.A00(canvas, speechIndicatorView, 31));
        G9w.A10(canvas, C58687Ivw.A00(canvas, speechIndicatorView, 32));
        return C60340gF.A00;
    }
}
