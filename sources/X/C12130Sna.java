package X;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import com.facebook.cameracore.mediapipeline.dataproviders.location.implementation.LocationDataProviderImpl;
import com.facebook.native_bridge.NativeDataPromise;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.List;

/* renamed from: X.Sna  reason: case insensitive filesystem */
public final class C12130Sna implements C13709TfW {
    public final int A00;
    public final Object A01;

    public C12130Sna(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DCf(Q0M q0m) {
        switch (this.A00) {
            case 0:
                0KC.A05(QLM.class, "Failed to request location updates", q0m);
                ((SOQ) this.A01).A01();
                return;
            case 1:
                return;
            default:
                0KC.A0F("InstagramDirectLocationManager", "Location error: %s", q0m);
                if (((C11218SFs) this.A01).A00 != null) {
                    q0m.getMessage();
                    Integer num = q0m.A00;
                    0qQ.A06(num);
                    int intValue = num.intValue();
                    if (intValue != 0 && intValue != 1 && intValue != 2 && intValue != 3 && intValue != 4) {
                        throw AnonymousClass7TE.A1K();
                    }
                    return;
                }
                return;
        }
    }

    public final void DOh(C276164sm r35) {
        C276164sm r13 = r35;
        switch (this.A00) {
            case 0:
                try {
                    SOQ soq = (SOQ) this.A01;
                    LocationDataProviderImpl locationDataProviderImpl = soq.A00;
                    if (locationDataProviderImpl != null) {
                        locationDataProviderImpl.onLocationDataUpdated(SOQ.A00(soq, r13));
                    }
                    if (soq.A04 == null) {
                        Geocoder geocoder = soq.A08;
                        Location location = r13.A00;
                        List<Address> fromLocation = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
                        if (!fromLocation.isEmpty()) {
                            String locality = ((Address) AnonymousClass7TE.A13(fromLocation)).getLocality();
                            soq.A04 = locality;
                            NativeDataPromise nativeDataPromise = soq.A03;
                            if (nativeDataPromise != null && !soq.A05) {
                                nativeDataPromise.setValue(locality);
                                soq.A05 = true;
                            }
                        }
                    }
                    if (soq.A00 == null) {
                        soq.A01();
                        return;
                    }
                    return;
                } catch (IOException e) {
                    0KC.A05(QLM.class, "Error while handling location changed", e);
                    return;
                }
            case 1:
                T6B t6b = (T6B) this.A01;
                Location location2 = new Location(r13.A00);
                t6b.A00 = location2;
                for (C19204WPk A06 : t6b.A05) {
                    A06.A06(location2);
                }
                return;
            default:
                C11218SFs sFs = (C11218SFs) this.A01;
                List A0a = 00k.A0a(sFs.A01);
                String str = sFs.A07;
                String str2 = sFs.A08;
                Context context = sFs.A02;
                UserSession userSession = sFs.A06;
                C10638RvX rvX = new C10638RvX(r13, sFs, A0a);
                C51972G9s.A1D(str, str2);
                SG0 sg0 = new SG0((C21455XbI) null, r13, (C11379SQr) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Float) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, 002.A0R("InstagramDirectLocationManager", ":LocationUploadNetworkApi"), (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null);
                try {
                    if (C61970qY.A0E(context)) {
                        Integer num = AnonymousClass05K.A00;
                        C298215t4 A002 = C298215t4.A00((Boolean) null, num, str, str2, AnonymousClass7TE.A1I(sg0), A0a);
                        if (A002 != null) {
                            C239123Fb r0 = new C239123Fb(userSession);
                            r0.A09(A002);
                            1OC A07 = r0.A07(num);
                            A07.A00 = new C8764R8p((Object) rvX, 6);
                            1ES.A05(A07, 1698122764, 2, true, false);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    e2.getMessage();
                    return;
                }
        }
    }
}
