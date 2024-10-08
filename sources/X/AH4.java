package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.Map;

public final class AH4 {
    public int A00;
    public int A01;
    public int A02;
    public B2N A03;
    public boolean A04;
    public int A05;
    public final C371518yX A06;
    public final B3T A07;
    public final C345167t2 A08;
    public final C40161AUb A09;
    public final ATD A0A;
    public final C344477rv A0B;
    public final C40086AQr A0C;
    public final ARQ A0D;
    public final C345547th A0E;
    public final C341147mP A0F;
    public final C344397rn A0G;
    public final AU4 A0H;
    public final String A0I;
    public final ViewGroup A0J;
    public final C41791B0u A0K;
    public final AnonymousClass82S A0L;
    public final C361848gv A0M;

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.8yX] */
    /* JADX WARNING: type inference failed for: r0v22, types: [X.7qe, X.7ru, java.lang.Object] */
    public AH4(Map map) {
        ATD A002;
        ? obj = new Object();
        obj.A00 = null;
        obj.A03 = false;
        obj.A02 = false;
        obj.A01 = false;
        this.A06 = obj;
        AnonymousClass82S r10 = new AnonymousClass82S();
        this.A0L = r10;
        C392559v0 r0 = C39630A2u.A08;
        0qQ.A0B(r0, 0);
        String str = (String) map.get(r0);
        this.A0I = str;
        C392559v0 r02 = C39630A2u.A03;
        0qQ.A0B(r02, 0);
        C41791B0u b0u = (C41791B0u) map.get(r02);
        this.A0K = b0u;
        C392559v0 r03 = C39630A2u.A09;
        0qQ.A0B(r03, 0);
        C361848gv r5 = (C361848gv) map.get(r03);
        this.A0M = r5;
        C392559v0 r2 = C39630A2u.A0B;
        0qQ.A0B(r2, 0);
        if (map.containsKey(r2)) {
            this.A0J = (ViewGroup) map.get(r2);
        } else {
            this.A0J = null;
        }
        C392559v0 r22 = C39630A2u.A00;
        0qQ.A0B(r22, 0);
        if (map.containsKey(r22)) {
            this.A05 = AnonymousClass7TE.A0M(map.get(r22));
        }
        C392559v0 r23 = C39630A2u.A0A;
        0qQ.A0B(r23, 0);
        if (map.containsKey(r23)) {
            this.A00 = AnonymousClass7TE.A0M(map.get(r23));
        }
        C392559v0 r24 = B37.A01;
        0qQ.A0B(r24, 0);
        if (map.containsKey(r24)) {
            C392559v0 r04 = C39630A2u.A02;
            0qQ.A0B(r04, 0);
            A002 = ((B37) map.get(r24)).AKy((Context) map.get(r04), str);
        } else {
            C392559v0 r05 = C39630A2u.A02;
            0qQ.A0B(r05, 0);
            Context context = (Context) map.get(r05);
            C392559v0 r06 = C39630A2u.A05;
            0qQ.A0B(r06, 0);
            C312426eP r4 = (C312426eP) map.get(r06);
            C392559v0 r07 = C39630A2u.A01;
            0qQ.A0B(r07, 0);
            List<C41806B1l> list = (List) map.get(r07);
            0qQ.A0B(context, 0);
            0qQ.A0B(str, 1);
            AnonymousClass7TG.A0w(2, r5, r4, b0u);
            0qQ.A0B(list, 6);
            C343647qZ r25 = new C343647qZ(str);
            for (C41806B1l ErV : list) {
                ErV.ErV(r25);
            }
            A002 = C343897qz.A00(context, r25);
            for (C41806B1l ALG : list) {
                A002.A02((C343917r1) ALG.ALG(A002));
            }
            A002.A01(new C345707tx(A002), C345607tn.A00);
            A002.A01(new C345227t8(A002), AnonymousClass7t9.A00);
            C345817u8 A022 = C343857qv.A02(A002, C344397rn.A00, true);
            A022.Enu(30);
            C343717qg A003 = C341157mQ.A00(A002, A022, C344447rs.A00);
            A002.A01(new C345667tt(A002), C345677tu.A00);
            A002.A01(new C345687tv(A002), C345697tw.A00);
            A002.A01(new C345727tz(A002), C345627tp.A00);
            C343717qg r1 = B3P.A00;
            ? obj2 = new Object();
            obj2.A00 = A002;
            A002.A01(obj2, r1);
            A002.A01(new C380699Ze(A002), B3T.A01);
            C392469ur.A00(r4, A002, b0u, r10, r5);
            A002.A01(new C380729Zh(A002), C345757u2.A04);
            C344467ru.A03(A002, A003, r5, 1);
        }
        this.A0A = A002;
        C40161AUb aUb = new C40161AUb(A002);
        this.A09 = aUb;
        this.A0G = (C344397rn) this.A0A.Ape(C344397rn.A00);
        this.A0E = (C345547th) this.A0A.Ape(C345547th.A00);
        this.A0B = (C344477rv) this.A0A.Ape(C344477rv.A01);
        this.A07 = (B3T) this.A0A.Ape(B3T.A01);
        this.A08 = (C345167t2) this.A0A.Ape(C345167t2.A01);
        this.A0F = ((C344447rs) this.A0A.Ape(C344447rs.A00)).Blg();
        C392559v0 r12 = C39630A2u.A06;
        0qQ.A0B(r12, 0);
        if (map.containsKey(r12)) {
            obj.A02 = AnonymousClass7TE.A1a(map.get(r12));
        }
        C392559v0 r13 = C39630A2u.A04;
        0qQ.A0B(r13, 0);
        if (map.containsKey(r13)) {
            obj.A01 = AnonymousClass7TE.A1a(map.get(r13));
        }
        ViewGroup viewGroup = this.A0J;
        if (viewGroup != null) {
            this.A04 = false;
            View Bf9 = this.A0E.Bf9();
            0qQ.A07(Bf9);
            viewGroup.addView(Bf9);
        } else {
            C392559v0 r14 = C39630A2u.A07;
            0qQ.A0B(r14, 0);
            if (map.containsKey(r14)) {
                this.A04 = true;
                C53368Gms gms = (C53368Gms) map.get(r14);
                this.A02 = gms.A01;
                this.A01 = gms.A00;
                C345087su r26 = new C345087su(new C344407ro(), new C345047sq(), new C345077st(), true);
                r26.A03(this.A02, this.A01, 0);
                this.A0B.BQ8().A8c(r26, 0);
            }
        }
        aUb.A03(this.A05);
        if (this.A00 == 0) {
            C40161AUb.A00(aUb).enable(false);
        }
        this.A0H = new AU4(this, 1);
        this.A0C = new C40086AQr(this);
        this.A0D = new ARQ(this);
    }

    public static void A00(AH4 ah4) {
        ah4.A08.Ddr(new C40186AVa(true));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0019, code lost:
        r1 = r3.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AH4 r11) {
        /*
            X.ATe r3 = new X.ATe
            r3.<init>()
            r5 = 0
            X.ATp r0 = new X.ATp
            r0.<init>(r11, r5)
            r3.A05 = r0
            int r1 = r11.A02
            int r0 = r11.A01
            r3.A01 = r1
            r3.A00 = r0
            X.7uG r0 = r3.A02
            if (r0 == 0) goto L_0x0025
            X.7sy r1 = r3.A03
            X.7v0 r0 = r1.A04
            if (r0 == 0) goto L_0x0025
            r0.A01()
            r0 = 0
            r1.A04 = r0
        L_0x0025:
            X.C40138ATe.A00(r3)
            X.7rv r4 = r11.A0B
            X.7sH r2 = r4.BQ8()
            X.7ro r1 = new X.7ro
            r1.<init>()
            X.7uu r0 = new X.7uu
            r0.<init>(r1, r3, r5)
            r2.EZt(r0, r5)
            int r1 = r11.A02
            int r0 = r11.A01
            X.7ss r2 = r3.A01(r1, r0, r5)
            X.0qQ.A07(r2)
            X.7mP r1 = r11.A0F
            X.AU6 r0 = new X.AU6
            r0.<init>(r11)
            r1.EwL(r0)
            int r6 = r2.A01
            int r7 = r2.A00
            int r9 = r11.A02
            int r10 = r11.A01
            int r1 = r11.A05
            r0 = 1
            boolean r8 = X.AnonymousClass7TF.A1S(r1, r0)
            r4.FLA(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AH4.A01(X.AH4):void");
    }

    public final void A02() {
        C40161AUb aUb = this.A09;
        aUb.EIx();
        int i = this.A00;
        if (i == 0) {
            this.A0E.A9s(this.A0H);
        } else if (i == 1) {
            aUb.A04(this.A0C);
        }
    }
}
