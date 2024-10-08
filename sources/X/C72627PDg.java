package X;

import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.PDg  reason: case insensitive filesystem */
public final class C72627PDg implements C74459PvE {
    public final /* synthetic */ C68450NIo A00;

    public final void CqL(MessagingUser messagingUser) {
        C68450NIo nIo = this.A00;
        C48838El0.A00(nIo.requireActivity(), nIo, AnonymousClass7TE.A0l(nIo.A00), messagingUser, "collection_item_username", (String) null, false, false);
    }

    public final void DbW(String str, String str2, String str3) {
        String str4 = str2;
        if (str2 != null) {
            String str5 = str;
            if (!(str == null || str3 == null)) {
                C333527Zh.A00(AnonymousClass7TE.A0l(this.A00.A00)).A0K(new DirectThreadKey(str3, (List) null), str4, "DELETED", str5, (String) null, (String) null);
            }
        }
        Dbb.A0z(this.A00);
    }

    public C72627PDg(C68450NIo nIo) {
        this.A00 = nIo;
    }

    public final void onError(String str) {
        C68450NIo nIo = this.A00;
        C59689JTv.A0F(nIo.getActivity(), "direct_unknown_error", 2131960632);
        0wb.A03(str, "CollectionItemEmojiReactionsListNavigator.openReactionBottomsheet");
        Dbb.A0z(nIo);
    }
}
