package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawWithCacheElement;

/* renamed from: X.JHn  reason: case insensitive filesystem */
public final class C59386JHn extends 0Yg implements 0sK {
    public static final C59386JHn A00 = new C59386JHn();

    public C59386JHn() {
        super(3);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) obj;
        C286575Wy A0R = C51966G9m.A0R(obj2, obj3);
        if (C51967G9n.A1U(A0R, -2126899193)) {
            0fL.A01(-15653284, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:87)");
        }
        long j = ((C56070HsJ) A0R.AJO(C55373Hgf.A01)).A01;
        C285245Qk r4 = Modifier.A00;
        boolean AGt = A0R.AGt(j);
        Object ECw = A0R.ECw();
        if (AGt || ECw == AnonymousClass5XT.A00) {
            ECw = new GQ2(j, 0);
            A0R.FLL(ECw);
        }
        Modifier Ezh = modifier.Ezh(r4.Ezh(new DrawWithCacheElement((0sP) ECw)));
        if (0fL.A02()) {
            0fL.A00(1924332122);
        }
        C51965G9l.A1V(A0R);
        return Ezh;
    }
}
