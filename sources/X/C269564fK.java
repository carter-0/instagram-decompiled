package X;

/* renamed from: X.4fK  reason: invalid class name and case insensitive filesystem */
public abstract class C269564fK {
    public final C268894eF A06(C268894eF r4) {
        C269624fQ[] r2 = ((C269554fJ) this).A00.A00;
        if (r2.length > 0) {
            AnonymousClass5E8 r1 = new AnonymousClass5E8(r2);
            if (r1.hasNext()) {
                r1.next();
                throw new NullPointerException("findTypeMapping");
            }
        }
        return r4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: X.Qlt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: X.Qlt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.fasterxml.jackson.databind.deser.std.CollectionDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: com.fasterxml.jackson.databind.deser.AbstractDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: X.4eF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: X.Qlt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: com.fasterxml.jackson.datatype.guava.deser.GuavaCollectionDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: com.fasterxml.jackson.datatype.guava.deser.GuavaCollectionDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: com.fasterxml.jackson.datatype.guava.deser.GuavaCollectionDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: com.fasterxml.jackson.datatype.guava.deser.GuavaCollectionDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: com.fasterxml.jackson.datatype.guava.deser.GuavaCollectionDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: com.fasterxml.jackson.datatype.guava.deser.GuavaCollectionDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: com.fasterxml.jackson.datatype.guava.deser.GuavaCollectionDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: com.fasterxml.jackson.datatype.guava.deser.GuavaCollectionDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v79, resolved type: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer} */
    /* JADX WARNING: type inference failed for: r8v7, types: [com.fasterxml.jackson.databind.JsonDeserializer] */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x020d, code lost:
        if (r1.contains("List") != false) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x022e, code lost:
        if (r2.contains("Set") != false) goto L_0x0230;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonDeserializer A07(X.C269674fV r17, X.C269134ed r18, X.Qlt r19) {
        /*
            r16 = this;
            r9 = r19
            r6 = r18
            r7 = r16
            X.4fJ r7 = (X.C269554fJ) r7
            X.4eF r3 = r9.A00
            java.lang.Object r10 = r3.A02
            com.fasterxml.jackson.databind.JsonDeserializer r10 = (com.fasterxml.jackson.databind.JsonDeserializer) r10
            r8 = r17
            X.4f9 r5 = r8.A02
            java.lang.Object r14 = r3.A01
            X.SJg r14 = (X.C11287SJg) r14
            if (r14 != 0) goto L_0x001c
            X.QkY r14 = r7.A08(r5, r3)
        L_0x001c:
            X.4fN r0 = r7.A00
            X.4fO[] r1 = r0.A02
            X.5E8 r4 = new X.5E8
            r4.<init>(r1)
        L_0x0025:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x00ff
            java.lang.Object r1 = r4.next()
            X.4fO r1 = (X.C269604fO) r1
            boolean r1 = r1 instanceof X.AnonymousClass4iH
            if (r1 == 0) goto L_0x0025
            java.lang.Class r2 = r9.A00
            java.lang.Class<com.google.common.collect.ImmutableCollection> r1 = com.google.common.collect.ImmutableCollection.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x00b8
            java.lang.Class<com.google.common.collect.ImmutableList> r1 = com.google.common.collect.ImmutableList.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 != 0) goto L_0x00af
            java.lang.Class<com.google.common.collect.ImmutableMultiset> r1 = com.google.common.collect.ImmutableMultiset.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x0088
            java.lang.Class<com.google.common.collect.ImmutableSortedMultiset> r1 = com.google.common.collect.ImmutableSortedMultiset.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x007f
            java.lang.String r1 = "ImmutableSortedMultiset"
            X.AnonymousClass4iH.A00(r9, r1)
            r11 = 0
            com.fasterxml.jackson.datatype.guava.deser.ImmutableSortedMultisetDeserializer r8 = new com.fasterxml.jackson.datatype.guava.deser.ImmutableSortedMultisetDeserializer
            r12 = r14
            r13 = r11
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x0064:
            X.4fP[] r2 = r0.A01
            int r0 = r2.length
            if (r0 <= 0) goto L_0x0154
            X.5E8 r1 = new X.5E8
            r1.<init>(r2)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0154
            r1.next()
            java.lang.String r0 = "modifyCollectionDeserializer"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x007f:
            r11 = 0
            com.fasterxml.jackson.datatype.guava.deser.ImmutableMultisetDeserializer r8 = new com.fasterxml.jackson.datatype.guava.deser.ImmutableMultisetDeserializer
            r12 = r14
            r13 = r11
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x0064
        L_0x0088:
            java.lang.Class<com.google.common.collect.ImmutableSet> r1 = com.google.common.collect.ImmutableSet.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x00af
            java.lang.Class<com.google.common.collect.ImmutableSortedSet> r1 = com.google.common.collect.ImmutableSortedSet.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x00a6
            java.lang.String r1 = "ImmutableSortedSet"
            X.AnonymousClass4iH.A00(r9, r1)
            r11 = 0
            com.fasterxml.jackson.datatype.guava.deser.ImmutableSortedSetDeserializer r8 = new com.fasterxml.jackson.datatype.guava.deser.ImmutableSortedSetDeserializer
            r12 = r14
            r13 = r11
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x0064
        L_0x00a6:
            r11 = 0
            com.fasterxml.jackson.datatype.guava.deser.ImmutableSetDeserializer r8 = new com.fasterxml.jackson.datatype.guava.deser.ImmutableSetDeserializer
            r12 = r14
            r13 = r11
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x0064
        L_0x00af:
            r11 = 0
            com.fasterxml.jackson.datatype.guava.deser.ImmutableListDeserializer r8 = new com.fasterxml.jackson.datatype.guava.deser.ImmutableListDeserializer
            r12 = r14
            r13 = r11
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x0064
        L_0x00b8:
            java.lang.Class<X.3W6> r1 = X.AnonymousClass3W6.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x0025
            java.lang.Class<X.TmM> r1 = X.C13959TmM.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x00d6
            java.lang.Class<com.google.common.collect.TreeMultiset> r1 = com.google.common.collect.TreeMultiset.class
            r1.isAssignableFrom(r2)
            r11 = 0
            com.fasterxml.jackson.datatype.guava.deser.TreeMultisetDeserializer r8 = new com.fasterxml.jackson.datatype.guava.deser.TreeMultisetDeserializer
            r12 = r14
            r13 = r11
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x0064
        L_0x00d6:
            java.lang.Class<com.google.common.collect.LinkedHashMultiset> r1 = com.google.common.collect.LinkedHashMultiset.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x00e8
            r11 = 0
            com.fasterxml.jackson.datatype.guava.deser.LinkedHashMultisetDeserializer r8 = new com.fasterxml.jackson.datatype.guava.deser.LinkedHashMultisetDeserializer
            r12 = r14
            r13 = r11
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x0064
        L_0x00e8:
            java.lang.Class<com.google.common.collect.HashMultiset> r1 = com.google.common.collect.HashMultiset.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 != 0) goto L_0x00f5
            java.lang.Class<com.google.common.collect.EnumMultiset> r1 = com.google.common.collect.EnumMultiset.class
            r1.isAssignableFrom(r2)
        L_0x00f5:
            r11 = 0
            com.fasterxml.jackson.datatype.guava.deser.HashMultisetDeserializer r8 = new com.fasterxml.jackson.datatype.guava.deser.HashMultisetDeserializer
            r12 = r14
            r13 = r11
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x0064
        L_0x00ff:
            java.lang.Class r4 = r9.A00
            if (r10 != 0) goto L_0x0112
            java.lang.Class<java.util.EnumSet> r1 = java.util.EnumSet.class
            boolean r1 = r1.isAssignableFrom(r4)
            if (r1 == 0) goto L_0x0112
            com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer r8 = new com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer
            r8.<init>(r3)
            goto L_0x0064
        L_0x0112:
            boolean r1 = r4.isInterface()
            if (r1 != 0) goto L_0x011e
            boolean r1 = r9.A0L()
            if (r1 == 0) goto L_0x013c
        L_0x011e:
            java.util.HashMap r2 = X.C11148SCd.A00
            java.lang.String r1 = r4.getName()
            java.lang.Object r4 = r2.get(r1)
            java.lang.Class r4 = (java.lang.Class) r4
            if (r4 == 0) goto L_0x0256
            X.4eS r1 = r5.A01
            X.4eE r2 = r1.A07
            r1 = 1
            X.4eF r1 = r2.A05(r9, r4, r1)
            if (r1 == 0) goto L_0x0256
            X.4ed r6 = r5.A0C(r1)
            r9 = r1
        L_0x013c:
            X.SK6 r13 = r7.A0B(r8, r6)
            boolean r1 = r13.A0L()
            if (r1 != 0) goto L_0x0238
            java.lang.Class<java.util.concurrent.ArrayBlockingQueue> r2 = java.util.concurrent.ArrayBlockingQueue.class
            java.lang.Class r1 = r9.A00
            if (r1 != r2) goto L_0x0155
            r11 = 0
            com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer r8 = new com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer
            r12 = r11
            r15 = r11
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
        L_0x0154:
            return r8
        L_0x0155:
            java.lang.String r2 = r1.getName()
            java.lang.String r1 = "java.util."
            boolean r1 = r2.startsWith(r1)
            if (r1 == 0) goto L_0x0238
            java.lang.String r1 = "java.util.Collections$"
            boolean r1 = r2.startsWith(r1)
            if (r1 == 0) goto L_0x0235
            r1 = 22
            java.lang.String r6 = r2.substring(r1)
        L_0x016f:
            java.lang.String r4 = "Set"
            java.lang.String r5 = "List"
            if (r6 == 0) goto L_0x01f9
            java.lang.String r1 = "Unmodifiable"
            boolean r1 = r6.startsWith(r1)
            if (r1 == 0) goto L_0x01a3
            r1 = 12
            java.lang.String r2 = r6.substring(r1)
            if (r2 == 0) goto L_0x01a3
            boolean r1 = r2.endsWith(r4)
            if (r1 != 0) goto L_0x0230
            boolean r1 = r2.endsWith(r5)
            if (r1 == 0) goto L_0x0238
            r2 = 5
            java.lang.Class<java.util.List> r0 = java.util.List.class
        L_0x0194:
            X.4eF r1 = r9.A0B(r0)
            X.Sug r0 = new X.Sug
            r0.<init>(r1, r2)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer r8 = new com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer
            r8.<init>(r0)
            return r8
        L_0x01a3:
            java.lang.String r1 = "Singleton"
            boolean r1 = r6.startsWith(r1)
            if (r1 == 0) goto L_0x01c7
            r1 = 9
            java.lang.String r2 = r6.substring(r1)
            if (r2 == 0) goto L_0x01c7
            boolean r1 = r2.endsWith(r4)
            if (r1 == 0) goto L_0x01bd
            r2 = 1
            java.lang.Class<java.util.Set> r0 = java.util.Set.class
            goto L_0x0194
        L_0x01bd:
            boolean r1 = r2.endsWith(r5)
            if (r1 == 0) goto L_0x0238
            r2 = 2
            java.lang.Class<java.util.List> r0 = java.util.List.class
            goto L_0x0194
        L_0x01c7:
            java.lang.String r1 = "Synchronized"
            boolean r1 = r6.startsWith(r1)
            if (r1 == 0) goto L_0x0238
            r1 = 12
            java.lang.String r2 = r6.substring(r1)
            if (r2 == 0) goto L_0x0238
            boolean r1 = r2.endsWith(r4)
            if (r1 == 0) goto L_0x01e1
            r2 = 7
            java.lang.Class<java.util.Set> r0 = java.util.Set.class
            goto L_0x0194
        L_0x01e1:
            boolean r1 = r2.endsWith(r5)
            if (r1 == 0) goto L_0x01ec
            r2 = 9
            java.lang.Class<java.util.List> r0 = java.util.List.class
            goto L_0x0194
        L_0x01ec:
            java.lang.String r1 = "Collection"
            boolean r1 = r2.endsWith(r1)
            if (r1 == 0) goto L_0x0238
            r2 = 8
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            goto L_0x0194
        L_0x01f9:
            java.lang.String r1 = "java.util.Arrays$"
            boolean r1 = r2.startsWith(r1)
            if (r1 == 0) goto L_0x0214
            r1 = 17
            java.lang.String r1 = r2.substring(r1)
            if (r1 == 0) goto L_0x0214
            boolean r1 = r1.contains(r5)
            if (r1 == 0) goto L_0x0238
        L_0x020f:
            java.lang.Class<java.util.List> r0 = java.util.List.class
            r2 = 11
            goto L_0x0194
        L_0x0214:
            java.lang.String r1 = "java.util.ImmutableCollections$"
            boolean r1 = r2.startsWith(r1)
            if (r1 == 0) goto L_0x0238
            r1 = 31
            java.lang.String r2 = r2.substring(r1)
            if (r2 == 0) goto L_0x0238
            boolean r1 = r2.contains(r5)
            if (r1 != 0) goto L_0x020f
            boolean r1 = r2.contains(r4)
            if (r1 == 0) goto L_0x0238
        L_0x0230:
            java.lang.Class<java.util.Set> r0 = java.util.Set.class
            r2 = 4
            goto L_0x0194
        L_0x0235:
            r6 = 0
            goto L_0x016f
        L_0x0238:
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class r1 = r3.A00
            if (r1 != r2) goto L_0x024c
            r3 = 0
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer r8 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r10
            r6 = r13
            r7 = r3
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x0064
        L_0x024c:
            r11 = 0
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer r8 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
            r12 = r11
            r15 = r11
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0064
        L_0x0256:
            java.lang.Object r1 = r9.A01
            if (r1 == 0) goto L_0x0261
            com.fasterxml.jackson.databind.deser.AbstractDeserializer r8 = new com.fasterxml.jackson.databind.deser.AbstractDeserializer
            r8.<init>(r6)
            goto L_0x0064
        L_0x0261:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Cannot find a deserializer for non-concrete Collection type "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269564fK.A07(X.4fV, X.4ed, X.Qlt):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder} */
    /* JADX WARNING: type inference failed for: r1v6, types: [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C8225QkY A08(X.C269454f9 r8, X.C268894eF r9) {
        /*
            r7 = this;
            java.lang.Class r6 = r9.A00
            X.4ed r0 = r8.A03(r6)
            X.4eV r2 = r0.A07
            X.4eA r0 = r8.A01()
            X.Tg5 r1 = r0.A0K(r8, r2)
            r3 = 0
            if (r1 != 0) goto L_0x005d
            X.4eS r0 = r8.A01
            X.Tg5 r1 = r0.A06
            if (r1 == 0) goto L_0x0079
            r4 = r3
        L_0x001a:
            r5 = r1
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder r5 = (com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder) r5
            java.lang.Class r0 = r5._defaultImpl
            if (r0 != 0) goto L_0x0064
            boolean r0 = r9.A0L()
            if (r0 == 0) goto L_0x0064
            X.4eF r0 = r7.A06(r9)
            if (r0 == 0) goto L_0x0064
            java.lang.Class r2 = r0.A00
            if (r2 == r6) goto L_0x0064
            java.lang.Class r0 = r5._defaultImpl
            if (r0 == r2) goto L_0x005b
            java.lang.Class<com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder> r1 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.class
            java.lang.String r0 = "withDefaultImpl"
            X.C269574fL.A0E(r1, r5, r0)
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder r1 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder
            r1.<init>()
            r0 = 0
            r1._typeIdVisible = r0
            X.RFD r0 = r5._idType
            r1._idType = r0
            X.REQ r0 = r5._includeAs
            r1._includeAs = r0
            java.lang.String r0 = r5._typeProperty
            r1._typeProperty = r0
            boolean r0 = r5._typeIdVisible
            r1._typeIdVisible = r0
            X.ThU r0 = r5._customIdResolver
            r1._customIdResolver = r0
            r1._defaultImpl = r2
            r5 = r1
        L_0x005b:
            r1 = r5
            goto L_0x0064
        L_0x005d:
            X.4ef r0 = r8.A03
            java.util.ArrayList r4 = r0.A03(r8, r2)
            goto L_0x001a
        L_0x0064:
            X.QkY r3 = r1.AEd(r8, r9, r4)     // Catch:{ IllegalArgumentException -> 0x006b, IllegalStateException -> 0x0069 }
            return r3
        L_0x0069:
            r2 = move-exception
            goto L_0x006c
        L_0x006b:
            r2 = move-exception
        L_0x006c:
            java.lang.String r1 = X.C269574fL.A09(r2)
            X.Qi4 r0 = new X.Qi4
            r0.<init>((X.16F) r3, (X.C268894eF) r9, (java.lang.String) r1)
            r0.initCause(r2)
            throw r0
        L_0x0079:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269564fK.A08(X.4f9, X.4eF):X.QkY");
    }
}
