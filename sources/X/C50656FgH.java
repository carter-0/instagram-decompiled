package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.FgH  reason: case insensitive filesystem */
public final class C50656FgH implements C3250670x {
    public final C3250770y A00 = C3250770y.OTHER;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C319866rM A02;
    public final /* synthetic */ List A03;

    public final String Aix() {
        return "generic";
    }

    public C50656FgH(Context context, C319866rM r3, List list) {
        this.A01 = context;
        this.A03 = list;
        this.A02 = r3;
    }

    public final String Air() {
        return AnonymousClass7TE.A16(this.A01, 2131966723);
    }

    public final C3250770y Aiv() {
        return this.A00;
    }

    public final /* synthetic */ Integer BEK() {
        return null;
    }

    public final /* synthetic */ boolean DP6() {
        return false;
    }

    public final void onClick() {
        C358248ab A0Y = DbS.A0Y(this.A01);
        List list = this.A03;
        CharSequence[] charSequenceArr = new CharSequence[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            charSequenceArr[i] = ((C3250670x) list.get(i)).Air();
        }
        A0Y.A0e(C50021FJg.A00(list, 1), charSequenceArr);
        A0Y.A0r(true);
        A0Y.A0s(true);
        A0Y.A0f(C50035FJu.A00);
        this.A02.CzY(A0Y);
    }
}
