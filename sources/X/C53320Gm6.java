package X;

import com.instagram.api.schemas.LineType;
import com.instagram.api.schemas.ThreadItemType;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Gm6  reason: case insensitive filesystem */
public final class C53320Gm6 extends AnonymousClass0T0 {
    public final LineType A00;
    public final ThreadItemType A01;
    public final JRG A02;
    public final User A03;
    public final Boolean A04;
    public final String A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53320Gm6) {
                C53320Gm6 gm6 = (C53320Gm6) obj;
                if (!(this.A00 == gm6.A00 && this.A01 == gm6.A01 && 0qQ.A0K(this.A02, gm6.A02) && 0qQ.A0K(this.A06, gm6.A06) && 0qQ.A0K(this.A03, gm6.A03) && this.A0A == gm6.A0A && this.A07 == gm6.A07 && 0qQ.A0K(this.A05, gm6.A05) && 0qQ.A0K(this.A04, gm6.A04) && this.A08 == gm6.A08 && this.A09 == gm6.A09 && this.A0B == gm6.A0B)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00)));
        int A092 = AnonymousClass7TF.A09(this.A0A, (AnonymousClass7TF.A07(this.A06, A072) + AnonymousClass7TG.A0C(this.A03)) * 31);
        return DbS.A06(this.A0B, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A08, (((AnonymousClass7TF.A09(this.A07, A092) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A04)) * 31)));
    }

    public C53320Gm6(LineType lineType, ThreadItemType threadItemType, JRG jrg, User user, Boolean bool, String str, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C51974G9v.A1L(lineType, threadItemType, list);
        this.A00 = lineType;
        this.A01 = threadItemType;
        this.A02 = jrg;
        this.A06 = list;
        this.A03 = user;
        this.A0A = z;
        this.A07 = z2;
        this.A05 = str;
        this.A04 = bool;
        this.A08 = z3;
        this.A09 = z4;
        this.A0B = z5;
    }
}
