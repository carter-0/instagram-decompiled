package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.user.model.User;
import java.util.List;

public final class FV6 implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "SuggestedRecipientViewModel";
    public boolean A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final SpannableStringBuilder A05;
    public final SpannableStringBuilder A06;
    public final ImageUrl A07;
    public final DcN A08;
    public final DirectShareTarget A09;
    public final UserStoryTarget A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final String A0H;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0060, code lost:
        if (X.182.A06(X.0Tu.A06, r5.A00, 36315541920615781L) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e7, code lost:
        if (X.C308556Us.A0M(r2, X.OZA.A00(r2, r12)) != false) goto L_0x00e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.FV6 A00(android.content.Context r21, com.instagram.common.session.UserSession r22, com.instagram.model.direct.DirectShareTarget r23, java.lang.String r24, int r25, int r26, int r27, int r28, boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            r2 = r22
            com.instagram.user.model.User r3 = X.DbT.A0j(r2)
            r12 = r23
            java.lang.String r14 = X.AnonymousClass50n.A03(r12, r3)
            java.util.List r5 = X.DbT.A14(r12)
            int r1 = r5.size()
            r0 = 1
            r13 = 0
            r4 = r21
            if (r1 <= r0) goto L_0x00cd
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1D(r5)
        L_0x001e:
            r11 = r13
        L_0x001f:
            boolean r7 = r12 instanceof com.instagram.model.direct.DirectReplyToMediaAuthorShareTarget
            r3 = 0
            r6 = r25
            if (r7 == 0) goto L_0x0095
            java.lang.Object r1 = r5.get(r3)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r1 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r1
            java.lang.String r14 = r1.A0C
            X.0qQ.A0B(r2, r3)
            r1 = 20
            X.PhW r5 = new X.PhW
            r5.<init>(r2, r1)
            java.lang.Class<X.Eti> r1 = X.C49327Eti.class
            java.lang.Object r5 = r2.A01(r1, r5)
            X.Eti r5 = (X.C49327Eti) r5
            r1 = r12
            com.instagram.model.direct.DirectReplyToMediaAuthorShareTarget r1 = (com.instagram.model.direct.DirectReplyToMediaAuthorShareTarget) r1
            java.lang.Integer r1 = r1.A00
            X.0qQ.A0B(r1, r3)
            int r1 = r1.intValue()
            if (r1 == r3) goto L_0x0062
            if (r1 == r0) goto L_0x0069
            r0 = 2
            if (r1 != r0) goto L_0x0069
            com.instagram.common.session.UserSession r7 = r5.A00
            X.0Tu r5 = X.0Tu.A06
            r0 = 36315541920615781(0x8104cb00010d65, double:3.029433169322866E-306)
            boolean r0 = X.182.A06(r5, r7, r0)
            if (r0 == 0) goto L_0x0069
        L_0x0062:
            r0 = 2131960214(0x7f132196, float:1.955709E38)
            java.lang.String r14 = X.DbW.A0h(r4, r14, r0)
        L_0x0069:
            r8 = r13
            r9 = r13
            r16 = r13
        L_0x006d:
            r12.A08()
            com.instagram.common.typedurl.ImageUrl r10 = X.OXB.A02(r2, r12)
            X.0qQ.A0B(r2, r3)
            X.2Ep r0 = X.OZA.A00(r2, r12)
            boolean r25 = X.C308556Us.A0M(r2, r0)
            X.FV6 r7 = new X.FV6
            r15 = r24
            r19 = r26
            r20 = r27
            r21 = r28
            r22 = r29
            r23 = r30
            r24 = r32
            r18 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r7
        L_0x0095:
            android.text.SpannableStringBuilder r8 = X.C49751F5c.A00(r4, r2, r12, r14, r6)
            if (r1 <= r0) goto L_0x00c8
            java.lang.Object r0 = r5.get(r3)
            X.170 r0 = (X.AnonymousClass170) r0
            java.lang.String r16 = X.AnonymousClass50n.A04(r0)
        L_0x00a5:
            boolean r0 = r12.A0F()
            if (r0 != 0) goto L_0x00c3
            if (r31 == 0) goto L_0x00cb
            boolean r0 = r12.A0S()
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = r2.A06
            java.lang.Integer r1 = r12.A04(r0, r3)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x00cb
            java.lang.String r0 = r12.A05()
            if (r0 == 0) goto L_0x00cb
        L_0x00c3:
            android.text.SpannableStringBuilder r9 = X.C49751F5c.A01(r4, r12, r6)
            goto L_0x006d
        L_0x00c8:
            r16 = r13
            goto L_0x00a5
        L_0x00cb:
            r9 = r13
            goto L_0x006d
        L_0x00cd:
            if (r1 != r0) goto L_0x0108
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1D(r5)
            X.OZA r3 = X.OZA.A00
            boolean r3 = r3.A01(r2, r12)
            if (r3 != 0) goto L_0x00e9
            r3 = 0
            X.0qQ.A0B(r2, r3)
            X.2Ep r3 = X.OZA.A00(r2, r12)
            boolean r3 = X.C308556Us.A0M(r2, r3)
            if (r3 == 0) goto L_0x001e
        L_0x00e9:
            int r3 = X.2Yu.A09(r4)
            int r19 = r4.getColor(r3)
            int r3 = X.2Yu.A09(r4)
            int r20 = r4.getColor(r3)
            r21 = 0
            X.DcN r11 = new X.DcN
            r18 = r11
            r22 = r0
            r23 = r21
            r18.<init>(r19, r20, r21, r22, r23)
            goto L_0x001f
        L_0x0108:
            java.util.List r17 = X.DbW.A0n(r3)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FV6.A00(android.content.Context, com.instagram.common.session.UserSession, com.instagram.model.direct.DirectShareTarget, java.lang.String, int, int, int, int, boolean, boolean, boolean, boolean):X.FV6");
    }

    public final boolean A02() {
        DirectShareTarget directShareTarget = this.A09;
        directShareTarget.getClass();
        if ((DbS.A0c(directShareTarget) instanceof AnonymousClass9HR) || !TextUtils.isEmpty(this.A06)) {
            return true;
        }
        return false;
    }

    public final boolean A03() {
        if (this.A0D.size() <= 1) {
            return false;
        }
        return true;
    }

    public final String getModuleName() {
        return this.A0H;
    }

    public static FV6 A01(Context context, UserStoryTarget userStoryTarget, User user, String str, boolean z) {
        return new FV6((SpannableStringBuilder) null, (SpannableStringBuilder) null, (ImageUrl) null, (DcN) null, (DirectShareTarget) null, userStoryTarget, context.getResources().getString(2131960146), str, (String) null, DbW.A0n(user), 1, -1, -1, -1, z, false, false, false);
    }

    public FV6(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, ImageUrl imageUrl, DcN dcN, DirectShareTarget directShareTarget, UserStoryTarget userStoryTarget, String str, String str2, String str3, List list, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0D = list;
        this.A0C = str;
        this.A06 = spannableStringBuilder;
        this.A05 = spannableStringBuilder2;
        this.A01 = i;
        this.A00 = z;
        this.A09 = directShareTarget;
        this.A0A = userStoryTarget;
        this.A0F = z2;
        this.A08 = dcN;
        this.A07 = imageUrl;
        this.A03 = i2;
        this.A04 = i3;
        this.A0H = str2;
        this.A0B = str3;
        this.A02 = i4;
        this.A0G = z3;
        this.A0E = z4;
    }
}
