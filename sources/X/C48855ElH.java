package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.ElH  reason: case insensitive filesystem */
public abstract class C48855ElH {
    public static final void A00(Context context, String str, String str2, String str3) {
        0qQ.A0B(context, 0);
        DbZ.A0t(1, str, str2, str3);
        Intent flags = new Intent("android.intent.action.VIEW", DbV.A08(DbW.A07("https://www.instagram.com/_n/business_order?").appendQueryParameter("order_id", str3).appendQueryParameter("merchant_id", str).appendQueryParameter("consumer_id", str2), "entrypoint", AnonymousClass000.A00(2390))).putExtra(C66579MXk.A00(3), true).setFlags(Constants.LOAD_RESULT_PGO_ATTEMPTED);
        0qQ.A07(flags);
        flags.setPackage(context.getPackageName());
        0kR.A0C(context, flags);
    }
}
