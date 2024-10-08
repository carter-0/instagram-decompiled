package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;

/* renamed from: X.ApN  reason: case insensitive filesystem */
public final class C41163ApN implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass80G A01;
    public final /* synthetic */ C59962JcV A02;

    public C41163ApN(AnonymousClass80G r1, C59962JcV jcV, int i) {
        this.A02 = jcV;
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        C59962JcV jcV = this.A02;
        View requireViewById = jcV.requireView().getRootView().requireViewById(R.id.root);
        0qQ.A0C(requireViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) requireViewById;
        C3499582p r0 = jcV.A0F;
        if (r0 == null) {
            0qQ.A0F("cameraSession");
            throw AnonymousClass00P.createAndThrow();
        }
        28D r14 = r0.A01;
        AnonymousClass2k2 r12 = new AnonymousClass2k2();
        AnonymousClass80C r11 = new AnonymousClass80C();
        FragmentActivity requireActivity = jcV.requireActivity();
        UserSession A0C = jcV.A0C();
        C59963JcW A012 = C59962JcV.A01(jcV);
        AnonymousClass80G r9 = this.A01;
        int i = this.A00;
        AnonymousClass7TF.A1F(viewGroup, 1, A0C);
        0qQ.A0B(A012, 9);
        0qQ.A0B(r9, 10);
        AnonymousClass80D A002 = AnonymousClass80D.A00();
        WUO wuo = new WUO(1);
        wuo.getClass();
        A002.A0l = wuo;
        A002.A0S = A0C;
        A002.A05 = requireActivity;
        A002.A0M = jcV;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        C363138jC r1 = C363138jC.A00;
        linkedHashSet2.add(r1);
        AnonymousClass80H r02 = new AnonymousClass80H(linkedHashSet, linkedHashSet2);
        r02.getClass();
        A002.A0W = r02;
        A002.A3h = false;
        A002.A0R = r12;
        r11.getClass();
        A002.A0t = r11;
        A002.A09 = viewGroup;
        A002.A0B = r14;
        A002.A0O = jcV;
        A002.A0f = null;
        A002.A0g = null;
        A002.A3N = false;
        A002.A47 = false;
        A002.A3M = false;
        A002.A3Q = false;
        A002.A3k = false;
        A002.A22 = true;
        A002.A0V = C358098aM.A00(r1, new C358088aL[0]);
        A002.A1A = A012;
        A002.A0U = r9;
        A002.A29 = Integer.valueOf(i);
        AnonymousClass80Q r13 = new AnonymousClass80Q(A002);
        if (jcV.A0X.get()) {
            C59962JcV.A04(r13, jcV);
        }
        jcV.A0I = r13;
    }
}
