package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class EAJ extends C231632rz {
    public final Context A00;
    public final E6Y A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        String str;
        TextView textView;
        C50109FOz fOz;
        String string;
        int A03 = AnonymousClass0fD.A03(1385827782);
        Context context = this.A00;
        C49531ExD exD = (C49531ExD) DbT.A0o(view);
        DwJ dwJ = (DwJ) obj;
        E6Y e6y = this.A01;
        AnonymousClass7TG.A1N(context, exD);
        int A032 = DbW.A03(2, dwJ, e6y);
        Integer num = dwJ.A03;
        0qQ.A07(num);
        String str2 = dwJ.A08;
        if (str2 == null) {
            str2 = "";
        }
        Long l = dwJ.A04;
        if (l != null) {
            str = 1G0.A01((double) l.longValue());
        } else {
            str = null;
        }
        boolean z = dwJ.A0F;
        int intValue = num.intValue();
        if (intValue == 4) {
            if (!z || str == null) {
                C49244Ern.A00(context, exD, str2);
            } else {
                DbX.A13(context, exD.A01, str, 2131974795);
            }
            textView = exD.A01;
            fOz = null;
        } else if (intValue == 2) {
            C49244Ern.A00(context, exD, str2);
            textView = exD.A01;
            fOz = new C50109FOz((Object) e6y, A032);
        } else {
            throw AnonymousClass7TE.A0z("OB reference ID should not be visible for CTRL type");
        }
        AnonymousClass0fU.A00(fOz, textView);
        if (intValue != 4) {
            if (intValue != 2) {
                throw AnonymousClass7TE.A0z("OB reference ID should not be visible for CTRL type");
            } else if (z) {
                string = AnonymousClass7TE.A16(context, 2131974796);
            } else {
                string = "";
            }
        } else if (z || str == null) {
            string = context.getString(2131974794);
        } else {
            string = DbW.A0h(context, str, 2131974793);
        }
        exD.A00.setText(string);
        AnonymousClass0fD.A0A(872623791, A03);
    }

    public EAJ(Context context, E6Y e6y) {
        this.A00 = context;
        this.A01 = e6y;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1197382314);
        View A08 = DbU.A08(DbT.A0B(this.A00), R.layout.support_inbox_ob_reference_id_row);
        0qQ.A07(A08);
        A08.setTag(new C49531ExD(A08));
        AnonymousClass0fD.A0A(-2144400451, A03);
        return A08;
    }
}
