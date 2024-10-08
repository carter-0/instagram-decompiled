package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.rtc.presentation.areffects.RtcEffectSlider;

public final class OIF {
    public float A00;
    public AnonymousClass87G A01;
    public RtcEffectSlider A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final AnonymousClass80W A07;
    public final C74589Pxc A08 = new C52395GQu(0.0f, 1.0f);
    public final 05G A09;
    public final 05G A0A;
    public final 05G A0B;
    public final ViewStub A0C;
    public final C262224Cq A0D;

    public OIF(ViewStub viewStub, AnonymousClass80W r9, C262224Cq r10, int i) {
        AnonymousClass7TF.A1B(viewStub, 1, r9);
        this.A0C = viewStub;
        this.A07 = r9;
        this.A0D = r10;
        this.A06 = i;
        02z A0s = JTQ.A0s(this.A03);
        this.A09 = A0s;
        02z A012 = 106.A01(this.A01);
        this.A0B = A012;
        02z A0s2 = JTQ.A0s(this.A04);
        this.A0A = A0s2;
        View inflate = viewStub.inflate();
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.rtc.presentation.areffects.RtcEffectSlider");
        RtcEffectSlider rtcEffectSlider = (RtcEffectSlider) inflate;
        this.A02 = rtcEffectSlider;
        rtcEffectSlider.setAlignedLeft(true);
        2dP layoutParams = rtcEffectSlider.getLayoutParams();
        String A002 = C273654mx.A00(48);
        0qQ.A0C(layoutParams, A002);
        2dP r1 = layoutParams;
        r1.A02 = 8388627;
        rtcEffectSlider.setLayoutParams(r1);
        RtcEffectSlider rtcEffectSlider2 = this.A02;
        ViewGroup.LayoutParams layoutParams2 = rtcEffectSlider2.getLayoutParams();
        0qQ.A0C(layoutParams2, A002);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.setMarginStart(this.A06);
        rtcEffectSlider2.setLayoutParams(marginLayoutParams);
        AnonymousClass11O.A03(r10, new C62180ro(new C66191MHh(this, (AnonymousClass4D7) null, 9), new C61860pz(new MG9(this, (AnonymousClass4D7) null, 35), AnonymousClass11E.A01(AnonymousClass10H.A01(new C58115Imf(this, (AnonymousClass4D7) null, 0), AnonymousClass11E.A01(new MCA(63, (Object) this, (Object) AnonymousClass8DX.A00(r9))), A0s, A012, A0s2)))));
    }
}
