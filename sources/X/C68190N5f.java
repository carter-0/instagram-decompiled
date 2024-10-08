package X;

import com.instagram.rtc.statemodel.RtcSettingsParticipant;

/* renamed from: X.N5f  reason: case insensitive filesystem */
public final class C68190N5f extends AnonymousClass0T0 implements C232262tL {
    public final RtcSettingsParticipant A00;
    public final 0sP A01;

    public C68190N5f(RtcSettingsParticipant rtcSettingsParticipant, 0sP r3) {
        0qQ.A0B(rtcSettingsParticipant, 1);
        this.A00 = rtcSettingsParticipant;
        this.A01 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68190N5f) {
                C68190N5f n5f = (C68190N5f) obj;
                if (!0qQ.A0K(this.A00, n5f.A00) || !0qQ.A0K(this.A01, n5f.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A04;
    }

    public final int hashCode() {
        return G9w.A01(AnonymousClass7TE.A0K(this.A00)) + AnonymousClass7TG.A0C(this.A01);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C68190N5f n5f = (C68190N5f) obj;
        0qQ.A0B(n5f, 0);
        if (n5f.equals(this) || 0qQ.A0K(n5f.A00, this.A00)) {
            return true;
        }
        return false;
    }
}
