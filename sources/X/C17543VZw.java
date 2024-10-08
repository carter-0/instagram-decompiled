package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.VZw  reason: case insensitive filesystem */
public final class C17543VZw {
    public final Context A00;
    public final View A01;
    public final C252063oV A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new C20695WxR(this, 0));
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new C20695WxR(this, 1));

    public C17543VZw(View view) {
        this.A00 = view.getContext();
        this.A01 = AnonymousClass7TE.A0b(view, R.id.profile_overlay_gradient);
        this.A02 = 2b1.A01(view.findViewById(R.id.profile_overlay_stub), false, false);
    }
}
