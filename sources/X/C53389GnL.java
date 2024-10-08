package X;

import android.view.View;
import com.instagram.api.schemas.LimitedInteractionsVersions;
import com.instagram.clips.intf.ClipsViewerConfig;
import java.util.List;

/* renamed from: X.GnL  reason: case insensitive filesystem */
public final class C53389GnL extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;
    public final boolean A08;

    public C53389GnL(C53394GnR gnR, Float f, Float f2, Float f3, Float f4, Float f5, int i, boolean z, boolean z2) {
        f = (i & 1) != 0 ? null : f;
        f2 = (i & 2) != 0 ? null : f2;
        f3 = (i & 4) != 0 ? null : f3;
        f4 = (i & 8) != 0 ? null : f4;
        f5 = (i & 16) != 0 ? null : f5;
        gnR = (i & 32) != 0 ? null : gnR;
        this.A00 = 0;
        this.A05 = f;
        this.A06 = f2;
        this.A03 = f3;
        this.A04 = f4;
        this.A01 = f5;
        this.A02 = gnR;
        this.A08 = z;
        this.A07 = z2;
    }

    public final void A00(View view, boolean z) {
        Number number = (Number) this.A05;
        float f = 0.0f;
        if (number != null) {
            float floatValue = number.floatValue();
            if (z) {
                floatValue = 0.0f;
            }
            view.setTranslationX(floatValue);
        }
        Number number2 = (Number) this.A06;
        if (number2 != null) {
            float floatValue2 = number2.floatValue();
            if (!z) {
                f = floatValue2;
            }
            view.setTranslationY(f);
        }
        Number number3 = (Number) this.A03;
        float f2 = 1.0f;
        if (number3 != null) {
            float floatValue3 = number3.floatValue();
            if (z) {
                floatValue3 = 1.0f;
            }
            view.setScaleX(floatValue3);
        }
        Number number4 = (Number) this.A04;
        if (number4 != null) {
            float floatValue4 = number4.floatValue();
            if (z) {
                floatValue4 = 1.0f;
            }
            view.setScaleY(floatValue4);
        }
        Number number5 = (Number) this.A01;
        if (number5 != null) {
            float floatValue5 = number5.floatValue();
            if (!z) {
                f2 = floatValue5;
            }
            view.setAlpha(f2);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C53389GnL) {
                    C53389GnL gnL = (C53389GnL) obj;
                    if (gnL.A00 == 0 && 0qQ.A0K(this.A05, gnL.A05) && 0qQ.A0K(this.A06, gnL.A06) && 0qQ.A0K(this.A03, gnL.A03) && 0qQ.A0K(this.A04, gnL.A04) && 0qQ.A0K(this.A01, gnL.A01) && 0qQ.A0K(this.A02, gnL.A02) && this.A08 == gnL.A08) {
                        z = this.A07;
                        z2 = gnL.A07;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C53389GnL) {
                    C53389GnL gnL2 = (C53389GnL) obj;
                    if (gnL2.A00 == 1 && 0qQ.A0K(this.A01, gnL2.A01) && 0qQ.A0K(this.A02, gnL2.A02) && 0qQ.A0K(this.A03, gnL2.A03) && 0qQ.A0K(this.A04, gnL2.A04) && 0qQ.A0K(this.A05, gnL2.A05) && this.A06 == gnL2.A06 && this.A07 == gnL2.A07) {
                        z = this.A08;
                        z2 = gnL2.A08;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C53389GnL)) {
                    return false;
                }
                C53389GnL gnL3 = (C53389GnL) obj;
                if (gnL3.A00 != 2 || !0qQ.A0K(this.A04, gnL3.A04) || !0qQ.A0K(this.A05, gnL3.A05) || this.A07 != gnL3.A07 || !0qQ.A0K(this.A01, gnL3.A01) || this.A02 != gnL3.A02 || this.A08 != gnL3.A08 || !0qQ.A0K(this.A06, gnL3.A06) || !0qQ.A0K(this.A03, gnL3.A03)) {
                    return false;
                }
                return true;
        }
        if (z != z2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        boolean z;
        int i2;
        String str;
        switch (this.A00) {
            case 0:
                i = AnonymousClass7TF.A09(this.A08, ((((((((((AnonymousClass7TG.A0C(this.A05) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02)) * 31);
                z = this.A07;
                break;
            case 1:
                i = AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A07(this.A06, ((((((((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A05)) * 31));
                z = this.A08;
                break;
            default:
                int A072 = AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A07(this.A05, AnonymousClass7TE.A0K(this.A04))));
                int A0M = AnonymousClass7TE.A0M(this.A02);
                switch (A0M) {
                    case 1:
                        str = "ORGANIC_COLLAB";
                        break;
                    case 2:
                        str = "AD_DUAL_AUTHOR";
                        break;
                    case 3:
                        str = "POLITICAL_AD_SINGLE_AUTHOR";
                        break;
                    case 4:
                        str = "GROUP_PROFILE";
                        break;
                    case 5:
                        str = "CLIPS_SPINS";
                        break;
                    default:
                        str = "ORGANIC_OR_AD_SINGLE_AUTHOR";
                        break;
                }
                i = AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A09(this.A08, C51971G9r.A0F(str, A0M, A072)));
                i2 = this.A03.hashCode();
                break;
        }
        i2 = 1237;
        if (z) {
            i2 = 1231;
        }
        return i + i2;
    }

    public final String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("GridItemAnimation(translationX=");
        A1A.append(this.A05);
        A1A.append(C273654mx.A00(203));
        A1A.append(this.A06);
        A1A.append(", scaleX=");
        A1A.append(this.A03);
        A1A.append(C273654mx.A00(451));
        A1A.append(this.A04);
        A1A.append(", alpha=");
        A1A.append(this.A01);
        A1A.append(", option=");
        A1A.append(this.A02);
        A1A.append(", existsBefore=");
        A1A.append(this.A08);
        A1A.append(", existsAfter=");
        return G9t.A1C(A1A, this.A07);
    }

    public C53389GnL(ClipsViewerConfig clipsViewerConfig, C267324bN r3, C52058GDe gDe, 1Xj r5, Integer num, List list, boolean z, boolean z2) {
        0qQ.A0B(num, 5);
        this.A04 = r3;
        this.A05 = gDe;
        this.A07 = z;
        this.A01 = list;
        this.A02 = num;
        this.A08 = z2;
        this.A06 = r5;
        this.A03 = clipsViewerConfig;
    }

    public C53389GnL(C294485mX r2, YBJ ybj, LimitedInteractionsVersions limitedInteractionsVersions, Boolean bool, Long l, Long l2, boolean z, boolean z2) {
        this.A01 = bool;
        this.A02 = r2;
        this.A03 = ybj;
        this.A04 = l;
        this.A05 = l2;
        this.A06 = limitedInteractionsVersions;
        this.A07 = z;
        this.A08 = z2;
    }

    public C53389GnL() {
        this((C294485mX) null, (YBJ) null, LimitedInteractionsVersions.UNRECOGNIZED, (Boolean) null, (Long) null, (Long) null, false, false);
    }
}
