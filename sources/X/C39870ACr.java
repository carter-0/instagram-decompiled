package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ACr  reason: case insensitive filesystem */
public final class C39870ACr {
    public final String A00 = AnonymousClass7TF.A0c();

    public static final AnonymousClass9g8 A00(C40161AUb aUb, boolean z) {
        Object A13;
        C343697qe Ape = aUb.A00.Ape(C345777u4.A00);
        0qQ.A07(Ape);
        List Blz = ((C345777u4) Ape).Blz();
        0qQ.A07(Blz);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : Blz) {
            if (next instanceof AnonymousClass9g8) {
                A1C.add(next);
            }
        }
        if (A1C.isEmpty()) {
            return null;
        }
        if (A1C.size() == 1 || z) {
            A13 = AnonymousClass7TE.A13(A1C);
        } else {
            A13 = A1C.get(1);
        }
        0qQ.A0C(A13, "null cannot be cast to non-null type com.facebook.videocodec.effects.renderers.touchuprenderer.iglu.IgluColorFilterRenderer");
        return (AnonymousClass9g8) A13;
    }
}
