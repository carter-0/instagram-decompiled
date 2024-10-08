package X;

import android.content.Context;
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

/* renamed from: X.7Zj  reason: invalid class name and case insensitive filesystem */
public interface C333547Zj {
    void AGJ(AnonymousClass0iw r1, C254703su r2, DirectThreadKey directThreadKey);

    1aU AGK(C254743sy r1, String str);

    boolean BJG();

    Integer CHQ();

    void EJF(Context context, AnonymousClass0iw r2, C254703su r3, DirectThreadKey directThreadKey);

    1aU EJG(C254743sy r1, String str);

    void EKD(C254743sy r1, String str);

    void ELJ(Context context, UserSession userSession, C317966o8 r3, C254933tI r4, C254743sy r5, String str, boolean z);

    void ELL(Context context, UserSession userSession, C254933tI r3, DirectAnimatedMedia directAnimatedMedia, C254783t2 r5, String str, String str2, List list, boolean z);

    void ELQ(Context context, UserSession userSession, C317966o8 r3, C254933tI r4, C254743sy r5, String str, List list, boolean z);

    void ELa(Context context, UserSession userSession, C317966o8 r3, C254933tI r4, C254743sy r5, String str, boolean z);

    void ELc(C254783t2 r1, String str, String str2, String str3);

    void ELg(C70766OKm oKm, C254933tI r2, OCA oca, C254743sy r4, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list, boolean z);

    void ELk(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z);

    void ELq(Capabilities capabilities, C254743sy r2, String str, String str2, String str3, String str4, String str5);

    void ELs(OCA oca, C254743sy r2, String str, boolean z);

    void ELt(C60957JuF juF, C70621ODs oDs, 2FW r3, C254743sy r4, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2, boolean z3, boolean z4);

    1aU ELy(OCA oca, MessageIdentifier messageIdentifier, C254743sy r3, String str, List list, boolean z);

    1aU EM5(C53401GnY gnY, OCA oca, C254743sy r3, String str, String str2, String str3, List list, boolean z);

    void EM6(Context context, UserSession userSession, C254743sy r3, C66569MWx mWx, String str, boolean z);

    void EMA(DirectThreadKey directThreadKey, DirectAnimatedMedia directAnimatedMedia, C254783t2 r3, ExtendedImageUrl extendedImageUrl, String str, String str2, String str3, long j);

    void EMB(C317966o8 r1, DirectThreadKey directThreadKey, ExtendedImageUrl extendedImageUrl, String str, String str2, String str3, long j);

    void EMC(ImageUrl imageUrl, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z);

    void EMD(ImageUrl imageUrl, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, boolean z);

    ListenableFuture EMH(AnonymousClass9JH r1, C53401GnY gnY, C254933tI r3, OCA oca, C254743sy r5, AnonymousClass3Q2 r6, C352218Cl r7, String str, String str2, String str3, String str4, List list, boolean z);

    void EMJ(AnonymousClass9JH r1, C53401GnY gnY, C254933tI r3, OCA oca, C254743sy r5, AnonymousClass3Q2 r6, C352218Cl r7, String str, String str2, String str3, String str4, List list, boolean z);

    void EMK(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z);

    void EMO(C254933tI r1, C254743sy r2, String str, String str2, String str3, String str4, String str5);

    void EMR(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z);

    void EMd(C254783t2 r1, String str, String str2, long j);

    void EMj(C70766OKm oKm, C254933tI r2, OCA oca, C254743sy r4, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list, boolean z);

    void EMl(C254933tI r1, DirectStoreSticker directStoreSticker, C254783t2 r3, String str);

    @Deprecated(message = "Use {@link SendMessageManager#sendTextMessageRx} instead.")
    String EMq(Context context, C70766OKm oKm, C254933tI r3, OCA oca, C254743sy r5, Integer num, String str, String str2, String str3, String str4, String str5, boolean z);

    @Deprecated(message = "Use {@link SendMessageManager#sendTextMessageRx} instead.")
    String EMr(C254933tI r1, C254743sy r2, String str, String str2, String str3, boolean z);

    1aU EMs(N49 n49, C70766OKm oKm, C254933tI r3, OCA oca, DirectShareTarget directShareTarget, 2FW r6, C254783t2 r7, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, boolean z, boolean z2, boolean z3, boolean z4);

    1aU EMt(C70766OKm oKm, C254933tI r2, OCA oca, DirectShareTarget directShareTarget, 2FW r5, C254783t2 r6, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z, boolean z2);

    void EMu(C70766OKm oKm, C254933tI r2, OCA oca, C254743sy r4, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list, boolean z);

    void EMv(C70766OKm oKm, C254933tI r2, SendMentionData$MentionData sendMentionData$MentionData, OCA oca, C254743sy r5, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list, List list2, boolean z);

    ListenableFuture EMz(AnonymousClass9JH r1, C53401GnY gnY, C254933tI r3, OCA oca, C254743sy r5, ClipInfo clipInfo, String str, String str2, String str3, String str4, String str5, List list, boolean z);

    void EN1(AnonymousClass9JH r1, C53401GnY gnY, C254933tI r3, OCA oca, C254743sy r5, ClipInfo clipInfo, String str, String str2, String str3, String str4, String str5, List list, boolean z);

    1aU EN2(C254783t2 r1, ClipInfo clipInfo, Long l, String str, String str2);

    1aU EN3(C254783t2 r1, C352218Cl r2, Long l, String str, String str2, boolean z);

    ListenableFuture EN4(C254933tI r1, C254743sy r2, C63822L8d l8d, String str, String str2, String str3, List list, boolean z);

    void EN5(C254933tI r1, C254743sy r2, C63822L8d l8d, String str, String str2, String str3, List list, boolean z);

    void EN8(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z);

    void EaQ(boolean z);

    void Er5(Integer num);

    void FJB(C254743sy r1, String str);

    ListenableFuture FJE(C69668Npq npq, C254743sy r2, String str);
}
