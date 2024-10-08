package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ulb  reason: case insensitive filesystem */
public final class C15959Ulb extends C324596za {
    public final boolean A00;
    public final /* synthetic */ C15358UbA A01;

    public C15959Ulb(C15358UbA ubA, boolean z) {
        this.A01 = ubA;
        this.A00 = z;
    }

    public final void onFail(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(-642477963);
        C14074TpO tpO = this.A01.A03;
        if (tpO == null) {
            C13988Tno.A0n();
            throw AnonymousClass00P.createAndThrow();
        }
        C14227TsA.A00(tpO.A0E);
        AnonymousClass0fD.A0A(1238276166, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1073867104);
        C14074TpO tpO = this.A01.A03;
        if (tpO == null) {
            C13988Tno.A0n();
            throw AnonymousClass00P.createAndThrow();
        }
        C14074TpO.A00(tpO, false, true);
        AnonymousClass0fD.A0A(1843614354, A03);
    }

    public final void onStart() {
        AnonymousClass0fD.A0A(252785477, AnonymousClass0fD.A03(-1884007041));
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ArrayList arrayList;
        int A03 = AnonymousClass0fD.A03(-1166330792);
        UY6 uy6 = (UY6) obj;
        int A0D = AnonymousClass7TG.A0D(uy6, 59287692);
        List list = uy6.A04;
        C15358UbA ubA = this.A01;
        UserSession A0J = JTU.A0J(ubA.A0N);
        if (list == null || list.isEmpty()) {
            arrayList = 0sn.A00;
        } else {
            arrayList = C296885qo.A06(A0J, (C295795ov) null, list);
        }
        C61078JwG jwG = uy6.A00;
        boolean z = this.A00;
        C15358UbA.A00(jwG, ubA, arrayList, z);
        if (z) {
            C14074TpO tpO = ubA.A03;
            if (tpO == null) {
                C13988Tno.A0n();
                throw AnonymousClass00P.createAndThrow();
            }
            tpO.A02();
            ubA.A0E = uy6.A03;
            if (!(uy6.A01 == C296865qm.NOT_A_TOPIC || ubA.mView == null)) {
                11Z.A02(new C20069WkT(ubA));
            }
        }
        AnonymousClass0fD.A0A(1623775515, A0D);
        AnonymousClass0fD.A0A(1802979657, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-203896358);
        AnonymousClass0fD.A0A(1527082455, AnonymousClass0fD.A03(869803717));
        AnonymousClass0fD.A0A(2051791710, A03);
    }
}
