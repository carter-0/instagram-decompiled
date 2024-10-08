package X;

public final class F22 {
    public final C51959G9f A00;
    public final JS9 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0132, code lost:
        if (r6.equals(r0) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0134, code lost:
        r5.A00.DNW(new X.C47179Dru(r3), r8, r4.A00("selected_filters"), r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0144, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01c4, code lost:
        if (r6.equals(r0) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01c6, code lost:
        r5.A00.Da5((android.graphics.RectF) null, new X.C47179Dru(r3), r8, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01d0, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(X.JV7 r19, X.C283155Gi r20, com.instagram.newsfeed.ui.InlineLinkUrn r21, int r22) {
        /*
            r18 = this;
            r1 = 0
            r8 = r20
            r4 = r21
            boolean r2 = X.AnonymousClass7TF.A1U(r1, r4, r8)
            X.Exr r3 = new X.Exr
            r11 = r22
            r3.<init>(r11)
            X.EVf r0 = X.C48087EVf.SPANNABLE_TEXT
            r3.A01 = r0
            r0 = r19
            r3.A00 = r0
            X.0eM r0 = r4.A03
            java.lang.String r0 = X.DbS.A0t(r0)
            r13 = 0
            if (r0 == 0) goto L_0x0030
            java.lang.String r6 = X.AnonymousClass7TF.A0j(r0)
            int r0 = r6.hashCode()
            java.lang.String r7 = "id"
            r5 = r18
            switch(r0) {
                case -1649029848: goto L_0x0031;
                case -1429847026: goto L_0x0054;
                case -1274256918: goto L_0x0067;
                case -1246634293: goto L_0x006b;
                case -1120985297: goto L_0x0086;
                case -685161887: goto L_0x0099;
                case -450714213: goto L_0x00ac;
                case -437440590: goto L_0x00bf;
                case -252296542: goto L_0x00d4;
                case 114586: goto L_0x00d7;
                case 3599307: goto L_0x00fe;
                case 8324987: goto L_0x012c;
                case 459175329: goto L_0x0145;
                case 697547724: goto L_0x0158;
                case 950345194: goto L_0x0171;
                case 1901043637: goto L_0x018a;
                case 1923678475: goto L_0x01a3;
                case 2022102548: goto L_0x01be;
                default: goto L_0x0030;
            }
        L_0x0030:
            return r1
        L_0x0031:
            java.lang.String r0 = "bloks_action"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = "bloks_app_id"
            java.lang.String r9 = r4.A00(r0)
            if (r9 == 0) goto L_0x0030
            java.lang.String r0 = "params"
            java.lang.String r10 = r4.A00(r0)
            if (r10 == 0) goto L_0x0030
            X.G9f r6 = r5.A00
            X.Dru r7 = new X.Dru
            r7.<init>(r3)
            r6.CyR(r7, r8, r9, r10, r11)
            return r2
        L_0x0054:
            java.lang.String r0 = "destination"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0030
            X.G9f r1 = r5.A00
            X.Dru r0 = new X.Dru
            r0.<init>(r3)
            r1.DgD(r0, r8, r11)
            return r2
        L_0x0067:
            java.lang.String r0 = "photomap"
            goto L_0x01c0
        L_0x006b:
            java.lang.String r0 = "live_likers"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = "broadcast_id"
            java.lang.String r4 = r4.A00(r0)
            if (r4 == 0) goto L_0x0030
            X.G9f r1 = r5.A00
            X.Dru r0 = new X.Dru
            r0.<init>(r3)
            r1.DNt(r0, r8, r4, r11)
            return r2
        L_0x0086:
            java.lang.String r0 = "comment_count"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0030
            X.G9f r1 = r5.A00
            X.Dru r0 = new X.Dru
            r0.<init>(r3)
            r1.D4m(r0, r8, r11)
            return r2
        L_0x0099:
            java.lang.String r0 = "story_viewer_list"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0030
            X.G9f r1 = r5.A00
            X.Dru r0 = new X.Dru
            r0.<init>(r3)
            r1.DcN(r13, r0, r8, r11)
            return r2
        L_0x00ac:
            java.lang.String r0 = "comment_like_count_chrono"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0030
            X.G9f r1 = r5.A00
            X.Dru r0 = new X.Dru
            r0.<init>(r3)
            r1.D4p(r0, r8, r11)
            return r2
        L_0x00bf:
            java.lang.String r0 = "expand_text"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0030
            X.JS9 r12 = r5.A01
            X.EVf r15 = X.C48087EVf.EXPAND_TEXT
            r14 = r13
            r16 = r8
            r17 = r11
            r12.D29(r13, r14, r15, r16, r17)
            return r2
        L_0x00d4:
            java.lang.String r0 = "liker_list"
            goto L_0x012e
        L_0x00d7:
            java.lang.String r0 = "tag"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.String r3 = r4.A01
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0030
            java.lang.String r3 = r3.substring(r2)
            X.0qQ.A07(r3)
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0030
            X.G9f r1 = r5.A00
            com.instagram.model.hashtag.HashtagImpl r0 = X.C281965Ag.A00(r3)
            r1.DGb(r0, r8, r11)
            return r2
        L_0x00fe:
            java.lang.String r0 = "user"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = X.Dbj.A03()
            java.lang.String r6 = r4.A00(r0)
            if (r6 == 0) goto L_0x011b
            X.G9f r1 = r5.A00
            X.Dru r0 = new X.Dru
            r0.<init>(r3)
            r1.Dwg(r0, r8, r6, r11)
            return r2
        L_0x011b:
            java.lang.String r4 = r4.A00(r7)
            if (r4 == 0) goto L_0x0030
            X.G9f r1 = r5.A00
            X.Dru r0 = new X.Dru
            r0.<init>(r3)
            r1.Dw6(r0, r8, r4, r11)
            return r2
        L_0x012c:
            java.lang.String r0 = "like_count_chrono"
        L_0x012e:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0030
            X.G9f r5 = r5.A00
            java.lang.String r0 = "selected_filters"
            java.lang.String r1 = r4.A00(r0)
            X.Dru r0 = new X.Dru
            r0.<init>(r3)
            r5.DNW(r0, r8, r1, r11)
            return r2
        L_0x0145:
            java.lang.String r0 = "follow_count_chrono"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0030
            X.G9f r1 = r5.A00
            X.Dru r0 = new X.Dru
            r0.<init>(r3)
            r1.DGV(r0, r8, r11)
            return r2
        L_0x0158:
            java.lang.String r0 = "hashtag"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.String r4 = r4.A00(r7)
            if (r4 == 0) goto L_0x0030
            X.G9f r1 = r5.A00
            X.Dru r0 = new X.Dru
            r0.<init>(r3)
            r1.DIg(r0, r8, r4, r11)
            return r2
        L_0x0171:
            java.lang.String r0 = "mention"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.String r4 = r4.A00(r7)
            if (r4 == 0) goto L_0x0030
            X.G9f r1 = r5.A00
            X.Dru r0 = new X.Dru
            r0.<init>(r3)
            r1.DRD(r0, r8, r4, r11)
            return r2
        L_0x018a:
            java.lang.String r0 = "location"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.String r4 = r4.A00(r7)
            if (r4 == 0) goto L_0x0030
            X.G9f r1 = r5.A00
            X.Dru r0 = new X.Dru
            r0.<init>(r3)
            r1.DOj(r0, r8, r4, r11)
            return r2
        L_0x01a3:
            java.lang.String r0 = "user_group"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = "category"
            java.lang.String r0 = r4.A00(r0)
            if (r0 == 0) goto L_0x0030
            X.G9f r1 = r5.A00
            X.Dru r0 = new X.Dru
            r0.<init>(r3)
            r1.DwF(r0, r8, r11)
            return r2
        L_0x01be:
            java.lang.String r0 = "profile_image_destination"
        L_0x01c0:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0030
            X.G9f r1 = r5.A00
            X.Dru r0 = new X.Dru
            r0.<init>(r3)
            r1.Da5(r13, r0, r8, r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F22.A00(X.JV7, X.5Gi, com.instagram.newsfeed.ui.InlineLinkUrn, int):boolean");
    }

    public F22(C51959G9f g9f, JS9 js9) {
        AnonymousClass7TG.A1O(g9f, js9);
        this.A00 = g9f;
        this.A01 = js9;
    }
}
