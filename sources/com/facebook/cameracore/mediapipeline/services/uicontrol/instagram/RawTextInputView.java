package com.facebook.cameracore.mediapipeline.services.uicontrol.instagram;

import X.AnonymousClass8G3;
import X.AnonymousClass9Xw;
import X.C301595zc;
import X.C301605zd;
import X.C301615ze;
import X.C301625zf;
import X.C301635zg;
import X.C301645zh;
import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class RawTextInputView extends EditText {
    public InputMethodManager A00;
    public C301645zh A01;
    public AnonymousClass8G3 A02;
    public C301615ze A03;
    public C301605zd A04;
    public boolean A05;

    private void A00(Context context) {
        setInputType(16385);
        setSingleLine();
        setEnabled(false);
        setVisibility(8);
        setImeOptions(6);
        setTextInteractionListener(new C301595zc(this));
        setOnEditorActionListener(new C301625zf(this));
        this.A01 = new C301635zg(this);
        this.A00 = (InputMethodManager) context.getSystemService("input_method");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r1 = (X.AnonymousClass8G2) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r3 = this;
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x0031
            r2 = 0
            r3.A05 = r2
            X.8G3 r1 = r3.A02
            if (r1 == 0) goto L_0x0017
            X.8G2 r1 = (X.AnonymousClass8G2) r1
            X.B1r r0 = r1.A02
            if (r0 == 0) goto L_0x0017
            r0.onExit()
            r0 = 0
            r1.A02 = r0
        L_0x0017:
            r3.setEnabled(r2)
            r3.clearFocus()
            r3.setFocusable(r2)
            r3.setFocusableInTouchMode(r2)
            r0 = 8
            r3.setVisibility(r0)
            android.view.inputmethod.InputMethodManager r1 = r3.A00
            android.os.IBinder r0 = r3.getWindowToken()
            r1.hideSoftInputFromWindow(r0, r2)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.uicontrol.instagram.RawTextInputView.A01():void");
    }

    public void setTextInteractionListener(C301605zd r2) {
        C301615ze r0 = this.A03;
        if (r2 == null) {
            if (r0 != null) {
                removeTextChangedListener(r0);
                this.A03 = null;
            }
        } else if (r0 == null) {
            C301615ze r02 = new C301615ze(this);
            this.A03 = r02;
            addTextChangedListener(r02);
        }
        this.A04 = r2;
    }

    public RawTextInputView(Context context) {
        super(context);
        A00(context);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        getImeOptions();
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null) {
            return new AnonymousClass9Xw(onCreateInputConnection, this);
        }
        return onCreateInputConnection;
    }

    public void setOnDeleteKeyListener(C301645zh r1) {
        this.A01 = r1;
    }

    public void setRawTextInputListener(AnonymousClass8G3 r1) {
        this.A02 = r1;
    }

    public RawTextInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }

    public RawTextInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }
}
