package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.imageview.PulsingMultiImageView;
import java.util.List;

public final class PMD implements C74361Ptb {
    public final View A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final AnonymousClass0eM A03 = C73900Plb.A00(this, 23);
    public final AnonymousClass0eM A04 = C73900Plb.A00(this, 24);
    public final AnonymousClass0eM A05 = C73900Plb.A00(this, 25);
    public final AnonymousClass0eM A06 = C73900Plb.A00(this, 26);
    public final AnonymousClass0eM A07 = C73900Plb.A00(this, 27);
    public final AnonymousClass0eM A08 = C73900Plb.A00(this, 28);
    public final AnonymousClass0eM A09 = C73900Plb.A00(this, 29);
    public final AnonymousClass0eM A0A = C73900Plb.A00(this, 30);
    public final AnonymousClass0Ud A0B;

    public PMD(View view, AnonymousClass0iw r3, UserSession userSession, AnonymousClass0Ud r5) {
        0qQ.A0B(r5, 4);
        this.A00 = view;
        this.A01 = r3;
        this.A02 = userSession;
        this.A0B = r5;
    }

    public final /* bridge */ /* synthetic */ void ADN(C74270Pry pry) {
        N9W n9w = (N9W) pry;
        0qQ.A0B(n9w, 0);
        if (n9w.A06 || n9w.A07 || n9w.A04) {
            if (C66582MXn.A1Z(this.A09)) {
                AnonymousClass0eM r1 = this.A08;
                if (C66582MXn.A09(r1) == 0) {
                    DbW.A1R(r1, 8);
                }
            }
            if (n9w.A05) {
                AnonymousClass0eM r12 = this.A03;
                if (!C66582MXn.A1Z(r12)) {
                    ComposeView composeView = (ComposeView) JTR.A0W(r12);
                    composeView.setVisibility(0);
                    composeView.setContent(AnonymousClass5PI.A03(new C59343JFv(this, 28), -1044065638));
                }
            }
        } else if (!n9w.A05) {
            if (C66582MXn.A1Z(this.A09)) {
                AnonymousClass0eM r13 = this.A08;
                if (C66582MXn.A09(r13) == 0) {
                    View A0c = AnonymousClass7TE.A0c(r13);
                    C66580MXl.A1D(C51972G9s.A0I(A0c), new PX5(A0c));
                }
            }
            AnonymousClass0eM r14 = this.A03;
            if (C66582MXn.A1Z(r14) && JTR.A0W(r14).getVisibility() == 0) {
                View A0W = JTR.A0W(r14);
                C66580MXl.A1D(C51972G9s.A0I(A0W), new PX5(A0W));
            }
        } else {
            float f = n9w.A00;
            AnonymousClass0eM r4 = this.A08;
            if (C66582MXn.A09(r4) != 0) {
                DbW.A1R(r4, 0);
                AnonymousClass7TE.A0c(r4).setAlpha(0.0f);
                DbY.A0G(AnonymousClass7TE.A0c(r4)).start();
            } else {
                AnonymousClass7TE.A0c(r4).setAlpha(f);
            }
            JTO.A0I(this.A0A).setText(n9w.A02);
            TextView A0I = JTO.A0I(this.A06);
            String str = n9w.A01;
            A0I.setText(str);
            List list = n9w.A03;
            if (list.isEmpty()) {
                AnonymousClass7TE.A0c(this.A05).setVisibility(4);
                DbW.A1R(this.A07, 8);
                return;
            }
            boolean z = n9w.A08;
            View A0c2 = AnonymousClass7TE.A0c(this.A05);
            if (!z) {
                A0c2.setVisibility(8);
                AnonymousClass0eM r6 = this.A07;
                DbW.A1R(r6, 0);
                String moduleName = this.A01.getModuleName();
                Context context = AnonymousClass7TE.A0c(r6).getContext();
                Resources resources = context.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_left);
                int size = list.size();
                int i = R.dimen.achievements_achievement_image_size;
                if (size == 1) {
                    i = R.dimen.avatar_size_ridiculously_xxlarge;
                }
                ON3 on3 = new ON3(context, moduleName, list, resources.getDimensionPixelSize(i));
                on3.A07 = AnonymousClass05K.A01;
                on3.A00 = 0.7f;
                on3.A01(dimensionPixelSize);
                on3.A01 = 2;
                ((ImageView) r6.getValue()).setImageDrawable(on3.A00());
                AnonymousClass7TE.A0c(r6).setContentDescription(str);
                return;
            }
            A0c2.setVisibility(0);
            DbW.A1R(this.A07, 8);
            ((PulsingMultiImageView) this.A04.getValue()).setAnimatingImageUrls(list, this.A01);
        }
    }
}
