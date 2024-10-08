package X;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.9Dy  reason: invalid class name and case insensitive filesystem */
public abstract class C375529Dy {
    public static void A01(XmlPullParser xmlPullParser) {
        int i = 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            } else {
                continue;
            }
            if (i <= 0) {
                return;
            }
        }
    }

    public static List A00(Resources resources, int i) {
        ArrayList arrayList;
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                arrayList = Collections.emptyList();
            } else {
                ArrayList arrayList2 = new ArrayList();
                if (obtainTypedArray.getType(0) == 1) {
                    for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                        int resourceId = obtainTypedArray.getResourceId(i2, 0);
                        if (resourceId != 0) {
                            String[] stringArray = resources.getStringArray(resourceId);
                            ArrayList arrayList3 = new ArrayList();
                            for (String decode : stringArray) {
                                arrayList3.add(Base64.decode(decode, 0));
                            }
                            arrayList2.add(arrayList3);
                        }
                    }
                    arrayList = arrayList2;
                } else {
                    String[] stringArray2 = resources.getStringArray(i);
                    ArrayList arrayList4 = new ArrayList();
                    for (String decode2 : stringArray2) {
                        arrayList4.add(Base64.decode(decode2, 0));
                    }
                    arrayList2.add(arrayList4);
                    arrayList = arrayList2;
                }
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }
}
