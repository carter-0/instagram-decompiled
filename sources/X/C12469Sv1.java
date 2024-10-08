package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.Sv1  reason: case insensitive filesystem */
public final class C12469Sv1 implements C13612Tde {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C12469Sv1(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void DNd(SF9 sf9) {
        switch (this.A00) {
            case 0:
                ((QEW) this.A02).A00.onClick(((QFE) this.A01).A00);
                return;
            case 1:
                String str = sf9.A03;
                if (str != null) {
                    Context context = (Context) this.A02;
                    boolean z = sf9.A00;
                    RRM A07 = AnonymousClass2E0.A07();
                    if (z) {
                        A07.A00(context, str);
                        return;
                    } else {
                        A07.A01(context, str);
                        return;
                    }
                } else {
                    return;
                }
            default:
                String str2 = sf9.A03;
                if (str2 != null) {
                    Intent data = Pxe.A0E().setData(0cp.A03(str2));
                    0b6.A00().A04().A0G((Context) this.A02, data);
                    return;
                }
                return;
        }
    }
}
