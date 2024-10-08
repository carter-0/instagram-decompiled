package X;

import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.Jv9  reason: case insensitive filesystem */
public final class C61009Jv9 extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public C61009Jv9(TargetViewSizeProvider targetViewSizeProvider, AudioOverlayTrack audioOverlayTrack, C349307zv r4, Integer num, int i, int i2, int i3) {
        this.A07 = r4;
        this.A04 = audioOverlayTrack;
        this.A06 = targetViewSizeProvider;
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A05 = num;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C61009Jv9)) {
                return false;
            }
            C61009Jv9 jv9 = (C61009Jv9) obj;
            if (jv9.A00 != 1 || this.A01 != jv9.A01 || !0qQ.A0K(this.A07, jv9.A07) || !0qQ.A0K(this.A05, jv9.A05) || this.A03 != jv9.A03 || !0qQ.A0K(this.A04, jv9.A04) || !0qQ.A0K(this.A06, jv9.A06)) {
                return false;
            }
            return true;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C61009Jv9)) {
                return false;
            }
            C61009Jv9 jv92 = (C61009Jv9) obj;
            if (jv92.A00 == 0 && 0qQ.A0K(this.A07, jv92.A07) && 0qQ.A0K(this.A04, jv92.A04) && 0qQ.A0K(this.A06, jv92.A06) && this.A01 == jv92.A01 && this.A03 == jv92.A03 && this.A02 == jv92.A02 && this.A05 == jv92.A05) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int A072;
        int A002;
        if (this.A00 != 0) {
            A072 = (((((AnonymousClass7TF.A07(this.A07, this.A01 * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + this.A03) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31;
            A002 = AnonymousClass7TE.A0L(this.A06);
        } else {
            A072 = (((((AnonymousClass7TF.A07(this.A06, ((AnonymousClass7TG.A0C(this.A07) * 31) + AnonymousClass7TE.A0L(this.A04)) * 31) + this.A01) * 31) + this.A03) * 31) + this.A02) * 31;
            A002 = C63169Ksc.A00((Integer) this.A05);
        }
        return A072 + A002;
    }

    public C61009Jv9(C61072JwA jwA, Integer num, 0sP r7, 0sP r8, int i, int i2) {
        num = (i2 & 4) != 0 ? null : num;
        int i3 = (i2 & 8) != 0 ? R.attr.igdsPrimaryIcon : 0;
        jwA = (i2 & 16) != 0 ? null : jwA;
        r8 = (i2 & 32) != 0 ? null : r8;
        this.A00 = 1;
        this.A01 = i;
        this.A07 = r7;
        this.A05 = num;
        this.A03 = i3;
        this.A04 = jwA;
        this.A06 = r8;
        this.A02 = i;
    }
}
