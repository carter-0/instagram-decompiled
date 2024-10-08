package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.io.IOException;

public abstract class SL9 {
    public static boolean A00;

    public static final void A02(Context context, C307896Rx r6, AnonymousClass6Tm r7) {
        A00 = false;
        Intent putExtra = Pxe.A0G("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType("image/*").putExtra("android.intent.extra.ALLOW_MULTIPLE", false);
        0qQ.A07(putExtra);
        C8778R9e r9e = new C8778R9e(0, context, r6, r7);
        try {
            C308206Td.A0K(r6, r9e);
            0kR.A06(DbU.A0H(r6), putExtra, 2);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
            C308206Td.A0L(r6, r9e);
        }
    }

    public static final String A00(Context context) {
        if (Build.VERSION.SDK_INT < 33 || context.getApplicationInfo().targetSdkVersion < 33) {
            return "android.permission.READ_EXTERNAL_STORAGE";
        }
        return "android.permission.READ_MEDIA_IMAGES";
    }

    public static final void A01(Context context, C307896Rx r7, AnonymousClass6Tm r8) {
        File A04 = 0mb.A04(context);
        try {
            OOC ooc = new OOC();
            0qQ.A0A(A04);
            0qQ.A0B(A04, 0);
            ooc.A03 = A04;
            Uri A01 = new NEK().A01(context, ooc.A00());
            0qQ.A07(A01);
            Intent A0G = Pxe.A0G("android.media.action.IMAGE_CAPTURE");
            A0G.putExtra("output", A01);
            T73 t73 = new T73(0, r7, A04, r8);
            try {
                C308206Td.A0K(r7, t73);
                0kR.A06(DbU.A0H(r7), A0G, 1);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
                C308206Td.A0L(r7, t73);
                A04.delete();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            A04.delete();
        }
    }
}
