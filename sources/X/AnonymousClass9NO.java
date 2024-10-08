package X;

import com.instagram.api.schemas.CameraTool;
import com.instagram.feed.media.CameraToolInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.9NO  reason: invalid class name */
public abstract class AnonymousClass9NO {
    public static final ArrayList A01(C357638Yz r10) {
        Float f;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator A1G = AnonymousClass7TE.A1G(r10.A07((C279284yO) r10.A08.A00).A00());
        while (A1G.hasNext()) {
            C358088aL r2 = (C358088aL) AnonymousClass7TF.A0a(A1G);
            0qQ.A0B(r2, 0);
            AnonymousClass80P r8 = r2.A00;
            if (r8 != null && C357638Yz.A03(r2, r10)) {
                C358088aL r1 = C358088aL.A0t;
                Float f2 = null;
                if (r2 != r1 || !C357638Yz.A03(r1, r10)) {
                    f = null;
                } else {
                    AnonymousClass886 r0 = (AnonymousClass886) 00k.A0O(C339947kR.A01(), r10.A04(r1));
                    if (r0 == null) {
                        r0 = AnonymousClass886.A09;
                    }
                    f = Float.valueOf(r0.A00);
                }
                C358088aL r12 = C358088aL.A0y;
                if (r2 == r12 && C357638Yz.A03(r12, r10)) {
                    f2 = Float.valueOf(((float) r10.A05(r12)) / 1000.0f);
                }
                CameraTool A00 = C2807253k.A00(Long.valueOf(r8.A00).toString());
                float f3 = 0.0f;
                Float valueOf = Float.valueOf(0.0f);
                if (f != null) {
                    f3 = f.floatValue();
                }
                A1C.add(new CameraToolInfo(A00, valueOf, Float.valueOf(f3), f2));
            }
        }
        return A1C;
    }

    public static final AnonymousClass51S A00() {
        return new AnonymousClass51S((List) null, (List) null, (Set) null, 1.0f, -1, false);
    }
}
