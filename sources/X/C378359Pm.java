package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.9Pm  reason: invalid class name and case insensitive filesystem */
public final class C378359Pm implements AnonymousClass1MK {
    public final int A00;
    public final UserSession A01;
    public final WeakReference A02;
    public final WeakReference A03;

    public final void CyF(C226952iF r13, AnonymousClass3LX r14) {
        0qQ.A0B(r14, 1);
        C353238Gu.A02.remove(this);
        Context context = (Context) this.A02.get();
        C3498081w r3 = (C3498081w) this.A03.get();
        if (context != null && r3 != null) {
            Resources resources = context.getResources();
            boolean A0L = 2Yu.A0L(context, R.attr.quickCaptureControllerGalleryButtonCircular, false);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
            int A0D = AnonymousClass7TE.A0D(resources);
            int i = this.A00;
            Bitmap bitmap = r14.A01;
            0qQ.A0A(bitmap);
            r3.EZd(new C348417yP(context, bitmap, (float) dimensionPixelSize, (float) A0D, i, 0, A0L));
        }
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final void DJx(C226952iF r4, C254673sr r5) {
        0kD.A0A("GalleryThumbnailCacheUtil", "Failed to load gallery button", (Throwable) null);
        C353238Gu.A02.remove(this);
    }

    public C378359Pm(Context context, UserSession userSession, C3498081w r4) {
        this.A01 = userSession;
        this.A02 = new WeakReference(context);
        this.A03 = new WeakReference(r4);
        if (context != null) {
            this.A00 = (int) 0nA.A04(context, 34);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
