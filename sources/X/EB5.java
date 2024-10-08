package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public final class EB5 extends 1P0 {
    public WeakReference A00;

    public final void onFail(C268654dm r6) {
        String A16;
        int A03 = AnonymousClass0fD.A03(-425685088);
        C49918FEs fEs = (C49918FEs) this.A00.get();
        if (fEs != null) {
            fEs.A00 = 2;
            F34 f34 = fEs.A0A;
            f34.A00(2);
            0qQ.A0B(r6, 0);
            C47437E2j e2j = f34.A00;
            if (e2j.isResumed()) {
                Context requireContext = e2j.requireContext();
                AnonymousClass1XT A0L = DbT.A0L(r6);
                if (A0L == null || (A16 = A0L.getErrorMessage()) == null || A16.length() <= 0) {
                    A16 = AnonymousClass7TE.A16(requireContext, 2131968258);
                }
                C59689JTv.A03(e2j.requireContext(), A16, "onFetchSuggestedUsersFailure", 1);
            }
        }
        AnonymousClass0fD.A0A(1221512574, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(261601294);
        C49918FEs fEs = (C49918FEs) this.A00.get();
        if (fEs != null) {
            fEs.A00 = 0;
            fEs.A0A.A00(0);
        }
        AnonymousClass0fD.A0A(730055795, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(2094253880);
        DvU dvU = (DvU) obj;
        int A032 = AnonymousClass0fD.A03(799293700);
        C49918FEs fEs = (C49918FEs) this.A00.get();
        if (fEs != null) {
            fEs.A00 = 1;
            fEs.A0A.A00(1);
            fEs.A04 = true;
            FAI fai = fEs.A09;
            List<C47326Dut> unmodifiableList = Collections.unmodifiableList(dvU.A00);
            0qQ.A0B(unmodifiableList, 0);
            for (C47326Dut dut : unmodifiableList) {
                fai.A01.add(dut);
                fai.A02.put(dut.A04, dut);
            }
            FAI.A00(fai);
        }
        AnonymousClass0fD.A0A(1385377038, A032);
        AnonymousClass0fD.A0A(-381891297, A03);
    }
}
