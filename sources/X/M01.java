package X;

import android.view.View;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;

public final class M01 implements C227182im {
    public final int A00;
    public final Object A01;

    public M01(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DmH(int i, int i2) {
        switch (this.A00) {
            case 0:
                DirectPrivateStoryRecipientController directPrivateStoryRecipientController = (DirectPrivateStoryRecipientController) this.A01;
                if (directPrivateStoryRecipientController.A04 != null) {
                    DirectPrivateStoryRecipientController.A07(directPrivateStoryRecipientController, (float) (-i2));
                    return;
                }
                return;
            case 1:
            case 2:
                ((2da) this.A01).Epb(i);
                return;
            case 3:
                ((C14076TpQ) this.A01).A02 = i;
                return;
            default:
                View view = (View) this.A01;
                0nA.A0e(view, i);
                0nA.A0T(view, i2);
                return;
        }
    }
}
