package X;

import androidx.compose.ui.Modifier;

public final class J77 extends 0Yg implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J77(String str, int i, long j, boolean z) {
        super(2);
        this.A00 = i;
        this.A02 = str;
        this.A03 = z;
        this.A01 = j;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy r2 = (C286575Wy) obj;
        if (C51968G9o.A0B(obj2) != 2 || !r2.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1846457773, "com.instagram.barcelona.feed.post.ui.PostIcon.<anonymous> (PostDenseUfi.kt:342)");
            }
            AnonymousClass2DO A002 = C287975bA.A00(r2, this.A00, 0);
            String str = this.A02;
            C285245Qk A0K = C51965G9l.A0K(r2, -514014661);
            Modifier A0C = C287205Zk.A0C(A0K, 18.0f);
            boolean z = this.A03;
            long j = this.A01;
            if (z) {
                A0C = A0C.Ezh(HVL.A00(r2, A0K, 6, j));
            }
            C51965G9l.A1X(r2, false);
            C288165bT.A06(r2, A0C, A002, C288075bK.A05, str, 24576, 0, j);
            if (0fL.A02()) {
                0fL.A00(1628346057);
            }
        } else {
            r2.Evl();
        }
        return C60340gF.A00;
    }
}
