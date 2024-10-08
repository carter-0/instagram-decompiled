package X;

import android.view.View;

/* renamed from: X.9kb  reason: invalid class name and case insensitive filesystem */
public final class C386439kb extends AnonymousClass0mG {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C357918a4 A01;
    public final /* synthetic */ boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386439kb(View view, C357918a4 r4, boolean z) {
        super(1000);
        this.A02 = z;
        this.A01 = r4;
        this.A00 = view;
    }

    public final void A00(View view) {
        if (this.A02) {
            C357918a4 r4 = this.A01;
            AnonymousClass8II A002 = C357918a4.A00(r4);
            if (A002 != null) {
                A002.A0I("cancel_done");
            }
            C357918a4.A0A(r4, "AUDIO_EDITOR_PAGE_ADD_TO_MIX_TAP", true);
            r4.A0y.D9r(r4.A0L, r4.A0D(), AnonymousClass05K.A00);
            return;
        }
        C59689JTv.A07(this.A00.getContext(), 2131967755);
    }
}
