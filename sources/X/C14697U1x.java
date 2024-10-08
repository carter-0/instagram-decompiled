package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.U1x  reason: case insensitive filesystem */
public final class C14697U1x extends Handler {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14697U1x(Looper looper, Object obj, int i) {
        super(looper);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r10v3, types: [X.Ttm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r16v10, types: [X.Ttm] */
    /* JADX WARNING: type inference failed for: r16v11, types: [X.Ttt] */
    /* JADX WARNING: type inference failed for: r10v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x041e, code lost:
        if (r1 >= r4.size()) goto L_0x0420;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x024f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r24) {
        /*
            r23 = this;
            r4 = r23
            int r0 = r4.A00
            r7 = r24
            switch(r0) {
                case 0: goto L_0x074a;
                case 1: goto L_0x0770;
                case 2: goto L_0x0767;
                case 3: goto L_0x0626;
                case 4: goto L_0x0601;
                case 5: goto L_0x042a;
                case 6: goto L_0x033a;
                case 7: goto L_0x00e4;
                case 8: goto L_0x0094;
                case 9: goto L_0x005a;
                case 10: goto L_0x0017;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r2 = r4.A01
            X.MnP r2 = (X.C67408MnP) r2
            X.MnT r0 = r2.A0A
            r1 = 1
            r0.A00 = r1
            X.MnN r0 = r2.A0B
            r0.A00 = r1
        L_0x0016:
            return
        L_0x0017:
            r5 = 0
            X.0qQ.A0B(r7, r5)
            java.lang.Object r3 = r4.A01
            X.TqY r3 = (X.C14138TqY) r3
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x0016
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L_0x0016
            int r1 = r7.what
            r2 = 1
            if (r1 != r2) goto L_0x0051
            java.lang.Object r1 = r7.obj
            X.DbS.A1Y(r1)
            java.lang.String r1 = (java.lang.String) r1
            X.ULg r0 = r3.A01
            java.lang.String r0 = r0.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0016
            X.C14138TqY.A0C(r3, r5)
            X.C14138TqY.A0B(r3, r1)
            X.TxA r0 = r3.A0F()
            X.Trz r0 = r0.A01
            r0.A04 = r2
            r0.A00()
            return
        L_0x0051:
            r0 = 2
            if (r1 != r0) goto L_0x0016
            X.ULg r0 = r3.A01
            X.C14138TqY.A08(r0, r3)
            return
        L_0x005a:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            int r1 = r7.what
            r0 = 1
            if (r1 != r0) goto L_0x007d
            java.lang.Object r2 = r4.A01
            X.Ts1 r2 = (X.C14221Ts1) r2
        L_0x0067:
            java.util.Deque r1 = r2.A07
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0016
            java.lang.Object r1 = r1.removeFirst()
            X.ULg r1 = (X.C15050ULg) r1
            X.7fx r0 = r2.A00
            if (r0 == 0) goto L_0x0067
            X.C14221Ts1.A00(r1, r2)
            goto L_0x0067
        L_0x007d:
            r0 = 2
            if (r1 != r0) goto L_0x008a
            java.lang.Object r1 = r4.A01
            X.Ts1 r1 = (X.C14221Ts1) r1
            java.lang.String r0 = "fbsearch/ig_typeahead/"
        L_0x0086:
            X.C14221Ts1.A01(r1, r0)
            return
        L_0x008a:
            r0 = 3
            if (r1 != r0) goto L_0x0016
            java.lang.Object r1 = r4.A01
            X.Ts1 r1 = (X.C14221Ts1) r1
            java.lang.String r0 = "fbsearch/keyword_typeahead/"
            goto L_0x0086
        L_0x0094:
            java.lang.Object r3 = r4.A01
            X.VbI r3 = (X.C17626VbI) r3
            java.util.Deque r2 = r3.A06
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0016
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x00d8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00a9:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00c2
            int r1 = r9.size()
            r0 = 20
            if (r1 > r0) goto L_0x00c2
            java.lang.Object r0 = r2.removeFirst()
            X.0qQ.A07(r0)
            r9.add(r0)
            goto L_0x00a9
        L_0x00c2:
            X.Vko r4 = r3.A05
            com.instagram.common.session.UserSession r5 = r3.A02
            X.4D6 r6 = r3.A03
            X.Vhn r7 = r3.A04
            X.VN6 r8 = new X.VN6
            r8.<init>(r3)
            r4.A01(r5, r6, r7, r8, r9)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0016
        L_0x00d8:
            android.os.Handler r3 = r3.A01
            r2 = 0
            r3.removeMessages(r2)
            r0 = 50
            r3.sendEmptyMessageDelayed(r2, r0)
            return
        L_0x00e4:
            r5 = 0
            X.0qQ.A0B(r7, r5)
            int r0 = r7.what
            if (r0 != 0) goto L_0x0016
            java.lang.Object r4 = r4.A01
            X.WES r4 = (X.WES) r4
            X.WWE r3 = r4.A05
            X.Ttm r2 = r3.A00
            boolean r0 = r2.A0G()
            if (r0 == 0) goto L_0x01fb
            X.1Xj r7 = r2.A07()
            if (r7 == 0) goto L_0x01fb
            r6 = 0
            java.util.Map r3 = r4.A08
            java.util.Iterator r5 = X.DbV.A16(r3)
        L_0x0107:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01f8
            java.lang.Object r1 = r5.next()
            X.5qt r1 = (X.C296935qt) r1
            X.Ttn r0 = r4.A03
            X.Ttp r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0107
            X.1Xj r0 = r0.A01
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0107
        L_0x0123:
            r8 = 0
            if (r1 != 0) goto L_0x013f
            java.lang.String r0 = "context_switch"
        L_0x0128:
            X.1Xj r1 = r2.A07()
            if (r1 == 0) goto L_0x0016
            r2.A0C(r0, r8)
            int r2 = r2.A00
            X.XAZ r0 = r4.A04
            X.3W1 r1 = r0.BQr(r1)
            int r0 = r1.A03
            r1.A0E(r2, r0)
            return
        L_0x013f:
            java.lang.Object r7 = r3.get(r1)
            X.VVf r7 = (X.C17426VVf) r7
            r8 = 1
            if (r7 == 0) goto L_0x0151
            float r1 = r7.A00
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x01f4
        L_0x0151:
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x0016
            if (r7 == 0) goto L_0x0016
            float r1 = r7.A00
            r0 = 1061158912(0x3f400000, float:0.75)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0016
            java.util.Set r3 = r3.entrySet()
            X.2xe r0 = r4.A06
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = r0.A02
            if (r1 != r0) goto L_0x01ca
            r5 = 1
            java.util.Comparator r0 = X.WES.A0E
        L_0x016e:
            java.util.List r0 = X.00k.A0g(r3, r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0176:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01c8
            java.lang.Object r6 = r3.next()
            r0 = r6
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            X.VVf r0 = (X.C17426VVf) r0
            int r1 = r0.A02
            int r0 = r7.A02
            if (r5 == 0) goto L_0x01c5
            if (r1 <= r0) goto L_0x0176
        L_0x0191:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            if (r6 == 0) goto L_0x0016
            r0 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r3, r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x01b4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ce
            int r0 = X.AnonymousClass7TG.A0F(r1)
            if (r5 != 0) goto L_0x01c1
            int r0 = -r0
        L_0x01c1:
            X.AnonymousClass7TF.A1M(r3, r0)
            goto L_0x01b4
        L_0x01c5:
            if (r1 >= r0) goto L_0x0176
            goto L_0x0191
        L_0x01c8:
            r6 = 0
            goto L_0x0191
        L_0x01ca:
            r5 = 0
            java.util.Comparator r0 = X.WES.A0F
            goto L_0x016e
        L_0x01ce:
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x01d9
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x01d9
            return
        L_0x01d9:
            java.util.Iterator r5 = r3.iterator()
        L_0x01dd:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0016
            int r3 = X.AnonymousClass7TG.A0F(r5)
            java.lang.Object r0 = r6.getValue()
            X.VVf r0 = (X.C17426VVf) r0
            int r1 = r0.A02
            int r0 = r7.A02
            int r0 = r0 + r3
            if (r1 != r0) goto L_0x01dd
        L_0x01f4:
            java.lang.String r0 = "scroll"
            goto L_0x0128
        L_0x01f8:
            r1 = r6
            goto L_0x0123
        L_0x01fb:
            boolean r0 = r2.A0F()
            if (r0 == 0) goto L_0x0016
            boolean r0 = r4.A0A
            if (r0 == 0) goto L_0x0016
            androidx.fragment.app.Fragment r0 = r4.A01
            r19 = r0
            boolean r0 = r19.isResumed()
            if (r0 == 0) goto L_0x0016
            com.instagram.common.session.UserSession r0 = r4.A02
            r18 = r0
            X.3OF r0 = X.AnonymousClass3OE.A00(r18)
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0016
            java.util.Map r7 = r4.A08
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0016
            java.util.List r8 = r4.A07
            r8.clear()
            java.util.Set r0 = r7.entrySet()
            r8.addAll(r0)
            boolean r6 = r4.A0B
            if (r6 == 0) goto L_0x0336
            X.2xe r0 = r4.A06
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = r0.A02
            if (r1 == r0) goto L_0x0336
            java.util.Comparator r0 = X.WES.A0F
        L_0x023f:
            X.01V.A1D(r8, r0)
            java.util.Iterator r17 = r8.iterator()
            r16 = 0
            r8 = 0
        L_0x0249:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0016
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r17)
            java.lang.Object r1 = r0.getKey()
            X.5qt r1 = (X.C296935qt) r1
            java.lang.Object r0 = r0.getValue()
            X.VVf r0 = (X.C17426VVf) r0
            float r9 = r0.A00
            r0 = 1048576000(0x3e800000, float:0.25)
            if (r6 == 0) goto L_0x0267
            r0 = 1061158912(0x3f400000, float:0.75)
        L_0x0267:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0249
            if (r16 != 0) goto L_0x02a0
            X.Ttn r0 = r4.A03
            X.Ttp r9 = r0.A02(r1)
            X.X7p r11 = r0.A01(r1)
            r16 = 0
            if (r9 == 0) goto L_0x029e
            if (r11 == 0) goto L_0x029e
            boolean r0 = r9.A03
            if (r0 == 0) goto L_0x029e
            X.1Xj r12 = r9.A01
            X.XAZ r0 = r4.A04
            int r13 = r0.CEA(r9)
            X.3W1 r0 = r0.BQr(r12)
            int r14 = r0.A01()
            X.Tto r10 = r9.A00
            r15 = 1
            X.TuM r9 = new X.TuM
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r2.A0B(r9)
            r16 = 1
        L_0x029e:
            if (r16 == 0) goto L_0x0249
        L_0x02a0:
            r9 = 1
            if (r8 >= r9) goto L_0x0016
            java.lang.Object r0 = r7.get(r1)
            X.VVf r0 = (X.C17426VVf) r0
            if (r0 == 0) goto L_0x02e3
            int r8 = r0.A02
            r11 = -1
            if (r8 == r11) goto L_0x02e3
            float r1 = r0.A00
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x02e3
            java.util.Map r0 = r4.A09
            int r0 = r0.size()
            if (r0 >= r9) goto L_0x02e3
            X.2xe r0 = r4.A06
            java.lang.Integer r12 = r0.A01
            int r0 = r4.A00
            if (r0 == r8) goto L_0x02e3
            X.XAZ r10 = r4.A04
            int r0 = r10.getCount()
            if (r8 < r0) goto L_0x031f
            X.2HY r1 = X.2HY.A00
        L_0x02d2:
            int r15 = r1.A00
            int r14 = r1.A01
            int r13 = r1.A02
            if (r13 <= 0) goto L_0x02e6
            if (r15 <= r14) goto L_0x02ea
        L_0x02dc:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r12 != r0) goto L_0x02e3
            r10.getCount()
        L_0x02e3:
            r8 = 1
            goto L_0x0249
        L_0x02e6:
            if (r13 >= 0) goto L_0x02dc
            if (r14 > r15) goto L_0x02dc
        L_0x02ea:
            X.Ttp r1 = r10.CE9(r15)
            android.content.Context r11 = r19.getContext()
            if (r1 == 0) goto L_0x031b
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x031b
            if (r11 == 0) goto L_0x031b
            X.1Xj r1 = r1.A01
            boolean r0 = r3.CcR(r1)
            if (r0 != 0) goto L_0x02e3
            r4.A00 = r8
            X.3WR r10 = r1.CEL()
            java.lang.String r8 = "explore"
            X.4U8 r1 = new X.4U8
            r0 = r18
            r1.<init>(r11, r0, r10, r8)
            r1.A04 = r9
            X.4U9 r0 = r1.A00()
            X.AnonymousClass4UA.A00(r0)
            goto L_0x02e3
        L_0x031b:
            if (r15 == r14) goto L_0x02dc
            int r15 = r15 + r13
            goto L_0x02ea
        L_0x031f:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r12 != r0) goto L_0x032e
            int r1 = r8 + 1
            int r0 = r10.getCount()
            X.2HY r1 = X.C229632nm.A0C(r1, r0)
            goto L_0x02d2
        L_0x032e:
            int r0 = r8 + -1
            X.2HZ r1 = new X.2HZ
            r1.<init>(r0, r5, r11)
            goto L_0x02d2
        L_0x0336:
            java.util.Comparator r0 = X.WES.A0E
            goto L_0x023f
        L_0x033a:
            r5 = 0
            X.0qQ.A0B(r7, r5)
            int r0 = r7.what
            if (r0 != 0) goto L_0x03db
            java.lang.Object r3 = r4.A01
            X.WET r3 = (X.WET) r3
            X.WWE r0 = r3.A08
            X.Ttm r4 = r0.A00
            boolean r0 = r4.A0G()
            if (r0 == 0) goto L_0x039b
            X.1Xj r6 = r4.A07()
            if (r6 == 0) goto L_0x039b
            java.util.Map r5 = r3.A0B
            java.util.Iterator r2 = X.DbV.A16(r5)
        L_0x035c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0398
            java.lang.Object r1 = r2.next()
            X.5qt r1 = (X.C296935qt) r1
            X.Ttn r0 = r3.A06
            X.Ttp r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x035c
            X.1Xj r0 = r0.A01
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x035c
            if (r1 == 0) goto L_0x0398
            java.lang.Object r0 = r5.get(r1)
            X.VVe r0 = (X.C17425VVe) r0
            if (r0 == 0) goto L_0x0016
            float r1 = r0.A00
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0016
            java.lang.String r1 = "scroll"
        L_0x038d:
            X.1Xj r0 = r4.A07()
            if (r0 == 0) goto L_0x0016
            r0 = 1
            r4.A0C(r1, r0)
            return
        L_0x0398:
            java.lang.String r1 = "context_switch"
            goto L_0x038d
        L_0x039b:
            boolean r0 = r4.A0F()
            if (r0 == 0) goto L_0x0016
            boolean r0 = r3.A0D
            if (r0 == 0) goto L_0x0016
            androidx.fragment.app.Fragment r0 = r3.A04
            boolean r0 = r0.isResumed()
            if (r0 == 0) goto L_0x0016
            com.instagram.common.session.UserSession r0 = r3.A05
            X.3OF r0 = X.AnonymousClass3OE.A00(r0)
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0016
            r3.A01 = r5
            r0 = 0
            r3.A02 = r0
            java.util.Map r2 = r3.A0B
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x03d7
            java.util.List r1 = r3.A0A
            r1.clear()
            java.util.Set r0 = r2.entrySet()
            r1.addAll(r0)
            java.util.Comparator r0 = X.WET.A0F
            X.01V.A1D(r1, r0)
        L_0x03d7:
            X.WET.A00(r3, r5)
            return
        L_0x03db:
            r2 = 1
            if (r0 != r2) goto L_0x0016
            java.lang.Object r5 = r4.A01
            X.WET r5 = (X.WET) r5
            X.WWE r0 = r5.A08
            X.Ttm r1 = r0.A00
            boolean r0 = r1.A0G()
            if (r0 == 0) goto L_0x03f7
            X.1Xj r0 = r1.A07()
            if (r0 == 0) goto L_0x03f7
            java.lang.String r0 = "finished"
            r1.A0C(r0, r2)
        L_0x03f7:
            X.5qt r0 = r5.A02
            if (r0 == 0) goto L_0x0420
            java.util.List r4 = r5.A0A
            int r3 = r4.size()
            r2 = 0
        L_0x0402:
            if (r2 >= r3) goto L_0x0428
            java.lang.Object r0 = X.00k.A0O(r4, r2)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto L_0x0425
            java.lang.Object r1 = r0.getKey()
            X.5qt r0 = r5.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0425
            int r1 = r2 + 1
        L_0x041a:
            int r0 = r4.size()
            if (r1 < r0) goto L_0x0421
        L_0x0420:
            r1 = 0
        L_0x0421:
            X.WET.A00(r5, r1)
            return
        L_0x0425:
            int r2 = r2 + 1
            goto L_0x0402
        L_0x0428:
            r1 = -1
            goto L_0x041a
        L_0x042a:
            r5 = 0
            X.0qQ.A0B(r7, r5)
            int r0 = r7.what
            if (r0 != 0) goto L_0x0016
            java.lang.Object r4 = r4.A01
            X.Ttr r4 = (X.C14317Ttr) r4
            java.util.List r1 = r4.A06
            r1.clear()
            java.util.Map r0 = r4.A07
            java.util.Set r0 = r0.entrySet()
            r1.addAll(r0)
            java.util.Comparator r0 = X.C14317Ttr.A0D
            X.01V.A1D(r1, r0)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x04bf
            androidx.fragment.app.Fragment r0 = r4.A00
            boolean r0 = r0.isResumed()
            if (r0 == 0) goto L_0x04bf
            com.instagram.common.session.UserSession r0 = r4.A01
            X.3OF r0 = X.AnonymousClass3OE.A00(r0)
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x04bf
            java.util.Iterator r6 = r1.iterator()
        L_0x046a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x04bf
            java.lang.Object r3 = X.C13991Tnr.A0Y(r6)
            X.5qt r3 = (X.C296935qt) r3
            X.Ttn r0 = r4.A02
            X.Ttp r1 = r0.A02(r3)
            X.X7p r9 = r0.A01(r3)
            if (r1 == 0) goto L_0x046a
            if (r9 == 0) goto L_0x046a
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x046a
            X.1Xj r10 = r1.A01
            X.XAZ r0 = r4.A03
            int r11 = r0.CEA(r1)
            X.3W1 r0 = r0.BQr(r10)
            int r12 = r0.A01()
            X.Tto r8 = r1.A00
            boolean r0 = r4 instanceof X.C14316Ttq
            if (r0 == 0) goto L_0x04bd
            r0 = r4
            X.Ttq r0 = (X.C14316Ttq) r0
            java.util.Map r0 = r0.A00
            java.lang.Object r0 = r0.get(r10)
            X.TuK r0 = (X.C14337TuK) r0
            if (r0 == 0) goto L_0x04bd
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x04b1:
            r13 = 1
            X.TuM r7 = new X.TuM
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r7.A06 = r0
            r2.put(r10, r7)
            goto L_0x046a
        L_0x04bd:
            r0 = 0
            goto L_0x04b1
        L_0x04bf:
            X.Ttx r8 = r4.A04
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Map r6 = r8.A08
            java.util.Set r0 = r6.keySet()
            r1.addAll(r0)
            java.util.Iterator r9 = r1.iterator()
        L_0x04d8:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x04f7
            X.1Xj r3 = X.C51966G9m.A0t(r9)
            java.util.Set r0 = r2.keySet()
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x04d8
            r1 = 1
            java.lang.String r0 = "scroll"
            int r0 = r8.EyN(r3, r0, r1)
            X.C66581MXm.A1S(r3, r7, r0)
            goto L_0x04d8
        L_0x04f7:
            java.util.Iterator r15 = X.AnonymousClass7TF.A0t(r2)
        L_0x04fb:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x05dd
            java.lang.Object r9 = r15.next()
            X.TuM r9 = (X.C14339TuM) r9
            X.0qQ.A0B(r9, r5)
            java.lang.Object r12 = r9.A03
            boolean r0 = r6.containsKey(r12)
            if (r0 == 0) goto L_0x054a
            java.lang.Object r3 = r6.get(r12)
            X.Ttm r3 = (X.C14312Ttm) r3
            if (r3 == 0) goto L_0x04fb
            boolean r0 = r8 instanceof X.C14393TvM
            if (r0 == 0) goto L_0x04fb
            X.1Xj r12 = (X.1Xj) r12
            boolean r0 = r3.A0I(r12)
            r14 = 1
            r13 = r0 ^ 1
            long r10 = java.lang.System.currentTimeMillis()
            long r0 = r3.A01
            long r10 = r10 - r0
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0535
            r14 = 0
        L_0x0535:
            if (r13 == 0) goto L_0x04fb
            if (r14 == 0) goto L_0x04fb
            java.lang.String r1 = "ignoringStartVideoSinceVideoIsPlaying: restarting video "
            java.lang.String r0 = X.C51971G9r.A0s(r12)
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.0qQ.A0B(r0, r5)
            r3.A0B(r9)
            goto L_0x04fb
        L_0x054a:
            java.util.PriorityQueue r1 = r8.A09
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x055b
            java.lang.Object r10 = r1.poll()
            X.Ttm r10 = (X.C14312Ttm) r10
            if (r10 != 0) goto L_0x0581
            goto L_0x04fb
        L_0x055b:
            boolean r0 = r8 instanceof X.C14393TvM
            if (r0 == 0) goto L_0x05b9
            r0 = r8
            X.TvM r0 = (X.C14393TvM) r0
            X.TpR r13 = r0.A01
            X.TuJ r11 = r0.A02
            android.content.Context r3 = r0.A00
            com.instagram.common.session.UserSession r2 = r0.A03
            X.4DU r1 = r0.A04
            java.lang.String r0 = r0.A05
            X.Ttt r10 = new X.Ttt
            r16 = r10
            r17 = r3
            r18 = r13
            r19 = r11
            r20 = r2
            r21 = r1
            r22 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)
        L_0x0581:
            X.X8S r0 = r8.A01
            r10.A03 = r0
            if (r12 == 0) goto L_0x058a
            r6.put(r12, r10)
        L_0x058a:
            int r1 = r8.A00
            r0 = 1
            if (r1 != r0) goto L_0x05b5
            com.instagram.common.session.UserSession r3 = r8.A05
            X.0Tu r2 = X.0Tu.A05
            r0 = 36310357895151645(0x8100140002001d, double:3.0261547707449514E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x05b5
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            X.WnB r2 = new X.WnB
            r2.<init>(r9, r10)
            r0 = 350(0x15e, double:1.73E-321)
            r3.postDelayed(r2, r0)
        L_0x05ad:
            int r0 = r8.A00
            int r0 = r0 + 1
            r8.A00 = r0
            goto L_0x04fb
        L_0x05b5:
            r10.A0B(r9)
            goto L_0x05ad
        L_0x05b9:
            int r1 = r6.size()
            int r0 = r8.A02
            if (r1 >= r0) goto L_0x04fb
            android.content.Context r13 = r8.A04
            com.instagram.common.session.UserSession r11 = r8.A05
            X.4DU r3 = r8.A06
            java.lang.String r2 = r8.A07
            long r0 = r8.A03
            X.Ttm r10 = new X.Ttm
            r16 = r10
            r17 = r13
            r18 = r11
            r19 = r3
            r20 = r2
            r21 = r0
            r16.<init>(r17, r18, r19, r20, r21)
            goto L_0x0581
        L_0x05dd:
            java.util.Iterator r3 = X.AnonymousClass7TF.A0s(r7)
        L_0x05e1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0016
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r3)
            java.lang.Object r1 = r0.getKey()
            X.1Xj r1 = (X.1Xj) r1
            int r2 = X.C66582MXn.A08(r0)
            X.XAZ r0 = r4.A03
            X.3W1 r1 = r0.BQr(r1)
            int r0 = r1.A03
            r1.A0E(r2, r0)
            goto L_0x05e1
        L_0x0601:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.Object r1 = r4.A01
            com.instagram.common.ui.widget.imageview.TransitionCarouselImageView r1 = (com.instagram.common.ui.widget.imageview.TransitionCarouselImageView) r1
            boolean r0 = r1.isShown()
            if (r0 != 0) goto L_0x0613
            com.instagram.common.ui.widget.imageview.TransitionCarouselImageView.A03(r1)
            return
        L_0x0613:
            int r0 = r7.what
            if (r0 != 0) goto L_0x0016
            boolean r0 = r1.A0K
            if (r0 == 0) goto L_0x0620
            android.animation.ValueAnimator r0 = r1.A0H
            r0.start()
        L_0x0620:
            android.animation.ValueAnimator r0 = r1.A0G
            r0.start()
            return
        L_0x0626:
            r6 = 0
            X.0qQ.A0B(r7, r6)
            int r0 = r7.what
            if (r0 != 0) goto L_0x0016
            java.lang.Object r5 = r4.A01
            X.Ugx r5 = (X.C15692Ugx) r5
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x0016
            X.Uu4 r12 = r5.A06
            X.4M3 r0 = r12.A02
            if (r0 == 0) goto L_0x0642
            X.4M1 r0 = (X.AnonymousClass4M1) r0
            X.3OB r1 = r0.A0M
            if (r1 != 0) goto L_0x0644
        L_0x0642:
            X.3OB r1 = X.AnonymousClass3OB.IDLE
        L_0x0644:
            X.3OB r4 = X.AnonymousClass3OB.IDLE
            if (r1 == r4) goto L_0x064c
            X.3OB r0 = X.AnonymousClass3OB.PAUSED
            if (r1 != r0) goto L_0x0016
        L_0x064c:
            androidx.recyclerview.widget.RecyclerView r0 = r5.A00
            if (r0 == 0) goto L_0x0016
            androidx.recyclerview.widget.LinearLayoutManager r3 = r5.A04
            int r2 = r3.A1a()
            int r1 = r3.A1b()
            if (r2 > r1) goto L_0x0016
        L_0x065c:
            int r7 = r3.A1a()
            r0 = -1
            if (r7 == r0) goto L_0x06e5
            X.UAS r7 = r5.A05
            X.VRl r0 = r7.A02
            java.util.List r0 = r0.A00
            java.lang.Object r11 = r0.get(r2)
            X.XBs r11 = (X.C21051XBs) r11
            X.VXp r8 = r7.A00(r11)
            boolean r0 = r11 instanceof X.C15436Ucm
            if (r0 == 0) goto L_0x06e5
            androidx.recyclerview.widget.RecyclerView r0 = r5.A00
            if (r0 == 0) goto L_0x0747
            X.3kE r13 = r0.A0W(r2)
        L_0x067f:
            X.UD6 r13 = (X.UD6) r13
            if (r13 == 0) goto L_0x06e5
            com.instagram.ui.widget.framelayout.MediaFrameLayout r10 = r13.A02
            r9 = 1056964608(0x3f000000, float:0.5)
            android.graphics.Rect r7 = r5.A02
            boolean r0 = r10.getGlobalVisibleRect(r7)
            if (r0 == 0) goto L_0x06e5
            int r0 = r7.height()
            float r7 = (float) r0
            int r0 = r10.getHeight()
            float r0 = (float) r0
            float r0 = r0 * r9
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x06e5
            X.4M3 r0 = r12.A02
            if (r0 == 0) goto L_0x06a8
            X.4M1 r0 = (X.AnonymousClass4M1) r0
            X.3OB r7 = r0.A0M
            if (r7 != 0) goto L_0x06a9
        L_0x06a8:
            r7 = r4
        L_0x06a9:
            X.3OB r0 = X.AnonymousClass3OB.PAUSED
            if (r7 != r0) goto L_0x06ed
            X.Utz r0 = r12.A01
            if (r0 == 0) goto L_0x06eb
            X.Ucm r0 = r0.A00
        L_0x06b3:
            boolean r0 = X.0qQ.A0K(r11, r0)
            if (r0 == 0) goto L_0x06ed
            X.4M3 r7 = r12.A02
            java.lang.String r9 = "Required value was null."
            if (r7 == 0) goto L_0x078e
            java.lang.String r0 = "start"
            r7.E2q(r0, r6)
            X.4M1 r7 = (X.AnonymousClass4M1) r7
            X.3OB r7 = r7.A0M
            X.3OB r0 = X.AnonymousClass3OB.PLAYING
            if (r7 != r0) goto L_0x06e5
            X.Utz r8 = r12.A01
            if (r8 == 0) goto L_0x0788
            com.instagram.common.session.UserSession r0 = r12.A06
            X.1GF r0 = X.1GE.A00(r0)
            boolean r7 = r12.A04
            java.lang.Boolean r0 = r0.A01
            if (r0 == 0) goto L_0x06e0
            boolean r7 = r0.booleanValue()
        L_0x06e0:
            r8.A00 = r7
            X.C16387Uu4.A01(r12, r7)
        L_0x06e5:
            if (r2 == r1) goto L_0x0016
            int r2 = r2 + 1
            goto L_0x065c
        L_0x06eb:
            r0 = 0
            goto L_0x06b3
        L_0x06ed:
            X.Ucm r11 = (X.C15436Ucm) r11
            int r8 = r8.A01
            X.0iw r14 = r5.A07
            X.AnonymousClass7TF.A1C(r11, r6, r14)
            X.4M3 r9 = r12.A02
            if (r9 == 0) goto L_0x0701
            r0 = r9
            X.4M1 r0 = (X.AnonymousClass4M1) r0
            X.3OB r7 = r0.A0M
            if (r7 != 0) goto L_0x0702
        L_0x0701:
            r7 = r4
        L_0x0702:
            X.3OB r0 = X.AnonymousClass3OB.STOPPING
            if (r7 == r0) goto L_0x06e5
            if (r9 != 0) goto L_0x0722
            android.content.Context r10 = r12.A05
            com.instagram.common.session.UserSession r9 = r12.A06
            java.lang.String r7 = r14.getModuleName()
            r0 = 0
            X.4M1 r7 = X.AnonymousClass4M0.A00(r10, r9, r0, r12, r7)
            r12.A02 = r7
            r0 = 1
            r7.Ech(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r7.Eqr(r0, r6)
            r7.A0N = r12
        L_0x0722:
            X.4M3 r15 = r12.A02
            if (r15 == 0) goto L_0x0794
            r7 = 1
            r0 = r15
            X.4M1 r0 = (X.AnonymousClass4M1) r0
            r0.A0W = r7
            java.lang.String r0 = "unknown"
            r15.EyP(r0, r7)
            X.Wpk r10 = new X.Wpk
            r16 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r12.A03 = r10
            X.4M1 r15 = (X.AnonymousClass4M1) r15
            X.3OB r0 = r15.A0M
            if (r0 != r4) goto L_0x06e5
            r10.run()
            r0 = 0
            r12.A03 = r0
            goto L_0x06e5
        L_0x0747:
            r13 = 0
            goto L_0x067f
        L_0x074a:
            int r1 = r7.what
            r0 = 1
            if (r1 != r0) goto L_0x0016
            java.lang.Object r1 = r4.A01
            X.U7v r1 = (X.U7v) r1
            X.Vi6 r0 = r1.A01
            androidx.preference.PreferenceScreen r2 = r0.A05
            if (r2 == 0) goto L_0x0016
            androidx.recyclerview.widget.RecyclerView r1 = r1.A02
            X.UAT r0 = new X.UAT
            r0.<init>(r2)
            r1.setAdapter(r0)
            r2.A05()
            return
        L_0x0767:
            java.lang.Object r1 = r7.obj
            android.view.View r1 = (android.view.View) r1
            r0 = 4
            r1.sendAccessibilityEvent(r0)
            return
        L_0x0770:
            java.lang.Object r3 = r7.obj
            X.4uI r3 = (X.C277014uI) r3
            java.lang.Object r0 = r4.A01
            X.Tq9 r0 = (X.C14114Tq9) r0
            X.4tV r2 = r0.A00
            X.6Tl r1 = new X.6Tl
            r1.<init>()
            X.6Rm r0 = r0.A02
            r1.A01(r0)
            X.DbT.A1R(r0, r2, r1, r3)
            return
        L_0x0788:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x078e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x0794:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14697U1x.handleMessage(android.os.Message):void");
    }

    public C14697U1x(C14750U7h u7h) {
        this.A00 = 2;
        this.A01 = u7h;
    }
}
