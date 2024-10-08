package X;

import android.view.View;
import android.widget.CompoundButton;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;

public final class PMA implements C74361Ptb {
    public final View A00;
    public final OA8 A01;
    public final AnonymousClass0eM A02 = C73922Pm2.A01(this, 38);
    public final AnonymousClass0eM A03 = C73922Pm2.A01(this, 39);
    public final AnonymousClass0eM A04 = C73922Pm2.A01(this, 40);
    public final AnonymousClass0eM A05 = C73922Pm2.A01(this, 41);
    public final AnonymousClass0eM A06 = C73922Pm2.A01(this, 42);

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.PR9] */
    public final /* bridge */ /* synthetic */ void ADN(C74270Pry pry) {
        N9Y n9y = (N9Y) pry;
        0qQ.A0B(n9y, 0);
        if (n9y.A07) {
            JTO.A0I(this.A03).setText(n9y.A00);
            DbW.A1R(this.A05, 0);
            ViewModelListUpdate A0R = DbS.A0R();
            if (n9y.A08) {
                PR9 pr9 = new PR9((CompoundButton.OnCheckedChangeListener) new C71469OlD(this, 32), 2131972441, n9y.A03);
                pr9.A03 = R.drawable.instagram_audio_crunchy_pano_outline_24;
                A0R.A00(new N5W(pr9));
            }
            if (n9y.A09) {
                PR9 pr92 = new PR9((CompoundButton.OnCheckedChangeListener) new C71469OlD(this, 29), 2131972442, n9y.A04);
                pr92.A03 = R.drawable.instagram_audio_enhance_pano_outline_24;
                A0R.A00(new N5W(pr92));
            }
            if (n9y.A0B) {
                PR9 pr93 = new PR9((CompoundButton.OnCheckedChangeListener) new C71469OlD(this, 31), 2131972443, n9y.A06);
                pr93.A03 = R.drawable.instagram_hd_pano_outline_24;
                A0R.A00(new N5W(pr93));
            }
            if (n9y.A0A) {
                boolean z = n9y.A05;
                C71469OlD olD = new C71469OlD(this, 30);
                ? obj = new Object();
                obj.A04 = 2131954492;
                obj.A01 = 2131954491;
                obj.A0D = z;
                obj.A08 = olD;
                obj.A03 = R.drawable.instagram_closed_captions_enabled_pano_outline_24;
                A0R.A00(new N5W(obj));
            }
            ((AnonymousClass2t9) this.A04.getValue()).A05(A0R);
        }
    }

    public PMA(View view, OA8 oa8) {
        this.A00 = view;
        this.A01 = oa8;
    }
}
