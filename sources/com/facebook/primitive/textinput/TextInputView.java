package com.facebook.primitive.textinput;

import X.03v;
import X.05Q;
import X.0qQ;
import X.AnonymousClass0u3;
import X.C11613SdG;
import X.C13426TaC;
import X.C13427TaD;
import X.TaE;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class TextInputView extends EditText implements C13427TaD {
    public C13426TaC A00;
    public TaE A01;
    public String[] A02;
    public boolean A03;

    public /* synthetic */ TextInputView(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        super(context, (AttributeSet) null);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArr;
        0qQ.A0B(editorInfo, 0);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C13426TaC taC = this.A00;
        if (onCreateInputConnection == null || taC == null || ((strArr = this.A02) != null && strArr.length == 0)) {
            return onCreateInputConnection;
        }
        editorInfo.contentMimeTypes = strArr;
        05Q r2 = new 05Q(onCreateInputConnection, new AnonymousClass0u3(this));
        03v.A0C(this, new C11613SdG(taC), this.A02);
        return r2;
    }

    public final boolean A00() {
        if (Build.VERSION.SDK_INT >= 29) {
            return isSingleLine();
        }
        return this.A03;
    }

    public final TaE getSelectionChangedListener$fbandroid_libraries_rendercore_rendercore_primitive_components_textinput_textinput() {
        return null;
    }

    public void setAllowedContentTypes(String[] strArr) {
        this.A02 = strArr;
    }

    public void setContentCommittedListener(C13426TaC taC) {
        this.A00 = taC;
    }

    public final void setSelectionChangedListener$fbandroid_libraries_rendercore_rendercore_primitive_components_textinput_textinput(TaE taE) {
        this.A01 = taE;
    }

    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
    }

    public final void setSelection(int i, int i2) {
        int length = length();
        if (i > length) {
            i = length;
        }
        int length2 = length();
        if (i2 > length2) {
            i2 = length2;
        }
        super.setSelection(i, i2);
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
        this.A03 = z;
    }

    public TextInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setSelection(int i) {
        int length = length();
        if (i > length) {
            i = length;
        }
        super.setSelection(i);
    }

    public TextInputView(Context context) {
        super(context, (AttributeSet) null);
    }
}
