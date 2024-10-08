package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.google.android.exoplayer2.util.Util;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: X.3vd  reason: invalid class name and case insensitive filesystem */
public abstract class C256353vd extends DefaultHandler implements C256363ve {
    public static final Pattern A08 = Pattern.compile("CC([1-4])=.*");
    public static final Pattern A09 = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final Pattern A0A = Pattern.compile("^https?:\\/\\/[^\\/]+(\\/.+)$");
    public static final int[] A0B = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public static final Pattern A0C = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public long A00 = 0;
    public C256623w5 A01 = null;
    public String A02;
    public final String A03;
    public final XmlPullParserFactory A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public static float A00(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = A0C.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        String group = matcher.group(2);
        float f2 = (float) parseInt;
        if (!TextUtils.isEmpty(group)) {
            return f2 / ((float) Integer.parseInt(group));
        }
        return f2;
    }

    public static final int A01(String str) {
        String str2;
        if (str != null) {
            switch (str.hashCode()) {
                case -2060497896:
                    str2 = "subtitle";
                    break;
                case -1724546052:
                    if (str.equals(DevServerEntity.COLUMN_DESCRIPTION)) {
                        return 512;
                    }
                    break;
                case -1580883024:
                    if (str.equals("enhanced-audio-intelligibility")) {
                        return C249703kE.FLAG_MOVED;
                    }
                    break;
                case -1574842690:
                    str2 = "forced_subtitle";
                    break;
                case -1408024454:
                    if (str.equals("alternate")) {
                        return 2;
                    }
                    break;
                case -1396432756:
                    str2 = "forced-subtitle";
                    break;
                case 99825:
                    if (str.equals("dub")) {
                        return 16;
                    }
                    break;
                case 3343801:
                    if (str.equals("main")) {
                        return 1;
                    }
                    break;
                case 3530173:
                    if (str.equals("sign")) {
                        return 256;
                    }
                    break;
                case 552573414:
                    if (str.equals("caption")) {
                        return 64;
                    }
                    break;
                case 899152809:
                    return !str.equals("commentary") ? 0 : 8;
                case 1629013393:
                    if (str.equals("emergency")) {
                        return 32;
                    }
                    break;
                case 1855372047:
                    if (str.equals("supplementary")) {
                        return 4;
                    }
                    break;
            }
            if (str.equals(str2)) {
                return 128;
            }
        }
        return 0;
    }

    public static int A02(String str, XmlPullParser xmlPullParser, int i) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue != null) {
            return Integer.parseInt(attributeValue);
        }
        return i;
    }

    public static final int A04(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(attributeValue)) {
            return 1;
        }
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        if ("image".equals(attributeValue)) {
            return 4;
        }
        return -1;
    }

    public static long A05(String str, XmlPullParser xmlPullParser, long j) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = Util.A05.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean z = !TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double d6 = 0.0d;
        if (group != null) {
            d = Double.parseDouble(group) * 3.1556908E7d;
        } else {
            d = 0.0d;
        }
        String group2 = matcher.group(5);
        if (group2 != null) {
            d2 = Double.parseDouble(group2) * 2629739.0d;
        } else {
            d2 = 0.0d;
        }
        double d7 = d + d2;
        String group3 = matcher.group(7);
        if (group3 != null) {
            d3 = Double.parseDouble(group3) * 86400.0d;
        } else {
            d3 = 0.0d;
        }
        double d8 = d7 + d3;
        String group4 = matcher.group(10);
        if (group4 != null) {
            d4 = Double.parseDouble(group4) * 3600.0d;
        } else {
            d4 = 0.0d;
        }
        double d9 = d8 + d4;
        String group5 = matcher.group(12);
        if (group5 != null) {
            d5 = Double.parseDouble(group5) * 60.0d;
        } else {
            d5 = 0.0d;
        }
        double d10 = d9 + d5;
        String group6 = matcher.group(14);
        if (group6 != null) {
            d6 = Double.parseDouble(group6);
        }
        long j2 = (long) ((d10 + d6) * 1000.0d);
        if (z) {
            return -j2;
        }
        return j2;
    }

    public static long A06(String str, XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue != null) {
            return Long.parseLong(attributeValue);
        }
        return j;
    }

    public static final long A07(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x014e, code lost:
        r7 = null;
        r0 = null;
        r4 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.util.Pair A08(org.xmlpull.v1.XmlPullParser r11) {
        /*
            r6 = 0
            java.lang.String r0 = "schemeIdUri"
            java.lang.String r0 = r11.getAttributeValue(r6, r0)
            r5 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = X.C256643w7.A00(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1980789791: goto L_0x0144;
                case 489446379: goto L_0x0139;
                case 755418770: goto L_0x012e;
                case 1812765994: goto L_0x00c4;
                default: goto L_0x0015;
            }
        L_0x0015:
            r7 = r6
            r0 = r6
        L_0x0017:
            r3 = r6
            r4 = r6
        L_0x0019:
            r11.next()
            java.lang.String r1 = "clearkey:Laurl"
            boolean r1 = X.C256493vr.A01(r1, r11)
            r8 = 4
            if (r1 == 0) goto L_0x0045
            int r1 = r11.next()
            if (r1 != r8) goto L_0x0045
            java.lang.String r4 = r11.getText()
        L_0x002f:
            java.lang.String r1 = "ContentProtection"
            boolean r1 = X.C256493vr.A00(r1, r11)
            if (r1 == 0) goto L_0x0019
            if (r3 == 0) goto L_0x0040
            java.lang.String r1 = "video/mp4"
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r6 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
            r6.<init>(r4, r1, r3, r0)
        L_0x0040:
            android.util.Pair r0 = android.util.Pair.create(r7, r6)
            return r0
        L_0x0045:
            java.lang.String r1 = "ms:laurl"
            boolean r1 = X.C256493vr.A01(r1, r11)
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = "licenseUrl"
            java.lang.String r4 = r11.getAttributeValue(r6, r1)
            goto L_0x002f
        L_0x0054:
            if (r0 != 0) goto L_0x00bf
            java.lang.String r10 = "pssh"
            int r2 = r11.getEventType()
            r1 = 2
            if (r2 != r1) goto L_0x009b
            java.lang.String r9 = r11.getName()
            r1 = 58
            int r2 = r9.indexOf(r1)
            r1 = -1
            if (r2 == r1) goto L_0x0072
            int r1 = r2 + 1
            java.lang.String r9 = r9.substring(r1)
        L_0x0072:
            boolean r1 = r9.equals(r10)
            if (r1 == 0) goto L_0x009b
            int r1 = r11.next()
            if (r1 != r8) goto L_0x009b
            java.lang.String r0 = r11.getText()
            byte[] r0 = android.util.Base64.decode(r0, r5)
            X.Ruo r1 = X.C11303SKn.A00(r0)
            if (r1 != 0) goto L_0x0098
            r3 = 0
        L_0x008d:
            if (r3 != 0) goto L_0x002f
            java.lang.String r1 = "MpdParser"
            java.lang.String r0 = "Skipping malformed cenc:pssh data"
            android.util.Log.w(r1, r0)
            r0 = r6
            goto L_0x002f
        L_0x0098:
            java.util.UUID r3 = r1.A01
            goto L_0x008d
        L_0x009b:
            java.util.UUID r2 = X.AnonymousClass4T7.A02
            boolean r1 = r2.equals(r3)
            if (r1 == 0) goto L_0x00bf
            java.lang.String r1 = "mspr:pro"
            boolean r1 = X.C256493vr.A01(r1, r11)
            if (r1 == 0) goto L_0x00bf
            int r1 = r11.next()
            if (r1 != r8) goto L_0x00bf
            java.lang.String r0 = r11.getText()
            byte[] r0 = android.util.Base64.decode(r0, r5)
            byte[] r0 = X.C11303SKn.A02(r2, r0, r6)
            goto L_0x002f
        L_0x00bf:
            A0D(r11)
            goto L_0x002f
        L_0x00c4:
            java.lang.String r0 = "urn:mpeg:dash:mp4protection:2011"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = "value"
            java.lang.String r7 = r11.getAttributeValue(r6, r0)
            java.lang.String r8 = "default_KID"
            int r4 = r11.getAttributeCount()
            r3 = 0
        L_0x00d9:
            if (r3 >= r4) goto L_0x0120
            java.lang.String r2 = r11.getAttributeName(r3)
            r0 = 58
            int r1 = r2.indexOf(r0)
            r0 = -1
            if (r1 == r0) goto L_0x00ee
            int r0 = r1 + 1
            java.lang.String r2 = r2.substring(r0)
        L_0x00ee:
            boolean r0 = r2.equals(r8)
            if (r0 == 0) goto L_0x011d
            java.lang.String r1 = r11.getAttributeValue(r3)
        L_0x00f8:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x012b
            java.lang.String r0 = "00000000-0000-0000-0000-000000000000"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x012b
            java.lang.String r0 = "\\s+"
            java.lang.String[] r4 = r1.split(r0)
            int r3 = r4.length
            java.util.UUID[] r2 = new java.util.UUID[r3]
            r1 = 0
        L_0x0110:
            if (r1 >= r3) goto L_0x0122
            r0 = r4[r1]
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x0110
        L_0x011d:
            int r3 = r3 + 1
            goto L_0x00d9
        L_0x0120:
            r1 = 0
            goto L_0x00f8
        L_0x0122:
            java.util.UUID r3 = X.AnonymousClass4T7.A01
            byte[] r0 = X.C11303SKn.A02(r3, r6, r2)
            r4 = r6
            goto L_0x0019
        L_0x012b:
            r0 = r6
            goto L_0x0017
        L_0x012e:
            java.lang.String r0 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            java.util.UUID r3 = X.AnonymousClass4T7.A04
            goto L_0x014e
        L_0x0139:
            java.lang.String r0 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            java.util.UUID r3 = X.AnonymousClass4T7.A02
            goto L_0x014e
        L_0x0144:
            java.lang.String r0 = "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            java.util.UUID r3 = X.AnonymousClass4T7.A00
        L_0x014e:
            r7 = r6
            r0 = r6
            r4 = r6
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C256353vd.A08(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c5, code lost:
        r6[r4] = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d2, code lost:
        r5[r4] = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C45443CwV A0A(X.C45443CwV r10, java.lang.String r11, org.xmlpull.v1.XmlPullParser r12) {
        /*
            r0 = 0
            java.lang.String r7 = r12.getAttributeValue(r0, r11)
            if (r7 == 0) goto L_0x00de
            r0 = 5
            java.lang.String[] r8 = new java.lang.String[r0]
            r0 = 4
            int[] r6 = new int[r0]
            java.lang.String[] r5 = new java.lang.String[r0]
            r9 = 0
            java.lang.String r12 = ""
            r8[r9] = r12
            r0 = 0
            r4 = 0
        L_0x0016:
            int r11 = r7.length()
            if (r0 >= r11) goto L_0x00d8
            java.lang.String r10 = "$"
            int r3 = r7.indexOf(r10, r0)
            r2 = -1
            if (r3 != r2) goto L_0x0033
            r1 = r8[r4]
            java.lang.String r0 = r7.substring(r0)
            java.lang.String r0 = X.002.A0R(r1, r0)
            r8[r4] = r0
            r0 = r11
            goto L_0x0016
        L_0x0033:
            if (r3 == r0) goto L_0x0043
            r1 = r8[r4]
            java.lang.String r0 = r7.substring(r0, r3)
            java.lang.String r0 = X.002.A0R(r1, r0)
            r8[r4] = r0
            r0 = r3
            goto L_0x0016
        L_0x0043:
            java.lang.String r1 = "$$"
            boolean r1 = r7.startsWith(r1, r0)
            if (r1 == 0) goto L_0x0056
            r1 = r8[r4]
            java.lang.String r1 = X.002.A0R(r1, r10)
            r8[r4] = r1
            int r0 = r0 + 2
            goto L_0x0016
        L_0x0056:
            int r0 = r0 + 1
            int r3 = r7.indexOf(r10, r0)
            java.lang.String r10 = r7.substring(r0, r3)
            java.lang.String r0 = "RepresentationID"
            boolean r1 = r10.equals(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0072
            r6[r4] = r0
        L_0x006b:
            int r4 = r4 + 1
            r8[r4] = r12
            int r0 = r3 + 1
            goto L_0x0016
        L_0x0072:
            java.lang.String r0 = "%0"
            int r11 = r10.indexOf(r0)
            if (r11 == r2) goto L_0x00d5
            java.lang.String r2 = r10.substring(r11)
            java.lang.String r1 = "d"
            boolean r0 = r2.endsWith(r1)
            if (r0 != 0) goto L_0x009a
            java.lang.String r0 = "x"
            boolean r0 = r2.endsWith(r0)
            if (r0 != 0) goto L_0x009a
            java.lang.String r0 = "X"
            boolean r0 = r2.endsWith(r0)
            if (r0 != 0) goto L_0x009a
            java.lang.String r2 = X.002.A0R(r2, r1)
        L_0x009a:
            java.lang.String r10 = r10.substring(r9, r11)
        L_0x009e:
            int r0 = r10.hashCode()
            r1 = 2
            switch(r0) {
                case -1950496919: goto L_0x00c8;
                case 2606829: goto L_0x00bc;
                case 38199441: goto L_0x00b2;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            java.lang.String r0 = "Invalid template: "
            java.lang.String r1 = X.002.A0R(r0, r7)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00b2:
            java.lang.String r0 = "Bandwidth"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00a6
            r0 = 3
            goto L_0x00c5
        L_0x00bc:
            java.lang.String r0 = "Time"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00a6
            r0 = 4
        L_0x00c5:
            r6[r4] = r0
            goto L_0x00d2
        L_0x00c8:
            java.lang.String r0 = "Number"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00a6
            r6[r4] = r1
        L_0x00d2:
            r5[r4] = r2
            goto L_0x006b
        L_0x00d5:
            java.lang.String r2 = "%01d"
            goto L_0x009e
        L_0x00d8:
            X.CwV r0 = new X.CwV
            r0.<init>(r6, r8, r5, r4)
            return r0
        L_0x00de:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C256353vd.A0A(X.CwV, java.lang.String, org.xmlpull.v1.XmlPullParser):X.CwV");
    }

    public static final ArrayList A0C(List list, XmlPullParser xmlPullParser, boolean z) {
        int i;
        int i2;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "dvb:priority");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else {
            i = AnonymousClass972.MUTABLE_FLAG_MASK;
            if (z) {
                i = 1;
            }
        }
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "dvb:weight");
        if (attributeValue2 != null) {
            i2 = Integer.parseInt(attributeValue2);
        } else {
            i2 = 1;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue((String) null, "serviceLocation");
        String str = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str = xmlPullParser.getText();
            } else {
                A0D(xmlPullParser);
            }
        } while (!C256493vr.A00("BaseURL", xmlPullParser));
        if (str == null || C256543vw.A02(str)[0] == -1) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < list.size(); i3++) {
                C256383vg r3 = (C256383vg) list.get(i3);
                String A002 = C256543vw.A00(r3.A03, str);
                String str2 = attributeValue3;
                if (attributeValue3 == null) {
                    str2 = A002;
                }
                if (z) {
                    i = r3.A00;
                    i2 = r3.A01;
                    str2 = r3.A02;
                }
                arrayList.add(new C256383vg(A002, str2, i, i2));
            }
            return arrayList;
        }
        if (attributeValue3 == null) {
            attributeValue3 = str;
        }
        return C256393vh.A01(new C256383vg(str, attributeValue3, i, i2));
    }

    public static boolean A0E(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C256793wM r0 = (C256793wM) it.next();
            if (r0 != null) {
                int i2 = 0;
                for (C256773wK r02 : r0.A03) {
                    if (r02 != null && r02.A01 == i && (i2 = i2 + 1) > 1) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    public static boolean A0F(List list) {
        String str;
        if (A0E(2, list)) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C256793wM r0 = (C256793wM) it.next();
            if (r0 != null) {
                for (C256773wK r1 : r0.A03) {
                    if (r1 != null && r1.A01 == 2) {
                        String str2 = "";
                        for (C256733wG r02 : r1.A07) {
                            if (!(r02 == null || (str = r02.A02.A0W) == null || TextUtils.isEmpty(str))) {
                                if (TextUtils.isEmpty(str2)) {
                                    str2 = str;
                                } else if (!str2.equals(str)) {
                                    return true;
                                }
                            }
                        }
                        continue;
                    }
                }
                continue;
            }
        }
        return false;
    }

    public final C256573vz A0H(String str, String str2, XmlPullParser xmlPullParser) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
            }
            j2 = -1;
        } else {
            j = 0;
            j2 = -1;
        }
        return new C256573vz(attributeValue, j, j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0065, code lost:
        if (r2.equals(r0) == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
        r0 = r4.getAttributeValue((java.lang.String) null, com.facebook.react.modules.intent.IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006d, code lost:
        if (r0 == null) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006f, code lost:
        r3 = X.C256643w7.A00(r0);
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0078, code lost:
        switch(r3.hashCode()) {
            case 1596796: goto L_0x007c;
            case 2937391: goto L_0x0086;
            case 3094035: goto L_0x008f;
            case 3133436: goto L_0x0099;
            default: goto L_0x007b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0082, code lost:
        if (r3.equals("4000") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0084, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        if (r3.equals("a000") != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0095, code lost:
        if (r3.equals("f801") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        r2 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009f, code lost:
        if (r3.equals("fa01") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a1, code lost:
        r2 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ba, code lost:
        if (r2.equals(r0) == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bc, code lost:
        r2 = -1;
        r1 = A02(com.facebook.react.modules.intent.IntentModule.EXTRA_MAP_KEY_FOR_VALUE, r4, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c3, code lost:
        if (r1 <= 0) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c7, code lost:
        if (r1 >= 33) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c9, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ca, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if (X.C256493vr.A00("AudioChannelConfiguration", r4) == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A03(org.xmlpull.v1.XmlPullParser r4) {
        /*
            java.lang.String r0 = "schemeIdUri"
            r3 = 0
            r2 = r3
            java.lang.String r0 = r4.getAttributeValue(r3, r0)
            if (r0 == 0) goto L_0x000b
            r2 = r0
        L_0x000b:
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -2128649360: goto L_0x00b4;
                case -1352850286: goto L_0x00a4;
                case -1138141449: goto L_0x005f;
                case -986633423: goto L_0x0044;
                case -79006963: goto L_0x001f;
                case 312179081: goto L_0x0026;
                case 2036691300: goto L_0x0023;
                default: goto L_0x0013;
            }
        L_0x0013:
            r4.next()
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = X.C256493vr.A00(r0, r4)
            if (r0 == 0) goto L_0x0013
            return r1
        L_0x001f:
            java.lang.String r0 = "tag:dts.com,2014:dash:audio_channel_configuration:2012"
            goto L_0x00b6
        L_0x0023:
            java.lang.String r0 = "urn:dolby:dash:audio_channel_configuration:2011"
            goto L_0x0061
        L_0x0026:
            java.lang.String r0 = "tag:dts.com,2018:uhd:audio_channel_configuration"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "value"
            java.lang.String r2 = r4.getAttributeValue(r3, r0)
            if (r2 == 0) goto L_0x0013
            r0 = 16
            int r0 = java.lang.Integer.parseInt(r2, r0)
            int r0 = java.lang.Integer.bitCount(r0)
            if (r0 == 0) goto L_0x0013
            r1 = r0
            goto L_0x0013
        L_0x0044:
            java.lang.String r0 = "urn:mpeg:mpegB:cicp:ChannelConfiguration"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "value"
            r3 = -1
            int r2 = A02(r0, r4, r1)
            if (r2 < 0) goto L_0x005d
            int[] r1 = A0B
            r0 = 21
            if (r2 >= r0) goto L_0x005d
            r3 = r1[r2]
        L_0x005d:
            r1 = r3
            goto L_0x0013
        L_0x005f:
            java.lang.String r0 = "tag:dolby.com,2014:dash:audio_channel_configuration:2011"
        L_0x0061:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "value"
            java.lang.String r0 = r4.getAttributeValue(r3, r0)
            if (r0 == 0) goto L_0x0013
            java.lang.String r3 = X.C256643w7.A00(r0)
            int r0 = r3.hashCode()
            r2 = 2
            switch(r0) {
                case 1596796: goto L_0x007c;
                case 2937391: goto L_0x0086;
                case 3094035: goto L_0x008f;
                case 3133436: goto L_0x0099;
                default: goto L_0x007b;
            }
        L_0x007b:
            goto L_0x0013
        L_0x007c:
            java.lang.String r0 = "4000"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            r1 = 1
            goto L_0x0013
        L_0x0086:
            java.lang.String r0 = "a000"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00ca
            goto L_0x0013
        L_0x008f:
            java.lang.String r0 = "f801"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            r2 = 6
            goto L_0x00ca
        L_0x0099:
            java.lang.String r0 = "fa01"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            r2 = 8
            goto L_0x00ca
        L_0x00a4:
            java.lang.String r0 = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "value"
            int r1 = A02(r0, r4, r1)
            goto L_0x0013
        L_0x00b4:
            java.lang.String r0 = "urn:dts:dash:audio_channel_configuration:2012"
        L_0x00b6:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "value"
            r2 = -1
            int r1 = A02(r0, r4, r1)
            if (r1 <= 0) goto L_0x00ca
            r0 = 33
            if (r1 >= r0) goto L_0x00ca
            r2 = r1
        L_0x00ca:
            r1 = r2
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C256353vd.A03(org.xmlpull.v1.XmlPullParser):int");
    }

    public static C256533vv A09(String str, XmlPullParser xmlPullParser) {
        String str2 = "";
        String str3 = null;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "schemeIdUri");
        if (attributeValue != null) {
            str2 = attributeValue;
        }
        String str4 = null;
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
        if (attributeValue2 != null) {
            str4 = attributeValue2;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue((String) null, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (attributeValue3 != null) {
            str3 = attributeValue3;
        }
        do {
            xmlPullParser.next();
        } while (!C256493vr.A00(str, xmlPullParser));
        return new C256533vv(str2, str4, str3);
    }

    private String A0B(StringBuilder sb, List list) {
        String str = "";
        StringBuilder sb2 = sb;
        sb2.append(002.A0g("VideoId: ", this.A03, "\n"));
        sb2.append("++++++++++++++++++++++++++++++++++++++++\n");
        sb2.append("Is MCM: ");
        sb2.append(A0F(list));
        sb2.append("\n");
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            int i = 0;
            for (C256773wK r1 : ((C256793wM) it.next()).A03) {
                if (r1 != null && r1.A01 == 2) {
                    sb2.append("Adaptation set ");
                    sb2.append(i);
                    sb2.append("\n");
                    i++;
                    int i2 = 0;
                    for (C256733wG r12 : r1.A07) {
                        sb2.append("  [");
                        sb2.append(i2);
                        sb2.append("]");
                        C256683wB r13 = r12.A02;
                        String str2 = r13.A0W;
                        sb2.append(str2);
                        sb2.append(",");
                        sb2.append(r13.A0L);
                        sb2.append("x");
                        sb2.append(r13.A0A);
                        sb2.append(",aoai: ");
                        C256673wA r14 = r13.A0N;
                        sb2.append(r14.A09);
                        sb2.append(",");
                        sb2.append(r14.A07);
                        sb2.append(",");
                        sb2.append(r13.A05);
                        sb2.append("bps\n");
                        i2++;
                        Number num = new Integer(0);
                        if (hashMap.containsKey(str2) && (num = (Number) hashMap.get(str2)) == null) {
                            num = new Integer(0);
                        }
                        hashMap.put(str2, Integer.valueOf(num.intValue() + 1));
                    }
                }
            }
        }
        sb2.append("----------------------------------------\n");
        if (hashMap.isEmpty()) {
            return str;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            str = 002.A0R(002.A0R(str, String.format(Locale.US, "%d%s", new Object[]{entry.getValue(), entry.getKey()})), "+");
        }
        int length = str.length();
        if (length > 1) {
            return str.substring(0, length - 1);
        }
        return str;
    }

    /* JADX WARNING: type inference failed for: r9v6, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r1v15, types: [java.lang.Object, X.XTv] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006f, code lost:
        if (r2 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c4, code lost:
        A0D(r3);
        r9 = r9;
        r1 = r1;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.XOM A0I(X.XOM r28, org.xmlpull.v1.XmlPullParser r29, long r30, long r32, long r34, long r36) {
        /*
            r27 = this;
            r4 = 1
            r0 = r28
            if (r28 == 0) goto L_0x00d3
            long r1 = r0.A01
        L_0x0008:
            java.lang.String r6 = "timescale"
            r3 = r29
            long r11 = A06(r6, r3, r1)
            if (r28 == 0) goto L_0x00cf
            long r1 = r0.A00
        L_0x0014:
            java.lang.String r6 = "presentationTimeOffset"
            long r13 = A06(r6, r3, r1)
            if (r28 == 0) goto L_0x00c8
            long r1 = r0.A02
        L_0x001e:
            java.lang.String r6 = "duration"
            long r17 = A06(r6, r3, r1)
            if (r28 == 0) goto L_0x0028
            long r4 = r0.A05
        L_0x0028:
            java.lang.String r1 = "startNumber"
            long r15 = A06(r1, r3, r4)
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r34 > r19 ? 1 : (r34 == r19 ? 0 : -1))
            if (r1 == 0) goto L_0x0039
            r32 = r34
        L_0x0039:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r32 > r4 ? 1 : (r32 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0044
            r19 = r32
        L_0x0044:
            r6 = 0
            r9 = r6
            r7 = r6
            r1 = r6
        L_0x0048:
            r3.next()
            java.lang.String r2 = "Initialization"
            boolean r4 = X.C256493vr.A01(r2, r3)
            r2 = r27
            if (r4 == 0) goto L_0x009c
            java.lang.String r5 = "sourceURL"
            java.lang.String r4 = "range"
            X.3vz r7 = r2.A0H(r5, r4, r3)
        L_0x005d:
            java.lang.String r2 = "SegmentList"
            boolean r2 = X.C256493vr.A00(r2, r3)
            if (r2 == 0) goto L_0x0048
            if (r28 == 0) goto L_0x0086
            if (r7 != 0) goto L_0x006b
            X.3vz r7 = r0.A02
        L_0x006b:
            if (r1 == 0) goto L_0x0071
            java.util.List r2 = r1.A02
            if (r2 != 0) goto L_0x0082
        L_0x0071:
            java.util.List r5 = r0.A06
            int r4 = r0.A00
            long r2 = r0.A03
            X.XTv r1 = new X.XTv
            r1.<init>()
            r1.A02 = r5
            r1.A00 = r4
            r1.A01 = r2
        L_0x0082:
            if (r9 != 0) goto L_0x0086
            java.util.List r9 = r0.A00
        L_0x0086:
            java.util.List r8 = r1.A02
            int r10 = r1.A00
            long r0 = r1.A01
            long r21 = com.google.android.exoplayer2.util.Util.A07(r36)
            long r23 = com.google.android.exoplayer2.util.Util.A07(r30)
            X.XOM r6 = new X.XOM
            r25 = r0
            r6.<init>(r7, r8, r9, r10, r11, r13, r15, r17, r19, r21, r23, r25)
            return r6
        L_0x009c:
            java.lang.String r4 = "SegmentTimeline"
            boolean r4 = X.C256493vr.A01(r4, r3)
            if (r4 == 0) goto L_0x00a9
            X.XTv r1 = r2.A0K(r6, r3)
            goto L_0x005d
        L_0x00a9:
            java.lang.String r4 = "SegmentURL"
            boolean r4 = X.C256493vr.A01(r4, r3)
            if (r4 == 0) goto L_0x00c4
            if (r9 != 0) goto L_0x00b8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00b8:
            java.lang.String r5 = "media"
            java.lang.String r4 = "mediaRange"
            X.3vz r2 = r2.A0H(r5, r4, r3)
            r9.add(r2)
            goto L_0x005d
        L_0x00c4:
            A0D(r3)
            goto L_0x005d
        L_0x00c8:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x001e
        L_0x00cf:
            r1 = 0
            goto L_0x0014
        L_0x00d3:
            r1 = 1
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C256353vd.A0I(X.XOM, org.xmlpull.v1.XmlPullParser, long, long, long, long):X.XOM");
    }

    /* JADX WARNING: type inference failed for: r11v5, types: [java.lang.Object, X.XTv] */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a0, code lost:
        if (r1 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c5, code lost:
        if (r7.A05 == false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f4, code lost:
        if (r4 != -1) goto L_0x00f6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C256753wI A0J(X.C256753wI r31, java.util.List r32, org.xmlpull.v1.XmlPullParser r33, long r34, long r36, long r38, long r40, boolean r42) {
        /*
            r30 = this;
            r4 = 1
            r0 = r31
            if (r31 == 0) goto L_0x011f
            long r2 = r0.A01
        L_0x0008:
            java.lang.String r6 = "timescale"
            r1 = r33
            long r14 = A06(r6, r1, r2)
            if (r31 == 0) goto L_0x011b
            long r2 = r0.A00
        L_0x0014:
            java.lang.String r6 = "presentationTimeOffset"
            long r16 = A06(r6, r1, r2)
            if (r31 == 0) goto L_0x0114
            long r2 = r0.A02
        L_0x001e:
            java.lang.String r6 = "duration"
            long r20 = A06(r6, r1, r2)
            if (r31 == 0) goto L_0x0028
            long r4 = r0.A05
        L_0x0028:
            java.lang.String r2 = "startNumber"
            long r18 = A06(r2, r1, r4)
            r3 = 0
        L_0x002f:
            r4 = r32
            int r2 = r4.size()
            if (r3 >= r2) goto L_0x004c
            java.lang.Object r2 = r4.get(r3)
            X.3vv r2 = (X.C256533vv) r2
            java.lang.String r5 = r2.A01
            java.lang.String r4 = "http://dashif.org/guidelines/last-segment-number"
            boolean r4 = X.C256643w7.A02(r4, r5)
            if (r4 == 0) goto L_0x0110
            java.lang.String r2 = r2.A02
            java.lang.Long.parseLong(r2)
        L_0x004c:
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r38 > r22 ? 1 : (r38 == r22 ? 0 : -1))
            if (r2 == 0) goto L_0x0057
            r36 = r38
        L_0x0057:
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r36 > r3 ? 1 : (r36 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0062
            r22 = r36
        L_0x0062:
            r10 = 0
            if (r31 == 0) goto L_0x010d
            X.CwV r3 = r0.A02
        L_0x0067:
            java.lang.String r2 = "media"
            X.CwV r13 = A0A(r3, r2, r1)
            if (r31 == 0) goto L_0x010a
            X.CwV r3 = r0.A01
        L_0x0071:
            java.lang.String r2 = "initialization"
            X.CwV r12 = A0A(r3, r2, r1)
            r11 = r10
            r9 = r10
        L_0x0079:
            r1.next()
            java.lang.String r2 = "Initialization"
            boolean r2 = X.C256493vr.A01(r2, r1)
            r7 = r30
            if (r2 == 0) goto L_0x00cf
            java.lang.String r3 = "sourceURL"
            java.lang.String r2 = "range"
            X.3vz r10 = r7.A0H(r3, r2, r1)
        L_0x008e:
            java.lang.String r2 = "SegmentTemplate"
            boolean r2 = X.C256493vr.A00(r2, r1)
            if (r2 == 0) goto L_0x0079
            if (r31 == 0) goto L_0x00b3
            if (r10 != 0) goto L_0x009c
            X.3vz r10 = r0.A02
        L_0x009c:
            if (r11 == 0) goto L_0x00a2
            java.util.List r1 = r11.A02
            if (r1 != 0) goto L_0x00b3
        L_0x00a2:
            java.util.List r3 = r0.A06
            int r2 = r0.A00
            long r0 = r0.A03
            X.XTv r11 = new X.XTv
            r11.<init>()
            r11.A02 = r3
            r11.A00 = r2
            r11.A01 = r0
        L_0x00b3:
            long r24 = com.google.android.exoplayer2.util.Util.A07(r40)
            long r26 = com.google.android.exoplayer2.util.Util.A07(r34)
            r28 = r42
            if (r9 == 0) goto L_0x00c7
            if (r42 == 0) goto L_0x00c7
            boolean r0 = r7.A05
            r29 = 1
            if (r0 != 0) goto L_0x00c9
        L_0x00c7:
            r29 = 0
        L_0x00c9:
            X.3wI r8 = new X.3wI
            r8.<init>(r9, r10, r11, r12, r13, r14, r16, r18, r20, r22, r24, r26, r28, r29)
            return r8
        L_0x00cf:
            java.lang.String r2 = "SegmentTimeline"
            boolean r2 = X.C256493vr.A01(r2, r1)
            if (r2 == 0) goto L_0x0106
            java.lang.String r2 = "FBPredictedMedia"
            r9 = 0
            X.CwV r3 = A0A(r9, r2, r1)
            java.lang.String r4 = "FBPredictedMediaEndNumber"
            r2 = -1
            int r4 = A02(r4, r1, r2)
            java.lang.String r5 = "FBPredictedMediaStartNumber"
            int r6 = A02(r5, r1, r2)
            java.lang.String r5 = "FBAverageDuration"
            int r5 = A02(r5, r1, r2)
            if (r3 == 0) goto L_0x00f6
            r8 = 0
            if (r4 == r2) goto L_0x00f7
        L_0x00f6:
            r8 = 1
        L_0x00f7:
            X.C256703wD.A04(r8)
            if (r3 == 0) goto L_0x0101
            X.CvC r9 = new X.CvC
            r9.<init>(r3, r4, r6, r5)
        L_0x0101:
            X.XTv r11 = r7.A0K(r9, r1)
            goto L_0x008e
        L_0x0106:
            A0D(r1)
            goto L_0x008e
        L_0x010a:
            r3 = r10
            goto L_0x0071
        L_0x010d:
            r3 = r10
            goto L_0x0067
        L_0x0110:
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0114:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x001e
        L_0x011b:
            r2 = 0
            goto L_0x0014
        L_0x011f:
            r2 = 1
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C256353vd.A0J(X.3wI, java.util.List, org.xmlpull.v1.XmlPullParser, long, long, long, long, boolean):X.3wI");
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.XTv] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r34 == null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.XTv A0K(X.C45370CvC r34, org.xmlpull.v1.XmlPullParser r35) {
        /*
            r33 = this;
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r0 = r33
            boolean r0 = r0.A07
            r10 = 0
            r9 = r34
            if (r0 == 0) goto L_0x0012
            r20 = 1
            if (r34 != 0) goto L_0x0014
        L_0x0012:
            r20 = 0
        L_0x0014:
            r0 = 0
            r6 = 0
            r14 = 0
        L_0x0019:
            r8 = r35
            r8.next()
            java.lang.String r2 = "S"
            boolean r2 = X.C256493vr.A01(r2, r8)
            if (r2 == 0) goto L_0x00df
            java.lang.String r2 = "t"
            long r0 = A06(r2, r8, r0)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.String r4 = "d"
            long r2 = A06(r4, r8, r2)
            java.lang.String r4 = "r"
            int r4 = A02(r4, r8, r10)
            int r13 = r4 + 1
            java.lang.String r4 = "id"
            int r15 = A02(r4, r8, r10)
            long r6 = java.lang.Math.max(r6, r2)
            X.A9s r12 = new X.A9s
            r16 = r0
            r18 = r2
            r12.<init>(r13, r14, r15, r16, r18, r20)
            r11.add(r12)
            long r4 = (long) r13
            long r4 = r4 * r2
            long r0 = r0 + r4
            int r14 = r14 + r13
        L_0x0059:
            java.lang.String r2 = "SegmentTimeline"
            boolean r2 = X.C256493vr.A00(r2, r8)
            if (r2 == 0) goto L_0x0019
            r11.isEmpty()
            if (r20 == 0) goto L_0x00e6
            int r1 = r9.A02
            if (r1 <= 0) goto L_0x00e6
            int r8 = r9.A00
            if (r8 <= 0) goto L_0x00e6
            int r5 = r9.A01
            int r0 = r5 - r1
            int r0 = r0 - r14
            int r0 = r0 + 1
            if (r0 <= 0) goto L_0x00e6
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r13 = r5 + 1
            int r16 = r13 - r1
            int r16 = r16 - r14
            java.lang.Object r0 = r11.get(r10)
            X.A9s r0 = (X.C39797A9s) r0
            long r0 = r0.A04
            int r2 = r8 * r16
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = (long) r8
            int r5 = r5 - r14
            r23 = 1
            X.A9s r15 = new X.A9s
            r18 = r5
            r19 = r0
            r21 = r2
            r17 = r10
            r15.<init>(r16, r17, r18, r19, r21, r23)
            r4.add(r15)
            int r8 = r14 + r16
            java.util.Iterator r12 = r11.iterator()
        L_0x00a8:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r5 = r12.next()
            X.A9s r5 = (X.C39797A9s) r5
            int r11 = r5.A00
            if (r11 > 0) goto L_0x00be
            int r0 = r5.A01
            int r0 = r14 - r0
            int r11 = r13 - r0
        L_0x00be:
            long r2 = r5.A04
            long r0 = r5.A03
            int r10 = r5.A02
            int r9 = r5.A01
            int r9 = r9 + r16
            X.A9s r5 = new X.A9s
            r24 = r5
            r25 = r10
            r26 = r9
            r27 = r11
            r28 = r2
            r30 = r0
            r32 = r23
            r24.<init>(r25, r26, r27, r28, r30, r32)
            r4.add(r5)
            goto L_0x00a8
        L_0x00df:
            A0D(r8)
            goto L_0x0059
        L_0x00e4:
            r11 = r4
            goto L_0x00e7
        L_0x00e6:
            r8 = r14
        L_0x00e7:
            X.XTv r0 = new X.XTv
            r0.<init>()
            r0.A02 = r11
            r0.A00 = r8
            r0.A01 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C256353vd.A0K(X.CvC, org.xmlpull.v1.XmlPullParser):X.XTv");
    }

    public C256553vx A0L(C256553vx r18, XmlPullParser xmlPullParser) {
        long j;
        long j2;
        long j3;
        C256553vx r3 = r18;
        if (r18 != null) {
            j = r3.A01;
        } else {
            j = 1;
        }
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long A062 = A06("timescale", xmlPullParser2, j);
        long j4 = 0;
        if (r18 != null) {
            j2 = r3.A00;
        } else {
            j2 = 0;
        }
        long A063 = A06("presentationTimeOffset", xmlPullParser2, j2);
        if (r18 != null) {
            j3 = r3.A01;
            j4 = r3.A00;
        } else {
            j3 = 0;
        }
        C256573vz r8 = null;
        String attributeValue = xmlPullParser2.getAttributeValue((String) null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j3 = Long.parseLong(split[0]);
            j4 = (Long.parseLong(split[1]) - j3) + 1;
        }
        if (r18 != null) {
            r8 = r3.A02;
        }
        do {
            xmlPullParser2.next();
            if (C256493vr.A01("Initialization", xmlPullParser2)) {
                r8 = A0H("sourceURL", "range", xmlPullParser2);
            } else {
                A0D(xmlPullParser2);
            }
        } while (!C256493vr.A00("SegmentBase", xmlPullParser2));
        return new C256553vx(r8, A062, A063, j3, j4);
    }

    public C256353vd(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A07 = z;
        this.A05 = z2;
        this.A03 = str == null ? "null" : str;
        this.A06 = z3;
        if (z4 && !z5) {
            C256623w5 r0 = C256623w5.A01;
            if (r0 == null) {
                synchronized (C256623w5.class) {
                    r0 = C256623w5.A01;
                    if (r0 == null) {
                        r0 = new C256623w5(i);
                        C256623w5.A01 = r0;
                    }
                }
            }
            this.A01 = r0;
        }
        try {
            this.A04 = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException(Pxd.A00(467), e);
        }
    }

    public static void A0D(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (true) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                } else {
                    continue;
                }
                if (i == 0) {
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: X.3wK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: X.3wK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: com.google.android.exoplayer2.metadata.emsg.EventMessage[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v79, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v110, resolved type: X.3wK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v111, resolved type: X.3wK} */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Throwable, java.io.IOException, X.47p] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Throwable, java.io.IOException, X.47p] */
    /* JADX WARNING: type inference failed for: r1v17, types: [java.lang.Throwable, java.io.IOException, X.47p] */
    /* JADX WARNING: type inference failed for: r0v141, types: [X.Y9U, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v46, types: [java.lang.Throwable, java.io.IOException, X.47p] */
    /* JADX WARNING: type inference failed for: r36v9, types: [X.3wF] */
    /* JADX WARNING: type inference failed for: r36v10, types: [X.4XD] */
    /* JADX WARNING: type inference failed for: r36v11, types: [X.3wE] */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x05c7, code lost:
        if (r1.contains("hvq_mobile_landscape") == false) goto L_0x05c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x05cb, code lost:
        if (r1 != null) goto L_0x05cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x05cd, code lost:
        r51 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x05d5, code lost:
        if (r1.contains("hvq_mobile_portrait") != false) goto L_0x05db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x05d7, code lost:
        r51 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x05d9, code lost:
        if (r1 == null) goto L_0x05e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x05db, code lost:
        r45 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05e3, code lost:
        if (r1.contains("avoid_on_cellular") != false) goto L_0x05e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x05e5, code lost:
        r45 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05e7, code lost:
        if (r1 == null) goto L_0x05f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05e9, code lost:
        r44 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05f1, code lost:
        if (r1.contains("avoid_on_cellular_intentional") != false) goto L_0x05f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05f3, code lost:
        r44 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05f5, code lost:
        if (r1 == null) goto L_0x0601;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05f7, code lost:
        r41 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x05ff, code lost:
        if (r1.contains("avoid_on_cell_datasaver") != false) goto L_0x0605;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0601, code lost:
        r41 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0603, code lost:
        if (r1 == null) goto L_0x060f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0605, code lost:
        r40 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x060d, code lost:
        if (r1.contains("avoid_on_cell_datasaver_intentional") != false) goto L_0x0613;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x060f, code lost:
        r40 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0611, code lost:
        if (r1 == null) goto L_0x061d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0613, code lost:
        r38 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x061b, code lost:
        if (r1.contains("avoid_on_abr") != false) goto L_0x0621;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x061d, code lost:
        r38 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x061f, code lost:
        if (r1 == null) goto L_0x062b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0621, code lost:
        r53 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0629, code lost:
        if (r1.contains("avoid_on_abr_intentional") != false) goto L_0x062d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x062b, code lost:
        r53 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x062d, code lost:
        r157 = null;
        r0 = r3.getAttributeValue((java.lang.String) null, "FBPlaybackResolutionMos");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0635, code lost:
        if (r0 == null) goto L_0x0639;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0637, code lost:
        r157 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0639, code lost:
        r133 = null;
        r0 = r3.getAttributeValue((java.lang.String) null, "FBPlaybackResolutionMosConfidenceLevel");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0641, code lost:
        if (r0 == null) goto L_0x0645;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0643, code lost:
        r133 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0645, code lost:
        r132 = null;
        r0 = r3.getAttributeValue((java.lang.String) null, "FBPlaybackResolutionCsvqm");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x064d, code lost:
        if (r0 == null) goto L_0x0651;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x064f, code lost:
        r132 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0651, code lost:
        r128 = null;
        r0 = r3.getAttributeValue((java.lang.String) null, "FBEncodingTag");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0659, code lost:
        if (r0 == null) goto L_0x065d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x065b, code lost:
        r128 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x065d, code lost:
        r37 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0669, code lost:
        if (A02("FBUltraLowLatencyEncoding", r3, 0) != 1) goto L_0x066d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x066b, code lost:
        r37 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x066d, code lost:
        r126 = null;
        r0 = r3.getAttributeValue((java.lang.String) null, "FBPaqMos");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0675, code lost:
        if (r0 == null) goto L_0x0679;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0677, code lost:
        r126 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0679, code lost:
        if (r10 != false) goto L_0x0687;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x067b, code lost:
        r36 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0685, code lost:
        if (A02("FBDefaultQuality", r3, 0) == 0) goto L_0x0689;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0687, code lost:
        r36 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0689, code lost:
        r10 = r64;
        r120 = null;
        r177 = null;
        r178 = null;
        r112 = false;
        r8 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0694, code lost:
        r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x069d, code lost:
        if (X.C256493vr.A01("BaseURL", r3) == false) goto L_0x06b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x069f, code lost:
        if (r112 != false) goto L_0x06a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x06a1, code lost:
        r10 = A07(r3, r10);
        r112 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x06a7, code lost:
        r58.addAll(A0C(r165, r3, r30));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x06bb, code lost:
        if (X.C256493vr.A01("AudioChannelConfiguration", r3) == false) goto L_0x06d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x06bd, code lost:
        r39 = A03(r3);
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x06c8, code lost:
        if (X.C256493vr.A00("Representation", r3) == false) goto L_0x0694;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x06ce, code lost:
        if (r61.size() > 0) goto L_0x07a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x06d8, code lost:
        if (X.C256493vr.A01("SegmentBase", r3) == false) goto L_0x06e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x06da, code lost:
        r8 = A0L((X.C256553vx) r8, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x06e2, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x06ea, code lost:
        if (X.C256493vr.A01("SegmentList", r3) == false) goto L_0x0706;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x06ec, code lost:
        r6 = A07(r3, r6);
        r12 = false;
        r8 = A0I((X.XOM) r8, r3, r184, r10, r6, r138);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0706, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x070d, code lost:
        if (X.C256493vr.A01("SegmentTemplate", r3) == false) goto L_0x072a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x070f, code lost:
        r6 = A07(r3, r6);
        r8 = A0J((X.C256753wI) r8, r88, r3, r184, r10, r6, r138, r156);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0730, code lost:
        if (X.C256493vr.A01("ContentProtection", r3) == false) goto L_0x0749;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0732, code lost:
        r1 = A08(r3);
        r0 = r1.first;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0738, code lost:
        if (r0 == null) goto L_0x073e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x073a, code lost:
        r120 = (java.lang.String) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x073e, code lost:
        r1 = r1.second;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0740, code lost:
        if (r1 == null) goto L_0x06c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0742, code lost:
        r61.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x074f, code lost:
        if (X.C256493vr.A01("InbandEventStream", r3) == false) goto L_0x075c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0751, code lost:
        r60.add(A09("InbandEventStream", r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0760, code lost:
        if (X.C256493vr.A01("EssentialProperty", r3) == false) goto L_0x076d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0762, code lost:
        r1.add(A09("EssentialProperty", r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0771, code lost:
        if (X.C256493vr.A01("SupplementalProperty", r3) == false) goto L_0x077e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0773, code lost:
        r1.add(A09("SupplementalProperty", r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0784, code lost:
        if (X.C256493vr.A01("FBInitializationBinary", r3) == false) goto L_0x078c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0786, code lost:
        r177 = r3.nextText();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0792, code lost:
        if (X.C256493vr.A01("FBSegmentIndexBinary", r3) == false) goto L_0x079a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0794, code lost:
        r178 = r3.nextText();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x079a, code lost:
        A0D(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x079f, code lost:
        if (r114 == false) goto L_0x07a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x07a1, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x07a2, code lost:
        r1 = r164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x07a8, code lost:
        if (X.2Kn.A04(r164) == false) goto L_0x07d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x07aa, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x07ab, code lost:
        if (r47 == null) goto L_0x080d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x07b1, code lost:
        if (android.text.TextUtils.isEmpty(r47) == false) goto L_0x07ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x07b3, code lost:
        r2 = new java.lang.String[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x07b7, code lost:
        r5 = r2.length;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x07ba, code lost:
        r2 = r47.trim().split("(\\s*,\\s*)", -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x07c5, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x07c7, code lost:
        if (r0 >= r5) goto L_0x080d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x07c9, code lost:
        r1 = X.2Kn.A02(r2[r0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x07cf, code lost:
        if (r1 == null) goto L_0x07c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x07d5, code lost:
        if (X.2Kn.A04(r1) == false) goto L_0x07c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x07dc, code lost:
        if (X.2Kn.A06(r164) == false) goto L_0x080f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x07de, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x07df, code lost:
        if (r47 == null) goto L_0x083d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x07e5, code lost:
        if (android.text.TextUtils.isEmpty(r47) == false) goto L_0x07ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x07e7, code lost:
        r2 = new java.lang.String[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x07eb, code lost:
        r5 = r2.length;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x07ee, code lost:
        r2 = r47.trim().split("(\\s*,\\s*)", -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x07f9, code lost:
        if (r0 >= r5) goto L_0x083d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x07fb, code lost:
        r7 = X.2Kn.A02(r2[r0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0801, code lost:
        if (r7 == null) goto L_0x080a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0807, code lost:
        if (X.2Kn.A06(r7) == false) goto L_0x080a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x080a, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x080d, code lost:
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0813, code lost:
        if (X.2Kn.A05(r164) != false) goto L_0x083d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x081f, code lost:
        if ("image".equals(X.2Kn.A03(r164)) != false) goto L_0x083d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x082d, code lost:
        if (X.Pxd.A00(637).equals(r164) == false) goto L_0x0846;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x082f, code lost:
        r1 = X.2Kn.A02(r47);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0839, code lost:
        if ("text/vtt".equals(r1) == false) goto L_0x083d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x083b, code lost:
        r1 = "application/x-mp4-vtt";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0843, code lost:
        if ("audio/eac3".equals(r1) == false) goto L_0x087d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0846, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0848, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x084d, code lost:
        if (r1 >= r1.size()) goto L_0x087b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x084f, code lost:
        r0 = (X.C256533vv) r1.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x085f, code lost:
        if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(r0.A01) == false) goto L_0x0878;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0869, code lost:
        if ("ec+3".equals(r0.A02) == false) goto L_0x0878;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x086b, code lost:
        r1 = "audio/eac3-joc";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0873, code lost:
        if ("audio/eac3-joc".equals(r1) == false) goto L_0x087d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0875, code lost:
        r47 = "ec+3";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0878, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x087b, code lost:
        r1 = "audio/eac3";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x087d, code lost:
        r2 = 0;
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0883, code lost:
        if (r2 >= r82.size()) goto L_0x08b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0885, code lost:
        r0 = (X.C256533vv) r82.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0895, code lost:
        if (X.C256643w7.A02("urn:mpeg:dash:role:2011", r0.A01) == false) goto L_0x08af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0897, code lost:
        r0 = r0.A02;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x089a, code lost:
        if (r0 == null) goto L_0x08ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x08a2, code lost:
        if (r0.equals("forced_subtitle") != false) goto L_0x08ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x08aa, code lost:
        if (r0.equals("forced-subtitle") != false) goto L_0x08ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x08ad, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x08ae, code lost:
        r11 = r11 | r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x08af, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x08b2, code lost:
        r2 = 0;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x08b8, code lost:
        if (r2 >= r82.size()) goto L_0x08d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x08ba, code lost:
        r0 = (X.C256533vv) r82.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x08ca, code lost:
        if (X.C256643w7.A02("urn:mpeg:dash:role:2011", r0.A01) == false) goto L_0x08d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x08cc, code lost:
        r5 = r5 | A01(r0.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x08d3, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x08d6, code lost:
        r6 = 0;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x08dc, code lost:
        if (r6 >= r83.size()) goto L_0x0947;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x08de, code lost:
        r0 = (X.C256533vv) r83.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x08ee, code lost:
        if (X.C256643w7.A02("urn:mpeg:dash:role:2011", r0.A01) == false) goto L_0x08f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x08f0, code lost:
        r7 = A01(r0.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x08ff, code lost:
        if (X.C256643w7.A02("urn:tva:metadata:cs:AudioPurposeCS:2007", r0.A01) == false) goto L_0x0944;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0901, code lost:
        r2 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0903, code lost:
        if (r2 == null) goto L_0x093f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0905, code lost:
        r7 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x090a, code lost:
        switch(r2.hashCode()) {
            case 49: goto L_0x090e;
            case com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE :int: goto L_0x0919;
            case 51: goto L_0x0924;
            case 52: goto L_0x092d;
            case 53: goto L_0x090d;
            case 54: goto L_0x0936;
            default: goto L_0x090d;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0914, code lost:
        if (r2.equals(com.instagram.realtimeclient.RealtimeSubscription.GRAPHQL_MQTT_VERSION) == false) goto L_0x093f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0916, code lost:
        r7 = 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x091f, code lost:
        if (r2.equals("2") == false) goto L_0x093f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0921, code lost:
        r7 = X.C249703kE.FLAG_MOVED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x092a, code lost:
        if (r2.equals("3") != false) goto L_0x0943;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0933, code lost:
        if (r2.equals("4") == false) goto L_0x093f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0936, code lost:
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x093d, code lost:
        if (r2.equals("6") != false) goto L_0x0943;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x093f, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0941, code lost:
        r7 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0943, code lost:
        r10 = r10 | r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0944, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0947, code lost:
        r5 = r5 | r10;
        r2 = 0;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x094e, code lost:
        if (r2 >= r1.size()) goto L_0x0967;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0960, code lost:
        if (X.C256643w7.A02("http://dashif.org/guidelines/trickmode", ((X.C256533vv) r1.get(r2)).A01) == false) goto L_0x0964;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0962, code lost:
        r6 = r6 | com.facebook.common.dextricks.Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0964, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0967, code lost:
        r5 = r5 | r6;
        r2 = 0;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x096e, code lost:
        if (r2 >= r1.size()) goto L_0x0987;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0980, code lost:
        if (X.C256643w7.A02("http://dashif.org/guidelines/trickmode", ((X.C256533vv) r1.get(r2)).A01) == false) goto L_0x0984;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0982, code lost:
        r6 = r6 | com.facebook.common.dextricks.Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0984, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0987, code lost:
        r5 = r5 | r6;
        r6 = 0;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x098e, code lost:
        if (r2 >= r1.size()) goto L_0x09d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0990, code lost:
        r0 = (X.C256533vv) r1.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x09a0, code lost:
        if (X.C256643w7.A02("http://dashif.org/thumbnail_tile", r0.A01) != false) goto L_0x09ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x09aa, code lost:
        if (X.C256643w7.A02("http://dashif.org/guidelines/thumbnail_tile", r0.A01) == false) goto L_0x09d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x09ae, code lost:
        if (r0.A02 == null) goto L_0x09d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x09b0, code lost:
        r7 = r0.A02.split("x", -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x09bb, code lost:
        if (r7.length != 2) goto L_0x09d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:?, code lost:
        r7 = android.util.Pair.create(java.lang.Integer.valueOf(java.lang.Integer.parseInt(r7[0])), java.lang.Integer.valueOf(java.lang.Integer.parseInt(r7[1])));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x09d9, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:?, code lost:
        r2 = new X.C256653w8();
        r2.A0R = r50;
        r2.A0Q = r164;
        r2.A0U = r1;
        r2.A0P = r47;
        r0 = r48;
        r2.A03 = r0;
        r2.A0B = r0;
        r2.A0F = r11;
        r2.A0C = r5;
        r2.A0T = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x09fb, code lost:
        if (r7 == null) goto L_0x09fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x09fe, code lost:
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0a00, code lost:
        r0 = ((java.lang.Number) r7.first).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0a08, code lost:
        r2.A0H = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0a0a, code lost:
        if (r7 == null) goto L_0x0a0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0a0d, code lost:
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0a0f, code lost:
        r0 = ((java.lang.Number) r7.second).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0a17, code lost:
        r2.A0I = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0a1d, code lost:
        if (X.2Kn.A06(r1) == false) goto L_0x0a88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0a1f, code lost:
        r2.A0J = r43;
        r2.A08 = r42;
        r2.A00 = r46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0a2b, code lost:
        r1 = new X.C256663w9();
        r1.A06 = r161;
        r1.A0G = r52;
        r1.A0H = r51;
        r1.A0D = r45;
        r1.A0C = r44;
        r1.A0B = r41;
        r1.A0A = r40;
        r1.A09 = r38;
        r1.A08 = r53;
        r1.A0I = r12;
        r1.A04 = r157;
        r1.A05 = r133;
        r1.A03 = r132;
        r1.A07 = r166;
        r1.A01 = r128;
        r1.A0F = r36;
        r1.A00 = r54;
        r1.A0E = r34;
        r1.A0J = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0a7a, code lost:
        r2.A0L = new X.C256673wA(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0a81, code lost:
        r0 = new X.C256683wB(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0a8c, code lost:
        if (X.2Kn.A04(r1) == false) goto L_0x0ab8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0a8e, code lost:
        r2.A04 = r39;
        r2.A0E = r49;
        r1 = new X.C256663w9();
        r1.A0D = r45;
        r1.A0C = r44;
        r1.A01 = r128;
        r1.A0F = r36;
        r1.A00 = r54;
        r1.A0J = r37;
        r1.A02 = r126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0abc, code lost:
        if (X.2Kn.A05(r1) == false) goto L_0x0b55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0ac4, code lost:
        if ("application/cea-608".equals(r1) != false) goto L_0x0b0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0acc, code lost:
        if ("application/cea-708".equals(r1) != false) goto L_0x0ad1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0ace, code lost:
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0ad5, code lost:
        if (r6 >= r83.size()) goto L_0x0b45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0ad7, code lost:
        r0 = (X.C256533vv) r83.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0ae7, code lost:
        if ("urn:scte:dash:cc:cea-708:2015".equals(r0.A01) == false) goto L_0x0b08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0aeb, code lost:
        if (r0.A02 == null) goto L_0x0b08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0aed, code lost:
        r1 = A09.matcher(r0.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0af9, code lost:
        if (r1.matches() != false) goto L_0x0b47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0afb, code lost:
        android.util.Log.w("MpdParser", X.002.A0R("Unable to parse CEA-708 service block number from: ", r0.A02));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0b08, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0b0f, code lost:
        if (r6 >= r83.size()) goto L_0x0b45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0b11, code lost:
        r0 = (X.C256533vv) r83.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0b21, code lost:
        if ("urn:scte:dash:cc:cea-608:2015".equals(r0.A01) == false) goto L_0x0b42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0b25, code lost:
        if (r0.A02 == null) goto L_0x0b42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0b27, code lost:
        r1 = A08.matcher(r0.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0b33, code lost:
        if (r1.matches() != false) goto L_0x0b47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0b35, code lost:
        android.util.Log.w("MpdParser", X.002.A0R("Unable to parse CEA-608 channel number from: ", r0.A02));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0b42, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0b45, code lost:
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0b47, code lost:
        r0 = java.lang.Integer.parseInt(r1.group(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0b51, code lost:
        r2.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0b5f, code lost:
        if ("image".equals(X.2Kn.A03(r1)) == false) goto L_0x0a81;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0b61, code lost:
        r2.A0J = r43;
        r2.A08 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0b6b, code lost:
        if (r8 != null) goto L_0x0b72;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0b6d, code lost:
        r8 = new X.C256553vx();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0b76, code lost:
        if (r58.isEmpty() == false) goto L_0x0b7a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0b78, code lost:
        r58 = r165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0b7a, code lost:
        r173 = new X.C256693wC(r0, r8, r120, r177, r178, r61, r60, r58, r1, r1);
        r1 = X.2Kn.A00(r173.A00.A0W);
        r0 = r90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0b9b, code lost:
        if (r0 == -1) goto L_0x0ba7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0b9d, code lost:
        if (r1 == -1) goto L_0x0ba6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0b9f, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0ba0, code lost:
        if (r0 != r1) goto L_0x0ba3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0ba2, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0ba3, code lost:
        X.C256703wD.A04(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0ba6, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0ba7, code lost:
        r84.add(r173);
        r90 = r1;
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:848:0x12a1, code lost:
        if (r2 == null) goto L_0x12a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:913:0x13af, code lost:
        if (r158 != false) goto L_0x13b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:927:0x13de, code lost:
        if (r0 != null) goto L_0x13e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:946:0x1448, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:947:0x1449, code lost:
        r0 = new java.io.IOException((java.lang.String) null, r3);
        r0.A01 = true;
        r0.A00 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:948:0x1454, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:902:0x1384 A[Catch:{ XmlPullParserException -> 0x1448 }] */
    /* renamed from: A0G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C256633w6 E1j(android.net.Uri r216, java.io.InputStream r217) {
        /*
            r215 = this;
            long r62 = java.lang.System.currentTimeMillis()
            r4 = 0
            r214 = r215
            r0 = r214
            X.3w5 r0 = r0.A01     // Catch:{ XmlPullParserException -> 0x1448 }
            r16 = r0
            if (r0 == 0) goto L_0x0032
            r0 = r214
            java.lang.String r1 = r0.A03     // Catch:{ XmlPullParserException -> 0x1448 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 != 0) goto L_0x0032
            monitor-enter(r16)     // Catch:{ XmlPullParserException -> 0x1448 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0022
            r0 = 0
            goto L_0x002c
        L_0x0022:
            r0 = r16
            android.util.LruCache r0 = r0.A00     // Catch:{ all -> 0x002f }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x002f }
            X.3w6 r0 = (X.C256633w6) r0     // Catch:{ all -> 0x002f }
        L_0x002c:
            monitor-exit(r16)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x13de
        L_0x002f:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ XmlPullParserException -> 0x1448 }
            throw r0     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0032:
            r0 = r214
            org.xmlpull.v1.XmlPullParserFactory r0 = r0.A04     // Catch:{ XmlPullParserException -> 0x1448 }
            org.xmlpull.v1.XmlPullParser r3 = r0.newPullParser()     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r217
            r3.setInput(r0, r4)     // Catch:{ XmlPullParserException -> 0x1448 }
            int r1 = r3.next()     // Catch:{ XmlPullParserException -> 0x1448 }
            r110 = 2
            r0 = r110
            if (r1 != r0) goto L_0x143a
            java.lang.String r109 = "MPD"
            java.lang.String r1 = r3.getName()     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r109
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x143a
            r69 = 0
            r0 = r69
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "profiles"
            java.lang.String r1 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 == 0) goto L_0x006b
            java.lang.String r0 = ","
            java.lang.String[] r6 = r1.split(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x006b:
            int r5 = r6.length     // Catch:{ XmlPullParserException -> 0x1448 }
            r30 = 0
            r2 = 0
        L_0x006f:
            if (r2 >= r5) goto L_0x0081
            r1 = r6[r2]     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "urn:dvb:dash:profile:dvb-dash:"
            boolean r0 = r1.startsWith(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x007c
            goto L_0x007f
        L_0x007c:
            int r2 = r2 + 1
            goto L_0x006f
        L_0x007f:
            r30 = 1
        L_0x0081:
            java.lang.String r0 = "availabilityStartTime"
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r130 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0097
            long r130 = com.google.android.exoplayer2.util.Util.A0A(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0097:
            java.lang.String r0 = "mediaPresentationDuration"
            long r56 = A05(r0, r3, r13)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "minBufferTime"
            long r134 = A05(r0, r3, r13)     // Catch:{ XmlPullParserException -> 0x1448 }
            r108 = 0
            java.lang.String r1 = "type"
            r0 = r108
            java.lang.String r1 = r3.getAttributeValue(r0, r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            r68 = 1
            if (r1 == 0) goto L_0x00df
            java.lang.String r0 = "dynamic"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x00df
            r156 = 1
            java.lang.String r0 = "minimumUpdatePeriod"
            long r136 = A05(r0, r3, r13)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "timeShiftBufferDepth"
            long r138 = A05(r0, r3, r13)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "suggestedPresentationDelay"
            long r140 = A05(r0, r3, r13)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x00cd:
            java.lang.String r0 = "publishTime"
            r142 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x00f1
            long r142 = com.google.android.exoplayer2.util.Util.A0A(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x00f1
        L_0x00df:
            r156 = 0
            r136 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r138 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r140 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00cd
        L_0x00f1:
            r103 = 0
            if (r156 == 0) goto L_0x00f8
            r27 = 0
            goto L_0x00fd
        L_0x00f8:
            r27 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00fd:
            java.lang.String r5 = r216.toString()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r2 = r216.toString()     // Catch:{ XmlPullParserException -> 0x1448 }
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r30 == 0) goto L_0x010a
            r1 = 1
        L_0x010a:
            X.3vg r6 = new X.3vg     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r68
            r6.<init>(r5, r2, r1, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3vg[] r0 = new X.C256383vg[]{r6}     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.ArrayList r107 = X.C256393vh.A01(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "availabilityEndTime"
            r144 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x012a
            long r144 = com.google.android.exoplayer2.util.Util.A0A(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x012a:
            java.lang.String r2 = "firstAvTimeMs"
            r100 = -1
            r0 = r100
            long r146 = A06(r2, r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r2 = "currentServerTimeMs"
            long r148 = A06(r2, r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r2 = "lastVideoFrameTs"
            long r150 = A06(r2, r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r2 = "publishFrameTime"
            r0 = r103
            long r152 = A06(r2, r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "FBWasLive"
            r35 = 0
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0158
            java.lang.String r1 = "true"
            boolean r35 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0158:
            java.lang.String r0 = "FBIsLiveTemplated"
            r158 = 0
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0168
            java.lang.String r1 = "true"
            boolean r158 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0168:
            java.lang.String r0 = "FBMS"
            r160 = 0
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0178
            java.lang.String r1 = "true"
            boolean r160 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0178:
            java.lang.String r0 = "usingASRCaptions"
            r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r106 = "1"
            java.lang.String r0 = "loapStreamId"
            r121 = r108
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x018b
            r121 = r0
        L_0x018b:
            java.lang.String r1 = "loapStreamType"
            r0 = r69
            int r129 = A02(r1, r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "validationErrors"
            java.lang.String r127 = ""
            r213 = r127
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x01a1
            r127 = r0
        L_0x01a1:
            r0 = r214
            boolean r0 = r0.A06     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x01b4
            java.lang.String r0 = "FBManifestIdentifier"
            r122 = r108
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x01b6
            r122 = r0
            goto L_0x01b6
        L_0x01b4:
            r122 = r108
        L_0x01b6:
            java.lang.String r0 = "FBTagsetUsed"
            r123 = r108
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x01c2
            r123 = r0
        L_0x01c2:
            java.lang.String r2 = "FBPacingRate"
            r0 = r100
            long r154 = A06(r2, r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "FBDeliveryExperimentName"
            r2 = r108
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x01d5
            r2 = r0
        L_0x01d5:
            java.lang.String r0 = "FBDeliveryExperimentGroup"
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 != 0) goto L_0x01e0
            r124 = r108
            goto L_0x01e6
        L_0x01e0:
            r1 = 58
            java.lang.String r124 = X.002.A0T(r2, r0, r1)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x01e6:
            java.lang.String r0 = "FBManifestTimestamp"
            r125 = r108
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x01f2
            r125 = r0
        L_0x01f2:
            java.lang.String r0 = r6.A03     // Catch:{ XmlPullParserException -> 0x1448 }
            r33 = r0
            if (r0 != 0) goto L_0x01fb
            r33 = 0
            goto L_0x020d
        L_0x01fb:
            java.util.regex.Pattern r1 = A0A     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.regex.Matcher r1 = r1.matcher(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            boolean r0 = r1.find()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x020d
            r0 = r68
            java.lang.String r33 = r1.group(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x020d:
            java.util.ArrayList r105 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1448 }
            r105.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.ArrayList r102 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1448 }
            r102.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r156 == 0) goto L_0x022c
            r31 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x021e:
            r118 = r108
            r111 = r108
            r117 = r108
            r119 = r108
            r26 = 0
            r6 = 0
            r159 = 0
            goto L_0x022f
        L_0x022c:
            r31 = 0
            goto L_0x021e
        L_0x022f:
            r3.next()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r97 = "BaseURL"
            r0 = r97
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0255
            if (r26 != 0) goto L_0x0246
            r0 = r27
            long r27 = A07(r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r26 = 1
        L_0x0246:
            r1 = r107
            r0 = r30
            java.util.ArrayList r1 = A0C(r1, r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r102
            r0.addAll(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x109e
        L_0x0255:
            java.lang.String r0 = "ProgramInformation"
            boolean r1 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 == 0) goto L_0x0276
            java.lang.String r1 = "moreInformationURL"
            r8 = 0
            r11 = r4
            java.lang.String r1 = r3.getAttributeValue(r4, r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 == 0) goto L_0x0268
            r11 = r1
        L_0x0268:
            java.lang.String r1 = "lang"
            r12 = r4
            java.lang.String r1 = r3.getAttributeValue(r4, r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 == 0) goto L_0x0272
            r12 = r1
        L_0x0272:
            r9 = r4
            r10 = r4
            goto L_0x1082
        L_0x0276:
            java.lang.String r0 = "UTCTiming"
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0293
            java.lang.String r0 = "schemeIdUri"
            java.lang.String r2 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "value"
            java.lang.String r1 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.5Ma r111 = new X.5Ma     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r111
            r0.<init>(r2, r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x109e
        L_0x0293:
            java.lang.String r0 = "Location"
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x02a5
            java.lang.String r0 = r3.nextText()     // Catch:{ XmlPullParserException -> 0x1448 }
            android.net.Uri r117 = android.net.Uri.parse(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x109e
        L_0x02a5:
            java.lang.String r2 = "ServiceDescription"
            boolean r0 = X.C256493vr.A01(r2, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0311
            r20 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r18 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r19 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x02c2:
            r3.next()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "Latency"
            boolean r5 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r1 = "max"
            java.lang.String r0 = "min"
            if (r5 == 0) goto L_0x02ee
            java.lang.String r5 = "target"
            long r20 = A06(r5, r3, r13)     // Catch:{ XmlPullParserException -> 0x1448 }
            long r22 = A06(r0, r3, r13)     // Catch:{ XmlPullParserException -> 0x1448 }
            long r24 = A06(r1, r3, r13)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x02df:
            boolean r0 = X.C256493vr.A00(r2, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x02c2
            X.5Mb r119 = new X.5Mb     // Catch:{ XmlPullParserException -> 0x1448 }
            r17 = r119
            r17.<init>(r18, r19, r20, r22, r24)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x109e
        L_0x02ee:
            java.lang.String r5 = "PlaybackRate"
            boolean r5 = X.C256493vr.A01(r5, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r5 == 0) goto L_0x02df
            r18 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0303
            float r18 = java.lang.Float.parseFloat(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0303:
            r19 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            java.lang.String r0 = r3.getAttributeValue(r4, r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x02df
            float r19 = java.lang.Float.parseFloat(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x02df
        L_0x0311:
            java.lang.String r96 = "Period"
            r0 = r96
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x107e
            if (r6 != 0) goto L_0x107e
            boolean r0 = r102.isEmpty()     // Catch:{ XmlPullParserException -> 0x1448 }
            r209 = r107
            if (r0 != 0) goto L_0x0327
            r209 = r102
        L_0x0327:
            java.lang.String r95 = "id"
            r1 = r95
            r0 = r108
            java.lang.String r208 = r3.getAttributeValue(r0, r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r2 = "start"
            r0 = r31
            long r211 = A05(r2, r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            int r0 = (r130 > r13 ? 1 : (r130 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0340
            long r184 = r130 + r211
            goto L_0x0345
        L_0x0340:
            r184 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0345:
            java.lang.String r94 = "duration"
            r0 = r94
            long r19 = A05(r0, r3, r13)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.ArrayList r98 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1448 }
            r98.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.ArrayList r99 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1448 }
            r99.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.ArrayList r93 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1448 }
            r93.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            r91 = r27
            r194 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r24 = r108
            r207 = r108
            r25 = 0
        L_0x0369:
            r3.next()     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r97
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0378
            if (r25 != 0) goto L_0x0ffa
            goto L_0x0ff2
        L_0x0378:
            java.lang.String r81 = "AdaptationSet"
            r0 = r81
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0e1f
            boolean r0 = r93.isEmpty()     // Catch:{ XmlPullParserException -> 0x1448 }
            r167 = r209
            if (r0 != 0) goto L_0x038c
            r167 = r93
        L_0x038c:
            r64 = r91
            r21 = r194
            r9 = -1
            r0 = r95
            int r169 = A02(r0, r3, r9)     // Catch:{ XmlPullParserException -> 0x1448 }
            int r90 = A04(r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "FBUploadResolutionMos"
            r162 = r4
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x03a7
            r162 = r0
        L_0x03a7:
            java.lang.String r0 = "FBUploadResolutionMosConfidenceLevel"
            r163 = r4
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x03b3
            r163 = r0
        L_0x03b3:
            java.lang.String r0 = "FBUnifiedUploadResolutionMos"
            r166 = r4
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x03bf
            r166 = r0
        L_0x03bf:
            java.lang.String r0 = "subsegmentAlignment"
            r172 = 0
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x03cf
            java.lang.String r1 = "true"
            boolean r172 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x03cf:
            java.lang.String r0 = "bitstreamSwitching"
            r171 = 0
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x03df
            java.lang.String r1 = "true"
            boolean r171 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x03df:
            java.lang.String r79 = "mimeType"
            r0 = r79
            java.lang.String r80 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r77 = "codecs"
            r0 = r77
            java.lang.String r78 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r76 = "width"
            r0 = r76
            int r75 = A02(r0, r3, r9)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r74 = "height"
            r0 = r74
            int r73 = A02(r0, r3, r9)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r72 = A00(r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r71 = "audioSamplingRate"
            r0 = r71
            int r70 = A02(r0, r3, r9)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r67 = "lang"
            r0 = r67
            java.lang.String r29 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "label"
            java.lang.String r18 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.ArrayList r86 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1448 }
            r86.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.ArrayList r85 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1448 }
            r85.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.ArrayList r83 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1448 }
            r83.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.ArrayList r82 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1448 }
            r82.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.ArrayList r89 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1448 }
            r89.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.ArrayList r88 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1448 }
            r88.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.ArrayList r84 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1448 }
            r84.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.ArrayList r66 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1448 }
            r66.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            r15 = r24
            r10 = 1
            r23 = -1
            r17 = 0
            r87 = 0
        L_0x044c:
            r3.next()     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r97
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x045b
            if (r17 != 0) goto L_0x0c54
            goto L_0x0c4c
        L_0x045b:
            java.lang.String r113 = "ContentProtection"
            r0 = r113
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x047c
            android.util.Pair r1 = A08(r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.Object r0 = r1.first     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0471
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r87 = r0
        L_0x0471:
            java.lang.Object r1 = r1.second     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 == 0) goto L_0x0c61
            r0 = r86
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0c61
        L_0x047c:
            java.lang.String r0 = "ContentComponent"
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x04b2
            r0 = r67
            java.lang.String r2 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r29 == 0) goto L_0x0499
            if (r2 == 0) goto L_0x0497
            r0 = r29
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.C256703wD.A04(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0497:
            r2 = r29
        L_0x0499:
            int r1 = A04(r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r90
            if (r0 != r9) goto L_0x04a2
            goto L_0x04ac
        L_0x04a2:
            if (r1 == r9) goto L_0x04ae
            r5 = 0
            if (r0 != r1) goto L_0x04a8
            r5 = 1
        L_0x04a8:
            X.C256703wD.A04(r5)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x04ae
        L_0x04ac:
            r90 = r1
        L_0x04ae:
            r29 = r2
            goto L_0x0c61
        L_0x04b2:
            java.lang.String r0 = "Role"
            boolean r1 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 == 0) goto L_0x04c5
            X.3vv r1 = A09(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r82
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0c61
        L_0x04c5:
            java.lang.String r115 = "AudioChannelConfiguration"
            r0 = r115
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x04d5
            int r23 = A03(r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0c61
        L_0x04d5:
            java.lang.String r0 = "Accessibility"
            boolean r1 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 == 0) goto L_0x04e8
            X.3vv r1 = A09(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r83
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0c61
        L_0x04e8:
            java.lang.String r5 = "EssentialProperty"
            boolean r0 = X.C256493vr.A01(r5, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x04fb
            X.3vv r1 = A09(r5, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r89
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0c61
        L_0x04fb:
            java.lang.String r2 = "SupplementalProperty"
            boolean r0 = X.C256493vr.A01(r2, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x050e
            X.3vv r1 = A09(r2, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r88
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0c61
        L_0x050e:
            java.lang.String r116 = "Representation"
            r0 = r116
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0bb1
            boolean r0 = r66.isEmpty()     // Catch:{ XmlPullParserException -> 0x1448 }
            r165 = r167
            if (r0 != 0) goto L_0x0522
            r165 = r66
        L_0x0522:
            int r0 = r86.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            r114 = 0
            if (r0 <= 0) goto L_0x052c
            r114 = 1
        L_0x052c:
            r164 = r80
            r47 = r78
            r39 = r23
            r6 = r21
            r0 = r95
            java.lang.String r50 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "bandwidth"
            int r48 = A02(r0, r3, r9)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r79
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x054a
            r164 = r0
        L_0x054a:
            r0 = r77
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0554
            r47 = r0
        L_0x0554:
            r1 = r76
            r0 = r75
            int r43 = A02(r1, r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r1 = r74
            r0 = r73
            int r42 = A02(r1, r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r72
            float r46 = A00(r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r1 = r71
            r0 = r70
            int r49 = A02(r1, r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.ArrayList r61 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1448 }
            r61.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.ArrayList r60 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1448 }
            r60.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.ArrayList r59 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1448 }
            r1 = r59
            r0 = r89
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.ArrayList r55 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1448 }
            r1 = r55
            r0 = r88
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.ArrayList r58 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1448 }
            r58.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "FBQualityLabel"
            r161 = r4
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x059f
            r161 = r0
        L_0x059f:
            java.lang.String r0 = "FBMaxBandwidth"
            int r54 = A02(r0, r3, r9)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "FBAbrPolicyTags"
            r1 = r4
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x05af
            r1 = r0
        L_0x05af:
            java.lang.String r0 = "FBDynamicQualityDropped"
            int r8 = A02(r0, r3, r9)     // Catch:{ XmlPullParserException -> 0x1448 }
            r34 = 0
            r0 = r68
            if (r8 != r0) goto L_0x05bd
            r34 = 1
        L_0x05bd:
            if (r1 == 0) goto L_0x05c9
            java.lang.String r0 = "hvq_mobile_landscape"
            boolean r0 = r1.contains(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r52 = 1
            if (r0 != 0) goto L_0x05cd
        L_0x05c9:
            r52 = 0
            if (r1 == 0) goto L_0x05d7
        L_0x05cd:
            java.lang.String r0 = "hvq_mobile_portrait"
            boolean r0 = r1.contains(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r51 = 1
            if (r0 != 0) goto L_0x05db
        L_0x05d7:
            r51 = 0
            if (r1 == 0) goto L_0x05e5
        L_0x05db:
            java.lang.String r0 = "avoid_on_cellular"
            boolean r0 = r1.contains(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r45 = 1
            if (r0 != 0) goto L_0x05e9
        L_0x05e5:
            r45 = 0
            if (r1 == 0) goto L_0x05f3
        L_0x05e9:
            java.lang.String r0 = "avoid_on_cellular_intentional"
            boolean r0 = r1.contains(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r44 = 1
            if (r0 != 0) goto L_0x05f7
        L_0x05f3:
            r44 = 0
            if (r1 == 0) goto L_0x0601
        L_0x05f7:
            java.lang.String r0 = "avoid_on_cell_datasaver"
            boolean r0 = r1.contains(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r41 = 1
            if (r0 != 0) goto L_0x0605
        L_0x0601:
            r41 = 0
            if (r1 == 0) goto L_0x060f
        L_0x0605:
            java.lang.String r0 = "avoid_on_cell_datasaver_intentional"
            boolean r0 = r1.contains(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r40 = 1
            if (r0 != 0) goto L_0x0613
        L_0x060f:
            r40 = 0
            if (r1 == 0) goto L_0x061d
        L_0x0613:
            java.lang.String r0 = "avoid_on_abr"
            boolean r0 = r1.contains(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r38 = 1
            if (r0 != 0) goto L_0x0621
        L_0x061d:
            r38 = 0
            if (r1 == 0) goto L_0x062b
        L_0x0621:
            java.lang.String r0 = "avoid_on_abr_intentional"
            boolean r0 = r1.contains(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r53 = 1
            if (r0 != 0) goto L_0x062d
        L_0x062b:
            r53 = 0
        L_0x062d:
            java.lang.String r0 = "FBPlaybackResolutionMos"
            r157 = r4
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0639
            r157 = r0
        L_0x0639:
            java.lang.String r0 = "FBPlaybackResolutionMosConfidenceLevel"
            r133 = r4
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0645
            r133 = r0
        L_0x0645:
            java.lang.String r0 = "FBPlaybackResolutionCsvqm"
            r132 = r4
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0651
            r132 = r0
        L_0x0651:
            java.lang.String r0 = "FBEncodingTag"
            r128 = r4
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x065d
            r128 = r0
        L_0x065d:
            java.lang.String r1 = "FBUltraLowLatencyEncoding"
            r0 = r69
            int r1 = A02(r1, r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r37 = 0
            r0 = r68
            if (r1 != r0) goto L_0x066d
            r37 = 1
        L_0x066d:
            java.lang.String r0 = "FBPaqMos"
            r126 = r4
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0679
            r126 = r0
        L_0x0679:
            if (r10 != 0) goto L_0x0687
            java.lang.String r1 = "FBDefaultQuality"
            r0 = r69
            int r0 = A02(r1, r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r36 = 0
            if (r0 == 0) goto L_0x0689
        L_0x0687:
            r36 = 1
        L_0x0689:
            r10 = r64
            r120 = r4
            r177 = r4
            r178 = r4
            r112 = 0
            r8 = r15
        L_0x0694:
            r3.next()     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r97
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x06b5
            if (r112 != 0) goto L_0x06a7
            long r10 = A07(r3, r10)     // Catch:{ XmlPullParserException -> 0x1448 }
            r112 = 1
        L_0x06a7:
            r1 = r165
            r0 = r30
            java.util.ArrayList r1 = A0C(r1, r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r58
            r0.addAll(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x06e2
        L_0x06b5:
            r0 = r115
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x06d2
            int r39 = A03(r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            r12 = 0
        L_0x06c2:
            r0 = r116
            boolean r0 = X.C256493vr.A00(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0694
            int r0 = r61.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 > 0) goto L_0x07a1
            goto L_0x079f
        L_0x06d2:
            java.lang.String r0 = "SegmentBase"
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x06e4
            X.3vx r8 = (X.C256553vx) r8     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r214
            X.3vx r8 = r0.A0L(r8, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x06e2:
            r12 = 0
            goto L_0x06c2
        L_0x06e4:
            java.lang.String r0 = "SegmentList"
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0706
            long r6 = A07(r3, r6)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.XOM r8 = (X.XOM) r8     // Catch:{ XmlPullParserException -> 0x1448 }
            r12 = 0
            r196 = r214
            r197 = r8
            r198 = r3
            r199 = r184
            r201 = r10
            r203 = r6
            r205 = r138
            X.XOM r8 = r196.A0I(r197, r198, r199, r201, r203, r205)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x06c2
        L_0x0706:
            r12 = 0
            java.lang.String r0 = "SegmentTemplate"
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x072a
            long r6 = A07(r3, r6)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wI r8 = (X.C256753wI) r8     // Catch:{ XmlPullParserException -> 0x1448 }
            r180 = r214
            r181 = r8
            r182 = r88
            r183 = r3
            r186 = r10
            r188 = r6
            r190 = r138
            r192 = r156
            X.3wI r8 = r180.A0J(r181, r182, r183, r184, r186, r188, r190, r192)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x06c2
        L_0x072a:
            r0 = r113
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0749
            android.util.Pair r1 = A08(r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.Object r0 = r1.first     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x073e
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r120 = r0
        L_0x073e:
            java.lang.Object r1 = r1.second     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 == 0) goto L_0x06c2
            r0 = r61
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x06c2
        L_0x0749:
            java.lang.String r0 = "InbandEventStream"
            boolean r1 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 == 0) goto L_0x075c
            X.3vv r1 = A09(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r60
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x06c2
        L_0x075c:
            boolean r0 = X.C256493vr.A01(r5, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x076d
            X.3vv r1 = A09(r5, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r59
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x06c2
        L_0x076d:
            boolean r0 = X.C256493vr.A01(r2, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x077e
            X.3vv r1 = A09(r2, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r55
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x06c2
        L_0x077e:
            java.lang.String r0 = "FBInitializationBinary"
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x078c
            java.lang.String r177 = r3.nextText()     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x06c2
        L_0x078c:
            java.lang.String r0 = "FBSegmentIndexBinary"
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x079a
            java.lang.String r178 = r3.nextText()     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x06c2
        L_0x079a:
            A0D(r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x06c2
        L_0x079f:
            if (r114 == 0) goto L_0x07a2
        L_0x07a1:
            r12 = 1
        L_0x07a2:
            r1 = r164
            boolean r0 = X.2Kn.A04(r164)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x07d8
            r7 = 0
            if (r47 == 0) goto L_0x080d
            boolean r0 = android.text.TextUtils.isEmpty(r47)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x07ba
            r0 = r69
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x07b7:
            int r5 = r2.length     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = 0
            goto L_0x07c7
        L_0x07ba:
            java.lang.String r1 = r47.trim()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "(\\s*,\\s*)"
            java.lang.String[] r2 = r1.split(r0, r9)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x07b7
        L_0x07c5:
            int r0 = r0 + 1
        L_0x07c7:
            if (r0 >= r5) goto L_0x080d
            r1 = r2[r0]     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r1 = X.2Kn.A02(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 == 0) goto L_0x07c5
            boolean r6 = X.2Kn.A04(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r6 == 0) goto L_0x07c5
            goto L_0x083d
        L_0x07d8:
            boolean r0 = X.2Kn.A06(r164)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x080f
            r1 = 0
            if (r47 == 0) goto L_0x083d
            boolean r0 = android.text.TextUtils.isEmpty(r47)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x07ee
            r0 = r69
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x07eb:
            int r5 = r2.length     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = 0
            goto L_0x07f9
        L_0x07ee:
            java.lang.String r2 = r47.trim()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "(\\s*,\\s*)"
            java.lang.String[] r2 = r2.split(r0, r9)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x07eb
        L_0x07f9:
            if (r0 >= r5) goto L_0x083d
            r6 = r2[r0]     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r7 = X.2Kn.A02(r6)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r7 == 0) goto L_0x080a
            boolean r6 = X.2Kn.A06(r7)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r6 == 0) goto L_0x080a
            goto L_0x080d
        L_0x080a:
            int r0 = r0 + 1
            goto L_0x07f9
        L_0x080d:
            r1 = r7
            goto L_0x083d
        L_0x080f:
            boolean r0 = X.2Kn.A05(r164)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 != 0) goto L_0x083d
            java.lang.String r2 = X.2Kn.A03(r164)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "image"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 != 0) goto L_0x083d
            r0 = 637(0x27d, float:8.93E-43)
            java.lang.String r1 = X.Pxd.A00(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r164
            boolean r0 = r1.equals(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0846
            java.lang.String r1 = X.2Kn.A02(r47)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "text/vtt"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x083d
            java.lang.String r1 = "application/x-mp4-vtt"
        L_0x083d:
            java.lang.String r6 = "audio/eac3"
            boolean r0 = r6.equals(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x087d
            goto L_0x0848
        L_0x0846:
            r1 = 0
            goto L_0x083d
        L_0x0848:
            r1 = 0
        L_0x0849:
            int r0 = r55.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 >= r0) goto L_0x087b
            r0 = r55
            java.lang.Object r0 = r0.get(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3vv r0 = (X.C256533vv) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r5 = r0.A01     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r2 = "tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014"
            boolean r2 = r2.equals(r5)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r2 == 0) goto L_0x0878
            java.lang.String r2 = r0.A02     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "ec+3"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0878
            java.lang.String r1 = "audio/eac3-joc"
        L_0x086d:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x087d
            java.lang.String r47 = "ec+3"
            goto L_0x087d
        L_0x0878:
            int r1 = r1 + 1
            goto L_0x0849
        L_0x087b:
            r1 = r6
            goto L_0x086d
        L_0x087d:
            r2 = 0
            r11 = 0
        L_0x087f:
            int r0 = r82.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r2 >= r0) goto L_0x08b2
            r0 = r82
            java.lang.Object r0 = r0.get(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3vv r0 = (X.C256533vv) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r6 = r0.A01     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r5 = "urn:mpeg:dash:role:2011"
            boolean r5 = X.C256643w7.A02(r5, r6)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r5 == 0) goto L_0x08af
            java.lang.String r0 = r0.A02     // Catch:{ XmlPullParserException -> 0x1448 }
            r6 = 0
            if (r0 == 0) goto L_0x08ae
            java.lang.String r5 = "forced_subtitle"
            boolean r5 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r5 != 0) goto L_0x08ad
            java.lang.String r5 = "forced-subtitle"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 != 0) goto L_0x08ad
            goto L_0x08ae
        L_0x08ad:
            r6 = 2
        L_0x08ae:
            r11 = r11 | r6
        L_0x08af:
            int r2 = r2 + 1
            goto L_0x087f
        L_0x08b2:
            r2 = 0
            r5 = 0
        L_0x08b4:
            int r0 = r82.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r2 >= r0) goto L_0x08d6
            r0 = r82
            java.lang.Object r0 = r0.get(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3vv r0 = (X.C256533vv) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r7 = r0.A01     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r6 = "urn:mpeg:dash:role:2011"
            boolean r6 = X.C256643w7.A02(r6, r7)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r6 == 0) goto L_0x08d3
            java.lang.String r0 = r0.A02     // Catch:{ XmlPullParserException -> 0x1448 }
            int r0 = A01(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r5 = r5 | r0
        L_0x08d3:
            int r2 = r2 + 1
            goto L_0x08b4
        L_0x08d6:
            r6 = 0
            r10 = 0
        L_0x08d8:
            int r0 = r83.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r6 >= r0) goto L_0x0947
            r0 = r83
            java.lang.Object r0 = r0.get(r6)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3vv r0 = (X.C256533vv) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r7 = r0.A01     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r2 = "urn:mpeg:dash:role:2011"
            boolean r2 = X.C256643w7.A02(r2, r7)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r2 == 0) goto L_0x08f7
            java.lang.String r0 = r0.A02     // Catch:{ XmlPullParserException -> 0x1448 }
            int r7 = A01(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0943
        L_0x08f7:
            java.lang.String r7 = r0.A01     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r2 = "urn:tva:metadata:cs:AudioPurposeCS:2007"
            boolean r2 = X.C256643w7.A02(r2, r7)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r2 == 0) goto L_0x0944
            java.lang.String r2 = r0.A02     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r2 == 0) goto L_0x093f
            int r0 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x1448 }
            r7 = 4
            switch(r0) {
                case 49: goto L_0x090e;
                case 50: goto L_0x0919;
                case 51: goto L_0x0924;
                case 52: goto L_0x092d;
                case 53: goto L_0x090d;
                case 54: goto L_0x0936;
                default: goto L_0x090d;
            }     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x090d:
            goto L_0x093f
        L_0x090e:
            r0 = r106
            boolean r0 = r2.equals(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x093f
            r7 = 512(0x200, float:7.175E-43)
            goto L_0x0943
        L_0x0919:
            java.lang.String r0 = "2"
            boolean r0 = r2.equals(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x093f
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0943
        L_0x0924:
            java.lang.String r0 = "3"
            boolean r0 = r2.equals(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 != 0) goto L_0x0943
            goto L_0x093f
        L_0x092d:
            java.lang.String r0 = "4"
            boolean r0 = r2.equals(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x093f
            goto L_0x0941
        L_0x0936:
            java.lang.String r0 = "6"
            boolean r0 = r2.equals(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r7 = 1
            if (r0 != 0) goto L_0x0943
        L_0x093f:
            r7 = 0
            goto L_0x0943
        L_0x0941:
            r7 = 8
        L_0x0943:
            r10 = r10 | r7
        L_0x0944:
            int r6 = r6 + 1
            goto L_0x08d8
        L_0x0947:
            r5 = r5 | r10
            r2 = 0
            r6 = 0
        L_0x094a:
            int r0 = r59.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r2 >= r0) goto L_0x0967
            r0 = r59
            java.lang.Object r0 = r0.get(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3vv r0 = (X.C256533vv) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r7 = r0.A01     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "http://dashif.org/guidelines/trickmode"
            boolean r0 = X.C256643w7.A02(r0, r7)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0964
            r6 = r6 | 16384(0x4000, float:2.2959E-41)
        L_0x0964:
            int r2 = r2 + 1
            goto L_0x094a
        L_0x0967:
            r5 = r5 | r6
            r2 = 0
            r6 = 0
        L_0x096a:
            int r0 = r55.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r2 >= r0) goto L_0x0987
            r0 = r55
            java.lang.Object r0 = r0.get(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3vv r0 = (X.C256533vv) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r7 = r0.A01     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "http://dashif.org/guidelines/trickmode"
            boolean r0 = X.C256643w7.A02(r0, r7)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0984
            r6 = r6 | 16384(0x4000, float:2.2959E-41)
        L_0x0984:
            int r2 = r2 + 1
            goto L_0x096a
        L_0x0987:
            r5 = r5 | r6
            r6 = 0
            r2 = 0
        L_0x098a:
            int r0 = r59.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r2 >= r0) goto L_0x09d9
            r0 = r59
            java.lang.Object r0 = r0.get(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3vv r0 = (X.C256533vv) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r10 = r0.A01     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r7 = "http://dashif.org/thumbnail_tile"
            boolean r7 = X.C256643w7.A02(r7, r10)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r7 != 0) goto L_0x09ac
            java.lang.String r10 = r0.A01     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r7 = "http://dashif.org/guidelines/thumbnail_tile"
            boolean r7 = X.C256643w7.A02(r7, r10)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r7 == 0) goto L_0x09d6
        L_0x09ac:
            java.lang.String r7 = r0.A02     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r7 == 0) goto L_0x09d6
            java.lang.String r7 = r0.A02     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "x"
            java.lang.String[] r7 = r7.split(r0, r9)     // Catch:{ XmlPullParserException -> 0x1448 }
            int r10 = r7.length     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r110
            if (r10 != r0) goto L_0x09d6
            r0 = r7[r69]     // Catch:{ NumberFormatException -> 0x09d6 }
            int r10 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x09d6 }
            r0 = r7[r68]     // Catch:{ NumberFormatException -> 0x09d6 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x09d6 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x09d6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x09d6 }
            android.util.Pair r7 = android.util.Pair.create(r7, r0)     // Catch:{ NumberFormatException -> 0x09d6 }
            goto L_0x09da
        L_0x09d6:
            int r2 = r2 + 1
            goto L_0x098a
        L_0x09d9:
            r7 = 0
        L_0x09da:
            X.3w8 r2 = new X.3w8     // Catch:{ XmlPullParserException -> 0x1448 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r50
            r2.A0R = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r164
            r2.A0Q = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r2.A0U = r1     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r47
            r2.A0P = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r48
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r2.A0B = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r2.A0F = r11     // Catch:{ XmlPullParserException -> 0x1448 }
            r2.A0C = r5     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r29
            r2.A0T = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r7 == 0) goto L_0x09fe
            goto L_0x0a00
        L_0x09fe:
            r0 = -1
            goto L_0x0a08
        L_0x0a00:
            java.lang.Object r0 = r7.first     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            int r0 = r0.intValue()     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0a08:
            r2.A0H = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r7 == 0) goto L_0x0a0d
            goto L_0x0a0f
        L_0x0a0d:
            r0 = -1
            goto L_0x0a17
        L_0x0a0f:
            java.lang.Object r0 = r7.second     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            int r0 = r0.intValue()     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0a17:
            r2.A0I = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            boolean r0 = X.2Kn.A06(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0a88
            r0 = r43
            r2.A0J = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r42
            r2.A08 = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r46
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0a2b:
            X.3w9 r1 = new X.3w9     // Catch:{ XmlPullParserException -> 0x1448 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r161
            r1.A06 = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r52
            r1.A0G = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r51
            r1.A0H = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r45
            r1.A0D = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r44
            r1.A0C = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r41
            r1.A0B = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r40
            r1.A0A = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r38
            r1.A09 = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r53
            r1.A08 = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r1.A0I = r12     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r157
            r1.A04 = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r133
            r1.A05 = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r132
            r1.A03 = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r166
            r1.A07 = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r128
            r1.A01 = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r36
            r1.A0F = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r54
            r1.A00 = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r34
            r1.A0E = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r37
            r1.A0J = r0     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0a7a:
            X.3wA r0 = new X.3wA     // Catch:{ XmlPullParserException -> 0x1448 }
            r0.<init>(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            r2.A0L = r0     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0a81:
            X.3wB r0 = new X.3wB     // Catch:{ XmlPullParserException -> 0x1448 }
            r0.<init>(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0b6b
        L_0x0a88:
            boolean r0 = X.2Kn.A04(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0ab8
            r0 = r39
            r2.A04 = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r49
            r2.A0E = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3w9 r1 = new X.3w9     // Catch:{ XmlPullParserException -> 0x1448 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r45
            r1.A0D = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r44
            r1.A0C = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r128
            r1.A01 = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r36
            r1.A0F = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r54
            r1.A00 = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r37
            r1.A0J = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r126
            r1.A02 = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0a7a
        L_0x0ab8:
            boolean r0 = X.2Kn.A05(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0b55
            java.lang.String r0 = "application/cea-608"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 != 0) goto L_0x0b0b
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 != 0) goto L_0x0ad1
            r0 = -1
            goto L_0x0b51
        L_0x0ad1:
            int r0 = r83.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r6 >= r0) goto L_0x0b45
            r0 = r83
            java.lang.Object r0 = r0.get(r6)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3vv r0 = (X.C256533vv) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r5 = r0.A01     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r1 = "urn:scte:dash:cc:cea-708:2015"
            boolean r1 = r1.equals(r5)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 == 0) goto L_0x0b08
            java.lang.String r1 = r0.A02     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 == 0) goto L_0x0b08
            java.util.regex.Pattern r5 = A09     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r1 = r0.A02     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.regex.Matcher r1 = r5.matcher(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            boolean r5 = r1.matches()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r5 != 0) goto L_0x0b47
            java.lang.String r1 = "Unable to parse CEA-708 service block number from: "
            java.lang.String r0 = r0.A02     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "MpdParser"
            android.util.Log.w(r0, r1)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0b08:
            int r6 = r6 + 1
            goto L_0x0ad1
        L_0x0b0b:
            int r0 = r83.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r6 >= r0) goto L_0x0b45
            r0 = r83
            java.lang.Object r0 = r0.get(r6)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3vv r0 = (X.C256533vv) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r5 = r0.A01     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r1 = "urn:scte:dash:cc:cea-608:2015"
            boolean r1 = r1.equals(r5)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 == 0) goto L_0x0b42
            java.lang.String r1 = r0.A02     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 == 0) goto L_0x0b42
            java.util.regex.Pattern r5 = A08     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r1 = r0.A02     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.regex.Matcher r1 = r5.matcher(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            boolean r5 = r1.matches()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r5 != 0) goto L_0x0b47
            java.lang.String r1 = "Unable to parse CEA-608 channel number from: "
            java.lang.String r0 = r0.A02     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "MpdParser"
            android.util.Log.w(r0, r1)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0b42:
            int r6 = r6 + 1
            goto L_0x0b0b
        L_0x0b45:
            r0 = -1
            goto L_0x0b51
        L_0x0b47:
            r0 = r68
            java.lang.String r0 = r1.group(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0b51:
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0a81
        L_0x0b55:
            java.lang.String r1 = X.2Kn.A03(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "image"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0a81
            r0 = r43
            r2.A0J = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r42
            r2.A08 = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0a2b
        L_0x0b6b:
            if (r8 != 0) goto L_0x0b72
            X.3vx r8 = new X.3vx     // Catch:{ XmlPullParserException -> 0x1448 }
            r8.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0b72:
            boolean r1 = r58.isEmpty()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 == 0) goto L_0x0b7a
            r58 = r165
        L_0x0b7a:
            X.3wC r2 = new X.3wC     // Catch:{ XmlPullParserException -> 0x1448 }
            r173 = r2
            r174 = r0
            r175 = r8
            r176 = r120
            r179 = r61
            r180 = r60
            r181 = r58
            r182 = r59
            r183 = r55
            r173.<init>(r174, r175, r176, r177, r178, r179, r180, r181, r182, r183)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wB r0 = r2.A00     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = r0.A0W     // Catch:{ XmlPullParserException -> 0x1448 }
            int r1 = X.2Kn.A00(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r90
            if (r0 == r9) goto L_0x0ba7
            if (r1 == r9) goto L_0x0ba6
            r5 = 0
            if (r0 != r1) goto L_0x0ba3
            r5 = 1
        L_0x0ba3:
            X.C256703wD.A04(r5)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0ba6:
            r1 = r0
        L_0x0ba7:
            r0 = r84
            r0.add(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            r90 = r1
            r10 = 0
            goto L_0x0c61
        L_0x0bb1:
            java.lang.String r0 = "SegmentBase"
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0bc3
            X.3vx r15 = (X.C256553vx) r15     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r214
            X.3vx r15 = r0.A0L(r15, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0c61
        L_0x0bc3:
            java.lang.String r0 = "SegmentList"
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0be6
            r0 = r21
            long r21 = A07(r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.XOM r15 = (X.XOM) r15     // Catch:{ XmlPullParserException -> 0x1448 }
            r36 = r214
            r37 = r15
            r38 = r3
            r39 = r184
            r41 = r64
            r43 = r21
            r45 = r138
            X.XOM r15 = r36.A0I(r37, r38, r39, r41, r43, r45)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0c61
        L_0x0be6:
            java.lang.String r0 = "SegmentTemplate"
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0c0b
            r0 = r21
            long r21 = A07(r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wI r15 = (X.C256753wI) r15     // Catch:{ XmlPullParserException -> 0x1448 }
            r180 = r214
            r181 = r15
            r182 = r88
            r183 = r3
            r186 = r64
            r188 = r21
            r190 = r138
            r192 = r156
            X.3wI r15 = r180.A0J(r181, r182, r183, r184, r186, r188, r190, r192)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0c61
        L_0x0c0b:
            java.lang.String r0 = "InbandEventStream"
            boolean r1 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 == 0) goto L_0x0c1d
            X.3vv r1 = A09(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r85
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0c61
        L_0x0c1d:
            java.lang.String r0 = "Label"
            boolean r1 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 == 0) goto L_0x0c40
            r18 = r213
        L_0x0c27:
            r3.next()     // Catch:{ XmlPullParserException -> 0x1448 }
            int r2 = r3.getEventType()     // Catch:{ XmlPullParserException -> 0x1448 }
            r1 = 4
            if (r2 != r1) goto L_0x0c3c
            java.lang.String r18 = r3.getText()     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0c35:
            boolean r1 = X.C256493vr.A00(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 == 0) goto L_0x0c27
            goto L_0x0c61
        L_0x0c3c:
            A0D(r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0c35
        L_0x0c40:
            int r1 = r3.getEventType()     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r110
            if (r1 != r0) goto L_0x0c61
            A0D(r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0c61
        L_0x0c4c:
            r0 = r64
            long r64 = A07(r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r17 = 1
        L_0x0c54:
            r1 = r167
            r0 = r30
            java.util.ArrayList r1 = A0C(r1, r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r66
            r0.addAll(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0c61:
            r0 = r81
            boolean r0 = X.C256493vr.A00(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x044c
            int r0 = r84.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1448 }
            r15.<init>(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r9 = 0
        L_0x0c73:
            int r0 = r84.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r9 >= r0) goto L_0x0e05
            r0 = r84
            java.lang.Object r1 = r0.get(r9)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wC r1 = (X.C256693wC) r1     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wB r0 = r1.A00     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3w8 r6 = new X.3w8     // Catch:{ XmlPullParserException -> 0x1448 }
            r6.<init>(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r18 == 0) goto L_0x0c8e
            r0 = r18
            r6.A0S = r0     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0c8e:
            boolean r0 = r82.isEmpty()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 != 0) goto L_0x0cba
            r2 = 0
            r5 = 0
        L_0x0c96:
            int r0 = r82.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r2 >= r0) goto L_0x0cb8
            r0 = r82
            java.lang.Object r0 = r0.get(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3vv r0 = (X.C256533vv) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r8 = r0.A01     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r7 = "urn:mpeg:dash:role:2011"
            boolean r7 = X.C256643w7.A02(r7, r8)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r7 == 0) goto L_0x0cb5
            java.lang.String r0 = r0.A02     // Catch:{ XmlPullParserException -> 0x1448 }
            int r0 = A01(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r5 = r5 | r0
        L_0x0cb5:
            int r2 = r2 + 1
            goto L_0x0c96
        L_0x0cb8:
            r6.A0C = r5     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0cba:
            boolean r0 = android.text.TextUtils.isEmpty(r29)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 != 0) goto L_0x0cc4
            r0 = r29
            r6.A0T = r0     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0cc4:
            java.lang.String r10 = r1.A02     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r10 != 0) goto L_0x0cca
            r10 = r87
        L_0x0cca:
            java.util.ArrayList r2 = r1.A05     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r86
            r2.addAll(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            boolean r0 = r2.isEmpty()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 != 0) goto L_0x0d6c
            r5 = 0
            r0 = 0
        L_0x0cd9:
            int r7 = r2.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 >= r7) goto L_0x0d22
            java.lang.Object r7 = r2.get(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r7 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r7     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.UUID r8 = X.AnonymousClass4T7.A00     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.UUID r11 = r7.A03     // Catch:{ XmlPullParserException -> 0x1448 }
            boolean r11 = r8.equals(r11)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r11 == 0) goto L_0x0d1f
            java.lang.String r7 = r7.A01     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r7 == 0) goto L_0x0d1f
            r2.remove(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0cf6:
            int r0 = r2.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r5 >= r0) goto L_0x0d22
            java.lang.Object r0 = r2.get(r5)     // Catch:{ XmlPullParserException -> 0x1448 }
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r0 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.UUID r12 = X.AnonymousClass4T7.A01     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.UUID r11 = r0.A03     // Catch:{ XmlPullParserException -> 0x1448 }
            boolean r11 = r12.equals(r11)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r11 == 0) goto L_0x0d1c
            java.lang.String r11 = r0.A01     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r11 != 0) goto L_0x0d1c
            java.lang.String r12 = r0.A02     // Catch:{ XmlPullParserException -> 0x1448 }
            byte[] r11 = r0.A04     // Catch:{ XmlPullParserException -> 0x1448 }
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r0 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData     // Catch:{ XmlPullParserException -> 0x1448 }
            r0.<init>(r7, r12, r8, r11)     // Catch:{ XmlPullParserException -> 0x1448 }
            r2.set(r5, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0d1c:
            int r5 = r5 + 1
            goto L_0x0cf6
        L_0x0d1f:
            int r0 = r0 + 1
            goto L_0x0cd9
        L_0x0d22:
            int r5 = r2.size()     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0d26:
            int r5 = r5 + -1
            if (r5 < 0) goto L_0x0d58
            java.lang.Object r0 = r2.get(r5)     // Catch:{ XmlPullParserException -> 0x1448 }
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r0 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            byte[] r7 = r0.A04     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r7 != 0) goto L_0x0d26
            r8 = 0
        L_0x0d35:
            int r7 = r2.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r8 >= r7) goto L_0x0d26
            java.lang.Object r7 = r2.get(r8)     // Catch:{ XmlPullParserException -> 0x1448 }
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r7 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r7     // Catch:{ XmlPullParserException -> 0x1448 }
            byte[] r11 = r7.A04     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r11 == 0) goto L_0x0d55
            byte[] r11 = r0.A04     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r11 != 0) goto L_0x0d55
            java.util.UUID r11 = r0.A03     // Catch:{ XmlPullParserException -> 0x1448 }
            boolean r7 = r7.A00(r11)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r7 == 0) goto L_0x0d55
            r2.remove(r5)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0d26
        L_0x0d55:
            int r8 = r8 + 1
            goto L_0x0d35
        L_0x0d58:
            r0 = r69
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r0 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r0]     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.Object[] r2 = r2.toArray(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r2 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r2     // Catch:{ XmlPullParserException -> 0x1448 }
            com.google.android.exoplayer2.drm.DrmInitData r5 = new com.google.android.exoplayer2.drm.DrmInitData     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r69
            r5.<init>(r10, r2, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r6.A00(r5)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0d6c:
            java.util.ArrayList r7 = r1.A06     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r85
            r7.addAll(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wB r2 = new X.3wB     // Catch:{ XmlPullParserException -> 0x1448 }
            r2.<init>(r6)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3vy r0 = r1.A01     // Catch:{ XmlPullParserException -> 0x1448 }
            boolean r5 = r0 instanceof X.C256583w0     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r5 == 0) goto L_0x0da5
            java.util.List r11 = r1.A07     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3w0 r0 = (X.C256583w0) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.List r10 = r1.A08     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.List r8 = r1.A09     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r6 = r1.A04     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r5 = r1.A03     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wE r1 = new X.3wE     // Catch:{ XmlPullParserException -> 0x1448 }
            r36 = r1
            r37 = r2
            r38 = r0
            r39 = r6
            r40 = r5
            r41 = r11
            r42 = r7
            r43 = r10
            r44 = r8
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0da1:
            r15.add(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0e01
        L_0x0da5:
            boolean r5 = r0 instanceof X.C256763wJ     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r5 == 0) goto L_0x0dd3
            java.util.List r10 = r1.A07     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wJ r0 = (X.C256763wJ) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.List r8 = r1.A08     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.List r5 = r1.A09     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r6 = r1.A04     // Catch:{ XmlPullParserException -> 0x1448 }
            X.XOL r1 = new X.XOL     // Catch:{ XmlPullParserException -> 0x1448 }
            r36 = r1
            r37 = r2
            r38 = r0
            r39 = r10
            r40 = r7
            r41 = r8
            r42 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r5 = r2.A0U     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = r2.A0T     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = X.C256743wH.A00(r5, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r1.A00 = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r1.A01 = r6     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0da1
        L_0x0dd3:
            java.util.List r10 = r1.A07     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.List r8 = r1.A08     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.List r6 = r1.A09     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r5 = r2.A0U     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r1 = r2.A0T     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r39 = X.C256743wH.A00(r5, r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            boolean r1 = r0 instanceof X.C256553vx     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 == 0) goto L_0x1402
            X.3vx r0 = (X.C256553vx) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wF r1 = new X.3wF     // Catch:{ XmlPullParserException -> 0x1448 }
            r36 = r1
            r37 = r2
            r38 = r0
            r40 = r4
            r41 = r4
            r42 = r10
            r43 = r7
            r44 = r8
            r45 = r6
            r46 = r100
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0da1
        L_0x0e01:
            int r9 = r9 + 1
            goto L_0x0c73
        L_0x0e05:
            X.3wK r1 = new X.3wK     // Catch:{ XmlPullParserException -> 0x1448 }
            r161 = r1
            r164 = r166
            r165 = r15
            r166 = r83
            r167 = r89
            r168 = r88
            r170 = r90
            r161.<init>(r162, r163, r164, r165, r166, r167, r168, r169, r170, r171, r172)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r98
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x1007
        L_0x0e1f:
            java.lang.String r9 = "EventStream"
            boolean r0 = X.C256493vr.A01(r9, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0f90
            java.lang.String r0 = "schemeIdUri"
            r23 = r213
            r15 = r213
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0e34
            r15 = r0
        L_0x0e34:
            java.lang.String r0 = "value"
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0e3e
            r23 = r0
        L_0x0e3e:
            java.lang.String r2 = "timescale"
            r0 = 1
            long r48 = A06(r2, r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r2 = "presentationTimeOffset"
            r0 = r103
            long r17 = A06(r2, r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1448 }
            r10.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = 512(0x200, float:7.175E-43)
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ XmlPullParserException -> 0x1448 }
            r8.<init>(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0e5a:
            r3.next()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r7 = "Event"
            boolean r0 = X.C256493vr.A01(r7, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0f50
            r2 = r95
            r0 = r103
            long r42 = A06(r2, r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r94
            long r44 = A06(r0, r3, r13)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r2 = "presentationTime"
            r0 = r103
            long r50 = A06(r2, r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r46 = 1000(0x3e8, double:4.94E-321)
            long r40 = com.google.android.exoplayer2.util.Util.A09(r44, r46, r48)     // Catch:{ XmlPullParserException -> 0x1448 }
            long r50 = r50 - r17
            r52 = 1000000(0xf4240, double:4.940656E-318)
            r54 = r48
            long r21 = com.google.android.exoplayer2.util.Util.A09(r50, r52, r54)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "messageData"
            r12 = r4
            java.lang.String r0 = r3.getAttributeValue(r4, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0e96
            r12 = r0
        L_0x0e96:
            r8.reset()     // Catch:{ XmlPullParserException -> 0x1448 }
            org.xmlpull.v1.XmlSerializer r0 = android.util.Xml.newSerializer()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.nio.charset.Charset r11 = X.AnonymousClass2RN.A05     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r1 = r11.name()     // Catch:{ XmlPullParserException -> 0x1448 }
            r0.setOutput(r8, r1)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0ea6:
            r3.nextToken()     // Catch:{ XmlPullParserException -> 0x1448 }
            boolean r1 = X.C256493vr.A00(r7, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 != 0) goto L_0x0f2c
            int r2 = r3.getEventType()     // Catch:{ XmlPullParserException -> 0x1448 }
            r1 = 0
            switch(r2) {
                case 0: goto L_0x0f23;
                case 1: goto L_0x0f1f;
                case 2: goto L_0x0efc;
                case 3: goto L_0x0ef0;
                case 4: goto L_0x0ee8;
                case 5: goto L_0x0ee0;
                case 6: goto L_0x0ed8;
                case 7: goto L_0x0ed0;
                case 8: goto L_0x0ec8;
                case 9: goto L_0x0ec0;
                case 10: goto L_0x0eb8;
                default: goto L_0x0eb7;
            }     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0eb7:
            goto L_0x0ea6
        L_0x0eb8:
            java.lang.String r1 = r3.getText()     // Catch:{ XmlPullParserException -> 0x1448 }
            r0.docdecl(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0ea6
        L_0x0ec0:
            java.lang.String r1 = r3.getText()     // Catch:{ XmlPullParserException -> 0x1448 }
            r0.comment(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0ea6
        L_0x0ec8:
            java.lang.String r1 = r3.getText()     // Catch:{ XmlPullParserException -> 0x1448 }
            r0.processingInstruction(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0ea6
        L_0x0ed0:
            java.lang.String r1 = r3.getText()     // Catch:{ XmlPullParserException -> 0x1448 }
            r0.ignorableWhitespace(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0ea6
        L_0x0ed8:
            java.lang.String r1 = r3.getText()     // Catch:{ XmlPullParserException -> 0x1448 }
            r0.entityRef(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0ea6
        L_0x0ee0:
            java.lang.String r1 = r3.getText()     // Catch:{ XmlPullParserException -> 0x1448 }
            r0.cdsect(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0ea6
        L_0x0ee8:
            java.lang.String r1 = r3.getText()     // Catch:{ XmlPullParserException -> 0x1448 }
            r0.text(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0ea6
        L_0x0ef0:
            java.lang.String r2 = r3.getNamespace()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r1 = r3.getName()     // Catch:{ XmlPullParserException -> 0x1448 }
            r0.endTag(r2, r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0ea6
        L_0x0efc:
            java.lang.String r5 = r3.getNamespace()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r2 = r3.getName()     // Catch:{ XmlPullParserException -> 0x1448 }
            r0.startTag(r5, r2)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0f07:
            int r2 = r3.getAttributeCount()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 >= r2) goto L_0x0ea6
            java.lang.String r6 = r3.getAttributeNamespace(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r5 = r3.getAttributeName(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r2 = r3.getAttributeValue(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0.attribute(r6, r5, r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            int r1 = r1 + 1
            goto L_0x0f07
        L_0x0f1f:
            r0.endDocument()     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0ea6
        L_0x0f23:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r69)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0.startDocument(r4, r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0ea6
        L_0x0f2c:
            r0.flush()     // Catch:{ XmlPullParserException -> 0x1448 }
            byte[] r39 = r8.toByteArray()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.Long r1 = java.lang.Long.valueOf(r21)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r12 == 0) goto L_0x0f3d
            byte[] r39 = r12.getBytes(r11)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0f3d:
            com.google.android.exoplayer2.metadata.emsg.EventMessage r0 = new com.google.android.exoplayer2.metadata.emsg.EventMessage     // Catch:{ XmlPullParserException -> 0x1448 }
            r36 = r0
            r37 = r15
            r38 = r23
            r36.<init>(r37, r38, r39, r40, r42)     // Catch:{ XmlPullParserException -> 0x1448 }
            android.util.Pair r0 = android.util.Pair.create(r1, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r10.add(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x0f53
        L_0x0f50:
            A0D(r3)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x0f53:
            boolean r0 = X.C256493vr.A00(r9, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0e5a
            int r0 = r10.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            long[] r6 = new long[r0]     // Catch:{ XmlPullParserException -> 0x1448 }
            int r0 = r10.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            com.google.android.exoplayer2.metadata.emsg.EventMessage[] r5 = new com.google.android.exoplayer2.metadata.emsg.EventMessage[r0]     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = 0
        L_0x0f66:
            int r1 = r10.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 >= r1) goto L_0x0f83
            java.lang.Object r1 = r10.get(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.Object r2 = r1.first     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.Number r2 = (java.lang.Number) r2     // Catch:{ XmlPullParserException -> 0x1448 }
            long r7 = r2.longValue()     // Catch:{ XmlPullParserException -> 0x1448 }
            r6[r0] = r7     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.Object r1 = r1.second     // Catch:{ XmlPullParserException -> 0x1448 }
            r5[r0] = r1     // Catch:{ XmlPullParserException -> 0x1448 }
            int r0 = r0 + 1
            goto L_0x0f66
        L_0x0f83:
            X.S2T r1 = new X.S2T     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r23
            r1.<init>(r15, r0, r6, r5)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r99
            r0.add(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x1007
        L_0x0f90:
            java.lang.String r0 = "SegmentBase"
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0fa1
            r1 = r214
            r0 = r108
            X.3vx r24 = r1.A0L(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x1007
        L_0x0fa1:
            java.lang.String r0 = "SegmentList"
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0fc0
            long r194 = A07(r3, r13)     // Catch:{ XmlPullParserException -> 0x1448 }
            r36 = r214
            r37 = r108
            r38 = r3
            r39 = r184
            r41 = r91
            r43 = r194
            r45 = r138
            X.XOM r24 = r36.A0I(r37, r38, r39, r41, r43, r45)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x1007
        L_0x0fc0:
            java.lang.String r0 = "SegmentTemplate"
            boolean r0 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0fe1
            long r194 = A07(r3, r13)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.0sn r188 = X.0sn.A00     // Catch:{ XmlPullParserException -> 0x1448 }
            r186 = r214
            r187 = r108
            r189 = r3
            r192 = r91
            r196 = r138
            r198 = r156
            r190 = r184
            X.3wI r24 = r186.A0J(r187, r188, r189, r190, r192, r194, r196, r198)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x1007
        L_0x0fe1:
            java.lang.String r0 = "AssetIdentifier"
            boolean r1 = X.C256493vr.A01(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 == 0) goto L_0x0fee
            X.3vv r207 = A09(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x1007
        L_0x0fee:
            A0D(r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x1007
        L_0x0ff2:
            r0 = r91
            long r91 = A07(r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r25 = 1
        L_0x0ffa:
            r1 = r209
            r0 = r30
            java.util.ArrayList r1 = A0C(r1, r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r93
            r0.addAll(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x1007:
            r0 = r96
            boolean r0 = X.C256493vr.A00(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x0369
            r5 = 0
            r8 = 0
        L_0x1011:
            int r0 = r98.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r5 >= r0) goto L_0x1051
            r0 = r98
            java.lang.Object r1 = r0.get(r5)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wK r1 = (X.C256773wK) r1     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.List r0 = r1.A07     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x104e
            r2 = 0
        L_0x1024:
            java.util.List r0 = r1.A07     // Catch:{ XmlPullParserException -> 0x1448 }
            int r0 = r0.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r2 >= r0) goto L_0x104e
            java.util.List r0 = r1.A07     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wG r0 = (X.C256733wG) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            boolean r6 = r0 instanceof X.C256723wF     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r6 == 0) goto L_0x103a
            r7 = 0
            goto L_0x104a
        L_0x103a:
            X.4XD r0 = (X.AnonymousClass4XD) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wJ r0 = r0.A00     // Catch:{ XmlPullParserException -> 0x1448 }
            boolean r6 = r0 instanceof X.C256753wI     // Catch:{ XmlPullParserException -> 0x1448 }
            r7 = 0
            if (r6 == 0) goto L_0x104a
            X.3wI r0 = (X.C256753wI) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            X.CvC r0 = r0.A00     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x104a
            r7 = 1
        L_0x104a:
            r8 = r8 | r7
            int r2 = r2 + 1
            goto L_0x1024
        L_0x104e:
            int r5 = r5 + 1
            goto L_0x1011
        L_0x1051:
            X.3wM r5 = new X.3wM     // Catch:{ XmlPullParserException -> 0x1448 }
            r206 = r5
            r209 = r98
            r210 = r99
            r206.<init>(r207, r208, r209, r210, r211)     // Catch:{ XmlPullParserException -> 0x1448 }
            long r1 = r5.A00     // Catch:{ XmlPullParserException -> 0x1448 }
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x1063
            goto L_0x1078
        L_0x1063:
            int r0 = (r19 > r13 ? 1 : (r19 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x106d
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x106f
        L_0x106d:
            long r1 = r1 + r19
        L_0x106f:
            r0 = r105
            r0.add(r5)     // Catch:{ XmlPullParserException -> 0x1448 }
            r31 = r1
            r6 = 0
            goto L_0x107b
        L_0x1078:
            if (r156 == 0) goto L_0x140a
            r6 = 1
        L_0x107b:
            r159 = r159 | r8
            goto L_0x109e
        L_0x107e:
            A0D(r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x109e
        L_0x1082:
            r3.next()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r1 = "Title"
            boolean r1 = X.C256493vr.A01(r1, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 == 0) goto L_0x10a7
            java.lang.String r8 = r3.nextText()     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x1091:
            boolean r1 = X.C256493vr.A00(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 == 0) goto L_0x1082
            X.5MZ r118 = new X.5MZ     // Catch:{ XmlPullParserException -> 0x1448 }
            r7 = r118
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x109e:
            r0 = r109
            boolean r0 = X.C256493vr.A00(r0, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x022f
            goto L_0x10c5
        L_0x10a7:
            java.lang.String r1 = "Source"
            boolean r1 = X.C256493vr.A01(r1, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 == 0) goto L_0x10b4
            java.lang.String r9 = r3.nextText()     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x1091
        L_0x10b4:
            java.lang.String r1 = "Copyright"
            boolean r1 = X.C256493vr.A01(r1, r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 == 0) goto L_0x10c1
            java.lang.String r10 = r3.nextText()     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x1091
        L_0x10c1:
            A0D(r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x1091
        L_0x10c5:
            int r0 = (r56 > r13 ? 1 : (r56 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x10ce
            int r0 = (r31 > r13 ? 1 : (r31 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x10ce
            goto L_0x10d0
        L_0x10ce:
            r31 = r56
        L_0x10d0:
            boolean r0 = r105.isEmpty()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 != 0) goto L_0x1429
            boolean r2 = A0F(r105)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x1448 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "Before filterPeriod() for "
            r3.append(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r214
            java.lang.String r9 = r0.A03     // Catch:{ XmlPullParserException -> 0x1448 }
            r3.append(r9)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r5 = "\n"
            r3.append(r5)     // Catch:{ XmlPullParserException -> 0x1448 }
            r1 = r105
            java.lang.String r6 = r0.A0B(r3, r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r10 = "->"
            if (r2 == 0) goto L_0x11b4
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3vc r0 = (X.C256343vc) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r0.A01     // Catch:{ XmlPullParserException -> 0x1448 }
            boolean r0 = r0.A1Z     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 != 0) goto L_0x11b2
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1448 }
            r7.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.Iterator r13 = r105.iterator()     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x110f:
            boolean r0 = r13.hasNext()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x11d0
            java.lang.Object r1 = r13.next()     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wM r1 = (X.C256793wM) r1     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 != 0) goto L_0x1120
            r1 = 0
            goto L_0x11ad
        L_0x1120:
            java.util.List r11 = r1.A03     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.Iterator r12 = r11.iterator()     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x1126:
            boolean r0 = r12.hasNext()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x11ad
            java.lang.Object r2 = r12.next()     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wK r2 = (X.C256773wK) r2     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r2 == 0) goto L_0x1126
            int r8 = r2.A01     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r110
            if (r8 != r0) goto L_0x1126
            java.util.List r0 = r2.A07     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x1140:
            boolean r0 = r2.hasNext()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x1126
            java.lang.Object r0 = r2.next()     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wG r0 = (X.C256733wG) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x1140
            X.3wB r0 = r0.A02     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wA r0 = r0.A0N     // Catch:{ XmlPullParserException -> 0x1448 }
            boolean r0 = r0.A09     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x1140
            java.util.Iterator r11 = r11.iterator()     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x115a:
            boolean r0 = r11.hasNext()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x118d
            java.lang.Object r2 = r11.next()     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wK r2 = (X.C256773wK) r2     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r2 == 0) goto L_0x115a
            int r8 = r2.A01     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r110
            if (r8 != r0) goto L_0x115a
            java.util.List r0 = r2.A07     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x1174:
            boolean r0 = r2.hasNext()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x115a
            java.lang.Object r0 = r2.next()     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wG r0 = (X.C256733wG) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x1174
            X.3wB r0 = r0.A02     // Catch:{ XmlPullParserException -> 0x1448 }
            int r0 = r0.A0E     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 <= 0) goto L_0x1174
            r0 = r0 & 1
            if (r0 != 0) goto L_0x1174
            goto L_0x11ad
        L_0x118d:
            X.XOK r2 = new X.XOK     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r69
            r2.<init>(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.XOJ r0 = new X.XOJ     // Catch:{ XmlPullParserException -> 0x1448 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            X.Y9U[] r8 = new X.Y9U[]{r2, r0}     // Catch:{ XmlPullParserException -> 0x1448 }
            r2 = 0
        L_0x119e:
            r0 = r8[r2]     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x11a6
            X.3wM r1 = r0.AV7(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x11a6:
            int r2 = r2 + 1
            r0 = r110
            if (r2 >= r0) goto L_0x11ad
            goto L_0x119e
        L_0x11ad:
            r7.add(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x110f
        L_0x11b2:
            r7 = r1
            goto L_0x11d0
        L_0x11b4:
            java.lang.String r0 = "Skip filterPeriod() for "
            r3.append(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r3.append(r9)     // Catch:{ XmlPullParserException -> 0x1448 }
            r3.append(r5)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r103
            r2 = r214
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r1 = X.002.A0g(r6, r10, r6)     // Catch:{ XmlPullParserException -> 0x1448 }
            r2.A02 = r1     // Catch:{ XmlPullParserException -> 0x1448 }
            r161 = 0
            r7 = r105
            goto L_0x11f2
        L_0x11d0:
            java.lang.String r0 = "filterPeriod() for "
            r3.append(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r3.append(r9)     // Catch:{ XmlPullParserException -> 0x1448 }
            r3.append(r5)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r214
            java.lang.String r8 = r0.A0B(r3, r7)     // Catch:{ XmlPullParserException -> 0x1448 }
            boolean r161 = A0F(r7)     // Catch:{ XmlPullParserException -> 0x1448 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ XmlPullParserException -> 0x1448 }
            long r1 = r1 - r14
            r0.A00 = r1     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r1 = X.002.A0g(r6, r10, r8)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0.A02 = r1     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x11f2:
            java.lang.String r0 = "Finish filterPeriod() for "
            r3.append(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r3.append(r9)     // Catch:{ XmlPullParserException -> 0x1448 }
            r3.append(r5)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r22 = r3.toString()     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r68
            boolean r0 = A0E(r0, r7)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x13aa
            r2 = r214
            X.3vc r2 = (X.C256343vc) r2     // Catch:{ XmlPullParserException -> 0x1448 }
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r1 = r2.A01     // Catch:{ XmlPullParserException -> 0x1448 }
            int r10 = r1.A07     // Catch:{ XmlPullParserException -> 0x1448 }
            boolean r0 = r1.A1e     // Catch:{ XmlPullParserException -> 0x1448 }
            r21 = r0
            boolean r14 = r1.A26     // Catch:{ XmlPullParserException -> 0x1448 }
            android.content.Context r8 = r2.A00     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r10 != 0) goto L_0x121e
            r15 = r7
            goto L_0x13ab
        L_0x121e:
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1448 }
            r15.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.Iterator r20 = r7.iterator()     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x1227:
            boolean r0 = r20.hasNext()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x13ab
            java.lang.Object r0 = r20.next()     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wM r0 = (X.C256793wM) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r13 = r0.A02     // Catch:{ XmlPullParserException -> 0x1448 }
            long r11 = r0.A00     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.List r1 = r0.A03     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1448 }
            r7.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            r5 = 0
            r2 = 0
        L_0x1240:
            int r0 = r1.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r2 >= r0) goto L_0x125c
            java.lang.Object r0 = r1.get(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wK r0 = (X.C256773wK) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            int r3 = r0.A01     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r68
            if (r3 != r0) goto L_0x1259
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            r7.add(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x1259:
            int r2 = r2 + 1
            goto L_0x1240
        L_0x125c:
            boolean r0 = r7.isEmpty()     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r0 ^ 1
            X.0Sd.A02(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r68
            if (r10 != r0) goto L_0x12a3
            if (r8 == 0) goto L_0x12a3
            java.lang.String r0 = "accessibility"
            java.lang.Object r0 = r8.getSystemService(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x12a3
            boolean r0 = r0.isTouchExplorationEnabled()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x12a3
            java.util.Iterator r6 = r7.iterator()     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x127f:
            boolean r0 = r6.hasNext()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x12a3
            java.lang.Object r0 = r6.next()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            int r2 = r0.intValue()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.Object r0 = r1.get(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wK r0 = (X.C256773wK) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            int r3 = X.C21554XeP.A00(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = 512(0x200, float:7.175E-43)
            if (r3 != r0) goto L_0x127f
            java.lang.Object r2 = r1.get(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r2 != 0) goto L_0x1372
        L_0x12a3:
            if (r21 == 0) goto L_0x1339
            if (r14 != 0) goto L_0x13a0
            X.2Bk r2 = X.C69822Bk.A02     // Catch:{ XmlPullParserException -> 0x1448 }
            monitor-enter(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.0sa r0 = X.C69822Bk.A01     // Catch:{ all -> 0x1423 }
            java.lang.Object r3 = r0.invoke()     // Catch:{ all -> 0x1423 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x1423 }
            monitor-exit(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = "device"
            boolean r0 = r0.equals(r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x12c9
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()     // Catch:{ XmlPullParserException -> 0x1448 }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.Locale r0 = r0.locale     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r3 = r0.getLanguage()     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x12c9:
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 != 0) goto L_0x1339
            java.util.Iterator r19 = r7.iterator()     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x12d3:
            boolean r0 = r19.hasNext()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x1339
            java.lang.Object r0 = r19.next()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            int r2 = r0.intValue()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.Object r0 = r1.get(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wK r0 = (X.C256773wK) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            int r6 = X.C21554XeP.A00(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = 16
            if (r6 != r0) goto L_0x12d3
            java.lang.Object r2 = r1.get(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wK r2 = (X.C256773wK) r2     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.List r6 = r2.A07     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r6 == 0) goto L_0x1337
            int r0 = r6.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 <= 0) goto L_0x1337
            java.lang.Object r0 = r6.get(r5)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wG r0 = (X.C256733wG) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wB r0 = r0.A02     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r6 = r0.A0V     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x130b:
            java.util.List r0 = X.C21554XeP.A00     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.Iterator r18 = r0.iterator()     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x1311:
            boolean r0 = r18.hasNext()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x1330
            java.lang.Object r0 = r18.next()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            boolean r17 = r3.startsWith(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r17 == 0) goto L_0x1311
            boolean r17 = android.text.TextUtils.isEmpty(r6)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r17 != 0) goto L_0x1311
            boolean r0 = r6.startsWith(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x1311
            goto L_0x1372
        L_0x1330:
            boolean r0 = r3.equals(r6)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x12d3
            goto L_0x1372
        L_0x1337:
            r6 = 0
            goto L_0x130b
        L_0x1339:
            java.util.Iterator r6 = r7.iterator()     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x133d:
            boolean r0 = r6.hasNext()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 == 0) goto L_0x135e
            java.lang.Object r0 = r6.next()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            int r2 = r0.intValue()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.Object r0 = r1.get(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            X.3wK r0 = (X.C256773wK) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            int r3 = X.C21554XeP.A00(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r68
            if (r3 == r0) goto L_0x136e
            if (r3 != 0) goto L_0x133d
            goto L_0x136e
        L_0x135e:
            int r0 = r7.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r0 <= 0) goto L_0x137b
            java.lang.Object r0 = r7.get(r5)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ XmlPullParserException -> 0x1448 }
            int r2 = r0.intValue()     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x136e:
            java.lang.Object r2 = r1.get(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x1372:
            X.0Sd.A00(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1448 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x137d
        L_0x137b:
            r2 = 0
            goto L_0x1372
        L_0x137d:
            r6 = 0
        L_0x137e:
            int r3 = r1.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r5 >= r3) goto L_0x139f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch:{ XmlPullParserException -> 0x1448 }
            boolean r3 = r7.contains(r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r3 != 0) goto L_0x1396
            java.lang.Object r3 = r1.get(r5)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0.add(r3)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x139c
        L_0x1396:
            if (r6 != 0) goto L_0x139c
            r0.add(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            r6 = 1
        L_0x139c:
            int r5 = r5 + 1
            goto L_0x137e
        L_0x139f:
            r1 = r0
        L_0x13a0:
            X.3wM r0 = new X.3wM     // Catch:{ XmlPullParserException -> 0x1448 }
            r0.<init>(r11, r13, r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            r15.add(r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x1227
        L_0x13aa:
            r15 = r7
        L_0x13ab:
            if (r35 != 0) goto L_0x13b1
            r157 = 0
            if (r158 == 0) goto L_0x13b3
        L_0x13b1:
            r157 = 1
        L_0x13b3:
            X.3w6 r0 = new X.3w6     // Catch:{ XmlPullParserException -> 0x1448 }
            r116 = r0
            r120 = r111
            r126 = r33
            r128 = r15
            r132 = r31
            r116.<init>(r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r132, r134, r136, r138, r140, r142, r144, r146, r148, r150, r152, r154, r156, r157, r158, r159, r160, r161)     // Catch:{ XmlPullParserException -> 0x1448 }
            r1 = r22
            r0.A01 = r1     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r16 == 0) goto L_0x13e0
            boolean r1 = android.text.TextUtils.isEmpty(r9)     // Catch:{ XmlPullParserException -> 0x1448 }
            if (r1 != 0) goto L_0x13e0
            monitor-enter(r16)     // Catch:{ XmlPullParserException -> 0x1448 }
            boolean r1 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x1426 }
            if (r1 != 0) goto L_0x13dc
            r1 = r16
            android.util.LruCache r1 = r1.A00     // Catch:{ all -> 0x1426 }
            r1.put(r9, r0)     // Catch:{ all -> 0x1426 }
        L_0x13dc:
            monitor-exit(r16)     // Catch:{ XmlPullParserException -> 0x1448 }
            goto L_0x13e0
        L_0x13de:
            if (r0 == 0) goto L_0x0032
        L_0x13e0:
            long r1 = java.lang.System.currentTimeMillis()
            java.util.Locale r4 = java.util.Locale.US
            long r1 = r1 - r62
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            r1 = r214
            long r1 = r1.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            r1 = r214
            java.lang.String r1 = r1.A02
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2, r1}
            java.lang.String r1 = "parse:%dms;filter:%dms;%s"
            java.lang.String.format(r4, r1, r2)
            return r0
        L_0x1402:
            java.lang.String r1 = "segmentBase must be of type SingleSegmentBase or MultiSegmentBase"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ XmlPullParserException -> 0x1448 }
            r0.<init>(r1)     // Catch:{ XmlPullParserException -> 0x1448 }
            throw r0     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x140a:
            java.lang.String r1 = "Unable to determine start of period "
            int r0 = r105.size()     // Catch:{ XmlPullParserException -> 0x1448 }
            java.lang.String r3 = X.002.A0O(r1, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r2 = 4
            X.47p r1 = new X.47p     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r108
            r1.<init>(r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r68
            r1.A01 = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r1.A00 = r2     // Catch:{ XmlPullParserException -> 0x1448 }
            throw r1     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x1423:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ XmlPullParserException -> 0x1448 }
            throw r0     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x1426:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ XmlPullParserException -> 0x1448 }
            throw r0     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x1429:
            java.lang.String r3 = "No periods found."
            r2 = 4
            X.47p r1 = new X.47p     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r108
            r1.<init>(r3, r0)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0 = r68
            r1.A01 = r0     // Catch:{ XmlPullParserException -> 0x1448 }
            r1.A00 = r2     // Catch:{ XmlPullParserException -> 0x1448 }
            throw r1     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x143a:
            java.lang.String r3 = "inputStream does not contain a valid media presentation description"
            r2 = 1
            r1 = 4
            X.47p r0 = new X.47p     // Catch:{ XmlPullParserException -> 0x1448 }
            r0.<init>(r3, r4)     // Catch:{ XmlPullParserException -> 0x1448 }
            r0.A01 = r2     // Catch:{ XmlPullParserException -> 0x1448 }
            r0.A00 = r1     // Catch:{ XmlPullParserException -> 0x1448 }
            throw r0     // Catch:{ XmlPullParserException -> 0x1448 }
        L_0x1448:
            r3 = move-exception
            r2 = 1
            r1 = 4
            X.47p r0 = new X.47p
            r0.<init>(r4, r3)
            r0.A01 = r2
            r0.A00 = r1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C256353vd.E1j(android.net.Uri, java.io.InputStream):X.3w6");
    }
}
