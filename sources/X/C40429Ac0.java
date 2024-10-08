package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.opencarousel.configuration.OpenCarouselCaptureConfig;

/* renamed from: X.Ac0  reason: case insensitive filesystem */
public final class C40429Ac0 implements C351948Bb {
    public View A00;
    public View A01;
    public final Context A02;
    public final View A03;
    public final ViewStub A04;
    public final UserSession A05;
    public final OpenCarouselCaptureConfig A06;
    public final A55 A07;

    public final void Ejs(boolean z) {
        View[] viewArr = {this.A03};
        if (z) {
            C294975nL.A04((C295005nO) null, viewArr, true);
        } else {
            C294975nL.A05(viewArr, true);
        }
    }

    public final void EQQ(boolean z) {
        View[] viewArr = new View[1];
        View view = this.A00;
        if (z) {
            if (view != null) {
                viewArr[0] = view;
                C294975nL.A04((C295005nO) null, viewArr, true);
                return;
            }
        } else if (view != null) {
            viewArr[0] = view;
            C294975nL.A05(viewArr, true);
            return;
        }
        0qQ.A0F("cameraHeader");
        throw AnonymousClass00P.createAndThrow();
    }

    public C40429Ac0(Context context, View view, ViewStub viewStub, UserSession userSession, OpenCarouselCaptureConfig openCarouselCaptureConfig, A55 a55) {
        String str;
        AnonymousClass7TG.A1U(viewStub, view, openCarouselCaptureConfig);
        AnonymousClass7TG.A1S(userSession, context);
        this.A04 = viewStub;
        this.A03 = view;
        this.A06 = openCarouselCaptureConfig;
        this.A07 = a55;
        this.A05 = userSession;
        this.A02 = context;
        String str2 = openCarouselCaptureConfig.A02;
        if (str2 != null) {
            View inflate = viewStub.inflate();
            this.A00 = inflate;
            str = "cameraHeader";
            if (inflate != null) {
                AnonymousClass7TG.A0R(inflate, R.id.header_title).setText(AnonymousClass7TF.A0e(inflate.getResources(), str2, 2131968951));
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        View requireViewById = this.A03.requireViewById(R.id.open_carousel_send_button);
        this.A01 = requireViewById;
        if (requireViewById == null) {
            str = "sendButton";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        AOX.A00(requireViewById, 25, this);
    }
}
