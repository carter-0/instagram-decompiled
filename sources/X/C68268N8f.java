package X;

import android.graphics.PointF;
import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.N8f  reason: case insensitive filesystem */
public final class C68268N8f extends AnonymousClass0T0 implements C74250Pre {
    public final PointF A00;
    public final View A01;
    public final User A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68268N8f) {
                C68268N8f n8f = (C68268N8f) obj;
                if (!0qQ.A0K(this.A01, n8f.A01) || !0qQ.A0K(this.A00, n8f.A00) || !0qQ.A0K(this.A03, n8f.A03) || !0qQ.A0K(this.A02, n8f.A02) || this.A04 != n8f.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A04, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0K(this.A01)))));
    }

    public C68268N8f(PointF pointF, View view, User user, String str, boolean z) {
        this.A01 = view;
        this.A00 = pointF;
        this.A03 = str;
        this.A02 = user;
        this.A04 = z;
    }
}
