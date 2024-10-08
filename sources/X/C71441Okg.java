package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;

/* renamed from: X.Okg  reason: case insensitive filesystem */
public final class C71441Okg implements ViewStub.OnInflateListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C71441Okg(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = obj3;
    }

    public final void onInflate(ViewStub viewStub, View view) {
        switch (this.A00) {
            case 0:
                AnonymousClass7TF.A0G((View) this.A02, R.id.subscriptions_sticker_card).setBackground(new C16143UpU((Context) this.A01, ((WUY) this.A03).A05));
                return;
            case 1:
                0qQ.A0A(view);
                C69890Nts.A00(view, (C69664Npm) this.A01, (C74444Puz) this.A02);
                view.setVisibility(0);
                int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                ((C68011Myd) this.A03).A00 = view;
                return;
            default:
                return;
        }
    }
}
