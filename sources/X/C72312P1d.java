package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.P1d  reason: case insensitive filesystem */
public final class C72312P1d implements C74543Pwc {
    public final UserSession A00;
    public final int A01;
    public final Context A02;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a6, code lost:
        if (r2 <= 0) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.0eP Bqn(X.N40 r23) {
        /*
            r22 = this;
            r4 = 0
            r5 = r23
            X.0qQ.A0B(r5, r4)
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            boolean r1 = r5.A01()
            r15 = 0
            r0 = 12
            r11 = 3
            X.Jw2 r10 = new X.Jw2
            r10.<init>((java.lang.Boolean) r15, (java.lang.Integer) r6, (int) r0, (boolean) r1)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            r8 = r22
            com.instagram.common.session.UserSession r9 = r8.A00
            r7 = 1
            X.0Tu r2 = X.0Tu.A05
            r0 = 36609803016607670(0x82106c001a17b6, double:3.215525071322464E-306)
            int r0 = X.DbS.A04(r2, r9, r0)
            java.util.List r0 = X.OPI.A00(r9, r0)
            java.util.Iterator r14 = r0.iterator()
        L_0x0031:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0092
            java.lang.Object r12 = r14.next()
            X.PUH r12 = (X.PUH) r12
            X.Nj5 r1 = r12.A03
            X.NuN r0 = X.C69921NuN.$redex_init_class
            int r1 = r1.ordinal()
            if (r1 == r4) goto L_0x0085
            if (r1 == r7) goto L_0x0070
            r0 = 2
            if (r1 == r0) goto L_0x0063
            if (r1 == r11) goto L_0x0056
            r0 = 4
            if (r1 == r0) goto L_0x0031
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0056:
            com.instagram.model.direct.stickerstore.DirectStoreSticker r1 = r12.A05
            if (r1 == 0) goto L_0x0031
            X.N5l r0 = new X.N5l
            r0.<init>(r10, r1)
            r3.add(r0)
            goto L_0x0031
        L_0x0063:
            X.6o8 r1 = r12.A02
            if (r1 == 0) goto L_0x0031
            X.N5a r0 = new X.N5a
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x0031
        L_0x0070:
            X.6o8 r13 = r12.A01
            if (r13 == 0) goto L_0x0031
            java.lang.String r12 = ""
            r0 = 7
            X.JwF r1 = new X.JwF
            r1.<init>((X.C317966o8) r13, (java.lang.String) r12, (int) r0)
            X.N60 r0 = new X.N60
            r0.<init>(r1, r4)
            r3.add(r0)
            goto L_0x0031
        L_0x0085:
            X.N2b r1 = r12.A04
            if (r1 == 0) goto L_0x0031
            X.N5k r0 = new X.N5k
            r0.<init>(r15, r10, r1)
            r3.add(r0)
            goto L_0x0031
        L_0x0092:
            r0 = 36609803016411060(0x82106c001717b4, double:3.215525071198127E-306)
            int r2 = X.DbS.A04(r2, r9, r0)
            int r1 = r8.A01
            java.lang.Integer r0 = r5.A00
            boolean r0 = X.AnonymousClass7TF.A1W(r0, r6)
            if (r0 == 0) goto L_0x00a8
            int r1 = r1 * r2
            if (r2 > 0) goto L_0x00a9
        L_0x00a8:
            r1 = -1
        L_0x00a9:
            r20 = 2131960285(0x7f1321dd, float:1.9557234E38)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r4)
            X.Nj1 r17 = X.C69300Nj1.AVATAR_EDIT
            X.JyL r14 = new X.JyL
            r16 = r15
            r19 = r15
            r21 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r0 = 2131960380(0x7f13223c, float:1.9557427E38)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            X.Nj1 r9 = X.C69300Nj1.RECENT_STICKER_SEE_MORE
            X.JyL r0 = new X.JyL
            r6 = r0
            r7 = r15
            r8 = r15
            r10 = r18
            r12 = r20
            r13 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.0eP r0 = X.OPH.A01(r14, r0, r5, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72312P1d.Bqn(X.N40):X.0eP");
    }

    public final C61072JwA BDn(int i) {
        return C66584MXp.A0G(AnonymousClass05K.A01, AnonymousClass05K.A00, this.A02.getString(2131960285), R.drawable.instagram_clock_pano_outline_24, i);
    }

    public final boolean Erk(N40 n40) {
        UserSession userSession = this.A00;
        0Tu r2 = 0Tu.A05;
        182.A01(r2, userSession, 36609803016607670L);
        if (AnonymousClass7TE.A0q(userSession).C1t("recent_direct_stickers").isEmpty() || !182.A06(r2, userSession, 36328328039578864L)) {
            return false;
        }
        return true;
    }

    public C72312P1d(Context context, UserSession userSession, int i) {
        this.A02 = context;
        this.A00 = userSession;
        this.A01 = i;
    }
}
