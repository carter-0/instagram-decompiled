package X;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;

/* renamed from: X.U7u  reason: case insensitive filesystem */
public final class C14763U7u extends 0SM implements DialogInterface.OnClickListener {
    public final SVH A00;

    public final void onClick(DialogInterface dialogInterface, int i) {
        SVH svh = this.A00;
        if (svh != null) {
            svh.onClick(dialogInterface, i);
        }
    }

    public C14763U7u(Bundle bundle, SVH svh) {
        this.A00 = svh;
        setArguments(bundle);
    }

    public final Dialog A0F(Bundle bundle) {
        FragmentActivity requireActivity = requireActivity();
        Bundle requireArguments = requireArguments();
        TypedArray obtainStyledAttributes = requireActivity.obtainStyledAttributes(AnonymousClass2Z3.A09);
        boolean hasValue = obtainStyledAttributes.hasValue(117);
        obtainStyledAttributes.recycle();
        if (hasValue) {
            C18080Vl9 vl9 = new C18080Vl9(requireActivity);
            if (requireArguments.containsKey(DialogModule.KEY_TITLE)) {
                String string = requireArguments.getString(DialogModule.KEY_TITLE);
                0Sd.A00(string);
                View A08 = DbU.A08(LayoutInflater.from(requireActivity), R.layout.alert_title_layout);
                View findViewById = A08.findViewById(R.id.alert_title);
                0Sd.A00(findViewById);
                TextView textView = (TextView) findViewById;
                textView.setText(string);
                textView.setFocusable(true);
                textView.setAccessibilityHeading(true);
                vl9.A01.A09 = A08;
            }
            if (requireArguments.containsKey("button_positive")) {
                vl9.A06(this, requireArguments.getString("button_positive"));
            }
            if (requireArguments.containsKey("button_negative")) {
                vl9.A05(this, requireArguments.getString("button_negative"));
            }
            if (requireArguments.containsKey("button_neutral")) {
                String string2 = requireArguments.getString("button_neutral");
                C17742VdB vdB = vl9.A01;
                vdB.A0E = string2;
                vdB.A02 = this;
            }
            if (requireArguments.containsKey(DialogModule.KEY_MESSAGE)) {
                vl9.A01.A0C = requireArguments.getString(DialogModule.KEY_MESSAGE);
            }
            if (requireArguments.containsKey(DialogModule.KEY_ITEMS)) {
                CharSequence[] charSequenceArray = requireArguments.getCharSequenceArray(DialogModule.KEY_ITEMS);
                C17742VdB vdB2 = vl9.A01;
                vdB2.A0J = charSequenceArray;
                vdB2.A03 = this;
            }
            return vl9.A00();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity);
        if (requireArguments.containsKey(DialogModule.KEY_TITLE)) {
            String string3 = requireArguments.getString(DialogModule.KEY_TITLE);
            0Sd.A00(string3);
            View A082 = DbU.A08(LayoutInflater.from(requireActivity), R.layout.alert_title_layout);
            View findViewById2 = A082.findViewById(R.id.alert_title);
            0Sd.A00(findViewById2);
            TextView textView2 = (TextView) findViewById2;
            textView2.setText(string3);
            textView2.setFocusable(true);
            textView2.setAccessibilityHeading(true);
            builder.setCustomTitle(A082);
        }
        if (requireArguments.containsKey("button_positive")) {
            builder.setPositiveButton(requireArguments.getString("button_positive"), this);
        }
        if (requireArguments.containsKey("button_negative")) {
            builder.setNegativeButton(requireArguments.getString("button_negative"), this);
        }
        if (requireArguments.containsKey("button_neutral")) {
            builder.setNeutralButton(requireArguments.getString("button_neutral"), this);
        }
        if (requireArguments.containsKey(DialogModule.KEY_MESSAGE)) {
            builder.setMessage(requireArguments.getString(DialogModule.KEY_MESSAGE));
        }
        if (requireArguments.containsKey(DialogModule.KEY_ITEMS)) {
            builder.setItems(requireArguments.getCharSequenceArray(DialogModule.KEY_ITEMS), this);
        }
        return builder.create();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C14763U7u.super.onDismiss(dialogInterface);
        SVH svh = this.A00;
        if (svh != null) {
            svh.onDismiss(dialogInterface);
        }
    }

    public C14763U7u() {
        this.A00 = null;
    }
}
