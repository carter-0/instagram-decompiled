package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.save.model.SavedCollection;

public final /* synthetic */ class PEH implements B1V {
    public final /* synthetic */ AnonymousClass7Z6 A00;
    public final /* synthetic */ SavedCollection A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ PEH(AnonymousClass7Z6 r1, SavedCollection savedCollection, String str, String str2, boolean z) {
        this.A00 = r1;
        this.A04 = z;
        this.A02 = str;
        this.A01 = savedCollection;
        this.A03 = str2;
    }

    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        AnonymousClass7Z6 r0 = this.A00;
        boolean z = this.A04;
        String str = this.A02;
        SavedCollection savedCollection = this.A01;
        String str2 = this.A03;
        C66665MaY A05 = C66669Mac.A05(r0.A00, oDs, C66131jj.class, str, z);
        long A0H = AnonymousClass7TG.A0H();
        0qQ.A0B(directThreadKey, 2);
        1bp r4 = new 1bp(A05, directThreadKey, l, A0H);
        r4.A00 = directThreadKey;
        r4.A01 = savedCollection;
        r4.A02 = str2;
        return r4;
    }
}
