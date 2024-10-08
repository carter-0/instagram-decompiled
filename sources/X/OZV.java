package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class OZV {
    public C64972LlB A00;
    public IgdsInlineSearchBox A01;
    public Integer A02;
    public Integer A03;
    public C249403jg A04;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final AnonymousClass0xx A08;
    public final LinearLayoutManager A09;
    public final RecyclerView A0A;
    public final UserSession A0B;
    public final C71063Oai A0C;
    public final O89 A0D;
    public final C67752Mu6 A0E;
    public final C68685NSr A0F;
    public final String A0G;
    public final String A0H;
    public final List A0I;
    public final AnonymousClass0eM A0J = AnonymousClass0eN.A01(C73921Pm1.A00(this, 33));
    public final boolean A0K;
    public final IgSegmentedTabLayout2 A0L;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x015f, code lost:
        if (r5.A06 == 29) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0161, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0162, code lost:
        if (r6 == false) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0164, code lost:
        r1 = r5.A07;
        r0 = 2131959434;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0169, code lost:
        r0 = r1.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x016d, code lost:
        r3.setText(r0);
        r3.setVisibility(r2);
        X.1Eo.A03(r4, X.19B.A00, new X.C66182MGt((java.lang.Object) r5, (X.AnonymousClass4D7) null, 16), r5.A08);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0182, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0187, code lost:
        if (r5.A06 != 29) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0189, code lost:
        r1 = r5.A07;
        r0 = 2131959435;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x018f, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0196, code lost:
        if (r6 == false) goto L_0x0159;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OZV(android.content.Context r22, android.view.View r23, X.AnonymousClass0xx r24, X.AnonymousClass0iw r25, com.instagram.common.session.UserSession r26, X.O89 r27, X.C67752Mu6 r28, com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2 r29, java.lang.String r30, java.lang.String r31, int r32, int r33, boolean r34, boolean r35) {
        /*
            r21 = this;
            r2 = 1
            r0 = 2
            r1 = r26
            r3 = r28
            X.AnonymousClass7TF.A1E(r1, r0, r3)
            r5 = r21
            r5.<init>()
            r14 = r22
            r5.A07 = r14
            r5.A0B = r1
            r0 = r24
            r5.A08 = r0
            r0 = r27
            r5.A0D = r0
            r5.A0E = r3
            r0 = r30
            r5.A0G = r0
            r0 = r31
            r5.A0H = r0
            r0 = r32
            r5.A05 = r0
            r6 = r35
            r5.A0K = r6
            r0 = r33
            r5.A06 = r0
            r0 = r29
            r5.A0L = r0
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            r5.A02 = r4
            r5.A03 = r4
            X.NSr r0 = new X.NSr
            r0.<init>(r1)
            r5.A0F = r0
            r0 = 2131439344(0x7f0b2ef0, float:1.850064E38)
            r3 = r23
            android.view.View r8 = X.AnonymousClass7TF.A0G(r3, r0)
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            r5.A0A = r8
            r0 = 33
            X.Pm1 r0 = X.C73921Pm1.A00(r5, r0)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r5.A0J = r0
            android.view.View r0 = r8.getRootView()
            int r18 = r0.getWidth()
            X.Oai r13 = new X.Oai
            r19 = r34
            r15 = r25
            r20 = r6
            r17 = r5
            r16 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r5.A0C = r13
            r7 = 0
            androidx.recyclerview.widget.LinearLayoutManager r9 = new androidx.recyclerview.widget.LinearLayoutManager
            r9.<init>(r14, r2, r7)
            r5.A09 = r9
            com.instagram.common.session.UserSession r11 = r5.A0B
            X.0Tu r6 = X.0Tu.A05
            r0 = 36326816209778673(0x810f0c000137f1, double:3.0365630751873975E-306)
            boolean r0 = X.182.A06(r6, r11, r0)
            if (r0 == 0) goto L_0x00bb
            X.7fS r0 = X.C317486nL.A04
            java.util.List r0 = r0.A06(r11)
            java.util.ArrayList r11 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r12 = r0.iterator()
        L_0x009a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00de
            java.lang.Object r0 = r12.next()
            X.OCr r0 = (X.C70594OCr) r0
            X.RFj r10 = r0.A00
            java.util.List r6 = r0.A01
            int r1 = r5.A06
            r0 = 29
            if (r1 != r0) goto L_0x00b2
            X.0sn r6 = X.0sn.A00
        L_0x00b2:
            X.OCr r0 = new X.OCr
            r0.<init>(r10, r6)
            r11.add(r0)
            goto L_0x009a
        L_0x00bb:
            X.RFj r10 = X.C8916RFj.A05
            X.7fS r0 = X.C317486nL.A04
            X.6nL[] r0 = r0.A07(r11)
            X.0qQ.A0B(r0, r7)
            java.util.List r6 = java.util.Arrays.asList(r0)
            X.0qQ.A07(r6)
            int r1 = r5.A06
            r0 = 29
            if (r1 != r0) goto L_0x00d5
            X.0sn r6 = X.0sn.A00
        L_0x00d5:
            X.OCr r0 = new X.OCr
            r0.<init>(r10, r6)
            java.util.List r11 = X.AnonymousClass7TE.A1I(r0)
        L_0x00de:
            r5.A0I = r11
            r8.setLayoutManager(r9)
            X.2t9 r0 = r13.A01
            r8.setAdapter(r0)
            r0 = 2131432332(0x7f0b138c, float:1.8486418E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r3, r0)
            boolean r0 = r5.A0K
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            r0 = 2131439244(0x7f0b2e8c, float:1.8500438E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r1, r0)
            X.C71402Ok1.A00(r0, r2, r5)
            X.PDl r2 = new X.PDl
            r2.<init>(r5)
            com.instagram.common.session.UserSession r1 = r5.A0B
            X.LlB r0 = new X.LlB
            r0.<init>(r1, r2)
            r5.A00 = r0
            r0 = 2131440786(0x7f0b3492, float:1.8503565E38)
            android.view.View r2 = r3.requireViewById(r0)
            com.instagram.igds.components.search.IgdsInlineSearchBox r2 = (com.instagram.igds.components.search.IgdsInlineSearchBox) r2
            r5.A01 = r2
            if (r2 != 0) goto L_0x0127
            java.lang.String r0 = "inlineSearchBox"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0127:
            r1 = 4
            X.PHc r0 = new X.PHc
            r0.<init>(r5, r1)
            r2.A02 = r0
            r0 = 2131432330(0x7f0b138a, float:1.8486414E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r3, r0)
            r0 = 2131439246(0x7f0b2e8e, float:1.8500442E38)
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r1, r0)
            r0 = 2131439245(0x7f0b2e8d, float:1.850044E38)
            android.widget.TextView r3 = X.AnonymousClass7TG.A0R(r1, r0)
            boolean r6 = r5.A0K
            if (r6 != 0) goto L_0x0191
            int r1 = r5.A06
            r0 = 29
            if (r1 != r0) goto L_0x0191
            r2.setVisibility(r7)
            android.content.Context r1 = r5.A07
            r0 = 2131959436(0x7f131e8c, float:1.9555512E38)
            X.DbT.A18(r1, r2, r0)
        L_0x0159:
            int r1 = r5.A06
            r0 = 29
            r2 = 8
            if (r1 != r0) goto L_0x0183
        L_0x0161:
            r2 = 0
            if (r6 == 0) goto L_0x0183
            android.content.Context r1 = r5.A07
            r0 = 2131959434(0x7f131e8a, float:1.9555508E38)
        L_0x0169:
            java.lang.String r0 = r1.getString(r0)
        L_0x016d:
            r3.setText(r0)
            r3.setVisibility(r2)
            X.0xx r3 = r5.A08
            r2 = 0
            r0 = 16
            X.MGt r1 = new X.MGt
            r1.<init>((java.lang.Object) r5, (X.AnonymousClass4D7) r2, (int) r0)
            X.19B r0 = X.19B.A00
            X.1Eo.A03(r4, r0, r1, r3)
            return
        L_0x0183:
            int r1 = r5.A06
            r0 = 29
            if (r1 != r0) goto L_0x018f
            android.content.Context r1 = r5.A07
            r0 = 2131959435(0x7f131e8b, float:1.955551E38)
            goto L_0x0169
        L_0x018f:
            r0 = 0
            goto L_0x016d
        L_0x0191:
            r0 = 8
            r2.setVisibility(r0)
            if (r6 != 0) goto L_0x0161
            goto L_0x0159
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OZV.<init>(android.content.Context, android.view.View, X.0xx, X.0iw, com.instagram.common.session.UserSession, X.O89, X.Mu6, com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2, java.lang.String, java.lang.String, int, int, boolean, boolean):void");
    }

    public static final List A00(OZV ozv, List list, List list2) {
        UserSession userSession = ozv.A0B;
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36326816209778673L) || !AnonymousClass7TE.A1b(list) || 182.A06(r2, userSession, 36328121879772107L)) {
            return list2;
        }
        return 00k.A0S(list2, AnonymousClass7TE.A1I(new C70594OCr(C8916RFj.A0A, list)));
    }

    public static final void A01(OZV ozv, List list) {
        Drawable drawable;
        OZV ozv2 = ozv;
        IgSegmentedTabLayout2 igSegmentedTabLayout2 = ozv2.A0L;
        if (igSegmentedTabLayout2 != null) {
            C60066Jeq jeq = igSegmentedTabLayout2.A04;
            jeq.removeAllViews();
            jeq.A02 = -1;
            jeq.A00 = -1;
            C249403jg r1 = ozv2.A04;
            if (r1 != null) {
                ozv2.A0A.A16(r1);
            }
            List list2 = list;
            if (list2.size() >= 2) {
                igSegmentedTabLayout2.A00(-1, false);
                int i = 0;
                for (Object next : list2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    C70594OCr oCr = (C70594OCr) next;
                    Integer num = oCr.A00.A01;
                    if (num != null) {
                        Drawable drawable2 = ozv2.A07.getDrawable(num.intValue());
                        if (drawable2 != null) {
                            drawable = drawable2.mutate();
                        } else {
                            drawable = null;
                        }
                        igSegmentedTabLayout2.A02(new C71354Oj9(i, 4, igSegmentedTabLayout2, ozv, oCr), new C49627Ezk(drawable, (CharSequence) null, (CharSequence) null, -1, true));
                    }
                    i = i2;
                }
                igSegmentedTabLayout2.A01(0, true);
                C53096GiU giU = new C53096GiU(4, igSegmentedTabLayout2, list2, ozv2);
                ozv2.A0A.A15(giU);
                ozv2.A04 = giU;
            }
        }
    }

    public final void A02() {
        Object A0j;
        Object obj;
        Set<C317486nL> A0y;
        Set set;
        Integer num = AnonymousClass05K.A01;
        this.A03 = num;
        C67752Mu6 mu6 = this.A0E;
        String str = this.A0G;
        int i = this.A06;
        boolean z = this.A0K;
        05G r9 = mu6.A07;
        if (z) {
            A0j = DbS.A0y();
        } else {
            UserSession userSession = mu6.A01;
            List A022 = C71100Oca.A02(userSession);
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = A022.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                C317486nL A052 = C317486nL.A04.A05(userSession, A18);
                if (A052 == null || !182.A06(0Tu.A05, userSession, 36314884790553458L)) {
                    A052 = C336957fS.A01(A18);
                }
                A1C.add(A052);
            }
            A0j = 00k.A0j(A1C);
        }
        r9.Epw(A0j);
        if (i == 29 && str != null) {
            KWW kww = mu6.A03;
            if (mu6.A00 == num) {
                A0y = 00k.A0j((Iterable) mu6.A06.getValue());
            } else {
                A0y = DbS.A0y();
            }
            synchronized (kww) {
                List A13 = C66580MXl.A13(str, C56501HzX.A01.A00);
                if (A13 != null) {
                    set = 00k.A0j(A13);
                    ArrayList A0r = AnonymousClass7TG.A0r(A0y);
                    for (C317486nL r0 : A0y) {
                        A0r.add(r0.A02);
                    }
                    set.addAll(A0r);
                } else {
                    set = null;
                }
            }
            if (set != null) {
                05G r3 = mu6.A06;
                ArrayList A0r2 = AnonymousClass7TG.A0r(set);
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    A0r2.add(C336957fS.A01(AnonymousClass7TE.A18(it2)));
                }
                r3.Epw(00k.A0j(C67752Mu6.A00(A0r2)));
            }
        }
        LinkedHashSet A0y2 = DbS.A0y();
        Iterator A0l = C66583MXo.A0l(mu6.A06);
        while (A0l.hasNext()) {
            C317486nL r2 = (C317486nL) A0l.next();
            C317486nL[] A023 = C337097fg.A02(r2.A02, false);
            if (A023.length == 0) {
                A0y2.add(r2);
            } else {
                018.A18(A0y2, A023);
            }
        }
        05G r4 = mu6.A08;
        if (!z) {
            if (!182.A06(0Tu.A05, mu6.A01, 36328121879772107L)) {
                ArrayList A024 = mu6.A04.A02();
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                Iterator it3 = A024.iterator();
                while (it3.hasNext()) {
                    C317486nL r02 = ((C40291AZg) it3.next()).A04;
                    if (r02 != null) {
                        A1C2.add(r02);
                    }
                }
                ArrayList A1C3 = AnonymousClass7TE.A1C();
                for (Object next : A1C2) {
                    DbV.A1U(next, A1C3, A0y2.contains(next) ? 1 : 0);
                }
                obj = 00k.A0j(A1C3);
                r4.Epw(obj);
                mu6.A01((Set) mu6.A09.getValue(), i);
            }
        }
        obj = DbS.A0y();
        r4.Epw(obj);
        mu6.A01((Set) mu6.A09.getValue(), i);
    }
}
