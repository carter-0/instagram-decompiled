package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.modal.ModalActivity;

/* renamed from: X.TsK  reason: case insensitive filesystem */
public final /* synthetic */ class C14237TsK implements C227182im {
    public final /* synthetic */ ModalActivity A00;

    public /* synthetic */ C14237TsK(ModalActivity modalActivity) {
        this.A00 = modalActivity;
    }

    public final void DmH(int i, int i2) {
        ModalActivity modalActivity = this.A00;
        View findViewById = modalActivity.findViewById(R.id.bottom_sheet_container_stub);
        if (findViewById != null) {
            0nA.A0T(findViewById, i2);
        }
        modalActivity.Bx5().A05(i2);
    }
}
