package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Nel  reason: case insensitive filesystem */
public final class C69106Nel extends C71135OdY {
    public int A00;
    public int A01;
    public Bitmap A02;
    public SSF A03;
    public C67010Mgi A04;
    public N96 A05 = new N96((Boolean) null, (String) null, (String) null, 0, 0, 0, 0, 0, false);
    public String A06;
    public List A07 = AnonymousClass7TE.A1C();
    public final int A08;
    public final Activity A09;
    public final Context A0A;
    public final UserSession A0B;
    public final OKY A0C;
    public final C71111Ocu A0D;
    public final C71923Ot7 A0E;
    public final OK7 A0F;
    public final PMQ A0G;
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I = AnonymousClass0eN.A01(C73878PlF.A00);
    public final AnonymousClass0eM A0J;
    public final AnonymousClass0eM A0K;
    public final AnonymousClass0eM A0L = C73922Pm2.A01(this, 3);

    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C69106Nel r10) {
        /*
            r2 = 0
            java.io.File r0 = X.LIM.A00(r2)
            java.lang.String r7 = r0.getCanonicalPath()
            r10.A06 = r7
            android.content.Context r4 = r10.A0A
            com.instagram.common.session.UserSession r5 = r10.A0B
            int r8 = r10.A01
            int r9 = r10.A00
            X.OA1 r6 = new X.OA1
            r6.<init>(r10)
            X.SSF r3 = new X.SSF
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.A03 = r3
            int r1 = r10.A08
            r0 = 1
            if (r1 != r0) goto L_0x005e
            X.0qQ.A0A(r7)
            X.Nmy r1 = X.C69516Nmy.PHOTOSTRIP
        L_0x0029:
            X.0qQ.A0B(r7, r2)
            r3.A04 = r1
            r3.A0G = r2
            X.7s6 r0 = r3.A00
            if (r0 == 0) goto L_0x0051
            r3.A05 = r7
            r3.A04 = r1
            android.os.Handler r1 = r3.A08
            X.TDc r0 = new X.TDc
            r0.<init>(r3)
            r1.post(r0)
        L_0x0042:
            X.SSF r2 = r10.A03
            if (r2 == 0) goto L_0x0050
            android.os.Handler r1 = r2.A08
            X.TDa r0 = new X.TDa
            r0.<init>(r2)
            r1.post(r0)
        L_0x0050:
            return
        L_0x0051:
            r0 = 550(0x226, float:7.71E-43)
            java.lang.String r2 = X.Pxd.A00(r0)
            java.lang.String r1 = "Trying to update when capture is not initialized, this could happen if you try to update before a capture"
            r0 = 0
            X.0kD.A07(r2, r1, r0)
            goto L_0x0042
        L_0x005e:
            r0 = 2
            if (r1 != r0) goto L_0x0067
            X.0qQ.A0A(r7)
            X.Nmy r1 = X.C69516Nmy.FILMROLL
            goto L_0x0029
        L_0x0067:
            r0 = 3
            if (r1 != r0) goto L_0x0070
            X.0qQ.A0A(r7)
            X.Nmy r1 = X.C69516Nmy.FILMROLL_BW
            goto L_0x0029
        L_0x0070:
            r0 = 4
            if (r1 != r0) goto L_0x0042
            X.0qQ.A0A(r7)
            X.Nmy r1 = X.C69516Nmy.VHS
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69106Nel.A02(X.Nel):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C69106Nel(Activity activity, Context context, UserSession userSession, OKY oky, C71111Ocu ocu, PMQ pmq) {
        super(DbS.A0z(N96.class));
        OKY oky2 = oky;
        OK7 ok7 = new OK7(oky2);
        C71111Ocu ocu2 = ocu;
        AnonymousClass7TG.A1S(ocu2, oky2);
        this.A09 = activity;
        this.A0A = context;
        UserSession userSession2 = userSession;
        this.A0B = userSession2;
        this.A0G = pmq;
        this.A0D = ocu2;
        this.A0C = oky2;
        this.A0F = ok7;
        C71923Ot7 ot7 = new C71923Ot7(this);
        this.A0E = ot7;
        this.A08 = DbS.A04(0Tu.A05, userSession2, 36591802807156749L);
        this.A0H = C73922Pm2.A01(this, 0);
        this.A0J = C73922Pm2.A01(this, 1);
        this.A0K = C73922Pm2.A01(this, 2);
        PMQ pmq2 = this.A0G;
        pmq2.A02 = new C72899POj(this);
        pmq2.A01 = new C72897POh(this);
        AnonymousClass1Nd.A00(userSession2).A01(ot7, C71896Ose.class);
    }

    public static final int A00(C69106Nel nel, int i) {
        int i2 = nel.A05.A00;
        if (i == i2) {
            return 2131969425;
        }
        if (i == i2 - 1) {
            return 2131969427;
        }
        if (i == i2 - 2) {
            return 2131969430;
        }
        if (i == 1) {
            return 2131969426;
        }
        return 2131969424;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.Ps0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v8, types: [X.Prw, java.lang.Object] */
    public static final void A01(C69106Nel nel) {
        JTO.A0E(nel.A0I).removeCallbacksAndMessages((Object) null);
        nel.A0G.A01();
        C67010Mgi mgi = nel.A04;
        if (mgi != null) {
            mgi.A04();
        }
        AnonymousClass7TF.A1N(nel.A0L);
        nel.A07 = AnonymousClass7TE.A1C();
        C71111Ocu ocu = nel.A0D;
        ocu.A05(new Object());
        SSF ssf = nel.A03;
        if (ssf != null) {
            Handler handler = ssf.A08;
            handler.post(new C12912TDb(ssf));
            handler.post(new TDZ(ssf));
            handler.getLooper().quitSafely();
        }
        nel.A03 = null;
        C71111Ocu.A01(ocu, true);
        ocu.A03(new Object());
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Ps0, java.lang.Object] */
    public static final void A03(C69106Nel nel, int i, boolean z) {
        if (i > 0) {
            JTO.A0E(nel.A0I).post(new C73337Paw(nel, i, z));
            return;
        }
        C71111Ocu ocu = nel.A0D;
        C71111Ocu.A01(ocu, true);
        if (z && !nel.A07.isEmpty() && !nel.A09.isFinishing()) {
            G9w.A1Y(nel.A0L);
        }
        ocu.A05(new Object());
        C66581MXm.A0B(nel.A0G.A0D).setVisibility(8);
    }
}
