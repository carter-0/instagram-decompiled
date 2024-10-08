package com.instagram.creation.capture.quickcapture.sundial.edit;

import X.00k;
import X.0Tu;
import X.0qQ;
import X.0sn;
import X.182;
import X.2cs;
import X.AnonymousClass00P;
import X.AnonymousClass37Q;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass8II;
import X.AnonymousClass8RF;
import X.C252203oj;
import X.C252243on;
import X.C51972G9s;
import X.C60105Jfl;
import X.C62578KiB;
import X.C65069Lmp;
import X.C71492dQ;
import X.DbT;
import X.DbU;
import X.JTP;
import X.JTR;
import X.JTU;
import X.LY4;
import X.MQP;
import X.MXK;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

public final class ClipsTimelineBottomSheetViewController implements C252243on, C252203oj {
    public float A00;
    public float A01;
    public float A02;
    public ViewGroup A03;
    public ViewGroup A04;
    public 2cs A05;
    public IgTextView A06;
    public MXK A07;
    public List A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final ViewGroup A0C;
    public final UserSession A0D;
    public final AnonymousClass8II A0E;
    public final C60105Jfl A0F;
    public final AnonymousClass8RF A0G;
    public final boolean A0H;
    public final MQP A0I = new C65069Lmp(this);
    public IgTextView bottomSheetCancelButton;
    public ViewGroup bottomSheetContentContainer;
    public IgTextView bottomSheetDoneButton;

    public final void A03(boolean z) {
        A02(this, false);
        ViewGroup viewGroup = this.A04;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            A01(this, 0.0f, z);
        }
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r0.contains(r5) != false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C62578KiB A00(com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController r6, float r7) {
        /*
            java.util.List r0 = r6.A08
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L_0x0014
            java.util.List r0 = r6.A08
            X.KiB r5 = X.C62578KiB.PEEK
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x0014
        L_0x0013:
            return r5
        L_0x0014:
            java.util.List r0 = r6.A08
            int r0 = r0.size()
            if (r0 != r1) goto L_0x0027
            java.util.List r0 = r6.A08
            X.KiB r5 = X.C62578KiB.FULLY_REVEALED
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x0027
            return r5
        L_0x0027:
            X.KiB r5 = X.C62578KiB.VIDEO_PREVIEW_LARGE
            boolean r4 = r6.A0H
            r3 = 1053961486(0x3ed22d0e, float:0.4105)
            if (r4 == 0) goto L_0x0033
            r3 = 1050924810(0x3ea3d70a, float:0.32)
        L_0x0033:
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0013
            X.KiB r2 = X.C62578KiB.VIDEO_PREVIEW_SMALL
            r1 = 1057565232(0x3f092a30, float:0.5358)
            if (r4 == 0) goto L_0x0041
            r1 = 1053961486(0x3ed22d0e, float:0.4105)
        L_0x0041:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0046
            return r2
        L_0x0046:
            float r1 = r1 + r3
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0013
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController.A00(com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController, float):X.KiB");
    }

    public static final void A01(ClipsTimelineBottomSheetViewController clipsTimelineBottomSheetViewController, float f, boolean z) {
        2cs r2 = clipsTimelineBottomSheetViewController.A05;
        if (z) {
            r2.A06 = AnonymousClass7TF.A1Q((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)));
            r2.A06((double) f);
            return;
        }
        JTP.A1K(r2, f);
    }

    public static final void A02(ClipsTimelineBottomSheetViewController clipsTimelineBottomSheetViewController, boolean z) {
        ViewGroup viewGroup;
        ClipsTimelineBottomSheetView clipsTimelineBottomSheetView;
        if (!clipsTimelineBottomSheetViewController.A09) {
            ViewGroup viewGroup2 = clipsTimelineBottomSheetViewController.A0C;
            if (viewGroup2.findViewById(R.id.stacked_timeline_bottom_sheet) != null) {
                clipsTimelineBottomSheetViewController.A04 = DbU.A0C(viewGroup2, R.id.stacked_timeline_bottom_sheet);
            } else {
                LayoutInflater from = LayoutInflater.from(clipsTimelineBottomSheetViewController.A0B);
                0qQ.A07(from);
                View inflate = from.inflate(R.layout.stacked_timeline_bottom_sheet, viewGroup2, false);
                if (inflate instanceof ViewGroup) {
                    viewGroup = (ViewGroup) inflate;
                } else {
                    viewGroup = null;
                }
                clipsTimelineBottomSheetViewController.A04 = viewGroup;
                viewGroup2.addView(viewGroup);
            }
            ViewGroup viewGroup3 = clipsTimelineBottomSheetViewController.A04;
            if ((viewGroup3 instanceof ClipsTimelineBottomSheetView) && (clipsTimelineBottomSheetView = (ClipsTimelineBottomSheetView) viewGroup3) != null) {
                clipsTimelineBottomSheetView.A05 = clipsTimelineBottomSheetViewController.A0I;
            }
            ViewGroup A0C2 = DbU.A0C(viewGroup2, R.id.stacked_timeline_bottom_sheet_content_container);
            0qQ.A0B(A0C2, 0);
            clipsTimelineBottomSheetViewController.bottomSheetContentContainer = A0C2;
            clipsTimelineBottomSheetViewController.A03 = DbU.A0C(viewGroup2, R.id.stacked_timeline_bottom_sheet_content_view);
            IgTextView A0h = JTR.A0h(viewGroup2, R.id.stacked_timeline_bottom_sheet_cancel_button);
            clipsTimelineBottomSheetViewController.bottomSheetCancelButton = A0h;
            A0h.setMaxLines(1);
            CharSequence text = A0h.getContext().getText(2131954722);
            TextView.BufferType bufferType = TextView.BufferType.NORMAL;
            A0h.setText(text, bufferType);
            LY4.A01(A0h, 52, clipsTimelineBottomSheetViewController);
            A0h.setVisibility(0);
            IgTextView A0h2 = JTR.A0h(viewGroup2, R.id.stacked_timeline_bottom_sheet_done_button);
            clipsTimelineBottomSheetViewController.bottomSheetDoneButton = A0h2;
            A0h2.setMaxLines(1);
            A0h2.setText(A0h2.getContext().getText(2131960992), bufferType);
            LY4.A01(A0h2, 53, clipsTimelineBottomSheetViewController);
            A0h2.setVisibility(0);
            clipsTimelineBottomSheetViewController.A06 = DbT.A0a(viewGroup2, R.id.stacked_timeline_bottom_sheet_title);
            clipsTimelineBottomSheetViewController.A09 = true;
            if (!z) {
                clipsTimelineBottomSheetViewController.A03(false);
            }
        }
    }

    public final void DmE(2cs r14) {
        ViewGroup viewGroup;
        float f;
        if (this.A09 && (viewGroup = this.A04) != null) {
            double d = this.A05.A09.A00;
            int i = 0;
            if (d == 0.0d) {
                i = 4;
            }
            viewGroup.setVisibility(i);
            ViewGroup viewGroup2 = this.A0C;
            float A022 = (float) AnonymousClass37Q.A02(d, (double) viewGroup2.getHeight());
            int A052 = JTP.A05(this.A0B.getResources());
            int height = (int) ((((double) viewGroup2.getHeight()) * d) - ((double) A052));
            C62578KiB kiB = (C62578KiB) 00k.A0J(this.A08);
            if (kiB != null) {
                float A032 = AnonymousClass7TE.A03(viewGroup2);
                if (this.A0H) {
                    f = kiB.A01;
                } else {
                    f = kiB.A00;
                }
                int i2 = (int) ((A032 * f) - ((float) A052));
                if (height < i2) {
                    height = i2;
                }
            }
            C71492dQ r3 = new C71492dQ(-1, height);
            ViewGroup viewGroup3 = this.bottomSheetContentContainer;
            if (viewGroup3 != null) {
                viewGroup3.setLayoutParams(r3);
                ViewGroup viewGroup4 = this.A04;
                if (viewGroup4 != null) {
                    viewGroup4.setTranslationY((float) ((int) A022));
                }
                if (d == 0.0d) {
                    MXK mxk = this.A07;
                    if (mxk != null) {
                        mxk.Cyv();
                    }
                    this.A0F.A0E();
                    return;
                }
                return;
            }
            0qQ.A0F("bottomSheetContentContainer");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void onPause() {
        MXK mxk = this.A07;
        if (mxk != null) {
            mxk.onPause();
        }
    }

    public final void onResume() {
        MXK mxk = this.A07;
        if (mxk != null) {
            mxk.onResume();
        }
    }

    public ClipsTimelineBottomSheetViewController(Context context, ViewGroup viewGroup, UserSession userSession, AnonymousClass8II r7, C60105Jfl jfl, AnonymousClass8RF r9) {
        C51972G9s.A1D(userSession, jfl);
        this.A0B = context;
        this.A0C = viewGroup;
        this.A0D = userSession;
        this.A0F = jfl;
        this.A0G = r9;
        this.A0E = r7;
        this.A0H = 182.A06(0Tu.A06, userSession, 36320043047002007L);
        2cs A0J = AnonymousClass7TF.A0J();
        JTU.A18(A0J, this);
        this.A05 = A0J;
        this.A08 = 0sn.A00;
    }
}
