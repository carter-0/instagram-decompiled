package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Oqd  reason: case insensitive filesystem */
public final class C71777Oqd implements 0bL {
    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:205)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        */
    public final void Cul(android.content.Context r20, android.content.Intent r21, android.content.Intent r22, X.C59820bP r23, java.lang.Integer r24) {
        /*
            r19 = this;
            r7 = 1
            r3 = r24
            X.0qQ.A0B(r3, r7)
            java.lang.Object r1 = X.O51.A01
            monitor-enter(r1)
            X.OTR r8 = X.O51.A00     // Catch:{ all -> 0x02c1 }
            monitor-exit(r1)
            if (r8 == 0) goto L_0x02c0
            r18 = 0
            int r1 = r8.A00
            if (r1 <= 0) goto L_0x02c0
            java.util.Random r0 = r8.A03
            int r0 = r0.nextInt(r1)
            if (r0 != 0) goto L_0x02c0
            android.net.Uri r6 = r22.getData()
            if (r6 == 0) goto L_0x02c0
            java.lang.String r0 = r6.getAuthority()
            if (r0 == 0) goto L_0x02c0
            java.lang.String r0 = r6.getScheme()
            if (r0 == 0) goto L_0x02c0
            java.lang.String r1 = r6.getScheme()
            r2 = 2
            if (r1 == 0) goto L_0x00db
            java.lang.String r0 = "http"
            boolean r17 = X.C66580MXl.A1a(r0, r7, r1)
            if (r17 != 0) goto L_0x00dd
            java.lang.String r5 = r6.getAuthority()
        L_0x0041:
            int r0 = r3.intValue()
            switch(r0) {
                case 1: goto L_0x00b8;
                case 2: goto L_0x00bb;
                case 3: goto L_0x00be;
                case 4: goto L_0x00c1;
                case 5: goto L_0x00c4;
                case 6: goto L_0x00cb;
                case 7: goto L_0x00cf;
                case 8: goto L_0x00d3;
                case 9: goto L_0x00d7;
                default: goto L_0x0048;
            }
        L_0x0048:
            java.lang.String r12 = "INTERNAL"
        L_0x004a:
            X.OKc r4 = r8.A01
            r9 = 3
            java.lang.String r3 = ""
            r1 = r5
            if (r5 != 0) goto L_0x0053
            r1 = r3
        L_0x0053:
            java.lang.String r0 = r6.getScheme()
            if (r0 != 0) goto L_0x005a
            r0 = r3
        L_0x005a:
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0, r12}
            java.util.Arrays.copyOf(r0, r9)
            java.util.List r0 = r8.A02
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r14 = r0.iterator()
        L_0x006b:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00e1
            r14.next()
            X.1wz r8 = X.C67811x1.A00
            if (r8 != 0) goto L_0x007e
            X.PpK r8 = X.C74117PpK.A00
        L_0x007a:
            r10.add(r8)
            goto L_0x006b
        L_0x007e:
            java.lang.String r11 = r8.A01
            r1 = 5
            int r0 = r11.length()
            if (r0 >= r1) goto L_0x00aa
            r11 = 0
        L_0x0088:
            java.lang.String r13 = r8.A02
            r1 = 4
            int r0 = r13.length()
            if (r0 >= r1) goto L_0x009c
            r13 = 0
        L_0x0092:
            java.lang.String r1 = r8.A00
            r0 = 34
            X.PmT r8 = new X.PmT
            r8.<init>(r13, r11, r1, r0)
            goto L_0x007a
        L_0x009c:
            java.lang.String r1 = "(^|[^\\w])"
            java.lang.String r0 = "($|[^\\w])"
            java.lang.String r0 = X.002.A0g(r1, r13, r0)
            X.11S r13 = new X.11S
            r13.<init>(r0)
            goto L_0x0092
        L_0x00aa:
            java.lang.String r1 = "(^|[^0-9])"
            java.lang.String r0 = "($|[^0-9])"
            java.lang.String r0 = X.002.A0g(r1, r11, r0)
            X.11S r11 = new X.11S
            r11.<init>(r0)
            goto L_0x0088
        L_0x00b8:
            java.lang.String r12 = "SAME_KEY"
            goto L_0x004a
        L_0x00bb:
            java.lang.String r12 = "FAMILY"
            goto L_0x004a
        L_0x00be:
            java.lang.String r12 = "TRUSTED_APP"
            goto L_0x004a
        L_0x00c1:
            java.lang.String r12 = "ACCESSIBLE_BY_ANY_APP"
            goto L_0x004a
        L_0x00c4:
            r0 = 478(0x1de, float:6.7E-43)
            java.lang.String r12 = X.C273654mx.A00(r0)
            goto L_0x004a
        L_0x00cb:
            java.lang.String r12 = "THIRD_PARTY"
            goto L_0x004a
        L_0x00cf:
            java.lang.String r12 = "ANY"
            goto L_0x004a
        L_0x00d3:
            java.lang.String r12 = "IN_APP_BROWSER"
            goto L_0x004a
        L_0x00d7:
            java.lang.String r12 = "FAMILY_ACCESSIBLE_BY_ANY_APP"
            goto L_0x004a
        L_0x00db:
            r17 = 1
        L_0x00dd:
            java.lang.String r5 = "--sanitized-authority--"
            goto L_0x0041
        L_0x00e1:
            java.util.List r0 = r6.getPathSegments()
            java.util.Iterator r1 = r0.iterator()
        L_0x00e9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            X.REf r13 = X.OTR.A00(r0, r10)
            if (r13 == 0) goto L_0x00e9
            goto L_0x00fb
        L_0x00fa:
            r13 = 0
        L_0x00fb:
            java.util.Set r14 = r6.getQueryParameterNames()     // Catch:{ UnsupportedOperationException -> 0x0104 }
            if (r14 != 0) goto L_0x0106
            X.0sl r14 = X.0sl.A00     // Catch:{ UnsupportedOperationException -> 0x0104 }
            goto L_0x0106
        L_0x0104:
            X.0sl r14 = X.0sl.A00
        L_0x0106:
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x01ec
            X.0sm r11 = X.0Yt.A0E()
        L_0x0110:
            if (r13 != 0) goto L_0x0179
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0179
            r13 = 0
        L_0x0119:
            android.os.Bundle r8 = r22.getExtras()
            if (r8 != 0) goto L_0x014d
            X.0sm r11 = X.0Yt.A0E()
        L_0x0123:
            if (r13 != 0) goto L_0x021a
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x020c
            r2 = r5
            if (r5 != 0) goto L_0x012f
            r2 = r3
        L_0x012f:
            java.lang.String r1 = r6.getScheme()
            if (r1 != 0) goto L_0x0136
            r1 = r3
        L_0x0136:
            r0 = r18
            r4.A00(r2, r1, r0)
            if (r5 != 0) goto L_0x013e
            r5 = r3
        L_0x013e:
            java.lang.String r0 = r6.getScheme()
            if (r0 == 0) goto L_0x0145
            r3 = r0
        L_0x0145:
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r3, r12}
            java.util.Arrays.copyOf(r0, r9)
            return
        L_0x014d:
            java.util.HashMap r11 = X.AnonymousClass7TE.A1E()
            java.util.Set r0 = r8.keySet()
            java.util.Iterator r14 = r0.iterator()
        L_0x0159:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0123
            java.lang.Object r1 = X.AnonymousClass7TF.A0a(r14)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r8.get(r1)
            if (r0 == 0) goto L_0x0159
            java.lang.String r0 = r0.toString()
            X.REf r0 = X.OTR.A00(r0, r10)
            if (r0 == 0) goto L_0x0159
            r11.put(r1, r0)
            goto L_0x0159
        L_0x0179:
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = r6.getScheme()
            android.net.Uri$Builder r8 = r1.scheme(r0)
            if (r17 == 0) goto L_0x01dd
            java.lang.String r0 = "--sanitized-authority--"
        L_0x018a:
            r8.authority(r0)
            if (r13 != 0) goto L_0x01cc
            java.lang.String r0 = "--sanitized--"
        L_0x0191:
            r8.path(r0)
            java.util.Iterator r16 = r14.iterator()
            r14 = 1
        L_0x0199:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01e2
            java.lang.String r13 = X.AnonymousClass7TE.A18(r16)
            java.lang.Object r15 = r11.get(r13)
            if (r17 == 0) goto L_0x01b1
            java.lang.String r1 = "--"
            java.lang.String r0 = "sanitized-param-"
            java.lang.String r13 = X.002.A06(r14, r1, r0, r1)
        L_0x01b1:
            int r14 = r14 + 1
            if (r15 != 0) goto L_0x01bb
            java.lang.String r0 = "--sanitized--"
        L_0x01b7:
            r8.appendQueryParameter(r13, r0)
            goto L_0x0199
        L_0x01bb:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "--"
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)
            goto L_0x01b7
        L_0x01cc:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "--"
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)
            goto L_0x0191
        L_0x01dd:
            java.lang.String r0 = r6.getAuthority()
            goto L_0x018a
        L_0x01e2:
            android.net.Uri r0 = r8.build()
            java.lang.String r13 = r0.toString()
            goto L_0x0119
        L_0x01ec:
            java.util.HashMap r11 = X.AnonymousClass7TE.A1E()
            java.util.Iterator r8 = r14.iterator()
        L_0x01f4:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0110
            java.lang.String r1 = X.AnonymousClass7TE.A18(r8)
            java.lang.String r0 = r6.getQueryParameter(r1)
            X.REf r0 = X.OTR.A00(r0, r10)
            if (r0 == 0) goto L_0x01f4
            r11.put(r1, r0)
            goto L_0x01f4
        L_0x020c:
            if (r17 == 0) goto L_0x0299
            java.lang.String r8 = r6.getScheme()
            java.lang.String r1 = "://"
            java.lang.String r0 = "--sanitized-authority--"
            java.lang.String r13 = X.002.A0g(r8, r1, r0)
        L_0x021a:
            r0 = r5
            if (r5 != 0) goto L_0x021e
            r0 = r3
        L_0x021e:
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r12}
            java.util.Arrays.copyOf(r0, r2)
            r15 = r5
            if (r5 != 0) goto L_0x0229
            r15 = r3
        L_0x0229:
            java.lang.String r14 = r6.getScheme()
            if (r14 != 0) goto L_0x0230
            r14 = r3
        L_0x0230:
            java.lang.String r10 = "authority"
            java.lang.String r9 = "scheme"
            X.0qQ.A0B(r13, r2)
            java.lang.String r8 = "scopeType"
            X.0fA r2 = r4.A00
            r1 = 817898872(0x30c02578, float:1.3980488E-9)
            java.lang.String r0 = "intent"
            X.0f9 r2 = r2.AEf(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x02b3
            java.lang.String r1 = "operation"
            java.lang.String r0 = "outgoing_intent"
            r2.ABQ(r1, r0)
            r2.ABQ(r10, r15)
            r2.ABQ(r9, r14)
            java.lang.String r0 = "sanitized_uri"
            r2.ABQ(r0, r13)
            r2.ABQ(r8, r12)
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x02a6
            java.util.List r0 = X.01U.A00(r11)
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x0271:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x029b
            X.0eP r8 = X.JTO.A1A(r9)
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.Object r0 = r8.A00
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.String r0 = "=--"
            r1.append(r0)
            java.lang.Object r0 = r8.A01
            r1.append(r0)
            java.lang.String r0 = "--"
            r1.append(r0)
            X.DbU.A1X(r1, r10)
            goto L_0x0271
        L_0x0299:
            r13 = r3
            goto L_0x021a
        L_0x029b:
            r0 = r18
            java.lang.String[] r1 = X.DbU.A1b(r10, r0)
            java.lang.String r0 = "sensitive_extras"
            r2.ABS(r0, r1)
        L_0x02a6:
            java.lang.String r1 = "UII detected in outgoing Intent"
            X.Nn4 r0 = new X.Nn4
            r0.<init>(r1)
            r2.ERJ(r0)
            r2.report()
        L_0x02b3:
            if (r5 != 0) goto L_0x02b6
            r5 = r3
        L_0x02b6:
            java.lang.String r0 = r6.getScheme()
            if (r0 == 0) goto L_0x02bd
            r3 = r0
        L_0x02bd:
            r4.A00(r5, r3, r7)
        L_0x02c0:
            return
        L_0x02c1:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71777Oqd.Cul(android.content.Context, android.content.Intent, android.content.Intent, X.0bP, java.lang.Integer):void");
    }

    public final boolean Ese(Context context, Intent intent, Integer num) {
        0qQ.A0B(num, 1);
        if (num == AnonymousClass05K.A00 || num == AnonymousClass05K.A01 || intent.getData() == null) {
            return false;
        }
        return true;
    }
}
