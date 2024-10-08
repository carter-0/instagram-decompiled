package X;

import android.content.Context;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;

/* renamed from: X.4b9  reason: invalid class name and case insensitive filesystem */
public final class C267214b9 extends C243963aQ {
    public static final C246773fD A08 = new Object();
    public final 2WX A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final C246613et A03;
    public final C246753fB A04;
    public final AnonymousClass339 A05;
    public final CharSequence A06;
    public final C246663ey A07;

    public C267214b9(2WX r2, UserSession userSession, AnonymousClass4DU r4, C246613et r5, C246753fB r6, C246663ey r7, AnonymousClass339 r8, CharSequence charSequence) {
        0qQ.A0B(r6, 3);
        0qQ.A0B(r8, 4);
        0qQ.A0B(r4, 5);
        0qQ.A0B(userSession, 6);
        0qQ.A0B(charSequence, 7);
        this.A07 = r7;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r8;
        this.A02 = r4;
        this.A01 = userSession;
        this.A06 = charSequence;
        this.A00 = r2;
    }

    public static final C267264bH A00(SimpleZoomableViewContainer simpleZoomableViewContainer, C267214b9 r7) {
        C267264bH r2;
        if (Systrace.A0E(1)) {
            0fS.A01("createOrGetPrimitiveHolder", -660600388);
        }
        try {
            Object tag = simpleZoomableViewContainer.getTag(R.id.litho_image_media_primitive);
            if (!(tag instanceof C267264bH) || (r2 = (C267264bH) tag) == null) {
                Context context = simpleZoomableViewContainer.getContext();
                if (context != null) {
                    r2 = new C267264bH(context, r7.A01, simpleZoomableViewContainer);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            simpleZoomableViewContainer.setTag(R.id.litho_image_media_primitive, r2);
            return r2;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(1804236225);
            }
        }
    }

    public static final C246663ey A04(SimpleZoomableViewContainer simpleZoomableViewContainer, C267214b9 r7) {
        if (Systrace.A0E(1)) {
            0fS.A01("getBoundedLithoMediaViewHolder", 2025632417);
        }
        try {
            C267264bH A002 = A00(simpleZoomableViewContainer, r7);
            C246663ey r2 = r7.A07;
            r2.A00 = simpleZoomableViewContainer.getContext();
            r2.A06 = A002.A01;
            r2.A09 = A002.A03;
            r2.A0A.A01 = A002.A02;
            AnonymousClass3Ux r1 = A002.A00;
            0qQ.A0B(r1, 0);
            r2.A05 = r1;
            return r2;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-89929792);
            }
        }
    }
}
