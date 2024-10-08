package X;

import android.graphics.Bitmap;
import androidx.fragment.app.FragmentActivity;
import com.instagram.creation.photo.crop.LayoutImageView;
import com.instagram.creation.photo.util.ExifImageData;

/* renamed from: X.M9r  reason: case insensitive filesystem */
public final /* synthetic */ class C66058M9r implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ L6E A02;
    public final /* synthetic */ C64328La3 A03;
    public final /* synthetic */ C59861Jad A04;

    public /* synthetic */ C66058M9r(L6E l6e, C64328La3 la3, C59861Jad jad, int i, int i2) {
        this.A03 = la3;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = jad;
        this.A02 = l6e;
    }

    public final void run() {
        int i;
        C64328La3 la3 = this.A03;
        int i2 = this.A00;
        int i3 = this.A01;
        C59861Jad jad = this.A04;
        C60694Jpf jpf = la3.A03;
        int i4 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        LayoutImageView layoutImageView = jpf.A0G;
        FragmentActivity fragmentActivity = jpf.A0A;
        Bitmap bitmap = jad.A00;
        ExifImageData exifImageData = jad.A01;
        if (exifImageData == null) {
            i = 0;
        } else {
            i = exifImageData.A00;
        }
        C364808m2 r2 = jad.A02;
        if (bitmap == null) {
            C59689JTv.A0F(fragmentActivity, "unable_to_load_image", 2131975828);
        } else if (fragmentActivity != null && !fragmentActivity.isFinishing() && r2 != null) {
            layoutImageView.A0O(i2, i3, bitmap, i);
        }
    }
}
