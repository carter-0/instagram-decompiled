package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.groupinvites.GroupPreviewFragmentLauncher$launchForMessageShareSticker$1;
import com.instagram.reels.chat.model.ChatStickerChannelType;

/* renamed from: X.Ekx  reason: case insensitive filesystem */
public abstract class C48835Ekx {
    public static final void A00(FragmentActivity fragmentActivity, AnonymousClass0iw r13, UserSession userSession, C69064Ne1 ne1, String str, String str2, String str3, String str4, C62320sa r20, int i, boolean z) {
        int i2;
        C69064Ne1 ne12 = ne1;
        boolean A1Z = DbW.A1Z(ne1);
        String str5 = str3;
        String str6 = str4;
        AnonymousClass7TF.A1E(str5, 6, str6);
        boolean z2 = z;
        if (z) {
            i2 = 380;
        } else {
            i2 = 930;
        }
        String A00 = C273654mx.A00(i2);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        AnonymousClass0iw r5 = r13;
        UserSession userSession2 = userSession;
        if (C17029VFd.A00(str5) == ChatStickerChannelType.BROADCAST) {
            int i3 = i;
            if (OP8.A01(userSession, str6, i3)) {
                1as.A04.A03(fragmentActivity2, r5, userSession2, str6, (String) null, (String) null, A00, i3);
                return;
            }
        }
        AnonymousClass6ST r8 = new AnonymousClass6ST(fragmentActivity, A1Z);
        DbX.A15(fragmentActivity, r8);
        AnonymousClass0fN.A00(r8);
        String str7 = str;
        AnonymousClass7TE.A1Z(new GroupPreviewFragmentLauncher$launchForMessageShareSticker$1(fragmentActivity2, r5, userSession2, ne12, r8, str7, str5, A00, str2, (AnonymousClass4D7) null, r20, z2), DbW.A0E(fragmentActivity));
        ne12.A01(str7, str5);
    }
}
