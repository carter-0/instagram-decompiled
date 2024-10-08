package X;

import android.view.ViewGroup;
import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.FQq  reason: case insensitive filesystem */
public final class C50133FQq implements AnonymousClass07Y {
    public final String A00;
    public final ViewGroup A01;
    public final AnonymousClass07V A02;
    public final C273694n2 A03;
    public final AnonymousClass6NS A04;

    @OnLifecycleEvent(07T.ON_DESTROY)
    public void onDestroy() {
        this.A02.A0A(this);
        C273694n2 r3 = this.A03;
        ViewGroup viewGroup = this.A01;
        AnonymousClass6NS r1 = this.A04;
        r3.setVisibility(8);
        viewGroup.removeView(r3);
        r1.A03();
    }

    public C50133FQq(ViewGroup viewGroup, AnonymousClass07V r2, C273694n2 r3, AnonymousClass6NS r4, String str) {
        this.A00 = str == null ? "" : str;
        this.A01 = viewGroup;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
    }
}
