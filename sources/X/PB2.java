package X;

import android.content.res.Resources;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;
import java.util.Set;

public final class PB2 implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass7X0 A02;
    public final AnonymousClass7DZ A03;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        UserSession userSession = this.A01;
        boolean A012 = C70867OPg.A01(userSession);
        int i = R.layout.direct_prompt_xma_legacy;
        if (A012) {
            i = R.layout.direct_prompt_xma_message;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        inflate.getLayoutParams().width = -1;
        C68070Mzb mzb = new C68070Mzb(inflate, userSession);
        this.A03.A00(mzb);
        return mzb;
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        0qQ.A0B(r2, 0);
        this.A03.A01(r2);
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r21, AnonymousClass7FW r22) {
        String str;
        CharSequence charSequence;
        C68070Mzb mzb = (C68070Mzb) r21;
        C328687Ft r3 = (C328687Ft) r22;
        AnonymousClass7TF.A1H(mzb, r3);
        if (r3.A06) {
            mzb.itemView.setVisibility(8);
            return;
        }
        List<OWC> list = mzb.A04;
        for (OWC owc : list) {
            owc.A00.setVisibility(8);
        }
        mzb.A03.setVisibility(8);
        List list2 = r3.A04;
        int min = Math.min(4, list2.size());
        int i = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            OWC owc2 = (OWC) list.get(i);
            C68821NYf nYf = (C68821NYf) list2.get(i);
            View view = owc2.A00;
            A00(view);
            Size A002 = A00(owc2.A0N);
            C71104Oci.A01(view, i, min, false);
            C71104Oci.A02(view, i, false);
            if (i == 0) {
                view.setRotation(0.0f);
                if (min == 3) {
                    0nA.A0T(view, view.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material));
                }
            } else {
                float f = -4.0f;
                if (i % 2 == 0) {
                    f = 4.0f;
                }
                view.setRotation(f);
            }
            IgImageView A0R = C66580MXl.A0R(owc2.A0O);
            0qQ.A0B(A0R, 0);
            C242553Us r12 = new C242553Us();
            float A0B = (float) AnonymousClass7TE.A0B(A0R.getResources());
            r12.A07(A0B, A0B, A0B, A0B);
            AnonymousClass77D A04 = C3265577g.A04(r12, A0R);
            owc2.A02(A002, this.A00, A04, nYf, this.A02.ArY());
            AnonymousClass774 r0 = nYf.A02.A0E;
            if (r0 != null) {
                charSequence = r0.A03;
            } else {
                charSequence = null;
            }
            C252063oV r11 = owc2.A0L;
            int i2 = 0;
            if (r11.CVM() || (!(charSequence == null || charSequence.length() == 0) || !C70867OPg.A01(owc2.A01))) {
                ((TextView) r11.getView()).setText(charSequence);
                View view2 = r11.getView();
                if (charSequence == null || 00l.A0W(charSequence)) {
                    i2 = 8;
                }
                view2.setVisibility(i2);
            }
            View view3 = owc2.A0D.getView();
            int A0F = AnonymousClass7TE.A0F(view3.getResources());
            0nA.A0e(view3, A0F);
            0nA.A0d(view3, A0F);
            C66580MXl.A1Q(owc2.A0G, 0);
            if (i == 0) {
                if (182.A06(0Tu.A05, this.A01, 36325287201485639L)) {
                    C66580MXl.A1Q(owc2.A09, 0);
                    view.setVisibility(0);
                    i++;
                }
            }
            C66580MXl.A1Q(owc2.A09, 8);
            view.setVisibility(0);
            i++;
        }
        mzb.itemView.setVisibility(0);
        this.A03.A02(mzb, r3);
        UserSession userSession = this.A01;
        C72193OyD A003 = C69843Nt7.A00(this.A00, userSession);
        int size = list2.size();
        boolean A06 = 182.A06(0Tu.A05, userSession, 36325287201485639L);
        C68821NYf nYf2 = (C68821NYf) 00k.A0J(list2);
        if (nYf2 != null) {
            str = nYf2.A02.A0L.A00;
        } else {
            str = null;
        }
        String str2 = r3.A03;
        if (str != null) {
            Set set = A003.A00;
            if (!set.contains(str)) {
                set.add(str);
                C72193OyD.A00(A003, (String) null, "impression", str, str2, size, A06);
            }
        }
    }

    public PB2(AnonymousClass0iw r1, UserSession userSession, AnonymousClass7X0 r3, AnonymousClass7DZ r4) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = userSession;
        this.A02 = r3;
    }

    public static final Size A00(View view) {
        Resources resources = view.getResources();
        Size size = new Size(resources.getDimensionPixelSize(R.dimen.clips_editor_timeline_v3_single_segment_drawer_height), resources.getDimensionPixelSize(R.dimen.direct_clips_stacks_message_height));
        view.getLayoutParams().width = size.getWidth();
        view.getLayoutParams().height = size.getHeight();
        return size;
    }
}
