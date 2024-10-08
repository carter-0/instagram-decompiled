package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.android.R;

/* renamed from: X.Fsr  reason: case insensitive filesystem */
public final class C51359Fsr implements Runnable {
    public final /* synthetic */ C314976j9 A00;
    public final /* synthetic */ C255773uh A01;

    public C51359Fsr(C314976j9 r1, C255773uh r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        C314976j9 r4 = this.A00;
        Context context = r4.A03;
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A0j(context.getDrawable(R.drawable.ig_illustrations_illo_story_highlight_add));
        A0Y.A09(2131972584);
        A0Y.A08(2131972583);
        C50025FJk.A01(A0Y, this.A01, r4, 19, 2131952258);
        A0Y.A0H((DialogInterface.OnClickListener) null, 2131968513);
        C50036FJv.A00(A0Y, r4, 0);
        DbT.A1V(A0Y);
        0xa r42 = r4.A06.A01;
        AnonymousClass7TG.A1M(r42, "exclusive_story_highlight_dialog_count", r42.getInt("exclusive_story_highlight_dialog_count", 0) + 1);
        long currentTimeMillis = System.currentTimeMillis();
        0xY AR4 = r42.AR4();
        AR4.E5c("exclusive_story_highlight_dialog_timestamp", currentTimeMillis);
        AR4.apply();
    }
}
