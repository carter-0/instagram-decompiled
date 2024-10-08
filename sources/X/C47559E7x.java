package X;

import android.content.Context;
import java.util.Collections;

/* renamed from: X.E7x  reason: case insensitive filesystem */
public final class C47559E7x extends C361158fl {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C47559E7x(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A04 = str;
        this.A01 = obj;
    }

    public final void A04(C268654dm r5) {
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                C277014uI r1 = (C277014uI) this.A02;
                if (r1 != null) {
                    DbS.A1Q((C307896Rx) this.A01, r1);
                }
                str = this.A04;
                str2 = "AsyncAction";
                break;
            case 1:
                DbS.A1Q((C307896Rx) this.A01, (C277014uI) this.A02);
                str = this.A04;
                str2 = "AsyncActionWithDataManifest";
                break;
            default:
                0qQ.A0B(r5, 0);
                Dba.A1T(C273654mx.A00(1341), "Unable to fetch bloks action", r5.A01());
                String str3 = this.A04;
                if (str3 != null) {
                    C59689JTv.A03((Context) this.A01, str3, "failure", 0);
                }
                DbS.A1V(this.A02);
                return;
        }
        C48723Ej8.A00(r5, str2, str);
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        if (2 - this.A00 != 0) {
            C307886Rw.A06((C46620Di0) obj, (C307896Rx) this.A01, (C277014uI) this.A03, (C277014uI) this.A02, Collections.emptyMap());
            return;
        }
        C48382Edd.A00((C229382nI) this.A03, DbV.A0Q(obj));
        DbS.A1V(this.A02);
    }
}
