package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

public final class E4B extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "HiddenWordsNuxFragment";
    public IgdsBottomButtonLayout A00;
    public IgdsHeadline A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1C(r2, getString(2131967930));
    }

    public final String getModuleName() {
        return "HiddenWordsNUXBottomSheetFragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = (IgdsHeadline) view.findViewById(R.id.hidden_words_settings_nux);
        this.A00 = (IgdsBottomButtonLayout) view.findViewById(R.id.hidden_words_settings_bottom_button);
        IgdsHeadline igdsHeadline = this.A01;
        String str = "headline";
        if (igdsHeadline != null) {
            igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_hidden_words);
            IgdsHeadline igdsHeadline2 = this.A01;
            if (igdsHeadline2 != null) {
                igdsHeadline2.setHeadline(2131963515);
                IgdsHeadline igdsHeadline3 = this.A01;
                if (igdsHeadline3 != null) {
                    FragmentActivity activity = getActivity();
                    DbS.A1X(activity);
                    FGX A022 = FGX.A02(activity, true);
                    A022.A05(getString(2131963512), getString(2131963511), R.drawable.instagram_comment_pano_outline_24);
                    A022.A05(getString(2131963514), getString(2131963513), R.drawable.instagram_eye_off_pano_outline_24);
                    FGX.A03(A022, igdsHeadline3, getString(2131963510), getString(2131963509), R.drawable.instagram_settings_pano_outline_24);
                    IgdsBottomButtonLayout igdsBottomButtonLayout = this.A00;
                    str = "bottomButton";
                    if (igdsBottomButtonLayout != null) {
                        igdsBottomButtonLayout.setDividerVisible(true);
                        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A00;
                        if (igdsBottomButtonLayout2 != null) {
                            DbZ.A1A(this, igdsBottomButtonLayout2, 2131956706);
                            IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A00;
                            if (igdsBottomButtonLayout3 != null) {
                                igdsBottomButtonLayout3.setPrimaryActionOnClickListener(FP8.A00(this, 58));
                                C48884Elk.A00(AnonymousClass7TE.A0l(this.A02), 0);
                                return;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final boolean onBackPressed() {
        C48884Elk.A00(AnonymousClass7TE.A0l(this.A02), 2);
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-312146830);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_hidden_words_nux_screen, false);
        AnonymousClass0fD.A09(2080691110, A022);
        return A0D;
    }

    public final void onStart() {
        AnonymousClass2ZP r1;
        int A022 = AnonymousClass0fD.A02(-659015971);
        E4B.super.onStart();
        Activity rootActivity = getRootActivity();
        if ((rootActivity instanceof AnonymousClass2ZP) && (r1 = (AnonymousClass2ZP) rootActivity) != null) {
            r1.Enj(8);
        }
        AnonymousClass0fD.A09(-541638065, A022);
    }

    public final void onStop() {
        AnonymousClass2ZP r1;
        int A022 = AnonymousClass0fD.A02(1770727895);
        E4B.super.onStop();
        Activity rootActivity = getRootActivity();
        if ((rootActivity instanceof AnonymousClass2ZP) && (r1 = (AnonymousClass2ZP) rootActivity) != null) {
            r1.Enj(0);
        }
        AnonymousClass0fD.A09(677681095, A022);
    }
}
