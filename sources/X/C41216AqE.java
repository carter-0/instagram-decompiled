package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;

/* renamed from: X.AqE  reason: case insensitive filesystem */
public final class C41216AqE implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C61400K5u A03;

    public C41216AqE(Activity activity, View view, View view2, C61400K5u k5u) {
        this.A03 = k5u;
        this.A02 = view;
        this.A00 = activity;
        this.A01 = view2;
    }

    public final void run() {
        C61400K5u k5u = this.A03;
        View view = this.A02;
        C66580MXl.A1R(view);
        ViewGroup viewGroup = (ViewGroup) view;
        28D serializable = k5u.requireArguments().getSerializable(AnonymousClass000.A00(96));
        if (serializable == null) {
            serializable = 28D.A14;
        }
        AnonymousClass2k2 r10 = new AnonymousClass2k2();
        AnonymousClass80C r8 = new AnonymousClass80C();
        Activity activity = this.A00;
        UserSession A0l = AnonymousClass7TE.A0l(k5u.A03);
        C65166LoV loV = new C65166LoV(this.A01);
        AnonymousClass7TF.A1F(viewGroup, 1, A0l);
        AnonymousClass80D r4 = new AnonymousClass80D();
        WUO wuo = new WUO(0);
        wuo.getClass();
        r4.A0l = wuo;
        r4.A0S = A0l;
        r4.A05 = activity;
        r4.A0M = k5u;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        C363138jC r1 = C363138jC.A00;
        linkedHashSet2.add(r1);
        AnonymousClass80H r0 = new AnonymousClass80H(linkedHashSet, linkedHashSet2);
        r0.getClass();
        r4.A0W = r0;
        r4.A3h = false;
        r4.A0R = r10;
        r8.getClass();
        r4.A0t = r8;
        r4.A09 = viewGroup;
        r4.A0B = serializable;
        r4.A0O = k5u;
        r4.A0f = null;
        r4.A0g = null;
        r4.A3N = false;
        r4.A47 = false;
        r4.A3M = false;
        r4.A3Q = false;
        r4.A3k = false;
        r4.A22 = true;
        r4.A3e = true;
        r4.A0V = C358098aM.A00(r1, new C358088aL[0]);
        r4.A1A = loV;
        k5u.A01 = new AnonymousClass80Q(r4);
    }
}
