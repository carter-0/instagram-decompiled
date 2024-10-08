package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.EzI  reason: case insensitive filesystem */
public final class C49599EzI {
    public final C229382nI A00;
    public final AnonymousClass4UE A01;
    public final 2bv A02;
    public final Map A03;

    public C49599EzI(Context context, C229382nI r4, 2bv r5, AnonymousClass4UC r6, C254093rv r7, Map map) {
        AnonymousClass7TG.A1Q(r5, r6);
        this.A00 = r4;
        this.A02 = r5;
        this.A01 = r6;
        this.A03 = map;
        C246643ew A002 = r6.A08.A00();
        if (A002 == null) {
            String A003 = AnonymousClass000.A00(2115);
            0wb.A03("bloks_qp_presenter", A003);
            r7.DOJ(A003);
            return;
        }
        r7.DJV(AnonymousClass6NS.A00(context, C3034368u.A02((C361078fd) null, A002), this.A00).A00(), this);
    }
}
