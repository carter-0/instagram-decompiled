package X;

import android.content.Context;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.mentions.SendMentionData$MentionData;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.Deprecated;

public final class PEM implements C333547Zj {
    public final C333537Zi A00;
    public final C67499Mot A01;

    public final boolean BJG() {
        this.A01.BJG();
        throw AnonymousClass00P.createAndThrow();
    }

    public final Integer CHQ() {
        this.A01.CHQ();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EJF(Context context, AnonymousClass0iw r3, C254703su r4, DirectThreadKey directThreadKey) {
        0qQ.A0B(directThreadKey, 0);
        throw C66583MXo.A0a();
    }

    public final 1aU EJG(C254743sy r2, String str) {
        0qQ.A0B(r2, 0);
        return this.A01.EJG(r2, str);
    }

    public final void ELL(Context context, UserSession userSession, C254933tI r13, DirectAnimatedMedia directAnimatedMedia, C254783t2 r15, String str, String str2, List list, boolean z) {
        DbW.A1O(directAnimatedMedia, 2, userSession);
        this.A01.ELL(context, userSession, r13, directAnimatedMedia, r15, str, str2, list, z);
    }

    public final void ELQ(Context context, UserSession userSession, C317966o8 r12, C254933tI r13, C254743sy r14, String str, List list, boolean z) {
        AnonymousClass7TG.A1N(context, userSession);
        0qQ.A0B(r12, 4);
        this.A01.ELQ(context, userSession, r12, r13, r14, str, list, z);
    }

    public final void ELc(C254783t2 r2, String str, String str2, String str3) {
        0qQ.A0B(r2, 0);
        this.A01.ELc(r2, str, str2, str3);
    }

    public final void ELq(Capabilities capabilities, C254743sy r10, String str, String str2, String str3, String str4, String str5) {
        this.A01.ELq(capabilities, r10, str, str2, "push_notif", "push_notification_action", (String) null);
    }

    public final 1aU EM5(C53401GnY gnY, OCA oca, C254743sy r4, String str, String str2, String str3, List list, boolean z) {
        0qQ.A0B(str2, 5);
        throw C66583MXo.A0a();
    }

    public final void EMA(DirectThreadKey directThreadKey, DirectAnimatedMedia directAnimatedMedia, C254783t2 r4, ExtendedImageUrl extendedImageUrl, String str, String str2, String str3, long j) {
        0qQ.A0B(directAnimatedMedia, 3);
        throw C66583MXo.A0a();
    }

    public final void EMB(C317966o8 r2, DirectThreadKey directThreadKey, ExtendedImageUrl extendedImageUrl, String str, String str2, String str3, long j) {
        0qQ.A0B(r2, 2);
        throw C66583MXo.A0a();
    }

    public final void EMC(ImageUrl imageUrl, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z) {
        0qQ.A0B(directShareTarget, 0);
    }

    public final void EMD(ImageUrl imageUrl, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, boolean z) {
        ImageUrl imageUrl2 = imageUrl;
        ExtendedImageUrl extendedImageUrl2 = extendedImageUrl;
        User user2 = user;
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        String str13 = str6;
        String str14 = str7;
        this.A01.EMD(imageUrl2, directShareTarget, extendedImageUrl2, user2, str9, str10, str11, str12, (String) null, str13, str14, str8, j, z);
    }

    public final ListenableFuture EMH(AnonymousClass9JH r15, C53401GnY gnY, C254933tI r17, OCA oca, C254743sy r19, AnonymousClass3Q2 r20, C352218Cl r21, String str, String str2, String str3, String str4, List list, boolean z) {
        C254743sy r5 = r19;
        0qQ.A0B(r5, 0);
        return this.A01.EMH((AnonymousClass9JH) null, gnY, r17, oca, r5, r20, r21, str, (String) null, str3, str4, list, z);
    }

    public final void EMJ(AnonymousClass9JH r15, C53401GnY gnY, C254933tI r17, OCA oca, C254743sy r19, AnonymousClass3Q2 r20, C352218Cl r21, String str, String str2, String str3, String str4, List list, boolean z) {
        this.A01.EMJ((AnonymousClass9JH) null, gnY, r17, oca, r19, r20, r21, str, (String) null, str3, str4, list, z);
    }

    public final void EMd(C254783t2 r2, String str, String str2, long j) {
        0qQ.A0B(r2, 0);
    }

    public final void EMl(C254933tI r2, DirectStoreSticker directStoreSticker, C254783t2 r4, String str) {
        0qQ.A0B(directStoreSticker, 1);
        throw C66583MXo.A0a();
    }

    @Deprecated(message = "Use {@link SendMessageManager#sendTextMessageRx} instead.")
    public final String EMq(Context context, C70766OKm oKm, C254933tI r16, OCA oca, C254743sy r18, Integer num, String str, String str2, String str3, String str4, String str5, boolean z) {
        C254743sy r5 = r18;
        0qQ.A0B(r5, 1);
        return this.A01.EMq(context, (C70766OKm) null, r16, (OCA) null, r5, num, str, str2, str3, (String) null, str5, z);
    }

    @Deprecated(message = "Use {@link SendMessageManager#sendTextMessageRx} instead.")
    public final String EMr(C254933tI r8, C254743sy r9, String str, String str2, String str3, boolean z) {
        0qQ.A0B(str, 1);
        return this.A01.EMr((C254933tI) null, r9, str, NetInfoModule.CONNECTION_TYPE_NONE, "push_notification_action", false);
    }

    public final 1aU EMt(C70766OKm oKm, C254933tI r20, OCA oca, DirectShareTarget directShareTarget, 2FW r23, C254783t2 r24, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z, boolean z2) {
        return this.A01.EMt((C70766OKm) null, r20, (OCA) null, directShareTarget, r23, r24, (Integer) null, (Integer) null, str, str2, str3, (String) null, (String) null, (String) null, list, z, z2);
    }

    public final ListenableFuture EMz(AnonymousClass9JH r15, C53401GnY gnY, C254933tI r17, OCA oca, C254743sy r19, ClipInfo clipInfo, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        C254743sy r5 = r19;
        ClipInfo clipInfo2 = clipInfo;
        DbY.A1S(r5, clipInfo2);
        return this.A01.EMz((AnonymousClass9JH) null, gnY, r17, oca, r5, clipInfo2, str, str2, (String) null, str4, str5, list, z);
    }

    public final void EN1(AnonymousClass9JH r15, C53401GnY gnY, C254933tI r17, OCA oca, C254743sy r19, ClipInfo clipInfo, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        ClipInfo clipInfo2 = clipInfo;
        0qQ.A0B(clipInfo2, 2);
        this.A01.EN1((AnonymousClass9JH) null, gnY, r17, oca, r19, clipInfo2, str, str2, (String) null, str4, str5, list, z);
    }

    public final 1aU EN2(C254783t2 r7, ClipInfo clipInfo, Long l, String str, String str2) {
        0qQ.A0B(str, 2);
        return this.A01.EN2(r7, clipInfo, l, str, (String) null);
    }

    public final 1aU EN3(C254783t2 r8, C352218Cl r9, Long l, String str, String str2, boolean z) {
        0qQ.A0B(str, 3);
        return this.A01.EN3(r8, r9, l, str, (String) null, z);
    }

    public final ListenableFuture EN4(C254933tI r10, C254743sy r11, C63822L8d l8d, String str, String str2, String str3, List list, boolean z) {
        0qQ.A0B(r11, 0);
        return this.A01.EN4(r10, r11, l8d, str, (String) null, str3, list, z);
    }

    public final void EN5(C254933tI r10, C254743sy r11, C63822L8d l8d, String str, String str2, String str3, List list, boolean z) {
        this.A01.EN5(r10, r11, l8d, str, (String) null, str3, list, z);
    }

    public final void EaQ(boolean z) {
        this.A01.EaQ(z);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Er5(Integer num) {
        0qQ.A0B(num, 0);
        this.A01.Er5(num);
        throw AnonymousClass00P.createAndThrow();
    }

    public final ListenableFuture FJE(C69668Npq npq, C254743sy r4, String str) {
        C333547Zj r0;
        0qQ.A0B(r4, 0);
        if (npq instanceof C68965Nbs) {
            r0 = this.A00;
        } else if (npq instanceof C68964Nbr) {
            r0 = this.A01;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return r0.FJE(npq, r4, (String) null);
    }

    public final void ELg(C70766OKm oKm, C254933tI r8, OCA oca, C254743sy r10, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list, boolean z) {
        C67499Mot.A01(r8, this.A01, r10, str, str3, list);
    }

    public final void ELt(C60957JuF juF, C70621ODs oDs, 2FW r21, C254743sy r22, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        C254743sy r4 = r22;
        String str8 = str;
        AnonymousClass7TG.A1N(r4, str8);
        String str9 = str6;
        String str10 = str5;
        2FW r3 = r21;
        boolean z5 = z2;
        C70621ODs oDs2 = oDs;
        boolean z6 = z;
        C60957JuF juF2 = juF;
        String str11 = str2;
        String str12 = str3;
        String str13 = str4;
        this.A01.ELt(juF2, oDs2, r3, r4, str8, str11, str12, str13, str10, str9, str7, j, z6, z5, z3, z4);
    }

    public final void EMj(C70766OKm oKm, C254933tI r8, OCA oca, C254743sy r10, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list, boolean z) {
        C67499Mot.A01(r8, this.A01, r10, str, str3, list);
    }

    public final 1aU EMs(N49 n49, C70766OKm oKm, C254933tI r30, OCA oca, DirectShareTarget directShareTarget, 2FW r33, C254783t2 r34, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        C254783t2 r8 = r34;
        2FW r7 = r33;
        C51969G9p.A1O(r8, 0, r7);
        return this.A01.EMs(n49, oKm, r30, oca, (DirectShareTarget) null, r7, r8, (Integer) null, (Integer) null, num3, num4, num5, l, str, NetInfoModule.CONNECTION_TYPE_NONE, str3, str4, (String) null, str6, str7, list, z, false, false, z4);
    }

    public final void EMv(C70766OKm oKm, C254933tI r8, SendMentionData$MentionData sendMentionData$MentionData, OCA oca, C254743sy r11, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list, List list2, boolean z) {
        C67499Mot.A01(r8, this.A01, r11, str, str3, list2);
    }

    public PEM(UserSession userSession, C67499Mot mot) {
        AnonymousClass7TG.A1O(userSession, mot);
        this.A01 = mot;
        this.A00 = C333527Zh.A00(userSession);
    }

    public final void AGJ(AnonymousClass0iw r2, C254703su r3, DirectThreadKey directThreadKey) {
        AnonymousClass7TG.A1N(directThreadKey, r3);
        this.A00.AGJ(r2, r3, directThreadKey);
    }

    public final 1aU AGK(C254743sy r2, String str) {
        AnonymousClass7TG.A1N(r2, str);
        return this.A01.AGK(r2, str);
    }

    public final void EKD(C254743sy r2, String str) {
        throw C66583MXo.A0a();
    }

    public final void ELs(OCA oca, C254743sy r3, String str, boolean z) {
        throw C66583MXo.A0a();
    }

    public final 1aU ELy(OCA oca, MessageIdentifier messageIdentifier, C254743sy r4, String str, List list, boolean z) {
        throw C66583MXo.A0a();
    }

    public final void EM6(Context context, UserSession userSession, C254743sy r4, C66569MWx mWx, String str, boolean z) {
        C51974G9v.A1K(context, userSession, mWx);
        0qQ.A0B(str, 5);
    }

    public final void EMO(C254933tI r2, C254743sy r3, String str, String str2, String str3, String str4, String str5) {
        throw C66583MXo.A0a();
    }

    public final void EMu(C70766OKm oKm, C254933tI r3, OCA oca, C254743sy r5, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        throw C66583MXo.A0a();
    }

    public final void FJB(C254743sy r2, String str) {
        throw C66583MXo.A0a();
    }

    public final void ELk(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        AnonymousClass7TG.A1O(str, str2);
    }

    public final void EMK(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        AnonymousClass7TG.A1O(str, str2);
    }

    public final void EMR(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        AnonymousClass7TG.A1O(str, str2);
    }

    public final void EN8(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        AnonymousClass7TG.A1O(str, str2);
    }

    public final void ELJ(Context context, UserSession userSession, C317966o8 r3, C254933tI r4, C254743sy r5, String str, boolean z) {
        C51974G9v.A1K(context, userSession, r3);
    }

    public final void ELa(Context context, UserSession userSession, C317966o8 r3, C254933tI r4, C254743sy r5, String str, boolean z) {
        C51974G9v.A1K(context, userSession, r3);
    }
}
