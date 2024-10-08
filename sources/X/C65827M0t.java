package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import java.io.File;

/* renamed from: X.M0t  reason: case insensitive filesystem */
public final class C65827M0t implements C13825Thv, B28 {
    public boolean A00;
    public final C378379Po A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final Context A05;
    public final FrameLayout A06;
    public final UserSession A07;
    public final ConstrainedTextureView A08;
    public final MSD A09;
    public final C13830Ti1 A0A;

    public final void CLS() {
    }

    public final void DYn() {
    }

    public final void Ddj(AnonymousClass9RG r10, AnonymousClass9R7 r11) {
        UserSession userSession = this.A07;
        C8826RBc rBc = new C8826RBc(this.A05, userSession, r10, r11, this, this.A0A, false);
        if (rBc.A09) {
            rBc.A09();
        } else {
            rBc.A0B = true;
        }
    }

    public final void Ddk() {
    }

    public final void Eub() {
    }

    public final void FLP() {
    }

    public final void EK8() {
        boolean z = this.A00;
        Context context = this.A05;
        UserSession userSession = this.A07;
        if (z) {
            Point C4P = this.A0A.C4P();
            float f = this.A02;
            int i = this.A04;
            MSD msd = this.A09;
            DbW.A1N(C4P, 2, msd);
            Bitmap A002 = C7245Q0r.A00(C4P.x, C4P.y);
            Bitmap A092 = 1MF.A09(A002, C4P.x, C4P.y, 0, false);
            0qQ.A07(A092);
            LT1.A02(context, A092, userSession, msd, (File) null, f, i);
            A002.recycle();
            this.A00 = false;
            return;
        }
        LT1.A01(context, this.A08.getBitmap(), (Bitmap) null, userSession, this.A09, (File) null, this.A02, this.A04, this.A03);
    }

    public C65827M0t(Context context, FrameLayout frameLayout, UserSession userSession, MSD msd, C13830Ti1 ti1, float f, int i, int i2) {
        boolean A1Y = DbW.A1Y(userSession);
        this.A05 = context;
        this.A07 = userSession;
        this.A06 = frameLayout;
        this.A02 = f;
        this.A04 = i;
        this.A03 = i2;
        this.A09 = msd;
        this.A0A = ti1;
        C378379Po r2 = new C378379Po(context, userSession, "live_cover_photo_selector");
        this.A01 = r2;
        ConstrainedTextureView constrainedTextureView = new ConstrainedTextureView(context);
        r2.A03 = constrainedTextureView;
        constrainedTextureView.setSurfaceTextureListener(r2);
        frameLayout.addView(constrainedTextureView, 0);
        this.A08 = constrainedTextureView;
        this.A00 = A1Y;
    }
}
