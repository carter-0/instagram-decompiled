package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.List;

/* renamed from: X.Icz  reason: case insensitive filesystem */
public final class C57572Icz implements C59583JPd {
    public final int A00;
    public final Object A01;

    public final void onFailure(Throwable th) {
        AnonymousClass0eM r0;
        switch (this.A00) {
            case 1:
                C59583JPd jPd = (C59583JPd) this.A01;
                if (jPd != null) {
                    jPd.onFailure((Throwable) null);
                    return;
                }
                return;
            case 2:
                r0 = ((C54135H0e) this.A01).A09;
                break;
            case 3:
                r0 = ((C54152H0w) this.A01).A03;
                break;
            case 4:
                ((AnonymousClass4D7) this.A01).resumeWith(C41845B3m.A0c(""));
                return;
            default:
                return;
        }
        C51966G9m.A0p(r0).A06.FIA(IQQ.A00);
    }

    public C57572Icz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object A0c;
        AnonymousClass0eM r3;
        switch (this.A00) {
            case 0:
                C56025HrX hrX = (C56025HrX) this.A01;
                UserSession userSession = hrX.A01;
                if (182.A06(0Tu.A05, userSession, 36328349513432335L)) {
                    Bundle A0a = AnonymousClass7TE.A0a();
                    Dbb.A0i(hrX.A00, A0a, userSession, ModalActivity.class, C273654mx.A00(1299));
                    return;
                }
                return;
            case 1:
                C59583JPd jPd = (C59583JPd) this.A01;
                if (jPd != null) {
                    jPd.onSuccess(obj);
                    return;
                }
                return;
            case 2:
                r3 = ((C54135H0e) this.A01).A09;
                break;
            case 3:
                r3 = ((C54152H0w) this.A01).A03;
                break;
            case 4:
                C56064HsD hsD = (C56064HsD) obj;
                0qQ.A0B(hsD, 0);
                List list = hsD.A00;
                boolean A1b = AnonymousClass7TE.A1b(list);
                AnonymousClass4D7 r4 = (AnonymousClass4D7) this.A01;
                if (A1b) {
                    A0c = C41845B3m.A0d(new N49(((C356888Vp) 00k.A0I(list)).A04, ((C356888Vp) 00k.A0I(list)).A06, 30));
                } else {
                    A0c = C41845B3m.A0c("Empty response from Imagine");
                }
                r4.resumeWith(A0c);
                return;
            default:
                C56064HsD hsD2 = (C56064HsD) obj;
                0qQ.A0B(hsD2, 0);
                OVN ovn = (OVN) this.A01;
                List<C356888Vp> list2 = hsD2.A00;
                AnonymousClass19S A02 = 19E.A02(AnonymousClass12T.A00.AOJ(877377371, 3));
                for (C356888Vp r6 : list2) {
                    int intValue = r6.A03.intValue();
                    if (intValue == 1 || intValue == 2 || intValue == 4) {
                        AnonymousClass7TE.A1Z(new C73568Pfp(r6, ovn, (AnonymousClass4D7) null, 24), A02);
                    } else if (intValue == 3 || intValue == 5) {
                        AnonymousClass7TE.A1Z(new MH7((Context) ovn.A00, ovn.A01, r6.A06, (AnonymousClass4D7) null, (0sL) new JG2(9, r6, ovn)), A02);
                    }
                }
                return;
        }
        C53026GhH A0p = C51966G9m.A0p(r3);
        C51971G9r.A1Q(A0p, C318116oQ.A00(A0p), 44);
        C51966G9m.A0p(r3).A06.FIA(IQQ.A00);
    }
}
