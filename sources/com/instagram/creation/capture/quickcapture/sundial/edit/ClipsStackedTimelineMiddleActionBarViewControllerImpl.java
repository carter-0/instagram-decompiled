package com.instagram.creation.capture.quickcapture.sundial.edit;

import X.00l;
import X.00y;
import X.0qQ;
import X.2Yu;
import X.2eS;
import X.AnonymousClass00P;
import X.AnonymousClass0fU;
import X.AnonymousClass0r6;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass8JM;
import X.AnonymousClass8RF;
import X.AnonymousClass8RH;
import X.AnonymousClass8YU;
import X.C355868Rr;
import X.C51966G9m;
import X.C58735Iwi;
import X.C60108Jfo;
import X.C71492dQ;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbY;
import X.G9w;
import X.JTP;
import X.JTQ;
import X.JY5;
import X.LTA;
import X.LY4;
import X.MXL;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.music.common.ui.LoadingSpinnerView;
import java.text.DecimalFormat;
import java.util.List;

public final class ClipsStackedTimelineMiddleActionBarViewControllerImpl implements MXL {
    public final AnonymousClass4DH A00;
    public final AnonymousClass8RF A01;
    public final C60108Jfo A02;
    public IgImageView loadingSpinnerBackground;
    public LoadingSpinnerView loadingSpinnerView;
    public IgSimpleImageView playButton;
    public IgSimpleImageView redoButton;
    public LoadingSpinnerView scrollingAudioLoadingSpinnerView;
    public TextView timeStampTextView;
    public IgSimpleImageView undoButton;

    private final String A00(String str) {
        int i;
        Context requireContext;
        int i2;
        Object[] A1b;
        int i3;
        int i4;
        Integer valueOf;
        Integer A0l;
        Integer A0l2;
        int i5;
        Integer A0l3;
        Integer A0l4;
        List A18 = DbV.A18(str, ":");
        if (A18.size() == 2) {
            String A1G = C51966G9m.A1G(A18, 0);
            if (A1G == null || (A0l4 = 00y.A0l(A1G)) == null) {
                i5 = 0;
            } else {
                i5 = A0l4.intValue();
            }
            String A1G2 = C51966G9m.A1G(A18, 1);
            if (A1G2 == null || (A0l3 = 00y.A0l(A1G2)) == null) {
                i = 0;
            } else {
                i = A0l3.intValue();
            }
            if (i5 > 0) {
                requireContext = this.A00.requireContext();
                i2 = 2131955855;
                A1b = new Object[2];
                G9w.A1Z(A1b, i5, 0);
                valueOf = Integer.valueOf(i);
            }
            requireContext = this.A00.requireContext();
            i2 = 2131955856;
            A1b = AnonymousClass7TF.A1b(i);
            return requireContext.getString(i2, A1b);
        }
        List A182 = DbV.A18(str, ".");
        String A1G3 = C51966G9m.A1G(A182, 0);
        if (A1G3 == null || (A0l2 = 00y.A0l(A1G3)) == null) {
            i3 = 0;
        } else {
            i3 = A0l2.intValue();
        }
        if (A182.size() == 2) {
            String A1G4 = C51966G9m.A1G(A182, 1);
            if (A1G4 == null || (A0l = 00y.A0l(A1G4)) == null) {
                i4 = 0;
            } else {
                i4 = A0l.intValue();
            }
            requireContext = this.A00.requireContext();
            i2 = 2131955854;
            A1b = new Object[2];
            G9w.A1Z(A1b, i, 0);
            valueOf = Integer.valueOf(i4);
        }
        requireContext = this.A00.requireContext();
        i2 = 2131955856;
        A1b = AnonymousClass7TF.A1b(i);
        return requireContext.getString(i2, A1b);
        A1b[1] = valueOf;
        return requireContext.getString(i2, A1b);
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final void Cmc(int i) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final void Dsw(int i) {
    }

    public final AnonymousClass0r6 DtH() {
        return null;
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final void A01(ClipsStackedTimelineMiddleActionBarViewControllerImpl clipsStackedTimelineMiddleActionBarViewControllerImpl, String str) {
        Context requireContext;
        int i;
        Object[] objArr;
        String str2 = null;
        if (00l.A0d(str, "/", false)) {
            List A18 = DbV.A18(str, " / ");
            String A1G = C51966G9m.A1G(A18, 0);
            String A1G2 = C51966G9m.A1G(A18, 1);
            if (!(A18.size() != 2 || A1G == null || A1G2 == null)) {
                String A002 = clipsStackedTimelineMiddleActionBarViewControllerImpl.A00(A1G);
                String A003 = clipsStackedTimelineMiddleActionBarViewControllerImpl.A00(A1G2);
                requireContext = clipsStackedTimelineMiddleActionBarViewControllerImpl.A00.requireContext();
                i = 2131955853;
                objArr = new Object[]{A002, A003};
            }
            clipsStackedTimelineMiddleActionBarViewControllerImpl.A03().setContentDescription(str2);
        }
        requireContext = clipsStackedTimelineMiddleActionBarViewControllerImpl.A00.requireContext();
        i = 2131955852;
        objArr = new Object[]{clipsStackedTimelineMiddleActionBarViewControllerImpl.A00(str)};
        str2 = requireContext.getString(i, objArr);
        clipsStackedTimelineMiddleActionBarViewControllerImpl.A03().setContentDescription(str2);
    }

    public static final boolean A02(ClipsStackedTimelineMiddleActionBarViewControllerImpl clipsStackedTimelineMiddleActionBarViewControllerImpl) {
        AnonymousClass8RH A0E = clipsStackedTimelineMiddleActionBarViewControllerImpl.A01.A0E();
        if (clipsStackedTimelineMiddleActionBarViewControllerImpl.A02.A0K.A0A.A02() == AnonymousClass8YU.PLAYING || !(A0E instanceof C355868Rr)) {
            return true;
        }
        return false;
    }

    public final TextView A03() {
        TextView textView = this.timeStampTextView;
        if (textView != null) {
            return textView;
        }
        0qQ.A0F("timeStampTextView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final IgSimpleImageView A04() {
        IgSimpleImageView igSimpleImageView = this.playButton;
        if (igSimpleImageView != null) {
            return igSimpleImageView;
        }
        0qQ.A0F("playButton");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void CLc() {
        int A022 = JTQ.A02(this.undoButton);
        IgSimpleImageView igSimpleImageView = this.redoButton;
        if (igSimpleImageView != null) {
            igSimpleImageView.setVisibility(A022);
        }
    }

    public final void Ehw(boolean z) {
        IgSimpleImageView igSimpleImageView = this.redoButton;
        if (igSimpleImageView != null) {
            igSimpleImageView.setEnabled(z);
        }
        Drawable drawable = this.A00.requireContext().getDrawable(R.drawable.instagram_redo_pano_filled_24);
        if (drawable != null) {
            float f = 0.4f;
            if (z) {
                f = 1.0f;
            }
            drawable.setAlpha((int) (f * 255.0f));
        }
        IgSimpleImageView igSimpleImageView2 = this.redoButton;
        if (igSimpleImageView2 != null) {
            igSimpleImageView2.setImageDrawable(drawable);
        }
    }

    public final void Eoh(int i, boolean z, int i2) {
        if (z) {
            String format = new DecimalFormat("#.00").format(Float.valueOf(((float) i) / 1000.0f));
            TextView A03 = A03();
            AnonymousClass4DH r0 = this.A00;
            DbT.A17(r0.requireContext(), A03, 2Yu.A0H(r0.requireContext(), R.attr.igds_color_creation_tools_yellow));
            A03().setText(format);
            A01(this, A03().getText().toString());
            return;
        }
        AnonymousClass8JM.A00((int) AnonymousClass7TE.A0P((long) i), new C58735Iwi(i2, 12, this));
    }

    public final void EpS(boolean z) {
        IgSimpleImageView igSimpleImageView = this.undoButton;
        if (igSimpleImageView != null) {
            igSimpleImageView.setEnabled(z);
        }
        Drawable drawable = this.A00.requireContext().getDrawable(R.drawable.instagram_undo_pano_filled_24);
        if (drawable != null) {
            float f = 0.4f;
            if (z) {
                f = 1.0f;
            }
            drawable.setAlpha((int) (f * 255.0f));
        }
        IgSimpleImageView igSimpleImageView2 = this.undoButton;
        if (igSimpleImageView2 != null) {
            igSimpleImageView2.setImageDrawable(drawable);
        }
    }

    public final void Eut() {
        IgSimpleImageView igSimpleImageView = this.undoButton;
        if (igSimpleImageView != null) {
            igSimpleImageView.setVisibility(0);
        }
        IgSimpleImageView igSimpleImageView2 = this.redoButton;
        if (igSimpleImageView2 != null) {
            igSimpleImageView2.setVisibility(0);
        }
    }

    public final void FJf(boolean z) {
        int i;
        LoadingSpinnerView loadingSpinnerView2 = this.loadingSpinnerView;
        if (loadingSpinnerView2 != null) {
            if (z) {
                loadingSpinnerView2.setLoadingStatus(JY5.LOADING);
                i = 0;
            } else {
                loadingSpinnerView2.setLoadingStatus(JY5.SUCCESS);
                i = 8;
            }
            loadingSpinnerView2.setVisibility(i);
            return;
        }
        0qQ.A0F("loadingSpinnerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void FJg(boolean z) {
        String str;
        LoadingSpinnerView loadingSpinnerView2 = this.scrollingAudioLoadingSpinnerView;
        if (loadingSpinnerView2 != null) {
            IgSimpleImageView A04 = A04();
            if (z) {
                A04.setVisibility(8);
                IgImageView igImageView = this.loadingSpinnerBackground;
                if (igImageView != null) {
                    igImageView.setVisibility(0);
                    loadingSpinnerView2.setLoadingStatus(JY5.LOADING);
                    loadingSpinnerView2.setVisibility(0);
                    return;
                }
            } else {
                A04.setVisibility(0);
                IgImageView igImageView2 = this.loadingSpinnerBackground;
                if (igImageView2 != null) {
                    igImageView2.setVisibility(8);
                    loadingSpinnerView2.setLoadingStatus(JY5.SUCCESS);
                    loadingSpinnerView2.setVisibility(8);
                    return;
                }
            }
            str = "loadingSpinnerBackground";
        } else {
            str = "scrollingAudioLoadingSpinnerView";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        C71492dQ r2;
        ViewGroup.LayoutParams layoutParams2;
        C71492dQ r3 = null;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            TextView A0G = DbU.A0G(viewGroup, R.id.play_time_stamp);
            0qQ.A0B(A0G, 0);
            this.timeStampTextView = A0G;
            IgSimpleImageView A0T = JTP.A0T(viewGroup, R.id.play_button);
            0qQ.A0B(A0T, 0);
            this.playButton = A0T;
            ADd(AnonymousClass8YU.PAUSED);
            2eS.A01(A04());
            IgSimpleImageView A0T2 = JTP.A0T(viewGroup, R.id.stacked_timeline_undo_button);
            this.undoButton = A0T2;
            if (A0T2 != null) {
                A0T2.setImageResource(R.drawable.instagram_undo_pano_filled_24);
            }
            IgSimpleImageView igSimpleImageView = this.undoButton;
            if (igSimpleImageView != null) {
                LY4.A01(igSimpleImageView, 47, this);
            }
            IgSimpleImageView A0T3 = JTP.A0T(viewGroup, R.id.stacked_timeline_redo_button);
            this.redoButton = A0T3;
            if (A0T3 != null) {
                A0T3.setImageResource(R.drawable.instagram_redo_pano_filled_24);
            }
            IgSimpleImageView igSimpleImageView2 = this.redoButton;
            if (igSimpleImageView2 != null) {
                LY4.A01(igSimpleImageView2, 48, this);
            }
            viewGroup.removeView(viewGroup.findViewById(R.id.stacked_timeline_undo_redo_guideline));
            IgSimpleImageView igSimpleImageView3 = this.undoButton;
            if (igSimpleImageView3 != null) {
                igSimpleImageView3.setBackgroundResource(R.drawable.gray_circle);
            }
            IgSimpleImageView igSimpleImageView4 = this.redoButton;
            if (igSimpleImageView4 != null) {
                igSimpleImageView4.setBackgroundResource(R.drawable.gray_circle);
            }
            IgSimpleImageView igSimpleImageView5 = this.undoButton;
            if (igSimpleImageView5 != null) {
                layoutParams = igSimpleImageView5.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof C71492dQ) {
                r2 = (C71492dQ) layoutParams;
                if (r2 != null) {
                    r2.A0N = R.id.stacked_timeline_redo_button;
                    r2.A0G = R.id.working_area_border_line;
                }
            } else {
                r2 = null;
            }
            IgSimpleImageView igSimpleImageView6 = this.redoButton;
            if (igSimpleImageView6 != null) {
                layoutParams2 = igSimpleImageView6.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if ((layoutParams2 instanceof C71492dQ) && (r3 = (C71492dQ) layoutParams2) != null) {
                r3.A0M = 0;
                r3.A0G = R.id.working_area_border_line;
                r3.setMarginEnd(DbY.A01(viewGroup.getContext()));
            }
            IgSimpleImageView igSimpleImageView7 = this.undoButton;
            if (igSimpleImageView7 != null) {
                igSimpleImageView7.setLayoutParams(r2);
            }
            IgSimpleImageView igSimpleImageView8 = this.redoButton;
            if (igSimpleImageView8 != null) {
                igSimpleImageView8.setLayoutParams(r3);
            }
            LoadingSpinnerView loadingSpinnerView2 = new LoadingSpinnerView(AnonymousClass7TE.A0S(viewGroup));
            Resources resources = loadingSpinnerView2.getResources();
            loadingSpinnerView2.setLayoutParams(new C71492dQ(DbS.A03(resources, R.dimen.abc_dialog_padding_material), DbS.A03(resources, R.dimen.abc_dialog_padding_material)));
            JTP.A13(loadingSpinnerView2);
            loadingSpinnerView2.setVisibility(8);
            viewGroup.addView(loadingSpinnerView2);
            this.loadingSpinnerView = loadingSpinnerView2;
            IgImageView A0b = DbT.A0b(viewGroup, R.id.loading_spinner_background);
            0qQ.A0B(A0b, 0);
            this.loadingSpinnerBackground = A0b;
            LoadingSpinnerView loadingSpinnerView3 = (LoadingSpinnerView) viewGroup.requireViewById(R.id.loading_spinner);
            0qQ.A0B(loadingSpinnerView3, 0);
            this.scrollingAudioLoadingSpinnerView = loadingSpinnerView3;
        }
    }

    public ClipsStackedTimelineMiddleActionBarViewControllerImpl(AnonymousClass4DH r1, AnonymousClass8RF r2, C60108Jfo jfo) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = jfo;
    }

    public final void ADd(AnonymousClass8YU r6) {
        IgSimpleImageView A04 = A04();
        int ordinal = r6.ordinal();
        int i = R.drawable.instagram_play_pano_filled_24;
        if (ordinal == 2) {
            i = R.drawable.instagram_pause_pano_filled_24;
        }
        A04.setImageResource(i);
        IgSimpleImageView A042 = A04();
        Context requireContext = this.A00.requireContext();
        int i2 = 2131955588;
        if (ordinal == 2) {
            i2 = 2131955581;
        }
        A042.setContentDescription(requireContext.getText(i2));
    }

    public final void API() {
        String str;
        A04().setVisibility(0);
        A04().setEnabled(true);
        IgImageView igImageView = this.loadingSpinnerBackground;
        if (igImageView != null) {
            igImageView.setVisibility(8);
            LoadingSpinnerView loadingSpinnerView2 = this.scrollingAudioLoadingSpinnerView;
            if (loadingSpinnerView2 != null) {
                loadingSpinnerView2.setLoadingStatus(JY5.SUCCESS);
                LoadingSpinnerView loadingSpinnerView3 = this.scrollingAudioLoadingSpinnerView;
                if (loadingSpinnerView3 != null) {
                    loadingSpinnerView3.setVisibility(8);
                    return;
                }
            }
            str = "scrollingAudioLoadingSpinnerView";
        } else {
            str = "loadingSpinnerBackground";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void APl() {
        String str;
        A04().setVisibility(8);
        A04().setEnabled(false);
        IgImageView igImageView = this.loadingSpinnerBackground;
        if (igImageView != null) {
            igImageView.setVisibility(0);
            LoadingSpinnerView loadingSpinnerView2 = this.scrollingAudioLoadingSpinnerView;
            if (loadingSpinnerView2 != null) {
                loadingSpinnerView2.setLoadingStatus(JY5.LOADING);
                LoadingSpinnerView loadingSpinnerView3 = this.scrollingAudioLoadingSpinnerView;
                if (loadingSpinnerView3 != null) {
                    loadingSpinnerView3.setVisibility(0);
                    return;
                }
            }
            str = "scrollingAudioLoadingSpinnerView";
        } else {
            str = "loadingSpinnerBackground";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void ATc() {
        if (A04().getVisibility() != 0) {
            LTA.A02(A04());
        }
        if (A03().getVisibility() != 0) {
            LTA.A02(A03());
        }
    }

    public final void DAv(float f) {
        A04().setAlpha(f);
        A03().setAlpha(f);
        IgSimpleImageView igSimpleImageView = this.undoButton;
        if (igSimpleImageView != null) {
            igSimpleImageView.setAlpha(f);
        }
        IgSimpleImageView igSimpleImageView2 = this.redoButton;
        if (igSimpleImageView2 != null) {
            igSimpleImageView2.setAlpha(f);
        }
    }

    public final void Efs(boolean z) {
        A04().setClickable(z);
    }

    public final void Eft(View.OnClickListener onClickListener) {
        AnonymousClass0fU.A00(onClickListener, A04());
    }
}
