package X;

import java.util.List;

/* renamed from: X.FuY  reason: case insensitive filesystem */
public final class C51464FuY implements Runnable {
    public final /* synthetic */ C46352Dcv A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;

    public C51464FuY(C46352Dcv dcv, List list, List list2) {
        this.A00 = dcv;
        this.A02 = list;
        this.A01 = list2;
    }

    public final void run() {
        C46352Dcv dcv = this.A00;
        LSf.A02(dcv.requireActivity(), (0xG) dcv.A05.getValue(), dcv.getSession(), AnonymousClass000.A00(1770), AnonymousClass000.A00(1096), this.A02, this.A01);
        dcv.A00 = null;
    }
}
