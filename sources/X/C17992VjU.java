package X;

import android.util.Pair;
import com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig;

/* renamed from: X.VjU  reason: case insensitive filesystem */
public final class C17992VjU {
    public final 05G A00;
    public final AnonymousClass0Ud A01;
    public final AnonymousClass0Ud A02;
    public final 05G A03;

    public final void A01(Pair pair, Pair pair2, Integer num) {
        A00(pair, pair2, (VideoBroadcastVideoStreamingConfig) null, (Double) null, num, (Integer) null, (Long) null, (String) null);
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.Object, X.Vug] */
    public final void A00(Pair pair, Pair pair2, VideoBroadcastVideoStreamingConfig videoBroadcastVideoStreamingConfig, Double d, Integer num, Integer num2, Long l, String str) {
        double d2;
        long j;
        int i;
        String str2 = str;
        Integer num3 = num;
        Pair pair3 = pair2;
        Pair pair4 = pair;
        05G r21 = this.A03;
        C18589Vug vug = (C18589Vug) r21.getValue();
        if (pair == null) {
            pair4 = vug.A04;
        }
        if (pair2 == null) {
            pair3 = vug.A06;
        }
        Pair pair5 = vug.A07;
        Pair pair6 = vug.A05;
        double d3 = vug.A01;
        if (d != null) {
            d2 = d.doubleValue();
        } else {
            d2 = vug.A00;
        }
        if (num == null) {
            num3 = vug.A0A;
        }
        Integer num4 = vug.A09;
        Integer num5 = vug.A08;
        if (str == null) {
            str2 = vug.A0B;
        }
        String str3 = vug.A0E;
        if (l != null) {
            j = l.longValue();
        } else {
            j = vug.A03;
        }
        String str4 = vug.A0D;
        String str5 = vug.A0C;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = vug.A02;
        }
        String str6 = vug.A0F;
        String str7 = vug.A0G;
        ? obj = new Object();
        obj.A04 = pair4;
        obj.A06 = pair3;
        obj.A07 = pair5;
        obj.A05 = pair6;
        obj.A01 = d3;
        obj.A00 = d2;
        obj.A0A = num3;
        obj.A09 = num4;
        obj.A08 = num5;
        obj.A0B = str2;
        obj.A0E = str3;
        obj.A03 = j;
        obj.A0D = str4;
        obj.A0C = str5;
        obj.A02 = i;
        obj.A0F = str6;
        obj.A0G = str7;
        VideoBroadcastVideoStreamingConfig videoBroadcastVideoStreamingConfig2 = videoBroadcastVideoStreamingConfig;
        if (videoBroadcastVideoStreamingConfig != null) {
            obj.A07 = Pxf.A0K(Integer.valueOf(videoBroadcastVideoStreamingConfig2.width), videoBroadcastVideoStreamingConfig2.height);
            obj.A09 = Integer.valueOf(videoBroadcastVideoStreamingConfig2.frameRate);
            obj.A01 = ((double) videoBroadcastVideoStreamingConfig2.bitRate) / 1000.0d;
        }
        r21.Epw(obj);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Vug] */
    public C17992VjU() {
        02z A10 = C51970G9q.A10(false);
        this.A00 = A10;
        this.A02 = 10b.A03(A10);
        ? obj = new Object();
        obj.A04 = null;
        obj.A06 = null;
        obj.A07 = null;
        obj.A05 = null;
        obj.A01 = -1.0d;
        obj.A00 = -1.0d;
        obj.A0A = null;
        obj.A09 = null;
        obj.A08 = null;
        obj.A0B = null;
        obj.A0E = null;
        obj.A03 = 0;
        obj.A0D = null;
        obj.A0C = null;
        obj.A02 = -1;
        obj.A0F = null;
        obj.A0G = null;
        02z r0 = new 02z(obj);
        this.A03 = r0;
        this.A01 = 10b.A03(r0);
    }
}
