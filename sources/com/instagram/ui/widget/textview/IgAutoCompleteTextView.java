package com.instagram.ui.widget.textview;

import X.05Q;
import X.0mq;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass4DR;
import X.AnonymousClass7JD;
import X.C294425mQ;
import X.C294435mR;
import X.C3268478j;
import X.C379299Th;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleAutoCompleteTextView;
import java.util.ArrayList;
import java.util.List;

public class IgAutoCompleteTextView extends IgSimpleAutoCompleteTextView {
    public float A00;
    public int A01;
    public int A02 = 2;
    public AnonymousClass4DR A03;
    public C3268478j A04;
    public C294425mQ A05 = C294425mQ.MENTION_AND_HASHTAG;
    public String A06;
    public boolean A07;
    public boolean A08 = true;
    public boolean A09;
    public AnonymousClass7JD A0A;
    public String[] A0B;
    public final List A0C = new ArrayList();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgAutoCompleteTextView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        A00();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        0qQ.A0B(editorInfo, 0);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        String[] strArr = this.A0B;
        AnonymousClass7JD r2 = this.A0A;
        if (onCreateInputConnection == null || r2 == null || strArr == null || strArr.length <= 0) {
            return onCreateInputConnection;
        }
        editorInfo.contentMimeTypes = strArr;
        return new 05Q(onCreateInputConnection, new C379299Th(r2));
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        try {
            super.onDraw(canvas);
        } catch (IndexOutOfBoundsException e) {
            Editable text = getText();
            0qQ.A07(text);
            if (!0mq.A06(this, text)) {
                throw e;
            }
        }
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        AnonymousClass4DR r0;
        0qQ.A0B(keyEvent, 1);
        if (i == 4 && (r0 = this.A03) != null && r0.onBackPressed()) {
            return true;
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public final void setSupportedLinks(C294425mQ r2) {
        0qQ.A0B(r2, 0);
        this.A05 = r2;
    }

    private final void A00() {
        String str = Build.MODEL;
        if (str != null && str.equalsIgnoreCase("DROID3")) {
            return;
        }
        if (str != null && str.equalsIgnoreCase("DROID4")) {
            return;
        }
        if (str == null || !str.equalsIgnoreCase("DROID BIONIC")) {
            this.A00 = 0.0f;
            this.A01 = getResources().getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
            setRawInputType(getInputType() & -65537);
            setImeOptions(33554432 | getImeOptions());
        }
    }

    public boolean enoughToFilter() {
        C294425mQ r2 = this.A05;
        if (r2 == null) {
            r2 = C294425mQ.MENTION_AND_HASHTAG;
        }
        return C294435mR.A04(this, r2, this.A02, false);
    }

    public String getCurrentTagOrUserName() {
        return C294435mR.A03(this, this.A05, false);
    }

    public final int getDropDownItemHeight() {
        return this.A01;
    }

    public final List getMentionInsertedListeners() {
        return this.A0C;
    }

    public final int getMinNumToFilter() {
        return this.A02;
    }

    public final String getMostRecentlyReplacedUserOrHashtagString() {
        return this.A06;
    }

    public final C294425mQ getSupportedLinks() {
        return this.A05;
    }

    public final void onFilterComplete(int i) {
        int i2;
        super.onFilterComplete(Math.max(i, this.A07 ? 1 : 0));
        if (this.A00 > 0.0f) {
            float f = this.A00;
            if (((float) getAdapter().getCount()) <= f) {
                i2 = -2;
            } else {
                i2 = (int) (f * ((float) this.A01));
            }
            setDropDownHeight(i2);
        }
        if (this.A07) {
            i = Math.max(i, 1);
        }
        if (!this.A09 && i > 0) {
            this.A09 = true;
            C3268478j r0 = this.A04;
            if (r0 != null) {
                r0.DB8();
            }
        }
    }

    public final void performFiltering(CharSequence charSequence, int i) {
        if (this.A08) {
            super.performFiltering(getCurrentTagOrUserName(), i);
        }
    }

    public void replaceText(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            this.A06 = getCurrentTagOrUserName();
            C294435mR.A00(this, this.A05, charSequence, false);
        }
    }

    public final void setInputContentInfoListener(String[] strArr, AnonymousClass7JD r2) {
        this.A0B = strArr;
        this.A0A = r2;
    }

    public final void dismissDropDown() {
        super.dismissDropDown();
        this.A09 = false;
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-827513420);
        this.A04 = null;
        super.onDetachedFromWindow();
        AnonymousClass0fD.A0D(-239219572, A062);
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int A062 = AnonymousClass0fD.A06(1170619059);
        super.onFocusChanged(z, i, rect);
        if (this.A07 && z && enoughToFilter() && getWindowVisibility() == 0) {
            showDropDown();
        }
        AnonymousClass0fD.A0D(-1284095498, A062);
    }

    public final void setAlwaysShowWhenEnoughToFilter(boolean z) {
        this.A07 = z;
    }

    public final void setBackHandler(AnonymousClass4DR r1) {
        this.A03 = r1;
    }

    public final void setDropDownCustomHeight(int i) {
        setDropDownHeight(i);
    }

    public final void setDropdownDisplayedListener(C3268478j r1) {
        this.A04 = r1;
    }

    public final void setEnableFiltering(boolean z) {
        this.A08 = z;
    }

    public final void setMinNumToFilter(int i) {
        this.A02 = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A00();
    }
}
