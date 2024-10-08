package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;

/* renamed from: X.9c0  reason: invalid class name and case insensitive filesystem */
public final class C381589c0 extends AnonymousClass0T0 {
    public final Context A00;
    public final Bitmap A01;
    public final TargetViewSizeProvider A02;
    public final CameraSpec A03;
    public final C366678pU A04;
    public final C392069u9 A05;
    public final C352218Cl A06;
    public final C349307zv A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381589c0) {
                C381589c0 r5 = (C381589c0) obj;
                if (!0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A03, r5.A03) || this.A0A != r5.A0A) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A05, ((AnonymousClass7TG.A0C(this.A07) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31 * 31);
        int A082 = (((AnonymousClass7TF.A08(this.A08, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A00, (AnonymousClass7TF.A07(this.A04, A072) + AnonymousClass7TG.A0C(this.A01)) * 31))) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TE.A0L(this.A03)) * 31;
        int i = 1237;
        if (this.A0A) {
            i = 1231;
        }
        return A082 + i;
    }

    public C381589c0(Context context, Bitmap bitmap, TargetViewSizeProvider targetViewSizeProvider, CameraSpec cameraSpec, C366678pU r5, C392069u9 r6, C352218Cl r7, C349307zv r8, String str, String str2, boolean z) {
        this.A07 = r8;
        this.A06 = r7;
        this.A05 = r6;
        this.A04 = r5;
        this.A01 = bitmap;
        this.A00 = context;
        this.A02 = targetViewSizeProvider;
        this.A08 = str;
        this.A09 = str2;
        this.A03 = cameraSpec;
        this.A0A = z;
    }
}
