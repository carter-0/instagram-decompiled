package X;

import android.content.Context;
import com.instagram.model.reels.Reel;
import java.util.List;
import java.util.Set;

/* renamed from: X.WaV  reason: case insensitive filesystem */
public final class C19483WaV implements C2813857k {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C19483WaV(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj;
    }

    public final void onFinish() {
        if (this.A00 != 0) {
            Set set = ((C60308Jj7) this.A03).A07;
            for (Object remove : (List) this.A02) {
                set.remove(remove);
            }
            C262224Cq r3 = (C262224Cq) this.A01;
            AnonymousClass7TE.A1Z(new MFS(r3, (AnonymousClass4D7) null, 8), r3);
            return;
        }
        W2M w2m = (W2M) this.A03;
        SQH.A01(w2m.A03.getParentFragmentManager());
        Reel reel = (Reel) this.A02;
        if (reel.A0O(w2m.A05).isEmpty()) {
            Context context = w2m.A02;
            C59689JTv.A03(context, context.getString(2131975944), "ReelMediaPreloader_unknown_error_occured", 0);
            return;
        }
        W2M.A01(((VM6) this.A01).A00, reel);
    }
}
