package X;

import android.content.DialogInterface;
import android.widget.CompoundButton;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.EditMediaInfoFragment;

/* renamed from: X.LTx  reason: case insensitive filesystem */
public final class C64207LTx implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;

    public C64207LTx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        27r A012;
        String str;
        switch (this.A00) {
            case 2:
                C357128Wq r0 = ((EditMediaInfoFragment) this.A01).A0Q;
                if (r0 != null) {
                    C357128Wq.A00(r0);
                    return;
                }
                return;
            case 3:
                A012 = 27p.A01((UserSession) this.A01);
                str = "RESUME_DRAFT_EXIT_DIALOG_CANCEL";
                break;
            case 4:
                ((CompoundButton) this.A01).setChecked(false);
                return;
            default:
                A012 = 27p.A01(((JWG) this.A01).A08);
                str = "EXIT_DIALOG_CANCEL";
                break;
        }
        A012.A1l(str);
    }
}
