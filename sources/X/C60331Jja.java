package X;

import kotlin.Deprecated;
import kotlin.ReplaceWith;

@Deprecated(message = "PageKeyedDataSource is deprecated and has been replaced by PagingSource", replaceWith = @ReplaceWith(expression = "PagingSource<Key, Value>", imports = {"androidx.paging.PagingSource"}))
/* renamed from: X.Jja  reason: case insensitive filesystem */
public abstract class C60331Jja extends C63568KzH {
    public void A01(C62956Kp8 kp8, C64081LLz lLz) {
        0sn r4 = 0sn.A00;
        0qQ.A0B(r4, 0);
        lLz.A00.resumeWith(new C63922LDd((Object) null, (Object) null, r4, 0, 0));
    }

    public void A02(C63570KzJ kzJ, C64110LNq lNq) {
        lNq.A00((Object) null, 0sn.A00);
    }

    public void A03(C63570KzJ kzJ, C64110LNq lNq) {
        lNq.A00((Object) null, 0sn.A00);
    }
}
