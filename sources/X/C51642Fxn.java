package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.Fxn  reason: case insensitive filesystem */
public final class C51642Fxn extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51642Fxn(FragmentActivity fragmentActivity, 0hq r3, UserSession userSession, 1Xj r5, AnonymousClass4DU r6, AnonymousClass3W1 r7, C63500KyB kyB, AnonymousClass4D7 r9, int i, boolean z, boolean z2) {
        super(2, r9);
        this.A01 = i;
        this.A05 = r5;
        this.A02 = fragmentActivity;
        this.A03 = kyB;
        this.A08 = userSession;
        this.A04 = r3;
        this.A07 = r6;
        this.A06 = r7;
        this.A09 = z;
        this.A0A = z2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Fxn, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        int i;
        int i2 = this.A01;
        1Xj r4 = (1Xj) this.A05;
        FragmentActivity fragmentActivity = (FragmentActivity) this.A02;
        C63500KyB kyB = (C63500KyB) this.A03;
        UserSession userSession = (UserSession) this.A08;
        0hq r2 = (0hq) this.A04;
        AnonymousClass4DU r5 = (AnonymousClass4DU) this.A07;
        AnonymousClass3W1 r6 = (AnonymousClass3W1) this.A06;
        boolean z = this.A09;
        boolean z2 = this.A0A;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        return new C51642Fxn(fragmentActivity, r2, userSession, r4, r5, r6, kyB, r14, i, z, z2);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Fxn, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        0nV r2;
        0sL fxf;
        int i = this.A01;
        Object obj2 = 1Hj.A02;
        int i2 = this.A00;
        if (i != 0) {
            if (i2 == 0) {
                0eS.A00(obj);
                r2 = AnonymousClass12T.A00.CO6(1374338585, 3);
                FragmentActivity fragmentActivity = (FragmentActivity) this.A02;
                UserSession userSession = (UserSession) this.A08;
                fxf = new C51642Fxn(fragmentActivity, (0hq) this.A04, userSession, (1Xj) this.A05, (AnonymousClass4DU) this.A07, (AnonymousClass3W1) this.A06, (C63500KyB) this.A03, (AnonymousClass4D7) null, 0, this.A09, this.A0A);
            }
            0eS.A00(obj);
            return C60340gF.A00;
        }
        if (i2 == 0) {
            0eS.A00(obj);
            1Xj r4 = (1Xj) this.A05;
            FragmentActivity fragmentActivity2 = (FragmentActivity) this.A02;
            LEF lef = new LEF(r4, (C63500KyB) this.A03, new File(AnonymousClass457.A09(fragmentActivity2, "mp4", System.nanoTime(), true)));
            UserSession userSession2 = (UserSession) this.A08;
            0hq r8 = (0hq) this.A04;
            boolean z = this.A09;
            boolean z2 = this.A0A;
            LTW.A01(fragmentActivity2, r8, userSession2, (AnonymousClass4DU) this.A07, (AnonymousClass3W1) this.A06, lef, z, z2);
            r2 = AnonymousClass12T.A00.A04;
            fxf = new C51641Fxf(fragmentActivity2, r8, userSession2, r4, lef, (AnonymousClass4D7) null, z2);
        }
        0eS.A00(obj);
        return C60340gF.A00;
        this.A00 = 1;
        if (1Eo.A00(this, r2, fxf) == obj2) {
            return obj2;
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C51642Fxn) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
