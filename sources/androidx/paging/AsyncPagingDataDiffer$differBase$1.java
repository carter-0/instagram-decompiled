package androidx.paging;

import X.0V2;
import X.0qQ;
import X.10D;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.C13347TVu;
import X.C262094Cc;
import X.C63958LFe;
import X.C64332La7;
import X.LQS;
import X.MPY;
import X.MRP;
import X.MTH;
import java.util.concurrent.CopyOnWriteArrayList;

public final class AsyncPagingDataDiffer$differBase$1 {
    public MRP A00;
    public C64332La7 A01;
    public MTH A02;
    public final MPY A03;
    public final LQS A04;
    public final C63958LFe A05 = new C63958LFe(this);
    public final SingleRunner A06 = new SingleRunner(true);
    public final CopyOnWriteArrayList A07 = new CopyOnWriteArrayList();
    public final C262094Cc A08;
    public final 0V2 A09;
    public final AnonymousClass0Ud A0A;
    public volatile int A0B;
    public volatile boolean A0C;
    public final /* synthetic */ AsyncPagingDataDiffer A0D;

    public AsyncPagingDataDiffer$differBase$1(AsyncPagingDataDiffer asyncPagingDataDiffer, MPY mpy, C262094Cc r7) {
        this.A0D = asyncPagingDataDiffer;
        this.A03 = mpy;
        this.A08 = r7;
        C64332La7 la7 = C64332La7.A04;
        0qQ.A0C(la7, "null cannot be cast to non-null type androidx.paging.PagePresenter<T of androidx.paging.PagePresenter.Companion.initial>");
        this.A01 = la7;
        LQS lqs = new LQS();
        this.A04 = lqs;
        this.A0A = lqs.A02;
        this.A09 = 10D.A01(AnonymousClass05K.A01, 0, 64);
        this.A07.add(new C13347TVu((Object) this, 19));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: X.LP3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: X.LP3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.0r1} */
    /* JADX WARNING: type inference failed for: r18v2, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(androidx.paging.AsyncPagingDataDiffer$differBase$1 r15, X.MRP r16, X.LP3 r17, X.LP3 r18, java.util.List r19, X.AnonymousClass4D7 r20, int r21, int r22, boolean r23) {
        /*
            r8 = r17
            r3 = r18
            r10 = r23
            r9 = 0
            r4 = r20
            boolean r0 = X.ME2.A02(r9, r4)
            if (r0 == 0) goto L_0x00d4
            r11 = r4
            X.ME2 r11 = (X.ME2) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d4
            int r2 = r2 - r1
            r11.A00 = r2
        L_0x001d:
            java.lang.Object r7 = r11.A06
            X.1Hj r6 = X.1Hj.A02
            int r0 = r11.A00
            r4 = 1
            if (r0 == 0) goto L_0x0083
            if (r0 != r4) goto L_0x00e2
            boolean r10 = r11.A08
            java.lang.Object r2 = r11.A05
            X.0r1 r2 = (X.0r1) r2
            java.lang.Object r5 = r11.A04
            X.La7 r5 = (X.C64332La7) r5
            java.lang.Object r3 = r11.A03
            java.lang.Object r8 = r11.A02
            java.lang.Object r15 = r11.A01
            androidx.paging.AsyncPagingDataDiffer$differBase$1 r15 = (androidx.paging.AsyncPagingDataDiffer$differBase$1) r15
            X.0eS.A00(r7)
        L_0x003d:
            java.lang.Number r7 = (java.lang.Number) r7
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x00db
            if (r10 == 0) goto L_0x0057
            X.0qQ.A0A(r8)
            X.0qQ.A0B(r8, r9)
            X.LQS r2 = r15.A04
            r1 = 16
            X.Iwy r0 = new X.Iwy
            r0.<init>(r1, r3, r2, r8)
            X.LQS.A01(r2, r0)
        L_0x0057:
            if (r7 != 0) goto L_0x0074
            X.MRP r4 = r15.A00
            if (r4 == 0) goto L_0x0071
            int r0 = r5.A02
            int r3 = r0 / 2
            int r2 = X.C64332La7.A00(r5)
            int r1 = X.C64332La7.A01(r5)
            X.Jjy r0 = new X.Jjy
            r0.<init>(r3, r3, r2, r1)
        L_0x006e:
            r4.A78(r0)
        L_0x0071:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x0074:
            int r0 = r7.intValue()
            r15.A0B = r0
            X.MRP r4 = r15.A00
            if (r4 == 0) goto L_0x0071
            X.Jjz r0 = r5.A02(r0)
            goto L_0x006e
        L_0x0083:
            X.0eS.A00(r7)
            if (r23 == 0) goto L_0x0091
            if (r17 != 0) goto L_0x0091
            java.lang.String r0 = "Cannot dispatch LoadStates in PagingDataDiffer without source LoadStates set."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0091:
            r15.A0C = r9
            X.La7 r5 = new X.La7
            r13 = r19
            r7 = r22
            r12 = r21
            r5.<init>(r13, r12, r7)
            X.0r1 r2 = new X.0r1
            r2.<init>()
            X.La7 r1 = r15.A01
            int r0 = r15.A0B
            X.MJM r14 = new X.MJM
            r23 = r7
            r22 = r12
            r21 = r2
            r20 = r13
            r19 = r5
            r18 = r8
            r17 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.ME2.A00(r15, r8, r3, r5, r11)
            r11.A05 = r2
            r11.A08 = r10
            r11.A00 = r4
            r17 = r5
            r18 = r11
            r19 = r14
            r20 = r0
            r16 = r1
            java.lang.Object r7 = r15.A01(r16, r17, r18, r19, r20)
            if (r7 != r6) goto L_0x003d
            return r6
        L_0x00d4:
            X.ME2 r11 = new X.ME2
            r11.<init>(r15, r4, r9)
            goto L_0x001d
        L_0x00db:
            java.lang.String r0 = "Missing call to onListPresentable after new list was presented. If you are seeing\n this exception, it is generally an indication of an issue with Paging.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00e2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.AsyncPagingDataDiffer$differBase$1.A00(androidx.paging.AsyncPagingDataDiffer$differBase$1, X.MRP, X.LP3, X.LP3, java.util.List, X.4D7, int, int, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4D7, X.MDN] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C22558YAp r14, X.C22558YAp r15, X.AnonymousClass4D7 r16, X.C62320sa r17, int r18) {
        /*
            r13 = this;
            r1 = r17
            r8 = r14
            r9 = r15
            r6 = r18
            r2 = 0
            r7 = r16
            boolean r0 = r7 instanceof X.MDN
            if (r0 == 0) goto L_0x00b5
            r5 = r7
            X.MDN r5 = (X.MDN) r5
            int r0 = r5.A07
            if (r0 != r2) goto L_0x00b5
            int r4 = r5.A01
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r3
            if (r0 == 0) goto L_0x00b5
            int r4 = r4 - r3
            r5.A01 = r4
        L_0x001f:
            java.lang.Object r7 = r5.A06
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A01
            r3 = 1
            r11 = 0
            if (r0 == 0) goto L_0x0057
            if (r0 != r3) goto L_0x00bc
            int r6 = r5.A00
            java.lang.Object r1 = r5.A05
            X.0sa r1 = (X.C62320sa) r1
            java.lang.Object r9 = r5.A04
            X.YAp r9 = (X.C22558YAp) r9
            java.lang.Object r8 = r5.A03
            X.YAp r8 = (X.C22558YAp) r8
            java.lang.Object r0 = r5.A02
            androidx.paging.AsyncPagingDataDiffer$differBase$1 r0 = (androidx.paging.AsyncPagingDataDiffer$differBase$1) r0
            X.0eS.A00(r7)
        L_0x0040:
            X.XZo r7 = (X.C21381XZo) r7
            r1.invoke()
            androidx.paging.AsyncPagingDataDiffer r1 = r0.A0D
            androidx.paging.AsyncPagingDataDiffer r0 = androidx.paging.AsyncPagingDataDiffer.$redex_init_class
            X.2rh r0 = r1.A04
            X.C21991XpE.A02(r7, r8, r9, r0)
            int r0 = X.C21991XpE.A00(r7, r8, r9, r6)
            java.lang.Integer r11 = X.JTO.A0w(r0)
        L_0x0056:
            return r11
        L_0x0057:
            X.0eS.A00(r7)
            int r0 = r14.getSize()
            if (r0 != 0) goto L_0x0077
            r1.invoke()
            androidx.paging.AsyncPagingDataDiffer r0 = r13.A0D
            X.MPY r0 = r0.A02
            int r1 = r15.getSize()
            X.La4 r0 = (X.C64329La4) r0
            if (r1 <= 0) goto L_0x0056
            androidx.paging.AsyncPagingDataDiffer r0 = r0.A00
            X.2rh r0 = r0.A04
            r0.DKr(r2, r1)
            return r11
        L_0x0077:
            int r0 = r15.getSize()
            if (r0 != 0) goto L_0x0094
            r1.invoke()
            androidx.paging.AsyncPagingDataDiffer r0 = r13.A0D
            X.MPY r0 = r0.A02
            int r1 = r14.getSize()
            X.La4 r0 = (X.C64329La4) r0
            if (r1 <= 0) goto L_0x0056
            androidx.paging.AsyncPagingDataDiffer r0 = r0.A00
            X.2rh r0 = r0.A04
            r0.Ddf(r2, r1)
            return r11
        L_0x0094:
            androidx.paging.AsyncPagingDataDiffer r10 = r13.A0D
            androidx.paging.AsyncPagingDataDiffer r0 = androidx.paging.AsyncPagingDataDiffer.$redex_init_class
            X.4Cc r0 = r10.A06
            r12 = 2
            X.JZr r7 = new X.JZr
            r7.<init>(r8, r9, r10, r11, r12)
            r5.A02 = r13
            r5.A03 = r14
            r5.A04 = r15
            r5.A05 = r1
            r5.A00 = r6
            r5.A01 = r3
            java.lang.Object r7 = X.1Eo.A00(r5, r0, r7)
            if (r7 != r4) goto L_0x00b3
            return r4
        L_0x00b3:
            r0 = r13
            goto L_0x0040
        L_0x00b5:
            X.MDN r5 = new X.MDN
            r5.<init>(r13, r7, r2)
            goto L_0x001f
        L_0x00bc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.AsyncPagingDataDiffer$differBase$1.A01(X.YAp, X.YAp, X.4D7, X.0sa, int):java.lang.Object");
    }
}
