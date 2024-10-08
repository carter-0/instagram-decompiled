package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.Edc  reason: case insensitive filesystem */
public abstract class C48381Edc {
    public static final boolean A00(Context context, String str) {
        Intent data = new Intent("android.intent.action.VIEW").setFlags(268435456).setData(0cp.A01(DbW.A0G(), str));
        0qQ.A07(data);
        if ((00p.A0k(str, "market://", false) || 00p.A0k(str, "https://play.google.com/", false)) && 0oI.A0F(context)) {
            data.setPackage("com.android.vending");
        }
        return 0kR.A09(context, data);
    }
}
