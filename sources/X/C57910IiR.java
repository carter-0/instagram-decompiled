package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* renamed from: X.IiR  reason: case insensitive filesystem */
public final class C57910IiR implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ IUM A02;

    public C57910IiR(UserSession userSession, 1Xj r2, IUM ium) {
        this.A02 = ium;
        this.A00 = userSession;
        this.A01 = r2;
    }

    public final void run() {
        IUM ium = this.A02;
        View view = ium.A02;
        int width = view.getWidth();
        int height = view.getHeight();
        UserSession userSession = this.A00;
        1Xj r10 = this.A01;
        int i = width;
        int i2 = height;
        0Tu r4 = 0Tu.A06;
        if (((double) r10.A0l()) <= 182.A00(r4, userSession, 37157312571375664L)) {
            if (!182.A06(r4, userSession, 36312887641441760L) && !182.A06(r4, userSession, 36312887641376223L)) {
                i = (int) (((double) width) * 0.8d);
            }
        } else if (((double) r10.A0l()) >= 182.A00(r4, userSession, 37157312568229935L)) {
            i2 = (int) (((float) height) / r10.A0l());
        }
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        if (width != intValue || height != intValue2) {
            IgImageView igImageView = ium.A0P;
            ViewGroup.LayoutParams layoutParams = igImageView.getLayoutParams();
            String A002 = AnonymousClass000.A00(49);
            if (layoutParams != null) {
                layoutParams.width = intValue;
                layoutParams.height = intValue2;
                igImageView.setLayoutParams(layoutParams);
                SimpleVideoLayout simpleVideoLayout = ium.A0U;
                ViewGroup.LayoutParams layoutParams2 = simpleVideoLayout.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = intValue;
                    layoutParams2.height = intValue2;
                    simpleVideoLayout.setLayoutParams(layoutParams2);
                    return;
                }
                throw AnonymousClass7TE.A11(A002);
            }
            throw AnonymousClass7TE.A11(A002);
        }
    }
}
