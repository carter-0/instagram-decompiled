package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf;
import com.instagram.model.showreel.IgShowreelCompositionAssetType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

/* renamed from: X.6OI  reason: invalid class name */
public final class AnonymousClass6OI implements 0lm {
    public static final AnonymousClass6OK A02 = new AnonymousClass6OK();
    public final Map A00 = new ConcurrentHashMap(2);
    public final Map A01 = new ConcurrentHashMap(2);

    public final void A01(String str, String str2, List list) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 2);
        Map map = this.A00;
        if (!map.containsKey(str)) {
            ListenableFuture A012 = AnonymousClass6OL.A01(str, true);
            map.put(str, A012);
            C255183ti.A04(new AnonymousClass6OP(this, str), A012, 1Lf.A01);
            if (list != null) {
                1NK A002 = 1NK.A00();
                0qQ.A07(A002);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    IgShowreelCompositionAssetInfoIntf igShowreelCompositionAssetInfoIntf = (IgShowreelCompositionAssetInfoIntf) it.next();
                    if (igShowreelCompositionAssetInfoIntf.CAb() == IgShowreelCompositionAssetType.IMAGE) {
                        1OO A0J = A002.A0J(new SimpleImageUrl(igShowreelCompositionAssetInfoIntf.getUrl()), str2);
                        A0J.A0I = true;
                        A0J.A0F = true;
                        A0J.A02(A02);
                        A0J.A01();
                    }
                }
            }
        }
    }

    public static final void A00(AnonymousClass6OI r4) {
        Map map = r4.A00;
        for (Future cancel : map.values()) {
            cancel.cancel(false);
        }
        map.clear();
        r4.A01.clear();
    }

    public final void onUserSessionWillEnd(boolean z) {
        A00(this);
    }
}
