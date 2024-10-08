package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.common.math.matrix.Matrix4;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedMultiListenerTextureView;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.creation.photo.edit.effectfilter.UnifiedVideoCoverFrameFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.pendingmedia.model.ClipInfo;

/* renamed from: X.Lk5  reason: case insensitive filesystem */
public final class C64905Lk5 implements C66539MVt, TextureView.SurfaceTextureListener {
    public ConstrainedTextureView A00;
    public C378369Pn A01;
    public boolean A02;
    public boolean A03;
    public C62922Koa A04;
    public boolean A05;
    public final ViewGroup A06;
    public final FilterGroupModel A07;
    public final Rect A08 = AnonymousClass7TE.A0W();
    public final View A09;
    public final FilterChain A0A;
    public final UserSession A0B;
    public final MVM A0C;
    public final ConstrainedMultiListenerTextureView A0D;
    public final AnonymousClass3Q2 A0E;

    public C64905Lk5(View view, UserSession userSession, MVM mvm, FilterGroupModel filterGroupModel, AnonymousClass3Q2 r8, int i, int i2) {
        FilterChain filterChain;
        AnonymousClass7TF.A1E(mvm, 3, userSession);
        this.A09 = view;
        this.A0E = r8;
        this.A0C = mvm;
        this.A07 = filterGroupModel;
        this.A0B = userSession;
        ViewGroup A0I = DbX.A0I(view, R.id.album_filter_view_container);
        this.A06 = A0I;
        ConstrainedMultiListenerTextureView constrainedMultiListenerTextureView = new ConstrainedMultiListenerTextureView(AnonymousClass7TE.A0S(view));
        this.A0D = constrainedMultiListenerTextureView;
        constrainedMultiListenerTextureView.A02(this);
        constrainedMultiListenerTextureView.setAspectRatio(r8.A02);
        A0I.addView(constrainedMultiListenerTextureView, 0);
        mvm.CMr(constrainedMultiListenerTextureView, i, i2);
        if (filterGroupModel != null) {
            filterChain = ((FilterGroupModelImpl) filterGroupModel).A02;
        } else {
            filterChain = null;
        }
        this.A0A = filterChain;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.ADk] */
    public final void A03(C378379Po r13) {
        if (this.A00 == null) {
            ConstrainedTextureView constrainedTextureView = new ConstrainedTextureView(AnonymousClass7TE.A0S(this.A09));
            r13.A03 = constrainedTextureView;
            this.A00 = constrainedTextureView;
            this.A06.addView(constrainedTextureView, 1);
        }
        Matrix4 matrix4 = C378369Pn.A0R;
        C378369Pn r5 = new C378369Pn(this.A09.getContext(), this.A0B, new Object(), "feed", true, true);
        this.A01 = r5;
        ConstrainedTextureView constrainedTextureView2 = this.A00;
        if (constrainedTextureView2 != null) {
            0qQ.A0B(r5, 0);
            r13.A06 = r5;
            constrainedTextureView2.setSurfaceTextureListener(r13);
            AnonymousClass3Q2 r4 = this.A0E;
            constrainedTextureView2.setAspectRatio(r4.A02);
            r5.A08(r4, 0);
            if (r4.A1N != C376399Hv.A00()) {
                ClipInfo clipInfo = r4.A1N;
                int i = clipInfo.A09;
                int i2 = clipInfo.A06;
                r13.A01 = i;
                r13.A00 = i2;
            }
            FilterChain filterChain = this.A0A;
            if (filterChain != null) {
                AnonymousClass3QG r0 = r4.A1i;
                C63122Krq.A00(filterChain, r0.A01, r0.A00);
            }
            this.A03 = true;
            this.A02 = false;
            r5.A06(new C65231Lpb(this));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final boolean CeS() {
        return true;
    }

    public final void CnG() {
    }

    public final void Ee2() {
        this.A05 = true;
    }

    public final void Ekd() {
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.creation.photo.edit.effectfilter.PhotoFilter, com.instagram.creation.photo.edit.effectfilter.UnifiedVideoCoverFrameFilter] */
    private final UnifiedVideoCoverFrameFilter A00() {
        UserSession userSession = this.A0B;
        1Yt A002 = C353948Ka.A00(userSession);
        AnonymousClass3Q2 r3 = this.A0E;
        ? photoFilter = new PhotoFilter(userSession, A002.A01(r3.A1i.A01), AnonymousClass05K.A0C);
        photoFilter.A00(r3.A1i.A00);
        return photoFilter;
    }

    public static void A01(C64905Lk5 lk5) {
        C378369Pn r2 = lk5.A01;
        if (r2 != null) {
            r2.A00();
            lk5.A06.removeView(lk5.A00);
            r2.A06((C41838B2t) null);
            lk5.A00 = null;
            lk5.A01 = null;
        }
    }

    public final void A02() {
        if (!this.A02) {
            this.A02 = true;
            C378369Pn r0 = this.A01;
            if (r0 != null) {
                r0.A01();
            }
        }
    }

    public final void Afv(C60586Jnv jnv, int i, int i2) {
        this.A0C.APr(A00(), this.A07, new C58727Iwa(jnv, 25), i, i2);
    }

    public final Bitmap Ayu(int i, int i2) {
        Bitmap bitmap = this.A0D.getBitmap(i, i2);
        if (bitmap != null) {
            return bitmap;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final String Bjh() {
        return this.A0E.A33;
    }

    public final void Cn5() {
        if (this.A05) {
            this.A05 = false;
            C378369Pn r3 = this.A01;
            if (r3 != null) {
                AnonymousClass3Q2 r0 = this.A0E;
                r3.A08(r0, 0);
                FilterChain filterChain = this.A0A;
                if (filterChain != null) {
                    AnonymousClass3QG r02 = r0.A1i;
                    C63122Krq.A00(filterChain, r02.A01, r02.A00);
                }
                r3.CnC();
            }
            this.A0C.APy(A00(), this.A07);
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.Koa, java.lang.Object] */
    public final boolean E2V(C273534mk r7) {
        C273534mk r3 = r7;
        C65160LoP loP = new C65160LoP(this.A09.getContext(), this.A0B, r3, this.A0D, this.A0E);
        FilterGroupModel filterGroupModel = this.A07;
        if (filterGroupModel == null) {
            return false;
        }
        ? obj = new Object();
        obj.A00 = loP;
        11Z.A04(new M28(obj), 2000);
        this.A04 = obj;
        this.A0C.APy(A00(), filterGroupModel);
        return true;
    }

    public final boolean isVisible() {
        return this.A09.getLocalVisibleRect(this.A08);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        MVM mvm = this.A0C;
        mvm.CMr(this.A0D, i, i2);
        mvm.APy(A00(), this.A07);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A0C.AOu();
        return false;
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C62922Koa koa = this.A04;
        if (koa != null) {
            this.A04 = null;
            C65160LoP loP = koa.A00;
            if (loP != null) {
                koa.A00 = null;
                11Z.A04(new M2A(loP), 17);
            }
        }
    }

    public final void cleanup() {
        A01(this);
        this.A02 = false;
        this.A06.removeView(this.A0D);
    }
}
