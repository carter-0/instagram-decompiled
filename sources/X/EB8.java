package X;

import java.lang.ref.WeakReference;
import java.util.List;

public final class EB8 extends 1P0 {
    public final WeakReference A00;

    public EB8(C49707F2s f2s) {
        this.A00 = new WeakReference(f2s);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(936838107);
        C47306DuZ duZ = (C47306DuZ) obj;
        int A032 = AnonymousClass0fD.A03(-1416747864);
        0qQ.A0B(duZ, 0);
        EB8.super.onSuccess(duZ);
        C49707F2s f2s = (C49707F2s) this.A00.get();
        if (f2s != null) {
            C49698F2j f2j = f2s.A06;
            C47132Dr9 dr9 = duZ.A00;
            if (dr9 == null) {
                C41845B3m.A0v();
                throw AnonymousClass00P.createAndThrow();
            }
            List list = dr9.A00;
            0qQ.A0B(list, 0);
            f2j.A01 = list;
            f2s.A08.A00(f2j.A00(f2s.A04, DbU.A0K(f2s.A07.A00)));
        }
        AnonymousClass0fD.A0A(1506871135, A032);
        AnonymousClass0fD.A0A(405569851, A03);
    }
}
