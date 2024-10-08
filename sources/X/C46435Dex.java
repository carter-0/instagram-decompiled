package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.android.R;
import com.instagram.api.schemas.GraphGuardianContent;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.Dex  reason: case insensitive filesystem */
public final class C46435Dex extends C331047Ph implements C231302rO, AnonymousClass7Q7 {
    public int A00;
    public int A01;
    public GraphGuardianContent A02;
    public AnonymousClass3UH A03;
    public C49529Ex9 A04;
    public G9S A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public List A0B;
    public List A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final Activity A0N;
    public final Context A0O;
    public final AnonymousClass2s2 A0P = new Object();
    public final AnonymousClass2s2 A0Q;
    public final AnonymousClass2s2 A0R;
    public final AnonymousClass0iw A0S;
    public final UserSession A0T;
    public final C47612E9y A0U;
    public final C46450DfD A0V;
    public final C47625EAl A0W;
    public final C232472tm A0X;
    public final C39695A5l A0Y;
    public final C39695A5l A0Z;
    public final C336947fR A0a;
    public final C66971Mg4 A0b;
    public final C46437Dez A0c;
    public final EB1 A0d;
    public final C231762sK A0e;
    public final E9R A0f;
    public final User A0g;
    public final FollowListData A0h;
    public final C47631EAr A0i;
    public final EAS A0j;
    public final C46453DfH A0k;
    public final EAD A0l;
    public final EAX A0m;
    public final C46457DfL A0n;
    public final C46457DfL A0o;
    public final C47600E9m A0p;
    public final EAF A0q;
    public final EAZ A0r;
    public final EAG A0s;
    public final C46454DfI A0t;
    public final C46432Det A0u;
    public final String A0v;
    public final List A0w;
    public final Set A0x;
    public final Set A0y;
    public final Set A0z;
    public final boolean A10;
    public final boolean A11;
    public final boolean A12;
    public final boolean A13;
    public final int A14;
    public final int A15;
    public final C46448DfA A16;
    public final C46448DfA A17;
    public final C229122ms A18;
    public final F2L A19;
    public final C46467DfV A1A;
    public final C47291DuK A1B;
    public final String A1C;
    public final boolean A1D;
    public final boolean A1E;
    public final boolean A1F;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(X.AnonymousClass3UH r5) {
        /*
            r4 = this;
            r3 = 0
            r4.A03 = r5
            java.util.Set r2 = r4.A0y
            r2.clear()
            boolean r0 = r5.A08()
            if (r0 != 0) goto L_0x002c
            java.util.ArrayList r0 = r5.A03()
        L_0x0012:
            java.util.Iterator r1 = r0.iterator()
        L_0x0016:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r0 = r1.next()
            X.3UL r0 = (X.AnonymousClass3UL) r0
            com.instagram.user.model.User r0 = r0.A03
            java.lang.String r0 = r0.getId()
            r2.add(r0)
            goto L_0x0016
        L_0x002c:
            boolean r0 = r5.A07()
            if (r0 != 0) goto L_0x003b
            java.util.List r0 = r5.A0M
            if (r0 != 0) goto L_0x0012
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x003b:
            boolean r1 = r4.A1E
            r0 = 1
            if (r1 == 0) goto L_0x0042
            r4.A0H = r0
        L_0x0042:
            r4.A0G(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46435Dex.A0C(X.3UH):void");
    }

    public final void A0D(User user) {
        0qQ.A0B(user, 0);
        this.A0C.remove(user);
        this.A0w.remove(user);
        A0G(false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(java.util.List r7) {
        /*
            r6 = this;
            r5 = 0
            X.0qQ.A0B(r7, r5)
            boolean r0 = r6.A0K
            if (r0 == 0) goto L_0x0050
            r6.A0K = r5
            com.instagram.common.session.UserSession r3 = r6.A0T
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324737446850870(0x810d2800143136, double:3.0352484571413484E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0044
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r7.iterator()
        L_0x0021:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0037
            com.instagram.user.model.User r1 = X.DbT.A0k(r2)
            java.util.Set r0 = r6.A0z
            boolean r0 = X.DbV.A1a(r1, r0)
            if (r0 != 0) goto L_0x0021
            r3.add(r1)
            goto L_0x0021
        L_0x0037:
            java.util.ArrayList r1 = X.00k.A0U(r3)
            java.util.List r0 = r6.A0C
            int r0 = r0.size()
            r6.A01 = r0
            goto L_0x0051
        L_0x0044:
            java.util.List r0 = r6.A0C
            r0.clear()
            java.util.Set r0 = r6.A0z
            r0.clear()
            r6.A01 = r5
        L_0x0050:
            r1 = r7
        L_0x0051:
            r4 = 1
            r6.A0H = r4
            java.util.List r0 = r6.A0C
            r0.addAll(r1)
            java.util.Iterator r2 = r7.iterator()
            r3 = 0
        L_0x005e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0077
            com.instagram.user.model.User r0 = X.DbT.A0k(r2)
            java.util.Set r1 = r6.A0z
            java.lang.String r0 = r0.getId()
            boolean r0 = r1.add(r0)
            if (r0 != 0) goto L_0x005e
            int r3 = r3 + 1
            goto L_0x005e
        L_0x0077:
            if (r3 == 0) goto L_0x0091
            X.0wj r2 = X.0wj.A01
            r1 = 1001131858(0x3bac0f52, float:0.0052508498)
            java.lang.String r0 = r6.A1C
            X.0f9 r1 = r2.AEf(r0, r1)
            java.lang.String r0 = "duplicate_count"
            r1.ABO(r0, r3)
            java.lang.String r0 = "is_gql_enabled"
            r1.ABR(r0, r4)
            r1.report()
        L_0x0091:
            r6.A0G(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46435Dex.A0E(java.util.List):void");
    }

    public final boolean AJe(String str) {
        0qQ.A0B(str, 0);
        if (this.A0z.contains(str) || this.A0y.contains(str)) {
            return true;
        }
        return false;
    }

    private final void A00() {
        List<Object> list = this.A0B;
        if (list != null) {
            for (Object A082 : list) {
                A08(this.A0r, A082);
            }
        }
    }

    private final void A01() {
        C229122ms r0;
        if (182.A06(0Tu.A05, this.A0T, 36329848456626531L) && (r0 = this.A18) != null) {
            if (!r0.CKB() || this.A0D) {
                int i = 0;
                if (!this.A0A.isEmpty()) {
                    A08(this.A0n, this.A16);
                    for (Object next : this.A0A) {
                        int i2 = i + 1;
                        if (i < 0) {
                            0sr.A1T();
                            throw AnonymousClass00P.createAndThrow();
                        }
                        A09(this.A0U, next, Integer.valueOf(i));
                        i = i2;
                    }
                    return;
                }
                Context context = this.A0O;
                A09(this.A0U, new C46539Dgg(AnonymousClass7TE.A16(02K.A01(context), 2131972824), AnonymousClass7TE.A16(02K.A01(context), 2131972823), 4, true), 0);
            }
        }
    }

    private final void A03(boolean z) {
        C229122ms r0;
        if (this.A0M && (!this.A0y.isEmpty()) && (r0 = this.A18) != null) {
            if (!r0.CKB() || this.A0D) {
                AnonymousClass3UH r4 = this.A03;
                if (r4 != null) {
                    A09(this.A0a, this.A17, this.A0Z);
                    List list = 0sn.A00;
                    if (!r4.A08()) {
                        list = r4.A03();
                    } else if (!r4.A07() && (list = r4.A0M) == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    int i = 0;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        it.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            0sr.A1T();
                            throw AnonymousClass00P.createAndThrow();
                        }
                        A09(this.A0V, list.get(i), Integer.valueOf(i));
                        i = i2;
                    }
                    if (z) {
                        this.A1B.A0E("su_added_to_view");
                    }
                    A08(this.A0t, this.A1A);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
    }

    private final boolean A04() {
        Context context = this.A0O;
        UserSession userSession = this.A0T;
        boolean A002 = C267044ar.A00(context, userSession);
        FollowListData followListData = this.A0h;
        if (!2R8.A05(userSession, followListData.A02) || followListData.A00 != C46443Df5.FOLLOWING || this.A10 || !A002) {
            return false;
        }
        return true;
    }

    private final boolean A05() {
        if (!this.A0u.A05()) {
            return false;
        }
        List<User> list = this.A0C;
        if (list.isEmpty() || list.size() > this.A14) {
            return false;
        }
        for (User B6o : list) {
            if (B6o.B6o() == FollowStatus.A06) {
                return true;
            }
        }
        return false;
    }

    public final void A0F(List list) {
        this.A0C.clear();
        this.A0z.clear();
        A0E(list);
    }

    public final void EZ4(int i) {
        this.A0P.A03 = i;
        A0G(false, false);
    }

    public final void FK4() {
        if (this.A0G ^ A05()) {
            A0G(false, false);
        }
        super.FK4();
    }

    public static void A02(C46435Dex dex, C46430Der der, ArrayList arrayList) {
        for (Object next : arrayList) {
            dex.A0C.remove(next);
            dex.A0w.remove(next);
        }
        dex.A0G(false, false);
        0eE r2 = AnonymousClass0t1.A01;
        Integer B6v = r2.A01(C46430Der.A03(der)).A03.B6v();
        if (B6v != null) {
            User A012 = r2.A01(C46430Der.A03(der));
            A012.A03.EX5(Integer.valueOf(B6v.intValue() - arrayList.size()));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: X.FGF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: X.EyX} */
    /* JADX WARNING: type inference failed for: r5v1, types: [X.F0f, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.F0f, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x033b, code lost:
        if (r8.equals(r2.getFullName()) != false) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0347, code lost:
        if (r7.isEmpty() != false) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x040d, code lost:
        if (r0 != null) goto L_0x0044;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G(boolean r12, boolean r13) {
        /*
            r11 = this;
            r11.A06()
            com.instagram.api.schemas.GraphGuardianContent r3 = r11.A02
            if (r3 == 0) goto L_0x004b
            com.instagram.common.session.UserSession r6 = r11.A0T
            java.lang.String r2 = r3.getTitle()
            java.lang.String r1 = r3.Agd()
            java.lang.String r5 = r3.Aiu()
            r0 = 17
            X.FP7 r4 = new X.FP7
            r4.<init>((int) r0, (java.lang.Object) r3, (java.lang.Object) r11)
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.F0f r3 = new X.F0f
            r3.<init>()
            r3.A04 = r2
            r3.A03 = r1
            if (r5 == 0) goto L_0x0042
            int r0 = r5.length()
            if (r0 == 0) goto L_0x0042
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327718152845964(0x810fde00003a8c, double:3.0371334676149856E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0042
            r3.A02 = r5
            r3.A00 = r4
        L_0x0042:
            X.2tm r0 = r11.A0X
        L_0x0044:
            r11.A08(r0, r3)
        L_0x0047:
            r11.A07()
            return
        L_0x004b:
            boolean r0 = r11.A0H
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0149
            java.util.List r0 = r11.A0C
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0149
            java.util.List r0 = r11.A0B
            if (r0 == 0) goto L_0x0063
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0149
        L_0x0063:
            java.lang.String r0 = r11.A07
            if (r0 == 0) goto L_0x006d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0149
        L_0x006d:
            r8 = 1
        L_0x006e:
            boolean r0 = r11.A0L
            r3 = 0
            if (r0 != 0) goto L_0x0082
            boolean r0 = r11.A13
            if (r0 == 0) goto L_0x0082
            if (r8 == 0) goto L_0x007d
            boolean r0 = r11.A0F
            if (r0 == 0) goto L_0x0082
        L_0x007d:
            X.E9R r0 = r11.A0f
            r11.A08(r0, r3)
        L_0x0082:
            r11.A0G = r5
            java.lang.String r7 = r11.A07
            java.lang.String r6 = r11.A06
            if (r6 != 0) goto L_0x008c
            java.lang.String r6 = ""
        L_0x008c:
            boolean r2 = r11.A11
            if (r2 == 0) goto L_0x0106
            if (r7 == 0) goto L_0x0106
            int r0 = r7.length()
            if (r0 == 0) goto L_0x0106
            boolean r0 = r11.A05()
            if (r0 == 0) goto L_0x0139
            X.EAS r0 = r11.A0j
            r11.A08(r0, r7)
            r11.A0G = r4
        L_0x00a5:
            if (r2 != 0) goto L_0x00ac
            X.2s2 r0 = r11.A0P
            r11.A08(r0, r3)
        L_0x00ac:
            X.G9S r0 = r11.A05
            if (r0 == 0) goto L_0x00c2
            int r0 = r0.BnA()
            if (r0 <= 0) goto L_0x00c2
            X.2s2 r0 = r11.A0Q
            r11.A08(r0, r3)
            X.G9S r1 = r11.A05
            X.EB1 r0 = r11.A0d
            r11.A08(r0, r1)
        L_0x00c2:
            boolean r0 = r11.A04()
            if (r8 == 0) goto L_0x0186
            if (r0 == 0) goto L_0x00e5
            com.instagram.common.session.UserSession r6 = r11.A0T
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321091018302561(0x8109d700002461, double:3.0329424410444086E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x00e5
            X.Eqk r2 = new X.Eqk
            r2.<init>()
            X.F2L r1 = r11.A19
            X.EAr r0 = r11.A0i
            r11.A09(r0, r2, r1)
        L_0x00e5:
            boolean r1 = r11.A1D
            android.content.Context r0 = r11.A0O
            if (r1 == 0) goto L_0x016e
            com.instagram.user.recommended.FollowListData r1 = r11.A0h
            X.0qQ.A0B(r0, r5)
            X.0qQ.A0B(r1, r4)
            X.F0f r5 = new X.F0f
            r5.<init>()
            android.content.res.Resources r4 = r0.getResources()
            r0 = 2131231743(0x7f0803ff, float:1.8079576E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A01 = r0
            goto L_0x014c
        L_0x0106:
            boolean r0 = r11.A0L
            if (r0 != 0) goto L_0x010e
            boolean r0 = r11.A13
            if (r0 != 0) goto L_0x00a5
        L_0x010e:
            java.lang.String r6 = r11.A0v
            if (r6 == 0) goto L_0x00a5
            int r0 = r6.length()
            if (r0 <= 0) goto L_0x00a5
            X.2s2 r0 = r11.A0Q
            r11.A08(r0, r3)
            android.content.Context r0 = r11.A0O
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131962605(0x7f132aed, float:1.956194E38)
            android.text.Spanned r0 = X.DbU.A07(r1, r6, r0)
            X.FGF r1 = new X.FGF
            r1.<init>((java.lang.CharSequence) r0)
            r0 = 2132018624(0x7f1405c0, float:1.967556E38)
            r1.A01 = r0
            r1.A06 = r4
            X.Mg4 r0 = r11.A0b
            goto L_0x0144
        L_0x0139:
            com.instagram.user.model.User r0 = r11.A0g
            if (r0 == 0) goto L_0x0418
            X.EyX r1 = new X.EyX
            r1.<init>(r0, r7, r6)
            X.EAF r0 = r11.A0q
        L_0x0144:
            r11.A08(r0, r1)
            goto L_0x00a5
        L_0x0149:
            r8 = 0
            goto L_0x006e
        L_0x014c:
            X.Df5 r2 = r1.A00     // Catch:{ NotFoundException -> 0x0400 }
            X.Df5 r1 = X.C46443Df5.FOLLOWING     // Catch:{ NotFoundException -> 0x0400 }
            r0 = 2131962608(0x7f132af0, float:1.9561946E38)
            if (r2 != r1) goto L_0x0158
            r0 = 2131961616(0x7f132710, float:1.9559934E38)
        L_0x0158:
            java.lang.String r0 = r4.getString(r0)     // Catch:{ NotFoundException -> 0x0400 }
            r5.A04 = r0     // Catch:{ NotFoundException -> 0x0400 }
            r0 = 2131961614(0x7f13270e, float:1.955993E38)
            if (r2 != r1) goto L_0x0166
            r0 = 2131961615(0x7f13270f, float:1.9559932E38)
        L_0x0166:
            java.lang.String r0 = r4.getString(r0)     // Catch:{ NotFoundException -> 0x0400 }
            r5.A03 = r0     // Catch:{ NotFoundException -> 0x0400 }
            goto L_0x0400
        L_0x016e:
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131968486(0x7f1341e6, float:1.9573868E38)
            java.lang.String r1 = r1.getString(r0)
            X.Dez r0 = r11.A0c
            r11.A08(r0, r1)
            r11.A01()
            r11.A03(r13)
            goto L_0x040b
        L_0x0186:
            if (r0 == 0) goto L_0x0194
            X.Eqk r2 = new X.Eqk
            r2.<init>()
            X.F2L r1 = r11.A19
            X.EAr r0 = r11.A0i
            r11.A09(r0, r2, r1)
        L_0x0194:
            boolean r0 = r11.A0E
            if (r0 == 0) goto L_0x01c2
            android.content.Context r0 = r11.A0O
            android.content.res.Resources r8 = r0.getResources()
            r7 = 2131820738(0x7f1100c2, float:1.92742E38)
            int r6 = r11.A00
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()
            java.text.NumberFormat r2 = java.text.NumberFormat.getInstance(r0)
            int r0 = r11.A00
            long r0 = (long) r0
            java.lang.String r0 = r2.format(r0)
            java.lang.String r0 = X.DbV.A0v(r8, r0, r7, r6)
            X.DfA r2 = new X.DfA
            r2.<init>((java.lang.CharSequence) r0)
            X.A5l r1 = r11.A0Z
            X.7fR r0 = r11.A0a
            r11.A09(r0, r2, r1)
        L_0x01c2:
            com.instagram.common.session.UserSession r8 = r11.A0T
            com.instagram.user.recommended.FollowListData r7 = r11.A0h
            java.lang.String r6 = r7.A02
            boolean r0 = X.2R8.A05(r8, r6)
            if (r0 == 0) goto L_0x01fa
            X.Df5 r1 = r7.A00
            X.Df5 r0 = X.C46443Df5.FOLLOWING
            if (r1 == r0) goto L_0x01dc
            X.Df5 r0 = X.C46443Df5.GROUPS
            if (r1 == r0) goto L_0x01dc
            X.Df5 r0 = X.C46443Df5.FOLLOWERS
            if (r1 != r0) goto L_0x01fa
        L_0x01dc:
            java.util.List r0 = r11.A0w
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01fa
            java.util.List r0 = r11.A0B
            if (r0 == 0) goto L_0x01fa
            boolean r0 = r11.A0F
            if (r0 != 0) goto L_0x01fa
            int r1 = r1.ordinal()
            if (r1 == r5) goto L_0x02aa
            if (r1 == r4) goto L_0x027b
            r0 = 6
            if (r1 != r0) goto L_0x0411
            r11.A00()
        L_0x01fa:
            boolean r0 = r11.A10
            if (r0 != 0) goto L_0x0219
            boolean r0 = r11.A0F
            if (r0 != 0) goto L_0x0219
            boolean r0 = X.2R8.A05(r8, r6)
            if (r0 == 0) goto L_0x0219
            X.Df5 r1 = r7.A00
            X.Df5 r0 = X.C46443Df5.FOLLOWING
            if (r1 == r0) goto L_0x0212
            X.Df5 r0 = X.C46443Df5.FOLLOWING_SIMPLIFIED
            if (r1 != r0) goto L_0x0219
        L_0x0212:
            java.lang.String r1 = r11.A09
            X.EAD r0 = r11.A0l
            r11.A08(r0, r1)
        L_0x0219:
            X.Ex9 r1 = r11.A04
            boolean r0 = r11.A0J
            if (r0 == 0) goto L_0x0226
            if (r1 == 0) goto L_0x0226
            X.EAG r0 = r11.A0s
            r11.A08(r0, r1)
        L_0x0226:
            java.util.List r1 = r11.A0w
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x02f8
            boolean r0 = X.2R8.A05(r8, r6)
            if (r0 == 0) goto L_0x02f8
            X.Df5 r2 = r7.A00
            X.Df5 r0 = X.C46443Df5.FOLLOWERS
            if (r2 != r0) goto L_0x02f8
            boolean r0 = r11.A0F
            if (r0 != 0) goto L_0x02f8
            r0 = 2131962564(0x7f132ac4, float:1.9561857E38)
            X.DfA r0 = X.C46448DfA.A00(r0)
            X.A5l r9 = r11.A0Z
            X.7fR r8 = r11.A0a
            r11.A09(r8, r0, r9)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x02e9
            java.util.Iterator r10 = r1.iterator()
        L_0x0256:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x02e9
            com.instagram.user.model.User r7 = X.DbT.A0k(r10)
            X.4Cl r0 = r7.A03
            java.lang.String r6 = r0.Bgn()
            com.google.common.collect.ImmutableList r2 = r7.A09()
            java.util.Set r0 = r11.A0x
            boolean r0 = X.DbV.A1a(r7, r0)
            X.FAU r1 = new X.FAU
            r1.<init>(r2, r6, r0)
            X.DfH r0 = r11.A0k
            r11.A09(r0, r7, r1)
            goto L_0x0256
        L_0x027b:
            r0 = 2131962561(0x7f132ac1, float:1.956185E38)
            X.DfA r2 = X.C46448DfA.A00(r0)
            boolean r0 = r11.A0I
            if (r0 == 0) goto L_0x02a2
            android.content.Context r1 = r11.A0O
            r0 = 2131972971(0x7f13536b, float:1.9582965E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0G = r0
            X.DfL r0 = r11.A0o
            r11.A08(r0, r2)
        L_0x0296:
            r11.A00()
            X.DhA r1 = X.C46568DhA.FULL_WIDTH
            X.EAl r0 = r11.A0W
            r11.A08(r0, r1)
            goto L_0x01fa
        L_0x02a2:
            X.A5l r1 = r11.A0Y
            X.7fR r0 = r11.A0a
            r11.A09(r0, r2, r1)
            goto L_0x0296
        L_0x02aa:
            X.G9S r0 = r11.A05
            if (r0 == 0) goto L_0x02bb
            int r0 = r0.BnA()
            if (r0 <= 0) goto L_0x02bb
            X.DhA r1 = X.C46568DhA.FULL_WIDTH
            X.EAl r0 = r11.A0W
            r11.A08(r0, r1)
        L_0x02bb:
            X.2s2 r9 = r11.A0Q
            r11.A08(r9, r3)
            r0 = 2131962561(0x7f132ac1, float:1.956185E38)
            X.DfA r1 = X.C46448DfA.A00(r0)
            X.A5l r0 = r11.A0Y
            X.7fR r2 = r11.A0a
            r11.A09(r2, r1, r0)
            r11.A00()
            X.DhA r1 = X.C46568DhA.FULL_WIDTH
            X.EAl r0 = r11.A0W
            r11.A08(r0, r1)
            r11.A08(r9, r3)
            r0 = 2131962562(0x7f132ac2, float:1.9561853E38)
            X.DfA r1 = X.C46448DfA.A00(r0)
            X.A5l r0 = r11.A0Z
            r11.A09(r2, r1, r0)
            goto L_0x01fa
        L_0x02e9:
            X.2s2 r0 = r11.A0Q
            r11.A08(r0, r3)
            r0 = 2131962562(0x7f132ac2, float:1.9561853E38)
            X.DfA r0 = X.C46448DfA.A00(r0)
            r11.A09(r8, r0, r9)
        L_0x02f8:
            java.util.List r6 = r11.A0C
            java.util.Iterator r10 = r6.iterator()
        L_0x02fe:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0378
            com.instagram.user.model.User r2 = X.DbT.A0k(r10)
            X.Det r1 = r11.A0u
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x0371
            boolean r0 = r2.A29()
            if (r0 != 0) goto L_0x036e
            java.lang.String r8 = X.DbS.A0o(r2)
        L_0x031a:
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x0369
            boolean r0 = r2.A29()
            if (r0 != 0) goto L_0x0367
            com.google.common.collect.ImmutableList r7 = r2.A09()
        L_0x032a:
            if (r8 == 0) goto L_0x033d
            int r0 = r8.length()
            if (r0 == 0) goto L_0x033d
            java.lang.String r0 = r2.getFullName()
            boolean r0 = r8.equals(r0)
            r9 = 1
            if (r0 == 0) goto L_0x033e
        L_0x033d:
            r9 = 0
        L_0x033e:
            r1.A01 = r9
            if (r7 == 0) goto L_0x0349
            boolean r9 = r7.isEmpty()
            r0 = 0
            if (r9 == 0) goto L_0x034a
        L_0x0349:
            r0 = 1
        L_0x034a:
            r0 = r0 ^ 1
            r1.A00 = r0
            java.util.Set r0 = r11.A0x
            boolean r0 = X.DbV.A1a(r2, r0)
            X.FAU r1 = new X.FAU
            r1.<init>(r7, r8, r0)
            boolean r0 = r11.A1F
            if (r0 != 0) goto L_0x0361
            r1.A01 = r5
            r1.A00 = r4
        L_0x0361:
            X.DfH r0 = r11.A0k
            r11.A09(r0, r2, r1)
            goto L_0x02fe
        L_0x0367:
            r7 = r3
            goto L_0x032a
        L_0x0369:
            com.google.common.collect.ImmutableList r7 = r2.A09()
            goto L_0x032a
        L_0x036e:
            java.lang.String r8 = ""
            goto L_0x031a
        L_0x0371:
            X.4Cl r0 = r2.A03
            java.lang.String r8 = r0.Bgn()
            goto L_0x031a
        L_0x0378:
            boolean r0 = X.AnonymousClass7TE.A1b(r6)
            if (r0 == 0) goto L_0x0387
            if (r12 == 0) goto L_0x0387
            X.DuK r1 = r11.A1B
            java.lang.String r0 = "follow_list_users_added_to_view"
            r1.A0E(r0)
        L_0x0387:
            boolean r0 = r11.A0L
            if (r0 != 0) goto L_0x038f
            boolean r0 = r11.A13
            if (r0 != 0) goto L_0x03ca
        L_0x038f:
            java.lang.String r0 = r11.A0v
            if (r0 == 0) goto L_0x03ca
            int r0 = r0.length()
            if (r0 == 0) goto L_0x03ca
            int r0 = r11.A15
            int r0 = r0 + -50
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            android.content.Context r1 = r11.A0O
            android.content.res.Resources r0 = X.AnonymousClass7TF.A0A(r1)
            java.lang.String r2 = X.C253673rC.A03(r0, r2)
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131962604(0x7f132aec, float:1.9561938E38)
            android.text.Spanned r0 = X.DbU.A07(r1, r2, r0)
            X.FGF r1 = new X.FGF
            r1.<init>((java.lang.CharSequence) r0)
            r0 = 2132018624(0x7f1405c0, float:1.967556E38)
            r1.A01 = r0
            X.2s2 r0 = r11.A0Q
            r11.A08(r0, r3)
            X.Mg4 r0 = r11.A0b
            r11.A08(r0, r1)
        L_0x03ca:
            X.2ms r2 = r11.A18
            boolean r0 = r11.A0D
            if (r0 == 0) goto L_0x03e8
            boolean r0 = r11.A0L
            if (r0 != 0) goto L_0x03e8
            if (r2 == 0) goto L_0x03e8
            boolean r0 = r2.CKB()
            if (r0 == 0) goto L_0x03e8
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            X.DfV r1 = new X.DfV
            r1.<init>(r0)
            X.DfI r0 = r11.A0t
            r11.A08(r0, r1)
        L_0x03e8:
            r11.A01()
            r11.A03(r13)
            boolean r0 = r11.A0D
            if (r0 != 0) goto L_0x040b
            if (r2 == 0) goto L_0x040b
            boolean r0 = r2.CKB()
            if (r0 == 0) goto L_0x040b
            X.2sK r0 = r11.A0e
            r11.A08(r0, r2)
            goto L_0x040b
        L_0x0400:
            X.2tm r0 = r11.A0X
            r11.A08(r0, r5)
            r11.A01()
            r11.A03(r13)
        L_0x040b:
            X.2s2 r0 = r11.A0R
            if (r0 == 0) goto L_0x0047
            goto L_0x0044
        L_0x0411:
            java.lang.String r0 = "Invalid type for user groups in FollowListAdapter."
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x0418:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46435Dex.A0G(boolean, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.2s2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.2s2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v44, types: [X.E9R, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v46, types: [java.lang.Object, X.A5l] */
    /* JADX WARNING: type inference failed for: r0v47, types: [java.lang.Object, X.A5l] */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.2s2, java.lang.Object] */
    public C46435Dex(Activity activity, Context context, AnonymousClass0iw r41, UserSession userSession, AnonymousClass32K r43, G88 g88, G6T g6t, C229122ms r46, G6X g6x, User user, FollowListData followListData, EEF eef, C51960G9g g9g, AnonymousClass32I r52, C49418EvK evK, C46430Der der, C46430Der der2, C46430Der der3, C46430Der der4, C46430Der der5, C46430Der der6, C46430Der der7, C47291DuK duK, C46432Det det, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        AnonymousClass2s2 r2;
        boolean z8;
        long j;
        boolean A1Z;
        String str4;
        C46443Df5 df5;
        C46443Df5 df52;
        C46443Df5 df53;
        UserSession userSession2 = userSession;
        boolean A1Z2 = DbW.A1Z(userSession2);
        String str5 = str3;
        0qQ.A0B(str5, 32);
        Context context2 = context;
        this.A0O = context2;
        Activity activity2 = activity;
        this.A0N = activity2;
        this.A0T = userSession2;
        this.A0g = user;
        AnonymousClass0iw r15 = r41;
        this.A0S = r15;
        FollowListData followListData2 = followListData;
        this.A0h = followListData2;
        this.A18 = r46;
        this.A09 = str;
        this.A10 = z;
        this.A13 = z2;
        this.A15 = i;
        this.A0v = str2;
        this.A1F = z4;
        this.A14 = i2;
        this.A08 = str5;
        this.A1E = z5;
        C46432Det det2 = det;
        this.A0u = det2;
        ? obj = new Object();
        obj.A03 = DbY.A01(context2);
        this.A0Q = obj;
        if (z7) {
            ? obj2 = new Object();
            obj2.A03 = context2.getResources().getDimensionPixelSize(R.dimen.bottom_sheet_survey_thanks_vertical_margin);
            r2 = obj2;
        } else {
            r2 = null;
        }
        this.A0R = r2;
        C46443Df5 df54 = followListData2.A00;
        String str6 = followListData2.A02;
        UserSession userSession3 = userSession2;
        C46443Df5 df55 = df54;
        C46453DfH dfH = new C46453DfH(activity2, context2, r15, userSession3, df55, g9g, det2, str6, z6);
        dfH.A01 = A1Z2;
        dfH.A00 = z3;
        UserSession userSession4 = this.A0T;
        FollowListData followListData3 = this.A0h;
        if (!2R8.A05(userSession4, followListData3.A02) || !((df53 = followListData3.A00) == C46443Df5.FOLLOWING || df53 == C46443Df5.FOLLOWERS)) {
            z8 = false;
        } else {
            z8 = true;
        }
        dfH.A02 = z8;
        this.A0k = dfH;
        this.A0d = new EB1(context2, r15, der);
        this.A0i = new C47631EAr(activity2, context2, (F07) null, r15, userSession2, eef, "unknown");
        this.A0X = new C232472tm(context2);
        this.A0c = new C46437Dez(context2);
        this.A0e = new C231762sK(context2);
        this.A0a = new C336947fR(context2);
        this.A0p = new C47600E9m(context2);
        this.A0b = new C66971Mg4(context2);
        this.A0m = new EAX(context2, r15, userSession2, der6);
        FollowListData followListData4 = this.A0h;
        C46443Df5 df56 = followListData4.A00;
        C46443Df5 df57 = C46443Df5.FOLLOWERS;
        if (df56 == df57 || df56 == C46443Df5.FOLLOWING) {
            UserSession userSession5 = this.A0T;
            boolean A052 = 2R8.A05(userSession5, followListData4.A02);
            0Tu r11 = 0Tu.A05;
            if (A052) {
                j = 36316035842183032L;
            } else {
                j = 36316035842117495L;
            }
            A1Z = DbY.A1Z(r11, userSession5, j);
        } else {
            A1Z = false;
        }
        C46450DfD dfD = new C46450DfD(context2, r15, userSession2, r43, g88, A1Z, A1Z2, false);
        UserSession userSession6 = this.A0T;
        FollowListData followListData5 = this.A0h;
        if (!2R8.A05(userSession6, followListData5.A02) || !((df52 = followListData5.A00) == C46443Df5.FOLLOWING || df52 == df57)) {
            str4 = null;
        } else {
            str4 = r15.getModuleName();
        }
        dfD.A00 = str4;
        this.A0V = dfD;
        C46430Der der8 = der7;
        this.A0U = new C47612E9y(context2, der8);
        this.A0t = new C46454DfI(context2, r52);
        this.A0s = new EAG(context2, evK);
        this.A0l = new EAD(context2, der2);
        if (df54 == df57) {
            df5 = C46443Df5.GROUP_FOLLOWERS;
        } else {
            df5 = C46443Df5.GROUP_FOLLOWING;
        }
        this.A0r = new EAZ(context2, r15, df5, der3);
        this.A0q = new EAF(context2, der5);
        this.A0j = new EAS(context2, der4, det2.A06());
        this.A0o = new C46457DfL(context2, g6t);
        this.A0n = new C46457DfL(context2, (G6T) null);
        ? obj3 = new Object();
        obj3.A00 = g6x;
        this.A0f = obj3;
        this.A0W = new C47625EAl(context2);
        this.A0Z = new Object();
        this.A0Y = new Object();
        C46448DfA A002 = C46448DfA.A00(2131964481);
        boolean z9 = false;
        A002.A02 = 0;
        A002.A0I = false;
        A002.A0G = 02K.A01(context2).getString(2131972971);
        A002.A09 = FP4.A00(der8, 38);
        this.A16 = A002;
        C46448DfA A003 = C46448DfA.A00(2131974681);
        A003.A02 = 0;
        A003.A0I = false;
        this.A17 = A003;
        C46467DfV dfV = new C46467DfV(AnonymousClass05K.A0C);
        dfV.A02 = A1Z2;
        this.A1A = dfV;
        this.A0z = AnonymousClass7TE.A1F();
        this.A0C = AnonymousClass7TE.A1C();
        this.A0y = AnonymousClass7TE.A1F();
        this.A0x = AnonymousClass7TE.A1F();
        this.A0w = AnonymousClass7TE.A1C();
        this.A0A = AnonymousClass7TE.A1C();
        this.A0M = A1Z2;
        this.A0J = A1Z2;
        this.A1B = duK;
        this.A1C = r15.getModuleName();
        AnonymousClass2s2 r37 = this.A0P;
        AnonymousClass2s2 r36 = this.A0Q;
        EAD ead = this.A0l;
        C46457DfL dfL = this.A0o;
        EAD ead2 = ead;
        C46457DfL dfL2 = dfL;
        AnonymousClass2s2 r14 = r37;
        AnonymousClass2s2 r152 = r36;
        ArrayList A1D2 = AnonymousClass7TE.A1D(0sr.A1P(new C231642s0[]{r14, r152, this.A0s, this.A0p, this.A0k, this.A0d, this.A0i, this.A0V, this.A0X, this.A0c, this.A0e, this.A0t, this.A0a, ead2, dfL2, this.A0r, this.A0q, this.A0W, this.A0b, this.A0m, this.A0U, this.A0n}));
        if (z2) {
            A1D2.add(this.A0f);
        }
        if (this.A0u.A05()) {
            A1D2.add(this.A0j);
        }
        AnonymousClass2s2 r0 = this.A0R;
        if (r0 != null) {
            A1D2.add(r0);
        }
        A0A(A1D2);
        this.A11 = df54.A01;
        if (!this.A0F && 2R8.A07(userSession2.A06, str6)) {
            z9 = true;
        }
        this.A1D = z9;
        F2L f2l = new F2L(AnonymousClass05K.A00);
        f2l.A01 = A1Z2;
        this.A19 = f2l;
        this.A12 = this.A0C.isEmpty();
    }
}
