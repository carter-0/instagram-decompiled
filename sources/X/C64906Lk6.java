package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.SurfaceView;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.ui.ConstrainedMultiListenerTextureView;
import com.instagram.creation.base.ui.ConstrainedSurfaceView;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.model.creation.MediaCaptureConfig;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Lk6  reason: case insensitive filesystem */
public final class C64906Lk6 implements C66539MVt, AnonymousClass8KG {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final Rect A03;
    public final View A04;
    public final UserSession A05;
    public final MediaSession A06;
    public final JWG A07;
    public final AnonymousClass80G A08;
    public final C3499582p A09;
    public final MXQ A0A;
    public final C364848m7 A0B;
    public final FilterGroupModel A0C;
    public final boolean A0D;

    public final String Bjh() {
        return null;
    }

    public final boolean CeS() {
        return false;
    }

    public final void DpU(int i, int i2) {
    }

    public final boolean E2V(C273534mk r17) {
        C3499682q A002 = this.A09.A00();
        Context context = this.A04.getContext();
        UserSession userSession = this.A05;
        MediaSession mediaSession = this.A06;
        JWG jwg = this.A07;
        MediaCaptureConfig mediaCaptureConfig = ((JWE) A002).A01.A09;
        int BQn = mediaSession.BQn();
        C273534mk r7 = r17;
        C65161LoQ loQ = new C65161LoQ(context, userSession, r7, mediaSession, jwg, A002, (C267884cN) 0mE.A01(context, C267884cN.class), mediaCaptureConfig, (C267834cI) 0mE.A01(context, C267834cI.class), (CountDownLatch) null, BQn);
        loQ.A01 = false;
        return this.A0B.Cmo(loQ, this.A0C, new C62461KgB[]{C62461KgB.UPLOAD}, true);
    }

    public final void Ee2() {
        this.A00 = true;
    }

    public final void Afv(C60586Jnv jnv, int i, int i2) {
        this.A0B.APs(this.A0C, new C58727Iwa(jnv, 24), i, i2);
    }

    public final Bitmap Ayu(int i, int i2) {
        Bitmap bitmap;
        MultiListenerTextureView multiListenerTextureView = this.A08.A0D;
        if (multiListenerTextureView != null && (bitmap = multiListenerTextureView.getBitmap(i, i2)) != null) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i / 4, i2 / 4, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(-7829368);
        return createBitmap;
    }

    public final void Cn5() {
        if (!this.A00) {
            return;
        }
        if (this.A02) {
            this.A00 = false;
            this.A0A.APz(this.A0C);
            return;
        }
        this.A01 = true;
    }

    public final void CnG() {
        if (this.A0D && this.A00) {
            this.A0A.EoQ(this.A0C);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36326777555007452L) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DpX(android.view.Surface r7, int r8, int r9) {
        /*
            r6 = this;
            X.MXQ r5 = r6.A0A
            r5.CMq(r8, r9)
            com.instagram.common.session.UserSession r4 = r6.A05
            boolean r1 = X.2Ht.A03(r4)
            r3 = 0
            boolean r0 = r6.A01
            if (r1 == 0) goto L_0x002c
            if (r0 != 0) goto L_0x001f
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326777555007452(0x810f03000037dc, double:3.036538629754427E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0028
        L_0x001f:
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r6.A0C
            r5.APz(r0)
            r6.A00 = r3
            r6.A01 = r3
        L_0x0028:
            r0 = 1
            r6.A02 = r0
            return
        L_0x002c:
            if (r0 != 0) goto L_0x001f
            boolean r0 = r6.A0D
            if (r0 == 0) goto L_0x001f
            r5.EEp()
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64906Lk6.DpX(android.view.Surface, int, int):void");
    }

    public final void Dpb() {
        this.A0A.AOu();
        this.A01 = true;
    }

    public final void Ekd() {
        this.A0A.Ekd();
    }

    public final void cleanup() {
        DbS.A0E(this.A04, R.id.album_filter_view_container).removeView(this.A08.A05());
    }

    public final boolean isVisible() {
        return this.A04.getLocalVisibleRect(this.A03);
    }

    public C64906Lk6(View view, UserSession userSession, MediaSession mediaSession, JWG jwg, C3499582p r9, C364848m7 r10, FilterGroupModel filterGroupModel) {
        AnonymousClass80G r3;
        MXQ llh;
        AnonymousClass7TG.A1P(userSession, r10);
        0qQ.A0B(r9, 5);
        this.A05 = userSession;
        this.A04 = view;
        this.A0B = r10;
        this.A0C = filterGroupModel;
        this.A09 = r9;
        this.A06 = mediaSession;
        this.A07 = jwg;
        boolean CUZ = r10.CUZ();
        Context context = view.getContext();
        if (CUZ) {
            0qQ.A07(context);
            r3 = new AnonymousClass80G((SurfaceView) new ConstrainedSurfaceView(context));
        } else {
            0qQ.A07(context);
            r3 = new AnonymousClass80G((MultiListenerTextureView) new ConstrainedMultiListenerTextureView(context));
        }
        this.A08 = r3;
        this.A03 = AnonymousClass7TE.A0W();
        r3.A08(this);
        r3.A07(r9.A00().AAx());
        DbU.A0C(view, R.id.album_filter_view_container).addView(r3.A05(), 0);
        r10.ECc();
        if (2Ht.A03(userSession)) {
            llh = new C65005Lli(r3, r10);
        } else if (2Ht.A00) {
            llh = new C65006Llj(userSession, r3, r9, r10);
        } else {
            llh = new C65004Llh(r3.A06(), r10);
        }
        this.A0A = llh;
        this.A0D = 182.A06(0Tu.A06, userSession, 36323088178359121L);
        if (2Ht.A03(userSession)) {
            r3.A07(0.0f);
        }
    }
}
