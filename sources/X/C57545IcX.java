package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.IcX  reason: case insensitive filesystem */
public final class C57545IcX implements C59561JOh {
    public final XSY A00;
    public final XSY A01;
    public final C54690HOv A02;
    public final C54691HOw A03;
    public final C21255XRa A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C57545IcX) {
                C57545IcX icX = (C57545IcX) obj;
                if (!(this.A00 == icX.A00 && this.A03 == icX.A03 && this.A02 == icX.A02 && this.A04 == icX.A04 && this.A01 == icX.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A00)))) + AnonymousClass7TG.A0C(this.A01);
    }

    public C57545IcX(XSY xsy, XSY xsy2, C54690HOv hOv, C54691HOw hOw, C21255XRa xRa) {
        C51974G9v.A1P(xsy, hOw, hOv, xRa);
        this.A00 = xsy;
        this.A03 = hOw;
        this.A02 = hOv;
        this.A04 = xRa;
        this.A01 = xsy2;
    }

    /* renamed from: A00 */
    public final C56081HsU EIh(Context context, C59535JNh jNh) {
        boolean A1Z = AnonymousClass7TG.A1Z(context, jNh);
        int A012 = C56611I4l.A01(this.A04, jNh);
        boolean z = true;
        if (context.getResources().getConfiguration().getLayoutDirection() != A1Z) {
            z = false;
        }
        XSY xsy = this.A01;
        if (xsy == null || !z) {
            xsy = this.A00;
        }
        0qQ.A0C(xsy, "null cannot be cast to non-null type com.facebook.fbui.fbicon.model.IconSet.Name<com.facebook.fbui.fbicon.model.IconSet.Type>");
        C54691HOw hOw = this.A03;
        0qQ.A0C(hOw, "null cannot be cast to non-null type com.facebook.fbui.fbicon.model.IconSet.Variant<com.facebook.fbui.fbicon.model.IconSet.Type>");
        C54690HOv hOv = this.A02;
        0qQ.A0C(hOv, "null cannot be cast to non-null type com.facebook.fbui.fbicon.model.IconSet.Size<com.facebook.fbui.fbicon.model.IconSet.Type>");
        Drawable A002 = C14091Tpi.A00(context, xsy, hOv, hOw);
        0qQ.A07(A002);
        Drawable mutate = A002.mutate();
        AnonymousClass7TE.A1R(mutate, A012);
        return new C56081HsU(mutate, hOv.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CdsIconVariant(iconName=");
        A1A.append(this.A00);
        A1A.append(Pxd.A00(321));
        A1A.append(this.A03);
        A1A.append(", iconSize=");
        A1A.append(this.A02);
        A1A.append(", iconColor=");
        A1A.append(this.A04);
        A1A.append(", rtlIconName=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
