package X;

/* renamed from: X.9FA  reason: invalid class name */
public abstract class AnonymousClass9FA {
    /* JADX WARNING: type inference failed for: r7v0, types: [X.9FB, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v1, types: [X.9FC, X.3mB] */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0249, code lost:
        throw new java.lang.IllegalArgumentException(r1.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass9FC A00(X.0sP r26, X.C250863mB r27) {
        /*
            r0 = 0
            r1 = r27
            X.0qQ.A0B(r1, r0)
            r3 = 1
            X.9FB r7 = new X.9FB
            r7.<init>()
            X.40P r2 = r1.A00
            boolean r0 = r2.A09
            r7.A0A = r0
            boolean r0 = r2.A0A
            r7.A0B = r0
            boolean r0 = r2.A0B
            r7.A0C = r0
            boolean r0 = r2.A0C
            r7.A0D = r0
            boolean r0 = r2.A0D
            r7.A0E = r0
            java.lang.String r0 = r2.A02
            r7.A02 = r0
            boolean r0 = r2.A07
            r7.A08 = r0
            java.lang.String r0 = r2.A01
            r7.A01 = r0
            java.lang.Integer r0 = r2.A00
            r7.A00 = r0
            boolean r0 = r2.A0E
            r7.A0F = r0
            boolean r0 = r2.A08
            r7.A09 = r0
            boolean r0 = r2.A06
            r7.A07 = r0
            boolean r0 = r2.A03
            r7.A04 = r0
            boolean r0 = r2.A04
            r7.A05 = r0
            boolean r0 = r2.A05
            r7.A06 = r0
            boolean r0 = r2.A0F
            r7.A0G = r0
            X.40R r0 = r1.A02
            r7.A03 = r0
            r0 = r26
            r0.invoke(r7)
            boolean r6 = r7.A0G
            if (r6 == 0) goto L_0x007b
            java.lang.String r1 = r7.A01
            java.lang.String r0 = "type"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0073
            java.lang.Integer r1 = r7.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x007b
            java.lang.String r1 = "useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0073:
            java.lang.String r1 = "Class discriminator should not be specified when array polymorphism is specified"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x007b:
            boolean r5 = r7.A0E
            java.lang.String r0 = "    "
            java.lang.String r4 = r7.A02
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r5 != 0) goto L_0x0091
            if (r0 != 0) goto L_0x00bd
            java.lang.String r1 = "Indent should not be specified when default printing mode is used"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0091:
            if (r0 != 0) goto L_0x00bd
            r2 = 0
        L_0x0094:
            int r0 = r4.length()
            if (r2 >= r0) goto L_0x00bd
            char r1 = r4.charAt(r2)
            r0 = 32
            if (r1 == r0) goto L_0x00ba
            r0 = 9
            if (r1 == r0) goto L_0x00ba
            r0 = 13
            if (r1 == r0) goto L_0x00ba
            r0 = 10
            if (r1 == r0) goto L_0x00ba
            java.lang.String r0 = "Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had "
            java.lang.String r1 = X.002.A0R(r0, r4)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00ba:
            int r2 = r2 + 1
            goto L_0x0094
        L_0x00bd:
            boolean r0 = r7.A0A
            r27 = r0
            boolean r0 = r7.A0C
            r26 = r0
            boolean r0 = r7.A0D
            r25 = r0
            boolean r15 = r7.A06
            boolean r14 = r7.A0B
            boolean r13 = r7.A08
            java.lang.String r12 = r7.A01
            boolean r11 = r7.A05
            boolean r10 = r7.A0F
            boolean r9 = r7.A09
            boolean r8 = r7.A07
            boolean r2 = r7.A04
            java.lang.Integer r0 = r7.A00
            X.40P r1 = new X.40P
            r21 = r10
            r22 = r9
            r23 = r8
            r24 = r2
            r18 = r13
            r19 = r6
            r20 = r11
            r16 = r5
            r17 = r14
            r11 = r12
            r12 = r27
            r13 = r26
            r14 = r25
            r8 = r1
            r9 = r0
            r10 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.40R r0 = r7.A03
            r13 = 2
            X.0qQ.A0B(r0, r13)
            X.9FC r5 = new X.9FC
            r5.<init>(r1, r0)
            X.40R r7 = r5.A02
            X.40R r0 = X.AnonymousClass40Q.A00
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 != 0) goto L_0x029e
            X.40P r0 = r5.A00
            boolean r12 = r0.A0F
            java.lang.String r11 = r0.A01
            java.util.Map r0 = r7.A00
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>"
            if (r0 == 0) goto L_0x013d
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getKey()
            r0.getValue()
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x013d:
            java.util.Map r0 = r7.A04
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r15 = r0.iterator()
        L_0x0147:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x024a
            java.lang.Object r0 = r15.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r10 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r14 = r0.iterator()
        L_0x0165:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0147
            java.lang.Object r0 = r14.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r9 = r0.getKey()
            X.0ry r9 = (X.C62230ry) r9
            java.lang.Object r1 = r0.getValue()
            X.3uA r1 = (X.C255463uA) r1
            X.0qQ.A0C(r10, r4)
            X.0qQ.A0C(r9, r4)
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>"
            X.0qQ.A0C(r1, r0)
            X.0qQ.A0B(r9, r3)
            X.0qQ.A0B(r1, r13)
            kotlinx.serialization.descriptors.SerialDescriptor r8 = r1.getDescriptor()
            X.3uF r2 = r8.BKK()
            boolean r0 = r2 instanceof X.C2591040k
            java.lang.String r6 = "Serializer for "
            if (r0 != 0) goto L_0x0220
            X.40q r0 = X.C2591640q.A00
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x0220
            if (r12 != 0) goto L_0x0165
            X.40l r0 = X.C2591140l.A00
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x01f6
            X.40m r0 = X.C2591240m.A00
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x01f6
            boolean r0 = r2 instanceof X.C255503uE
            if (r0 != 0) goto L_0x01f6
            boolean r0 = r2 instanceof X.AnonymousClass48A
            if (r0 != 0) goto L_0x01f6
            int r6 = r8.B0a()
            r1 = 0
        L_0x01c3:
            if (r1 >= r6) goto L_0x0165
            java.lang.String r2 = r8.B0V(r1)
            boolean r0 = X.0qQ.A0K(r2, r11)
            if (r0 != 0) goto L_0x01d2
            int r1 = r1 + 1
            goto L_0x01c3
        L_0x01d2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Polymorphic serializer for "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " has property '"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x01f6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            X.0Yh r9 = (X.0Yh) r9
            java.lang.Class r0 = r9.A00
            java.lang.String r0 = X.0q1.A01(r0)
            r1.append(r0)
            java.lang.String r0 = " of kind "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " cannot be serialized polymorphically with class discriminator."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0220:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            X.0Yh r9 = (X.0Yh) r9
            java.lang.Class r0 = r9.A00
            java.lang.String r0 = X.0q1.A01(r0)
            r1.append(r0)
            java.lang.String r0 = " can't be registered as a subclass for polymorphic serialization because its kind "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " is not concrete. To work with multiple hierarchies, register it as a base class."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x024a:
            java.util.Map r0 = r7.A02
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x0254:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0274
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            X.0qQ.A0C(r0, r4)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>"
            X.0qQ.A0C(r1, r0)
            X.0u4.A05(r1, r3)
            goto L_0x0254
        L_0x0274:
            java.util.Map r0 = r7.A01
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x027e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x029e
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            X.0qQ.A0C(r0, r4)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>"
            X.0qQ.A0C(r1, r0)
            X.0u4.A05(r1, r3)
            goto L_0x027e
        L_0x029e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9FA.A00(X.0sP, X.3mB):X.9FC");
    }
}
