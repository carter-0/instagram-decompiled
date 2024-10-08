package X;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.PopupWindow;

public final class H58 extends C14097Tpp {
    public final Handler A00 = AnonymousClass7TF.A0D();

    public final /* bridge */ /* synthetic */ void A0L(View view, C307786Rm r5, C276544tV r6, Object obj, Object obj2) {
        C55431Hhb hhb = (C55431Hhb) C307476Qg.A06(r5, r6);
        if (hhb != null) {
            this.A00.removeCallbacksAndMessages((Object) null);
            PopupWindow popupWindow = hhb.A00;
            View contentView = popupWindow.getContentView();
            0Sd.A00(contentView);
            ((C299025uS) contentView).setRenderTree((C245663dH) null);
            popupWindow.dismiss();
            return;
        }
        throw new RuntimeException("Popup container defines a controller but none was found");
    }

    public final View A0J(Context context) {
        return new View(context);
    }

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        return new View(context);
    }

    public H58(C307786Rm r2, C276544tV r3) {
        super(r2, r3);
    }

    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r5, C276544tV r6, Object obj) {
        C55431Hhb hhb = (C55431Hhb) C307476Qg.A06(r5, r6);
        if (hhb != null) {
            this.A00.post(new C57936Iir(hhb, r5, r6, obj));
            return null;
        }
        throw new RuntimeException("Popup container defines a controller but none was found");
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r2, C276544tV r3, Object obj, Object obj2) {
    }
}
