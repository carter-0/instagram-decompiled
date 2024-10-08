package X;

import android.content.Context;
import com.instagram.android.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.WcZ  reason: case insensitive filesystem */
public final class C19610WcZ implements C20988X8e {
    public C320156rr A00 = C320156rr.EMPTY;
    public final C17886Vhd A01;
    public final String A02;
    public final Context A03;
    public final C15345Uav A04;
    public final Map A05 = new LinkedHashMap();

    public final C3253572b Afm() {
        C3253572b r0 = (C3253572b) this.A05.get(this.A00);
        if (r0 == null) {
            return new C3253572b();
        }
        return r0;
    }

    public final C320156rr B0w() {
        return this.A00;
    }

    public final void Epa() {
        Map map = this.A05;
        C320156rr r1 = C320156rr.LOADING;
        C3253572b r0 = new C3253572b();
        Context context = this.A03;
        C13991Tnr.A0s(context, r0);
        map.put(r1, r0);
        C320156rr r2 = C320156rr.EMPTY;
        C3253572b r12 = new C3253572b();
        C13991Tnr.A0s(context, r12);
        r12.A02 = R.drawable.loadmore_icon_refresh_compound;
        WBC.A01(r12, this, 53);
        map.put(r2, r12);
        C320156rr r22 = C320156rr.ERROR;
        C3253572b r13 = new C3253572b();
        C13991Tnr.A0s(context, r13);
        r13.A02 = R.drawable.loadmore_icon_refresh_compound;
        WBC.A01(r13, this, 54);
        map.put(r22, r13);
    }

    public final void FKG() {
        C320156rr r0;
        C320156rr r2 = this.A00;
        Integer num = this.A01.A00;
        if (num == AnonymousClass05K.A00) {
            r0 = C320156rr.LOADING;
        } else if (num == AnonymousClass05K.A01) {
            r0 = C320156rr.ERROR;
        } else {
            r0 = C320156rr.EMPTY;
        }
        this.A00 = r0;
        if (r0 != r2) {
            C15484UdZ.A00((C15484UdZ) this.A04.A06.getValue());
        }
    }

    public C19610WcZ(Context context, C17886Vhd vhd, C15345Uav uav, String str) {
        AnonymousClass7TG.A1Q(vhd, str);
        this.A03 = context;
        this.A01 = vhd;
        this.A02 = str;
        this.A04 = uav;
    }
}
