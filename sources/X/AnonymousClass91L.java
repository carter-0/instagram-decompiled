package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import android.util.TypedValue;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.91L  reason: invalid class name */
public abstract class AnonymousClass91L {
    public static final void A02(Activity activity, UserSession userSession, C369848vQ r7, InteractiveDrawableContainer interactiveDrawableContainer, int i) {
        int i2;
        0qQ.A0B(activity, 1);
        1Au.A00(userSession);
        if (182.A06(0Tu.A05, userSession, 36322989393849045L)) {
            AnonymousClass5Gt r4 = new AnonymousClass5Gt(activity, new C315476jx(i));
            int applyDimension = (int) TypedValue.applyDimension(1, -185.0f, activity.getResources().getDisplayMetrics());
            if (r7 != null) {
                i2 = r7.A02;
            } else {
                i2 = 0;
            }
            r4.A05(new AnonymousClass9UE(interactiveDrawableContainer, 0, i2 - applyDimension, true));
            r4.A01();
            interactiveDrawableContainer.postDelayed(new C41037AnL(userSession, r4.A00()), 500);
        }
    }

    public static final void A05(AnonymousClass88O r4, InteractiveDrawableContainer interactiveDrawableContainer) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(interactiveDrawableContainer, 1);
        ArrayList A0V = interactiveDrawableContainer.A0V(C369848vQ.class);
        if (A0V.size() == 1) {
            r4.A01(new C40327AaM((Drawable) A0V.get(0), interactiveDrawableContainer));
        }
    }

    public static final void A06(InteractiveDrawableContainer interactiveDrawableContainer, boolean z) {
        String str;
        0qQ.A0B(interactiveDrawableContainer, 0);
        C369848vQ r1 = (C369848vQ) 00k.A0J(interactiveDrawableContainer.A0V(C369848vQ.class));
        if (r1 != null) {
            r1.setVisible(z, false);
            if (z) {
                str = "reel_mention_post";
            } else {
                str = "reel_mention_post_fullscreen_photo";
            }
            r1.A00 = str;
        }
        Drawable drawable = (Drawable) 00k.A0J(interactiveDrawableContainer.A0V(AnonymousClass9WT.class));
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public static final boolean A07(Context context, UserSession userSession, C3498482b r11, InteractiveDrawableContainer interactiveDrawableContainer, float f, float f2, float f3, float f4) {
        if (r11 != null && r11.A02 && f > 0.0f && f < f3 && f2 > 0.0f && f2 < f4) {
            1Av A00 = 1Au.A00(userSession);
            0Tu r8 = 0Tu.A05;
            if (182.A06(r8, userSession, 36322989393849045L)) {
                0xa r6 = A00.A01;
                if (r6.getInt("immersive_mention_reshare_tooltip_tap_count", 0) < 1) {
                    C369848vQ r7 = (C369848vQ) 00k.A0J(interactiveDrawableContainer.A0V(C369848vQ.class));
                    0qQ.A0C(context, Pxd.A00(0));
                    Activity activity = (Activity) context;
                    int i = 2131972271;
                    if (0qQ.A0K(r11.A05.A02(), true)) {
                        i = 2131972270;
                    }
                    A02(activity, userSession, r7, interactiveDrawableContainer, i);
                    A00.A0z("immersive_mention_reshare_tooltip_tap_count", r6.getInt("immersive_mention_reshare_tooltip_tap_count", 0) + 1);
                    return true;
                }
            }
            if (!182.A06(r8, userSession, 36322989393849045L)) {
                if (1Au.A00(userSession).A20()) {
                    r11.A01();
                    A06(interactiveDrawableContainer, true);
                    return true;
                }
                r11.A00();
                A06(interactiveDrawableContainer, false);
                return true;
            }
        }
        return false;
    }

    public static final Drawable A00(Context context, UserSession userSession, C3498482b r23, String str) {
        C3498482b r1 = r23;
        if (r1.A09 == null) {
            return null;
        }
        Context context2 = context;
        0Pl A00 = 0Pl.A0n.A00(context2, userSession);
        1Xj r7 = r1.A07;
        String BpP = r7.BpP();
        LruCache lruCache = A00.A0H;
        Drawable drawable = (Drawable) lruCache.get(BpP);
        if (drawable != null) {
            return drawable;
        }
        Resources resources = context2.getResources();
        ArrayList arrayList = new ArrayList();
        User[] userArr = {r7.A0C.B9t(), r7.A2A(A00.A0K)};
        0qQ.A0B(userArr, 0);
        arrayList.addAll(03t.A0I(userArr));
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.asset_picker_static_sticker_last_row_padding);
        Drawable A002 = C244283aw.A00(context2, (Drawable) null, Float.valueOf(0.4f), AnonymousClass05K.A0C, (Integer) null, Integer.valueOf(resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin)), Integer.valueOf(resources.getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin)), (Integer) null, str, arrayList, dimensionPixelSize, false, true, false, true, false);
        lruCache.put(BpP, A002);
        return A002;
    }

    public static final String A01(Context context, C3498482b r3) {
        if (r3.A09 != null) {
            return context.getString(2131963210, new Object[]{r3.A0A.getUsername()});
        }
        return null;
    }

    public static final void A03(Drawable drawable, C3510387i r6, float f) {
        if (drawable instanceof AnonymousClass9X8) {
            ((AnonymousClass9X8) drawable).A03 = new C376429Hy(f);
            if (r6 != null) {
                C376429Hy r5 = new C376429Hy(f);
                if (r6.A0B()) {
                    r6.A0U.A01(r5.A02, r5.A03, r5.A00, r5.A01);
                }
            }
        } else if (drawable instanceof AnonymousClass8DV) {
            ((AnonymousClass8DV) drawable).A02(f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (r3.A0E == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(com.instagram.common.session.UserSession r16, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r17, X.AnonymousClass88O r18, X.C3498482b r19, com.instagram.ui.widget.interactive.InteractiveDrawableContainer r20, java.lang.String r21) {
        /*
            r4 = r17
            r1 = 0
            r5 = r18
            X.0qQ.A0B(r5, r1)
            r0 = 1
            r2 = r20
            X.0qQ.A0B(r2, r0)
            r3 = 3
            X.0qQ.A0B(r4, r3)
            r3 = 5
            r7 = r21
            X.0qQ.A0B(r7, r3)
            android.content.Context r9 = r2.getContext()
            r3 = r19
            boolean r6 = r3.A0D
            if (r6 == 0) goto L_0x0028
            boolean r6 = r3.A0E
            r20 = 1
            if (r6 != 0) goto L_0x002a
        L_0x0028:
            r20 = 0
        L_0x002a:
            X.0qQ.A0A(r9)
            com.instagram.user.model.User r12 = r3.A09
            if (r12 != 0) goto L_0x0033
            com.instagram.user.model.User r12 = r3.A0A
        L_0x0033:
            java.lang.String r14 = r3.A0C
            r11 = 0
            X.0qQ.A0B(r9, r0)
            r6 = 2
            X.0qQ.A0B(r12, r6)
            android.content.res.Resources r8 = r9.getResources()
            r6 = 2131165193(0x7f070009, float:1.7944596E38)
            int r17 = r8.getDimensionPixelSize(r6)
            r6 = 2131165572(0x7f070184, float:1.7945365E38)
            int r18 = r8.getDimensionPixelSize(r6)
            r6 = 2131165218(0x7f070022, float:1.7944647E38)
            int r15 = r8.getDimensionPixelSize(r6)
            r6 = r16
            android.graphics.drawable.Drawable r10 = A00(r9, r6, r3, r7)
            java.lang.String r13 = A01(r9, r3)
            X.8vQ r8 = new X.8vQ
            r16 = r15
            r19 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            float r7 = r3.A04
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r4 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r4
            X.81W r4 = r4.A0K
            int r3 = r4.getWidth()
            float r6 = (float) r3
            int r3 = r4.getHeight()
            float r4 = (float) r3
            r3 = 1056964608(0x3f000000, float:0.5)
            X.ADo r4 = X.C394869yp.A00(r7, r6, r4, r3, r1)
            X.6b1 r3 = new X.6b1
            r3.<init>(r4)
            r7 = r2
            r9 = r3
            r10 = r1
            r11 = r1
            r12 = r1
            r7.A0K(r8, r9, r10, r11, r12)
            X.AaM r3 = new X.AaM
            r3.<init>(r8, r2)
            r5.A01(r3)
            java.lang.Class<X.8vQ> r3 = X.C369848vQ.class
            java.util.ArrayList r4 = r2.A0V(r3)
            int r3 = r4.size()
            if (r3 != r0) goto L_0x00ae
            java.lang.Object r1 = r4.get(r1)
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            X.AaM r0 = new X.AaM
            r0.<init>(r1, r2)
            r5.A01(r0)
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass91L.A04(com.instagram.common.session.UserSession, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.88O, X.82b, com.instagram.ui.widget.interactive.InteractiveDrawableContainer, java.lang.String):void");
    }
}
