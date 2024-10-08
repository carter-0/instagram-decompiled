package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.LTz  reason: case insensitive filesystem */
public final class C64209LTz implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C64209LTz(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        String str;
        switch (this.A00) {
            case 0:
                JTU.A1J(C62453Kg3.CANCEL, (1IX) this.A01);
                return;
            case 1:
                ((C359448cq) this.A02).A06.A1N((C59725JVj) this.A01, (Boolean) null, "PANAVIDEO_NOTIFICATION_CANCEL");
                return;
            case 2:
                ((C359448cq) this.A02).A06.A1N((C59725JVj) this.A01, AnonymousClass7TE.A0v(), "PANAVIDEO_NOTIFICATION_CANCEL");
                return;
            case 3:
                C71153OeR.A0O((C71153OeR) this.A01, "direct_request_allow_dialog_cancel", (List) this.A02);
                return;
            case 4:
                return;
            case 5:
                C59844JaK.A00((C59844JaK) this.A02).A06((L2R) ((C61083JwL) this.A01).A00);
                return;
            case 6:
                T8N.A02((FragmentActivity) this.A02, (T8N) this.A01);
                return;
            default:
                C60310JjB jjB = (C60310JjB) ((C64705Lgb) this.A02).A08.getValue();
                C270194gL r0 = ((C62397Kf8) ((C62902KoG) this.A01)).A00.A0c;
                if (r0 != null) {
                    str = r0.A0X;
                    str.getClass();
                } else {
                    str = null;
                }
                jjB.A03(str);
                MG2.A01(jjB, C318116oQ.A00(jjB), 6);
                return;
        }
    }
}
