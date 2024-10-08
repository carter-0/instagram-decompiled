package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.SwU  reason: case insensitive filesystem */
public final class C12533SwU implements C256823wP {
    public final /* synthetic */ boolean A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public C12533SwU(boolean z, boolean z2, boolean z3) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
    }

    public final List Ave(String str, boolean z, boolean z2) {
        C256823wP r0 = C256823wP.A00;
        r0.getClass();
        ArrayList A1D = AnonymousClass7TE.A1D(r0.Ave(str, z, z2));
        AnonymousClass5OX.A00(str, A1D, this.A00);
        if ("video/av01".equals(str) || this.A01) {
            Collections.sort(A1D, new C13104TLn(this, str));
            27B.A01("MediaCodecSelectorHelper", "%s dec order (sw first) %s", new Object[]{str, A1D});
        }
        return A1D;
    }
}
