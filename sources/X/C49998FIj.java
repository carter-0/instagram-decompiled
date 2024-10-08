package X;

import android.content.DialogInterface;
import com.instagram.user.model.User;

/* renamed from: X.FIj  reason: case insensitive filesystem */
public final class C49998FIj implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    public C49998FIj(G7P g7p, F3J f3j, User user, String str, int i, boolean z) {
        this.A00 = i;
        this.A02 = user;
        this.A03 = f3j;
        this.A04 = str;
        this.A05 = z;
        this.A01 = g7p;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A00 != 0 || i == 0) {
            User user = (User) this.A02;
            boolean z = !user.A1w();
            F3J f3j = (F3J) this.A03;
            f3j.A00(f3j.A00, user, this.A04, this.A05);
            G7P g7p = (G7P) this.A01;
            if (g7p != null) {
                g7p.Dc4();
                g7p.Dc5(user, z);
            }
        }
    }
}
