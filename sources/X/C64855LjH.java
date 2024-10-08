package X;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import java.util.Set;

/* renamed from: X.LjH  reason: case insensitive filesystem */
public final class C64855LjH implements AnonymousClass3NL {
    public C60205JhO A00;
    public C262204Co A01;
    public C262204Co A02;
    public final ValueAnimator A03;
    public final View A04;
    public final UserSession A05;
    public final AnonymousClass0eM A06 = C66305MMo.A01(this, 34);
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D = C66305MMo.A01(this, 41);
    public final AnonymousClass0eM A0E = C66305MMo.A01(this, 42);
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;

    public C64855LjH(View view, UserSession userSession) {
        int A022 = DbW.A02(1, userSession, view);
        this.A05 = userSession;
        this.A04 = view;
        float[] fArr = new float[A022];
        // fill-array-data instruction
        fArr[0] = 0;
        fArr[1] = 1065353216;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setDuration(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        this.A03 = ofFloat;
        this.A08 = C66305MMo.A01(this, 36);
        this.A07 = C66305MMo.A01(this, 35);
        this.A09 = C66305MMo.A01(this, 37);
        this.A0C = C66305MMo.A01(this, 40);
        this.A0A = C66305MMo.A01(this, 38);
        this.A0B = C66305MMo.A01(this, 39);
        this.A0G = C66305MMo.A01(this, 44);
        this.A0F = C66305MMo.A01(this, 43);
        AnonymousClass0eM r3 = this.A06;
        AnonymousClass7TE.A0b(AnonymousClass7TE.A0c(r3), R.id.iglive_header_chevron).setVisibility(8);
        JTR.A1E(AnonymousClass7TE.A0c(r3), R.id.iglive_label_layout, 8);
        JTR.A1E(AnonymousClass7TE.A0c(r3), R.id.iglive_view_count_container, 8);
        JTR.A1E(AnonymousClass7TE.A0c(r3), R.id.iglive_header_close, 8);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(AnonymousClass7TH.A06(this.A0C));
        A0m.A04 = this;
        A0m.A05 = AnonymousClass05K.A01;
        A0m.A00();
    }

    public final void A00(AnonymousClass0iw r12, UserSession userSession, C250973mM r14) {
        int i;
        String quantityString;
        int i2;
        int i3;
        Set A062;
        Reel reel = r14.A0H;
        C270194gL r2 = reel.A0H;
        if (r2 == null) {
            return;
        }
        if (!r14.A0C) {
            SegmentedProgressBar segmentedProgressBar = (SegmentedProgressBar) AnonymousClass7TE.A14(this.A0D);
            segmentedProgressBar.setSegments(1);
            segmentedProgressBar.A06(0, false);
            segmentedProgressBar.setProgress(0.0f);
            ImageUrl A022 = r2.A02();
            AnonymousClass0iw r6 = r12;
            if (A022 != null) {
                ((IgImageView) AnonymousClass7TE.A14(this.A0E)).setUrl(A022, r12);
            }
            DbU.A1S(r12, (IgImageView) AnonymousClass7TE.A14(this.A07), r2.A03());
            DbU.A1H(JTQ.A0A(this.A09), r2.A03());
            C64156LQx lQx = C64156LQx.A00;
            C240933Nf r7 = (C240933Nf) this.A0A.getValue();
            0qQ.A0B(r7, 0);
            lQx.A01(r6, r7, new AnonymousClass3NU(userSession, new AnonymousClass3BT((AnonymousClass3BS) null, reel, AnonymousClass3BQ.MAIN_FEED_TRAY)), 2.0684931f, true);
            C270194gL r0 = reel.A0H;
            if (r0 == null || (A062 = r0.A06()) == null) {
                i = 0;
            } else {
                i = A062.size();
            }
            AnonymousClass0eM r02 = this.A0B;
            TextView A0A2 = JTQ.A0A(r02);
            String str = null;
            Resources resources = AnonymousClass7TH.A06(r02).getResources();
            if (i == 0) {
                C270194gL r03 = reel.A0H;
                if (r03 != null) {
                    str = r03.A03().getUsername();
                }
                quantityString = AnonymousClass7TF.A0e(resources, str, 2131963873);
            } else {
                C270194gL r04 = reel.A0H;
                if (r04 != null) {
                    str = r04.A03().getUsername();
                }
                quantityString = resources.getQuantityString(R.plurals.iglive_chain_preview_main_text_with_guest, i, C51968G9o.A1Z(str, i));
            }
            A0A2.setText(quantityString);
            AnonymousClass0eM r05 = this.A0G;
            TextView A0A3 = JTQ.A0A(r05);
            Resources resources2 = AnonymousClass7TH.A06(r05).getResources();
            C270194gL r06 = reel.A0H;
            if (r06 != null) {
                i2 = r06.A00();
                i3 = r06.A00();
            } else {
                i2 = 0;
                i3 = 0;
            }
            A0A3.setText(resources2.getQuantityString(R.plurals.iglive_chain_preview_whos_watching_text, i2, AnonymousClass7TF.A1b(i3)));
            DbW.A1R(this.A06, 0);
            return;
        }
        C51969G9p.A1M(this.A06.getValue());
    }

    public final void DP5(View view) {
    }

    public final boolean Dqe(View view) {
        0qQ.A0B(view, 0);
        if (!view.equals(AnonymousClass7TE.A14(this.A0C))) {
            return true;
        }
        C60205JhO jhO = this.A00;
        if (jhO == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        }
        MG2.A01(jhO, C318116oQ.A00(jhO), 28);
        return true;
    }
}
