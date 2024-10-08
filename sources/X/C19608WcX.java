package X;

import android.content.Context;
import com.instagram.android.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.WcX  reason: case insensitive filesystem */
public final class C19608WcX implements C20988X8e {
    public C320156rr A00 = C320156rr.EMPTY;
    public final C19694Wdw A01;
    public final Context A02;
    public final Map A03 = new HashMap();

    public C19608WcX(Context context, C19694Wdw wdw) {
        0qQ.A0B(wdw, 2);
        this.A02 = context;
        this.A01 = wdw;
    }

    public final C3253572b Afm() {
        C3253572b r0 = (C3253572b) this.A03.get(this.A00);
        if (r0 == null) {
            return new C3253572b();
        }
        return r0;
    }

    public final C320156rr B0w() {
        return this.A00;
    }

    public final void Epa() {
        C3253572b r1 = new C3253572b();
        Context context = this.A02;
        C13991Tnr.A0s(context, r1);
        Map map = this.A03;
        map.put(C320156rr.LOADING, r1);
        C3253572b r12 = new C3253572b();
        r12.A02 = R.drawable.loadmore_icon_refresh_compound;
        WBC.A01(r12, this, 57);
        map.put(C320156rr.ERROR, r12);
        C3253572b r13 = new C3253572b();
        r13.A0D = context.getString(2131968420);
        map.put(C320156rr.EMPTY, r13);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FKG() {
        /*
            r3 = this;
            X.6rr r2 = r3.A00
            X.Wdw r0 = r3.A01
            java.lang.Object r1 = r0.A01
            X.Uaq r1 = (X.C15340Uaq) r1
            X.Wei r0 = r1.A04
            if (r0 == 0) goto L_0x004d
            boolean r0 = r0.isLoading()
            if (r0 != 0) goto L_0x004a
            X.7fy r0 = r1.A01
            if (r0 == 0) goto L_0x0047
            boolean r0 = r0.isLoading()
            if (r0 != 0) goto L_0x004a
            X.Wei r0 = r1.A04
            if (r0 == 0) goto L_0x004d
            boolean r0 = r0.CT5()
            if (r0 != 0) goto L_0x0044
            X.7fy r0 = r1.A01
            if (r0 == 0) goto L_0x0047
            boolean r0 = r0.CT5()
            if (r0 != 0) goto L_0x0044
            X.6rr r0 = X.C320156rr.EMPTY
        L_0x0032:
            r3.A00 = r0
            if (r0 == r2) goto L_0x0053
            X.UdO r0 = r1.A02
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = "adapter"
        L_0x003c:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0044:
            X.6rr r0 = X.C320156rr.ERROR
            goto L_0x0032
        L_0x0047:
            java.lang.String r0 = "brandSearchResultProvider"
            goto L_0x003c
        L_0x004a:
            X.6rr r0 = X.C320156rr.LOADING
            goto L_0x0032
        L_0x004d:
            java.lang.String r0 = "networkHelper"
            goto L_0x003c
        L_0x0050:
            r0.A00()
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19608WcX.FKG():void");
    }
}
