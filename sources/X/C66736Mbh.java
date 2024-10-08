package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.BizUserInboxState;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Mbh  reason: case insensitive filesystem */
public final class C66736Mbh {
    public C66920MfE A00;
    public C67220MkG A01;
    public boolean A02;
    public final Context A03;
    public final FragmentActivity A04;
    public final AnonymousClass0iw A05;
    public final AnonymousClass1aS A06 = 1aF.A00();
    public final 1aU A07;
    public final 1aU A08;
    public final 1aU A09;
    public final 1a8 A0A;
    public final UserSession A0B;
    public final C66739Mbk A0C;
    public final C67145Mj3 A0D;
    public final C67141Miz A0E;
    public final C74566PxF A0F;
    public final 1aV A0G;
    public final 1aV A0H;
    public final 1aV A0I;
    public final List A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final C251033mS A0N;
    public final C250993mO A0O;
    public final boolean A0P;

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C67214MkA A01(java.lang.Object[] r4) {
        /*
            r1 = 0
            r3 = 1
            r2 = 2
            X.MkA r0 = X.C67214MkA.IRIS_ERROR
            r4[r1] = r0
            X.MkA r1 = X.C67214MkA.TOP_ANCHOR
            r4[r3] = r1
            X.MkA r0 = X.C67214MkA.EB_ENTRYPOINT_BANNER
            r4[r2] = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66736Mbh.A01(java.lang.Object[]):X.MkA");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C67214MkA A02(java.lang.Object[] r5) {
        /*
            r0 = 3
            r4 = 4
            r3 = 5
            r2 = 6
            X.MkA r1 = X.C67214MkA.QUICK_PROMOTION
            r5[r0] = r1
            X.MkA r0 = X.C67214MkA.SEARCH_BAR
            r5[r4] = r0
            X.MkA r0 = X.C67214MkA.TRAY
            r5[r3] = r0
            X.MkA r0 = X.C67214MkA.INBOX_HEADER
            r5[r2] = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66736Mbh.A02(java.lang.Object[]):X.MkA");
    }

    public final void A07(C67303Mld mld, boolean z, boolean z2) {
        NPK npk;
        0qQ.A0B(mld, 1);
        C67141Miz miz = this.A0E;
        if (z) {
            npk = new NPK(this.A0B, mld, z, z2);
        } else {
            npk = null;
        }
        miz.A0D = npk;
        A03(this);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [X.Ote, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (X.182.A06(X.0Tu.A05, r12.A0B, 36322224890390546L) != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ee, code lost:
        if (X.182.A06(X.0Tu.A05, r12.A0B, 36322224889800715L) != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f4, code lost:
        if (r6 == null) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(java.util.List r13) {
        /*
            r12 = this;
            r4 = 0
            r5 = 0
            if (r13 == 0) goto L_0x00f2
            java.lang.Object r6 = X.00k.A0O(r13, r5)
            X.PwL r6 = (X.C74526PwL) r6
            if (r6 == 0) goto L_0x00f3
            r1 = r6
            X.N5E r1 = (X.N5E) r1
            X.Dre r0 = r1.A00
            if (r0 == 0) goto L_0x00f3
            java.util.List r0 = r0.A01
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r0 = X.00k.A0O(r0, r5)
            X.PwS r0 = (X.C74533PwS) r0
            if (r0 == 0) goto L_0x00f3
            X.N5K r0 = (X.N5K) r0
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x00f3
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00f3
            java.lang.String r7 = r1.A01
            java.lang.String r0 = "suggested_accounts_to_follow"
            if (r7 == 0) goto L_0x00d7
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00d7
            com.instagram.common.session.UserSession r3 = r12.A0B
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322224890390546(0x810adf000b2812, double:3.033659506318587E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00d7
        L_0x0046:
            r1 = 1
        L_0x0047:
            r0 = r6
            X.N5E r0 = (X.N5E) r0
            X.Dre r0 = r0.A00
            if (r0 == 0) goto L_0x005e
            java.util.List r0 = r0.A01
            if (r0 == 0) goto L_0x005e
            java.lang.Object r0 = X.00k.A0O(r0, r5)
            X.PwS r0 = (X.C74533PwS) r0
            if (r0 == 0) goto L_0x005e
            X.N5K r0 = (X.N5K) r0
            java.util.List r4 = r0.A00
        L_0x005e:
            android.content.Context r8 = r12.A03
            r0 = 2131959564(0x7f131f0c, float:1.9555772E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r8, r0)
            if (r4 == 0) goto L_0x015d
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x015d
            if (r1 == 0) goto L_0x015d
            X.Miz r7 = r12.A0E
            r9 = 2
            r7.A00 = r9
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            X.N5E r6 = (X.N5E) r6
            java.lang.String r1 = r6.A01
            if (r1 != 0) goto L_0x0081
            r1 = r2
        L_0x0081:
            java.lang.String r0 = r6.A02
            if (r0 == 0) goto L_0x0086
            r2 = r0
        L_0x0086:
            r0 = 2131959558(0x7f131f06, float:1.955576E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r8, r0)
            X.Dg4 r6 = new X.Dg4
            r6.<init>(r1, r2, r0)
            java.util.Iterator r11 = r4.iterator()
        L_0x0096:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00f8
            java.lang.Object r2 = r11.next()
            X.PwR r2 = (X.C74532PwR) r2
            X.Dt4 r2 = (X.C47217Dt4) r2
            com.instagram.user.model.User r10 = r2.A00
            if (r10 == 0) goto L_0x0096
            com.instagram.user.model.FollowStatus r1 = r10.B6o()
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A08
            if (r1 != r0) goto L_0x00b5
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A06
            r10.A0n(r0)
        L_0x00b5:
            java.lang.Boolean r0 = r2.A01
            if (r0 == 0) goto L_0x00d5
            boolean r0 = r0.booleanValue()
        L_0x00bd:
            r10.A13(r0)
            int r0 = r7.A00
            r4 = 0
            if (r0 != r9) goto L_0x00c6
            r4 = 1
        L_0x00c6:
            java.lang.String r2 = r2.A05
            int r1 = r3.size()
            X.MmA r0 = new X.MmA
            r0.<init>(r10, r2, r1, r4)
            r3.add(r0)
            goto L_0x0096
        L_0x00d5:
            r0 = 0
            goto L_0x00bd
        L_0x00d7:
            java.lang.String r0 = "people_who_follow_you"
            if (r7 == 0) goto L_0x00f3
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00f3
            com.instagram.common.session.UserSession r3 = r12.A0B
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322224889800715(0x810adf0002280b, double:3.033659505945575E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00f3
            goto L_0x0046
        L_0x00f2:
            r6 = r4
        L_0x00f3:
            r1 = 0
            if (r6 == 0) goto L_0x005e
            goto L_0x0047
        L_0x00f8:
            com.instagram.common.session.UserSession r4 = r12.A0B
            boolean r0 = X.C267044ar.A00(r8, r4)
            if (r0 == 0) goto L_0x012f
            X.1Av r0 = X.1Au.A00(r4)
            long r8 = java.lang.System.currentTimeMillis()
            X.0xa r2 = r0.A01
            java.lang.String r0 = "last_time_dismissed_ci_direct_follow_list"
            long r0 = X.DbW.A06(r2, r0)
            long r8 = r8 - r0
            java.lang.String r0 = "num_times_dismissed_ci_direct_follow_list"
            int r1 = r2.getInt(r0, r5)
            r0 = 3
            if (r1 >= r0) goto L_0x012f
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x012f
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322224890456083(0x810adf000c2813, double:3.0336595063600326E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x012f
            r5 = 1
        L_0x012f:
            r7.A09 = r6
            r7.A0M = r3
            java.util.List r2 = r7.A0N
            X.2EM r1 = r7.A0E
            X.2EX r0 = X.AnonymousClass2EX.A00
            if (r1 == r0) goto L_0x014b
            int r0 = r7.A00
            if (r0 == 0) goto L_0x014b
            int r0 = r2.size()
            r1 = 3
            if (r0 <= r1) goto L_0x014b
            r0 = 0
            java.util.List r2 = r2.subList(r0, r1)
        L_0x014b:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r7.A0N = r2
            if (r5 == 0) goto L_0x015a
            X.Ote r0 = new X.Ote
            r0.<init>()
            r7.A06 = r0
        L_0x015a:
            A03(r12)
        L_0x015d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66736Mbh.A09(java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        if (r6.A0P == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        if (r10.A0S() == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        if (r10.A04(r6.A0B.A06, false) != X.AnonymousClass05K.A01) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        if (r10.A05() == null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r11 = (com.instagram.model.direct.DirectShareTarget) r8.get(r13);
        r14 = r6.A0O.A0A((com.instagram.model.direct.DirectShareTarget) r8.get(r13), r6.A0N);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        if (r5 == 2) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        if (r5 == 4) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        r12 = null;
        r17 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        if (r21 == 0) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        r17 = true;
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        if (r5 == 3) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        r3.add(new X.C46500Dg3(r11, r12, r13, r14, r22, r16, r17, r18));
        r13 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0091, code lost:
        r1 = r6.A03;
        r0 = 2131959528;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
        r1 = r6.A03;
        r0 = 2131960429;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009c, code lost:
        r12 = java.util.Collections.singletonList(r1.getString(r0));
        X.0qQ.A07(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a8, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b7, code lost:
        if (r1 != r7) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A0B, 36317934217467542L) != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002d, code lost:
        if (r8.isEmpty() != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002f, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (r13 >= r9) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        r10 = (com.instagram.model.direct.DirectShareTarget) r8.get(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
        if (r10.A0F() != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(java.util.List r20, int r21, boolean r22, boolean r23) {
        /*
            r19 = this;
            r4 = 0
            r8 = r20
            X.0qQ.A0B(r8, r4)
            int r9 = r8.size()
            java.util.ArrayList r3 = X.DbS.A0v(r9)
            r6 = r19
            X.Miz r2 = r6.A0E
            X.2EM r0 = r2.A0E
            X.2EX r7 = X.AnonymousClass2EX.A00
            r5 = r21
            if (r0 != r7) goto L_0x00ab
            com.instagram.common.session.UserSession r11 = r6.A0B
            X.0Tu r10 = X.0Tu.A05
            r0 = 36317934217467542(0x8106f800021696, double:3.030946067484926E-306)
            boolean r0 = X.182.A06(r10, r11, r0)
            if (r0 == 0) goto L_0x00ab
        L_0x0029:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x00bb
            r13 = 0
        L_0x0030:
            if (r13 >= r9) goto L_0x00bb
            java.lang.Object r10 = r8.get(r13)
            com.instagram.model.direct.DirectShareTarget r10 = (com.instagram.model.direct.DirectShareTarget) r10
            boolean r0 = r10.A0F()
            if (r0 != 0) goto L_0x005a
            boolean r0 = r6.A0P
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r10.A0S()
            if (r0 == 0) goto L_0x00a8
            com.instagram.common.session.UserSession r0 = r6.A0B
            java.lang.String r0 = r0.A06
            java.lang.Integer r1 = r10.A04(r0, r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x00a8
            java.lang.String r0 = r10.A05()
            if (r0 == 0) goto L_0x00a8
        L_0x005a:
            r16 = 1
        L_0x005c:
            java.lang.Object r11 = r8.get(r13)
            com.instagram.model.direct.DirectShareTarget r11 = (com.instagram.model.direct.DirectShareTarget) r11
            X.3mO r10 = r6.A0O
            X.3mS r1 = r6.A0N
            java.lang.Object r0 = r8.get(r13)
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            boolean r14 = r10.A0A(r0, r1)
            r0 = 2
            if (r5 == r0) goto L_0x0091
            r0 = 4
            if (r5 == r0) goto L_0x0097
            r12 = 0
            r17 = 0
            if (r21 == 0) goto L_0x0082
        L_0x007b:
            r17 = 1
            r0 = 3
            r18 = 1
            if (r5 == r0) goto L_0x0084
        L_0x0082:
            r18 = 0
        L_0x0084:
            X.Dg3 r10 = new X.Dg3
            r15 = r22
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r3.add(r10)
            int r13 = r13 + 1
            goto L_0x0030
        L_0x0091:
            android.content.Context r1 = r6.A03
            r0 = 2131959528(0x7f131ee8, float:1.9555699E38)
            goto L_0x009c
        L_0x0097:
            android.content.Context r1 = r6.A03
            r0 = 2131960429(0x7f13226d, float:1.9557526E38)
        L_0x009c:
            java.lang.String r0 = r1.getString(r0)
            java.util.List r12 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r12)
            goto L_0x007b
        L_0x00a8:
            r16 = 0
            goto L_0x005c
        L_0x00ab:
            X.48q r1 = r2.A0G
            X.48q r0 = X.C2611948q.ALL
            if (r1 != r0) goto L_0x00bb
            X.2EM r1 = r2.A0E
            X.2EL r0 = X.AnonymousClass2EL.A00
            if (r1 == r0) goto L_0x00bb
            if (r1 == r7) goto L_0x00bb
            goto L_0x0029
        L_0x00bb:
            r8 = 4
            android.content.Context r1 = r6.A03
            r0 = 2131959564(0x7f131f0c, float:1.9555772E38)
            if (r5 != r8) goto L_0x00c6
            r0 = 2131959798(0x7f131ff6, float:1.9556247E38)
        L_0x00c6:
            java.lang.String r5 = X.C51967G9n.A0p(r1, r0)
            java.lang.String r0 = "suggestions_header_row"
            X.Mgs r1 = new X.Mgs
            r1.<init>(r0, r5)
            java.util.List r0 = r2.A0N
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00e0
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x00e0
            return
        L_0x00e0:
            if (r23 == 0) goto L_0x00e8
            r2.A0L = r3
        L_0x00e4:
            A03(r6)
            return
        L_0x00e8:
            r2.A0I = r1
            X.2EM r0 = r2.A0E
            if (r0 == r7) goto L_0x00fd
            int r0 = r2.A00
            if (r0 == 0) goto L_0x00fd
            int r1 = r3.size()
            r0 = 3
            if (r1 <= r0) goto L_0x00fd
            java.util.List r3 = r3.subList(r4, r0)
        L_0x00fd:
            X.0qQ.A0B(r3, r4)
            r2.A0N = r3
            goto L_0x00e4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66736Mbh.A0A(java.util.List, int, boolean, boolean):void");
    }

    public static final NPD A00(C66736Mbh mbh, C67220MkG mkG) {
        if (mkG == C67220MkG.DEFAULT) {
            return null;
        }
        int i = mkG.A01;
        Context context = mbh.A03;
        return new NPD(new PHJ(1, mkG, mbh), AnonymousClass7TE.A16(context, mkG.A00), AnonymousClass7TE.A16(context, 2131963479), i, mkG.A05, mkG.A04);
    }

    public static final void A03(C66736Mbh mbh) {
        if (mbh.A02) {
            A04(mbh);
        }
    }

    public static final void A04(C66736Mbh mbh) {
        AnonymousClass43A r3;
        C67214MkA mkA;
        C67214MkA mkA2;
        C67214MkA[] mkAArr;
        C67214MkA mkA3;
        C67214MkA mkA4;
        char c;
        C67214MkA[] mkAArr2;
        C67214MkA mkA5;
        C67214MkA mkA6;
        C67214MkA mkA7;
        C67214MkA mkA8;
        List A1P;
        List Auh;
        C66736Mbh mbh2 = mbh;
        if (mbh2.A02 || !mbh2.A0M || (Auh = mbh2.A0F.Auh()) == null || Auh.isEmpty()) {
            try {
                0fh.A01("InboxViewModelGenerator.calculateAndApplyDiffUpdate", -1131555541);
                AnonymousClass1aS r9 = mbh2.A06;
                C67141Miz miz = mbh2.A0E;
                AnonymousClass43A r2 = miz.A0E;
                if (r2 == null) {
                    r3 = AnonymousClass43A.A00;
                } else {
                    r3 = r2;
                }
                if (0qQ.A0K(r3, AnonymousClass2EY.A00)) {
                    C67214MkA mkA9 = C67214MkA.IRIS_ERROR;
                    mkA = C67214MkA.TOP_ANCHOR;
                    C67214MkA mkA10 = C67214MkA.EB_ENTRYPOINT_BANNER;
                    mkA2 = C67214MkA.QUICK_PROMOTION;
                    C67214MkA mkA11 = C67214MkA.SEARCH_BAR;
                    C67214MkA mkA12 = C67214MkA.TRAY;
                    C67214MkA mkA13 = C67214MkA.INBOX_HEADER;
                    C67214MkA mkA14 = C67214MkA.FOLDER;
                    C67214MkA mkA15 = C67214MkA.INBOX_ADS_EVENT_SHARING_NOTICE_BANNER;
                    C67214MkA mkA16 = C67214MkA.PARTNERSHIPS_INBOX_ROW;
                    mkA3 = C67214MkA.THREADS;
                    mkAArr = new C67214MkA[]{mkA9, mkA, mkA10, mkA2, mkA11, mkA12, mkA13, mkA14, mkA15, mkA16, mkA3, C67214MkA.LOCKED_CHAT, C67214MkA.LOAD_MORE};
                } else {
                    if (0qQ.A0K(r3, AnonymousClass2EU.A00)) {
                        mkAArr = new C67214MkA[16];
                        mkA = A01(mkAArr);
                        mkA2 = A02(mkAArr);
                        mkAArr[7] = C67214MkA.FOLDER;
                        mkAArr[8] = C67214MkA.INBOX_ADS_EVENT_SHARING_NOTICE_BANNER;
                        mkAArr[9] = C67214MkA.PARTNERSHIPS_INBOX_ROW;
                        mkA3 = C67214MkA.THREADS;
                        mkAArr[10] = mkA3;
                        mkAArr[11] = C67214MkA.SUGGESTIONS;
                        mkAArr[12] = C67214MkA.FIND_PEOPLE;
                        mkAArr[13] = C67214MkA.RECOMMENDED_USER_SUGGESTIONS;
                        mkAArr[14] = C67214MkA.LOCKED_CHAT;
                        mkA4 = C67214MkA.LOAD_MORE;
                        c = 15;
                    } else {
                        if (0qQ.A0K(r3, AnonymousClass2EL.A00)) {
                            mkAArr = new C67214MkA[15];
                            mkA = A01(mkAArr);
                            mkA2 = A02(mkAArr);
                            mkAArr[7] = C67214MkA.FOLDER;
                            mkAArr[8] = C67214MkA.INBOX_ADS_EVENT_SHARING_NOTICE_BANNER;
                            mkAArr[9] = C67214MkA.GENERAL_FOLDER_DISABLED;
                            mkAArr[10] = C67214MkA.GENERAL_FOLDER_HMPS_BANNER;
                            mkA3 = C67214MkA.THREADS;
                            mkAArr[11] = mkA3;
                            mkAArr[12] = C67214MkA.LOCKED_CHAT;
                            mkAArr[13] = C67214MkA.LOAD_MORE;
                            mkA4 = C67214MkA.FILTER_ROW;
                        } else if (0qQ.A0K(r3, AnonymousClass2EX.A00)) {
                            mkAArr = new C67214MkA[14];
                            mkA = A01(mkAArr);
                            mkA2 = A02(mkAArr);
                            mkAArr[7] = C67214MkA.INBOX_ADS_EVENT_SHARING_NOTICE_BANNER;
                            mkAArr[8] = C67214MkA.FOLDER;
                            mkA3 = C67214MkA.THREADS;
                            mkAArr[9] = mkA3;
                            mkAArr[10] = C67214MkA.LOAD_MORE;
                            mkAArr[11] = C67214MkA.CHANNEL_INVITES;
                            mkAArr[12] = C67214MkA.SUGGESTIONS;
                            mkA4 = C67214MkA.FILTER_ROW;
                            c = 13;
                        } else if (0qQ.A0K(r3, AnonymousClass43A.A00)) {
                            mkAArr = new C67214MkA[15];
                            mkA = A01(mkAArr);
                            mkA2 = A02(mkAArr);
                            mkAArr[7] = C67214MkA.FOLDER;
                            mkAArr[8] = C67214MkA.INBOX_ADS_EVENT_SHARING_NOTICE_BANNER;
                            mkA3 = C67214MkA.THREADS;
                            mkAArr[9] = mkA3;
                            mkAArr[10] = C67214MkA.SUGGESTIONS;
                            mkAArr[11] = C67214MkA.FIND_PEOPLE;
                            mkAArr[12] = C67214MkA.RECOMMENDED_USER_SUGGESTIONS;
                            mkAArr[13] = C67214MkA.LOCKED_CHAT;
                            mkA4 = C67214MkA.LOAD_MORE;
                        } else {
                            if (0qQ.A0K(r3, AnonymousClass496.A00)) {
                                mkAArr2 = new C67214MkA[8];
                                mkA5 = A01(mkAArr2);
                                mkA6 = C67214MkA.QUICK_PROMOTION;
                                mkAArr2[3] = mkA6;
                                mkAArr2[4] = C67214MkA.PARTNERSHIPS_INBOX_HEADER;
                                mkAArr2[5] = C67214MkA.INBOX_HEADER;
                                mkA7 = C67214MkA.THREADS;
                                mkAArr2[6] = mkA7;
                                mkA8 = C67214MkA.LOAD_MORE;
                            } else if (0qQ.A0K(r3, C67224MkK.A00)) {
                                C67214MkA mkA17 = C67214MkA.IRIS_ERROR;
                                mkA = C67214MkA.TOP_ANCHOR;
                                mkA2 = C67214MkA.QUICK_PROMOTION;
                                mkA3 = C67214MkA.THREADS;
                                mkAArr = new C67214MkA[]{mkA17, mkA, mkA2, mkA3};
                            } else if (0qQ.A0K(r3, C69932Ea.A00)) {
                                mkA = C67214MkA.TOP_ANCHOR;
                                C67214MkA mkA18 = C67214MkA.EB_ENTRYPOINT_BANNER;
                                mkA2 = C67214MkA.QUICK_PROMOTION;
                                C67214MkA mkA19 = C67214MkA.SEARCH_BAR;
                                C67214MkA mkA20 = C67214MkA.TRAY;
                                C67214MkA mkA21 = C67214MkA.INBOX_HEADER;
                                C67214MkA mkA22 = C67214MkA.FOLDER;
                                C67214MkA mkA23 = C67214MkA.INBOX_CAMPAIGN_BANNER;
                                C67214MkA mkA24 = C67214MkA.INBOX_ADS_EVENT_SHARING_NOTICE_BANNER;
                                mkA3 = C67214MkA.THREADS;
                                mkAArr = new C67214MkA[]{mkA, mkA18, mkA2, mkA19, mkA20, mkA21, mkA22, mkA23, mkA24, mkA3, C67214MkA.LOAD_MORE};
                            } else if (0qQ.A0K(r3, C67234MkU.A00)) {
                                C67214MkA mkA25 = C67214MkA.IRIS_ERROR;
                                mkA = C67214MkA.TOP_ANCHOR;
                                mkA2 = C67214MkA.QUICK_PROMOTION;
                                C67214MkA mkA26 = C67214MkA.SEARCH_BAR;
                                C67214MkA mkA27 = C67214MkA.TRAY;
                                C67214MkA mkA28 = C67214MkA.INBOX_HEADER;
                                C67214MkA mkA29 = C67214MkA.FOLDER;
                                mkA3 = C67214MkA.THREADS;
                                mkAArr = new C67214MkA[]{mkA25, mkA, mkA2, mkA26, mkA27, mkA28, mkA29, mkA3, C67214MkA.LOAD_MORE, C67214MkA.FILTER_ROW};
                            } else if (r3 instanceof 2Ej) {
                                C67214MkA mkA30 = C67214MkA.IRIS_ERROR;
                                mkA = C67214MkA.TOP_ANCHOR;
                                mkA2 = C67214MkA.QUICK_PROMOTION;
                                C67214MkA mkA31 = C67214MkA.SEARCH_BAR;
                                C67214MkA mkA32 = C67214MkA.TRAY;
                                C67214MkA mkA33 = C67214MkA.INBOX_HEADER;
                                C67214MkA mkA34 = C67214MkA.FOLDER;
                                mkA3 = C67214MkA.THREADS;
                                mkAArr = new C67214MkA[]{mkA30, mkA, mkA2, mkA31, mkA32, mkA33, mkA34, mkA3, C67214MkA.LOAD_MORE};
                            } else if (0qQ.A0K(r3, C300895y8.A00) || 0qQ.A0K(r3, C300885y7.A00)) {
                                mkAArr2 = new C67214MkA[8];
                                mkAArr2[0] = C67214MkA.IRIS_ERROR;
                                mkA5 = C67214MkA.TOP_ANCHOR;
                                mkAArr2[1] = mkA5;
                                mkA6 = C67214MkA.QUICK_PROMOTION;
                                mkAArr2[2] = mkA6;
                                mkAArr2[3] = C67214MkA.SEARCH_BAR;
                                mkAArr2[4] = C67214MkA.FOLDER;
                                mkA7 = C67214MkA.THREADS;
                                mkAArr2[5] = mkA7;
                                mkAArr2[6] = C67214MkA.LOAD_MORE;
                                mkA8 = C67214MkA.FILTER_ROW;
                            } else {
                                StringBuilder A1A = AnonymousClass7TE.A1A();
                                A1A.append("No capabilities object found for mode ");
                                A1A.append(r2);
                                throw AnonymousClass7TE.A0z(C51967G9n.A0r(A1A, '!'));
                            }
                            mkAArr[7] = mkA8;
                        }
                        c = 14;
                    }
                    mkAArr[c] = mkA4;
                }
                C66737Mbi mbi = new C66737Mbi(mkAArr);
                ViewModelListUpdate A0R = DbS.A0R();
                C67145Mj3 mj3 = mbh2.A0D;
                if (!C66738Mbj.A01(A0R, mbi, mj3, C67214MkA.IRIS_ERROR, miz)) {
                    UserSession userSession = mbh2.A0B;
                    if (2El.A0H(userSession)) {
                        A1P = mbh2.A0J;
                    } else {
                        A1P = 0sr.A1P(new C67214MkA[]{mkA, C67214MkA.EB_ENTRYPOINT_BANNER, mkA2, C67214MkA.SEARCH_BAR, C67214MkA.CF_HUB, C67214MkA.TRAY, C67214MkA.PARTNERSHIPS_INBOX_HEADER, C67214MkA.INBOX_HEADER, C67214MkA.FILTER_ROW, C67214MkA.FOLDER, C67214MkA.INBOX_CAMPAIGN_BANNER, C67214MkA.INBOX_ADS_EVENT_SHARING_NOTICE_BANNER});
                    }
                    C66738Mbj.A00(A0R, mbi, mj3, miz, A1P);
                    if (!C66738Mbj.A01(A0R, mbi, mj3, C67214MkA.GENERAL_FOLDER_DISABLED, miz)) {
                        C66738Mbj.A00(A0R, mbi, mj3, miz, 0sr.A1P(new C67214MkA[]{C67214MkA.GENERAL_FOLDER_HMPS_BANNER, C67214MkA.PARTNERSHIPS_INBOX_ROW, C67214MkA.LOCKED_CHAT, mkA3, C67214MkA.LOAD_MORE, C67214MkA.CHANNEL_INVITES}));
                        if (!2El.A0H(userSession)) {
                            C66738Mbj.A00(A0R, mbi, mj3, miz, 0sr.A1P(new C67214MkA[]{C67214MkA.SUGGESTIONS, C67214MkA.RECOMMENDED_USER_SUGGESTIONS, C67214MkA.FIND_PEOPLE}));
                        }
                    }
                }
                r9.accept(A0R);
            } finally {
                0fh.A00(-1365252926);
            }
        } else {
            mbh2.A0I.accept(Auh);
        }
    }

    public final C67307Mlh A05() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (C66702Mb9 mb9 : this.A0E.A0O) {
            if (mb9.A0j) {
                if (mb9.A0W) {
                    i2++;
                } else {
                    i++;
                }
                if (!mb9.A0e) {
                    i3++;
                }
            }
        }
        return new C67307Mlh(i + i2, i, i2, i3);
    }

    public final void A06(C232262tL r5) {
        if (r5 != null || this.A0E.A03 != null) {
            this.A0E.A03 = r5;
            if (182.A06(0Tu.A05, this.A0B, 36323242797181977L)) {
                A04(this);
            } else {
                A03(this);
            }
        }
    }

    public final void A08(C66788McZ mcZ) {
        C67141Miz miz = this.A0E;
        C66788McZ mcZ2 = miz.A0C;
        if (mcZ != null) {
            if (mcZ2 != null && mcZ.equals(mcZ2)) {
                return;
            }
        } else if (mcZ == mcZ2) {
            return;
        }
        miz.A0C = mcZ;
        A04(this);
    }

    public final void A0B(boolean z) {
        C67141Miz miz = this.A0E;
        if (miz.A0H != null) {
            boolean z2 = z;
            miz.A0H = C66891MeW.A00(this.A0B, miz.A0S, z2, miz.A0P, miz.A0T, miz.A0U, miz.A0W, miz.A0X, miz.A0Y, miz.A0V);
            A03(this);
        }
    }

    public C66736Mbh(Context context, FragmentActivity fragmentActivity, AnonymousClass0iw r39, 1aU r40, 1aU r41, 1aU r42, UserSession userSession, C67117Mib mib, C67116Mia mia, C66739Mbk mbk, C67115MiZ miZ, C67109MiT miT, C74566PxF pxF, JYS jys, C251033mS r51, C66890MeV meV, C67119Mid mid, C67119Mid mid2, C67119Mid mid3, C67113MiX miX, C67019Mgs mgs, C229122ms r58, C67114MiY miY, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        C269794fh r4;
        this.A03 = context;
        UserSession userSession2 = userSession;
        this.A0B = userSession2;
        this.A05 = r39;
        this.A0N = r51;
        this.A04 = fragmentActivity;
        this.A0F = pxF;
        C250993mO A012 = C250993mO.A01(userSession2);
        0qQ.A07(A012);
        this.A0O = A012;
        C66739Mbk mbk2 = mbk;
        this.A0C = mbk2;
        0Tu r2 = 0Tu.A05;
        boolean A062 = 182.A06(r2, userSession2, 36329131197153095L);
        this.A0M = A062;
        this.A0K = 182.A06(r2, userSession2, 36325892791940434L);
        if (A062) {
            r4 = null;
        } else {
            r4 = C318146oT.A01;
        }
        this.A0A = new 1a8(r4);
        this.A08 = r40;
        this.A09 = r41;
        this.A07 = r42;
        this.A0G = new PU9(10, miT, this);
        this.A0L = z;
        this.A0P = z2;
        this.A00 = new C66920MfE(3, 3, false);
        BizUserInboxState A0L2 = C66582MXn.A0L(userSession2);
        AnonymousClass4kA A002 = AnonymousClass4k9.A00(userSession2);
        C67220MkG mkG = (C67220MkG) C51968G9o.A10(C67220MkG.A06, DbY.A03(A002, A002.A0G, AnonymousClass4kA.A0c, 10));
        this.A01 = C67118Mic.A00(A0L2, mkG == null ? C67220MkG.DEFAULT : mkG);
        C67120Mie mie = new C67120Mie(userSession2);
        C67126Mik mik = new C67126Mik(userSession2, mbk2);
        C67219MkF mkF = C67219MkF.A01;
        C67218MkE mkE = C67218MkE.A00;
        C67215MkB mkB = C67215MkB.A00;
        C67217MkD mkD = C67217MkD.A00;
        C67133Mir mir = new C67133Mir(jys);
        C67216MkC mkC = C67216MkC.A00;
        C67222MkI mkI = C67222MkI.A00;
        C67223MkJ mkJ = C67223MkJ.A00;
        C67128Mim mim = new C67128Mim(userSession2, mbk2, mie);
        C67127Mil mil = new C67127Mil(userSession2, mia, mie);
        C67132Miq miq = new C67132Miq();
        C67130Mio mio = new C67130Mio();
        C67131Mip mip = new C67131Mip();
        C67129Min min = new C67129Min(userSession2);
        C67125Mij mij = new C67125Mij(mbk2);
        C67124Mii mii = new C67124Mii(userSession2, mid2, mid3, miX);
        C67122Mig mig = new C67122Mig(mib, mgs, miY);
        C67123Mih mih = new C67123Mih(userSession2, miZ, r58);
        C67128Mim mim2 = mim;
        C67127Mil mil2 = mil;
        C67129Min min2 = min;
        C67133Mir mir2 = mir;
        this.A0D = new C67145Mj3(mik, mkF, mkE, mkB, mkD, mir2, mkC, mkI, mkJ, mim2, mil2, miq, mio, mip, min2, mij, mii, mig, mih, new C67144Mj2(userSession2, mid), new C67142Mj0(), new C67146Mj4(userSession2), C67221MkH.A00);
        BizUserInboxState bizUserInboxState = A0L2;
        this.A0E = new C67141Miz(bizUserInboxState, A00(this, this.A01), meV, i, z3, z4, z5, z6, z7, z8);
        this.A0H = new PU8(this, 43);
        this.A0I = new PU8(this, 44);
        this.A0J = 0sr.A1P(new C67214MkA[]{C67214MkA.TOP_ANCHOR, C67214MkA.EB_ENTRYPOINT_BANNER, C67214MkA.QUICK_PROMOTION, C67214MkA.SEARCH_BAR, C67214MkA.FOLDER, C67214MkA.CF_HUB, C67214MkA.TRAY, C67214MkA.PARTNERSHIPS_INBOX_HEADER, C67214MkA.INBOX_HEADER, C67214MkA.FILTER_ROW, C67214MkA.INBOX_CAMPAIGN_BANNER, C67214MkA.INBOX_ADS_EVENT_SHARING_NOTICE_BANNER});
    }
}
