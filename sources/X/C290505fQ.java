package X;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.util.Util;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Map;

/* renamed from: X.5fQ  reason: invalid class name and case insensitive filesystem */
public final class C290505fQ implements C265994Xd {
    public long A00 = -9223372036854775807L;
    public final AnonymousClass4PO A01 = new Object();
    public final AnonymousClass4QS A02 = new AnonymousClass4PQ(1);
    public final C265984Xc A03;
    public final /* synthetic */ AnonymousClass4TL A04;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.4PO, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.4PQ, X.4QS] */
    public C290505fQ(AnonymousClass4TL r3, AnonymousClass4QW r4) {
        this.A04 = r3;
        this.A03 = new C265984Xc((C265184Sw) null, (C265114Sp) null, r4);
    }

    public final boolean A00(long j) {
        AnonymousClass4TL r8 = this.A04;
        C256633w6 r1 = r8.A00;
        if (!r1.A0R) {
            return false;
        }
        if (r8.A02) {
            return true;
        }
        Map.Entry ceilingEntry = r8.A08.ceilingEntry(Long.valueOf(r1.A0C));
        if (ceilingEntry == null || ((Number) ceilingEntry.getValue()).longValue() >= j) {
            return false;
        }
        long longValue = ((Number) ceilingEntry.getKey()).longValue();
        C265144Ss r7 = ((C265204Sy) r8.A06).A00;
        long j2 = r7.A03;
        if (j2 == -9223372036854775807L || j2 < longValue) {
            r7.A03 = longValue;
        }
        AnonymousClass4TL.A00(r8, "publish_time_expired");
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r3 >= r6.A04) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(X.C266194Xx r6, boolean r7) {
        /*
            r5 = this;
            long r3 = r5.A00
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0012
            long r1 = r6.A04
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 1
            if (r0 < 0) goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            X.4TL r1 = r5.A04
            X.3w6 r0 = r1.A00
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x002a
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0028
            if (r2 != 0) goto L_0x0023
            if (r7 == 0) goto L_0x002a
        L_0x0023:
            java.lang.String r0 = "forward_seek_forced"
            X.AnonymousClass4TL.A00(r1, r0)
        L_0x0028:
            r0 = 1
            return r0
        L_0x002a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C290505fQ.A01(X.4Xx, boolean):boolean");
    }

    public final void AWP(C256683wB r2) {
        this.A03.AWP(r2);
    }

    public final void EJh(AnonymousClass4XV r2, int i) {
        this.A03.EJh(r2, i);
    }

    public final void EJi(AnonymousClass4XV r2, int i, int i2) {
        this.A03.EJh(r2, i);
    }

    public final int EJl(C257123wt r3, int i, int i2, boolean z) {
        return this.A03.EJl(r3, i, 0, z);
    }

    public final void EJn(C266034Xh r16, int i, int i2, int i3, long j) {
        long j2;
        byte[] bArr;
        C265984Xc r8 = this.A03;
        r8.EJn(r16, i, i2, i3, j);
        while (r8.A0E(false)) {
            AnonymousClass4QS r3 = this.A02;
            r3.clear();
            if (r8.A04(this.A01, r3, 0, false) == -4) {
                r3.A00();
                long j3 = r3.A01;
                AnonymousClass4TL r7 = this.A04;
                Metadata ANb = r7.A05.ANb(r3);
                if (ANb != null) {
                    EventMessage eventMessage = (EventMessage) ANb.A01[0];
                    String str = eventMessage.A03;
                    String str2 = eventMessage.A04;
                    if ("urn:mpeg:dash:event:2012".equals(str) && (RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            long A0A = Util.A0A(new String(eventMessage.A05, AnonymousClass2RN.A05));
                            if (A0A != -9223372036854775807L) {
                                C21396Xa4 xa4 = new C21396Xa4(j3, A0A);
                                Handler handler = r7.A04;
                                handler.sendMessage(handler.obtainMessage(1, xa4));
                            }
                        } catch (C2609347p unused) {
                        }
                    } else if ("livedash:trace:f0e6005d-acc5-4de5-b754-00301ef34c80".equals(str)) {
                        Uri uri = r8.A09;
                        if (eventMessage.A02 == 1 && (bArr = eventMessage.A05) != null) {
                            String str3 = new String(bArr);
                            Handler handler2 = r7.A04;
                            handler2.sendMessage(handler2.obtainMessage(1001, new C21395Xa3(str3, uri)));
                        }
                    } else if (!str.contains("urn:fb:metadata")) {
                        Handler handler3 = r7.A04;
                        handler3.sendMessage(handler3.obtainMessage(1004, new Object[]{eventMessage.A05, eventMessage.A03, Long.valueOf(eventMessage.A02)}));
                    }
                }
            }
        }
        C266004Xe r2 = r8.A0T;
        synchronized (r8) {
            int i4 = r8.A03;
            if (i4 == 0) {
                j2 = -1;
            } else {
                j2 = C265984Xc.A01(r8, i4);
            }
        }
        r2.A05(j2);
    }

    public final void FMe(Uri uri) {
        this.A03.A09 = uri;
    }
}
