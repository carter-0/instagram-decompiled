package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.5Mc  reason: invalid class name and case insensitive filesystem */
public final class C284335Mc extends AnonymousClass2xK {
    public final /* synthetic */ AnonymousClass9IR A00;
    public final /* synthetic */ C226242fw A01;

    public final boolean Ds8(AnonymousClass5Gv r10) {
        Set set;
        2aX r5;
        0qQ.A0B(r10, 0);
        C226242fw r8 = this.A01;
        AnonymousClass2g3 viewModel = r8.getViewModel();
        List<C376629Is> list = (List) this.A00.A02;
        if (list != null) {
            ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
            for (C376629Is r0 : list) {
                arrayList.add(r0.A03);
            }
            set = 00k.A0k(arrayList);
        } else {
            set = null;
        }
        AnonymousClass2g2 r2 = (AnonymousClass2g2) viewModel;
        if ((!((Boolean) r2.A0I.getValue()).booleanValue() || r2.A03) && (r5 = r2.A01) != null) {
            2aT r1 = r2.A00;
            AnonymousClass2g1 r4 = r2.A02;
            C226252fx r3 = C226252fx.TOAST;
            r1.A05(r3, r4, r5, AnonymousClass2g2.A00(r5));
            2aV r22 = r2.A01;
            0qQ.A0B(r4, 0);
            r22.A03(new C239993Jd(r3, r4, (C71062aE) null, set), r5, false);
        }
        AnonymousClass2gW r02 = r8.A07;
        if (r02 == null) {
            return true;
        }
        r02.DsA();
        return true;
    }

    public C284335Mc(AnonymousClass9IR r1, C226242fw r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void DsC(AnonymousClass5Gv r3) {
        AnonymousClass2g6 r0;
        AnonymousClass2g3 viewModel = this.A01.getViewModel();
        2aX r02 = viewModel.A01;
        if (r02 == null || r02.A00() <= 0) {
            r0 = AnonymousClass2g6.IDLE;
        } else {
            r0 = AnonymousClass2g6.HIDDEN;
        }
        viewModel.A01(r0);
    }

    public final void DsE(AnonymousClass5Gv r4) {
        C226242fw r2 = this.A01;
        r2.getViewModel().A01(AnonymousClass2g6.VISIBLE);
        C226152fl r22 = r2.A08;
        if (r22 != null) {
            C226142fk r23 = (C226142fk) r22;
            AnonymousClass37D bottomSheetNavigator = r23.A05.getBottomSheetNavigator();
            if (bottomSheetNavigator != null) {
                bottomSheetNavigator.A0Q(new C389899qP(r23));
            }
        }
    }

    public final void DsH(AnonymousClass5Gv r9) {
        Set set;
        AnonymousClass2g3 viewModel = this.A01.getViewModel();
        List<C376629Is> list = (List) this.A00.A02;
        if (list != null) {
            ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
            for (C376629Is r0 : list) {
                arrayList.add(r0.A03);
            }
            set = 00k.A0k(arrayList);
        } else {
            set = null;
        }
        AnonymousClass2g2 r7 = (AnonymousClass2g2) viewModel;
        2aX r5 = r7.A01;
        if (r5 != null && r5.A01 + r5.A00 > 0) {
            2aT r1 = r7.A00;
            AnonymousClass2g1 r4 = r7.A02;
            C226252fx r3 = C226252fx.TOAST;
            r1.A06(r3, r4, r5, AnonymousClass2g2.A00(r5));
            2aV r2 = r7.A01;
            0qQ.A0B(r4, 0);
            r2.A02(new C239993Jd(r3, r4, (C71062aE) null, set), r5);
        }
    }
}
