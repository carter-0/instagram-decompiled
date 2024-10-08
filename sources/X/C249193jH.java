package X;

import android.content.Context;
import com.facebook.avatar.expresso.odr.assetdownloader.ig.IgODRAssetDownloader;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.3jH  reason: invalid class name and case insensitive filesystem */
public final class C249193jH extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C249193jH(2Lk r3) {
        super("OnDeviceRenderingStartupJob", 637710289);
        this.A00 = r3;
    }

    public final void loggedRun() {
        2Lk r4 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r4.A04;
        if (182.A06(0Tu.A05, userSession, 36324458273583207L)) {
            HashMap hashMap = new HashMap();
            hashMap.put(C62441Kfr.USER_SESSION, userSession);
            Context context = r4.A01;
            0nV r0 = IgODRAssetDownloader.A01;
            0qQ.A0B(context, 1);
            AnonymousClass19S A02 = 19E.A02(IgODRAssetDownloader.A01);
            0qQ.A0A(1Eo.A04(19B.A00, new MH2((Object) hashMap, (Object) context, (AnonymousClass4D7) null, 44), A02));
        }
    }
}
