package X;

import android.content.Context;
import android.widget.ListAdapter;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class K9B extends C331047Ph implements ListAdapter, CallerContextable {
    public static final String __redex_internal_original_name = "RecipientSearchAdapter";
    public C337257fy A00;
    public C61473K9e A01;
    public final int A02;
    public final UserSession A03;
    public final C63668L2e A04;
    public final C46437Dez A05;
    public final EAC A06;
    public final TwD A07 = new TwD();
    public final C17962Viv A08 = new Object();
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final Context A0C;
    public final L1L A0D;
    public final C47615EAb A0E;
    public final String A0F;
    public final boolean A0G;

    public static int A00(K9B k9b, List list, int i, int i2, boolean z) {
        int i3 = i2;
        Iterator it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            DirectShareTarget directShareTarget = (DirectShareTarget) it.next();
            UserSession userSession = k9b.A03;
            if (!C66651MaK.A02(userSession, directShareTarget) && !C66651MaK.A01(userSession, directShareTarget)) {
                Context context = k9b.A0C;
                int i5 = 2;
                if (k9b.A0G) {
                    i5 = i;
                }
                k9b.A08(k9b.A0E, FV6.A00(context, userSession, directShareTarget, k9b.A0F, i5, i3, i4, -1, k9b.A0D.A00.A0H.A07(directShareTarget), false, z, false));
                i3++;
                i4++;
            }
        }
        return i3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Viv, java.lang.Object] */
    public K9B(Context context, AnonymousClass0iw r11, UserSession userSession, L1H l1h, L1L l1l, DirectPrivateStoryRecipientController directPrivateStoryRecipientController, MVT mvt, MTF mtf, String str, boolean z, boolean z2) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A0C = context;
        this.A09 = context.getString(2131968486);
        this.A02 = context.getColor(R.color.grey_5);
        this.A0A = context.getString(2131972868);
        this.A03 = userSession;
        C61473K9e k9e = new C61473K9e(l1h);
        this.A01 = k9e;
        A1C.add(k9e);
        this.A0G = z;
        this.A0B = z2;
        C47615EAb eAb = new C47615EAb(r11, userSession, directPrivateStoryRecipientController, mvt, mtf);
        this.A0E = eAb;
        A1C.add(eAb);
        this.A04 = new C63668L2e(context.getString(2131971301));
        C46437Dez dez = new C46437Dez(context);
        this.A05 = dez;
        A1C.add(dez);
        EAC eac = new EAC(context, new C19707We9(this, 1));
        this.A06 = eac;
        A1C.add(eac);
        this.A0D = l1l;
        this.A0F = str;
        A0A(A1C);
    }
}
