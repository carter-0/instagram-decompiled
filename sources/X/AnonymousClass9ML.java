package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.9ML  reason: invalid class name */
public final class AnonymousClass9ML extends 0Yg implements C62320sa {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9ML(int i, int i2, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i2;
        this.A04 = obj;
        this.A02 = obj2;
        this.A01 = i;
        this.A03 = obj3;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            return Integer.valueOf(((C231632rz) this.A04).getViewModelHash(this.A01, this.A02, this.A03));
        }
        C332237Ue r2 = (C332237Ue) this.A04;
        AnonymousClass4DH r38 = r2.A0E;
        Context context = r38.getContext();
        UserSession userSession = r2.A0G;
        C332067Tn r0 = r2.A0H;
        AnonymousClass4DU r18 = r0.A08;
        int i = this.A01;
        C62320sa r14 = r2.A0t;
        boolean A002 = r0.A07.A00();
        AnonymousClass7SU r13 = r0.A05;
        C332157Tw r1 = r2.A0I;
        AnonymousClass7US r9 = r1.A0B;
        C62320sa r8 = r0.A0H;
        C332627Vt r7 = new C332627Vt(r1.A0O);
        C62320sa r6 = r0.A0D;
        C62320sa r5 = r0.A0G;
        C62320sa r4 = r0.A0E;
        C62320sa r3 = r0.A0F;
        C62320sa r22 = r0.A0A;
        C62320sa r12 = r0.A0C;
        C62320sa r25 = r14;
        C62320sa r26 = (C62320sa) this.A03;
        C62320sa r27 = r8;
        C332627Vt r28 = r7;
        C62320sa r29 = r6;
        AnonymousClass4DU r24 = r18;
        return new C332637Vu(context, r38, userSession, r9, (AnonymousClass7VP) r2.A0g.getValue(), r13, (C331617Rr) this.A02, r24, r25, r26, r27, r28, r29, r5, r4, r3, r22, r12, r0.A0L, i, A002);
    }
}
