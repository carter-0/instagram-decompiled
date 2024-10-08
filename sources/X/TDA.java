package X;

import android.widget.TextView;

public final class TDA implements Runnable {
    public final /* synthetic */ C8132QhQ A00;

    public TDA(C8132QhQ qhQ) {
        this.A00 = qhQ;
    }

    public final void run() {
        C8132QhQ qhQ = this.A00;
        TextView textView = qhQ.A02;
        if (textView != null) {
            textView.setText(JTO.A0A(qhQ.A0X, qhQ.A00));
        }
        qhQ.A00 = (qhQ.A00 + 1) % qhQ.A0X.length;
        qhQ.A0F.postDelayed(this, 3000);
    }
}
