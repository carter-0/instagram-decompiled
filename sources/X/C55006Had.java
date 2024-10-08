package X;

import android.util.LruCache;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Had  reason: case insensitive filesystem */
public abstract class C55006Had {
    public static void A00(0MB r4, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C55635Hku hku = (C55635Hku) it.next();
            String str = hku.A00;
            String str2 = hku.A01;
            LruCache lruCache = r4.A05;
            if (str2 == null) {
                str2 = "";
            }
            lruCache.put(str, str2);
        }
    }
}
