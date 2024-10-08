package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.UserStoryTarget;
import java.util.List;

/* renamed from: X.Lqn  reason: case insensitive filesystem */
public final class C65294Lqn implements MXS, MSO {
    public final Context A00;
    public final UserSession A01;
    public final UserStoryTarget A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final IngestSessionShim A06;
    public final List A07 = 0sn.A00;

    public final boolean CKn(DirectShareTarget directShareTarget) {
        return false;
    }

    public final List AxF() {
        return this.A07;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0 = r1.equals(r0);
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r0 = r1.equals(r0);
        r1 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int BtD() {
        /*
            r2 = this;
            com.instagram.pendingmedia.model.UserStoryTarget r0 = r2.A02
            java.lang.String r1 = r0.CAh()
            if (r1 == 0) goto L_0x0034
            int r0 = r1.hashCode()
            switch(r0) {
                case -798727403: goto L_0x0011;
                case -195511486: goto L_0x0014;
                case 64897: goto L_0x0017;
                case 702693113: goto L_0x001f;
                case 1279756998: goto L_0x0022;
                case 1702038030: goto L_0x002a;
                default: goto L_0x000f;
            }
        L_0x000f:
            r1 = -1
        L_0x0010:
            return r1
        L_0x0011:
            java.lang.String r0 = "CLOSE_FRIENDS_WITH_BLACKLIST"
            goto L_0x002c
        L_0x0014:
            java.lang.String r0 = "ALL_WITH_BLACKLIST"
            goto L_0x0019
        L_0x0017:
            java.lang.String r0 = "ALL"
        L_0x0019:
            boolean r0 = r1.equals(r0)
            r1 = 1
            goto L_0x0031
        L_0x001f:
            java.lang.String r0 = "PRIVATE_STORY"
            goto L_0x002c
        L_0x0022:
            java.lang.String r0 = "FACEBOOK"
            boolean r0 = r1.equals(r0)
            r1 = 5
            goto L_0x0031
        L_0x002a:
            java.lang.String r0 = "CLOSE_FRIENDS"
        L_0x002c:
            boolean r0 = r1.equals(r0)
            r1 = 2
        L_0x0031:
            if (r0 != 0) goto L_0x0010
            goto L_0x000f
        L_0x0034:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65294Lqn.BtD():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        if (r6.A5w != true) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EM2() {
        /*
            r15 = this;
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r0 = r15.A06
            java.util.List r0 = r0.A00
            java.util.Iterator r14 = r0.iterator()
        L_0x0008:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0149
            java.lang.String r5 = X.AnonymousClass7TE.A18(r14)
            com.instagram.common.session.UserSession r4 = r15.A01
            X.3Q2 r6 = X.JTQ.A0M(r4, r5)
            com.instagram.pendingmedia.model.UserStoryTarget r8 = r15.A02
            X.5IC r3 = new X.5IC
            r3.<init>(r8)
            r7 = 1
            if (r6 == 0) goto L_0x0027
            boolean r1 = r6.A5w
            r0 = 1
            if (r1 == r7) goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            java.lang.String r13 = "Required value was null."
            if (r0 == 0) goto L_0x0046
            if (r6 == 0) goto L_0x013a
            java.util.Iterator r9 = X.JTQ.A0g(r6)
        L_0x0032:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0058
            X.3Q2 r2 = X.JTO.A0m(r9)
            com.instagram.pendingmedia.model.constants.ShareType r1 = r2.A0E()
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE
            if (r1 != r0) goto L_0x0032
            r6 = r2
            goto L_0x0032
        L_0x0046:
            if (r6 != 0) goto L_0x0058
            r0 = 231(0xe7, float:3.24E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = X.002.A0R(r0, r5)
            java.lang.String r0 = "StorySendJob"
            X.0wb.A04(r0, r1, r7)
            goto L_0x0008
        L_0x0058:
            java.lang.Class<X.5IC> r1 = X.AnonymousClass5IC.class
            r0 = 0
            java.util.ArrayList r0 = r6.A0K(r0, r1)
            com.instagram.pendingmedia.model.UserStoryTarget r1 = r3.A01()
            if (r1 == 0) goto L_0x0144
            java.util.Iterator r12 = r0.iterator()
        L_0x0069:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00d9
            java.lang.Object r0 = r12.next()
            X.5IC r0 = (X.AnonymousClass5IC) r0
            com.instagram.pendingmedia.model.UserStoryTarget r9 = r0.A01()
            if (r9 == 0) goto L_0x013f
            boolean r0 = r9.equals(r1)
            if (r0 == 0) goto L_0x0095
            java.lang.String r1 = r9.CAh()
            java.lang.String r0 = "Detected duplicate share target of type %s"
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r1)
            X.0qQ.A07(r1)
            java.lang.String r0 = "StorySendJob"
            X.0wb.A03(r0, r1)
            goto L_0x0008
        L_0x0095:
            com.instagram.pendingmedia.model.UserStoryTarget r10 = com.instagram.pendingmedia.model.UserStoryTarget.A02
            java.lang.String r2 = "CLOSE_FRIENDS_WITH_BLACKLIST"
            java.lang.String r11 = "ALL_WITH_BLACKLIST"
            if (r1 == r10) goto L_0x00ab
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A09
            if (r1 == r0) goto L_0x00ab
            java.lang.String r0 = r1.CAh()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00b9
        L_0x00ab:
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A01
            if (r9 == r0) goto L_0x0008
            java.lang.String r0 = r9.CAh()
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0008
        L_0x00b9:
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A01
            if (r1 == r0) goto L_0x00c7
            java.lang.String r0 = r1.CAh()
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0069
        L_0x00c7:
            if (r9 == r10) goto L_0x0008
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A09
            if (r9 == r0) goto L_0x0008
            java.lang.String r0 = r9.CAh()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0069
            goto L_0x0008
        L_0x00d9:
            r6.A5g = r7
            r6.A0a(r3)
            java.lang.String r2 = r15.A04
            if (r2 == 0) goto L_0x00e4
            r6.A2p = r2
        L_0x00e4:
            java.lang.String r1 = r15.A03
            if (r1 == 0) goto L_0x00f8
            boolean r0 = r15.A05
            if (r0 != 0) goto L_0x00f6
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A04
            if (r8 == r0) goto L_0x00f6
            if (r2 == 0) goto L_0x00f8
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A05
            if (r8 != r0) goto L_0x00f8
        L_0x00f6:
            r6.A2i = r1
        L_0x00f8:
            boolean r0 = r8 instanceof com.instagram.pendingmedia.model.AllUserStoryTarget
            if (r0 != 0) goto L_0x0100
            boolean r0 = r8 instanceof com.instagram.pendingmedia.model.CloseFriendsUserStoryTarget
            if (r0 == 0) goto L_0x0102
        L_0x0100:
            r6.A4w = r7
        L_0x0102:
            boolean r0 = r15.A05
            if (r0 == 0) goto L_0x0118
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325841252136218(0x810e290000351a, double:3.0359465080484696E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x012f
            r6.A5T = r7
            r0 = 0
            r6.A4w = r0
        L_0x0118:
            com.instagram.pendingmedia.store.PendingMediaStore r0 = X.28K.A00(r4)
            r0.A0A()
            X.JcS r2 = X.JTS.A0P(r4)
            android.content.Context r1 = r15.A00
            X.Lqe r0 = new X.Lqe
            r0.<init>(r1, r4, r3, r5)
            r2.A01(r0)
            goto L_0x0008
        L_0x012f:
            com.instagram.pendingmedia.model.UserStoryTarget r1 = com.instagram.pendingmedia.model.UserStoryTarget.A04
            X.5IC r0 = new X.5IC
            r0.<init>(r1)
            r6.A0a(r0)
            goto L_0x0118
        L_0x013a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x013f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x0144:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65294Lqn.EM2():void");
    }

    public C65294Lqn(Context context, UserSession userSession, IngestSessionShim ingestSessionShim, UserStoryTarget userStoryTarget, String str, String str2, boolean z) {
        C51974G9v.A1P(context, userSession, userStoryTarget, ingestSessionShim);
        this.A01 = userSession;
        this.A02 = userStoryTarget;
        this.A06 = ingestSessionShim;
        this.A05 = z;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = DbT.A05(context);
    }
}
