package X;

import android.app.Activity;
import android.graphics.RectF;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.reels.Reel;

/* renamed from: X.Upl  reason: case insensitive filesystem */
public final class C16160Upl extends AnonymousClass6UX {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16160Upl(Object obj, int i) {
        super((Activity) null, (C230222pE) null);
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean A07() {
        if (2 - this.A00 != 0) {
            return super.A07();
        }
        return true;
    }

    public final AnonymousClass6KT A08(Reel reel, C255773uh r5) {
        AnonymousClass6KT A002;
        switch (this.A00) {
            case 0:
                return AnonymousClass6KT.A02();
            case 1:
                0qQ.A0B(r5, 1);
                WT0 wt0 = (WT0) this.A01;
                if (wt0.A00) {
                    RectF rectF = (RectF) wt0.A02.get(r5.A0j);
                    if (rectF != null) {
                        A002 = AnonymousClass6KT.A03(rectF);
                    } else {
                        A002 = AnonymousClass6KT.A02();
                    }
                } else {
                    A002 = AnonymousClass6KT.A00();
                }
                0qQ.A0A(A002);
                return A002;
            default:
                return AnonymousClass6KT.A03((RectF) this.A01);
        }
    }

    public final void A09(Reel reel) {
    }

    public final void A0B(Reel reel, C255773uh r5) {
        switch (this.A00) {
            case 0:
                FragmentActivity activity = ((Fragment) this.A01).getActivity();
                if (activity != null) {
                    AnonymousClass2uJ.A01(activity);
                    return;
                }
                return;
            case 1:
                AnonymousClass7TG.A1N(reel, r5);
                super.A0B(reel, r5);
                ((WT0) this.A01).A01(r5.A0j, AnonymousClass05K.A01);
                return;
            default:
                super.A0B(reel, r5);
                return;
        }
    }

    public final void A0C(Reel reel, C255773uh r5) {
        if (1 - this.A00 == 0) {
            0qQ.A0B(r5, 1);
            if (r5.A11()) {
                ((WT0) this.A01).A02(r5.A0j, AnonymousClass05K.A01);
            }
        }
    }

    public final void A0A(Reel reel, C255773uh r2) {
    }
}
