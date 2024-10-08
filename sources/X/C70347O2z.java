package X;

import android.view.View;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.O2z  reason: case insensitive filesystem */
public abstract class C70347O2z {
    public static final void A00(OIM oim, C67931MxH mxH) {
        boolean A1U = AnonymousClass7TF.A1U(0, mxH, oim);
        IgdsListCell igdsListCell = mxH.A00;
        igdsListCell.A0I(oim.A0E);
        String str = oim.A0C;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        0qQ.A0B(str, 0);
        igdsListCell.A0J(str, str, false);
        C69349Njo njo = oim.A04;
        if (njo != C69349Njo.TYPE_UNKNOWN) {
            igdsListCell.A0G(njo, A1U);
        }
        if (njo == C69349Njo.TYPE_SWITCH) {
            igdsListCell.setChecked(oim.A0G);
        }
        if (njo == C69349Njo.TYPE_RADIO) {
            igdsListCell.setChecked(oim.A0F);
        }
        String str3 = oim.A0D;
        if (str3 != null) {
            str2 = str3;
        }
        igdsListCell.A0H(str2);
        View.OnClickListener onClickListener = oim.A01;
        if (onClickListener != null) {
            igdsListCell.setClickable(A1U);
            AnonymousClass0fU.A00(onClickListener, igdsListCell);
            2eS.A01(igdsListCell);
        } else {
            C358618bC r0 = oim.A03;
            if (r0 != null) {
                igdsListCell.setClickable(A1U);
                igdsListCell.A0E(r0);
            } else {
                View.OnClickListener onClickListener2 = oim.A02;
                if (onClickListener2 != null) {
                    igdsListCell.setClickable(A1U);
                    igdsListCell.setCompoundButtonClickListener(onClickListener2);
                } else {
                    igdsListCell.setClickable(false);
                    igdsListCell.setOnClickListener((View.OnClickListener) null);
                }
            }
        }
        Integer num = oim.A05;
        if (num != null) {
            igdsListCell.A05(num.intValue());
        }
        Integer num2 = oim.A08;
        if (num2 != null) {
            igdsListCell.setSubtitleMaxLine(num2.intValue());
        }
        Integer num3 = oim.A07;
        if (num3 != null) {
            DbT.A17(igdsListCell.getContext(), igdsListCell.getSubtitleView(), num3.intValue());
        }
        Integer num4 = oim.A0A;
        if (num4 != null) {
            DbT.A17(igdsListCell.getContext(), igdsListCell.getTitleView(), num4.intValue());
        }
        Integer num5 = oim.A06;
        if (num5 != null) {
            igdsListCell.setIndex(num5.intValue());
        }
    }
}
