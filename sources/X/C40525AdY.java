package X;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import com.instagram.common.gallery.Medium;
import java.io.IOException;
import java.util.List;

/* renamed from: X.AdY  reason: case insensitive filesystem */
public final class C40525AdY implements C41822B2d {
    public final ContentResolver A00;
    public final Context A01;
    public final Geocoder A02;

    public final String getName() {
        return "LocationFeatureScanner";
    }

    public final List ADt() {
        return 0sn.A00;
    }

    public final boolean EKL(Bitmap bitmap, Medium medium, C358058aI r15) {
        Context context = this.A01;
        0qg.A01();
        if (0qg.A00(context, false) >= 52428800) {
            double[] A07 = medium.A07(this.A00);
            if (A07 == null) {
                0KC.A0P("LocationFeatureScanner", "media:%s doesn't have latlng values", AnonymousClass7TF.A1b(medium.A05));
            } else {
                try {
                    List<Address> fromLocation = this.A02.getFromLocation(A07[0], A07[1], 1);
                    if (fromLocation == null || fromLocation.isEmpty()) {
                        return true;
                    }
                    Address address = fromLocation.get(0);
                    r15.A0K = address.getFeatureName();
                    r15.A0M = address.getLocality();
                    r15.A0N = address.getSubAdminArea();
                    r15.A0I = address.getAdminArea();
                    r15.A0J = address.getCountryName();
                    return true;
                } catch (IllegalArgumentException e) {
                    0KC.A0F("LocationFeatureScanner", "invalid arguments passed to geocoder latlng.", e);
                    return true;
                } catch (IOException e2) {
                    0KC.A0F("LocationFeatureScanner", "geocoding failed", e2);
                    return false;
                } catch (Exception e3) {
                    0KC.A0F("LocationFeatureScanner", "geocoding failed", e3);
                    0wb.A07("LocationFeatureScanner#exception", e3);
                    return true;
                }
            }
        }
        return false;
    }

    public C40525AdY(Context context) {
        this.A01 = context;
        this.A02 = new Geocoder(context);
        ContentResolver contentResolver = context.getContentResolver();
        0qQ.A07(contentResolver);
        this.A00 = contentResolver;
    }
}
