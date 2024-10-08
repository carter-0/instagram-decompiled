package X;

import android.view.View;
import java.util.ArrayList;

/* renamed from: X.UjR  reason: case insensitive filesystem */
public final class C15841UjR extends AnonymousClass3NK {
    public final /* synthetic */ WBO A00;

    public C15841UjR(WBO wbo) {
        this.A00 = wbo;
    }

    public final boolean Dqe(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        WBO wbo = this.A00;
        int i = wbo.A00 + 1;
        Integer num = wbo.A0G;
        Integer num2 = AnonymousClass05K.A0C;
        if (num == num2) {
            arrayList = C17164VKt.A01;
        } else {
            arrayList = C17164VKt.A06;
        }
        int size = i % arrayList.size();
        wbo.A00 = size;
        if (wbo.A0G == num2) {
            arrayList2 = C17164VKt.A01;
        } else {
            arrayList2 = C17164VKt.A06;
        }
        WBO.A02(wbo, (C14272Tsv) DbZ.A0g(arrayList2, size));
        return true;
    }
}
