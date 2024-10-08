package X;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.Map;

/* renamed from: X.OZe  reason: case insensitive filesystem */
public final class C71027OZe {
    public final UserSession A00;
    public final Map A01 = AnonymousClass7TE.A1H();
    public final AnonymousClass75A A02;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c1, code lost:
        if (r3 != false) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(com.instagram.common.ui.widget.imageview.IgImageView r9, X.C231672s5 r10, X.C252063oV r11, X.AnonymousClass3Q2 r12, java.lang.Object r13, X.AnonymousClass0eM r14) {
        /*
            r8 = this;
            r4 = 1
            X.0qQ.A0B(r9, r4)
            X.C51972G9s.A1C(r11, r14)
            com.instagram.common.session.UserSession r3 = r8.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328813369638503(0x8110dd00023e67, double:3.037826087124671E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x006f
            boolean r0 = r11.CVM()
            if (r0 != 0) goto L_0x001f
            if (r12 != 0) goto L_0x001f
        L_0x001e:
            return
        L_0x001f:
            boolean r3 = A01(r8, r12)
            if (r12 == 0) goto L_0x005d
            if (r3 == 0) goto L_0x005d
            android.view.View r1 = r11.getView()
            r0 = 2131443464(0x7f0b3f08, float:1.8508997E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            X.0qQ.A0A(r1)
            java.lang.String r2 = r12.A35
            r0 = 0
            r1.setProgress(r0)
            X.Lus r0 = new X.Lus
            r0.<init>(r4, r1, r12)
            r12.A0Y(r0)
            java.util.Map r1 = r8.A01
            X.0eP r0 = X.AnonymousClass7TE.A1L(r2, r0)
            r1.put(r13, r0)
            X.AnonymousClass75B.A00(r9, r4)
            java.lang.Object r0 = r14.getValue()
            X.3Us r0 = (X.C242553Us) r0
            r8.A00(r0, r9)
            r9.setImageRendererAndReset(r10)
        L_0x005d:
            boolean r0 = r11.CVM()
            if (r0 == 0) goto L_0x001e
            android.view.View r1 = r11.getView()
            int r0 = X.DbW.A01(r3)
            r1.setVisibility(r0)
            return
        L_0x006f:
            java.lang.Object r0 = r14.getValue()
            X.3Us r0 = (X.C242553Us) r0
            X.77D r6 = X.C3265577g.A04(r0, r9)
            java.lang.Object r7 = r14.getValue()
            X.3Us r7 = (X.C242553Us) r7
            android.view.View r1 = r11.getView()
            r0 = 2131443464(0x7f0b3f08, float:1.8508997E38)
            android.view.View r5 = r1.findViewById(r0)
            android.widget.ProgressBar r5 = (android.widget.ProgressBar) r5
            boolean r3 = A01(r8, r12)
            if (r12 == 0) goto L_0x00c1
            if (r3 == 0) goto L_0x00c4
            X.0qQ.A0A(r5)
            java.lang.String r2 = r12.A35
            r0 = 0
            r5.setProgress(r0)
            X.Lus r0 = new X.Lus
            r0.<init>(r4, r5, r12)
            r12.A0Y(r0)
            java.util.Map r1 = r8.A01
            X.0eP r0 = X.AnonymousClass7TE.A1L(r2, r0)
            r1.put(r13, r0)
            X.AnonymousClass75B.A00(r9, r4)
            r8.A00(r7, r9)
            r9.setImageRendererAndReset(r6)
        L_0x00b7:
            r0 = 0
        L_0x00b8:
            r5.setVisibility(r0)
            r0 = r3 ^ 1
            r5.setIndeterminate(r0)
            return
        L_0x00c1:
            if (r3 == 0) goto L_0x00c4
            goto L_0x00b7
        L_0x00c4:
            r0 = 8
            goto L_0x00b8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71027OZe.A02(com.instagram.common.ui.widget.imageview.IgImageView, X.2s5, X.3oV, X.3Q2, java.lang.Object, X.0eM):void");
    }

    public static final boolean A01(C71027OZe oZe, AnonymousClass3Q2 r3) {
        if (r3 != null && ((r3.A12() || r3.A10()) && C379909Vu.A01(r3))) {
            if (!182.A06(0Tu.A05, oZe.A00, 36323625049206080L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void A03(Object obj) {
        AnonymousClass3Q2 A03;
        0eP r2 = (0eP) this.A01.remove(obj);
        if (r2 != null && (A03 = 28K.A00(this.A00).A03((String) r2.A00)) != null) {
            A03.A0Z((AnonymousClass2sT) r2.A01);
        }
    }

    public C71027OZe(UserSession userSession, AnonymousClass75A r3) {
        this.A00 = userSession;
        this.A02 = r3;
    }

    private final void A00(C242553Us r6, IgImageView igImageView) {
        View view;
        ViewParent parent = igImageView.getParent();
        if ((parent instanceof FrameLayout) && (view = (View) parent) != null) {
            Context context = igImageView.getContext();
            C328047Df r2 = new C328047Df((C242553Us) null, 127);
            r2.A02(r6, AnonymousClass05K.A00);
            ShapeDrawable shapeDrawable = new ShapeDrawable(r2);
            C66582MXn.A11(shapeDrawable, AnonymousClass7TF.A03(context, R.attr.igds_color_secondary_button_on_media_panavision));
            view.setForeground(shapeDrawable);
        }
    }
}
