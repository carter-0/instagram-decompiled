package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.7QH  reason: invalid class name */
public final class AnonymousClass7QH implements AnonymousClass7QI {
    public AnonymousClass7QL A00;
    public W1V A01;
    public final long A02;
    public final Context A03;
    public final AnonymousClass7QJ A04 = new AnonymousClass7QJ(this);
    public final UserSession A05;

    public final void ABi(C17415VUu vUu, Integer num, String str) {
        WH6 wh6;
        char c;
        0qQ.A0B(num, 1);
        W1V w1v = this.A01;
        if (w1v != null) {
            wh6 = new WH6(w1v);
        } else {
            wh6 = null;
        }
        AnonymousClass4OI A002 = V6Q.A00(wh6, vUu, str);
        switch (num.intValue()) {
            case 0:
                c = 0;
                break;
            case 1:
                c = 1;
                break;
            default:
                c = 2;
                break;
        }
        Integer num2 = AnonymousClass05K.A00(3)[c];
        0qQ.A07(num2);
        C59721JVf jVf = new C59721JVf(A002, num2);
        W1V w1v2 = this.A01;
        if (w1v2 != null) {
            w1v2.A04(jVf);
        }
    }

    public final void A00() {
        W1V w1v = this.A01;
        if (w1v != null) {
            w1v.A0D[w1v.A00 % 2].A08.A0F((String) null);
        }
    }

    public final void A01() {
        ViewGroup viewGroup;
        W1V w1v = this.A01;
        if (w1v != null) {
            FrameLayout frameLayout = w1v.A09;
            ViewParent parent = frameLayout.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                viewGroup.removeView(frameLayout);
            }
        }
        W1V w1v2 = this.A01;
        if (w1v2 != null) {
            AnonymousClass7QJ r1 = this.A04;
            0qQ.A0B(r1, 0);
            w1v2.A0A.remove(r1);
        }
        W1V w1v3 = this.A01;
        if (w1v3 != null) {
            w1v3.A03();
        }
    }

    public final void A02(ViewGroup viewGroup) {
        W1V w1v = this.A01;
        if (w1v != null) {
            FrameLayout frameLayout = w1v.A09;
            if (!0qQ.A0K(frameLayout.getParent(), viewGroup)) {
                viewGroup.addView(frameLayout);
                W1V.A01(w1v, w1v.A00 % 2);
            }
        }
        W1V w1v2 = this.A01;
        if (w1v2 != null) {
            w1v2.A0D[w1v2.A00 % 2].A00();
        }
    }

    public final C60914JtY BGx() {
        long A09;
        int size;
        W1V w1v = this.A01;
        if (w1v == null) {
            A09 = -1;
            size = -1;
        } else {
            A09 = w1v.A0D[w1v.A00 % 2].A08.A09() - w1v.A0D[w1v.A00 % 2].A08.A08();
            size = w1v.A0B.size();
        }
        return new C60914JtY(size, A09, 0);
    }

    public final void E3h(C17415VUu vUu) {
        String str = vUu.A02;
        1wS A012 = 1wS.A01(this.A05);
        0qQ.A07(A012);
        C271394im r2 = new C271394im(AnonymousClass05K.A00, str);
        String str2 = vUu.A00;
        if (str2.length() <= 0) {
            str2 = vUu.A01;
            if (str2.length() == 0) {
                str2 = "";
            }
        }
        r2.A0B = str2;
        A012.A0E(new C256203vO(r2.A00(), "IgAiAgentVideoPlayer"));
    }

    public AnonymousClass7QH(Context context, UserSession userSession, long j) {
        this.A03 = context;
        this.A05 = userSession;
        this.A02 = j;
    }
}
