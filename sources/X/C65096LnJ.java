package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.Collection;
import java.util.List;

/* renamed from: X.LnJ  reason: case insensitive filesystem */
public final class C65096LnJ implements C66544MVy {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ KMU A01;

    public final void DP9(Integer num, int i, int i2) {
        0qQ.A0B(num, 2);
        KMU kmu = this.A01;
        if (kmu.A0G.A0E() instanceof C355708Ra) {
            C61805KMt kMt = kmu.A0H;
            kMt.A0F();
            if (num.intValue() == 1) {
                int i3 = kmu.A05;
                LTY lty = kMt.A01;
                lty.A0Q(i3, JTS.A03(lty), false);
                kMt.A0I(i3);
                String A0N = kMt.A0N();
                Integer[] numArr = kmu.A0B.A02;
                kMt.A0U(i3, JTO.A0A(numArr, 0), JTO.A0A(numArr, 1), false, true, true);
                if (A0N != null) {
                    KMU.A05(kmu, A0N);
                }
                27r A012 = 27p.A01(kmu.A09);
                ClipsCreationViewModel clipsCreationViewModel = kmu.A0F;
                int A02 = clipsCreationViewModel.A0K.A02(false);
                Integer valueOf = Integer.valueOf(A02);
                boolean A0m = clipsCreationViewModel.A0m();
                if (A012.A0J() != null) {
                    if (valueOf != null) {
                        27r.A06(C59725JVj.POST_CAPTURE, A012, "TIMELINE_TIMED_ELEMENT_HORIZONTAL_DRAG", A02, A0m);
                    } else {
                        27r.A0C(A012, "TIMELINE_TIMED_ELEMENT_HORIZONTAL_DRAG");
                    }
                }
            }
        }
        kmu.A0I.A0W(0sn.A00);
    }

    public final /* synthetic */ void DPB(MotionEvent motionEvent) {
    }

    public final /* synthetic */ void DlW(int i, int i2) {
    }

    public final /* synthetic */ void DlX() {
    }

    public final /* synthetic */ void DlY(int i, int i2, float f) {
    }

    public final /* synthetic */ void Dqh(MotionEvent motionEvent) {
    }

    public final /* synthetic */ void DsS(MotionEvent motionEvent, boolean z, boolean z2) {
    }

    public final void DuC(Integer num, int i, int i2) {
        int i3;
        boolean z;
        0eP r2;
        C59725JVj jVj;
        String str;
        0eP r0;
        Integer num2 = num;
        0qQ.A0B(num2, 2);
        KMU kmu = this.A01;
        kmu.A0I.A0W(0sn.A00);
        kmu.A02 = false;
        C61805KMt kMt = kmu.A0H;
        String A0N = kMt.A0N();
        AudioOverlayTrack A03 = kMt.A04.A0K.A03(A0N);
        C64163LRe lRe = kmu.A0B;
        Integer[] numArr = lRe.A02;
        int A0A = JTO.A0A(numArr, 0);
        int i4 = 0;
        if (A03 != null) {
            if (num2 == AnonymousClass05K.A00) {
                i4 = A0A - A03.A04;
            }
            i3 = A03.A03 + i4;
        } else {
            i3 = 0;
        }
        Integer num3 = AnonymousClass05K.A00;
        if ((num2 == num3 && (r0 = lRe.A00) != null && A0A == C51970G9q.A0B(r0)) || (num2 == AnonymousClass05K.A01 && (r2 = lRe.A00) != null && JTO.A0A(numArr, 1) == C51969G9p.A0A(r2))) {
            z = true;
        } else {
            z = false;
        }
        kMt.A0U(kmu.A05, JTO.A0A(numArr, 0), JTO.A0A(numArr, 1), false, AnonymousClass7TF.A1W(num2, num3), false);
        if (A0N != null) {
            KMU.A05(kmu, A0N);
        }
        KMU.A03(kmu, i3);
        27r A012 = 27p.A01(kmu.A09);
        ClipsCreationViewModel clipsCreationViewModel = kmu.A0F;
        int A02 = clipsCreationViewModel.A0K.A02(false);
        boolean A0m = clipsCreationViewModel.A0m();
        C279294yP A0J = A012.A0J();
        if (z) {
            if (A0J != null) {
                jVj = C59725JVj.POST_CAPTURE;
                str = "TIMELINE_AUDIO_TRIM_UNCHANGED";
            } else {
                return;
            }
        } else if (A0J != null) {
            jVj = C59725JVj.POST_CAPTURE;
            str = "TIMELINE_AUDIO_TRIM_SUCCESS";
        } else {
            return;
        }
        27r.A07(jVj, A012, str, A02, A0m);
    }

    public final void DuE(Integer num, float f, int i, int i2) {
        0qQ.A0B(num, 2);
        KMU kmu = this.A01;
        kmu.A0B.A03(num, MMB.A00(kmu, 9), C66291MMa.A00(num, kmu, 6), f, i, i2, true);
    }

    public C65096LnJ(RecyclerView recyclerView, KMU kmu) {
        this.A00 = recyclerView;
        this.A01 = kmu;
    }

    public final void DP3(int i) {
        KMU kmu = this.A01;
        List<L40> list = kmu.A0D.A01;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (L40 l40 : list) {
                if ((l40 instanceof KMF) && ((KMF) l40).A04.A0A == AnonymousClass05K.A0j) {
                    return;
                }
            }
        }
        if (kmu.A0R()) {
            kmu.A0D();
            AnonymousClass8RF r2 = kmu.A0G;
            C61805KMt kMt = kmu.A0H;
            LTY lty = kMt.A01;
            r2.A0G(new C355708Ra(JTS.A03(lty)));
            if (C51966G9m.A1a(lty.A04, LTY.A0C) && kmu.A05 != JTR.A0E(lty)) {
                kMt.A0H();
            }
            int i2 = kmu.A05;
            lty.A0Q(i2, (i - 2) / 2, true);
            kMt.A0I(i2);
            KMU.A02(kmu);
        }
    }

    public final void DPA(int i, int i2, float f) {
        KMU kmu = this.A01;
        if (kmu.A0G.A0E() instanceof C355708Ra) {
            kmu.A0B.A05(MKI.A00, MMB.A00(kmu, 8), f, i, i2);
        }
    }

    public final void DuG(Integer num) {
        KMU kmu = this.A01;
        C61194Jyn A0F = kmu.A0H.A01.A0F();
        if (A0F != null) {
            kmu.A0B.A00 = AnonymousClass7TF.A0x(Integer.valueOf(A0F.A04), A0F.A03);
        }
        kmu.A02 = true;
        KMU.A02(kmu);
        27r A012 = 27p.A01(kmu.A09);
        ClipsCreationViewModel clipsCreationViewModel = kmu.A0F;
        int A02 = clipsCreationViewModel.A0K.A02(false);
        boolean A0m = clipsCreationViewModel.A0m();
        if (A012.A0J() != null) {
            27r.A07(C59725JVj.POST_CAPTURE, A012, "TIMELINE_AUDIO_TRIM", A02, A0m);
        }
    }

    public final void EKX(int i) {
        int i2 = -i;
        this.A00.scrollBy(i2, 0);
        KMU kmu = this.A01;
        kmu.A0I.A0S(kmu.A0C, i2, kmu.A05);
    }

    public final void Cx4(int i) {
        EKX(i);
    }

    public final void DP4(MotionEvent motionEvent, int i) {
        DP3(i);
    }
}
