package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

public final class QEX extends 2Rw {
    public final QCH A00;

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r11, int i) {
        C18569VuL vuL;
        QCH qch = this.A00;
        int i2 = qch.A04.A05.A04 + i;
        TextView textView = ((C7467QEw) r11).A00;
        String string = textView.getContext().getString(2131967676);
        Locale locale = Locale.getDefault();
        Integer valueOf = Integer.valueOf(i2);
        textView.setText(String.format(locale, "%d", new Object[]{valueOf}));
        textView.setContentDescription(String.format(string, new Object[]{valueOf}));
        C10811RyX ryX = qch.A05;
        Calendar A002 = SMY.A00();
        if (A002.get(1) == i2) {
            vuL = ryX.A06;
        } else {
            vuL = ryX.A07;
        }
        Iterator it = qch.A06.Brc().iterator();
        while (it.hasNext()) {
            A002.setTimeInMillis(Pxg.A0H(it));
            if (A002.get(1) == i2) {
                vuL = ryX.A04;
            }
        }
        vuL.A01(textView);
        AnonymousClass0fU.A00(new C11482Sb5(this, i2, 0), textView);
    }

    public QEX(QCH qch) {
        this.A00 = qch;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1022486194);
        int i = this.A00.A04.A02;
        AnonymousClass0fD.A0A(-1298961347, A03);
        return i;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C7467QEw((TextView) DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.mtrl_calendar_year));
    }
}
