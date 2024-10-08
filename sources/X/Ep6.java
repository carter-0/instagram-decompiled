package X;

public abstract class Ep6 {
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0181, code lost:
        if (X.C253833rU.A02(r1) == false) goto L_0x0183;
     */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0246  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r9, X.AnonymousClass0iw r10, X.AnonymousClass4UE r11, X.2bv r12) {
        /*
            X.4UC r11 = (X.AnonymousClass4UC) r11
            X.4VA r0 = r11.A09
            java.lang.String r2 = r0.A00
            int r1 = r2.hashCode()
            r0 = 533984576(0x1fd3f540, float:8.976771E-20)
            if (r1 == r0) goto L_0x00fc
            r0 = 637319191(0x25fcb817, float:4.3839776E-16)
            if (r1 == r0) goto L_0x0100
            r0 = 1300038126(0x4d7d01ee, float:2.65297632E8)
            if (r1 != r0) goto L_0x024a
            java.lang.String r0 = "iig_large_social_context_dialog"
        L_0x001b:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024a
            X.8ab r7 = X.DbS.A0Y(r9)
            X.4V7 r6 = r11.A08
            X.4V8 r0 = r6.A09
            r5 = 0
            java.lang.String r0 = X.DbZ.A0n(r0)
            r7.A05 = r0
            java.lang.String r4 = "220449009777528"
            X.5Jo r0 = r6.A03
            if (r0 == 0) goto L_0x005c
            java.lang.String r1 = X.DbZ.A0n(r0)
            java.lang.String r0 = r11.A0D
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00f7
            r0 = 2131958429(0x7f131a9d, float:1.955347E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r9, r0)
            java.lang.String r0 = " "
            java.lang.String r2 = X.002.A0g(r1, r0, r3)
            X.0qQ.A07(r2)
            r1 = 18
            X.FJh r0 = new X.FJh
            r0.<init>((java.lang.String) r3, (java.lang.Object) r9, (int) r1)
            r7.A0Z(r0, r2, r3)
        L_0x005c:
            X.5Js r0 = r6.A08
            if (r0 == 0) goto L_0x00f4
            java.lang.String r1 = r0.A00
        L_0x0062:
            r3 = 0
            if (r1 == 0) goto L_0x0076
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0076
            com.instagram.igds.components.headline.IgdsHeadline r0 = r7.A0Z
            r0.setDetailText((java.lang.CharSequence) r1)
            r0.setVisibility(r3)
            r0 = 1
            r7.A09 = r0
        L_0x0076:
            X.4VG r1 = r6.A01
            if (r1 == 0) goto L_0x009a
            X.4V8 r0 = r1.A00
            java.lang.String r0 = r0.A00
            r8 = r0
            if (r0 != 0) goto L_0x0083
            java.lang.String r0 = ""
        L_0x0083:
            int r0 = r0.length()
            if (r0 == 0) goto L_0x009a
            if (r8 != 0) goto L_0x008d
            java.lang.String r8 = ""
        L_0x008d:
            r0 = 46
            X.FJk r2 = X.C50025FJk.A00(r11, r12, r0)
            boolean r1 = r1.A04
            X.8ae r0 = X.C358278ae.BLUE_BOLD
            r7.A0Y(r2, r0, r8, r1)
        L_0x009a:
            X.4VG r1 = r6.A02
            if (r1 == 0) goto L_0x00be
            X.4V8 r0 = r1.A00
            java.lang.String r0 = r0.A00
            r8 = r0
            if (r0 != 0) goto L_0x00a7
            java.lang.String r0 = ""
        L_0x00a7:
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00be
            if (r8 != 0) goto L_0x00b1
            java.lang.String r8 = ""
        L_0x00b1:
            r0 = 47
            X.FJk r2 = X.C50025FJk.A00(r11, r12, r0)
            boolean r1 = r1.A04
            X.8ae r0 = X.C358278ae.DEFAULT
            r7.A0W(r2, r0, r8, r1)
        L_0x00be:
            X.4VG r0 = r6.A00
            if (r0 == 0) goto L_0x00cc
            r2 = 2131968513(0x7f134201, float:1.9573923E38)
            X.FJS r1 = X.FJS.A00
            X.8ae r0 = X.C358278ae.DEFAULT
            r7.A0P(r1, r0, r2)
        L_0x00cc:
            java.util.List r0 = r6.A0C
            if (r0 == 0) goto L_0x01e0
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            if (r1 == 0) goto L_0x01e0
            int r0 = r1.size()
            java.util.ArrayList r2 = X.DbS.A0v(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x00e2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01e1
            java.lang.Object r0 = r1.next()
            X.5Ju r0 = (X.C283905Ju) r0
            com.instagram.common.typedurl.ImageUrl r0 = r0.A00
            r2.add(r0)
            goto L_0x00e2
        L_0x00f4:
            r1 = r5
            goto L_0x0062
        L_0x00f7:
            r7.A0q(r1)
            goto L_0x005c
        L_0x00fc:
            java.lang.String r0 = "iig_dialog"
            goto L_0x001b
        L_0x0100:
            java.lang.String r0 = "promotional_dialog_ig_v2"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024a
            X.F3t r2 = new X.F3t
            r2.<init>(r9)
            r0 = 1
            r2.A09 = r0
            X.4V7 r3 = r11.A08
            X.4V8 r0 = r3.A09
            java.lang.String r0 = X.DbZ.A0n(r0)
            r2.A06 = r0
            X.5Jo r0 = r3.A03
            if (r0 == 0) goto L_0x0124
            java.lang.String r0 = X.DbZ.A0n(r0)
            r2.A04 = r0
        L_0x0124:
            X.5Jq r0 = r3.A05
            if (r0 == 0) goto L_0x012e
            java.lang.String r0 = X.DbZ.A0n(r0)
            r2.A03 = r0
        L_0x012e:
            X.4VG r0 = r3.A01
            if (r0 == 0) goto L_0x014e
            X.4V8 r0 = r0.A00
            java.lang.String r0 = r0.A00
            r1 = r0
            if (r0 != 0) goto L_0x013b
            java.lang.String r0 = ""
        L_0x013b:
            int r0 = r0.length()
            if (r0 == 0) goto L_0x014e
            if (r1 != 0) goto L_0x0145
            java.lang.String r1 = ""
        L_0x0145:
            r0 = 48
            X.FJk r0 = X.C50025FJk.A00(r11, r12, r0)
            r2.A02(r0, r1)
        L_0x014e:
            X.4VG r0 = r3.A02
            if (r0 == 0) goto L_0x016f
            X.4V8 r0 = r0.A00
            java.lang.String r0 = r0.A00
            r1 = r0
            if (r0 != 0) goto L_0x015b
            java.lang.String r0 = ""
        L_0x015b:
            int r0 = r0.length()
            if (r0 == 0) goto L_0x016f
            if (r1 != 0) goto L_0x0165
            java.lang.String r1 = ""
        L_0x0165:
            r0 = 49
            X.FJk r0 = X.C50025FJk.A00(r11, r12, r0)
            r2.A07 = r1
            r2.A00 = r0
        L_0x016f:
            X.5Ju r1 = r3.A06
            X.5Ju r3 = r3.A07
            boolean r0 = X.AnonymousClass3HA.A00(r9)
            if (r0 == 0) goto L_0x01db
            if (r1 == 0) goto L_0x01db
            com.instagram.common.typedurl.ImageUrl r1 = r1.A00
            boolean r0 = X.C253833rU.A02(r1)
            if (r0 != 0) goto L_0x01db
        L_0x0183:
            boolean r0 = X.C253833rU.A02(r1)
            if (r0 != 0) goto L_0x01bd
            X.Fcg r0 = new X.Fcg
            r0.<init>(r1)
            r2.A02 = r0
            X.4VA r1 = r11.A09
            java.lang.String r0 = "IMAGE_STYLE"
            X.4VP r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x01d8
            java.lang.String r3 = r0.A03
            if (r3 == 0) goto L_0x01d8
            int r1 = r3.hashCode()
            r0 = -387072689(0xffffffffe8edbd4f, float:-8.981544E24)
            if (r1 == r0) goto L_0x01d8
            r0 = 956910582(0x39094bf6, float:1.3093636E-4)
            if (r1 == r0) goto L_0x01cd
            r0 = 1988079824(0x767fb0d0, float:1.29650574E33)
            if (r1 != r0) goto L_0x01d8
            java.lang.String r0 = "CIRCLE"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d8
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x01bb:
            r2.A05 = r0
        L_0x01bd:
            r1 = 5
            X.FJp r0 = new X.FJp
            r0.<init>(r1, r12, r11)
            r2.A01 = r0
            android.app.Dialog r0 = r2.A00()
            X.AnonymousClass0fN.A00(r0)
            goto L_0x020d
        L_0x01cd:
            java.lang.String r0 = "FULL_WIDTH"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01d8
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x01bb
        L_0x01d8:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x01bb
        L_0x01db:
            if (r3 == 0) goto L_0x01bd
            com.instagram.common.typedurl.ImageUrl r1 = r3.A00
            goto L_0x0183
        L_0x01e0:
            r2 = 0
        L_0x01e1:
            X.5Ju r1 = r6.A06
            X.5Ju r8 = r6.A07
            if (r2 == 0) goto L_0x0211
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0211
            java.lang.String r1 = r10.getModuleName()
            r0 = 1
            r7.A08 = r0
            com.instagram.igds.components.headline.IgdsHeadline r0 = r7.A0Z
            r0.setFacepile(r2, r1)
        L_0x01f9:
            r1 = 3
            X.FHX r0 = new X.FHX
            r0.<init>(r1, r12, r11)
            r7.A0B(r0)
            X.DbT.A1V(r7)
            X.4VG r0 = r6.A00
            if (r0 == 0) goto L_0x020a
            r3 = 1
        L_0x020a:
            r7.A0r(r3)
        L_0x020d:
            r12.DbK(r11)
            return
        L_0x0211:
            boolean r0 = X.AnonymousClass3HA.A00(r9)
            if (r0 == 0) goto L_0x0235
            if (r1 == 0) goto L_0x0235
            com.instagram.common.typedurl.ImageUrl r1 = r1.A00
            boolean r0 = X.C253833rU.A02(r1)
            if (r0 != 0) goto L_0x0235
            java.lang.String r0 = r11.A0D
            boolean r0 = r4.equals(r0)
        L_0x0227:
            if (r0 == 0) goto L_0x0246
            r0 = 1
            r7.A08 = r0
            com.instagram.igds.components.headline.IgdsHeadline r0 = r7.A0Z
            r0.setImageURL(r1, r10, r5)
            r0.setVisibility(r3)
            goto L_0x01f9
        L_0x0235:
            if (r8 == 0) goto L_0x01f9
            com.instagram.common.typedurl.ImageUrl r1 = r8.A00
            boolean r0 = X.C253833rU.A02(r1)
            if (r0 != 0) goto L_0x01f9
            java.lang.String r0 = r11.A0D
            boolean r0 = r4.equals(r0)
            goto L_0x0227
        L_0x0246:
            r7.A0n(r1, r10)
            goto L_0x01f9
        L_0x024a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ep6.A00(android.content.Context, X.0iw, X.4UE, X.2bv):void");
    }
}
