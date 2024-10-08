package X;

import android.graphics.Rect;
import java.util.List;

/* renamed from: X.WaL  reason: case insensitive filesystem */
public final class C19473WaL implements C2802350v {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public String A05;

    public final /* synthetic */ List B5h() {
        return 0sn.A00;
    }

    public final Integer CAk() {
        return AnonymousClass05K.A00;
    }

    public C19473WaL(Rect rect, String str, String str2) {
        AnonymousClass7TG.A1U(str, str2, rect);
        this.A04 = str;
        this.A05 = str2;
        this.A01 = rect.left;
        this.A03 = rect.top;
        this.A02 = rect.right;
        this.A00 = rect.bottom;
    }

    public final C273914nO BkW() {
        C273914nO A0C = AnonymousClass7TH.A0C();
        A0C.A06 = AnonymousClass7TE.A1I(this.A04);
        return A0C;
    }

    public C19473WaL() {
        this.A04 = "";
        this.A05 = "";
    }
}
