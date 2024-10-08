package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.ViewTreeObserver;
import android.widget.TextView;

public final class APF implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ TextView A02;

    public APF(TextView textView, int i, int i2) {
        this.A02 = textView;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void onGlobalLayout() {
        TextView textView = this.A02;
        textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        float width = (float) (textView.getWidth() / 2);
        textView.getPaint().setShader(new LinearGradient(width, 0.0f, width, (float) textView.getHeight(), new int[]{this.A01, this.A00}, (float[]) null, Shader.TileMode.CLAMP));
    }
}
