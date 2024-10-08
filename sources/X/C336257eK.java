package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7eK  reason: invalid class name and case insensitive filesystem */
public abstract class C336257eK implements C337247fx, C336267eL {
    public C337237fw A00;
    public Object A01;
    public String A02 = "";
    public String A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public Integer A08;
    public String A09;
    public List A0A;
    public boolean A0B;
    public final UserSession A0C;
    public final C337287g2 A0D;
    public final AnonymousClass0eM A0E;
    public final boolean A0F;

    public C336257eK(UserSession userSession, C337287g2 r6, boolean z, boolean z2) {
        this.A0C = userSession;
        this.A0D = r6;
        this.A0F = z2;
        this.A0E = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9MA(9, this, (Object) null, z));
        0sn r1 = 0sn.A00;
        this.A04 = r1;
        this.A0A = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r7.length() == 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(java.lang.String r7) {
        /*
            r6 = this;
            r2 = 0
            r6.A05 = r2
            r6.A06 = r2
            r1 = 1
            if (r7 == 0) goto L_0x000f
            int r3 = r7.length()
            r0 = 0
            if (r3 != 0) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            r5 = 0
            if (r0 == 0) goto L_0x002f
            boolean r0 = r6.A0F
            if (r0 != 0) goto L_0x002f
            X.0sn r0 = X.0sn.A00
            r6.A04 = r0
            r6.A01 = r5
            r6.A09 = r5
            r6.A03 = r5
            r6.A07 = r2
            r6.A0A = r5
            r6.A08 = r5
        L_0x0027:
            X.7fw r0 = r6.A00
            if (r0 == 0) goto L_0x002e
            r0.Dam(r6)
        L_0x002e:
            return
        L_0x002f:
            if (r7 == 0) goto L_0x0062
            X.7g2 r0 = r6.A0D
            X.9P5 r4 = r0.BiX(r7)
        L_0x0037:
            java.lang.Integer r3 = r4.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r3 != r0) goto L_0x0067
            java.util.List r0 = r4.A06
            if (r0 != 0) goto L_0x0043
            X.0sn r0 = X.0sn.A00
        L_0x0043:
            r6.A04 = r0
            java.lang.Object r0 = r4.A02
            r6.A01 = r0
            java.lang.String r0 = r4.A04
            r6.A09 = r0
            java.lang.String r0 = r4.A05
            r6.A03 = r0
            java.util.List r0 = r4.A07
            r6.A0A = r0
            boolean r0 = r4.A08
            r6.A0B = r0
            java.lang.Integer r0 = r4.A00
            r6.A08 = r0
            r6.A07 = r2
            r6.A06 = r1
            goto L_0x0027
        L_0x0062:
            X.9P5 r4 = X.AnonymousClass9PC.A00()
            goto L_0x0037
        L_0x0067:
            X.0eM r0 = r6.A0E
            java.lang.Object r0 = r0.getValue()
            X.Ts1 r0 = (X.C14221Ts1) r0
            if (r7 != 0) goto L_0x0073
            java.lang.String r7 = ""
        L_0x0073:
            r0.A06(r7)
            X.0sn r0 = X.0sn.A00
            r6.A04 = r0
            r6.A01 = r5
            r6.A09 = r5
            r6.A03 = r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.A0A = r0
            r6.A08 = r5
            r6.A07 = r1
            r6.A0B = r2
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C336257eK.A00(java.lang.String):void");
    }

    public final String Amq() {
        return null;
    }

    public final void DDU() {
    }

    public final /* synthetic */ void DeG(C15050ULg uLg) {
        AnonymousClass9V2.A02(uLg, this);
    }

    public final void DeH(String str) {
    }

    public final /* synthetic */ void DeJ(C15050ULg uLg, C268654dm r2) {
        AnonymousClass9V2.A01(uLg, r2, this);
    }

    public final void DeM(C268654dm r3, String str) {
        0qQ.A0B(str, 0);
        if (0qQ.A0K(this.A02, str)) {
            this.A07 = false;
            this.A05 = true;
            this.A06 = false;
            C337237fw r0 = this.A00;
            if (r0 != null) {
                r0.Dam(this);
            }
        }
    }

    public final /* synthetic */ void DeT(C15050ULg uLg) {
        AnonymousClass9V2.A03(uLg, this);
    }

    public final void DeW(String str) {
    }

    public final /* synthetic */ void Dej(C15050ULg uLg) {
        AnonymousClass9V2.A04(uLg, this);
    }

    public final void Dem(String str) {
        0qQ.A0B(str, 0);
        if (str.equals(this.A02)) {
            this.A04 = 0sn.A00;
            this.A01 = null;
            this.A09 = null;
            this.A03 = null;
            this.A0A = new ArrayList();
            this.A08 = null;
            C337237fw r0 = this.A00;
            if (r0 != null) {
                r0.Dam(this);
            }
        }
    }

    public final /* synthetic */ void Der(C15050ULg uLg, AnonymousClass1XT r2) {
        AnonymousClass9V2.A00(uLg, r2, this);
    }

    public final void Dev(AnonymousClass1XT r4, String str) {
        0qQ.A0B(str, 0);
        0qQ.A0B(r4, 1);
        if (0qQ.A0K(this.A02, str)) {
            this.A06 = true;
            C336537em r42 = (C336537em) r4;
            this.A04 = r42.getItems();
            this.A01 = r42.B3J();
            this.A09 = r42.BjE();
            this.A03 = r42.BnF();
            this.A0A = r42.Bqo();
            this.A08 = r42.BlQ();
            this.A07 = false;
            this.A05 = false;
            this.A0B = r42.CKA();
            C337237fw r0 = this.A00;
            if (r0 != null) {
                r0.Dam(this);
            }
        }
    }

    public final void ERO(List list) {
        0qQ.A0B(list, 0);
        C39728A6t a6t = new C39728A6t((C389819qH) this);
        C385469iz r5 = new C385469iz(this);
        UserSession userSession = this.A0C;
        C389819qH r3 = a6t.A03;
        if (r3 != null) {
            a6t.A01 = userSession;
            A5P a5p = r3.A01;
            UserSession userSession2 = a5p.A00;
            String str = a5p.A01;
            1NY r2 = new 1NY(userSession2);
            r2.A05();
            r2.A0A("direct_v2/get_realtime_nullstate_metadata/");
            r2.A0F = str;
            r2.A9m(AnonymousClass000.A00(1886), C49755F5g.A01(list));
            r2.A0R(CGS.class, D14.class);
            1OC A0M = r2.A0M();
            0qQ.A0B(A0M, 0);
            a6t.A00 = A0M;
            a6t.A02 = r5;
            A0M.A00 = new C385449ix(a6t, list);
            AnonymousClass4D6 r6 = r3.A00;
            if (r6 != null) {
                r6.schedule(A0M, 2102726329, 1, true, true);
            } else {
                1ES.A05(A0M, 2102726329, 1, true, true);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new C40895Al3(a6t), 2000);
        }
    }

    public final Object B3J() {
        return this.A01;
    }

    public final boolean BBY() {
        return this.A0B;
    }

    public final String BiY() {
        return this.A02;
    }

    public final String BjE() {
        return this.A09;
    }

    public final Integer BlQ() {
        return this.A08;
    }

    public final String BnF() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ Object Bo1() {
        return this.A04;
    }

    public final List Bqo() {
        return this.A0A;
    }

    public final boolean CT5() {
        return this.A05;
    }

    public final boolean CWX() {
        return this.A06;
    }

    public final boolean CYL() {
        return this.A07;
    }

    public final void EJE() {
        if (!this.A07) {
            A00(this.A02);
        }
    }

    public final void EcJ(C337237fw r2) {
        if (this.A00 != r2) {
            this.A00 = r2;
            if (r2 != null) {
                r2.Dam(this);
            }
        }
    }

    public final void EhX(String str) {
        this.A02 = str;
        A00(str);
    }

    public final boolean isLoading() {
        return this.A07;
    }
}
