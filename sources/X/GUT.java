package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.search.common.analytics.SearchContext;

public final class GUT extends 0Yg implements C62320sa {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C229382nI A01;
    public final /* synthetic */ C249763kK A02;
    public final /* synthetic */ GAP A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GUT(FragmentActivity fragmentActivity, C229382nI r3, C249763kK r4, GAP gap, Integer num, boolean z, boolean z2, boolean z3) {
        super(0);
        this.A03 = gap;
        this.A01 = r3;
        this.A00 = fragmentActivity;
        this.A07 = z;
        this.A04 = num;
        this.A05 = z2;
        this.A06 = z3;
        this.A02 = r4;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        GAP gap = this.A03;
        if (gap.A0H) {
            return null;
        }
        C229382nI r13 = this.A01;
        FragmentActivity fragmentActivity = this.A00;
        Fragment fragment = gap.A04;
        boolean z = this.A07;
        Integer num = this.A04;
        boolean z2 = this.A05;
        AnonymousClass2kR r4 = gap.A07;
        boolean z3 = this.A06;
        String str = gap.A0B;
        C249763kK r1 = this.A02;
        SearchContext searchContext = gap.A0A;
        AnonymousClass7TF.A1G(fragment, 3, r4);
        return new GTP(fragmentActivity, fragment, r13, (0xF) null, (AnonymousClass57L) null, (AnonymousClass2oD) null, r4, (C243393Yp) null, 0Pl.A0n.A00(r4.A00, r4.A01), searchContext, r1, num, AnonymousClass05K.A0C, str, z, true, z2, false, false, false, z3);
    }
}
