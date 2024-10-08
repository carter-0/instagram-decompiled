package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: X.7Iw  reason: invalid class name and case insensitive filesystem */
public final class C329437Iw implements C329347In {
    public Date A00;
    public boolean A01;
    public final Activity A02;
    public final Context A03;
    public final View A04;
    public final UserSession A05;
    public final C329337Im A06;
    public final C329247Id A07;
    public final C308476Uk A08;
    public final C62320sa A09;
    public final AnonymousClass7IM A0A;
    public final boolean A0B;

    public final String A00(Date date) {
        Context context;
        int i;
        Object[] objArr;
        long time = date.getTime();
        Date date2 = new Date();
        TimeZone timeZone = C14240TsN.A03;
        int intValue = VB1.A00(date2, time).intValue();
        if (intValue == 2) {
            context = this.A03;
            i = 2131972690;
        } else if (intValue == 3) {
            context = this.A03;
            i = 2131972691;
        } else if (intValue == 4 || intValue == 5 || intValue == 6) {
            context = this.A03;
            i = 2131972668;
            objArr = new Object[]{C14240TsN.A04("MMM d", time), C14240TsN.A01(context, time)};
            String string = context.getString(i, objArr);
            0qQ.A07(string);
            return string;
        } else {
            0wj.A01.AEf(002.A0Q("Invalid scheduled send time: ", time), 20134884).report();
            return "";
        }
        objArr = new Object[]{C14240TsN.A01(context, time)};
        String string2 = context.getString(i, objArr);
        0qQ.A07(string2);
        return string2;
    }

    public final void Ejq(boolean z) {
        View view = this.A04;
        AnonymousClass0fU.A00(new C329447Ix(this, z), view);
        2Er r1 = (2Er) this.A09.invoke();
        if (r1 != null && C3268378i.A00(this.A05, r1)) {
            view.setOnLongClickListener(new C71419OkK(r1, this, z));
        }
    }

    public final void Ejr(boolean z) {
        TextView textView;
        View view = this.A04;
        if ((view instanceof IgTextView) && (textView = (TextView) view) != null) {
            Context context = this.A03;
            int i = 2131973082;
            if (z) {
                i = 2131960992;
            }
            textView.setText(context.getString(i));
        }
    }

    public final void FLT(boolean z, boolean z2) {
        if (this.A0B) {
            C308476Uk r5 = this.A08;
            if (r5 != null) {
                r5.A01(Boolean.valueOf(z2), z, 182.A06(0Tu.A05, this.A05, 36320511198110218L));
            }
        } else {
            View view = this.A04;
            int i = 8;
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
            view.setEnabled(z2);
            float f = 0.25f;
            if (z2) {
                f = 1.0f;
            }
            view.setAlpha(f);
        }
        this.A0A.A00(AnonymousClass7JU.RIGHT_INSET, AnonymousClass7JT.SEND, z);
    }

    public C329437Iw(Activity activity, View view, UserSession userSession, C329337Im r8, AnonymousClass7IM r9, C329247Id r10, C308476Uk r11, C62320sa r12) {
        View findViewById;
        this.A05 = userSession;
        this.A02 = activity;
        this.A08 = r11;
        this.A07 = r10;
        this.A06 = r8;
        this.A0A = r9;
        this.A09 = r12;
        this.A03 = view.getContext();
        0Tu r3 = 0Tu.A05;
        boolean A062 = 182.A06(r3, userSession, 36320511197716997L);
        this.A0B = A062;
        if (A062) {
            findViewById = view.findViewById(R.id.row_thread_composer_send_button_container);
        } else {
            findViewById = view.findViewById(R.id.row_thread_composer_button_send);
            if (182.A06(r3, userSession, 36320511197979144L)) {
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.height = -2;
                findViewById.setLayoutParams(layoutParams);
            }
        }
        0qQ.A0A(findViewById);
        this.A04 = findViewById;
        Ejq(false);
    }
}
