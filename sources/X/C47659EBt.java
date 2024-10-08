package X;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* renamed from: X.EBt  reason: case insensitive filesystem */
public abstract class C47659EBt extends 1P0 {
    public final Fragment A00;
    public final 0lg A01;
    public final C46634DiE A02;

    public C47659EBt(Fragment fragment, 0lg r2, C46634DiE diE) {
        this.A01 = r2;
        this.A00 = fragment;
        this.A02 = diE;
    }

    public void A00(DwY dwY) {
        int A03 = AnonymousClass0fD.A03(-803962001);
        Fragment fragment = this.A00;
        if (fragment.getContext() != null && fragment.isResumed()) {
            C358248ab A0I = Dba.A0I(fragment);
            A0I.A05 = dwY.A07;
            A0I.A0q(dwY.A03);
            C50023FJi.A01(A0I, this, 70);
            DbT.A1V(A0I);
        }
        AnonymousClass0fD.A0A(1754676117, A03);
    }

    public void onFail(C268654dm r6) {
        int A03 = AnonymousClass0fD.A03(-171478022);
        Fragment fragment = this.A00;
        if (fragment.getContext() != null && fragment.isResumed()) {
            if (r6 instanceof C268674do) {
                DwY dwY = (DwY) r6.A00();
                Context context = fragment.getContext();
                String str = dwY.mErrorTitle;
                String str2 = dwY.A06;
                0qQ.A0B(context, 0);
                C49952FGh.A06(context, str2, str);
            } else {
                C49952FGh.A01(fragment.getContext());
            }
        }
        AnonymousClass0fD.A0A(513160065, A03);
    }
}
