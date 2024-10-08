package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Set;

public final class IBH implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass3Y5 A00;
    public final /* synthetic */ C243553Zf A01;
    public final /* synthetic */ C243503Za A02;

    public IBH(AnonymousClass3Y5 r1, C243553Zf r2, C243503Za r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(171260454);
        1Yy A012 = FC8.A01();
        FragmentActivity A0J = C51969G9p.A0J(this.A00);
        DbS.A1X(A0J);
        UserSession userSession = this.A01.A00;
        C243503Za r5 = this.A02;
        User user = r5.A0F;
        String id = user.getId();
        Set set = C49280EsP.A00;
        A012.A04(A0J, userSession, AnonymousClass7TE.A0u(), AnonymousClass7TE.A0v(), id, AnonymousClass000.A00(4066));
        C273004lm A002 = C272994ll.A00(userSession);
        Integer num = AnonymousClass05K.A07;
        String id2 = user.getId();
        String A2n = r5.A09.A01.A2n();
        if (A2n != null) {
            A002.A08(id2, num, A2n);
            AnonymousClass0fD.A0C(1463560181, A05);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0C(-1105865675, A05);
        throw A0y;
    }
}
