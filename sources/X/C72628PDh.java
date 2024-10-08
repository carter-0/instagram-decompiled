package X;

import com.instagram.direct.model.messaginguser.MessagingUser;

/* renamed from: X.PDh  reason: case insensitive filesystem */
public final class C72628PDh implements C74459PvE {
    public final /* synthetic */ P15 A00;
    public final /* synthetic */ C331157Pu A01;

    public final void DbW(String str, String str2, String str3) {
        String str4 = str2;
        if (str2 != null) {
            String str5 = str;
            if (!(str == null || str3 == null)) {
                this.A00.A04.AE6(str4, "DELETED", str5, (String) null, (String) null);
            }
        }
        this.A01.A07();
    }

    public C72628PDh(P15 p15, C331157Pu r2) {
        this.A00 = p15;
        this.A01 = r2;
    }

    public final void CqL(MessagingUser messagingUser) {
        this.A01.A07();
        this.A00.A00 = messagingUser;
    }

    public final void onError(String str) {
        C59689JTv.A0F(this.A00.A02, "direct_unknown_error", 2131960632);
        0wb.A03(str, "CollectionItemEmojiReactionsListNavigator.openReactionBottomsheet");
        this.A01.A07();
    }
}
