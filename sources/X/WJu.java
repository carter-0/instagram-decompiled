package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class WJu implements AnonymousClass2TS {
    public final AnonymousClass6S4 A00;
    public final C276594ta A01;
    public final C276544tV A02;
    public final C276544tV A03;
    public final C307436Qc A04;
    public final List A05;
    public final Map A06;
    public final AtomicBoolean A07;

    public final /* synthetic */ AnonymousClass2Ta AEz(C244943c0 r2, long j) {
        return C308016Sj.A00(r2, this, j);
    }

    public final AnonymousClass2Ta AEy(C244943c0 r2, int i, int i2) {
        AnonymousClass2Ta AEy = ((C276544tV) ((AnonymousClass6SH) this.A01.A00()).A00).AEy(r2, i, i2);
        0qQ.A07(AEy);
        return AEy;
    }

    public WJu(AnonymousClass6S4 r3, C276544tV r4, C307436Qc r5, List list, 0eP r7) {
        C276544tV r0;
        Map A0E;
        C17334VRn vRn;
        this.A00 = r3;
        this.A02 = r4;
        this.A04 = r5;
        this.A05 = r7 != null ? 00k.A0S(list, ((C17334VRn) r7.A01).A00) : list;
        if (r7 != null) {
            r0 = (C276544tV) r7.A00;
        } else {
            r0 = null;
        }
        this.A03 = r0;
        if (r7 == null || (vRn = (C17334VRn) r7.A01) == null) {
            A0E = 0Yt.A0E();
        } else {
            A0E = vRn.A01;
        }
        this.A06 = A0E;
        this.A07 = JTQ.A0k();
        this.A01 = new C276594ta(new C19208WPo(this));
    }
}
