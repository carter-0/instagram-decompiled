package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.discovery.mediamap.intf.MapEntryPoint;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.model.venue.Venue;
import java.util.ArrayList;

/* renamed from: X.VBa  reason: case insensitive filesystem */
public abstract class C16923VBa {
    public static void A00(FragmentActivity fragmentActivity, C267664bz r15, AnonymousClass0iw r16, UserSession userSession, Venue venue, String str, String str2, double[] dArr, boolean z) {
        UserSession userSession2 = userSession;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        Venue venue2 = venue;
        if (182.A06(0Tu.A05, userSession2, 36312355055010866L)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new MediaMapPin((ImageUrl) null, (LocationPageInformation) null, C16557Ux9.FEED, venue2, venue2.A00(), venue2.A01(), (String) null, 0));
            String A0b = AnonymousClass7TF.A0b();
            C18681Vwf.A01((Bundle) null, fragmentActivity2, userSession2, MapEntryPoint.LOCATION_PAGE_TAKEOVER, C16614UyA.LOCATION_PAGE_TAKEOVER, A0b, venue2.A05(), str2, arrayList, dArr);
            if (z) {
                fragmentActivity2.finish();
                return;
            }
            return;
        }
        C309516Yo A0Q = DbU.A0Q(fragmentActivity2, userSession2);
        String str3 = str;
        if (str != null) {
            A0Q.A0B = str3;
        }
        1Wr r0 = 1Wr.A00;
        r0.getClass();
        A0Q.A0E(r0.getFragmentFactory().CrC(venue2.A05()));
        AnonymousClass0iw r02 = r16;
        if (r16 != null) {
            A0Q.A09 = r02;
        }
        if (r15 != null) {
            A0Q.A07 = r15;
        }
        A0Q.A04();
    }
}
