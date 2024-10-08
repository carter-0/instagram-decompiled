package X;

import com.facebook.proxygen.TraceEventType;
import java.util.List;

/* renamed from: X.GCn  reason: case insensitive filesystem */
public final class C52041GCn implements JRF {
    public String A00;
    public final C59544JNq A01;
    public final String A02;
    public final C55684Hlh A03;

    public final void Dxm(C267324bN r5, Integer num, int i) {
        String str;
        0qQ.A0B(r5, 0);
        String str2 = this.A03.A00;
        if (str2 != null && !00l.A0W(str2) && 00l.A0d(r5.getId(), str2, false) && (str = this.A00) != null && !00l.A0W(str)) {
            C59544JNq jNq = this.A01;
            String str3 = this.A02;
            Integer num2 = AnonymousClass05K.A0u;
            if (!0qQ.A0K(str3, TraceEventType.Push)) {
                num2 = AnonymousClass05K.A0j;
            }
            jNq.Cvo(r5, num2, this.A00);
            this.A00 = null;
        }
    }

    public final void Dzs() {
    }

    public C52041GCn(C59544JNq jNq, C55684Hlh hlh, String str, String str2) {
        AnonymousClass7TG.A1O(jNq, hlh);
        this.A01 = jNq;
        this.A03 = hlh;
        this.A00 = str;
        this.A02 = str2;
    }

    public final void D7O(C267324bN r1, List list) {
    }

    public final void DaP(C52078GDy gDy, boolean z) {
    }

    public final void Dxg(C267324bN r1, int i) {
    }

    public final void Dxi(C267324bN r1, int i) {
    }

    public final void DxZ(C267324bN r1, int i, int i2) {
    }

    public final void Dzr(C267324bN r1, JRO jro, boolean z) {
    }

    public final void DaS(C267324bN r1, int i, int i2, boolean z) {
    }

    public final void Dxl(C267324bN r1, C52058GDe gDe, C52019GBq gBq, C52078GDy gDy, boolean z) {
    }
}
