package X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.Random;

public final class LRP {
    public static final C61410nE A07 = C61410nE.A00;
    public static final Random A08 = new Random();
    public long A00;
    public Integer A01 = AnonymousClass05K.A00;
    public final UserSession A02;
    public final String A03;
    public final Context A04;
    public final AnonymousClass0iw A05;
    public volatile String A06;

    public LRP(Context context, AnonymousClass0iw r3, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A05 = r3;
        this.A04 = context;
        this.A03 = C61120lW.A04(context);
    }

    public final void A01(Integer num) {
        String str;
        0qQ.A0B(num, 0);
        Integer num2 = this.A01;
        if (num2 == AnonymousClass05K.A0N || num2 == AnonymousClass05K.A0u) {
            0xF r3 = new 0xF();
            int intValue = num.intValue();
            if (intValue == 0) {
                str = "rtmp";
            } else if (intValue != 2) {
                str = "";
            } else {
                str = "rtc";
            }
            0xF.A00(r3, str, "t");
            this.A01 = AnonymousClass05K.A0j;
            A00(r3, this, "SESSION_END", "INFO", "BROADCASTER");
        }
    }

    public final void A02(Integer num) {
        String str;
        0xF r2;
        String str2;
        0qQ.A0B(num, 0);
        if (this.A01 == AnonymousClass05K.A01 && this.A06 != null) {
            long j = this.A00;
            if (j < 0) {
                this.A01 = AnonymousClass05K.A0C;
                r2 = null;
                str2 = "BEGIN";
            } else {
                long A072 = C51966G9m.A07(j);
                r2 = new 0xF();
                0xF.A00(r2, 002.A0Q("", A072), "dur");
                this.A01 = AnonymousClass05K.A0Y;
                this.A00 = -1;
                str2 = "RESUME";
            }
            A00(r2, this, str2, "INFO", "BROADCASTER");
        }
        0xF r3 = new 0xF();
        int intValue = num.intValue();
        if (intValue == 0) {
            str = "rtmp";
        } else if (intValue != 2) {
            str = "";
        } else {
            str = "rtc";
        }
        0xF.A00(r3, str, "t");
        this.A01 = AnonymousClass05K.A0N;
        A00(r3, this, "SESSION_BEGIN", "INFO", "BROADCASTER");
    }

    public static final void A00(0xF r5, LRP lrp, String str, String str2, String str3) {
        0xI A002 = 0xI.A00(lrp.A05, "facecast_trace_id_embedded");
        String str4 = lrp.A06;
        if (str4 != null) {
            A002.A0C("stream_id", str4);
        }
        Integer A0k = C51967G9n.A0k();
        A002.A08(A0k, TraceFieldType.StreamType);
        A002.A08(A0k, "trace_id");
        A002.A0C("source", str3);
        A002.A0A("event_id", Double.valueOf(((double) A08.nextLong()) - -9.223372036854776E18d));
        A002.A0B("event_creation_time", C51968G9o.A0u());
        A002.A0C(AnonymousClass000.A00(1318), str2);
        A002.A0C(TraceFieldType.AdhocEventName, str);
        A002.A0C("parent_source", "");
        if (r5 != null) {
            A002.A05(r5, "metadata");
        }
        DbU.A1R(A002, lrp.A02);
    }
}
