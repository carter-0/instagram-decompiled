package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.MarkerEditor;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nbo  reason: case insensitive filesystem */
public final class C68962Nbo extends AnonymousClass659 {
    public final String A00;
    public final /* synthetic */ AnonymousClass43O A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68962Nbo(AnonymousClass43O r2, String str, long j) {
        super(r2, Long.valueOf(j));
        this.A01 = r2;
        this.A00 = str;
    }

    public final void A01() {
        AnonymousClass7BV r6;
        AnonymousClass43O r3 = this.A01;
        AnonymousClass43L r5 = r3.A07;
        if (r5 != null) {
            UserSession userSession = r3.A04;
            Long l = this.A04;
            boolean A002 = r3.A05.A00();
            boolean A02 = 2Aj.A02(userSession);
            String str = this.A00;
            int i = this.A00;
            r6 = r5.A01(userSession, (Boolean) null, (Boolean) null, l, 1038495724, A002, A02, true);
            MarkerEditor withMarker = r5.A00.withMarker(r6.A01, r6.A00);
            if (str != null) {
                withMarker.annotate("fetch_reason", str);
            }
            withMarker.annotate(TraceFieldType.RetryCount, i);
            withMarker.markerEditingCompleted();
        } else {
            r6 = null;
        }
        this.A03 = r6;
        1NY A0O = DbU.A0O(r3.A04);
        A0O.A0A("direct_v2/get_folders/");
        1OC A0S = DbT.A0S(A0O, NGw.class, OQD.class);
        A0S.A00 = this;
        this.A02 = A0S;
    }

    public final void A02() {
        AnonymousClass43L r3 = this.A01.A07;
        if (r3 != null) {
            r3.A0D(this.A03, (Boolean) null, false);
        }
    }

    public final void A04() {
        NGw nGw;
        C268654dm r0 = this.A01;
        if (r0 == null || (nGw = (NGw) r0.A00()) == null || !nGw.isOk()) {
            AnonymousClass43L r2 = this.A01.A07;
            if (r2 != null) {
                r2.A0D(this.A03, (Boolean) null, false);
                return;
            }
            return;
        }
        AnonymousClass43O r1 = this.A01;
        AnonymousClass43L r3 = r1.A07;
        if (r3 != null) {
            r3.A04(this.A03);
        }
        r1.A09.A0C.A0T(nGw.A00, true);
        if (r3 != null) {
            r3.A03(this.A03);
            r3.A0C(this.A03);
        }
    }

    public final void A07(boolean z) {
        AnonymousClass43L r3 = this.A01.A07;
        if (r3 != null) {
            r3.A0D(this.A03, Boolean.valueOf(z), true);
        }
    }

    public final boolean A08() {
        return false;
    }

    public final void onFail(C268654dm r4) {
        int A0D = AnonymousClass7TG.A0D(r4, 1617867634);
        AnonymousClass43L r1 = this.A01.A07;
        if (r1 != null) {
            r1.A02(r4, this.A03);
        }
        super.onFail(r4);
        AnonymousClass0fD.A0A(1328314744, A0D);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-11079849);
        super.onStart();
        AnonymousClass43L r1 = this.A01.A07;
        if (r1 != null) {
            r1.A05(this.A03);
        }
        AnonymousClass0fD.A0A(-398813209, A03);
    }
}
