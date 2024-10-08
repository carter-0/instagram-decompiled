package X;

import android.view.View;
import com.facebook.litho.LithoView;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.List;

/* renamed from: X.GDz  reason: case insensitive filesystem */
public final class C52079GDz extends C338557i9 {
    public InstagramMidcardType A00 = null;
    public C267324bN A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public final 2V5 A04;
    public final LithoView A05;
    public final RoundedCornerFrameLayout A06;
    public final C52078GDy A07;
    public final HQV A08;
    public final C56024HrW A09;
    public final List A0A;
    public final List A0B;
    public final List A0C;
    public final List A0D;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.HQV, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52079GDz(View view, 2V5 r5, C52078GDy gDy, C56024HrW hrW, List list, List list2, List list3, List list4) {
        super(view);
        HQV hqv;
        0qQ.A0B(r5, 11);
        this.A09 = hrW;
        this.A0B = list;
        this.A07 = gDy;
        this.A0C = list2;
        this.A0A = list3;
        this.A0D = list4;
        this.A04 = r5;
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) view;
        this.A06 = roundedCornerFrameLayout;
        LithoView childAt = roundedCornerFrameLayout.getChildAt(0);
        0qQ.A0C(childAt, "null cannot be cast to non-null type com.facebook.litho.LithoView");
        LithoView lithoView = childAt;
        this.A05 = lithoView;
        if (hrW == null) {
            hqv = null;
        } else {
            0qQ.A0B(lithoView, 1);
            ? obj = new Object();
            obj.A00 = lithoView;
            hqv = obj;
        }
        this.A08 = hqv;
    }

    public final void A01(LithoView lithoView, int i, int i2, int i3, int i4, boolean z) {
    }

    public final LithoView A00() {
        return this.A05;
    }
}
