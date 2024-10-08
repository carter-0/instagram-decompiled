package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UiR  reason: case insensitive filesystem */
public final class C15782UiR extends C232222tE {
    public final X8Q A00 = new C19346WVn(this);
    public final X8Q A01;
    public final X47 A02;

    public C15782UiR(X8Q x8q, X47 x47) {
        0qQ.A0B(x8q, 1);
        this.A01 = x8q;
        this.A02 = x47;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r20, C249703kE r21) {
        String str;
        C69167Nfq nfq = (C69167Nfq) r20;
        C249703kE r1 = r21;
        boolean A1Z = AnonymousClass7TG.A1Z(nfq, r1);
        View view = r1.itemView;
        0qQ.A06(view);
        Object tag = r1.itemView.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.discovery.inform.ui.InformMessageV2ViewBinder.Holder");
        C17691VcM vcM = (C17691VcM) tag;
        N3M n3m = nfq.A00;
        List list = n3m.A0A;
        X8Q x8q = this.A00;
        X47 x47 = this.A02;
        0qQ.A0B(vcM, A1Z ? 1 : 0);
        0qQ.A0B(x8q, 4);
        VBS.A00(vcM.A05, n3m.A09);
        VBS.A00(vcM.A03, n3m.A04);
        C14879UDh uDh = vcM.A07;
        0qQ.A0B(uDh, 0);
        List list2 = n3m.A0B;
        int i = 0;
        if (list2 == null || list2.isEmpty()) {
            uDh.A00.setVisibility(8);
        } else {
            View view2 = uDh.A00;
            view2.setVisibility(0);
            UNP unp = (UNP) ((X9z) list2.get(0));
            String str2 = unp.A03;
            if (str2 != null) {
                IgImageView igImageView = uDh.A03;
                Integer[] A002 = AnonymousClass05K.A00(2);
                int length = A002.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    Integer num = A002[i2];
                    if (1 - num.intValue() != 0) {
                        str = "call-pano";
                    } else {
                        str = "help-pano";
                    }
                    if (!str.equals(str2)) {
                        i2++;
                    } else if (1 - num.intValue() != 0) {
                        i = R.drawable.instagram_call_end_pano_filled_24;
                    } else {
                        i = R.drawable.instagram_help_pano_outline_24;
                    }
                }
                igImageView.setImageResource(i);
                Context context = igImageView.getContext();
                DbX.A12(context, igImageView, 2Yu.A0B(context));
            }
            uDh.A02.setText(unp.A04);
            uDh.A01.setText(unp.A02);
            IgdsButton igdsButton = uDh.A04;
            igdsButton.setText(unp.A00);
            WBG.A01(igdsButton, 12, n3m, x8q);
            view2.setElevation(15.0f);
            view2.setOutlineProvider(new U3s(view2, A1Z));
            view2.setClipToOutline(A1Z);
        }
        VBS.A00(vcM.A02, n3m.A07);
        IgdsListCell igdsListCell = vcM.A08;
        IgdsListCell igdsListCell2 = vcM.A0A;
        boolean z = true;
        IgdsListCell igdsListCell3 = vcM.A09;
        List A1P = 0sr.A1P(new IgdsListCell[]{igdsListCell, igdsListCell2, igdsListCell3});
        if (list != null && !list.isEmpty()) {
            z = false;
        }
        if (z) {
            Iterator it = A1P.iterator();
            while (it.hasNext()) {
                JTO.A0H(it).setVisibility(8);
            }
        } else {
            igdsListCell.setVisibility(0);
            igdsListCell.A05(R.drawable.instagram_call_pano_outline_24);
            C69349Njo njo = C69349Njo.TYPE_CHEVRON;
            igdsListCell.setTextCellType(njo);
            igdsListCell2.setVisibility(0);
            igdsListCell2.A05(R.drawable.instagram_direct_pano_outline_24);
            igdsListCell2.setTextCellType(njo);
            igdsListCell3.setVisibility(0);
            igdsListCell3.A05(R.drawable.instagram_guides_pano_outline_24);
            igdsListCell3.setTextCellType(njo);
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                IgdsListCell igdsListCell4 = (IgdsListCell) A1P.get(i3);
                igdsListCell4.A0I(String.valueOf(((UNB) list.get(i3)).A02));
                igdsListCell4.A0H(String.valueOf(((UNB) list.get(i3)).A01));
                AnonymousClass0fU.A00(new WA1(i3, 0, n3m, x8q, list), igdsListCell4);
            }
        }
        boolean EtL = x8q.EtL(n3m);
        SpannableStringBuilder spannableStringBuilder = null;
        TextView textView = vcM.A04;
        if (EtL) {
            textView.setVisibility(0);
            vcM.A00.setVisibility(0);
            String str3 = n3m.A03;
            String str4 = n3m.A08;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(002.A0T(str3, str4, ' '));
            if (str4 != null) {
                AnonymousClass7AV.A05(spannableStringBuilder2, new UsP(n3m, x8q, view.getContext().getColor(2Yu.A0D(textView.getContext()))), str4);
                spannableStringBuilder = spannableStringBuilder2;
            }
            DbX.A1G(textView, spannableStringBuilder);
        } else {
            textView.setVisibility(8);
            vcM.A00.setVisibility(8);
            textView.setOnClickListener((View.OnClickListener) null);
        }
        if (x47 != null) {
            x47.EBK(view, n3m);
        }
        JTP.A14(vcM.A06, -1, vcM.A01.getHeight());
    }

    public final Class modelClass() {
        return C69167Nfq.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View A0A = DbU.A0A(layoutInflater, viewGroup, R.layout.inform_header_v2, false);
        A0A.setTag(new C17691VcM(viewGroup, A0A));
        C249703kE r1 = new C249703kE(A0A);
        if (A0A.getTag() instanceof C17691VcM) {
            return r1;
        }
        throw DbT.A0m();
    }
}
