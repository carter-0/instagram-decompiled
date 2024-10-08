package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;

public final class H59 extends C14097Tpp {
    public final /* synthetic */ C307786Rm A00;
    public final /* synthetic */ C276544tV A01;

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        return new C273704n3(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H59(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void A0L(View view, C307786Rm r4, C276544tV r5, Object obj, Object obj2) {
        Object A06 = C307476Qg.A06(this.A00, this.A01);
        A06.getClass();
        AnonymousClass0eM r1 = ((C56522Hzt) A06).A04;
        ((C55979Hqk) r1.getValue()).A00();
        ((C55979Hqk) r1.getValue()).A01 = false;
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r4, C276544tV r5, Object obj, Object obj2) {
        Object A06 = C307476Qg.A06(this.A00, this.A01);
        A06.getClass();
        ((C56522Hzt) A06).A00 = null;
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r8, C276544tV r9, Object obj) {
        DbY.A1S(view, r9);
        Object A06 = C307476Qg.A06(this.A00, this.A01);
        A06.getClass();
        C56522Hzt hzt = (C56522Hzt) A06;
        hzt.A00 = view;
        C55979Hqk hqk = (C55979Hqk) hzt.A04.getValue();
        if (r9.A0R(44, false)) {
            C52876GeB geB = hqk.A02;
            if (geB.isShowing()) {
                C245663dH A012 = ((C18564VuG) hqk.A04.getValue()).A01(view, r9);
                if (A012 != null) {
                    View contentView = geB.getContentView();
                    0qQ.A0C(contentView, AnonymousClass000.A00(717));
                    ((C299025uS) contentView).setRenderTree(A012);
                    C18046VkU vkU = hqk.A00;
                    if (vkU != null) {
                        RectF rectF = vkU.A02;
                        geB.update((int) rectF.left, (int) rectF.top, -1, -1);
                    }
                }
            } else {
                C18046VkU vkU2 = hqk.A00;
                if (vkU2 != null) {
                    RectF rectF2 = vkU2.A02;
                    geB.A01(view, (int) rectF2.left, (int) rectF2.top);
                }
            }
        } else if (hqk.A02.isShowing()) {
            hqk.A00();
        }
        hqk.A01 = false;
        return null;
    }
}
