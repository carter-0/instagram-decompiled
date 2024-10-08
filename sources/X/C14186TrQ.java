package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.Collections;

/* renamed from: X.TrQ  reason: case insensitive filesystem */
public final class C14186TrQ implements AnonymousClass3PN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Reel A02;
    public final /* synthetic */ AnonymousClass3BV A03;
    public final /* synthetic */ String A04;

    public C14186TrQ(Reel reel, AnonymousClass3BV r2, String str, int i, int i2) {
        this.A03 = r2;
        this.A02 = reel;
        this.A00 = i;
        this.A04 = str;
        this.A01 = i2;
    }

    public final void DOJ(String str) {
        AnonymousClass3BV r1 = this.A03;
        r1.A05.remove(this);
        AnonymousClass3PO.A00(r1.A03).A03(this);
    }

    public final void DOW(String str, boolean z) {
        AnonymousClass3BV r4 = this.A03;
        r4.A05.remove(this);
        UserSession userSession = r4.A03;
        AnonymousClass3PO.A00(userSession).A03(this);
        Reel reel = this.A02;
        if (reel.A0O(userSession).size() > this.A00) {
            1y3 A002 = 1y1.A00(userSession);
            String str2 = this.A04;
            A002.A05(str2, Collections.singletonList(r4.A06(reel, str2, this.A01)));
        }
    }
}
