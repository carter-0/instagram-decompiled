package com.instagram.direct.msys.impl.thread;

import X.AnonymousClass0fD;
import X.AnonymousClass3AN;
import X.AnonymousClass3AW;
import X.AnonymousClass7TG;
import X.C249703kE;
import X.C331027Pf;
import X.C51965G9l;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.direct.messagethread.store.intf.MessageListLayoutManager;
import java.lang.ref.WeakReference;

public final class MsysMessageListLinearLayoutManager extends MessageListLayoutManager {
    public final WeakReference A00;

    public MsysMessageListLinearLayoutManager(Context context, RecyclerView recyclerView) {
        super(context, 1, true);
        this.A00 = true;
        this.A00 = C51965G9l.A0v(recyclerView);
    }

    public final void A1R(AnonymousClass3AN r5, AnonymousClass3AW r6) {
        RecyclerView recyclerView;
        View view;
        int A03 = AnonymousClass0fD.A03(-98934484);
        AnonymousClass7TG.A1N(r5, r6);
        super.A1R(r5, r6);
        View A1D = A1D(A1b());
        if (!(A1D == null || (recyclerView = (RecyclerView) this.A00.get()) == null)) {
            C249703kE A0Y = recyclerView.A0Y(A1D);
            if (!(!(A0Y instanceof C331027Pf) || (view = A0Y.itemView) == null || view.getMinimumHeight() == view.getBottom())) {
                view.setMinimumHeight(view.getBottom());
                super.A1R(r5, r6);
            }
        }
        AnonymousClass0fD.A0A(445055158, A03);
    }
}
