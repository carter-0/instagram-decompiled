package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.P2e  reason: case insensitive filesystem */
public final class C72339P2e implements C74394PuA {
    public final OVU A00;
    public final Context A01;
    public final UserSession A02;
    public final N4P A03;
    public final boolean A04;

    public C72339P2e(Context context, UserSession userSession, OVU ovu, N4P n4p, boolean z) {
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = n4p;
        this.A00 = ovu;
        this.A04 = z;
    }

    public final boolean isEnabled() {
        OLT olt = this.A00.A01;
        N4P n4p = this.A03;
        if (!n4p.A0v || !N4P.A04(this.A02, n4p) || olt == null || !AnonymousClass7TE.A1b(C51966G9m.A1J(olt.A04)) || this.A04) {
            return false;
        }
        return true;
    }

    public final List getItems() {
        int min;
        String str;
        String fullName;
        ArrayList A1C = AnonymousClass7TE.A1C();
        OVU ovu = this.A00;
        OLT olt = ovu.A01;
        N4P n4p = this.A03;
        UserSession userSession = this.A02;
        if (N4P.A04(userSession, n4p) && olt != null && AnonymousClass7TE.A1b(C51966G9m.A1J(olt.A04)) && !this.A04) {
            C46448DfA dfA = new C46448DfA(2131960230);
            Context context = this.A01;
            dfA.A0G = context.getString(2131960231);
            Drawable drawable = context.getDrawable(R.drawable.instagram_lock_icon_16);
            if (drawable != null) {
                dfA.A08 = drawable;
                dfA.A00 = DbV.A01(context);
                A1C.add(dfA);
                OLT olt2 = ovu.A01;
                if (olt2 == null) {
                    min = 0;
                } else {
                    min = Math.min(C51966G9m.A1J(olt2.A04).size(), 5);
                }
                AnonymousClass2f1 A002 = AnonymousClass2f1.A00(userSession);
                for (int i = 0; i < min; i++) {
                    User user = (User) Collections.unmodifiableList(olt.A04).get(i);
                    Object obj = olt.A03.get(user.getId());
                    if (A002.A0N(user) == FollowStatus.A05) {
                        str = context.getString(2131962634);
                    } else {
                        str = null;
                    }
                    0qQ.A0A(user);
                    String username = user.getUsername();
                    if (obj != null) {
                        fullName = DbW.A0h(context, obj, 2131972249);
                    } else {
                        fullName = user.getFullName();
                    }
                    A1C.add(new F06(user, username, fullName, str, ovu.A07.contains(user)));
                }
                int i2 = olt.A00;
                if (i2 > min) {
                    C49862FAc fAc = new C49862FAc((CharSequence) DbW.A0h(context, Integer.valueOf(i2), 2131972250), (View.OnClickListener) new C71395Oju(this, 20));
                    int color = context.getColor(2Yu.A0D(context));
                    boolean A022 = 0mk.A02(context);
                    int i3 = R.drawable.chevron_right;
                    if (A022) {
                        i3 = R.drawable.chevron_left;
                    }
                    Drawable drawable2 = context.getDrawable(i3);
                    if (drawable2 != null) {
                        fAc.A04 = drawable2;
                        fAc.A03 = color;
                        fAc.A01 = color;
                        A1C.add(fAc);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                int i4 = 2131972247;
                if (n4p.A0D()) {
                    i4 = 2131972245;
                }
                String A16 = AnonymousClass7TE.A16(context, i4);
                int i5 = 2131972248;
                if (n4p.A0D()) {
                    i5 = 2131972246;
                }
                C71026OZd A003 = C71026OZd.A00(userSession);
                C254793t3 r0 = n4p.A0L;
                0qQ.A0B(r0, 0);
                A1C.add(new C70661OFi(new C71395Oju(this, 19), A16, DbW.A0h(context, Integer.valueOf(A003.A02(C67350MmR.DEFAULT, 0, r0 instanceof MsysThreadId)), i5), context.getColor(2Yu.A03(context))));
                ovu.A01();
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        return A1C;
    }
}
