package X;

import android.content.Context;
import com.instagram.user.model.User;

/* renamed from: X.Fgf  reason: case insensitive filesystem */
public final class C50680Fgf implements G7J {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C50672FgX A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ String A03;

    public C50680Fgf(Context context, C50672FgX fgX, User user, String str) {
        this.A01 = fgX;
        this.A02 = user;
        this.A00 = context;
        this.A03 = str;
    }

    public final void DVM() {
        C50672FgX.A01(this.A00, this.A01, this.A02, this.A03);
    }

    public final void Dz7() {
        String BHm = this.A02.A03.BHm();
        if (BHm != null) {
            C50672FgX.A05(this.A01, BHm, this.A03);
        }
    }
}
