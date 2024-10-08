package X;

public final class DFD implements AnonymousClass2Kv {
    public final /* synthetic */ C361588gT A00;

    public DFD(C361588gT r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x015e, code lost:
        if (r13 != null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0163, code lost:
        if (r13 != null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0168, code lost:
        if (r13 != null) goto L_0x00cd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r13) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x015d
            X.3lr r3 = X.C41845B3m.A0U(r13)
            if (r3 == 0) goto L_0x015d
            java.lang.Class<X.Bdv> r2 = X.C42514Bdv.class
            java.lang.String r1 = "meta_gallery"
            r0 = 2036658556(0x7964f17c, float:7.429635E34)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x015d
            java.lang.Class<X.Bdu> r2 = X.C42513Bdu.class
            java.lang.String r1 = "recents(first:$first)"
            r0 = -591344240(0xffffffffdcc0cd90, float:-4.34153711E17)
            X.3lr r4 = r3.A03(r2, r1, r0)
            if (r4 == 0) goto L_0x015d
            java.lang.Class<X.Bdt> r3 = X.C42512Bdt.class
            r2 = 1
            java.lang.String r1 = "page_info"
            r0 = 1162941849(0x45511599, float:3345.3499)
            X.3lr r1 = r4.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L_0x015d
            java.lang.String r0 = "has_next_page"
            boolean r5 = r1.getCoercedBooleanField(r2, r0)
        L_0x0036:
            X.3lr r3 = X.C41845B3m.A0U(r13)
            if (r3 == 0) goto L_0x0162
            java.lang.Class<X.Bdv> r2 = X.C42514Bdv.class
            java.lang.String r1 = "meta_gallery"
            r0 = 2036658556(0x7964f17c, float:7.429635E34)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x0162
            java.lang.Class<X.Bdu> r2 = X.C42513Bdu.class
            java.lang.String r1 = "recents(first:$first)"
            r0 = -591344240(0xffffffffdcc0cd90, float:-4.34153711E17)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x0162
            java.lang.Class<X.Bdt> r2 = X.C42512Bdt.class
            java.lang.String r1 = "page_info"
            r0 = 1162941849(0x45511599, float:3345.3499)
            X.3lr r1 = r3.A02(r2, r1, r0)
            if (r1 == 0) goto L_0x0162
            java.lang.String r0 = "end_cursor"
            java.lang.String r4 = r1.A07(r0)
        L_0x0069:
            X.3lr r3 = X.C41845B3m.A0U(r13)
            if (r3 == 0) goto L_0x0167
            java.lang.Class<X.Bdv> r2 = X.C42514Bdv.class
            java.lang.String r1 = "meta_gallery"
            r0 = 2036658556(0x7964f17c, float:7.429635E34)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x0167
            java.lang.Class<X.Bdu> r2 = X.C42513Bdu.class
            java.lang.String r1 = "recents(first:$first)"
            r0 = -591344240(0xffffffffdcc0cd90, float:-4.34153711E17)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x0167
            java.lang.Class<X.Bds> r2 = X.C42511Bds.class
            r6 = 0
            java.lang.String r1 = "nodes"
            r0 = 237955598(0xe2eea0e, float:2.155985E-30)
            com.google.common.collect.ImmutableList r0 = r3.getRequiredCompactedTreeListField(r6, r1, r2, r0)
            if (r0 == 0) goto L_0x0167
            java.util.List r0 = X.00k.A0X(r0)
            java.lang.Object r7 = X.00k.A0L(r0)
            X.3lr r7 = (X.C250663lr) r7
            if (r7 == 0) goto L_0x0167
            java.lang.Class<X.Bdx> r2 = X.C42516Bdx.class
            java.lang.String r1 = "MetaGalleryPhoto"
            r0 = 1869172584(0x6f694f68, float:7.2206004E28)
            X.3lr r2 = r7.reinterpretIfFulfillsType(r6, r1, r2, r0)
            if (r2 != 0) goto L_0x00be
            java.lang.Class<X.Bdy> r3 = X.C42517Bdy.class
            r2 = 1
            java.lang.String r1 = "MetaGalleryVideo"
            r0 = -1506827412(0xffffffffa62fa36c, float:-6.09368E-16)
            X.3lr r2 = r7.reinterpretIfFulfillsType(r2, r1, r3, r0)
            if (r2 == 0) goto L_0x0167
        L_0x00be:
            java.lang.Class<X.9fo> r1 = X.C383579fo.class
            r0 = -851351358(0xffffffffcd4168c2, float:-2.02804256E8)
            X.3lr r1 = r2.A01(r1, r0)
            java.lang.String r0 = "id"
            java.lang.String r6 = r1.getRequiredStringField(r6, r0)
        L_0x00cd:
            X.3lr r3 = X.C41845B3m.A0U(r13)
            if (r3 == 0) goto L_0x016c
            java.lang.Class<X.Bdv> r2 = X.C42514Bdv.class
            java.lang.String r1 = "meta_gallery"
            r0 = 2036658556(0x7964f17c, float:7.429635E34)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x016c
            java.lang.Class<X.Bdu> r2 = X.C42513Bdu.class
            java.lang.String r1 = "recents(first:$first)"
            r0 = -591344240(0xffffffffdcc0cd90, float:-4.34153711E17)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x016c
            java.lang.Class<X.Bds> r2 = X.C42511Bds.class
            r10 = 0
            java.lang.String r1 = "nodes"
            r0 = 237955598(0xe2eea0e, float:2.155985E-30)
            com.google.common.collect.ImmutableList r0 = r3.getRequiredCompactedTreeListField(r10, r1, r2, r0)
            if (r0 == 0) goto L_0x016c
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r11 = r0.iterator()
        L_0x0103:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0170
            X.3lr r3 = X.C41845B3m.A0V(r11)
            java.lang.Class<X.Bdx> r2 = X.C42516Bdx.class
            java.lang.String r1 = "MetaGalleryPhoto"
            r0 = 1869172584(0x6f694f68, float:7.2206004E28)
            X.3lr r2 = r3.reinterpretIfFulfillsType(r10, r1, r2, r0)
            if (r2 == 0) goto L_0x0131
            java.lang.Class<X.9fo> r1 = X.C383579fo.class
            r0 = -851351358(0xffffffffcd4168c2, float:-2.02804256E8)
            X.3lr r1 = r2.A01(r1, r0)
            X.9fo r1 = (X.C383579fo) r1
            java.util.ArrayList r0 = X.C41847B3o.A1F(r2, r1)
            X.9cI r0 = X.AJ5.A01(r1, r0, r10, r10, r10)
        L_0x012d:
            r8.add(r0)
            goto L_0x0103
        L_0x0131:
            java.lang.Class<X.Bdy> r2 = X.C42517Bdy.class
            r9 = 1
            java.lang.String r1 = "MetaGalleryVideo"
            r0 = -1506827412(0xffffffffa62fa36c, float:-6.09368E-16)
            X.3lr r7 = r3.reinterpretIfFulfillsType(r9, r1, r2, r0)
            if (r7 == 0) goto L_0x0103
            java.lang.Class<X.9fo> r1 = X.C383579fo.class
            r0 = -851351358(0xffffffffcd4168c2, float:-2.02804256E8)
            X.3lr r3 = r7.A01(r1, r0)
            X.9fo r3 = (X.C383579fo) r3
            java.util.ArrayList r2 = X.C41847B3o.A1F(r7, r3)
            java.lang.String r0 = "duration"
            boolean r1 = r7.hasFieldValue(r0)
            int r0 = r7.getCoercedIntField(r9, r0)
            X.9cI r0 = X.AJ5.A01(r3, r2, r0, r9, r1)
            goto L_0x012d
        L_0x015d:
            r5 = 0
            if (r13 == 0) goto L_0x0162
            goto L_0x0036
        L_0x0162:
            r4 = 0
            if (r13 == 0) goto L_0x0167
            goto L_0x0069
        L_0x0167:
            r6 = 0
            if (r13 == 0) goto L_0x016c
            goto L_0x00cd
        L_0x016c:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
        L_0x0170:
            X.8gT r1 = r12.A00
            com.instagram.common.session.UserSession r0 = r1.A01
            X.C361618gW.A00(r0, r8)
            X.05G r2 = r1.A04
            java.util.Set r1 = X.00k.A0k(r8)
            X.8gX r0 = new X.8gX
            r0.<init>(r4, r6, r1, r5)
            r2.Epw(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DFD.invoke(X.3JD):void");
    }
}
