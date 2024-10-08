package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.pendingmedia.model.ClipInfo;

public final class LWf implements TextureView.SurfaceTextureListener {
    public STU A00;
    public L4L A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final Context A05;
    public final UserSession A06;
    public final AnonymousClass3Q2 A07;
    public final C62320sa A08;
    public final boolean A09;
    public final ConstrainedTextureView A0A;

    public LWf(Context context, ViewGroup viewGroup, UserSession userSession, ConstrainedTextureView constrainedTextureView, AnonymousClass3Q2 r10, C62320sa r11, float f, int i, int i2, boolean z, boolean z2) {
        ConstrainedTextureView constrainedTextureView2;
        float f2;
        0qQ.A0B(userSession, 2);
        this.A05 = context;
        this.A06 = userSession;
        this.A07 = r10;
        this.A02 = f;
        this.A09 = z;
        this.A04 = i;
        this.A03 = i2;
        this.A08 = r11;
        if (constrainedTextureView == null) {
            constrainedTextureView2 = new ConstrainedTextureView(context);
        } else {
            constrainedTextureView2 = constrainedTextureView;
        }
        this.A0A = constrainedTextureView2;
        constrainedTextureView2.setVisibility(0);
        constrainedTextureView2.setSurfaceTextureListener(this);
        if (z2) {
            f2 = 0.5625f;
        } else {
            ClipInfo clipInfo = r10.A1N;
            f2 = ((float) clipInfo.A09) / ((float) clipInfo.A06);
        }
        constrainedTextureView2.setAspectRatio(f2);
        if (constrainedTextureView == null) {
            viewGroup.addView(constrainedTextureView2, 0);
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        0qQ.A0B(surfaceTexture, 0);
        this.A01 = new L4L(surfaceTexture, this);
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        L4L l4l = this.A01;
        if (l4l == null) {
            return true;
        }
        LWf lWf = l4l.A01;
        STU stu = lWf.A00;
        if (stu != null) {
            stu.A07();
        }
        lWf.A00 = null;
        return true;
    }
}
