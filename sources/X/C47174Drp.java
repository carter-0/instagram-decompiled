package X;

import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;

/* renamed from: X.Drp  reason: case insensitive filesystem */
public final class C47174Drp extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public C47174Drp(ImageUrl imageUrl, Reel reel, String str, boolean z, boolean z2) {
        this.A03 = str;
        this.A01 = imageUrl;
        this.A05 = z;
        this.A04 = z2;
        this.A02 = reel;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C47174Drp)) {
                return false;
            }
            C47174Drp drp = (C47174Drp) obj;
            if (drp.A00 != 1 || !0qQ.A0K(this.A03, drp.A03) || !0qQ.A0K(this.A02, drp.A02) || this.A05 != drp.A05 || this.A04 != drp.A04) {
                return false;
            }
            obj2 = this.A01;
            obj3 = drp.A01;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C47174Drp)) {
                return false;
            }
            C47174Drp drp2 = (C47174Drp) obj;
            if (drp2.A00 != 0 || !0qQ.A0K(this.A03, drp2.A03) || !0qQ.A0K(this.A01, drp2.A01) || this.A05 != drp2.A05 || this.A04 != drp2.A04) {
                return false;
            }
            obj2 = this.A02;
            obj3 = drp2.A02;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09;
        Object obj;
        int i = this.A00;
        int A0O = AnonymousClass7TE.A0O(this.A03);
        if (i != 0) {
            A09 = AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A07(this.A02, A0O)));
            obj = this.A01;
        } else {
            A09 = AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A07(this.A01, A0O)));
            obj = this.A02;
        }
        return AnonymousClass7TE.A0N(obj, A09);
    }

    public C47174Drp(View.OnClickListener onClickListener, ImageUrl imageUrl, String str, boolean z, boolean z2) {
        this.A03 = str;
        this.A02 = imageUrl;
        this.A05 = z;
        this.A04 = z2;
        this.A01 = onClickListener;
    }
}
