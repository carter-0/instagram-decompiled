package X;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.SdF  reason: case insensitive filesystem */
public final class C11612SdF implements AnonymousClass03R {
    public final AnonymousClass02h Dbd(View view, AnonymousClass02h r13) {
        CharSequence coerceToStyledText;
        Log.isLoggable("ReceiveContent", 3);
        AnonymousClass02g r2 = r13.A00;
        if (r2.Bxf() == 2) {
            return r13;
        }
        ClipData Anj = r2.Anj();
        int B6S = r2.B6S();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < Anj.getItemCount(); i++) {
            ClipData.Item itemAt = Anj.getItemAt(i);
            if ((B6S & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (!z) {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                }
            }
        }
        return null;
    }
}
