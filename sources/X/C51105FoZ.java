package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;

/* renamed from: X.FoZ  reason: case insensitive filesystem */
public final class C51105FoZ implements C51889G6e {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ 0wc A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ C51031FnN A04;

    public C51105FoZ(Context context, FragmentActivity fragmentActivity, 0wc r3, User user, C51031FnN fnN) {
        this.A02 = r3;
        this.A03 = user;
        this.A00 = context;
        this.A04 = fnN;
        this.A01 = fragmentActivity;
    }

    public final void DwT(String str) {
        0wc r3 = this.A02;
        User user = this.A03;
        AnonymousClass73V.A0G(r3, "impression", "restrict_success_toast", user.getId());
        C49239Eri.A00(this.A01, this.A00, this.A04.A04, user.getUsername());
    }
}
