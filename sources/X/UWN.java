package X;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;

public final class UWN extends C309356Xy {
    public static final Property A08 = new C14638Tzk(10);
    public static final int[] A09 = {1267, IgNetworkConsentStorage.MAX_ENTRIES, 333, 0};
    public static final int[] A0A = {533, 567, 850, 750};
    public float A00;
    public int A01 = 0;
    public ObjectAnimator A02;
    public C309246Xn A03 = null;
    public boolean A04;
    public boolean A05;
    public final C309276Xq A06;
    public final Interpolator[] A07;

    public UWN(Context context, UWK uwk) {
        super(2);
        this.A06 = uwk;
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line1_head_interpolator);
        if (loadInterpolator != null) {
            Interpolator loadInterpolator2 = AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line1_tail_interpolator);
            if (loadInterpolator2 != null) {
                Interpolator loadInterpolator3 = AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line2_head_interpolator);
                if (loadInterpolator3 != null) {
                    Interpolator loadInterpolator4 = AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line2_tail_interpolator);
                    if (loadInterpolator4 != null) {
                        this.A07 = new Interpolator[]{loadInterpolator, loadInterpolator2, loadInterpolator3, loadInterpolator4};
                        return;
                    }
                    throw new NullPointerException("Failed to parse interpolator, no start tag found");
                }
                throw new NullPointerException("Failed to parse interpolator, no start tag found");
            }
            throw new NullPointerException("Failed to parse interpolator, no start tag found");
        }
        throw new NullPointerException("Failed to parse interpolator, no start tag found");
    }

    public final void A01() {
        this.A01 = 0;
        int A012 = C18108Vlc.A01(this.A06.A05[0], this.A00.A01);
        int[] iArr = this.A02;
        iArr[0] = A012;
        iArr[1] = A012;
    }

    public final void A04() {
        this.A03 = null;
    }

    public final void A00() {
        ObjectAnimator objectAnimator = this.A02;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final void A02() {
        if (this.A00.isVisible()) {
            this.A04 = true;
            this.A02.setRepeatCount(0);
            return;
        }
        A00();
    }

    public final void A03() {
        if (this.A02 == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, A08, new float[]{0.0f, 1.0f});
            this.A02 = ofFloat;
            ofFloat.setDuration(1800);
            this.A02.setInterpolator((TimeInterpolator) null);
            this.A02.setRepeatCount(-1);
            U0N.A00(this.A02, this, 9);
        }
        this.A01 = 0;
        int A012 = C18108Vlc.A01(this.A06.A05[0], this.A00.A01);
        int[] iArr = this.A02;
        iArr[0] = A012;
        iArr[1] = A012;
        this.A02.start();
    }

    public final void A05(C309246Xn r1) {
        this.A03 = r1;
    }
}
