package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.search.common.analytics.SearchContext;
import java.util.HashMap;

/* renamed from: X.Gd9  reason: case insensitive filesystem */
public final class C52817Gd9 extends ClickableSpan {
    public final /* synthetic */ 0MB A00;
    public final /* synthetic */ C252933pw A01;
    public final /* synthetic */ SearchContext A02;

    public C52817Gd9(0MB r1, C252933pw r2, SearchContext searchContext) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = searchContext;
    }

    public final void onClick(View view) {
        HashMap hashMap;
        0MB r4 = this.A00;
        C252933pw r0 = this.A01;
        C247733gp r2 = r0.A01;
        boolean A03 = r2.A03();
        1sy r3 = r0.A03;
        SearchContext searchContext = this.A02;
        AnonymousClass34A r5 = r0.A04;
        AnonymousClass3W1 r02 = r0.A02;
        if (r02 == null || (hashMap = r02.A1e) == null) {
            hashMap = null;
        } else {
            hashMap.put("tap_area", "icon_area");
        }
        0MB.A08(r2, r3, r4, r5, searchContext, hashMap, A03, false);
    }
}
