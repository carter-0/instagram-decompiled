package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.DfI  reason: case insensitive filesystem */
public final class C46454DfI extends C231632rz {
    public F02 A00;
    public final Context A01;
    public final AnonymousClass32I A02;

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        if (i == 1) {
            return AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        return Integer.MAX_VALUE;
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        if (i == 1) {
            return AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        return Integer.MAX_VALUE;
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r7, Object obj, Object obj2) {
        C46467DfV dfV = (C46467DfV) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, r7, dfV);
        Integer num = dfV.A03;
        if (num == AnonymousClass05K.A0Y || num == AnonymousClass05K.A0j) {
            r7.A7U(A1U ? 1 : 0);
            return;
        }
        r7.A7U(0);
        F02 f02 = this.A00;
        String str = dfV.A01;
        if (f02 != null && str != null) {
            f02.A01.A01(DbU.A0a(f02.A03, AnonymousClass30Y.A00(dfV, 0, str)), str);
        }
    }

    public C46454DfI(Context context, AnonymousClass32I r2) {
        this.A01 = context;
        this.A02 = r2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1708816509);
        AnonymousClass7TG.A1O(view, obj);
        C46467DfV dfV = (C46467DfV) obj;
        C249703kE r2 = (C249703kE) view.getTag();
        if (r2 != null) {
            FCX.A01(this.A01, r2, dfV, this.A02, i);
        }
        if (i == 0) {
            F02 f02 = this.A00;
            String str = dfV.A01;
            if (!(f02 == null || str == null)) {
                AnonymousClass30Y A002 = f02.A01.A00(str);
                if (!0qQ.A0K(A002, AnonymousClass30Y.A07)) {
                    f02.A00.A05(view, A002);
                }
            }
        }
        AnonymousClass0fD.A0A(-1609335347, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 1687832520);
        View A002 = FCX.A00(this.A01, i, viewGroup);
        AnonymousClass0fD.A0A(2026517760, A04);
        return A002;
    }
}
