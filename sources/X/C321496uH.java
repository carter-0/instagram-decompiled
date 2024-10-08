package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.imagebutton.IgMultiImageButton;

/* renamed from: X.6uH  reason: invalid class name and case insensitive filesystem */
public abstract class C321496uH {
    /* JADX WARNING: type inference failed for: r3v0, types: [android.view.View, com.instagram.igds.components.imagebutton.IgMultiImageButton] */
    public static final IgMultiImageButton A00(Context context) {
        ? igMultiImageButton = new IgMultiImageButton(context, (AttributeSet) null, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
        igMultiImageButton.setLayoutParams(marginLayoutParams);
        return igMultiImageButton;
    }

    public static final void A02(AnonymousClass0iw r22, UserSession userSession, 1Xj r24, C267644bx r25, AnonymousClass32J r26, AnonymousClass726 r27, IgMultiImageButton igMultiImageButton, String str, String str2, float f, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        boolean z4;
        C321506uI r13;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        IgMultiImageButton igMultiImageButton2 = igMultiImageButton;
        0qQ.A0B(igMultiImageButton2, 1);
        1Xj r9 = r24;
        0qQ.A0B(r9, 2);
        AnonymousClass0iw r7 = r22;
        0qQ.A0B(r7, 12);
        1Xj A1c = r9.A1c(0);
        if (A1c == null) {
            A1c = r9;
        }
        boolean A5f = A1c.A5f();
        boolean A05 = 1sd.A00(userSession2).A05(r9);
        0Tu r3 = 0Tu.A05;
        if (!182.A06(r3, userSession2, 36326953648666718L) || ((182.A06(r3, userSession2, 36326953648732255L) && 1Bh.A00().A03()) || (182.A06(r3, userSession2, 36326953648797792L) && 1Bh.A00().A02()))) {
            z4 = true;
        } else {
            z4 = false;
        }
        C321516uJ r6 = null;
        if (A05) {
            r13 = null;
        } else {
            int i5 = i3;
            AnonymousClass32J r1 = r26;
            r13 = new C321506uI(r7, userSession2, r9, r1, i5, z4, A5f);
            r6 = new C321516uJ(r9, r1, i5);
        }
        int i6 = i2;
        int i7 = i;
        if (A5f || A05) {
            OSK.A00(r13, r7, r9, igMultiImageButton2, i6, i7, A5f, false);
            if (A5f) {
                I2F.A02(r9, r7, userSession2, AnonymousClass05K.A01);
                return;
            }
            return;
        }
        int i8 = i4;
        AnonymousClass726 r11 = r27;
        String str3 = str;
        String str4 = str2;
        C321466uD.A02(r13, r6, r7, userSession2, r9, r25, r11, igMultiImageButton2, str3, str4, f, i6, i7, i8, z, false, false, z2, z3);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.view.View, com.instagram.igds.components.imagebutton.IgMultiImageButton] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.Context r3, com.instagram.igds.components.imagebutton.IgMultiImageButton r4, boolean r5) {
        /*
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            X.0qQ.A0C(r2, r0)
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            if (r5 == 0) goto L_0x001f
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165672(0x7f0701e8, float:1.7945568E38)
            int r0 = r1.getDimensionPixelSize(r0)
        L_0x0018:
            r2.setMarginEnd(r0)
            r4.setLayoutParams(r2)
            return
        L_0x001f:
            r0 = 0
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C321496uH.A01(android.content.Context, com.instagram.igds.components.imagebutton.IgMultiImageButton, boolean):void");
    }
}
