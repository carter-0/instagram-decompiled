package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.PFo  reason: case insensitive filesystem */
public final class C72684PFo implements C74463PvI {
    public AnonymousClass2t9 A00;
    public C70771OKr A01;
    public List A02 = AnonymousClass7TE.A1C();
    public boolean A03;
    public final Context A04;
    public final UserSession A05;
    public final C70751OJx A06;
    public final OMG A07;
    public final C322776wO A08;
    public final boolean A09;
    public final AnonymousClass0iw A0A;
    public final C74398PuE A0B;
    public final P3T A0C;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        if (r3 != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        if (r1.A07() == false) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AF6() {
        /*
            r8 = this;
            X.2t9 r0 = r8.A00
            if (r0 == 0) goto L_0x00ae
            com.instagram.common.recyclerview.ViewModelListUpdate r5 = X.DbS.A0R()
            X.MkM r1 = X.C67226MkM.A00
            X.Otl r0 = new X.Otl
            r0.<init>(r1)
            r5.A00(r0)
            java.util.List r0 = r8.A02
            int r7 = r0.size()
            if (r7 <= 0) goto L_0x0050
            r6 = 0
        L_0x001b:
            java.util.List r0 = r8.A02
            java.lang.Object r4 = r0.get(r6)
            X.PwB r4 = (X.C74516PwB) r4
            X.3sy r0 = r4.CBV()
            java.lang.String r0 = X.C66647MaG.A0B(r0)
            if (r0 == 0) goto L_0x0049
            boolean r3 = X.C66640Ma9.A02(r4)
            X.OKr r2 = r8.A01
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x003a
            r1 = 1
            if (r3 == 0) goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            boolean r0 = r8.A09
            X.OuA r0 = r2.A00(r4, r6, r1, r0)
            r5.A00(r0)
            int r6 = r6 + 1
            if (r6 >= r7) goto L_0x0098
            goto L_0x001b
        L_0x0049:
            java.lang.String r0 = "Thread id, Direct or Msys, should be always non null for permissions inbox"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0050:
            X.OMG r3 = r8.A07
            X.OeR r0 = r3.A00
            boolean r0 = r0.A0Q
            if (r0 == 0) goto L_0x0098
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x0066
            java.util.List r0 = r8.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0098
        L_0x0066:
            com.instagram.common.session.UserSession r2 = r8.A05
            com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager r1 = X.AnonymousClass92E.A00(r2)
            boolean r0 = r3.A00()
            if (r0 != 0) goto L_0x00a0
            android.content.Context r4 = r8.A04
            if (r1 == 0) goto L_0x007d
            boolean r0 = r1.A07()
            r3 = 1
            if (r0 != 0) goto L_0x007e
        L_0x007d:
            r3 = 0
        L_0x007e:
            boolean r2 = X.2Iw.A00(r2)
            X.6wO r1 = r8.A08
            r0 = 0
            X.72b r2 = X.C71053OaV.A03(r4, r1, r3, r2, r0)
            X.OJx r0 = r8.A06
            r0.A00()
            X.6rr r1 = X.C320156rr.EMPTY
        L_0x0090:
            X.NPA r0 = new X.NPA
            r0.<init>(r2, r1)
            r5.A00(r0)
        L_0x0098:
            X.2t9 r0 = r8.A00
            if (r0 == 0) goto L_0x00a9
            r0.A05(r5)
            return
        L_0x00a0:
            android.content.Context r0 = r8.A04
            X.72b r2 = X.C71053OaV.A00(r0)
            X.6rr r1 = X.C320156rr.ERROR
            goto L_0x0090
        L_0x00a9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72684PFo.AF6():void");
    }

    public C72684PFo(Context context, AnonymousClass0iw r3, UserSession userSession, C74398PuE puE, C70751OJx oJx, OMG omg, P3T p3t, C322776wO r9, boolean z) {
        AnonymousClass7TG.A1U(context, userSession, r3);
        C51974G9v.A1N(p3t, puE, omg);
        AnonymousClass7TF.A1G(oJx, 8, r9);
        this.A04 = context;
        this.A05 = userSession;
        this.A0A = r3;
        this.A03 = z;
        this.A0C = p3t;
        this.A0B = puE;
        this.A07 = omg;
        this.A06 = oJx;
        this.A08 = r9;
        this.A01 = new C70771OKr(context, userSession);
        this.A09 = C272094k5.A06(userSession);
    }

    public final ImmutableList AMu() {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add(new NOH(C72683PFn.A00));
        builder.add(new Object());
        Context context = this.A04;
        UserSession userSession = this.A05;
        builder.add(new C68578NOa(context, this.A0A, userSession, this.A0B, this.A0C));
        return DbZ.A0K(builder);
    }

    public final void ENv(AnonymousClass2t9 r1) {
        this.A00 = r1;
    }
}
