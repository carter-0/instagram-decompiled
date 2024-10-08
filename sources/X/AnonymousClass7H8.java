package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7H8  reason: invalid class name */
public final class AnonymousClass7H8 {
    public final UserSession A00;
    public final AnonymousClass7HA A01;
    public final AnonymousClass7GR A02;
    public final List A03 = new ArrayList();
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new AnonymousClass9L0(this, 35));

    public /* synthetic */ AnonymousClass7H8(UserSession userSession) {
        AnonymousClass7HA r2 = new AnonymousClass7HA(userSession, new AnonymousClass7H9(userSession));
        AnonymousClass7GR r1 = new AnonymousClass7GR(userSession, (AnonymousClass7GS) null, (DefaultConstructorMarker) null, 2);
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(X.AnonymousClass0iw r5, X.OIL r6, X.AnonymousClass77B r7, X.AnonymousClass0eK r8) {
        /*
            r4 = this;
            r3 = 1
            X.79H r2 = r7.A00
            r1 = 0
            if (r2 == 0) goto L_0x0018
            boolean r0 = r2 instanceof X.AnonymousClass79G
            if (r0 == 0) goto L_0x001c
            X.7EA r0 = r6.A0C
        L_0x000c:
            r0.A03(r5, r2)
        L_0x000f:
            com.google.common.collect.ImmutableList r0 = r2.A02
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0018
            r1 = 1
        L_0x0018:
            A01(r6, r7, r8, r3)
            return r1
        L_0x001c:
            boolean r0 = r2 instanceof X.C68955Nbe
            if (r0 == 0) goto L_0x000f
            X.Nbg r0 = r6.A0B
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7H8.A02(X.0iw, X.OIL, X.77B, X.0eK):boolean");
    }

    public static final void A00(Activity activity, OIL oil, AnonymousClass77B r15, AnonymousClass0eK r16, AnonymousClass0eK r17, float f, boolean z) {
        int i;
        IgProgressImageView igProgressImageView = (IgProgressImageView) oil.A06.getView();
        float f2 = f;
        igProgressImageView.setAspectRatio(f2);
        igProgressImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        boolean z2 = r15.A0p;
        RoundedCornerFrameLayout roundedCornerFrameLayout = oil.A0E;
        ViewGroup.LayoutParams layoutParams = roundedCornerFrameLayout.getLayoutParams();
        0qQ.A07(layoutParams);
        OZ0 oz0 = OZ0.A00;
        Context context = oil.A02;
        AnonymousClass0eK r9 = r17;
        0eP A012 = oz0.A01(activity, context, r16, r9, f2, z, z2);
        float floatValue = ((Number) A012.A00).floatValue();
        float floatValue2 = ((Number) A012.A01).floatValue();
        layoutParams.height = (int) floatValue;
        layoutParams.width = (int) floatValue2;
        roundedCornerFrameLayout.setLayoutParams(layoutParams);
        int i2 = 0;
        if (r17 == null || !0qQ.A0K(r9.get(), true)) {
            if (z2) {
                i = context.getResources().getDimensionPixelSize(R.dimen.achievements_list_container_height);
            } else {
                i = 20;
            }
            i2 = (int) 0nA.A04(context, i);
        }
        roundedCornerFrameLayout.setCornerRadius(i2);
    }

    public static final void A01(OIL oil, AnonymousClass77B r5, AnonymousClass0eK r6, boolean z) {
        View BJd;
        int i;
        AnonymousClass79H r3 = r5.A00;
        if (z) {
            i = 0;
            if (r6 != null && 0qQ.A0K(r6.get(), false) && r3 != null && r3.A02.size() > 0) {
                BJd = oil.A0C.BJd();
                BJd.setVisibility(i);
                oil.A0B.BJd().setVisibility(i);
            }
        }
        BJd = oil.A0C.BJd();
        i = 8;
        BJd.setVisibility(i);
        oil.A0B.BJd().setVisibility(i);
    }
}
