package X;

import android.util.LruCache;
import com.instagram.common.gallery.Medium;
import java.io.File;

/* renamed from: X.8ch  reason: invalid class name and case insensitive filesystem */
public final class C359358ch extends LruCache {
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Medium medium = (Medium) obj2;
        if (z && medium != null && medium.A06()) {
            File file = new File(medium.A0X);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        Medium medium = (Medium) obj2;
        if (medium == null || !medium.A06()) {
            return 0;
        }
        File file = new File(medium.A0X);
        if (file.exists()) {
            return (int) file.length();
        }
        return 0;
    }

    public C359358ch(int i) {
        super(i);
    }
}
