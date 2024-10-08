package X;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.TextView;
import com.instagram.direct.visual.DirectVisualMessageViewerController;

public final class IEI implements TextView.OnEditorActionListener {
    public final int A00;
    public final Object A01;

    public IEI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.A00) {
            case 0:
                if (i != 4) {
                    return false;
                }
                IOA ioa = (IOA) this.A01;
                if (!ioa.A08()) {
                    return false;
                }
                IOA.A03(ioa);
                return true;
            case 1:
                if (i != 6) {
                    return false;
                }
                0qQ.A0A(textView);
                H1O.A02(textView, (H1O) this.A01);
                return true;
            case 2:
                if (i != 4 || !DirectVisualMessageViewerController.A0Q((Context) null, (DirectVisualMessageViewerController) this.A01)) {
                    return false;
                }
                return true;
            case 3:
                C57106IOu iOu = (C57106IOu) this.A01;
                C60291Jio A002 = C57106IOu.A00(iOu);
                H80 h80 = iOu.A0B;
                long A003 = h80.A00();
                int i2 = h80.A00;
                h80.A00 = 0;
                A002.A01("", i2, A003, true);
                return true;
            case 4:
                C53902Gw8 gw8 = (C53902Gw8) this.A01;
                gw8.A04.invoke(new C54536HHx((C56565I1t) null, gw8.A00.A00(), gw8.A01.A00));
                return true;
            default:
                DbS.A1U(this.A01);
                return true;
        }
    }
}
