package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import java.util.Random;

public final class LXB implements View.OnClickListener {
    public final /* synthetic */ LwM A00;
    public final /* synthetic */ C316766mB A01;

    public LXB(LwM lwM, C316766mB r2) {
        this.A01 = r2;
        this.A00 = lwM;
    }

    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0fD.A05(-1129313568);
        C316766mB r5 = this.A01;
        LwM lwM = this.A00;
        Random random = r5.A0O;
        float nextFloat = random.nextFloat();
        if (nextFloat < 0.5f) {
            nextFloat = 0.5f;
        }
        float f = nextFloat * 200.0f;
        float f2 = -1.0f;
        if (random.nextBoolean()) {
            f2 = 1.0f;
        }
        float f3 = f * f2;
        IgSimpleImageView igSimpleImageView = r5.A07;
        if (igSimpleImageView == null) {
            str = "stickerView";
        } else {
            AnonymousClass0eM r1 = r5.A0R;
            float translationX = (igSimpleImageView.getTranslationX() + ((float) (C316766mB.A00(r5) / 2))) - ((float) (DbX.A07(r1) / 2));
            float nextInt = (float) random.nextInt(360);
            IgTextView igTextView = new IgTextView(r5.A0H);
            igTextView.setText(lwM.A00.A03);
            igTextView.setTextSize(0, (float) DbX.A07(r1));
            igTextView.setRotation(nextInt);
            igTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388691));
            IgFrameLayout igFrameLayout = r5.A05;
            if (igFrameLayout == null) {
                str = "containerView";
            } else {
                igFrameLayout.addView(igTextView, 0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.setDuration(1000);
                ofFloat.addUpdateListener(new W4M(igTextView, f3, translationX, nextInt, 1));
                ofFloat.addListener(new C62149Kb3(2, igTextView, r5));
                ofFloat.start();
                C316766mB.A03(r5);
                AnonymousClass0fD.A0C(2101216665, A05);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
