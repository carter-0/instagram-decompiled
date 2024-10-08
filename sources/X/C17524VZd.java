package X;

import android.os.Parcelable;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.VZd  reason: case insensitive filesystem */
public final class C17524VZd {
    public Parcelable A00;
    public final int A01;
    public final C268374dH A02;
    public final Map A03 = new HashMap();
    public final Map A04 = new HashMap();

    /* JADX WARNING: type inference failed for: r0v5, types: [android.os.Parcelable, java.lang.Object] */
    public C17524VZd(C268374dH r6, int i) {
        this.A02 = r6;
        this.A01 = i;
        List unmodifiableList = Collections.unmodifiableList(r6.Bg7().A03);
        for (int i2 = 0; i2 < unmodifiableList.size(); i2++) {
            String id = ((ProductFeedItem) unmodifiableList.get(i2)).getId();
            C66580MXl.A1T(id, this.A04, i2);
            this.A03.put(id, new Object());
        }
        this.A00 = new Object();
    }
}
