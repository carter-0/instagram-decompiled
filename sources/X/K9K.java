package X;

import android.content.Context;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class K9K extends 2Ru implements C231272rL {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public long A03;
    public final Context A04;
    public final UserSession A05;
    public final K9T A06;
    public final K9U A07;
    public final C61489K9u A08;
    public final ArrayList A09 = AnonymousClass7TE.A1C();
    public final ArrayList A0A = AnonymousClass7TE.A1C();
    public final ArrayList A0B = AnonymousClass7TE.A1C();
    public final ArrayList A0C = AnonymousClass7TE.A1C();
    public final ArrayList A0D = AnonymousClass7TE.A1C();
    public final ArrayList A0E = AnonymousClass7TE.A1C();
    public final List A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final C357638Yz A0I;
    public final C61485K9q A0J;
    public final C66441MRv A0K;
    public final boolean A0L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public K9K(Context context, AnonymousClass0iw r17, UserSession userSession, C357638Yz r19, C314236hs r20, C66441MRv mRv, 0sP r22, boolean z, boolean z2) {
        super(false);
        Context context2 = context;
        0qQ.A0B(context2, 1);
        this.A04 = context2;
        UserSession userSession2 = userSession;
        this.A05 = userSession2;
        this.A0K = mRv;
        this.A0L = z;
        this.A0H = z2;
        C357638Yz r10 = r19;
        this.A0I = r10;
        K9T k9t = new K9T(context2, new MJ0(this, 32), new C66312MMv(21, r22, this));
        this.A06 = k9t;
        K9U k9u = new K9U(context2, (AnonymousClass8MM) null);
        this.A07 = k9u;
        C61485K9q k9q = new C61485K9q(context2, r17, userSession2, r10, r20, (String) null, false, false);
        this.A0J = k9q;
        C61489K9u k9u2 = new C61489K9u(context2, C51967G9n.A0j());
        this.A08 = k9u2;
        this.A0G = JTR.A1Z(userSession2);
        1Av A002 = 1Au.A00(userSession2);
        this.A0F = JTS.A0n((Collection) new Gson().A07(new C8713R2q(), A002.A01.getString("sticker_tray_search_history", (String) null)));
        this.A03 = -1;
        init(new C231642s0[]{k9q, k9t, k9u, k9u2});
    }

    public static void A00(Context context, K9K k9k, int i) {
        String string = context.getString(i);
        0qQ.A07(string);
        k9k.addModel(new C61081JwJ((C61081JwJ) null, string), k9k.A07);
    }

    public final void A03() {
        this.A01 = false;
        this.A0E.clear();
        this.A0C.clear();
        this.A09.clear();
        A01(this);
    }

    public final void A04(String str, long j) {
        String str2;
        List list = this.A0F;
        if (!list.remove(str) && j - this.A03 < 1000 && (str2 = (String) 00k.A0J(list)) != null && (0mp.A0H(str, str2) || 0mp.A0H(str2, str))) {
            list.remove(str2);
        }
        list.add(0, str);
        if (list.size() > 20) {
            018.A15(list);
        }
        1Au.A00(this.A05).A18(list);
        this.A03 = System.currentTimeMillis();
        A01(this);
    }

    public final void A05(List list) {
        this.A01 = true;
        ArrayList arrayList = this.A0B;
        arrayList.clear();
        ArrayList arrayList2 = this.A0E;
        arrayList2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C317466nJ r2 = (C317466nJ) it.next();
            int ordinal = r2.CAW().ordinal();
            if (ordinal == 1) {
                arrayList.add(r2);
            } else if (ordinal == 0) {
                arrayList2.add(r2);
            }
        }
        A01(this);
    }

    private final void A02(List list) {
        int i;
        Integer Aci = this.A0K.Aci();
        int i2 = 3;
        if (Aci.intValue() != 2) {
            i2 = 4;
        }
        if (Aci == AnonymousClass05K.A0Y || Aci == AnonymousClass05K.A0j) {
            UserSession userSession = this.A05;
            i = 44;
            if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36323805437701652L)) {
                i = 88;
            }
        } else {
            i = Integer.MAX_VALUE;
        }
        int i3 = 0;
        while (i3 < list.size() && i3 <= i) {
            addModel(new C63702L3m(new C3251571g(list, i3, i2), i2), (Object) null, this.A0J);
            i3 += i2;
        }
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02d3, code lost:
        r1 = new X.C61081JwJ(r2, X.AnonymousClass7TE.A16(r6.A04, 2131968420));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02e1, code lost:
        r6.addModel(r1, r6.A07);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02fc, code lost:
        r6.A02(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0301, code lost:
        r6.updateListView();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0304, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        if (r6.A0L == false) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        r6.notifyDataSetChangedSmart();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.K9K r6) {
        /*
            r6.clear()
            com.instagram.common.session.UserSession r5 = r6.A05
            X.0Tu r4 = X.AnonymousClass7TF.A0H(r5)
            r0 = 36323805437701652(0x810c4f00012e14, double:3.0346590508024834E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0022
            java.util.List r2 = r6.A0F
            r0 = 29
            X.JwI r1 = new X.JwI
            r1.<init>((java.util.List) r2, (int) r0)
            X.K9T r0 = r6.A06
            r6.addModel(r1, r0)
        L_0x0022:
            X.MRv r0 = r6.A0K
            java.lang.Integer r2 = r0.Aci()
            int r0 = r2.intValue()
            switch(r0) {
                case 2: goto L_0x02c6;
                case 3: goto L_0x0273;
                case 4: goto L_0x0165;
                case 5: goto L_0x0165;
                case 6: goto L_0x0037;
                case 7: goto L_0x00e5;
                default: goto L_0x002f;
            }
        L_0x002f:
            boolean r0 = r6.A0L
            if (r0 == 0) goto L_0x0301
            r6.notifyDataSetChangedSmart()
            return
        L_0x0037:
            boolean r0 = r6.A01
            r3 = 0
            if (r0 == 0) goto L_0x009a
            java.util.ArrayList r2 = r6.A0E
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0064
            java.util.ArrayList r0 = r6.A0C
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0064
            java.util.ArrayList r0 = r6.A0B
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0064
            android.content.Context r1 = r6.A04
            r0 = 2131968420(0x7f1341a4, float:1.9573734E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            X.JwJ r1 = new X.JwJ
            r1.<init>((X.C61081JwJ) r3, (java.lang.String) r0)
            goto L_0x02e1
        L_0x0064:
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x0075
            android.content.Context r1 = r6.A04
            r0 = 2131974223(0x7f13584f, float:1.9585504E38)
            A00(r1, r6, r0)
            r6.A02(r2)
        L_0x0075:
            java.util.ArrayList r2 = r6.A0B
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x0088
            android.content.Context r1 = r6.A04
            r0 = 2131961603(0x7f132703, float:1.9559908E38)
            A00(r1, r6, r0)
            r6.A02(r2)
        L_0x0088:
            java.util.ArrayList r2 = r6.A0C
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x002f
            android.content.Context r1 = r6.A04
            r0 = 2131963101(0x7f132cdd, float:1.9562946E38)
            A00(r1, r6, r0)
            goto L_0x02fc
        L_0x009a:
            java.util.ArrayList r2 = r6.A0D
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x00ad
            android.content.Context r1 = r6.A04
            r0 = 2131971360(0x7f134d20, float:1.9579697E38)
            A00(r1, r6, r0)
            r6.A02(r2)
        L_0x00ad:
            boolean r0 = r6.A0G
            if (r0 == 0) goto L_0x00d3
            boolean r0 = r6.A0H
            if (r0 == 0) goto L_0x00d3
            java.util.ArrayList r2 = r6.A0A
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x00d3
            r0 = 36319145398180795(0x81081200011bbb, double:3.0317120230450204E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x00d3
            android.content.Context r1 = r6.A04
            r0 = 2131954041(0x7f130979, float:1.954457E38)
            A00(r1, r6, r0)
            r6.A02(r2)
        L_0x00d3:
            java.util.ArrayList r2 = r6.A0C
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x002f
            android.content.Context r1 = r6.A04
            r0 = 2131975532(0x7f135d6c, float:1.9588159E38)
            A00(r1, r6, r0)
            goto L_0x02fc
        L_0x00e5:
            boolean r0 = r6.A01
            r3 = 0
            if (r0 == 0) goto L_0x012d
            java.util.ArrayList r2 = r6.A0E
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x010a
            java.util.ArrayList r0 = r6.A0B
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x010a
            android.content.Context r1 = r6.A04
            r0 = 2131968420(0x7f1341a4, float:1.9573734E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            X.JwJ r1 = new X.JwJ
            r1.<init>((X.C61081JwJ) r3, (java.lang.String) r0)
            goto L_0x02e1
        L_0x010a:
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x011b
            android.content.Context r1 = r6.A04
            r0 = 2131974223(0x7f13584f, float:1.9585504E38)
            A00(r1, r6, r0)
            r6.A02(r2)
        L_0x011b:
            java.util.ArrayList r2 = r6.A0B
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x002f
            android.content.Context r1 = r6.A04
            r0 = 2131961603(0x7f132703, float:1.9559908E38)
            A00(r1, r6, r0)
            goto L_0x02fc
        L_0x012d:
            java.util.ArrayList r2 = r6.A0D
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x0140
            android.content.Context r1 = r6.A04
            r0 = 2131971360(0x7f134d20, float:1.9579697E38)
            A00(r1, r6, r0)
            r6.A02(r2)
        L_0x0140:
            boolean r0 = r6.A0G
            if (r0 == 0) goto L_0x002f
            boolean r0 = r6.A0H
            if (r0 == 0) goto L_0x002f
            java.util.ArrayList r2 = r6.A0A
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x002f
            r0 = 36319145398180795(0x81081200011bbb, double:3.0317120230450204E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x002f
            android.content.Context r1 = r6.A04
            r0 = 2131954041(0x7f130979, float:1.954457E38)
            A00(r1, r6, r0)
            goto L_0x02fc
        L_0x0165:
            boolean r0 = r6.A01
            r3 = 0
            if (r0 == 0) goto L_0x0202
            java.util.ArrayList r4 = r6.A0E
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x01a2
            java.util.ArrayList r0 = r6.A0C
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01a2
            java.util.ArrayList r0 = r6.A0B
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01a2
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r2 != r0) goto L_0x018e
            java.util.ArrayList r0 = r6.A09
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01a2
        L_0x018e:
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x01a2
            android.content.Context r1 = r6.A04
            r0 = 2131968420(0x7f1341a4, float:1.9573734E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            X.JwJ r1 = new X.JwJ
            r1.<init>((X.C61081JwJ) r3, (java.lang.String) r0)
            goto L_0x02e1
        L_0x01a2:
            boolean r0 = X.DbT.A1b(r4)
            if (r0 == 0) goto L_0x01b3
            android.content.Context r1 = r6.A04
            r0 = 2131974223(0x7f13584f, float:1.9585504E38)
            A00(r1, r6, r0)
            r6.A02(r4)
        L_0x01b3:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r2 != r0) goto L_0x01ca
            java.util.ArrayList r2 = r6.A09
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x01ca
            android.content.Context r1 = r6.A04
            r0 = 2131953543(0x7f130787, float:1.954356E38)
            A00(r1, r6, r0)
            r6.A02(r2)
        L_0x01ca:
            java.util.ArrayList r2 = r6.A0B
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x01dd
            android.content.Context r1 = r6.A04
            r0 = 2131961603(0x7f132703, float:1.9559908E38)
            A00(r1, r6, r0)
            r6.A02(r2)
        L_0x01dd:
            java.util.ArrayList r2 = r6.A0C
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x01ef
            android.content.Context r1 = r6.A04
            r0 = 2131963101(0x7f132cdd, float:1.9562946E38)
            A00(r1, r6, r0)
            goto L_0x02fc
        L_0x01ef:
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x002f
            android.content.Context r1 = r6.A04
            r0 = 2131963101(0x7f132cdd, float:1.9562946E38)
            A00(r1, r6, r0)
            X.K9u r0 = r6.A08
            r6.addModel(r3, r0)
            goto L_0x002f
        L_0x0202:
            java.util.ArrayList r2 = r6.A0D
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x0215
            android.content.Context r1 = r6.A04
            r0 = 2131971360(0x7f134d20, float:1.9579697E38)
            A00(r1, r6, r0)
            r6.A02(r2)
        L_0x0215:
            boolean r0 = r6.A0G
            if (r0 == 0) goto L_0x023b
            boolean r0 = r6.A0H
            if (r0 == 0) goto L_0x023b
            java.util.ArrayList r2 = r6.A0A
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x023b
            r0 = 36319145398180795(0x81081200011bbb, double:3.0317120230450204E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x023b
            android.content.Context r1 = r6.A04
            r0 = 2131954041(0x7f130979, float:1.954457E38)
            A00(r1, r6, r0)
            r6.A02(r2)
        L_0x023b:
            java.util.ArrayList r2 = r6.A09
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x024e
            android.content.Context r1 = r6.A04
            r0 = 2131975533(0x7f135d6d, float:1.958816E38)
            A00(r1, r6, r0)
            r6.A02(r2)
        L_0x024e:
            java.util.ArrayList r2 = r6.A0C
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x0260
            android.content.Context r1 = r6.A04
            r0 = 2131975532(0x7f135d6c, float:1.9588159E38)
            A00(r1, r6, r0)
            goto L_0x02fc
        L_0x0260:
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x002f
            android.content.Context r1 = r6.A04
            r0 = 2131975532(0x7f135d6c, float:1.9588159E38)
            A00(r1, r6, r0)
            X.K9u r0 = r6.A08
            r6.addModel(r3, r0)
            goto L_0x002f
        L_0x0273:
            boolean r0 = r6.A01
            r2 = 0
            if (r0 == 0) goto L_0x028f
            java.util.ArrayList r1 = r6.A0E
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0289
            java.util.ArrayList r0 = r6.A0B
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0289
            goto L_0x02d3
        L_0x0289:
            r6.A02(r1)
            java.util.ArrayList r2 = r6.A0B
            goto L_0x02fc
        L_0x028f:
            java.util.ArrayList r2 = r6.A0D
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x02a2
            android.content.Context r1 = r6.A04
            r0 = 2131971360(0x7f134d20, float:1.9579697E38)
            A00(r1, r6, r0)
            r6.A02(r2)
        L_0x02a2:
            boolean r0 = r6.A0G
            if (r0 == 0) goto L_0x002f
            boolean r0 = r6.A0H
            if (r0 == 0) goto L_0x002f
            java.util.ArrayList r2 = r6.A0A
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x002f
            r0 = 36319145398180795(0x81081200011bbb, double:3.0317120230450204E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x002f
            android.content.Context r1 = r6.A04
            r0 = 2131954041(0x7f130979, float:1.954457E38)
            A00(r1, r6, r0)
            goto L_0x02fc
        L_0x02c6:
            boolean r0 = r6.A01
            r2 = 0
            if (r0 == 0) goto L_0x02e8
            java.util.ArrayList r0 = r6.A0C
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x02e8
        L_0x02d3:
            android.content.Context r1 = r6.A04
            r0 = 2131968420(0x7f1341a4, float:1.9573734E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            X.JwJ r1 = new X.JwJ
            r1.<init>((X.C61081JwJ) r2, (java.lang.String) r0)
        L_0x02e1:
            X.K9U r0 = r6.A07
            r6.addModel(r1, r0)
            goto L_0x002f
        L_0x02e8:
            java.util.ArrayList r2 = r6.A0C
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x002f
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x02fc
            android.content.Context r1 = r6.A04
            r0 = 2131975534(0x7f135d6e, float:1.9588163E38)
            A00(r1, r6, r0)
        L_0x02fc:
            r6.A02(r2)
            goto L_0x002f
        L_0x0301:
            r6.updateListView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K9K.A01(X.K9K):void");
    }
}
