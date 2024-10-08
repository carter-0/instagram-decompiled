package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.user.model.User;

/* renamed from: X.6XB  reason: invalid class name */
public final class AnonymousClass6XB extends C308916We {
    public final Context A00;
    public final View A01;
    public final CreativeConfigIntf A02;
    public final C255773uh A03;
    public final ReelViewerConfig A04;
    public final C317136mm A05;
    public final C316316lS A06;
    public final String A07;
    public final 1Xj A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6XB(Context context, View view, AnonymousClass0iw r5, UserSession userSession, 1Xj r7, C255773uh r8, ReelViewerConfig reelViewerConfig, C317136mm r10, C316316lS r11) {
        super(r5, userSession, r8);
        CreativeConfigIntf creativeConfigIntf;
        User A2A;
        0qQ.A0B(r11, 7);
        this.A00 = context;
        this.A03 = r8;
        this.A08 = r7;
        String str = null;
        if (r7 != null) {
            creativeConfigIntf = r7.A0C.AsO();
        } else {
            creativeConfigIntf = null;
        }
        this.A02 = creativeConfigIntf;
        if (!(r7 == null || (A2A = r7.A2A(userSession)) == null)) {
            str = A2A.getId();
        }
        this.A07 = str;
        this.A04 = reelViewerConfig;
        this.A05 = r10;
        this.A06 = r11;
        this.A01 = view;
    }

    public AnonymousClass6XB(Context context, View view, AnonymousClass0iw r4, UserSession userSession, CreativeConfigIntf creativeConfigIntf, C317136mm r7, C316316lS r8, String str) {
        super(r4, userSession, (C255773uh) null);
        this.A00 = context;
        this.A03 = null;
        this.A08 = null;
        this.A02 = creativeConfigIntf;
        this.A07 = str;
        this.A04 = null;
        this.A05 = r7;
        this.A06 = r8;
        this.A01 = view;
    }
}
