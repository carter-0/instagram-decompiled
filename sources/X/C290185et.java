package X;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.5et  reason: invalid class name and case insensitive filesystem */
public final class C290185et implements ViewTranslationCallback {
    public static final C290185et A00 = new Object();

    public final boolean onClearTranslation(View view) {
        C290145ep r0;
        C62320sa r02;
        View view2 = view;
        0qQ.A0C(view2, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        AndroidContentCaptureManager androidContentCaptureManager = ((AndroidComposeView) view2).A04;
        androidContentCaptureManager.A04 = AnonymousClass05K.A00;
        01O A06 = androidContentCaptureManager.A06();
        Object[] objArr = A06.A04;
        long[] jArr = A06.A03;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((-1 ^ j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                int i2 = 8 - (((i - length) ^ -1) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        AnonymousClass5SV r1 = ((C290215ex) objArr[(i << 3) + i3]).A01.A05;
                        if (!(C285765So.A00(r1, AnonymousClass5SZ.A0F) == null || (r0 = (C290145ep) C285765So.A00(r1, C290125en.A00)) == null || (r02 = (C62320sa) r0.A01) == null)) {
                            r02.invoke();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        C290145ep r0;
        0sP r1;
        View view2 = view;
        0qQ.A0C(view2, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        AndroidContentCaptureManager androidContentCaptureManager = ((AndroidComposeView) view2).A04;
        androidContentCaptureManager.A04 = AnonymousClass05K.A00;
        01O A06 = androidContentCaptureManager.A06();
        Object[] objArr = A06.A04;
        long[] jArr = A06.A03;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((-1 ^ j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                int i2 = 8 - (((i - length) ^ -1) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        AnonymousClass5SV r2 = ((C290215ex) objArr[(i << 3) + i3]).A01.A05;
                        if (!(!0qQ.A0K(C285765So.A00(r2, AnonymousClass5SZ.A0F), true) || (r0 = (C290145ep) C285765So.A00(r2, C290125en.A0Q)) == null || (r1 = r0.A01) == null)) {
                            r1.invoke(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        C290145ep r0;
        0sP r1;
        View view2 = view;
        0qQ.A0C(view2, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        AndroidContentCaptureManager androidContentCaptureManager = ((AndroidComposeView) view2).A04;
        androidContentCaptureManager.A04 = AnonymousClass05K.A01;
        01O A06 = androidContentCaptureManager.A06();
        Object[] objArr = A06.A04;
        long[] jArr = A06.A03;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((-1 ^ j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                int i2 = 8 - (((i - length) ^ -1) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        AnonymousClass5SV r2 = ((C290215ex) objArr[(i << 3) + i3]).A01.A05;
                        if (!(!0qQ.A0K(C285765So.A00(r2, AnonymousClass5SZ.A0F), false) || (r0 = (C290145ep) C285765So.A00(r2, C290125en.A0Q)) == null || (r1 = r0.A01) == null)) {
                            r1.invoke(true);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
