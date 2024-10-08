package X;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.facebookpay.msc.logging.LoggingData;

public final class R9D extends C14097Tpp {
    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r17, C276544tV r18, Object obj) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        C307786Rm r14 = r17;
        C276544tV r10 = r18;
        AnonymousClass7TG.A1O(r14, r10);
        Object A06 = C307476Qg.A06(r14, r10);
        if (A06 != null) {
            C10165Rng rng = (C10165Rng) A06;
            if (rng.A00 == null) {
                String A0D = r10.A0D();
                String A01 = C2818159r.A01();
                String A0F = r10.A0F();
                if (A0F != null) {
                    A01 = A0F;
                }
                String A0H = r10.A0H();
                QDO qdo = new QDO();
                Fragment A00 = C308206Td.A00(r14);
                qdo.A03(Q21.A00(JTQ.A1b("parent_view_name", A0H, AnonymousClass7TE.A1L("logging_data", new LoggingData(A01)))));
                A00.mLifecycleRegistry.A09(qdo);
                SparseArray A002 = C9636ReG.A00();
                Object su9 = new C12425Su9(A002, 0);
                Object obj2 = A002.get(33);
                if (obj2 != null) {
                    su9 = obj2;
                }
                qdo.A04(new 2Fk(A0D));
                qdo.A06.A06(A00, new C11641Sdj(0, r10, su9, qdo, view2, r14));
                C11649Sdr.A01(A00, qdo.A08, 8);
                rng.A00 = qdo;
            }
            return null;
        }
        throw AnonymousClass7TE.A0z("A controller was defined for this component but none was found.");
    }

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(JTS.A0D());
        return frameLayout;
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r2, C276544tV r3, Object obj, Object obj2) {
    }
}
