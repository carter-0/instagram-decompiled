package X;

import android.content.Intent;
import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.Ujd  reason: case insensitive filesystem */
public final class C15853Ujd extends AnonymousClass4HF {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ReboundViewPager A02;
    public final /* synthetic */ C15329Uae A03;

    public C15853Ujd(View view, View view2, ReboundViewPager reboundViewPager, C15329Uae uae) {
        this.A03 = uae;
        this.A02 = reboundViewPager;
        this.A00 = view;
        this.A01 = view2;
    }

    public final void DVx(int i, int i2) {
        C15329Uae uae = this.A03;
        View A0D = this.A02.A0D(i);
        uae.A07 = false;
        if (A0D != null) {
            uae.A05(A0D, false);
        }
        uae.A00 = i;
        C17453VWg vWg = (C17453VWg) uae.A0F.getValue();
        C18001Vjd vjd = (C18001Vjd) uae.A04.get(uae.A00);
        0qQ.A0B(vjd, 0);
        if (vjd instanceof C16274Urb) {
            C16274Urb urb = (C16274Urb) vjd;
            vWg.A01.A06(urb.A01.getId(), vWg.A00, urb.A00);
        }
        C15329Uae.A01(this.A00, this.A01, uae);
        C15329Uae.A02(uae);
        Intent intent = new Intent();
        intent.putExtra("item_id", ((C18001Vjd) uae.A04.get(uae.A00)).A01());
        intent.putExtra("source_id", C13990Tnq.A0W(uae.A0A).A0C);
        DbX.A17(intent, uae);
    }
}
