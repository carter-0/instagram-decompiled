package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.7GQ  reason: invalid class name */
public final class AnonymousClass7GQ extends Handler {
    public long A00 = -1;
    public long A01 = -1;
    public long A02 = -1;
    public final AnonymousClass7GP A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7GQ(Looper looper, AnonymousClass7GP r4) {
        super(looper);
        0qQ.A0B(looper, 1);
        0qQ.A0B(r4, 2);
        this.A03 = r4;
    }

    public final void handleMessage(Message message) {
        0qQ.A0B(message, 0);
        if (message.what == 1) {
            AnonymousClass7GP r8 = this.A03;
            long j = this.A02;
            long j2 = this.A00;
            0wc r6 = r8.A00;
            0Aj A002 = r6.A00(r6.A00, "audio_clips_playback_scrub");
            if (A002.isSampled()) {
                A002.A9F("position", Long.valueOf(j));
                A002.A9F(TraceFieldType.Duration, Long.valueOf(j2));
                A002.AAJ("attachment_id", (String) null);
                A002.A7p("has_access_token", false);
                A002.Cgf();
            }
            r8.A00((C69475NmJ) null, this.A01, this.A00);
            this.A02 = -1;
            this.A01 = -1;
            this.A00 = -1;
        }
    }
}
