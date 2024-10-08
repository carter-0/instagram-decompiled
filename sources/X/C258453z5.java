package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;

/* renamed from: X.3z5  reason: invalid class name and case insensitive filesystem */
public final class C258453z5 extends C249703kE implements AnonymousClass2xU {
    public Activity A00;
    public C247113fn A01;
    public AnonymousClass3W1 A02;
    public boolean A03;
    public ViewStub A04;
    public C255913uv A05;
    public final View A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C258453z5(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A06 = view;
        this.A05 = (C255913uv) view.requireViewById(R.id.carousel_page_indicator);
    }

    public final void DQp(AnonymousClass3W1 r4, int i) {
        AnonymousClass9IE r0;
        0sL r1;
        0qQ.A0B(r4, 0);
        if (A00() == null) {
            return;
        }
        if (i == 4) {
            C255913uv A002 = A00();
            if (A002 != null) {
                A002.setCurrentPage(r4.A02);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } else if (i == 16) {
            C247113fn r02 = this.A01;
            if (r02 != null && r02.A07) {
                C255913uv A003 = A00();
                if (A003 != null) {
                    C283235Gq r2 = new C283235Gq(A003);
                    C247113fn r03 = this.A01;
                    if (r03 != null && (r0 = r03.A01) != null && (r1 = (0sL) r0.A00) != null) {
                        r1.invoke(this.A00, r2);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        } else if (i == 38) {
            C255913uv A004 = A00();
            if (A004 != null) {
                A004.setPageCount(r4.A04);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } else if (i == 47) {
            C255913uv A005 = A00();
            if (A005 != null) {
                A005.A0B = false;
                C255913uv A006 = A00();
                if (A006 != null) {
                    A006.A01 = 0.0f;
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        } else if (i == 54) {
            C255913uv A007 = A00();
            if (A007 != null) {
                A007.setDarkMode(false);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final C255913uv A00() {
        C255913uv r1 = this.A05;
        if (r1 != null) {
            return r1;
        }
        ViewStub viewStub = this.A04;
        if (viewStub != null) {
            View inflate = viewStub.inflate();
            0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.ui.widget.pageindicator.PageIndicator");
            C255913uv r12 = (C255913uv) inflate;
            this.A05 = r12;
            this.A03 = true;
            return r12;
        }
        throw new IllegalStateException("Either mCarouselIndicator or mCarouselIndicatorStub should be non-null");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C258453z5(ViewStub viewStub, View view) {
        super(view);
        0qQ.A0B(viewStub, 2);
        this.A06 = view;
        this.A04 = viewStub;
    }
}
