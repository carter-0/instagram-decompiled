package X;

import android.content.Context;
import android.os.Handler;
import java.util.LinkedHashMap;

public final class XOO extends AnonymousClass4PI {
    public long A00 = 0;
    public final XZB A01;
    public final LinkedHashMap A02 = AnonymousClass7TE.A1H();
    public final Handler A03;

    public XOO(Context context, Handler handler, AnonymousClass4PH r15, AnonymousClass2SB r16, XZB xzb, C265114Sp r18, C256823wP r19, AnonymousClass4PC r20, long j, boolean z, boolean z2) {
        super(context, handler, r15, r16, r18, r19, r20, j);
        this.A0X = z;
        this.A0T = false;
        this.A0Y = z2;
        this.A03 = handler;
        this.A01 = xzb;
    }

    public final void A0V(AnonymousClass4PQ r7) {
        long j;
        boolean A022 = 2BY.A02(2BQ.A07);
        LinkedHashMap linkedHashMap = this.A02;
        long j2 = r7.A01;
        Long valueOf = Long.valueOf(j2);
        if (A022) {
            j = j2 - this.A00;
        } else {
            j = r7.A00;
        }
        Pxe.A1X(valueOf, linkedHashMap, j);
        while (linkedHashMap.size() > 1000 && !linkedHashMap.isEmpty()) {
            linkedHashMap.remove(AnonymousClass7TE.A1J(AnonymousClass7TF.A0s(linkedHashMap)).getKey());
        }
        super.A0V(r7);
    }

    public final void A0N(C256683wB[] r1, long j, long j2) {
        super.A0N(r1, j, j2);
        this.A00 = j2;
    }

    public final void A0T(long j) {
        C18466VsG A002;
        super.A0T(j);
        LinkedHashMap linkedHashMap = this.A02;
        Long valueOf = Long.valueOf(j);
        Number number = (Number) linkedHashMap.get(valueOf);
        if (number != null) {
            j = number.longValue();
            linkedHashMap.remove(valueOf);
        }
        XZB xzb = this.A01;
        if (xzb != null && (A002 = xzb.A00.A0D.A00(j)) != null) {
            this.A03.post(new Y2Y(A002, this));
        }
    }
}
