package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: X.OkI  reason: case insensitive filesystem */
public final class C71417OkI implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C71417OkI(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final boolean onLongClick(View view) {
        if (this.A00 == 0) {
            return ((C67806MvA) this.A01).A02.DM6((C67569Mq3) this.A02);
        }
        NKG nkg = (NKG) this.A02;
        C355148Ov r5 = new C355148Ov(nkg.requireContext(), AnonymousClass7TE.A0l(nkg.A04), (Integer) null, false);
        C254703su r3 = (C254703su) this.A01;
        PHM phm = new PHM(0);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Calendar calendar = C14240TsN.A02;
        A1C.add(new C367618rI((Drawable) null, (Drawable) null, (C15048ULb) null, phm, (Integer) null, C69937Nud.A00(nkg.requireContext(), TimeUnit.SECONDS.toMillis(DbY.A04(r3.A1Q))), 0, 0, 0, false, false, false, false, true, false, false));
        C310336ap A0a = DbS.A0a();
        DbS.A19(nkg.requireContext(), A0a, 2131972677);
        A0a.A02();
        Drawable drawable = nkg.requireContext().getDrawable(R.drawable.instagram_circle_check_pano_outline_24);
        if (drawable != null) {
            A0a.A08(drawable, nkg.requireContext().getColor(2Yu.A05(nkg.requireContext())));
        }
        String A16 = AnonymousClass7TE.A16(nkg.requireContext(), 2131972676);
        String A162 = AnonymousClass7TE.A16(C66583MXo.A07(nkg, new C367618rI(nkg.requireContext().getDrawable(R.drawable.instagram_direct_pano_outline_24), (Drawable) null, (C15048ULb) null, new PHQ(0, nkg, r3, A0a), (Integer) null, A16, 0, 0, 0, false, false, false, true, false, false, false), A1C), 2131956744);
        Drawable drawable2 = C66583MXo.A07(nkg, new C367618rI(nkg.requireContext().getDrawable(R.drawable.instagram_copy_pano_outline_24), (Drawable) null, (C15048ULb) null, new IVI(4, (Object) r3, (Object) nkg), (Integer) null, A162, 0, 0, 0, false, false, false, true, false, false, false), A1C).getDrawable(R.drawable.instagram_delete_pano_outline_24);
        C310336ap A0a2 = DbS.A0a();
        DbS.A19(nkg.requireContext(), A0a2, 2131972670);
        A0a2.A02();
        if (drawable2 != null) {
            A0a2.A08(drawable2, nkg.requireContext().getColor(2Yu.A05(nkg.requireContext())));
        }
        OJa oJa = new OJa(nkg.requireActivity());
        String A163 = AnonymousClass7TE.A16(nkg.requireContext(), 2131972669);
        String A164 = AnonymousClass7TE.A16(nkg.requireContext(), 2131957531);
        A1C.add(new C367618rI(nkg.requireContext().getDrawable(R.drawable.instagram_delete_pano_outline_24), (Drawable) null, (C15048ULb) null, new PHS(r3, A0a2, oJa, nkg, A163, 0), Integer.valueOf(2Yu.A03(nkg.getContext())), A164, 0, 0, 0, false, true, false, true, false, false, false));
        r5.A02(A1C);
        View view2 = view;
        0qQ.A0A(view2);
        r5.A01(view2);
        return true;
    }
}
