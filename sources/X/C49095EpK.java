package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$Success;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.chat.model.ChatStickerStickerType;

/* renamed from: X.EpK  reason: case insensitive filesystem */
public abstract class C49095EpK {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, C317546nR r19, String str, String str2, String str3, C62320sa r23, int i, boolean z) {
        int i2;
        UserSession userSession2 = userSession;
        String str4 = str;
        String str5 = str2;
        AnonymousClass7TG.A1U(userSession2, str4, str5);
        C317546nR r8 = r19;
        String str6 = str3;
        DbW.A1O(str6, 4, r8);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        boolean z2 = z;
        if (C17029VFd.A00(str6) == ChatStickerChannelType.BROADCAST) {
            int i3 = i;
            if (OP8.A01(userSession2, str5, i3)) {
                if (z) {
                    i2 = 254;
                } else {
                    i2 = 183;
                }
                1as.A04.A03(fragmentActivity2, DbS.A0O("ChatStickerRequestLauncher"), userSession2, str5, (String) null, (String) null, C273654mx.A00(i2), i3);
                return;
            }
        }
        NKN A03 = C71045OaN.A03((GroupLinkPreviewResponse$Success) null, ChatStickerStickerType.JOIN_CHAT_STICKER, str4, str6, false, z2);
        C331127Pr A0W = DbS.A0W(userSession2);
        A0W.A0U = A03;
        C331157Pu A00 = A0W.A00();
        A03.A0C = new C50397Fb5(userSession2, A00, A0W, r8, str6, r23, z2);
        A00.A02(fragmentActivity2, A03);
    }
}
