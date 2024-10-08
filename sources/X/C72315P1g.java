package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.P1g  reason: case insensitive filesystem */
public final class C72315P1g implements C74543Pwc {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r3 <= 0) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.0eP Bqn(X.N40 r24) {
        /*
            r23 = this;
            r15 = 0
            r5 = r24
            X.0qQ.A0B(r5, r15)
            r8 = r23
            com.instagram.common.session.UserSession r6 = r8.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36609803016411060(0x82106c001717b4, double:3.215525071198127E-306)
            int r3 = X.DbS.A04(r2, r6, r0)
            int r4 = r8.A00
            java.lang.Integer r1 = r5.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            if (r0 == 0) goto L_0x0024
            int r4 = r4 * r3
            if (r3 > 0) goto L_0x0025
        L_0x0024:
            r4 = -1
        L_0x0025:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x007d
            java.util.List r0 = r5.A04
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r0.iterator()
        L_0x0037:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x004b
            java.lang.Object r1 = r7.next()
            boolean r0 = X.N41.A00(r15, r1)
            if (r0 == 0) goto L_0x0037
            r9.add(r1)
            goto L_0x0037
        L_0x004b:
            java.util.ArrayList r11 = X.AnonymousClass7TF.A0p(r9)
            r10 = 0
            java.util.Iterator r9 = r9.iterator()
        L_0x0054:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r0 = r9.next()
            int r7 = r10 + 1
            if (r10 >= 0) goto L_0x006a
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x006a:
            X.N41 r0 = (X.N41) r0
            java.lang.Object r1 = r0.A01
            X.JwF r1 = (X.C61077JwF) r1
            X.N60 r0 = new X.N60
            r0.<init>(r1, r10)
            r11.add(r0)
            r10 = r7
            goto L_0x0054
        L_0x007a:
            r3.addAll(r11)
        L_0x007d:
            boolean r0 = r8.A06
            r7 = 1
            if (r0 == 0) goto L_0x00d7
            r0 = 36329706723033356(0x8111ad0005410c, double:3.0383910474088217E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x00d7
            java.util.List r0 = r5.A04
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r0.iterator()
        L_0x0097:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r1 = r9.next()
            r0 = 3
            boolean r0 = X.N41.A00(r0, r1)
            if (r0 == 0) goto L_0x0097
            r11.add(r1)
            goto L_0x0097
        L_0x00ac:
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r11.iterator()
        L_0x00b4:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00d4
            java.lang.Object r0 = r9.next()
            X.N41 r0 = (X.N41) r0
            java.lang.Object r0 = r0.A01
            X.JwF r0 = (X.C61077JwF) r0
            java.lang.Object r1 = r0.A00
            com.instagram.model.direct.stickerstore.DirectStoreSticker r1 = (com.instagram.model.direct.stickerstore.DirectStoreSticker) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.N5l r0 = X.OPH.A00(r5, r1, r0, r7)
            if (r0 == 0) goto L_0x00b4
            r10.add(r0)
            goto L_0x00b4
        L_0x00d4:
            r3.addAll(r10)
        L_0x00d7:
            boolean r0 = r8.A04
            if (r0 == 0) goto L_0x012c
            r0 = 36325166942532266(0x810d8c000432aa, double:3.0355200719397036E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x012c
            java.util.List r0 = r5.A04
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x00f0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0104
            java.lang.Object r1 = r2.next()
            boolean r0 = X.N41.A00(r7, r1)
            if (r0 == 0) goto L_0x00f0
            r8.add(r1)
            goto L_0x00f0
        L_0x0104:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r8.iterator()
        L_0x010c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0129
            java.lang.Object r0 = r2.next()
            X.N41 r0 = (X.N41) r0
            java.lang.Object r0 = r0.A01
            X.JwF r0 = (X.C61077JwF) r0
            java.lang.Object r1 = r0.A00
            X.6o8 r1 = (X.C317966o8) r1
            X.N5a r0 = new X.N5a
            r0.<init>(r1)
            r6.add(r0)
            goto L_0x010c
        L_0x0129:
            r3.addAll(r6)
        L_0x012c:
            java.util.List r0 = r5.A04
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x0136:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x014b
            java.lang.Object r1 = r2.next()
            r0 = 2
            boolean r0 = X.N41.A00(r0, r1)
            if (r0 == 0) goto L_0x0136
            r6.add(r1)
            goto L_0x0136
        L_0x014b:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r9 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            r0 = 4
            X.Jw2 r8 = new X.Jw2
            r8.<init>((java.lang.Boolean) r1, (java.lang.Integer) r2, (int) r0, (boolean) r15)
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r6)
            java.util.Iterator r6 = r6.iterator()
        L_0x0160:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x017d
            java.lang.Object r0 = r6.next()
            X.N41 r0 = (X.N41) r0
            java.lang.Object r2 = r0.A01
            X.JwF r2 = (X.C61077JwF) r2
            java.lang.Object r1 = r2.A00
            X.N2b r1 = (X.C68137N2b) r1
            X.N5k r0 = new X.N5k
            r0.<init>(r2, r8, r1)
            r7.add(r0)
            goto L_0x0160
        L_0x017d:
            r3.addAll(r7)
            r14 = 2131960286(0x7f1321de, float:1.9557236E38)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r15)
            X.Nj1 r11 = X.C69300Nj1.AVATAR_EDIT
            X.JyL r8 = new X.JyL
            r10 = r9
            r13 = r9
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0 = 2131960380(0x7f13223c, float:1.9557427E38)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)
            X.Nj1 r18 = X.C69300Nj1.FAVORITE_STICKER_SEE_MORE
            X.JyL r0 = new X.JyL
            r16 = r9
            r17 = r9
            r19 = r12
            r21 = r14
            r22 = r15
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            X.0eP r0 = X.OPH.A01(r8, r0, r5, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72315P1g.Bqn(X.N40):X.0eP");
    }

    public final boolean Erk(N40 n40) {
        0qQ.A0B(n40, 0);
        if (!this.A05 || !AnonymousClass7TE.A1b(n40.A04)) {
            return false;
        }
        return true;
    }

    public final C61072JwA BDn(int i) {
        String string = this.A01.getString(2131960286);
        Integer num = AnonymousClass05K.A01;
        return new C61072JwA(i, 11, (Object) new C61901KQu(new GSY(num, num, "sticker", (String) null, 4), string, R.drawable.instagram_star_pano_outline_24));
    }

    public C72315P1g(Context context, UserSession userSession, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = context;
        this.A02 = userSession;
        this.A05 = z;
        this.A03 = z2;
        this.A04 = z3;
        this.A06 = z4;
        this.A00 = i;
    }
}
