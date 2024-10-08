package X;

import com.instagram.common.gallery.RemoteMedia;
import java.util.Comparator;

/* renamed from: X.8iH  reason: invalid class name and case insensitive filesystem */
public final class C362658iH implements Comparator {
    public final int compare(Object obj, Object obj2) {
        int i;
        Integer num;
        Integer num2;
        RemoteMedia remoteMedia = ((C361728gh) obj).A03.A04;
        int i2 = 0;
        if (remoteMedia == null || (num2 = remoteMedia.A05) == null) {
            i = 0;
        } else {
            i = num2.intValue();
        }
        Long valueOf = Long.valueOf(((long) (-i)) * 1000);
        RemoteMedia remoteMedia2 = ((C361728gh) obj2).A03.A04;
        if (!(remoteMedia2 == null || (num = remoteMedia2.A05) == null)) {
            i2 = num.intValue();
        }
        return 29b.A00(valueOf, Long.valueOf(((long) (-i2)) * 1000));
    }
}
