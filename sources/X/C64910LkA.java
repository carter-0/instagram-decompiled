package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.LkA  reason: case insensitive filesystem */
public final class C64910LkA implements MVM, C66444MRy {
    public int A00;
    public int A01;
    public C364988mL A02;
    public PhotoFilter A03;
    public SurfaceTexture A04;
    public final Handler A05;
    public final UserSession A06;
    public final JWI A07;
    public final JWJ A08;
    public final C364808m2 A09;
    public final Runnable A0A = new M2X(this);

    public final void CMr(MultiListenerTextureView multiListenerTextureView, int i, int i2) {
        0qQ.A0B(multiListenerTextureView, 0);
        SurfaceTexture surfaceTexture = this.A04;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        SurfaceTexture surfaceTexture2 = new SurfaceTexture(0);
        surfaceTexture2.detachFromGLContext();
        surfaceTexture2.setDefaultBufferSize(i, i2);
        multiListenerTextureView.setSurfaceTexture(surfaceTexture2);
        this.A04 = surfaceTexture2;
        this.A01 = i;
        this.A00 = i2;
    }

    public final /* synthetic */ void Ddq() {
    }

    public final void AOu() {
        SurfaceTexture surfaceTexture = this.A04;
        if (surfaceTexture != null) {
            this.A05.post(new M6N(surfaceTexture, this));
        }
        this.A04 = null;
    }

    public final void APr(PhotoFilter photoFilter, FilterGroupModel filterGroupModel, 0sP r5, int i, int i2) {
        this.A08.A02.post(new MA1(this, photoFilter, filterGroupModel, r5, i, i2));
    }

    public final void APy(PhotoFilter photoFilter, FilterGroupModel filterGroupModel) {
        this.A03 = photoFilter;
        SurfaceTexture surfaceTexture = this.A04;
        if (surfaceTexture != null) {
            this.A05.post(new M6O(surfaceTexture, this));
        }
    }

    public final void E25() {
        Handler handler = this.A05;
        Runnable runnable = this.A0A;
        handler.removeCallbacks(runnable);
        handler.postAtFrontOfQueue(runnable);
    }

    public C64910LkA(UserSession userSession, JWI jwi, JWJ jwj, C364808m2 r5) {
        AnonymousClass7TG.A1O(userSession, jwj);
        this.A06 = userSession;
        this.A08 = jwj;
        this.A09 = r5;
        this.A07 = jwi;
        this.A05 = jwj.A02;
    }
}
