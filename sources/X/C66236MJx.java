package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: X.MJx  reason: case insensitive filesystem */
public final class C66236MJx extends 0Yg implements C62320sa {
    public static final C66236MJx A00 = new C66236MJx();

    public C66236MJx() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        TimeZone timeZone = TimeZone.getDefault();
        return Integer.valueOf(timeZone.getOffset(Calendar.getInstance(timeZone).getTimeInMillis()) / IgNetworkConsentStorage.MAX_ENTRIES);
    }
}
