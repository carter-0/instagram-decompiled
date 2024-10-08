package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import java.io.File;

public final class LZQ implements SeekBar.OnSeekBarChangeListener, C13825Thv, B28, MUV, MXH {
    public C8826RBc A00;
    public boolean A01;
    public float A02;
    public AnonymousClass0eM A03;
    public final int A04;
    public final LinearLayout A05;
    public final SeekBar A06;
    public final ConstrainedTextureView A07;
    public final C59986Jcv A08;
    public final C66518MUw A09;
    public final C60250Ji7 A0A;
    public final LP1 A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final Context A0F;
    public final FrameLayout A0G;
    public final UserSession A0H;
    public final MSD A0I;
    public final C378379Po A0J;
    public final Runnable A0K;

    public final /* synthetic */ void ADC(View view) {
    }

    public final void CLS() {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final void DYn() {
    }

    public final void Ddj(AnonymousClass9RG r10, AnonymousClass9R7 r11) {
        UserSession userSession = this.A0H;
        Context context = this.A0F;
        C13830Ti1 ti1 = this.A0A.A0D;
        DisplayMetrics A0E2 = AnonymousClass7TF.A0E(context);
        RectF rectF = 0nA.A01;
        0qQ.A0B(A0E2, 0);
        this.A00 = new C8826RBc(context, userSession, r10, r11, this, ti1, false);
    }

    public final void Eub() {
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

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.Kom] */
    private void A00() {
        LP1 lp1 = this.A0B;
        if (lp1 != null) {
            lp1.A00();
            LinearLayout linearLayout = this.A05;
            int childCount = linearLayout.getChildCount() - 1;
            double d = (double) this.A04;
            double d2 = (double) this.A0E;
            int hashCode = linearLayout.hashCode();
            ? obj = new Object();
            obj.A04 = 0;
            obj.A02 = childCount;
            obj.A01 = d;
            obj.A00 = d2;
            obj.A03 = hashCode;
            lp1.A02(obj);
        }
    }

    public final void APo(Bitmap bitmap, int i, int i2) {
        LinearLayout linearLayout = this.A05;
        if (linearLayout.hashCode() == i2) {
            ((ImageView) linearLayout.getChildAt(i)).setImageBitmap(bitmap);
        }
    }

    public final void Ddk() {
        C8826RBc rBc = this.A00;
        rBc.getClass();
        rBc.A0D = true;
        this.A00 = null;
    }

    public final void Dq5(double[] dArr) {
        LP1 lp1 = this.A0B;
        if (this.A0G != null && lp1 != null) {
            LinearLayout linearLayout = this.A05;
            if (linearLayout.getChildCount() == 0) {
                int width = linearLayout.getWidth();
                int i = this.A04;
                int i2 = (width / i) + 1;
                C60250Ji7 ji7 = this.A0A;
                int i3 = ji7.A03;
                long j = (long) ((ji7.A02 - i3) / i2);
                double[] dArr2 = new double[i2];
                for (int i4 = 0; i4 < i2; i4++) {
                    dArr2[i4] = (double) (((long) i3) + (((long) i4) * j));
                }
                lp1.A04 = dArr2;
                lp1.A00();
                for (int i5 = 0; i5 < i2; i5++) {
                    ImageView imageView = new ImageView(this.A0F);
                    JTP.A14(imageView, i, this.A0E);
                    imageView.setPadding(0, 0, 0, 0);
                    linearLayout.addView(imageView);
                }
                A00();
            }
        }
    }

    public final void EJw(boolean z, float f) {
        this.A02 = f;
        this.A01 = z;
        this.A00.getClass();
        C8826RBc rBc = this.A00;
        if (rBc.A09) {
            rBc.A09();
        } else {
            rBc.A0B = true;
        }
    }

    public final void EK8() {
        File file;
        Context context = this.A0F;
        UserSession userSession = this.A0H;
        Bitmap bitmap = this.A07.getBitmap();
        float f = this.A02;
        int i = this.A0D;
        int i2 = this.A0C;
        AnonymousClass0eM r0 = this.A03;
        if (r0 != null) {
            file = (File) r0.getValue();
        } else {
            file = null;
        }
        LT1.A01(context, bitmap, (Bitmap) null, userSession, this.A0I, file, f, i, i2);
    }

    public final void FLP() {
        this.A0G.postDelayed(new C65933M4w(this), 50);
    }

    public final void onPause() {
        AnonymousClass9RG r0;
        C379219Sz r02 = this.A0J.A07;
        if (!(r02 == null || (r0 = r02.A00) == null)) {
            r0.A01();
        }
        LP1 lp1 = this.A0B;
        if (lp1 != null) {
            lp1.A00();
        }
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            int max = (i * 100) / this.A06.getMax();
            C8826RBc rBc = this.A00;
            if (rBc != null) {
                C60250Ji7 ji7 = this.A0A;
                ji7.A00(max, false);
                Object A022 = ji7.A05.A02();
                A022.getClass();
                rBc.A0A(AnonymousClass7TE.A0M(A022));
            }
        }
    }

    public final void onResume() {
        this.A0J.A00();
        if (this.A05.getChildCount() * this.A04 > 0 && this.A0B != null) {
            A00();
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.A09.Dmc();
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.A09.DnT();
    }

    public LZQ(Context context, FrameLayout frameLayout, LinearLayout linearLayout, SeekBar seekBar, AnonymousClass07Z r11, UserSession userSession, C59986Jcv jcv, C66518MUw mUw, C60250Ji7 ji7, LP1 lp1, String str, AnonymousClass0eM r18, float f, float f2, int i, int i2, int i3, int i4) {
        C65932M4v m4v = new C65932M4v(this);
        this.A0K = m4v;
        this.A0F = context;
        this.A0H = userSession;
        this.A0G = frameLayout;
        this.A03 = r18;
        C378379Po r1 = new C378379Po(context, userSession, str);
        this.A0J = r1;
        this.A09 = mUw;
        this.A0A = ji7;
        ji7.A07.A06(r11, new C64317LZr(this, 23));
        this.A0I = new C65234Lpe(ji7);
        ConstrainedTextureView constrainedTextureView = new ConstrainedTextureView(context);
        r1.A03 = constrainedTextureView;
        this.A07 = constrainedTextureView;
        constrainedTextureView.setVisibility(0);
        r1.A06 = this;
        constrainedTextureView.setSurfaceTextureListener(r1);
        constrainedTextureView.setAspectRatio(f);
        float f3 = f2 / f;
        if (f3 >= 1.0f) {
            constrainedTextureView.setScaleX(f3);
        } else {
            constrainedTextureView.setScaleY(1.0f / f3);
        }
        frameLayout.addView(constrainedTextureView, 0);
        this.A06 = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
        this.A0E = i2;
        this.A04 = i;
        LP1 lp12 = lp1;
        this.A0B = lp12;
        if (lp1 != null) {
            lp12.A02 = this;
        }
        this.A05 = linearLayout;
        linearLayout.post(m4v);
        this.A08 = jcv;
        this.A0D = i3;
        this.A0C = i4;
    }
}
