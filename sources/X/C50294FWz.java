package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.FWz  reason: case insensitive filesystem */
public final class C50294FWz implements 27S {
    public final /* synthetic */ C270194gL A00;
    public final /* synthetic */ C309636Za A01;

    public C50294FWz(C270194gL r1, C309636Za r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        C64671Lfx lfx = (C64671Lfx) obj;
        0qQ.A0B(lfx, 0);
        String str = this.A00.A0X;
        str.getClass();
        return str.equals(lfx.A01);
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        2ZS r1;
        int A03 = AnonymousClass0fD.A03(2140861621);
        C64671Lfx lfx = (C64671Lfx) obj;
        int A0D = AnonymousClass7TG.A0D(lfx, -711254728);
        if (lfx.A00 == AnonymousClass05K.A00) {
            C309636Za r5 = this.A01;
            UserSession userSession = r5.A01;
            Fragment fragment = null;
            if (userSession == null) {
                DbS.A17();
                throw AnonymousClass00P.createAndThrow();
            }
            AnonymousClass1Nd.A00(userSession).A02(this, C64671Lfx.class);
            r5.A04.CpD();
            Fragment fragment2 = (Fragment) r5.A05.get();
            if (fragment2 != null) {
                fragment = fragment2.mParentFragment;
            }
            if (!(fragment instanceof 2ZS) || (r1 = (2ZS) fragment) == null) {
                AnonymousClass2ZQ A002 = C71172bH.A00();
                0qQ.A0C(A002, C273654mx.A00(49));
                r1 = (2ZS) A002;
            }
            r1.Enh(1QK.A0C);
        }
        AnonymousClass0fD.A0A(-2336813, A0D);
        AnonymousClass0fD.A0A(2087497089, A03);
    }
}
