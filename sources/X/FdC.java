package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

public final class FdC implements MVB {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public final /* synthetic */ void onTextClick(View view) {
    }

    public FdC(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A03 = obj;
        this.A04 = str;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    public final void onButtonClick(View view) {
        switch (this.A00) {
            case 0:
                String str = this.A04;
                UserSession userSession = (UserSession) this.A02;
                AnonymousClass0iw r2 = (AnonymousClass0iw) this.A01;
                FragmentActivity activity = ((Fragment) this.A03).getActivity();
                if (activity != null && userSession != null) {
                    1pE A012 = 1pE.A01(activity, r2, userSession, "poke");
                    ImageUrl imageUrl = PendingRecipient.A0g;
                    A012.A0B = new C291175gg(AnonymousClass7TE.A1I(new PendingRecipient(DbS.A0V(""), str, "")));
                    A012.A06();
                    return;
                }
                return;
            case 1:
                ((0r1) this.A02).A00 = true;
                UserSession userSession2 = (UserSession) this.A03;
                F5s.A00(C50164FRw.A00, new FSC(userSession2, 10), userSession2, 0sn.A00, true);
                FEU feu = (FEU) this.A01;
                String str2 = this.A04;
                0Aj A002 = FEU.A00(feu);
                Dbb.A18(C48138EZg.SYSTEM_UNDO_TOAST, A002);
                DbS.A1K(A002, feu.A01);
                if (str2 != null) {
                    A002.AAJ("target_user_id", str2);
                }
                A002.Cgf();
                return;
            default:
                return;
        }
    }

    public final void onDismiss() {
        if (1 - this.A00 == 0) {
            0r1 r1 = (0r1) this.A02;
            if (r1.A00) {
                r1.A00 = false;
                return;
            }
            FEU feu = (FEU) this.A01;
            String str = this.A04;
            0Aj A002 = FEU.A00(feu);
            Dbb.A19(C48138EZg.SYSTEM_UNDO_TOAST, A002);
            DbS.A1K(A002, feu.A01);
            if (str != null) {
                A002.AAJ("target_user_id", str);
            }
            A002.Cgf();
        }
    }

    public final void onShow() {
        if (1 - this.A00 == 0) {
            FEU feu = (FEU) this.A01;
            String str = this.A04;
            0Aj A002 = FEU.A00(feu);
            Dbb.A1A(C48138EZg.SYSTEM_UNDO_TOAST, A002);
            DbS.A1K(A002, feu.A01);
            if (str != null) {
                A002.AAJ("target_user_id", str);
            }
            A002.Cgf();
        }
    }
}
