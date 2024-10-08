package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.H1d  reason: case insensitive filesystem */
public final class C54159H1d extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "AudioTranslationsConsumptionFragment";
    public View.OnClickListener A00;
    public boolean A01;
    public final String A02 = "AutoTranslationsBottomSheetFragment";
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7215Pzj pzj;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        0lg A0X = DbT.A0X(this.A03);
        boolean z = this.A01;
        0Aj A0e = AnonymousClass7TE.A0e(DbT.A0Q(this, A0X, 0), "instagram_clips_bottom_sheet_impression");
        if (A0e.isSampled()) {
            C51965G9l.A1M(A0e, this.A02);
            int i = 0;
            C51969G9p.A16(A0e, 0);
            C51967G9n.A17(A0e);
            A0e.AAJ("bottom_sheet_type", "clips_dubbed_with_ai");
            A0e.A7p("is_translated", Boolean.valueOf(z));
            C7215Pzj[] values = C7215Pzj.values();
            int length = values.length;
            while (true) {
                if (i >= length) {
                    pzj = null;
                    break;
                }
                pzj = values[i];
                if (C51973G9u.A1V(pzj)) {
                    break;
                }
                i++;
            }
            A0e.A8M(pzj, "translated_language");
            A0e.Cgf();
        }
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final String getModuleName() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1898022466);
        C54159H1d.super.onCreate(bundle);
        this.A01 = requireArguments().getBoolean(AnonymousClass000.A00(1507));
        AnonymousClass0fD.A09(194384988, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C321016tR r7;
        int A022 = AnonymousClass0fD.A02(295054782);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater2, 0);
        View inflate = layoutInflater2.inflate(R.layout.layout_auto_translations_bottom_sheet_fragment, viewGroup, false);
        ImageView A0J = DbX.A0J(inflate, R.id.waveform_image_view);
        UserSession A0l = AnonymousClass7TE.A0l(this.A03);
        Context context = getContext();
        if (context != null) {
            String A012 = AnonymousClass2dd.A01(context.getResources(), R.drawable.meta_ai_waveform_alpha);
            if (A012 == null) {
                A012 = "";
            }
            String valueOf = String.valueOf(R.drawable.meta_ai_waveform_alpha);
            r7 = new C321016tR(context, A0l, new C321076tX(-1, context.getResources().getDimensionPixelSize(R.dimen.audio_dubbing_gen_ai_gif_size), AnonymousClass7TF.A02(context, R.dimen.audio_dubbing_gen_ai_gif_size)), AnonymousClass05K.A01, A012, valueOf, (String) null, 1.0f, context.getColor(R.color.fds_transparent), context.getColor(R.color.fds_transparent), false);
            r7.A0A(1);
        } else {
            r7 = null;
        }
        A0J.setImageDrawable(r7);
        Context context2 = getContext();
        if (context2 != null) {
            DbU.A1G(AnonymousClass7TG.A0R(inflate, R.id.title), this, 2131953278);
            TextView A0R = AnonymousClass7TG.A0R(inflate, R.id.description);
            String A0m = DbU.A0m(this, 2131953277);
            C48051ESu eSu = new C48051ESu(context2, this, A0m, context2.getColor(2Yu.A06(context2)));
            DbT.A1H(A0R);
            SpannableStringBuilder A0C = DbS.A0C(DbV.A0z(this, A0m, 2131953275));
            AnonymousClass7AV.A05(A0C, eSu, A0m);
            A0R.setText(A0C);
        }
        if (this.A00 != null) {
            IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass7TF.A0F(inflate, R.id.audio_dubbing_toggle);
            igdsListCell.setTextCellType(C69349Njo.TYPE_CHEVRON);
            igdsListCell.A06(2131953276);
            AnonymousClass0fU.A00(this.A00, igdsListCell);
        }
        AnonymousClass0fD.A09(798129135, A022);
        return inflate;
    }
}
