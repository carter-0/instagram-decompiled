package X;

import androidx.compose.ui.Modifier;

public final class JGU extends 0Yg implements 0sK {
    public final int A00;
    public final long A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JGU(long j, int i) {
        super(3);
        this.A00 = i;
        this.A01 = j;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.A00 != 0) {
            C286575Wy A0R = C51966G9m.A0R(obj2, obj3);
            if (C51967G9n.A1U(A0R, 1080576764)) {
                0fL.A01(56370921, "com.meta.compose.material.bottomsheet.bottomSheetHandle.<anonymous> (BottomSheetHandle.kt:21)");
            }
            C285245Qk r4 = Modifier.A00;
            A0R.ExS(-1753126204);
            long j = this.A01;
            boolean AGt = A0R.AGt(j);
            Object ECw = A0R.ECw();
            if (AGt || ECw == AnonymousClass5XT.A00) {
                ECw = new GQ2(j, 17);
                A0R.FLL(ECw);
            }
            C286565Wx A0G = C51965G9l.A0G(A0R);
            Modifier A0D = C51967G9n.A0D(C289575dp.A00(r4, (0sP) ECw), 16.0f);
            if (0fL.A02()) {
                0fL.A00(-1677443038);
            }
            C286565Wx.A0I(A0G);
            return A0D;
        }
        C286575Wy r8 = (C286575Wy) obj2;
        if (C51968G9o.A0E(obj3) != 16 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1874767954, "com.instagram.comments.mvvm.view.compose.CommentListContent.<anonymous>.<anonymous> (CommentList.kt:258)");
            }
            long Ezx = ((C268024cd) r8.AJO(AnonymousClass5YA.A01)).Ezx(this.A01);
            C289585dr.A00(r8, C287205Zk.A0G(Modifier.A00, C51971G9r.A01(Ezx), C51972G9s.A00(Ezx)));
            if (0fL.A02()) {
                0fL.A00(-1515693522);
            }
        } else {
            r8.Evl();
        }
        return C60340gF.A00;
    }
}
