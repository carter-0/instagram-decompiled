package X;

import android.content.Context;
import android.widget.PopupWindow;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.textureview.ScalingTextureView;

/* renamed from: X.OYt  reason: case insensitive filesystem */
public final class C71018OYt {
    public boolean A00;
    public final PopupWindow A01;
    public final ScalingTextureView A02 = ((ScalingTextureView) AnonymousClass7TF.A0F(AnonymousClass7TH.A06(this.A0B), R.id.camera_preview_texture_view));
    public final AnonymousClass0eM A03 = A00(this, 40);
    public final AnonymousClass0eM A04 = A00(this, 41);
    public final AnonymousClass0eM A05 = A00(this, 42);
    public final AnonymousClass0eM A06 = A00(this, 43);
    public final AnonymousClass0eM A07 = A00(this, 44);
    public final AnonymousClass0eM A08 = A00(this, 45);
    public final AnonymousClass0eM A09 = A00(this, 46);
    public final AnonymousClass0eM A0A = A00(this, 47);
    public final AnonymousClass0eM A0B;

    public static final void A01(C340307l3 r3, C71018OYt oYt, int i, int i2) {
        r3.setInitialCameraFacing(1);
        C340177kp r1 = C340177kp.HIGH;
        r3.Ej6(new C382469dk(r1, r1, (C340147km) null));
        r3.Egd(oYt.A02.getSurfaceTexture(), i, i2);
        r3.AJI(new C68360NBx(r3, oYt, i), (C341047mF) null, AnonymousClass80L.A00);
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C73654PhT(obj, i));
    }

    public C71018OYt(Context context) {
        AnonymousClass0eM A002 = A00(context, 48);
        this.A0B = A002;
        this.A01 = new PopupWindow(AnonymousClass7TH.A06(A002), -1, -1, true);
        ((MediaFrameLayout) AnonymousClass7TE.A14(this.A0A)).A00 = -1.0f;
        ((CircularImageView) AnonymousClass7TE.A14(this.A03)).A02 = true;
    }
}
