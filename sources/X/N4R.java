package X;

import android.app.Notification;
import android.text.SpannableString;
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.stickerstore.StickerPack;
import com.instagram.opal.impl.data.OpalProfileData;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.rtc.rsys.models.EngineModel;
import com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class N4R extends AnonymousClass0T0 {
    public Object A00;
    public final int A01;
    public final Object A02;

    public static boolean A02(int i, Object obj) {
        if (!(obj instanceof N4R) || ((N4R) obj).A01 != i) {
            return false;
        }
        return true;
    }

    public final String A03() {
        String str;
        CountryCodeData countryCodeData = (CountryCodeData) this.A00;
        if (countryCodeData == null || (str = countryCodeData.A00) == null) {
            return "";
        }
        return str;
    }

    public final String A04() {
        String str;
        CountryCodeData countryCodeData = (CountryCodeData) this.A00;
        if (countryCodeData == null || (str = countryCodeData.A02) == null) {
            return "";
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0133, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0154, code lost:
        if (A02(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0156, code lost:
        r3 = (X.N4R) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0160, code lost:
        if (X.0qQ.A0K(r2.A00, r3.A00) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0162, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0166, code lost:
        if (r1 == r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0171, code lost:
        if (A02(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0173, code lost:
        r3 = (X.N4R) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x017d, code lost:
        if (X.0qQ.A0K(r2.A00, r3.A00) != false) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0180, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01b1, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0084, code lost:
        if (A02(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0086, code lost:
        r3 = (X.N4R) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x008c, code lost:
        if (r2.A02 == r3.A02) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00d3, code lost:
        if (A02(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00d5, code lost:
        r3 = (X.N4R) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00df, code lost:
        if (X.0qQ.A0K(r2.A02, r3.A02) != false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x00f0, code lost:
        if (A02(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x00f2, code lost:
        r3 = (X.N4R) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00fc, code lost:
        if (X.0qQ.A0K(r2.A02, r3.A02) != false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0100, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0113, code lost:
        if (A02(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0115, code lost:
        r3 = (X.N4R) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x011b, code lost:
        if (r2.A00 == r3.A00) goto L_0x0180;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A01
            switch(r0) {
                case 0: goto L_0x000a;
                case 1: goto L_0x0005;
                case 2: goto L_0x000f;
                case 3: goto L_0x0013;
                case 4: goto L_0x0018;
                case 5: goto L_0x001d;
                case 6: goto L_0x0021;
                case 7: goto L_0x0026;
                case 8: goto L_0x002a;
                case 9: goto L_0x0030;
                case 10: goto L_0x0036;
                case 11: goto L_0x003c;
                case 12: goto L_0x0042;
                case 13: goto L_0x0048;
                case 14: goto L_0x004e;
                case 15: goto L_0x0054;
                case 16: goto L_0x005a;
                case 17: goto L_0x0060;
                case 18: goto L_0x0066;
                case 19: goto L_0x006c;
                case 20: goto L_0x0071;
                case 21: goto L_0x0077;
                case 22: goto L_0x007c;
                case 23: goto L_0x0090;
                case 24: goto L_0x0096;
                case 25: goto L_0x009b;
                case 26: goto L_0x00a1;
                case 27: goto L_0x00a6;
                case 28: goto L_0x00ab;
                case 29: goto L_0x00b0;
                case 30: goto L_0x00b6;
                case 31: goto L_0x00bb;
                case 32: goto L_0x00c1;
                case 33: goto L_0x00c6;
                case 34: goto L_0x00cb;
                case 35: goto L_0x00e3;
                case 36: goto L_0x00e8;
                case 37: goto L_0x0185;
                case 38: goto L_0x0106;
                case 39: goto L_0x010b;
                case 40: goto L_0x011f;
                case 41: goto L_0x0005;
                case 42: goto L_0x0138;
                case 43: goto L_0x013d;
                case 44: goto L_0x0142;
                case 45: goto L_0x0147;
                case 46: goto L_0x0005;
                case 47: goto L_0x014c;
                case 48: goto L_0x0005;
                case 49: goto L_0x0169;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.equals(r3)
            return r0
        L_0x000a:
            if (r2 == r3) goto L_0x01b5
            r0 = 0
            goto L_0x00ec
        L_0x000f:
            if (r2 == r3) goto L_0x01b5
            r0 = 2
            goto L_0x0080
        L_0x0013:
            if (r2 == r3) goto L_0x01b5
            r0 = 3
            goto L_0x00ec
        L_0x0018:
            if (r2 == r3) goto L_0x01b5
            r0 = 4
            goto L_0x0150
        L_0x001d:
            if (r2 == r3) goto L_0x01b5
            r0 = 5
            goto L_0x0080
        L_0x0021:
            if (r2 == r3) goto L_0x01b5
            r0 = 6
            goto L_0x00ec
        L_0x0026:
            if (r2 == r3) goto L_0x01b5
            r0 = 7
            goto L_0x0080
        L_0x002a:
            if (r2 == r3) goto L_0x01b5
            r0 = 8
            goto L_0x016d
        L_0x0030:
            if (r2 == r3) goto L_0x01b5
            r0 = 9
            goto L_0x016d
        L_0x0036:
            if (r2 == r3) goto L_0x01b5
            r0 = 10
            goto L_0x016d
        L_0x003c:
            if (r2 == r3) goto L_0x01b5
            r0 = 11
            goto L_0x00cf
        L_0x0042:
            if (r2 == r3) goto L_0x01b5
            r0 = 12
            goto L_0x00ec
        L_0x0048:
            if (r2 == r3) goto L_0x01b5
            r0 = 13
            goto L_0x00ec
        L_0x004e:
            if (r2 == r3) goto L_0x01b5
            r0 = 14
            goto L_0x00ec
        L_0x0054:
            if (r2 == r3) goto L_0x01b5
            r0 = 15
            goto L_0x00ec
        L_0x005a:
            if (r2 == r3) goto L_0x01b5
            r0 = 16
            goto L_0x016d
        L_0x0060:
            if (r2 == r3) goto L_0x01b5
            r0 = 17
            goto L_0x00ec
        L_0x0066:
            if (r2 == r3) goto L_0x01b5
            r0 = 18
            goto L_0x016d
        L_0x006c:
            if (r2 == r3) goto L_0x01b5
            r0 = 19
            goto L_0x00ec
        L_0x0071:
            if (r2 == r3) goto L_0x01b5
            r0 = 20
            goto L_0x016d
        L_0x0077:
            if (r2 == r3) goto L_0x01b5
            r0 = 21
            goto L_0x00ec
        L_0x007c:
            if (r2 == r3) goto L_0x01b5
            r0 = 22
        L_0x0080:
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x01b3
            X.N4R r3 = (X.N4R) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            if (r1 == r0) goto L_0x0100
            goto L_0x01b3
        L_0x0090:
            if (r2 == r3) goto L_0x01b5
            r0 = 23
            goto L_0x016d
        L_0x0096:
            if (r2 == r3) goto L_0x01b5
            r0 = 24
            goto L_0x00ec
        L_0x009b:
            if (r2 == r3) goto L_0x01b5
            r0 = 25
            goto L_0x016d
        L_0x00a1:
            if (r2 == r3) goto L_0x01b5
            r0 = 26
            goto L_0x010f
        L_0x00a6:
            if (r2 == r3) goto L_0x01b5
            r0 = 27
            goto L_0x00ec
        L_0x00ab:
            if (r2 == r3) goto L_0x01b5
            r0 = 28
            goto L_0x00ec
        L_0x00b0:
            if (r2 == r3) goto L_0x01b5
            r0 = 29
            goto L_0x016d
        L_0x00b6:
            if (r2 == r3) goto L_0x01b5
            r0 = 30
            goto L_0x00ec
        L_0x00bb:
            if (r2 == r3) goto L_0x01b5
            r0 = 31
            goto L_0x016d
        L_0x00c1:
            if (r2 == r3) goto L_0x01b5
            r0 = 32
            goto L_0x00ec
        L_0x00c6:
            if (r2 == r3) goto L_0x01b5
            r0 = 33
            goto L_0x00cf
        L_0x00cb:
            if (r2 == r3) goto L_0x01b5
            r0 = 34
        L_0x00cf:
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x01b3
            X.N4R r3 = (X.N4R) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0133
            goto L_0x01b3
        L_0x00e3:
            if (r2 == r3) goto L_0x01b5
            r0 = 35
            goto L_0x00ec
        L_0x00e8:
            if (r2 == r3) goto L_0x01b5
            r0 = 36
        L_0x00ec:
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x01b3
            X.N4R r3 = (X.N4R) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0100
            goto L_0x01b3
        L_0x0100:
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x01ad
        L_0x0106:
            if (r2 == r3) goto L_0x01b5
            r0 = 38
            goto L_0x016d
        L_0x010b:
            if (r2 == r3) goto L_0x01b5
            r0 = 39
        L_0x010f:
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x01b3
            X.N4R r3 = (X.N4R) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x0180
            goto L_0x01b3
        L_0x011f:
            if (r2 == r3) goto L_0x01b5
            r0 = 40
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x01b3
            X.N4R r3 = (X.N4R) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            if (r1 == r0) goto L_0x0133
            goto L_0x01b3
        L_0x0133:
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x0166
        L_0x0138:
            if (r2 == r3) goto L_0x01b5
            r0 = 42
            goto L_0x0150
        L_0x013d:
            if (r2 == r3) goto L_0x01b5
            r0 = 43
            goto L_0x0150
        L_0x0142:
            if (r2 == r3) goto L_0x01b5
            r0 = 44
            goto L_0x016d
        L_0x0147:
            if (r2 == r3) goto L_0x01b5
            r0 = 45
            goto L_0x016d
        L_0x014c:
            if (r2 == r3) goto L_0x01b5
            r0 = 47
        L_0x0150:
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x01b3
            X.N4R r3 = (X.N4R) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01b3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
        L_0x0166:
            if (r1 == r0) goto L_0x01b5
            goto L_0x01b3
        L_0x0169:
            if (r2 == r3) goto L_0x01b5
            r0 = 49
        L_0x016d:
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x01b3
            X.N4R r3 = (X.N4R) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0180
            goto L_0x01b3
        L_0x0180:
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            goto L_0x01ad
        L_0x0185:
            if (r2 == r3) goto L_0x01b5
            java.lang.Class r1 = r2.getClass()
            java.lang.Class r0 = X.JTR.A0v(r3)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01b3
            r0 = 37
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x01b5
            java.lang.Object r1 = r2.A02
            X.N4R r3 = (X.N4R) r3
            java.lang.Object r0 = r3.A02
            if (r1 != r0) goto L_0x01b3
            java.lang.String r1 = r2.A03()
            java.lang.String r0 = r3.A03()
        L_0x01ad:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x01b5
        L_0x01b3:
            r0 = 0
            return r0
        L_0x01b5:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N4R.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        r1 = r1 * 31;
        r2 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        r1 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a0, code lost:
        r3 = r1 * 31;
        r1 = X.AnonymousClass7TE.A0L(r4.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00aa, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x017c, code lost:
        r2 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x017e, code lost:
        if (r2 != null) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0180, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0195, code lost:
        r3 = X.C51966G9m.A04(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01d3, code lost:
        r3 = r2.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d8, code lost:
        return r1 + r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r4 = this;
            int r1 = r4.A01
            switch(r1) {
                case 0: goto L_0x016f;
                case 1: goto L_0x0005;
                case 2: goto L_0x01c9;
                case 3: goto L_0x01c9;
                case 4: goto L_0x01a3;
                case 5: goto L_0x01c9;
                case 6: goto L_0x016f;
                case 7: goto L_0x01c9;
                case 8: goto L_0x0042;
                case 9: goto L_0x0042;
                case 10: goto L_0x0042;
                case 11: goto L_0x0182;
                case 12: goto L_0x01c9;
                case 13: goto L_0x0176;
                case 14: goto L_0x016f;
                case 15: goto L_0x01c9;
                case 16: goto L_0x0042;
                case 17: goto L_0x0162;
                case 18: goto L_0x0037;
                case 19: goto L_0x01c9;
                case 20: goto L_0x0042;
                case 21: goto L_0x01c9;
                case 22: goto L_0x0146;
                case 23: goto L_0x0042;
                case 24: goto L_0x0138;
                case 25: goto L_0x0128;
                case 26: goto L_0x0113;
                case 27: goto L_0x01c9;
                case 28: goto L_0x01c9;
                case 29: goto L_0x0105;
                case 30: goto L_0x01c9;
                case 31: goto L_0x0042;
                case 32: goto L_0x01c9;
                case 33: goto L_0x00f7;
                case 34: goto L_0x00e9;
                case 35: goto L_0x00db;
                case 36: goto L_0x00cb;
                case 37: goto L_0x00ac;
                case 38: goto L_0x0098;
                case 39: goto L_0x007e;
                case 40: goto L_0x0067;
                case 41: goto L_0x0005;
                case 42: goto L_0x0057;
                case 43: goto L_0x0049;
                case 44: goto L_0x0037;
                case 45: goto L_0x0098;
                case 46: goto L_0x0005;
                case 47: goto L_0x001a;
                case 48: goto L_0x0005;
                case 49: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r1 = super.hashCode()
            return r1
        L_0x000a:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r1 = r1 * 31
            java.lang.Object r2 = r4.A02
            int r3 = r2.hashCode()
            goto L_0x01d7
        L_0x001a:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r2 = r4.A02
            int r3 = X.AnonymousClass7TE.A0M(r2)
            switch(r3) {
                case 1: goto L_0x0031;
                case 2: goto L_0x0034;
                default: goto L_0x0029;
            }
        L_0x0029:
            java.lang.String r2 = "ENTRY"
        L_0x002b:
            int r3 = X.C51966G9m.A04(r2, r3)
            goto L_0x01d7
        L_0x0031:
            java.lang.String r2 = "RSYS"
            goto L_0x002b
        L_0x0034:
            java.lang.String r2 = "INITIAL"
            goto L_0x002b
        L_0x0037:
            java.lang.Object r1 = r4.A00
            if (r1 != 0) goto L_0x0044
            r1 = 0
        L_0x003c:
            int r1 = r1 * 31
            java.lang.Object r2 = r4.A02
            goto L_0x01d3
        L_0x0042:
            java.lang.Object r1 = r4.A00
        L_0x0044:
            int r1 = r1.hashCode()
            goto L_0x003c
        L_0x0049:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r2 = r4.A02
            int r3 = r2.hashCode()
            goto L_0x01d7
        L_0x0057:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r1 = r1 * 31
            java.lang.Object r2 = r4.A02
            int r3 = r2.hashCode()
            goto L_0x01d7
        L_0x0067:
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r2 = r4.A00
            int r3 = X.AnonymousClass7TE.A0M(r2)
            r0 = 1
            if (r0 == r3) goto L_0x007a
            java.lang.String r2 = "LEADING"
            goto L_0x0195
        L_0x007a:
            java.lang.String r2 = "TRAILING"
            goto L_0x0195
        L_0x007e:
            java.lang.Object r1 = r4.A00
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x00aa
            int r2 = r1.intValue()
            switch(r2) {
                case 1: goto L_0x0092;
                case 2: goto L_0x0095;
                default: goto L_0x008b;
            }
        L_0x008b:
            java.lang.String r1 = "FAST"
        L_0x008d:
            int r1 = X.C51966G9m.A04(r1, r2)
            goto L_0x00a0
        L_0x0092:
            java.lang.String r1 = "MEDIUM"
            goto L_0x008d
        L_0x0095:
            java.lang.String r1 = "SLOW"
            goto L_0x008d
        L_0x0098:
            java.lang.Object r1 = r4.A00
            if (r1 == 0) goto L_0x00aa
            int r1 = r1.hashCode()
        L_0x00a0:
            int r3 = r1 * 31
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TE.A0L(r1)
            goto L_0x01d7
        L_0x00aa:
            r1 = 0
            goto L_0x00a0
        L_0x00ac:
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TE.A0M(r1)
            switch(r2) {
                case 1: goto L_0x00c5;
                case 2: goto L_0x00c8;
                default: goto L_0x00b5;
            }
        L_0x00b5:
            java.lang.String r1 = "TITLE"
        L_0x00b7:
            int r1 = X.C51968G9o.A0F(r1, r2)
            java.lang.String r2 = r4.A03()
            int r3 = r2.hashCode()
            goto L_0x01d7
        L_0x00c5:
            java.lang.String r1 = "EMPTY_MESSAGE"
            goto L_0x00b7
        L_0x00c8:
            java.lang.String r1 = "COUNTRY_ROW"
            goto L_0x00b7
        L_0x00cb:
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r3 = r1 * 31
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TE.A0L(r1)
            goto L_0x01d7
        L_0x00db:
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r2 = r4.A00
            int r3 = r2.hashCode()
            goto L_0x01d7
        L_0x00e9:
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r2 = r4.A00
            int r3 = r2.hashCode()
            goto L_0x01d7
        L_0x00f7:
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r2 = r4.A00
            int r3 = r2.hashCode()
            goto L_0x01d7
        L_0x0105:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r2 = r4.A02
            int r3 = r2.hashCode()
            goto L_0x01d7
        L_0x0113:
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0M(r1)
            r0 = 1
            if (r0 == r2) goto L_0x0125
            java.lang.String r1 = "TifuPost"
        L_0x011e:
            int r1 = X.C51968G9o.A0F(r1, r2)
            java.lang.Object r2 = r4.A02
            goto L_0x017e
        L_0x0125:
            java.lang.String r1 = "SeeMoreCard"
            goto L_0x011e
        L_0x0128:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r3 = r1 * 31
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TE.A0L(r1)
            goto L_0x01d7
        L_0x0138:
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r2 = r4.A00
            int r3 = r2.hashCode()
            goto L_0x01d7
        L_0x0146:
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TE.A0M(r1)
            switch(r2) {
                case 1: goto L_0x0156;
                case 2: goto L_0x0159;
                case 3: goto L_0x015c;
                case 4: goto L_0x015f;
                default: goto L_0x014f;
            }
        L_0x014f:
            java.lang.String r1 = "GONE"
        L_0x0151:
            int r1 = X.C51968G9o.A0F(r1, r2)
            goto L_0x017c
        L_0x0156:
            java.lang.String r1 = "TERMS"
            goto L_0x0151
        L_0x0159:
            java.lang.String r1 = "HOLDOUT_MESSAGE"
            goto L_0x0151
        L_0x015c:
            java.lang.String r1 = "KR_TERMS"
            goto L_0x0151
        L_0x015f:
            java.lang.String r1 = "EU_TERMS"
            goto L_0x0151
        L_0x0162:
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r2 = r4.A00
            int r3 = r2.hashCode()
            goto L_0x01d7
        L_0x016f:
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TE.A0K(r1)
            goto L_0x017c
        L_0x0176:
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TE.A0K(r1)
        L_0x017c:
            java.lang.Object r2 = r4.A00
        L_0x017e:
            if (r2 != 0) goto L_0x01d3
            r3 = 0
            goto L_0x01d7
        L_0x0182:
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r1 = r1 * 31
            java.lang.Object r2 = r4.A00
            int r3 = X.AnonymousClass7TE.A0M(r2)
            switch(r3) {
                case 1: goto L_0x019a;
                case 2: goto L_0x019d;
                case 3: goto L_0x01a0;
                default: goto L_0x0193;
            }
        L_0x0193:
            java.lang.String r2 = "INITIAL"
        L_0x0195:
            int r3 = X.C51966G9m.A04(r2, r3)
            goto L_0x01d7
        L_0x019a:
            java.lang.String r2 = "LOADING"
            goto L_0x0195
        L_0x019d:
            java.lang.String r2 = "SUCCESS"
            goto L_0x0195
        L_0x01a0:
            java.lang.String r2 = "FAILED"
            goto L_0x0195
        L_0x01a3:
            java.lang.Object r2 = r4.A00
            r1 = 0
            int r2 = X.AnonymousClass7TG.A0C(r2)
            int r3 = r2 * 31
            java.lang.Object r2 = r4.A02
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x01d7
            int r2 = r2.intValue()
            switch(r2) {
                case 1: goto L_0x01c0;
                case 2: goto L_0x01c3;
                case 3: goto L_0x01c6;
                default: goto L_0x01b9;
            }
        L_0x01b9:
            java.lang.String r1 = "NONE"
        L_0x01bb:
            int r1 = X.C51966G9m.A04(r1, r2)
            goto L_0x01d7
        L_0x01c0:
            java.lang.String r1 = "LOADING"
            goto L_0x01bb
        L_0x01c3:
            java.lang.String r1 = "SUCCESS"
            goto L_0x01bb
        L_0x01c6:
            java.lang.String r1 = "ERROR"
            goto L_0x01bb
        L_0x01c9:
            java.lang.Object r1 = r4.A02
            int r1 = r1.hashCode()
            int r1 = r1 * 31
            java.lang.Object r2 = r4.A00
        L_0x01d3:
            int r3 = r2.hashCode()
        L_0x01d7:
            int r1 = r1 + r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N4R.hashCode():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a4, code lost:
        r1.append(r0);
        r0 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a9, code lost:
        r1.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b0, code lost:
        return X.AnonymousClass7TG.A0p(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r2 = this;
            int r0 = r2.A01
            switch(r0) {
                case 3: goto L_0x0094;
                case 6: goto L_0x0083;
                case 14: goto L_0x0072;
                case 17: goto L_0x0061;
                case 35: goto L_0x0050;
                case 47: goto L_0x0021;
                case 49: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = super.toString()
            return r0
        L_0x000a:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "RtcEngineModel(engineModel="
            r1.append(r0)
            java.lang.Object r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = ", stateModel="
            r1.append(r0)
            java.lang.Object r0 = r2.A02
            goto L_0x00a9
        L_0x0021:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "State(model="
            r1.append(r0)
            java.lang.Object r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = ", source="
            r1.append(r0)
            java.lang.Object r0 = r2.A02
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x004d
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x0047;
                case 2: goto L_0x004a;
                default: goto L_0x0041;
            }
        L_0x0041:
            java.lang.String r0 = "ENTRY"
        L_0x0043:
            r1.append(r0)
            goto L_0x00ac
        L_0x0047:
            java.lang.String r0 = "RSYS"
            goto L_0x0043
        L_0x004a:
            java.lang.String r0 = "INITIAL"
            goto L_0x0043
        L_0x004d:
            java.lang.String r0 = "null"
            goto L_0x0043
        L_0x0050:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "FaceSwarmImageAnimation(before="
            r1.append(r0)
            java.lang.Object r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = ", after="
            goto L_0x00a4
        L_0x0061:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "MediaForAutoplayFields(messageIdentifier="
            r1.append(r0)
            java.lang.Object r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = ", media="
            goto L_0x00a4
        L_0x0072:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "InboxThreadDigestData(threadData="
            r1.append(r0)
            java.lang.Object r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = ", messageForDigestData="
            goto L_0x00a4
        L_0x0083:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "HeaderFields(title="
            r1.append(r0)
            java.lang.Object r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = ", subtitle="
            goto L_0x00a4
        L_0x0094:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "EncryptedBackupInfo(lastSyncTimeMs="
            r1.append(r0)
            java.lang.Object r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = ", creationTimeMs="
        L_0x00a4:
            r1.append(r0)
            java.lang.Object r0 = r2.A00
        L_0x00a9:
            r1.append(r0)
        L_0x00ac:
            java.lang.String r0 = X.AnonymousClass7TG.A0p(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N4R.toString():java.lang.String");
    }

    public static final N4R A00(OpalProfileData opalProfileData, C62520KhB khB) {
        AnonymousClass7TG.A1N(opalProfileData, khB);
        return new N4R(opalProfileData, khB);
    }

    public static final N4R A01(List list, List list2) {
        AnonymousClass7TG.A1N(list, list2);
        return new N4R(list, list2, 20);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public N4R(X.AnonymousClass62P r3, int r4) {
        /*
            r2 = this;
            r1 = 0
            r0 = 9
            r2.A01 = r0
            r0 = r4 & 1
            if (r0 == 0) goto L_0x000b
            X.62M r3 = X.AnonymousClass62M.A01
        L_0x000b:
            r0 = r4 & 2
            if (r0 == 0) goto L_0x0011
            X.62M r1 = X.AnonymousClass62M.A01
        L_0x0011:
            r2.<init>((X.AnonymousClass62P) r3, (X.AnonymousClass62P) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N4R.<init>(X.62P, int):void");
    }

    public N4R(EVN evn, List list) {
        this.A01 = 34;
        AnonymousClass7TG.A1O(list, evn);
        this.A02 = list;
        this.A00 = evn;
    }

    public N4R(EVO evo, List list) {
        this.A01 = 33;
        AnonymousClass7TG.A1O(list, evo);
        this.A02 = list;
        this.A00 = evo;
    }

    public N4R(C62807Kmj kmj, List list) {
        this.A01 = 12;
        AnonymousClass7TG.A1O(list, kmj);
        this.A02 = list;
        this.A00 = kmj;
    }

    public N4R(C62810Kmm kmm, List list) {
        this.A01 = 19;
        AnonymousClass7TG.A1O(list, kmm);
        this.A02 = list;
        this.A00 = kmm;
    }

    public N4R(C63893LAw lAw, List list) {
        this.A01 = 32;
        0qQ.A0B(list, 2);
        this.A02 = lAw;
        this.A00 = list;
    }

    public N4R(N9J n9j, Integer num) {
        this.A01 = 47;
        0qQ.A0B(n9j, 1);
        this.A00 = n9j;
        this.A02 = num;
    }

    public N4R(AnonymousClass62P r2, AnonymousClass62P r3) {
        this.A01 = 9;
        AnonymousClass7TG.A1O(r2, r3);
        this.A00 = r2;
        this.A02 = r3;
    }

    public N4R(C61084JwM jwM, List list) {
        this.A01 = 24;
        0qQ.A0B(jwM, 2);
        this.A02 = list;
        this.A00 = jwM;
    }

    public N4R(Integer num, Integer num2, int i) {
        this.A01 = i;
        switch (i) {
            case 22:
                0qQ.A0B(num, 1);
                this.A02 = num;
                this.A00 = num2;
                return;
            case 39:
            case 45:
                break;
            default:
                0qQ.A0B(num, 1);
                break;
        }
        this.A00 = num;
        this.A02 = num2;
    }

    public N4R(AnonymousClass5FV r2, ImageUrl imageUrl) {
        this.A01 = 2;
        this.A02 = r2;
        this.A00 = imageUrl;
    }

    public N4R(EWM ewm, List list) {
        this.A01 = 5;
        this.A02 = ewm;
        this.A00 = list;
    }

    public N4R(C69369Nk9 nk9, List list) {
        this.A01 = 7;
        this.A02 = nk9;
        this.A00 = list;
    }

    public N4R(C69582NoQ noQ, C69582NoQ noQ2) {
        this.A01 = 3;
        this.A02 = noQ;
        this.A00 = noQ2;
    }

    public N4R(EngineModel engineModel, N9J n9j) {
        this.A01 = 49;
        0qQ.A0B(n9j, 2);
        this.A00 = engineModel;
        this.A02 = n9j;
    }

    public N4R(1Xj r2, DirectMessageIdentifier directMessageIdentifier) {
        this.A01 = 17;
        this.A02 = directMessageIdentifier;
        this.A00 = r2;
    }

    public N4R(OEP oep, IGRTCSignalingCoordinator iGRTCSignalingCoordinator) {
        this.A01 = 48;
        this.A02 = iGRTCSignalingCoordinator;
        this.A00 = oep;
    }

    public N4R(C74514Pw9 pw9, C74516PwB pwB) {
        this.A01 = 14;
        this.A02 = pwB;
        this.A00 = pw9;
    }

    public N4R(View.OnClickListener onClickListener, Integer num) {
        this.A01 = 41;
        this.A02 = num;
        this.A00 = onClickListener;
    }

    public N4R(AnonymousClass9J3 r2, Integer num) {
        this.A01 = 26;
        this.A00 = num;
        this.A02 = r2;
    }

    public N4R(C61078JwG jwG, C54634HLr hLr) {
        this.A01 = 42;
        this.A00 = jwG;
        this.A02 = hLr;
    }

    public N4R(Notification notification, Map map) {
        this.A01 = 18;
        this.A00 = notification;
        this.A02 = map;
    }

    public N4R(OpalProfileData opalProfileData, C62520KhB khB) {
        this.A01 = 43;
        this.A00 = opalProfileData;
        this.A02 = khB;
    }

    public N4R(CharSequence charSequence, List list) {
        this.A01 = 44;
        this.A00 = charSequence;
        this.A02 = list;
    }

    public N4R(1Xj r2, List list) {
        this.A01 = 27;
        this.A02 = r2;
        this.A00 = list;
    }

    public N4R(2EM r2, Boolean bool) {
        this.A01 = 13;
        this.A02 = r2;
        this.A00 = bool;
    }

    public N4R(SpannableString spannableString, List list) {
        this.A01 = 15;
        this.A02 = spannableString;
        this.A00 = list;
    }

    public N4R(ImageUrl imageUrl, ImageUrl imageUrl2) {
        this.A01 = 30;
        this.A02 = imageUrl;
        this.A00 = imageUrl2;
    }

    public N4R(StickerPack stickerPack, Integer num) {
        this.A01 = 11;
        this.A02 = stickerPack;
        this.A00 = num;
    }

    public N4R(C252063oV r2, IgProgressImageView igProgressImageView) {
        this.A01 = 16;
        0qQ.A0B(igProgressImageView, 1);
        this.A00 = igProgressImageView;
        this.A02 = r2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public N4R(Integer num) {
        this(num, (Integer) null, 22);
        this.A01 = 22;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public N4R() {
        this((C61078JwG) null, C54634HLr.INITIAL);
        this.A01 = 42;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public N4R(StickerPack stickerPack, Integer num, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((StickerPack) null, AnonymousClass05K.A00);
        this.A01 = 11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public N4R(CharSequence charSequence, List list, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((CharSequence) null, (List) 0sn.A00);
        this.A01 = 44;
    }

    public N4R(CharSequence charSequence, CharSequence charSequence2, int i) {
        this.A01 = i;
        this.A02 = charSequence;
        this.A00 = charSequence2;
    }

    public N4R(List list, List list2, int i) {
        this.A01 = i;
        this.A00 = list;
        this.A02 = list2;
    }

    public N4R(int i, Object obj, Object obj2) {
        this.A01 = i;
        this.A02 = obj;
        this.A00 = obj2;
    }

    public N4R(C16550Uwx uwx) {
        this.A01 = 40;
        Integer num = AnonymousClass05K.A01;
        this.A01 = 40;
        this.A02 = uwx;
        this.A00 = num;
    }

    public N4R(GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.Sections sections) {
        this.A01 = 0;
        this.A02 = sections;
        this.A00 = null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public N4R(int r3) {
        /*
            r2 = this;
            r2.A01 = r3
            X.0sn r1 = X.0sn.A00
            switch(r3) {
                case 10: goto L_0x0010;
                case 20: goto L_0x000d;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 31
        L_0x0009:
            r2.<init>((java.util.List) r1, (java.util.List) r1, (int) r0)
            return
        L_0x000d:
            r0 = 20
            goto L_0x0009
        L_0x0010:
            r0 = 10
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N4R.<init>(int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public N4R(C266444Yx r4, Integer num, int i) {
        this(38, (Object) (i & 2) != 0 ? null : num, (Object) (i & 1) != 0 ? null : r4);
        this.A01 = 38;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public N4R(C61052Jvq jvq, C60959JuH juH, int i) {
        this(36, (Object) (i & 1) != 0 ? null : jvq, (Object) (i & 2) != 0 ? null : juH);
        this.A01 = 36;
    }

    public N4R(C61081JwJ jwJ) {
        this.A01 = 8;
        Boolean A0u = AnonymousClass7TE.A0u();
        C284885Or A002 = C289465dd.A00();
        AnonymousClass0eM r0 = C284905Ot.A01;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(A002, A0u);
        this.A01 = 8;
        0qQ.A0B(jwJ, 1);
        this.A00 = jwJ;
        this.A02 = parcelableSnapshotMutableState;
    }

    public N4R(CountryCodeData countryCodeData, Integer num, int i) {
        this.A01 = 37;
        countryCodeData = (i & 1) != 0 ? null : countryCodeData;
        num = (i & 2) != 0 ? AnonymousClass05K.A0C : num;
        this.A01 = 37;
        0qQ.A0B(num, 2);
        this.A00 = countryCodeData;
        this.A02 = num;
    }

    public N4R(Map map) {
        this.A01 = 1;
        this.A02 = map;
        this.A00 = AnonymousClass0eN.A00(0eO.A02, new Dbl(this, 40));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public N4R(com.instagram.opal.impl.data.OpalProfileData r15, X.C62520KhB r16, kotlin.jvm.internal.DefaultConstructorMarker r17, int r18, int r19) {
        /*
            r14 = this;
            r0 = 43
            r14.A01 = r0
            r6 = 0
            r10 = 1
            java.lang.String r2 = ""
            r9 = 0
            X.KhB r1 = X.C62520KhB.Uninitialized
            X.0sn r8 = X.0sn.A00
            com.instagram.opal.impl.data.OpalProfileData r0 = new com.instagram.opal.impl.data.OpalProfileData
            r3 = r2
            r4 = r2
            r5 = r2
            r7 = r2
            r11 = r9
            r12 = r9
            r13 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.<init>((com.instagram.opal.impl.data.OpalProfileData) r0, (X.C62520KhB) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N4R.<init>(com.instagram.opal.impl.data.OpalProfileData, X.KhB, kotlin.jvm.internal.DefaultConstructorMarker, int, int):void");
    }
}
