package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.LJi  reason: case insensitive filesystem */
public abstract class C64021LJi {
    public static final void A00(UserSession userSession, AnonymousClass3N1 r6, C62320sa r7) {
        AnonymousClass3N5 r4 = r6.A02;
        r4.A02.A01 = "";
        DbT.A18(DbS.A07(r6), r4.A05.A04(), 2131963441);
        AnonymousClass3NM A00 = r4.A00(userSession, false);
        A00.A02();
        List list = A00.A09;
        list.clear();
        list.add(new AnonymousClass3NH(new View[]{r6.AeH()}[0]));
        r4.A00 = new C65583LwH(r7);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View, java.lang.Object] */
    public static final void A01(C62851KnR knR, AnonymousClass3N0 r20) {
        Drawable drawable;
        AnonymousClass3N0 r2 = r20;
        AnonymousClass7TG.A0Q(r2.A09).setVisibility(8);
        AnonymousClass0eM r5 = r2.A03;
        ? r4 = ((AnonymousClass3N9) r5.getValue()).A0L;
        0qQ.A06(r4);
        C62851KnR knR2 = knR;
        if ((knR2 instanceof HDR) || 0qQ.A0K(knR2, KWM.A00)) {
            Context A0S = AnonymousClass7TE.A0S(r4);
            boolean A1a = C51966G9m.A1a(knR2, KWM.A00);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            AnonymousClass7TE.A1N(A0S, paint, R.color.direct_widget_primary_background);
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
            Paint paint2 = shapeDrawable2.getPaint();
            AnonymousClass7TE.A1N(A0S, paint2, R.color.direct_widget_primary_background);
            paint2.setStyle(style);
            paint2.setAntiAlias(true);
            int i = R.drawable.instagram_eye_off_pano_outline_24;
            if (A1a) {
                i = R.drawable.instagram_my_week_story_pano_outline_24;
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable2, AnonymousClass3JT.A05(A0S, i, A0S.getColor(R.color.igds_primary_icon))});
            int A01 = AnonymousClass1GB.A01(0nA.A04(A0S, 20));
            layerDrawable.setLayerInset(0, 0, 0, 0, 0);
            layerDrawable.setLayerInset(1, A01, A01, A01, A01);
            LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{shapeDrawable, layerDrawable});
            int A012 = AnonymousClass1GB.A01(0nA.A04(A0S, 0));
            layerDrawable2.setLayerInset(0, 0, 0, 0, 0);
            layerDrawable2.setLayerInset(1, A012, A012, A012, A012);
            drawable = layerDrawable2;
        } else if (knR2 instanceof KWN) {
            drawable = new C59973Jci(AnonymousClass7TE.A0S(r4), 0.0f, true, true);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        r4.setBackground(drawable);
        ((AnonymousClass3N9) r5.getValue()).A0O.setVisibility(4);
    }
}
