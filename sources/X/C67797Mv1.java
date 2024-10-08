package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.TreeSet;

/* renamed from: X.Mv1  reason: case insensitive filesystem */
public final class C67797Mv1 extends 2Rw {
    public ImmutableList A00;
    public boolean A01;
    public final C70422O5z A02;
    public final TreeSet A03 = new TreeSet();

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = DbX.A0F(viewGroup, 0).inflate(R.layout.ai_subscription_item_row, viewGroup, false);
        0qQ.A0C(inflate, C273654mx.A00(3084));
        return new C67887MwV((IgdsListCell) inflate);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r7, int i) {
        StringBuilder A1A;
        String A09;
        String A0A;
        C67887MwV mwV = (C67887MwV) r7;
        0qQ.A0B(mwV, 0);
        C250663lr r5 = (C250663lr) this.A00.get(i);
        IgdsListCell igdsListCell = mwV.A00;
        String A08 = r5.A08(DialogModule.KEY_TITLE);
        String str = "";
        if (A08 == null) {
            A08 = str;
        }
        igdsListCell.A0I(A08);
        String A092 = r5.A09("send_frequency_with_timezone_offset(gmt_offset_seconds:$gmt_offset_seconds)");
        if (A092 == null || 00l.A0W(A092) || (A0A = r5.A0A("send_time_with_timezone_offset(gmt_offset_seconds:$gmt_offset_seconds)")) == null || 00l.A0W(A0A)) {
            A1A = AnonymousClass7TE.A1A();
            A09 = r5.A09("send_frequency_with_timezone_offset(gmt_offset_seconds:$gmt_offset_seconds)");
            if (A09 == null) {
                A09 = str;
            }
        } else {
            A1A = AnonymousClass7TE.A1A();
            String A093 = r5.A09("send_frequency_with_timezone_offset(gmt_offset_seconds:$gmt_offset_seconds)");
            if (A093 == null) {
                A093 = str;
            }
            A1A.append(A093);
            A09 = ", ";
        }
        A1A.append(A09);
        String A0A2 = r5.A0A("send_time_with_timezone_offset(gmt_offset_seconds:$gmt_offset_seconds)");
        if (A0A2 != null) {
            str = A0A2;
        }
        igdsListCell.A0H(AnonymousClass7TF.A0l(str, A1A));
        if (this.A01) {
            igdsListCell.setTextCellType(C69349Njo.TYPE_CHECKBOX);
            igdsListCell.setChecked(this.A03.contains(Integer.valueOf(i)));
            igdsListCell.A0D(new C50127FPz(i, 1, this));
            return;
        }
        igdsListCell.setTextCellType(C69349Njo.TYPE_UNKNOWN);
    }

    public C67797Mv1(C70422O5z o5z) {
        this.A02 = o5z;
        ImmutableList of = ImmutableList.of();
        0qQ.A07(of);
        this.A00 = of;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(874972599);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(865279749, A032);
        return size;
    }
}
