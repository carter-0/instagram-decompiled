package X;

public final class DFC implements AnonymousClass2Kv {
    public final /* synthetic */ C361588gT A00;

    public DFC(C361588gT r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c1 A[PHI: r2 
      PHI: (r2v9 X.3lr) = (r2v8 X.3lr), (r2v11 X.3lr) binds: [B:43:0x00b1, B:45:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r14) {
        /*
            r13 = this;
            if (r14 == 0) goto L_0x0193
            java.lang.Object r9 = r14.Bny()
            X.C7c r9 = (X.C43732C7c) r9
            if (r9 == 0) goto L_0x0193
            X.C7b r0 = r9.A0E()
            if (r0 == 0) goto L_0x0160
            X.C7a r3 = r0.A0E()
            if (r3 == 0) goto L_0x0160
            X.9sc r1 = X.C391269sc.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r2 = 2
            java.lang.String r0 = "type"
            java.lang.Enum r0 = r3.getOptionalEnumField(r2, r0, r1)
            X.9sc r0 = (X.C391269sc) r0
            if (r0 == 0) goto L_0x0160
            int r1 = r0.ordinal()
            if (r1 == r2) goto L_0x015c
            r0 = 4
            if (r1 != r0) goto L_0x0160
            java.lang.String r6 = "OCULUS"
        L_0x002e:
            X.C7b r0 = r9.A0E()
            if (r0 == 0) goto L_0x0159
            X.C7a r0 = r0.A0E()
            if (r0 == 0) goto L_0x0159
            X.Bdm r3 = r0.A0E()
            if (r3 == 0) goto L_0x0159
            java.lang.Class<X.Bdl> r2 = X.C42504Bdl.class
            java.lang.String r1 = "page_info"
            r0 = -1018853287(0xffffffffc3458859, float:-197.53261)
            X.3lr r2 = r3.A02(r2, r1, r0)
            if (r2 == 0) goto L_0x0159
            r1 = 0
            java.lang.String r0 = "has_next_page"
            boolean r5 = r2.getCoercedBooleanField(r1, r0)
        L_0x0054:
            X.C7b r0 = r9.A0E()
            if (r0 == 0) goto L_0x0156
            X.C7a r0 = r0.A0E()
            if (r0 == 0) goto L_0x0156
            X.Bdm r4 = r0.A0E()
            if (r4 == 0) goto L_0x0156
            java.lang.Class<X.Bdl> r3 = X.C42504Bdl.class
            r2 = 1
            java.lang.String r1 = "page_info"
            r0 = -1018853287(0xffffffffc3458859, float:-197.53261)
            X.3lr r1 = r4.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L_0x0156
            java.lang.String r0 = "end_cursor"
            java.lang.String r4 = r1.getOptionalStringField(r2, r0)
        L_0x007a:
            X.C7b r0 = r9.A0E()
            if (r0 == 0) goto L_0x0153
            X.C7a r0 = r0.A0E()
            if (r0 == 0) goto L_0x0153
            X.Bdm r3 = r0.A0E()
            if (r3 == 0) goto L_0x0153
            java.lang.Class<X.Bdk> r2 = X.C42503Bdk.class
            r7 = 0
            java.lang.String r1 = "nodes"
            r0 = -894453359(0xffffffffcaafb991, float:-5758152.5)
            com.google.common.collect.ImmutableList r0 = r3.getRequiredCompactedTreeListField(r7, r1, r2, r0)
            if (r0 == 0) goto L_0x0153
            java.util.List r0 = X.00k.A0X(r0)
            java.lang.Object r8 = X.00k.A0L(r0)
            X.3lr r8 = (X.C250663lr) r8
            if (r8 == 0) goto L_0x0153
            java.lang.Class<X.Bdx> r2 = X.C42516Bdx.class
            java.lang.String r1 = "MetaGalleryPhoto"
            r0 = 1869172584(0x6f694f68, float:7.2206004E28)
            X.3lr r2 = r8.reinterpretIfFulfillsType(r7, r1, r2, r0)
            if (r2 != 0) goto L_0x00c1
            java.lang.Class<X.Bdy> r3 = X.C42517Bdy.class
            r2 = 1
            java.lang.String r1 = "MetaGalleryVideo"
            r0 = -1506827412(0xffffffffa62fa36c, float:-6.09368E-16)
            X.3lr r2 = r8.reinterpretIfFulfillsType(r2, r1, r3, r0)
            if (r2 == 0) goto L_0x0153
        L_0x00c1:
            java.lang.Class<X.9fo> r1 = X.C383579fo.class
            r0 = -851351358(0xffffffffcd4168c2, float:-2.02804256E8)
            X.3lr r1 = r2.A01(r1, r0)
            java.lang.String r0 = "id"
            java.lang.String r7 = r1.getRequiredStringField(r7, r0)
        L_0x00d0:
            r8 = 0
            X.C7b r0 = r9.A0E()
            if (r0 == 0) goto L_0x0163
            X.C7a r0 = r0.A0E()
            if (r0 == 0) goto L_0x0163
            X.Bdm r3 = r0.A0E()
            if (r3 == 0) goto L_0x0163
            java.lang.Class<X.Bdk> r2 = X.C42503Bdk.class
            r11 = 0
            java.lang.String r1 = "nodes"
            r0 = -894453359(0xffffffffcaafb991, float:-5758152.5)
            com.google.common.collect.ImmutableList r0 = r3.getRequiredCompactedTreeListField(r11, r1, r2, r0)
            if (r0 == 0) goto L_0x0163
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r0.iterator()
        L_0x00f9:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0163
            X.3lr r3 = X.C41845B3m.A0V(r12)
            java.lang.Class<X.Bdx> r2 = X.C42516Bdx.class
            java.lang.String r1 = "MetaGalleryPhoto"
            r0 = 1869172584(0x6f694f68, float:7.2206004E28)
            X.3lr r2 = r3.reinterpretIfFulfillsType(r11, r1, r2, r0)
            if (r2 == 0) goto L_0x0127
            java.lang.Class<X.9fo> r1 = X.C383579fo.class
            r0 = -851351358(0xffffffffcd4168c2, float:-2.02804256E8)
            X.3lr r1 = r2.A01(r1, r0)
            X.9fo r1 = (X.C383579fo) r1
            java.util.ArrayList r0 = X.C41847B3o.A1F(r2, r1)
            X.9cI r0 = X.AJ5.A01(r1, r0, r11, r11, r11)
        L_0x0123:
            r8.add(r0)
            goto L_0x00f9
        L_0x0127:
            java.lang.Class<X.Bdy> r2 = X.C42517Bdy.class
            r10 = 1
            java.lang.String r1 = "MetaGalleryVideo"
            r0 = -1506827412(0xffffffffa62fa36c, float:-6.09368E-16)
            X.3lr r9 = r3.reinterpretIfFulfillsType(r10, r1, r2, r0)
            if (r9 == 0) goto L_0x00f9
            java.lang.Class<X.9fo> r1 = X.C383579fo.class
            r0 = -851351358(0xffffffffcd4168c2, float:-2.02804256E8)
            X.3lr r3 = r9.A01(r1, r0)
            X.9fo r3 = (X.C383579fo) r3
            java.util.ArrayList r2 = X.C41847B3o.A1F(r9, r3)
            java.lang.String r0 = "duration"
            boolean r1 = r9.hasFieldValue(r0)
            int r0 = r9.getCoercedIntField(r10, r0)
            X.9cI r0 = X.AJ5.A01(r3, r2, r0, r10, r1)
            goto L_0x0123
        L_0x0153:
            r7 = 0
            goto L_0x00d0
        L_0x0156:
            r4 = 0
            goto L_0x007a
        L_0x0159:
            r5 = 0
            goto L_0x0054
        L_0x015c:
            java.lang.String r6 = "HORIZON"
            goto L_0x002e
        L_0x0160:
            r6 = 0
            goto L_0x002e
        L_0x0163:
            if (r6 == 0) goto L_0x0193
            if (r8 == 0) goto L_0x0193
            X.8gT r0 = r13.A00
            X.05G r3 = r0.A02
            java.lang.Object r0 = r3.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.util.LinkedHashMap r2 = X.0Yt.A03(r0)
            java.lang.Object r0 = r2.get(r6)
            X.8gX r0 = (X.C361628gX) r0
            java.util.Set r1 = X.00k.A0k(r8)
            if (r0 == 0) goto L_0x0187
            java.util.Set r0 = r0.A02
            java.util.LinkedHashSet r1 = X.094.A00(r1, r0)
        L_0x0187:
            X.8gX r0 = new X.8gX
            r0.<init>(r4, r7, r1, r5)
            java.util.Map r0 = X.C41845B3m.A0u(r6, r0, r2)
            r3.Epw(r0)
        L_0x0193:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DFC.invoke(X.3JD):void");
    }
}
