package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.SingletonImmutableSet;
import com.instagram.common.session.UserSession;

/* renamed from: X.ApT  reason: case insensitive filesystem */
public final class C41169ApT implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ C384889i3 A02;

    public C41169ApT(View view, ViewGroup viewGroup, C384889i3 r3) {
        this.A02 = r3;
        this.A01 = viewGroup;
        this.A00 = view;
    }

    public final void run() {
        AnonymousClass80Q r0;
        AnonymousClass80Q r3;
        C384889i3 r4 = this.A02;
        if (r4.mView != null) {
            AnonymousClass80D A002 = AnonymousClass80D.A00();
            C41837B2s b2s = r4.A02;
            b2s.getClass();
            A002.A0l = b2s;
            AnonymousClass0eM r1 = r4.A04;
            UserSession A0l = AnonymousClass7TE.A0l(r1);
            A0l.getClass();
            A002.A0S = A0l;
            Activity rootActivity = r4.getRootActivity();
            rootActivity.getClass();
            A002.A05 = rootActivity;
            A002.A0M = r4;
            0sl r5 = 0sl.A00;
            C3494180h r6 = C3494180h.A00;
            AnonymousClass80H r02 = new AnonymousClass80H(r5, new SingletonImmutableSet(r6));
            r02.getClass();
            A002.A0W = r02;
            A002.A3h = true;
            A002.A0R = r4.volumeKeyPressController;
            AnonymousClass80C r03 = r4.A01;
            r03.getClass();
            A002.A0t = r03;
            ViewGroup viewGroup = this.A01;
            viewGroup.getClass();
            A002.A09 = viewGroup;
            A002.A0B = 28D.A3f;
            A002.A0O = r4;
            A002.A3H = true;
            A002.A3t = false;
            A002.A3m = true;
            A002.A3s = false;
            A002.A44 = false;
            A002.A3L = false;
            A002.A3Q = false;
            A002.A3P = false;
            A002.A3i = true;
            A002.A3G = false;
            A002.A3j = false;
            A002.A36 = false;
            A002.A26 = 1;
            A002.A28 = AnonymousClass05K.A0u;
            A002.A0V = C358098aM.A00(r6, new C358088aL[0]);
            A002.A3T = AnonymousClass7TF.A1Z(r4.A03);
            r4.A00 = new AnonymousClass80Q(A002);
            if (182.A06(0Tu.A05, AnonymousClass7TF.A0L(r1, 0), 36320502608044544L) && (r3 = r4.A00) != null) {
                Context context = this.A00.getContext();
                int color = context.getColor(2Yu.A0B(context));
                C3497281m r2 = r3.A00.A1a;
                r2.A00().C3b().ESF(color);
                AnonymousClass8GF CrP = r2.A00().C3b().CrP();
                CrP.A02 = false;
                CrP.A00 = new C40302AZr(r3, 0);
                CrP.A00();
                r2.A00().EvM();
            }
            AnonymousClass80Q r04 = r4.A00;
            if (r04 != null) {
                C352888Fl r12 = r04.A00.A0l;
                if (C352888Fl.A02(r12).booleanValue()) {
                    r12.A1F.A00().A01(r12.A0T, r12.A1I, C366978pz.A0S);
                }
            }
            if (r4.isResumed() && (r0 = r4.A00) != null) {
                r0.A01();
            }
        }
    }
}
