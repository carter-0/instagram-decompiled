package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.AbstractList;
import java.util.List;

public final class Fl0 implements C337237fw {
    public UserSession A00;
    public String A01;
    public Context A02;
    public C290645fe A03;
    public final int A04;
    public final boolean A05;
    public final int A06;
    public final AnonymousClass2t9 A07;
    public final C251033mS A08;
    public final String A09 = this.A02.getString(2131972868);

    public static List A00(AbstractList abstractList, int i) {
        return abstractList.subList(0, Math.min(i, abstractList.size()));
    }

    public static void A01(Integer num, Object obj, List list) {
        list.add(new C71982OuE((C16744V4b) null, num, AnonymousClass05K.A0N, obj));
    }

    private void A02(List list, List list2, int i, int i2, int i3) {
        0qQ.A0B(list, 2);
        list2.addAll(C48843El5.A00(this.A00, this.A08, list, i, i2, -1, i3, false, false, false));
    }

    public Fl0(Context context, C290645fe r4, AnonymousClass2t9 r5, UserSession userSession, int i, boolean z) {
        this.A07 = r5;
        this.A02 = context;
        this.A00 = userSession;
        this.A03 = r4;
        this.A06 = DbV.A01(context);
        this.A05 = z;
        this.A04 = i <= 0 ? Integer.MAX_VALUE : i;
        this.A08 = C251033mS.A00(this.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a7, code lost:
        if (r11.isEmpty() == false) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dam(X.C337257fy r20) {
        /*
            r19 = this;
            com.instagram.common.recyclerview.ViewModelListUpdate r2 = X.DbS.A0R()
            java.lang.String r1 = r20.BiY()
            r13 = 0
            r12 = 1
            r0 = r19
            if (r1 == 0) goto L_0x0093
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0093
            r6 = 0
            java.lang.Object r11 = r20.Bo1()
            java.util.List r11 = (java.util.List) r11
        L_0x001b:
            java.lang.String r1 = r0.A01
            if (r1 == 0) goto L_0x004c
            java.util.Iterator r5 = r11.iterator()
        L_0x0023:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x004c
            com.instagram.model.direct.DirectShareTarget r4 = X.DbT.A0f(r5)
            java.util.ArrayList r1 = r4.A0B()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0023
            java.lang.String r3 = r0.A01
            java.util.ArrayList r1 = r4.A0B()
            java.lang.Object r1 = r1.get(r13)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = r3.contentEquals(r1)
            if (r1 == 0) goto L_0x0023
            r5.remove()
        L_0x004c:
            com.instagram.common.session.UserSession r9 = r0.A00
            java.lang.String r5 = r9.A06
            java.util.Iterator r4 = r11.iterator()
        L_0x0054:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x007b
            com.instagram.model.direct.DirectShareTarget r3 = X.DbT.A0f(r4)
            java.util.ArrayList r1 = r3.A0B()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0054
            java.util.ArrayList r1 = r3.A0B()
            java.lang.Object r1 = r1.get(r13)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = r5.contentEquals(r1)
            if (r1 == 0) goto L_0x0054
            r4.remove()
        L_0x007b:
            java.util.Iterator r3 = r11.iterator()
        L_0x007f:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x00a0
            com.instagram.model.direct.DirectShareTarget r1 = X.DbT.A0f(r3)
            boolean r1 = r1.A0S()
            if (r1 != 0) goto L_0x007f
            r3.remove()
            goto L_0x007f
        L_0x0093:
            r6 = 1
            X.5fe r3 = r0.A03
            java.lang.String r1 = "direct_user_search_nullstate"
            X.5g5 r1 = r3.A01(r1)
            java.util.List r11 = r1.A02
            goto L_0x001b
        L_0x00a0:
            if (r6 != 0) goto L_0x00a9
            boolean r1 = r11.isEmpty()
            r7 = 1
            if (r1 != 0) goto L_0x0138
        L_0x00a9:
            r7 = 0
            if (r6 == 0) goto L_0x0138
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            boolean r3 = r0.A05
            r6 = 0
            if (r3 == 0) goto L_0x00ba
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            A01(r3, r6, r1)
        L_0x00ba:
            java.lang.String r3 = "direct_user_search_nullstate"
            X.ON1 r4 = X.F9W.A00(r9, r3, r11)
            java.util.ArrayList r3 = r4.A0D
            int r5 = r0.A04
            java.util.List r14 = A00(r3, r5)
            r16 = 6
            r17 = r13
            r18 = r13
            r15 = r1
            r13 = r0
            r13.A02(r14, r15, r16, r17, r18)
            int r14 = r3.size()
            java.util.ArrayList r4 = r4.A03
            int r3 = r4.size()
            if (r3 < r12) goto L_0x00f0
            java.util.List r11 = A00(r4, r5)
            java.lang.Integer r3 = X.AnonymousClass05K.A0j
            A01(r3, r6, r1)
            r13 = 11
            r15 = r12
            r12 = r1
            r10 = r0
            r10.A02(r11, r12, r13, r14, r15)
        L_0x00f0:
            r2.A01(r1)
            boolean r1 = r20.isLoading()
            if (r1 == 0) goto L_0x010f
            java.lang.String r5 = r0.A09
        L_0x00fb:
            int r4 = r0.A06
            boolean r1 = r20.isLoading()
            X.EGc r3 = new X.EGc
            r3.<init>(r5, r4, r1)
        L_0x0106:
            r2.A00(r3)
        L_0x0109:
            X.2t9 r0 = r0.A07
            r0.A05(r2)
            return
        L_0x010f:
            boolean r1 = r20.CT5()
            if (r1 == 0) goto L_0x0127
            android.content.Context r1 = r0.A02
            android.content.res.Resources r4 = r1.getResources()
            r3 = 2131972817(0x7f1352d1, float:1.9582652E38)
            java.lang.String r1 = r20.BiY()
            java.lang.String r5 = X.AnonymousClass7TF.A0e(r4, r1, r3)
            goto L_0x00fb
        L_0x0127:
            if (r7 == 0) goto L_0x0109
            android.content.Context r3 = r0.A02
            r1 = 2131968486(0x7f1341e6, float:1.9573868E38)
            java.lang.String r1 = r3.getString(r1)
            X.EGY r3 = new X.EGY
            r3.<init>(r1)
            goto L_0x0106
        L_0x0138:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r3 = 267(0x10b, float:3.74E-43)
            java.lang.String r10 = X.C273654mx.A00(r3)
            X.OVf r8 = X.F9W.A00
            r14 = r12
            r15 = r13
            r16 = r13
            X.ON1 r6 = r8.A01(r9, r10, r11, r12, r13, r14, r15, r16)
            java.util.ArrayList r3 = r6.A0D
            r16 = 6
            r17 = r13
            r18 = r13
            r14 = r3
            r15 = r1
            r13 = r0
            r13.A02(r14, r15, r16, r17, r18)
            int r5 = r1.size()
            java.util.ArrayList r4 = r6.A03
            int r3 = r4.size()
            r18 = 1
            if (r3 < r12) goto L_0x0181
            java.lang.Integer r3 = X.AnonymousClass05K.A0j
            A01(r3, r4, r1)
            int r3 = r0.A04
            java.util.List r3 = A00(r4, r3)
            r16 = 11
            r17 = r5
            r14 = r3
            r13.A02(r14, r15, r16, r17, r18)
            int r5 = X.DbT.A01(r3, r5)
            r18 = 2
        L_0x0181:
            java.util.ArrayList r4 = r6.A06
            int r3 = r4.size()
            if (r3 < r12) goto L_0x01a4
            java.lang.Integer r3 = X.AnonymousClass05K.A1I
            A01(r3, r4, r1)
            int r3 = r0.A04
            java.util.List r4 = A00(r4, r3)
            r16 = 12
            int r3 = r18 + 1
            r17 = r5
            r14 = r4
            r13.A02(r14, r15, r16, r17, r18)
            int r5 = X.DbT.A01(r4, r5)
            r18 = r3
        L_0x01a4:
            java.util.ArrayList r4 = r6.A04
            int r3 = r4.size()
            if (r3 < r12) goto L_0x00f0
            java.lang.Integer r3 = X.AnonymousClass05K.A03
            A01(r3, r4, r1)
            int r3 = r0.A04
            java.util.List r14 = A00(r4, r3)
            r16 = 13
            r17 = r5
            r13.A02(r14, r15, r16, r17, r18)
            goto L_0x00f0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fl0.Dam(X.7fy):void");
    }
}
