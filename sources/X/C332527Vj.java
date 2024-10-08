package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7Vj  reason: invalid class name and case insensitive filesystem */
public final class C332527Vj {
    public C330707Nw A00;
    public C332517Vi A01;
    public final AnonymousClass4DH A02;
    public final 0wc A03;
    public final 1wn A04 = new C332537Vk(this);
    public final UserSession A05;
    public final C62320sa A06;
    public final C62320sa A07;
    public final AnonymousClass0iw A08;
    public final AnonymousClass7US A09;
    public final C62320sa A0A;
    public final C62320sa A0B;

    public C332527Vj(AnonymousClass4DH r2, AnonymousClass0iw r3, 0wc r4, UserSession userSession, AnonymousClass7US r6, C332517Vi r7, C62320sa r8, C62320sa r9, C62320sa r10, C62320sa r11) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(r3, 3);
        0qQ.A0B(r4, 4);
        0qQ.A0B(r6, 6);
        0qQ.A0B(r8, 7);
        0qQ.A0B(r9, 8);
        0qQ.A0B(r10, 9);
        0qQ.A0B(r11, 10);
        this.A02 = r2;
        this.A05 = userSession;
        this.A08 = r3;
        this.A03 = r4;
        this.A09 = r6;
        this.A0A = r8;
        this.A06 = r9;
        this.A07 = r10;
        this.A0B = r11;
        this.A01 = r7;
    }

    public final void A02(boolean z, boolean z2) {
        if (z) {
            if (A00(this).C6l().CdE()) {
                List BRZ = A00(this).C6l().BRZ();
                if (BRZ.size() == 1 && ((Boolean) this.A0B.invoke()).booleanValue()) {
                    C254793t3 CBU = A00(this).C6l().CBU();
                    0qQ.A0C(CBU, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadId");
                    A01(new PIO(C254923tH.ACT, OXK.A02(BRZ)), ((C254763t0) CBU).A00, z2);
                    return;
                }
            }
            A00(this).BSN().DCQ(this.A09, A00(this).AvL().CC6());
            return;
        }
        String str = (String) this.A07.invoke();
        if (str != null) {
            A01(new C254763t0(str), (String) null, z2);
            return;
        }
        AnonymousClass7S7 C6l = A00(this).C6l();
        AnonymousClass7ZY BSN = A00(this).BSN();
        C254793t3 CBU2 = C6l.CBU();
        AnonymousClass3SZ BrG = C6l.BrG(true);
        AnonymousClass3SZ BrG2 = C6l.BrG(false);
        BSN.DNJ(this.A09, A00(this).AvL().CC6(), BrG, BrG2, CBU2);
        A00(this).AvL().EIQ(false);
    }

    public static final C333517Zg A00(C332527Vj r1) {
        Object invoke = r1.A0A.invoke();
        if (invoke != null) {
            return (C333517Zg) invoke;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r11 != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(X.C254783t2 r9, java.lang.String r10, boolean r11) {
        /*
            r8 = this;
            X.4DH r6 = r8.A02
            androidx.fragment.app.FragmentActivity r3 = r6.getActivity()
            if (r3 == 0) goto L_0x006b
            com.instagram.common.session.UserSession r7 = r8.A05
            java.lang.String r1 = "direct_thread"
            X.0iw r0 = r8.A08
            X.1pE r2 = X.1pE.A01(r3, r0, r7, r1)
            r2.A0B = r9
            r4 = 1
            r2.A0u = r4
            X.0sa r0 = r8.A0A
            java.lang.Object r0 = r0.invoke()
            if (r0 == 0) goto L_0x0022
            r0 = 0
            if (r11 == 0) goto L_0x0023
        L_0x0022:
            r0 = 1
        L_0x0023:
            r2.A0x = r0
            X.7Zg r0 = A00(r8)
            X.7S7 r5 = r0.C6l()
            X.3t2 r0 = r5.C6c()
            X.0qQ.A07(r0)
            boolean r1 = r0 instanceof X.C254773t1
            X.7SD r0 = r5.C6Q()
            X.0qQ.A07(r0)
            boolean r0 = X.C308556Us.A0C(r7, r0, r1)
            r2.A0p = r0
            X.7Vi r0 = r8.A01
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = r0.name()
        L_0x004b:
            r2.A0c = r0
            r2.A12 = r4
            if (r10 == 0) goto L_0x0053
            r2.A0W = r10
        L_0x0053:
            android.os.Bundle r1 = r6.requireArguments()
            r0 = 2205(0x89d, float:3.09E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L_0x0065
            r2.A0n = r4
        L_0x0065:
            r2.A06()
            r3.finish()
        L_0x006b:
            return
        L_0x006c:
            r0 = 0
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C332527Vj.A01(X.3t2, java.lang.String, boolean):void");
    }
}
