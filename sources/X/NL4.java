package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

public final class NL4 extends C331047Ph {
    public C70662OFj A00;
    public C69334NjZ A01;
    public CharSequence A02;
    public String A03;
    public final List A04 = AnonymousClass7TE.A1C();
    public final NLY A05;
    public final NLZ A06;
    public final C68511NLi A07;
    public final C68508NLf A08;
    public final EAH A09;
    public final C68509NLg A0A;

    public NL4(Context context, UserSession userSession, NKU nku, NKU nku2) {
        C68509NLg nLg = new C68509NLg(context, nku);
        this.A0A = nLg;
        C68508NLf nLf = new C68508NLf(context);
        this.A08 = nLf;
        C68511NLi nLi = new C68511NLi(context, userSession);
        this.A07 = nLi;
        NLY nly = new NLY(context, nku2);
        this.A05 = nly;
        EAH eah = new EAH(context, userSession);
        this.A09 = eah;
        NLZ nlz = new NLZ(context, userSession);
        this.A06 = nlz;
        A0B(nLg, nLf, nLi, nly, eah, nlz);
    }

    public static void A00(NL4 nl4) {
        nl4.A06();
        String str = nl4.A03;
        if (str != null) {
            CharSequence charSequence = nl4.A02;
            if (charSequence != null) {
                nl4.A09(nl4.A06, new OD5(str, charSequence), new OGX((Integer) null, (Integer) null, (Integer) null, (Integer) null, false));
            } else {
                nl4.A09(nl4.A08, str, new OGX((Integer) null, (Integer) null, (Integer) null, (Integer) null, false));
            }
        }
        for (Object next : nl4.A04) {
            C69334NjZ njZ = nl4.A01;
            if (njZ == null) {
                njZ = C69334NjZ.LIST;
            }
            nl4.A09(nl4.A0A, next, njZ);
        }
        C70662OFj oFj = nl4.A00;
        if (oFj != null) {
            C70754OKa oKa = oFj.A01;
            if (oKa != null && !TextUtils.isEmpty(oKa.A00)) {
                C70662OFj oFj2 = nl4.A00;
                String str2 = oFj2.A01.A00;
                boolean z = oFj2.A03;
                int i = R.drawable.instagram_chevron_up_pano_outline_24;
                if (z) {
                    i = R.drawable.instagram_chevron_down_pano_outline_24;
                }
                nl4.A09(nl4.A05, str2, new OGX((Integer) null, (Integer) null, (Integer) null, Integer.valueOf(i), true));
            }
            C70662OFj oFj3 = nl4.A00;
            if (!oFj3.A03) {
                C70754OKa oKa2 = oFj3.A00;
                if (oKa2 != null) {
                    nl4.A09(nl4.A07, oKa2.A00, new OGX(Integer.valueOf(R.dimen.action_bar_item_spacing_left), Integer.valueOf(R.dimen.abc_control_corner_material), (Integer) null, (Integer) null, false));
                }
                Iterator A0h = JTQ.A0h(nl4.A00.A02);
                while (A0h.hasNext()) {
                    nl4.A08(nl4.A09, ((C69651NpZ) A0h.next()).A00.A00());
                }
            }
        }
        nl4.A07();
    }
}
