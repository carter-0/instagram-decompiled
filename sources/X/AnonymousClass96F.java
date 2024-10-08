package X;

import android.content.Context;

/* renamed from: X.96F  reason: invalid class name */
public final /* synthetic */ class AnonymousClass96F implements AnonymousClass96C {
    public static final AnonymousClass96F A00 = new AnonymousClass96F();

    public final String ATh(Object obj) {
        Context context = (Context) obj;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature(AnonymousClass000.A00(4451))) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature(C273654mx.A00(117))) {
            return "auto";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "embedded";
        }
        return "";
    }
}
