package X;

import android.content.res.Resources;
import android.util.Size;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Oci  reason: case insensitive filesystem */
public final class C71104Oci {
    public static final C71104Oci A00 = new Object();

    public static final Size A00(View view, boolean z, boolean z2, boolean z3) {
        int i;
        int dimensionPixelSize;
        0qQ.A0B(view, 0);
        Resources resources = view.getResources();
        if (z3) {
            i = R.dimen.audio_dubbing_gen_ai_gif_size;
        } else {
            i = R.dimen.challenge_sticker_v2_facepile_offsetY;
            if (z2) {
                i = R.dimen.direct_multi_media_message_fixed_height;
            }
        }
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i);
        if (z2) {
            dimensionPixelSize = (int) (((float) dimensionPixelSize2) * 0.75f);
        } else {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.ai_agent_embodiment_video_container_size);
        }
        if (z) {
            dimensionPixelSize2 = (int) (((float) dimensionPixelSize) * 0.75f);
        }
        return new Size(dimensionPixelSize, dimensionPixelSize2);
    }

    public static final void A01(View view, int i, int i2, boolean z) {
        int min = Math.min(4, i2) - 1;
        float f = (float) view.getLayoutParams().height;
        float f2 = 0.048f;
        if (z) {
            f2 = 0.1f;
        }
        0nA.A0e(view, (int) (((float) (min - i)) * f * f2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = 2
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            if (r5 == 0) goto L_0x0017
            r0 = 1
            if (r4 != r0) goto L_0x001c
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            int r0 = r0.width
            float r0 = (float) r0
            float r0 = r0 * r1
            int r0 = (int) r0
            int r0 = -r0
        L_0x0013:
            X.0nA.A0d(r3, r0)
            return
        L_0x0017:
            if (r4 == 0) goto L_0x002b
            if (r4 == r2) goto L_0x001f
            r2 = 3
        L_0x001c:
            if (r4 == r2) goto L_0x002b
            return
        L_0x001f:
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            int r0 = r0.width
            float r0 = (float) r0
            float r0 = r0 * r1
            int r0 = (int) r0
            int r0 = r0 * 2
            goto L_0x0013
        L_0x002b:
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            int r0 = r0.width
            float r0 = (float) r0
            float r0 = r0 * r1
            int r0 = (int) r0
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71104Oci.A02(android.view.View, int, boolean):void");
    }

    public final void A03(View view, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(view, 0);
        Size A002 = A00(view, z, z2, z3);
        view.getLayoutParams().height = A002.getHeight();
        view.getLayoutParams().width = A002.getWidth();
    }
}
