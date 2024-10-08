package X;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;

public abstract class SA0 {
    public static final C11351SOk A00(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, int i, int i2, int i3, int i4, int i5, int i6) {
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        Integer valueOf3 = Integer.valueOf(i4);
        Integer valueOf4 = Integer.valueOf(i6);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1;
        if (valueOf != null) {
            i9 = valueOf.intValue();
        }
        if (valueOf2 != null) {
            i7 = valueOf2.intValue();
        }
        if (valueOf3 != null) {
            i8 = valueOf3.intValue();
        }
        if (valueOf4 != null) {
            i10 = valueOf4.intValue();
        }
        return new C11351SOk(onClickListener2, onClickListener, i7, i8, i5, i10, i3, i9);
    }

    public static final C11351SOk A01(Drawable drawable, C8937RGf rGf, C8937RGf rGf2, C13621Tdn tdn, C13622Tdo tdo, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        SV6 sv6;
        String str7 = str;
        String str8 = str2;
        AnonymousClass7TG.A1O(str7, str8);
        C8937RGf rGf3 = rGf;
        0qQ.A0B(rGf3, 5);
        C13621Tdn tdn2 = tdn;
        C13622Tdo tdo2 = tdo;
        SV6 sv62 = new SV6(tdo2, tdn2, rGf3, str4, 0);
        C8937RGf rGf4 = rGf2;
        if (rGf2 != null) {
            sv6 = new SV6(tdo2, tdn2, rGf4, str6, 1);
        } else {
            sv6 = null;
        }
        return new C11351SOk(sv6, (DialogInterface.OnClickListener) null, sv62, drawable, str8, str5, str3, str7, 0, 0, 0, 2131961171, 1, 0, 0, z);
    }
}
