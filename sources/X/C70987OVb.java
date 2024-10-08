package X;

import android.content.Context;
import android.content.res.Resources;
import android.transition.TransitionManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.OVb  reason: case insensitive filesystem */
public final class C70987OVb {
    public O64 A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final RecyclerView A05;
    public final RecyclerView A06;
    public final UserSession A07;
    public final Capabilities A08;
    public final C70436O6n A09;
    public final C70457O7i A0A;
    public final AnonymousClass7M7 A0B;
    public final C331897Sw A0C;
    public final String A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public /* synthetic */ C70987OVb(LinearLayout linearLayout, JV5 jv5, UserSession userSession, Capabilities capabilities, AnonymousClass7M7 r14, String str, boolean z, boolean z2, boolean z3) {
        C331897Sw r0 = C331897Sw.A0A;
        C331897Sw A002 = C331917Sy.A00(AnonymousClass7TE.A0S(linearLayout));
        AnonymousClass7TF.A1E(capabilities, 2, jv5);
        0qQ.A0B(A002, 10);
        this.A07 = userSession;
        this.A08 = capabilities;
        this.A0B = r14;
        this.A01 = linearLayout;
        this.A0F = z;
        this.A0D = str;
        this.A0E = z2;
        this.A0G = z3;
        this.A0C = A002;
        RecyclerView A0c = JTR.A0c(linearLayout, R.id.direct_powerups_recycler_view);
        this.A06 = A0c;
        this.A04 = AnonymousClass7TG.A0R(linearLayout, R.id.powerups_section_header);
        this.A02 = AnonymousClass7TG.A0R(linearLayout, R.id.avatar_powerups_section_header);
        Context A0S = AnonymousClass7TE.A0S(A0c);
        C70457O7i o7i = new C70457O7i(A0S, new C70435O6m(this), AnonymousClass9HC.A1b.A00(this.A07, capabilities));
        A0c.setAdapter(o7i.A00);
        this.A0A = o7i;
        C70436O6n o6n = new C70436O6n(this);
        this.A09 = o6n;
        DbV.A1A(A0S, A0c);
        A0c.setItemAnimator((AnonymousClass3AS) null);
        int dimensionPixelSize = A0c.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        A0c.A11(new AnonymousClass3V7(dimensionPixelSize, dimensionPixelSize));
        A0c.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        if (z2) {
            RecyclerView A0I = DbT.A0I(linearLayout, R.id.avatar_powerups_recycler_view);
            this.A05 = A0I;
            Context context = A0I.getContext();
            DbV.A1A(context, A0I);
            A0I.setItemAnimator((AnonymousClass3AS) null);
            Resources resources = A0I.getResources();
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
            JTP.A1D(A0I, AnonymousClass7TE.A0D(resources), 0);
            A0I.setPadding(0, 0, 0, dimensionPixelSize2);
            UserSession userSession2 = this.A07;
            0qQ.A07(context);
            O64 o64 = new O64(context, new C66093MBb(this, 4), userSession2, this.A0F);
            A0I.setAdapter(o64.A00);
            this.A00 = o64;
        } else {
            this.A05 = null;
        }
        TextView A0G2 = DbU.A0G(linearLayout, R.id.direct_powerups_nux);
        this.A03 = A0G2;
        1Av A003 = 1Au.A00(userSession);
        0qQ.A0B(A003, 0);
        0xa r3 = A003.A01;
        if (!r3.getBoolean(C273654mx.A00(2261), false) && r3.getInt("direct_power_ups_nux_seen_count", 0) < 3) {
            A0G2.setVisibility(0);
            AnonymousClass7TG.A1L(r3.AR4(), r3, "direct_power_ups_nux_seen_count", 0);
        }
        r14.A02.add(o6n);
        A01((JV5) null, jv5);
    }

    public static final void A00(C70987OVb oVb) {
        Set set = AnonymousClass5FV.A03;
        ArrayList A0r = AnonymousClass7TG.A0r(set);
        Iterator it = set.iterator();
        while (true) {
            C70987OVb oVb2 = oVb;
            if (it.hasNext()) {
                AnonymousClass5FV r1 = (AnonymousClass5FV) it.next();
                AnonymousClass9HC A002 = AnonymousClass9HC.A1b.A00(oVb2.A07, oVb2.A08);
                AnonymousClass7L2 r5 = oVb2.A0B.A00;
                String str = oVb2.A0D;
                boolean A1Z = C66581MXm.A1Z(r1);
                String obj = r1.toString();
                2FW r70 = 2FW.A1g;
                AnonymousClass7FE r81 = new AnonymousClass7FE(A002, r5, r70, AnonymousClass0eN.A01(C73788Pjn.A00), A1Z, A1Z, A1Z, A1Z, A1Z, A1Z);
                MessageIdentifier messageIdentifier = new MessageIdentifier(obj, obj);
                long currentTimeMillis = System.currentTimeMillis();
                boolean z = A1Z;
                A0r.add(new NYG(new AnonymousClass79c(r1, new AnonymousClass7FT((C61063Jw1) null, new AnonymousClass7FR((GifUrlImpl) null, (Integer) null, "", "", (String) null, (String) null, (String) null, (String) null, (List) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z), C327627Bo.NUX_TYPE_NONE, r70, messageIdentifier, (MessageIdentifier) null, (List) null, currentTimeMillis, A1Z, A1Z, A1Z, true, A1Z), r81, str, (String) null, z, z, z, z), obj));
            } else {
                C70457O7i o7i = oVb2.A0A;
                ViewModelListUpdate A0R = DbS.A0R();
                A0R.A01(A0r);
                o7i.A00.A05(A0R);
                oVb2.A06.A0o(0);
                return;
            }
        }
    }

    public final void A01(JV5 jv5, JV5 jv52) {
        Object obj;
        RecyclerView recyclerView;
        int i;
        Object obj2 = null;
        JV5 jv53 = jv5;
        if (jv5 != null) {
            obj = jv53.A00;
        } else {
            obj = null;
        }
        JV5 jv54 = jv52;
        boolean A0K = 0qQ.A0K(obj, jv54.A00);
        if (!A0K) {
            A00(this);
        }
        if (jv5 != null) {
            obj2 = jv53.A03;
        }
        List<C61008Jv7> list = (List) jv54.A03;
        if (!0qQ.A0K(obj2, list)) {
            RecyclerView recyclerView2 = this.A05;
            O64 o64 = this.A00;
            String str = this.A0D;
            Capabilities capabilities = this.A08;
            if (!(recyclerView2 == null || o64 == null)) {
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                for (C61008Jv7 jv7 : list) {
                    AnonymousClass9HC A002 = AnonymousClass9HC.A1b.A00(this.A07, capabilities);
                    AnonymousClass7L2 r9 = this.A0B.A00;
                    boolean A1Z = C66581MXm.A1Z(jv7);
                    AnonymousClass5FV r4 = (AnonymousClass5FV) jv7.A04;
                    String obj3 = r4.toString();
                    2FW r77 = 2FW.A1g;
                    A0r.add(new C71972Otx(jv7, new AnonymousClass79c(r4, new AnonymousClass7FT((C61063Jw1) null, new AnonymousClass7FR((GifUrlImpl) null, (Integer) null, "", "", (String) null, (String) null, (String) null, (String) null, (List) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z, A1Z), C327627Bo.NUX_TYPE_NONE, r77, new MessageIdentifier(obj3, obj3), (MessageIdentifier) null, (List) null, System.currentTimeMillis(), A1Z, A1Z, A1Z, true, A1Z), new AnonymousClass7FE(A002, r9, r77, AnonymousClass0eN.A01(C73714Pib.A00), A1Z, A1Z, A1Z, A1Z, A1Z, A1Z), str, (String) null, A1Z, A1Z, A1Z, A1Z), obj3));
                }
                ViewModelListUpdate A0R = DbS.A0R();
                A0R.A01(A0r);
                o64.A00.A05(A0R);
                recyclerView2.A0o(0);
            }
        }
        boolean z = jv54.A01;
        int i2 = 0;
        this.A06.setVisibility(DbW.A01(z ? 1 : 0));
        LinearLayout linearLayout = this.A01;
        linearLayout.setVisibility(DbW.A01(z));
        TextView textView = this.A04;
        if (!z || !this.A0G) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        boolean z2 = true;
        if (!z || !AnonymousClass7TE.A1b(list)) {
            z2 = false;
        }
        TransitionManager.beginDelayedTransition(linearLayout);
        if (!z2 || !this.A0E) {
            recyclerView = this.A05;
            i = 8;
        } else {
            recyclerView = this.A05;
            i = 0;
        }
        if (recyclerView != null) {
            recyclerView.setVisibility(i);
        }
        this.A02.setVisibility(i);
    }
}
