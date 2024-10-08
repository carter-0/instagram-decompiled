package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Lmt  reason: case insensitive filesystem */
public final class C65073Lmt implements MXK {
    public int A00;
    public RecyclerView A01;
    public C60407Jl0 A02;
    public boolean A03;
    public boolean A04;
    public final UserSession A05;
    public final C60237Jhu A06;
    public final C60090JfW A07;
    public final ClipsCreationViewModel A08;
    public final AnonymousClass8RF A09;
    public final AnonymousClass861 A0A;
    public final Context A0B;
    public final C3507185x A0C;
    public final C61805KMt A0D;

    public final /* synthetic */ void ADC(View view) {
    }

    public final void CN3(ViewGroup viewGroup) {
        RecyclerView A0F = DbZ.A0F(viewGroup, R.id.clips_stacked_timeline_volume_controls);
        if (A0F != null) {
            this.A01 = A0F;
        } else {
            viewGroup.removeAllViews();
            this.A01 = new C60713Jpy(viewGroup.getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            RecyclerView recyclerView = this.A01;
            if (recyclerView != null) {
                recyclerView.setId(R.id.clips_stacked_timeline_volume_controls);
                RecyclerView recyclerView2 = this.A01;
                if (recyclerView2 != null) {
                    viewGroup.addView(recyclerView2, layoutParams);
                }
            }
            0qQ.A0F("volumeSliderRecyclerView");
            throw AnonymousClass00P.createAndThrow();
        }
        RecyclerView recyclerView3 = this.A01;
        if (recyclerView3 != null) {
            AnonymousClass3AS r1 = recyclerView3.A0C;
            0qQ.A0C(r1, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
            ((AnonymousClass3AR) r1).A00 = false;
            RecyclerView recyclerView4 = this.A01;
            if (recyclerView4 != null) {
                DbU.A15(viewGroup.getContext(), recyclerView4, 1, false);
                C60407Jl0 jl0 = new C60407Jl0(this.A0B, new LEZ(this), A00(), LIF.A01(this.A0C.A0E()));
                this.A02 = jl0;
                RecyclerView recyclerView5 = this.A01;
                if (recyclerView5 != null) {
                    recyclerView5.setAdapter(jl0);
                    C60090JfW jfW = this.A07;
                    DbY.A19(jfW, MGV.A01(this, (AnonymousClass4D7) null, 34), jfW.A02);
                    return;
                }
            }
        }
        0qQ.A0F("volumeSliderRecyclerView");
        throw AnonymousClass00P.createAndThrow();
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

    public static final Integer A01(C65073Lmt lmt) {
        int i;
        AnonymousClass8RH A0E = lmt.A09.A0E();
        if (!(A0E instanceof C355828Rn) || (i = ((C355828Rn) A0E).A00) == -1) {
            return null;
        }
        return Integer.valueOf(i);
    }

    private final String A02() {
        C53368Gms gms;
        C61194Jyn A0M;
        C60997Jut jut;
        AnonymousClass8RH A0E = this.A09.A0E();
        if (!(A0E instanceof C355828Rn) || (gms = ((C355828Rn) A0E).A01) == null || (A0M = this.A0D.A0M(gms.A01, gms.A00)) == null || (jut = A0M.A08) == null) {
            return null;
        }
        return jut.A08;
    }

    public final void AJD() {
        if (this.A02 != null) {
            this.A04 = true;
            A03();
            C60407Jl0 jl0 = this.A02;
            if (jl0 == null) {
                0qQ.A0F("volumeSliderAdapter");
                throw AnonymousClass00P.createAndThrow();
            } else {
                jl0.A01 = null;
            }
        }
    }

    public final void AQD(float f) {
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null) {
            0qQ.A0F("volumeSliderRecyclerView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            recyclerView.scrollBy(0, (int) f);
        }
    }

    public final int B8T() {
        RecyclerView recyclerView = this.A01;
        if (recyclerView != null) {
            return recyclerView.computeVerticalScrollRange();
        }
        0qQ.A0F("volumeSliderRecyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CQZ() {
        String str;
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null) {
            str = "volumeSliderRecyclerView";
        } else if (!recyclerView.canScrollVertically(1)) {
            return true;
        } else {
            C60407Jl0 jl0 = this.A02;
            if (jl0 == null) {
                str = "volumeSliderAdapter";
            } else if (jl0.getItemCount() > 1) {
                return false;
            } else {
                return true;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CQa() {
        String str;
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null) {
            str = "volumeSliderRecyclerView";
        } else if (!JTP.A1Y(recyclerView)) {
            return true;
        } else {
            C60407Jl0 jl0 = this.A02;
            if (jl0 == null) {
                str = "volumeSliderAdapter";
            } else if (jl0.getItemCount() > 1) {
                return false;
            } else {
                return true;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Cyv() {
        if (this.A03) {
            this.A03 = false;
        } else if (this.A04) {
            this.A04 = false;
        } else {
            A03();
        }
    }

    public final void DG2(float f, float f2) {
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null) {
            0qQ.A0F("volumeSliderRecyclerView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            recyclerView.A1F(0, (int) f2);
        }
    }

    public final void cancel() {
        Number A14;
        L0W l0w;
        Number A142;
        0eP r0;
        Boolean valueOf;
        C60407Jl0 jl0 = this.A02;
        if (jl0 != null) {
            this.A03 = true;
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = jl0.A00.iterator();
            while (true) {
                if (it.hasNext()) {
                    C60964JuM juM = (C60964JuM) it.next();
                    C60407Jl0 jl02 = this.A02;
                    if (jl02 == null) {
                        break;
                    }
                    Map map = jl02.A01;
                    if (!(map == null || (A142 = C51966G9m.A14(l0w, map)) == null)) {
                        float floatValue = A142.floatValue();
                        if ((l0w = juM.A03) instanceof C61789KMd) {
                            String str = juM.A08;
                            if (str != null) {
                                AnonymousClass7TF.A1I(str, A142, A1C);
                            }
                        } else if (0qQ.A0K(l0w, C61794KMi.A00)) {
                            List<M1Y> A16 = JTO.A16(this.A08.A0K.A0S);
                            ArrayList A1C2 = AnonymousClass7TE.A1C();
                            for (M1Y m1y : A16) {
                                String str2 = m1y.A06;
                                if (!(str2 == null || (valueOf = Boolean.valueOf(A1C.add(AnonymousClass7TE.A1L(str2, A142)))) == null)) {
                                    A1C2.add(valueOf);
                                }
                            }
                        } else if (0qQ.A0K(l0w, C61792KMg.A00)) {
                            List<C381709cC> A17 = JTO.A17(this.A08.A0K.A0h);
                            ArrayList A0r = AnonymousClass7TG.A0r(A17);
                            for (C381709cC A002 : A17) {
                                String A003 = A002.A00();
                                if (A003 != null) {
                                    r0 = AnonymousClass7TE.A1L(A003, A142);
                                } else {
                                    r0 = null;
                                }
                                A0r.add(r0);
                            }
                            A1C.addAll(00k.A0X(A0r));
                        } else if (0qQ.A0K(l0w, C61791KMf.A00)) {
                            AnonymousClass7TF.A1I("sound_effects", A142, A1C);
                        } else if (l0w instanceof C61790KMe) {
                            A04(this, A1C, floatValue);
                        } else if (l0w instanceof C61793KMh) {
                            AnonymousClass7TF.A1I("voice_enhancement", A142, A1C);
                        } else {
                            throw AnonymousClass7TE.A1K();
                        }
                    }
                } else {
                    if (DbT.A1b(A1C)) {
                        this.A0A.A0B(A1C);
                    }
                    C60407Jl0 jl03 = this.A02;
                    if (jl03 != null) {
                        int i = 0;
                        for (Object next : jl03.A00) {
                            int i2 = i + 1;
                            if (i < 0) {
                                0sr.A1T();
                            } else {
                                C60964JuM juM2 = (C60964JuM) next;
                                L0W l0w2 = juM2.A03;
                                Map map2 = jl03.A01;
                                if (!(map2 == null || (A14 = C51966G9m.A14(l0w2, map2)) == null)) {
                                    juM2.A00 = A14.floatValue();
                                }
                                i = i2;
                            }
                        }
                        jl03.A01 = null;
                        return;
                    }
                }
            }
            0qQ.A0F("volumeSliderAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public C65073Lmt(Context context, UserSession userSession, C60237Jhu jhu, C60090JfW jfW, C3507185x r5, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass8RF r7, C61805KMt kMt, AnonymousClass861 r9) {
        AnonymousClass7TG.A1Q(userSession, jfW);
        this.A0B = context;
        this.A05 = userSession;
        this.A07 = jfW;
        this.A0C = r5;
        this.A09 = r7;
        this.A08 = clipsCreationViewModel;
        this.A0D = kMt;
        this.A0A = r9;
        this.A06 = jhu;
    }

    private final L0W A00() {
        if (A01(this) != null) {
            return new C61790KMe(String.valueOf(A01(this)));
        }
        if (A02() != null) {
            return new C61789KMd(A02());
        }
        AnonymousClass8RF r2 = this.A09;
        AnonymousClass8RH A0E = r2.A0E();
        if ((A0E instanceof C355828Rn) && ((C355828Rn) A0E).A03 != null) {
            return C61794KMi.A00;
        }
        AnonymousClass8RH A0E2 = r2.A0E();
        if (!(A0E2 instanceof C355828Rn) || ((C355828Rn) A0E2).A02 == null) {
            return null;
        }
        return C61792KMg.A00;
    }

    private final void A03() {
        AnonymousClass51M r1;
        HashMap A1E = AnonymousClass7TE.A1E();
        C60407Jl0 jl0 = this.A02;
        if (jl0 != null) {
            for (C60964JuM juM : jl0.A00) {
                L0W l0w = juM.A03;
                if (l0w instanceof C61789KMd) {
                    String str = juM.A08;
                    if (str != null) {
                        JTP.A1Q(str, A1E, LIF.A00(juM.A00));
                    }
                    C60407Jl0 jl02 = this.A02;
                    if (jl02 == null) {
                        0qQ.A0F("volumeSliderAdapter");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    List list = jl02.A00;
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    for (Object next : list) {
                        if (((C60964JuM) next).A03 instanceof C61789KMd) {
                            A1C.add(next);
                        }
                    }
                    if (A1C.size() == 1) {
                        this.A0C.A0F(LIF.A00(juM.A00));
                    }
                } else if (l0w instanceof C61794KMi) {
                    this.A0C.A0I(LIF.A00(juM.A00));
                } else if (l0w instanceof C61792KMg) {
                    this.A0C.A0H(LIF.A00(juM.A00));
                } else if (l0w instanceof C61790KMe) {
                    float A002 = LIF.A00(juM.A00);
                    Integer A012 = A01(this);
                    if (A012 != null) {
                        int intValue = A012.intValue();
                        AnonymousClass836 r3 = this.A08.A0O;
                        AnonymousClass51N r0 = (AnonymousClass51N) ((AnonymousClass831) r3.A03.getValue()).A04(intValue);
                        if (r0 != null) {
                            AnonymousClass51N A062 = r0.A06();
                            if ((A062 instanceof AnonymousClass51M) && (r1 = (AnonymousClass51M) A062) != null) {
                                r1.A01 = A002;
                                r3.A01(r1, intValue);
                            }
                        }
                    } else {
                        this.A0C.A01.A06(A002);
                    }
                } else if (l0w instanceof C61791KMf) {
                    this.A0C.A0G(LIF.A00(juM.A00));
                } else if (l0w instanceof C61793KMh) {
                    C60237Jhu jhu = this.A06;
                    jhu.A03.A07(juM.A00);
                }
                if (!A1E.isEmpty()) {
                    this.A08.A0K.A0B(A1E);
                }
            }
        }
    }

    public static final void A04(C65073Lmt lmt, List list, float f) {
        Integer A012 = A01(lmt);
        String A002 = Pxd.A00(106);
        if (A012 != null) {
            list.add(AnonymousClass7TE.A1L(AnonymousClass7TF.A0i(A01(lmt), AnonymousClass7TF.A0n(A002)), Float.valueOf(f * lmt.A0C.A0E())));
            return;
        }
        ClipsCreationViewModel clipsCreationViewModel = lmt.A08;
        AnonymousClass0Ud r1 = clipsCreationViewModel.A0c;
        if (!((AnonymousClass831) r1.getValue()).A01.isEmpty()) {
            int A082 = JTO.A08((AnonymousClass831) r1.getValue());
            for (int i = 0; i < A082; i++) {
                Float A0H = clipsCreationViewModel.A0H(i);
                if (A0H != null) {
                    list.add(AnonymousClass7TE.A1L(002.A0O(A002, i), Float.valueOf(A0H.floatValue() * f)));
                }
            }
        }
    }

    public final List Bdz() {
        if (A00() != null || this.A00 <= 1) {
            return AnonymousClass7TE.A1I(C62578KiB.PEEK);
        }
        return 0sr.A1P(new C62578KiB[]{C62578KiB.VIDEO_PREVIEW_LARGE, C62578KiB.VIDEO_PREVIEW_SMALL, C62578KiB.FULL});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002e, code lost:
        r1 = r0.intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dfp() {
        /*
            r6 = this;
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            r0 = 0
            X.KMe r1 = new X.KMe
            r1.<init>(r0)
            X.85x r3 = r6.A0C
            float r0 = r3.A0E()
            float r0 = X.LIF.A01(r0)
            X.JTP.A1Q(r1, r2, r0)
            X.KMi r1 = X.C61794KMi.A00
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r5 = r3.A01
            X.0Ud r0 = r5.A0n
            float r0 = X.JTR.A03(r0)
            float r0 = X.LIF.A01(r0)
            X.JTP.A1Q(r1, r2, r0)
            java.lang.Integer r0 = A01(r6)
            if (r0 == 0) goto L_0x004e
            int r1 = r0.intValue()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r6.A08
            java.lang.Float r0 = r0.A0H(r1)
            if (r0 == 0) goto L_0x004e
            float r3 = r0.floatValue()
            java.lang.String r0 = java.lang.String.valueOf(r1)
            X.KMe r1 = new X.KMe
            r1.<init>(r0)
            float r0 = X.LIF.A01(r3)
            X.JTP.A1Q(r1, r2, r0)
        L_0x004e:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r6.A08
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A0K
            X.0Ud r0 = r0.A0V
            java.util.List r0 = X.JTO.A17(r0)
            if (r0 == 0) goto L_0x0081
            java.util.Iterator r4 = r0.iterator()
        L_0x005e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r0 = r4.next()
            X.8fx r0 = (X.C361278fx) r0
            java.lang.Object r3 = r0.A01
            com.instagram.music.common.model.AudioOverlayTrack r3 = (com.instagram.music.common.model.AudioOverlayTrack) r3
            if (r3 == 0) goto L_0x005e
            java.lang.String r0 = r3.A0D
            X.KMd r1 = new X.KMd
            r1.<init>(r0)
            float r0 = r3.A00
            float r0 = X.LIF.A01(r0)
            X.JTP.A1Q(r1, r2, r0)
            goto L_0x005e
        L_0x0081:
            X.KMf r1 = X.C61791KMf.A00
            X.0Ud r0 = r5.A0g
            float r0 = X.JTR.A03(r0)
            float r0 = X.LIF.A01(r0)
            X.JTP.A1Q(r1, r2, r0)
            X.KMg r1 = X.C61792KMg.A00
            X.0Ud r0 = r5.A0i
            float r0 = X.JTR.A03(r0)
            float r0 = X.LIF.A01(r0)
            X.JTP.A1Q(r1, r2, r0)
            X.KMh r1 = X.C61793KMh.A00
            X.Jhu r0 = r6.A06
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A03
            X.0Ud r0 = r0.A0b
            java.lang.Object r0 = r0.getValue()
            X.8Yx r0 = (X.C357618Yx) r0
            if (r0 == 0) goto L_0x00c2
            float r0 = r0.A00
        L_0x00b1:
            X.JTP.A1Q(r1, r2, r0)
            X.Jl0 r0 = r6.A02
            if (r0 != 0) goto L_0x00c4
            java.lang.String r0 = "volumeSliderAdapter"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00c2:
            r0 = 0
            goto L_0x00b1
        L_0x00c4:
            r0.A01 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65073Lmt.Dfp():void");
    }
}
