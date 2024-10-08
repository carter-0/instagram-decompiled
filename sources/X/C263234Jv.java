package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.4Jv  reason: invalid class name and case insensitive filesystem */
public final class C263234Jv implements C263244Jw {
    public 1Xj A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final C246833fJ A03;
    public final C258283yl A04;
    public final AnonymousClass3W1 A05;
    public final AnonymousClass9IE A06;

    public C263234Jv(AnonymousClass9IE r2, UserSession userSession, AnonymousClass4DU r4, C246833fJ r5, C258283yl r6, AnonymousClass3W1 r7) {
        0qQ.A0B(r2, 2);
        this.A01 = userSession;
        this.A06 = r2;
        this.A05 = r7;
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
    }

    private final void A00() {
        C258283yl r7 = this.A04;
        0w6 r1 = r7.A04;
        AnonymousClass0YZ[] r9 = C258283yl.A05;
        IgImageView igImageView = (IgImageView) r1.CDM(r7, r9[0]);
        1Xj r0 = this.A00;
        if (r0 != null) {
            ImageUrl A1Q = r0.A1Q();
            if (A1Q != null) {
                igImageView.setUrl(A1Q, this.A02);
                0w6 r6 = r7.A03;
                ((View) r6.CDM(r7, r9[1])).setVisibility(0);
                AnonymousClass0eM r4 = r7.A02;
                Object value = r4.getValue();
                0qQ.A07(value);
                r7.A00 = new C57411IaH((View) value, new C58178Ini(this, 45), new C58130Imw(this));
                AnonymousClass0fU.A00(new IAH(this), (View) r6.CDM(r7, r9[1]));
                0sL r2 = (0sL) ((AnonymousClass9IE) this.A06.A00).A00;
                Object value2 = r4.getValue();
                0qQ.A07(value2);
                1Xj r02 = this.A00;
                if (r02 != null) {
                    r2.invoke(value2, r02);
                    return;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        0qQ.A0F("thumbnailMedia");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void ABH() {
        1Xj A08 = C250563lf.A08(this.A02, this.A01);
        if (A08 == null || A08.A1Q() == null) {
            hide();
            return;
        }
        this.A00 = A08;
        C258283yl r2 = this.A04;
        Object value = r2.A02.getValue();
        0qQ.A07(value);
        ((View) value).setVisibility(0);
        A00();
        C57411IaH iaH = r2.A00;
        if (iaH != null) {
            C317396nC r3 = iaH.A02;
            int i = 1;
            if (0mk.A02(iaH.A01.getContext())) {
                i = -1;
            }
            r3.A01(((float) i) * iaH.A00, 0.0f);
            r3.A02(C57411IaH.A07, 0.0f, 0.0f, 5.0f, 0.0f);
            return;
        }
        0qQ.A0F("animationController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Eua() {
        1Xj A08 = C250563lf.A08(this.A02, this.A01);
        if (A08 == null || A08.A1Q() == null) {
            hide();
            return;
        }
        this.A00 = A08;
        Object value = this.A04.A02.getValue();
        0qQ.A07(value);
        ((View) value).setVisibility(0);
        A00();
    }

    public final void hide() {
        this.A04.A01.A03(8);
    }
}
