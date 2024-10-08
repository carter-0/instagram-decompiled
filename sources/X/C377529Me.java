package X;

import android.animation.Animator;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.9Me  reason: invalid class name and case insensitive filesystem */
public final class C377529Me extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377529Me(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A07 = obj2;
        this.A03 = obj3;
        this.A01 = obj4;
        this.A04 = obj5;
        this.A05 = obj6;
        this.A06 = obj7;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Class<?> cls;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                2WE r1 = (2WE) obj2;
                0qQ.A0B(r1, 0);
                r1.A01 = true;
                C244463bE r4 = (C244463bE) this.A06;
                C337927h8 r0 = (C337927h8) this.A07;
                r4.A00 = r0.A0D;
                String A002 = AnonymousClass000.A00(3847);
                Object obj3 = this.A01;
                try {
                    r1.A00 = 00R.A03(A002, 127);
                    r1.A02(new JGF(18, obj3, r0), new Object[]{r0.A0C, obj3});
                    r1.A00 = null;
                    String A003 = AnonymousClass000.A00(3849);
                    2Wa r9 = (2Wa) this.A02;
                    try {
                        r1.A00 = 00R.A03(A003, 127);
                        Object obj4 = r9.A03;
                        C70852Wg r10 = r0.A0A;
                        Boolean valueOf = Boolean.valueOf(r0.A0E);
                        Boolean valueOf2 = Boolean.valueOf(r0.A0H);
                        Integer valueOf3 = Integer.valueOf(r0.A01);
                        Integer valueOf4 = Integer.valueOf(r0.A06);
                        Integer valueOf5 = Integer.valueOf(r0.A05);
                        Boolean valueOf6 = Boolean.valueOf(r0.A0G);
                        Boolean valueOf7 = Boolean.valueOf(r0.A0I);
                        Boolean valueOf8 = Boolean.valueOf(r0.A0O);
                        Integer valueOf9 = Integer.valueOf(r0.A00);
                        Integer valueOf10 = Integer.valueOf(r0.A04);
                        AnonymousClass3AS r6 = r0.A07;
                        if (r6 != null) {
                            cls = r6.getClass();
                        } else {
                            cls = null;
                        }
                        r1.A02(new JGF(19, r4, r0), new Object[]{obj4, r10, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, 0, valueOf6, null, valueOf7, valueOf8, valueOf9, null, valueOf10, cls});
                        r1.A00 = null;
                        String A004 = AnonymousClass000.A00(3848);
                        Object obj5 = this.A03;
                        Object obj6 = this.A04;
                        Object obj7 = this.A05;
                        try {
                            r1.A00 = 00R.A03(A004, 127);
                            r1.A02(new C59137J7t(1, r0, obj5, obj7, obj6), new Object[]{new Object()});
                            r1.A00 = null;
                            break;
                        } catch (Throwable th) {
                            r1.A00 = null;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        r1.A00 = null;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    r1.A00 = null;
                    throw th3;
                }
            case 1:
                C247453gM r12 = (C247453gM) this.A06;
                1Xj r8 = r12.A07.A01;
                if (r12.A03 == C247003fc.SHARE_BUTTON) {
                    2Wa r13 = (2Wa) this.A03;
                    if (!((Boolean) r13.A03).booleanValue()) {
                        r13.A00();
                        C248453hz r7 = (C248453hz) this.A07;
                        C249213jJ.A02((Handler) this.A02, r7.A00, new C40286AZb((Animator) this.A01, (Animator) this.A04, (2Wa) this.A05, r7, r8));
                        break;
                    }
                }
                break;
            default:
                View view = (View) obj2;
                0qQ.A0B(view, 0);
                C381829cQ r3 = (C381829cQ) this.A02;
                if (r3 == null) {
                    User user = (User) this.A01;
                    if (!user.A2Q()) {
                        Af2 af2 = null;
                        if (this.A05 != null) {
                            af2 = new Af2(view, (AnonymousClass3Y5) this.A06);
                        }
                        Context context = ((AnonymousClass3Y5) this.A06).A05.A0C;
                        0qQ.A07(context);
                        ((0sK) ((C376459Ib) ((AnonymousClass9J2) this.A04).A01).A01).invoke(context, af2, user.Bh3());
                        break;
                    } else {
                        AnonymousClass3W1 r14 = (AnonymousClass3W1) this.A03;
                        ((0sL) ((C376459Ib) ((AnonymousClass9J2) this.A04).A01).A00).invoke(r14, Integer.valueOf(r14.getPosition()));
                        break;
                    }
                } else {
                    C253153qI.A0C(r3, ((C244203ao) this.A07).A02, (AnonymousClass3W1) this.A03);
                    break;
                }
        }
        return C60340gF.A00;
    }
}
