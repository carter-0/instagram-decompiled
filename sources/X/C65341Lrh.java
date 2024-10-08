package X;

import android.widget.ImageView;
import androidx.fragment.app.Fragment;

/* renamed from: X.Lrh  reason: case insensitive filesystem */
public final class C65341Lrh implements C320986tO {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C65341Lrh(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void DOa(C20997X8u x8u, String str, String str2) {
        String str3 = str2;
        switch (this.A00) {
            case 0:
                0qQ.A0B(str2, 2);
                Fragment fragment = (Fragment) this.A02;
                if (fragment.mView != null) {
                    1Eo.A05(DbX.A0c(AnonymousClass12T.A00), new C66174MGl((Object) fragment, this.A01, str3, (AnonymousClass4D7) null, 4), DbV.A0J(fragment));
                    return;
                }
                return;
            case 1:
                0qQ.A0B(x8u, 1);
                ImageView imageView = (ImageView) this.A01;
                if (imageView.getTag() == this) {
                    U1T u1t = new U1T(x8u);
                    ((VMA) this.A02).A00 = u1t;
                    imageView.setImageDrawable(u1t);
                    return;
                }
                return;
            case 2:
                0qQ.A0B(str2, 2);
                C51965G9l.A1W(this.A02, str2);
                return;
            default:
                return;
        }
    }

    public final /* synthetic */ boolean EsB() {
        return false;
    }

    public final void onError(String str) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                1Kn.A02("BloksGif", 002.A0R("Failed to load gif: ", str));
                return;
            case 2:
                DbS.A1U(this.A01);
                return;
            default:
                ((LGN) this.A02).A01();
                String str2 = ((C62175KbX) this.A01).A06;
                0qQ.A0B(str2, 0);
                0f9 A002 = 0wj.A00("Avatar sticker url expired", 817902226, true);
                A002.ABQ("avatar_reaction_template_id", str2);
                A002.report();
                return;
        }
    }

    public final /* synthetic */ void DOb(C20997X8u x8u, String str, String str2, String str3) {
    }

    public final void DaG(String str, float f) {
    }

    public final /* synthetic */ void DH4(X9T x9t, String str, String str2) {
    }
}
