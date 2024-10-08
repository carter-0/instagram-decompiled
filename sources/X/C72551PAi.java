package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.PAi  reason: case insensitive filesystem */
public final class C72551PAi implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final AnonymousClass9HC A01;
    public final AnonymousClass7DZ A02;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        PBU pbu = new PBU(DbU.A0A(layoutInflater, viewGroup, R.layout.prompts_contextual_reply_card, false), this.A01);
        this.A02.A00(pbu);
        return pbu;
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r13, AnonymousClass7FW r14) {
        CharSequence charSequence;
        CharSequence charSequence2;
        PBU pbu = (PBU) r13;
        C68821NYf nYf = (C68821NYf) r14;
        boolean A1U = AnonymousClass7TF.A1U(0, pbu, nYf);
        C328667Fr r7 = nYf.A02;
        AnonymousClass7FE r0 = r7.A0C;
        View view = pbu.A01;
        AnonymousClass7L2 r2 = r0.A03;
        Drawable A002 = C328037De.A00();
        AnonymousClass7FB.A07(A002, r2, nYf.A06);
        view.setBackground(A002);
        AnonymousClass0iw r5 = this.A00;
        AnonymousClass774 r1 = r7.A0E;
        IgImageView igImageView = pbu.A03;
        if (r1 != null) {
            igImageView.setVisibility(0);
            igImageView.setUrl((ImageUrl) r1.A0A.get(0), r5);
            charSequence = r1.A03;
        } else {
            igImageView.setVisibility(8);
            charSequence = null;
        }
        IgTextView igTextView = pbu.A02;
        igTextView.setText(charSequence);
        AnonymousClass74T r02 = r7.A0D;
        if (!(r02 == null || (charSequence2 = r02.A09) == null)) {
            C252063oV r03 = pbu.A07;
            C66580MXl.A1Q(r03, 0);
            ((TextView) r03.getView()).setText(charSequence2);
        }
        MediaFrameLayout mediaFrameLayout = pbu.A09;
        if (mediaFrameLayout != null) {
            mediaFrameLayout.A00 = -1.0f;
        }
        AnonymousClass777 r12 = r7.A0F;
        if (r12 == null || !(r12 instanceof AnonymousClass776)) {
            JTS.A0u(view.getContext(), igTextView, R.attr.igds_color_secondary_text);
            igImageView.setStrokeAlpha(0);
            C66582MXn.A1G(pbu.A05);
        } else {
            AnonymousClass0eM r8 = pbu.A08.A0c;
            if (AnonymousClass7TF.A1Z(r8)) {
                C252063oV r04 = pbu.A04;
                C66580MXl.A1Q(r04, 0);
                ImageUrl imageUrl = ((AnonymousClass776) r12).A00;
                r04.getView().setUrl(imageUrl, r5);
                if (mediaFrameLayout != null) {
                    mediaFrameLayout.A00 = C70138Nxs.A00(Integer.valueOf(imageUrl.getWidth()), Integer.valueOf(imageUrl.getHeight()));
                }
            } else {
                C252063oV r10 = pbu.A06;
                C66580MXl.A1Q(r10, 0);
                ImageUrl imageUrl2 = ((AnonymousClass776) r12).A00;
                ((MediaFrameLayout) r10.getView()).A00 = C70138Nxs.A00(Integer.valueOf(imageUrl2.getWidth()), Integer.valueOf(imageUrl2.getHeight()));
                DbT.A0b(r10.getView(), R.id.media).setUrl(imageUrl2, r5);
            }
            Context context = view.getContext();
            if (!A1U || !AnonymousClass7TF.A1Z(r8)) {
                JTS.A0u(context, igTextView, R.attr.igds_color_secondary_text);
                igImageView.setStrokeAlpha(0);
                C66582MXn.A1G(pbu.A05);
            } else {
                JTS.A0u(context, igTextView, R.attr.igds_color_primary_text_on_media);
                igImageView.A0H(JTR.A08(context), AnonymousClass7TF.A03(context, R.attr.igds_photo_border));
                C66580MXl.A1Q(pbu.A05, 0);
            }
        }
        this.A02.A02(pbu, nYf);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r4) {
        PBU pbu = (PBU) r4;
        0qQ.A0B(pbu, 0);
        pbu.A03.A09();
        C252063oV r2 = pbu.A07;
        if (r2.CVM()) {
            C66580MXl.A1Q(r2, 8);
        }
        DbZ.A1X(pbu.A06);
        DbZ.A1X(pbu.A04);
        DbZ.A1X(pbu.A05);
        this.A02.A01(pbu);
    }

    public C72551PAi(AnonymousClass0iw r1, AnonymousClass9HC r2, AnonymousClass7DZ r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
