package X;

import android.graphics.drawable.Drawable;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.List;

/* renamed from: X.9Iz  reason: invalid class name and case insensitive filesystem */
public final class C376699Iz extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C376699Iz(0sP r4, List list) {
        this.A03 = 0;
        String obj = AnonymousClass0HM.A00().toString();
        this.A03 = 0;
        0qQ.A0B(obj, 3);
        this.A00 = list;
        this.A01 = r4;
        this.A02 = obj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C376699Iz) || ((C376699Iz) obj).A03 != i) {
            return false;
        }
        return true;
    }

    public final String A01() {
        String str = this.A02;
        if (str != null) {
            return str;
        }
        ImageUrl imageUrl = (ImageUrl) this.A01;
        if (imageUrl != null) {
            String url = imageUrl.getUrl();
            0qQ.A07(url);
            return url;
        }
        Object obj = this.A00;
        if (obj != null) {
            return String.valueOf(obj.hashCode());
        }
        throw new IllegalArgumentException("Either url or drawable must be set");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0094, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c0, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L_0x002f;
                case 1: goto L_0x000a;
                case 2: goto L_0x0045;
                case 3: goto L_0x005c;
                case 4: goto L_0x007c;
                case 5: goto L_0x0099;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.equals(r3)
            return r0
        L_0x000a:
            if (r2 == r3) goto L_0x00c4
            r0 = 1
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x00c2
            X.9Iz r3 = (X.C376699Iz) r3
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x00bc
        L_0x002f:
            if (r2 == r3) goto L_0x00c4
            r0 = 0
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x00c2
            X.9Iz r3 = (X.C376699Iz) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0057
            goto L_0x00c2
        L_0x0045:
            if (r2 == r3) goto L_0x00c4
            r0 = 2
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x00c2
            X.9Iz r3 = (X.C376699Iz) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x0057
            goto L_0x00c2
        L_0x0057:
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L_0x0075
        L_0x005c:
            if (r2 == r3) goto L_0x00c4
            r0 = 3
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x00c2
            X.9Iz r3 = (X.C376699Iz) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
        L_0x0075:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0094
            goto L_0x00c2
        L_0x007c:
            if (r2 == r3) goto L_0x00c4
            r0 = 4
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x00c2
            X.9Iz r3 = (X.C376699Iz) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 != r0) goto L_0x00c2
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L_0x0094
            goto L_0x00c2
        L_0x0094:
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto L_0x00bc
        L_0x0099:
            if (r2 == r3) goto L_0x00c4
            r0 = 5
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x00c2
            X.9Iz r3 = (X.C376699Iz) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00c2
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        L_0x00bc:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00c4
        L_0x00c2:
            r0 = 0
            return r0
        L_0x00c4:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376699Iz.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        r1 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        if (r0 != null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0086, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0087, code lost:
        r1 = (r1 + r0) * 31;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008c, code lost:
        if (r0 == null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008e, code lost:
        r2 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        r0 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b9, code lost:
        return r1 + r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A03
            switch(r0) {
                case 0: goto L_0x0045;
                case 1: goto L_0x00a1;
                case 2: goto L_0x006d;
                case 3: goto L_0x005d;
                case 4: goto L_0x002e;
                case 5: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r1 = super.hashCode()
            return r1
        L_0x000a:
            java.lang.Object r0 = r3.A00
            r2 = 0
            if (r0 != 0) goto L_0x0029
            r0 = 0
        L_0x0010:
            int r1 = r0 * 31
            java.lang.String r0 = r3.A02
            if (r0 != 0) goto L_0x0024
            r0 = 0
        L_0x0017:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            if (r0 == 0) goto L_0x00b8
            int r2 = r0.hashCode()
            goto L_0x00b8
        L_0x0024:
            int r0 = r0.hashCode()
            goto L_0x0017
        L_0x0029:
            int r0 = r0.hashCode()
            goto L_0x0010
        L_0x002e:
            java.lang.Object r0 = r3.A00
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A01
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.String r0 = r3.A02
            if (r0 != 0) goto L_0x0058
            r1 = 0
            goto L_0x00b8
        L_0x0045:
            java.lang.Object r0 = r3.A00
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A01
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.String r0 = r3.A02
        L_0x0058:
            int r1 = r0.hashCode()
            goto L_0x00b8
        L_0x005d:
            java.lang.Object r0 = r3.A01
            r2 = 0
            if (r0 != 0) goto L_0x0068
            r0 = 0
        L_0x0063:
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A00
            goto L_0x0084
        L_0x0068:
            int r0 = r0.hashCode()
            goto L_0x0063
        L_0x006d:
            java.lang.Object r0 = r3.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            switch(r1) {
                case 1: goto L_0x0098;
                case 2: goto L_0x009b;
                case 3: goto L_0x009e;
                default: goto L_0x0078;
            }
        L_0x0078:
            java.lang.String r0 = "Empty"
        L_0x007a:
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A01
            r2 = 0
        L_0x0084:
            if (r0 != 0) goto L_0x0093
            r0 = 0
        L_0x0087:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A02
            if (r0 == 0) goto L_0x00b8
            int r2 = r0.hashCode()
            goto L_0x00b8
        L_0x0093:
            int r0 = r0.hashCode()
            goto L_0x0087
        L_0x0098:
            java.lang.String r0 = "Loading"
            goto L_0x007a
        L_0x009b:
            java.lang.String r0 = "Success"
            goto L_0x007a
        L_0x009e:
            java.lang.String r0 = "Fail"
            goto L_0x007a
        L_0x00a1:
            java.lang.String r0 = r3.A02
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A01
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r1 = r0.hashCode()
        L_0x00b8:
            int r1 = r1 + r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376699Iz.hashCode():int");
    }

    public final String toString() {
        if (6 - this.A03 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("PushUpRuleModificationTrackerData(previousPushUpMinGap=");
        sb.append(this.A00);
        sb.append(", previousTimeGap=");
        sb.append(this.A01);
        sb.append(AnonymousClass000.A00(2044));
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C376699Iz(Drawable drawable, ImageUrl imageUrl, String str, int i) {
        this.A03 = 3;
        imageUrl = (i & 1) != 0 ? null : imageUrl;
        drawable = (i & 2) != 0 ? null : drawable;
        str = (i & 4) != 0 ? null : str;
        this.A03 = 3;
        this.A01 = imageUrl;
        this.A00 = drawable;
        this.A02 = str;
        if (imageUrl == null && drawable == null) {
            throw new IllegalArgumentException("Either url or drawable must be set");
        }
    }

    public C376699Iz(VoiceOption voiceOption, Integer num, String str) {
        this.A03 = 2;
        0qQ.A0B(num, 1);
        this.A00 = num;
        this.A01 = voiceOption;
        this.A02 = str;
    }

    public C376699Iz(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = str;
    }

    public C376699Iz(IntentAwareAdsInfoIntf intentAwareAdsInfoIntf, String str, List list) {
        this.A03 = 1;
        0qQ.A0B(str, 1);
        0qQ.A0B(intentAwareAdsInfoIntf, 2);
        this.A02 = str;
        this.A01 = intentAwareAdsInfoIntf;
        this.A00 = list;
    }

    public C376699Iz(QuickPromotionSurface quickPromotionSurface, Trigger trigger, String str) {
        this.A03 = 4;
        0qQ.A0B(quickPromotionSurface, 1);
        0qQ.A0B(trigger, 2);
        this.A00 = quickPromotionSurface;
        this.A01 = trigger;
        this.A02 = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C376699Iz(Integer num) {
        this((VoiceOption) null, num, (String) null);
        this.A03 = 2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C376699Iz() {
        this((Object) null, (Object) null, (String) null, 6);
        this.A03 = 6;
    }
}
