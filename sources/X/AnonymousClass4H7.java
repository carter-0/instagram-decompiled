package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.gradient.IGGradientView;
import com.instagram.user.model.User;

/* renamed from: X.4H7  reason: invalid class name */
public final class AnonymousClass4H7 {
    public static final AnonymousClass4H7 A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d3, code lost:
        if (X.C56645I6a.A03(r10) == false) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.instagram.common.session.UserSession r10, X.AnonymousClass4H6 r11, X.AnonymousClass4GZ r12, X.AnonymousClass4DU r13, com.instagram.user.model.User r14, com.instagram.user.model.User r15, java.lang.String r16, java.lang.String r17, boolean r18, boolean r19) {
        /*
            r4 = 0
            r6 = r12
            X.0qQ.A0B(r12, r4)
            r0 = 6
            r1 = r16
            X.0qQ.A0B(r1, r0)
            r0 = 7
            r9 = r17
            X.0qQ.A0B(r9, r0)
            r2 = 8
            r0 = 9
            r5 = r11
            X.0qQ.A0B(r11, r0)
            java.lang.String r0 = "open_carousel_prompt"
            boolean r0 = X.00p.A0i(r1, r0, r4)
            if (r0 != 0) goto L_0x00d6
            r7 = r13
            if (r18 == 0) goto L_0x008b
            X.0t1 r0 = X.0eE.A00(r10)
            com.instagram.user.model.User r3 = r0.A00()
            X.0eM r0 = r12.A03
            java.lang.Object r1 = r0.getValue()
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            com.instagram.common.typedurl.ImageUrl r0 = r3.Bh3()
            r1.setUrl(r0, r13)
            A02(r12, r3)
            X.0eM r0 = r12.A05
            java.lang.Object r1 = r0.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setVisibility(r4)
            r0 = 2131969008(0x7f1343f0, float:1.9574927E38)
            r1.setText(r0)
            X.0eM r0 = r12.A07
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r2)
            X.0eM r0 = r12.A01
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r4)
            X.0eM r2 = r12.A06
            java.lang.Object r1 = r2.getValue()
            android.view.View r1 = (android.view.View) r1
            X.DEZ r0 = X.DEZ.A00
            X.AnonymousClass0fU.A00(r0, r1)
            java.lang.Object r3 = r2.getValue()
            android.view.View r3 = (android.view.View) r3
            X.GIa r2 = com.instagram.igds.components.gradient.IGGradientView.A00
            android.graphics.drawable.GradientDrawable$Orientation r1 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r0 = 51
            android.graphics.drawable.GradientDrawable r0 = r2.A01(r1, r0)
            r3.setBackground(r0)
            android.view.ViewStub r0 = r12.A00
            r0.setVisibility(r4)
            return
        L_0x008b:
            java.lang.String r4 = "0"
            if (r19 != 0) goto L_0x00d6
            r8 = r14
            if (r14 == 0) goto L_0x00b5
            java.lang.String r0 = r14.getId()
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 != 0) goto L_0x00b5
            X.0Tu r3 = X.0Tu.A05
            r0 = 36320279269744793(0x81091a00042099, double:3.032429087987827E-306)
            boolean r0 = X.182.A06(r3, r10, r0)
            if (r0 == 0) goto L_0x00b5
            boolean r0 = X.C56645I6a.A03(r10)
            if (r0 != 0) goto L_0x00b5
        L_0x00af:
            X.4H7 r4 = A00
            r4.A01(r5, r6, r7, r8, r9)
            return
        L_0x00b5:
            r8 = r15
            if (r15 == 0) goto L_0x00d6
            java.lang.String r0 = r15.getId()
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 != 0) goto L_0x00d6
            X.0Tu r3 = X.0Tu.A05
            r0 = 2342163288485470387(0x2081091a002320b3, double:4.0658226790138386E-152)
            boolean r0 = X.182.A06(r3, r10, r0)
            if (r0 == 0) goto L_0x00d6
            boolean r0 = X.C56645I6a.A03(r10)
            if (r0 != 0) goto L_0x00d6
            goto L_0x00af
        L_0x00d6:
            android.view.ViewStub r0 = r12.A00
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4H7.A00(com.instagram.common.session.UserSession, X.4H6, X.4GZ, X.4DU, com.instagram.user.model.User, com.instagram.user.model.User, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    private final void A01(AnonymousClass4H6 r5, AnonymousClass4GZ r6, AnonymousClass4DU r7, User user, String str) {
        ((IgImageView) r6.A03.getValue()).setUrl(user.Bh3(), r7);
        A02(r6, user);
        TextView textView = (TextView) r6.A07.getValue();
        textView.setVisibility(0);
        textView.setText(str);
        ((View) r6.A05.getValue()).setVisibility(8);
        ((View) r6.A01.getValue()).setVisibility(8);
        AnonymousClass0eM r2 = r6.A06;
        AnonymousClass0fU.A00(new IB6(r5, r7, user), (View) r2.getValue());
        ((View) r2.getValue()).setBackground(IGGradientView.A00.A01(GradientDrawable.Orientation.TOP_BOTTOM, 51));
        r6.A00.setVisibility(0);
    }

    public static final void A02(AnonymousClass4GZ r2, User user) {
        if (user.isVerified()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(user.getUsername());
            AnonymousClass0eM r22 = r2.A04;
            Context context = ((View) r22.getValue()).getContext();
            0qQ.A07(context);
            C244273av.A07(context, spannableStringBuilder, true);
            ((TextView) r22.getValue()).setText(spannableStringBuilder);
            return;
        }
        ((TextView) r2.A04.getValue()).setText(user.getUsername());
    }
}
