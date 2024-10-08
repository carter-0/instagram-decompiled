package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.PFp  reason: case insensitive filesystem */
public final class C72685PFp implements C74463PvI {
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
    public final C70491O8q A0C;
    public final P3T A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (r4 != false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0082, code lost:
        if (r1.A07() == false) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AF6() {
        /*
            r8 = this;
            X.2t9 r0 = r8.A00
            if (r0 == 0) goto L_0x00cb
            com.instagram.common.recyclerview.ViewModelListUpdate r3 = X.DbS.A0R()
            java.util.List r0 = r8.A02
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0021
            android.content.Context r1 = r8.A04
            r0 = 2131959959(0x7f132097, float:1.9556573E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            X.NOy r0 = new X.NOy
            r0.<init>(r1)
            r3.A00(r0)
        L_0x0021:
            java.util.List r0 = r8.A02
            int r7 = r0.size()
            if (r7 <= 0) goto L_0x005f
            r6 = 0
        L_0x002a:
            java.util.List r0 = r8.A02
            java.lang.Object r5 = r0.get(r6)
            X.PwB r5 = (X.C74516PwB) r5
            X.3sy r0 = r5.CBV()
            java.lang.String r0 = X.C66647MaG.A0B(r0)
            if (r0 == 0) goto L_0x0058
            boolean r4 = X.C66640Ma9.A02(r5)
            X.OKr r2 = r8.A01
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x0049
            r1 = 1
            if (r4 == 0) goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            boolean r0 = r8.A09
            X.OuA r0 = r2.A00(r5, r6, r1, r0)
            r3.A00(r0)
            int r6 = r6 + 1
            if (r6 >= r7) goto L_0x009f
            goto L_0x002a
        L_0x0058:
            java.lang.String r0 = "Thread id, Direct or Msys, should be always non null for permissions inbox"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x005f:
            X.OMG r4 = r8.A07
            X.OeR r0 = r4.A00
            boolean r0 = r0.A0Q
            if (r0 == 0) goto L_0x009f
            boolean r0 = r4.A01()
            if (r0 != 0) goto L_0x009f
            com.instagram.common.session.UserSession r2 = r8.A05
            com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager r1 = X.AnonymousClass92E.A00(r2)
            boolean r0 = r4.A00()
            if (r0 != 0) goto L_0x00bd
            android.content.Context r5 = r8.A04
            if (r1 == 0) goto L_0x0084
            boolean r0 = r1.A07()
            r4 = 1
            if (r0 != 0) goto L_0x0085
        L_0x0084:
            r4 = 0
        L_0x0085:
            boolean r2 = X.2Iw.A00(r2)
            X.6wO r1 = r8.A08
            r0 = 0
            X.72b r2 = X.C71053OaV.A03(r5, r1, r4, r2, r0)
            X.OJx r0 = r8.A06
            r0.A00()
            X.6rr r1 = X.C320156rr.EMPTY
        L_0x0097:
            X.NPA r0 = new X.NPA
            r0.<init>(r2, r1)
            r3.A00(r0)
        L_0x009f:
            X.OMG r0 = r8.A07
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x00b5
            java.util.List r0 = r8.A02
            boolean r1 = r0.isEmpty()
            X.NP0 r0 = new X.NP0
            r0.<init>(r1)
            r3.A00(r0)
        L_0x00b5:
            X.2t9 r0 = r8.A00
            if (r0 == 0) goto L_0x00c6
            r0.A05(r3)
            return
        L_0x00bd:
            android.content.Context r0 = r8.A04
            X.72b r2 = X.C71053OaV.A00(r0)
            X.6rr r1 = X.C320156rr.ERROR
            goto L_0x0097
        L_0x00c6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72685PFp.AF6():void");
    }

    public C72685PFp(Context context, AnonymousClass0iw r3, UserSession userSession, C74398PuE puE, C70491O8q o8q, C70751OJx oJx, OMG omg, P3T p3t, C322776wO r10, boolean z) {
        AnonymousClass7TG.A1U(context, userSession, r3);
        AnonymousClass7TG.A1S(p3t, puE);
        C51974G9v.A1Q(omg, oJx, r10, o8q);
        this.A04 = context;
        this.A05 = userSession;
        this.A0A = r3;
        this.A03 = z;
        this.A0D = p3t;
        this.A0B = puE;
        this.A07 = omg;
        this.A06 = oJx;
        this.A08 = r10;
        this.A0C = o8q;
        this.A01 = new C70771OKr(context, userSession);
        this.A09 = C272094k5.A06(userSession);
    }

    public final ImmutableList AMu() {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add(new Object());
        builder.add(new Object());
        Context context = this.A04;
        UserSession userSession = this.A05;
        builder.add(new C68578NOa(context, this.A0A, userSession, this.A0B, this.A0D));
        builder.add(new NOE(this.A0C));
        return DbZ.A0K(builder);
    }

    public final void ENv(AnonymousClass2t9 r1) {
        this.A00 = r1;
    }
}
