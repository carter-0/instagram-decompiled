package X;

import android.content.Context;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class K9I extends 2Ru implements CallerContextable {
    public static final String __redex_internal_original_name = "DirectPrivateStoryRecipientsAdapter";
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Integer A04;
    public List A05 = AnonymousClass7TE.A1C();
    public boolean A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Context A0A;
    public final UserSession A0B;
    public final C61486K9r A0C;
    public final C61488K9t A0D;
    public final C61469K9a A0E;
    public final C61483K9o A0F;
    public final C66574MXf A0G;
    public final K9Q A0H;
    public final C47615EAb A0I;
    public final C47615EAb A0J;
    public final K9L A0K;
    public final L4U A0L;
    public final C251033mS A0M;
    public final C250993mO A0N;
    public final C363008it A0O;
    public final C63668L2e A0P;
    public final C63668L2e A0Q;
    public final C63668L2e A0R;
    public final C61473K9e A0S;
    public final String A0T;
    public final LinkedHashSet A0U = DbS.A0y();
    public final LinkedHashSet A0V = DbS.A0y();
    public final LinkedHashSet A0W = DbS.A0y();
    public final LinkedHashSet A0X = DbS.A0y();
    public final LinkedHashSet A0Y = DbS.A0y();
    public final LinkedList A0Z = new LinkedList();
    public final Map A0a = AnonymousClass7TE.A1E();
    public final Map A0b = AnonymousClass7TE.A1E();
    public final Map A0c = AnonymousClass7TE.A1E();
    public final Set A0d = AnonymousClass7TE.A1F();
    public final Set A0e = DbS.A0y();
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final AnonymousClass2s2 A0j;
    public final C61482K9n A0k;
    public final C61481K9m A0l;
    public final C61487K9s A0m;
    public final K9M A0n;
    public final DirectShareTarget A0o;
    public final C47625EAl A0p;
    public final C63668L2e A0q;
    public final NLV A0r;
    public final C66890MeV A0s;
    public final EAC A0t;
    public final Map A0u;
    public final Set A0v = AnonymousClass7TE.A1F();
    public final Set A0w = AnonymousClass7TE.A1F();
    public final Set A0x = AnonymousClass7TE.A1F();
    public final boolean A0y;
    public final boolean A0z;

    private void A00(C231642s0 r4, Object obj) {
        C51967G9n.A1O(r4, this.A0a, getCount());
        addModel(obj, (Object) null, r4);
    }

    public static void A01(K9I k9i) {
        k9i.A0w.clear();
        k9i.A0x.clear();
        k9i.A0v.clear();
    }

    private void A02(DirectShareTarget directShareTarget) {
        Set set;
        Object A002;
        List unmodifiableList = Collections.unmodifiableList(directShareTarget.A0Q);
        if (unmodifiableList.size() == 1) {
            if (directShareTarget.A01() instanceof MsysThreadId) {
                set = this.A0v;
            } else {
                set = this.A0x;
            }
            A002 = ((PendingRecipient) unmodifiableList.get(0)).getId();
        } else {
            set = this.A0w;
            A002 = directShareTarget.A00();
        }
        set.add(A002);
    }

    private boolean A03(DirectShareTarget directShareTarget) {
        Set set;
        Object obj;
        List unmodifiableList = Collections.unmodifiableList(directShareTarget.A0Q);
        if (unmodifiableList.size() == 1) {
            boolean z = directShareTarget.A01() instanceof MsysThreadId;
            set = this.A0x;
            obj = ((PendingRecipient) unmodifiableList.get(0)).getId();
            if (z) {
                if (!set.contains(obj) || !this.A0v.contains(((PendingRecipient) unmodifiableList.get(0)).getId())) {
                    return false;
                }
                return true;
            }
        } else {
            set = this.A0w;
            obj = directShareTarget.A00();
        }
        return set.contains(obj);
    }

    private boolean A04(DirectShareTarget directShareTarget) {
        if (!this.A0z || !this.A0N.A0A(directShareTarget, this.A0M)) {
            return false;
        }
        return true;
    }

    public final int A05(TextView textView) {
        Set set = this.A0d;
        if (!set.isEmpty()) {
            int size = set.size();
            0qQ.A0B(textView, 0);
            return Math.max(C64012LIz.A01(textView, new int[]{2131960307, 2131960311, 2131975851}, 0), C64012LIz.A01(textView, new int[]{2131960307, 2131960311, 2131975851}, size));
        }
        0qQ.A0B(textView, 0);
        return C64012LIz.A00(textView, AnonymousClass05K.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009d, code lost:
        if (r0.A0O.A06() == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012f, code lost:
        if (r2.contains(com.instagram.pendingmedia.model.UserStoryTarget.A01) == false) goto L_0x0131;
     */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03bb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06() {
        /*
            r27 = this;
            r0 = r27
            r0.clear()
            X.MeV r2 = r0.A0s
            X.NLV r1 = r0.A0r
            r0.A00(r1, r2)
            A01(r0)
            X.K9s r4 = r0.A0m
            r14 = 0
            if (r4 == 0) goto L_0x008d
            android.content.Context r6 = r0.A0A
            r1 = 2131974240(0x7f135860, float:1.9585538E38)
            java.lang.String r1 = r6.getString(r1)
            X.L2e r2 = new X.L2e
            r2.<init>(r1)
            X.K9e r1 = r0.A0S
            r0.A00(r1, r2)
            com.instagram.common.session.UserSession r9 = r0.A0B
            X.0eE r8 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r3 = r8.A01(r9)
            X.MXf r7 = r0.A0G
            com.google.common.collect.ImmutableSet r1 = r7.B2X()
            com.instagram.pendingmedia.model.UserStoryTarget r2 = com.instagram.pendingmedia.model.UserStoryTarget.A01
            boolean r1 = r1.contains(r2)
            java.lang.String r5 = r0.A0T
            X.FV6 r1 = X.FV6.A01(r6, r2, r3, r5, r1)
            r0.A00(r4, r1)
            r14 = 1
            X.K9M r2 = r0.A0n
            java.lang.Integer r1 = r0.A04
            if (r1 == 0) goto L_0x0051
            if (r2 == 0) goto L_0x0051
            r0.A00(r2, r1)
            r14 = 2
        L_0x0051:
            X.K9n r4 = r0.A0k
            if (r4 == 0) goto L_0x006c
            com.instagram.pendingmedia.model.UserStoryTarget r3 = com.instagram.pendingmedia.model.UserStoryTarget.A02
            com.instagram.user.model.User r2 = r8.A01(r9)
            com.google.common.collect.ImmutableSet r1 = r7.B2X()
            boolean r1 = r1.contains(r3)
            X.FV6 r1 = X.FV6.A01(r6, r3, r2, r5, r1)
            r0.A00(r4, r1)
            int r14 = r14 + 1
        L_0x006c:
            X.K9m r4 = r0.A0l
            if (r4 == 0) goto L_0x008d
            boolean r1 = X.AnonymousClass2o2.A00(r9)
            if (r1 == 0) goto L_0x008d
            com.instagram.user.model.User r3 = r8.A01(r9)
            com.google.common.collect.ImmutableSet r1 = r7.B2X()
            com.instagram.pendingmedia.model.UserStoryTarget r2 = com.instagram.pendingmedia.model.UserStoryTarget.A03
            boolean r1 = r1.contains(r2)
            X.FV6 r1 = X.FV6.A01(r6, r2, r3, r5, r1)
            r0.A00(r4, r1)
            int r14 = r14 + 1
        L_0x008d:
            boolean r1 = r0.A0y
            if (r1 == 0) goto L_0x0138
            boolean r2 = r0.A0f
            r9 = 1
            if (r2 == 0) goto L_0x009f
            X.8it r1 = r0.A0O
            boolean r1 = r1.A06()
            r3 = 1
            if (r1 != 0) goto L_0x00a0
        L_0x009f:
            r3 = 0
        L_0x00a0:
            if (r2 == 0) goto L_0x03be
            X.MXf r1 = r0.A0G
            com.google.common.collect.ImmutableSet r2 = r1.B2X()
            com.instagram.pendingmedia.model.UserStoryTarget r1 = com.instagram.pendingmedia.model.UserStoryTarget.A01
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x03be
            if (r3 != 0) goto L_0x03be
        L_0x00b2:
            X.MXf r3 = r0.A0G
            com.google.common.collect.ImmutableSet r1 = r3.B2X()
            X.3kO r6 = r1.iterator()
        L_0x00bc:
            boolean r1 = r6.hasNext()
            r5 = 1
            if (r1 == 0) goto L_0x03bb
            java.lang.Object r4 = r6.next()
            com.instagram.pendingmedia.model.UserStoryTarget r4 = (com.instagram.pendingmedia.model.UserStoryTarget) r4
            com.instagram.pendingmedia.model.UserStoryTarget r1 = com.instagram.pendingmedia.model.UserStoryTarget.A01
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0101
            java.lang.String r2 = r4.CAh()
            java.lang.String r1 = "ALL_WITH_BLACKLIST"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0101
            com.instagram.pendingmedia.model.UserStoryTarget r1 = com.instagram.pendingmedia.model.UserStoryTarget.A02
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0101
            java.lang.String r2 = r4.CAh()
            java.lang.String r1 = "CLOSE_FRIENDS_WITH_BLACKLIST"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0101
            com.instagram.pendingmedia.model.UserStoryTarget r1 = com.instagram.pendingmedia.model.UserStoryTarget.A09
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0101
            com.instagram.pendingmedia.model.UserStoryTarget r1 = com.instagram.pendingmedia.model.UserStoryTarget.A03
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00bc
        L_0x0101:
            r2 = 1
        L_0x0102:
            boolean r1 = r0.A0g
            if (r1 == 0) goto L_0x03b8
            android.content.Context r1 = r0.A0A
            boolean r1 = X.0oI.A0C(r1)
            if (r1 == 0) goto L_0x03b8
            if (r2 == 0) goto L_0x03b8
        L_0x0110:
            com.google.common.collect.ImmutableSet r2 = r3.B2X()
            X.K9r r6 = r0.A0C
            if (r6 == 0) goto L_0x0131
            X.L4U r1 = r0.A0L
            if (r1 == 0) goto L_0x0131
            java.lang.String r1 = r1.A00
            if (r1 == 0) goto L_0x0131
            android.content.Context r1 = r0.A0A
            boolean r1 = X.0oI.A0C(r1)
            if (r1 == 0) goto L_0x0131
            com.instagram.pendingmedia.model.UserStoryTarget r1 = com.instagram.pendingmedia.model.UserStoryTarget.A01
            boolean r1 = r2.contains(r1)
            r8 = 1
            if (r1 != 0) goto L_0x0132
        L_0x0131:
            r8 = 0
        L_0x0132:
            if (r9 != 0) goto L_0x0367
            if (r5 != 0) goto L_0x0367
            if (r8 != 0) goto L_0x0367
        L_0x0138:
            com.instagram.model.direct.DirectShareTarget r11 = r0.A0o
            if (r11 == 0) goto L_0x0175
            X.L2e r2 = r0.A0q
            X.K9e r1 = r0.A0S
            r0.A00(r1, r2)
            android.content.Context r9 = r0.A0A
            com.instagram.common.session.UserSession r10 = r0.A0B
            boolean r17 = r0.A07(r11)
            boolean r18 = r0.A04(r11)
            java.lang.String r12 = r0.A0T
            X.3mO r2 = r0.A0N
            X.3mS r1 = r0.A0M
            boolean r20 = r2.A0B(r11, r1)
            r13 = 1
            r15 = 0
            r16 = -1
            r19 = r15
            X.FV6 r2 = X.FV6.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.DcN r1 = r2.A08
            boolean r1 = X.AnonymousClass7TF.A1V(r1)
            r0.A06 = r1
            int r14 = r14 + 1
            X.EAb r1 = r0.A0J
            r0.A00(r1, r2)
            r0.A02(r11)
        L_0x0175:
            java.util.LinkedHashSet r7 = r0.A0X
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L_0x01ed
            java.util.LinkedHashSet r1 = r0.A0U
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x01ed
            java.util.Set r1 = r0.A0d
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x01ed
            r20 = r14
        L_0x018f:
            int r10 = r20 - r14
            boolean r1 = r0.A0h
            if (r1 == 0) goto L_0x03c1
            java.util.LinkedHashSet r1 = r0.A0V
            java.util.Iterator r6 = r1.iterator()
            r2 = 0
            r21 = 0
        L_0x019e:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x03c1
            java.lang.Object r3 = r6.next()
            com.instagram.model.direct.DirectShareTarget r3 = (com.instagram.model.direct.DirectShareTarget) r3
            boolean r1 = r0.A03(r3)
            if (r1 != 0) goto L_0x019e
            if (r2 != 0) goto L_0x01b9
            X.L2e r2 = r0.A0P
            X.K9e r1 = r0.A0S
            r0.A00(r1, r2)
        L_0x01b9:
            android.content.Context r15 = r0.A0A
            com.instagram.common.session.UserSession r5 = r0.A0B
            r19 = 30
            boolean r23 = r0.A07(r3)
            boolean r24 = r0.A04(r3)
            r25 = 1
            java.lang.String r4 = r0.A0T
            r22 = -1
            X.3mO r2 = r0.A0N
            X.3mS r1 = r0.A0M
            boolean r26 = r2.A0B(r3, r1)
            r17 = r3
            r18 = r4
            r16 = r5
            X.FV6 r2 = X.FV6.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r20 = r20 + 1
            int r21 = r21 + 1
            X.EAb r1 = r0.A0J
            r0.A00(r1, r2)
            r0.A02(r3)
            r2 = 1
            goto L_0x019e
        L_0x01ed:
            X.K9Q r2 = r0.A0H
            r1 = 0
            r0.A00(r2, r1)
            java.util.LinkedList r1 = r0.A0Z
            java.util.Iterator r6 = r1.iterator()
            r20 = r14
            r21 = 0
        L_0x01fd:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x023c
            java.lang.Object r3 = r6.next()
            com.instagram.model.direct.DirectShareTarget r3 = (com.instagram.model.direct.DirectShareTarget) r3
            android.content.Context r15 = r0.A0A
            com.instagram.common.session.UserSession r4 = r0.A0B
            r19 = 6
            boolean r23 = r0.A07(r3)
            boolean r24 = r0.A04(r3)
            r25 = 0
            java.lang.String r2 = r0.A0T
            r22 = -1
            X.3mO r5 = r0.A0N
            X.3mS r1 = r0.A0M
            boolean r26 = r5.A0B(r3, r1)
            r17 = r3
            r18 = r2
            r16 = r4
            X.FV6 r2 = X.FV6.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.EAb r1 = r0.A0I
            r0.A00(r1, r2)
            int r20 = r20 + 1
            int r21 = r21 + 1
            r0.A02(r3)
            goto L_0x01fd
        L_0x023c:
            java.util.LinkedHashSet r1 = r0.A0U
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r1)
            java.util.Collections.reverse(r1)
            java.util.Iterator r6 = r1.iterator()
        L_0x0249:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0288
            java.lang.Object r3 = r6.next()
            com.instagram.model.direct.DirectShareTarget r3 = (com.instagram.model.direct.DirectShareTarget) r3
            android.content.Context r15 = r0.A0A
            com.instagram.common.session.UserSession r4 = r0.A0B
            r19 = 5
            boolean r23 = r0.A07(r3)
            int r21 = r20 - r14
            boolean r24 = r0.A04(r3)
            r25 = 0
            java.lang.String r2 = r0.A0T
            r22 = -1
            X.3mO r5 = r0.A0N
            X.3mS r1 = r0.A0M
            boolean r26 = r5.A0B(r3, r1)
            r17 = r3
            r18 = r2
            r16 = r4
            X.FV6 r2 = X.FV6.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r20 = r20 + 1
            X.EAb r1 = r0.A0J
            r0.A00(r1, r2)
            r0.A02(r3)
            goto L_0x0249
        L_0x0288:
            X.K9o r6 = r0.A0F
            if (r6 == 0) goto L_0x0304
            java.util.Set r5 = r0.A0d
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L_0x0304
            android.content.Context r1 = r0.A0A
            com.instagram.common.session.UserSession r9 = r0.A0B
            r8 = 0
            X.0qQ.A0B(r1, r8)
            boolean r4 = X.DbW.A1Y(r9)
            int r1 = r5.size()
            if (r1 <= r4) goto L_0x0506
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.util.Iterator r13 = r5.iterator()
            r2 = 0
        L_0x02af:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x02f6
            java.lang.Object r12 = r13.next()
            com.instagram.model.direct.DirectShareTarget r12 = (com.instagram.model.direct.DirectShareTarget) r12
            java.util.List r1 = r12.A0Q
            java.util.List r11 = X.C51966G9m.A1J(r1)
            int r10 = r11.size()
            boolean r1 = r12.A0M()
            if (r1 == 0) goto L_0x02e2
            java.lang.String r1 = r12.A0I
            if (r1 != 0) goto L_0x02d1
            java.lang.String r1 = ""
        L_0x02d1:
            r3.append(r1)
            int r2 = r2 + 1
            int r1 = r5.size()
            if (r2 >= r1) goto L_0x02af
            java.lang.String r1 = ", "
            r3.append(r1)
            goto L_0x02af
        L_0x02e2:
            if (r10 != r4) goto L_0x02ed
            java.lang.Object r1 = r11.get(r8)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r1 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r1
            java.lang.String r1 = r1.A0C
            goto L_0x02d1
        L_0x02ed:
            com.instagram.user.model.User r1 = X.AnonymousClass7TF.A0Q(r9)
            java.lang.String r1 = r1.getUsername()
            goto L_0x02d1
        L_0x02f6:
            java.lang.String r2 = X.DbT.A10(r3)
            X.L4T r1 = new X.L4T
            r1.<init>(r2, r5)
            r0.A00(r6, r1)
            int r20 = r20 + 1
        L_0x0304:
            java.util.Iterator r9 = r7.iterator()
            r5 = 0
            r8 = 0
        L_0x030a:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0359
            java.lang.Object r4 = r9.next()
            com.instagram.model.direct.DirectShareTarget r4 = (com.instagram.model.direct.DirectShareTarget) r4
            boolean r1 = r0.A03(r4)
            if (r1 != 0) goto L_0x030a
            r0.A02(r4)
            int r1 = r0.A01
            int r1 = r1 + 10
            if (r5 < r1) goto L_0x0327
            r8 = 1
            goto L_0x030a
        L_0x0327:
            android.content.Context r15 = r0.A0A
            com.instagram.common.session.UserSession r3 = r0.A0B
            r19 = 6
            boolean r23 = r0.A07(r4)
            int r21 = r20 - r14
            boolean r24 = r0.A04(r4)
            r25 = 0
            java.lang.String r2 = r0.A0T
            r22 = -1
            X.3mO r6 = r0.A0N
            X.3mS r1 = r0.A0M
            boolean r26 = r6.A0B(r4, r1)
            r17 = r4
            r18 = r2
            r16 = r3
            X.FV6 r2 = X.FV6.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r20 = r20 + 1
            int r5 = r5 + 1
            X.EAb r1 = r0.A0J
            r0.A00(r1, r2)
            goto L_0x030a
        L_0x0359:
            if (r8 == 0) goto L_0x018f
            r1 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            X.K9L r1 = r0.A0K
            r0.A00(r1, r2)
            goto L_0x018f
        L_0x0367:
            android.content.Context r7 = r0.A0A
            r1 = 2131952922(0x7f13051a, float:1.95423E38)
            java.lang.String r1 = r7.getString(r1)
            X.L2e r2 = new X.L2e
            r2.<init>(r1)
            X.K9e r1 = r0.A0S
            r0.A00(r1, r2)
            if (r5 == 0) goto L_0x0384
            X.K9a r2 = r0.A0E
            r1 = 0
            r0.A00(r2, r1)
            int r14 = r14 + 1
        L_0x0384:
            X.K9t r5 = r0.A0D
            if (r9 == 0) goto L_0x039e
            if (r5 == 0) goto L_0x039e
            com.instagram.common.session.UserSession r1 = r0.A0B
            com.instagram.user.model.User r4 = X.DbT.A0j(r1)
            java.lang.String r3 = r0.A0T
            com.instagram.pendingmedia.model.UserStoryTarget r2 = com.instagram.pendingmedia.model.UserStoryTarget.A04
            r1 = 0
            X.FV6 r1 = X.FV6.A01(r7, r2, r4, r3, r1)
            r0.A00(r5, r1)
            int r14 = r14 + 1
        L_0x039e:
            if (r8 == 0) goto L_0x0138
            if (r6 == 0) goto L_0x0138
            com.instagram.common.session.UserSession r1 = r0.A0B
            com.instagram.user.model.User r4 = X.DbT.A0j(r1)
            java.lang.String r3 = r0.A0T
            com.instagram.pendingmedia.model.UserStoryTarget r2 = com.instagram.pendingmedia.model.UserStoryTarget.A05
            r1 = 0
            X.FV6 r1 = X.FV6.A01(r7, r2, r4, r3, r1)
            r0.A00(r6, r1)
            int r14 = r14 + 1
            goto L_0x0138
        L_0x03b8:
            r5 = 0
            goto L_0x0110
        L_0x03bb:
            r2 = 0
            goto L_0x0102
        L_0x03be:
            r9 = 0
            goto L_0x00b2
        L_0x03c1:
            java.util.LinkedHashSet r1 = r0.A0Y
            java.util.Iterator r9 = r1.iterator()
            r2 = 0
            r3 = 0
            r8 = 0
        L_0x03ca:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0423
            java.lang.Object r5 = r9.next()
            com.instagram.model.direct.DirectShareTarget r5 = (com.instagram.model.direct.DirectShareTarget) r5
            boolean r1 = r0.A03(r5)
            if (r1 != 0) goto L_0x03ca
            r0.A02(r5)
            int r1 = r0.A02
            int r1 = r1 + 10
            if (r3 < r1) goto L_0x03e7
            r8 = 1
            goto L_0x03ca
        L_0x03e7:
            if (r2 != 0) goto L_0x03f0
            X.L2e r2 = r0.A0Q
            X.K9e r1 = r0.A0S
            r0.A00(r1, r2)
        L_0x03f0:
            android.content.Context r15 = r0.A0A
            com.instagram.common.session.UserSession r4 = r0.A0B
            r19 = 19
            boolean r23 = r0.A07(r5)
            int r21 = r3 + r10
            boolean r24 = r0.A04(r5)
            r25 = 0
            java.lang.String r2 = r0.A0T
            r22 = -1
            X.3mO r6 = r0.A0N
            X.3mS r1 = r0.A0M
            boolean r26 = r6.A0B(r5, r1)
            r17 = r5
            r18 = r2
            r16 = r4
            X.FV6 r2 = X.FV6.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r20 = r20 + 1
            int r3 = r3 + 1
            X.EAb r1 = r0.A0J
            r0.A00(r1, r2)
            r2 = 1
            goto L_0x03ca
        L_0x0423:
            if (r8 == 0) goto L_0x0430
            r1 = 19
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            X.K9L r1 = r0.A0K
            r0.A00(r1, r2)
        L_0x0430:
            java.util.Set r1 = r0.A0e
            java.util.Iterator r8 = r1.iterator()
            r2 = 0
            r4 = 0
        L_0x0438:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0462
            java.lang.Object r3 = r8.next()
            com.instagram.model.direct.DirectShareTarget r3 = (com.instagram.model.direct.DirectShareTarget) r3
            boolean r1 = r0.A03(r3)
            if (r1 != 0) goto L_0x0438
            boolean r1 = r3.A0T
            if (r1 != 0) goto L_0x0438
            int r1 = r0.A03
            int r1 = r1 + 8
            if (r4 < r1) goto L_0x04c2
            r1 = 26
            if (r4 >= r1) goto L_0x0462
            r1 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            X.K9L r1 = r0.A0K
            r0.A00(r1, r2)
        L_0x0462:
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x0502
            r4 = 0
            java.util.List r1 = r0.A05
            java.util.Iterator r7 = r1.iterator()
            r21 = 0
        L_0x0471:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0502
            java.lang.Object r6 = r7.next()
            com.instagram.model.direct.DirectShareTarget r6 = (com.instagram.model.direct.DirectShareTarget) r6
            java.lang.String r3 = X.C63258Ku3.A00(r6)
            boolean r1 = r3.equals(r4)
            if (r1 != 0) goto L_0x0492
            X.L2e r2 = new X.L2e
            r2.<init>(r3)
            X.K9e r1 = r0.A0S
            r0.A00(r1, r2)
            r4 = r3
        L_0x0492:
            android.content.Context r15 = r0.A0A
            com.instagram.common.session.UserSession r5 = r0.A0B
            r19 = 8
            boolean r23 = r0.A07(r6)
            boolean r24 = r0.A04(r6)
            r25 = 0
            java.lang.String r3 = r0.A0T
            r22 = -1
            X.3mO r2 = r0.A0N
            X.3mS r1 = r0.A0M
            boolean r26 = r2.A0B(r6, r1)
            r17 = r6
            r18 = r3
            r16 = r5
            X.FV6 r2 = X.FV6.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r20 = r20 + 1
            int r21 = r21 + 1
            X.EAb r1 = r0.A0J
            r0.A00(r1, r2)
            goto L_0x0471
        L_0x04c2:
            if (r2 != 0) goto L_0x04cb
            X.L2e r2 = r0.A0R
            X.K9e r1 = r0.A0S
            r0.A00(r1, r2)
        L_0x04cb:
            android.content.Context r15 = r0.A0A
            com.instagram.common.session.UserSession r6 = r0.A0B
            r19 = 7
            boolean r23 = r0.A07(r3)
            boolean r24 = r0.A04(r3)
            r25 = 0
            java.lang.String r5 = r0.A0T
            r22 = -1
            X.3mO r2 = r0.A0N
            X.3mS r1 = r0.A0M
            boolean r26 = r2.A0B(r3, r1)
            r17 = r3
            r18 = r5
            r21 = r4
            r16 = r6
            X.FV6 r2 = X.FV6.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r20 = r20 + 1
            int r4 = r4 + 1
            X.EAb r1 = r0.A0J
            r0.A00(r1, r2)
            r0.A02(r3)
            r2 = 1
            goto L_0x0438
        L_0x0502:
            r0.notifyDataSetChanged()
            return
        L_0x0506:
            java.lang.String r0 = "Blast list candidates should only be for blasts of more than 1 recipient"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K9I.A06():void");
    }

    public final boolean A07(DirectShareTarget directShareTarget) {
        Map map;
        Object A002;
        List unmodifiableList = Collections.unmodifiableList(directShareTarget.A0Q);
        if (unmodifiableList.size() == 1) {
            map = this.A0c;
            A002 = ((PendingRecipient) AnonymousClass7TE.A13(unmodifiableList)).getId();
        } else {
            map = this.A0b;
            A002 = directShareTarget.A00();
        }
        return map.containsKey(A002);
    }

    /* JADX WARNING: type inference failed for: r0v42, types: [X.2s2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v43, types: [X.K9L, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v66, types: [X.K9M, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x02a6, code lost:
        if (r34 != null) goto L_0x0161;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public K9I(android.content.Context r30, X.C2355930l r31, X.AnonymousClass0iw r32, com.instagram.common.session.UserSession r33, com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r34, X.L1H r35, X.L1J r36, X.C65635LxC r37, X.L1M r38, X.L1N r39, X.C65306Lqz r40, X.Lr0 r41, X.L1O r42, X.L1P r43, com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r44, com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r45, X.C66574MXf r46, X.C66574MXf r47, X.MVA r48, X.MVA r49, X.L4U r50, X.ELU r51, com.instagram.model.direct.DirectShareTarget r52, X.C381779cJ r53, X.C363008it r54, X.C273634mu r55, X.MTF r56, java.util.Map r57, boolean r58, boolean r59, boolean r60, boolean r61, boolean r62, boolean r63, boolean r64) {
        /*
            r29 = this;
            r0 = 0
            r2 = r29
            r2.<init>(r0)
            java.util.LinkedHashSet r0 = X.DbS.A0y()
            r2.A0X = r0
            java.util.LinkedHashSet r0 = X.DbS.A0y()
            r2.A0W = r0
            java.util.LinkedHashSet r0 = X.DbS.A0y()
            r2.A0Y = r0
            java.util.LinkedHashSet r0 = X.DbS.A0y()
            r2.A0V = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r2.A0Z = r0
            java.util.LinkedHashSet r0 = X.DbS.A0y()
            r2.A0U = r0
            java.util.LinkedHashSet r0 = X.DbS.A0y()
            r2.A0e = r0
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r2.A0x = r0
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r2.A0v = r0
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r2.A0w = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r2.A05 = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r2.A0c = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r2.A0b = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r2.A0a = r0
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r2.A0d = r0
            r0 = r59
            r2.A0y = r0
            r8 = r60
            r2.A0f = r8
            r0 = r61
            r2.A0g = r0
            r12 = r30
            r2.A0A = r12
            r14 = r33
            r2.A0B = r14
            X.3mS r0 = X.C251033mS.A00(r14)
            r2.A0M = r0
            X.3mO r0 = X.C250993mO.A01(r14)
            r2.A0N = r0
            r4 = r46
            r2.A0G = r4
            X.1Av r0 = X.1Au.A00(r14)
            boolean r0 = r0.A21()
            r2.A0z = r0
            r10 = r54
            r2.A0O = r10
            r7 = r50
            r2.A0L = r7
            r0 = r52
            r2.A0o = r0
            r13 = r32
            java.lang.String r0 = r13.getModuleName()
            r2.A0T = r0
            r0 = 20
            r2.A09 = r0
            r9 = r57
            r2.A0u = r9
            X.0Tu r3 = X.0Tu.A05
            r0 = 36320756011049793(0x81098900032341, double:3.032730581108792E-306)
            boolean r0 = X.182.A06(r3, r14, r0)
            r2.A0h = r0
            r0 = 36602230987887206(0x82098900051266, double:3.21073648986953E-306)
            java.lang.Long r0 = X.AnonymousClass7TF.A0Y(r3, r14, r0)
            int r0 = r0.intValue()
            r2.A07 = r0
            r0 = 36602230987952743(0x82098900061267, double:3.210736489910976E-306)
            java.lang.Long r0 = X.AnonymousClass7TF.A0Y(r3, r14, r0)
            int r0 = r0.intValue()
            r2.A08 = r0
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            X.K9e r0 = new X.K9e
            r1 = r35
            r0.<init>(r1)
            r2.A0S = r0
            r6.add(r0)
            r5 = 0
            r20 = r56
            r15 = r34
            if (r58 == 0) goto L_0x029c
            r15.getClass()
            X.K9s r0 = new X.K9s
            r16 = r37
            r11 = r0
            r17 = r10
            r18 = r20
            r19 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r2.A0m = r0
            r6.add(r0)
            X.K9M r0 = new X.K9M
            r0.<init>()
            r2.A0n = r0
            r6.add(r0)
            r23 = r31
            if (r31 == 0) goto L_0x0298
            X.K9n r0 = new X.K9n
            r26 = r38
            r27 = r48
            r21 = r0
            r22 = r12
            r24 = r14
            r25 = r15
            r28 = r20
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            r2.A0k = r0
            r6.add(r0)
        L_0x0129:
            boolean r0 = X.AnonymousClass2o2.A00(r14)
            if (r0 == 0) goto L_0x0294
            X.K9m r0 = new X.K9m
            r25 = r39
            r26 = r49
            r21 = r0
            r22 = r12
            r23 = r14
            r24 = r15
            r27 = r20
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r2.A0l = r0
            r6.add(r0)
        L_0x0147:
            if (r50 == 0) goto L_0x0290
            X.K9r r0 = new X.K9r
            r25 = r41
            r21 = r0
            r22 = r12
            r23 = r14
            r24 = r15
            r26 = r7
            r27 = r20
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r2.A0C = r0
            r6.add(r0)
        L_0x0161:
            X.0Tu r7 = X.0Tu.A06
            r0 = 36321576349672982(0x810a4800012616, double:3.0332493665573354E-306)
            boolean r0 = X.182.A06(r7, r14, r0)
            if (r0 == 0) goto L_0x018d
            com.instagram.common.session.UserSession r0 = r2.A0B
            X.2Ly r7 = X.2Lv.A00(r0)
            java.lang.Class<X.K9I> r0 = X.K9I.class
            com.facebook.common.callercontext.CallerContext r1 = com.facebook.common.callercontext.CallerContext.A00(r0)
            java.lang.String r0 = "ig_android_sdk_token_cache_ig_to_fb_story_crossposting"
            boolean r0 = r7.A00(r1, r0)
            if (r0 != 0) goto L_0x018d
            r0 = 36321576349935130(0x810a480005261a, double:3.033249366723119E-306)
            boolean r0 = X.182.A06(r3, r14, r0)
            if (r0 != 0) goto L_0x02aa
        L_0x018d:
            X.K9t r11 = new X.K9t
            r16 = r40
            r17 = r45
            r18 = r51
            r19 = r10
            r21 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2.A0D = r11
            r6.add(r11)
        L_0x01a1:
            X.K9a r0 = new X.K9a
            r1 = r42
            r0.<init>(r14, r1)
            r2.A0E = r0
            r6.add(r0)
            X.EAl r0 = new X.EAl
            r0.<init>(r12)
            r2.A0p = r0
            r6.add(r0)
            X.Lqx r1 = new X.Lqx
            r0 = r47
            r1.<init>(r0, r2)
            X.EAb r0 = new X.EAb
            r24 = r44
            r22 = r13
            r23 = r14
            r25 = r1
            r26 = r20
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26)
            r2.A0I = r0
            r6.add(r0)
            X.NLV r0 = new X.NLV
            r1 = r55
            r0.<init>(r14, r1)
            r2.A0r = r0
            r6.add(r0)
            if (r62 == 0) goto L_0x028c
            if (r34 == 0) goto L_0x028c
            X.K9o r0 = new X.K9o
            r16 = r36
            r17 = r53
            r11 = r0
            r18 = r20
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r2.A0F = r0
            r6.add(r0)
        L_0x01f5:
            X.K9Q r0 = new X.K9Q
            r0.<init>(r14)
            r2.A0H = r0
            r6.add(r0)
            X.Lqx r1 = new X.Lqx
            r1.<init>(r4, r2)
            X.EAb r0 = new X.EAb
            r25 = r1
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26)
            r2.A0J = r0
            r6.add(r0)
            X.EAC r0 = new X.EAC
            r0.<init>(r12, r4)
            r2.A0t = r0
            r6.add(r0)
            X.2s2 r0 = new X.2s2
            r0.<init>()
            r2.A0j = r0
            r6.add(r0)
            X.K9L r0 = new X.K9L
            r0.<init>()
            r1 = r43
            r0.A00 = r1
            r2.A0K = r0
            r6.add(r0)
            r2.init(r6)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.MeX r1 = new X.MeX
            r1.<init>(r0)
            java.lang.Integer r0 = X.JTP.A0j(r64)
            r1.A03 = r0
            X.MeV r0 = new X.MeV
            r0.<init>(r1)
            r2.A0s = r0
            android.content.res.Resources r3 = r12.getResources()
            r0 = 2131971355(0x7f134d1b, float:1.9579687E38)
            java.lang.String r1 = r3.getString(r0)
            X.L2e r0 = new X.L2e
            r0.<init>(r1)
            r2.A0R = r0
            r0 = 2131971302(0x7f134ce6, float:1.957958E38)
            java.lang.String r1 = r3.getString(r0)
            X.L2e r0 = new X.L2e
            r0.<init>(r1)
            r2.A0Q = r0
            r0 = 2131971300(0x7f134ce4, float:1.9579575E38)
            java.lang.String r1 = r3.getString(r0)
            X.L2e r0 = new X.L2e
            r0.<init>(r1)
            r2.A0P = r0
            r0 = 2131960304(0x7f1321f0, float:1.9557273E38)
            java.lang.String r1 = r3.getString(r0)
            X.L2e r0 = new X.L2e
            r0.<init>(r1)
            r2.A0q = r0
            r0 = r63
            r2.A0i = r0
            return
        L_0x028c:
            r2.A0F = r5
            goto L_0x01f5
        L_0x0290:
            r2.A0C = r5
            goto L_0x0161
        L_0x0294:
            r2.A0l = r5
            goto L_0x0147
        L_0x0298:
            r2.A0k = r5
            goto L_0x0129
        L_0x029c:
            r2.A0m = r5
            r2.A0n = r5
            r2.A0k = r5
            r2.A0l = r5
            r2.A0C = r5
            if (r34 == 0) goto L_0x02aa
            goto L_0x0161
        L_0x02aa:
            r2.A0D = r5
            goto L_0x01a1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K9I.<init>(android.content.Context, X.30l, X.0iw, com.instagram.common.session.UserSession, com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim, X.L1H, X.L1J, X.LxC, X.L1M, X.L1N, X.Lqz, X.Lr0, X.L1O, X.L1P, com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController, com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController, X.MXf, X.MXf, X.MVA, X.MVA, X.L4U, X.ELU, com.instagram.model.direct.DirectShareTarget, X.9cJ, X.8it, X.4mu, X.MTF, java.util.Map, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
