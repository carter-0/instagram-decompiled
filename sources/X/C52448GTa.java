package X;

import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GTa  reason: case insensitive filesystem */
public final class C52448GTa extends 0ng {
    public final /* synthetic */ ReboundViewPager A00;
    public final /* synthetic */ C310566bG A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52448GTa(ReboundViewPager reboundViewPager, C310566bG r5, String str) {
        super(1778850470, 3, false, false);
        this.A00 = reboundViewPager;
        this.A01 = r5;
        this.A02 = str;
    }

    public final void run() {
        int[] iArr;
        ReboundViewPager reboundViewPager = this.A00;
        C310566bG r6 = this.A01;
        List<String> A0x = DbX.A0x(this.A02);
        if (A0x != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (String A0l : A0x) {
                Integer A0l2 = 00y.A0l(A0l);
                if (A0l2 != null) {
                    A1C.add(A0l2);
                }
            }
            iArr = 00k.A0x(A1C);
        } else {
            iArr = new int[]{1};
        }
        for (int i : iArr) {
            11Z.A02(new AnonymousClass6LB(r6.A01(reboundViewPager, C315586kA.A00(i)), new C306126Kw(reboundViewPager, i)));
        }
    }
}
