package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.Lgg  reason: case insensitive filesystem */
public final class C64708Lgg implements C252243on, SeekBar.OnSeekBarChangeListener {
    public float A00 = 1.0f;
    public long A01;
    public ValueAnimator A02;
    public Integer A03;
    public final Context A04;
    public final UserSession A05;
    public final TargetViewSizeProvider A06;
    public final ClipsStackedTimelineViewController A07;
    public final ClipsCreationViewModel A08;
    public final AnonymousClass8RF A09;
    public final C60108Jfo A0A;
    public final HashMap A0B = AnonymousClass7TE.A1E();
    public final AnonymousClass861 A0C;

    public C64708Lgg(Context context, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, ClipsStackedTimelineViewController clipsStackedTimelineViewController, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass8RF r7, C60108Jfo jfo, AnonymousClass861 r9) {
        0qQ.A0B(userSession, 1);
        this.A05 = userSession;
        this.A07 = clipsStackedTimelineViewController;
        this.A08 = clipsCreationViewModel;
        this.A09 = r7;
        this.A0C = r9;
        this.A0A = jfo;
        this.A04 = context;
        this.A06 = targetViewSizeProvider;
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

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    private final float A00(float f, int i) {
        AnonymousClass51M A0f;
        AnonymousClass51M A0f2;
        double pow;
        double d;
        AnonymousClass51M A0f3;
        AnonymousClass51M A0f4;
        ClipsCreationViewModel clipsCreationViewModel = this.A08;
        AnonymousClass2gB r3 = clipsCreationViewModel.A0G;
        AnonymousClass831 A0h = JTO.A0h(r3);
        if (!(A0h == null || (A0f3 = JTO.A0f(A0h, i)) == null)) {
            if ((JTO.A07(clipsCreationViewModel) - JTP.A08(A0f3)) + C63168Ksb.A00(A0f3, f) > clipsCreationViewModel.A0E()) {
                AnonymousClass831 A0h2 = JTO.A0h(r3);
                if (A0h2 == null || (A0f4 = JTO.A0f(A0h2, i)) == null) {
                    return 1.0f;
                }
                float A002 = ((float) C63168Ksb.A00(A0f4, 1.0f)) / ((float) ((clipsCreationViewModel.A0E() - JTO.A07(clipsCreationViewModel)) + JTP.A08(A0f4)));
                if (A002 < 0.1f) {
                    A002 = 0.1f;
                }
                pow = Math.pow(10.0d, 1.0d);
                d = Math.ceil(((double) A002) * pow);
                return ((float) ((int) d)) / ((float) pow);
            }
        }
        AnonymousClass831 A0h3 = JTO.A0h(r3);
        if (A0h3 == null || (A0f = JTO.A0f(A0h3, i)) == null || C63168Ksb.A00(A0f, f) >= 100) {
            return f;
        }
        AnonymousClass831 A0h4 = JTO.A0h(r3);
        if (A0h4 == null || (A0f2 = JTO.A0f(A0h4, i)) == null) {
            return 1.0f;
        }
        float A003 = ((float) C63168Ksb.A00(A0f2, 1.0f)) / 100.0f;
        if (A003 > 10.0f) {
            A003 = 10.0f;
        }
        pow = Math.pow(10.0d, 1.0d);
        d = ((double) A003) * pow;
        return ((float) ((int) d)) / ((float) pow);
    }

    private final float A01(int i) {
        AnonymousClass886 r0;
        float f = (float) i;
        if (f >= 90.0f + 1.0f) {
            return (((f - 90.0f) / 1.0f) * 0.1f) + 1.0f;
        }
        if (f <= 9.0f) {
            r0 = AnonymousClass886.A0E;
        } else if (f <= 90.0f - 9.0f) {
            return f / 90.0f;
        } else {
            r0 = AnonymousClass886.A09;
        }
        return r0.A00;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            AnonymousClass8RH A0E = this.A09.A0E();
            SeekBar seekBar2 = seekBar;
            if (seekBar != null && (A0E instanceof AnonymousClass8RW)) {
                int i2 = ((AnonymousClass8RW) A0E).A00;
                float A012 = A01(seekBar2.getProgress());
                float A002 = A00(A012, i2);
                this.A07.A0T(A012);
                if (A002 != this.A00) {
                    C60108Jfo jfo = this.A0A;
                    Context context = this.A04;
                    int i3 = ((NineSixteenLayoutConfigImpl) this.A06).A06 / 2;
                    ClipsCreationViewModel clipsCreationViewModel = jfo.A0E;
                    AnonymousClass831 A0K = JTQ.A0K(clipsCreationViewModel);
                    if (A0K != null) {
                        ArrayList A1D = AnonymousClass7TE.A1D(A0K.A05());
                        if (i2 < A1D.size()) {
                            AnonymousClass51M r15 = (AnonymousClass51M) A1D.get(i2);
                            int A082 = JTP.A08(r15);
                            int A003 = C63168Ksb.A00((AnonymousClass51M) A1D.get(i2), A002);
                            double d = (double) A003;
                            double d2 = (double) A082;
                            A1D.set(i2, AnonymousClass51M.A00((GTT) null, (AnonymousClass51M) A1D.get(i2), (AnonymousClass51R) null, A002, (int) ((((double) r15.A09) * d) / d2), (int) ((((double) r15.A08) * d) / d2), 0, 0, 1073741795));
                            jfo.A0R(context, (AnonymousClass8RH) null, A1D, i3, false, false);
                            jfo.A0Z.Epw(new C61065Jw3(AnonymousClass05K.A01, (JTO.A07(clipsCreationViewModel) - A082) + A003, JTO.A07(clipsCreationViewModel), 7));
                            if (jfo.A0F.A0E() instanceof AnonymousClass8RW) {
                                C66164MGb.A00(jfo, C318116oQ.A00(jfo), A003, 11);
                            }
                            int i4 = A003 - A082;
                            jfo.A0J.A0V(i4, JTO.A07(clipsCreationViewModel), false, true, true);
                            jfo.A0H.A0P(i4, JTO.A07(clipsCreationViewModel), false);
                            jfo.A0I.A0P(i4, JTO.A07(clipsCreationViewModel), false);
                        }
                    }
                    if (A002 == 1.0f) {
                        seekBar2.performHapticFeedback(1);
                    }
                    this.A00 = A002;
                    return;
                }
                return;
            }
            return;
        }
        this.A07.A0T(A01(i));
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        AnonymousClass831 A0K;
        AnonymousClass51O A042;
        ValueAnimator valueAnimator = this.A02;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C60108Jfo jfo = this.A0A;
        AnonymousClass8RH A0E = jfo.A0F.A0E();
        if (!(!(A0E instanceof AnonymousClass8RW) || (A0K = JTQ.A0K(jfo.A0E)) == null || (A042 = A0K.A04(((AnonymousClass8RW) A0E).A00)) == null)) {
            MHN.A03(A042, jfo, C318116oQ.A00(jfo), 9);
        }
        05G r5 = jfo.A0Z;
        Integer num = AnonymousClass05K.A00;
        ClipsCreationViewModel clipsCreationViewModel = jfo.A0E;
        r5.Epw(new C61065Jw3(num, JTO.A07(clipsCreationViewModel), JTO.A07(clipsCreationViewModel), 7));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        r2 = ((X.AnonymousClass8RW) r1).A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStopTrackingTouch(android.widget.SeekBar r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x0069
            float r3 = r8.A00
            r2 = 90
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x012f
            r0 = 1091567616(0x41100000, float:9.0)
            float r3 = r3 - r1
            float r3 = r3 / r0
            r0 = 1119092736(0x42b40000, float:90.0)
            float r3 = r3 * r0
            float r3 = r3 + r0
        L_0x0014:
            int r2 = (int) r3
        L_0x0015:
            int r0 = r9.getProgress()
            if (r0 == r2) goto L_0x0069
            int r0 = r9.getProgress()
            float r3 = r8.A01(r0)
            float r0 = r8.A00
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0069
            android.animation.ValueAnimator r0 = r8.A02
            if (r0 == 0) goto L_0x0030
            r0.cancel()
        L_0x0030:
            r5 = 0
            int r0 = r9.getProgress()
            r4 = 1
            android.animation.ValueAnimator r2 = X.JTQ.A05(r0, r2)
            r0 = 8
            X.C64205LTv.A01(r2, r9, r0)
            r0 = 150(0x96, double:7.4E-322)
            r2.setDuration(r0)
            r8.A02 = r2
            r2.start()
            float r0 = r8.A00
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x012b
            java.lang.Integer r3 = X.AnonymousClass05K.A01
        L_0x0051:
            X.Dc2 r0 = X.LRJ.A01
            if (r0 == 0) goto L_0x00e6
            long r6 = java.lang.System.currentTimeMillis()
            long r0 = r8.A01
            long r6 = r6 - r0
            int r0 = X.Dc5.A01()
            long r1 = (long) r0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00e6
            java.lang.Integer r0 = r8.A03
            if (r0 != r3) goto L_0x00e6
        L_0x0069:
            X.8RF r0 = r8.A09
            X.8RH r1 = r0.A0E()
            boolean r0 = r1 instanceof X.AnonymousClass8RW
            if (r0 == 0) goto L_0x00e1
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r3 = r8.A08
            X.831 r0 = X.JTQ.A0K(r3)
            if (r0 == 0) goto L_0x009e
            X.8RW r1 = (X.AnonymousClass8RW) r1
            int r2 = r1.A00
            X.51M r0 = X.JTO.A0f(r0, r2)
            if (r0 == 0) goto L_0x009e
            float r0 = r0.A00
            float r0 = java.lang.Math.abs(r0)
            float r1 = r8.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00d6
            X.Jfo r1 = r8.A0A
        L_0x0093:
            int r0 = X.JTO.A07(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0T(r0)
        L_0x009e:
            com.instagram.common.session.UserSession r0 = r8.A05
            X.27r r1 = X.27p.A01(r0)
            float r0 = r8.A00
            double r3 = (double) r0
            X.29R r5 = r1.A09
            X.4yP r1 = r5.A0J()
            X.0wc r0 = r5.A02
            X.1Ln r2 = X.1Ln.A08(r0)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x00d5
            if (r1 == 0) goto L_0x00d5
            X.JTO.A1V(r2)
            java.lang.String r0 = "TIMELINE_SPEED_SLIDER"
            r2.A0r(r0)
            X.29R.A00(r2, r5)
            X.JTT.A1D(r2, r1, r5)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            java.lang.String r0 = "speed_value"
            r2.A0P(r0, r1)
            r2.Cgf()
        L_0x00d5:
            return
        L_0x00d6:
            X.Jfo r0 = r8.A0A
            r0.A0M(r1)
            float r0 = r8.A00
            A02(r8, r0, r2)
            goto L_0x009e
        L_0x00e1:
            X.Jfo r1 = r8.A0A
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r3 = r8.A08
            goto L_0x0093
        L_0x00e6:
            X.LRJ.A00()
            r0 = 0
            r8.A01 = r0
            android.content.Context r2 = r8.A04
            int r0 = r3.intValue()
            r1 = 2131955848(0x7f131088, float:1.9548235E38)
            if (r0 == r5) goto L_0x00fb
            r1 = 2131955847(0x7f131087, float:1.9548233E38)
        L_0x00fb:
            float r0 = r8.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.String r0 = X.DbY.A0c(r2, r0, r1)
            X.6ap r1 = X.DbV.A0X()
            r1.A0D = r0
            int r0 = X.LRJ.A00
            int r0 = r0 + 8
            r1.A02 = r0
            r1.A0R = r4
            X.MVB r0 = X.LRJ.A03
            r1.A0A(r0)
            X.Dc2 r0 = r1.A00()
            X.DbX.A1S(r0)
            X.LRJ.A01 = r0
            r8.A03 = r3
            long r0 = java.lang.System.currentTimeMillis()
            r8.A01 = r0
            goto L_0x0069
        L_0x012b:
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            goto L_0x0051
        L_0x012f:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0015
            r0 = 1119092736(0x42b40000, float:90.0)
            float r3 = r3 * r0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64708Lgg.onStopTrackingTouch(android.widget.SeekBar):void");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ClipsStackedTimelineViewController clipsStackedTimelineViewController = this.A07;
        AnonymousClass0fU.A00(LY4.A00(this, 58), clipsStackedTimelineViewController.A0P().getSpeedDoneButton());
        ClipsTimelineActionBarViewController.A01(LY4.A00(this, 59), C62636KjH.A0Y, clipsStackedTimelineViewController.A0C);
        clipsStackedTimelineViewController.A0P().getSpeedSlider().setOnSeekBarChangeListener(this);
        clipsStackedTimelineViewController.A0P().getSpeedSlider().setMax(180);
    }

    public static final void A02(C64708Lgg lgg, float f, int i) {
        float A002 = lgg.A00(f, i);
        ClipsCreationViewModel clipsCreationViewModel = lgg.A08;
        Float valueOf = Float.valueOf(A002);
        AnonymousClass836 r1 = clipsCreationViewModel.A0O;
        0qQ.A0A(valueOf);
        int A0E = clipsCreationViewModel.A0E() - JTO.A07(clipsCreationViewModel);
        05G r10 = r1.A02;
        AnonymousClass51N r12 = (AnonymousClass51N) ((AnonymousClass831) r10.getValue()).A04(i);
        if (r12 != null && (r12 instanceof AnonymousClass51M)) {
            AnonymousClass51M A012 = AnonymousClass51M.A00((GTT) null, (AnonymousClass51M) r12, (AnonymousClass51R) null, 0.0f, 0, 0, 0, 0, 1073741823);
            if (Math.abs(A012.A00) != A002) {
                int A082 = JTP.A08(A012);
                int A003 = C63168Ksb.A00(A012, A002);
                if (A003 >= 100) {
                    int i2 = (A0E - A003) + A082;
                    double d = (double) A003;
                    double d2 = (double) A082;
                    int i3 = (int) ((((double) A012.A09) * d) / d2);
                    int i4 = (int) ((((double) A012.A08) * d) / d2);
                    if (i2 > 0) {
                        i2 = 0;
                    }
                    A012.A0G(A002);
                    A012.A09 = i3;
                    A012.A08 = i4 + i2;
                    r10.Epw(LSY.A02(A012, (AnonymousClass831) r10.getValue(), i));
                    AnonymousClass51M A0f = JTO.A0f(ClipsCreationViewModel.A00(clipsCreationViewModel), i);
                    2Nn r2 = clipsCreationViewModel.A0R;
                    if (r2.A02() && A0f != null) {
                        AnonymousClass51R r0 = A0f.A0F;
                        0qQ.A0B(r0, 0);
                        try {
                            JTR.A1O(C39907AIy.A01(r2, AnonymousClass7TE.A0t(r0.A0F), "adjusted"));
                        } catch (IOException unused) {
                        }
                        AnonymousClass833.A00(A0f, r2);
                    }
                }
            }
        }
    }
}
