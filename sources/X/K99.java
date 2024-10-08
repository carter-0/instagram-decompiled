package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.ProductCollection;
import java.util.HashSet;
import java.util.List;

public final class K99 extends C331047Ph {
    public 28D A00;
    public EyO A01;
    public ProductCollection A02 = null;
    public Boolean A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final UserSession A0C;
    public final C47633EAt A0D;
    public final C66971Mg4 A0E;
    public final C66971Mg4 A0F;
    public final List A0G = AnonymousClass7TE.A1C();
    public final List A0H = AnonymousClass7TE.A1C();
    public final List A0I = AnonymousClass7TE.A1C();
    public final List A0J = AnonymousClass7TE.A1C();
    public final List A0K = AnonymousClass7TE.A1C();
    public final List A0L = AnonymousClass7TE.A1C();
    public final C47595E9h A0M;
    public final C61475K9g A0N;
    public final C61471K9c A0O;
    public final C63665L2b A0P;
    public final C63665L2b A0Q;
    public final C61472K9d A0R;
    public final C61472K9d A0S;
    public final C46448DfA A0T;
    public final C46448DfA A0U;
    public final C46448DfA A0V;
    public final C46448DfA A0W;
    public final C46448DfA A0X;
    public final C46448DfA A0Y;
    public final C39695A5l A0Z = new Object();
    public final C336947fR A0a;

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.A5l] */
    public K99(Context context, AnonymousClass0iw r25, UserSession userSession, C66571MXb mXb, Integer num, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4) {
        C63665L2b l2b = new C63665L2b();
        this.A0Q = l2b;
        C63665L2b l2b2 = new C63665L2b();
        this.A0P = l2b2;
        this.A0A = true;
        this.A08 = true;
        this.A07 = false;
        this.A01 = null;
        this.A00 = 28D.A5J;
        Context context2 = context;
        this.A0B = context2;
        UserSession userSession2 = userSession;
        this.A0C = userSession2;
        boolean z5 = z4;
        this.A05 = z5;
        String str7 = str5;
        AnonymousClass0iw r7 = r25;
        C66571MXb mXb2 = mXb;
        Integer num2 = num;
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        C66571MXb mXb3 = mXb2;
        C66571MXb mXb4 = mXb2;
        C47633EAt eAt = new C47633EAt(context2, r7, userSession2, mXb2, mXb3, mXb4, num2, str8, str9, str10, str11, str7, str6, z, z2, z3, z5);
        this.A0D = eAt;
        Integer num3 = AnonymousClass05K.A01;
        boolean z6 = false;
        if (num2 == num3) {
            z6 = true;
            l2b.A00 = num3;
        }
        l2b2.A00 = AnonymousClass05K.A00;
        C61472K9d k9d = new C61472K9d(r7, mXb2);
        this.A0S = k9d;
        C61472K9d k9d2 = new C61472K9d(r7, mXb2);
        this.A0R = k9d2;
        C61475K9g k9g = new C61475K9g(r7, mXb2, z6);
        this.A0N = k9g;
        C61471K9c k9c = new C61471K9c(context2, mXb2);
        this.A0O = k9c;
        C336947fR r14 = new C336947fR(context2);
        this.A0a = r14;
        C66971Mg4 mg4 = new C66971Mg4(context2);
        this.A0F = mg4;
        C66971Mg4 mg42 = new C66971Mg4(context2);
        this.A0E = mg42;
        C47595E9h e9h = new C47595E9h(context2);
        this.A0M = e9h;
        A0B(eAt, k9d, k9d2, k9g, k9c, r14, mg4, mg42, e9h);
        this.A0U = new C46448DfA(2131974956);
        this.A0X = new C46448DfA(2131974959);
        C46448DfA dfA = new C46448DfA(2131974726);
        dfA.A04 = R.style.igds_emphasized_body_1;
        this.A0W = dfA;
        this.A0V = new C46448DfA(2131974958);
        this.A0T = new C46448DfA(2131974954);
        this.A0Y = new C46448DfA(2131974962);
    }

    public final void A0D(List list) {
        List list2 = this.A0L;
        list2.clear();
        this.A0K.clear();
        this.A02 = null;
        list2.addAll(AnonymousClass7TE.A1D(new HashSet(list)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        if (r15.A08 == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        if (r1 != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        r5 = r15.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        if (r5.isEmpty() != false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0081, code lost:
        if (r5.size() != r6.size()) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
        if (r15.A0J.isEmpty() == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008b, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008c, code lost:
        if (r2 == false) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008e, code lost:
        r2 = java.lang.Boolean.TRUE.equals(r15.A03);
        r1 = X.JTQ.A0R(r7, r4);
        r0 = r15.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009c, code lost:
        if (r1 != r3) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        if (r2 == false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a0, code lost:
        r1 = 2131969773;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a3, code lost:
        if (r0 == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a5, code lost:
        r1 = 2131969766;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a8, code lost:
        r3 = new X.FGF((java.lang.CharSequence) r15.A0B.getString(r1));
        r3.A01 = com.instagram.android.R.style.igds_body_1;
        A09(r15.A0a, r15.A0T, r15.A0Z);
        r8 = r15.A0F;
        A08(r8, r3);
        r10 = X.AnonymousClass7TE.A1C();
        r4 = X.AnonymousClass7TE.A1C();
        r3 = 0;
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d4, code lost:
        if (r9 >= r5.size()) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d6, code lost:
        r12 = (com.instagram.tagging.model.Tag) r5.get(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e7, code lost:
        if (r12.getId().equals(r15.A04) != false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ed, code lost:
        if (r6.isEmpty() != false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f3, code lost:
        if (X.JTQ.A1S(r12, r6) == false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f5, code lost:
        r1 = X.JTQ.A1S(r12, r15.A0G);
        r0 = java.lang.Boolean.valueOf(r1);
        r7 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0100, code lost:
        if (r1 == false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0102, code lost:
        r7 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0103, code lost:
        r7.add(new android.util.Pair(new X.C61066Jw4(r12, true, r0.booleanValue()), java.lang.Integer.valueOf(r9)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0118, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011b, code lost:
        r1 = 2131969772;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011e, code lost:
        if (r0 == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0120, code lost:
        r1 = 2131969771;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0124, code lost:
        if (r2 == false) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0126, code lost:
        r1 = 2131970964;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0129, code lost:
        if (r0 == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012b, code lost:
        r1 = 2131965813;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0130, code lost:
        r1 = 2131970963;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0133, code lost:
        if (r0 == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0135, code lost:
        r1 = 2131965814;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013f, code lost:
        r9 = r15.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0141, code lost:
        if (r9 == false) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0147, code lost:
        if (r10.isEmpty() != false) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0149, code lost:
        r1 = new X.FGF(2131956267);
        r1.A01 = com.instagram.android.R.style.igds_emphasized_body_1;
        A08(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0159, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015e, code lost:
        if (r7 >= r10.size()) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0160, code lost:
        r0 = (android.util.Pair) r10.get(r7);
        A09(r15.A0D, r0.first, r0.second);
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0172, code lost:
        if (r9 == false) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0178, code lost:
        if (r4.isEmpty() != false) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x017a, code lost:
        r1 = new X.FGF(2131956266);
        r1.A01 = com.instagram.android.R.style.igds_emphasized_body_1;
        A08(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018e, code lost:
        if (r3 >= r4.size()) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0190, code lost:
        r0 = (android.util.Pair) r4.get(r3);
        A09(r15.A0D, r0.first, r0.second);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a8, code lost:
        if (r14 == false) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ac, code lost:
        if (r15.A0A == false) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ae, code lost:
        A09(r15.A0a, r15.A0Y, r15.A0Z);
        r4 = false;
        r10 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C() {
        /*
            r15 = this;
            r15.A06()
            boolean r0 = r15.A06
            if (r0 == 0) goto L_0x002b
            java.util.List r0 = r15.A0L
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x013a
            java.util.List r0 = r15.A0J
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x013a
            java.util.List r0 = r15.A0K
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x002b
            r0 = 2131969872(0x7f134750, float:1.957668E38)
        L_0x0022:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.K9c r0 = r15.A0O
            r15.A08(r0, r1)
        L_0x002b:
            boolean r0 = r15.A09
            if (r0 == 0) goto L_0x0048
            java.util.List r0 = r15.A0L
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x003f
            java.util.List r0 = r15.A0J
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0048
        L_0x003f:
            X.DfA r2 = r15.A0U
            X.A5l r1 = r15.A0Z
            X.7fR r0 = r15.A0a
            r15.A09(r0, r2, r1)
        L_0x0048:
            com.instagram.common.session.UserSession r7 = r15.A0C
            X.0eE r4 = X.AnonymousClass0t1.A01
            java.lang.Integer r0 = X.JTQ.A0R(r7, r4)
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            r14 = 1
            boolean r13 = X.AnonymousClass7TF.A1W(r0, r3)
            X.28D r1 = r15.A00
            java.lang.Boolean r0 = r15.A03
            boolean r1 = X.LTZ.A0F(r1, r7, r0)
            java.util.List r6 = r15.A0I
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x006e
            if (r1 == 0) goto L_0x01a2
            boolean r0 = r15.A08
            r2 = 1
            if (r0 != 0) goto L_0x0071
        L_0x006e:
            r2 = 0
            if (r1 == 0) goto L_0x01a2
        L_0x0071:
            java.util.List r5 = r15.A0L
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0083
            int r1 = r5.size()
            int r0 = r6.size()
            if (r1 != r0) goto L_0x008c
        L_0x0083:
            java.util.List r0 = r15.A0J
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x008c
            r14 = 0
        L_0x008c:
            if (r2 == 0) goto L_0x01a8
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r15.A03
            boolean r2 = r1.equals(r0)
            java.lang.Integer r1 = X.JTQ.A0R(r7, r4)
            boolean r0 = r15.A0A
            if (r1 != r3) goto L_0x0124
            if (r2 == 0) goto L_0x011b
            r1 = 2131969773(0x7f1346ed, float:1.9576478E38)
            if (r0 == 0) goto L_0x00a8
            r1 = 2131969766(0x7f1346e6, float:1.9576464E38)
        L_0x00a8:
            android.content.Context r0 = r15.A0B
            java.lang.String r0 = r0.getString(r1)
            X.FGF r3 = new X.FGF
            r3.<init>((java.lang.CharSequence) r0)
            r0 = 2132018624(0x7f1405c0, float:1.967556E38)
            r3.A01 = r0
            X.DfA r2 = r15.A0T
            X.A5l r1 = r15.A0Z
            X.7fR r0 = r15.A0a
            r15.A09(r0, r2, r1)
            X.Mg4 r8 = r15.A0F
            r15.A08(r8, r3)
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            r3 = 0
            r9 = 0
        L_0x00d0:
            int r0 = r5.size()
            if (r9 >= r0) goto L_0x013f
            java.lang.Object r12 = r5.get(r9)
            com.instagram.tagging.model.Tag r12 = (com.instagram.tagging.model.Tag) r12
            java.lang.String r1 = r12.getId()
            java.lang.String r0 = r15.A04
            boolean r0 = r1.equals(r0)
            r11 = 1
            if (r0 != 0) goto L_0x00f5
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0118
            boolean r0 = X.JTQ.A1S(r12, r6)
            if (r0 == 0) goto L_0x0118
        L_0x00f5:
            java.util.List r0 = r15.A0G
            boolean r1 = X.JTQ.A1S(r12, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r7 = r4
            if (r1 == 0) goto L_0x0103
            r7 = r10
        L_0x0103:
            boolean r0 = r0.booleanValue()
            X.Jw4 r2 = new X.Jw4
            r2.<init>((com.instagram.tagging.model.Tag) r12, (boolean) r11, (boolean) r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            r7.add(r0)
        L_0x0118:
            int r9 = r9 + 1
            goto L_0x00d0
        L_0x011b:
            r1 = 2131969772(0x7f1346ec, float:1.9576476E38)
            if (r0 == 0) goto L_0x00a8
            r1 = 2131969771(0x7f1346eb, float:1.9576474E38)
            goto L_0x00a8
        L_0x0124:
            if (r2 == 0) goto L_0x0130
            r1 = 2131970964(0x7f134b94, float:1.9578894E38)
            if (r0 == 0) goto L_0x00a8
            r1 = 2131965813(0x7f133775, float:1.9568446E38)
            goto L_0x00a8
        L_0x0130:
            r1 = 2131970963(0x7f134b93, float:1.9578892E38)
            if (r0 == 0) goto L_0x00a8
            r1 = 2131965814(0x7f133776, float:1.9568449E38)
            goto L_0x00a8
        L_0x013a:
            r0 = 2131974936(0x7f135b18, float:1.958695E38)
            goto L_0x0022
        L_0x013f:
            boolean r9 = r15.A05
            if (r9 == 0) goto L_0x0159
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0159
            r0 = 2131956267(0x7f13122b, float:1.9549085E38)
            X.FGF r1 = new X.FGF
            r1.<init>((int) r0)
            r0 = 2132018629(0x7f1405c5, float:1.967557E38)
            r1.A01 = r0
            r15.A08(r8, r1)
        L_0x0159:
            r7 = 0
        L_0x015a:
            int r0 = r10.size()
            if (r7 >= r0) goto L_0x0172
            java.lang.Object r0 = r10.get(r7)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r2 = r0.first
            java.lang.Object r1 = r0.second
            X.EAt r0 = r15.A0D
            r15.A09(r0, r2, r1)
            int r7 = r7 + 1
            goto L_0x015a
        L_0x0172:
            if (r9 == 0) goto L_0x018a
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x018a
            r0 = 2131956266(0x7f13122a, float:1.9549083E38)
            X.FGF r1 = new X.FGF
            r1.<init>((int) r0)
            r0 = 2132018629(0x7f1405c5, float:1.967557E38)
            r1.A01 = r0
            r15.A08(r8, r1)
        L_0x018a:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x01a8
            java.lang.Object r0 = r4.get(r3)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r2 = r0.first
            java.lang.Object r1 = r0.second
            X.EAt r0 = r15.A0D
            r15.A09(r0, r2, r1)
            int r3 = r3 + 1
            goto L_0x018a
        L_0x01a2:
            java.util.List r5 = r15.A0L
            boolean r4 = r15.A08
            r10 = 0
            goto L_0x01b9
        L_0x01a8:
            if (r14 == 0) goto L_0x022e
            boolean r0 = r15.A0A
            if (r0 == 0) goto L_0x022e
            X.DfA r2 = r15.A0Y
            X.A5l r1 = r15.A0Z
            X.7fR r0 = r15.A0a
            r15.A09(r0, r2, r1)
            r4 = 0
            r10 = 1
        L_0x01b9:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r15.A03
            boolean r9 = r1.equals(r0)
            r3 = 0
        L_0x01c2:
            int r0 = r5.size()
            if (r3 >= r0) goto L_0x022e
            java.lang.Object r8 = r5.get(r3)
            com.instagram.tagging.model.Tag r8 = (com.instagram.tagging.model.Tag) r8
            java.lang.String r1 = r8.getId()
            java.lang.String r0 = r15.A04
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01e6
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x022c
            boolean r0 = X.JTQ.A1S(r8, r6)
            if (r0 == 0) goto L_0x022c
        L_0x01e6:
            r7 = 1
            if (r4 == 0) goto L_0x021f
        L_0x01e9:
            java.util.List r0 = r15.A0G
            boolean r0 = X.JTQ.A1S(r8, r0)
            X.Jw4 r2 = new X.Jw4
            r2.<init>((com.instagram.tagging.model.Tag) r8, (boolean) r7, (boolean) r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            X.EAt r0 = r15.A0D
            r15.A09(r0, r2, r1)
            if (r9 == 0) goto L_0x0201
            if (r13 == 0) goto L_0x021f
        L_0x0201:
            if (r7 == 0) goto L_0x021f
            if (r10 != 0) goto L_0x021f
            if (r9 != 0) goto L_0x0222
            r1 = 2131970962(0x7f134b92, float:1.957889E38)
            if (r13 == 0) goto L_0x020f
            r1 = 2131969771(0x7f1346eb, float:1.9576474E38)
        L_0x020f:
            android.content.Context r0 = r15.A0B
            java.lang.String r0 = r0.getString(r1)
        L_0x0215:
            X.FGF r1 = new X.FGF
            r1.<init>((java.lang.CharSequence) r0)
            X.Mg4 r0 = r15.A0E
            r15.A08(r0, r1)
        L_0x021f:
            int r3 = r3 + 1
            goto L_0x01c2
        L_0x0222:
            android.content.Context r1 = r15.A0B
            r0 = 2131969766(0x7f1346e6, float:1.9576464E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0215
        L_0x022c:
            r7 = 0
            goto L_0x01e9
        L_0x022e:
            java.util.List r6 = r15.A0J
            int r5 = r5.size()
            r4 = 0
            r3 = 0
        L_0x0236:
            int r0 = r6.size()
            if (r3 >= r0) goto L_0x0255
            java.lang.Object r1 = r6.get(r3)
            com.instagram.tagging.model.Tag r1 = (com.instagram.tagging.model.Tag) r1
            int r0 = r5 + r3
            X.Jw4 r2 = new X.Jw4
            r2.<init>((com.instagram.tagging.model.Tag) r1, (boolean) r4, (boolean) r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.EAt r0 = r15.A0D
            r15.A09(r0, r2, r1)
            int r3 = r3 + 1
            goto L_0x0236
        L_0x0255:
            boolean r0 = r15.A09
            if (r0 == 0) goto L_0x026a
            java.util.List r0 = r15.A0K
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x026a
            X.DfA r2 = r15.A0X
            X.A5l r1 = r15.A0Z
            X.7fR r0 = r15.A0a
            r15.A09(r0, r2, r1)
        L_0x026a:
            java.util.List r0 = r15.A0K
            java.util.Iterator r3 = r0.iterator()
        L_0x0270:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0282
            com.instagram.user.model.Product r2 = X.JTS.A0Y(r3)
            X.L2b r1 = r15.A0Q
            X.K9d r0 = r15.A0S
            r15.A09(r0, r2, r1)
            goto L_0x0270
        L_0x0282:
            com.instagram.user.model.ProductCollection r3 = r15.A02
            if (r3 == 0) goto L_0x0298
            boolean r0 = r15.A09
            if (r0 == 0) goto L_0x0293
            X.DfA r2 = r15.A0V
            X.A5l r1 = r15.A0Z
            X.7fR r0 = r15.A0a
            r15.A09(r0, r2, r1)
        L_0x0293:
            X.K9g r0 = r15.A0N
            r15.A08(r0, r3)
        L_0x0298:
            java.util.List r3 = r15.A0H
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x02bf
            X.DfA r2 = r15.A0W
            X.A5l r1 = r15.A0Z
            X.7fR r0 = r15.A0a
            r15.A09(r0, r2, r1)
            java.util.Iterator r3 = r3.iterator()
        L_0x02ad:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02bf
            java.lang.Object r2 = r3.next()
            X.L2b r1 = r15.A0P
            X.K9d r0 = r15.A0R
            r15.A09(r0, r2, r1)
            goto L_0x02ad
        L_0x02bf:
            boolean r0 = r15.A07
            if (r0 == 0) goto L_0x02cf
            X.EyO r0 = r15.A01
            X.Ev9 r1 = new X.Ev9
            r1.<init>(r0)
            X.E9h r0 = r15.A0M
            r15.A08(r0, r1)
        L_0x02cf:
            r15.A07()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K99.A0C():void");
    }
}
