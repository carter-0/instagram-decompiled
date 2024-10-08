package X;

import android.content.Context;
import com.instagram.api.schemas.MessagingOffPlatformShareType;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.DirectAREffectShare;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf;
import com.instagram.infocenter.intf.InfoCenterShareInfoIntf;
import com.instagram.model.direct.DirectPendingLayeredXma;
import com.instagram.model.direct.DirectRoomsXma;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.Deprecated;

/* renamed from: X.7Z7  reason: invalid class name */
public interface AnonymousClass7Z7 {
    void AWR(DirectForwardingParams directForwardingParams, DirectShareTarget directShareTarget, 2FW r3, String str, String str2, boolean z);

    void ELK(DirectAREffectShare directAREffectShare, DirectShareTarget directShareTarget, String str, String str2, boolean z);

    void ELM(Context context, UserSession userSession, DirectShareTarget directShareTarget, DirectAnimatedMedia directAnimatedMedia, String str, String str2, boolean z);

    void ELS(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z);

    void ELT(1Xj r1, DirectShareTarget directShareTarget, String str, boolean z);

    void ELU(SocialContextType socialContextType, 1Xj r2, DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z);

    void ELV(SocialContextType socialContextType, C317966o8 r2, 1Xj r3, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, boolean z);

    void ELW(DirectShareTarget directShareTarget, SavedCollection savedCollection, String str, String str2, boolean z);

    void ELX(C247733gp r1, DirectShareTarget directShareTarget, String str, boolean z);

    void ELY(C317966o8 r1, 1Xj r2, DirectPendingLayeredXma directPendingLayeredXma, DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z, boolean z2);

    void ELZ(ImageUrl imageUrl, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, String str3, String str4, String str5, long j, boolean z);

    void ELb(DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, boolean z);

    void ELh(DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, boolean z);

    void ELi(1Xj r1, DirectShareTarget directShareTarget, String str, boolean z, boolean z2);

    void ELl(DirectShareTarget directShareTarget, C51151FpN fpN, String str, String str2, String str3, boolean z);

    void ELm(1Xj r1, DirectShareTarget directShareTarget, String str, String str2, boolean z);

    void ELn(C48097EVp eVp, DirectShareTarget directShareTarget, Long l, String str, String str2, String str3, long j, boolean z);

    void ELo(InfoCenterFactShareInfoIntf infoCenterFactShareInfoIntf, DirectShareTarget directShareTarget, String str, String str2, boolean z);

    void ELp(InfoCenterShareInfoIntf infoCenterShareInfoIntf, DirectShareTarget directShareTarget, String str, String str2, boolean z);

    void ELu(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z);

    void ELv(Context context, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, boolean z);

    void ELw(C317966o8 r1, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, boolean z);

    void ELz(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z);

    void EM0(1Xj r1, DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z, boolean z2);

    void EM1(SocialContextType socialContextType, C317966o8 r2, C381819cP r3, 1Xj r4, DirectShareTarget directShareTarget, Long l, String str, String str2);

    void EME(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z);

    void EMI(Context context, C254933tI r2, DirectShareTarget directShareTarget, AnonymousClass3Q2 r4, C352218Cl r5, String str, String str2, String str3, boolean z);

    void EML(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z);

    void EMM(DirectShareTarget directShareTarget, Product product, String str, String str2, boolean z);

    void EMN(C317966o8 r1, DirectShareTarget directShareTarget, User user, String str, String str2, String str3, boolean z);

    void EMP(MessagingOffPlatformShareType messagingOffPlatformShareType, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, boolean z);

    void EMQ(DirectShareTarget directShareTarget, SavedCollection savedCollection, String str, String str2, boolean z, boolean z2);

    void EMT(C381429bk r1, String str, String str2, String str3);

    void EMU(C317966o8 r1, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, boolean z);

    void EMV(1Xj r1, DirectShareTarget directShareTarget, String str, boolean z);

    void EMc(DirectRoomsXma directRoomsXma, DirectShareTarget directShareTarget, String str, String str2, boolean z);

    void EMe(DirectShareTarget directShareTarget, String str, String str2, boolean z);

    void EMh(DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z);

    void EMi(DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z);

    void EMm(C381429bk r1, String str);

    void EMn(C317966o8 r1, C381819cP r2, 1Xj r3, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, boolean z, boolean z2);

    void EMo(DirectShareTarget directShareTarget, User user, String str, String str2, String str3, String str4, boolean z);

    @Deprecated(message = "Please use forwardMessage instead.")
    void EMp(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z, boolean z2);

    void EMx(C69343Nji nji, DirectShareTarget directShareTarget, Boolean bool, String str, String str2, String str3, boolean z);

    void EN0(Context context, QP5 qp5, C254933tI r3, DirectShareTarget directShareTarget, ClipInfo clipInfo, AnonymousClass3Q2 r6, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3);

    void EN7(DirectShareTarget directShareTarget, String str, String str2, boolean z);
}
