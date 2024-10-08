package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeSubmissionShareInfo;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel;
import com.instagram.user.model.User;

/* renamed from: X.7HI  reason: invalid class name */
public final class AnonymousClass7HI implements AnonymousClass7HJ {
    public final /* synthetic */ AnonymousClass7H6 A00;

    public final void DjH(MessagingUser messagingUser) {
        MessagingUser messagingUser2 = messagingUser;
        if (messagingUser.A04) {
            AnonymousClass7H6 r3 = this.A00;
            String A0A = AnonymousClass7H6.A0A(r3);
            if (A0A != null) {
                UserSession userSession = r3.A0w;
                String str = messagingUser.A03;
                0qQ.A07(str);
                C3265677h.A0K(r3, userSession, A0A, str);
            }
            C48838El0.A00(r3.A0t, r3, r3.A0w, messagingUser2, "direct_permanent_media_viewer", (String) null, true, false);
        }
    }

    public AnonymousClass7HI(AnonymousClass7H6 r1) {
        this.A00 = r1;
    }

    public final void CxV() {
        AnonymousClass7H6.A0J(this.A00);
    }

    public final void D89() {
        0sP r0;
        AnonymousClass7H6 r02 = this.A00;
        AnonymousClass77B A05 = AnonymousClass7H6.A05(r02);
        if (A05 != null && (r0 = r02.A0b) != null) {
            r0.invoke(A05);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (X.182.A06(X.0Tu.A05, r5, 36330166284403179L) == false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DAC() {
        /*
            r12 = this;
            X.7H6 r4 = r12.A00
            X.PAM r1 = new X.PAM
            r1.<init>(r4)
            androidx.fragment.app.FragmentActivity r0 = r4.A0t
            com.instagram.common.session.UserSession r5 = r4.A0w
            X.OsF r6 = new X.OsF
            r6.<init>(r0, r4, r5, r1)
            X.77B r3 = X.AnonymousClass7H6.A05(r4)
            if (r3 == 0) goto L_0x004e
            X.1iA r9 = r3.A0I
            if (r9 == 0) goto L_0x009e
            X.3sy r1 = r4.A0S
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A04(r1)
            if (r0 == 0) goto L_0x004f
            X.1Xj r8 = r3.A0E
            if (r8 == 0) goto L_0x005d
            X.2Ep r0 = r4.A0N
            X.XSV r7 = X.OP1.A00(r0)
            java.lang.String r10 = r3.A0T
            X.1iA r0 = X.1iA.A0Q
            if (r9 != r0) goto L_0x004a
            com.instagram.model.mediasize.ImageInfo r0 = r8.A1p()
            boolean r0 = X.1iI.A09(r5, r0)
            if (r0 == 0) goto L_0x004a
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330166284403179(0x811218000341eb, double:3.038681675869603E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r11 = 1
            if (r0 != 0) goto L_0x004b
        L_0x004a:
            r11 = 0
        L_0x004b:
            r6.A06(r7, r8, r9, r10, r11)
        L_0x004e:
            return
        L_0x004f:
            com.instagram.model.direct.threadkey.impl.MsysThreadId r0 = X.C66647MaG.A07(r1)
            if (r0 == 0) goto L_0x004e
            X.1Xj r8 = r3.A0E
            if (r8 == 0) goto L_0x006c
            r7 = 0
            r11 = 0
            r10 = r7
            goto L_0x004b
        L_0x005d:
            X.5yB r2 = r3.A0F
            if (r2 == 0) goto L_0x009e
            r1 = 12
            X.Inz r0 = new X.Inz
            r0.<init>(r1, r9, r6, r2)
            X.C71872OsF.A03(r6, r0)
            return
        L_0x006c:
            X.1aU r1 = r3.A00()
            X.Ovn r0 = X.C72074Ovn.A00
            X.1aU r1 = r1.A0L(r0)
            X.48z r0 = X.C2612848z.A00
            X.1aU r0 = X.1aU.A09(r0)
            X.1aJ r2 = r1.A00
            X.1aJ r1 = r0.A00
            r0 = 1025(0x401, float:1.436E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.1aP.A01(r1, r0)
            X.XQM r0 = new X.XQM
            r0.<init>(r2, r1)
            X.1aU r2 = new X.1aU
            r2.<init>(r0)
            X.1a8 r1 = r4.A0v
            X.PSF r0 = new X.PSF
            r0.<init>(r3, r6)
            r1.A02(r2, r0)
            return
        L_0x009e:
            r6.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7HI.DAC():void");
    }

    public final void De3() {
        0sP r0;
        AnonymousClass7H6 r2 = this.A00;
        AnonymousClass77B A05 = AnonymousClass7H6.A05(r2);
        if (A05 != null && (r0 = r2.A0c) != null) {
            r0.invoke(A05);
            AnonymousClass7H6.A0M(r2);
        }
    }

    public final void Djk() {
        AnonymousClass77B A05;
        String str;
        String str2;
        1Xj r1;
        FragmentActivity fragmentActivity;
        ExtendedImageUrl A1n;
        AnonymousClass2Ep r7;
        String str3;
        User user;
        Integer num;
        String str4;
        String str5;
        DirectThreadKey directThreadKey;
        AnonymousClass7H6 r4 = this.A00;
        String A0A = AnonymousClass7H6.A0A(r4);
        if (A0A != null && (A05 = AnonymousClass7H6.A05(r4)) != null && (str = A05.A0S) != null && (str2 = A05.A0V) != null && (r1 = A05.A0E) != null && (A1n = r1.A1n(fragmentActivity)) != null && (r7 = r4.A0N) != null) {
            0nA.A0J((fragmentActivity = r4.A0t));
            UserSession userSession = r4.A0w;
            C254743sy r8 = r4.A0S;
            if (!(r8 instanceof DirectThreadKey) || (directThreadKey = (DirectThreadKey) r8) == null) {
                str3 = null;
            } else {
                str3 = directThreadKey.A01;
            }
            String str6 = A05.A0X;
            String str7 = A05.A0U;
            if (str7 != null) {
                user = 17h.A00(A05.A0D).A02(str7);
            } else {
                user = null;
            }
            ChannelChallengeStickerWinnerModel channelChallengeStickerWinnerModel = new ChannelChallengeStickerWinnerModel(A1n, user, str);
            String str8 = A05.A0T;
            String str9 = A05.A0N;
            AnonymousClass3S9 r12 = ((AnonymousClass3U9) r7).A01;
            C242243Te r5 = r12.A0s;
            if (r5 != null) {
                num = Integer.valueOf(r5.A00);
            } else {
                num = null;
            }
            String str10 = userSession.A06;
            String A002 = C329997La.A00(r12.A0s, str10, r7.C6a());
            boolean z = A05.A0f;
            if (z) {
                str4 = "winners_chosen";
            } else if (A05.A0e) {
                str4 = "ended";
            } else {
                str4 = AppStateModule.APP_STATE_ACTIVE;
            }
            OX8.A01(fragmentActivity, r4, userSession, new ChannelChallengeSubmissionShareInfo(channelChallengeStickerWinnerModel, num, A0A, str3, str2, str6, (String) null, str8, str9, A002, str4, C66579MXk.A00(701)));
            AnonymousClass7H6.A0M(r4);
            AnonymousClass2Ep r42 = r4.A0N;
            if (r42 != null) {
                C72202OyR A003 = C69869NtX.A00(userSession);
                String C6C = r42.C6C();
                String C6k = r42.C6k();
                Integer valueOf = Integer.valueOf(r42.AdN());
                String A004 = C329997La.A00(((AnonymousClass3U9) r42).A01.A0s, str10, r42.C6a());
                boolean z2 = A05.A0e;
                if (z) {
                    str5 = "winners_chosen";
                } else if (z2) {
                    str5 = "ended";
                } else {
                    str5 = AppStateModule.APP_STATE_ACTIVE;
                }
                C72202OyR.A03((C69493Nmb) null, A003, valueOf, C6C, C6k, C66579MXk.A00(699), "tap", C66579MXk.A00(698), "thread_view", C72202OyR.A02(str2, A004, str5, "share_submission"));
            }
        }
    }
}
