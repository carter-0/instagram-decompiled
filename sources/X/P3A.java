package X;

import java.util.List;

public final class P3A implements C74451Pv6 {
    public final /* synthetic */ C68482NJz A00;

    public P3A(C68482NJz nJz) {
        this.A00 = nJz;
    }

    public final void Doi(List list, String str) {
        String str2;
        C68482NJz nJz = this.A00;
        OO7 oo7 = nJz.A0C;
        if (oo7 == null) {
            str2 = "gifItemController";
        } else {
            oo7.A03(list);
            OO7 oo72 = nJz.A0D;
            if (oo72 == null) {
                str2 = "stickerItemController";
            } else {
                C68482NJz.A01(nJz, oo72.A05(), list.isEmpty());
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onFail(C268654dm r4) {
        String str;
        C68482NJz nJz = this.A00;
        OO7 oo7 = nJz.A0D;
        if (oo7 == null) {
            str = "stickerItemController";
        } else {
            boolean A05 = oo7.A05();
            OO7 oo72 = nJz.A0C;
            if (oo72 == null) {
                str = "gifItemController";
            } else {
                C68482NJz.A01(nJz, A05, oo72.A05());
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStart() {
        OO7 oo7 = this.A00.A0C;
        if (oo7 == null) {
            0qQ.A0F("gifItemController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            oo7.A00();
        }
    }
}
