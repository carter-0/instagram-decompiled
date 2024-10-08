package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.direct.model.mentions.SendMentionData$MentionData;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.GnY  reason: case insensitive filesystem */
public final class C53401GnY extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public String A04;
    public final int A05;

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C53401GnY) || ((C53401GnY) obj).A05 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ca, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01cf, code lost:
        r1 = r2.A03;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01d7, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00be, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x015b, code lost:
        r1 = r2.A04;
        r0 = r3.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A05
            switch(r0) {
                case 0: goto L_0x002d;
                case 1: goto L_0x005d;
                case 2: goto L_0x008d;
                case 3: goto L_0x00c4;
                case 4: goto L_0x00fd;
                case 5: goto L_0x012e;
                case 6: goto L_0x0160;
                case 7: goto L_0x0195;
                case 8: goto L_0x01db;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x0213
            r0 = 9
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            X.GnY r3 = (X.C53401GnY) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x01cf
        L_0x002b:
            r0 = 0
            return r0
        L_0x002d:
            if (r2 == r3) goto L_0x0213
            r0 = 0
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            X.GnY r3 = (X.C53401GnY) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L_0x01ca
            goto L_0x002b
        L_0x005d:
            if (r2 == r3) goto L_0x0213
            r0 = 1
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            X.GnY r3 = (X.C53401GnY) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x00be
            goto L_0x002b
        L_0x008d:
            if (r2 == r3) goto L_0x0213
            r0 = 2
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            X.GnY r3 = (X.C53401GnY) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 != r0) goto L_0x002b
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00be
            goto L_0x002b
        L_0x00be:
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L_0x01d3
        L_0x00c4:
            if (r2 == r3) goto L_0x0213
            r0 = 3
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            X.GnY r3 = (X.C53401GnY) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x01d3
        L_0x00fd:
            if (r2 == r3) goto L_0x0213
            r0 = 4
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            X.GnY r3 = (X.C53401GnY) r3
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x015b
            goto L_0x002b
        L_0x012e:
            if (r2 == r3) goto L_0x0213
            r0 = 5
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            X.GnY r3 = (X.C53401GnY) r3
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 != r0) goto L_0x002b
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 != r0) goto L_0x002b
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x015b
            goto L_0x002b
        L_0x015b:
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            goto L_0x01d3
        L_0x0160:
            if (r2 == r3) goto L_0x0213
            r0 = 6
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            X.GnY r3 = (X.C53401GnY) r3
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x01cf
            goto L_0x002b
        L_0x0195:
            if (r2 == r3) goto L_0x0213
            r0 = 7
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            X.GnY r3 = (X.C53401GnY) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x01ca
            goto L_0x002b
        L_0x01ca:
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            goto L_0x01d3
        L_0x01cf:
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
        L_0x01d3:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0213
            goto L_0x002b
        L_0x01db:
            if (r2 == r3) goto L_0x0213
            r0 = 8
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            X.GnY r3 = (X.C53401GnY) r3
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 != r0) goto L_0x002b
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x0213
            goto L_0x002b
        L_0x0213:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53401GnY.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A07;
        int hashCode;
        int i;
        int intValue;
        int i2;
        Object obj;
        String str;
        String str2;
        switch (this.A05) {
            case 0:
                A07 = AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0K(this.A00))));
                hashCode = this.A02.hashCode();
                break;
            case 1:
                int A08 = AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0K(this.A02)));
                int A0M = AnonymousClass7TE.A0M(this.A00);
                if (1 != A0M) {
                    i = 4352;
                } else {
                    i = 4403;
                }
                A07 = C51971G9r.A0F(AnonymousClass000.A00(i), A0M, A08);
                hashCode = AnonymousClass7TG.A0C(this.A01);
                break;
            case 2:
                Number number = (Number) this.A00;
                if (number == null) {
                    intValue = 0;
                } else {
                    intValue = -90105677 + number.intValue();
                }
                hashCode = ((((((intValue * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31;
                A07 = AnonymousClass7TE.A0L(this.A01);
                break;
            case 3:
                hashCode = (((AnonymousClass7TF.A08(this.A04, AnonymousClass7TE.A0K(this.A01)) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31;
                A07 = AnonymousClass7TE.A0L(this.A00);
                break;
            case 4:
                i2 = ((((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31;
                obj = this.A00;
                break;
            case 5:
                int A072 = AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0O(this.A03));
                int A0M2 = AnonymousClass7TE.A0M(this.A00);
                switch (A0M2) {
                    case 1:
                        str2 = "PRE_CAPTURE";
                        break;
                    case 2:
                        str2 = "POST_CAPTURE_BUTTON";
                        break;
                    case 3:
                        str2 = "POST_CAPTURE_DROPDOWN";
                        break;
                    case 4:
                        str2 = "POST_CAPTURE_STICKER_TRAY";
                        break;
                    default:
                        str2 = "GALLERY_PHOTO";
                        break;
                }
                i2 = C51971G9r.A0F(str2, A0M2, A072);
                obj = this.A02;
                break;
            case 6:
                A07 = (((((AnonymousClass7TE.A0O(this.A04) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31;
                hashCode = this.A03.hashCode();
                break;
            case 7:
                hashCode = ((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31;
                A07 = AnonymousClass7TE.A0L(this.A02);
                break;
            case 8:
                hashCode = ((((((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31;
                A07 = AnonymousClass7TE.A0L(this.A00);
                break;
            default:
                hashCode = (AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A01)) + AnonymousClass7TG.A0C(this.A00)) * 31;
                str = this.A03;
                break;
        }
        hashCode = (i2 + AnonymousClass7TG.A0C(obj)) * 31;
        str = this.A04;
        A07 = C41845B3m.A00(str);
        return A07 + hashCode;
    }

    public final void A01(C286575Wy r12, int i) {
        int i2;
        AnonymousClass62P r8;
        C286575Wy r2 = r12;
        r12.ExV(1616811409);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r12, this) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-143659978, "com.instagram.compose.fragment.IgActionBarProvider.WithStringTitle.ActionBar (IgActionBarProvider.kt:38)");
            }
            C52738Gbq gbq = (C52738Gbq) this.A01;
            String str = this.A04;
            String str2 = this.A03;
            C62320sa r7 = (C62320sa) this.A02;
            0sL r1 = (0sL) this.A00;
            r12.ExS(1796418241);
            if (r1 == null) {
                r8 = null;
            } else {
                r8 = (AnonymousClass62P) r1.invoke(r12, C51967G9n.A0k());
            }
            boolean A1Y = C51968G9o.A1Y(r12);
            C52739Gbr.A01(r2, G9t.A0p(r12, Modifier.A00), gbq, str, str2, r7, r8, A1Y ? 1 : 0, A1Y ? 1 : 0);
            if (0fL.A02()) {
                0fL.A00(1041210494);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, this, i, 29);
        }
    }

    public C53401GnY(C362088hK r2, Integer num, Long l, String str, String str2) {
        this.A05 = 5;
        this.A03 = str;
        this.A01 = r2;
        this.A00 = num;
        this.A02 = l;
        this.A04 = str2;
    }

    public C53401GnY(1Xj r2, AnonymousClass3QO r3, User user, String str) {
        this.A05 = 9;
        this.A01 = user;
        this.A02 = r2;
        this.A00 = r3;
        this.A03 = str;
        String A30 = r2.A30();
        this.A04 = A30 == null ? "" : A30;
    }

    public C53401GnY(FanClubCategoryType fanClubCategoryType, User user, User user2, String str, String str2) {
        this.A05 = 0;
        C51974G9v.A1P(user, str, str2, fanClubCategoryType);
        0qQ.A0B(user2, 5);
        this.A00 = user;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = fanClubCategoryType;
        this.A02 = user2;
    }

    public C53401GnY(C335917dk r2, Integer num, Integer num2, String str, String str2) {
        this.A05 = 1;
        AnonymousClass7TG.A1Q(str, str2);
        this.A02 = r2;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = num;
        this.A01 = num2;
    }

    public C53401GnY(SendMentionData$MentionData sendMentionData$MentionData, String str, List list) {
        this.A05 = 6;
        String A0s = DbV.A0s();
        this.A05 = 6;
        DbW.A1N(str, 1, A0s);
        this.A04 = str;
        this.A02 = sendMentionData$MentionData;
        this.A00 = list;
        this.A01 = null;
        this.A03 = A0s;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C53401GnY(1Xj r3, User user, String str, int i) {
        this(r3, (AnonymousClass3QO) null, user, (i & 8) != 0 ? null : str);
        this.A05 = 9;
    }

    public C53401GnY(C52738Gbq gbq, String str) {
        this.A05 = 3;
        this.A05 = 3;
        this.A01 = gbq;
        this.A04 = str;
        this.A03 = null;
        this.A02 = null;
        this.A00 = null;
    }

    public C53401GnY(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        this.A05 = i;
        this.A00 = obj;
        this.A02 = obj2;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = obj3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C53401GnY() {
        this((Object) null, (Object) null, (Object) null, (String) null, (String) null, 4);
        this.A05 = 4;
        this.A05 = 4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C53401GnY(ACRType aCRType, Long l, Long l2, String str) {
        this(aCRType, l2, l, str, (String) null, 4);
        this.A05 = 4;
    }
}
