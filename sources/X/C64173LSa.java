package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.LSa  reason: case insensitive filesystem */
public abstract class C64173LSa {
    public static final C60704Jpp A00(Context context, ViewGroup viewGroup) {
        View A09 = DbU.A09(LayoutInflater.from(context), viewGroup, R.layout.layout_highlight_card, false);
        C60704Jpp jpp = new C60704Jpp(A09);
        A09.setTag(jpp);
        return jpp;
    }

    public static final void A01(Context context, C60704Jpp jpp, C322956wg r7, boolean z, boolean z2) {
        DbZ.A0t(0, context, jpp, r7);
        A04(jpp);
        jpp.A00(z, z2);
        AnonymousClass0eM r4 = jpp.A08;
        C60005JdE jdE = (C60005JdE) r4.getValue();
        jdE.A0V.setColor(AnonymousClass7TF.A03(context, R.attr.igds_color_highlight_background));
        jdE.invalidateSelf();
        C60005JdE jdE2 = (C60005JdE) r4.getValue();
        jdE2.A0U.setColor(AnonymousClass7TF.A03(DbS.A07(jpp), R.attr.igds_color_primary_background));
        jdE2.invalidateSelf();
        IgSimpleImageView igSimpleImageView = jpp.A04;
        igSimpleImageView.setVisibility(0);
        DbU.A13(context, igSimpleImageView, R.drawable.instagram_add_pano_outline_24);
        DbX.A12(context, igSimpleImageView, 2Yu.A0B(context));
        jpp.A00 = new C64850LjC(r7, 6);
        IgTextView igTextView = jpp.A05;
        DbT.A18(context, igTextView, 2131956460);
        igTextView.setVisibility(0);
        JTS.A0u(DbS.A07(jpp), igTextView, R.attr.igds_color_secondary_text);
    }

    public static final void A02(C322946wf r6, C60704Jpp jpp, boolean z, boolean z2) {
        AnonymousClass7TF.A1H(jpp, r6);
        A04(jpp);
        jpp.A00(z, z2);
        Context A07 = DbS.A07(jpp);
        AnonymousClass0eM r5 = jpp.A08;
        C60005JdE jdE = (C60005JdE) r5.getValue();
        jdE.A0V.setColor(AnonymousClass7TF.A03(A07, R.attr.igds_color_highlight_background));
        jdE.invalidateSelf();
        C60005JdE jdE2 = (C60005JdE) r5.getValue();
        jdE2.A0U.setColor(AnonymousClass7TF.A03(A07, R.attr.igds_color_primary_background));
        jdE2.invalidateSelf();
        IgSimpleImageView igSimpleImageView = jpp.A04;
        igSimpleImageView.setVisibility(0);
        DbU.A13(A07, igSimpleImageView, R.drawable.instagram_my_week_story_pano_outline_24);
        IgTextView igTextView = jpp.A05;
        DbU.A1A(jpp.itemView.getResources(), igTextView, 2131963441);
        igTextView.setVisibility(0);
        JTS.A0u(A07, igTextView, R.attr.igds_color_secondary_text);
        jpp.A00 = new C64850LjC(r6, 7);
    }

    public static final void A03(UserSession userSession, AnonymousClass3BT r10, C60704Jpp jpp, C230242pG r12, String str, List list, int i, boolean z, boolean z2) {
        C60704Jpp jpp2 = jpp;
        AnonymousClass7TG.A1U(userSession, jpp, r10);
        C230242pG r6 = r12;
        List list2 = list;
        C51974G9v.A1N(list, r12, str);
        A04(jpp);
        jpp.A00(z, z2);
        Reel reel = r10.A03;
        ImageUrl A08 = reel.A08();
        if (A08 == null) {
            A08 = reel.A07();
        }
        Bitmap bitmap = r10.A00;
        if (!reel.A0l() || bitmap == null) {
            ((C60005JdE) jpp.A08.getValue()).A02(A08, str);
        } else {
            C60005JdE jdE = (C60005JdE) jpp.A08.getValue();
            if (bitmap != jdE.A01) {
                jdE.A00 = System.currentTimeMillis();
                jdE.A01();
                C60005JdE.A00(bitmap, jdE);
            }
        }
        boolean A04 = r10.A04(userSession);
        IgImageView igImageView = jpp.A06;
        if (!A04) {
            igImageView.setVisibility(0);
        } else {
            igImageView.setVisibility(8);
        }
        IgTextView igTextView = jpp.A05;
        igTextView.setText(reel.A0r);
        igTextView.setVisibility(0);
        jpp.A00 = new C64853LjF(jpp2, r6, JTP.A0r(reel), list2, i);
    }

    public static final void A04(C60704Jpp jpp) {
        0qQ.A0B(jpp, 0);
        Context A07 = DbS.A07(jpp);
        AnonymousClass0eM r5 = jpp.A08;
        ((C60005JdE) r5.getValue()).A01();
        C60005JdE jdE = (C60005JdE) r5.getValue();
        jdE.A0V.setColor(0);
        jdE.invalidateSelf();
        C60005JdE jdE2 = (C60005JdE) r5.getValue();
        jdE2.A0U.setColor(AnonymousClass7TF.A03(A07, R.attr.igds_color_highlight_background));
        jdE2.invalidateSelf();
        IgSimpleImageView igSimpleImageView = jpp.A04;
        igSimpleImageView.setVisibility(8);
        igSimpleImageView.setImageDrawable((Drawable) null);
        IgTextView igTextView = jpp.A05;
        DbS.A1C(igTextView);
        igTextView.setVisibility(8);
        JTS.A0u(A07, igTextView, R.attr.igds_color_primary_text_on_media);
        igSimpleImageView.setImageTintList((ColorStateList) null);
        C60005JdE jdE3 = (C60005JdE) r5.getValue();
        jdE3.A04 = false;
        jdE3.invalidateSelf();
        IgSimpleImageView igSimpleImageView2 = jpp.A02;
        igSimpleImageView2.setSelected(false);
        igSimpleImageView2.setImageDrawable(JTO.A0D(r5));
        jpp.A00(false, false);
    }
}
