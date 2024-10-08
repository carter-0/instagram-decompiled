package X;

import android.view.View;
import com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData;

/* renamed from: X.PbJ  reason: case insensitive filesystem */
public final /* synthetic */ class C73360PbJ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C71870OsD A02;
    public final /* synthetic */ C355148Ov A03;

    public /* synthetic */ C73360PbJ(View view, C71870OsD osD, C355148Ov r3, int i) {
        this.A02 = osD;
        this.A03 = r3;
        this.A01 = view;
        this.A00 = i;
    }

    public final void run() {
        C71870OsD osD = this.A02;
        C355148Ov r5 = this.A03;
        View view = this.A01;
        int i = this.A00;
        if (!osD.A0I && !osD.A0O.isFinishing()) {
            for (LongPressActionData longPressActionData : osD.A0S.A0L) {
                if (longPressActionData.A03 == AnonymousClass05K.A0P && longPressActionData.A01.A04) {
                    0xa A0q = AnonymousClass7TE.A0q(osD.A0P);
                    AnonymousClass7TG.A1L(A0q.AR4(), A0q, "direct_message_translation_badge_nux_seen_count", 0);
                }
            }
            r5.showAtLocation(view, i | 48, osD.A01, osD.A02);
        }
    }
}
