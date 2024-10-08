package X;

import android.app.Activity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.EJz  reason: case insensitive filesystem */
public final class C47853EJz extends C49890FBq {
    public final Activity A00;
    public final UserSession A01;
    public final C49333Eto A02;
    public final AnonymousClass4DU A03;
    public final 2FW A04;
    public final String A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47853EJz(Activity activity, UserSession userSession, C49333Eto eto, AnonymousClass4DU r10, 2FW r11, Object obj, String str, boolean z) {
        super(r11, obj, "direct_sharesheet", R.drawable.instagram_direct_pano_outline_24, z ? 2131960319 : 2131960318);
        this.A04 = r11;
        this.A00 = activity;
        this.A01 = userSession;
        this.A03 = r10;
        this.A06 = z;
        this.A02 = eto;
        this.A05 = str;
    }
}
