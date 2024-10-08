package X;

import android.content.Context;

public final class SGk {
    public static final AnonymousClass95n A01;
    public final Context A00;

    public SGk(Context context) {
        this.A00 = context;
    }

    public final synchronized String A00() {
        String string;
        Context context = this.A00;
        string = context.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", (String) null);
        if (string == null) {
            string = AnonymousClass7TF.A0b();
            Pxf.A13(context.getSharedPreferences("com.google.mlkit.internal", 0).edit(), "ml_sdk_instance_id", string);
        }
        return string;
    }

    static {
        C3734595o A0Y = Pxh.A0Y(SGk.class);
        Pxh.A1G(A0Y, SO3.class, 1);
        Pxh.A1G(A0Y, Context.class, 1);
        A01 = Pxh.A0Z(A0Y, C12620T0e.A00);
    }
}
