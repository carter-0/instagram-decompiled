package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WeX  reason: case insensitive filesystem */
public final class C19730WeX implements C74372Ptm {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public FixedTabBar A04;
    public final Context A05;
    public final List A06 = new ArrayList();
    public final AnonymousClass0iw A07;
    public final UserSession A08;
    public final C51875G5m A09;

    public C19730WeX(Context context, AnonymousClass0iw r3, UserSession userSession, C51875G5m g5m) {
        0qQ.A0B(userSession, 3);
        this.A09 = g5m;
        this.A05 = context;
        this.A08 = userSession;
        this.A07 = r3;
    }

    public final void A01(List list) {
        0qQ.A0B(list, 0);
        List list2 = this.A06;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ReelStore A052 = 1OP.A05(this.A08);
            AnonymousClass3HX r0 = ((C17926ViH) it.next()).A07;
            if (r0 != null) {
                list2.add(A052.A0I(r0, false));
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    public final void setMode(int i) {
    }

    public final void A00() {
        String str;
        FixedTabBar fixedTabBar = this.A04;
        if (fixedTabBar == null) {
            str = "fixedTabBar";
        } else {
            Iterator it = fixedTabBar.A07.iterator();
            while (it.hasNext()) {
                JTO.A0H(it).setSelected(false);
            }
            View view = this.A00;
            if (view == null) {
                str = "hintView";
            } else {
                Object tag = view.getTag();
                if (tag != null) {
                    V3B v3b = (V3B) tag;
                    0qQ.A0B(v3b, 0);
                    TextView textView = v3b.A00;
                    DbU.A1A(DbU.A05(textView), textView, 2131969730);
                    UserSession userSession = this.A08;
                    AnonymousClass0iw r2 = this.A07;
                    View view2 = this.A01;
                    if (view2 == null) {
                        str = "reelPreviewLeft";
                    } else {
                        Object tag2 = view2.getTag();
                        if (tag2 != null) {
                            List list = this.A06;
                            C51875G5m g5m = this.A09;
                            C48937Emb.A00(r2, userSession, g5m, (C50901Fkg) tag2, (Reel) list.get(0), list, true);
                            View view3 = this.A02;
                            if (view3 == null) {
                                str = "reelPreviewRight";
                            } else {
                                Object tag3 = view3.getTag();
                                if (tag3 != null) {
                                    C48937Emb.A00(r2, userSession, g5m, (C50901Fkg) tag3, (Reel) list.get(1), list, true);
                                    return;
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
