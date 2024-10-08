package X;

import android.media.MediaDataSource;
import android.media.MediaExtractor;
import java.util.Map;
import java.util.Set;

public final class Q0V extends Q0Z {
    public static final C7231Q0a A01 = new C7231Q0a();
    public final String A00;

    public static Q0V A00(String str) {
        try {
            return new Q0V(new MediaExtractor(), str);
        } catch (Throwable th) {
            throw Pxe.A0u(A01.toString(), th);
        }
    }

    public final void A01(MediaDataSource mediaDataSource) {
        try {
            this.A00.setDataSource(mediaDataSource);
        } catch (Throwable th) {
            throw Pxe.A0c(A01.toString(), th);
        }
    }

    public final void release() {
        C7231Q0a q0a = A01;
        String str = this.A00;
        int hashCode = hashCode();
        synchronized (q0a) {
            Map map = q0a.A00;
            Set set = (Set) map.get(str);
            if (set != null) {
                set.remove(Integer.valueOf(hashCode));
                if (set.isEmpty()) {
                    map.remove(str);
                }
            }
        }
        super.release();
    }

    public Q0V(MediaExtractor mediaExtractor, String str) {
        this.A00 = mediaExtractor;
        this.A00 = str;
        C7231Q0a q0a = A01;
        int hashCode = hashCode();
        synchronized (q0a) {
            Map map = q0a.A00;
            if (!map.containsKey(str)) {
                map.put(str, AnonymousClass7TE.A1F());
            }
            Set set = (Set) map.get(str);
            if (set != null) {
                set.add(Integer.valueOf(hashCode));
            }
        }
    }

    public final void ETt(String str) {
        try {
            super.ETt(str);
        } catch (Throwable th) {
            throw Pxe.A0c(A01.toString(), th);
        }
    }
}
