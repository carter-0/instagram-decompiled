package X;

import java.util.List;

public final class ASB implements C312336eF {
    public final /* synthetic */ AhY A00;

    public ASB(AhY ahY) {
        this.A00 = ahY;
    }

    public final void DCT(A6V a6v, C371648yk r12) {
        AhY ahY = this.A00;
        ahY.A00 = r12;
        List list = ahY.A09;
        0eP A0I = AnonymousClass7TH.A0I();
        0eP A0J = AnonymousClass7TH.A0J(AnonymousClass05K.A1F);
        String str = a6v.A02;
        0eP A1L = AnonymousClass7TE.A1L("text", str);
        0eP A1L2 = AnonymousClass7TE.A1L("userEdited", Boolean.valueOf(a6v.A03));
        0eP A1L3 = AnonymousClass7TE.A1L("inputTypeHint", a6v.A01);
        int length = str.length();
        int i = a6v.A00;
        if (i < 0 || i > length) {
            i = length;
        }
        AnonymousClass7TH.A0f(list, new 0eP[]{A0I, A0J, A1L, A1L2, A1L3, AnonymousClass7TE.A1L("cursorStartIndex", Integer.valueOf(i))});
    }
}
