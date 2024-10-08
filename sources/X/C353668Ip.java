package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;

/* renamed from: X.8Ip  reason: invalid class name and case insensitive filesystem */
public final class C353668Ip implements AnonymousClass0lh {
    public final 0xa A00;
    public final HashMap A01 = new HashMap();

    public C353668Ip(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0xa A03 = 1Al.A01(userSession).A03(1An.A3Z);
        this.A00 = A03;
        long j = A03.getLong("last_clear_cache_time", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j > 604800000) {
            0xY AR4 = this.A00.AR4();
            AR4.AHM();
            AR4.apply();
            0xY AR42 = A03.AR4();
            AR42.E5c("last_clear_cache_time", currentTimeMillis);
            AR42.apply();
        }
    }

    public final C39748A7o A00(String str) {
        HashMap hashMap = this.A01;
        if (hashMap.containsKey(str)) {
            return (C39748A7o) hashMap.get(str);
        }
        try {
            String string = this.A00.getString(str, "not_found");
            if (!"not_found".equals(string)) {
                return A0V.parseFromJson(16P.A00(string));
            }
            return null;
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error parsing json parameters ");
            sb.append(e);
            0wb.A03("VideoSummarizerDataStore", sb.toString());
            return null;
        }
    }

    public final void A01(C39748A7o a7o) {
        this.A01.put(a7o.A01, a7o);
        try {
            0xY AR4 = this.A00.AR4();
            String str = a7o.A01;
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            A0A.A0c();
            A0A.A0R("file_path", a7o.A01);
            A0A.A0P("highest_rating_time_stamp", a7o.A00);
            16P.A03(A0A, "keyframe_indexes");
            for (Number number : a7o.A03) {
                if (number != null) {
                    A0A.A0g(number.intValue());
                }
            }
            A0A.A0Y();
            16P.A03(A0A, "frame_indices");
            for (Number number2 : a7o.A02) {
                if (number2 != null) {
                    A0A.A0g(number2.intValue());
                }
            }
            A0A.A0Y();
            16P.A03(A0A, "timestampsUs");
            for (Number number3 : a7o.A05) {
                if (number3 != null) {
                    A0A.A0h(number3.longValue());
                }
            }
            A0A.A0Y();
            16P.A03(A0A, "ratings");
            for (Number number4 : a7o.A04) {
                if (number4 != null) {
                    A0A.A0f(number4.floatValue());
                }
            }
            A0A.A0Y();
            A0A.A0Z();
            A0A.close();
            AR4.E5g(str, stringWriter.toString());
            AR4.apply();
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error setting json parameters ");
            sb.append(e);
            0wb.A03("VideoSummarizerDataStore", sb.toString());
        }
    }

    public final void onSessionWillEnd() {
        0xY AR4 = this.A00.AR4();
        AR4.AHM();
        AR4.apply();
    }
}
