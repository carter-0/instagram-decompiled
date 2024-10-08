package X;

import android.content.Context;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.3vc  reason: invalid class name and case insensitive filesystem */
public final class C256343vc extends C256353vd {
    public final Context A00;
    public final HeroPlayerSetting A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C256343vc(android.content.Context r9, com.facebook.video.heroplayer.setting.HeroPlayerSetting r10, java.lang.String r11, boolean r12) {
        /*
            r8 = this;
            X.21h r0 = r10.A13
            if (r0 == 0) goto L_0x0019
            boolean r3 = r0.A00
        L_0x0006:
            boolean r4 = r10.A1K
            boolean r5 = r10.A2s
            boolean r6 = r10.A1t
            int r2 = r10.A0C
            r0 = r8
            r1 = r11
            r7 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.A01 = r10
            r8.A00 = r9
            return
        L_0x0019:
            r3 = 0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C256343vc.<init>(android.content.Context, com.facebook.video.heroplayer.setting.HeroPlayerSetting, java.lang.String, boolean):void");
    }

    public final C256553vx A0L(C256553vx r40, XmlPullParser xmlPullParser) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7 = -1;
        C256553vx r12 = r40;
        if (r40 == null || !(r12 instanceof C256583w0)) {
            j = -1;
        } else {
            j = ((C256583w0) r12).A00;
        }
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String attributeValue = xmlPullParser2.getAttributeValue((String) null, "FBFirstSegmentRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            if (split.length == 2) {
                j = Long.parseLong(split[1]);
            } else {
                j = -1;
            }
        }
        if (r40 == null || !(r12 instanceof C256583w0)) {
            j2 = -1;
        } else {
            j2 = ((C256583w0) r12).A04;
        }
        String attributeValue2 = xmlPullParser2.getAttributeValue((String) null, "FBSecondSegmentRange");
        if (attributeValue2 != null) {
            String[] split2 = attributeValue2.split("-");
            if (split2.length == 2) {
                j2 = Long.parseLong(split2[1]);
            } else {
                j2 = -1;
            }
        }
        if (r40 == null || !(r12 instanceof C256583w0)) {
            j3 = -1;
        } else {
            j3 = ((C256583w0) r12).A05;
        }
        String attributeValue3 = xmlPullParser2.getAttributeValue((String) null, "FBThirdSegmentRange");
        if (attributeValue3 != null) {
            String[] split3 = attributeValue3.split("-");
            if (split3.length == 2) {
                j3 = Long.parseLong(split3[1]);
            } else {
                j3 = -1;
            }
        }
        if (r40 == null || !(r12 instanceof C256583w0)) {
            j4 = -1;
        } else {
            j4 = ((C256583w0) r12).A05;
        }
        String attributeValue4 = xmlPullParser2.getAttributeValue((String) null, "FBFourthSegmentRange");
        if (attributeValue4 != null) {
            String[] split4 = attributeValue4.split("-");
            if (split4.length == 2) {
                j4 = Long.parseLong(split4[1]);
            } else {
                j4 = -1;
            }
        }
        if (r40 == null || !(r12 instanceof C256583w0)) {
            j5 = -1;
        } else {
            j5 = ((C256583w0) r12).A03;
        }
        String attributeValue5 = xmlPullParser2.getAttributeValue((String) null, "FBPrefetchSegmentRange");
        if (attributeValue5 != null) {
            String[] split5 = attributeValue5.split("-");
            if (split5.length == 2) {
                j5 = Long.parseLong(split5[1]);
            } else {
                j5 = -1;
            }
        }
        if (r40 == null || !(r12 instanceof C256583w0)) {
            j6 = -1;
        } else {
            j6 = ((C256583w0) r12).A02;
        }
        String attributeValue6 = xmlPullParser2.getAttributeValue((String) null, "FBMinimumPrefetchRange");
        if (attributeValue6 != null) {
            String[] split6 = attributeValue6.split("-");
            if (split6 != null) {
                try {
                    if (split6.length > 1) {
                        j7 = Long.parseLong(split6[1]);
                    }
                } catch (NumberFormatException unused) {
                }
            }
        } else {
            j7 = j6;
        }
        C256553vx A0L = super.A0L(r12, xmlPullParser2);
        C256573vz r18 = A0L.A02;
        long j8 = A0L.A01;
        long j9 = A0L.A00;
        return new C256583w0(r18, j8, j9, A0L.A01, A0L.A00, j, j2, j3, j4, j5, j7);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C256343vc() {
        /*
            r4 = this;
            X.1wj r3 = new X.1wj
            r3.<init>()
            r2 = 0
            r3.A03 = r2
            r3.A1d = r2
            r0 = 1
            r3.A1Y = r0
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r1 = new com.facebook.video.heroplayer.setting.HeroPlayerSetting
            r1.<init>(r3)
            r0 = 0
            r4.<init>(r0, r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C256343vc.<init>():void");
    }
}
