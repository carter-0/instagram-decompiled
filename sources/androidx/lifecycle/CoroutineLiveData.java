package androidx.lifecycle;

import X.0eS;
import X.19B;
import X.1Eo;
import X.AnonymousClass05K;
import X.AnonymousClass12W;
import X.AnonymousClass12y;
import X.AnonymousClass2gB;
import X.AnonymousClass2gC;
import X.AnonymousClass4CZ;
import X.AnonymousClass4D7;
import X.AnonymousClass972;
import X.AnonymousClass9JU;
import X.AnonymousClass9K3;
import X.C262204Co;
import X.C262224Cq;
import X.C376889Js;
import X.C60340gF;
import java.util.concurrent.CancellationException;

public final class CoroutineLiveData extends AnonymousClass2gB {
    public AnonymousClass2gC A00;

    public final C60340gF A0F(AnonymousClass4D7 r6) {
        AnonymousClass9JU r3;
        int i;
        if (AnonymousClass9JU.A00(5, r6)) {
            r3 = (AnonymousClass9JU) r6;
            int i2 = r3.A00;
            if ((i2 & AnonymousClass972.MUTABLE_FLAG_MASK) != 0) {
                r3.A00 = i2 - AnonymousClass972.MUTABLE_FLAG_MASK;
                Object obj = r3.A02;
                i = r3.A00;
                if (i != 0 || i == 1) {
                    0eS.A00(obj);
                    return C60340gF.A00;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        r3 = new AnonymousClass9JU(this, r6, 5);
        Object obj2 = r3.A02;
        i = r3.A00;
        if (i != 0) {
        }
        0eS.A00(obj2);
        return C60340gF.A00;
    }

    public final void A03() {
        super.A03();
        AnonymousClass2gC r4 = this.A00;
        if (r4 != null) {
            C262204Co r0 = r4.A00;
            if (r0 != null) {
                r0.AG7((CancellationException) null);
            }
            r4.A00 = null;
            if (r4.A01 == null) {
                C262224Cq r3 = r4.A05;
                AnonymousClass9K3 r2 = new AnonymousClass9K3(r4, (AnonymousClass4D7) null, 12);
                r4.A01 = 1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
            }
        }
    }

    public final void A04() {
        super.A04();
        AnonymousClass2gC r5 = this.A00;
        if (r5 == null) {
            return;
        }
        if (r5.A00 == null) {
            C262224Cq r4 = r5.A05;
            AnonymousClass4CZ r0 = AnonymousClass12W.A01;
            r5.A00 = 1Eo.A03(AnonymousClass05K.A00, AnonymousClass12y.A00.A0P(), new C376889Js(r5, (AnonymousClass4D7) null, 3), r4);
            return;
        }
        throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
    }
}
