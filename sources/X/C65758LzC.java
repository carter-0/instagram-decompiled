package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LzC  reason: case insensitive filesystem */
public final class C65758LzC implements C234382xm {
    public final /* synthetic */ ClipsStackedTimelineFragment A00;

    public final boolean Dgn(C253913rc r21) {
        Integer num;
        String str;
        float f;
        float f2;
        C253913rc r1 = r21;
        0qQ.A0B(r1, 0);
        L41 l41 = this.A00.A0U;
        if (l41 == null) {
            str = "zoomingThrottler";
        } else {
            float A002 = r1.A00();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - l41.A00 <= 100) {
                return false;
            }
            L0Q l0q = l41.A01;
            float f3 = LQO.A00;
            ClipsStackedTimelineFragment clipsStackedTimelineFragment = l0q.A00;
            AnonymousClass861 r0 = clipsStackedTimelineFragment.A0j;
            if (r0 == null) {
                str = "videoPlaybackViewModel";
            } else {
                AnonymousClass863 A0Z = JTP.A0Z(r0);
                if (A0Z != null) {
                    num = Integer.valueOf(A0Z.CEG());
                } else {
                    num = null;
                }
                Context requireContext = clipsStackedTimelineFragment.requireContext();
                float f4 = LQO.A00 * A002;
                float A01 = JTS.A01(requireContext, f4) * ((float) (LQO.A00(f4, false) * 2));
                float A012 = (f4 / A01) * ((float) AnonymousClass1GB.A01(A01));
                float f5 = LQO.A01;
                float min = Math.min(Math.max(f5, 10.0f), Math.max(Math.min(f5, 10.0f), A012));
                LQO.A00 = min;
                str = "viewController";
                if (!AnonymousClass7TF.A1Q((f3 > min ? 1 : (f3 == min ? 0 : -1)))) {
                    ClipsStackedTimelineViewController clipsStackedTimelineViewController = clipsStackedTimelineFragment.A0F;
                    if (clipsStackedTimelineViewController != null) {
                        LinearLayoutManager linearLayoutManager = clipsStackedTimelineViewController.A01;
                        if (linearLayoutManager == null) {
                            str = "linearLayoutManager";
                        } else {
                            int A1a = linearLayoutManager.A1a();
                            if (A1a > 0) {
                                Context requireContext2 = clipsStackedTimelineViewController.A09.requireContext();
                                f = 0.0f - (((float) ((A1a - 1) / 2)) * ((JTS.A01(requireContext2, min) * ((float) (LQO.A00(min, false) * 2))) - (JTS.A01(requireContext2, f3) * ((float) (LQO.A00(f3, false) * 2)))));
                            } else {
                                f = 0.0f;
                            }
                            if (num != null) {
                                AnonymousClass4DH r14 = clipsStackedTimelineViewController.A09;
                                Context requireContext3 = r14.requireContext();
                                int intValue = num.intValue();
                                float A013 = JTS.A01(requireContext3, min);
                                float f6 = (float) intValue;
                                f += (A013 * f6) - (JTS.A01(r14.requireContext(), f3) * f6);
                                clipsStackedTimelineViewController.A00 = (int) (JTS.A01(r14.requireContext(), min) * f6);
                            }
                            if (A1a < (LQO.A02 / LQO.A00(min, false)) + 1 + 2) {
                                LPJ.A07(clipsStackedTimelineViewController, clipsStackedTimelineViewController.A0E, true);
                                if (f != 0.0f) {
                                    clipsStackedTimelineViewController.A0G(f);
                                }
                            } else {
                                clipsStackedTimelineViewController.A04 = true;
                                LPJ.A07(clipsStackedTimelineViewController, clipsStackedTimelineViewController.A0E, true);
                            }
                            clipsStackedTimelineViewController.A0B.Dsw(clipsStackedTimelineViewController.A00);
                            KMS kms = clipsStackedTimelineFragment.A0E;
                            if (kms == null) {
                                str = "videoTrackViewController";
                            } else {
                                float f7 = LQO.A00;
                                C60108Jfo jfo = kms.A0K;
                                jfo.A0V((Integer) null, Integer.MAX_VALUE);
                                int A1a2 = kms.A0E.A1a();
                                float f8 = 0.0f;
                                for (int i = 1; i < A1a2; i++) {
                                    if (i % 2 == 0) {
                                        Integer A0I = jfo.A0E.A0I((i / 2) - 1);
                                        if (A0I != null) {
                                            float intValue2 = (float) A0I.intValue();
                                            f2 = (JTS.A01(JTR.A0P(jfo), f3) * intValue2) - (JTS.A01(JTR.A0P(jfo), f7) * intValue2);
                                        } else {
                                            f2 = 0.0f;
                                        }
                                        f8 += f2;
                                    }
                                }
                                if (num != null) {
                                    Context context = kms.A07;
                                    float intValue3 = (float) num.intValue();
                                    f8 += (JTS.A01(context, f7) * intValue3) - (JTS.A01(context, f3) * intValue3);
                                    int A014 = (int) (JTS.A01(context, f7) * intValue3);
                                    kms.A00 = A014;
                                    jfo.A0O(A014);
                                }
                                jfo.A0R(kms.A07, (AnonymousClass8RH) null, (List) null, kms.A06 / 2, false, true);
                                kms.A0G(f8);
                                C64166LRi lRi = clipsStackedTimelineFragment.A0B;
                                if (lRi == null) {
                                    str = "audioElementTracksManager";
                                } else {
                                    float f9 = LQO.A00;
                                    Iterator A015 = C64166LRi.A01(lRi);
                                    while (A015.hasNext()) {
                                        JTO.A0d(A015).A0P(num, f3, f9);
                                    }
                                    Iterator A003 = C64166LRi.A00(lRi);
                                    while (A003.hasNext()) {
                                        JTO.A0d(A003).A0P(num, f3, f9);
                                    }
                                    LGg lGg = clipsStackedTimelineFragment.A0D;
                                    if (lGg == null) {
                                        str = "timedElementTracksManager";
                                    } else {
                                        float f10 = LQO.A00;
                                        Iterator it = lGg.A0C.iterator();
                                        while (it.hasNext()) {
                                            ((KMT) it.next()).A0O(num, f3, f10);
                                        }
                                        Iterator it2 = lGg.A0B.iterator();
                                        while (it2.hasNext()) {
                                            ((KMT) it2.next()).A0O(num, f3, f10);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (LQO.A05 && (min == 10.0f || min == f5)) {
                    ClipsStackedTimelineViewController clipsStackedTimelineViewController2 = clipsStackedTimelineFragment.A0F;
                    if (clipsStackedTimelineViewController2 != null) {
                        clipsStackedTimelineViewController2.A0O().performHapticFeedback(1);
                        LQO.A05 = false;
                    }
                }
                ClipsStackedTimelineFragment.A0C(clipsStackedTimelineFragment);
                l41.A00 = currentTimeMillis;
                return true;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Dgt(C253913rc r11) {
        String str;
        LQO.A06 = false;
        ClipsStackedTimelineFragment clipsStackedTimelineFragment = this.A00;
        ClipsStackedTimelineViewController clipsStackedTimelineViewController = clipsStackedTimelineFragment.A0F;
        if (clipsStackedTimelineViewController == null) {
            str = "viewController";
        } else {
            int i = clipsStackedTimelineViewController.A06;
            C60415Jl8 jl8 = clipsStackedTimelineViewController.A02;
            if (jl8 == null) {
                str = "timeBarAdapter";
            } else {
                int i2 = jl8.A01;
                Context requireContext = clipsStackedTimelineViewController.A09.requireContext();
                int i3 = LQO.A02;
                int i4 = LQO.A03;
                int i5 = i3 - ((i3 / i4) * i4);
                int i6 = i / 2;
                if (i2 % 2 != 1) {
                    i5 -= i4;
                }
                clipsStackedTimelineViewController.A0U(i6 + C63117Krl.A00(requireContext, i5));
                KMS kms = clipsStackedTimelineFragment.A0E;
                if (kms == null) {
                    str = "videoTrackViewController";
                } else {
                    kms.A0K.A0V((Integer) null, Integer.valueOf(kms.A06 / 2));
                    C64166LRi lRi = clipsStackedTimelineFragment.A0B;
                    if (lRi == null) {
                        str = "audioElementTracksManager";
                    } else {
                        Iterator A01 = C64166LRi.A01(lRi);
                        while (A01.hasNext()) {
                            KMU A0d = JTO.A0d(A01);
                            A0d.A0H.A0I(A0d.A05);
                        }
                        Iterator A002 = C64166LRi.A00(lRi);
                        while (A002.hasNext()) {
                            KMU A0d2 = JTO.A0d(A002);
                            A0d2.A0H.A0I(A0d2.A05);
                        }
                        LGg lGg = clipsStackedTimelineFragment.A0D;
                        if (lGg == null) {
                            str = "timedElementTracksManager";
                        } else {
                            C61806KMu.A02(lGg.A0A, lGg.A01);
                            C60108Jfo jfo = clipsStackedTimelineFragment.A0h;
                            if (jfo == null) {
                                str = "stackedTimelineViewModel";
                            } else {
                                jfo.A07 = false;
                                Float f = clipsStackedTimelineFragment.A0m;
                                if (f != null) {
                                    int i7 = (f.floatValue() > LQO.A00 ? 1 : (f.floatValue() == LQO.A00 ? 0 : -1));
                                    27r A0I = JTQ.A0I(clipsStackedTimelineFragment);
                                    C279294yP A0J = A0I.A0J();
                                    if (i7 < 0) {
                                        if (A0J != null) {
                                            27r.A0C(A0I, "TIMELINE_ELEMENT_ZOOM_IN");
                                        }
                                    } else if (A0J != null) {
                                        27r.A0C(A0I, "TIMELINE_ELEMENT_ZOOM_OUT");
                                    }
                                }
                                clipsStackedTimelineFragment.A0m = null;
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

    public C65758LzC(ClipsStackedTimelineFragment clipsStackedTimelineFragment) {
        this.A00 = clipsStackedTimelineFragment;
    }

    public final boolean Dgo(C253913rc r4) {
        ClipsStackedTimelineFragment clipsStackedTimelineFragment = this.A00;
        C60108Jfo jfo = clipsStackedTimelineFragment.A0h;
        if (jfo == null) {
            0qQ.A0F("stackedTimelineViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        jfo.A07 = true;
        LQO.A06 = true;
        LQO.A05 = true;
        clipsStackedTimelineFragment.A0p = true;
        clipsStackedTimelineFragment.A0m = Float.valueOf(LQO.A00);
        return true;
    }
}
