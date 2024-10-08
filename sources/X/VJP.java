package X;

import android.content.Context;

public abstract class VJP {
    public static C20945X5o A00;

    public static void A00(Context context) {
        if (A00 == null) {
            try {
                A00 = (C20945X5o) Class.forName("DefaultLocationProvider").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            } catch (Exception e) {
                throw new RuntimeException("GeoAPI is not available. Please register your own location provider.", e);
            }
        }
    }
}
