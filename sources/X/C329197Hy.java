package X;

import android.content.Context;

/* renamed from: X.7Hy  reason: invalid class name and case insensitive filesystem */
public final class C329197Hy implements C329207Hz {
    public final /* synthetic */ C329067Hl A00;

    public C329197Hy(C329067Hl r1) {
        this.A00 = r1;
    }

    public final void CxP(C317966o8 r5) {
        C329067Hl r3 = this.A00;
        AnonymousClass37D A01 = AnonymousClass7ON.A01(r3.A1R, r3.A1Z);
        if (A01 != null) {
            A01.A0B();
        }
        String A002 = HZX.A00();
        Integer num = AnonymousClass05K.A0u;
        C254933tI A04 = C329067Hl.A04(r3);
        C329067Hl.A0P(A04, r3, num, A002);
        OZO ozo = r3.A0s;
        if (ozo != null && ozo.A02()) {
            O02.A00(ozo.A01, false, false);
        }
        boolean isEmpty = r5.A0a.isEmpty();
        C331697Sa r1 = r3.A1i;
        if (isEmpty) {
            r1.A04(r5, C69319NjK.DIRECT_COMPOSER_STICKER_BUTTON);
        } else {
            r1.A05(r5, C69319NjK.DIRECT_COMPOSER_STICKER_BUTTON, A04);
        }
        r3.A1F(0.0f);
        C329067Hl.A0j(r3, true);
    }

    public final void DMN(C69319NjK njK, C68137N2b n2b) {
        C329067Hl r3 = this.A00;
        AnonymousClass37D A01 = AnonymousClass7ON.A01(r3.A1R, r3.A1Z);
        if (A01 != null) {
            A01.A0B();
        }
        String A002 = HZX.A00();
        Integer num = AnonymousClass05K.A0j;
        C68137N2b n2b2 = n2b;
        if (n2b.A00.A06) {
            num = AnonymousClass05K.A0u;
        }
        C254933tI A04 = C329067Hl.A04(r3);
        C329067Hl.A0P(A04, r3, num, A002);
        OZO ozo = r3.A0s;
        if (ozo != null && ozo.A02()) {
            O02.A00(ozo.A01, false, false);
        }
        C331697Sa r1 = r3.A1i;
        if (njK != C69319NjK.MESSAGE_LONG_PRESS_ADD_STICKER) {
            AnonymousClass9H7 r2 = r1.A00;
            if (AnonymousClass9H7.A01(r2).A0X(A002, "DirectThreadFragment.sendGifOrStickerMessage")) {
                AnonymousClass7L9 A0K = AnonymousClass9H7.A01(r2).A0K();
                Context context = r2.A02;
                if (context == null) {
                    0qQ.A0F("context");
                    throw AnonymousClass00P.createAndThrow();
                }
                C58802Ixn ixn = new C58802Ixn(A0K, context, A04, n2b2, r2.A10, A002, 2);
                AnonymousClass7UF r22 = A0K.A01;
                r22.A00();
                ixn.invoke(A0K.A06.invoke());
                r22.A01((C254933tI) null, (Integer) null, 100);
            }
        }
        r3.A1F(0.0f);
        C329067Hl.A0j(r3, true);
    }
}
