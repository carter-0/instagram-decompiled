package com.instagram.creation.capture.quickcapture.sundial.bottomsheet;

import X.00k;
import X.0qQ;
import X.0sn;
import X.2cs;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C252203oj;
import X.C252243on;
import X.C62562Khs;
import X.C64433Lbo;
import X.C65066Lmk;
import X.C66506MUk;
import X.DbU;
import X.DbW;
import X.JTR;
import X.JTU;
import X.LY4;
import X.MQO;
import X.MXJ;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;
import com.instagram.creation.capture.quickcapture.sundial.bottomsheet.content.BottomSheetView;
import java.util.List;

public final class BottomSheetViewController implements C252243on {
    public float A00;
    public float A01;
    public 2cs A02;
    public MXJ A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final ViewGroup A07;
    public final C66506MUk A08;
    public final MQO A09 = new C65066Lmk(this);
    public final int A0A;
    public final C252203oj A0B;
    public ViewGroup bottomSheetBottomButtonContainer;
    public IgTextView bottomSheetBottomTitle;
    public IgTextView bottomSheetCancelButton;
    public ViewGroup bottomSheetContentContainer;
    public ViewGroup bottomSheetContentView;
    public IgTextView bottomSheetDoneButton;
    public ViewGroup bottomSheetLayout;
    public IgView bottomSheetTopBackButton;
    public ViewGroup bottomSheetTopButtonContainer;
    public IgTextView bottomSheetTopTitle;

    public final void A02() {
        String str;
        if (!this.A04) {
            ViewGroup viewGroup = this.A07;
            if (viewGroup.findViewById(R.id.bottom_sheet) != null) {
                ViewGroup A0C = DbU.A0C(viewGroup, R.id.bottom_sheet);
                0qQ.A0B(A0C, 0);
                this.bottomSheetLayout = A0C;
            } else {
                LayoutInflater from = LayoutInflater.from(this.A06);
                0qQ.A07(from);
                ViewGroup viewGroup2 = (ViewGroup) DbW.A09(from, viewGroup, R.layout.bottom_sheet, false);
                0qQ.A0B(viewGroup2, 0);
                this.bottomSheetLayout = viewGroup2;
                viewGroup.addView(viewGroup2);
            }
            ViewGroup viewGroup3 = this.bottomSheetLayout;
            if (viewGroup3 != null) {
                0qQ.A0C(viewGroup3, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.sundial.bottomsheet.content.BottomSheetView");
                ((BottomSheetView) viewGroup3).A04 = this.A09;
                ViewGroup A0C2 = DbU.A0C(viewGroup, R.id.bottom_sheet_content_container);
                0qQ.A0B(A0C2, 0);
                this.bottomSheetContentContainer = A0C2;
                ViewGroup A0C3 = DbU.A0C(viewGroup, R.id.bottom_sheet_content_view);
                0qQ.A0B(A0C3, 0);
                this.bottomSheetContentView = A0C3;
                ViewGroup A0C4 = DbU.A0C(viewGroup, R.id.bottom_sheet_bottom_button_container);
                0qQ.A0B(A0C4, 0);
                this.bottomSheetBottomButtonContainer = A0C4;
                ViewGroup A0C5 = DbU.A0C(viewGroup, R.id.bottom_sheet_top_button_container);
                0qQ.A0B(A0C5, 0);
                this.bottomSheetTopButtonContainer = A0C5;
                int intValue = this.A08.BVY().intValue();
                ViewGroup viewGroup4 = this.bottomSheetBottomButtonContainer;
                if (intValue != 0) {
                    if (viewGroup4 != null) {
                        viewGroup4.setVisibility(0);
                        ViewGroup viewGroup5 = this.bottomSheetTopButtonContainer;
                        if (viewGroup5 != null) {
                            viewGroup5.setVisibility(8);
                        }
                        str = "bottomSheetTopButtonContainer";
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    str = "bottomSheetBottomButtonContainer";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(8);
                    ViewGroup viewGroup6 = this.bottomSheetTopButtonContainer;
                    if (viewGroup6 != null) {
                        viewGroup6.setVisibility(0);
                    }
                    str = "bottomSheetTopButtonContainer";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                str = "bottomSheetBottomButtonContainer";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
                IgTextView A0h = JTR.A0h(viewGroup, R.id.bottom_sheet_cancel_button);
                this.bottomSheetCancelButton = A0h;
                A0h.setMaxLines(1);
                CharSequence text = A0h.getContext().getText(2131954722);
                TextView.BufferType bufferType = TextView.BufferType.NORMAL;
                A0h.setText(text, bufferType);
                LY4.A01(A0h, 4, this);
                IgTextView A0h2 = JTR.A0h(viewGroup, R.id.bottom_sheet_done_button);
                this.bottomSheetDoneButton = A0h2;
                A0h2.setMaxLines(1);
                A0h2.setText(A0h2.getContext().getText(2131960992), bufferType);
                LY4.A01(A0h2, 5, this);
                this.bottomSheetBottomTitle = JTR.A0h(viewGroup, R.id.bottom_sheet_title);
                this.bottomSheetTopTitle = JTR.A0h(viewGroup, R.id.bottom_sheet_top_title);
                IgView igView = (IgView) viewGroup.requireViewById(R.id.bottom_sheet_back_button);
                0qQ.A0B(igView, 0);
                this.bottomSheetTopBackButton = igView;
                this.A04 = true;
            }
            str = "bottomSheetLayout";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A05 = true;
        String title = this.A08.getTitle();
        IgTextView igTextView = this.bottomSheetBottomTitle;
        if (igTextView != null) {
            TextView.BufferType bufferType2 = TextView.BufferType.NORMAL;
            igTextView.setText(title, bufferType2);
            IgTextView igTextView2 = this.bottomSheetTopTitle;
            if (igTextView2 != null) {
                igTextView2.setText(title, bufferType2);
                MXJ mxj = this.A03;
                if (mxj != null) {
                    ViewGroup viewGroup7 = this.bottomSheetContentView;
                    if (viewGroup7 != null) {
                        mxj.CN3(viewGroup7);
                    } else {
                        str = "bottomSheetContentView";
                    }
                }
                C62562Khs A002 = A00(this);
                ViewGroup viewGroup8 = this.bottomSheetLayout;
                if (viewGroup8 != null) {
                    ViewGroup.LayoutParams layoutParams = viewGroup8.getLayoutParams();
                    if (layoutParams != null) {
                        float f = A002.A00;
                        layoutParams.height = (int) (((float) this.A0A) * f);
                        viewGroup8.setLayoutParams(layoutParams);
                        2cs r2 = this.A02;
                        r2.A06 = AnonymousClass7TF.A1Q((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)));
                        r2.A06((double) f);
                        return;
                    }
                    throw AnonymousClass7TE.A11(AnonymousClass000.A00(49));
                }
                str = "bottomSheetLayout";
            } else {
                str = "bottomSheetTopTitle";
            }
        } else {
            str = "bottomSheetBottomTitle";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A03(boolean z) {
        this.A05 = false;
        ViewGroup viewGroup = this.bottomSheetLayout;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            2cs r3 = this.A02;
            if (z) {
                r3.A06 = true;
                r3.A06(0.0d);
                return;
            }
            r3.A08(0.0d, true);
        }
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
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

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final List A01(BottomSheetViewController bottomSheetViewController) {
        List Bdz;
        MXJ mxj = bottomSheetViewController.A03;
        if (mxj == null || (Bdz = mxj.Bdz()) == null) {
            return 0sn.A00;
        }
        return Bdz;
    }

    public BottomSheetViewController(Context context, ViewGroup viewGroup, C66506MUk mUk) {
        this.A06 = context;
        this.A07 = viewGroup;
        this.A08 = mUk;
        this.A0A = viewGroup.getHeight();
        C64433Lbo lbo = new C64433Lbo(this, 0);
        this.A0B = lbo;
        2cs A0J = AnonymousClass7TF.A0J();
        JTU.A18(A0J, lbo);
        this.A02 = A0J;
    }

    public static final C62562Khs A00(BottomSheetViewController bottomSheetViewController) {
        if (A01(bottomSheetViewController).size() == 1) {
            List A012 = A01(bottomSheetViewController);
            C62562Khs khs = C62562Khs.PEEK;
            if (A012.contains(khs)) {
                return khs;
            }
        }
        if (A01(bottomSheetViewController).size() == 1) {
            return (C62562Khs) 00k.A0I(A01(bottomSheetViewController));
        }
        return C62562Khs.DEFAULT;
    }
}
