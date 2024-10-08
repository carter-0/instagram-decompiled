package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;

/* renamed from: X.Fvk  reason: case insensitive filesystem */
public final /* synthetic */ class C51538Fvk implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C46521DgO A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ 0sP A03;
    public final /* synthetic */ 0sP A04;

    public /* synthetic */ C51538Fvk(FragmentActivity fragmentActivity, C46521DgO dgO, User user, 0sP r4, 0sP r5) {
        this.A01 = dgO;
        this.A00 = fragmentActivity;
        this.A02 = user;
        this.A03 = r4;
        this.A04 = r5;
    }

    public final void run() {
        C46521DgO dgO = this.A01;
        FragmentActivity fragmentActivity = this.A00;
        User user = this.A02;
        C294695ms.A00(dgO.A03).A0A(fragmentActivity, user.getId(), dgO.A01.getModuleName(), this.A03, this.A04);
    }
}
