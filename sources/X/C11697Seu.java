package X;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import com.google.common.collect.ImmutableList;
import java.util.ArrayDeque;
import java.util.List;

/* renamed from: X.Seu  reason: case insensitive filesystem */
public final class C11697Seu implements C13809Thc, C13511Tbc {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public C11389SRd A0B;
    public YBZ A0C;
    public MotionPhotoMetadata A0D;
    public ImmutableList A0E;
    public boolean A0F;
    public C10719Rwx[] A0G;
    public long[][] A0H;
    public final int A0I;
    public final C11389SRd A0J;
    public final C11389SRd A0K;
    public final C11389SRd A0L;
    public final C11389SRd A0M;
    public final C11196SEw A0N;
    public final ArrayDeque A0O;
    public final List A0P;
    public final C13890TjD A0Q;

    public final S5O Br9(long j) {
        return A01(-1, j);
    }

    public final /* synthetic */ C13809Thc CBL() {
        return this;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x062f: MOVE  (r0v48 X.SGx) = (r19v0 X.SGx)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x00a2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00db A[Catch:{ all -> 0x076b }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e8 A[Catch:{ all -> 0x076b }] */
    private void A00(long r38) {
        /*
            r37 = this;
        L_0x0000:
            r1 = r37
            java.util.ArrayDeque r0 = r1.A0O
            r36 = r0
            boolean r0 = r36.isEmpty()
            r17 = 2
            if (r0 != 0) goto L_0x0770
            java.lang.Object r0 = r36.peek()
            X.QEL r0 = (X.QEL) r0
            long r2 = r0.A00
            int r0 = (r2 > r38 ? 1 : (r2 == r38 ? 0 : -1))
            if (r0 != 0) goto L_0x0770
            java.lang.Object r0 = r36.pop()
            X.QEL r0 = (X.QEL) r0
            int r3 = r0.A00
            r2 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r3 != r2) goto L_0x0755
            java.util.ArrayList r20 = X.AnonymousClass7TE.A1C()
            int r4 = r1.A02
            r2 = 0
            r18 = 1
            r3 = r18
            boolean r35 = X.AnonymousClass7TF.A1S(r4, r3)
            X.SGx r19 = new X.SGx
            r19.<init>()
            r3 = 1969517665(0x75647461, float:2.8960062E32)
            X.QEK r4 = r0.A01(r3)
            if (r4 == 0) goto L_0x0493
            byte[] r3 = X.C11399SRu.A00
            X.SRd r12 = r4.A00
            r11 = 8
            r12.A0O(r11)
            androidx.media3.common.Metadata$Entry[] r4 = new androidx.media3.common.Metadata.Entry[r2]
            androidx.media3.common.Metadata r16 = new androidx.media3.common.Metadata
            r3 = r16
            r3.<init>((androidx.media3.common.Metadata.Entry[]) r4)
        L_0x0056:
            int r3 = r12.A00
            int r10 = r12.A01
            int r3 = r3 - r10
            if (r3 < r11) goto L_0x048b
            int r24 = r12.A01()
            int r4 = r12.A01()
            r3 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r4 != r3) goto L_0x0393
            r12.A0O(r10)
            int r5 = r10 + r24
            r12.A0P(r11)
            int r8 = r12.A01
            r9 = 4
            r12.A0P(r9)
            int r4 = r12.A01()
            r3 = 1751411826(0x68646c72, float:4.3148E24)
            if (r4 == r3) goto L_0x0083
            int r8 = r8 + 4
        L_0x0083:
            r12.A0O(r8)
            int r8 = r12.A01
            if (r8 >= r5) goto L_0x03ec
            int r6 = r12.A01()
            int r4 = r12.A01()
            r3 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r4 != r3) goto L_0x0390
            r12.A0O(r8)
            int r8 = r8 + r6
            r12.A0P(r11)
            java.util.ArrayList r23 = X.AnonymousClass7TE.A1C()
        L_0x00a2:
            int r7 = r12.A01
            if (r7 >= r8) goto L_0x0382
            int r3 = r12.A01()
            int r7 = r7 + r3
            int r4 = r12.A01()
            int r3 = r4 >> 24
            r5 = r3 & 255(0xff, float:3.57E-43)
            r3 = 169(0xa9, float:2.37E-43)
            if (r5 == r3) goto L_0x02b8
            r3 = 253(0xfd, float:3.55E-43)
            if (r5 == r3) goto L_0x02b8
            r3 = 1735291493(0x676e7265, float:1.1260334E24)
            if (r4 != r3) goto L_0x00f1
            int r3 = X.SKB.A00(r12)     // Catch:{ all -> 0x076b }
            int r5 = r3 + -1
            com.google.common.collect.ImmutableList r3 = X.XY6.A00     // Catch:{ all -> 0x076b }
            if (r5 < 0) goto L_0x00d7
            com.google.common.collect.ImmutableList r4 = X.XY6.A00     // Catch:{ all -> 0x076b }
            int r3 = r3.size()     // Catch:{ all -> 0x076b }
            if (r5 >= r3) goto L_0x00d7
            java.lang.String r3 = X.AnonymousClass7TE.A19(r4, r5)     // Catch:{ all -> 0x076b }
            goto L_0x00d8
        L_0x00d7:
            r3 = 0
        L_0x00d8:
            r5 = 0
            if (r3 == 0) goto L_0x00e8
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.of(r3)     // Catch:{ all -> 0x076b }
            java.lang.String r3 = "TCON"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r6 = new androidx.media3.extractor.metadata.id3.TextInformationFrame     // Catch:{ all -> 0x076b }
            r6.<init>(r3, r5, r4)     // Catch:{ all -> 0x076b }
            goto L_0x02b5
        L_0x00e8:
            java.lang.String r4 = "MetadataUtil"
            java.lang.String r3 = "Failed to parse standard genre code"
            X.STH.A03(r4, r3)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x00f1:
            r3 = 1684632427(0x6469736b, float:1.7225632E22)
            if (r4 != r3) goto L_0x00fe
            java.lang.String r3 = "TPOS"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r5 = X.SKB.A01(r12, r3, r4)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x00fe:
            r3 = 1953655662(0x74726b6e, float:7.6825853E31)
            if (r4 != r3) goto L_0x010b
            java.lang.String r3 = "TRCK"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r5 = X.SKB.A01(r12, r3, r4)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x010b:
            r3 = 1953329263(0x746d706f, float:7.5247484E31)
            if (r4 != r3) goto L_0x012f
            java.lang.String r4 = "TBPM"
            int r6 = X.SKB.A00(r12)     // Catch:{ all -> 0x076b }
            r5 = 0
            if (r6 < 0) goto L_0x0128
            java.lang.String r3 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x076b }
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of(r3)     // Catch:{ all -> 0x076b }
            androidx.media3.extractor.metadata.id3.TextInformationFrame r6 = new androidx.media3.extractor.metadata.id3.TextInformationFrame     // Catch:{ all -> 0x076b }
            r6.<init>(r4, r5, r3)     // Catch:{ all -> 0x076b }
            goto L_0x02b5
        L_0x0128:
            java.lang.String r4 = "Failed to parse uint8 attribute: "
            X.C11340SNw.A01(r3, r4)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x012f:
            r6 = 1668311404(0x6370696c, float:4.434815E21)
            if (r4 != r6) goto L_0x0159
            java.lang.String r4 = "TCMP"
            int r5 = X.SKB.A00(r12)     // Catch:{ all -> 0x076b }
            r3 = r18
            int r3 = java.lang.Math.min(r3, r5)     // Catch:{ all -> 0x076b }
            r5 = 0
            if (r3 < 0) goto L_0x0152
            java.lang.String r3 = java.lang.Integer.toString(r3)     // Catch:{ all -> 0x076b }
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of(r3)     // Catch:{ all -> 0x076b }
            androidx.media3.extractor.metadata.id3.TextInformationFrame r6 = new androidx.media3.extractor.metadata.id3.TextInformationFrame     // Catch:{ all -> 0x076b }
            r6.<init>(r4, r5, r3)     // Catch:{ all -> 0x076b }
            goto L_0x02b5
        L_0x0152:
            java.lang.String r3 = "Failed to parse uint8 attribute: "
            X.C11340SNw.A01(r6, r3)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x0159:
            r3 = 1668249202(0x636f7672, float:4.4173067E21)
            if (r4 != r3) goto L_0x01a3
            int r13 = r12.A01()     // Catch:{ all -> 0x076b }
            int r4 = r12.A01()     // Catch:{ all -> 0x076b }
            java.lang.String r6 = "MetadataUtil"
            r5 = 0
            r3 = 1684108385(0x64617461, float:1.6635614E22)
            if (r4 != r3) goto L_0x0195
            int r4 = r12.A01()     // Catch:{ all -> 0x076b }
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r3
            r3 = 13
            if (r4 != r3) goto L_0x018e
            java.lang.String r4 = "image/jpeg"
        L_0x017c:
            r12.A0P(r9)     // Catch:{ all -> 0x076b }
            int r6 = r13 + -16
            byte[] r3 = new byte[r6]     // Catch:{ all -> 0x076b }
            r12.A0R(r3, r2, r6)     // Catch:{ all -> 0x076b }
            r13 = 3
            androidx.media3.extractor.metadata.id3.ApicFrame r6 = new androidx.media3.extractor.metadata.id3.ApicFrame     // Catch:{ all -> 0x076b }
            r6.<init>(r4, r5, r3, r13)     // Catch:{ all -> 0x076b }
            goto L_0x02b5
        L_0x018e:
            r3 = 14
            if (r4 != r3) goto L_0x0198
            java.lang.String r4 = "image/png"
            goto L_0x017c
        L_0x0195:
            java.lang.String r3 = "Failed to parse cover art attribute"
            goto L_0x019e
        L_0x0198:
            java.lang.String r3 = "Unrecognized cover art flags: "
            java.lang.String r3 = X.002.A0O(r3, r4)     // Catch:{ all -> 0x076b }
        L_0x019e:
            X.STH.A03(r6, r3)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x01a3:
            r3 = 1631670868(0x61415254, float:2.2288462E20)
            if (r4 != r3) goto L_0x01b0
            java.lang.String r3 = "TPE2"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r5 = X.SKB.A02(r12, r3, r4)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x01b0:
            r3 = 1936682605(0x736f6e6d, float:1.8969706E31)
            if (r4 != r3) goto L_0x01bd
            java.lang.String r3 = "TSOT"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r5 = X.SKB.A02(r12, r3, r4)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x01bd:
            r3 = 1936679276(0x736f616c, float:1.8965681E31)
            if (r4 != r3) goto L_0x01ca
            java.lang.String r3 = "TSOA"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r5 = X.SKB.A02(r12, r3, r4)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x01ca:
            r3 = 1936679282(0x736f6172, float:1.8965689E31)
            if (r4 != r3) goto L_0x01d7
            java.lang.String r3 = "TSOP"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r5 = X.SKB.A02(r12, r3, r4)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x01d7:
            r3 = 1936679265(0x736f6161, float:1.8965668E31)
            if (r4 != r3) goto L_0x01e4
            java.lang.String r3 = "TSO2"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r5 = X.SKB.A02(r12, r3, r4)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x01e4:
            r3 = 1936679791(0x736f636f, float:1.8966304E31)
            if (r4 != r3) goto L_0x01f1
            java.lang.String r3 = "TSOC"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r5 = X.SKB.A02(r12, r3, r4)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x01f1:
            r3 = 1920233063(0x72746e67, float:4.84146E30)
            if (r4 != r3) goto L_0x0214
            java.lang.String r4 = "ITUNESADVISORY"
            int r6 = X.SKB.A00(r12)     // Catch:{ all -> 0x076b }
            r5 = 0
            if (r6 < 0) goto L_0x020d
            java.lang.String r5 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x076b }
            java.lang.String r3 = "und"
            androidx.media3.extractor.metadata.id3.CommentFrame r6 = new androidx.media3.extractor.metadata.id3.CommentFrame     // Catch:{ all -> 0x076b }
            r6.<init>(r3, r4, r5)     // Catch:{ all -> 0x076b }
            goto L_0x02b5
        L_0x020d:
            java.lang.String r4 = "Failed to parse uint8 attribute: "
            X.C11340SNw.A01(r3, r4)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x0214:
            r6 = 1885823344(0x70676170, float:2.8643533E29)
            if (r4 != r6) goto L_0x023d
            java.lang.String r4 = "ITUNESGAPLESS"
            int r5 = X.SKB.A00(r12)     // Catch:{ all -> 0x076b }
            r3 = r18
            int r3 = java.lang.Math.min(r3, r5)     // Catch:{ all -> 0x076b }
            r5 = 0
            if (r3 < 0) goto L_0x0236
            java.lang.String r5 = java.lang.Integer.toString(r3)     // Catch:{ all -> 0x076b }
            java.lang.String r3 = "und"
            androidx.media3.extractor.metadata.id3.CommentFrame r6 = new androidx.media3.extractor.metadata.id3.CommentFrame     // Catch:{ all -> 0x076b }
            r6.<init>(r3, r4, r5)     // Catch:{ all -> 0x076b }
            goto L_0x02b5
        L_0x0236:
            java.lang.String r3 = "Failed to parse uint8 attribute: "
            X.C11340SNw.A01(r6, r3)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x023d:
            r3 = 1936683886(0x736f736e, float:1.8971255E31)
            if (r4 != r3) goto L_0x024a
            java.lang.String r3 = "TVSHOWSORT"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r5 = X.SKB.A02(r12, r3, r4)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x024a:
            r3 = 1953919848(0x74767368, float:7.810338E31)
            if (r4 != r3) goto L_0x0257
            java.lang.String r3 = "TVSHOW"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r5 = X.SKB.A02(r12, r3, r4)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x0257:
            r3 = 757935405(0x2d2d2d2d, float:9.8439425E-12)
            if (r4 != r3) goto L_0x0350
            r22 = -1
            r6 = 0
            r14 = r6
            r13 = r6
            r5 = -1
            r4 = -1
        L_0x0263:
            int r3 = r12.A01     // Catch:{ all -> 0x076b }
            r25 = r3
            if (r3 >= r7) goto L_0x029b
            int r21 = r12.A01()     // Catch:{ all -> 0x076b }
            int r3 = r12.A01()     // Catch:{ all -> 0x076b }
            r12.A0P(r9)     // Catch:{ all -> 0x076b }
            r15 = 1835360622(0x6d65616e, float:4.4368658E27)
            if (r3 != r15) goto L_0x0280
            int r3 = r21 + -12
            java.lang.String r14 = r12.A0G(r3)     // Catch:{ all -> 0x076b }
            goto L_0x0263
        L_0x0280:
            r15 = 1851878757(0x6e616d65, float:1.7441594E28)
            if (r3 != r15) goto L_0x028c
            int r3 = r21 + -12
            java.lang.String r13 = r12.A0G(r3)     // Catch:{ all -> 0x076b }
            goto L_0x0263
        L_0x028c:
            r15 = 1684108385(0x64617461, float:1.6635614E22)
            if (r3 != r15) goto L_0x0295
            r5 = r25
            r4 = r21
        L_0x0295:
            int r3 = r21 + -12
            r12.A0P(r3)     // Catch:{ all -> 0x076b }
            goto L_0x0263
        L_0x029b:
            if (r14 == 0) goto L_0x02b5
            if (r13 == 0) goto L_0x02b5
            r3 = r22
            if (r5 == r3) goto L_0x02b5
            r12.A0O(r5)     // Catch:{ all -> 0x076b }
            r3 = 16
            r12.A0P(r3)     // Catch:{ all -> 0x076b }
            int r4 = r4 - r3
            java.lang.String r3 = r12.A0G(r4)     // Catch:{ all -> 0x076b }
            androidx.media3.extractor.metadata.id3.InternalFrame r6 = new androidx.media3.extractor.metadata.id3.InternalFrame     // Catch:{ all -> 0x076b }
            r6.<init>(r14, r13, r3)     // Catch:{ all -> 0x076b }
        L_0x02b5:
            r5 = r6
            goto L_0x0376
        L_0x02b8:
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r4
            r3 = 6516084(0x636d74, float:9.130979E-39)
            if (r5 != r3) goto L_0x02e8
            int r6 = r12.A01()     // Catch:{ all -> 0x076b }
            int r5 = r12.A01()     // Catch:{ all -> 0x076b }
            r3 = 1684108385(0x64617461, float:1.6635614E22)
            if (r5 != r3) goto L_0x02e1
            r12.A0P(r11)     // Catch:{ all -> 0x076b }
            int r3 = r6 + -16
            java.lang.String r4 = r12.A0G(r3)     // Catch:{ all -> 0x076b }
            java.lang.String r3 = "und"
            androidx.media3.extractor.metadata.id3.CommentFrame r5 = new androidx.media3.extractor.metadata.id3.CommentFrame     // Catch:{ all -> 0x076b }
            r5.<init>(r3, r4, r4)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x02e1:
            java.lang.String r3 = "Failed to parse comment attribute: "
            X.C11340SNw.A01(r4, r3)     // Catch:{ all -> 0x076b }
            goto L_0x0375
        L_0x02e8:
            r3 = 7233901(0x6e616d, float:1.0136854E-38)
            if (r5 == r3) goto L_0x036e
            r3 = 7631467(0x74726b, float:1.0693963E-38)
            if (r5 == r3) goto L_0x036e
            r3 = 6516589(0x636f6d, float:9.131686E-39)
            if (r5 == r3) goto L_0x0367
            r3 = 7828084(0x777274, float:1.0969482E-38)
            if (r5 == r3) goto L_0x0367
            r3 = 6578553(0x646179, float:9.218516E-39)
            if (r5 != r3) goto L_0x0308
            java.lang.String r3 = "TDRC"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r5 = X.SKB.A02(r12, r3, r4)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x0308:
            r3 = 4280916(0x415254, float:5.998841E-39)
            if (r5 != r3) goto L_0x0314
            java.lang.String r3 = "TPE1"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r5 = X.SKB.A02(r12, r3, r4)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x0314:
            r3 = 7630703(0x746f6f, float:1.0692892E-38)
            if (r5 != r3) goto L_0x0320
            java.lang.String r3 = "TSSE"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r5 = X.SKB.A02(r12, r3, r4)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x0320:
            r3 = 6384738(0x616c62, float:8.946924E-39)
            if (r5 != r3) goto L_0x032c
            java.lang.String r3 = "TALB"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r5 = X.SKB.A02(r12, r3, r4)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x032c:
            r3 = 7108978(0x6c7972, float:9.9618E-39)
            if (r5 != r3) goto L_0x0338
            java.lang.String r3 = "USLT"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r5 = X.SKB.A02(r12, r3, r4)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x0338:
            r3 = 6776174(0x67656e, float:9.495442E-39)
            if (r5 != r3) goto L_0x0344
            java.lang.String r3 = "TCON"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r5 = X.SKB.A02(r12, r3, r4)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x0344:
            r3 = 6779504(0x677270, float:9.500109E-39)
            if (r5 != r3) goto L_0x0350
            java.lang.String r3 = "TIT1"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r5 = X.SKB.A02(r12, r3, r4)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x0350:
            java.lang.String r5 = "Skipped unknown metadata entry: "
            java.lang.String r3 = X.C11340SNw.A00(r4)     // Catch:{ all -> 0x076b }
            java.lang.String r4 = X.002.A0R(r5, r3)     // Catch:{ all -> 0x076b }
            java.lang.Object r5 = X.STH.A01     // Catch:{ all -> 0x076b }
            monitor-enter(r5)     // Catch:{ all -> 0x076b }
            r3 = 0
            X.STH.A00(r4, r3)     // Catch:{ all -> 0x0768 }
            monitor-exit(r5)     // Catch:{ all -> 0x0768 }
            r12.A0O(r7)
            goto L_0x00a2
        L_0x0367:
            java.lang.String r3 = "TCOM"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r5 = X.SKB.A02(r12, r3, r4)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x036e:
            java.lang.String r3 = "TIT2"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r5 = X.SKB.A02(r12, r3, r4)     // Catch:{ all -> 0x076b }
            goto L_0x0376
        L_0x0375:
            r5 = 0
        L_0x0376:
            r12.A0O(r7)
            if (r5 == 0) goto L_0x00a2
            r3 = r23
            r3.add(r5)
            goto L_0x00a2
        L_0x0382:
            boolean r3 = r23.isEmpty()
            if (r3 != 0) goto L_0x03ec
            androidx.media3.common.Metadata r4 = new androidx.media3.common.Metadata
            r3 = r23
            r4.<init>((java.util.List) r3)
            goto L_0x03e4
        L_0x0390:
            int r8 = r8 + r6
            goto L_0x0083
        L_0x0393:
            r3 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r4 != r3) goto L_0x0441
            r12.A0O(r10)
            int r4 = r10 + r24
            r3 = 12
            r12.A0P(r3)
        L_0x03a2:
            int r7 = r12.A01
            if (r7 >= r4) goto L_0x03ec
            int r6 = r12.A01()
            int r5 = r12.A01()
            r3 = 1935766900(0x73617574, float:1.7862687E31)
            if (r5 != r3) goto L_0x043b
            r3 = 16
            if (r6 < r3) goto L_0x03ec
            r3 = 4
            r12.A0P(r3)
            r7 = -1
            r6 = 0
            r5 = 0
        L_0x03be:
            int r8 = r12.A05()
            int r9 = r12.A05()
            if (r8 != 0) goto L_0x0435
            r7 = r9
        L_0x03c9:
            int r6 = r6 + 1
            r3 = r17
            if (r6 < r3) goto L_0x03be
            r6 = 12
            if (r7 != r6) goto L_0x03f3
            r4 = 240(0xf0, float:3.36E-43)
        L_0x03d5:
            float r4 = (float) r4
            androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry r3 = new androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry
            r3.<init>(r4, r5)
            androidx.media3.common.Metadata$Entry[] r3 = new androidx.media3.common.Metadata.Entry[]{r3}
            androidx.media3.common.Metadata r4 = new androidx.media3.common.Metadata
            r4.<init>((androidx.media3.common.Metadata.Entry[]) r3)
        L_0x03e4:
            androidx.media3.common.Metadata$Entry[] r4 = r4.A01
            r3 = r16
            androidx.media3.common.Metadata r16 = r3.A00(r4)
        L_0x03ec:
            int r10 = r10 + r24
            r12.A0O(r10)
            goto L_0x0056
        L_0x03f3:
            r3 = 13
            if (r7 != r3) goto L_0x03fa
            r4 = 120(0x78, float:1.68E-43)
            goto L_0x03d5
        L_0x03fa:
            r3 = 21
            if (r7 != r3) goto L_0x03ec
            int r7 = r12.A00
            int r3 = r12.A01
            int r7 = r7 - r3
            if (r7 < r11) goto L_0x03ec
            int r3 = r3 + 8
            if (r3 > r4) goto L_0x03ec
            int r4 = r12.A01()
            int r3 = r12.A01()
            if (r4 < r6) goto L_0x03ec
            r4 = 1936877170(0x73726672, float:1.9204921E31)
            if (r3 != r4) goto L_0x03ec
            byte[] r4 = r12.A02
            int r3 = r12.A01
            int r8 = r3 + 1
            byte r3 = r4[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r7 = r3 << 8
            int r6 = r8 + 1
            byte r3 = r4[r8]
            r4 = r3 & 255(0xff, float:3.57E-43)
            r4 = r4 | r7
            int r3 = r6 + 2
            r12.A01 = r3
            r3 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r4 != r3) goto L_0x03d5
            goto L_0x03ec
        L_0x0435:
            r3 = r18
            if (r8 != r3) goto L_0x03c9
            r5 = r9
            goto L_0x03c9
        L_0x043b:
            int r7 = r7 + r6
            r12.A0O(r7)
            goto L_0x03a2
        L_0x0441:
            r3 = -1451722374(0xffffffffa978797a, float:-5.5172426E-14)
            if (r4 != r3) goto L_0x03ec
            short r4 = r12.A0K()
            r3 = r17
            r12.A0P(r3)
            java.nio.charset.Charset r3 = X.AnonymousClass2RN.A05
            java.lang.String r6 = r12.A0I(r3, r4)
            r3 = 43
            int r4 = r6.lastIndexOf(r3)
            r3 = 45
            int r3 = r6.lastIndexOf(r3)
            int r5 = java.lang.Math.max(r4, r3)
            java.lang.String r3 = r6.substring(r2, r5)     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x03ec }
            float r4 = java.lang.Float.parseFloat(r3)     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x03ec }
            int r3 = r6.length()     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x03ec }
            int r3 = r3 - r18
            java.lang.String r3 = r6.substring(r5, r3)     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x03ec }
            float r5 = java.lang.Float.parseFloat(r3)     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x03ec }
            androidx.media3.container.Mp4LocationData r3 = new androidx.media3.container.Mp4LocationData     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x03ec }
            r3.<init>(r4, r5)     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x03ec }
            androidx.media3.common.Metadata$Entry[] r3 = new androidx.media3.common.Metadata.Entry[]{r3}     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x03ec }
            androidx.media3.common.Metadata r4 = new androidx.media3.common.Metadata     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x03ec }
            r4.<init>((androidx.media3.common.Metadata.Entry[]) r3)     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x03ec }
            goto L_0x03e4
        L_0x048b:
            r4 = r16
            r3 = r19
            r3.A00(r4)
            goto L_0x0495
        L_0x0493:
            r16 = 0
        L_0x0495:
            r3 = 1835365473(0x6d657461, float:4.4382975E27)
            X.QEL r6 = r0.A00(r3)
            if (r6 == 0) goto L_0x054d
            byte[] r3 = X.C11399SRu.A00
            r3 = 1751411826(0x68646c72, float:4.3148E24)
            X.QEK r4 = r6.A01(r3)
            r3 = 1801812339(0x6b657973, float:2.7741754E26)
            X.QEK r5 = r6.A01(r3)
            r3 = 1768715124(0x696c7374, float:1.7865732E25)
            X.QEK r7 = r6.A01(r3)
            r15 = 0
            if (r4 == 0) goto L_0x055a
            if (r5 == 0) goto L_0x055a
            if (r7 == 0) goto L_0x055a
            X.SRd r4 = r4.A00
            r3 = 16
            int r4 = X.Pxf.A06(r4, r3)
            r3 = 1835299937(0x6d647461, float:4.4189547E27)
            if (r4 != r3) goto L_0x055a
            X.SRd r6 = r5.A00
            r3 = 12
            int r12 = X.Pxf.A06(r6, r3)
            java.lang.String[] r11 = new java.lang.String[r12]
            r5 = 0
        L_0x04d4:
            r10 = 8
            if (r5 >= r12) goto L_0x04ec
            int r4 = r6.A01()
            r3 = 4
            r6.A0P(r3)
            int r4 = r4 - r10
            java.nio.charset.Charset r3 = X.AnonymousClass2RN.A05
            java.lang.String r3 = r6.A0I(r3, r4)
            r11[r5] = r3
            int r5 = r5 + 1
            goto L_0x04d4
        L_0x04ec:
            X.SRd r9 = r7.A00
            r9.A0O(r10)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
        L_0x04f5:
            int r3 = r9.A00
            int r7 = r9.A01
            int r3 = r3 - r7
            if (r3 <= r10) goto L_0x054f
            int r21 = r9.A01()
            int r3 = r9.A01()
            int r4 = r3 + -1
            if (r4 < 0) goto L_0x0541
            if (r4 >= r12) goto L_0x0541
            r13 = r11[r4]
            int r6 = r7 + r21
        L_0x050e:
            int r5 = r9.A01
            if (r5 >= r6) goto L_0x0536
            int r14 = r9.A01()
            int r4 = r9.A01()
            r3 = 1684108385(0x64617461, float:1.6635614E22)
            if (r4 != r3) goto L_0x053c
            int r6 = r9.A01()
            int r5 = r9.A01()
            int r3 = r14 + -16
            byte[] r4 = new byte[r3]
            r9.A0R(r4, r2, r3)
            androidx.media3.container.MdtaMetadataEntry r3 = new androidx.media3.container.MdtaMetadataEntry
            r3.<init>(r4, r5, r6, r13)
            r8.add(r3)
        L_0x0536:
            int r7 = r7 + r21
            r9.A0O(r7)
            goto L_0x04f5
        L_0x053c:
            int r5 = r5 + r14
            r9.A0O(r5)
            goto L_0x050e
        L_0x0541:
            java.lang.String r3 = "Skipped metadata with unknown key index: "
            java.lang.String r4 = X.002.A0O(r3, r4)
            java.lang.String r3 = "AtomParsers"
            X.STH.A03(r3, r4)
            goto L_0x0536
        L_0x054d:
            r15 = 0
            goto L_0x055a
        L_0x054f:
            boolean r3 = r8.isEmpty()
            if (r3 != 0) goto L_0x055a
            androidx.media3.common.Metadata r15 = new androidx.media3.common.Metadata
            r15.<init>((java.util.List) r8)
        L_0x055a:
            r3 = 1836476516(0x6d766864, float:4.7662196E27)
            X.QEK r3 = r0.A01(r3)
            r3.getClass()
            X.SRd r3 = r3.A00
            byte[] r4 = X.C11399SRu.A00
            int r4 = X.Pxg.A04(r3)
            if (r4 != 0) goto L_0x06c0
            long r4 = r3.A0C()
            long r6 = r3.A0C()
        L_0x0576:
            long r8 = r3.A0C()
            androidx.media3.container.Mp4TimestampData r3 = new androidx.media3.container.Mp4TimestampData
            r3.<init>(r4, r6, r8)
            androidx.media3.common.Metadata$Entry[] r4 = new androidx.media3.common.Metadata.Entry[]{r3}
            androidx.media3.common.Metadata r27 = new androidx.media3.common.Metadata
            r3 = r27
            r3.<init>((androidx.media3.common.Metadata.Entry[]) r4)
            int r3 = r1.A0I
            r26 = r3
            r3 = r3 & 1
            boolean r34 = X.AnonymousClass7TF.A1P(r3)
            r32 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r28 = 0
            r25 = 0
            X.SzZ r3 = new X.SzZ
            r3.<init>(r2)
            r29 = r19
            r30 = r0
            r31 = r3
            java.util.ArrayList r24 = X.C11399SRu.A03(r28, r29, r30, r31, r32, r34, r35)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 0
            r6 = -1
            r9 = 0
        L_0x05b4:
            int r0 = r24.size()
            if (r8 >= r0) goto L_0x06ca
            r0 = r24
            java.lang.Object r0 = r0.get(r8)
            X.S39 r0 = (X.S39) r0
            int r4 = r0.A01
            if (r4 == 0) goto L_0x06bc
            X.Ryn r7 = r0.A03
            long r4 = r7.A04
            int r10 = (r4 > r32 ? 1 : (r4 == r32 ? 0 : -1))
            if (r10 == 0) goto L_0x0688
            long r4 = r7.A04
        L_0x05d0:
            long r2 = java.lang.Math.max(r2, r4)
            X.YBZ r11 = r1.A0C
            int r23 = r9 + 1
            int r10 = r7.A03
            X.TjN r9 = r11.FHV(r9, r10)
            X.Rwx r12 = new X.Rwx
            r12.<init>(r9, r7, r0)
            X.SJM r9 = r7.A07
            java.lang.String r10 = r9.A0Y
            java.lang.String r9 = "audio/true-hd"
            boolean r11 = r9.equals(r10)
            int r9 = r0.A00
            int r10 = r9 + 30
            if (r11 == 0) goto L_0x05f5
            int r10 = r9 * 16
        L_0x05f5:
            X.SJM r11 = r7.A07
            X.SOW r9 = new X.SOW
            r9.<init>(r11)
            r9.A0A = r10
            int r11 = r7.A03
            r10 = r17
            if (r11 != r10) goto L_0x0629
            r10 = r26 & 8
            if (r10 == 0) goto L_0x0614
            X.SJM r10 = r7.A07
            int r10 = r10.A0G
            r11 = -1
            r13 = 2
            if (r6 != r11) goto L_0x0611
            r13 = 1
        L_0x0611:
            r10 = r10 | r13
            r9.A0E = r10
        L_0x0614:
            r13 = 0
            int r10 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r10 <= 0) goto L_0x0629
            int r10 = r0.A01
            if (r10 <= 0) goto L_0x0629
            int r0 = r0.A01
            float r10 = (float) r0
            float r0 = (float) r4
            r4 = 1232348160(0x49742400, float:1000000.0)
            float r0 = r0 / r4
            float r10 = r10 / r0
            r9.A00 = r10
        L_0x0629:
            int r13 = r7.A03
            r0 = r18
            if (r13 != r0) goto L_0x063e
            r0 = r19
            int r5 = r0.A00
            r4 = -1
            if (r5 == r4) goto L_0x063e
            int r0 = r0.A01
            if (r0 == r4) goto L_0x063e
            r9.A07 = r5
            r9.A08 = r0
        L_0x063e:
            r22 = 3
            java.util.List r0 = r1.A0P
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0682
            r5 = 0
        L_0x0649:
            r4 = r16
            r0 = r27
            androidx.media3.common.Metadata[] r21 = new androidx.media3.common.Metadata[]{r5, r4, r0}
            r11 = 0
            androidx.media3.common.Metadata$Entry[] r0 = new androidx.media3.common.Metadata.Entry[r11]
            androidx.media3.common.Metadata r4 = new androidx.media3.common.Metadata
            r4.<init>((androidx.media3.common.Metadata.Entry[]) r0)
            if (r15 == 0) goto L_0x068c
            r10 = 0
        L_0x065c:
            androidx.media3.common.Metadata$Entry[] r0 = r15.A01
            int r5 = r0.length
            if (r10 >= r5) goto L_0x068c
            r5 = r0[r10]
            boolean r0 = r5 instanceof androidx.media3.container.MdtaMetadataEntry
            if (r0 == 0) goto L_0x067f
            androidx.media3.container.MdtaMetadataEntry r5 = (androidx.media3.container.MdtaMetadataEntry) r5
            java.lang.String r14 = r5.A02
            java.lang.String r0 = "com.android.capture.fps"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0677
            r0 = r17
            if (r13 != r0) goto L_0x067f
        L_0x0677:
            androidx.media3.common.Metadata$Entry[] r0 = new androidx.media3.common.Metadata.Entry[]{r5}
            androidx.media3.common.Metadata r4 = r4.A00(r0)
        L_0x067f:
            int r10 = r10 + 1
            goto L_0x065c
        L_0x0682:
            androidx.media3.common.Metadata r5 = new androidx.media3.common.Metadata
            r5.<init>((java.util.List) r0)
            goto L_0x0649
        L_0x0688:
            long r4 = r0.A02
            goto L_0x05d0
        L_0x068c:
            r0 = r21[r11]
            if (r0 == 0) goto L_0x0696
            androidx.media3.common.Metadata$Entry[] r0 = r0.A01
            androidx.media3.common.Metadata r4 = r4.A00(r0)
        L_0x0696:
            int r11 = r11 + 1
            r0 = r22
            if (r11 < r0) goto L_0x068c
            androidx.media3.common.Metadata$Entry[] r0 = r4.A01
            int r0 = r0.length
            if (r0 <= 0) goto L_0x06a3
            r9.A0P = r4
        L_0x06a3:
            X.TjN r0 = r12.A01
            X.C13900TjN.A00(r9, r0)
            int r0 = r7.A03
            r4 = r17
            if (r0 != r4) goto L_0x06b5
            r0 = -1
            if (r6 != r0) goto L_0x06b5
            int r6 = r20.size()
        L_0x06b5:
            r0 = r20
            r0.add(r12)
            r9 = r23
        L_0x06bc:
            int r8 = r8 + 1
            goto L_0x05b4
        L_0x06c0:
            long r4 = r3.A0B()
            long r6 = r3.A0B()
            goto L_0x0576
        L_0x06ca:
            r1.A03 = r6
            r1.A0A = r2
            r0 = r25
            X.Rwx[] r2 = new X.C10719Rwx[r0]
            r0 = r20
            java.lang.Object[] r9 = r0.toArray(r2)
            X.Rwx[] r9 = (X.C10719Rwx[]) r9
            r1.A0G = r9
            int r8 = r9.length
            long[][] r7 = new long[r8][]
            int[] r6 = new int[r8]
            long[] r5 = new long[r8]
            boolean[] r4 = new boolean[r8]
            r10 = 0
        L_0x06e6:
            if (r10 >= r8) goto L_0x06ff
            r0 = r9[r10]
            X.S39 r0 = r0.A04
            int r0 = r0.A01
            long[] r0 = new long[r0]
            r7[r10] = r0
            r0 = r9[r10]
            X.S39 r0 = r0.A04
            long[] r0 = r0.A07
            r2 = r0[r25]
            r5[r10] = r2
            int r10 = r10 + 1
            goto L_0x06e6
        L_0x06ff:
            r19 = 0
            r0 = 0
        L_0x0702:
            if (r0 >= r8) goto L_0x0740
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = -1
            r3 = 0
        L_0x070b:
            if (r3 >= r8) goto L_0x071c
            boolean r2 = r4[r3]
            if (r2 != 0) goto L_0x0719
            r10 = r5[r3]
            int r2 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r2 > 0) goto L_0x0719
            r13 = r3
            r14 = r10
        L_0x0719:
            int r3 = r3 + 1
            goto L_0x070b
        L_0x071c:
            r12 = r6[r13]
            r11 = r7[r13]
            r11[r12] = r19
            r2 = r9[r13]
            X.S39 r10 = r2.A04
            int[] r2 = r10.A05
            r2 = r2[r12]
            long r2 = (long) r2
            long r19 = r19 + r2
            int r3 = r12 + 1
            r6[r13] = r3
            int r2 = r11.length
            if (r3 >= r2) goto L_0x073b
            long[] r2 = r10.A07
            r2 = r2[r3]
            r5[r13] = r2
            goto L_0x0702
        L_0x073b:
            r4[r13] = r18
            int r0 = r0 + 1
            goto L_0x0702
        L_0x0740:
            r1.A0H = r7
            X.YBZ r0 = r1.A0C
            r0.ASU()
            X.YBZ r0 = r1.A0C
            r0.EKw(r1)
            r36.clear()
            r0 = r17
            r1.A04 = r0
            goto L_0x0000
        L_0x0755:
            boolean r1 = r36.isEmpty()
            if (r1 != 0) goto L_0x0000
            java.lang.Object r1 = r36.peek()
            X.QEL r1 = (X.QEL) r1
            java.util.List r1 = r1.A01
            r1.add(r0)
            goto L_0x0000
        L_0x0768:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0768 }
            throw r0     // Catch:{ all -> 0x076b }
        L_0x076b:
            r0 = move-exception
            r12.A0O(r7)
            throw r0
        L_0x0770:
            int r2 = r1.A04
            r0 = r17
            if (r2 == r0) goto L_0x077b
            r0 = 0
            r1.A04 = r0
            r1.A00 = r0
        L_0x077b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11697Seu.A00(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r6 == -1) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        if (r3 == -1) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.S5O A01(int r19, long r20) {
        /*
            r18 = this;
            r13 = r18
            X.Rwx[] r4 = r13.A0G
            int r0 = r4.length
            if (r0 == 0) goto L_0x0037
            r12 = -1
            r3 = r19
            if (r3 == r12) goto L_0x002e
            r2 = r3
        L_0x000d:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r20
            if (r2 == r12) goto L_0x00b9
            r2 = r4[r2]
            X.S39 r11 = r2.A04
            long[] r4 = r11.A07
            r2 = 0
            int r6 = androidx.media3.common.util.Util.A02(r4, r0, r2)
        L_0x0021:
            if (r6 < 0) goto L_0x0031
            int[] r2 = r11.A04
            r2 = r2[r6]
            r2 = r2 & 1
            if (r2 != 0) goto L_0x003f
            int r6 = r6 + -1
            goto L_0x0021
        L_0x002e:
            int r2 = r13.A03
            goto L_0x000d
        L_0x0031:
            int r6 = r11.A00(r0)
            if (r6 != r12) goto L_0x003f
        L_0x0037:
            X.SJ4 r3 = X.SJ4.A02
        L_0x0039:
            X.S5O r1 = new X.S5O
            r1.<init>(r3, r3)
            return r1
        L_0x003f:
            long[] r5 = r11.A07
            r9 = r5[r6]
            long[] r4 = r11.A06
            r7 = r4[r6]
            int r2 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r2 >= 0) goto L_0x00bf
            int r2 = r11.A01
            int r2 = r2 + -1
            if (r6 >= r2) goto L_0x00bf
            int r0 = r11.A00(r0)
            if (r0 == r12) goto L_0x00bf
            if (r0 == r6) goto L_0x00bf
            r5 = r5[r0]
            r1 = r4[r0]
        L_0x005d:
            if (r3 != r12) goto L_0x00c7
            r11 = 0
        L_0x0060:
            X.Rwx[] r3 = r13.A0G
            int r0 = r3.length
            if (r11 >= r0) goto L_0x00c7
            int r0 = r13.A03
            if (r11 == r0) goto L_0x00ad
            r0 = r3[r11]
            X.S39 r14 = r0.A04
            long[] r0 = r14.A07
            r15 = 0
            int r3 = androidx.media3.common.util.Util.A02(r0, r9, r15)
        L_0x0074:
            if (r3 < 0) goto L_0x0081
            int[] r0 = r14.A04
            r0 = r0[r3]
            r0 = r0 & 1
            if (r0 != 0) goto L_0x009e
            int r3 = r3 + -1
            goto L_0x0074
        L_0x0081:
            int r3 = r14.A00(r9)
            if (r3 != r12) goto L_0x009e
        L_0x0087:
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x00ad
            long[] r0 = r14.A07
            int r3 = androidx.media3.common.util.Util.A02(r0, r5, r15)
        L_0x0091:
            if (r3 < 0) goto L_0x00a7
            int[] r0 = r14.A04
            r0 = r0[r3]
            r0 = r0 & 1
            if (r0 != 0) goto L_0x00b0
            int r3 = r3 + -1
            goto L_0x0091
        L_0x009e:
            long[] r0 = r14.A06
            r3 = r0[r3]
            long r7 = java.lang.Math.min(r3, r7)
            goto L_0x0087
        L_0x00a7:
            int r3 = r14.A00(r5)
            if (r3 != r12) goto L_0x00b0
        L_0x00ad:
            int r11 = r11 + 1
            goto L_0x0060
        L_0x00b0:
            long[] r0 = r14.A06
            r3 = r0[r3]
            long r1 = java.lang.Math.min(r3, r1)
            goto L_0x00ad
        L_0x00b9:
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = r0
        L_0x00bf:
            r1 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x005d
        L_0x00c7:
            X.SJ4 r3 = new X.SJ4
            r3.<init>(r9, r7)
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0039
            X.SJ4 r0 = new X.SJ4
            r0.<init>(r5, r1)
            X.S5O r1 = new X.S5O
            r1.<init>(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11697Seu.A01(int, long):X.S5O");
    }

    public final void CMU(YBZ ybz) {
        if ((this.A0I & 16) == 0) {
            ybz = new C11703Sf0(ybz, this.A0Q);
        }
        this.A0C = ybz;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0421, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0427, code lost:
        throw new X.XQX((java.lang.String) null, r1, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x042d, code lost:
        throw new X.XQX((java.lang.String) null, (java.lang.Throwable) null, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x04f9, code lost:
        if (r1 == 0) goto L_0x04fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a5, code lost:
        r4 = r12.A00 - (r13 + 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0146, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0146, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0146, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ac, code lost:
        if (r9 == 2192) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        if (r9 == 2816) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
        if (r9 == 2817) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b8, code lost:
        if (r9 == 2819) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bc, code lost:
        if (r9 == 2820) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c2, code lost:
        throw X.Pxe.A0i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c3, code lost:
        r9 = X.AnonymousClass7TE.A1C();
        r12 = r6.A0I(r11, r4);
        r4 = X.C11196SEw.A03;
        r12.getClass();
        r11 = new X.C8634QyX(r4.A01, r4, r12);
        r4 = X.AnonymousClass7TE.A1C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00df, code lost:
        if (r11.hasNext() == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e1, code lost:
        X.JTT.A1U(r4, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e5, code lost:
        r15 = java.util.Collections.unmodifiableList(r4);
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ef, code lost:
        if (r4 >= r15.size()) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f1, code lost:
        r14 = X.C11196SEw.A04;
        r11 = X.Pxe.A0f(r15, r4);
        r11.getClass();
        r13 = new X.C8634QyX(r14.A01, r14, r11);
        r11 = X.AnonymousClass7TE.A1C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0109, code lost:
        if (r13.hasNext() == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010b, code lost:
        X.JTT.A1U(r11, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010f, code lost:
        r11 = java.util.Collections.unmodifiableList(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011a, code lost:
        if (r11.size() != 3) goto L_0x0428;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r9.add(new androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment(X.Pxg.A0J(r11, 0), X.Pxg.A0J(r11, 1), 1 << (java.lang.Integer.parseInt(X.AnonymousClass7TE.A19(r11, 2)) - 1)));
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013c, code lost:
        r25.add(new androidx.media3.extractor.metadata.mp4.SlowMotionData(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0193, code lost:
        if (r5 == false) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0197, code lost:
        if (r14 < r16) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0199, code lost:
        r5 = r2;
        r16 = r14;
        r22 = r6;
        r18 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a2, code lost:
        if (r10 >= r20) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a4, code lost:
        r12 = r2;
        r4 = r6;
        r20 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ac, code lost:
        if (true == r5) goto L_0x0195;
     */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0629 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int E67(X.C13910TlA r28, X.C21363XYr r29) {
        /*
            r27 = this;
        L_0x0000:
            r0 = r27
            int r1 = r0.A04
            r9 = r28
            if (r1 == 0) goto L_0x025f
            r8 = 1
            r26 = r29
            if (r1 == r8) goto L_0x01cb
            r7 = 2
            if (r1 == r7) goto L_0x014a
            r18 = 3
            X.SEw r10 = r0.A0N
            java.util.List r1 = r0.A0P
            r25 = r1
            int r3 = r10.A00
            r1 = 0
            if (r3 == 0) goto L_0x04b1
            if (r3 == r8) goto L_0x04ca
            if (r3 == r7) goto L_0x042e
            long r16 = r9.Bdl()
            long r5 = r9.getLength()
            long r5 = r5 - r16
            int r3 = r10.A01
            long r3 = (long) r3
            long r5 = r5 - r3
            int r4 = (int) r5
            X.SRd r6 = X.Pxe.A0P(r4)
            byte[] r3 = r6.A02
            r5 = 0
            r9.readFully(r3, r5, r4)
        L_0x003b:
            java.util.List r4 = r10.A02
            int r3 = r4.size()
            if (r5 >= r3) goto L_0x0501
            java.lang.Object r12 = r4.get(r5)
            X.Rql r12 = (X.C10348Rql) r12
            long r3 = r12.A01
            long r3 = r3 - r16
            int r9 = (int) r3
            r6.A0O(r9)
            r3 = 4
            r6.A0P(r3)
            int r13 = r6.A02()
            java.nio.charset.Charset r11 = X.AnonymousClass2RN.A05
            java.lang.String r4 = r6.A0I(r11, r13)
            int r3 = r4.hashCode()
            switch(r3) {
                case -1711564334: goto L_0x006f;
                case -1332107749: goto L_0x007a;
                case -1251387154: goto L_0x0085;
                case -830665521: goto L_0x0090;
                case 1760745220: goto L_0x009b;
                default: goto L_0x0066;
            }
        L_0x0066:
            r1 = 0
            java.lang.String r0 = "Invalid SEF name"
            X.XQX r2 = new X.XQX
            r2.<init>(r0, r1, r8, r8)
            throw r2
        L_0x006f:
            java.lang.String r3 = "SlowMotion_Data"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0066
            r9 = 2192(0x890, float:3.072E-42)
            goto L_0x00a5
        L_0x007a:
            java.lang.String r3 = "Super_SlowMotion_Edit_Data"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0066
            r9 = 2819(0xb03, float:3.95E-42)
            goto L_0x00a5
        L_0x0085:
            java.lang.String r3 = "Super_SlowMotion_Data"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0066
            r9 = 2816(0xb00, float:3.946E-42)
            goto L_0x00a5
        L_0x0090:
            java.lang.String r3 = "Super_SlowMotion_Deflickering_On"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0066
            r9 = 2820(0xb04, float:3.952E-42)
            goto L_0x00a5
        L_0x009b:
            java.lang.String r3 = "Super_SlowMotion_BGM"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0066
            r9 = 2817(0xb01, float:3.947E-42)
        L_0x00a5:
            int r4 = r12.A00
            int r3 = r13 + 8
            int r4 = r4 - r3
            r3 = 2192(0x890, float:3.072E-42)
            if (r9 == r3) goto L_0x00c3
            r3 = 2816(0xb00, float:3.946E-42)
            if (r9 == r3) goto L_0x0146
            r3 = 2817(0xb01, float:3.947E-42)
            if (r9 == r3) goto L_0x0146
            r3 = 2819(0xb03, float:3.95E-42)
            if (r9 == r3) goto L_0x0146
            r3 = 2820(0xb04, float:3.952E-42)
            if (r9 == r3) goto L_0x0146
            java.lang.IllegalStateException r2 = X.Pxe.A0i()
            throw r2
        L_0x00c3:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.lang.String r12 = r6.A0I(r11, r4)
            X.Q0s r4 = X.C11196SEw.A03
            r12.getClass()
            X.Q0u r3 = r4.A01
            X.QyX r11 = new X.QyX
            r11.<init>(r3, r4, r12)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
        L_0x00db:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x00e5
            X.JTT.A1U(r4, r11)
            goto L_0x00db
        L_0x00e5:
            java.util.List r15 = java.util.Collections.unmodifiableList(r4)
            r12 = 0
            r4 = 0
        L_0x00eb:
            int r3 = r15.size()
            if (r4 >= r3) goto L_0x013c
            X.Q0s r14 = X.C11196SEw.A04
            java.lang.CharSequence r11 = X.Pxe.A0f(r15, r4)
            r11.getClass()
            X.Q0u r3 = r14.A01
            X.QyX r13 = new X.QyX
            r13.<init>(r3, r14, r11)
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
        L_0x0105:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x010f
            X.JTT.A1U(r11, r13)
            goto L_0x0105
        L_0x010f:
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            int r14 = r11.size()
            r3 = 0
            r13 = r18
            if (r14 != r13) goto L_0x0428
            long r20 = X.Pxg.A0J(r11, r12)     // Catch:{ NumberFormatException -> 0x0421 }
            long r22 = X.Pxg.A0J(r11, r8)     // Catch:{ NumberFormatException -> 0x0421 }
            java.lang.String r11 = X.AnonymousClass7TE.A19(r11, r7)     // Catch:{ NumberFormatException -> 0x0421 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x0421 }
            int r11 = r11 - r8
            int r24 = r8 << r11
            androidx.media3.extractor.metadata.mp4.SlowMotionData$Segment r11 = new androidx.media3.extractor.metadata.mp4.SlowMotionData$Segment     // Catch:{ NumberFormatException -> 0x0421 }
            r19 = r11
            r19.<init>(r20, r22, r24)     // Catch:{ NumberFormatException -> 0x0421 }
            r9.add(r11)     // Catch:{ NumberFormatException -> 0x0421 }
            int r4 = r4 + 1
            goto L_0x00eb
        L_0x013c:
            androidx.media3.extractor.metadata.mp4.SlowMotionData r4 = new androidx.media3.extractor.metadata.mp4.SlowMotionData
            r4.<init>(r9)
            r3 = r25
            r3.add(r4)
        L_0x0146:
            int r5 = r5 + 1
            goto L_0x003b
        L_0x014a:
            long r23 = r9.Bdl()
            int r4 = r0.A08
            r13 = -1
            if (r4 != r13) goto L_0x0506
            r4 = -1
            r22 = -1
            r6 = 0
            r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 1
            r18 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = 1
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0168:
            X.Rwx[] r2 = r0.A0G
            int r1 = r2.length
            if (r6 >= r1) goto L_0x01af
            r3 = r2[r6]
            int r2 = r3.A00
            X.S39 r1 = r3.A04
            int r1 = r1.A01
            if (r2 == r1) goto L_0x01a8
            X.S39 r1 = r3.A04
            long[] r1 = r1.A06
            r14 = r1[r2]
            long[][] r1 = r0.A0H
            r1 = r1[r6]
            r10 = r1[r2]
            long r14 = r14 - r23
            r2 = 0
            int r1 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x01ab
            r2 = 262144(0x40000, double:1.295163E-318)
            int r1 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x01ab
            r2 = 0
            if (r5 != 0) goto L_0x0199
        L_0x0195:
            int r1 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r1 >= 0) goto L_0x01a0
        L_0x0199:
            r5 = r2
            r16 = r14
            r22 = r6
            r18 = r10
        L_0x01a0:
            int r1 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r1 >= 0) goto L_0x01a8
            r12 = r2
            r4 = r6
            r20 = r10
        L_0x01a8:
            int r6 = r6 + 1
            goto L_0x0168
        L_0x01ab:
            r2 = 1
            if (r8 != r5) goto L_0x01a0
            goto L_0x0195
        L_0x01af:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x01c3
            if (r12 == 0) goto L_0x01c3
            r1 = 10485760(0xa00000, double:5.180654E-317)
            long r20 = r20 + r1
            int r1 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r1 >= 0) goto L_0x01c5
        L_0x01c3:
            r4 = r22
        L_0x01c5:
            r0.A08 = r4
            if (r4 != r13) goto L_0x0506
            goto L_0x02a0
        L_0x01cb:
            long r4 = r0.A09
            int r10 = r0.A00
            long r1 = (long) r10
            long r4 = r4 - r1
            long r2 = r9.Bdl()
            long r2 = r2 + r4
            X.SRd r6 = r0.A0B
            if (r6 == 0) goto L_0x0231
            byte[] r7 = r6.A02
            int r1 = (int) r4
            r9.readFully(r7, r10, r1)
            int r4 = r0.A01
            r1 = 1718909296(0x66747970, float:2.8862439E23)
            if (r4 != r1) goto L_0x0216
            r0.A0F = r8
            r1 = 8
            int r4 = X.Pxf.A06(r6, r1)
            r1 = 1751476579(0x68656963, float:4.333464E24)
            if (r4 == r1) goto L_0x0214
            r1 = 1903435808(0x71742020, float:1.2088509E30)
            if (r4 == r1) goto L_0x0212
            r1 = 4
            r6.A0P(r1)
        L_0x01fd:
            int r1 = X.Pxe.A06(r6)
            if (r1 <= 0) goto L_0x0250
            int r4 = r6.A01()
            r1 = 1751476579(0x68656963, float:4.333464E24)
            if (r4 == r1) goto L_0x0214
            r1 = 1903435808(0x71742020, float:1.2088509E30)
            if (r4 == r1) goto L_0x0212
            goto L_0x01fd
        L_0x0212:
            r1 = 1
            goto L_0x0251
        L_0x0214:
            r1 = 2
            goto L_0x0251
        L_0x0216:
            java.util.ArrayDeque r4 = r0.A0O
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x0253
            java.lang.Object r5 = r4.peek()
            X.QEL r5 = (X.QEL) r5
            int r1 = r0.A01
            X.QEK r4 = new X.QEK
            r4.<init>(r6, r1)
            java.util.List r1 = r5.A02
            r1.add(r4)
            goto L_0x0253
        L_0x0231:
            boolean r1 = r0.A0F
            if (r1 != 0) goto L_0x023e
            int r6 = r0.A01
            r1 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r6 != r1) goto L_0x023e
            r0.A02 = r8
        L_0x023e:
            r6 = 262144(0x40000, double:1.295163E-318)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x024a
            int r1 = (int) r4
            r9.Evk(r1)
            goto L_0x0253
        L_0x024a:
            r1 = r26
            r1.A00 = r2
            r1 = 1
            goto L_0x0254
        L_0x0250:
            r1 = 0
        L_0x0251:
            r0.A02 = r1
        L_0x0253:
            r1 = 0
        L_0x0254:
            r0.A00(r2)
            if (r1 == 0) goto L_0x0000
            int r1 = r0.A04
            r0 = 2
            if (r1 == r0) goto L_0x0000
            return r8
        L_0x025f:
            int r1 = r0.A00
            r3 = 1
            r8 = 8
            r5 = 0
            if (r1 != 0) goto L_0x02bd
            X.SRd r4 = r0.A0J
            byte[] r1 = r4.A02
            boolean r1 = r9.E6T(r1, r5, r8, r3)
            if (r1 != 0) goto L_0x02ac
            int r2 = r0.A02
            r1 = 2
            if (r2 != r1) goto L_0x02a0
            int r1 = r0.A0I
            r1 = r1 & 2
            if (r1 == 0) goto L_0x02a0
            X.YBZ r2 = r0.A0C
            r1 = 4
            X.TjN r3 = r2.FHV(r5, r1)
            androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata r1 = r0.A0D
            if (r1 != 0) goto L_0x02a2
            r2 = 0
        L_0x0288:
            X.SOW r1 = X.SOW.A00()
            r1.A0P = r2
            X.C13900TjN.A00(r1, r3)
            X.YBZ r1 = r0.A0C
            r1.ASU()
            X.YBZ r2 = r0.A0C
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            X.C11710Sf7.A00(r2, r0)
        L_0x02a0:
            r8 = -1
            return r8
        L_0x02a2:
            androidx.media3.common.Metadata$Entry[] r1 = new androidx.media3.common.Metadata.Entry[]{r1}
            androidx.media3.common.Metadata r2 = new androidx.media3.common.Metadata
            r2.<init>((androidx.media3.common.Metadata.Entry[]) r1)
            goto L_0x0288
        L_0x02ac:
            r0.A00 = r8
            r4.A0O(r5)
            long r1 = r4.A0C()
            r0.A09 = r1
            int r1 = r4.A01()
            r0.A01 = r1
        L_0x02bd:
            long r1 = r0.A09
            r6 = 1
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x03a4
            X.SRd r2 = r0.A0J
            byte[] r1 = r2.A02
            r9.readFully(r1, r8, r8)
            int r1 = r0.A00
            int r1 = r1 + 8
            r0.A00 = r1
            long r6 = r2.A0D()
        L_0x02d6:
            r0.A09 = r6
        L_0x02d8:
            long r13 = r0.A09
            int r7 = r0.A00
            long r1 = (long) r7
            int r4 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r4 < 0) goto L_0x0629
            int r6 = r0.A01
            r4 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r6 == r4) goto L_0x03cf
            r4 = 1953653099(0x7472616b, float:7.681346E31)
            if (r6 == r4) goto L_0x03cf
            r4 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r6 == r4) goto L_0x03cf
            r4 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r6 == r4) goto L_0x03cf
            r4 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r6 == r4) goto L_0x03cf
            r4 = 1701082227(0x65647473, float:6.742798E22)
            if (r6 == r4) goto L_0x03cf
            r4 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r6 == r4) goto L_0x03cf
            r4 = 1835296868(0x6d646864, float:4.418049E27)
            if (r6 == r4) goto L_0x0382
            r4 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r6 == r4) goto L_0x0382
            r4 = 1751411826(0x68646c72, float:4.3148E24)
            if (r6 == r4) goto L_0x0382
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            if (r6 == r4) goto L_0x0382
            r4 = 1937011827(0x73747473, float:1.9367711E31)
            if (r6 == r4) goto L_0x0382
            r4 = 1937011571(0x73747373, float:1.9367401E31)
            if (r6 == r4) goto L_0x0382
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            if (r6 == r4) goto L_0x0382
            r4 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r6 == r4) goto L_0x0382
            r4 = 1937011555(0x73747363, float:1.9367382E31)
            if (r6 == r4) goto L_0x0382
            r4 = 1937011578(0x7374737a, float:1.936741E31)
            if (r6 == r4) goto L_0x0382
            r4 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r6 == r4) goto L_0x0382
            r4 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r6 == r4) goto L_0x0382
            r4 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r6 == r4) goto L_0x0382
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            if (r6 == r4) goto L_0x0382
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            if (r6 == r4) goto L_0x0382
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            if (r6 == r4) goto L_0x0382
            r4 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r6 == r4) goto L_0x0382
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r6 == r4) goto L_0x0382
            long r7 = r9.Bdl()
            long r7 = r7 - r1
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r6 != r4) goto L_0x037b
            r5 = 0
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r11 = r7 + r1
            long r13 = r13 - r1
            androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata r4 = new androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata
            r4.<init>(r5, r7, r9, r11, r13)
            r0.A0D = r4
        L_0x037b:
            r4 = 0
        L_0x037c:
            r0.A0B = r4
            r0.A04 = r3
            goto L_0x0000
        L_0x0382:
            boolean r1 = X.AnonymousClass7TF.A1S(r7, r8)
            X.C11366SPh.A02(r1)
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            boolean r1 = X.Dba.A1U(r1)
            X.C11366SPh.A02(r1)
            int r1 = (int) r13
            X.SRd r4 = X.Pxe.A0P(r1)
            X.SRd r1 = r0.A0J
            byte[] r2 = r1.A02
            byte[] r1 = r4.A02
            java.lang.System.arraycopy(r2, r5, r1, r5, r8)
            goto L_0x037c
        L_0x03a4:
            r6 = 0
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x02d8
            long r6 = r9.getLength()
            r10 = -1
            int r1 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x03c0
            java.util.ArrayDeque r1 = r0.A0O
            java.lang.Object r1 = r1.peek()
            X.QEL r1 = (X.QEL) r1
            if (r1 == 0) goto L_0x03c0
            long r6 = r1.A00
        L_0x03c0:
            int r1 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r1 == 0) goto L_0x02d8
            long r1 = r9.Bdl()
            long r6 = r6 - r1
            int r1 = r0.A00
            long r1 = (long) r1
            long r6 = r6 + r1
            goto L_0x02d6
        L_0x03cf:
            long r3 = r9.Bdl()
            long r3 = r3 + r13
            long r3 = r3 - r1
            int r7 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r7 == 0) goto L_0x0401
            r1 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r6 != r1) goto L_0x0401
            X.SRd r7 = r0.A0M
            X.C13910TlA.A00(r7, r9, r8)
            byte[] r1 = X.C11399SRu.A00
            int r6 = r7.A01
            r1 = 4
            r7.A0P(r1)
            int r2 = r7.A01()
            r1 = 1751411826(0x68646c72, float:4.3148E24)
            if (r2 == r1) goto L_0x03f6
            int r6 = r6 + 4
        L_0x03f6:
            r7.A0O(r6)
            int r1 = r7.A01
            r9.Evk(r1)
            r9.EI7()
        L_0x0401:
            java.util.ArrayDeque r6 = r0.A0O
            int r2 = r0.A01
            X.QEL r1 = new X.QEL
            r1.<init>(r2, r3)
            r6.push(r1)
            long r8 = r0.A09
            int r1 = r0.A00
            long r6 = (long) r1
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x041b
            r0.A00(r3)
            goto L_0x0000
        L_0x041b:
            r0.A04 = r5
            r0.A00 = r5
            goto L_0x0000
        L_0x0421:
            r1 = move-exception
            X.XQX r0 = new X.XQX
            r0.<init>(r3, r1, r8, r8)
            throw r0
        L_0x0428:
            X.XQX r2 = new X.XQX
            r2.<init>(r3, r3, r8, r8)
            throw r2
        L_0x042e:
            long r14 = r9.getLength()
            int r1 = r10.A01
            int r12 = r1 + -12
            r11 = 8
            int r12 = r12 - r11
            X.SRd r6 = X.Pxe.A0P(r12)
            byte[] r1 = r6.A02
            r5 = 0
            r9.readFully(r1, r5, r12)
            r9 = 0
        L_0x0444:
            int r1 = r12 / 12
            if (r9 >= r1) goto L_0x0495
            r6.A0P(r7)
            byte[] r4 = r6.A02
            int r1 = r6.A01
            int r3 = r1 + 1
            byte r1 = r4[r1]
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r6.A01 = r1
            byte r1 = r4[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r1 = r1 | r2
            short r2 = (short) r1
            r1 = 2192(0x890, float:3.072E-42)
            if (r2 == r1) goto L_0x047b
            r1 = 2816(0xb00, float:3.946E-42)
            if (r2 == r1) goto L_0x047b
            r1 = 2817(0xb01, float:3.947E-42)
            if (r2 == r1) goto L_0x047b
            r1 = 2819(0xb03, float:3.95E-42)
            if (r2 == r1) goto L_0x047b
            r1 = 2820(0xb04, float:3.952E-42)
            if (r2 == r1) goto L_0x047b
            r6.A0P(r11)
        L_0x0478:
            int r9 = r9 + 1
            goto L_0x0444
        L_0x047b:
            int r1 = r10.A01
            long r3 = (long) r1
            long r1 = r14 - r3
            int r3 = r6.A02()
            long r3 = (long) r3
            long r1 = r1 - r3
            int r13 = r6.A02()
            java.util.List r4 = r10.A02
            X.Rql r3 = new X.Rql
            r3.<init>(r1, r13)
            r4.add(r3)
            goto L_0x0478
        L_0x0495:
            java.util.List r2 = r10.A02
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x04a4
            r1 = 0
        L_0x049f:
            r3 = r26
            r3.A00 = r1
            goto L_0x04f5
        L_0x04a4:
            r1 = r18
            r10.A00 = r1
            java.lang.Object r1 = r2.get(r5)
            X.Rql r1 = (X.C10348Rql) r1
            long r1 = r1.A01
            goto L_0x049f
        L_0x04b1:
            long r6 = r9.getLength()
            r4 = -1
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x04c3
            r4 = 8
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x04c3
            long r1 = r6 - r4
        L_0x04c3:
            r3 = r26
            r3.A00 = r1
            r10.A00 = r8
            goto L_0x04f5
        L_0x04ca:
            r5 = 8
            X.SRd r6 = X.Pxe.A0P(r5)
            byte[] r4 = r6.A02
            r3 = 0
            r9.readFully(r4, r3, r5)
            int r3 = r6.A02()
            int r5 = r3 + 8
            r10.A01 = r5
            int r4 = r6.A01()
            r3 = 1397048916(0x53454654, float:8.4728847E11)
            if (r4 != r3) goto L_0x0501
            long r1 = r9.Bdl()
            int r3 = r5 + -12
            long r3 = (long) r3
            long r1 = r1 - r3
            r3 = r26
            r3.A00 = r1
            r10.A00 = r7
        L_0x04f5:
            r4 = 0
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0500
        L_0x04fb:
            r1 = 0
            r0.A04 = r1
            r0.A00 = r1
        L_0x0500:
            return r8
        L_0x0501:
            r3 = r26
            r3.A00 = r1
            goto L_0x04fb
        L_0x0506:
            X.Rwx[] r1 = r0.A0G
            r12 = r1[r4]
            X.TjN r11 = r12.A01
            int r10 = r12.A00
            X.S39 r2 = r12.A04
            long[] r1 = r2.A06
            r3 = r1[r10]
            int[] r1 = r2.A05
            r6 = r1[r10]
            X.S6Y r5 = r12.A02
            long r1 = r3 - r23
            int r14 = r0.A05
            long r14 = (long) r14
            long r1 = r1 + r14
            r15 = 0
            r18 = 1
            int r14 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r14 < 0) goto L_0x0624
            r15 = 262144(0x40000, double:1.295163E-318)
            int r14 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r14 >= 0) goto L_0x0624
            X.Ryn r3 = r12.A03
            int r3 = r3.A02
            if (r3 != r8) goto L_0x053a
            r3 = 8
            long r1 = r1 + r3
            int r6 = r6 + -8
        L_0x053a:
            int r3 = (int) r1
            r9.Evk(r3)
            X.Ryn r1 = r12.A03
            int r14 = r1.A01
            r17 = 0
            r2 = 0
            if (r14 == 0) goto L_0x059d
            X.SRd r4 = r0.A0K
            byte[] r3 = r4.A02
            r3[r2] = r2
            r3[r8] = r2
            r3[r7] = r2
            r16 = 4
            int r7 = 4 - r14
        L_0x0555:
            int r1 = r0.A06
            if (r1 >= r6) goto L_0x05e3
            int r1 = r0.A07
            if (r1 != 0) goto L_0x057f
            r9.readFully(r3, r7, r14)
            int r1 = r0.A05
            int r1 = r1 + r14
            r0.A05 = r1
            int r1 = X.Pxf.A06(r4, r2)
            if (r1 < 0) goto L_0x0593
            r0.A07 = r1
            X.SRd r15 = r0.A0L
            r15.A0O(r2)
            r1 = r16
            r11.EJf(r15, r1)
            int r1 = r0.A06
            int r1 = r1 + 4
            r0.A06 = r1
            int r6 = r6 + r7
            goto L_0x0555
        L_0x057f:
            int r15 = r11.EJe(r9, r1, r2)
            int r1 = r0.A05
            int r1 = r1 + r15
            r0.A05 = r1
            int r1 = r0.A06
            int r1 = r1 + r15
            r0.A06 = r1
            int r1 = r0.A07
            int r1 = r1 - r15
            r0.A07 = r1
            goto L_0x0555
        L_0x0593:
            java.lang.String r1 = "Invalid NAL length"
            X.XQX r2 = new X.XQX
            r0 = r17
            r2.<init>(r1, r0, r8, r8)
            throw r2
        L_0x059d:
            X.SJM r1 = r1.A07
            java.lang.String r3 = r1.A0Y
            java.lang.String r1 = "audio/ac4"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x05dd
            int r1 = r0.A06
            if (r1 != 0) goto L_0x05c1
            X.SRd r4 = r0.A0M
            r3 = 7
            r4.A0M(r3)
            byte[] r1 = r4.A02
            X.Pxk.A0g(r1, r6)
            r11.EJf(r4, r3)
            int r1 = r0.A06
            int r1 = r1 + 7
            r0.A06 = r1
        L_0x05c1:
            int r6 = r6 + 7
        L_0x05c3:
            int r1 = r0.A06
            if (r1 >= r6) goto L_0x05e3
            int r1 = r6 - r1
            int r3 = r11.EJe(r9, r1, r2)
            int r1 = r0.A05
            int r1 = r1 + r3
            r0.A05 = r1
            int r1 = r0.A06
            int r1 = r1 + r3
            r0.A06 = r1
            int r1 = r0.A07
            int r1 = r1 - r3
            r0.A07 = r1
            goto L_0x05c3
        L_0x05dd:
            if (r5 == 0) goto L_0x05c3
            r5.A00(r9)
            goto L_0x05c3
        L_0x05e3:
            X.S39 r4 = r12.A04
            long[] r1 = r4.A07
            r22 = r1[r10]
            int[] r1 = r4.A04
            r19 = r1[r10]
            if (r5 == 0) goto L_0x0616
            r20 = r6
            r21 = r2
            r16 = r5
            r18 = r11
            r16.A02(r17, r18, r19, r20, r21, r22)
            int r3 = r10 + 1
            int r1 = r4.A01
            if (r3 != r1) goto L_0x0605
            r1 = r17
            r5.A01(r1, r11)
        L_0x0605:
            r18 = 0
        L_0x0607:
            int r1 = r12.A00
            int r1 = r1 + 1
            r12.A00 = r1
            r0.A08 = r13
            r0.A05 = r2
            r0.A06 = r2
            r0.A07 = r2
            return r18
        L_0x0616:
            r18 = 0
            r3 = r11
            r4 = r17
            r5 = r19
            r7 = r2
            r8 = r22
            r3.EJm(r4, r5, r6, r7, r8)
            goto L_0x0607
        L_0x0624:
            r0 = r26
            r0.A00 = r3
            return r18
        L_0x0629:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            r0 = 0
            X.XQX r2 = new X.XQX
            r2.<init>(r1, r0, r3, r5)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11697Seu.E67(X.TlA, X.XYr):int");
    }

    public final void EKu(long j, long j2) {
        this.A0O.clear();
        this.A00 = 0;
        this.A08 = -1;
        this.A05 = 0;
        this.A06 = 0;
        this.A07 = 0;
        if (j != 0) {
            for (C10719Rwx rwx : this.A0G) {
                S39 s39 = rwx.A04;
                int A022 = Util.A02(s39.A07, j2, false);
                while (true) {
                    if (A022 >= 0) {
                        if ((s39.A04[A022] & 1) != 0) {
                            break;
                        }
                        A022--;
                    } else {
                        A022 = s39.A00(j2);
                        break;
                    }
                }
                rwx.A00 = A022;
                S6Y s6y = rwx.A02;
                if (s6y != null) {
                    s6y.A01 = false;
                    s6y.A00 = 0;
                }
            }
        } else if (this.A04 != 3) {
            this.A04 = 0;
            this.A00 = 0;
        } else {
            C11196SEw sEw = this.A0N;
            sEw.A02.clear();
            sEw.A00 = 0;
            this.A0P.clear();
        }
    }

    public final boolean Evx(C13910TlA tlA) {
        ImmutableList of;
        TZZ A002 = C11114SAr.A00(tlA, false, AnonymousClass7TF.A1P(this.A0I & 2));
        if (A002 != null) {
            of = ImmutableList.of(A002);
        } else {
            of = ImmutableList.of();
        }
        this.A0E = of;
        if (A002 != null) {
            return false;
        }
        return true;
    }

    public C11697Seu(C13890TjD tjD, int i) {
        this.A0Q = tjD;
        this.A0I = i;
        this.A0E = ImmutableList.of();
        this.A04 = (i & 4) != 0 ? 3 : 0;
        this.A0N = new C11196SEw();
        this.A0P = AnonymousClass7TE.A1C();
        this.A0J = Pxe.A0P(16);
        this.A0O = new ArrayDeque();
        this.A0L = new C11389SRd(SS3.A01);
        this.A0K = Pxe.A0P(4);
        this.A0M = new C11389SRd();
        this.A08 = -1;
        this.A0C = YBZ.A00;
        this.A0G = new C10719Rwx[0];
    }

    @Deprecated
    public C11697Seu() {
        this(C13890TjD.A00, 16);
    }
}
