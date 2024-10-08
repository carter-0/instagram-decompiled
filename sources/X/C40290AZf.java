package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.AZf  reason: case insensitive filesystem */
public final class C40290AZf implements MXG {
    public static final String __redex_internal_original_name = "CountdownStickerListController";
    public RecyclerView A00;
    public boolean A01;
    public final ViewStub A02;
    public final WWM A03;
    public final Set A04 = AnonymousClass7TE.A1F();

    public C40290AZf(Activity activity, ViewStub viewStub, AnonymousClass07i r9, UserSession userSession, AnonymousClass8MO r11, String str) {
        AnonymousClass7TF.A1D(r9, 2, viewStub);
        0qQ.A0B(str, 7);
        this.A03 = new WWM(activity, r9, userSession, r11, str);
        this.A02 = viewStub;
    }

    public final /* synthetic */ void Cw3() {
    }

    public final /* synthetic */ void Dfq() {
    }

    public final /* synthetic */ void close() {
    }

    public final Set Acf() {
        return this.A04;
    }

    public final /* synthetic */ boolean CII() {
        return false;
    }

    public final void E0h() {
        if (!this.A01) {
            View inflate = this.A02.inflate();
            Set set = this.A04;
            0qQ.A0A(inflate);
            set.add(inflate);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.countdown_sticker_list);
            this.A00 = recyclerView;
            WWM wwm = this.A03;
            if (recyclerView == null) {
                0qQ.A0F("countdownStickerList");
                throw AnonymousClass00P.createAndThrow();
            } else {
                wwm.A00(recyclerView);
                this.A01 = true;
            }
        }
        this.A03.A04.A00(true);
    }

    public final String getModuleName() {
        return "countdown-sticker-list";
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return false;
    }
}
