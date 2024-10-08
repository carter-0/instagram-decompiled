package X;

import android.graphics.Rect;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Ge1  reason: case insensitive filesystem */
public final class C52868Ge1 extends EditText implements TextView.OnEditorActionListener {
    public int A00;
    public TextWatcher A01;
    public 2V1 A02;
    public 2Sg A03;
    public AtomicReference A04;

    public final int getAutofillType() {
        return super.getAutofillType();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return super.onCreateInputConnection(editorInfo);
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int A06 = AnonymousClass0fD.A06(1734246623);
        super.onFocusChanged(z, i, rect);
        AnonymousClass0fD.A0D(370676787, A06);
    }

    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        return super.onKeyPreIme(i, keyEvent);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    public final void onMeasure(int i, int i2) {
        int A06 = AnonymousClass0fD.A06(1223443170);
        super.onMeasure(i, i2);
        this.A00 = getLineCount();
        AnonymousClass0fD.A0D(-426897255, A06);
    }

    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.Hk7, java.lang.Object] */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        2V1 r3;
        super.onTextChanged(charSequence, i, i2, i3);
        AtomicReference atomicReference = this.A04;
        if (atomicReference != null) {
            atomicReference.set(charSequence);
        }
        2Sg r2 = this.A03;
        if (r2 != null) {
            String charSequence2 = charSequence.toString();
            ? obj = new Object();
            obj.A00 = this;
            obj.A01 = charSequence2;
            r2.A00(obj);
        }
        int lineCount = getLineCount();
        int i4 = this.A00;
        if (i4 != -1 && i4 != lineCount && (r3 = this.A02) != null && r3.A01 != null) {
            r3.A0C(new C294145lv(new Object[0], 0), "updateState:TextInput.remeasureForUpdatedText");
        }
    }

    public final boolean onTextContextMenuItem(int i) {
        return super.onTextContextMenuItem(i);
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return false;
    }
}
