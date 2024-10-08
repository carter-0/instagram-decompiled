package X;

import android.app.Activity;
import android.graphics.Rect;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.reels.store.ReelStore;

public abstract class FCP {
    public static final Rect A00(IgImageView igImageView) {
        0qQ.A0B(igImageView, 0);
        int left = igImageView.getLeft();
        int top = igImageView.getTop();
        return new Rect(left, top, igImageView.getDrawable().getIntrinsicWidth() + left, igImageView.getDrawable().getIntrinsicHeight() + top);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.6Ye, java.lang.Object] */
    public static final void A01(Activity activity, UserSession userSession, AnonymousClass3HX r7, AnonymousClass3BQ r8) {
        AnonymousClass7TG.A1P(userSession, r8);
        1OP r0 = 1OP.$redex_init_class;
        ReelStore A03 = ReelStore.A03(userSession);
        0qQ.A07(A03);
        Reel A0I = A03.A0I(r7, false);
        ? obj = new Object();
        obj.A02(userSession, A0I.getId(), AnonymousClass7TE.A1I(A0I));
        obj.A04 = r8;
        DbY.A1R(obj);
        obj.A01(userSession);
        obj.A03 = ReelViewerConfig.A00();
        Dbb.A0i(activity, obj.A00(), userSession, TransparentModalActivity.class, "reel_viewer");
        C14164Tr2.A00.A02(userSession, A0I, r8);
    }

    public static final void A02(UserSession userSession, Activity activity, String str) {
        AnonymousClass3BQ r0;
        DbU.A0y(activity, new E0Y(), DbS.A0W(userSession));
        C14164Tr2 tr2 = C14164Tr2.A00;
        String A00 = C273654mx.A00(192);
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 3615) {
                if (hashCode != 563217739) {
                    if (hashCode == 595233003 && str.equals("notification")) {
                        r0 = AnonymousClass3BQ.SUPERLATIVE_FROM_NOTIFICATION;
                        tr2.A04(userSession, r0, A00);
                    }
                } else if (str.equals("qr_code")) {
                    r0 = AnonymousClass3BQ.SUPERLATIVE_FROM_QR_CODE;
                    tr2.A04(userSession, r0, A00);
                }
            } else if (str.equals("qp")) {
                r0 = AnonymousClass3BQ.SUPERLATIVE_FROM_QP;
                tr2.A04(userSession, r0, A00);
            }
        }
        r0 = AnonymousClass3BQ.SUPERLATIVE_FROM_DEEP_LINK;
        tr2.A04(userSession, r0, A00);
    }
}
