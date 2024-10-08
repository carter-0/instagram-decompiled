package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.7vV  reason: invalid class name and case insensitive filesystem */
public final class C346637vV implements C346647vW {
    public final int A00;
    public final IgdsMediaButton A01;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.5n1] */
    public final void EZN(Drawable drawable, String str) {
        0qQ.A0B(drawable, 0);
        IgdsMediaButton igdsMediaButton = this.A01;
        ? obj = new Object();
        obj.A01 = drawable;
        igdsMediaButton.setStartAddOn(obj, str);
    }

    public final void Ecw(C296245pk r2) {
        0qQ.A0B(r2, 0);
        this.A01.A01 = r2;
    }

    public final void Er0(C296255pl r2) {
        0qQ.A0B(r2, 0);
        this.A01.setWidthMode(r2);
    }

    public final void A8L(C62567Khx khx) {
        this.A01.setEndAddOn(C62567Khx.DOWN_CHEVRON);
    }

    public final IgdsMediaButton ACY() {
        return this.A01;
    }

    public final View ACh() {
        return this.A01;
    }

    public final int BEE() {
        return this.A00;
    }

    public final int BER() {
        int ordinal = this.A01.A01.ordinal();
        if (ordinal == 3) {
            return 38;
        }
        if (ordinal == 1 || ordinal != 4) {
            return 24;
        }
        return 20;
    }

    public final void ERY(0sP r2, 0sP r3) {
        C355098Oo.A02(this.A01, r2, r3);
    }

    public final void setEnabled(boolean z) {
        this.A01.setEnabled(z);
    }

    public final void setLabel(String str) {
        this.A01.setLabel(str);
    }

    public final void setVisibility(int i) {
        this.A01.setVisibility(i);
    }

    public C346637vV(Context context, UserSession userSession, C296265pm r7) {
        IgdsMediaButton A002 = AnonymousClass8PT.A00(context, (Integer) null);
        if (r7 != null && 182.A06(0Tu.A05, userSession, 36319901312425678L)) {
            A002.setSegmentedButtonStyle(r7);
        }
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36319901312425678L) && 182.A06(r2, userSession, 36319901313277654L)) {
            A002.setSize(C296245pk.MEDIUM);
        }
        this.A01 = A002;
        this.A00 = A002.A01 == C296245pk.MEDIUM ? 20 : 24;
    }
}
