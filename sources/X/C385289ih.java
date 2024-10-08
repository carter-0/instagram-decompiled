package X;

import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.9ih  reason: invalid class name and case insensitive filesystem */
public final class C385289ih extends 1P0 {
    public final /* synthetic */ C339357jT A00;
    public final /* synthetic */ C391019sD A01;

    public C385289ih(C339357jT r1, C391019sD r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1183914353);
        C384629hd r10 = (C384629hd) obj;
        int A032 = AnonymousClass0fD.A03(-486502013);
        0qQ.A0B(r10, 0);
        C339357jT r7 = this.A00;
        r7.A08 = false;
        r7.A01 = System.currentTimeMillis();
        r7.A06 = r10.A01;
        r7.A00 = r10.A00.intValue();
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (User id : r10.A02) {
            A1C.add(id.getId());
        }
        r7.A07 = A1C;
        HashMap hashMap = r7.A0B;
        C391019sD r4 = this.A01;
        hashMap.put(r4, new AnonymousClass9IM((List) A1C, r7.A00, 8));
        if (182.A06(0Tu.A05, r7.A0A, 2342154264757010910L)) {
            C339357jT.A01(r7, r4);
        } else {
            C339357jT.A02(r7, r4);
        }
        AnonymousClass0fD.A0A(218781548, A032);
        AnonymousClass0fD.A0A(1958854296, A03);
    }
}
