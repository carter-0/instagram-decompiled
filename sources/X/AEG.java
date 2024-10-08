package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.Iterator;
import java.util.List;

public abstract class AEG {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        if (r8 == X.AnonymousClass5OC.ATTRIBUTION_LINE) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(androidx.fragment.app.FragmentActivity r7, X.AnonymousClass5OC r8, com.instagram.common.session.UserSession r9, java.lang.String r10, java.lang.String r11, int r12) {
        /*
            r3 = 0
            X.0qQ.A0B(r9, r3)
            r5 = 1
            X.AnonymousClass7TF.A1B(r7, r5, r10)
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.REEL_FEED_TIMELINE
            X.4h3 r2 = new X.4h3
            r2.<init>(r0, r9)
            r2.A1C = r11
            r2.A05 = r12
            r2.A0p = r10
            r2.A07 = r8
            r0 = 362(0x16a, float:5.07E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r4 = r10.equals(r0)
            X.5OC r0 = X.AnonymousClass5OC.TOOLTIP
            r6 = 0
            if (r8 == r0) goto L_0x002b
            X.5OC r1 = X.AnonymousClass5OC.ATTRIBUTION_LINE
            r0 = 0
            if (r8 != r1) goto L_0x002c
        L_0x002b:
            r0 = 1
        L_0x002c:
            if (r4 == 0) goto L_0x003e
            if (r0 == 0) goto L_0x003e
            X.0Tu r4 = X.0Tu.A05
            r0 = 36318196210538478(0x810735000317ee, double:3.031111752957947E-306)
            boolean r0 = X.182.A06(r4, r9, r0)
            if (r0 == 0) goto L_0x003e
            r6 = 1
        L_0x003e:
            r2.A1h = r6
            X.0Tu r4 = X.0Tu.A05
            r0 = 36319540535107030(0x81086e00001dd6, double:3.03196190922826E-306)
            boolean r0 = X.182.A06(r4, r9, r0)
            if (r0 == 0) goto L_0x005a
            r2.A1c = r3
            r2.A1g = r5
            r0 = 2131955869(0x7f13109d, float:1.9548278E38)
            java.lang.String r0 = r7.getString(r0)
            r2.A0n = r0
        L_0x005a:
            r0 = 36319540535238104(0x81086e00021dd8, double:3.031961909311152E-306)
            boolean r0 = X.182.A06(r4, r9, r0)
            if (r0 == 0) goto L_0x0067
            r2.A1l = r3
        L_0x0067:
            r0 = 36319540535303641(0x81086e00031dd9, double:3.031961909352598E-306)
            boolean r0 = X.182.A06(r4, r9, r0)
            if (r0 == 0) goto L_0x0074
            r2.A1c = r3
        L_0x0074:
            com.instagram.clips.intf.ClipsViewerConfig r0 = r2.A00()
            X.C250563lf.A0X(r7, r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AEG.A00(androidx.fragment.app.FragmentActivity, X.5OC, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, int):void");
    }

    public static final void A01(UserSession userSession, AnonymousClass88O r37, InteractiveDrawableContainer interactiveDrawableContainer) {
        AnonymousClass88O r5 = r37;
        InteractiveDrawableContainer interactiveDrawableContainer2 = interactiveDrawableContainer;
        boolean A1U = AnonymousClass7TF.A1U(0, interactiveDrawableContainer2, r5);
        Integer num = AnonymousClass05K.A01;
        Rect rect = new Rect(0, 0, 0, 0);
        Iterator it = interactiveDrawableContainer2.getAllDrawables().iterator();
        while (it.hasNext()) {
            Drawable A0Z = AnonymousClass7TE.A0Z(it);
            if (A0Z instanceof C369818vN) {
                rect = A0Z.copyBounds();
            }
        }
        C310416b1 r6 = new C310416b1((AnonymousClass8BH) new C16336Ut6(rect), (AnonymousClass8DA) null, (C3510487j) null, num, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 0, false, false, false, false, false, false, false, A1U, A1U, A1U, A1U, A1U, false, false);
        C317966o8 A00 = C317966o8.A00(new SimpleImageUrl("https://static.xx.fbcdn.net/assets/?set=ig_reels_celebrations&name=sparkle-gif&density=1"), "gif_sticker_celebration_sparkle", "gif_sticker_celebration_sparkle", -1.0f, -1.0f, 1.0f);
        C317876nz r0 = C317876nz.A0a;
        C317876nz A05 = C317886o0.A05(A00, "gif_sticker_celebration_sparkle");
        Context context = interactiveDrawableContainer2.getContext();
        UserSession userSession2 = userSession;
        if (userSession != null) {
            C347017w8 A01 = C347017w8.A01(context, userSession2, A05);
            r5.A01(new C40328AaN((Drawable) A01, interactiveDrawableContainer2, 5));
            interactiveDrawableContainer2.A0K(A01, r6, false, false, false);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A02(UserSession userSession, InteractiveDrawableContainer interactiveDrawableContainer, String str) {
        UserSession userSession2 = userSession;
        InteractiveDrawableContainer interactiveDrawableContainer2 = interactiveDrawableContainer;
        AnonymousClass7TF.A1B(interactiveDrawableContainer2, 0, userSession2);
        String str2 = str;
        if (str != null) {
            C310416b1 r7 = new C310416b1((AnonymousClass8BH) new AnonymousClass8BG(0.5f, 0.11f), (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A01, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 0, false, false, true, true, false, false, false, true, true, true, true, true, false, false);
            Spannable spannable = C306386Ly.A0d;
            Context A0S = AnonymousClass7TE.A0S(interactiveDrawableContainer2);
            AnonymousClass9UM r1 = new AnonymousClass9UM(A0S, userSession2, 960);
            r1.A0M(str2);
            r1.A0A(96.0f);
            r1.A0I(AnonymousClass7TG.A0O(A0S));
            interactiveDrawableContainer2.A0K(r1, r7, false, false, false);
        }
    }
}
