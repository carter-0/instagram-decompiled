package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4jb  reason: invalid class name and case insensitive filesystem */
public class C271794jb implements C270594gz {
    public int A00 = -1;
    public int A01 = -1;
    public Boolean A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public final UserSession A09;
    public final 1Xl A0A;

    public C271794jb(UserSession userSession, 1Xl r3, C53275GlN glN) {
        String str;
        0qQ.A0B(r3, 2);
        this.A09 = userSession;
        this.A0A = r3;
        this.A00 = glN.A00;
        this.A01 = glN.A01;
        this.A08 = glN.A03;
        Integer num = glN.A02;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "shown_highlighted";
                    break;
                case 2:
                    str = "shown_midscene";
                    break;
                case 3:
                    str = "not_shown";
                    break;
                default:
                    str = "shown_not_highlighted";
                    break;
            }
        } else {
            str = null;
        }
        this.A07 = str;
    }

    public C271794jb(UserSession userSession, 1Xl r3, Integer num, int i, int i2, boolean z) {
        String str;
        this.A09 = userSession;
        this.A0A = r3;
        this.A00 = i;
        this.A01 = i2;
        this.A08 = z;
        switch (num.intValue()) {
            case 0:
                str = "shown_not_highlighted";
                break;
            case 1:
                str = "shown_highlighted";
                break;
            case 2:
                str = "shown_midscene";
                break;
            default:
                str = "not_shown";
                break;
        }
        this.A07 = str;
    }

    public void A8S(C254523sc r5, AnonymousClass4DU r6, String str) {
        0qQ.A0B(r5, 2);
        UserSession userSession = this.A09;
        1Xl r2 = this.A0A;
        r5.A0J(userSession, r2);
        r5.A09(this.A01);
        r5.A4O = this.A04;
        r5.A13 = Boolean.valueOf(this.A08);
        r5.A4L = this.A07;
        r5.A4m = this.A03;
        r5.A70 = this.A06;
        r5.A1Z = this.A02;
        r5.A6U = this.A05;
        C233822wX.A0X(r5, r2.BPf(), this.A00);
        C233822wX.A0G(userSession, r5, r2, false);
    }

    public C271794jb(UserSession userSession, 1Xl r3) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r3, 2);
        this.A09 = userSession;
        this.A0A = r3;
    }
}
