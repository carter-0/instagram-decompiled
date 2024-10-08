package X;

import android.os.SystemClock;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4OW  reason: invalid class name */
public final class AnonymousClass4OW implements AnonymousClass4OX {
    public final AnonymousClass4OV A00;
    public final C58840Ae A01;

    public final void EGw(List list, long j, long j2) {
        String str;
        0bb r4;
        C263974Ob r1;
        0qQ.A0B(list, 0);
        AnonymousClass4OV r8 = this.A00;
        0wc r3 = this.A01;
        if (!list.isEmpty()) {
            String A012 = r8.A01.A01(r8.A00, j);
            AnonymousClass4NO.A00(r3, r8.A00, r8.A02, "client_compound_event_on_send", A012);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C264134Os r5 = (C264134Os) it.next();
                if (r5 != null) {
                    String str2 = r5.A0A;
                    r4 = new 0bb();
                    r4.A05("client_time_ms", Long.valueOf(r5.A00));
                    r4.A06(TraceFieldType.AdhocEventName, str2);
                    r4.A05("media_time_ms", Long.valueOf(r5.A02));
                    if (str2 == "paused" || str2 == "completed" || str2 == "started_playing" || str2 == "reset") {
                        r4.A05("video_client_duration", Long.valueOf(r5.A01));
                    }
                    if (str2 == "completed" || str2 == "started_playing") {
                        r4.A03("is_looping", Boolean.valueOf(r5.A0E));
                    }
                    Long l = r5.A08;
                    if (l != null) {
                        r4.A05("player_instance_id", l);
                    }
                    String str3 = r5.A0B;
                    if (str3 != null) {
                        r4.A06("player_instance_key", str3);
                    }
                    if (str2 == "tags_changed" && (r1 = r5.A04) != null) {
                        r4.A02(r1, "tag_metadata");
                    }
                    r4.A06("session_validation_token", r5.A0C);
                    String str4 = r5.A0D;
                    if (str4 != null) {
                        r4.A06("start_state", str4);
                    }
                    String str5 = r5.A09;
                    if (str5 != null) {
                        r4.A06("callsite_context", str5);
                    }
                    C290425fI r12 = r5.A03;
                    if (r12 != null) {
                        r4.A02(r12, "error_metadata");
                    }
                    Boolean bool = r5.A05;
                    if (bool != null) {
                        r4.A03("is_audio_stalling", bool);
                    }
                    Boolean bool2 = r5.A06;
                    if (bool2 != null) {
                        r4.A03("is_stalling", bool2);
                    }
                    Long l2 = r5.A07;
                    if (l2 != null) {
                        r4.A05("buffer_end_to_live_head_delta_ms", l2);
                    }
                } else {
                    r4 = null;
                }
                arrayList.add(r4);
            }
            AnonymousClass4OR r52 = r8.A00;
            AnonymousClass3L3 r0 = r8.A03;
            if (r0 == null || (str = r0.Ara()) == null) {
                str = "";
            }
            0wc r32 = r3;
            0kJ r42 = r32.A00;
            0Aj A002 = r32.A00(r42, "media_playback_compound");
            0bb r11 = new 0bb();
            r11.A06("correlation_id", str);
            if (A002.isSampled() && r52 != null) {
                A002.AAK(r52, "required_metadata");
                A002.AAe("events", arrayList);
                0bb r10 = new 0bb();
                r10.A05("sequence", 1L);
                A002.AAK(r10, "operational_metadata");
                A002.AAK(r11, "dsp_correlation_metadata");
                A002.A9F("client_high_res_packaging_time_ms", Long.valueOf(SystemClock.elapsedRealtime()));
                A002.Cgf();
            }
            if (r8.A02.A0A) {
                0Aj A003 = r32.A00(r42, "media_playback_compound_fast");
                0bb r33 = new 0bb();
                r33.A06("correlation_id", str);
                if (A003.isSampled() && r52 != null) {
                    A003.AAK(r52, "required_metadata");
                    A003.AAe("events", arrayList);
                    0bb r2 = new 0bb();
                    r2.A05("sequence", 1L);
                    A003.AAK(r2, "operational_metadata");
                    A003.AAK(r33, "dsp_correlation_metadata");
                    A003.A9F("client_high_res_packaging_time_ms", Long.valueOf(SystemClock.elapsedRealtime()));
                    A003.Cgf();
                }
            }
        }
    }

    public AnonymousClass4OW(C58840Ae r1, AnonymousClass4OV r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
