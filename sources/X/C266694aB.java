package X;

import com.facebook.location.platform.api.Location;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.4aB  reason: invalid class name and case insensitive filesystem */
public final class C266694aB {
    public final String A00(List list) {
        int i;
        String str;
        Number number;
        String str2;
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A0A.A0c();
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        A0A.A0P(AnonymousClass000.A00(3681), i);
        A0A.A0q("clips_segments");
        A0A.A0b();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C266684aA r4 = (C266684aA) it.next();
                A0A.A0c();
                A0A.A0P("index", r4.A02);
                A0A.A0R("face_effect_id", r4.A0B);
                A0A.A0P(Location.SPEED, r4.A03);
                String str3 = r4.A0H;
                String str4 = r4.A0E;
                if (0qQ.A0K(str3, "54") && (str4 == null || 00l.A0W(str4))) {
                    str3 = "4";
                }
                A0A.A0R("source_type", str3);
                A0A.A0P("duration_ms", r4.A01);
                A0A.A0R("audio_type", r4.A0A);
                if (r4.A0K) {
                    str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                } else {
                    str = "0";
                }
                A0A.A0R("from_draft", str);
                A0A.A0P("camera_position", r4.A00);
                A0A.A0R("media_folder", r4.A0D);
                A0A.A0R("media_type", MediaStreamTrack.VIDEO_TRACK_KIND);
                A0A.A0P("original_media_type", r4.A06.A00);
                A0A.A0R("original_segment_hash", r4.A0F);
                A0A.A0S("is_remix", r4.A0M);
                AnonymousClass9JE r1 = r4.A05;
                String str5 = null;
                if (r1 != null) {
                    str5 = r1.A03;
                }
                if (str5 != null) {
                    if (r1 == null || (str2 = r1.A03) == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    A0A.A0R("source_media_group_id", str2);
                }
                AnonymousClass9JE r0 = r4.A05;
                if (!(r0 == null || (number = (Number) r0.A01) == null)) {
                    A0A.A0Q("source_media_id", number.longValue());
                    A0A.A0P("trimmed_start_time_ms", r4.A04);
                }
                String str6 = r4.A0E;
                if (str6 != null && !00l.A0W(str6)) {
                    A0A.A0R("metagallery_media_id", r4.A0E);
                }
                A0A.A0S("has_reusable_template_asset", r4.A0J);
                Integer num = r4.A09;
                if (num != null) {
                    A0A.A0P("reusable_template_media_asset_start_time_ms", num.intValue());
                }
                Integer num2 = r4.A08;
                if (num2 != null) {
                    A0A.A0P("reusable_template_media_asset_end_time_ms", num2.intValue());
                }
                A0A.A0Z();
            }
        }
        A0A.A0Y();
        A0A.A0Z();
        A0A.close();
        String obj = stringWriter.toString();
        0qQ.A07(obj);
        return obj;
    }
}
