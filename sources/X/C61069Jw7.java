package X;

import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Jw7  reason: case insensitive filesystem */
public final class C61069Jw7 extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C61069Jw7) || ((C61069Jw7) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r1 == r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d7, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00db, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e9, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00eb, code lost:
        r3 = (X.C61069Jw7) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f5, code lost:
        if (X.0qQ.A0K(r2.A02, r3.A02) != false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0101, code lost:
        if (X.0qQ.A0K(r2.A00, r3.A00) != false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0105, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0112, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0114, code lost:
        r3 = (X.C61069Jw7) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x011e, code lost:
        if (X.0qQ.A0K(r2.A00, r3.A00) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0128, code lost:
        if (X.0qQ.A0K(r2.A01, r3.A01) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x012a, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0132, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L_0x0025;
                case 1: goto L_0x004a;
                case 2: goto L_0x004f;
                case 3: goto L_0x0054;
                case 4: goto L_0x0070;
                case 5: goto L_0x0082;
                case 6: goto L_0x009c;
                case 7: goto L_0x00b9;
                case 8: goto L_0x00bd;
                case 9: goto L_0x00e1;
                case 10: goto L_0x010a;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x0136
            r0 = 11
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0023
            X.Jw7 r3 = (X.C61069Jw7) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            if (r1 != r0) goto L_0x0023
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 != r0) goto L_0x0023
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
        L_0x0021:
            if (r1 == r0) goto L_0x0136
        L_0x0023:
            r0 = 0
            return r0
        L_0x0025:
            if (r2 == r3) goto L_0x0136
            r0 = 0
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0023
            X.Jw7 r3 = (X.C61069Jw7) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0023
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0023
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x012e
        L_0x004a:
            if (r2 == r3) goto L_0x0136
            r0 = 1
            goto L_0x00e5
        L_0x004f:
            if (r2 == r3) goto L_0x0136
            r0 = 2
            goto L_0x010e
        L_0x0054:
            if (r2 == r3) goto L_0x0136
            r0 = 3
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0023
            X.Jw7 r3 = (X.C61069Jw7) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0023
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x00db
            goto L_0x0023
        L_0x0070:
            if (r2 == r3) goto L_0x0136
            r0 = 4
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0023
            X.Jw7 r3 = (X.C61069Jw7) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            if (r1 == r0) goto L_0x00f9
            goto L_0x0023
        L_0x0082:
            if (r2 == r3) goto L_0x0136
            r0 = 5
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0023
            X.Jw7 r3 = (X.C61069Jw7) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0023
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x00d3
        L_0x009c:
            if (r2 == r3) goto L_0x0136
            r0 = 6
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0023
            X.Jw7 r3 = (X.C61069Jw7) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0023
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x0105
            goto L_0x0023
        L_0x00b9:
            if (r2 == r3) goto L_0x0136
            r0 = 7
            goto L_0x010e
        L_0x00bd:
            if (r2 == r3) goto L_0x0136
            r0 = 8
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0023
            X.Jw7 r3 = (X.C61069Jw7) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 != r0) goto L_0x0023
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        L_0x00d3:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00db
            goto L_0x0023
        L_0x00db:
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            goto L_0x0021
        L_0x00e1:
            if (r2 == r3) goto L_0x0136
            r0 = 9
        L_0x00e5:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0023
            X.Jw7 r3 = (X.C61069Jw7) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00f9
            goto L_0x0023
        L_0x00f9:
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0105
            goto L_0x0023
        L_0x0105:
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L_0x012e
        L_0x010a:
            if (r2 == r3) goto L_0x0136
            r0 = 10
        L_0x010e:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0023
            X.Jw7 r3 = (X.C61069Jw7) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0023
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0023
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
        L_0x012e:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0136
            goto L_0x0023
        L_0x0136:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61069Jw7.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f8, code lost:
        r1 = (r1 + X.AnonymousClass7TG.A0C(r3.A00)) * 31;
        r2 = X.AnonymousClass7TE.A0L(r3.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x011c, code lost:
        r2 = X.AnonymousClass7TE.A0L(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        r1 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        return r1 + r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A03
            switch(r0) {
                case 0: goto L_0x0109;
                case 1: goto L_0x00f2;
                case 2: goto L_0x00e0;
                case 3: goto L_0x00ab;
                case 4: goto L_0x0094;
                case 5: goto L_0x0080;
                case 6: goto L_0x0062;
                case 7: goto L_0x004a;
                case 8: goto L_0x0032;
                case 9: goto L_0x0028;
                case 10: goto L_0x0019;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.Object r0 = r3.A01
            int r2 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A00
        L_0x0013:
            int r1 = r0.hashCode()
        L_0x0017:
            int r1 = r1 + r2
            return r1
        L_0x0019:
            java.lang.Object r0 = r3.A00
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.Object r0 = r3.A01
            int r2 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A02
            goto L_0x0013
        L_0x0028:
            java.lang.Object r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            goto L_0x00f8
        L_0x0032:
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A02
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0017
        L_0x004a:
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A02
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0017
        L_0x0062:
            java.lang.Object r0 = r3.A02
            int r2 = X.AnonymousClass7TE.A0K(r0)
            java.lang.Object r0 = r3.A00
            int r1 = X.AnonymousClass7TE.A0M(r0)
            switch(r1) {
                case 1: goto L_0x007a;
                case 2: goto L_0x007d;
                default: goto L_0x0071;
            }
        L_0x0071:
            java.lang.String r0 = "Idle"
        L_0x0073:
            int r2 = X.C51971G9r.A0F(r0, r1, r2)
            java.lang.Object r0 = r3.A01
            goto L_0x0013
        L_0x007a:
            java.lang.String r0 = "Loading"
            goto L_0x0073
        L_0x007d:
            java.lang.String r0 = "Error"
            goto L_0x0073
        L_0x0080:
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TE.A0L(r0)
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.Object r0 = r3.A02
            goto L_0x0013
        L_0x0094:
            java.lang.Object r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0017
        L_0x00ab:
            java.lang.Object r0 = r3.A01
            int r2 = X.AnonymousClass7TE.A0K(r0)
            java.lang.Object r0 = r3.A00
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x00c9
            r0 = 0
        L_0x00b8:
            int r2 = r2 + r0
            int r2 = r2 * 31
            java.lang.Object r1 = r3.A02
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.String r0 = X.C67444Mnz.A00(r1)
            int r1 = X.C51971G9r.A0D(r1, r0)
            goto L_0x0017
        L_0x00c9:
            int r1 = r0.intValue()
            switch(r1) {
                case 1: goto L_0x00d7;
                case 2: goto L_0x00da;
                case 3: goto L_0x00dd;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            java.lang.String r0 = "CLEAR"
        L_0x00d2:
            int r0 = X.C51966G9m.A04(r0, r1)
            goto L_0x00b8
        L_0x00d7:
            java.lang.String r0 = "DISMISS"
            goto L_0x00d2
        L_0x00da:
            java.lang.String r0 = "SEE_ALL"
            goto L_0x00d2
        L_0x00dd:
            java.lang.String r0 = "SEE_ALL_ICON"
            goto L_0x00d2
        L_0x00e0:
            java.lang.Object r0 = r3.A00
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A02
            goto L_0x011c
        L_0x00f2:
            java.lang.Object r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0K(r0)
        L_0x00f8:
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0017
        L_0x0109:
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
        L_0x011c:
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61069Jw7.hashCode():int");
    }

    public final String toString() {
        if (2 - this.A03 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SearchSectionDescriptionModel(description=");
        A1A.append(this.A00);
        A1A.append(", linkText=");
        A1A.append(this.A01);
        A1A.append(", linkUrl=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }

    public C61069Jw7(C62504Kgu kgu, Integer num, Long l) {
        this.A03 = 4;
        0qQ.A0B(kgu, 1);
        this.A02 = kgu;
        this.A00 = l;
        this.A01 = num;
    }

    public C61069Jw7(C53401GnY gnY, User user, List list) {
        this.A03 = 1;
        this.A02 = list;
        this.A00 = gnY;
        this.A01 = user;
    }

    public C61069Jw7(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.A03 = 2;
        this.A00 = charSequence;
        this.A01 = charSequence2;
        this.A02 = charSequence3;
    }

    public C61069Jw7(C266444Yx r2, Integer num, Integer num2) {
        this.A03 = 3;
        this.A01 = r2;
        this.A00 = num;
        this.A02 = num2;
    }

    public C61069Jw7(C62865Knf knf, Integer num, List list) {
        this.A03 = 6;
        AnonymousClass7TG.A1U(list, num, knf);
        this.A02 = list;
        this.A00 = num;
        this.A01 = knf;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61069Jw7() {
        this((C53401GnY) null, (User) null, (List) 0sn.A00);
        this.A03 = 1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61069Jw7(Integer num, Integer num2, String str) {
        this((C266444Yx) new C52255GKw(str), num, num2);
        this.A03 = 3;
    }

    public C61069Jw7(1Xj r4, C270194gL r5, Uw7 uw7, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this.A03 = 5;
        Uw7 uw72 = Uw7.A02;
        this.A03 = 5;
        this.A01 = null;
        this.A00 = null;
        this.A02 = uw72;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61069Jw7(X.C62865Knf r4, java.lang.Integer r5, int r6) {
        /*
            r3 = this;
            r2 = 0
            r0 = 6
            r3.A03 = r0
            r1 = r2
            r0 = r6 & 1
            if (r0 == 0) goto L_0x000b
            X.0sn r1 = X.0sn.A00
        L_0x000b:
            r0 = r6 & 2
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r5 = X.AnonymousClass05K.A00
        L_0x0011:
            r0 = r6 & 4
            if (r0 == 0) goto L_0x001a
            X.KZp r4 = new X.KZp
            r4.<init>(r2)
        L_0x001a:
            r3.<init>((X.C62865Knf) r4, (java.lang.Integer) r5, (java.util.List) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61069Jw7.<init>(X.Knf, java.lang.Integer, int):void");
    }

    public C61069Jw7(ClipsMidCardSubtype clipsMidCardSubtype, InstagramMidcardType instagramMidcardType) {
        this.A03 = 11;
        this.A03 = 11;
        0qQ.A0B(clipsMidCardSubtype, 2);
        C52236GKd gKd = C52236GKd.A0r;
        this.A03 = 11;
        this.A02 = instagramMidcardType;
        this.A01 = clipsMidCardSubtype;
        this.A00 = gKd;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61069Jw7(1Xj r3, ProductTile productTile, User user, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this(9, (Object) null, (Object) null, (Object) null);
        this.A03 = 9;
    }

    public C61069Jw7(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A02 = obj;
        this.A00 = obj2;
        this.A01 = obj3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0066, code lost:
        r10.A03 = r0;
        this(r0, r1, r1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002f, code lost:
        r10.A02 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61069Jw7(int r11) {
        /*
            r10 = this;
            r10.A03 = r11
            switch(r11) {
                case 0: goto L_0x0064;
                case 1: goto L_0x005a;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x004c;
                case 5: goto L_0x0032;
                case 6: goto L_0x0046;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x0042;
                default: goto L_0x0005;
            }
        L_0x0005:
            r3 = 0
            r0 = 10
            r10.A03 = r0
            java.lang.String r2 = ""
            r5 = 0
            com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader r1 = new com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader
            r4 = r3
            r6 = r5
            r7 = r5
            r8 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            X.0sn r9 = X.0sn.A00
            com.instagram.shopping.model.taggingfeed.SourceType r5 = com.instagram.shopping.model.taggingfeed.SourceType.UNRECOGNIZED
            X.Jw0 r4 = new X.Jw0
            r6 = r3
            r7 = r2
            r8 = r2
            r4.<init>((com.instagram.shopping.model.taggingfeed.SourceType) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.util.List) r9)
            r10.A03 = r0
            r0 = 3
            X.0qQ.A0B(r9, r0)
            r10.<init>()
            r10.A00 = r1
            r10.A01 = r4
        L_0x002f:
            r10.A02 = r9
            return
        L_0x0032:
            r1 = 0
            r0 = 5
            r10.A03 = r0
            X.Uw7 r9 = X.Uw7.A02
            r10.A03 = r0
            r10.<init>()
            r10.A01 = r1
            r10.A00 = r1
            goto L_0x002f
        L_0x0042:
            r1 = 0
            r0 = 9
            goto L_0x0066
        L_0x0046:
            r1 = 0
            r0 = 7
            r10.<init>((X.C62865Knf) r1, (java.lang.Integer) r1, (int) r0)
            return
        L_0x004c:
            r2 = 0
            r0 = 4
            r10.A03 = r0
            X.Kgu r1 = X.C62504Kgu.DISCONNECTED
            java.lang.Long r0 = X.C51971G9r.A0m()
            r10.<init>((X.C62504Kgu) r1, (java.lang.Integer) r2, (java.lang.Long) r0)
            return
        L_0x005a:
            r1 = 0
            r0 = 1
            r10.A03 = r0
            X.0sn r0 = X.0sn.A00
            r10.<init>((X.C53401GnY) r1, (com.instagram.user.model.User) r1, (java.util.List) r0)
            return
        L_0x0064:
            r1 = 0
            r0 = 0
        L_0x0066:
            r10.A03 = r0
            r10.<init>(r0, r1, r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61069Jw7.<init>(int):void");
    }
}
