package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;

/* renamed from: X.H7k  reason: case insensitive filesystem */
public final class C54315H7k extends AnonymousClass3NK {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C54315H7k(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj3;
        this.A04 = obj4;
        this.A02 = obj;
        this.A03 = obj2;
    }

    public final boolean Dqe(View view) {
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                C331127Pr A0W = DbS.A0W((0lg) this.A04);
                A0W.A0k = true;
                A0W.A1O = true;
                A0W.A00().A02((Activity) this.A02, (Fragment) this.A03);
                return true;
            case 1:
                UserSession userSession = ((C17490VXt) this.A04).A03;
                Bundle A012 = C46447Df9.A02().A01(userSession, C46548Dgp.A02(userSession, ((User) this.A03).getUsername(), "clips_comments_question_response_more_options", AnonymousClass000.A00(271)).A04());
                AnonymousClass6W8 A0b = DbS.A0b((Activity) this.A01, A012, userSession, ModalActivity.class, "profile");
                A0b.A0J = ModalActivity.A08;
                A0b.A0C((Context) this.A02);
                return true;
            case 2:
                C61062Jw0 jw0 = ((N3A) this.A03).A01;
                if (!(jw0 == null || (str2 = jw0.A02) == null)) {
                    ((C56023HrV) this.A02).A01(str2, AnonymousClass05K.A00);
                }
                Context context = (Context) this.A01;
                0qQ.A0A(context);
                UserSession userSession2 = (UserSession) this.A04;
                if (jw0 != null) {
                    str = jw0.A02;
                } else {
                    str = null;
                }
                Dbb.A0k(context, userSession2, 2EG.A46, str);
                return true;
            default:
                0qQ.A0B(view, 0);
                if (!AnonymousClass3ZC.A07(((C52150GGs) this.A04).A00, (C267324bN) this.A02)) {
                    return false;
                }
                ((0sL) this.A03).invoke(this.A01, view);
                return true;
        }
    }
}
