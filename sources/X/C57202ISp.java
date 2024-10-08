package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.ISp  reason: case insensitive filesystem */
public final class C57202ISp implements JPO {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    public final void onFail(C268654dm r1) {
    }

    public C57202ISp(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.A00 = i;
        this.A04 = z;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void DoR(C54068Gyr gyr) {
        0sL r4;
        C262224Cq r2;
        switch (this.A00) {
            case 0:
                boolean z = this.A04;
                C52029GCb gCb = (C52029GCb) this.A03;
                if (!z) {
                    C270394gf r6 = gCb.A0K;
                    if (r6 != null) {
                        Integer num = AnonymousClass05K.A00;
                        UserSession userSession = gCb.A0C;
                        AnonymousClass4DU r1 = gCb.A0D;
                        String A2n = ((1Xj) this.A02).A2n();
                        if (A2n != null) {
                            F8R.A00(r1, userSession, r6, num, A2n);
                            return;
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    AnonymousClass4DH r12 = gCb.A08;
                    if (r12.getContext() != null && r12.isAdded() && !r12.mRemoving) {
                        1pZ A002 = AnonymousClass1pc.A00();
                        UserSession userSession2 = gCb.A0C;
                        Context requireContext = r12.requireContext();
                        AnonymousClass4DU r8 = gCb.A0D;
                        C54660HMr hMr = C54660HMr.UNLIKED_CLIPS;
                        1Xj r0 = (1Xj) this.A02;
                        String id = r0.getId();
                        if (id != null) {
                            A002.Cne(requireContext, r8, userSession2, r0.A2A(userSession2), hMr, id);
                            return;
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    return;
                }
                GI5 gi5 = gCb.A0R;
                AnonymousClass4DU r3 = gCb.A0D;
                gi5.A04(gCb.A08.mView, (C267324bN) this.A01, r3, C52029GCb.A02(gCb));
                return;
            case 1:
                boolean z2 = this.A04;
                GDG gdg = (GDG) this.A03;
                if (!z2) {
                    C270394gf r42 = gdg.A07;
                    1Xj r5 = (1Xj) this.A02;
                    if (r42 != null) {
                        String A2n2 = r5.A2n();
                        if (A2n2 != null) {
                            Integer num2 = AnonymousClass05K.A00;
                            F8R.A00(gdg.A03, gdg.A02, r42, num2, A2n2);
                            return;
                        }
                        return;
                    }
                    String id2 = r5.getId();
                    if (id2 != null) {
                        r2 = gdg.A03();
                        r4 = new C66173MGk(r5, gdg, id2, (AnonymousClass4D7) null, 49);
                    } else {
                        return;
                    }
                } else {
                    r2 = gdg.A03();
                    r4 = new C58105ImR((Object) gdg, this.A01, (AnonymousClass4D7) null, 40);
                }
                AnonymousClass7TE.A1Z(r4, r2);
                return;
            default:
                return;
        }
    }
}
