package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.MjF  reason: case insensitive filesystem */
public final class C67157MjF implements C74491Pvl {
    public final /* synthetic */ C66633Ma2 A00;

    public final void DGG(C67331Mm7 mm7, int i) {
        String str;
        C67237MkX mkX;
        0qQ.A0B(mm7, 1);
        2EM r2 = mm7.A00;
        C300895y8 r5 = C300895y8.A00;
        if (0qQ.A0K(r2, r5)) {
            C66633Ma2.A0S(this.A00);
        }
        C66633Ma2 ma2 = this.A00;
        C67479MoZ moZ = ma2.A0c;
        if (moZ != null) {
            UserSession A0P = C66582MXn.A0P(ma2);
            C67481Mob mob = (C67481Mob) A0P.A01(C67481Mob.class, new C73661Pha(A0P, 29));
            AnonymousClass4DH r10 = ma2.A1J;
            CharSequence charSequence = mm7.A01;
            if (charSequence == null || (str = charSequence.toString()) == null) {
                str = "";
            }
            C67482Moc moc = C67482Moc.FOLDER_CLICK;
            LinkedHashMap A0q = DbY.A0q("badge_count", str, AnonymousClass7TE.A1L("server_mode", String.valueOf(C67329Mm5.A00(r2))), AnonymousClass7TE.A1L("position", String.valueOf(i)));
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r10, mob.A00), "direct_inbox_folders");
            if (A0e.isSampled()) {
                C51965G9l.A19(moc, A0e);
                A0e.AAJ("extra_client_data", JTQ.A0c(A0q));
                A0e.Cgf();
            }
            if (0qQ.A0K(r2, AnonymousClass43I.A00)) {
                C66633Ma2.A0Q(ma2);
                return;
            }
            moZ.A00(r2);
            if (2El.A0H(ma2.A0p())) {
                UserSession A0P2 = C66580MXl.A0P(ma2, 1);
                if (r2.equals(AnonymousClass2EU.A00)) {
                    mkX = C67237MkX.A06;
                } else if (r2.equals(r5)) {
                    if (2El.A0L(A0P2)) {
                        mkX = C67237MkX.A07;
                    } else {
                        mkX = C67237MkX.A03;
                    }
                } else if (r2.equals(C67234MkU.A00)) {
                    mkX = C67237MkX.A05;
                } else {
                    throw C51973G9u.A0g(r2, "Unrecognized inbox mode: ", AnonymousClass7TE.A1A());
                }
                C66633Ma2.A0V(ma2, mkX);
            }
            if (2El.A0N(ma2.A0p(), ma2.A1A(AnonymousClass2EX.A00))) {
                if (182.A06(0Tu.A05, ma2.A0p(), 36317934218712744L)) {
                    ma2.A14(ma2.A0o());
                }
            }
        }
    }

    public C67157MjF(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final 2EM Brn() {
        C66633Ma2 ma2 = this.A00;
        2EM A0s = ma2.A0s();
        if (A0s == null) {
            return ma2.A0r();
        }
        return A0s;
    }

    public final C67237MkX Brv() {
        return this.A00.A0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DGH(android.view.View r13, X.C67331Mm7 r14, int r15) {
        /*
            r12 = this;
            X.Ma2 r4 = r12.A00
            X.2EM r7 = r14.A00
            X.2Ea r0 = X.C69932Ea.A00
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00fb
            com.instagram.common.session.UserSession r2 = r4.A0p()
            r6 = 0
            X.0qQ.A0B(r2, r6)
            X.0Tu r5 = X.0Tu.A06
            r0 = 36316688677081695(0x8105d60004125f, double:3.030158382729528E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            if (r0 != 0) goto L_0x00a5
            X.0eM r0 = r4.A2V
            java.lang.Object r2 = r0.getValue()
            X.2qT r2 = (X.C230882qT) r2
            X.2bu r1 = X.C66581MXm.A0g(r4)
            com.instagram.quickpromotion.intf.QPTooltipAnchor r0 = com.instagram.quickpromotion.intf.QPTooltipAnchor.INBOX_FOLDER_AD_RESPONSES
            r2.A00(r13, r0, r1)
        L_0x0032:
            com.instagram.common.session.UserSession r2 = X.C66582MXn.A0P(r4)
            r0 = 29
            X.Pha r1 = new X.Pha
            r1.<init>(r2, r0)
            java.lang.Class<X.Mob> r0 = X.C67481Mob.class
            java.lang.Object r6 = r2.A01(r0, r1)
            X.Mob r6 = (X.C67481Mob) r6
            X.4DH r5 = r4.A1J
            java.lang.CharSequence r0 = r14.A01
            java.lang.CharSequence r8 = r14.A01
            if (r0 == 0) goto L_0x0053
            java.lang.String r2 = r0.toString()
            if (r2 != 0) goto L_0x0055
        L_0x0053:
            java.lang.String r2 = ""
        L_0x0055:
            X.Moc r4 = X.C67482Moc.FOLDER_IMPRESSION
            java.lang.String r0 = X.C67329Mm5.A00(r7)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "server_mode"
            X.0eP r7 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r15)
            java.lang.String r0 = "position"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r0 = "badge_count"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r2)
            java.lang.String r1 = r8.toString()
            java.lang.String r0 = "folder_name"
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r0, r1, r7, r3, r2)
            java.util.LinkedHashMap r3 = X.0Yt.A06(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.0wc r1 = X.AnonymousClass0kN.A01(r5, r0)
            java.lang.String r0 = "direct_inbox_folders"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x00a4
            X.C51965G9l.A19(r4, r2)
            java.lang.String r1 = X.JTQ.A0c(r3)
            java.lang.String r0 = "extra_client_data"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x00a4:
            return
        L_0x00a5:
            com.instagram.common.session.UserSession r0 = r4.A0p()
            X.4kA r0 = X.AnonymousClass4k9.A00(r0)
            X.0xa r3 = r0.A00
            java.lang.String r2 = "inbox_pill_impression_count"
            r0 = 0
            long r9 = r3.getLong(r2, r0)
            com.instagram.common.session.UserSession r8 = X.C66580MXl.A0P(r4, r6)
            r2 = 36598163653659770(0x8205d600020c7a, double:3.208164291326259E-306)
            int r2 = X.DbS.A04(r5, r8, r2)
            long r2 = (long) r2
            int r8 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r8 >= 0) goto L_0x0032
            long r10 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r2
            com.instagram.common.session.UserSession r8 = r4.A0p()
            X.4kA r8 = X.AnonymousClass4k9.A00(r8)
            X.0xa r9 = r8.A00
            java.lang.String r8 = "inbox_pill_last_impression_timestamp"
            long r0 = r9.getLong(r8, r0)
            long r10 = r10 - r0
            com.instagram.common.session.UserSession r6 = X.C66580MXl.A0P(r4, r6)
            r0 = 36598163653725307(0x8205d600030c7b, double:3.208164291367705E-306)
            int r0 = X.DbS.A04(r5, r6, r0)
            long r0 = (long) r0
            int r5 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r5 <= 0) goto L_0x0032
            X.PYk r0 = new X.PYk
            r0.<init>(r13, r4)
            r13.postDelayed(r0, r2)
        L_0x00fb:
            X.2EL r0 = X.AnonymousClass2EL.A00
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0032
            r4.A0B = r13
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67157MjF.DGH(android.view.View, X.Mm7, int):void");
    }

    public final void DU1() {
        this.A00.A17((Integer) null, C273654mx.A00(657), true);
    }

    public final void Eji(2EM r2) {
        C67479MoZ moZ = this.A00.A0c;
        if (moZ != null) {
            moZ.A00(r2);
        }
    }
}
