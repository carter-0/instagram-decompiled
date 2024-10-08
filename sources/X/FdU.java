package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;

public final class FdU implements C234222xL {
    public final int A00;
    public final Object A01;

    public final void DsC(AnonymousClass5Gv r1) {
    }

    public final void DsE(AnonymousClass5Gv r1) {
    }

    public final void DsH(AnonymousClass5Gv r1) {
    }

    public FdU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean Ds8(AnonymousClass5Gv r9) {
        String str;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r9, 0);
                E4T e4t = (E4T) this.A01;
                FragmentActivity activity = e4t.getActivity();
                Object obj = null;
                if (activity != null) {
                    obj = DbZ.A0e(activity);
                }
                ClipboardManager clipboardManager = (ClipboardManager) obj;
                if (clipboardManager == null) {
                    return true;
                }
                TextView textView = e4t.A02;
                if (textView == null) {
                    str = "backupCodesTextView";
                    break;
                } else {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("Backup Codes", textView.getText()));
                    DbZ.A0w(e4t.getContext(), e4t, 2131956742);
                    r9.A08(true);
                    return true;
                }
            case 1:
                0qQ.A0B(r9, 0);
                E25 e25 = (E25) this.A01;
                Context requireContext = e25.requireContext();
                ClipboardManager clipboardManager2 = (ClipboardManager) DbZ.A0e(requireContext);
                if (clipboardManager2 == null) {
                    return true;
                }
                ClipData primaryClip = clipboardManager2.getPrimaryClip();
                if (!(primaryClip == null || primaryClip.getItemCount() <= 0 || primaryClip.getItemAt(0) == null)) {
                    CharSequence text = primaryClip.getItemAt(0).getText();
                    str = "confirmationCodeEditText";
                    if (text != null) {
                        int length = text.length();
                        ConfirmationCodeEditText confirmationCodeEditText = e25.A0A;
                        if (confirmationCodeEditText != null) {
                            if (length == confirmationCodeEditText.A03) {
                                confirmationCodeEditText.setText(text, TextView.BufferType.EDITABLE);
                                ConfirmationCodeEditText confirmationCodeEditText2 = e25.A0A;
                                if (confirmationCodeEditText2 != null) {
                                    confirmationCodeEditText2.setSelection(text.length());
                                }
                            }
                        }
                    }
                    DbZ.A0w(requireContext, e25, 2131975666);
                }
                r9.A08(true);
                return true;
            default:
                ConfirmationCodeEditText confirmationCodeEditText3 = (ConfirmationCodeEditText) ((FPV) this.A01).A01;
                Context context = confirmationCodeEditText3.getContext();
                Object A0e = DbZ.A0e(context);
                A0e.getClass();
                ClipData primaryClip2 = ((ClipboardManager) A0e).getPrimaryClip();
                if (primaryClip2 == null || primaryClip2.getItemCount() <= 0) {
                    return true;
                }
                CharSequence text2 = primaryClip2.getItemAt(0).getText();
                text2.getClass();
                if (text2.length() == confirmationCodeEditText3.A03) {
                    confirmationCodeEditText3.setText(text2);
                    confirmationCodeEditText3.setSelection(text2.length());
                    return true;
                }
                DbU.A0z(context, 2131975666);
                return true;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
