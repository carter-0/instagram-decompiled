package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

public final class LUW implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public LUW(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        1Ln A002;
        String str;
        UserSession userSession;
        String str2;
        String str3;
        switch (this.A00) {
            case 0:
                String str4 = this.A03;
                if (0qQ.A0K(str4, "in_thread_add_example_dialogue")) {
                    A002 = LTH.A00((LTH) this.A01);
                    if (DbT.A1Y(A002)) {
                        str = "thread_view_add_example_dialogue_submit_for_review_dialog_submit_clicked";
                    }
                    DbS.A1U(this.A02);
                    return;
                }
                if (0qQ.A0K(str4, "in_thread_instruction")) {
                    A002 = LTH.A00((LTH) this.A01);
                    if (DbT.A1Y(A002)) {
                        str = "thread_view_add_instruction_submit_for_review_dialog_submit_clicked";
                    }
                }
                DbS.A1U(this.A02);
                return;
                A002.A0l(str);
                A002.Cgf();
                DbS.A1U(this.A02);
                return;
            case 1:
                C63964LFp lFp = (C63964LFp) this.A02;
                lFp.A01.FMU(JTU.A0I(lFp.A00, (Fragment) this.A01), this.A03);
                return;
            case 2:
                C64370Lam.A01(C368278sM.DECLINE, (UserSession) this.A02, this.A03, (String) null);
                C66461MSp mSp = (C66461MSp) this.A01;
                if (mSp != null) {
                    mSp.afterSelection(false);
                }
                dialogInterface.dismiss();
                return;
            case 3:
                C66520MUy mUy = (C66520MUy) this.A01;
                if (mUy != null) {
                    mUy.getPrimaryCtaAction();
                }
                userSession = ((LDA) this.A02).A00;
                str2 = this.A03;
                0qQ.A0B(str2, 1);
                str3 = "upsell_primary_button_clicked";
                break;
            case 4:
                C66520MUy mUy2 = (C66520MUy) this.A01;
                if (mUy2 != null) {
                    mUy2.getSecondaryCtaAction();
                }
                userSession = ((LDA) this.A02).A00;
                str2 = this.A03;
                0qQ.A0B(str2, 1);
                str3 = "upsell_secondary_button_clicked";
                break;
            default:
                return;
        }
        FG9.A00(userSession, str3, str2);
    }
}
