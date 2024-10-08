package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.user.model.User;

/* renamed from: X.F0w  reason: case insensitive filesystem */
public final class C49664F0w {
    public Context A00;
    public C358278ae A01 = C358278ae.RED;
    public C358278ae A02 = C358278ae.RED_BOLD;
    public User A03;
    public C49655F0m A04;
    public Integer A05;
    public final DialogInterface.OnClickListener A06 = C50021FJg.A00(this, 45);
    public final DialogInterface.OnClickListener A07 = C50021FJg.A00(this, 44);
    public final DialogInterface.OnClickListener A08 = C50021FJg.A00(this, 43);

    public C49664F0w(Context context, User user, C49655F0m f0m, Integer num) {
        this.A00 = context;
        this.A03 = user;
        this.A05 = num;
        this.A04 = f0m;
    }
}
