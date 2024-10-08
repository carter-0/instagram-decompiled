package X;

import android.content.Context;

/* renamed from: X.7jZ  reason: invalid class name and case insensitive filesystem */
public enum C339417jZ {
    ;

    /* access modifiers changed from: public */
    static {
        C339417jZ[] r0;
        A00 = 0oU.A00(r0);
    }

    public static final void A00(Context context, Integer num, C62320sa r7, int i, int i2) {
        C358248ab r4 = new C358248ab(context);
        r4.A09(i);
        if (num != null) {
            r4.A08(num.intValue());
        }
        String string = context.getResources().getString(i2);
        0qQ.A07(string);
        r4.A0Y(new C39929AJv(r7), C358278ae.RED_BOLD, string, true);
        r4.A03();
        AnonymousClass0fN.A00(r4.A02());
    }
}
