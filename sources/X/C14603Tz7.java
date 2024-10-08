package X;

import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.Tz7  reason: case insensitive filesystem */
public final class C14603Tz7 implements C253183qL {
    public final /* synthetic */ C307786Rm A00;
    public final /* synthetic */ C276544tV A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ C277014uI A03;

    public C14603Tz7(C307786Rm r1, C276544tV r2, C277014uI r3, C277014uI r4) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        C307786Rm r5 = this.A00;
        XBO xbo = (XBO) r5.A01.get(R.id.bk_screen_container);
        if (xbo == null) {
            return null;
        }
        xbo.Ee0(new C14644Tzq(r5, this.A01, this.A02, this.A03));
        return null;
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        XBO xbo = (XBO) this.A00.A01.get(R.id.bk_screen_container);
        if (xbo != null) {
            xbo.Ee0((C14644Tzq) null);
        }
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* synthetic */ String getDescription() {
        return C13988Tno.A0d(this);
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return false;
    }
}
