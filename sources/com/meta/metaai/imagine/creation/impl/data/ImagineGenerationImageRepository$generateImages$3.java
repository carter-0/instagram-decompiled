package com.meta.metaai.imagine.creation.impl.data;

import X.0eS;
import X.0sL;
import X.19B;
import X.1Eo;
import X.AnonymousClass05K;
import X.AnonymousClass1Ek;
import X.AnonymousClass2Q8;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C262224Cq;
import X.C51972G9s;
import X.C60340gF;
import X.MEW;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository$generateImages$3", f = "ImagineGenerationImageRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ImagineGenerationImageRepository$generateImages$3 extends AnonymousClass1Ek implements 0sL {
    public /* synthetic */ Object A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ImagineGenerationImageRepository A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    @DebugMetadata(c = "com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository$generateImages$3$1", f = "ImagineGenerationImageRepository.kt", i = {1, 1, 1, 1, 1, 1}, l = {160, 179}, m = "invokeSuspend", n = {"imageGeneratedImageResponse", "$this$update$iv", "prevValue$iv", "oldResponse", "oldImages", "firstAvailableIndex"}, s = {"L$0", "L$1", "L$4", "L$5", "L$6", "I$0"})
    /* renamed from: com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository$generateImages$3$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass1Ek implements 0sL {
        public int A00;
        public int A01;
        public Object A02;
        public Object A03;
        public Object A04;
        public Object A05;
        public Object A06;
        public Object A07;
        public Object A08;
        public boolean A09;

        /* JADX WARNING: type inference failed for: r0v0, types: [com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository$generateImages$3$1, X.4D7] */
        public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
            String str = str2;
            String str2 = str;
            ImagineGenerationImageRepository imagineGenerationImageRepository = imagineGenerationImageRepository;
            boolean z = z7;
            boolean z2 = z6;
            int i = i3;
            boolean z3 = z5;
            return new AnonymousClass1(imagineGenerationImageRepository, str, str2, A0n, r14, A012, i, z, z2, z3, z4);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: X.HtB} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.util.ArrayList} */
        /* JADX WARNING: type inference failed for: r6v0, types: [com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository$generateImages$3$1, X.4D7] */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0115  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0126  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x013a  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x016d  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x0189  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x019d  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x01a5  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0135 A[SYNTHETIC] */
        public final java.lang.Object invokeSuspend(java.lang.Object r36) {
            /*
                r35 = this;
                r11 = r36
                X.1Hj r19 = X.1Hj.A02
                r6 = r35
                int r0 = r6.A01
                r5 = 1
                if (r0 == 0) goto L_0x00b9
                if (r0 == r5) goto L_0x00fc
                int r13 = r6.A00
                boolean r3 = r6.A09
                java.lang.Object r12 = r6.A08
                java.util.List r12 = (java.util.List) r12
                java.lang.Object r10 = r6.A07
                X.HtB r10 = (X.C56123HtB) r10
                java.lang.Object r2 = r6.A06
                java.lang.Object r9 = r6.A05
                X.2Q9 r9 = (X.AnonymousClass2Q9) r9
                java.lang.Object r8 = r6.A04
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r7 = r6.A03
                X.05G r7 = (X.05G) r7
                java.lang.Object r4 = r6.A02
                X.HQ5 r4 = (X.HQ5) r4
                X.0eS.A00(r11)
            L_0x002e:
                X.3Ii r11 = (X.C239803Ii) r11
                boolean r0 = r11 instanceof X.C239793Ih
                if (r0 == 0) goto L_0x01a3
                r1 = 0
                X.2HY r0 = new X.2HY
                r0.<init>(r1, r13)
                java.util.Iterator r18 = r0.iterator()
            L_0x003e:
                boolean r0 = r18.hasNext()
                if (r0 == 0) goto L_0x01a3
                r0 = r18
                X.0sh r0 = (X.0sh) r0
                int r17 = r0.A00()
                r0 = r17
                java.lang.Object r1 = r12.get(r0)
                X.I1k r1 = (X.C56556I1k) r1
                X.HtY r14 = r1.A01
                if (r14 == 0) goto L_0x00b6
                r0 = r11
                X.3Ih r0 = (X.C239793Ih) r0
                java.lang.Object r13 = r0.A00
                X.Hst r13 = (X.C56106Hst) r13
                java.lang.String r0 = r13.A02
                r28 = r0
                java.lang.String r0 = r14.A0A
                r24 = r0
                java.lang.String r0 = r14.A04
                r25 = r0
                java.lang.String r0 = r14.A05
                r26 = r0
                java.lang.String r0 = r14.A03
                r27 = r0
                java.lang.String r0 = r14.A08
                r29 = r0
                java.lang.String r0 = r14.A07
                r30 = r0
                java.lang.Integer r0 = r14.A02
                r22 = r0
                X.0eP r0 = r14.A0C
                r33 = r0
                java.lang.Integer r0 = r14.A01
                r23 = r0
                java.lang.String r0 = r14.A09
                r31 = r0
                java.lang.String r0 = r14.A0B
                r15 = r0
                boolean r0 = r14.A0D
                X.HtY r16 = new X.HtY
                r20 = r16
                r21 = r13
                r32 = r15
                r34 = r0
                r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            L_0x009d:
                java.lang.Integer r0 = r1.A02
                r14 = r0
                java.lang.String r0 = r1.A03
                r13 = r0
                X.HQf r0 = r1.A00
                r1 = r0
                X.I1k r0 = new X.I1k
                r15 = r14
                r14 = r13
                r13 = r1
                r1 = r16
                r0.<init>(r13, r1, r15, r14)
                r1 = r17
                r12.set(r1, r0)
                goto L_0x003e
            L_0x00b6:
                r16 = 0
                goto L_0x009d
            L_0x00b9:
                X.0eS.A00(r11)
                java.lang.String r10 = r12
                if (r10 == 0) goto L_0x00e7
                java.lang.String r1 = r13
                com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository r0 = r11
                java.lang.String r0 = r0.A08
                boolean r0 = X.0qQ.A0K(r1, r0)
                if (r0 == 0) goto L_0x00e7
                boolean r0 = r18
                if (r0 == 0) goto L_0x00e7
                java.lang.Integer r8 = X.AnonymousClass05K.A0Y
            L_0x00d2:
                com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository r7 = r11
                java.lang.String r9 = r13
                boolean r0 = r20
                java.lang.String r11 = r14
                r6.A01 = r5
                r12 = r6
                r13 = r0
                java.lang.Object r11 = com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository.A00(r7, r8, r9, r10, r11, r12, r13)
                r0 = r19
                if (r11 != r0) goto L_0x00ff
                return r19
            L_0x00e7:
                boolean r0 = r18
                if (r0 == 0) goto L_0x00ee
                java.lang.Integer r8 = X.AnonymousClass05K.A0N
                goto L_0x00d2
            L_0x00ee:
                boolean r0 = r19
                if (r0 == 0) goto L_0x00f9
                int r0 = r17
                if (r0 != r5) goto L_0x00f9
                java.lang.Integer r8 = X.AnonymousClass05K.A01
                goto L_0x00d2
            L_0x00f9:
                java.lang.Integer r8 = X.AnonymousClass05K.A00
                goto L_0x00d2
            L_0x00fc:
                X.0eS.A00(r11)
            L_0x00ff:
                X.HQ5 r11 = (X.HQ5) r11
                com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository r0 = r11
                X.05G r7 = r0.A0C
                java.lang.String r8 = r13
                boolean r3 = r21
                X.2Q9 r9 = r16
                r4 = r11
            L_0x010c:
                java.lang.Object r2 = r7.getValue()
                r10 = r2
                X.HtB r10 = (X.C56123HtB) r10
                if (r10 == 0) goto L_0x01a5
                java.util.List r0 = r10.A02
                java.util.ArrayList r12 = X.AnonymousClass7TE.A1D(r0)
            L_0x011b:
                java.util.Iterator r11 = r12.iterator()
                r13 = 0
            L_0x0120:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto L_0x0135
                java.lang.Object r0 = r11.next()
                X.I1k r0 = (X.C56556I1k) r0
                java.lang.Integer r1 = r0.A02
                java.lang.Integer r0 = X.AnonymousClass05K.A00
                if (r1 == r0) goto L_0x0136
                int r13 = r13 + 1
                goto L_0x0120
            L_0x0135:
                r13 = -1
            L_0x0136:
                boolean r0 = r4 instanceof X.C54546HIh
                if (r0 == 0) goto L_0x016d
                java.lang.Integer r14 = X.AnonymousClass05K.A01
                r0 = r4
                X.HIh r0 = (X.C54546HIh) r0
                X.HtY r11 = r0.A00
                r1 = 0
                X.I1k r0 = new X.I1k
                r0.<init>(r1, r11, r14, r8)
                r12.set(r13, r0)
                if (r3 == 0) goto L_0x01a3
                r6.A02 = r4
                r6.A03 = r7
                r6.A04 = r8
                r6.A05 = r9
                r6.A06 = r2
                r6.A07 = r10
                r6.A08 = r12
                r6.A09 = r3
                r6.A00 = r13
                r0 = 2
                r6.A01 = r0
                r0 = r9
                X.4Cp r0 = (X.C262214Cp) r0
                java.lang.Object r11 = r0.A0E(r6)
                r0 = r19
                if (r11 != r0) goto L_0x002e
                return r19
            L_0x016d:
                boolean r0 = r4 instanceof X.C54545HIg
                if (r0 == 0) goto L_0x01a3
                r1 = r4
                X.HIg r1 = (X.C54545HIg) r1
                X.HQf r0 = r1.A00
                boolean r0 = r0 instanceof X.C54542HId
                if (r0 == 0) goto L_0x01a0
                java.lang.Integer r14 = X.AnonymousClass05K.A00
            L_0x017c:
                X.HQf r11 = r1.A00
                r0 = 0
                X.I1k r1 = new X.I1k
                r1.<init>(r11, r0, r14, r8)
                r12.set(r13, r1)
            L_0x0187:
                if (r10 == 0) goto L_0x0197
                java.lang.String r13 = r10.A01
                int r11 = r10.A00
                boolean r1 = r10.A03
                X.0qQ.A0B(r12, r5)
                X.HtB r0 = new X.HtB
                r0.<init>(r13, r12, r11, r1)
            L_0x0197:
                boolean r0 = r7.AIY(r2, r0)
                if (r0 == 0) goto L_0x010c
                X.0gF r19 = X.C60340gF.A00
                return r19
            L_0x01a0:
                java.lang.Integer r14 = X.AnonymousClass05K.A0C
                goto L_0x017c
            L_0x01a3:
                r0 = 0
                goto L_0x0187
            L_0x01a5:
                java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
                goto L_0x011b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository$generateImages$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImagineGenerationImageRepository$generateImages$3(ImagineGenerationImageRepository imagineGenerationImageRepository, String str, String str2, AnonymousClass4D7 r5, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2, r5);
        this.A01 = i;
        this.A08 = z;
        this.A02 = imagineGenerationImageRepository;
        this.A04 = str;
        this.A03 = str2;
        this.A06 = z2;
        this.A05 = z3;
        this.A07 = z4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository$generateImages$3] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r12) {
        AnonymousClass4D7 r4 = r12;
        ? imagineGenerationImageRepository$generateImages$3 = new ImagineGenerationImageRepository$generateImages$3(this.A02, this.A04, this.A03, r4, this.A01, this.A08, this.A06, this.A05, this.A07);
        imagineGenerationImageRepository$generateImages$3.A00 = obj;
        return imagineGenerationImageRepository$generateImages$3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ImagineGenerationImageRepository$generateImages$3) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        C262224Cq r6 = (C262224Cq) this.A00;
        final String A0n = C51972G9s.A0n();
        boolean z = this.A08;
        final ImagineGenerationImageRepository imagineGenerationImageRepository = this.A02;
        final String str = this.A04;
        MEW mew = new MEW(imagineGenerationImageRepository, str, (AnonymousClass4D7) null, 18, z);
        19B r8 = 19B.A00;
        Integer num = AnonymousClass05K.A00;
        final AnonymousClass2Q8 A012 = 1Eo.A01(num, r8, mew, r6);
        int i = this.A01;
        if (1 <= i) {
            int i2 = 1;
            while (true) {
                final String str2 = this.A03;
                boolean z2 = this.A06;
                boolean z3 = this.A05;
                final boolean z4 = z;
                final boolean z5 = this.A07;
                final boolean z6 = z3;
                final boolean z7 = z2;
                final int i3 = i2;
                1Eo.A03(num, r8, new AnonymousClass1((AnonymousClass4D7) null), r6);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        return C60340gF.A00;
    }
}
