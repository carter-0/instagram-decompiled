package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

public final class EMG extends C47695EDe {
    public final AnonymousClass0iw A00;
    public final String A01;
    public final String A02;
    public final /* synthetic */ E54 A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EMG(androidx.fragment.app.Fragment r11, X.AnonymousClass0iw r12, X.AnonymousClass0aP r13, X.G8H r14, X.E54 r15, java.lang.String r16, java.lang.String r17) {
        /*
            r10 = this;
            r1 = r10
            r10.A03 = r15
            androidx.fragment.app.FragmentActivity r2 = r11.getActivity()
            java.lang.String r0 = X.E54.A0X
            X.DiE r7 = X.C46634DiE.A0t
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            android.net.Uri r3 = X.C46413Dea.A01(r11)
            r4 = r12
            r5 = r13
            r6 = r14
            r9 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.A01 = r9
            r0 = r17
            r10.A02 = r0
            r10.A00 = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EMG.<init>(androidx.fragment.app.Fragment, X.0iw, X.0aP, X.G8H, X.E54, java.lang.String, java.lang.String):void");
    }

    public static void A01(UserSession userSession, EMG emg, User user) {
        if (emg.A03.getContext() != null) {
            super.A03(userSession, user);
        }
    }

    public final void A03(UserSession userSession, User user) {
        E54 e54 = this.A03;
        UserSession userSession2 = userSession;
        if (e54.getContext() != null) {
            String username = user.getUsername();
            String str = this.A02;
            ImageUrl Bh3 = user.Bh3();
            String str2 = E54.A0X;
            C46632DiC.A02(e54, userSession2, Bh3, new C50535Fdv(2, userSession, user, this), C46634DiE.A0t, username, str, false);
            return;
        }
        A01(userSession, this, user);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        if (((X.EM4) ((X.C268674do) r8).A00).A0C == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r8) {
        /*
            r7 = this;
            r0 = 143311133(0x88ac11d, float:8.350974E-34)
            int r3 = X.AnonymousClass0fD.A03(r0)
            super.onFail(r8)
            java.lang.String r4 = r7.A01
            X.E54 r6 = r7.A03
            java.lang.String r0 = X.E54.A0X
            android.widget.TextView r0 = r6.A05
            java.lang.String r0 = X.0nA.A0I(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r7.A02
            boolean r0 = r0.equals(r0)
            if (r0 == 0) goto L_0x0034
            boolean r0 = r8 instanceof X.C268674do
            if (r0 == 0) goto L_0x0034
            r0 = r8
            X.4do r0 = (X.C268674do) r0
            java.lang.Object r0 = r0.A00
            X.EM4 r0 = (X.EM4) r0
            boolean r0 = r0.A0C
            r5 = 1
            if (r0 != 0) goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            X.1Q0 r1 = X.1Q0.A1D
            X.0aP r0 = r6.A06
            X.FGI r2 = r1.A02(r0)
            X.DiE r1 = X.C46634DiE.A0t
            r0 = 0
            X.FBm r2 = r2.A06(r0, r1)
            if (r5 == 0) goto L_0x004c
            r0 = 1
            r6.A0G = r0
            X.E54.A00(r6)
        L_0x004c:
            java.lang.String r1 = r7.A00
            boolean r0 = r8 instanceof X.C268674do
            if (r0 == 0) goto L_0x005d
            X.4do r8 = (X.C268674do) r8
            java.lang.Object r0 = r8.A00
            X.1XP r0 = (X.1XP) r0
            java.lang.String r0 = r0.mErrorType
            if (r0 == 0) goto L_0x005d
            r1 = r0
        L_0x005d:
            java.lang.String r0 = "error"
            r2.A04(r0, r1)
            java.lang.String r0 = "log_in_token"
            r2.A04(r0, r4)
            r2.A02()
            r0 = 1629521894(0x612087e6, float:1.8507947E20)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EMG.onFail(X.4dm):void");
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-811885048);
        EMG.super.onFinish();
        E54 e54 = this.A03;
        e54.A0J = false;
        E54.A00(e54);
        AnonymousClass0fD.A0A(-1909731700, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(1404577823);
        EMG.super.onStart();
        E54 e54 = this.A03;
        e54.A0J = true;
        E54.A00(e54);
        AnonymousClass0fD.A0A(-2087590770, A032);
    }
}
