package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Krp  reason: case insensitive filesystem */
public abstract class C63121Krp {
    public static C378369Pn A00(Context context, UserSession userSession, C63803L7j l7j, AnonymousClass3Q2 r20, float f) {
        C63803L7j l7j2 = l7j;
        Context context2 = context;
        UserSession userSession2 = userSession;
        C378369Pn r7 = new C378369Pn(context2, userSession2, l7j2.A02, "feed", true, false);
        l7j2.A01 = r7;
        AnonymousClass3Q2 r6 = r20;
        r7.A08(r6, 0);
        MediaFrameLayout mediaFrameLayout = l7j2.A03;
        mediaFrameLayout.removeView(l7j2.A00);
        FilterGroupModel filterGroupModel = r6.A1D;
        C378379Po r14 = new C378379Po(context2, userSession2, filterGroupModel, "feed", true, 182.A06(DbS.A0J(userSession2, 0), userSession2, 36318183327668184L));
        int i = r6.A0H;
        int i2 = r6.A0G;
        r14.A01 = i;
        r14.A00 = i2;
        C378369Pn r0 = l7j2.A01;
        0qQ.A0B(r0, 0);
        r14.A06 = r0;
        0qQ.A0B(context2, 0);
        ConstrainedTextureView constrainedTextureView = new ConstrainedTextureView(context2);
        r14.A03 = constrainedTextureView;
        l7j2.A00 = constrainedTextureView;
        constrainedTextureView.setSurfaceTextureListener(r14);
        float f2 = f;
        l7j2.A00.setAspectRatio(f2);
        mediaFrameLayout.addView(l7j2.A00, 0);
        mediaFrameLayout.A00 = f2;
        U02 u02 = new U02();
        C378369Pn r2 = l7j2.A01;
        ConstrainedTextureView constrainedTextureView2 = l7j2.A00;
        u02.A00 = 50.0f;
        mediaFrameLayout.setOnTouchListener(u02);
        u02.A02 = new C64928LkT(r2, mediaFrameLayout, constrainedTextureView2);
        return l7j2.A01;
    }
}
