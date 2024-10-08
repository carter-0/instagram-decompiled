package X;

import android.content.ClipData;
import android.content.Context;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;

/* renamed from: X.M9b  reason: case insensitive filesystem */
public final class C66042M9b implements Runnable {
    public final /* synthetic */ ClipData A00;
    public final /* synthetic */ AnonymousClass7JA A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ boolean A03;

    public C66042M9b(ClipData clipData, AnonymousClass7JA r2, List list, boolean z) {
        this.A02 = list;
        this.A00 = clipData;
        this.A01 = r2;
        this.A03 = z;
    }

    public final void run() {
        List list = this.A02;
        if (!list.isEmpty() && list.size() == this.A00.getItemCount()) {
            AnonymousClass7IG r0 = (AnonymousClass7IG) this.A01.A01.get();
            if (r0 != null) {
                r0.A05((C53401GnY) null, (MessageIdentifier) null, (C381779cJ) null, (Long) null, C63113Krh.A00(list), true, false);
            }
        } else if (this.A03) {
            Context context = (Context) this.A01.A00.get();
            if (context != null) {
                C59689JTv.A06(context, 2131976484);
            }
        } else {
            AnonymousClass7JB.A00(this.A01);
        }
    }
}
