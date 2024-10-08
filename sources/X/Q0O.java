package X;

import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.List;

public final class Q0O implements AnonymousClass4YO, AnonymousClass4XT {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04 = 0;
    public int A05;
    public int A06;
    public int A07;
    public int A08 = -1;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public C265004Sd A0D = C265004Sd.A00;
    public AnonymousClass4XV A0E;
    public Q0T[] A0F = new Q0T[0];
    public long[][] A0G;
    public final Q0P A0H = new Q0P();
    public final AnonymousClass4XV A0I = new AnonymousClass4XV(16);
    public final AnonymousClass4XV A0J = new AnonymousClass4XV(4);
    public final AnonymousClass4XV A0K = new AnonymousClass4XV(AnonymousClass4XW.A01);
    public final AnonymousClass4XV A0L = new AnonymousClass4XV();
    public final ArrayDeque A0M = new ArrayDeque();
    public final List A0N = AnonymousClass7TE.A1C();

    public final long C9E(int i) {
        if (i == 2) {
            return this.A0C;
        }
        if (i == 1) {
            return this.A0A;
        }
        return -9223372036854775807L;
    }

    public final boolean CbO() {
        return true;
    }

    public final boolean Evy(AnonymousClass4Y7 r2) {
        return C11137SBs.A00(r2, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: com.google.android.exoplayer2.metadata.Metadata} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v1, resolved type: com.google.android.exoplayer2.metadata.Metadata} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v114, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v2, resolved type: com.google.android.exoplayer2.metadata.Metadata} */
    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0560: MOVE  (r0v75 X.Q0Q) = (r22v0 X.Q0Q)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x009c A[SYNTHETIC] */
    private void A00(long r39) {
        /*
            r38 = this;
        L_0x0000:
            r9 = r38
            java.util.ArrayDeque r0 = r9.A0M
            r37 = r0
            boolean r0 = r37.isEmpty()
            r21 = 2
            if (r0 != 0) goto L_0x06a4
            java.lang.Object r0 = r37.peek()
            X.4Y8 r0 = (X.AnonymousClass4Y8) r0
            long r1 = r0.A00
            int r0 = (r1 > r39 ? 1 : (r1 == r39 ? 0 : -1))
            if (r0 != 0) goto L_0x06a4
            java.lang.Object r6 = r37.pop()
            X.4Y8 r6 = (X.AnonymousClass4Y8) r6
            int r1 = r6.A00
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r1 != r0) goto L_0x068c
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            int r0 = r9.A02
            r8 = 1
            r36 = 0
            if (r0 != r8) goto L_0x0035
            r36 = 1
        L_0x0035:
            X.Q0Q r22 = new X.Q0Q
            r22.<init>()
            r0 = 1969517665(0x75647461, float:2.8960062E32)
            X.4YA r1 = r6.A01(r0)
            if (r1 == 0) goto L_0x039d
            byte[] r0 = X.AnonymousClass4YC.A00
            X.4XV r12 = r1.A00
            r11 = 8
            r12.A0G(r11)
            r0 = 0
            r16 = r0
        L_0x004f:
            int r1 = r12.A00
            int r10 = r12.A01
            int r1 = r1 - r10
            if (r1 < r11) goto L_0x03a1
            int r23 = r12.A01()
            int r2 = r12.A01()
            r1 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r2 != r1) goto L_0x0331
            r12.A0G(r10)
            int r2 = r10 + r23
            r12.A0H(r11)
            int r5 = r12.A01
            r7 = 4
            r12.A0H(r7)
            int r1 = r12.A01()
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            if (r1 == r0) goto L_0x007c
            int r5 = r5 + 4
        L_0x007c:
            r12.A0G(r5)
            int r5 = r12.A01
            if (r5 >= r2) goto L_0x039b
            int r3 = r12.A01()
            int r1 = r12.A01()
            r0 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r1 != r0) goto L_0x032e
            r12.A0G(r5)
            int r5 = r5 + r3
            r12.A0H(r11)
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
        L_0x009c:
            int r4 = r12.A01
            if (r4 >= r5) goto L_0x0387
            int r0 = r12.A01()
            int r4 = r4 + r0
            int r2 = r12.A01()
            int r0 = r2 >> 24
            r1 = r0 & 255(0xff, float:3.57E-43)
            r0 = 169(0xa9, float:2.37E-43)
            if (r1 == r0) goto L_0x025f
            r0 = 253(0xfd, float:3.55E-43)
            if (r1 == r0) goto L_0x025f
            r0 = 1735291493(0x676e7265, float:1.1260334E24)
            if (r2 != r0) goto L_0x00fe
            r12.A0H(r7)     // Catch:{ all -> 0x069f }
            int r1 = r12.A01()     // Catch:{ all -> 0x069f }
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r0) goto L_0x00ce
            r12.A0H(r11)     // Catch:{ all -> 0x069f }
            int r1 = r12.A02()     // Catch:{ all -> 0x069f }
            goto L_0x00d6
        L_0x00ce:
            java.lang.String r1 = "MetadataUtil"
            java.lang.String r0 = "Failed to parse uint8 attribute value"
            X.2AG.A04(r1, r0)     // Catch:{ all -> 0x069f }
            r1 = -1
        L_0x00d6:
            r2 = 0
            if (r1 <= 0) goto L_0x00f5
            java.lang.String[] r3 = X.C22012Xr2.A00     // Catch:{ all -> 0x069f }
            r0 = 192(0xc0, float:2.69E-43)
            if (r1 > r0) goto L_0x00f5
            int r1 = r1 - r8
            r0 = r3[r1]     // Catch:{ all -> 0x069f }
            if (r0 == 0) goto L_0x00f5
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ all -> 0x069f }
            java.util.ArrayList r3 = X.AnonymousClass4R7.A00(r0)     // Catch:{ all -> 0x069f }
            java.lang.String r0 = "TCON"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame     // Catch:{ all -> 0x069f }
            r1.<init>(r0, r2, r3)     // Catch:{ all -> 0x069f }
            goto L_0x0321
        L_0x00f5:
            java.lang.String r1 = "MetadataUtil"
            java.lang.String r0 = "Failed to parse standard genre code"
            X.2AG.A04(r1, r0)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x00fe:
            r0 = 1684632427(0x6469736b, float:1.7225632E22)
            if (r2 != r0) goto L_0x010b
            java.lang.String r0 = "TPOS"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = X.C22012Xr2.A01(r12, r0, r2)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x010b:
            r0 = 1953655662(0x74726b6e, float:7.6825853E31)
            if (r2 != r0) goto L_0x0118
            java.lang.String r0 = "TRCK"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = X.C22012Xr2.A01(r12, r0, r2)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x0118:
            r0 = 1953329263(0x746d706f, float:7.5247484E31)
            r3 = 0
            if (r2 != r0) goto L_0x0126
            java.lang.String r0 = "TBPM"
            com.google.android.exoplayer2.metadata.id3.Id3Frame r2 = X.C22012Xr2.A00(r12, r0, r2, r8, r3)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x0126:
            r0 = 1668311404(0x6370696c, float:4.434815E21)
            if (r2 != r0) goto L_0x0133
            java.lang.String r0 = "TCMP"
            com.google.android.exoplayer2.metadata.id3.Id3Frame r2 = X.C22012Xr2.A00(r12, r0, r2, r8, r8)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x0133:
            r0 = 1668249202(0x636f7672, float:4.4173067E21)
            if (r2 != r0) goto L_0x017d
            int r14 = r12.A01()     // Catch:{ all -> 0x069f }
            int r1 = r12.A01()     // Catch:{ all -> 0x069f }
            java.lang.String r13 = "MetadataUtil"
            r2 = 0
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r0) goto L_0x0176
            int r1 = r12.A01()     // Catch:{ all -> 0x069f }
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            r0 = 13
            if (r1 != r0) goto L_0x0168
            java.lang.String r13 = "image/jpeg"
        L_0x0156:
            r12.A0H(r7)     // Catch:{ all -> 0x069f }
            int r1 = r14 + -16
            byte[] r0 = new byte[r1]     // Catch:{ all -> 0x069f }
            r12.A0J(r0, r3, r1)     // Catch:{ all -> 0x069f }
            r3 = 3
            com.google.android.exoplayer2.metadata.id3.ApicFrame r1 = new com.google.android.exoplayer2.metadata.id3.ApicFrame     // Catch:{ all -> 0x069f }
            r1.<init>(r13, r2, r0, r3)     // Catch:{ all -> 0x069f }
            goto L_0x0321
        L_0x0168:
            r0 = 14
            if (r1 != r0) goto L_0x016f
            java.lang.String r13 = "image/png"
            goto L_0x0156
        L_0x016f:
            java.lang.String r0 = "Unrecognized cover art flags: "
            java.lang.String r0 = X.002.A0O(r0, r1)     // Catch:{ all -> 0x069f }
            goto L_0x0178
        L_0x0176:
            java.lang.String r0 = "Failed to parse cover art attribute"
        L_0x0178:
            X.2AG.A04(r13, r0)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x017d:
            r0 = 1631670868(0x61415254, float:2.2288462E20)
            if (r2 != r0) goto L_0x018a
            java.lang.String r0 = "TPE2"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = X.C22012Xr2.A02(r12, r0, r2)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x018a:
            r0 = 1936682605(0x736f6e6d, float:1.8969706E31)
            if (r2 != r0) goto L_0x0197
            java.lang.String r0 = "TSOT"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = X.C22012Xr2.A02(r12, r0, r2)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x0197:
            r0 = 1936679276(0x736f616c, float:1.8965681E31)
            if (r2 != r0) goto L_0x01a4
            java.lang.String r0 = "TSO2"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = X.C22012Xr2.A02(r12, r0, r2)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x01a4:
            r0 = 1936679282(0x736f6172, float:1.8965689E31)
            if (r2 != r0) goto L_0x01b1
            java.lang.String r0 = "TSOA"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = X.C22012Xr2.A02(r12, r0, r2)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x01b1:
            r0 = 1936679265(0x736f6161, float:1.8965668E31)
            if (r2 != r0) goto L_0x01be
            java.lang.String r0 = "TSOP"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = X.C22012Xr2.A02(r12, r0, r2)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x01be:
            r0 = 1936679791(0x736f636f, float:1.8966304E31)
            if (r2 != r0) goto L_0x01cb
            java.lang.String r0 = "TSOC"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = X.C22012Xr2.A02(r12, r0, r2)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x01cb:
            r0 = 1920233063(0x72746e67, float:4.84146E30)
            if (r2 != r0) goto L_0x01d8
            java.lang.String r0 = "ITUNESADVISORY"
            com.google.android.exoplayer2.metadata.id3.Id3Frame r2 = X.C22012Xr2.A00(r12, r0, r2, r3, r3)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x01d8:
            r0 = 1885823344(0x70676170, float:2.8643533E29)
            if (r2 != r0) goto L_0x01e5
            java.lang.String r0 = "ITUNESGAPLESS"
            com.google.android.exoplayer2.metadata.id3.Id3Frame r2 = X.C22012Xr2.A00(r12, r0, r2, r3, r8)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x01e5:
            r0 = 1936683886(0x736f736e, float:1.8971255E31)
            if (r2 != r0) goto L_0x01f2
            java.lang.String r0 = "TVSHOWSORT"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = X.C22012Xr2.A02(r12, r0, r2)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x01f2:
            r0 = 1953919848(0x74767368, float:7.810338E31)
            if (r2 != r0) goto L_0x01ff
            java.lang.String r0 = "TVSHOW"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = X.C22012Xr2.A02(r12, r0, r2)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x01ff:
            r0 = 757935405(0x2d2d2d2d, float:9.8439425E-12)
            if (r2 != r0) goto L_0x0302
            r18 = -1
            r1 = 0
            r14 = r1
            r13 = r1
            r3 = -1
            r2 = -1
        L_0x020b:
            int r0 = r12.A01     // Catch:{ all -> 0x069f }
            r24 = r0
            if (r0 >= r4) goto L_0x0243
            int r17 = r12.A01()     // Catch:{ all -> 0x069f }
            int r0 = r12.A01()     // Catch:{ all -> 0x069f }
            r12.A0H(r7)     // Catch:{ all -> 0x069f }
            r15 = 1835360622(0x6d65616e, float:4.4368658E27)
            if (r0 != r15) goto L_0x0228
            int r0 = r17 + -12
            java.lang.String r14 = r12.A0A(r0)     // Catch:{ all -> 0x069f }
            goto L_0x020b
        L_0x0228:
            r15 = 1851878757(0x6e616d65, float:1.7441594E28)
            if (r0 != r15) goto L_0x0234
            int r0 = r17 + -12
            java.lang.String r13 = r12.A0A(r0)     // Catch:{ all -> 0x069f }
            goto L_0x020b
        L_0x0234:
            r15 = 1684108385(0x64617461, float:1.6635614E22)
            if (r0 != r15) goto L_0x023d
            r3 = r24
            r2 = r17
        L_0x023d:
            int r0 = r17 + -12
            r12.A0H(r0)     // Catch:{ all -> 0x069f }
            goto L_0x020b
        L_0x0243:
            if (r14 == 0) goto L_0x0321
            if (r13 == 0) goto L_0x0321
            r0 = r18
            if (r3 == r0) goto L_0x0321
            r12.A0G(r3)     // Catch:{ all -> 0x069f }
            r0 = 16
            r12.A0H(r0)     // Catch:{ all -> 0x069f }
            int r2 = r2 - r0
            java.lang.String r0 = r12.A0A(r2)     // Catch:{ all -> 0x069f }
            com.google.android.exoplayer2.metadata.id3.InternalFrame r1 = new com.google.android.exoplayer2.metadata.id3.InternalFrame     // Catch:{ all -> 0x069f }
            r1.<init>(r14, r13, r0)     // Catch:{ all -> 0x069f }
            goto L_0x0321
        L_0x025f:
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r2
            r0 = 6516084(0x636d74, float:9.130979E-39)
            if (r1 != r0) goto L_0x029a
            int r3 = r12.A01()     // Catch:{ all -> 0x069f }
            int r1 = r12.A01()     // Catch:{ all -> 0x069f }
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r0) goto L_0x0288
            r12.A0H(r11)     // Catch:{ all -> 0x069f }
            int r0 = r3 + -16
            java.lang.String r1 = r12.A0A(r0)     // Catch:{ all -> 0x069f }
            java.lang.String r0 = "und"
            com.google.android.exoplayer2.metadata.id3.CommentFrame r2 = new com.google.android.exoplayer2.metadata.id3.CommentFrame     // Catch:{ all -> 0x069f }
            r2.<init>(r0, r1, r1)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x0288:
            java.lang.String r1 = "Failed to parse comment attribute: "
            java.lang.String r0 = X.AnonymousClass4Y9.A00(r2)     // Catch:{ all -> 0x069f }
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x069f }
            java.lang.String r0 = "MetadataUtil"
            X.2AG.A04(r0, r1)     // Catch:{ all -> 0x069f }
            r2 = 0
            goto L_0x0322
        L_0x029a:
            r0 = 7233901(0x6e616d, float:1.0136854E-38)
            if (r1 == r0) goto L_0x031a
            r0 = 7631467(0x74726b, float:1.0693963E-38)
            if (r1 == r0) goto L_0x031a
            r0 = 6516589(0x636f6d, float:9.131686E-39)
            if (r1 == r0) goto L_0x0313
            r0 = 7828084(0x777274, float:1.0969482E-38)
            if (r1 == r0) goto L_0x0313
            r0 = 6578553(0x646179, float:9.218516E-39)
            if (r1 != r0) goto L_0x02ba
            java.lang.String r0 = "TDRC"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = X.C22012Xr2.A02(r12, r0, r2)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x02ba:
            r0 = 4280916(0x415254, float:5.998841E-39)
            if (r1 != r0) goto L_0x02c6
            java.lang.String r0 = "TPE1"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = X.C22012Xr2.A02(r12, r0, r2)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x02c6:
            r0 = 7630703(0x746f6f, float:1.0692892E-38)
            if (r1 != r0) goto L_0x02d2
            java.lang.String r0 = "TSSE"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = X.C22012Xr2.A02(r12, r0, r2)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x02d2:
            r0 = 6384738(0x616c62, float:8.946924E-39)
            if (r1 != r0) goto L_0x02de
            java.lang.String r0 = "TALB"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = X.C22012Xr2.A02(r12, r0, r2)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x02de:
            r0 = 7108978(0x6c7972, float:9.9618E-39)
            if (r1 != r0) goto L_0x02ea
            java.lang.String r0 = "USLT"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = X.C22012Xr2.A02(r12, r0, r2)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x02ea:
            r0 = 6776174(0x67656e, float:9.495442E-39)
            if (r1 != r0) goto L_0x02f6
            java.lang.String r0 = "TCON"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = X.C22012Xr2.A02(r12, r0, r2)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x02f6:
            r0 = 6779504(0x677270, float:9.500109E-39)
            if (r1 != r0) goto L_0x0302
            java.lang.String r0 = "TIT1"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = X.C22012Xr2.A02(r12, r0, r2)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x0302:
            java.lang.String r1 = "Skipped unknown metadata entry: "
            java.lang.String r0 = X.AnonymousClass4Y9.A00(r2)     // Catch:{ all -> 0x069f }
            X.002.A0R(r1, r0)     // Catch:{ all -> 0x069f }
            X.2AG.A01()     // Catch:{ all -> 0x069f }
            r12.A0G(r4)
            goto L_0x009c
        L_0x0313:
            java.lang.String r0 = "TCOM"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = X.C22012Xr2.A02(r12, r0, r2)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x031a:
            java.lang.String r0 = "TIT2"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = X.C22012Xr2.A02(r12, r0, r2)     // Catch:{ all -> 0x069f }
            goto L_0x0322
        L_0x0321:
            r2 = r1
        L_0x0322:
            r12.A0G(r4)
            if (r2 == 0) goto L_0x009c
            r0 = r19
            r0.add(r2)
            goto L_0x009c
        L_0x032e:
            int r5 = r5 + r3
            goto L_0x007c
        L_0x0331:
            r1 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r2 != r1) goto L_0x0394
            r12.A0G(r10)
            int r7 = r10 + r23
            r5 = 12
            r12.A0H(r5)
        L_0x0340:
            int r4 = r12.A01
            r16 = 0
            if (r4 >= r7) goto L_0x0394
            int r3 = r12.A01()
            int r2 = r12.A01()
            r1 = 1935766900(0x73617574, float:1.7862687E31)
            if (r2 != r1) goto L_0x0382
            r1 = 14
            if (r3 < r1) goto L_0x0394
            r1 = 5
            r12.A0H(r1)
            int r2 = r12.A02()
            if (r2 == r5) goto L_0x037f
            r1 = 13
            if (r2 != r1) goto L_0x0394
            r3 = 1123024896(0x42f00000, float:120.0)
        L_0x0367:
            r12.A0H(r8)
            int r2 = r12.A02()
            com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry r1 = new com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry
            r1.<init>(r3, r2)
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r2 = new com.google.android.exoplayer2.metadata.Metadata.Entry[]{r1}
            com.google.android.exoplayer2.metadata.Metadata r16 = new com.google.android.exoplayer2.metadata.Metadata
            r1 = r16
            r1.<init>((com.google.android.exoplayer2.metadata.Metadata.Entry[]) r2)
            goto L_0x0394
        L_0x037f:
            r3 = 1131413504(0x43700000, float:240.0)
            goto L_0x0367
        L_0x0382:
            int r4 = r4 + r3
            r12.A0G(r4)
            goto L_0x0340
        L_0x0387:
            boolean r0 = r19.isEmpty()
            if (r0 != 0) goto L_0x039b
            com.google.android.exoplayer2.metadata.Metadata r0 = new com.google.android.exoplayer2.metadata.Metadata
            r1 = r19
            r0.<init>((java.util.List) r1)
        L_0x0394:
            int r10 = r10 + r23
            r12.A0G(r10)
            goto L_0x004f
        L_0x039b:
            r0 = 0
            goto L_0x0394
        L_0x039d:
            r28 = 0
            r12 = 0
            goto L_0x03b6
        L_0x03a1:
            r1 = r16
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            java.lang.Object r12 = r0.first
            com.google.android.exoplayer2.metadata.Metadata r12 = (com.google.android.exoplayer2.metadata.Metadata) r12
            java.lang.Object r0 = r0.second
            r28 = r0
            if (r12 == 0) goto L_0x03b6
            r0 = r22
            r0.A00(r12)
        L_0x03b6:
            r0 = 1835365473(0x6d657461, float:4.4382975E27)
            X.4Y8 r3 = r6.A00(r0)
            if (r3 == 0) goto L_0x0482
            byte[] r0 = X.AnonymousClass4YC.A00
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            X.4YA r1 = r3.A01(r0)
            r0 = 1801812339(0x6b657973, float:2.7741754E26)
            X.4YA r2 = r3.A01(r0)
            r0 = 1768715124(0x696c7374, float:1.7865732E25)
            X.4YA r7 = r3.A01(r0)
            r27 = 0
            if (r1 == 0) goto L_0x0492
            if (r2 == 0) goto L_0x0492
            if (r7 == 0) goto L_0x0492
            X.4XV r1 = r1.A00
            r0 = 16
            r1.A0G(r0)
            int r1 = r1.A01()
            r0 = 1835299937(0x6d647461, float:4.4189547E27)
            if (r1 != r0) goto L_0x0492
            X.4XV r5 = r2.A00
            r0 = 12
            r5.A0G(r0)
            int r11 = r5.A01()
            java.lang.String[] r14 = new java.lang.String[r11]
            r4 = 0
        L_0x03fc:
            r10 = 8
            if (r4 >= r11) goto L_0x041e
            int r3 = r5.A01()
            r0 = 4
            r5.A0H(r0)
            int r3 = r3 - r10
            java.nio.charset.Charset r10 = X.AnonymousClass2RN.A05
            byte[] r2 = r5.A02
            int r1 = r5.A01
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1, r3, r10)
            int r1 = r5.A01
            int r1 = r1 + r3
            r5.A01 = r1
            r14[r4] = r0
            int r4 = r4 + 1
            goto L_0x03fc
        L_0x041e:
            X.4XV r7 = r7.A00
            r7.A0G(r10)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0428:
            int r0 = r7.A00
            int r4 = r7.A01
            int r0 = r0 - r4
            if (r0 <= r10) goto L_0x0485
            int r17 = r7.A01()
            int r0 = r7.A01()
            int r1 = r0 + -1
            if (r1 < 0) goto L_0x0476
            if (r1 >= r11) goto L_0x0476
            r15 = r14[r1]
            int r3 = r4 + r17
        L_0x0441:
            int r2 = r7.A01
            if (r2 >= r3) goto L_0x046a
            int r16 = r7.A01()
            int r1 = r7.A01()
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r0) goto L_0x0470
            int r13 = r7.A01()
            int r3 = r7.A01()
            int r2 = r16 + -16
            byte[] r1 = new byte[r2]
            r0 = 0
            r7.A0J(r1, r0, r2)
            com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry r0 = new com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry
            r0.<init>(r1, r3, r13, r15)
            r5.add(r0)
        L_0x046a:
            int r4 = r4 + r17
            r7.A0G(r4)
            goto L_0x0428
        L_0x0470:
            int r2 = r2 + r16
            r7.A0G(r2)
            goto L_0x0441
        L_0x0476:
            java.lang.String r0 = "Skipped metadata with unknown key index: "
            java.lang.String r1 = X.002.A0O(r0, r1)
            java.lang.String r0 = "AtomParsers"
            X.2AG.A04(r0, r1)
            goto L_0x046a
        L_0x0482:
            r27 = 0
            goto L_0x0492
        L_0x0485:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0492
            com.google.android.exoplayer2.metadata.Metadata r27 = new com.google.android.exoplayer2.metadata.Metadata
            r0 = r27
            r0.<init>((java.util.List) r5)
        L_0x0492:
            r26 = 0
            r33 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r29 = 0
            r1 = 11
            X.SzZ r0 = new X.SzZ
            r0.<init>(r1)
            r30 = r22
            r31 = r6
            r32 = r0
            r35 = r26
            java.util.ArrayList r25 = X.AnonymousClass4YC.A03(r29, r30, r31, r32, r33, r35, r36)
            int r24 = r25.size()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = 0
            r23 = -1
        L_0x04c4:
            r0 = r24
            if (r13 >= r0) goto L_0x05f7
            r0 = r25
            java.lang.Object r11 = r0.get(r13)
            X.Q0S r11 = (X.Q0S) r11
            int r0 = r11.A01
            if (r0 == 0) goto L_0x05be
            X.4YI r10 = r11.A03
            long r0 = r10.A04
            int r2 = (r0 > r33 ? 1 : (r0 == r33 ? 0 : -1))
            if (r2 == 0) goto L_0x0551
            long r1 = r10.A04
        L_0x04de:
            long r3 = java.lang.Math.max(r3, r1)
            int r0 = r10.A03
            if (r8 != r0) goto L_0x0548
            r16 = r1
        L_0x04e8:
            X.4Sd r5 = r9.A0D
            int r0 = r10.A03
            X.4Xd r0 = r5.FHW(r13, r0)
            X.Q0T r15 = new X.Q0T
            r15.<init>(r0, r10, r11)
            X.3wB r0 = r10.A07
            java.lang.String r5 = r0.A0W
            java.lang.String r0 = "audio/true-hd"
            boolean r6 = r0.equals(r5)
            int r5 = r11.A00
            int r0 = r5 + 30
            if (r6 == 0) goto L_0x0507
            int r0 = r5 * 16
        L_0x0507:
            X.3wB r5 = r10.A07
            X.3w8 r7 = new X.3w8
            r7.<init>(r5)
            r7.A09 = r0
            int r14 = r10.A03
            r5 = 0
            r0 = r21
            if (r14 != r0) goto L_0x052b
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x052b
            int r0 = r11.A01
            if (r0 <= r8) goto L_0x052b
            int r0 = r11.A01
            float r14 = (float) r0
            float r0 = (float) r1
            r1 = 1232348160(0x49742400, float:1000000.0)
            float r0 = r0 / r1
            float r14 = r14 / r0
            r7.A00 = r14
        L_0x052b:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x055c
            int r0 = r11.A01
            if (r0 <= 0) goto L_0x055c
            int[] r0 = r11.A05
            int r1 = r0.length
            int r0 = r11.A01
            if (r1 != r0) goto L_0x055c
            r0 = 0
        L_0x053b:
            int r1 = r11.A01
            if (r0 >= r1) goto L_0x0554
            int[] r1 = r11.A05
            r1 = r1[r0]
            long r1 = (long) r1
            long r5 = r5 + r1
            int r0 = r0 + 1
            goto L_0x053b
        L_0x0548:
            int r5 = r10.A03
            r0 = r21
            if (r0 != r5) goto L_0x04e8
            r18 = r1
            goto L_0x04e8
        L_0x0551:
            long r1 = r11.A02
            goto L_0x04de
        L_0x0554:
            r0 = 8000000(0x7a1200, double:3.952525E-317)
            long r5 = r5 * r0
            long r5 = r5 / r3
            int r0 = (int) r5
            r7.A03 = r0
        L_0x055c:
            int r2 = r10.A03
            if (r2 != r8) goto L_0x056f
            r0 = r22
            int r5 = r0.A00
            r1 = -1
            if (r5 == r1) goto L_0x056f
            int r0 = r0.A01
            if (r0 == r1) goto L_0x056f
            r7.A06 = r5
            r7.A07 = r0
        L_0x056f:
            r5 = r28
            com.google.android.exoplayer2.metadata.Metadata r5 = (com.google.android.exoplayer2.metadata.Metadata) r5
            java.util.List r1 = r9.A0N
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x05f1
            r0 = 0
        L_0x057c:
            com.google.android.exoplayer2.metadata.Metadata[] r14 = new com.google.android.exoplayer2.metadata.Metadata[]{r5, r0}
            r0 = r12
            r5 = 0
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r1 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r5]
            com.google.android.exoplayer2.metadata.Metadata r11 = new com.google.android.exoplayer2.metadata.Metadata
            r11.<init>((com.google.android.exoplayer2.metadata.Metadata.Entry[]) r1)
            if (r2 != r8) goto L_0x05c2
            if (r12 == 0) goto L_0x05ef
        L_0x058d:
            r1 = r14[r5]
            com.google.android.exoplayer2.metadata.Metadata r0 = r0.A00(r1)
            int r5 = r5 + 1
            r1 = r21
            if (r5 < r1) goto L_0x058d
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r1 = r0.A01
            int r1 = r1.length
            if (r1 <= 0) goto L_0x05a0
            r7.A0N = r0
        L_0x05a0:
            X.4Xd r1 = r15.A01
            X.3wB r0 = new X.3wB
            r0.<init>(r7)
            r1.AWP(r0)
            int r1 = r10.A03
            r0 = r21
            if (r1 != r0) goto L_0x05b9
            r1 = -1
            r0 = r23
            if (r0 != r1) goto L_0x05b9
            int r23 = r20.size()
        L_0x05b9:
            r0 = r20
            r0.add(r15)
        L_0x05be:
            int r13 = r13 + 1
            goto L_0x04c4
        L_0x05c2:
            r0 = r21
            if (r2 != r0) goto L_0x05ef
            if (r27 == 0) goto L_0x05ef
            r2 = 0
        L_0x05c9:
            r0 = r27
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r1 = r0.A01
            int r0 = r1.length
            if (r2 >= r0) goto L_0x05ef
            r1 = r1[r2]
            boolean r0 = r1 instanceof com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry
            if (r0 == 0) goto L_0x05ec
            com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry r1 = (com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry) r1
            java.lang.String r6 = r1.A02
            java.lang.String r0 = "com.android.capture.fps"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x05ec
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r1 = new com.google.android.exoplayer2.metadata.Metadata.Entry[]{r1}
            com.google.android.exoplayer2.metadata.Metadata r0 = new com.google.android.exoplayer2.metadata.Metadata
            r0.<init>((com.google.android.exoplayer2.metadata.Metadata.Entry[]) r1)
            goto L_0x058d
        L_0x05ec:
            int r2 = r2 + 1
            goto L_0x05c9
        L_0x05ef:
            r0 = r11
            goto L_0x058d
        L_0x05f1:
            com.google.android.exoplayer2.metadata.Metadata r0 = new com.google.android.exoplayer2.metadata.Metadata
            r0.<init>((java.util.List) r1)
            goto L_0x057c
        L_0x05f7:
            r0 = r23
            r9.A03 = r0
            r9.A0B = r3
            r0 = r18
            r9.A0C = r0
            r0 = r16
            r9.A0A = r0
            r0 = r26
            X.Q0T[] r1 = new X.Q0T[r0]
            r0 = r20
            java.lang.Object[] r10 = r0.toArray(r1)
            X.Q0T[] r10 = (X.Q0T[]) r10
            r9.A0F = r10
            int r7 = r10.length
            long[][] r6 = new long[r7][]
            int[] r5 = new int[r7]
            long[] r4 = new long[r7]
            boolean[] r3 = new boolean[r7]
            r2 = 0
        L_0x061d:
            if (r2 >= r7) goto L_0x0636
            r0 = r10[r2]
            X.Q0S r0 = r0.A04
            int r0 = r0.A01
            long[] r0 = new long[r0]
            r6[r2] = r0
            r0 = r10[r2]
            X.Q0S r0 = r0.A04
            long[] r0 = r0.A07
            r0 = r0[r26]
            r4[r2] = r0
            int r2 = r2 + 1
            goto L_0x061d
        L_0x0636:
            r17 = 0
            r2 = 0
        L_0x0639:
            if (r2 >= r7) goto L_0x0677
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r14 = -1
            r1 = 0
        L_0x0642:
            if (r1 >= r7) goto L_0x0653
            boolean r0 = r3[r1]
            if (r0 != 0) goto L_0x0650
            r11 = r4[r1]
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x0650
            r14 = r1
            r15 = r11
        L_0x0650:
            int r1 = r1 + 1
            goto L_0x0642
        L_0x0653:
            r13 = r5[r14]
            r12 = r6[r14]
            r12[r13] = r17
            r0 = r10[r14]
            X.Q0S r11 = r0.A04
            int[] r0 = r11.A05
            r0 = r0[r13]
            long r0 = (long) r0
            long r17 = r17 + r0
            int r1 = r13 + 1
            r5[r14] = r1
            int r0 = r12.length
            if (r1 >= r0) goto L_0x0672
            long[] r0 = r11.A07
            r0 = r0[r1]
            r4[r14] = r0
            goto L_0x0639
        L_0x0672:
            r3[r14] = r8
            int r2 = r2 + 1
            goto L_0x0639
        L_0x0677:
            r9.A0G = r6
            X.4Sd r0 = r9.A0D
            r0.ASU()
            X.4Sd r0 = r9.A0D
            r0.EKx(r9)
            r37.clear()
            r0 = r21
            r9.A04 = r0
            goto L_0x0000
        L_0x068c:
            boolean r0 = r37.isEmpty()
            if (r0 != 0) goto L_0x0000
            java.lang.Object r0 = r37.peek()
            X.4Y8 r0 = (X.AnonymousClass4Y8) r0
            java.util.List r0 = r0.A01
            r0.add(r6)
            goto L_0x0000
        L_0x069f:
            r0 = move-exception
            r12.A0G(r4)
            throw r0
        L_0x06a4:
            int r1 = r9.A04
            r0 = r21
            if (r1 == r0) goto L_0x06af
            r0 = 0
            r9.A04 = r0
            r9.A00 = r0
        L_0x06af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q0O.A00(long):void");
    }

    public final long AzU() {
        return this.A0B;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r5 == -1) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007d, code lost:
        if (r3 == -1) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C21498Xcy BrA(long r19) {
        /*
            r18 = this;
            r13 = r18
            X.Q0T[] r3 = r13.A0F
            int r0 = r3.length
            if (r0 == 0) goto L_0x0031
            r12 = -1
            int r2 = r13.A03
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r19
            if (r2 == r12) goto L_0x00b1
            r2 = r3[r2]
            X.Q0S r6 = r2.A04
            long[] r3 = r6.A07
            r2 = 0
            int r5 = com.google.android.exoplayer2.util.Util.A04(r3, r0, r2)
        L_0x001e:
            if (r5 < 0) goto L_0x002b
            int[] r2 = r6.A04
            r2 = r2[r5]
            r2 = r2 & 1
            if (r2 != 0) goto L_0x0039
            int r5 = r5 + -1
            goto L_0x001e
        L_0x002b:
            int r5 = r6.A00(r0)
            if (r5 != r12) goto L_0x0039
        L_0x0031:
            X.SJ7 r3 = X.SJ7.A02
        L_0x0033:
            X.Xcy r1 = new X.Xcy
            r1.<init>(r3, r3)
            return r1
        L_0x0039:
            long[] r4 = r6.A07
            r9 = r4[r5]
            long[] r3 = r6.A06
            r7 = r3[r5]
            int r2 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b7
            int r2 = r6.A01
            int r2 = r2 + -1
            if (r5 >= r2) goto L_0x00b7
            int r0 = r6.A00(r0)
            if (r0 == r12) goto L_0x00b7
            if (r0 == r5) goto L_0x00b7
            r5 = r4[r0]
            r1 = r3[r0]
        L_0x0057:
            r11 = 0
        L_0x0058:
            X.Q0T[] r3 = r13.A0F
            int r0 = r3.length
            if (r11 >= r0) goto L_0x00bf
            int r0 = r13.A03
            if (r11 == r0) goto L_0x00a5
            r0 = r3[r11]
            X.Q0S r14 = r0.A04
            long[] r0 = r14.A07
            r15 = 0
            int r3 = com.google.android.exoplayer2.util.Util.A04(r0, r9, r15)
        L_0x006c:
            if (r3 < 0) goto L_0x0079
            int[] r0 = r14.A04
            r0 = r0[r3]
            r0 = r0 & 1
            if (r0 != 0) goto L_0x0096
            int r3 = r3 + -1
            goto L_0x006c
        L_0x0079:
            int r3 = r14.A00(r9)
            if (r3 != r12) goto L_0x0096
        L_0x007f:
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x00a5
            long[] r0 = r14.A07
            int r3 = com.google.android.exoplayer2.util.Util.A04(r0, r5, r15)
        L_0x0089:
            if (r3 < 0) goto L_0x009f
            int[] r0 = r14.A04
            r0 = r0[r3]
            r0 = r0 & 1
            if (r0 != 0) goto L_0x00a8
            int r3 = r3 + -1
            goto L_0x0089
        L_0x0096:
            long[] r0 = r14.A06
            r3 = r0[r3]
            long r7 = java.lang.Math.min(r3, r7)
            goto L_0x007f
        L_0x009f:
            int r3 = r14.A00(r5)
            if (r3 != r12) goto L_0x00a8
        L_0x00a5:
            int r11 = r11 + 1
            goto L_0x0058
        L_0x00a8:
            long[] r0 = r14.A06
            r3 = r0[r3]
            long r1 = java.lang.Math.min(r3, r1)
            goto L_0x00a5
        L_0x00b1:
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = r0
        L_0x00b7:
            r1 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0057
        L_0x00bf:
            X.SJ7 r3 = new X.SJ7
            r3.<init>(r9, r7)
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            X.SJ7 r0 = new X.SJ7
            r0.<init>(r5, r1)
            X.Xcy r1 = new X.Xcy
            r1.<init>(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q0O.BrA(long):X.Xcy");
    }

    public final void CMc(C265004Sd r1) {
        this.A0D = r1;
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [java.lang.Throwable, java.io.IOException, X.47p] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (r4 == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (r16 < r18) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        r4 = r1;
        r18 = r16;
        r24 = r5;
        r20 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        if (r9 >= r22) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        r6 = r1;
        r3 = r5;
        r22 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        if (true == r4) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x026e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int E68(X.AnonymousClass4Y7 r29, X.C265044Sh r30) {
        /*
            r28 = this;
        L_0x0000:
            r12 = r28
            int r0 = r12.A04
            r14 = r29
            if (r0 == 0) goto L_0x00fd
            r13 = 1
            r15 = r30
            if (r0 == r13) goto L_0x0075
            r25 = 2
            r0 = r14
            X.4Y6 r0 = (X.AnonymousClass4Y6) r0
            long r7 = r0.A02
            int r3 = r12.A08
            r11 = -1
            if (r3 != r11) goto L_0x0297
            r3 = -1
            r24 = -1
            r5 = 0
            r22 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 1
            r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 1
            r18 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x002e:
            X.Q0T[] r1 = r12.A0F
            int r0 = r1.length
            if (r5 >= r0) goto L_0x027b
            r2 = r1[r5]
            int r1 = r2.A00
            X.Q0S r0 = r2.A04
            int r0 = r0.A01
            if (r1 == r0) goto L_0x006e
            X.Q0S r0 = r2.A04
            long[] r0 = r0.A06
            r16 = r0[r1]
            long[][] r0 = r12.A0G
            r0 = r0[r5]
            r9 = r0[r1]
            long r16 = r16 - r7
            r1 = 0
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0071
            r1 = 262144(0x40000, double:1.295163E-318)
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0071
            r1 = 0
            if (r4 != 0) goto L_0x005f
        L_0x005b:
            int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r0 >= 0) goto L_0x0066
        L_0x005f:
            r4 = r1
            r18 = r16
            r24 = r5
            r20 = r9
        L_0x0066:
            int r0 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r0 >= 0) goto L_0x006e
            r6 = r1
            r3 = r5
            r22 = r9
        L_0x006e:
            int r5 = r5 + 1
            goto L_0x002e
        L_0x0071:
            r1 = 1
            if (r13 != r4) goto L_0x0066
            goto L_0x005b
        L_0x0075:
            long r2 = r12.A09
            int r7 = r12.A00
            long r0 = (long) r7
            long r2 = r2 - r0
            r0 = r14
            X.4Y6 r0 = (X.AnonymousClass4Y6) r0
            long r0 = r0.A02
            long r0 = r0 + r2
            X.4XV r5 = r12.A0E
            if (r5 == 0) goto L_0x00de
            byte[] r6 = r5.A02
            int r4 = (int) r2
            r14.readFully(r6, r7, r4)
            int r3 = r12.A01
            r2 = 1718909296(0x66747970, float:2.8862439E23)
            if (r3 != r2) goto L_0x00c3
            r2 = 8
            r5.A0G(r2)
            int r3 = r5.A01()
            r2 = 1751476579(0x68656963, float:4.333464E24)
            if (r3 == r2) goto L_0x00c1
            r2 = 1903435808(0x71742020, float:1.2088509E30)
            if (r3 == r2) goto L_0x00bf
            r2 = 4
            r5.A0H(r2)
        L_0x00a9:
            int r3 = r5.A00
            int r2 = r5.A01
            int r3 = r3 - r2
            if (r3 <= 0) goto L_0x00ee
            int r3 = r5.A01()
            r2 = 1751476579(0x68656963, float:4.333464E24)
            if (r3 == r2) goto L_0x00c1
            r2 = 1903435808(0x71742020, float:1.2088509E30)
            if (r3 == r2) goto L_0x00bf
            goto L_0x00a9
        L_0x00bf:
            r2 = 1
            goto L_0x00ef
        L_0x00c1:
            r2 = 2
            goto L_0x00ef
        L_0x00c3:
            java.util.ArrayDeque r3 = r12.A0M
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x00f1
            java.lang.Object r4 = r3.peek()
            X.4Y8 r4 = (X.AnonymousClass4Y8) r4
            int r2 = r12.A01
            X.4YA r3 = new X.4YA
            r3.<init>(r5, r2)
            java.util.List r2 = r4.A02
            r2.add(r3)
            goto L_0x00f1
        L_0x00de:
            r5 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00ea
            int r4 = (int) r2
            r14.Evk(r4)
            goto L_0x00f1
        L_0x00ea:
            r15.A00 = r0
            r2 = 1
            goto L_0x00f2
        L_0x00ee:
            r2 = 0
        L_0x00ef:
            r12.A02 = r2
        L_0x00f1:
            r2 = 0
        L_0x00f2:
            r12.A00(r0)
            if (r2 == 0) goto L_0x0000
            int r1 = r12.A04
            r0 = 2
            if (r1 == r0) goto L_0x0000
            return r13
        L_0x00fd:
            int r0 = r12.A00
            r8 = 1
            r7 = 8
            r6 = 0
            if (r0 != 0) goto L_0x0120
            X.4XV r2 = r12.A0I
            byte[] r0 = r2.A02
            boolean r0 = r14.E6T(r0, r6, r7, r8)
            if (r0 == 0) goto L_0x0295
            r12.A00 = r7
            r2.A0G(r6)
            long r0 = r2.A07()
            r12.A09 = r0
            int r0 = r2.A01()
            r12.A01 = r0
        L_0x0120:
            long r0 = r12.A09
            r3 = 1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x01ed
            X.4XV r1 = r12.A0I
            byte[] r0 = r1.A02
            r14.readFully(r0, r7, r7)
            int r0 = r12.A00
            int r0 = r0 + 8
            r12.A00 = r0
            long r2 = r1.A08()
        L_0x0139:
            r12.A09 = r2
        L_0x013b:
            long r4 = r12.A09
            int r1 = r12.A00
            long r2 = (long) r1
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x026e
            int r9 = r12.A01
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r9 == r0) goto L_0x0217
            r0 = 1953653099(0x7472616b, float:7.681346E31)
            if (r9 == r0) goto L_0x0217
            r0 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r9 == r0) goto L_0x0217
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r9 == r0) goto L_0x0217
            r0 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r9 == r0) goto L_0x0217
            r0 = 1701082227(0x65647473, float:6.742798E22)
            if (r9 == r0) goto L_0x0217
            r0 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r9 == r0) goto L_0x0217
            r0 = 1835296868(0x6d646864, float:4.418049E27)
            if (r9 == r0) goto L_0x01ca
            r0 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r9 == r0) goto L_0x01ca
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            if (r9 == r0) goto L_0x01ca
            r0 = 1937011556(0x73747364, float:1.9367383E31)
            if (r9 == r0) goto L_0x01ca
            r0 = 1937011827(0x73747473, float:1.9367711E31)
            if (r9 == r0) goto L_0x01ca
            r0 = 1937011571(0x73747373, float:1.9367401E31)
            if (r9 == r0) goto L_0x01ca
            r0 = 1668576371(0x63747473, float:4.5093966E21)
            if (r9 == r0) goto L_0x01ca
            r0 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r9 == r0) goto L_0x01ca
            r0 = 1937011555(0x73747363, float:1.9367382E31)
            if (r9 == r0) goto L_0x01ca
            r0 = 1937011578(0x7374737a, float:1.936741E31)
            if (r9 == r0) goto L_0x01ca
            r0 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r9 == r0) goto L_0x01ca
            r0 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r9 == r0) goto L_0x01ca
            r0 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r9 == r0) goto L_0x01ca
            r0 = 1953196132(0x746b6864, float:7.46037E31)
            if (r9 == r0) goto L_0x01ca
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r9 == r0) goto L_0x01ca
            r0 = 1969517665(0x75647461, float:2.8960062E32)
            if (r9 == r0) goto L_0x01ca
            r0 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r9 == r0) goto L_0x01ca
            r0 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r9 == r0) goto L_0x01ca
            r2 = 0
        L_0x01c4:
            r12.A0E = r2
            r12.A04 = r8
            goto L_0x0000
        L_0x01ca:
            r0 = 0
            if (r1 != r7) goto L_0x01ce
            r0 = 1
        L_0x01ce:
            X.C256703wD.A04(r0)
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 > 0) goto L_0x01da
            r0 = 1
        L_0x01da:
            X.C256703wD.A04(r0)
            int r0 = (int) r4
            X.4XV r2 = new X.4XV
            r2.<init>((int) r0)
            X.4XV r0 = r12.A0I
            byte[] r1 = r0.A02
            byte[] r0 = r2.A02
            java.lang.System.arraycopy(r1, r6, r0, r6, r7)
            goto L_0x01c4
        L_0x01ed:
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x013b
            r1 = r14
            X.4Y6 r1 = (X.AnonymousClass4Y6) r1
            long r2 = r1.A04
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x020a
            java.util.ArrayDeque r0 = r12.A0M
            java.lang.Object r0 = r0.peek()
            X.4Y8 r0 = (X.AnonymousClass4Y8) r0
            if (r0 == 0) goto L_0x020a
            long r2 = r0.A00
        L_0x020a:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x013b
            long r0 = r1.A02
            long r2 = r2 - r0
            int r0 = r12.A00
            long r0 = (long) r0
            long r2 = r2 + r0
            goto L_0x0139
        L_0x0217:
            r8 = r14
            X.4Y6 r8 = (X.AnonymousClass4Y6) r8
            long r0 = r8.A02
            long r0 = r0 + r4
            long r0 = r0 - r2
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 == 0) goto L_0x024e
            r2 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r9 != r2) goto L_0x024e
            X.4XV r5 = r12.A0L
            r5.A0E(r7)
            byte[] r2 = r5.A02
            r14.E2F(r2, r6, r7)
            byte[] r2 = X.AnonymousClass4YC.A00
            int r4 = r5.A01
            r2 = 4
            r5.A0H(r2)
            int r3 = r5.A01()
            r2 = 1751411826(0x68646c72, float:4.3148E24)
            if (r3 == r2) goto L_0x0244
            int r4 = r4 + 4
        L_0x0244:
            r5.A0G(r4)
            int r2 = r5.A01
            r14.Evk(r2)
            r8.A01 = r6
        L_0x024e:
            java.util.ArrayDeque r4 = r12.A0M
            int r3 = r12.A01
            X.4Y8 r2 = new X.4Y8
            r2.<init>(r3, r0)
            r4.push(r2)
            long r7 = r12.A09
            int r2 = r12.A00
            long r3 = (long) r2
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0268
            r12.A00(r0)
            goto L_0x0000
        L_0x0268:
            r12.A04 = r6
            r12.A00 = r6
            goto L_0x0000
        L_0x026e:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            r0 = 0
            X.47p r2 = new X.47p
            r2.<init>(r1, r0)
            r2.A01 = r6
            r2.A00 = r8
            throw r2
        L_0x027b:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x028f
            if (r6 == 0) goto L_0x028f
            r0 = 10485760(0xa00000, double:5.180654E-317)
            long r22 = r22 + r0
            int r0 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r0 >= 0) goto L_0x0291
        L_0x028f:
            r3 = r24
        L_0x0291:
            r12.A08 = r3
            if (r3 != r11) goto L_0x0297
        L_0x0295:
            r13 = -1
            return r13
        L_0x0297:
            X.Q0T[] r0 = r12.A0F
            r10 = r0[r3]
            X.4Xd r9 = r10.A01
            int r6 = r10.A00
            X.Q0S r1 = r10.A04
            long[] r0 = r1.A06
            r4 = r0[r6]
            int[] r0 = r1.A05
            r3 = r0[r6]
            X.S6c r2 = r10.A02
            long r0 = r4 - r7
            int r7 = r12.A05
            long r7 = (long) r7
            long r0 = r0 + r7
            r16 = 0
            r8 = 1
            int r7 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r7 < 0) goto L_0x03b2
            r16 = 262144(0x40000, double:1.295163E-318)
            int r7 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r7 >= 0) goto L_0x03b2
            X.4YI r4 = r10.A03
            int r4 = r4.A02
            if (r4 != r13) goto L_0x02ca
            r4 = 8
            long r0 = r0 + r4
            int r3 = r3 + -8
        L_0x02ca:
            int r4 = (int) r0
            r14.Evk(r4)
            X.4YI r0 = r10.A03
            int r15 = r0.A01
            r4 = 0
            r1 = 0
            if (r15 == 0) goto L_0x032c
            X.4XV r8 = r12.A0J
            byte[] r7 = r8.A02
            r7[r1] = r1
            r7[r13] = r1
            r7[r25] = r1
            r13 = 4
            int r5 = 4 - r15
        L_0x02e3:
            int r0 = r12.A06
            if (r0 >= r3) goto L_0x0372
            int r0 = r12.A07
            if (r0 != 0) goto L_0x030e
            r14.readFully(r7, r5, r15)
            int r0 = r12.A05
            int r0 = r0 + r15
            r12.A05 = r0
            r8.A0G(r1)
            int r0 = r8.A01()
            if (r0 < 0) goto L_0x0325
            r12.A07 = r0
            X.4XV r0 = r12.A0K
            r0.A0G(r1)
            r9.EJh(r0, r13)
            int r0 = r12.A06
            int r0 = r0 + 4
            r12.A06 = r0
            int r3 = r3 + r5
            goto L_0x02e3
        L_0x030e:
            int r16 = r9.EJl(r14, r0, r1, r1)
            int r0 = r12.A05
            int r0 = r0 + r16
            r12.A05 = r0
            int r0 = r12.A06
            int r0 = r0 + r16
            r12.A06 = r0
            int r0 = r12.A07
            int r0 = r0 - r16
            r12.A07 = r0
            goto L_0x02e3
        L_0x0325:
            java.lang.String r0 = "Invalid NAL length"
            X.47p r2 = X.C2609347p.A00(r0, r4)
            throw r2
        L_0x032c:
            X.3wB r0 = r0.A07
            java.lang.String r5 = r0.A0W
            java.lang.String r0 = "audio/ac4"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x036c
            int r0 = r12.A06
            if (r0 != 0) goto L_0x0350
            X.4XV r7 = r12.A0L
            r5 = 7
            r7.A0E(r5)
            byte[] r0 = r7.A02
            X.Pxk.A0g(r0, r3)
            r9.EJh(r7, r5)
            int r0 = r12.A06
            int r0 = r0 + 7
            r12.A06 = r0
        L_0x0350:
            int r3 = r3 + 7
        L_0x0352:
            int r0 = r12.A06
            if (r0 >= r3) goto L_0x0372
            int r0 = r3 - r0
            int r5 = r9.EJl(r14, r0, r1, r1)
            int r0 = r12.A05
            int r0 = r0 + r5
            r12.A05 = r0
            int r0 = r12.A06
            int r0 = r0 + r5
            r12.A06 = r0
            int r0 = r12.A07
            int r0 = r0 - r5
            r12.A07 = r0
            goto L_0x0352
        L_0x036c:
            if (r2 == 0) goto L_0x0352
            r2.A00(r14)
            goto L_0x0352
        L_0x0372:
            X.Q0S r5 = r10.A04
            long[] r0 = r5.A07
            r19 = r0[r6]
            int[] r0 = r5.A04
            r16 = r0[r6]
            if (r2 == 0) goto L_0x03a1
            r17 = r3
            r18 = r1
            r13 = r2
            r14 = r4
            r15 = r9
            r13.A02(r14, r15, r16, r17, r18, r19)
            int r3 = r6 + 1
            int r0 = r5.A01
            if (r3 != r0) goto L_0x0391
            r2.A01(r4, r9)
        L_0x0391:
            r8 = 0
        L_0x0392:
            int r0 = r10.A00
            int r0 = r0 + 1
            r10.A00 = r0
            r12.A08 = r11
            r12.A05 = r1
            r12.A06 = r1
            r12.A07 = r1
            return r8
        L_0x03a1:
            r8 = 0
            r21 = r9
            r22 = r4
            r23 = r16
            r24 = r3
            r25 = r1
            r26 = r19
            r21.EJn(r22, r23, r24, r25, r26)
            goto L_0x0392
        L_0x03b2:
            r15.A00 = r4
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q0O.E68(X.4Y7, X.4Sh):int");
    }

    public final void EKu(long j, long j2) {
        this.A0M.clear();
        this.A00 = 0;
        this.A08 = -1;
        this.A05 = 0;
        this.A06 = 0;
        this.A07 = 0;
        if (j == 0) {
            this.A04 = 0;
            this.A00 = 0;
            return;
        }
        for (Q0T q0t : this.A0F) {
            Q0S q0s = q0t.A04;
            int A042 = Util.A04(q0s.A07, j2, false);
            while (true) {
                if (A042 >= 0) {
                    if ((q0s.A04[A042] & 1) != 0) {
                        break;
                    }
                    A042--;
                } else {
                    A042 = q0s.A00(j2);
                    break;
                }
            }
            q0t.A00 = A042;
            C11025S6c s6c = q0t.A02;
            if (s6c != null) {
                s6c.A01 = false;
                s6c.A00 = 0;
            }
        }
    }
}
