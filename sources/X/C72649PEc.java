package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;

/* renamed from: X.PEc  reason: case insensitive filesystem */
public final class C72649PEc implements C74416PuW {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C72649PEc(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void D84() {
        switch (this.A00) {
            case 0:
                C67254Mko mko = (C67254Mko) this.A02;
                AnonymousClass7VU A002 = AnonymousClass7VT.A00(mko.A00);
                C254743sy r3 = (C254743sy) this.A01;
                A002.A03((MsysThreadId) r3, new C74185PqR(19, (Object) r3, (Object) mko));
                return;
            case 1:
                C67254Mko mko2 = (C67254Mko) this.A02;
                C67098MiI miI = mko2.A01;
                DirectMsysMixedThreadKey directMsysMixedThreadKey = (DirectMsysMixedThreadKey) ((C254743sy) this.A01);
                miI.AOc(directMsysMixedThreadKey.A00);
                mko2.A02.AOc(directMsysMixedThreadKey.A01);
                return;
            case 2:
                DirectThreadKey directThreadKey = (DirectThreadKey) this.A01;
                if (directThreadKey.A00 != null) {
                    C67098MiI miI2 = (C67098MiI) this.A02;
                    C67098MiI.A00(miI2, directThreadKey, true);
                    miI2.A03.A03(directThreadKey, AnonymousClass05K.A0Y);
                    return;
                }
                return;
            case 3:
                ((C67249Mkj) this.A02).AOc((C254743sy) this.A01);
                return;
            default:
                ((C68966Nbt) this.A02).A05((C254743sy) this.A01, false);
                return;
        }
    }

    public final void onDismiss() {
        if (2 - this.A00 == 0) {
            C67098MiI.A00((C67098MiI) this.A02, (DirectThreadKey) this.A01, false);
        }
    }
}
