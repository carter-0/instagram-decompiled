package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Lgt  reason: case insensitive filesystem */
public final class C64719Lgt implements C61110lV, AnonymousClass0lh {
    public final 1vo A00;
    public final C258873zm A01;
    public final AnonymousClass94W A02;
    public final AnonymousClass94X A03;
    public final UserSession A04;
    public final C61480nO A05;
    public final Map A06 = AnonymousClass7TE.A1H();
    public final C262224Cq A07;

    public static final LN2 A00(LDC ldc, C64719Lgt lgt) {
        Map map = lgt.A06;
        LDC ldc2 = ldc;
        String str = ldc.A01;
        String str2 = ldc.A02;
        String str3 = ldc.A00;
        LN2 ln2 = (LN2) map.get(002.A0j(str, str2, str3, ',', ','));
        if (ln2 != null) {
            return ln2;
        }
        String str4 = lgt.A04.A06;
        LN2 ln22 = new LN2(lgt.A01, lgt.A03, ldc2, str4, lgt.A07);
        map.put(002.A0j(str, str2, str3, ',', ','), ln22);
        return ln22;
    }

    public /* synthetic */ C64719Lgt(UserSession userSession) {
        AnonymousClass0vF A0W = JTP.A0W(C61610nw.A00(), "IgSignalsOdinServerFeaturesManager");
        AnonymousClass19S A022 = 19E.A02(new AnonymousClass12U(A0W).AOJ(1466390445, 3));
        0qQ.A0B(userSession, 1);
        0qQ.A0B(A022, 3);
        this.A04 = userSession;
        this.A05 = A0W;
        this.A07 = A022;
        14i.A05(this);
        1L7 A012 = 1L7.A01();
        0qQ.A07(A012);
        this.A01 = new C258873zm(new C258863zl(A012).A00());
        1vn A013 = 1vm.A01(userSession);
        this.A00 = A013;
        AnonymousClass94W r1 = new AnonymousClass94W(A013);
        this.A02 = r1;
        this.A03 = new AnonymousClass94X(r1);
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(-1984031363);
        C66181MGs.A02(this, this.A07, 46);
        AnonymousClass0fD.A0A(1766928929, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(-881135548, AnonymousClass0fD.A03(-1737129527));
    }

    public final void onSessionWillEnd() {
        14i.A06(this);
    }
}
