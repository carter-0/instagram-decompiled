package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.api.schemas.GraphGuardianContent;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class E9N extends 2Ru implements C231272rL, AnonymousClass7Q7 {
    public int A00 = 2131968486;
    public int A01;
    public GraphGuardianContent A02;
    public 1Xj A03;
    public C322776wO A04;
    public C322776wO A05;
    public AnonymousClass7Q8 A06;
    public User A07;
    public Integer A08;
    public Integer A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public int A0E = 10;
    public C49128Epr A0F;
    public C47591E9d A0G;
    public EAQ A0H;
    public EAR A0I;
    public C47522E6i A0J;
    public boolean A0K;
    public final Context A0L;
    public final Resources A0M;
    public final UserSession A0N;
    public final C322776wO A0O = new C50985FmY(this, 2);
    public final C47630EAq A0P;
    public final C47632EAs A0Q;
    public final List A0R;
    public final Set A0S;
    public final boolean A0T;
    public final C47609E9v A0U;
    public final AnonymousClass2s2 A0V;
    public final C61490K9v A0W;
    public final C61491K9w A0X;
    public final AnonymousClass71T A0Y;
    public final C46448DfA A0Z = C46448DfA.A00(2131968316);
    public final C46448DfA A0a = C46448DfA.A00(2131961074);
    public final C39695A5l A0b;
    public final C336947fR A0c;
    public final C46437Dez A0d;
    public final C229122ms A0e;
    public final C231762sK A0f;
    public final E9R A0g;
    public final C47599E9l A0h;
    public final C47629EAp A0i;
    public final C49608EzR A0j;
    public final C47628EAo A0k;
    public final C49610EzT A0l;
    public final C49414EvG A0m;
    public final C47627EAn A0n;
    public final String A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final boolean A0r;

    public final Object getAdapter() {
        return this;
    }

    private void A00() {
        AnonymousClass819 r1;
        1Xj r5 = this.A03;
        C61490K9v k9v = this.A0W;
        C229122ms r0 = this.A0e;
        if ((r0 == null || !r0.CKB()) && k9v != null && r5 != null) {
            UserSession userSession = this.A0N;
            boolean z = this.A0p;
            if (C363038ix.A01(userSession)) {
                if (!C363378jd.A08.A04(CallerContext.A01("UserListAdapter"), userSession)) {
                    return;
                }
            }
            boolean A002 = C363558jv.A00(userSession);
            if (z) {
                if (A002) {
                    r1 = AnonymousClass819.ROWSHARE_SINGLE_FEED;
                } else {
                    r1 = AnonymousClass819.ROWSHARE_AUTO_SETTING_FEED;
                }
                if (C367998ru.A03(AnonymousClass818.IG_SELF_FEED_LIKES_SHEET, r1, userSession)) {
                    if (182.A06(0Tu.A05, userSession, 36329723902640418L)) {
                        AnonymousClass5w8.A01(userSession, this.A0L, "likes_sheet");
                    }
                    addModel(new L75(r5, AnonymousClass8PU.A07(userSession), C363558jv.A00(userSession)), k9v);
                    if (!C307936Sb.A00(userSession).A01.get()) {
                        C307936Sb.A00(userSession).A01.set(true);
                    }
                }
            }
        }
    }

    private void A01() {
        Object l57;
        1Xj r5 = this.A03;
        C61491K9w k9w = this.A0X;
        UserSession userSession = this.A0N;
        Integer A022 = C246353eS.A02(userSession);
        if (k9w != null && r5 != null) {
            if ((A022 == null || A022 == AnonymousClass05K.A00) && A02(r5) && C367288qV.A08(userSession)) {
                l57 = new L2V(r5);
            } else if (A022 == AnonymousClass05K.A01 && A02(r5)) {
                if (182.A06(0Tu.A05, userSession, 36329723902705955L)) {
                    C363388je.A00(userSession).A02(CallerContext.A01("UserListAdapter"), (C363658k8) null, AnonymousClass000.A00(1748), false);
                }
                l57 = new L56(r5, false);
            } else if (A022 == AnonymousClass05K.A00 && A02(r5)) {
                l57 = new L57(r5);
            } else {
                return;
            }
            addModel(l57, k9w);
        }
    }

    public final void A04(Collection collection) {
        List list = this.A0R;
        list.addAll(collection);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A0S.add(DbT.A0k(it).getId());
        }
        A03();
    }

    public final void A05(Collection collection) {
        this.A0R.clear();
        this.A0S.clear();
        A04(collection);
    }

    public final boolean AJe(String str) {
        return this.A0S.contains(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r3 = r5.A0N;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A02(X.1Xj r6) {
        /*
            r5 = this;
            com.instagram.model.mediatype.ProductType r1 = r6.A1v()
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.CLIPS
            r4 = 0
            if (r1 != r0) goto L_0x002d
            com.instagram.common.session.UserSession r3 = r5.A0N
            com.instagram.user.model.User r0 = r6.A2A(r3)
            if (r0 == 0) goto L_0x002d
            java.lang.String r1 = r3.A06
            java.lang.String r0 = r0.getId()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002d
            X.3YP r1 = r6.A1k()
            X.3YP r0 = X.AnonymousClass3YP.SHARING
            if (r1 == r0) goto L_0x002e
            X.Dfd r1 = X.C246353eS.A01(r6)
            X.Dfd r0 = X.C46475Dfd.UNSHARED
            if (r1 == r0) goto L_0x002e
        L_0x002d:
            return r4
        L_0x002e:
            X.HPj r0 = X.C59724JVi.A00(r6)
            boolean r0 = r0 instanceof X.KYY
            if (r0 == 0) goto L_0x002d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320300744319194(0x81091f000020da, double:3.0324426685951494E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x002d
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E9N.A02(X.1Xj):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00db, code lost:
        if (X.F8J.A01(r0) == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f2, code lost:
        if (X.F8J.A01(r0) != false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011a, code lost:
        if (r7.A0E != null) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0159, code lost:
        if (X.C46342Dck.A02(r1, r6) == false) goto L_0x015b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r14 = this;
            r14.clear()
            boolean r0 = r14.A0C
            r5 = 0
            if (r0 == 0) goto L_0x001c
            X.E9d r1 = r14.A0G
            boolean r0 = r14.A0r
            if (r0 == 0) goto L_0x0079
            if (r1 == 0) goto L_0x0079
        L_0x0010:
            int r0 = r14.A0E
            if (r5 >= r0) goto L_0x0079
            X.Epr r0 = r14.A0F
            r14.addModel(r0, r1)
            int r5 = r5 + 1
            goto L_0x0010
        L_0x001c:
            com.instagram.user.model.User r2 = r14.A07
            boolean r0 = r14.A0B
            r4 = 1
            if (r0 == 0) goto L_0x0043
            if (r2 == 0) goto L_0x0043
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            X.EAs r0 = r14.A0Q
            r14.addModel(r2, r1, r0)
            android.content.Context r1 = r14.A0L
            r0 = 2131952116(0x7f1301f4, float:1.9540666E38)
            java.lang.String r0 = X.DbY.A0b(r1, r2, r0)
            X.DfA r2 = new X.DfA
            r2.<init>((java.lang.CharSequence) r0)
            X.A5l r1 = r14.A0b
            X.7fR r0 = r14.A0c
            r14.addModel(r2, r1, r0)
        L_0x0043:
            boolean r0 = r14.A0A
            if (r0 == 0) goto L_0x007d
            X.72b r5 = new X.72b
            r5.<init>()
            r0 = 2131238366(0x7f081dde, float:1.8093009E38)
            r5.A02 = r0
            android.content.res.Resources r1 = r14.A0M
            r0 = 2131962464(0x7f132a60, float:1.9561654E38)
            java.lang.String r0 = r1.getString(r0)
            r5.A0D = r0
            r0 = 2131962462(0x7f132a5e, float:1.956165E38)
            java.lang.String r0 = r1.getString(r0)
            r5.A07 = r0
            r0 = 2131962463(0x7f132a5f, float:1.9561652E38)
            java.lang.String r0 = r1.getString(r0)
            r5.A0C = r0
            X.6wO r0 = r14.A04
        L_0x0070:
            r5.A06 = r0
        L_0x0072:
            X.6rr r1 = X.C320156rr.EMPTY
            X.71T r0 = r14.A0Y
            r14.addModel(r5, r1, r0)
        L_0x0079:
            r14.notifyDataSetChangedSmart()
            return
        L_0x007d:
            boolean r0 = r14.A0D
            if (r0 == 0) goto L_0x0094
            X.72b r5 = new X.72b
            r5.<init>()
            android.content.res.Resources r1 = r14.A0M
            r0 = 2131956381(0x7f13129d, float:1.9549316E38)
            java.lang.String r0 = r1.getString(r0)
            r5.A07 = r0
            r5.A0M = r4
            goto L_0x0072
        L_0x0094:
            com.instagram.api.schemas.GraphGuardianContent r1 = r14.A02
            if (r1 == 0) goto L_0x00c9
            X.72b r5 = new X.72b
            r5.<init>()
            java.lang.String r0 = r1.getTitle()
            r5.A0D = r0
            java.lang.String r0 = r1.Agd()
            r5.A07 = r0
            java.lang.String r4 = r1.Aiu()
            if (r4 == 0) goto L_0x0072
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0072
            com.instagram.common.session.UserSession r3 = r14.A0N
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327718152845964(0x810fde00003a8c, double:3.0371334676149856E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0072
            r5.A0C = r4
            X.6wO r0 = r14.A05
            goto L_0x0070
        L_0x00c9:
            X.1Xj r2 = r14.A03
            r3 = 0
            if (r2 == 0) goto L_0x00dd
            boolean r0 = r14.A0T
            if (r0 == 0) goto L_0x02cf
            com.instagram.common.session.UserSession r0 = r14.A0N
            X.0qQ.A0B(r0, r5)
            boolean r0 = X.F8J.A01(r0)
            if (r0 != 0) goto L_0x02cf
        L_0x00dd:
            X.E9R r0 = r14.A0g
            if (r0 == 0) goto L_0x00e4
            r14.addModel(r3, r0)
        L_0x00e4:
            boolean r0 = r14.A0T
            if (r0 == 0) goto L_0x00f4
            com.instagram.common.session.UserSession r0 = r14.A0N
            X.0qQ.A0B(r0, r5)
            boolean r0 = X.F8J.A01(r0)
            r1 = 1
            if (r0 == 0) goto L_0x00f5
        L_0x00f4:
            r1 = 0
        L_0x00f5:
            X.1Xj r0 = r14.A03
            if (r1 == 0) goto L_0x02ae
            if (r0 == 0) goto L_0x02ab
            X.1Xy r0 = r0.A0C
            java.lang.Integer r0 = r0.Bd0()
        L_0x0101:
            X.1Xj r9 = r14.A03
            if (r9 == 0) goto L_0x0136
            if (r0 == 0) goto L_0x0136
            X.EzT r8 = r14.A0l
            int r0 = r0.intValue()
            r8.A00 = r0
            X.E6i r7 = r14.A0J
            if (r7 == 0) goto L_0x0131
            java.lang.CharSequence r0 = r7.A0D
            if (r0 != 0) goto L_0x011c
            java.lang.CharSequence r0 = r7.A0E
            r6 = 0
            if (r0 == 0) goto L_0x011d
        L_0x011c:
            r6 = 1
        L_0x011d:
            java.lang.Integer r2 = r7.A0F
            com.instagram.common.session.UserSession r1 = r14.A0N
            X.3Yk r0 = X.C243353Yk.A00
            boolean r0 = r0.A05(r1, r9, r2, r6)
            r8.A02 = r0
            java.lang.CharSequence r0 = r7.A0D
            if (r0 != 0) goto L_0x012f
            java.lang.CharSequence r0 = r7.A0E
        L_0x012f:
            r8.A01 = r0
        L_0x0131:
            X.EAq r0 = r14.A0P
            r14.addModel(r8, r3, r0)
        L_0x0136:
            X.1Xj r6 = r14.A03
            java.util.List r0 = r14.A0R
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0163
            if (r6 == 0) goto L_0x0163
            X.EzR r2 = r14.A0j
            int r0 = r14.A01
            r2.A00 = r0
            com.instagram.common.session.UserSession r1 = r14.A0N
            X.3Yk r0 = X.C243353Yk.A00
            boolean r0 = r0.A04(r1, r6)
            r2.A01 = r0
            if (r0 != 0) goto L_0x015b
            boolean r1 = X.C46342Dck.A02(r1, r6)
            r0 = 1
            if (r1 != 0) goto L_0x015c
        L_0x015b:
            r0 = 0
        L_0x015c:
            r2.A03 = r0
            X.EAo r0 = r14.A0k
            r14.addModel(r2, r3, r0)
        L_0x0163:
            com.instagram.common.session.UserSession r6 = r14.A0N
            X.0qQ.A0B(r6, r5)
            boolean r0 = X.F8J.A01(r6)
            if (r0 != 0) goto L_0x017d
            X.1Xj r1 = r14.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.F3m r1 = X.C335997dt.A00(r6, r1, r0, r0)
            if (r1 == 0) goto L_0x017d
            X.EAQ r0 = r14.A0H
            r14.addModel(r1, r0)
        L_0x017d:
            X.1Xj r1 = r14.A03
            if (r1 == 0) goto L_0x01b1
            java.lang.Integer r0 = r14.A09
            if (r0 == 0) goto L_0x01b1
            int r7 = r0.intValue()
            boolean r0 = X.2R8.A02(r6, r1)
            if (r0 == 0) goto L_0x01b1
            boolean r0 = r1.A5T()
            if (r0 != r4) goto L_0x01b1
            java.lang.String r2 = r1.A30()
            X.1Xy r0 = r1.A0C
            X.DTf r0 = r0.At2()
            if (r0 == 0) goto L_0x01b1
            java.lang.String r0 = r0.C5t()
            if (r0 == 0) goto L_0x01b1
            X.Drj r1 = new X.Drj
            r1.<init>(r2, r7, r0)
            X.EAR r0 = r14.A0I
            r14.addModel(r1, r0)
        L_0x01b1:
            boolean r9 = r14.A0K
            if (r9 == 0) goto L_0x01b8
            r14.A01()
        L_0x01b8:
            X.0Tu r8 = X.0Tu.A05
            r1 = 36329865636626794(0x8111d20002416a, double:3.0384915450052056E-306)
            boolean r0 = X.182.A06(r8, r6, r1)
            if (r0 == 0) goto L_0x01c8
            r14.A00()
        L_0x01c8:
            java.util.List r11 = r14.A0R
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x024b
            X.1Xj r0 = r14.A03
            if (r0 == 0) goto L_0x01e0
            X.1Xy r0 = r0.A0C
            java.lang.Integer r0 = r0.CEg()
            if (r0 == 0) goto L_0x01e0
            int r0 = r14.A01
            if (r0 <= 0) goto L_0x01ed
        L_0x01e0:
            android.content.res.Resources r4 = r14.A0M
            int r0 = r14.A00
            java.lang.String r4 = r4.getString(r0)
            X.Dez r0 = r14.A0d
            r14.addModel(r4, r0)
        L_0x01ed:
            java.lang.Integer r7 = r14.A08
            X.2ms r5 = r14.A0e
            if (r5 == 0) goto L_0x0213
            boolean r0 = r5.CKB()
            if (r0 != 0) goto L_0x0213
            if (r7 == 0) goto L_0x0213
            int r0 = r7.intValue()
            if (r0 <= 0) goto L_0x0213
            X.1Xj r0 = r14.A03
            if (r0 == 0) goto L_0x0213
            java.lang.String r0 = r0.A2q()
            X.Evu r4 = new X.Evu
            r4.<init>(r7, r0)
            X.E9v r0 = r14.A0U
            r14.addModel(r4, r3, r0)
        L_0x0213:
            boolean r0 = X.182.A06(r8, r6, r1)
            if (r0 != 0) goto L_0x021c
            r14.A00()
        L_0x021c:
            if (r5 == 0) goto L_0x0224
            boolean r0 = r5.CKB()
            if (r0 != 0) goto L_0x023b
        L_0x0224:
            boolean r0 = X.F8J.A01(r6)
            if (r0 != 0) goto L_0x023b
            X.1Xj r2 = r14.A03
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.F3m r1 = X.C335997dt.A00(r6, r2, r1, r0)
            if (r1 == 0) goto L_0x023b
            X.EAQ r0 = r14.A0H
            r14.addModel(r1, r0)
        L_0x023b:
            if (r9 != 0) goto L_0x0240
            r14.A01()
        L_0x0240:
            boolean r0 = r14.A0q
            if (r0 == 0) goto L_0x0079
            X.2s2 r0 = r14.A0V
            r14.addModel(r3, r0)
            goto L_0x0079
        L_0x024b:
            r13 = 0
            r12 = 0
        L_0x024d:
            int r0 = r11.size()
            if (r5 >= r0) goto L_0x029a
            com.instagram.user.model.User r10 = X.DbS.A0g(r11, r5)
            if (r5 != 0) goto L_0x027d
            X.4Cl r0 = r10.A03
            java.lang.Boolean r0 = r0.CYC()
            if (r0 == 0) goto L_0x027d
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x027d
            X.DfA r7 = r14.A0Z
            X.A5l r4 = r14.A0b
            X.7fR r0 = r14.A0c
            r14.addModel(r7, r4, r0)
            r13 = 1
        L_0x0271:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            X.EAs r0 = r14.A0Q
            r14.addModel(r10, r4, r0)
            int r5 = r5 + 1
            goto L_0x024d
        L_0x027d:
            if (r12 != 0) goto L_0x0271
            if (r13 == 0) goto L_0x0271
            X.4Cl r0 = r10.A03
            java.lang.Boolean r0 = r0.CYC()
            if (r0 == 0) goto L_0x028f
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0271
        L_0x028f:
            X.DfA r7 = r14.A0a
            X.A5l r4 = r14.A0b
            X.7fR r0 = r14.A0c
            r14.addModel(r7, r4, r0)
            r12 = 1
            goto L_0x0271
        L_0x029a:
            X.2ms r4 = r14.A0e
            if (r4 == 0) goto L_0x01ed
            boolean r0 = r4.CKB()
            if (r0 == 0) goto L_0x01ed
            X.2sK r0 = r14.A0f
            r14.addModel(r4, r0)
            goto L_0x01ed
        L_0x02ab:
            r0 = r3
            goto L_0x0101
        L_0x02ae:
            if (r0 == 0) goto L_0x0136
            X.1Xy r0 = r0.A0C
            java.lang.Integer r0 = r0.CEg()
            if (r0 == 0) goto L_0x0136
            X.EvG r1 = r14.A0m
            X.1Xj r0 = r14.A03
            X.1Xy r0 = r0.A0C
            java.lang.Integer r0 = r0.CEg()
            int r0 = r0.intValue()
            r1.A00 = r0
            X.EAn r0 = r14.A0n
            r14.addModel(r1, r3, r0)
            goto L_0x0136
        L_0x02cf:
            com.instagram.common.session.UserSession r6 = r14.A0N
            java.lang.String r1 = r14.A0o
            X.AnonymousClass7TF.A1B(r6, r5, r1)
            boolean r0 = X.F8J.A01(r6)
            if (r0 == 0) goto L_0x0314
            java.lang.String r0 = "self_likers"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0314
            boolean r0 = X.C49911FEj.A00(r2)
            if (r0 != 0) goto L_0x0314
        L_0x02ea:
            boolean r0 = X.F8J.A01(r6)
            if (r0 == 0) goto L_0x02ff
            boolean r0 = X.C49911FEj.A00(r2)
            if (r0 == 0) goto L_0x02ff
            X.EzR r1 = r14.A0j
            r1.A02 = r4
            X.EAo r0 = r14.A0k
            r14.addModel(r1, r3, r0)
        L_0x02ff:
            boolean r0 = X.F8J.A01(r6)
            if (r0 == 0) goto L_0x0327
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329865636561257(0x8111d200014169, double:3.03849154496376E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0327
            goto L_0x0163
        L_0x0314:
            X.EAp r1 = r14.A0i
            r1.getClass()
            X.E9R r0 = r14.A0g
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r14.addModel(r2, r0, r1)
            goto L_0x02ea
        L_0x0327:
            X.E9R r0 = r14.A0g
            if (r0 == 0) goto L_0x0163
            r14.addModel(r3, r0)
            goto L_0x0163
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E9N.A03():void");
    }

    public final void FK4() {
        notifyDataSetChangedSmart();
    }

    public final void updateListView() {
        notifyDataSetChangedSmart();
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [java.lang.Object, X.EvG] */
    /* JADX WARNING: type inference failed for: r0v14, types: [X.EzR, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v17, types: [java.lang.Object, X.A5l] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.2s2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v46, types: [X.E9R, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v51, types: [java.lang.Object, X.Epr] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public E9N(android.content.Context r30, X.AnonymousClass4DH r31, X.FAF r32, X.AnonymousClass0iw r33, com.instagram.common.session.UserSession r34, X.C322776wO r35, X.C229122ms r36, X.G6X r37, X.AnonymousClass71G r38, X.F1t r39, X.C49423EvP r40, X.C47522E6i r41, X.C47522E6i r42, X.C47522E6i r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52) {
        /*
            r29 = this;
            r4 = 1
            r19 = 0
            r0 = r52
            r10 = r29
            r10.<init>(r0)
            r0 = 2131968316(0x7f13413c, float:1.9573523E38)
            X.DfA r0 = X.C46448DfA.A00(r0)
            r10.A0Z = r0
            r0 = 2131961074(0x7f1324f2, float:1.9558835E38)
            X.DfA r0 = X.C46448DfA.A00(r0)
            r10.A0a = r0
            r0 = 10
            r10.A0E = r0
            r1 = 2
            X.FmY r0 = new X.FmY
            r0.<init>(r10, r1)
            r10.A0O = r0
            r0 = 2131968486(0x7f1341e6, float:1.9573868E38)
            r10.A00 = r0
            r0 = r49
            r10.setHasStableIds(r0)
            r9 = r30
            r10.A0L = r9
            r8 = r34
            r10.A0N = r8
            android.content.res.Resources r0 = r9.getResources()
            r10.A0M = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r10.A0R = r0
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r10.A0S = r0
            r2 = r41
            r10.A0J = r2
            r0 = r35
            r10.A05 = r0
            X.EvG r0 = new X.EvG
            r0.<init>()
            r10.A0m = r0
            X.EzR r0 = new X.EzR
            r0.<init>()
            r10.A0j = r0
            X.EzT r0 = new X.EzT
            r0.<init>(r8)
            r10.A0l = r0
            r0 = r36
            r10.A0e = r0
            X.A5l r0 = new X.A5l
            r0.<init>()
            r10.A0b = r0
            r0 = r45
            r10.A0C = r0
            r0 = r46
            r10.A0q = r0
            r1 = r47
            r10.A0T = r1
            r5 = r51
            r10.A0K = r5
            r0 = r48
            r10.A0p = r0
            r20 = r50
            r0 = r20
            r10.A0r = r0
            if (r50 == 0) goto L_0x009e
            X.E9d r0 = new X.E9d
            r0.<init>(r9)
            r10.A0G = r0
            X.Epr r0 = new X.Epr
            r0.<init>()
            r10.A0F = r0
        L_0x009e:
            r3 = r33
            java.lang.String r0 = r3.getModuleName()
            r10.A0o = r0
            java.lang.Integer r26 = X.AnonymousClass05K.A00
            X.EAs r18 = new X.EAs
            r25 = r38
            r27 = r44
            r21 = r18
            r22 = r9
            r23 = r3
            r24 = r8
            r28 = r5
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            r0 = r18
            r10.A0Q = r0
            r0.A02 = r4
            X.E9v r17 = new X.E9v
            r4 = r32
            r0 = r17
            r0.<init>(r9, r4)
            r10.A0U = r0
            X.EAq r16 = new X.EAq
            r0 = r16
            r0.<init>(r9, r3, r8)
            r10.A0P = r0
            X.E9l r14 = new X.E9l
            r14.<init>(r9)
            r10.A0h = r14
            X.EAn r13 = new X.EAn
            r13.<init>(r9)
            r10.A0n = r13
            X.EAo r12 = new X.EAo
            r12.<init>(r9, r8)
            r10.A0k = r12
            if (r41 == 0) goto L_0x01f6
            X.EAp r11 = new X.EAp
            r11.<init>(r9, r8, r2, r1)
        L_0x00f1:
            r10.A0i = r11
            X.EAQ r0 = new X.EAQ
            r1 = r39
            r0.<init>(r3, r8, r1)
            r10.A0H = r0
            X.EAR r0 = new X.EAR
            r1 = r40
            r0.<init>(r3, r8, r1)
            r10.A0I = r0
            X.7fR r7 = new X.7fR
            r7.<init>(r9)
            r10.A0c = r7
            X.Dez r6 = new X.Dez
            r6.<init>(r9)
            r10.A0d = r6
            X.2sK r5 = new X.2sK
            r5.<init>(r9)
            r10.A0f = r5
            X.71T r4 = new X.71T
            r4.<init>(r9)
            r10.A0Y = r4
            X.2s2 r3 = new X.2s2
            r3.<init>()
            r10.A0V = r3
            r15 = r31
            if (r31 == 0) goto L_0x01f3
            r0 = r42
            if (r42 == 0) goto L_0x01f3
            X.K9v r2 = new X.K9v
            r2.<init>(r9, r15, r8, r0)
        L_0x0135:
            r10.A0W = r2
            if (r31 == 0) goto L_0x01f0
            r0 = r43
            if (r43 == 0) goto L_0x01f0
            X.K9w r1 = new X.K9w
            r1.<init>(r9, r15, r8, r0)
        L_0x0142:
            r10.A0X = r1
            android.content.res.Resources r0 = r9.getResources()
            r15 = 2131165354(0x7f0700aa, float:1.7944923E38)
            int r0 = r0.getDimensionPixelSize(r15)
            r3.A03 = r0
            java.util.ArrayList r15 = X.DbV.A14(r18)
            r0 = r17
            r15.add(r0)
            r0 = r16
            r15.add(r0)
            r15.add(r14)
            r15.add(r13)
            r15.add(r12)
            if (r11 == 0) goto L_0x016d
            r15.add(r11)
        L_0x016d:
            X.EAQ r0 = r10.A0H
            r15.add(r0)
            X.EAR r0 = r10.A0I
            r15.add(r0)
            r15.add(r7)
            r15.add(r6)
            r15.add(r5)
            r15.add(r4)
            r15.add(r3)
            if (r50 == 0) goto L_0x018d
            X.E9d r0 = r10.A0G
            r15.add(r0)
        L_0x018d:
            if (r2 == 0) goto L_0x0192
            r15.add(r2)
        L_0x0192:
            if (r1 == 0) goto L_0x0197
            r15.add(r1)
        L_0x0197:
            r1 = r37
            if (r37 == 0) goto L_0x01ec
            X.E9R r0 = new X.E9R
            r0.<init>()
            r0.A00 = r1
            r10.A0g = r0
            r15.add(r0)
        L_0x01a7:
            int r0 = r15.size()
            X.2s0[] r0 = new X.C231642s0[r0]
            java.lang.Object[] r0 = r15.toArray(r0)
            X.2s0[] r0 = (X.C231642s0[]) r0
            r10.init(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329723902705955(0x8111b100024123, double:3.03840191190295E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 != 0) goto L_0x01d9
            X.8jd r4 = X.C363388je.A00(r8)
            java.lang.String r0 = "UserListAdapter"
            com.facebook.common.callercontext.CallerContext r3 = com.facebook.common.callercontext.CallerContext.A01(r0)
            r0 = 1748(0x6d4, float:2.45E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r1 = 0
            r0 = r19
            r4.A02(r3, r1, r2, r0)
        L_0x01d9:
            X.7Q8 r0 = new X.7Q8
            r0.<init>(r9, r8, r10)
            r10.A06 = r0
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r8)
            java.lang.Class<X.36g> r1 = X.C2370836g.class
            X.7Q8 r0 = r10.A06
            r2.A01(r0, r1)
            return
        L_0x01ec:
            r0 = 0
            r10.A0g = r0
            goto L_0x01a7
        L_0x01f0:
            r1 = 0
            goto L_0x0142
        L_0x01f3:
            r2 = 0
            goto L_0x0135
        L_0x01f6:
            r11 = 0
            goto L_0x00f1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E9N.<init>(android.content.Context, X.4DH, X.FAF, X.0iw, com.instagram.common.session.UserSession, X.6wO, X.2ms, X.G6X, X.71G, X.F1t, X.EvP, X.E6i, X.E6i, X.E6i, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
