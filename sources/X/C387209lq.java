package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;

/* renamed from: X.9lq  reason: invalid class name and case insensitive filesystem */
public final class C387209lq extends AnonymousClass9UZ {
    public final /* synthetic */ Drawable A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C387209lq(Context context, Drawable drawable, UserSession userSession, String str) {
        super(context, userSession, (C347017w8) drawable, str);
        this.A00 = drawable;
    }

    public final boolean A01() {
        Drawable A04 = ((C347017w8) this.A00).A04();
        0qQ.A0C(A04, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.MentionTextDrawable");
        return 0qQ.A0K(((C369508us) A04).A01, C273654mx.A00(157));
    }
}
