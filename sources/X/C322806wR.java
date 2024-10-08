package X;

import android.app.Application;
import android.content.Context;
import com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.AutoLaunchReelParams;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6wR  reason: invalid class name and case insensitive filesystem */
public final class C322806wR {
    public final Context A00;
    public final AnonymousClass07Z A01;
    public final UserSession A02;
    public final C322816wS A03;
    public final Dc6 A04;
    public final AutoLaunchReelParams A05;
    public final UserDetailLaunchConfig A06;
    public final C322836wU A07;
    public final String A08;
    public final List A09 = new ArrayList();
    public final boolean A0A;
    public final boolean A0B;

    public C322806wR(Context context, AnonymousClass07Z r10, UserSession userSession, Dc6 dc6, AutoLaunchReelParams autoLaunchReelParams, UserDetailLaunchConfig userDetailLaunchConfig, String str, boolean z, boolean z2) {
        0qQ.A0B(dc6, 7);
        this.A02 = userSession;
        this.A00 = context;
        this.A06 = userDetailLaunchConfig;
        boolean z3 = z;
        this.A0A = z3;
        this.A01 = r10;
        this.A08 = str;
        this.A04 = dc6;
        this.A0B = z2;
        this.A05 = autoLaunchReelParams;
        this.A03 = new C322816wS(context, r10, userSession, C294255m9.A0B, (String) null, 2131974972, z3);
        Context applicationContext = context.getApplicationContext();
        0qQ.A0C(applicationContext, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) applicationContext;
        0qQ.A0B(application, 0);
        this.A07 = new C322836wU(r10, ClipsDraftPreviewItemRepository.A09.A00(application, userSession));
    }
}
