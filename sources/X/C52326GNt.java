package X;

import android.text.TextPaint;
import android.view.View;
import com.instagram.search.common.analytics.SearchContext;
import java.util.HashMap;

/* renamed from: X.GNt  reason: case insensitive filesystem */
public final class C52326GNt extends C263364Lg {
    public final /* synthetic */ 0MB A00;
    public final /* synthetic */ C252933pw A01;
    public final /* synthetic */ SearchContext A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public C52326GNt(0MB r1, C252933pw r2, SearchContext searchContext, boolean z, boolean z2) {
        this.A00 = r1;
        this.A04 = z;
        this.A01 = r2;
        this.A03 = z2;
        this.A02 = searchContext;
    }

    public final void onClick(View view) {
        HashMap hashMap;
        if (view != null) {
            0MB r4 = this.A00;
            boolean z = this.A04;
            C252933pw r0 = this.A01;
            C247733gp r2 = r0.A01;
            1sy r3 = r0.A03;
            boolean z2 = this.A03;
            SearchContext searchContext = this.A02;
            AnonymousClass34A r5 = r0.A04;
            AnonymousClass3W1 r02 = r0.A02;
            if (r02 == null || (hashMap = r02.A1e) == null) {
                hashMap = null;
            } else {
                hashMap.put("tap_area", "text_area");
            }
            0MB.A08(r2, r3, r4, r5, searchContext, hashMap, z, z2);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        if (this.A01.A01.A06 != C252883pr.Success) {
            textPaint.setAlpha(64);
        }
    }
}
