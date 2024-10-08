package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.FNv  reason: case insensitive filesystem */
public final /* synthetic */ class C50080FNv implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass70F A00;
    public final /* synthetic */ C323286xF A01;
    public final /* synthetic */ C319896rP A02;
    public final /* synthetic */ User A03;

    public /* synthetic */ C50080FNv(AnonymousClass70F r1, C323286xF r2, C319896rP r3, User user) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = user;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        this.A01.D2v((RectF) null, this.A00, this.A02, this.A03);
    }
}
