package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.user.model.User;
import java.util.List;

public final /* synthetic */ class FNB implements View.OnClickListener {
    public final /* synthetic */ C323366xN A00;
    public final /* synthetic */ User A01;

    public /* synthetic */ FNB(C323366xN r1, User user) {
        this.A00 = r1;
        this.A01 = user;
    }

    public final void onClick(View view) {
        C323366xN r3 = this.A00;
        User user = this.A01;
        Fragment r2 = new AnonymousClass4DH();
        List list = r3.A07;
        r2.A00 = user;
        r2.A01 = list;
        DbW.A0T(r3.A0E).A03((Context) r3.A0C, r2);
    }
}
