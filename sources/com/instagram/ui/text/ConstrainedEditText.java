package com.instagram.ui.text;

import X.05Q;
import X.0nA;
import X.0qQ;
import X.0sv;
import X.AnonymousClass0fD;
import X.AnonymousClass9UU;
import X.C2364933y;
import X.C252213ok;
import X.C358588b9;
import X.C379299Th;
import X.C70572Rz;
import android.content.Context;
import android.text.Editable;
import android.text.Layout;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ConstrainedEditText extends EditText implements C252213ok {
    public int A00;
    public int A01;
    public boolean A02;
    public float A03;
    public int A04;
    public boolean A05;
    public String[] A06;
    public final List A07;

    public ConstrainedEditText(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        0qQ.A0B(editorInfo, 0);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C70572Rz.A00().AMD(editorInfo, onCreateInputConnection, this);
        String[] strArr = this.A06;
        if (strArr == null || strArr.length == 0 || onCreateInputConnection == null) {
            return onCreateInputConnection;
        }
        AnonymousClass9UU r0 = new AnonymousClass9UU(this);
        editorInfo.contentMimeTypes = strArr;
        return new 05Q(onCreateInputConnection, new C379299Th(r0));
    }

    public final void setSupportedContentMimeTypes(String... strArr) {
        0qQ.A0B(strArr, 0);
        this.A06 = (String[]) new ArrayList(new 0sv(strArr, false)).toArray(new String[0]);
    }

    public final void DMr(int i, boolean z) {
        if (i > 0) {
            Editable text = getText();
            if (!(text == null || text.length() == 0)) {
                setSelection(getText().length());
            }
        } else if (i < this.A04) {
            clearFocus();
            for (C358588b9 DMp : this.A07) {
                DMp.DMp();
            }
        }
        this.A05 = z;
        this.A04 = i;
        A00(this);
    }

    public static final void A00(ConstrainedEditText constrainedEditText) {
        int i;
        float f;
        float f2;
        if (constrainedEditText.isLaidOut() && constrainedEditText.getLayout() != null) {
            Context context = constrainedEditText.getContext();
            0qQ.A07(context);
            int A08 = 0nA.A08(context);
            int i2 = constrainedEditText.A01;
            int i3 = (A08 - i2) - constrainedEditText.A00;
            if (constrainedEditText.A05) {
                i = constrainedEditText.A04;
            } else {
                i = 0;
            }
            int i4 = i3 - i;
            constrainedEditText.setY((float) (i2 + ((i4 - constrainedEditText.getHeight()) / 2)));
            if (constrainedEditText.A03 > 0.0f) {
                f = constrainedEditText.getScaleX() / constrainedEditText.A03;
                f2 = constrainedEditText.getScaleY() / constrainedEditText.A03;
            } else {
                f = 1.0f;
                f2 = 1.0f;
            }
            float min = Math.min(1.0f, ((float) i4) / ((float) constrainedEditText.getHeight()));
            constrainedEditText.A03 = min;
            constrainedEditText.setScaleX(min * f);
            constrainedEditText.setScaleY(constrainedEditText.A03 * f2);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00(this);
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int A062 = AnonymousClass0fD.A06(-86923528);
        super.onMeasure(i, i2);
        Editable text = getText();
        if (!(text == null || text.length() == 0)) {
            Layout layout = getLayout();
            if (layout != null) {
                i3 = layout.getHeight();
            } else {
                i3 = 0;
            }
            setMeasuredDimension(getMeasuredWidth(), i3 + getPaddingTop() + getPaddingBottom());
        }
        AnonymousClass0fD.A0D(-1144488127, A062);
    }

    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        List list = this.A07;
        if (list != null && this.A02) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((C358588b9) list.get(i3)).Diq(this, i, i2);
            }
        }
    }

    public void setKeyListener(KeyListener keyListener) {
        C70572Rz.A00().AMI(keyListener, this);
        super.setKeyListener(keyListener);
    }

    public ConstrainedEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A07 = new ArrayList();
        this.A03 = -1.0f;
        this.A02 = true;
        C2364933y A002 = C70572Rz.A00();
        KeyListener keyListener = getKeyListener();
        A002.AMI(keyListener, this);
        super.setKeyListener(keyListener);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConstrainedEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ConstrainedEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
