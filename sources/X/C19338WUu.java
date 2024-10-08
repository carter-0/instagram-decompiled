package X;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: X.WUu  reason: case insensitive filesystem */
public final class C19338WUu implements C74441Puw {
    public TextView A00;
    public OVW A01;
    public IgdsSwitch A02;
    public final View A03;
    public final FragmentActivity A04;
    public final PromoteData A05;
    public final PromoteState A06;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
        if (r0 < 0) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D7r(java.util.Date r4) {
        /*
            r3 = this;
            r1 = 0
            if (r4 == 0) goto L_0x001c
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r2.setTime(r4)
            r0 = 14
            r1 = 0
            r2.set(r0, r1)
            r0 = 13
            r2.set(r0, r1)
            java.util.Date r1 = r2.getTime()
            X.0qQ.A07(r1)
        L_0x001c:
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.util.Date r0 = r0.getTime()
            X.OVW r2 = r3.A01
            if (r2 != 0) goto L_0x0032
            java.lang.String r0 = "datePickerController"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0032:
            if (r1 == 0) goto L_0x003b
            int r0 = r1.compareTo(r0)
            r1 = 1
            if (r0 >= 0) goto L_0x003c
        L_0x003b:
            r1 = 0
        L_0x003c:
            X.7Pu r0 = r2.A00
            if (r0 == 0) goto L_0x0043
            r0.A0Q(r1)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19338WUu.D7r(java.util.Date):void");
    }

    public static final void A01(C19338WUu wUu) {
        String str;
        TextView textView = wUu.A00;
        if (textView != null) {
            Date date = wUu.A05.A1k;
            if (date != null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, MMM dd 'at' hh:mm a z");
                simpleDateFormat.setTimeZone(TimeZone.getDefault());
                str = simpleDateFormat.format(date);
            } else {
                str = null;
            }
            textView.setText(str);
            wUu.A06.A09 = true;
            TextView textView2 = wUu.A00;
            if (textView2 != null) {
                textView2.setVisibility(0);
                return;
            }
        }
        0qQ.A0F("subtitleView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D9d() {
        if (this.A05.A1k == null) {
            this.A06.A09 = false;
            IgdsSwitch igdsSwitch = this.A02;
            if (igdsSwitch == null) {
                0qQ.A0F("toggleSwitch");
                throw AnonymousClass00P.createAndThrow();
            } else {
                igdsSwitch.setChecked(false);
            }
        }
    }

    public final void D9n(Date date) {
        String str;
        if (date != null) {
            Calendar instance = Calendar.getInstance();
            instance.setTime(date);
            instance.set(14, 0);
            instance.set(13, 0);
            Date time = instance.getTime();
            0qQ.A07(time);
            this.A05.A1k = time;
            A01(this);
            OVW ovw = this.A01;
            if (ovw == null) {
                str = "datePickerController";
            } else {
                C331157Pu r1 = ovw.A00;
                if (r1 != null) {
                    r1.A0L((C332277Ui) null);
                }
                IgdsSwitch igdsSwitch = this.A02;
                if (igdsSwitch == null) {
                    str = "toggleSwitch";
                } else {
                    igdsSwitch.setChecked(true);
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public C19338WUu(View view, FragmentActivity fragmentActivity, PromoteData promoteData, PromoteState promoteState) {
        this.A03 = view;
        this.A04 = fragmentActivity;
        this.A05 = promoteData;
        this.A06 = promoteState;
    }

    public static final void A00(C19338WUu wUu) {
        Calendar instance = Calendar.getInstance();
        Date time = instance.getTime();
        instance.add(6, 60);
        Date time2 = instance.getTime();
        OVW ovw = wUu.A01;
        if (ovw == null) {
            0qQ.A0F("datePickerController");
            throw AnonymousClass00P.createAndThrow();
        }
        ovw.A01(true, wUu.A04.getString(2131970747), wUu.A05.A1k, time, time2, true);
    }
}
