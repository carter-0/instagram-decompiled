package X;

import android.content.Context;
import java.util.Map;

public final class FSJ implements AnonymousClass2Kv {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C50331FYl A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ boolean A06;

    public FSJ(Context context, C50331FYl fYl, String str, String str2, Map map, C62320sa r6, boolean z) {
        this.A00 = context;
        this.A01 = fYl;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = map;
        this.A06 = z;
        this.A05 = r6;
    }

    public final void invoke(AnonymousClass3JD r8) {
        C250663lr optionalTreeField;
        C250663lr A0U = C41845B3m.A0U(r8);
        if (A0U == null || (optionalTreeField = A0U.getOptionalTreeField(0, AnonymousClass000.A00(829), C42704Bh1.class, -1101492816)) == null) {
            OP2.A00(this.A00, this.A01.A00, this.A02, this.A03, this.A04, this.A06);
            return;
        }
        String A002 = AnonymousClass000.A00(499);
        if (optionalTreeField.hasFieldValue(A002)) {
            this.A01.A01 = C41846B3n.A0d(optionalTreeField, A002, 0);
        }
        this.A05.invoke();
    }
}
