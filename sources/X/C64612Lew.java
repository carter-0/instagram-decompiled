package X;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.api.schemas.BrandedContentProjectMetadata;

/* renamed from: X.Lew  reason: case insensitive filesystem */
public final class C64612Lew implements C66432MRm {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ FrameLayout A03;
    public final /* synthetic */ ImageView A04;
    public final /* synthetic */ ImageView A05;
    public final /* synthetic */ TextView A06;
    public final /* synthetic */ LFX A07;

    public C64612Lew(ViewGroup viewGroup, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, TextView textView, LFX lfx, int i, int i2) {
        this.A07 = lfx;
        this.A05 = imageView;
        this.A03 = frameLayout;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = imageView2;
        this.A02 = viewGroup;
        this.A06 = textView;
    }

    public final void D7x(Bitmap bitmap) {
        BrandedContentProjectMetadata brandedContentProjectMetadata;
        String str;
        LFX lfx = this.A07;
        ImageView imageView = this.A05;
        FrameLayout frameLayout = this.A03;
        int i = this.A01;
        int i2 = this.A00;
        ImageView imageView2 = this.A04;
        ViewGroup viewGroup = this.A02;
        TextView textView = this.A06;
        imageView.setImageBitmap(bitmap);
        imageView.setVisibility(0);
        if (bitmap != null) {
            i = bitmap.getWidth();
            i2 = bitmap.getHeight();
        }
        JTP.A14(frameLayout, i, i2);
        imageView2.setVisibility(8);
        AnonymousClass3Q2 r0 = lfx.A07;
        if (r0 == null || (brandedContentProjectMetadata = r0.A0t) == null || (str = brandedContentProjectMetadata.A05) == null || str.length() != 0) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        textView.setText(2131964389);
    }
}
