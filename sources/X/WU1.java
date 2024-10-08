package X;

import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import java.util.HashSet;

public final class WU1 implements C250603lj {
    public final MediaMapFragment A00;
    public final HashSet A01 = new HashSet();

    public final void ATF(AnonymousClass30Y r11, C252093oY r12) {
        long B0M;
        MediaMapPin A002;
        W3Q w3q;
        long j;
        MediaMapQuery mediaMapQuery;
        boolean z;
        String str;
        String str2 = ((C19265WRy) r11.A03).A01;
        if (r12.CEk(r11) == AnonymousClass05K.A0C) {
            HashSet hashSet = this.A01;
            if (hashSet.contains(str2)) {
                MediaMapFragment mediaMapFragment = this.A00;
                int A0M = AnonymousClass7TE.A0M(r11.A04);
                B0M = r12.B0M(r11);
                A002 = mediaMapFragment.A09.A00(str2);
                w3q = mediaMapFragment.A0F;
                j = (long) A0M;
                mediaMapQuery = mediaMapFragment.A0E;
                z = true;
            } else {
                hashSet.add(str2);
                MediaMapFragment mediaMapFragment2 = this.A00;
                int A0M2 = AnonymousClass7TE.A0M(r11.A04);
                B0M = r12.B0M(r11);
                A002 = mediaMapFragment2.A09.A00(str2);
                w3q = mediaMapFragment2.A0F;
                j = (long) A0M2;
                mediaMapQuery = mediaMapFragment2.A0E;
                z = false;
            }
            String A012 = C18231Vnv.A01(A002);
            if (z) {
                str = "instagram_map_location_list_sub_impression";
            } else {
                str = "instagram_map_location_list_impression";
            }
            1Ln A013 = W3Q.A01(w3q, str);
            A013.A0R("location_id", A012);
            A013.A0Q("result_position", Long.valueOf(j));
            A013.A0Q("session_duration", Long.valueOf(B0M));
            A013.A0R("query_token", mediaMapQuery.A02);
            W3Q.A05(A013, A002);
            W3Q.A06(A013, A002, true);
            A013.Cgf();
        }
    }

    public WU1(MediaMapFragment mediaMapFragment) {
        this.A00 = mediaMapFragment;
    }
}
