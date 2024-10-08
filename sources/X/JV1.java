package X;

import com.instagram.creatortools.api.schemas.CreatorToolsComponent;
import java.util.Set;

public final class JV1 extends AnonymousClass0T0 {
    public final int A00 = 2;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public JV1(JV2 jv2, AnonymousClass5GP r4, Set set, AnonymousClass62P r6, AnonymousClass62P r7, int i) {
        0qQ.A0B(r4, 1);
        AnonymousClass7TF.A1D(set, 2, r7);
        this.A04 = r4;
        this.A03 = set;
        this.A06 = r6;
        this.A02 = r7;
        this.A01 = i;
        this.A05 = jv2;
    }

    public final boolean equals(Object obj) {
        int i;
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof JV1) {
                    JV1 jv1 = (JV1) obj;
                    if (jv1.A00 == 2 && 0qQ.A0K(this.A04, jv1.A04) && 0qQ.A0K(this.A03, jv1.A03) && 0qQ.A0K(this.A06, jv1.A06) && 0qQ.A0K(this.A02, jv1.A02) && this.A01 == jv1.A01) {
                        obj2 = this.A05;
                        obj3 = jv1.A05;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
        }
        if (!(obj instanceof JV1)) {
            return false;
        }
        JV1 jv12 = (JV1) obj;
        if (jv12.A00 != i || this.A02 != jv12.A02 || !0qQ.A0K(this.A03, jv12.A03) || !0qQ.A0K(this.A04, jv12.A04) || !0qQ.A0K(this.A05, jv12.A05) || this.A01 != jv12.A01) {
            return false;
        }
        obj2 = this.A06;
        obj3 = jv12.A06;
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K;
        int A0L;
        switch (this.A00) {
            case 0:
                A0K = (((((((AnonymousClass7TE.A0K(this.A02) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + this.A01) * 31;
                A0L = AnonymousClass7TE.A0L(this.A06);
                break;
            case 1:
                A0K = (((((((AnonymousClass7TE.A0K(this.A02) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + this.A01) * 31;
                A0L = AnonymousClass7TE.A0L(this.A06);
                break;
            default:
                int A0K2 = AnonymousClass7TE.A0K(this.A04);
                A0K = (AnonymousClass7TF.A07(this.A02, (AnonymousClass7TF.A07(this.A03, A0K2) + AnonymousClass7TG.A0C(this.A06)) * 31) + this.A01) * 31;
                A0L = AnonymousClass7TE.A0L(this.A05);
                break;
        }
        return A0K + A0L;
    }

    public JV1(N49 n49, C47184Drz drz, C47184Drz drz2, C47184Drz drz3, CreatorToolsComponent creatorToolsComponent, int i) {
        0qQ.A0B(creatorToolsComponent, 1);
        this.A02 = creatorToolsComponent;
        this.A03 = drz;
        this.A04 = drz2;
        this.A05 = drz3;
        this.A01 = i;
        this.A06 = n49;
    }

    public JV1(C61084JwM jwM, JV7 jv7, JV7 jv72, MWD mwd, CreatorToolsComponent creatorToolsComponent, int i) {
        0qQ.A0B(creatorToolsComponent, 1);
        this.A02 = creatorToolsComponent;
        this.A03 = jv7;
        this.A04 = jv72;
        this.A05 = mwd;
        this.A01 = i;
        this.A06 = jwM;
    }

    public JV1() {
        this((JV2) null, (AnonymousClass5GP) AnonymousClass5GO.A00, (Set) 0sl.A00, (AnonymousClass62P) null, (AnonymousClass62P) AnonymousClass62M.A01, 0);
    }
}
