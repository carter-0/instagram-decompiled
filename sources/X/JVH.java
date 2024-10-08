package X;

import android.net.Uri;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.user.model.User;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.List;

public final class JVH extends AnonymousClass0T0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public static /* synthetic */ JVH A00(JVH jvh, C317486nL r7, String str, List list, List list2, int i) {
        String str2 = str;
        C317486nL r1 = r7;
        List list3 = list2;
        List list4 = list;
        List list5 = null;
        if ((i & 1) != 0) {
            list5 = (List) jvh.A04;
        }
        if ((i & 2) != 0) {
            list4 = (List) jvh.A03;
        }
        if ((i & 4) != 0) {
            list3 = (List) jvh.A01;
        }
        if ((i & 8) != 0) {
            r1 = (C317486nL) jvh.A02;
        }
        if ((i & 16) != 0) {
            str2 = jvh.A05;
        }
        DbY.A1S(list5, list3);
        0qQ.A0B(str2, 4);
        return new JVH(r1, str2, list5, list4, list3);
    }

    public static boolean A01(int i, Object obj) {
        if (!(obj instanceof JVH) || ((JVH) obj).A00 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ba, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a0, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a2, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0140, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0142, code lost:
        r1 = r2.A04;
        r0 = r3.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x000a;
                case 1: goto L_0x0038;
                case 2: goto L_0x006f;
                case 3: goto L_0x00a8;
                case 4: goto L_0x00d6;
                case 5: goto L_0x010f;
                case 6: goto L_0x0147;
                case 7: goto L_0x017f;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.equals(r3)
            return r0
        L_0x000a:
            if (r2 == r3) goto L_0x01be
            r0 = 0
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x01bc
            X.JVH r3 = (X.JVH) r3
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.String r1 = r2.A05
            java.lang.String r0 = r3.A05
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L_0x009c
        L_0x0038:
            if (r2 == r3) goto L_0x01be
            r0 = 1
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x01bc
            X.JVH r3 = (X.JVH) r3
            java.lang.String r1 = r2.A05
            java.lang.String r0 = r3.A05
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            if (r1 != r0) goto L_0x01bc
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L_0x01be
            goto L_0x01bc
        L_0x006f:
            if (r2 == r3) goto L_0x01be
            r0 = 2
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x01bc
            X.JVH r3 = (X.JVH) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.String r1 = r2.A05
            java.lang.String r0 = r3.A05
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
        L_0x009c:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            goto L_0x01b6
        L_0x00a8:
            if (r2 == r3) goto L_0x01be
            r0 = 3
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x01bc
            X.JVH r3 = (X.JVH) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.String r1 = r2.A05
            java.lang.String r0 = r3.A05
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            goto L_0x013c
        L_0x00d6:
            if (r2 == r3) goto L_0x01be
            r0 = 4
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x01bc
            X.JVH r3 = (X.JVH) r3
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.String r1 = r2.A05
            java.lang.String r0 = r3.A05
            goto L_0x01b6
        L_0x010f:
            if (r2 == r3) goto L_0x01be
            r0 = 5
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x01bc
            X.JVH r3 = (X.JVH) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.String r1 = r2.A05
            java.lang.String r0 = r3.A05
        L_0x013c:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            goto L_0x01b6
        L_0x0147:
            if (r2 == r3) goto L_0x01be
            r0 = 6
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x01bc
            X.JVH r3 = (X.JVH) r3
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.String r1 = r2.A05
            java.lang.String r0 = r3.A05
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            goto L_0x01b6
        L_0x017f:
            if (r2 == r3) goto L_0x01be
            r0 = 7
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x01bc
            X.JVH r3 = (X.JVH) r3
            java.lang.String r1 = r2.A05
            java.lang.String r0 = r3.A05
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        L_0x01b6:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x01be
        L_0x01bc:
            r0 = 0
            return r0
        L_0x01be:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JVH.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00d5, code lost:
        r1 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x012e, code lost:
        r2 = X.AnonymousClass7TE.A0L(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0133, code lost:
        return r1 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003f, code lost:
        r1 = X.AnonymousClass7TG.A0C(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0109;
                case 1: goto L_0x00da;
                case 2: goto L_0x00b3;
                case 3: goto L_0x0092;
                case 4: goto L_0x006c;
                case 5: goto L_0x0045;
                case 6: goto L_0x0025;
                case 7: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r1 = super.hashCode()
            return r1
        L_0x000a:
            java.lang.String r0 = r3.A05
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.Object r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A04
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A02
            int r2 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A01
            goto L_0x003f
        L_0x0025:
            java.lang.Object r0 = r3.A04
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.Object r0 = r3.A01
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A02
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.String r0 = r3.A05
            int r2 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.Object r0 = r3.A03
        L_0x003f:
            int r1 = X.AnonymousClass7TG.A0C(r0)
            goto L_0x0132
        L_0x0045:
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A05
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A04
            goto L_0x012e
        L_0x006c:
            java.lang.Object r0 = r3.A04
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.Object r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A02
            int r0 = X.AnonymousClass7TE.A0L(r0)
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.String r0 = r3.A05
            int r1 = r0.hashCode()
            goto L_0x0132
        L_0x0092:
            java.lang.Object r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.Object r0 = r3.A01
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.String r0 = r3.A05
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A03
            int r0 = X.AnonymousClass7TE.A0L(r0)
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.Object r0 = r3.A04
            goto L_0x00d5
        L_0x00b3:
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A05
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A03
            int r0 = X.AnonymousClass7TE.A0L(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A04
            int r2 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A02
        L_0x00d5:
            int r1 = r0.hashCode()
            goto L_0x0132
        L_0x00da:
            java.lang.String r0 = r3.A05
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.Object r0 = r3.A04
            r2 = 0
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A03
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = X.C63181Kso.A00(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x0132
            int r2 = X.LIJ.A00(r0)
            goto L_0x0132
        L_0x0109:
            java.lang.Object r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A04
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A05
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A02
        L_0x012e:
            int r2 = X.AnonymousClass7TE.A0L(r0)
        L_0x0132:
            int r1 = r1 + r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JVH.hashCode():int");
    }

    public final String toString() {
        if (3 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DirectGenericInterstitialReplyModalViewModel(header=");
        A1A.append(this.A02);
        A1A.append(", content=");
        A1A.append(this.A01);
        A1A.append(", composerHintText=");
        A1A.append(this.A05);
        A1A.append(", iceBreaker=");
        A1A.append(this.A03);
        A1A.append(", userToSendMessageTo=");
        return AnonymousClass7TG.A0n(this.A04, A1A);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public JVH() {
        this((Object) null, (Object) null, (Object) null, (Object) null, (String) null, 0);
        this.A00 = 0;
    }

    public JVH(C317486nL r2, String str, List list, List list2, List list3) {
        this.A00 = 4;
        this.A04 = list;
        this.A03 = list2;
        this.A01 = list3;
        this.A02 = r2;
        this.A05 = str;
    }

    public JVH(NewFundraiserInfo newFundraiserInfo, ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel, String str, List list, List list2) {
        this.A00 = 2;
        this.A01 = existingStandaloneFundraiserForFeedModel;
        this.A05 = str;
        this.A03 = newFundraiserInfo;
        this.A04 = list;
        this.A02 = list2;
    }

    public JVH(C64185LSs lSs, C64185LSs lSs2, C64185LSs lSs3, String str, List list) {
        this.A00 = 7;
        this.A05 = str;
        this.A03 = list;
        this.A04 = lSs;
        this.A02 = lSs2;
        this.A01 = lSs3;
    }

    public JVH(Uri uri, Uri uri2, Integer num, String str, List list) {
        this.A00 = 9;
        this.A04 = list;
        this.A03 = uri;
        this.A05 = str;
        this.A01 = uri2;
        this.A02 = num;
    }

    public JVH(C266444Yx r2, C266444Yx r3, C266444Yx r4, ImageUrl imageUrl, String str) {
        this.A00 = 6;
        this.A04 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A05 = str;
        this.A03 = imageUrl;
    }

    public JVH(Integer num, Integer num2, Integer num3, String str, List list) {
        this.A00 = 1;
        AnonymousClass7TF.A1D(str, 1, num2);
        this.A05 = str;
        this.A04 = list;
        this.A02 = num;
        this.A03 = num2;
        this.A01 = num3;
    }

    public JVH(N4R n4r, C61084JwM jwM, User user, String str, List list) {
        this.A00 = 3;
        0qQ.A0B(user, 5);
        this.A02 = n4r;
        this.A01 = jwM;
        this.A05 = str;
        this.A03 = list;
        this.A04 = user;
    }

    public JVH(C62551Khh khh, C66460MSo mSo, Object obj, Object obj2, String str) {
        this.A00 = 8;
        AnonymousClass7TG.A1O(mSo, khh);
        this.A04 = mSo;
        this.A02 = khh;
        this.A01 = obj;
        this.A03 = obj2;
        this.A05 = str;
    }

    public JVH(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A05 = str;
        this.A04 = obj4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public JVH(X.C317486nL r2, java.lang.String r3, java.util.List r4, java.util.List r5, java.util.List r6, kotlin.jvm.internal.DefaultConstructorMarker r7, int r8, int r9) {
        /*
            r1 = this;
            r0 = 4
            r1.A00 = r0
            X.0sn r4 = X.0sn.A00
            r2 = 0
            java.lang.String r3 = ""
            r5 = r2
            r6 = r4
            r1.<init>((X.C317486nL) r2, (java.lang.String) r3, (java.util.List) r4, (java.util.List) r5, (java.util.List) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JVH.<init>(X.6nL, java.lang.String, java.util.List, java.util.List, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker, int, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public JVH(Integer num, List list) {
        this((Uri) null, (Uri) null, num, (String) null, list);
        this.A00 = 9;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public JVH(com.instagram.model.fundraiser.NewFundraiserInfo r2, com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel r3, java.lang.String r4, java.util.List r5, java.util.List r6, kotlin.jvm.internal.DefaultConstructorMarker r7, int r8, int r9) {
        /*
            r1 = this;
            r0 = 2
            r1.A00 = r0
            r2 = 0
            X.0sn r5 = X.0sn.A00
            r3 = r2
            r4 = r2
            r6 = r5
            r1.<init>((com.instagram.model.fundraiser.NewFundraiserInfo) r2, (com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel) r3, (java.lang.String) r4, (java.util.List) r5, (java.util.List) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JVH.<init>(com.instagram.model.fundraiser.NewFundraiserInfo, com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel, java.lang.String, java.util.List, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker, int, int):void");
    }
}
