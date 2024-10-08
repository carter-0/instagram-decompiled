package X;

import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: X.Vl7  reason: case insensitive filesystem */
public final class C18078Vl7 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Surface A06;
    public C20845X0w A07;
    public C20994X8r A08;
    public W2Q A09;
    public X8J A0A;
    public XBm A0B;
    public C20971X7b A0C;
    public C20971X7b A0D;
    public C20971X7b A0E;
    public C20886X2q A0F;
    public LR1 A0G;
    public ByteBuffer A0H;
    public ByteBuffer A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        if (r5.A0B.isStreaming() == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C18078Vl7 r5) {
        /*
            X.8j2 r4 = X.C363058j1.A02
            java.lang.String r3 = "EventRepository.isPostingEnabled = isLive:"
            boolean r2 = r5.A0J
            java.lang.String r1 = " && isActive:"
            X.XBm r0 = r5.A0B
            boolean r0 = r0.isStreaming()
            java.lang.String r1 = X.002.A1C(r3, r1, r2, r0)
            java.lang.String r0 = "sup:LiveMediaStreamController"
            r4.A01(r0, r1)
            X.LR1 r0 = r5.A0G
            if (r0 == 0) goto L_0x002b
            boolean r0 = r5.A0J
            if (r0 == 0) goto L_0x0028
            X.XBm r0 = r5.A0B
            boolean r1 = r0.isStreaming()
            r0 = 1
            if (r1 != 0) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            X.LR1.A04 = r0
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18078Vl7.A00(X.Vl7):void");
    }

    public final void A01() {
        XBm xBm = this.A0B;
        if (xBm.CVQ()) {
            C363058j1.A02.A01("sup:LiveMediaStreamController", "Already initialized, returning");
            return;
        }
        xBm.EqB(this.A0E);
        xBm.EPA(this.A0C);
        xBm.Elv(this.A0F);
        xBm.EfY(this.A0A);
        xBm.EVb(this.A0G);
        xBm.Elu(this.A07);
        xBm.CMP();
        A05(new UUj(this, 0), "sup:LiveMediaStreamController_UPDATE_EVENT_REPOSITORY_ID");
    }

    public final void A02() {
        this.A0B.stop(false);
        this.A01 = 0;
        this.A03 = 0;
        this.A02 = 0;
    }

    public final void A03(int i) {
        int i2 = this.A00;
        if (i2 != i) {
            this.A00 = i;
            A00(this);
            this.A0B.DZp(i2, i);
        }
    }

    public final void A04(Surface surface) {
        this.A06 = surface;
        C363058j1.A02.A01("sup:LiveMediaStreamController", "Configuring new surface");
        this.A0B.AJ8(surface);
    }

    public final void A05(C16746V4d v4d, String str) {
        XBm xBm = this.A0B;
        xBm.BQu().put(str, v4d);
        if (xBm.Awr().get()) {
            v4d.A03();
        }
    }

    public final void A06(C391639tP r3) {
        XBm xBm = this.A0B;
        if (xBm.CVQ()) {
            xBm.CIo(r3);
        }
    }

    public final void A07(String str) {
        this.A0B.BQu().remove(str);
    }

    public final void A08(boolean z) {
        this.A0J = z;
        A00(this);
        XBm xBm = this.A0B;
        if (z) {
            xBm.DCJ();
            return;
        }
        xBm.DDN();
        xBm.stop(true);
    }
}
