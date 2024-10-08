package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.List;

/* renamed from: X.9mJ  reason: invalid class name and case insensitive filesystem */
public final class C387499mJ extends AA8 {
    public int A00;
    public Drawable A01;
    public SparseArray A02 = new SparseArray();
    public C369848vQ A03;
    public List A04 = 0sn.A00;
    public final Context A05;
    public final View A06;
    public final UserSession A07;
    public final TargetViewSizeProvider A08;
    public final AnonymousClass87H A09;
    public final C39890ADo A0A;
    public final C310416b1 A0B;
    public final C310416b1 A0C;

    public C387499mJ(Context context, View view, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass87H r42) {
        View view2 = view;
        UserSession userSession2 = userSession;
        AnonymousClass87H r1 = r42;
        AnonymousClass7TG.A0w(1, r1, userSession2, view2);
        TargetViewSizeProvider targetViewSizeProvider2 = targetViewSizeProvider;
        0qQ.A0B(targetViewSizeProvider2, 5);
        this.A09 = r1;
        this.A05 = context;
        this.A07 = userSession2;
        this.A06 = view2;
        this.A08 = targetViewSizeProvider2;
        Integer num = AnonymousClass05K.A00;
        this.A0B = new C310416b1((AnonymousClass8BH) null, (AnonymousClass8DA) null, (C3510487j) null, num, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, 0.7f, -1.0f, -1.0f, 0, true, false, false, true, false, false, false, true, true, true, true, true, false, false);
        C39890ADo aDo = new C39890ADo();
        aDo.A0F = true;
        aDo.A04 = 0.7f;
        aDo.A0R = false;
        this.A0A = aDo;
        this.A0C = new C310416b1((AnonymousClass8BH) null, (AnonymousClass8DA) null, (C3510487j) null, num, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, false, false, true, true, false, false, false, true, true, true, true, true, false, false);
    }

    public static final void A00(AnonymousClass57C r19, C387499mJ r20, int i) {
        C387499mJ r3 = r20;
        int i2 = i;
        if (r3.A00 == i2) {
            AnonymousClass87H r4 = r3.A09;
            if (r4.A0L(r3)) {
                Drawable drawable = r3.A01;
                if (drawable == null) {
                    drawable = C394019xP.A00(r3.A05, 0.65f);
                    r3.A01 = drawable;
                }
                r4.A0C(drawable, r3.A0C, true);
                Medium medium = (Medium) r3.A02.get(i2, (Object) null);
                AnonymousClass57C r17 = r19;
                1Xj r1 = (1Xj) r3.A04.get(i2);
                if (medium == null) {
                    Context context = r3.A05;
                    C290815g0 A032 = C59730JVo.A03(context, r3.A07, C59730JVo.A05(context, r1, "CanvasMentionsController", false, false));
                    A032.A00 = new C385869jf(i2, 0, r17, r3, r1);
                    1ES.A03(A032);
                    return;
                }
                Context context2 = r3.A05;
                ExtendedImageUrl A1n = r1.A1n(context2);
                AnonymousClass81W r0 = ((NineSixteenLayoutConfigImpl) r3.A08).A0K;
                C369908vW r42 = new C369908vW(context2, (Bitmap) null, medium, A1n, C354668Mx.RECTANGLE, (Integer) null, r0.getWidth(), r0.getHeight(), false, true, false, false);
                r42.A9D(new AZ6(i2, 0, r17, medium, r42, r20, r1));
            }
        }
    }
}
