package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.HFw  reason: case insensitive filesystem */
public final class C54490HFw extends C2806552w {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54490HFw(H0F h0f, int i) {
        super(Integer.valueOf(i));
        this.A00 = 1;
        this.A01 = h0f;
    }

    public final void onClick(View view) {
        Fragment fragment;
        AnonymousClass6W8 r1;
        String str;
        switch (this.A00) {
            case 1:
                fragment = (H0F) this.A01;
                Bundle A0a = AnonymousClass7TE.A0a();
                r1 = DbV.A0Y(fragment.getActivity(), A0a, DbT.A0X(fragment.A03), ModalActivity.class, C273654mx.A00(2349));
                break;
            case 4:
                fragment = (C54140H0k) this.A01;
                HOV hov = fragment.A00;
                if (hov != null) {
                    AnonymousClass0eM r12 = fragment.A08;
                    UserSession A0l = AnonymousClass7TE.A0l(r12);
                    1Xj r10 = fragment.A02;
                    if (r10 != null) {
                        0qQ.A0B(A0l, 1);
                        C55209Hdz.A00(hov, fragment, A0l, r10, AnonymousClass05K.A15, (String) null, AnonymousClass7TE.A1H());
                        Bundle A012 = C46447Df9.A02().A01(AnonymousClass7TE.A0l(r12), C46474Dfc.A01(AnonymousClass7TE.A0l(r12), "21378697918", "world_pages", C54140H0k.__redex_internal_original_name));
                        r1 = DbS.A0b(fragment.getActivity(), A012, DbT.A0X(r12), ModalActivity.class, "profile");
                        break;
                    } else {
                        str = "entryMedia";
                    }
                } else {
                    str = "entrySurface";
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            default:
                DbS.A1U(this.A01);
                return;
        }
        r1.A0C(fragment.getActivity());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54490HFw(C62320sa r2, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = r2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54490HFw(C54140H0k h0k, Integer num) {
        super(num);
        this.A00 = 4;
        this.A01 = h0k;
    }
}
