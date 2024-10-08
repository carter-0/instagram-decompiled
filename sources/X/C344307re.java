package X;

import android.content.Context;
import android.os.Looper;
import android.view.View;

/* renamed from: X.7re  reason: invalid class name and case insensitive filesystem */
public final class C344307re extends C344317rf implements C344327rg {
    public boolean A00;
    public final C344337rh A01 = new C340517lO(this);
    public final C340547lR A02;
    public final C340467lJ A03;
    public final C340507lN A04 = new C340497lM(this);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: X.7km} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.7km} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: X.7km} */
    /* JADX WARNING: type inference failed for: r3v0, types: [X.7kr, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C340157kn A00(X.C340147km r9) {
        /*
            r6 = r9
            java.util.Map r0 = X.C340157kn.A01
            X.7kp r4 = X.C340177kp.HIGH
            if (r9 != 0) goto L_0x000c
            X.AUr r6 = new X.AUr
            r6.<init>()
        L_0x000c:
            X.7kr r3 = new X.7kr
            r3.<init>()
            r7 = 0
            X.7kn r2 = new X.7kn
            r5 = r4
            r8 = r7
            r9 = r7
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            X.7ks r1 = X.C340167ko.A06
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344307re.A00(X.7km):X.7kn");
    }

    public final void A09() {
        Looper mainLooper;
        C343717qg r1 = C345547th.A00;
        C343837qt r2 = this.A00;
        if (r2.CQN(r1)) {
            ((C345547th) A0A(r1)).A9s(this.A01);
        } else {
            View view = (View) r2.Apu(C340357l8.A03);
            if (view == null) {
                view = (View) A0B(C340357l8.A02);
            }
            this.A03.EqU(view);
        }
        C343927r2 r3 = (C343927r2) r2.Apf(C343927r2.A00);
        C344037rD r22 = (C344037rD) r2.Apf(C344037rD.A00);
        if (((C343967r6) r2.Apf(C343967r6.A00)).CTO(110)) {
            mainLooper = r3.BAM("Lite-Controller-Thread").getLooper();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.A02.A09 = new C341397mo(r22, new C340227ku(mainLooper));
    }

    public final C343717qg BJt() {
        return C344327rg.A00;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.7lP, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.7lQ] */
    public C344307re(C343837qt r14, C340467lJ r15) {
        super(r14);
        this.A03 = r15;
        Context context = r14.getContext();
        C340277l0 r3 = (C340277l0) this.A00.Apu(C340357l8.A00);
        C340177kp r4 = C340177kp.HIGH;
        C340177kp r5 = r4;
        this.A02 = new C340547lR(context, r3, r4, r5, r15, new Object(), new Object(), (String) A0B(C343657qa.A02), 0, false, false);
    }
}
