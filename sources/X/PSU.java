package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.Set;

public final /* synthetic */ class PSU implements 1aV {
    public final /* synthetic */ ImageUrl A00;
    public final /* synthetic */ 1wY A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ PSU(ImageUrl imageUrl, 1wY r2, String str) {
        this.A01 = r2;
        this.A00 = imageUrl;
        this.A02 = str;
    }

    public final void accept(Object obj) {
        1wY r4 = this.A01;
        ImageUrl imageUrl = this.A00;
        String str = this.A02;
        1wy r1 = r4.A09;
        imageUrl.AjH();
        synchronized (r1) {
            r1.A03.get(str);
        }
        AnonymousClass1xz r0 = r4.A06;
        if (r0 != null) {
            Object AjH = imageUrl.AjH();
            Set set = (Set) r0.A01.get(str);
            if (set != null) {
                set.remove(AjH);
            }
        }
    }
}
