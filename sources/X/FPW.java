package X;

import android.view.View;
import com.instagram.user.model.User;

public final /* synthetic */ class FPW implements View.OnLongClickListener {
    public final /* synthetic */ C323286xF A00;
    public final /* synthetic */ C319896rP A01;
    public final /* synthetic */ User A02;

    public /* synthetic */ FPW(C323286xF r1, C319896rP r2, User user) {
        this.A00 = r1;
        this.A02 = user;
        this.A01 = r2;
    }

    public final boolean onLongClick(View view) {
        this.A00.DPK(this.A01, this.A02);
        return true;
    }
}
