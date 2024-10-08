package X;

import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.user.model.UpcomingEventImpl;
import java.util.List;

/* renamed from: X.LIj  reason: case insensitive filesystem */
public abstract class C64003LIj {
    /* JADX WARNING: type inference failed for: r8v2, types: [com.instagram.model.venue.Venue, java.lang.Object] */
    public static final C61075JwD A00(C293505kq r64) {
        AnonymousClass8JI r2;
        Venue venue;
        C293505kq r13 = r64;
        String str = r13.A0T;
        String str2 = r13.A0V;
        MediaCroppingCoordinates mediaCroppingCoordinates = r13.A06;
        AnonymousClass9P8 r0 = r13.A0E;
        String str3 = null;
        if (r0 != null) {
            r2 = r0.A06;
        } else {
            r2 = null;
        }
        C61077JwF jwF = new C61077JwF((Object) mediaCroppingCoordinates, str2, 6, C51969G9p.A1a(r2, AnonymousClass8JI.REMIX));
        String str4 = r13.A0S;
        if (str4 == null) {
            str4 = "";
        }
        C272024jy r31 = r13.A0O;
        List list = r13.A0q;
        List list2 = r13.A0n;
        boolean z = r13.A17;
        LocationDict locationDict = r13.A0L;
        if (locationDict != null) {
            ? obj = new Object();
            obj.A00 = locationDict;
            venue = obj;
        } else {
            venue = null;
        }
        AnonymousClass3QO r26 = r13.A0K;
        C61062Jw0 jw0 = r13.A04;
        C59721JVf jVf = new C59721JVf(43, (Object) r13.A0D, (Object) null);
        AudioOverlayTrack audioOverlayTrack = r13.A0N;
        String str5 = r13.A0g;
        List list3 = r13.A0t;
        String str6 = r13.A0X;
        C61079JwH jwH = new C61079JwH((Object) r13.A0J, (Object) r13.A0R, r13.A0Y, 11);
        String str7 = r13.A0f;
        UpcomingEventImpl upcomingEventImpl = r13.A0Q;
        boolean z2 = r13.A18;
        String str8 = r13.A0d;
        C61000Juw juw = r13.A0I;
        C61066Jw4 jw4 = r13.A03;
        C61080JwI jwI = r13.A02;
        C61100JxB jxB = r13.A05;
        boolean z3 = r13.A0y;
        boolean z4 = r13.A0x;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod = r13.A07;
        AnonymousClass9J6 r5 = new AnonymousClass9J6(r13.A0a, r13.A0Z, 11);
        List list4 = r13.A0m;
        boolean z5 = r13.A19;
        C279584ys r02 = r13.A08;
        if (r02 != null) {
            str3 = Long.valueOf(r02.A00).toString();
        }
        return new C61075JwD(r5, jwI, jw4, jVf, new C61046Jvk(str3, 6, z5), jwF, jwH, jw0, jxB, mediaGenAIDetectionMethod, juw, (Jv3) null, r26, (1iA) null, venue, audioOverlayTrack, (ClipInfo) null, r31, upcomingEventImpl, str, str4, (String) null, str5, str6, str7, str8, (String) null, (String) null, list, list2, (List) null, list3, (List) null, list4, (0eP) null, 0, z, false, z2, z3, false, z4, r13.A14, r13.A16, r13.A11, r13.A13, r13.A0w, false, r13.A10, r13.A1A);
    }

    public static final boolean A01(C61075JwD jwD) {
        C61100JxB jxB;
        if (jwD == null || (jxB = jwD.A08) == null || jxB.A00 == null) {
            return false;
        }
        return true;
    }
}
