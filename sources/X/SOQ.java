package X;

import android.content.Context;
import android.hardware.GeomagneticField;
import android.location.Geocoder;
import android.location.Location;
import com.facebook.cameracore.mediapipeline.dataproviders.location.implementation.LocationDataProviderImpl;
import com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationData;
import com.facebook.native_bridge.NativeDataPromise;
import com.facebook.proxygen.LigerSamplePolicy;

public abstract class SOQ {
    public static final AnonymousClass9QC A0B = new AnonymousClass9QC((Float) null, AnonymousClass05K.A01, (Long) null, 10000L, 50.0f, 0.6666667f, 120000, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, false, false, false);
    public LocationDataProviderImpl A00;
    public C13709TfW A01;
    public AnonymousClass9QC A02 = A0B;
    public NativeDataPromise A03;
    public String A04;
    public boolean A05;
    public GeomagneticField A06;
    public final Context A07;
    public final Geocoder A08;
    public final C270964hg A09;
    public final AnonymousClass60p A0A;

    public static LocationData A00(SOQ soq, C276164sm r39) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        long longValue;
        Float f;
        C276164sm r5 = r39;
        double d6 = 0.0d;
        if (r5.A01() != null) {
            d = (double) r5.A01().floatValue();
        } else {
            d = 0.0d;
        }
        if (r5.A00() != null) {
            d2 = r5.A00().doubleValue();
        } else {
            d2 = 0.0d;
        }
        Location location = r5.A00;
        if (!location.hasVerticalAccuracy() || Float.valueOf(location.getVerticalAccuracyMeters()) == null) {
            d3 = 0.0d;
        } else {
            Float f2 = null;
            if (location.hasVerticalAccuracy()) {
                f2 = Float.valueOf(location.getVerticalAccuracyMeters());
            }
            d3 = (double) f2.floatValue();
        }
        if (r5.A02() != null) {
            d4 = (double) r5.A02().floatValue();
        } else {
            d4 = 0.0d;
        }
        if (!location.hasBearing() || Float.valueOf(location.getBearingAccuracyDegrees()) == null) {
            d5 = 0.0d;
        } else {
            if (location.hasBearing()) {
                f = Float.valueOf(location.getBearingAccuracyDegrees());
            } else {
                f = null;
            }
            d5 = (double) f.floatValue();
        }
        if (r5.A03() == null) {
            longValue = 0;
        } else {
            longValue = r5.A03().longValue();
        }
        SOQ soq2 = soq;
        GeomagneticField geomagneticField = soq2.A06;
        if (geomagneticField == null) {
            if (d > 0.0d) {
                geomagneticField = new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) d, longValue);
                soq2.A06 = geomagneticField;
            }
            return new LocationData(true, location.getLatitude(), location.getLongitude(), d, d2, d3, d4, d5, 0.0d, 0.0d + d6, 0.0d, d6, ((double) longValue) / 1000.0d);
        }
        d6 = (double) geomagneticField.getDeclination();
        return new LocationData(true, location.getLatitude(), location.getLongitude(), d, d2, d3, d4, d5, 0.0d, 0.0d + d6, 0.0d, d6, ((double) longValue) / 1000.0d);
    }

    public final void A01() {
        if (this.A01 != null) {
            this.A0A.A06();
            this.A01 = null;
        }
    }

    public SOQ(Context context, C270964hg r3, AnonymousClass60p r4) {
        this.A0A = r4;
        this.A09 = r3;
        this.A07 = context;
        this.A08 = new Geocoder(context);
    }
}
