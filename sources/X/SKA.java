package X;

import org.xmlpull.v1.XmlPullParser;

public abstract class SKA {
    public static String A00(String str, XmlPullParser xmlPullParser) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static boolean A01(String str, XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 3 || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean A02(String str, XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 2 || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }
}
