package androidx.paging;

import X.00k;
import X.0qQ;
import X.0sK;
import X.11M;
import X.19B;
import X.1Eo;
import X.1HR;
import X.1Hj;
import X.AnonymousClass05E;
import X.AnonymousClass05K;
import X.AnonymousClass0r6;
import X.AnonymousClass19G;
import X.AnonymousClass3FN;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C249513ju;
import X.C262204Co;
import X.C262224Cq;
import X.C51973G9u;
import X.C51974G9v;
import X.C59703JUk;
import X.C60333Jjc;
import X.C60334Jjd;
import X.C60335Jje;
import X.C60340gF;
import X.C60347Jjs;
import X.C62170rn;
import X.C62320sa;
import X.C62448Kfy;
import X.C62693Kkt;
import X.C62958KpA;
import X.C63569KzI;
import X.C63828L8j;
import X.C63906LBn;
import X.C63967LFt;
import X.C64124LOv;
import X.C66192MHi;
import X.DbU;
import X.JGF;
import X.JTO;
import X.LGA;
import X.LGK;
import X.LP3;
import X.MCn;
import X.MHG;
import X.MHP;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.ReentrantLock;

public final class PageFetcherSnapshot {
    public final C63906LBn A00 = new C63906LBn();
    public final PageFetcherSnapshotState$Holder A01;
    public final PagingConfig A02;
    public final PagingSource A03;
    public final C63967LFt A04;
    public final AtomicBoolean A05 = new AtomicBoolean(false);
    public final C62320sa A06;
    public final AnonymousClass19G A07;
    public final C249513ju A08;
    public final AnonymousClass0r6 A09;
    public final AnonymousClass0r6 A0A;

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.Kfy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: X.Kfy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v26, resolved type: X.0rk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v42, resolved type: X.Kfy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: X.Jjp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v50, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v50, resolved type: X.Kfy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v51, resolved type: X.Kfy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v55, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v50, resolved type: X.0rk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v52, resolved type: X.0rk} */
    /* JADX WARNING: type inference failed for: r11v1, types: [X.4D7, X.MDn] */
    /* JADX WARNING: type inference failed for: r2v21, types: [X.Jjo] */
    /* JADX WARNING: type inference failed for: r2v22, types: [X.Jjn] */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0312, code lost:
        if (r0 != r10) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0314, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0332, code lost:
        r13 = r2;
        r14 = (X.C62693Kkt) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0338, code lost:
        if ((r14 instanceof X.C60347Jjs) == false) goto L_0x03d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x033a, code lost:
        r1 = r8.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x033e, code lost:
        if (r1 == 1) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0341, code lost:
        if (r1 != 2) goto L_0x0506;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0343, code lost:
        r1 = ((X.C60347Jjs) r14).A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0352, code lost:
        if (X.AnonymousClass7TF.A1Q(X.0qQ.A0K(r1, r6.A00)) != false) goto L_0x038a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0356, code lost:
        if (r8 != X.C62448Kfy.PREPEND) goto L_0x0381;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0358, code lost:
        r2 = "prevKey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x035a, code lost:
        r1 = X.AnonymousClass7TE.A1A();
        r1.append("The same value, ");
        r1.append(r6.A00);
        r1.append(", was passed as the ");
        r1.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0380, code lost:
        throw X.AnonymousClass7TE.A0z(X.0rw.A0u(X.AnonymousClass7TF.A0l(" in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            ", r1), "|"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0381, code lost:
        r2 = "nextKey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0384, code lost:
        r1 = ((X.C60347Jjs) r14).A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x038a, code lost:
        r1 = r4.A01;
        r7 = r1.A01;
        r11.A06 = r4;
        r11.A07 = r8;
        X.C66135MDn.A00(r5, r9, r6, r3, r11);
        r11.A0D = r2;
        r11.A03 = r14;
        r11.A04 = r1;
        r11.A05 = r7;
        r11.A00 = 5;
        r9 = r9;
        r8 = r8;
        r3 = r3;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03a4, code lost:
        if (X.136.A00(r11, r7) != r10) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03a6, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        r1 = (X.C60347Jjs) r14;
        r15 = r1.A00.A02(r8, r1, r5.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03b2, code lost:
        r7.A05((java.lang.Object) null);
        r0 = X.C62914KoS.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03b8, code lost:
        if (r15 != false) goto L_0x0447;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03ba, code lost:
        if (r0 == null) goto L_0x03c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03bc, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03c2, code lost:
        if (X.JTO.A1b(2) == true) goto L_0x03c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03c4, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03c5, code lost:
        if (r0 == false) goto L_0x0442;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03c7, code lost:
        X.0qQ.A0B(A06(r8, (X.C62693Kkt) null, r6.A00), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03d3, code lost:
        if ((r14 instanceof X.C60346Jjr) == false) goto L_0x041c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03d7, code lost:
        if (X.C62914KoS.A00 == null) goto L_0x03e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03d9, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03df, code lost:
        if (X.JTO.A1b(2) == true) goto L_0x03e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03e1, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03e2, code lost:
        if (r0 == false) goto L_0x0405;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03e4, code lost:
        r0 = null;
        X.0qQ.A0B(A06(r8, r14, r6.A00), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03ee, code lost:
        r1 = r4.A01;
        r3 = r1.A01;
        r11.A06 = r4;
        r11.A07 = r8;
        X.C66135MDn.A00(r5, r14, r1, r3, r11);
        r11.A0D = r0;
        r11.A00 = 6;
        r8 = r8;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0402, code lost:
        if (X.136.A00(r11, r3) != r10) goto L_0x050b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0404, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0405, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0407, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x040a, code lost:
        r2 = new X.C60343Jjo(r14, r15, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0411, code lost:
        r2 = new X.C60344Jjp(r14, r15, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0418, code lost:
        r14 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x041c, code lost:
        r0 = r14 instanceof X.C60345Jjq;
        r9 = r9;
        r8 = r8;
        r3 = r3;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x041e, code lost:
        if (r0 == false) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0422, code lost:
        if (X.C62914KoS.A00 == null) goto L_0x0445;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0424, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x042a, code lost:
        if (X.JTO.A1b(2) != true) goto L_0x0445;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x042c, code lost:
        if (r0 == false) goto L_0x0437;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x042e, code lost:
        X.0qQ.A0B(A06(r8, r14, r6.A00), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0437, code lost:
        r4.A07.AG7((java.util.concurrent.CancellationException) null);
        r4.A03.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0444, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0445, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0447, code lost:
        if (r0 == null) goto L_0x0451;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0449, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x044f, code lost:
        if (X.JTO.A1b(3) == true) goto L_0x0452;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0451, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0452, code lost:
        if (r0 == false) goto L_0x045d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0454, code lost:
        X.0qQ.A0B(A06(r8, r14, r6.A00), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x045d, code lost:
        r9.A00 = X.DbT.A01(r1.A04, r9.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0469, code lost:
        if (r8 != X.C62448Kfy.PREPEND) goto L_0x046f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x046d, code lost:
        if (r1.A03 == null) goto L_0x0477;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x046f, code lost:
        r14 = r14;
        r9 = r9;
        r8 = r8;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0471, code lost:
        if (r8 != X.C62448Kfy.APPEND) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0473, code lost:
        r14 = r14;
        r9 = r9;
        r8 = r8;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0475, code lost:
        if (r1.A02 != null) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0477, code lost:
        r3.A00 = true;
        r14 = r14;
        r9 = r9;
        r8 = r8;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x047d, code lost:
        if (r8.ordinal() != 1) goto L_0x04a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x047f, code lost:
        r2 = X.C62448Kfy.APPEND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0481, code lost:
        r1 = r4.A01;
        r7 = r1.A01;
        r11.A06 = r4;
        r11.A07 = r8;
        X.C66135MDn.A00(r5, r9, r6, r3, r11);
        r11.A0D = r13;
        r11.A03 = r14;
        r11.A04 = r2;
        r11.A05 = r1;
        r11.A08 = r7;
        r11.A00 = 8;
        r14 = r14;
        r9 = r9;
        r8 = r8;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x049e, code lost:
        if (X.136.A00(r11, r7) != r10) goto L_0x04a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04a0, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04a1, code lost:
        r2 = X.C62448Kfy.PREPEND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        r1 = r1.A00;
        X.0qQ.A0B(r2, 0);
        r14 = r14;
        r9 = r9;
        r8 = r8;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04aa, code lost:
        r0 = r4.A04(r8, r1, r5.A00, r5.A01.A01(r8) + r9.A00);
        r6.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04bb, code lost:
        if (r0 != null) goto L_0x04d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04bd, code lost:
        r2 = r1.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04c5, code lost:
        if ((r2.A00(r8) instanceof X.C60333Jjc) != false) goto L_0x04d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04c9, code lost:
        if (r3.A00 == false) goto L_0x04e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04cb, code lost:
        r0 = X.C60332Jjb.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04cd, code lost:
        r2.A02(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04d0, code lost:
        r2 = r1.A00(r8, (X.C60347Jjs) r14);
        r1 = r4.A08;
        r11.A06 = r4;
        r11.A07 = r8;
        X.C66135MDn.A00(r5, r9, r6, r3, r11);
        r11.A0D = r13;
        r11.A03 = r14;
        r11.A04 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04e7, code lost:
        r0 = X.C60332Jjb.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        r11.A05 = null;
        r11.A08 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:?, code lost:
        r11.A00 = 10;
        r9 = r9;
        r8 = r8;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04f7, code lost:
        if (r1.ELH(r2, r11) != r10) goto L_0x04fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04fa, code lost:
        r13 = null;
        r7.A05((java.lang.Object) null);
        r9 = r9;
        r8 = r8;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0500, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0501, code lost:
        r7.A05((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0505, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x050a, code lost:
        throw X.AnonymousClass7TE.A0w("Use doInitialLoad for LoadType == REFRESH");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:?, code lost:
        r6 = r1.A00;
        r2 = new X.C60333Jjc(((X.C60346Jjr) r14).A00);
        r11.A06 = r8;
        r11.A07 = r5;
        r11.A09 = r3;
        r11.A0A = r6;
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:?, code lost:
        r11.A0B = null;
        r11.A0C = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:?, code lost:
        r11.A00 = 7;
        r1 = r6.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0530, code lost:
        if (X.0qQ.A0K(r1.A00(r8), r2) != false) goto L_0x0545;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0532, code lost:
        r1.A02(r2, r8);
        r0 = r4.A08.ELH(new X.C60335Jje(r1.A01(), (X.LP3) null), r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0545, code lost:
        r0 = X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0548, code lost:
        if (r0 != r10) goto L_0x0545;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x054a, code lost:
        if (r0 != r10) goto L_0x0550;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x054c, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0550, code lost:
        r6.A07.put(r8, r5.A01);
        r10 = X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0559, code lost:
        r3.A05((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x055d, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x055e, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0560, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0561, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0562, code lost:
        r3.A05(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0565, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x056a, code lost:
        throw X.AnonymousClass7TE.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x056b, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x056f, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0570, code lost:
        r7.A05((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0573, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (((X.C66135MDn) r3).A0E != 1) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0114, code lost:
        if (X.136.A00(r11, r3) == r10) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0116, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r7 = r1.A00;
        r1 = r4.A04(r8, r7, r5.A00, r5.A01.A01(r8) + r9.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x015b, code lost:
        if (r1 == null) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015d, code lost:
        r11.A06 = r4;
        r11.A07 = r8;
        X.C66135MDn.A00(r5, r9, r6, r2, r11);
        r11.A0D = r1;
        r11.A03 = r3;
        r11.A00 = 3;
        r0 = A01(r8, r4, r7, r11);
        r9 = r9;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016f, code lost:
        if (r0 != r10) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0171, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0194, code lost:
        r1 = null;
        r9 = r9;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0195, code lost:
        r13 = null;
        r2.A05((java.lang.Object) null);
        r3.A00 = r1;
        r9 = r9;
        r8 = r8;
        r3 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a2, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a3, code lost:
        r2.A05((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a7, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02ab, code lost:
        r15 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02ad, code lost:
        if (r15 == null) goto L_0x0442;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02af, code lost:
        r1 = X.C62448Kfy.REFRESH;
        r0 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02b3, code lost:
        if (r8 != r1) goto L_0x0418;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02b5, code lost:
        r14 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02b7, code lost:
        r7 = r0.A03;
        r1 = X.DbU.A02(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02be, code lost:
        if (r1 == 0) goto L_0x0411;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02c0, code lost:
        if (r1 == 1) goto L_0x040a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02c3, code lost:
        if (r1 != 2) goto L_0x0566;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02c5, code lost:
        r2 = new X.C60342Jjn(r14, r15, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02cc, code lost:
        if (X.C62914KoS.A00 == null) goto L_0x0407;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02ce, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02d4, code lost:
        if (X.JTO.A1b(3) != true) goto L_0x0407;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02d6, code lost:
        if (r0 == false) goto L_0x02fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02d8, code lost:
        r1 = X.AnonymousClass7TE.A1A();
        r1.append("Start ");
        r1.append(r8);
        r1.append(" with loadKey ");
        r1.append(r6.A00);
        r1.append(" on ");
        X.0qQ.A0B(X.AnonymousClass7TF.A0i(r4.A03, r1), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02fc, code lost:
        r1 = r4.A03;
        r11.A06 = r4;
        r11.A07 = r8;
        X.C66135MDn.A00(r5, r9, r6, r3, r11);
        r11.A0D = r2;
        r11.A03 = r13;
        r11.A04 = r13;
        r11.A00 = 4;
        r0 = r1.A04(r2, r11);
        r9 = r9;
        r8 = r8;
        r3 = r3;
        r2 = r2;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0279  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.LFi r13, X.C62448Kfy r14, androidx.paging.PageFetcherSnapshot r15, X.AnonymousClass4D7 r16) {
        /*
            r5 = r13
            r8 = r14
            r4 = r15
            r12 = 1
            r3 = r16
            boolean r0 = r3 instanceof X.C66135MDn
            if (r0 == 0) goto L_0x0012
            r0 = r3
            X.MDn r0 = (X.C66135MDn) r0
            int r1 = r0.A0E
            r0 = 1
            if (r1 == r12) goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 == 0) goto L_0x0033
            r11 = r3
            X.MDn r11 = (X.C66135MDn) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0033
            int r2 = r2 - r1
            r11.A00 = r2
        L_0x0023:
            java.lang.Object r0 = r11.A02
            X.1Hj r10 = X.1Hj.A02
            int r1 = r11.A00
            java.lang.String r16 = "Use doInitialLoad for LoadType == REFRESH"
            switch(r1) {
                case 0: goto L_0x00f3;
                case 1: goto L_0x0039;
                case 2: goto L_0x0127;
                case 3: goto L_0x0172;
                case 4: goto L_0x0315;
                case 5: goto L_0x01a8;
                case 6: goto L_0x01d3;
                case 7: goto L_0x01f0;
                case 8: goto L_0x0200;
                case 9: goto L_0x022d;
                case 10: goto L_0x0258;
                case 11: goto L_0x0279;
                default: goto L_0x002e;
            }
        L_0x002e:
            java.lang.IllegalStateException r4 = X.AnonymousClass7TE.A0x()
            throw r4
        L_0x0033:
            X.MDn r11 = new X.MDn
            r11.<init>((androidx.paging.PageFetcherSnapshot) r15, (X.AnonymousClass4D7) r3)
            goto L_0x0023
        L_0x0039:
            java.lang.Object r3 = r11.A0C
            X.136 r3 = (X.136) r3
            java.lang.Object r1 = r11.A0B
            androidx.paging.PageFetcherSnapshotState$Holder r1 = (androidx.paging.PageFetcherSnapshotState$Holder) r1
            java.lang.Object r9 = r11.A0A
            X.0rk r9 = (X.0rk) r9
            java.lang.Object r5 = r11.A09
            X.LFi r5 = (X.LFi) r5
            java.lang.Object r8 = r11.A07
            X.Kfy r8 = (X.C62448Kfy) r8
            java.lang.Object r4 = r11.A06
            androidx.paging.PageFetcherSnapshot r4 = (androidx.paging.PageFetcherSnapshot) r4
            X.0eS.A00(r0)
        L_0x0054:
            X.LGA r2 = r1.A00     // Catch:{ all -> 0x0121 }
            int r1 = r8.ordinal()     // Catch:{ all -> 0x0121 }
            r0 = 0
            if (r1 == r0) goto L_0x011c
            if (r1 == r12) goto L_0x0096
            r0 = 2
            if (r1 != r0) goto L_0x00d1
            int r1 = r2.A02     // Catch:{ all -> 0x0121 }
            X.LOv r0 = r5.A01     // Catch:{ all -> 0x0121 }
            int r0 = r0.A01     // Catch:{ all -> 0x0121 }
            int r1 = r1 + r0
            int r7 = r1 + 1
            if (r7 >= 0) goto L_0x0079
            int r6 = r9.A00     // Catch:{ all -> 0x0121 }
            androidx.paging.PagingConfig r0 = r4.A02     // Catch:{ all -> 0x0121 }
            int r1 = r0.A01     // Catch:{ all -> 0x0121 }
            int r0 = -r7
            int r1 = r1 * r0
            int r6 = r6 + r1
            r9.A00 = r6     // Catch:{ all -> 0x0121 }
            r7 = 0
        L_0x0079:
            java.util.List r6 = r2.A06     // Catch:{ all -> 0x0121 }
            int r2 = X.C51970G9q.A0A(r6)     // Catch:{ all -> 0x0121 }
            if (r7 > r2) goto L_0x00d1
        L_0x0081:
            int r1 = r9.A00     // Catch:{ all -> 0x0121 }
            java.lang.Object r0 = r6.get(r7)     // Catch:{ all -> 0x0121 }
            X.Jjs r0 = (X.C60347Jjs) r0     // Catch:{ all -> 0x0121 }
            java.util.List r0 = r0.A04     // Catch:{ all -> 0x0121 }
            int r0 = X.DbT.A01(r0, r1)     // Catch:{ all -> 0x0121 }
            r9.A00 = r0     // Catch:{ all -> 0x0121 }
            if (r7 == r2) goto L_0x00d1
            int r7 = r7 + 1
            goto L_0x0081
        L_0x0096:
            int r7 = r2.A02     // Catch:{ all -> 0x0121 }
            X.LOv r0 = r5.A01     // Catch:{ all -> 0x0121 }
            int r0 = r0.A00     // Catch:{ all -> 0x0121 }
            int r7 = r7 + r0
            int r7 = r7 - r12
            java.util.List r6 = r2.A06     // Catch:{ all -> 0x0121 }
            int r0 = X.C51970G9q.A0A(r6)     // Catch:{ all -> 0x0121 }
            if (r7 <= r0) goto L_0x00b9
            int r2 = r9.A00     // Catch:{ all -> 0x0121 }
            androidx.paging.PagingConfig r0 = r4.A02     // Catch:{ all -> 0x0121 }
            int r1 = r0.A01     // Catch:{ all -> 0x0121 }
            int r0 = X.C51970G9q.A0A(r6)     // Catch:{ all -> 0x0121 }
            int r7 = r7 - r0
            int r1 = r1 * r7
            int r2 = r2 + r1
            r9.A00 = r2     // Catch:{ all -> 0x0121 }
            int r7 = X.C51970G9q.A0A(r6)     // Catch:{ all -> 0x0121 }
        L_0x00b9:
            if (r7 < 0) goto L_0x00d1
            r2 = 0
        L_0x00bc:
            int r1 = r9.A00     // Catch:{ all -> 0x0121 }
            java.lang.Object r0 = r6.get(r2)     // Catch:{ all -> 0x0121 }
            X.Jjs r0 = (X.C60347Jjs) r0     // Catch:{ all -> 0x0121 }
            java.util.List r0 = r0.A04     // Catch:{ all -> 0x0121 }
            int r0 = X.DbT.A01(r0, r1)     // Catch:{ all -> 0x0121 }
            r9.A00 = r0     // Catch:{ all -> 0x0121 }
            if (r2 == r7) goto L_0x00d1
            int r2 = r2 + 1
            goto L_0x00bc
        L_0x00d1:
            r0 = 0
            r3.A05(r0)
            X.0rm r3 = X.C51965G9l.A11()
            androidx.paging.PageFetcherSnapshotState$Holder r1 = r4.A01
            X.136 r2 = r1.A01
            r11.A06 = r4
            r11.A07 = r8
            X.C66135MDn.A00(r5, r9, r3, r1, r11)
            r11.A0D = r2
            r11.A03 = r3
            r0 = 2
            r11.A00 = r0
            java.lang.Object r0 = X.136.A00(r11, r2)
            if (r0 == r10) goto L_0x0116
            r6 = r3
            goto L_0x014a
        L_0x00f3:
            X.0eS.A00(r0)
            X.Kfy r0 = X.C62448Kfy.REFRESH
            boolean r0 = X.C51969G9p.A1a(r14, r0)
            if (r0 == 0) goto L_0x0117
            X.0rk r9 = new X.0rk
            r9.<init>()
            androidx.paging.PageFetcherSnapshotState$Holder r1 = r15.A01
            X.136 r3 = r1.A01
            r11.A06 = r15
            r11.A07 = r14
            X.C66135MDn.A00(r13, r9, r1, r3, r11)
            r11.A00 = r12
            java.lang.Object r0 = X.136.A00(r11, r3)
            if (r0 != r10) goto L_0x0054
        L_0x0116:
            return r10
        L_0x0117:
            java.lang.IllegalArgumentException r4 = X.AnonymousClass7TE.A0w(r16)
            throw r4
        L_0x011c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)     // Catch:{ all -> 0x0121 }
            throw r0     // Catch:{ all -> 0x0121 }
        L_0x0121:
            r4 = move-exception
            r0 = 0
            r3.A05(r0)
            throw r4
        L_0x0127:
            java.lang.Object r3 = r11.A03
            X.0rm r3 = (X.0rm) r3
            java.lang.Object r2 = r11.A0D
            X.136 r2 = (X.136) r2
            java.lang.Object r1 = r11.A0C
            androidx.paging.PageFetcherSnapshotState$Holder r1 = (androidx.paging.PageFetcherSnapshotState$Holder) r1
            java.lang.Object r6 = r11.A0B
            X.0rm r6 = (X.0rm) r6
            java.lang.Object r9 = r11.A0A
            X.0rk r9 = (X.0rk) r9
            java.lang.Object r5 = r11.A09
            X.LFi r5 = (X.LFi) r5
            java.lang.Object r8 = r11.A07
            X.Kfy r8 = (X.C62448Kfy) r8
            java.lang.Object r4 = r11.A06
            androidx.paging.PageFetcherSnapshot r4 = (androidx.paging.PageFetcherSnapshot) r4
            X.0eS.A00(r0)
        L_0x014a:
            X.LGA r7 = r1.A00     // Catch:{ all -> 0x01a2 }
            int r13 = r5.A00     // Catch:{ all -> 0x01a2 }
            X.LOv r0 = r5.A01     // Catch:{ all -> 0x01a2 }
            int r1 = r0.A01(r8)     // Catch:{ all -> 0x01a2 }
            int r0 = r9.A00     // Catch:{ all -> 0x01a2 }
            int r1 = r1 + r0
            java.lang.Object r1 = r4.A04(r8, r7, r13, r1)     // Catch:{ all -> 0x01a2 }
            if (r1 == 0) goto L_0x0194
            r11.A06 = r4     // Catch:{ all -> 0x01a2 }
            r11.A07 = r8     // Catch:{ all -> 0x01a2 }
            X.C66135MDn.A00(r5, r9, r6, r2, r11)     // Catch:{ all -> 0x01a2 }
            r11.A0D = r1     // Catch:{ all -> 0x01a2 }
            r11.A03 = r3     // Catch:{ all -> 0x01a2 }
            r0 = 3
            r11.A00 = r0     // Catch:{ all -> 0x01a2 }
            java.lang.Object r0 = A01(r8, r4, r7, r11)     // Catch:{ all -> 0x01a2 }
            if (r0 != r10) goto L_0x0195
            return r10
        L_0x0172:
            java.lang.Object r3 = r11.A03
            X.0rm r3 = (X.0rm) r3
            java.lang.Object r1 = r11.A0D
            java.lang.Object r2 = r11.A0C
            X.136 r2 = (X.136) r2
            java.lang.Object r6 = r11.A0B
            X.0rm r6 = (X.0rm) r6
            java.lang.Object r9 = r11.A0A
            X.0rk r9 = (X.0rk) r9
            java.lang.Object r5 = r11.A09
            X.LFi r5 = (X.LFi) r5
            java.lang.Object r8 = r11.A07
            X.Kfy r8 = (X.C62448Kfy) r8
            java.lang.Object r4 = r11.A06
            androidx.paging.PageFetcherSnapshot r4 = (androidx.paging.PageFetcherSnapshot) r4
            X.0eS.A00(r0)     // Catch:{ all -> 0x01a2 }
            goto L_0x0195
        L_0x0194:
            r1 = 0
        L_0x0195:
            r13 = 0
            r2.A05(r13)
            r3.A00 = r1
            X.0r1 r3 = new X.0r1
            r3.<init>()
            goto L_0x02ab
        L_0x01a2:
            r4 = move-exception
            r0 = 0
            r2.A05(r0)
            throw r4
        L_0x01a8:
            java.lang.Object r7 = r11.A05
            X.136 r7 = (X.136) r7
            java.lang.Object r1 = r11.A04
            androidx.paging.PageFetcherSnapshotState$Holder r1 = (androidx.paging.PageFetcherSnapshotState$Holder) r1
            java.lang.Object r14 = r11.A03
            X.Kkt r14 = (X.C62693Kkt) r14
            java.lang.Object r13 = r11.A0D
            java.lang.Object r3 = r11.A0C
            X.0r1 r3 = (X.0r1) r3
            java.lang.Object r6 = r11.A0B
            X.0rm r6 = (X.0rm) r6
            java.lang.Object r9 = r11.A0A
            X.0rk r9 = (X.0rk) r9
            java.lang.Object r5 = r11.A09
            X.LFi r5 = (X.LFi) r5
            java.lang.Object r8 = r11.A07
            X.Kfy r8 = (X.C62448Kfy) r8
            java.lang.Object r4 = r11.A06
            androidx.paging.PageFetcherSnapshot r4 = (androidx.paging.PageFetcherSnapshot) r4
            X.0eS.A00(r0)
            goto L_0x03a7
        L_0x01d3:
            java.lang.Object r3 = r11.A0C
            X.136 r3 = (X.136) r3
            java.lang.Object r1 = r11.A0B
            androidx.paging.PageFetcherSnapshotState$Holder r1 = (androidx.paging.PageFetcherSnapshotState$Holder) r1
            java.lang.Object r14 = r11.A0A
            X.Kkt r14 = (X.C62693Kkt) r14
            java.lang.Object r5 = r11.A09
            X.LFi r5 = (X.LFi) r5
            java.lang.Object r8 = r11.A07
            X.Kfy r8 = (X.C62448Kfy) r8
            java.lang.Object r4 = r11.A06
            androidx.paging.PageFetcherSnapshot r4 = (androidx.paging.PageFetcherSnapshot) r4
            X.0eS.A00(r0)
            goto L_0x050b
        L_0x01f0:
            java.lang.Object r6 = r11.A0A
            X.LGA r6 = (X.LGA) r6
            java.lang.Object r3 = r11.A09
            X.136 r3 = (X.136) r3
            java.lang.Object r5 = r11.A07
            X.LFi r5 = (X.LFi) r5
            java.lang.Object r8 = r11.A06
            goto L_0x054d
        L_0x0200:
            java.lang.Object r7 = r11.A08
            X.136 r7 = (X.136) r7
            java.lang.Object r1 = r11.A05
            androidx.paging.PageFetcherSnapshotState$Holder r1 = (androidx.paging.PageFetcherSnapshotState$Holder) r1
            java.lang.Object r2 = r11.A04
            java.lang.Object r14 = r11.A03
            X.Kkt r14 = (X.C62693Kkt) r14
            java.lang.Object r13 = r11.A0D
            java.lang.Object r3 = r11.A0C
            X.0r1 r3 = (X.0r1) r3
            java.lang.Object r6 = r11.A0B
            X.0rm r6 = (X.0rm) r6
            java.lang.Object r9 = r11.A0A
            X.0rk r9 = (X.0rk) r9
            java.lang.Object r5 = r11.A09
            X.LFi r5 = (X.LFi) r5
            java.lang.Object r8 = r11.A07
            X.Kfy r8 = (X.C62448Kfy) r8
            java.lang.Object r4 = r11.A06
            androidx.paging.PageFetcherSnapshot r4 = (androidx.paging.PageFetcherSnapshot) r4
            X.0eS.A00(r0)
            goto L_0x04a4
        L_0x022d:
            java.lang.Object r1 = r11.A05
            X.LGA r1 = (X.LGA) r1
            java.lang.Object r7 = r11.A04
            X.136 r7 = (X.136) r7
            java.lang.Object r14 = r11.A03
            X.Kkt r14 = (X.C62693Kkt) r14
            java.lang.Object r13 = r11.A0D
            java.lang.Object r3 = r11.A0C
            X.0r1 r3 = (X.0r1) r3
            java.lang.Object r6 = r11.A0B
            X.0rm r6 = (X.0rm) r6
            java.lang.Object r9 = r11.A0A
            X.0rk r9 = (X.0rk) r9
            java.lang.Object r5 = r11.A09
            X.LFi r5 = (X.LFi) r5
            java.lang.Object r8 = r11.A07
            X.Kfy r8 = (X.C62448Kfy) r8
            java.lang.Object r4 = r11.A06
            androidx.paging.PageFetcherSnapshot r4 = (androidx.paging.PageFetcherSnapshot) r4
            X.0eS.A00(r0)     // Catch:{ all -> 0x056c }
            goto L_0x04aa
        L_0x0258:
            java.lang.Object r7 = r11.A04
            X.136 r7 = (X.136) r7
            java.lang.Object r3 = r11.A0C
            X.0r1 r3 = (X.0r1) r3
            java.lang.Object r6 = r11.A0B
            X.0rm r6 = (X.0rm) r6
            java.lang.Object r9 = r11.A0A
            X.0rk r9 = (X.0rk) r9
            java.lang.Object r5 = r11.A09
            X.LFi r5 = (X.LFi) r5
            java.lang.Object r8 = r11.A07
            X.Kfy r8 = (X.C62448Kfy) r8
            java.lang.Object r4 = r11.A06
            androidx.paging.PageFetcherSnapshot r4 = (androidx.paging.PageFetcherSnapshot) r4
            X.0eS.A00(r0)     // Catch:{ all -> 0x056c }
            goto L_0x04fa
        L_0x0279:
            java.lang.Object r1 = r11.A03
            X.136 r1 = (X.136) r1
            java.lang.Object r2 = r11.A0D
            androidx.paging.PageFetcherSnapshotState$Holder r2 = (androidx.paging.PageFetcherSnapshotState$Holder) r2
            java.lang.Object r3 = r11.A0C
            X.0r1 r3 = (X.0r1) r3
            java.lang.Object r6 = r11.A0B
            X.0rm r6 = (X.0rm) r6
            java.lang.Object r9 = r11.A0A
            X.0rk r9 = (X.0rk) r9
            java.lang.Object r5 = r11.A09
            X.LFi r5 = (X.LFi) r5
            java.lang.Object r8 = r11.A07
            X.Kfy r8 = (X.C62448Kfy) r8
            java.lang.Object r4 = r11.A06
            androidx.paging.PageFetcherSnapshot r4 = (androidx.paging.PageFetcherSnapshot) r4
            X.0eS.A00(r0)
            X.LGA r2 = r2.A00     // Catch:{ all -> 0x0574 }
            X.LBn r0 = r4.A00     // Catch:{ all -> 0x0574 }
            X.L8j r0 = r0.A00     // Catch:{ all -> 0x0574 }
            X.Jjz r0 = r0.A00     // Catch:{ all -> 0x0574 }
            r2.A01(r0)     // Catch:{ all -> 0x0574 }
            r13 = 0
            r1.A05(r13)
        L_0x02ab:
            java.lang.Object r15 = r6.A00
            if (r15 == 0) goto L_0x0442
            X.Kfy r1 = X.C62448Kfy.REFRESH
            androidx.paging.PagingConfig r0 = r4.A02
            if (r8 != r1) goto L_0x0418
            int r14 = r0.A00
        L_0x02b7:
            boolean r7 = r0.A03
            r0 = 0
            int r1 = X.DbU.A02(r8, r0)
            if (r1 == r0) goto L_0x0411
            if (r1 == r12) goto L_0x040a
            r0 = 2
            if (r1 != r0) goto L_0x0566
            X.Jjn r2 = new X.Jjn
            r2.<init>(r14, r15, r7)
        L_0x02ca:
            X.MPb r0 = X.C62914KoS.A00
            if (r0 == 0) goto L_0x0407
            r0 = 3
            boolean r1 = X.JTO.A1b(r0)
            r0 = 1
            if (r1 != r12) goto L_0x0407
        L_0x02d6:
            if (r0 == 0) goto L_0x02fc
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Start "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " with loadKey "
            r1.append(r0)
            java.lang.Object r0 = r6.A00
            r1.append(r0)
            java.lang.String r0 = " on "
            r1.append(r0)
            androidx.paging.PagingSource r0 = r4.A03
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r1)
            X.0qQ.A0B(r0, r12)
        L_0x02fc:
            androidx.paging.PagingSource r1 = r4.A03
            r11.A06 = r4
            r11.A07 = r8
            X.C66135MDn.A00(r5, r9, r6, r3, r11)
            r11.A0D = r2
            r11.A03 = r13
            r11.A04 = r13
            r0 = 4
            r11.A00 = r0
            java.lang.Object r0 = r1.A04(r2, r11)
            if (r0 != r10) goto L_0x0332
            return r10
        L_0x0315:
            java.lang.Object r2 = r11.A0D
            java.lang.Object r3 = r11.A0C
            X.0r1 r3 = (X.0r1) r3
            java.lang.Object r6 = r11.A0B
            X.0rm r6 = (X.0rm) r6
            java.lang.Object r9 = r11.A0A
            X.0rk r9 = (X.0rk) r9
            java.lang.Object r5 = r11.A09
            X.LFi r5 = (X.LFi) r5
            java.lang.Object r8 = r11.A07
            X.Kfy r8 = (X.C62448Kfy) r8
            java.lang.Object r4 = r11.A06
            androidx.paging.PageFetcherSnapshot r4 = (androidx.paging.PageFetcherSnapshot) r4
            X.0eS.A00(r0)
        L_0x0332:
            r13 = r2
            r14 = r0
            X.Kkt r14 = (X.C62693Kkt) r14
            boolean r0 = r14 instanceof X.C60347Jjs
            if (r0 == 0) goto L_0x03d1
            int r1 = r8.ordinal()
            if (r1 == r12) goto L_0x0384
            r0 = 2
            if (r1 != r0) goto L_0x0506
            r0 = r14
            X.Jjs r0 = (X.C60347Jjs) r0
            java.lang.Object r1 = r0.A02
        L_0x0348:
            java.lang.Object r0 = r6.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            if (r0 != 0) goto L_0x038a
            X.Kfy r0 = X.C62448Kfy.PREPEND
            if (r8 != r0) goto L_0x0381
            java.lang.String r2 = "prevKey"
        L_0x035a:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "The same value, "
            r1.append(r0)
            java.lang.Object r0 = r6.A00
            r1.append(r0)
            java.lang.String r0 = ", was passed as the "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            "
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r0, r1)
            java.lang.String r0 = "|"
            java.lang.String r0 = X.0rw.A0u(r1, r0)
            java.lang.IllegalStateException r4 = X.AnonymousClass7TE.A0z(r0)
            throw r4
        L_0x0381:
            java.lang.String r2 = "nextKey"
            goto L_0x035a
        L_0x0384:
            r0 = r14
            X.Jjs r0 = (X.C60347Jjs) r0
            java.lang.Object r1 = r0.A03
            goto L_0x0348
        L_0x038a:
            androidx.paging.PageFetcherSnapshotState$Holder r1 = r4.A01
            X.136 r7 = r1.A01
            r11.A06 = r4
            r11.A07 = r8
            X.C66135MDn.A00(r5, r9, r6, r3, r11)
            r11.A0D = r2
            r11.A03 = r14
            r11.A04 = r1
            r11.A05 = r7
            r0 = 5
            r11.A00 = r0
            java.lang.Object r0 = X.136.A00(r11, r7)
            if (r0 != r10) goto L_0x03a7
            return r10
        L_0x03a7:
            X.LGA r2 = r1.A00     // Catch:{ all -> 0x0500 }
            int r0 = r5.A00     // Catch:{ all -> 0x0500 }
            r1 = r14
            X.Jjs r1 = (X.C60347Jjs) r1     // Catch:{ all -> 0x0500 }
            boolean r15 = r2.A02(r8, r1, r0)     // Catch:{ all -> 0x0500 }
            r2 = 0
            r7.A05(r2)
            X.MPb r0 = X.C62914KoS.A00
            if (r15 != 0) goto L_0x0447
            if (r0 == 0) goto L_0x03c4
            r0 = 2
            boolean r1 = X.JTO.A1b(r0)
            r0 = 1
            if (r1 == r12) goto L_0x03c5
        L_0x03c4:
            r0 = 0
        L_0x03c5:
            if (r0 == 0) goto L_0x0442
            java.lang.Object r0 = r6.A00
            java.lang.String r0 = A06(r8, r2, r0)
            X.0qQ.A0B(r0, r12)
            goto L_0x0442
        L_0x03d1:
            boolean r0 = r14 instanceof X.C60346Jjr
            if (r0 == 0) goto L_0x041c
            X.MPb r0 = X.C62914KoS.A00
            if (r0 == 0) goto L_0x03e1
            r0 = 2
            boolean r1 = X.JTO.A1b(r0)
            r0 = 1
            if (r1 == r12) goto L_0x03e2
        L_0x03e1:
            r0 = 0
        L_0x03e2:
            if (r0 == 0) goto L_0x0405
            java.lang.Object r0 = r6.A00
            java.lang.String r1 = A06(r8, r14, r0)
            r0 = 0
            X.0qQ.A0B(r1, r12)
        L_0x03ee:
            androidx.paging.PageFetcherSnapshotState$Holder r1 = r4.A01
            X.136 r3 = r1.A01
            r11.A06 = r4
            r11.A07 = r8
            X.C66135MDn.A00(r5, r14, r1, r3, r11)
            r11.A0D = r0
            r0 = 6
            r11.A00 = r0
            java.lang.Object r0 = X.136.A00(r11, r3)
            if (r0 != r10) goto L_0x050b
            return r10
        L_0x0405:
            r0 = 0
            goto L_0x03ee
        L_0x0407:
            r0 = 0
            goto L_0x02d6
        L_0x040a:
            X.Jjo r2 = new X.Jjo
            r2.<init>(r14, r15, r7)
            goto L_0x02ca
        L_0x0411:
            X.Jjp r2 = new X.Jjp
            r2.<init>(r14, r15, r7)
            goto L_0x02ca
        L_0x0418:
            int r14 = r0.A01
            goto L_0x02b7
        L_0x041c:
            boolean r0 = r14 instanceof X.C60345Jjq
            if (r0 == 0) goto L_0x0479
            X.MPb r0 = X.C62914KoS.A00
            if (r0 == 0) goto L_0x0445
            r0 = 2
            boolean r1 = X.JTO.A1b(r0)
            r0 = 1
            if (r1 != r12) goto L_0x0445
        L_0x042c:
            if (r0 == 0) goto L_0x0437
            java.lang.Object r0 = r6.A00
            java.lang.String r0 = A06(r8, r14, r0)
            X.0qQ.A0B(r0, r12)
        L_0x0437:
            X.19G r1 = r4.A07
            r0 = 0
            r1.AG7(r0)
            androidx.paging.PagingSource r0 = r4.A03
            r0.A03()
        L_0x0442:
            X.0gF r10 = X.C60340gF.A00
            return r10
        L_0x0445:
            r0 = 0
            goto L_0x042c
        L_0x0447:
            if (r0 == 0) goto L_0x0451
            r0 = 3
            boolean r2 = X.JTO.A1b(r0)
            r0 = 1
            if (r2 == r12) goto L_0x0452
        L_0x0451:
            r0 = 0
        L_0x0452:
            if (r0 == 0) goto L_0x045d
            java.lang.Object r0 = r6.A00
            java.lang.String r0 = A06(r8, r14, r0)
            X.0qQ.A0B(r0, r12)
        L_0x045d:
            int r2 = r9.A00
            java.util.List r0 = r1.A04
            int r0 = X.DbT.A01(r0, r2)
            r9.A00 = r0
            X.Kfy r0 = X.C62448Kfy.PREPEND
            if (r8 != r0) goto L_0x046f
            java.lang.Object r0 = r1.A03
            if (r0 == 0) goto L_0x0477
        L_0x046f:
            X.Kfy r0 = X.C62448Kfy.APPEND
            if (r8 != r0) goto L_0x0479
            java.lang.Object r0 = r1.A02
            if (r0 != 0) goto L_0x0479
        L_0x0477:
            r3.A00 = r12
        L_0x0479:
            int r0 = r8.ordinal()
            if (r0 != r12) goto L_0x04a1
            X.Kfy r2 = X.C62448Kfy.APPEND
        L_0x0481:
            androidx.paging.PageFetcherSnapshotState$Holder r1 = r4.A01
            X.136 r7 = r1.A01
            r11.A06 = r4
            r11.A07 = r8
            X.C66135MDn.A00(r5, r9, r6, r3, r11)
            r11.A0D = r13
            r11.A03 = r14
            r11.A04 = r2
            r11.A05 = r1
            r11.A08 = r7
            r0 = 8
            r11.A00 = r0
            java.lang.Object r0 = X.136.A00(r11, r7)
            if (r0 != r10) goto L_0x04a4
            return r10
        L_0x04a1:
            X.Kfy r2 = X.C62448Kfy.PREPEND
            goto L_0x0481
        L_0x04a4:
            X.LGA r1 = r1.A00     // Catch:{ all -> 0x056c }
            r0 = 0
            X.0qQ.A0B(r2, r0)     // Catch:{ all -> 0x056c }
        L_0x04aa:
            int r15 = r5.A00     // Catch:{ all -> 0x056c }
            X.LOv r0 = r5.A01     // Catch:{ all -> 0x056c }
            int r2 = r0.A01(r8)     // Catch:{ all -> 0x056c }
            int r0 = r9.A00     // Catch:{ all -> 0x056c }
            int r2 = r2 + r0
            java.lang.Object r0 = r4.A04(r8, r1, r15, r2)     // Catch:{ all -> 0x056c }
            r6.A00 = r0     // Catch:{ all -> 0x056c }
            if (r0 != 0) goto L_0x04d0
            X.LGK r2 = r1.A03     // Catch:{ all -> 0x056c }
            X.KzI r0 = r2.A00(r8)     // Catch:{ all -> 0x056c }
            boolean r0 = r0 instanceof X.C60333Jjc     // Catch:{ all -> 0x056c }
            if (r0 != 0) goto L_0x04d0
            boolean r0 = r3.A00     // Catch:{ all -> 0x056c }
            if (r0 == 0) goto L_0x04e7
            X.Jjb r0 = X.C60332Jjb.A00     // Catch:{ all -> 0x056c }
        L_0x04cd:
            r2.A02(r0, r8)     // Catch:{ all -> 0x056c }
        L_0x04d0:
            r0 = r14
            X.Jjs r0 = (X.C60347Jjs) r0     // Catch:{ all -> 0x056c }
            androidx.paging.PageEvent$Insert r2 = r1.A00(r8, r0)     // Catch:{ all -> 0x056c }
            X.3ju r1 = r4.A08     // Catch:{ all -> 0x056c }
            r11.A06 = r4     // Catch:{ all -> 0x056c }
            r11.A07 = r8     // Catch:{ all -> 0x056c }
            X.C66135MDn.A00(r5, r9, r6, r3, r11)     // Catch:{ all -> 0x056c }
            r11.A0D = r13     // Catch:{ all -> 0x056c }
            r11.A03 = r14     // Catch:{ all -> 0x056c }
            r11.A04 = r7     // Catch:{ all -> 0x056c }
            goto L_0x04ea
        L_0x04e7:
            X.Jjb r0 = X.C60332Jjb.A01     // Catch:{ all -> 0x056c }
            goto L_0x04cd
        L_0x04ea:
            r0 = 0
            r11.A05 = r0     // Catch:{ all -> 0x056f }
            r11.A08 = r0     // Catch:{ all -> 0x056f }
            r0 = 10
            r11.A00 = r0     // Catch:{ all -> 0x056c }
            java.lang.Object r0 = r1.ELH(r2, r11)     // Catch:{ all -> 0x056c }
            if (r0 != r10) goto L_0x04fa
            goto L_0x056b
        L_0x04fa:
            r13 = 0
            r7.A05(r13)
            goto L_0x02ab
        L_0x0500:
            r4 = move-exception
            r0 = 0
            r7.A05(r0)
            throw r4
        L_0x0506:
            java.lang.IllegalArgumentException r4 = X.AnonymousClass7TE.A0w(r16)
            throw r4
        L_0x050b:
            X.LGA r6 = r1.A00     // Catch:{ all -> 0x0560 }
            X.Jjr r14 = (X.C60346Jjr) r14     // Catch:{ all -> 0x0560 }
            java.lang.Throwable r0 = r14.A00     // Catch:{ all -> 0x0560 }
            X.Jjc r2 = new X.Jjc     // Catch:{ all -> 0x0560 }
            r2.<init>(r0)     // Catch:{ all -> 0x0560 }
            r11.A06 = r8     // Catch:{ all -> 0x0560 }
            r11.A07 = r5     // Catch:{ all -> 0x0560 }
            r11.A09 = r3     // Catch:{ all -> 0x0560 }
            r11.A0A = r6     // Catch:{ all -> 0x0560 }
            r7 = 0
            r11.A0B = r7     // Catch:{ all -> 0x055e }
            r11.A0C = r7     // Catch:{ all -> 0x055e }
            r0 = 7
            r11.A00 = r0     // Catch:{ all -> 0x0560 }
            X.LGK r1 = r6.A03     // Catch:{ all -> 0x0560 }
            X.KzI r0 = r1.A00(r8)     // Catch:{ all -> 0x0560 }
            boolean r0 = X.0qQ.A0K(r0, r2)     // Catch:{ all -> 0x0560 }
            if (r0 != 0) goto L_0x0545
            r1.A02(r2, r8)     // Catch:{ all -> 0x0560 }
            X.3ju r2 = r4.A08     // Catch:{ all -> 0x0560 }
            X.LP3 r1 = r1.A01()     // Catch:{ all -> 0x0560 }
            X.Jje r0 = new X.Jje     // Catch:{ all -> 0x0560 }
            r0.<init>(r1, r7)     // Catch:{ all -> 0x0560 }
            java.lang.Object r0 = r2.ELH(r0, r11)     // Catch:{ all -> 0x0560 }
            goto L_0x0548
        L_0x0545:
            X.0gF r0 = X.C60340gF.A00     // Catch:{ all -> 0x0560 }
            goto L_0x054a
        L_0x0548:
            if (r0 != r10) goto L_0x0545
        L_0x054a:
            if (r0 != r10) goto L_0x0550
            return r10
        L_0x054d:
            X.0eS.A00(r0)     // Catch:{ all -> 0x0560 }
        L_0x0550:
            java.util.Map r1 = r6.A07     // Catch:{ all -> 0x0560 }
            X.LOv r0 = r5.A01     // Catch:{ all -> 0x0560 }
            r1.put(r8, r0)     // Catch:{ all -> 0x0560 }
            X.0gF r10 = X.C60340gF.A00     // Catch:{ all -> 0x0560 }
            r0 = 0
            r3.A05(r0)
            return r10
        L_0x055e:
            r4 = move-exception
            goto L_0x0562
        L_0x0560:
            r4 = move-exception
            r7 = 0
        L_0x0562:
            r3.A05(r7)
            throw r4
        L_0x0566:
            X.Wub r4 = X.AnonymousClass7TE.A1K()
            throw r4
        L_0x056b:
            return r10
        L_0x056c:
            r4 = move-exception
            r0 = 0
            goto L_0x0570
        L_0x056f:
            r4 = move-exception
        L_0x0570:
            r7.A05(r0)
            throw r4
        L_0x0574:
            r4 = move-exception
            r0 = 0
            r1.A05(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.A00(X.LFi, X.Kfy, androidx.paging.PageFetcherSnapshot, X.4D7):java.lang.Object");
    }

    public static final Object A03(C62448Kfy kfy, PageFetcherSnapshot pageFetcherSnapshot, AnonymousClass4D7 r7, AnonymousClass0r6 r8) {
        AnonymousClass0r6 A002 = C62958KpA.A00(new MHP((AnonymousClass4D7) null, (0sK) new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(kfy, pageFetcherSnapshot, (AnonymousClass4D7) null), r8, 24));
        C66192MHi mHi = new C66192MHi(kfy, (AnonymousClass4D7) null);
        0qQ.A0B(A002, 0);
        return AnonymousClass7TG.A0i(r7, 11M.A00(AnonymousClass05K.A00, new AnonymousClass05E(new MHP((AnonymousClass4D7) null, (0sK) mHi, A002, 22)), -1), new MCn(2, (Object) kfy, (Object) pageFetcherSnapshot));
    }

    private final Object A04(C62448Kfy kfy, LGA lga, int i, int i2) {
        int A022 = DbU.A02(kfy, 0);
        if (A022 == 0) {
            throw AnonymousClass7TE.A0w("Cannot get loadId for loadType: REFRESH");
        } else if (A022 != 1 && A022 != 2) {
            throw AnonymousClass7TE.A1K();
        } else if (i != 0 || (lga.A03.A00(kfy) instanceof C60333Jjc) || i2 >= this.A02.A02) {
            return null;
        } else {
            C62448Kfy kfy2 = C62448Kfy.PREPEND;
            List list = lga.A06;
            if (kfy == kfy2) {
                return ((C60347Jjs) 00k.A0I(list)).A03;
            }
            return ((C60347Jjs) 00k.A0K(list)).A02;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.Jjs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.Jjs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: X.Jjs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: X.Jjs} */
    /* JADX WARNING: type inference failed for: r7v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r4 = r2.A00;
        r2 = r15.A08;
        r1 = r4.A00(X.C62448Kfy.REFRESH, (X.C60347Jjs) r5);
        X.ME0.A00(r15, r5, r8, (java.lang.Object) null, r7);
        r7.A00 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x021b, code lost:
        if (r2.ELH(r1, r7) != r6) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x021d, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x021e, code lost:
        r8.A05((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0228, code lost:
        if (r0 == null) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x022e, code lost:
        if (X.JTO.A1b(2) != true) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0230, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0231, code lost:
        if (r4 == false) goto L_0x02b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0233, code lost:
        X.0qQ.A0B(A06(r9, (X.C62693Kkt) null, (java.lang.Object) null), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x023b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x023c, code lost:
        r11.A05((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x023f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        r1 = r2.A00;
        r4 = new X.C60333Jjc(((X.C60346Jjr) r0).A00);
        r2 = X.C62448Kfy.REFRESH;
        r7.A01 = r5;
        r7.A02 = null;
        r7.A03 = null;
        r7.A04 = null;
        r7.A00 = 9;
        r1 = r1.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0263, code lost:
        if (X.0qQ.A0K(r1.A00(r2), r4) != false) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0265, code lost:
        r1.A02(r4, r2);
        r0 = r15.A08.ELH(new X.C60335Jje(r1.A01(), (X.LP3) null), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0278, code lost:
        r0 = X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x027b, code lost:
        if (r0 != r6) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x027d, code lost:
        if (r0 != r6) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x027f, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0283, code lost:
        r6 = X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0285, code lost:
        r5.A05((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0288, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x028b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0292, code lost:
        if ((r1 instanceof X.C60345Jjq) == false) goto L_0x02b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0296, code lost:
        if (X.C62914KoS.A00 == null) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x029c, code lost:
        if (X.JTO.A1b(2) != true) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x029e, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x029f, code lost:
        if (r4 == false) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02a1, code lost:
        X.0qQ.A0B(A06(X.C62448Kfy.REFRESH, r1, (java.lang.Object) null), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02aa, code lost:
        r15.A07.AG7((java.util.concurrent.CancellationException) null);
        r15.A03.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02b6, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r1 = r5.A00;
        r0 = X.C62448Kfy.REFRESH;
        r7.A01 = r15;
        r7.A02 = r9;
        r7.A03 = null;
        r7.A00 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e6, code lost:
        if (A01(r0, r15, r1, r7) != r6) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ea, code lost:
        r9.A05((java.lang.Object) null);
        r9 = X.C62448Kfy.REFRESH;
        r0 = r15.A02;
        r5 = r0.A00;
        r1 = r0.A03;
        r0 = X.DbU.A02(r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f9, code lost:
        if (r0 == 0) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fb, code lost:
        if (r0 == 1) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fd, code lost:
        if (r0 != 2) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0105, code lost:
        throw X.AnonymousClass7TE.A0w("key cannot be null for append");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0106, code lost:
        r0 = new X.C60344Jjp(r5, (java.lang.Object) null, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010d, code lost:
        if (X.C62914KoS.A00 == null) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010f, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0114, code lost:
        if (X.JTO.A1b(3) == true) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0116, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0117, code lost:
        if (r1 == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0119, code lost:
        r5 = X.AnonymousClass7TE.A1A();
        r5.append("Start REFRESH with loadKey ");
        r5.append((java.lang.Object) null);
        r5.append(" on ");
        X.0qQ.A0B(X.AnonymousClass7TF.A0i(r15.A03, r5), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0133, code lost:
        r1 = r15.A03;
        r7.A01 = r15;
        r7.A02 = null;
        r7.A00 = 3;
        r1 = r1.A04(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x013f, code lost:
        if (r1 != r6) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0141, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0149, code lost:
        r1 = (X.C62693Kkt) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x014d, code lost:
        if ((r1 instanceof X.C60347Jjs) == false) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x014f, code lost:
        r9 = r15.A01;
        r11 = r9.A01;
        X.ME0.A00(r15, r1, r9, r11, r7);
        r7.A00 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015d, code lost:
        if (X.136.A00(r7, r11) == r6) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015f, code lost:
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0163, code lost:
        if ((r1 instanceof X.C60346Jjr) == false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0167, code lost:
        if (X.C62914KoS.A00 == null) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x016d, code lost:
        if (X.JTO.A1b(2) != true) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x016f, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0170, code lost:
        if (r4 == false) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0172, code lost:
        X.0qQ.A0B(A06(X.C62448Kfy.REFRESH, r1, (java.lang.Object) null), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x017b, code lost:
        r2 = r15.A01;
        r5 = r2.A01;
        X.ME0.A00(r15, r1, r2, r5, r7);
        r7.A00 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x018a, code lost:
        if (X.136.A00(r7, r5) == r6) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018c, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a2, code lost:
        if (X.136.A00(r7, r9) == r6) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a4, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a5, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01aa, code lost:
        throw X.AnonymousClass7TE.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01b1, code lost:
        throw X.AnonymousClass7TE.A0w("key cannot be null for prepend");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r0 = r9.A00;
        r9 = X.C62448Kfy.REFRESH;
        r13 = (X.C60347Jjs) r5;
        r14 = r0.A02(r9, r13, 0);
        r12 = r0.A03;
        r12.A02(X.C60332Jjb.A01, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c6, code lost:
        if (r13.A03 != null) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c8, code lost:
        r12.A02(X.C60332Jjb.A00, X.C62448Kfy.PREPEND);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01d1, code lost:
        if (r13.A02 != null) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d3, code lost:
        r12.A02(X.C60332Jjb.A00, X.C62448Kfy.APPEND);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01da, code lost:
        r11.A05((java.lang.Object) null);
        r0 = X.C62914KoS.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01df, code lost:
        if (r14 == false) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e1, code lost:
        if (r0 == null) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01e7, code lost:
        if (X.JTO.A1b(3) != true) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e9, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01ea, code lost:
        if (r4 == false) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ec, code lost:
        X.0qQ.A0B(A06(r9, r5, (java.lang.Object) null), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01f3, code lost:
        r2 = r15.A01;
        r8 = r2.A01;
        X.ME0.A00(r15, r5, r2, r8, r7);
        r7.A00 = 5;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0201, code lost:
        if (X.136.A00(r7, r8) != r6) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0203, code lost:
        return r6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(androidx.paging.PageFetcherSnapshot r15, X.AnonymousClass4D7 r16) {
        /*
            r8 = 2
            r3 = r16
            boolean r0 = X.ME0.A02(r8, r3)
            if (r0 == 0) goto L_0x0029
            r7 = r3
            X.ME0 r7 = (X.ME0) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0029
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0017:
            java.lang.Object r1 = r7.A05
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r10 = 3
            r4 = 0
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto L_0x018f;
                case 1: goto L_0x00c7;
                case 2: goto L_0x00bb;
                case 3: goto L_0x0142;
                case 4: goto L_0x00a6;
                case 5: goto L_0x0091;
                case 6: goto L_0x002f;
                case 7: goto L_0x0038;
                case 8: goto L_0x007c;
                case 9: goto L_0x0076;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0029:
            X.ME0 r7 = new X.ME0
            r7.<init>(r15, r3, r8)
            goto L_0x0017
        L_0x002f:
            java.lang.Object r8 = r7.A03
            X.136 r8 = (X.136) r8
            X.0eS.A00(r1)     // Catch:{ all -> 0x0223 }
            goto L_0x021e
        L_0x0038:
            java.lang.Object r5 = r7.A04
            X.136 r5 = (X.136) r5
            java.lang.Object r4 = r7.A03
            androidx.paging.PageFetcherSnapshotState$Holder r4 = (androidx.paging.PageFetcherSnapshotState$Holder) r4
            java.lang.Object r2 = r7.A02
            X.Kkt r2 = (X.C62693Kkt) r2
            java.lang.Object r0 = r7.A01
            androidx.paging.PageFetcherSnapshot r0 = (androidx.paging.PageFetcherSnapshot) r0
            X.0eS.A00(r1)
            X.LGA r1 = r4.A00     // Catch:{ all -> 0x0071 }
            X.LBn r0 = r0.A00     // Catch:{ all -> 0x0071 }
            X.L8j r0 = r0.A00     // Catch:{ all -> 0x0071 }
            X.Jjz r0 = r0.A00     // Catch:{ all -> 0x0071 }
            r1.A01(r0)     // Catch:{ all -> 0x0071 }
            r5.A05(r3)
            X.Jjs r2 = (X.C60347Jjs) r2
            java.lang.Object r0 = r2.A03
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = "requestLoad"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0066:
            java.lang.Object r0 = r2.A02
            if (r0 != 0) goto L_0x02b4
            java.lang.String r0 = "requestLoad"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0071:
            r0 = move-exception
            r5.A05(r3)
            throw r0
        L_0x0076:
            java.lang.Object r5 = r7.A01
            X.136 r5 = (X.136) r5
            goto L_0x0280
        L_0x007c:
            java.lang.Object r5 = r7.A04
            X.136 r5 = (X.136) r5
            java.lang.Object r2 = r7.A03
            androidx.paging.PageFetcherSnapshotState$Holder r2 = (androidx.paging.PageFetcherSnapshotState$Holder) r2
            java.lang.Object r0 = r7.A02
            X.Kkt r0 = (X.C62693Kkt) r0
            java.lang.Object r15 = r7.A01
            androidx.paging.PageFetcherSnapshot r15 = (androidx.paging.PageFetcherSnapshot) r15
            X.0eS.A00(r1)
            goto L_0x0240
        L_0x0091:
            java.lang.Object r8 = r7.A04
            X.136 r8 = (X.136) r8
            java.lang.Object r2 = r7.A03
            androidx.paging.PageFetcherSnapshotState$Holder r2 = (androidx.paging.PageFetcherSnapshotState$Holder) r2
            java.lang.Object r5 = r7.A02
            X.Kkt r5 = (X.C62693Kkt) r5
            java.lang.Object r15 = r7.A01
            androidx.paging.PageFetcherSnapshot r15 = (androidx.paging.PageFetcherSnapshot) r15
            X.0eS.A00(r1)
            goto L_0x0204
        L_0x00a6:
            java.lang.Object r11 = r7.A04
            X.136 r11 = (X.136) r11
            java.lang.Object r9 = r7.A03
            androidx.paging.PageFetcherSnapshotState$Holder r9 = (androidx.paging.PageFetcherSnapshotState$Holder) r9
            java.lang.Object r5 = r7.A02
            X.Kkt r5 = (X.C62693Kkt) r5
            java.lang.Object r15 = r7.A01
            androidx.paging.PageFetcherSnapshot r15 = (androidx.paging.PageFetcherSnapshot) r15
            X.0eS.A00(r1)
            goto L_0x01b2
        L_0x00bb:
            java.lang.Object r9 = r7.A02
            X.136 r9 = (X.136) r9
            java.lang.Object r15 = r7.A01
            androidx.paging.PageFetcherSnapshot r15 = (androidx.paging.PageFetcherSnapshot) r15
            X.0eS.A00(r1)     // Catch:{ all -> 0x02b7 }
            goto L_0x00ea
        L_0x00c7:
            java.lang.Object r9 = r7.A03
            X.136 r9 = (X.136) r9
            java.lang.Object r5 = r7.A02
            androidx.paging.PageFetcherSnapshotState$Holder r5 = (androidx.paging.PageFetcherSnapshotState$Holder) r5
            java.lang.Object r15 = r7.A01
            androidx.paging.PageFetcherSnapshot r15 = (androidx.paging.PageFetcherSnapshot) r15
            X.0eS.A00(r1)
        L_0x00d6:
            X.LGA r1 = r5.A00     // Catch:{ all -> 0x02b7 }
            X.Kfy r0 = X.C62448Kfy.REFRESH     // Catch:{ all -> 0x02b7 }
            r7.A01 = r15     // Catch:{ all -> 0x02b7 }
            r7.A02 = r9     // Catch:{ all -> 0x02b7 }
            r7.A03 = r3     // Catch:{ all -> 0x02b7 }
            r7.A00 = r8     // Catch:{ all -> 0x02b7 }
            java.lang.Object r0 = A01(r0, r15, r1, r7)     // Catch:{ all -> 0x02b7 }
            if (r0 != r6) goto L_0x00ea
            goto L_0x01a5
        L_0x00ea:
            r9.A05(r3)
            X.Kfy r9 = X.C62448Kfy.REFRESH
            androidx.paging.PagingConfig r0 = r15.A02
            int r5 = r0.A00
            boolean r1 = r0.A03
            int r0 = X.DbU.A02(r9, r4)
            if (r0 == r4) goto L_0x0106
            if (r0 == r2) goto L_0x01ab
            if (r0 != r8) goto L_0x01a6
            java.lang.String r0 = "key cannot be null for append"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0106:
            X.Jjp r0 = new X.Jjp
            r0.<init>(r5, r3, r1)
            X.MPb r1 = X.C62914KoS.A00
            if (r1 == 0) goto L_0x0116
            boolean r5 = X.JTO.A1b(r10)
            r1 = 1
            if (r5 == r2) goto L_0x0117
        L_0x0116:
            r1 = 0
        L_0x0117:
            if (r1 == 0) goto L_0x0133
            java.lang.StringBuilder r5 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "Start REFRESH with loadKey "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = " on "
            r5.append(r1)
            androidx.paging.PagingSource r1 = r15.A03
            java.lang.String r1 = X.AnonymousClass7TF.A0i(r1, r5)
            X.0qQ.A0B(r1, r2)
        L_0x0133:
            androidx.paging.PagingSource r1 = r15.A03
            r7.A01 = r15
            r7.A02 = r3
            r7.A00 = r10
            java.lang.Object r1 = r1.A04(r0, r7)
            if (r1 != r6) goto L_0x0149
            return r6
        L_0x0142:
            java.lang.Object r15 = r7.A01
            androidx.paging.PageFetcherSnapshot r15 = (androidx.paging.PageFetcherSnapshot) r15
            X.0eS.A00(r1)
        L_0x0149:
            X.Kkt r1 = (X.C62693Kkt) r1
            boolean r0 = r1 instanceof X.C60347Jjs
            if (r0 == 0) goto L_0x0161
            androidx.paging.PageFetcherSnapshotState$Holder r9 = r15.A01
            X.136 r11 = r9.A01
            X.ME0.A00(r15, r1, r9, r11, r7)
            r0 = 4
            r7.A00 = r0
            java.lang.Object r0 = X.136.A00(r7, r11)
            if (r0 == r6) goto L_0x01a4
            r5 = r1
            goto L_0x01b2
        L_0x0161:
            boolean r0 = r1 instanceof X.C60346Jjr
            if (r0 == 0) goto L_0x0290
            X.MPb r0 = X.C62914KoS.A00
            if (r0 == 0) goto L_0x0170
            boolean r0 = X.JTO.A1b(r8)
            if (r0 != r2) goto L_0x0170
            r4 = 1
        L_0x0170:
            if (r4 == 0) goto L_0x017b
            X.Kfy r0 = X.C62448Kfy.REFRESH
            java.lang.String r0 = A06(r0, r1, r3)
            X.0qQ.A0B(r0, r2)
        L_0x017b:
            androidx.paging.PageFetcherSnapshotState$Holder r2 = r15.A01
            X.136 r5 = r2.A01
            X.ME0.A00(r15, r1, r2, r5, r7)
            r0 = 8
            r7.A00 = r0
            java.lang.Object r0 = X.136.A00(r7, r5)
            if (r0 == r6) goto L_0x01a4
            r0 = r1
            goto L_0x0240
        L_0x018f:
            X.0eS.A00(r1)
            androidx.paging.PageFetcherSnapshotState$Holder r5 = r15.A01
            X.136 r9 = r5.A01
            r7.A01 = r15
            r7.A02 = r5
            r7.A03 = r9
            r7.A00 = r2
            java.lang.Object r0 = X.136.A00(r7, r9)
            if (r0 != r6) goto L_0x00d6
        L_0x01a4:
            return r6
        L_0x01a5:
            return r6
        L_0x01a6:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01ab:
            java.lang.String r0 = "key cannot be null for prepend"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x01b2:
            X.LGA r0 = r9.A00     // Catch:{ all -> 0x023b }
            X.Kfy r9 = X.C62448Kfy.REFRESH     // Catch:{ all -> 0x023b }
            r13 = r5
            X.Jjs r13 = (X.C60347Jjs) r13     // Catch:{ all -> 0x023b }
            boolean r14 = r0.A02(r9, r13, r4)     // Catch:{ all -> 0x023b }
            X.LGK r12 = r0.A03     // Catch:{ all -> 0x023b }
            X.Jjb r0 = X.C60332Jjb.A01     // Catch:{ all -> 0x023b }
            r12.A02(r0, r9)     // Catch:{ all -> 0x023b }
            java.lang.Object r0 = r13.A03     // Catch:{ all -> 0x023b }
            if (r0 != 0) goto L_0x01cf
            X.Kfy r1 = X.C62448Kfy.PREPEND     // Catch:{ all -> 0x023b }
            X.Jjb r0 = X.C60332Jjb.A00     // Catch:{ all -> 0x023b }
            r12.A02(r0, r1)     // Catch:{ all -> 0x023b }
        L_0x01cf:
            java.lang.Object r0 = r13.A02     // Catch:{ all -> 0x023b }
            if (r0 != 0) goto L_0x01da
            X.Kfy r1 = X.C62448Kfy.APPEND     // Catch:{ all -> 0x023b }
            X.Jjb r0 = X.C60332Jjb.A00     // Catch:{ all -> 0x023b }
            r12.A02(r0, r1)     // Catch:{ all -> 0x023b }
        L_0x01da:
            r11.A05(r3)
            X.MPb r0 = X.C62914KoS.A00
            if (r14 == 0) goto L_0x0228
            if (r0 == 0) goto L_0x01ea
            boolean r0 = X.JTO.A1b(r10)
            if (r0 != r2) goto L_0x01ea
            r4 = 1
        L_0x01ea:
            if (r4 == 0) goto L_0x01f3
            java.lang.String r0 = A06(r9, r5, r3)
            X.0qQ.A0B(r0, r2)
        L_0x01f3:
            androidx.paging.PageFetcherSnapshotState$Holder r2 = r15.A01
            X.136 r8 = r2.A01
            X.ME0.A00(r15, r5, r2, r8, r7)
            r0 = 5
            r7.A00 = r0
            java.lang.Object r0 = X.136.A00(r7, r8)
            if (r0 != r6) goto L_0x0204
            return r6
        L_0x0204:
            X.LGA r4 = r2.A00     // Catch:{ all -> 0x0223 }
            X.3ju r2 = r15.A08     // Catch:{ all -> 0x0223 }
            r1 = r5
            X.Jjs r1 = (X.C60347Jjs) r1     // Catch:{ all -> 0x0223 }
            X.Kfy r0 = X.C62448Kfy.REFRESH     // Catch:{ all -> 0x0223 }
            androidx.paging.PageEvent$Insert r1 = r4.A00(r0, r1)     // Catch:{ all -> 0x0223 }
            X.ME0.A00(r15, r5, r8, r3, r7)     // Catch:{ all -> 0x0223 }
            r0 = 6
            r7.A00 = r0     // Catch:{ all -> 0x0223 }
            java.lang.Object r0 = r2.ELH(r1, r7)     // Catch:{ all -> 0x0223 }
            if (r0 != r6) goto L_0x021e
            return r6
        L_0x021e:
            r8.A05(r3)
            goto L_0x02b4
        L_0x0223:
            r0 = move-exception
            r8.A05(r3)
            throw r0
        L_0x0228:
            if (r0 == 0) goto L_0x0231
            boolean r0 = X.JTO.A1b(r8)
            if (r0 != r2) goto L_0x0231
            r4 = 1
        L_0x0231:
            if (r4 == 0) goto L_0x02b4
            java.lang.String r0 = A06(r9, r3, r3)
            X.0qQ.A0B(r0, r2)
            goto L_0x02b4
        L_0x023b:
            r0 = move-exception
            r11.A05(r3)
            throw r0
        L_0x0240:
            X.LGA r1 = r2.A00     // Catch:{ all -> 0x028b }
            X.Jjr r0 = (X.C60346Jjr) r0     // Catch:{ all -> 0x028b }
            java.lang.Throwable r0 = r0.A00     // Catch:{ all -> 0x028b }
            X.Jjc r4 = new X.Jjc     // Catch:{ all -> 0x028b }
            r4.<init>(r0)     // Catch:{ all -> 0x028b }
            X.Kfy r2 = X.C62448Kfy.REFRESH     // Catch:{ all -> 0x028b }
            r7.A01 = r5     // Catch:{ all -> 0x028b }
            r7.A02 = r3     // Catch:{ all -> 0x028b }
            r7.A03 = r3     // Catch:{ all -> 0x028b }
            r7.A04 = r3     // Catch:{ all -> 0x028b }
            r0 = 9
            r7.A00 = r0     // Catch:{ all -> 0x028b }
            X.LGK r1 = r1.A03     // Catch:{ all -> 0x028b }
            X.KzI r0 = r1.A00(r2)     // Catch:{ all -> 0x028b }
            boolean r0 = X.0qQ.A0K(r0, r4)     // Catch:{ all -> 0x028b }
            if (r0 != 0) goto L_0x0278
            r1.A02(r4, r2)     // Catch:{ all -> 0x028b }
            X.3ju r2 = r15.A08     // Catch:{ all -> 0x028b }
            X.LP3 r1 = r1.A01()     // Catch:{ all -> 0x028b }
            X.Jje r0 = new X.Jje     // Catch:{ all -> 0x028b }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x028b }
            java.lang.Object r0 = r2.ELH(r0, r7)     // Catch:{ all -> 0x028b }
            goto L_0x027b
        L_0x0278:
            X.0gF r0 = X.C60340gF.A00     // Catch:{ all -> 0x028b }
            goto L_0x027d
        L_0x027b:
            if (r0 != r6) goto L_0x0278
        L_0x027d:
            if (r0 != r6) goto L_0x0283
            return r6
        L_0x0280:
            X.0eS.A00(r1)     // Catch:{ all -> 0x0289 }
        L_0x0283:
            X.0gF r6 = X.C60340gF.A00     // Catch:{ all -> 0x0289 }
            r5.A05(r3)
            return r6
        L_0x0289:
            r0 = move-exception
            goto L_0x028c
        L_0x028b:
            r0 = move-exception
        L_0x028c:
            r5.A05(r3)
            throw r0
        L_0x0290:
            boolean r0 = r1 instanceof X.C60345Jjq
            if (r0 == 0) goto L_0x02b4
            X.MPb r0 = X.C62914KoS.A00
            if (r0 == 0) goto L_0x029f
            boolean r0 = X.JTO.A1b(r8)
            if (r0 != r2) goto L_0x029f
            r4 = 1
        L_0x029f:
            if (r4 == 0) goto L_0x02aa
            X.Kfy r0 = X.C62448Kfy.REFRESH
            java.lang.String r0 = A06(r0, r1, r3)
            X.0qQ.A0B(r0, r2)
        L_0x02aa:
            X.19G r0 = r15.A07
            r0.AG7(r3)
            androidx.paging.PagingSource r0 = r15.A03
            r0.A03()
        L_0x02b4:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x02b7:
            r0 = move-exception
            r9.A05(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.A05(androidx.paging.PageFetcherSnapshot, X.4D7):java.lang.Object");
    }

    public static final void A07(PageFetcherSnapshot pageFetcherSnapshot, C262224Cq r5) {
        MHG mhg = new MHG(pageFetcherSnapshot, (AnonymousClass4D7) null, 9);
        19B r2 = 19B.A00;
        1Eo.A05(r2, mhg, r5);
        1Eo.A05(r2, new MHG(pageFetcherSnapshot, (AnonymousClass4D7) null, 10), r5);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A08(X.AnonymousClass4D7 r8) {
        /*
            r7 = this;
            r3 = 4
            boolean r0 = X.MED.A04(r3, r8)
            if (r0 == 0) goto L_0x0031
            r6 = r8
            X.MED r6 = (X.MED) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0031
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r5 = r6.A04
            X.1Hj r4 = X.1Hj.A02
            int r1 = r6.A00
            r3 = 0
            r0 = 1
            if (r1 == 0) goto L_0x003c
            if (r1 != r0) goto L_0x0037
            java.lang.Object r2 = r6.A03
            X.136 r2 = (X.136) r2
            java.lang.Object r1 = r6.A02
            androidx.paging.PageFetcherSnapshotState$Holder r1 = (androidx.paging.PageFetcherSnapshotState$Holder) r1
            java.lang.Object r0 = r6.A01
            androidx.paging.PageFetcherSnapshot r0 = (androidx.paging.PageFetcherSnapshot) r0
            X.0eS.A00(r5)
            goto L_0x004d
        L_0x0031:
            X.MED r6 = new X.MED
            r6.<init>(r7, r8, r3)
            goto L_0x0015
        L_0x0037:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x003c:
            X.0eS.A00(r5)
            androidx.paging.PageFetcherSnapshotState$Holder r1 = r7.A01
            X.136 r2 = r1.A01
            X.MED.A00(r7, r1, r2, r6, r0)
            java.lang.Object r0 = X.136.A00(r6, r2)
            if (r0 == r4) goto L_0x0062
            r0 = r7
        L_0x004d:
            X.LGA r1 = r1.A00     // Catch:{ all -> 0x005d }
            X.LBn r0 = r0.A00     // Catch:{ all -> 0x005d }
            X.L8j r0 = r0.A00     // Catch:{ all -> 0x005d }
            X.Jjz r0 = r0.A00     // Catch:{ all -> 0x005d }
            X.LFt r4 = r1.A01(r0)     // Catch:{ all -> 0x005d }
            r2.A05(r3)
            return r4
        L_0x005d:
            r0 = move-exception
            r2.A05(r3)
            throw r0
        L_0x0062:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.A08(X.4D7):java.lang.Object");
    }

    public static final Object A01(C62448Kfy kfy, PageFetcherSnapshot pageFetcherSnapshot, LGA lga, AnonymousClass4D7 r6) {
        LGK lgk = lga.A03;
        C63569KzI A002 = lgk.A00(kfy);
        C60334Jjd jjd = C60334Jjd.A00;
        if (!0qQ.A0K(A002, jjd)) {
            lgk.A02(jjd, kfy);
            Object ELH = pageFetcherSnapshot.A08.ELH(new C60335Jje(lgk.A01(), (LP3) null), r6);
            if (ELH == 1Hj.A02) {
                return ELH;
            }
        }
        return C60340gF.A00;
    }

    public static final String A06(C62448Kfy kfy, C62693Kkt kkt, Object obj) {
        StringBuilder A0n = AnonymousClass7TF.A0n("End ");
        if (kkt == null) {
            A0n.append(kfy);
            A0n.append(" with loadkey ");
            A0n.append(obj);
            A0n.append(". Load CANCELLED.");
        } else {
            A0n.append(kfy);
            A0n.append(" with loadKey ");
            A0n.append(obj);
            A0n.append(". Returned ");
            A0n.append(kkt);
        }
        return A0n.toString();
    }

    public PageFetcherSnapshot(PagingConfig pagingConfig, PagingSource pagingSource, C63967LFt lFt, C62320sa r9, AnonymousClass0r6 r10) {
        C51974G9v.A1M(pagingSource, pagingConfig, r10);
        this.A03 = pagingSource;
        this.A02 = pagingConfig;
        this.A0A = r10;
        this.A04 = lFt;
        this.A06 = r9;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = 1HR.A05;
        AnonymousClass3FN r0 = C249513ju.A00;
        this.A08 = JTO.A1G(AnonymousClass3FN.A00);
        this.A01 = new PageFetcherSnapshotState$Holder(pagingConfig);
        AnonymousClass19G r3 = new AnonymousClass19G((C262204Co) null);
        this.A07 = r3;
        this.A09 = new C62170rn(new MHG(this, (AnonymousClass4D7) null, 8), C62958KpA.A00(new MHP((Object) new C59703JUk(this, (AnonymousClass4D7) null), (Object) r3, (AnonymousClass4D7) null, 21)));
    }

    public static final Object A02(C62448Kfy kfy, PageFetcherSnapshot pageFetcherSnapshot, C64124LOv lOv, AnonymousClass4D7 r8) {
        if (kfy.ordinal() == 0) {
            Object A052 = A05(pageFetcherSnapshot, r8);
            if (A052 == 1Hj.A02) {
                return A052;
            }
        } else if (lOv != null) {
            C63906LBn lBn = pageFetcherSnapshot.A00;
            if (kfy == C62448Kfy.PREPEND || kfy == C62448Kfy.APPEND) {
                C63828L8j l8j = lBn.A00;
                JGF jgf = new JGF(9, kfy, lOv);
                ReentrantLock reentrantLock = l8j.A03;
                reentrantLock.lock();
                try {
                    jgf.invoke(l8j.A02, l8j.A01);
                } finally {
                    reentrantLock.unlock();
                }
            } else {
                throw C51973G9u.A0g(kfy, "invalid load type for reset: ", AnonymousClass7TE.A1A());
            }
        } else {
            throw AnonymousClass7TE.A0z("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        }
        return C60340gF.A00;
    }
}
