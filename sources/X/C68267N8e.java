package X;

import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.N8e  reason: case insensitive filesystem */
public final class C68267N8e extends AnonymousClass0T0 implements C74250Pre {
    public final View A00;
    public final User A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68267N8e) {
                C68267N8e n8e = (C68267N8e) obj;
                if (!0qQ.A0K(this.A00, n8e.A00) || !0qQ.A0K(this.A02, n8e.A02) || !0qQ.A0K(this.A01, n8e.A01) || this.A03 != n8e.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A03, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0K(this.A00))));
    }

    public C68267N8e(View view, User user, String str, boolean z) {
        this.A00 = view;
        this.A02 = str;
        this.A01 = user;
        this.A03 = z;
    }
}
