package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;

/* renamed from: X.VoG  reason: case insensitive filesystem */
public abstract class C18249VoG {
    public static final FrameLayout A00(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.shops_data_signifier, viewGroup, false);
        0qQ.A0C(inflate, C273654mx.A00(2));
        FrameLayout frameLayout = (FrameLayout) inflate;
        C273694n2 r1 = new C273694n2(context);
        frameLayout.addView(r1);
        frameLayout.setTag(new VYT(frameLayout, r1));
        return frameLayout;
    }

    public static final void A01(C229382nI r1, C3034368u r2, VYT vyt) {
        AnonymousClass7TG.A1O(r2, r1);
        if (vyt != null && vyt.A01 != r2) {
            vyt.A01 = r2;
            AnonymousClass6NS r0 = vyt.A00;
            if (r0 != null) {
                r0.A04();
            }
            AnonymousClass6NS A00 = AnonymousClass6NS.A00(vyt.A02.getContext(), r2, r1).A00();
            vyt.A00 = A00;
            A00.A07(vyt.A03);
        }
    }
}
