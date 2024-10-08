package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.LinkedHashMap;

/* renamed from: X.Ugq  reason: case insensitive filesystem */
public final class C15685Ugq extends C252233om {
    public final C20934X4z A00;
    public final Context A01;
    public final AnonymousClass07i A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C15685Ugq(Context context, AnonymousClass07i r3, UserSession userSession, C20934X4z x4z, String str, String str2, String str3) {
        AnonymousClass7TF.A1E(userSession, 1, x4z);
        this.A03 = userSession;
        this.A01 = context;
        this.A02 = r3;
        this.A04 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A00 = x4z;
    }

    public final void A00() {
        LinkedHashMap A0q = DbY.A0q("waterfall_id", this.A06, new 0eP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, this.A04), new 0eP("prior_module", this.A05));
        C228602lw r3 = new C228602lw(this.A01, this.A02, (Integer) null);
        C360678ey A062 = C359988do.A06(this.A03, AnonymousClass000.A00(2886), A0q);
        A062.A00(new C15412UcO(this, 4));
        r3.schedule(A062);
    }
}
