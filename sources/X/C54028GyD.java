package X;

import android.animation.Animator;
import android.util.LruCache;
import android.util.Pair;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GyD  reason: case insensitive filesystem */
public final class C54028GyD extends AnonymousClass59L {
    public final void A04(AnonymousClass6L7 r8, GZ1 gz1) {
        setKeyframes(this.A0J, gz1.A00, gz1.A02, this, this);
        this.A02 = new Pair(r8, gz1);
        A03(r8);
        A01();
    }

    public final void setShowreelAnimation(UserSession userSession, List list, C255773uh r13, AnonymousClass6L7 r14, AnonymousClass6LO r15) {
        C51974G9v.A1K(userSession, list, r14);
        C67671vk.A01.A00 = userSession;
        AnonymousClass6LO r3 = r15;
        setShowreelAnimation(r14, r3, (String) null, list, r13, Boolean.valueOf(this.A0H.CPR()), (Animator.AnimatorListener) null, (AnonymousClass9J6) null);
    }

    public final void A01() {
        AnonymousClass6L7 r3 = this.A05;
        if (r3 != null) {
            try {
                XFZ drawableProvider = getDrawableProvider();
                C52507GVk gVk = (C52507GVk) r3;
                String str = gVk.A05;
                if (str == null) {
                    str = "";
                }
                String str2 = gVk.A04;
                if (str2 == null) {
                    str2 = "";
                }
                try {
                    Q1l q1l = new Q1l(str, str2, (String) null, r3.Ack(), r3.Acm());
                    LruCache lruCache = ((C7271Q1v) ((AnonymousClass6OE) drawableProvider.A00).A04).A00;
                    if (lruCache != null) {
                        lruCache.remove(C51969G9p.A0q(q1l));
                    }
                } catch (HP0 unused) {
                }
                GZ1 A00 = A00(r3);
                if (A00 != null) {
                    Iterator A0v = AnonymousClass7TF.A0v(A00.A01);
                    while (A0v.hasNext()) {
                        try {
                            Q1l q1l2 = new Q1l(((C55590HkA) A0v.next()).A01, str2, (String) null, r3.Ack(), r3.Acm());
                            LruCache lruCache2 = ((C7271Q1v) ((AnonymousClass6OE) drawableProvider.A00).A04).A00;
                            if (lruCache2 != null) {
                                lruCache2.remove(C51969G9p.A0q(q1l2));
                            }
                        } catch (HP0 unused2) {
                        }
                    }
                }
            } catch (AnonymousClass92D unused3) {
                A06("ShowreelNotInitializedException", "Failed to get drawable provider");
            }
        }
    }
}
