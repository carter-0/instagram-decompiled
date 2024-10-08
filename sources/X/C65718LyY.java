package X;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.avatars.pokes.PokeReceiverView;

/* renamed from: X.LyY  reason: case insensitive filesystem */
public final class C65718LyY implements C295005nO {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C65718LyY(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void onFinish() {
        View view;
        View findViewById;
        switch (this.A00) {
            case 0:
                PokeReceiverView pokeReceiverView = (PokeReceiverView) this.A02;
                pokeReceiverView.removeView((View) this.A01);
                PokeReceiverView.A00(pokeReceiverView);
                return;
            case 2:
                Fragment fragment = ((C65770LzO) this.A01).A00.A09;
                if (!(fragment == null || (view = fragment.mView) == null || (findViewById = view.findViewById(R.id.gallery)) == null)) {
                    findViewById.setImportantForAccessibility(1);
                }
                ViewGroup viewGroup = ((K6K) this.A02).A07;
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                    return;
                }
                return;
            case 3:
                C71066Oal oal = (C71066Oal) this.A02;
                oal.A04 = false;
                oal.A07.setLayerType(0, (Paint) null);
                oal.A09.setLayerType(0, (Paint) null);
                ((C295005nO) this.A01).onFinish();
                return;
            case 4:
                C311686d5 r1 = (C311686d5) this.A02;
                ((C275794rx) this.A01).A0G.A00();
                if (r1 != null) {
                    r1.DYB();
                    return;
                }
                return;
            case 5:
                C60687JpY jpY = (C60687JpY) this.A02;
                M0U m0u = (M0U) this.A01;
                String str = m0u.A08;
                TextView textView = jpY.A08;
                textView.setText(m0u.A09);
                TextView textView2 = jpY.A07;
                textView2.setText(str);
                textView.setVisibility(0);
                textView2.setVisibility(0);
                textView.setTypeface(Typeface.DEFAULT);
                return;
            case 7:
                LBM lbm = (LBM) this.A02;
                lbm.A01.remove(this.A01);
                JTS.A1X(lbm.A0D, JTQ.A02(AnonymousClass7TE.A0c(lbm.A0A)));
                return;
            default:
                ((ViewGroup) this.A02).removeView((View) this.A01);
                return;
        }
    }
}
