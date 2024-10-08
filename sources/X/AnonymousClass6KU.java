package X;

import android.graphics.RectF;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.reels.Reel;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;

/* renamed from: X.6KU  reason: invalid class name */
public final class AnonymousClass6KU extends C232922uf {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ float A04;
    public final /* synthetic */ float A05;
    public final /* synthetic */ float A06;
    public final /* synthetic */ float A07;
    public final /* synthetic */ float A08;
    public final /* synthetic */ float A09;
    public final /* synthetic */ float A0A;
    public final /* synthetic */ RectF A0B;
    public final /* synthetic */ View A0C;
    public final /* synthetic */ View A0D;
    public final /* synthetic */ Reel A0E;
    public final /* synthetic */ C255773uh A0F;
    public final /* synthetic */ AnonymousClass6KT A0G;
    public final /* synthetic */ AnonymousClass6UX A0H;
    public final /* synthetic */ C309536Yq A0I;
    public final /* synthetic */ ReelAvatarWithBadgeView A0J;
    public final /* synthetic */ C316006kx A0K;
    public final /* synthetic */ AnonymousClass6KS A0L;
    public final /* synthetic */ boolean A0M;

    public AnonymousClass6KU(RectF rectF, View view, View view2, Reel reel, C255773uh r6, AnonymousClass6KT r7, AnonymousClass6UX r8, C309536Yq r9, ReelAvatarWithBadgeView reelAvatarWithBadgeView, C316006kx r11, AnonymousClass6KS r12, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, boolean z) {
        this.A09 = f;
        this.A0B = rectF;
        this.A08 = f2;
        this.A07 = f3;
        this.A0A = f4;
        this.A01 = f5;
        this.A04 = f6;
        this.A02 = f7;
        this.A05 = f8;
        this.A00 = f9;
        this.A03 = f10;
        this.A0C = view;
        this.A0H = r8;
        this.A0K = r11;
        this.A0G = r7;
        this.A0M = z;
        this.A0J = reelAvatarWithBadgeView;
        this.A06 = f11;
        this.A0D = view2;
        this.A0I = r9;
        this.A0L = r12;
        this.A0E = reel;
        this.A0F = r6;
    }

    public final void DmC(2cs r4) {
        this.A0H.A0B(this.A0E, this.A0F);
        AnonymousClass6KS r2 = this.A0L;
        r2.A00.A0S(new C305896Jz(r2));
    }

    public final void DmE(2cs r23) {
        float f;
        float max;
        C316006kx r9;
        float f2 = (float) r23.A09.A00;
        double d = (double) f2;
        double d2 = (double) this.A09;
        RectF rectF = this.A0B;
        float A042 = (float) AnonymousClass37Q.A04(d, 0.0d, 1.0d, d2, (double) rectF.centerY());
        float A043 = (float) AnonymousClass37Q.A04(d, 0.0d, 1.0d, (double) this.A08, (double) rectF.centerX());
        float A044 = (float) AnonymousClass37Q.A04(d, 0.0d, 1.0d, (double) this.A07, (double) this.A0A);
        if (Float.isNaN(A044) || Float.isInfinite(A044)) {
            f = 0.0f;
        } else {
            f = Math.max(A044, 0.0f);
        }
        float A045 = (float) AnonymousClass37Q.A04(d, 0.0d, 1.0d, (double) this.A01, (double) this.A04);
        float A046 = (float) AnonymousClass37Q.A04(d, 0.0d, 1.0d, (double) this.A02, (double) this.A05);
        float A047 = (float) AnonymousClass37Q.A04(d, 0.0d, 1.0d, (double) this.A00, (double) this.A03);
        if (Float.isInfinite(A047)) {
            max = 0.0f;
        } else {
            max = Math.max(A047, 0.0f);
        }
        View view = this.A0C;
        view.setTranslationX(A043);
        view.setTranslationY(A042);
        view.setScaleX(f);
        view.setScaleY(f);
        if (this.A0H.A07() && (r9 = this.A0K) != null) {
            r9.BGP().setAlpha(1.0f - f2);
            r9.A0g.setAlpha(f2);
            view.setAlpha(1.0f - ((1.0f - this.A0G.A00) * f2));
        }
        if (!this.A0M) {
            ReelAvatarWithBadgeView reelAvatarWithBadgeView = this.A0J;
            reelAvatarWithBadgeView.setTranslationX(A045);
            reelAvatarWithBadgeView.setTranslationY(A046);
            reelAvatarWithBadgeView.setScaleX(max);
            reelAvatarWithBadgeView.setScaleY(max);
        }
        float A048 = 1.0f - ((float) AnonymousClass37Q.A04(d, 0.0d, 1.0d, (double) (1.0f - this.A06), 1.0d));
        View view2 = this.A0D;
        if (view2 != null) {
            this.A0I.A00(view2, A048);
        }
        FragmentActivity activity = this.A0L.A00.getActivity();
        if (C61290mR.A07() && activity != null) {
            AnonymousClass4EQ.A08(activity, 1.0f - A048);
        }
    }
}
