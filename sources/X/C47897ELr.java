package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.ELr  reason: case insensitive filesystem */
public final class C47897ELr extends AnonymousClass2xK {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C47897ELr(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final boolean Ds8(AnonymousClass5Gv r3) {
        switch (this.A00) {
            case 1:
                0qQ.A0B(r3, 0);
                ((AnonymousClass70R) this.A01).DLC((C61082JwK) null);
                return true;
            case 2:
                0qQ.A0B(r3, 0);
                FGY.A00((Context) this.A01, (FGY) this.A02);
                return true;
            default:
                return super.Ds8(r3);
        }
    }

    public final void DsH(AnonymousClass5Gv r6) {
        boolean z;
        0s0 r3;
        AnonymousClass0YZ[] r2;
        int i;
        1Av r0;
        switch (this.A00) {
            case 0:
                Integer num = AnonymousClass05K.A00;
                Object obj = this.A01;
                if (num == obj) {
                    r0 = (1Av) this.A02;
                    z = true;
                    r3 = r0.A2S;
                    r2 = 1Av.A8a;
                    i = 291;
                    break;
                } else if (AnonymousClass05K.A01 == obj) {
                    r0 = (1Av) this.A02;
                    z = true;
                    r3 = r0.A4Q;
                    r2 = 1Av.A8a;
                    i = 293;
                    break;
                } else {
                    return;
                }
            case 1:
                r0 = 1Au.A00((UserSession) this.A02);
                z = false;
                r3 = r0.A7q;
                r2 = 1Av.A8a;
                i = 213;
                break;
            default:
                FGY.A04((FGY) this.A02, "IMPRESSION");
                return;
        }
        AnonymousClass7TF.A1J(r0, r3, r2, i, z);
    }
}
