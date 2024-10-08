package X;

import com.instagram.android.R;
import com.instagram.api.schemas.MidCardClipsClickedAction;
import com.instagram.api.schemas.MidCardLayoutType;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.GrI  reason: case insensitive filesystem */
public final class C53603GrI extends AnonymousClass0T0 implements JRE {
    public final int A00;
    public final MidCardClipsClickedAction A01;
    public final JSG A02;
    public final C53451Goj A03;
    public final C53451Goj A04;
    public final MidCardLayoutType A05;
    public final ImageUrl A06;
    public final Long A07;
    public final String A08;
    public final List A09;
    public final List A0A;
    public final AnonymousClass0Ud A0B;
    public final int A0C = R.dimen.account_discovery_bottom_gap;
    public final int A0D = R.dimen.abc_select_dialog_padding_start_material;
    public final JNH A0E;
    public final String A0F;
    public final boolean A0G;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53603GrI) {
                C53603GrI grI = (C53603GrI) obj;
                if (!0qQ.A0K(this.A07, grI.A07) || !0qQ.A0K(this.A09, grI.A09) || !0qQ.A0K(this.A0F, grI.A0F) || !0qQ.A0K(this.A06, grI.A06) || this.A0G != grI.A0G || !0qQ.A0K(this.A08, grI.A08) || !0qQ.A0K(this.A0B, grI.A0B) || this.A0D != grI.A0D || this.A0C != grI.A0C || this.A00 != grI.A00 || this.A01 != grI.A01 || !0qQ.A0K(this.A02, grI.A02) || this.A05 != grI.A05 || !0qQ.A0K(this.A0E, grI.A0E) || !0qQ.A0K(this.A04, grI.A04) || !0qQ.A0K(this.A03, grI.A03) || !0qQ.A0K(this.A0A, grI.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int Alh() {
        return this.A00;
    }

    public final String Anz() {
        return this.A08;
    }

    public final int AtW() {
        return this.A0C;
    }

    public final ImageUrl BGK() {
        return this.A06;
    }

    public final int BJV() {
        return this.A0D;
    }

    public final MidCardLayoutType BT0() {
        return this.A05;
    }

    public final JNH BZm() {
        return this.A0E;
    }

    public final boolean CRX() {
        return this.A0G;
    }

    public final String getMediaId() {
        return this.A0F;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A08, AnonymousClass7TF.A09(this.A0G, ((((((AnonymousClass7TG.A0C(this.A07) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A0F)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31));
        return ((((AnonymousClass7TF.A07(this.A0E, AnonymousClass7TF.A07(this.A05, (((((((((AnonymousClass7TF.A07(this.A0B, A082) + this.A0D) * 31) + this.A0C) * 31) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31)) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A0A);
    }

    public C53603GrI(MidCardClipsClickedAction midCardClipsClickedAction, JSG jsg, C53451Goj goj, C53451Goj goj2, MidCardLayoutType midCardLayoutType, ImageUrl imageUrl, JNH jnh, Long l, String str, String str2, List list, List list2, AnonymousClass0Ud r16, int i, boolean z) {
        this.A07 = l;
        this.A09 = list;
        this.A0F = str;
        this.A06 = imageUrl;
        this.A0G = z;
        this.A08 = str2;
        this.A0B = r16;
        this.A00 = i;
        this.A01 = midCardClipsClickedAction;
        this.A02 = jsg;
        this.A05 = midCardLayoutType;
        this.A0E = jnh;
        this.A04 = goj;
        this.A03 = goj2;
        this.A0A = list2;
    }
}
