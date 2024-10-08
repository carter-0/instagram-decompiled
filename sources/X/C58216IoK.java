package X;

import android.graphics.Canvas;
import android.graphics.RadialGradient;
import com.meta.metaai.components.animation.ui.view.ListeningIndicatorView;

/* renamed from: X.IoK  reason: case insensitive filesystem */
public final class C58216IoK extends 0Yg implements C62320sa {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ Canvas A04;
    public final /* synthetic */ ListeningIndicatorView A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58216IoK(Canvas canvas, ListeningIndicatorView listeningIndicatorView, float f, float f2, float f3, float f4) {
        super(0);
        this.A04 = canvas;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A05 = listeningIndicatorView;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Canvas canvas = this.A04;
        canvas.translate(this.A00, this.A01);
        canvas.scale(this.A02, this.A03);
        ListeningIndicatorView listeningIndicatorView = this.A05;
        RadialGradient radialGradient = ListeningIndicatorView.A0S;
        canvas.drawCircle(0.0f, 0.0f, 100.0f, listeningIndicatorView.A0A);
        return C60340gF.A00;
    }
}
