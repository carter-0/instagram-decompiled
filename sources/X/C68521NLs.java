package X;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.NLs  reason: case insensitive filesystem */
public final class C68521NLs extends 1P0 {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C313516gZ A01;

    public C68521NLs(C255773uh r1, C313516gZ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2;
        Object obj3;
        C270084gA r1;
        int A03 = AnonymousClass0fD.A03(1678771359);
        C43813CEf cEf = (C43813CEf) obj;
        int A0D = AnonymousClass7TG.A0D(cEf, 597369775);
        C68158N2y n2y = cEf.A01;
        if (n2y == null) {
            C41845B3m.A0v();
            throw AnonymousClass00P.createAndThrow();
        }
        List<DUU> list = n2y.A02;
        String str = null;
        if (list.size() >= 3) {
            C313516gZ r9 = this.A01;
            View Atm = r9.A06.Atm();
            if (Atm != null) {
                obj2 = Atm.getTag();
            } else {
                obj2 = null;
            }
            if (obj2 instanceof C67602Mqa) {
                C255773uh r2 = this.A00;
                if (r2.A1Q()) {
                    C270084gA r8 = r2.A07;
                    if (r8 != null) {
                        ArrayList A0r = AnonymousClass7TG.A0r(list);
                        for (DUU FBp : list) {
                            A0r.add(FBp.FBp(1E4.A00(r9.A02)));
                        }
                        r8.A01 = A0r;
                    }
                    if (Atm != null) {
                        obj3 = Atm.getTag();
                    } else {
                        obj3 = null;
                    }
                    0qQ.A0C(obj3, "null cannot be cast to non-null type com.instagram.reels.viewer.netego.NetegoReelViewerItemBinder.Holder");
                    C67602Mqa mqa = (C67602Mqa) obj3;
                    AnonymousClass6N2 r5 = mqa.A0X;
                    C255773uh r12 = r5.A04;
                    if (!(r12 == null || (r1 = r12.A07) == null || !r1.A02)) {
                        C70316O1u.A00(r5);
                    }
                    AnonymousClass61R r13 = mqa.A0Q.A07.A09;
                    if (r13 != null) {
                        r13.EFJ(1);
                        r13.E2p();
                    }
                }
            }
        }
        C270084gA r22 = this.A00.A07;
        if (r22 != null) {
            if (n2y.A03) {
                str = n2y.A01;
            }
            r22.A00 = str;
        }
        AnonymousClass0fD.A0A(-443846051, A0D);
        AnonymousClass0fD.A0A(-1084281197, A03);
    }
}
