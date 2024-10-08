package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.UgZ  reason: case insensitive filesystem */
public final class C15668UgZ extends C14097Tpp {
    public final C307786Rm A00;
    public final C276544tV A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15668UgZ(C307786Rm r2, C276544tV r3) {
        super(r2, r3);
        0qQ.A0B(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public static final void A00(View view, C307786Rm r9, C276544tV r10) {
        0qQ.A0B(r9, 1);
        C19231WQm wQm = (C19231WQm) C307476Qg.A06(r9, r10);
        if (wQm != null) {
            C17534VZn vZn = new C17534VZn(view);
            if (C308206Td.A00(r9).mView != null) {
                AnonymousClass07Z viewLifecycleOwner = C308206Td.A00(r9).getViewLifecycleOwner();
                View requireViewById = vZn.A00.requireViewById(R.id.cta_container);
                if (requireViewById != null) {
                    if (wQm.A08) {
                        requireViewById.setVisibility(8);
                    } else {
                        U90 u90 = wQm.A06;
                        DbV.A1F(viewLifecycleOwner, u90.A02, new C59104J6m(34, (Object) vZn, (Object) requireViewById, (Object) wQm), 45);
                        AnonymousClass11O.A03(AnonymousClass07a.A00(viewLifecycleOwner), new C61860pz(new C66186MGx(wQm, (AnonymousClass4D7) null, 16), u90.A0E));
                    }
                }
            }
            C308206Td.A0I(r9, wQm);
        }
    }

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        return A0J(context);
    }
}
