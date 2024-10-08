package X;

import android.app.Notification;
import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.PlR  reason: case insensitive filesystem */
public final class C73890PlR extends 0Yg implements C62320sa {
    public static final C73890PlR A00 = new C73890PlR();

    public C73890PlR() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context = C60960kU.A00;
        0qQ.A07(context);
        AnonymousClass9T8 r4 = new AnonymousClass9T8(context, "ig_other");
        r4.A0C("IG FOS Easy Dogfooding");
        long currentTimeMillis = System.currentTimeMillis();
        Notification notification = r4.A0A;
        notification.when = currentTimeMillis;
        r4.A0i = true;
        AnonymousClass9T8.A01(r4, 2, true);
        r4.A04(R.drawable.notification_icon);
        r4.A0d = true;
        r4.A0e = true;
        r4.A05 = 1;
        0Sy r2 = new 0Sy();
        r2.A0D = true;
        r4.A0C = r2.A01(context, (int) System.currentTimeMillis(), 268435456);
        r4.A0Y.add(new ADG(OYU.A00("OFF", 1), "Turn Off", R.drawable.notification_icon));
        r4.A0Y.add(new ADG(OYU.A00("PAID_BALANCE", 2), "Paid Balance", R.drawable.notification_icon));
        r4.A0Y.add(new ADG(OYU.A00("ZERO_BALANCE", 3), "Zero Balance", R.drawable.notification_icon));
        notification.deleteIntent = OYU.A00("delete", 4);
        return r4;
    }
}
