package X;

import android.content.ClipData;
import android.content.ClipboardManager;

/* renamed from: X.EfF  reason: case insensitive filesystem */
public abstract class C48482EfF {
    public static final Object A00(C307896Rx r4, AnonymousClass6Tm r5) {
        ClipData newPlainText = ClipData.newPlainText((CharSequence) null, DbY.A0g(r5));
        Object A0e = DbZ.A0e(C308206Td.A09(r4).A00);
        0qQ.A0C(A0e, AnonymousClass000.A00(85));
        ((ClipboardManager) A0e).setPrimaryClip(newPlainText);
        return null;
    }
}
