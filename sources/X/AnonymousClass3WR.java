package X;

import android.content.Context;
import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.instagram.model.mediasize.VideoUrlImpl;
import com.instagram.model.mediatype.ProductType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.3WR  reason: invalid class name */
public final class AnonymousClass3WR {
    public int A00;
    public int A01;
    public boolean A02;
    public Boolean A03;
    public Boolean A04;
    public List A05;
    public final long A06;
    public final C2814057m A07;
    public final VideoUrlImpl A08;
    public final ProductType A09;
    public final C255573uM A0A;
    public final Boolean A0B;
    public final Double A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final List A0M;
    public final List A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final Uri A0W;
    public final String A0X;
    public final String A0Y;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (X.00l.A0d(r2, X.002.A0S("lang=\"", r6, '\"'), false) != true) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A09(java.lang.String r6) {
        /*
            r5 = this;
            r4 = 0
            X.0qQ.A0B(r6, r4)
            java.lang.Boolean r0 = r5.A03
            if (r0 == 0) goto L_0x000d
            boolean r3 = r0.booleanValue()
            return r3
        L_0x000d:
            java.lang.String r2 = r5.A03()
            r3 = 1
            if (r2 == 0) goto L_0x0023
            java.lang.String r1 = "lang=\""
            r0 = 34
            java.lang.String r0 = X.002.A0S(r1, r6, r0)
            boolean r0 = X.00l.A0d(r2, r0, r4)
            r1 = 1
            if (r0 == r3) goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.A03 = r0
            boolean r0 = r5.A07()
            if (r0 == 0) goto L_0x0033
            if (r1 == 0) goto L_0x0033
            return r3
        L_0x0033:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3WR.A09(java.lang.String):boolean");
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnonymousClass3WR) {
            AnonymousClass3WR r4 = (AnonymousClass3WR) obj;
            if (this.A0R == r4.A0R && this.A0T == r4.A0T && 0qQ.A0K(this.A0G, r4.A0G) && 0qQ.A0K(this.A0M, r4.A0M) && 0qQ.A0K(A03(), r4.A03()) && 0qQ.A0K(this.A0F, r4.A0F)) {
                if (this.A02) {
                    i = 0;
                } else {
                    i = this.A0D;
                }
                if (r4.A02) {
                    i2 = 0;
                } else {
                    i2 = r4.A0D;
                }
                return 0qQ.A0K(i, i2) && 0qQ.A0K(A04(), r4.A04()) && this.A01 == r4.A01 && this.A00 == r4.A00 && this.A0U == r4.A0U;
            }
        }
    }

    public final String A02() {
        String str;
        VideoUrlImpl videoUrlImpl = this.A08;
        if (videoUrlImpl == null || (str = videoUrlImpl.A06) == null) {
            return "";
        }
        return str;
    }

    public final String A03() {
        if (this.A02) {
            return null;
        }
        return this.A0X;
    }

    public final String A04() {
        if (this.A02) {
            return null;
        }
        return this.A0Y;
    }

    public final List A05() {
        List<VideoUrlImpl> list = this.A0M;
        if (list == null) {
            return 0sn.A00;
        }
        ArrayList arrayList = new ArrayList();
        for (VideoUrlImpl videoUrlImpl : list) {
            String str = videoUrlImpl.A05;
            if (str != null) {
                Long A0n = 00y.A0n(10, str);
                if (A0n != null) {
                    arrayList.add(A0n);
                } else if (str.length() != 0) {
                    0KC.A0C("VideoSource", 002.A0R("Video id is not numerical: ", str));
                }
            }
        }
        return arrayList;
    }

    public final List A06() {
        List<VideoUrlImpl> list = this.A0M;
        if (list == null) {
            return 0sn.A00;
        }
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (VideoUrlImpl videoUrlImpl : list) {
            arrayList.add(videoUrlImpl.A06);
        }
        return arrayList;
    }

    public final boolean A07() {
        Boolean bool = this.A04;
        if (bool != null) {
            return bool.booleanValue();
        }
        String A032 = A03();
        boolean z = true;
        if (A032 == null || !00l.A0d(A032, "value=\"dub\"", false)) {
            z = false;
        }
        this.A04 = Boolean.valueOf(z);
        return z;
    }

    public final boolean A08() {
        Integer num;
        switch (this.A0E.intValue()) {
            case 0:
            case 1:
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
                if (this.A02) {
                    num = 0;
                } else {
                    num = this.A0D;
                    if (num == null) {
                        return false;
                    }
                }
                if (num.intValue() != 1 || A03() == null) {
                    return false;
                }
                break;
            case 3:
                return this.A0P;
            case 4:
                break;
            case 5:
                return false;
            default:
                throw new RuntimeException();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r4 = this;
            java.lang.String r0 = r4.A0G
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            boolean r0 = r4.A0R
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r4.A0T
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r4.A0U
            int r1 = r1 + r0
            int r0 = r1 * 31
            int r1 = r0 * 31
            java.util.List r0 = r4.A0M
            r2 = 0
            if (r0 == 0) goto L_0x0075
            int r0 = r0.hashCode()
        L_0x0022:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r4.A03()
            if (r0 == 0) goto L_0x0073
            int r0 = r0.hashCode()
        L_0x002f:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r4.A0F
            if (r0 == 0) goto L_0x0071
            int r0 = r0.hashCode()
        L_0x003a:
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x006b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x0045:
            int r0 = r0.intValue()
        L_0x0049:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r4.A04()
            if (r0 == 0) goto L_0x0056
            int r2 = r0.hashCode()
        L_0x0056:
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r0 = r4.A01
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r4.A00
            int r1 = r1 + r0
            int r3 = r1 * 31
            r1 = 0
            r0 = 32
            long r1 = r1 >>> r0
            int r0 = (int) r1
            int r3 = r3 + r0
            return r3
        L_0x006b:
            java.lang.Integer r0 = r4.A0D
            if (r0 != 0) goto L_0x0045
            r0 = 0
            goto L_0x0049
        L_0x0071:
            r0 = 1
            goto L_0x003a
        L_0x0073:
            r0 = 0
            goto L_0x002f
        L_0x0075:
            r0 = 0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3WR.hashCode():int");
    }

    public AnonymousClass3WR(C2814057m r4, ProductType productType, C255573uM r6, Boolean bool, Double d, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, List list2, List list3, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        Uri A012;
        this.A0E = num;
        this.A09 = productType;
        this.A0G = str;
        List list4 = list;
        this.A0M = list4;
        this.A0I = str2;
        this.A0L = str3;
        this.A07 = r4;
        this.A0F = str5;
        this.A05 = list2;
        this.A0P = z2;
        this.A0T = z3;
        this.A0A = r6;
        this.A0R = z4;
        this.A0Q = z5;
        this.A0O = z6;
        this.A06 = j;
        this.A0B = bool;
        this.A01 = i;
        this.A00 = i2;
        this.A0U = z7;
        this.A0C = d;
        this.A0N = list3;
        this.A0H = str8;
        this.A0V = z8;
        this.A0K = str9;
        this.A0X = str4;
        this.A0D = num2;
        this.A0Y = str6;
        VideoUrlImpl videoUrlImpl = null;
        if (str3 == null) {
            A012 = null;
        } else {
            A012 = 0cp.A01(C263284Kb.A00, str3);
        }
        this.A0W = A012;
        this.A0S = z;
        this.A0J = str7;
        if (list != null && !list4.isEmpty()) {
            videoUrlImpl = C255583uN.A01(this.A0G, this.A0M);
        }
        this.A08 = videoUrlImpl;
    }

    public final C256883wV A00(Context context) {
        if (!A08()) {
            return null;
        }
        C256343vc r2 = new C256343vc();
        Uri uri = this.A0W;
        if (uri == null) {
            uri = Uri.parse("");
        }
        C256633w6 A022 = C256373vf.A02(uri, r2, A03());
        C256823wP r3 = C256823wP.A00;
        return C256373vf.A01(context, new C12297Sqy(this), new C19074WKe(this), r3, A022, false, false, false);
    }

    public final ImmutableList A01(Context context) {
        List list;
        List<C256733wG> list2;
        if (A08() && this.A05 == null) {
            C256883wV A002 = A00(context);
            if (A002 == null || (list2 = A002.A01) == null) {
                list = null;
            } else {
                ArrayList arrayList = new ArrayList(0Yv.A1E(list2, 10));
                for (C256733wG r0 : list2) {
                    arrayList.add(String.valueOf(r0.A02.A0R));
                }
                list = 00k.A0W(arrayList);
            }
            this.A05 = list;
        }
        List list3 = this.A05;
        if (list3 != null) {
            return ImmutableList.copyOf((Collection) list3);
        }
        return null;
    }

    public final String toString() {
        return A02();
    }
}
