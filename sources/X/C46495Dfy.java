package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.ArrayList;

/* renamed from: X.Dfy  reason: case insensitive filesystem */
public final class C46495Dfy {
    public static final AnonymousClass0iw A02 = DbS.A0O("dialog_builder_module");
    public final Dialog A00;
    public final ListView A01;

    /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter, X.NKx] */
    public C46495Dfy(Context context, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3, DialogInterface.OnClickListener onClickListener4, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnShowListener onShowListener, CharSequence charSequence, Integer num, String str, String str2, String str3, String str4, CharSequence[] charSequenceArr, boolean z) {
        boolean z2;
        Context context2 = context;
        View inflate = LayoutInflater.from(context2).inflate(R.layout.igds_alert_dialog_layout, (ViewGroup) null, false);
        Dialog dialog = new Dialog(context2, 0);
        this.A00 = dialog;
        dialog.setContentView(inflate);
        dialog.setCanceledOnTouchOutside(z);
        dialog.setOnDismissListener(onDismissListener);
        dialog.setOnCancelListener(onCancelListener);
        DialogInterface.OnShowListener onShowListener2 = onShowListener;
        if (onShowListener != null) {
            dialog.setOnShowListener(new C50038FJx(onShowListener2, 1));
        }
        TextView A0R = AnonymousClass7TG.A0R(inflate, R.id.igds_alert_dialog_headline);
        A0R.setText(str);
        boolean z3 = true;
        A0R.setTypeface(A0R.getTypeface(), 1);
        CharSequence charSequence2 = charSequence;
        if (!(charSequence == null || charSequence2.length() == 0)) {
            TextView A0R2 = AnonymousClass7TG.A0R(inflate, R.id.igds_alert_dialog_subtext);
            A0R2.setVisibility(0);
            DbX.A1G(A0R2, charSequence2);
        }
        LinearLayout linearLayout = (LinearLayout) AnonymousClass7TF.A0F(inflate, R.id.dialog_linear_layout);
        linearLayout.setDividerDrawable(context2.getDrawable(R.drawable.igds_dialog_divider));
        linearLayout.setShowDividers(2);
        String str5 = str2;
        String str6 = str4;
        String str7 = str3;
        if (str5.length() > 0) {
            if ((str4 == null || str6.length() == 0) && (str3 == null || str7.length() == 0)) {
                z2 = true;
            } else {
                z2 = false;
            }
            A00(context2, onClickListener, inflate, num, str5, R.id.igds_alert_dialog_primary_button, true, z2);
        }
        if (str3 != null) {
            if (!(str4 == null || str6.length() == 0)) {
                z3 = false;
            }
            A00(context2, onClickListener2, inflate, (Integer) null, str7, R.id.igds_alert_dialog_secondary_button, false, z3);
        }
        if (str4 != null) {
            A00(context2, onClickListener3, inflate, (Integer) null, str6, R.id.igds_alert_dialog_cancel_button, false, true);
        }
        ListView listView = (ListView) inflate.requireViewById(16908298);
        this.A01 = listView;
        listView.setVisibility(8);
        CharSequence[] charSequenceArr2 = charSequenceArr;
        if (charSequenceArr != null) {
            ? nKx = new C68504NKx(context2, (0lg) null, A02);
            nKx.shouldCenterText = true;
            ArrayList A1C = AnonymousClass7TE.A1C();
            int length = charSequenceArr2.length;
            for (int i = 0; i < length; i++) {
                String str8 = charSequenceArr[i];
                if (str8 == null) {
                    str8 = "";
                }
                A1C.add(new C50989Fmc(context2, (View.OnClickListener) new FPA(i, 4, (Object) onClickListener4, (Object) this), (CharSequence) str8));
            }
            nKx.addDialogMenuItems(A1C);
            nKx.roundDialogBottomCorners = true;
            this.A01.setAdapter(nKx);
            this.A01.setBackground((Drawable) null);
            this.A01.setLayoutDirection(3);
            this.A01.setVisibility(0);
        }
    }

    public final void A01() {
        AnonymousClass0fN.A00(this.A00);
    }

    private final void A00(Context context, DialogInterface.OnClickListener onClickListener, View view, Integer num, String str, int i, boolean z, boolean z2) {
        TextView A0R = AnonymousClass7TG.A0R(view, i);
        if (z2) {
            DbU.A11(context, A0R, R.drawable.bg_elevated_simple_row_bottom_panorama);
        }
        Integer num2 = AnonymousClass05K.A01;
        2eS.A04(A0R, num2);
        A0R.setVisibility(0);
        A0R.setText(str);
        Context context2 = view.getContext();
        int i2 = R.attr.igds_color_primary_text;
        if (num == num2) {
            i2 = R.attr.igds_color_error_or_destructive;
        }
        DbT.A17(context2, A0R, 2Yu.A0H(context2, i2));
        if (z) {
            A0R.setTypeface(A0R.getTypeface(), 1);
        }
        FPF.A00(A0R, 46, this, onClickListener);
    }
}
