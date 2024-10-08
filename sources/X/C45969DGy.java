package X;

import com.instagram.model.direct.DirectRoomsXma;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;

/* renamed from: X.DGy  reason: case insensitive filesystem */
public final /* synthetic */ class C45969DGy implements B1V {
    public final /* synthetic */ AnonymousClass7Z6 A00;
    public final /* synthetic */ DirectRoomsXma A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C45969DGy(AnonymousClass7Z6 r1, DirectRoomsXma directRoomsXma, String str, boolean z) {
        this.A00 = r1;
        this.A03 = z;
        this.A02 = str;
        this.A01 = directRoomsXma;
    }

    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        AnonymousClass7Z6 r0 = this.A00;
        boolean z = this.A03;
        String str = this.A02;
        DirectRoomsXma directRoomsXma = this.A01;
        1bp r4 = new 1bp(C66669Mac.A05(r0.A00, oDs, C65501cx.class, str, z), directThreadKey, l, AnonymousClass7TG.A0H());
        String str2 = directRoomsXma.A04;
        String str3 = directRoomsXma.A03;
        String str4 = directRoomsXma.A00;
        r4.A05 = Collections.singletonList(C71152OeO.A0J(str2, str3, str4));
        r4.A02 = str4;
        r4.A06 = directRoomsXma.A06;
        r4.A01 = directRoomsXma.A02;
        r4.A03 = directRoomsXma.A01;
        r4.A04 = directRoomsXma.A05;
        return r4;
    }
}
