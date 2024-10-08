package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;

public final class Tz9 extends C308096Sr {
    public final /* synthetic */ C307786Rm A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Tz9(C307786Rm r1, long j) {
        super(j);
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object A00(Context context, View view, Object obj, Object obj2) {
        XBO xbo;
        C276544tV r8 = (C276544tV) obj;
        0qQ.A0B(r8, 2);
        C276544tV A07 = r8.A07(35);
        if (!(A07 == null || (xbo = (XBO) this.A00.A01.get(R.id.bk_screen_container)) == null)) {
            C13690Tf8 A04 = C250563lf.A04(A07, A07.A04);
            if (xbo instanceof C20943X5m) {
                A04 = new C14605TzB(A04, obj2);
            }
            xbo.D5Q(A04);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2, Object obj3, Object obj4) {
        C276544tV r3 = (C276544tV) obj;
        C276544tV r4 = (C276544tV) obj2;
        0qQ.A0B(r3, 0);
        0qQ.A0B(r4, 1);
        XBO xbo = (XBO) this.A00.A01.get(R.id.bk_screen_container);
        if (xbo instanceof C20943X5m) {
            return ((C20943X5m) xbo).Etd(r3, r4, obj3, obj4);
        }
        C276544tV A07 = r3.A07(35);
        C276544tV A072 = r4.A07(35);
        if (A07 == null || !A07.equals(A072) || obj3 != obj4) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
    }
}
