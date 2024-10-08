package X;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Uhl  reason: case insensitive filesystem */
public final class C15740Uhl extends C232222tE {
    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        WSI wsi = (WSI) r5;
        C14886UDo uDo = (C14886UDo) r6;
        AnonymousClass7TG.A1N(wsi, uDo);
        JTQ.A0A(uDo.A04).setText(wsi.A00.A03);
        VGM.A00(uDo, wsi);
        Handler handler = uDo.A01;
        handler.removeCallbacksAndMessages((Object) null);
        C20249Wno wno = new C20249Wno(uDo, wsi);
        uDo.A00 = wno;
        handler.postDelayed(wno, 1000);
    }

    public final Class modelClass() {
        return WSI.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        return new C14886UDo(DbU.A09(DbV.A0D(viewGroup), viewGroup, R.layout.incentive_simple_banner_layout, false));
    }
}
