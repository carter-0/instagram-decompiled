package X;

import android.graphics.Matrix;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.util.List;

public final class Q8n extends ViewStructure {
    public int A00 = -1;
    public int A01;
    public int A02 = 0;
    public ViewStructure.HtmlInfo A03;
    public AutofillValue A04;
    public CharSequence A05;
    public String A06;
    public boolean A07;
    public CharSequence[] A08;
    public String[] A09;
    public final List A0A = AnonymousClass7TE.A1C();

    public final int addChildCount(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Q8n q8n = new Q8n();
            q8n.A06 = this.A06;
            this.A0A.add(q8n);
        }
        return this.A0A.size();
    }

    public final void asyncCommit() {
    }

    public final AutofillId getAutofillId() {
        return null;
    }

    public final Bundle getExtras() {
        return null;
    }

    public final CharSequence getText() {
        return null;
    }

    public final int getTextSelectionEnd() {
        return 0;
    }

    public final int getTextSelectionStart() {
        return 0;
    }

    public final boolean hasExtras() {
        return false;
    }

    public final void setAccessibilityFocused(boolean z) {
    }

    public final void setActivated(boolean z) {
    }

    public final void setAlpha(float f) {
    }

    public final void setAutofillId(AutofillId autofillId) {
    }

    public final void setCheckable(boolean z) {
    }

    public final void setChecked(boolean z) {
    }

    public final void setChildCount(int i) {
    }

    public final void setClassName(String str) {
    }

    public final void setClickable(boolean z) {
    }

    public final void setContentDescription(CharSequence charSequence) {
    }

    public final void setContextClickable(boolean z) {
    }

    public final void setDataIsSensitive(boolean z) {
    }

    public final void setElevation(float f) {
    }

    public final void setEnabled(boolean z) {
    }

    public final void setFocusable(boolean z) {
    }

    public final void setId(int i, String str, String str2, String str3) {
    }

    public final void setInputType(int i) {
    }

    public final void setLocaleList(LocaleList localeList) {
    }

    public final void setLongClickable(boolean z) {
    }

    public final void setOpaque(boolean z) {
    }

    public final void setSelected(boolean z) {
    }

    public final void setText(CharSequence charSequence) {
    }

    public final void setText(CharSequence charSequence, int i, int i2) {
    }

    public final void setTextLines(int[] iArr, int[] iArr2) {
    }

    public final void setTextStyle(float f, int i, int i2, int i3) {
    }

    public final void setTransformation(Matrix matrix) {
    }

    public final ViewStructure asyncNewChild(int i) {
        Q8n q8n = new Q8n();
        q8n.A06 = this.A06;
        return q8n;
    }

    public final int getChildCount() {
        return this.A0A.size();
    }

    public final CharSequence getHint() {
        return this.A05;
    }

    public final ViewStructure newChild(int i) {
        Q8n q8n = new Q8n();
        q8n.A06 = this.A06;
        this.A0A.add(i, q8n);
        return q8n;
    }

    public final ViewStructure.HtmlInfo.Builder newHtmlInfoBuilder(String str) {
        return new Q8l();
    }

    public final void setAutofillHints(String[] strArr) {
        this.A09 = strArr;
    }

    public final void setAutofillOptions(CharSequence[] charSequenceArr) {
        this.A08 = charSequenceArr;
    }

    public final void setAutofillType(int i) {
        this.A00 = i;
    }

    public final void setAutofillValue(AutofillValue autofillValue) {
        this.A04 = autofillValue;
    }

    public final void setFocused(boolean z) {
        this.A07 = z;
    }

    public final void setHint(CharSequence charSequence) {
        this.A05 = charSequence;
    }

    public final void setHtmlInfo(ViewStructure.HtmlInfo htmlInfo) {
        this.A03 = htmlInfo;
    }

    public final void setVisibility(int i) {
        this.A02 = i;
    }

    public final void setWebDomain(String str) {
        this.A06 = str;
    }

    public final void setAutofillId(AutofillId autofillId, int i) {
        this.A01 = i;
    }

    public final void setDimens(int i, int i2, int i3, int i4, int i5, int i6) {
    }
}
