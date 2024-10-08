package X;

import com.instagram.common.gallery.RemoteMedia;
import java.util.Comparator;

/* renamed from: X.9Rn  reason: invalid class name and case insensitive filesystem */
public final class C378869Rn implements Comparator {
    public final int compare(Object obj, Object obj2) {
        int i;
        long j;
        Integer num;
        long j2;
        Integer num2;
        C232262tL r8 = (C232262tL) obj;
        int i2 = 0;
        if (r8 instanceof C361718gg) {
            j = ((C361718gg) r8).A01.A00.A0C;
        } else if (r8 instanceof C361728gh) {
            RemoteMedia remoteMedia = ((C361728gh) r8).A03.A04;
            if (remoteMedia == null || (num = remoteMedia.A05) == null) {
                i = 0;
            } else {
                i = num.intValue();
            }
            j = (long) i;
        } else {
            throw new IllegalArgumentException("Unsupported Media View Model");
        }
        Long valueOf = Long.valueOf(j * 1000);
        C232262tL r9 = (C232262tL) obj2;
        if (r9 instanceof C361718gg) {
            j2 = ((C361718gg) r9).A01.A00.A0C;
        } else if (r9 instanceof C361728gh) {
            RemoteMedia remoteMedia2 = ((C361728gh) r9).A03.A04;
            if (!(remoteMedia2 == null || (num2 = remoteMedia2.A05) == null)) {
                i2 = num2.intValue();
            }
            j2 = (long) i2;
        } else {
            throw new IllegalArgumentException("Unsupported Media View Model");
        }
        return 29b.A00(valueOf, Long.valueOf(j2 * 1000));
    }
}
