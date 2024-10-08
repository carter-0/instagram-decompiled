package X;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* renamed from: X.Ugb  reason: case insensitive filesystem */
public final class C15670Ugb extends C14097Tpp {
    public int A00;
    public Fragment A01;
    public final C307786Rm A02;
    public final C276544tV A03;
    public final String A04 = "SP_SingleMediaFeedFragment";
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;

    public static final void A00(C15670Ugb ugb, int i) {
        C276544tV r2 = ugb.A03;
        if (r2.A03(31, 0) != i) {
            C307446Qd A022 = C307476Qg.A02(ugb.A02);
            A022.A0E(new C15674Ugf(i), (long) r2.A03);
            A022.A08();
        }
    }

    public C15670Ugb(C307786Rm r3, C276544tV r4) {
        super(r3, r4);
        this.A03 = r4;
        this.A02 = r3;
        0t0 A012 = AnonymousClass0eN.A01(new C20695WxR(this, 36));
        this.A05 = A012;
        this.A06 = C227642jf.A02((Fragment) A012.getValue());
    }

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        return A0J(context);
    }
}
