package X;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: X.Vkj  reason: case insensitive filesystem */
public final class C18060Vkj {
    public final EditText A00;
    public final VL0 A01;

    public final KeyListener A00(KeyListener keyListener) {
        boolean z = keyListener instanceof NumberKeyListener;
        if (!(!z)) {
            return keyListener;
        }
        KeyListener keyListener2 = keyListener;
        if (keyListener instanceof W7p) {
            return keyListener2;
        }
        if (keyListener == null) {
            return null;
        }
        if (!z) {
            return new W7p(keyListener);
        }
        return keyListener2;
    }

    public final InputConnection A01(EditorInfo editorInfo, InputConnection inputConnection) {
        VL0 vl0 = this.A01;
        if (inputConnection == null) {
            return null;
        }
        C18430VrZ vrZ = vl0.A00;
        if (!(inputConnection instanceof U41)) {
            return new U41(editorInfo, inputConnection, vrZ.A00);
        }
        return inputConnection;
    }

    /* JADX INFO: finally extract failed */
    public final void A02(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.A00.getContext().obtainStyledAttributes(attributeSet, AnonymousClass2Z3.A08, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            A03(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void A03(boolean z) {
        W7m w7m = this.A01.A00.A01;
        if (w7m.A01 != z) {
            if (w7m.A00 != null) {
                C13993Tnu A002 = C13993Tnu.A00();
                C271074hr r2 = w7m.A00;
                02V.A03(r2, "initCallback cannot be null");
                ReadWriteLock readWriteLock = A002.A06;
                readWriteLock.writeLock().lock();
                try {
                    A002.A05.remove(r2);
                } finally {
                    C13988Tno.A1V(readWriteLock);
                }
            }
            w7m.A01 = z;
            if (z) {
                W7m.A00(w7m.A02, C13993Tnu.A00().A01());
            }
        }
    }

    public C18060Vkj(EditText editText) {
        this.A00 = editText;
        this.A01 = new VL0(editText);
    }
}
