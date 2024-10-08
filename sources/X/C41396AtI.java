package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.AtI  reason: case insensitive filesystem */
public final class C41396AtI implements AnonymousClass0eK {
    public final int A00;
    public final Object A01;

    public C41396AtI(C62320sa r1, int i) {
        this.A00 = i;
        if (7 - i != 0) {
            this.A01 = r1;
        } else {
            this.A01 = r1;
        }
    }

    public final /* bridge */ /* synthetic */ Object get() {
        String str;
        switch (this.A00) {
            case 0:
                return 0qv.A02.A05((Context) this.A01);
            case 1:
                C40377AbA abA = (C40377AbA) this.A01;
                UserSession userSession = abA.A0C;
                return new C65786Lze(abA.A08, abA.A0A, userSession, abA, abA.A0R);
            case 2:
                return new C40293AZi(((C40377AbA) this.A01).A0R);
            case 3:
                return ((C332237Ue) this.A01).A0d.getValue();
            case 4:
                return ((AnonymousClass7U1) this.A01).A04;
            case 5:
                AnonymousClass7S7 C6l = ((C333517Zg) ((C332237Ue) this.A01).A0t.invoke()).C6l();
                if (C6l.CdE()) {
                    return C6l.BRZ();
                }
                return null;
            case 6:
                return ((C333517Zg) ((C332237Ue) this.A01).A0t.invoke()).C6l().AfV();
            case 7:
                return Boolean.valueOf(AnonymousClass7TF.A1V(((C62320sa) this.A01).invoke()));
            case 8:
                return ((C333517Zg) ((AnonymousClass0eK) this.A01).get()).C6l();
            case 11:
                AnonymousClass36V r1 = ((C332157Tw) this.A01).A0E.A00;
                if (r1 == null) {
                    str = "captureFlowHelper";
                    break;
                } else {
                    return r1;
                }
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return ((C333517Zg) ((AnonymousClass0eK) this.A01).get()).BSN();
            case 13:
                return 2aN.A00((UserSession) this.A01);
            case 14:
                return ((C62320sa) this.A01).invoke();
            default:
                AnonymousClass7L5 r12 = ((C332157Tw) this.A01).A00;
                if (r12 == null) {
                    str = "sendAttributionTracker";
                    break;
                } else {
                    return r12;
                }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public C41396AtI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
