package X;

import com.instagram.user.model.User;

/* renamed from: X.IbK  reason: case insensitive filesystem */
public final class C57476IbK implements G87 {
    public final /* synthetic */ C335907dj A00;
    public final /* synthetic */ C333717a0 A01;
    public final /* synthetic */ I47 A02;
    public final /* synthetic */ 0sL A03;

    public final void Doy() {
    }

    public final void Doz() {
    }

    public C57476IbK(C335907dj r1, C333717a0 r2, I47 i47, 0sL r4) {
        this.A01 = r2;
        this.A02 = i47;
        this.A00 = r1;
        this.A03 = r4;
    }

    public final void DfM() {
        I21.A00.A00(this.A01.A02);
    }

    public final void DfN() {
        I21.A00.A01(this.A01.A02);
    }

    public final void Dox() {
        C333717a0 r1 = this.A01;
        String str = this.A02.A00.A0E;
        C335907dj r0 = this.A00;
        User user = r0.A0C;
        String str2 = r0.A0K;
        String str3 = r0.A0N;
        0qQ.A0B(str, 0);
        AnonymousClass73V.A00.A0I(r1.A01, user, "optimistic_restrict_delete_comment_button", str2, str3, str, (String) null);
        this.A03.invoke(str2, str3);
    }
}
