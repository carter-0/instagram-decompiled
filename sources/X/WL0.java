package X;

import android.text.Layout;
import android.text.Spannable;
import android.text.TextPaint;
import com.facebook.react.views.text.ReactTextShadowNode;

public final class WL0 implements C20887X2r {
    public final /* synthetic */ ReactTextShadowNode A00;

    public WL0(ReactTextShadowNode reactTextShadowNode) {
        this.A00 = reactTextShadowNode;
    }

    public final float AD8(C245003c8 r4, float f, float f2) {
        ReactTextShadowNode reactTextShadowNode = this.A00;
        TextPaint textPaint = ReactTextShadowNode.A04;
        Spannable spannable = reactTextShadowNode.A00;
        0Sd.A01(spannable, "Spannable element has not been prepared in onBeforeLayout");
        Layout A01 = ReactTextShadowNode.A01(spannable, reactTextShadowNode, C245103cK.EXACTLY, f);
        return (float) A01.getLineBaseline(A01.getLineCount() - 1);
    }
}
