package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.instagram.ui.widget.balloonsview.BalloonsView;
import java.util.List;

public final class Lf2 implements AnonymousClass1MK {
    public final int A00;
    public final int A01;
    public final Object A02;

    public Lf2(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
        this.A02 = obj;
    }

    public final void CyF(C226952iF r5, AnonymousClass3LX r6) {
        if (this.A00 != 0) {
            0qQ.A0B(r6, 1);
            BalloonsView balloonsView = (BalloonsView) this.A02;
            List list = balloonsView.A08;
            list.add(r6.A01);
            if (list.size() == this.A01) {
                BalloonsView.A00(balloonsView);
                return;
            }
            return;
        }
        Bitmap A07 = JTQ.A07(r6);
        if (A07 != null) {
            int i = this.A01;
            Bitmap A002 = 0fO.A00(A07, i, i, false);
            0qQ.A07(A002);
            ((Canvas) this.A02).drawBitmap(A002, 0.0f, 0.0f, (Paint) null);
        }
    }

    public final void DJx(C226952iF r4, C254673sr r5) {
        if (this.A00 == 0) {
            0wj.A01.AEf("Exception getting bitmap from user cover image url", 817896325);
        }
    }

    public final void DK4(C226952iF r1, int i) {
    }
}
