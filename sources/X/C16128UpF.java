package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.UpF  reason: case insensitive filesystem */
public final class C16128UpF extends WZG {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C16128UpF(C19425WYu wYu, AnonymousClass4O6 r2, String str, int i) {
        this.A00 = i;
        this.A01 = wYu;
        this.A02 = r2;
        this.A03 = str;
    }

    public final void DZN() {
        UserSession userSession;
        String str;
        int i = this.A00;
        AnonymousClass4O6 r4 = (AnonymousClass4O6) this.A02;
        Object obj = ((C19425WYu) this.A01).A01;
        if (i != 0) {
            userSession = ((WZ2) obj).A03;
            str = "STORY_ARCHIVE_MAP";
        } else {
            userSession = ((C19204WPk) obj).A0H;
            str = "DISCOVERY_MAP";
        }
        VK6.A00.A04(userSession, r4, str, this.A03);
    }

    public final void onCancel() {
        UserSession userSession;
        String str;
        int i = this.A00;
        AnonymousClass4O6 r4 = (AnonymousClass4O6) this.A02;
        Object obj = ((C19425WYu) this.A01).A01;
        if (i != 0) {
            userSession = ((WZ2) obj).A03;
            str = "STORY_ARCHIVE_MAP";
        } else {
            userSession = ((C19204WPk) obj).A0H;
            str = "DISCOVERY_MAP";
        }
        VK6.A00.A02(userSession, r4, str, this.A03);
    }
}
