package X;

import android.transition.Scene;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.Vzq  reason: case insensitive filesystem */
public final class C18755Vzq {
    public static final /* synthetic */ AnonymousClass0YZ[] A07 = {new 015(C18755Vzq.class, "headerExpanded", "getHeaderExpanded()Z", 0)};
    public Scene A00;
    public Scene A01;
    public ViewGroup A02;
    public boolean A03 = true;
    public final UserSession A04;
    public final Hashtag A05;
    public final 0s0 A06 = new C13406TYq(6, this, true);

    public C18755Vzq(UserSession userSession, Hashtag hashtag) {
        AnonymousClass7TF.A1B(userSession, 1, hashtag);
        this.A04 = userSession;
        this.A05 = hashtag;
    }

    public static final void A00(C18755Vzq vzq, boolean z) {
        Scene scene;
        String str;
        if (z) {
            scene = vzq.A01;
            if (scene == null) {
                str = "useHashtagButtonWithTextScene";
            }
            C324106ye.A00(scene);
            return;
        }
        scene = vzq.A00;
        if (scene == null) {
            str = "useHashtagButtonNoTextScene";
        }
        C324106ye.A00(scene);
        return;
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (X.182.A06(r2, r3, 2342159800969859719L) == false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C16672Uz8 r6) {
        /*
            r5 = this;
            android.view.ViewGroup r4 = r5.A02
            if (r4 != 0) goto L_0x000e
            java.lang.String r0 = "useHashatagViewGroup"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000e:
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x003d
            X.Uz8 r0 = X.C16672Uz8.CLIPS
            if (r6 == r0) goto L_0x0038
            X.Uz8 r0 = X.C16672Uz8.TOP
            if (r6 == r0) goto L_0x001e
            X.Uz8 r0 = X.C16672Uz8.UNSPECIFIED
            if (r6 != r0) goto L_0x003d
        L_0x001e:
            com.instagram.common.session.UserSession r3 = r5.A04
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342159800969794182(0x208105ee00011286, double:4.06286556155807E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x003d
            r0 = 2342159800969859719(0x208105ee00021287, double:4.062865561613639E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x003d
        L_0x0038:
            r0 = 0
        L_0x0039:
            r4.setVisibility(r0)
            return
        L_0x003d:
            r0 = 8
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18755Vzq.A01(X.Uz8):void");
    }
}
