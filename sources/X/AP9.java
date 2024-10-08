package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public final class AP9 implements View.OnTouchListener {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ C255773uh A01;
    public final /* synthetic */ C309426Yf A02;
    public final /* synthetic */ C309406Yd A03;
    public final /* synthetic */ C309826Zt A04;
    public final /* synthetic */ C307136Oy A05;

    public AP9(TextView textView, C255773uh r2, C309426Yf r3, C309406Yd r4, C309826Zt r5, C307136Oy r6) {
        this.A00 = textView;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r6;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float[] fArr = new float[2];
        TextView textView = this.A00;
        0qQ.A0A(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0 || action != 1) {
            return false;
        }
        int[] iArr = new int[2];
        textView.getLocationOnScreen(iArr);
        float rawX = motionEvent.getRawX() - ((float) iArr[0]);
        float rawY = motionEvent.getRawY() - ((float) iArr[1]);
        if (0.0f > rawX || rawX > AnonymousClass7TE.A02(textView) || 0.0f > rawY || rawY > AnonymousClass7TE.A03(textView)) {
            return false;
        }
        fArr[0] = motionEvent.getRawX();
        fArr[1] = motionEvent.getRawY();
        this.A03.A02();
        this.A04.DDc(this.A01, this.A02, fArr);
        this.A05.A04.setVisibility(8);
        return true;
    }
}
