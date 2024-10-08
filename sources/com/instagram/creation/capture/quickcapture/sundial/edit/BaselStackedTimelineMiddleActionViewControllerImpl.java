package com.instagram.creation.capture.quickcapture.sundial.edit;

import X.002;
import X.00y;
import X.05G;
import X.0nA;
import X.0qQ;
import X.2eS;
import X.AnonymousClass00P;
import X.AnonymousClass0fU;
import X.AnonymousClass0r6;
import X.AnonymousClass4DH;
import X.AnonymousClass7TF;
import X.AnonymousClass8YU;
import X.C51966G9m;
import X.C51968G9o;
import X.C63117Krl;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbW;
import X.JTO;
import X.JTP;
import X.JTQ;
import X.LTA;
import X.LY4;
import X.LYT;
import X.MXL;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.text.DecimalFormat;
import java.util.List;

public final class BaselStackedTimelineMiddleActionViewControllerImpl implements MXL {
    public boolean A00 = true;
    public final Context A01;
    public final AnonymousClass4DH A02;
    public final 05G A03 = JTQ.A0r(0);
    public final int A04;
    public final LYT A05 = new LYT(this, 5);
    public final ClipsCreationViewModel A06;
    public IgImageView addClipsFloatingButton;
    public View elementsContainer;
    public TextView fullDurationTimeStampTextView;
    public NestedScrollView nestedScrollView;
    public IgSimpleImageView playButton;
    public TextView playbackTimeStampTextView;
    public IgSimpleImageView redoButton;
    public IgSimpleImageView undoButton;

    public BaselStackedTimelineMiddleActionViewControllerImpl(AnonymousClass4DH r3, ClipsCreationViewModel clipsCreationViewModel, int i) {
        this.A02 = r3;
        this.A06 = clipsCreationViewModel;
        this.A04 = i;
        this.A01 = r3.requireContext();
    }

    private final String A01(String str) {
        int i;
        int i2;
        Object[] A1b;
        Integer A0l;
        Integer A0l2;
        int i3 = 0;
        List A18 = DbV.A18(str, ":");
        if (A18.size() < 2) {
            return null;
        }
        String A1G = C51966G9m.A1G(A18, 0);
        if (A1G == null || (A0l2 = 00y.A0l(A1G)) == null) {
            i = 0;
        } else {
            i = A0l2.intValue();
        }
        String A1G2 = C51966G9m.A1G(A18, 1);
        if (!(A1G2 == null || (A0l = 00y.A0l(A1G2)) == null)) {
            i3 = A0l.intValue();
        }
        Context context = this.A01;
        if (i > 0) {
            i2 = 2131955855;
            A1b = C51968G9o.A1Z(Integer.valueOf(i), i3);
        } else {
            i2 = 2131955856;
            A1b = AnonymousClass7TF.A1b(i3);
        }
        return context.getString(i2, A1b);
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final void FJf(boolean z) {
    }

    public final void FJg(boolean z) {
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

    public static final String A00(int i) {
        int i2 = i / IgNetworkConsentStorage.MAX_ENTRIES;
        String A0g = 002.A0g(DateUtils.formatElapsedTime((long) i2), ":", new DecimalFormat("00").format(Integer.valueOf(((i % IgNetworkConsentStorage.MAX_ENTRIES) * 30) / IgNetworkConsentStorage.MAX_ENTRIES)));
        0qQ.A07(A0g);
        return A0g;
    }

    public final IgSimpleImageView A02() {
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

    public final void Cmc(int i) {
        int i2;
        int i3;
        NestedScrollView nestedScrollView2 = this.nestedScrollView;
        if (nestedScrollView2 != null) {
            i2 = nestedScrollView2.getHeight();
        } else {
            i2 = 0;
        }
        int i4 = i2 - i;
        View view = this.elementsContainer;
        if (view != null) {
            i3 = view.getPaddingTop();
        } else {
            i3 = 0;
        }
        int i5 = i4 + i3;
        View view2 = this.elementsContainer;
        if (view2 != null) {
            if (i5 < 0) {
                i5 = 0;
            }
            view2.setPadding(0, i5, 0, 0);
        }
        if (this.A00) {
            NestedScrollView nestedScrollView3 = this.nestedScrollView;
            if (nestedScrollView3 != null) {
                nestedScrollView3.scrollTo(0, i);
            }
            this.A00 = false;
        }
    }

    public final void Dsw(int i) {
        int i2;
        Context context = this.A01;
        int A002 = C63117Krl.A00(context, JTO.A07(this.A06)) - (this.A04 / 2);
        IgImageView igImageView = this.addClipsFloatingButton;
        if (igImageView != null) {
            i2 = igImageView.getWidth();
        } else {
            i2 = 0;
        }
        float A003 = ((float) (A002 + i2)) + 0nA.A00(context, 22.0f);
        IgImageView igImageView2 = this.addClipsFloatingButton;
        if (igImageView2 != null) {
            float f = A003 - ((float) i);
            if (f > 0.0f) {
                f = 0.0f;
            }
            igImageView2.setTranslationX(f);
        }
    }

    public final AnonymousClass0r6 DtH() {
        return this.A03;
    }

    public final void Ehw(boolean z) {
        IgSimpleImageView igSimpleImageView = this.redoButton;
        if (igSimpleImageView != null) {
            igSimpleImageView.setVisibility(DbW.A01(z ? 1 : 0));
        }
        IgSimpleImageView igSimpleImageView2 = this.redoButton;
        if (igSimpleImageView2 != null) {
            igSimpleImageView2.setEnabled(z);
        }
        Drawable drawable = this.A02.requireContext().getDrawable(R.drawable.instagram_redo_pano_filled_24);
        if (drawable != null) {
            float f = 0.4f;
            if (z) {
                f = 1.0f;
            }
            drawable.setAlpha((int) (f * 255.0f));
        }
        IgSimpleImageView igSimpleImageView3 = this.redoButton;
        if (igSimpleImageView3 != null) {
            igSimpleImageView3.setImageDrawable(drawable);
        }
    }

    public final void EpS(boolean z) {
        IgSimpleImageView igSimpleImageView = this.undoButton;
        if (igSimpleImageView != null) {
            igSimpleImageView.setEnabled(z);
        }
        Drawable drawable = this.A02.requireContext().getDrawable(R.drawable.instagram_undo_pano_filled_24);
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

    public final void onViewCreated(View view, Bundle bundle) {
        if ((view instanceof ViewGroup) && view != null) {
            TextView A0G = DbU.A0G(view, R.id.play_time_stamp);
            0qQ.A0B(A0G, 0);
            this.playbackTimeStampTextView = A0G;
            TextView A0G2 = DbU.A0G(view, R.id.full_duration_time_stamp);
            0qQ.A0B(A0G2, 0);
            this.fullDurationTimeStampTextView = A0G2;
            IgSimpleImageView A0T = JTP.A0T(view, R.id.play_button);
            0qQ.A0B(A0T, 0);
            this.playButton = A0T;
            2eS.A01(A02());
            IgSimpleImageView A0T2 = JTP.A0T(view, R.id.stacked_timeline_undo_button);
            this.undoButton = A0T2;
            if (A0T2 != null) {
                A0T2.setImageResource(R.drawable.instagram_undo_pano_filled_24);
            }
            IgSimpleImageView igSimpleImageView = this.undoButton;
            if (igSimpleImageView != null) {
                LY4.A01(igSimpleImageView, 6, this);
            }
            IgSimpleImageView A0T3 = JTP.A0T(view, R.id.stacked_timeline_redo_button);
            this.redoButton = A0T3;
            if (A0T3 != null) {
                A0T3.setImageResource(R.drawable.instagram_redo_pano_filled_24);
            }
            IgSimpleImageView igSimpleImageView2 = this.redoButton;
            if (igSimpleImageView2 != null) {
                LY4.A01(igSimpleImageView2, 7, this);
            }
            this.addClipsFloatingButton = DbT.A0b(view, R.id.add_clips_button);
            this.nestedScrollView = (NestedScrollView) view.requireViewById(R.id.clips_editor_tracks_nested_scrollview);
            View requireViewById = view.requireViewById(R.id.clips_editor_elements_container);
            requireViewById.addOnLayoutChangeListener(this.A05);
            this.elementsContainer = requireViewById;
        }
    }

    public final void ADd(AnonymousClass8YU r6) {
        IgSimpleImageView A022 = A02();
        int ordinal = r6.ordinal();
        int i = R.drawable.instagram_play_pano_filled_24;
        if (ordinal == 2) {
            i = R.drawable.instagram_pause_pano_filled_24;
        }
        A022.setImageResource(i);
        IgSimpleImageView A023 = A02();
        Context requireContext = this.A02.requireContext();
        int i2 = 2131955588;
        if (ordinal == 2) {
            i2 = 2131955581;
        }
        A023.setContentDescription(requireContext.getText(i2));
    }

    public final void API() {
        A02().setVisibility(0);
        A02().setEnabled(true);
    }

    public final void APl() {
        A02().setVisibility(8);
        A02().setEnabled(false);
    }

    public final void ATc() {
        if (A02().getVisibility() != 0) {
            LTA.A02(A02());
        }
        TextView textView = this.playbackTimeStampTextView;
        if (textView != null) {
            if (textView.getVisibility() != 0) {
                TextView textView2 = this.playbackTimeStampTextView;
                if (textView2 != null) {
                    LTA.A02(textView2);
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("playbackTimeStampTextView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DAv(float f) {
        A02().setAlpha(f);
        TextView textView = this.playbackTimeStampTextView;
        if (textView != null) {
            textView.setAlpha(f);
        } else {
            0qQ.A0F("playbackTimeStampTextView");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void Efs(boolean z) {
        A02().setClickable(z);
    }

    public final void Eft(View.OnClickListener onClickListener) {
        AnonymousClass0fU.A00(onClickListener, A02());
    }

    public final void Eoh(int i, boolean z, int i2) {
        String str;
        String A002 = A00(i);
        String A003 = A00(i2);
        TextView textView = this.playbackTimeStampTextView;
        if (textView != null) {
            textView.setText(A002);
            TextView textView2 = this.fullDurationTimeStampTextView;
            if (textView2 != null) {
                textView2.setText(A003);
                String A0u = DbV.A0u(this.A01, A01(A002), A01(A003), 2131955853);
                0qQ.A07(A0u);
                TextView textView3 = this.playbackTimeStampTextView;
                if (textView3 != null) {
                    textView3.setContentDescription(A0u);
                    TextView textView4 = this.fullDurationTimeStampTextView;
                    if (textView4 != null) {
                        textView4.setContentDescription(A0u);
                        return;
                    }
                }
            }
            str = "fullDurationTimeStampTextView";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        str = "playbackTimeStampTextView";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
