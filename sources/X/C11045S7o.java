package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.S7o  reason: case insensitive filesystem */
public abstract class C11045S7o {
    public static boolean A00(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT >= 31 || dragEvent.getLocalState() != null || 03v.A0M(view) == null) {
            return false;
        }
        Context context = view.getContext();
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity == null) {
                    return false;
                }
                if (dragEvent.getAction() == 1) {
                    return !(view instanceof TextView);
                }
                if (dragEvent.getAction() != 3) {
                    return false;
                }
                if (view instanceof TextView) {
                    TextView textView = (TextView) view;
                    activity.requestDragAndDropPermissions(dragEvent);
                    int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                    textView.beginBatchEdit();
                    try {
                        Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                        03v.A02(textView, new AnonymousClass02e(dragEvent.getClipData(), 3).A00.AED());
                        return true;
                    } finally {
                        textView.endBatchEdit();
                    }
                } else {
                    activity.requestDragAndDropPermissions(dragEvent);
                    03v.A02(view, new AnonymousClass02e(dragEvent.getClipData(), 3).A00.AED());
                    return true;
                }
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        return false;
    }

    public static boolean A01(TextView textView, int i) {
        ClipData primaryClip;
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 31 || 03v.A0M(textView) == null || (i != 16908322 && i != 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            primaryClip = null;
        } else {
            primaryClip = clipboardManager.getPrimaryClip();
        }
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            AnonymousClass02e r0 = new AnonymousClass02e(primaryClip, 1);
            if (i != 16908322) {
                i2 = 1;
            }
            AnonymousClass02f r02 = r0.A00;
            r02.EWs(i2);
            03v.A02(textView, r02.AED());
        }
        return true;
    }
}
