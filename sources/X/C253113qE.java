package X;

import android.view.View;
import com.instagram.search.common.analytics.SearchContext;
import java.util.HashMap;

/* renamed from: X.3qE  reason: invalid class name and case insensitive filesystem */
public final class C253113qE extends C253103qD {
    public final /* synthetic */ 0MB A00;
    public final /* synthetic */ C252933pw A01;
    public final /* synthetic */ SearchContext A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C253113qE(0MB r1, C252933pw r2, SearchContext searchContext, int i, boolean z, boolean z2) {
        super(z, i);
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = z2;
        this.A02 = searchContext;
    }

    public final void onClick(View view) {
        HashMap hashMap;
        0MB r4 = this.A00;
        C252933pw r0 = this.A01;
        C247733gp r2 = r0.A01;
        boolean A032 = r2.A03();
        1sy r3 = r0.A03;
        boolean z = this.A03;
        SearchContext searchContext = this.A02;
        AnonymousClass34A r5 = r0.A04;
        AnonymousClass3W1 r02 = r0.A02;
        if (r02 == null || (hashMap = r02.A1e) == null) {
            hashMap = null;
        } else {
            hashMap.put("tap_area", "ellipsis_area");
        }
        0MB.A08(r2, r3, r4, r5, searchContext, hashMap, A032, z);
    }
}
