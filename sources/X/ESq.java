package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class ESq extends C2806552w {
    public final /* synthetic */ View A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ Ey0 A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ESq(View view, FragmentActivity fragmentActivity, UserSession userSession, Ey0 ey0, int i) {
        super(Integer.valueOf(i));
        this.A00 = view;
        this.A03 = ey0;
        this.A02 = userSession;
        this.A01 = fragmentActivity;
    }

    public final void onClick(View view) {
        this.A00.setVisibility(8);
        E15 e15 = new E15();
        Ey0 ey0 = this.A03;
        0qQ.A0B(ey0, 0);
        e15.A00 = ey0;
        DbW.A0T(this.A02).A02(this.A01, e15);
    }
}
