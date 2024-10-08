package X;

import android.graphics.PointF;
import android.graphics.Rect;
import com.instagram.user.model.User;

/* renamed from: X.Jyw  reason: case insensitive filesystem */
public final class C61203Jyw extends AnonymousClass0T0 implements MQX {
    public final PointF A00;
    public final Rect A01;
    public final C335857de A02;
    public final User A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61203Jyw) {
                C61203Jyw jyw = (C61203Jyw) obj;
                if (!0qQ.A0K(this.A05, jyw.A05) || !0qQ.A0K(this.A04, jyw.A04) || !0qQ.A0K(this.A03, jyw.A03) || this.A07 != jyw.A07 || this.A08 != jyw.A08 || this.A02 != jyw.A02 || this.A06 != jyw.A06 || !0qQ.A0K(this.A01, jyw.A01) || !0qQ.A0K(this.A00, jyw.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A07(this.A03, (AnonymousClass7TE.A0O(this.A05) + AnonymousClass7TG.A0E(this.A04)) * 31)))))));
    }

    public C61203Jyw(PointF pointF, Rect rect, C335857de r3, User user, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A05 = str;
        this.A04 = str2;
        this.A03 = user;
        this.A07 = z;
        this.A08 = z2;
        this.A02 = r3;
        this.A06 = z3;
        this.A01 = rect;
        this.A00 = pointF;
    }
}
