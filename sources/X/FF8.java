package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.ArrayList;

@Deprecated
public final class FF8 {
    public static final AnonymousClass0iw A0H = DbS.A0O("ig_dialog_builder_module");
    public DialogInterface.OnClickListener A00;
    public 0lg A01;
    public final Context A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final ViewGroup A07;
    public final CheckBox A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final C46659Dig A0D;
    public final View A0E;
    public final ListView A0F;
    public final TextView A0G;

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
        if (r3.getVisibility() == 0) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C46659Dig A00() {
        /*
            r8 = this;
            android.content.Context r1 = r8.A02
            boolean r0 = r1 instanceof android.app.Activity
            java.lang.String r6 = "IgDialogBuilder"
            if (r0 == 0) goto L_0x0015
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1.isFinishing()
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = "Activity is finishing"
            X.0wb.A03(r6, r0)
        L_0x0015:
            android.widget.TextView r3 = r8.A0B
            android.widget.TextView r0 = r8.A0G
            android.view.View r2 = r8.A0E
            r1 = 8
            r7 = 0
            if (r2 == 0) goto L_0x0033
            if (r0 == 0) goto L_0x0033
            if (r3 == 0) goto L_0x0033
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00bd
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x00bd
            r2.setVisibility(r7)
        L_0x0033:
            android.widget.TextView r3 = r8.A0A
            android.widget.TextView r0 = r8.A0C
            if (r0 == 0) goto L_0x006b
            if (r3 == 0) goto L_0x006b
            android.view.View r0 = r8.A06
            r0.getClass()
            int r0 = r0.getVisibility()
            if (r0 != r1) goto L_0x006b
            android.content.res.Resources r0 = r3.getResources()
            android.util.DisplayMetrics r2 = r0.getDisplayMetrics()
            android.graphics.RectF r0 = X.0nA.A01
            r1 = 1117257728(0x42980000, float:76.0)
            r0 = 1
            float r0 = android.util.TypedValue.applyDimension(r0, r1, r2)
            int r2 = (int) r0
            r3.setMinimumHeight(r2)
            r1 = 17
            r3.setGravity(r1)
            android.widget.CheckBox r0 = r8.A08
            r0.getClass()
            r0.setMinimumHeight(r2)
            r0.setGravity(r1)
        L_0x006b:
            android.widget.ListView r2 = r8.A0F
            android.widget.TextView r5 = r8.A09
            android.view.View r4 = r8.A03
            android.view.View r3 = r8.A05
            android.view.View r1 = r8.A06
            if (r1 == 0) goto L_0x00b0
            if (r3 == 0) goto L_0x00b0
            if (r4 == 0) goto L_0x00b0
            if (r5 == 0) goto L_0x00b0
            if (r2 == 0) goto L_0x00b0
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L_0x00b0
            android.widget.ListAdapter r2 = r2.getAdapter()
            r2.getClass()
            X.NKx r2 = (X.C68504NKx) r2
            int r0 = r1.getVisibility()
            if (r0 == 0) goto L_0x009b
            int r1 = r3.getVisibility()
            r0 = 1
            if (r1 != 0) goto L_0x009c
        L_0x009b:
            r0 = 0
        L_0x009c:
            r2.roundDialogTopCorners = r0
            int r0 = r4.getVisibility()
            if (r0 == 0) goto L_0x00ab
            int r0 = r5.getVisibility()
            if (r0 == 0) goto L_0x00ab
            r7 = 1
        L_0x00ab:
            r2.roundDialogBottomCorners = r7
            r0 = 0
            r2.shouldCenterText = r0
        L_0x00b0:
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>()
            java.lang.String r0 = "Creating Dialog"
            X.0KC.A0H(r6, r0, r1)
            X.Dig r0 = r8.A0D
            return r0
        L_0x00bd:
            r2.setVisibility(r1)
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FF8.A00():X.Dig");
    }

    public final void A01(int i) {
        TextView textView = this.A0C;
        textView.getClass();
        textView.setText(i);
        View view = this.A06;
        view.getClass();
        view.setVisibility(0);
    }

    public final void A02(DialogInterface.OnClickListener onClickListener, int i) {
        String string = this.A02.getString(i);
        TextView textView = this.A0B;
        textView.getClass();
        textView.setText(string);
        AnonymousClass0fU.A00(new C50068FNj(onClickListener, this, -2), textView);
        textView.setVisibility(0);
        View view = this.A03;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void A03(DialogInterface.OnClickListener onClickListener, String str) {
        TextView textView = this.A0G;
        textView.getClass();
        textView.setText(str);
        AnonymousClass0fU.A00(new C50068FNj(onClickListener, this, -1), textView);
        textView.setVisibility(0);
        View view = this.A03;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.widget.ListAdapter, X.NKx] */
    public final void A04(DialogInterface.OnClickListener onClickListener, CharSequence[] charSequenceArr) {
        Context context = this.A02;
        ? nKx = new C68504NKx(context, this.A01, A0H);
        this.A00 = onClickListener;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (int i = 0; i < charSequenceArr.length; i++) {
            C50989Fmc.A01(context, new FNH(this, i, 4), charSequenceArr[i], A1C);
        }
        nKx.addDialogMenuItems(A1C);
        ListView listView = this.A0F;
        listView.getClass();
        listView.setAdapter(nKx);
        listView.setVisibility(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FF8(Context context) {
        this(context, R.layout.alert_dialog, C70542Rd.A03 ? R.style.IgDialog : R.style.IgDialogDeprecated);
        ListView listView = this.A0F;
        listView.getClass();
        listView.setVisibility(8);
        this.A0F.setBackground((Drawable) null);
        this.A0F.setLayoutDirection(3);
    }

    public FF8(Context context, int i, int i2) {
        this.A02 = context;
        C46659Dig dig = new C46659Dig(context, i2);
        this.A0D = dig;
        View A082 = DbU.A08(LayoutInflater.from(context), i);
        this.A04 = A082;
        dig.setContentView(A082);
        this.A0F = (ListView) dig.findViewById(16908298);
        this.A05 = dig.findViewById(R.id.scrollView);
        this.A06 = dig.findViewById(R.id.alertTitleContainer);
        this.A0C = (TextView) dig.findViewById(R.id.alertTitle);
        this.A0A = (TextView) dig.findViewById(R.id.message);
        this.A08 = (CheckBox) dig.findViewById(R.id.messageCheckBox);
        this.A03 = dig.findViewById(R.id.button_group);
        this.A0G = (TextView) dig.findViewById(R.id.button_positive);
        this.A0B = (TextView) dig.findViewById(R.id.button_negative);
        this.A0E = dig.findViewById(R.id.button_divider);
        this.A09 = (TextView) dig.findViewById(R.id.button_blue);
        this.A07 = (ViewGroup) dig.findViewById(R.id.customViewHolder);
    }
}
