package X;

import android.content.Context;
import android.widget.Filter;
import android.widget.Filterable;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.7eF  reason: invalid class name and case insensitive filesystem */
public final class C336207eF extends C331047Ph implements C229122ms, C337237fw, Filterable {
    public 1Xj A00;
    public C337257fy A01;
    public Runnable A02 = null;
    public boolean A03 = false;
    public boolean A04 = false;
    public Filter A05;
    public final C336407eZ A06;
    public final 0Rd A07;
    public final C336367eV A08;
    public final C336377eW A09;
    public final C337257fy A0A;
    public final C337257fy A0B;
    public final C337257fy A0C;
    public final C337257fy A0D;
    public final C337257fy A0E;
    public final C336947fR A0F;
    public final C231762sK A0G;

    public static C336207eF A01(Context context, AnonymousClass0iw r13, C228602lw r14, UserSession userSession, 1Xj r16, String str) {
        return A00(context, (C334397bC) null, r13, r14, userSession, (C336397eY) null, r16, (C336187eD) null, (Runnable) null, str, (List) null, false, false, false, false);
    }

    public final boolean CKB() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.7eT] */
    public static C336207eF A00(Context context, C334397bC r28, AnonymousClass0iw r29, C228602lw r30, UserSession userSession, C336397eY r32, 1Xj r33, C336187eD r34, Runnable runnable, String str, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        String str2;
        C336297eO r13;
        String str3 = str;
        if ("comment_composer_page".equals(str3)) {
            str2 = "coefficient_rank_recipient_user_suggestion";
        } else {
            str2 = "autocomplete_user_list";
        }
        UserSession userSession2 = userSession;
        C336297eO r14 = null;
        boolean z5 = z;
        C228602lw r6 = r30;
        List list2 = list;
        C336297eO A002 = C336237eI.A00((1UV) null, userSession2, r6, new C336217eG(userSession2, str3), str2, list2, z5);
        1Xj r10 = r33;
        if (r33 == null || !AnonymousClass4CM.A00(userSession2).A02(r10)) {
            r13 = null;
        } else {
            String A2n = r10.A1e(userSession2).A2n();
            A2n.getClass();
            AfD afD = new AfD(userSession2, r10);
            0qQ.A0B(userSession2, 0);
            r13 = new C336297eO(r6, new Af7(userSession2, str2, A2n, list2), new C336247eJ(r6, afD), true, false);
            r14 = new C336297eO(r6, new Af8(userSession2, str2, A2n, list2), new C336247eJ(r6, new AfE(userSession2, str3)), z5, true);
        }
        return new C336207eF(context, r28, r29, userSession2, r32, r10, C336317eQ.A00(userSession2, r6, str3), A002, r13, r14, new C336357eU(userSession2, new Object()), r34, runnable, str3, z2, z3, z4);
    }

    public final boolean CJz() {
        C337257fy r0 = this.A01;
        if (r0 != null) {
            return ((List) r0.Bo1()).isEmpty();
        }
        return false;
    }

    public final boolean CT5() {
        C337257fy r0 = this.A01;
        if (r0 == null || !r0.CT5()) {
            return false;
        }
        return true;
    }

    public final boolean CWV() {
        C337257fy r0 = this.A01;
        if (r0 == null) {
            return false;
        }
        if (r0.isLoading() || this.A01.CT5()) {
            return true;
        }
        return false;
    }

    public final void CgO() {
        C337257fy r1 = this.A01;
        if (r1 != null && r1.CT5()) {
            r1.EJE();
        }
    }

    public final Filter getFilter() {
        Filter filter = this.A05;
        if (filter != null) {
            return filter;
        }
        C336417ea r0 = new C336417ea(this);
        this.A05 = r0;
        return r0;
    }

    public final boolean isLoading() {
        C337257fy r0 = this.A01;
        if (r0 == null || !r0.isLoading()) {
            return false;
        }
        return true;
    }

    public C336207eF(Context context, C334397bC r15, AnonymousClass0iw r16, UserSession userSession, C336397eY r18, 1Xj r19, C337257fy r20, C337257fy r21, C337257fy r22, C337257fy r23, C337257fy r24, C336187eD r25, Runnable runnable, String str, boolean z, boolean z2, boolean z3) {
        this.A00 = r19;
        UserSession userSession2 = userSession;
        this.A07 = AnonymousClass4CM.A00(userSession2);
        this.A0D = r20;
        this.A0E = r21;
        this.A0B = r22;
        this.A0A = r23;
        this.A0C = r24;
        AnonymousClass0iw r8 = r16;
        C336367eV r5 = new C336367eV(context, r8, userSession2, z);
        this.A08 = r5;
        C336377eW r6 = new C336377eW(context, r8, userSession2, r18, r25, str);
        this.A09 = r6;
        C231762sK r4 = new C231762sK(context);
        this.A0G = r4;
        C336947fR r3 = new C336947fR(context);
        this.A0F = r3;
        C336407eZ r0 = new C336407eZ(r8, userSession2, this.A00, new WeakReference(r15));
        this.A06 = r0;
        this.A03 = z2;
        this.A02 = runnable;
        this.A04 = z3;
        A0B(r5, r6, r4, r3, r0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f8, code lost:
        if (r0 == false) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dam(X.C337257fy r7) {
        /*
            r6 = this;
            r6.A06()
            X.7fy r5 = r6.A0E
            if (r7 != r5) goto L_0x0043
            X.1Xj r1 = r6.A00
            if (r1 == 0) goto L_0x0025
            X.0Rd r0 = r6.A07
            boolean r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0025
            r0 = 2131969339(0x7f13453b, float:1.9575598E38)
            X.DfA r2 = new X.DfA
            r2.<init>((int) r0)
            X.A5l r1 = new X.A5l
            r1.<init>()
            X.7fR r0 = r6.A0F
            r6.A09(r0, r2, r1)
        L_0x0025:
            r5.getClass()
            X.7eW r2 = r6.A09
        L_0x002a:
            java.lang.Object r0 = r5.Bo1()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x0034:
            boolean r0 = r1.hasNext()
            r4 = 0
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r0 = r1.next()
            r6.A09(r2, r0, r4)
            goto L_0x0034
        L_0x0043:
            X.7fy r5 = r6.A0D
            if (r7 != r5) goto L_0x004d
            r5.getClass()
            X.7eV r2 = r6.A08
            goto L_0x002a
        L_0x004d:
            X.7fy r0 = r6.A0B
            if (r7 != r0) goto L_0x00b8
            r0 = 1
        L_0x0052:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r5 = r0.booleanValue()
            r4 = 0
            if (r5 == 0) goto L_0x0072
            boolean r0 = r7.isLoading()
            if (r0 != 0) goto L_0x0069
            boolean r0 = r7.CT5()
            if (r0 == 0) goto L_0x0072
        L_0x0069:
            X.2sK r0 = r6.A0G
            r6.A09(r0, r6, r4)
        L_0x006e:
            r6.A07()
        L_0x0071:
            return
        L_0x0072:
            java.lang.Object r0 = r7.Bo1()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r3 = r0.iterator()
        L_0x007c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r2 = r3.next()
            boolean r0 = r2 instanceof X.C46448DfA
            if (r0 == 0) goto L_0x0095
            X.A5l r1 = new X.A5l
            r1.<init>()
            X.7fR r0 = r6.A0F
        L_0x0091:
            r6.A09(r0, r2, r1)
            goto L_0x007c
        L_0x0095:
            boolean r0 = r2 instanceof com.instagram.user.model.User
            if (r0 == 0) goto L_0x009d
            r1 = 0
            X.7eW r0 = r6.A09
            goto L_0x0091
        L_0x009d:
            r0 = 24
            boolean r0 = X.C61080JwI.A02(r0, r2)
            if (r0 == 0) goto L_0x007c
            X.7eZ r0 = r6.A06
            r6.A08(r0, r2)
            goto L_0x007c
        L_0x00ab:
            if (r5 != 0) goto L_0x006e
            boolean r0 = r7.isLoading()
            if (r0 != 0) goto L_0x0069
            boolean r0 = r7.CT5()
            goto L_0x00f8
        L_0x00b8:
            X.7fy r0 = r6.A0A
            if (r7 != r0) goto L_0x00be
            r0 = 0
            goto L_0x0052
        L_0x00be:
            X.7fy r5 = r6.A0C
            if (r7 != r5) goto L_0x0071
            r5.getClass()
            java.lang.Object r0 = r5.Bo1()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r3 = r0.iterator()
        L_0x00cf:
            boolean r0 = r3.hasNext()
            r4 = 0
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r2 = r3.next()
            X.9IV r2 = (X.AnonymousClass9IV) r2
            java.lang.Object r1 = r2.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r1 = r2.A00
            X.7eV r0 = r6.A08
            r6.A09(r0, r1, r4)
            goto L_0x00cf
        L_0x00ee:
            boolean r0 = r5.isLoading()
            if (r0 != 0) goto L_0x0069
            boolean r0 = r5.CT5()
        L_0x00f8:
            if (r0 == 0) goto L_0x006e
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C336207eF.Dam(X.7fy):void");
    }
}
