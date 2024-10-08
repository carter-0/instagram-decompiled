package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.AllUserStoryTarget;
import com.instagram.pendingmedia.model.CloseFriendsUserStoryTarget;
import com.instagram.pendingmedia.model.GroupProfileUserStoryTarget;
import com.instagram.pendingmedia.model.GroupUserStoryTarget;
import com.instagram.pendingmedia.model.SimpleUserStoryTarget;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: X.5IC  reason: invalid class name */
public final class AnonymousClass5IC implements 1us {
    public int A00;
    public AnonymousClass3QO A01;
    public AnonymousClass5IE A02;
    public ShareType A03;
    public String A04;
    public boolean A05;
    public C2374637t A06;

    public final /* synthetic */ void DCv(AnonymousClass1XT r1, UserSession userSession, AnonymousClass3Q2 r3) {
    }

    public final String getTypeName() {
        return "MultiConfigStoryTarget";
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.5IE, java.lang.Object] */
    public static void A00(UserStoryTarget userStoryTarget, AnonymousClass5IC r4) {
        String str;
        AnonymousClass5IE r2;
        if (userStoryTarget == null) {
            r2 = null;
        } else {
            ? obj = new Object();
            String CAh = userStoryTarget.CAh();
            obj.A05 = CAh;
            if (CAh != null) {
                switch (CAh.hashCode()) {
                    case -1501566039:
                        if (CAh.equals("GROUP_PROFILE")) {
                            obj.A02 = (GroupProfileUserStoryTarget) userStoryTarget;
                            r2 = obj;
                            break;
                        }
                        break;
                    case -798727403:
                        if (CAh.equals("CLOSE_FRIENDS_WITH_BLACKLIST")) {
                            obj.A01 = (CloseFriendsUserStoryTarget) userStoryTarget;
                            r2 = obj;
                            break;
                        }
                        break;
                    case -517433529:
                        str = "SHARE_TO_FRIENDS_STORY";
                        break;
                    case -195511486:
                        if (CAh.equals("ALL_WITH_BLACKLIST")) {
                            obj.A00 = (AllUserStoryTarget) userStoryTarget;
                            r2 = obj;
                            break;
                        }
                        break;
                    case 64897:
                        str = "ALL";
                        break;
                    case 2432460:
                        str = "OPAL";
                        break;
                    case 68091487:
                        if (CAh.equals("GROUP")) {
                            obj.A03 = (GroupUserStoryTarget) userStoryTarget;
                            r2 = obj;
                            break;
                        }
                        break;
                    case 702693113:
                        str = "PRIVATE_STORY";
                        break;
                    case 734941130:
                        str = "HALLPASS";
                        break;
                    case 842397247:
                        str = "HIGHLIGHTS";
                        break;
                    case 1001355831:
                        str = "FAVORITES";
                        break;
                    case 1261689812:
                        str = "EXCLUSIVE_STORY";
                        break;
                    case 1279756998:
                        str = "FACEBOOK";
                        break;
                    case 1702038030:
                        str = "CLOSE_FRIENDS";
                        break;
                    case 2036774020:
                        str = "FACEBOOK_DATING";
                        break;
                }
                if (CAh.equals(str)) {
                    obj.A04 = (SimpleUserStoryTarget) userStoryTarget;
                    r2 = obj;
                }
            }
            throw new IllegalStateException("UserStoryTargetHolder must be initialized with a UserStoryTarget object that has a valid type");
        }
        r4.A02 = r2;
    }

    public final UserStoryTarget A01() {
        UserStoryTarget userStoryTarget;
        String str;
        AnonymousClass5IE r2 = this.A02;
        if (r2 == null) {
            return null;
        }
        String str2 = r2.A05;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -1501566039:
                    if (str2.equals("GROUP_PROFILE")) {
                        userStoryTarget = r2.A02;
                        break;
                    }
                    break;
                case -798727403:
                    if (str2.equals("CLOSE_FRIENDS_WITH_BLACKLIST")) {
                        userStoryTarget = r2.A01;
                        break;
                    }
                    break;
                case -517433529:
                    str = "SHARE_TO_FRIENDS_STORY";
                    break;
                case -195511486:
                    if (str2.equals("ALL_WITH_BLACKLIST")) {
                        userStoryTarget = r2.A00;
                        break;
                    }
                    break;
                case 64897:
                    str = "ALL";
                    break;
                case 2432460:
                    str = "OPAL";
                    break;
                case 68091487:
                    if (str2.equals("GROUP")) {
                        userStoryTarget = r2.A03;
                        break;
                    }
                    break;
                case 702693113:
                    str = "PRIVATE_STORY";
                    break;
                case 734941130:
                    str = "HALLPASS";
                    break;
                case 842397247:
                    str = "HIGHLIGHTS";
                    break;
                case 1001355831:
                    str = "FAVORITES";
                    break;
                case 1261689812:
                    str = "EXCLUSIVE_STORY";
                    break;
                case 1279756998:
                    str = "FACEBOOK";
                    break;
                case 1702038030:
                    str = "CLOSE_FRIENDS";
                    break;
                case 2036774020:
                    str = "FACEBOOK_DATING";
                    break;
            }
            if (str2.equals(str)) {
                userStoryTarget = r2.A04;
                0qQ.A0A(userStoryTarget);
                return userStoryTarget;
            }
        }
        throw new IllegalStateException("UserStoryTargetHolder must have a valid type at the time UserStoryTargetHolder.get() is called");
    }

    /* JADX WARNING: type inference failed for: r0v23, types: [X.L1x, java.lang.Object] */
    public final /* bridge */ /* synthetic */ AnonymousClass1QX AEQ(Context context, 28D r23, MediaUploadMetadata mediaUploadMetadata, UserSession userSession, ShareType shareType, Object obj, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C16674UzA uzA;
        List copyOf;
        L52 l52 = (L52) obj;
        if (z4) {
            uzA = C16674UzA.A0O;
        } else {
            uzA = C16674UzA.A0N;
        }
        String str8 = str4;
        boolean z6 = z;
        UserSession userSession2 = userSession;
        String str9 = str7;
        28D r7 = r23;
        MediaUploadMetadata mediaUploadMetadata2 = mediaUploadMetadata;
        String str10 = str;
        1NY A012 = C64193LTa.A01(r7, mediaUploadMetadata2, userSession2, uzA, str10, str8, 0qv.A00(context), str6, str9, list, z6, z2, z3, z5);
        AnonymousClass3Q2 r3 = l52.A00;
        boolean z7 = z6;
        C64193LTa.A0J(A012, userSession2, C63368Kvp.A00(r3), j, z7);
        UserStoryTarget A013 = A01();
        A013.getClass();
        ShareType shareType2 = this.A03;
        String CAh = A013.CAh();
        if (CAh != null) {
            int hashCode = CAh.hashCode();
            if (hashCode != -1501566039) {
                if (hashCode != -798727403) {
                    if (hashCode == -195511486 && CAh.equals("ALL_WITH_BLACKLIST")) {
                        C64177LSe.A02(A012, shareType2);
                        copyOf = ((AllUserStoryTarget) A013).A01;
                    }
                    C64177LSe.A02(A012, shareType2);
                } else {
                    if (CAh.equals("CLOSE_FRIENDS_WITH_BLACKLIST")) {
                        C64177LSe.A02(A012, shareType2);
                        copyOf = ImmutableList.copyOf((Collection) ((CloseFriendsUserStoryTarget) A013).A01);
                    }
                    C64177LSe.A02(A012, shareType2);
                }
                if (copyOf != null && (!copyOf.isEmpty())) {
                    A012.A9m("story_blacklisted_viewer_ids", new JSONArray(copyOf).toString());
                }
            } else {
                if (CAh.equals("GROUP_PROFILE")) {
                    C64177LSe.A02(A012, shareType2);
                    PendingRecipient pendingRecipient = ((GroupProfileUserStoryTarget) A013).A00;
                    if (pendingRecipient != null) {
                        A012.A9m(AnonymousClass000.A00(1395), pendingRecipient.getId());
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                C64177LSe.A02(A012, shareType2);
            }
            long j2 = r3.A0e;
            0qQ.A0B(userSession2, 1);
            C64177LSe.A01(A012, userSession2, C64177LSe.A00(r3, true), j2, z7);
            AnonymousClass5IC r5 = l52.A01;
            AnonymousClass3QO r2 = r5.A01;
            if (r2 != AnonymousClass3QO.DEFAULT) {
                A012.A9m("audience", r2.A00);
            }
            FanClubInfoDict B3v = 0eE.A00(userSession2).A00().A03.B3v();
            if (r2 == AnonymousClass3QO.FAN_CLUB && B3v != null) {
                A012.A9m("fan_club_id", String.valueOf(B3v.getFanClubId()));
            }
            LJW.A01(A012, userSession2, LJW.A00(r3, r5), str3, str5);
            AnonymousClass8VT r0 = r3.A1Y;
            if (r0 != null) {
                A012.AA0("add_to_highlights", C64133LPh.A02(r0));
            }
            if (182.A06(0Tu.A05, userSession2, 36310881881031008L) && 1Au.A00(userSession2).A24("reel")) {
                Set A0I = 1Au.A00(userSession2).A0I("reel");
                ? obj2 = new Object();
                obj2.A00 = A0I;
                C64193LTa.A0K(A012, obj2);
            }
            return A012.A0N();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final /* bridge */ /* synthetic */ Object AEc(AnonymousClass3Q2 r2) {
        return new L52(r2, this);
    }

    public final ShareType BtR() {
        return this.A03;
    }

    public final int C2A() {
        return this.A00;
    }

    public final boolean CQR() {
        return this.A05;
    }

    public final K1X E1q(2ZL r2, UserSession userSession) {
        return this.A06.E1q(r2, userSession);
    }

    public final void E3L(UserSession userSession, AnonymousClass3Q2 r4, LFD lfd) {
        lfd.A00(r4.A1C, r4, false);
        AnonymousClass1Nd.A00(userSession).A00(new C2370936h(r4));
        lfd.A01(r4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5IC(com.instagram.pendingmedia.model.UserStoryTarget r3) {
        /*
            r2 = this;
            r2.<init>()
            A00(r3, r2)
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A02
            if (r3 == r0) goto L_0x004c
            java.lang.String r1 = r3.CAh()
            r1.getClass()
            java.lang.String r0 = "CLOSE_FRIENDS_WITH_BLACKLIST"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x004c
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A09
            if (r3 != r0) goto L_0x0034
            X.3QO r0 = X.AnonymousClass3QO.CUSTOM
        L_0x001f:
            r2.A01 = r0
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A07
            if (r3 != r0) goto L_0x002a
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.HIGHLIGHTS
        L_0x0027:
            r2.A03 = r0
            return
        L_0x002a:
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A0C
            if (r3 != r0) goto L_0x0031
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.SHARE_TO_FRIENDS_STORY
            goto L_0x0027
        L_0x0031:
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE
            goto L_0x0027
        L_0x0034:
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A03
            if (r3 != r0) goto L_0x003b
            X.3QO r0 = X.AnonymousClass3QO.FAN_CLUB
            goto L_0x001f
        L_0x003b:
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A06
            if (r3 != r0) goto L_0x0042
            X.3QO r0 = X.AnonymousClass3QO.HALLPASS
            goto L_0x001f
        L_0x0042:
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A08
            if (r3 != r0) goto L_0x0049
            X.3QO r0 = X.AnonymousClass3QO.OPAL
            goto L_0x001f
        L_0x0049:
            X.3QO r0 = X.AnonymousClass3QO.DEFAULT
            goto L_0x001f
        L_0x004c:
            X.3QO r0 = X.AnonymousClass3QO.CLOSE_FRIENDS
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5IC.<init>(com.instagram.pendingmedia.model.UserStoryTarget):void");
    }

    public final boolean CT0() {
        if (A01() == UserStoryTarget.A05) {
            return true;
        }
        return false;
    }

    public final boolean CT1() {
        if (A01() == UserStoryTarget.A04) {
            return true;
        }
        return false;
    }

    public final boolean CUN() {
        return A01() instanceof GroupProfileUserStoryTarget;
    }

    public final 1Xj Dou(Context context, AnonymousClass1XT r3, UserSession userSession, AnonymousClass3Q2 r5) {
        A01();
        return this.A06.Dou(context, r3, userSession, r5);
    }

    public final void ESc(boolean z) {
        this.A05 = z;
    }

    public final void EnN(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.37t, java.lang.Object] */
    public AnonymousClass5IC() {
        this.A06 = new Object();
    }
}
