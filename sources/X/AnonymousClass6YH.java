package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelViewerConfig;

/* renamed from: X.6YH  reason: invalid class name */
public abstract class AnonymousClass6YH {
    public static void A00(UserSession userSession, C255773uh r9, ReelViewerConfig reelViewerConfig, C317596nW r11, C316706m5 r12, String str) {
        IBZ ibz;
        C255783ui A00 = C289745e8.A00(AnonymousClass3WT.COUNTDOWN, r9.A0b());
        UserSession userSession2 = userSession;
        if (!1NM.A00(userSession).A01() && r12.A01 == null) {
            ImageView imageView = (ImageView) r12.A02.getView();
            r12.A01 = imageView;
            r12.A00 = (ViewGroup) imageView.getParent();
        }
        if (A00 == null) {
            r12.A02.setVisibility(8);
            return;
        }
        if (1NM.A00(userSession).A01() && r12.A01 == null) {
            ImageView imageView2 = (ImageView) r12.A02.getView();
            r12.A01 = imageView2;
            r12.A00 = (ViewGroup) imageView2.getParent();
        }
        r12.A02.setVisibility(0);
        r12.A01.getClass();
        C19476WaO A0B = A00.A0B();
        A0B.getClass();
        C389629pw r3 = new C389629pw(r12.A01.getContext(), userSession2, A0B, str, true);
        r3.A01.A09.A04 = true;
        r12.A01.setImageDrawable(r3);
        boolean z = reelViewerConfig.A06;
        ImageView imageView3 = r12.A01;
        if (!z) {
            ibz = new IBZ(r9, r11, A0B);
        } else {
            ibz = null;
        }
        AnonymousClass0fU.A00(ibz, imageView3);
        0nA.A0q(r12.A01, new C57952Ij7(r9, r11, r12, A00));
    }
}
