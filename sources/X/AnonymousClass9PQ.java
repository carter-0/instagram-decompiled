package X;

import com.facebook.location.platform.api.Location;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.9PQ  reason: invalid class name */
public abstract class AnonymousClass9PQ {
    public static final String A00(C279284yO r1) {
        0qQ.A0B(r1, 0);
        if (r1.equals(AnonymousClass80N.A00)) {
            return "reels";
        }
        if (r1.equals(AnonymousClass9QA.A00)) {
            return "stories";
        }
        if (r1.equals(C363138jC.A00)) {
            return "posts";
        }
        return null;
    }

    public static final void A03(AnonymousClass0iw r12, RemoteMedia remoteMedia, UserSession userSession, String str, String str2) {
        String str3;
        AnonymousClass0iw r5 = r12;
        UserSession userSession2 = userSession;
        String str4 = str2;
        AnonymousClass7TG.A1N(userSession, r12);
        0qQ.A0B(remoteMedia, 3);
        if (remoteMedia.A09) {
            str3 = MediaStreamTrack.VIDEO_TRACK_KIND;
        } else {
            str3 = "photo";
        }
        0eP A1L = AnonymousClass7TE.A1L("uri", remoteMedia.A04.CCJ());
        if (str2 == null) {
            str4 = "";
        }
        A07(r5, userSession2, (Long) null, (Long) null, "error_logging", str, str3, (List) null, (List) null, 0Yt.A06(AnonymousClass7TH.A0h("is_network", "non_network", A1L, AnonymousClass7TE.A1L("error_message", str4), AnonymousClass7TE.A1L("error_type", "medium_creation"))));
    }

    public static final void A04(AnonymousClass0iw r12, RemoteMedia remoteMedia, UserSession userSession, String str, String str2, List list) {
        Long valueOf;
        AnonymousClass0iw r5 = r12;
        UserSession userSession2 = userSession;
        String str3 = str2;
        AnonymousClass7TG.A1N(userSession, r12);
        0eP A1L = AnonymousClass7TE.A1L("uri", remoteMedia.A04.CCJ());
        if (str2 == null) {
            str3 = "";
        }
        LinkedHashMap A06 = 0Yt.A06(AnonymousClass7TH.A0h("is_network", "non_network", A1L, AnonymousClass7TE.A1L("error_message", str3), AnonymousClass7TE.A1L("error_type", "medium_conversion")));
        ArrayList<RemoteMedia> A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RemoteMedia remoteMedia2 = ((GalleryItem) it.next()).A04;
            if (remoteMedia2 != null) {
                A1C.add(remoteMedia2);
            }
        }
        ArrayList<Medium> A1C2 = AnonymousClass7TE.A1C();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Medium medium = ((GalleryItem) it2.next()).A00;
            if (medium != null) {
                A1C2.add(medium);
            }
        }
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        for (RemoteMedia remoteMedia3 : A1C) {
            Integer num = remoteMedia3.A05;
            if (!(num == null || (valueOf = Long.valueOf((long) num.intValue())) == null)) {
                A1C3.add(valueOf);
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A1C2);
        for (Medium medium2 : A1C2) {
            AnonymousClass7TE.A1Y(A0r, medium2.A0D);
        }
        A07(r5, userSession2, Long.valueOf((long) A1C.size()), Long.valueOf((long) A1C2.size()), "error_logging", str, A01(list), A1C3, A0r, A06);
    }

    public static final void A08(AnonymousClass0iw r5, UserSession userSession, String str, String str2, Map map) {
        A07(r5, userSession, (Long) null, (Long) null, str, str2, (String) null, (List) null, (List) null, map);
    }

    public static final void A05(AnonymousClass0iw r3, UserSession userSession, Integer num) {
        String str;
        switch (num.intValue()) {
            case 0:
                str = "tooltip_shown";
                break;
            case 1:
                str = "tooltip_nav";
                break;
            case 2:
                str = "cta_nav";
                break;
            case 3:
                str = "cloud_album_nav_success";
                break;
            default:
                str = "cloud_album_nav_failed";
                break;
        }
        A08(r3, userSession, "meta_galley_stories_netego", "stories", AnonymousClass7TF.A0w("stories_netego_subevent", str));
    }

    public static final void A06(AnonymousClass0iw r2, UserSession userSession, Integer num, String str) {
        String str2;
        switch (num.intValue()) {
            case 0:
                str2 = "impression";
                break;
            case 1:
                str2 = "dismiss";
                break;
            case 2:
                str2 = C66579MXk.A00(347);
                break;
            default:
                str2 = "accept";
                break;
        }
        A08(r2, userSession, "recents_nux_interaction", str, AnonymousClass7TF.A0w("recents_nux_interaction_type", str2));
    }

    public static final String A01(List list) {
        Iterator it = list.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            if (((GalleryItem) it.next()).A06()) {
                z2 = true;
            } else {
                z = true;
            }
        }
        if (z) {
            if (z2) {
                return "photo_and_video";
            }
            return "photo";
        } else if (z2) {
            return MediaStreamTrack.VIDEO_TRACK_KIND;
        } else {
            return null;
        }
    }

    public static final void A02(AnonymousClass0iw r13, RemoteMedia remoteMedia, UserSession userSession, Integer num, String str, List list, boolean z) {
        String A00;
        Long valueOf;
        ArrayList<RemoteMedia> A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RemoteMedia remoteMedia2 = ((GalleryItem) it.next()).A04;
            if (remoteMedia2 != null) {
                A1C.add(remoteMedia2);
            }
        }
        ArrayList<Medium> A1C2 = AnonymousClass7TE.A1C();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Medium medium = ((GalleryItem) it2.next()).A00;
            if (medium != null) {
                A1C2.add(medium);
            }
        }
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        for (RemoteMedia remoteMedia3 : A1C) {
            Integer num2 = remoteMedia3.A05;
            if (!(num2 == null || (valueOf = Long.valueOf((long) num2.intValue())) == null)) {
                A1C3.add(valueOf);
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A1C2);
        for (Medium medium2 : A1C2) {
            AnonymousClass7TE.A1Y(A0r, medium2.A0D);
        }
        String A01 = A01(list);
        String CCJ = remoteMedia.A04.CCJ();
        String A012 = A01(AnonymousClass7TE.A1I(new GalleryItem(remoteMedia)));
        Long valueOf2 = Long.valueOf((long) A1C.size());
        Long valueOf3 = Long.valueOf((long) A1C2.size());
        0eP A1L = AnonymousClass7TE.A1L("uri", CCJ);
        String A002 = AnonymousClass000.A00(3948);
        if (A012 == null) {
            A012 = "";
        }
        0eP A1L2 = AnonymousClass7TE.A1L(A002, A012);
        if (num.intValue() != 0) {
            A00 = "long";
        } else {
            A00 = AnonymousClass000.A00(369);
        }
        AnonymousClass0iw r3 = r13;
        UserSession userSession2 = userSession;
        String str2 = str;
        A07(r3, userSession2, valueOf2, valueOf3, "cloud_media_selected", str2, A01, A1C3, A0r, 0Yt.A06(AnonymousClass7TH.A0h("multiselect_enabled", String.valueOf(z), A1L, A1L2, AnonymousClass7TE.A1L("tap_type", A00))));
    }

    public static final void A07(AnonymousClass0iw r3, UserSession userSession, Long l, Long l2, String str, String str2, String str3, List list, List list2, Map map) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "ig_meta_gallery");
        if (A0e.isSampled()) {
            A0e.AAJ(TraceFieldType.AdhocEventName, str);
            A0e.AAJ("surface", str2);
            A0e.A7p("in_meta_gallery_experiment", AnonymousClass7TF.A0R(0Tu.A06, userSession, 36316662907015732L));
            A0e.AAJ("media_type", str3);
            A0e.A9H(Location.EXTRAS, map);
            A0e.A9F("num_remote_media_selected", l);
            A0e.AAe("remote_media_created_timestamps", list);
            A0e.A9F("num_system_media_selected", l2);
            A0e.AAe("system_media_created_timestamps", list2);
            A0e.Cgf();
        }
    }
}
