package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.PFq  reason: case insensitive filesystem */
public final class C72686PFq implements C74463PvI {
    public AnonymousClass2t9 A00;
    public 1a8 A01 = C66580MXl.A0O();
    public List A02 = AnonymousClass7TE.A1C();
    public boolean A03;
    public final Context A04;
    public final AnonymousClass2tB A05;
    public final AnonymousClass1aS A06 = 1aF.A00();
    public final UserSession A07;
    public final C70771OKr A08;
    public final C70751OJx A09;
    public final OMG A0A;
    public final C70940OSn A0B;
    public final C322776wO A0C;
    public final AnonymousClass0iw A0D;
    public final C74398PuE A0E;
    public final P3T A0F;

    public C72686PFq(Context context, AnonymousClass0iw r3, AnonymousClass2tB r4, UserSession userSession, C74398PuE puE, C70771OKr oKr, C70751OJx oJx, OMG omg, P3T p3t, C70940OSn oSn, C322776wO r12, boolean z) {
        AnonymousClass7TG.A1U(context, userSession, r3);
        C51974G9v.A1N(omg, p3t, puE);
        AnonymousClass7TF.A1G(r12, 8, oSn);
        DbW.A1P(oJx, 11, r4);
        this.A04 = context;
        this.A07 = userSession;
        this.A0D = r3;
        this.A0F = p3t;
        this.A0E = puE;
        this.A08 = oKr;
        this.A03 = z;
        this.A0C = r12;
        this.A0B = oSn;
        this.A0A = omg;
        this.A05 = r4;
        this.A09 = oJx;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r2 != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r2.A01() != false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AF6() {
        /*
            r8 = this;
            com.instagram.common.recyclerview.ViewModelListUpdate r3 = X.DbS.A0R()
            X.OMG r2 = r8.A0A
            X.OeR r0 = r2.A00
            boolean r0 = r0.A0Q
            if (r0 == 0) goto L_0x0013
            boolean r0 = r2.A01()
            r1 = 1
            if (r0 == 0) goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            java.util.List r0 = r8.A02
            int r7 = r0.size()
            if (r7 <= 0) goto L_0x0051
            r6 = 0
            r5 = 0
        L_0x001e:
            java.util.List r0 = r8.A02
            java.lang.Object r4 = r0.get(r5)
            X.PwB r4 = (X.C74516PwB) r4
            X.3sy r0 = r4.CBV()
            java.lang.String r0 = X.C66647MaG.A0B(r0)
            if (r0 == 0) goto L_0x004a
            boolean r2 = X.C66640Ma9.A02(r4)
            X.OKr r1 = r8.A08
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x003d
            r0 = 1
            if (r2 == 0) goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            X.OuA r0 = r1.A00(r4, r5, r0, r6)
            r3.A00(r0)
            int r5 = r5 + 1
            if (r5 >= r7) goto L_0x0078
            goto L_0x001e
        L_0x004a:
            java.lang.String r0 = "Thread id, Direct or Msys, should be always non null for permissions inbox"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0051:
            if (r1 == 0) goto L_0x0078
            boolean r0 = r2.A00()
            if (r0 != 0) goto L_0x007e
            android.content.Context r5 = r8.A04
            com.instagram.common.session.UserSession r4 = r8.A07
            X.NkF r2 = X.C69375NkF.A0C
            boolean r1 = X.2Iw.A00(r4)
            X.6wO r0 = r8.A0C
            X.72b r2 = X.C71053OaV.A01(r5, r4, r2, r0, r1)
            X.6rr r1 = X.C320156rr.EMPTY
            X.NPA r0 = new X.NPA
            r0.<init>(r2, r1)
            r3.A00(r0)
            X.OJx r0 = r8.A09
            r0.A00()
        L_0x0078:
            X.1aS r0 = r8.A06
            r0.accept(r3)
            return
        L_0x007e:
            android.content.Context r2 = r8.A04
            com.instagram.common.session.UserSession r1 = r8.A07
            X.OSn r0 = r8.A0B
            X.72b r2 = X.C71053OaV.A02(r2, r1, r0)
            X.6rr r1 = X.C320156rr.ERROR
            X.NPA r0 = new X.NPA
            r0.<init>(r2, r1)
            r3.A00(r0)
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72686PFq.AF6():void");
    }

    public final ImmutableList AMu() {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add(new Object());
        Context context = this.A04;
        UserSession userSession = this.A07;
        builder.add(new C68578NOa(context, this.A0D, userSession, this.A0E, this.A0F));
        return DbZ.A0K(builder);
    }

    public final void ENv(AnonymousClass2t9 r1) {
        this.A00 = r1;
    }
}
