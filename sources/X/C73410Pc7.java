package X;

import com.instagram.model.rtc.RtcCallFunnelSessionId;
import com.instagram.model.rtc.RtcCallKey;

/* renamed from: X.Pc7  reason: case insensitive filesystem */
public final class C73410Pc7 implements Runnable {
    public final /* synthetic */ RtcCallKey A00;
    public final /* synthetic */ C68160N3a A01;
    public final /* synthetic */ C68160N3a A02;
    public final /* synthetic */ C72192OyC A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C73410Pc7(RtcCallKey rtcCallKey, C68160N3a n3a, C68160N3a n3a2, C72192OyC oyC, String str, String str2, String str3) {
        this.A03 = oyC;
        this.A02 = n3a;
        this.A06 = str;
        this.A04 = str2;
        this.A00 = rtcCallKey;
        this.A05 = str3;
        this.A01 = n3a2;
    }

    public final void run() {
        C72192OyC oyC = this.A03;
        C68160N3a n3a = this.A02;
        String str = n3a.A08;
        String str2 = this.A06;
        String str3 = this.A04;
        C69277Nid nid = n3a.A02;
        C69278Nie nie = n3a.A03.A02;
        boolean z = n3a.A0A;
        String str4 = n3a.A05;
        oyC.A04(nid, nie, (RtcCallFunnelSessionId) null, this.A00, str, str2, str3, str4, "wearable_audio_call", this.A05, AnonymousClass7TE.A1I(DbS.A0V(this.A01.A05)), z, true, !n3a.A09);
    }
}
