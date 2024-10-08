package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.P8j  reason: case insensitive filesystem */
public final class C72500P8j implements C332837Wo {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ DirectThreadKey A01;
    public final /* synthetic */ String A02;

    public final void D9w() {
    }

    public final void DJ4() {
    }

    public final void DJ5() {
    }

    public C72500P8j(UserSession userSession, DirectThreadKey directThreadKey, String str) {
        this.A00 = userSession;
        this.A01 = directThreadKey;
        this.A02 = str;
    }

    public final void DRi(2FW r8, MessageIdentifier messageIdentifier, String str, String str2, String str3, String str4, long j, boolean z, boolean z2) {
        C333537Zi A002 = C333527Zh.A00(this.A00);
        DirectThreadKey directThreadKey = this.A01;
        String str5 = this.A02;
        if (messageIdentifier != null) {
            A002.A0K(directThreadKey, str5, "CREATED", messageIdentifier.A01, str, messageIdentifier.A00());
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DbX(2FW r8, MessageIdentifier messageIdentifier, String str, String str2, long j) {
        C333537Zi A002 = C333527Zh.A00(this.A00);
        DirectThreadKey directThreadKey = this.A01;
        String str3 = this.A02;
        if (messageIdentifier != null) {
            A002.A0K(directThreadKey, str3, "DELETED", messageIdentifier.A01, (String) null, messageIdentifier.A00());
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
