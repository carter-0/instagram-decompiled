package X;

import java.util.List;

public final class P3D implements C74453Pv8 {
    public final /* synthetic */ C68482NJz A00;

    public P3D(C68482NJz nJz) {
        this.A00 = nJz;
    }

    public final void DEF(C268654dm r4, String str) {
        String str2;
        C68482NJz nJz = this.A00;
        OO7 oo7 = nJz.A0D;
        if (oo7 == null) {
            str2 = "stickerItemController";
        } else {
            boolean A05 = oo7.A05();
            OO7 oo72 = nJz.A0C;
            if (oo72 == null) {
                str2 = "gifItemController";
            } else {
                C68482NJz.A01(nJz, A05, oo72.A05());
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DmM(String str) {
        OO7 oo7 = this.A00.A0D;
        if (oo7 == null) {
            0qQ.A0F("stickerItemController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            oo7.A00();
        }
    }

    public final void Doj(List list, List list2, String str) {
        String str2;
        C68482NJz nJz = this.A00;
        OO7 oo7 = nJz.A0D;
        if (oo7 == null) {
            str2 = "stickerItemController";
        } else {
            oo7.A03(list);
            boolean isEmpty = list.isEmpty();
            OO7 oo72 = nJz.A0C;
            if (oo72 == null) {
                str2 = "gifItemController";
            } else {
                C68482NJz.A01(nJz, isEmpty, oo72.A05());
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }
}
