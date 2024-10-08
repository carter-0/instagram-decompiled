package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.WPo  reason: case insensitive filesystem */
public final class C19208WPo implements C64351Ki {
    public final /* synthetic */ WJu A00;

    public C19208WPo(WJu wJu) {
        this.A00 = wJu;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        WJu wJu = this.A00;
        AnonymousClass6S4 r8 = wJu.A00;
        C276544tV r7 = wJu.A02;
        C276544tV r6 = wJu.A03;
        Map map = wJu.A06;
        List list = wJu.A05;
        C307436Qc r2 = wJu.A04;
        0qQ.A0B(list, 4);
        AnonymousClass6SG r0 = new AnonymousClass6SG(r8, r2, new ArrayList(list), map);
        AnonymousClass6SH r22 = new AnonymousClass6SH(AnonymousClass6SF.A01(r7, r6, r0, false), r0.A03, list);
        wJu.A07.compareAndSet(false, true);
        return r22;
    }
}
