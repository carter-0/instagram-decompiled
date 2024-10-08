package X;

import android.widget.TextView;
import com.facebook.smartcapture.docauth.CreditCardScannerResult;

public final class TGQ implements Runnable {
    public final /* synthetic */ CreditCardScannerResult A00;
    public final /* synthetic */ C7913Qcj A01;

    public TGQ(CreditCardScannerResult creditCardScannerResult, C7913Qcj qcj) {
        this.A01 = qcj;
        this.A00 = creditCardScannerResult;
    }

    public final void run() {
        C7913Qcj qcj = this.A01;
        TextView textView = qcj.A09;
        0qQ.A0A(textView);
        textView.setVisibility(0);
        TextView textView2 = qcj.A09;
        0qQ.A0A(textView2);
        textView2.setText(this.A00.getDisplayFormat());
        TextView textView3 = qcj.A09;
        0qQ.A0A(textView3);
        DbY.A0G(textView3).setDuration(300).start();
    }
}
