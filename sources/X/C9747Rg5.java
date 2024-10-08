package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* renamed from: X.Rg5  reason: case insensitive filesystem */
public abstract class C9747Rg5 {
    public static void A00(Context context) {
        C8506Qw2 qw2 = C8499Qvv.A00;
        Object[] objArr = {"ocr"};
        if (objArr[0] != null) {
            C8498Qvu qvu = new C8498Qvu(objArr, 1);
            Intent A09 = DbS.A09();
            A09.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            A09.setAction("com.google.android.gms.vision.DEPENDENCY");
            A09.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", qvu));
            A09.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(A09);
            return;
        }
        throw Pxg.A0h(0);
    }
}
