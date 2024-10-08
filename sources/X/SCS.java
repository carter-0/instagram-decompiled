package X;

import android.content.res.XmlResourceParser;
import java.util.ArrayList;

public abstract class SCS {
    public static final Object A00 = Pxe.A0p();
    public static volatile ArrayList A01;

    public static String A00(XmlResourceParser xmlResourceParser, String str) {
        String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        if (attributeValue == null) {
            return xmlResourceParser.getAttributeValue((String) null, str);
        }
        return attributeValue;
    }
}
