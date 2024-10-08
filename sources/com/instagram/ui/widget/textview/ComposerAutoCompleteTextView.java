package com.instagram.ui.widget.textview;

import X.0Tu;
import X.0eO;
import X.0qQ;
import X.182;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass7J7;
import X.AnonymousClass7J8;
import X.AnonymousClass9B9;
import X.C294425mQ;
import X.C294435mR;
import X.C294445mS;
import X.C328897Gr;
import X.C329067Hl;
import X.C329307Ij;
import X.C331337Qp;
import X.OED;
import X.PZG;
import X.Y8n;
import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class ComposerAutoCompleteTextView extends IgAutoCompleteTextView {
    public AnonymousClass7J8 A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public Y8n A04;
    public final Set A05 = new HashSet();
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A00(0eO.A04, C294445mS.A00);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerAutoCompleteTextView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    public final void A03(CharSequence charSequence) {
        this.A08 = false;
        for (C331337Qp r1 : this.A05) {
            r1.A02 = true;
        }
        if (!(charSequence == null || charSequence.length() == 0)) {
            C294435mR.A00(this, this.A05, charSequence, this.A02);
        }
        this.A08 = true;
    }

    public final void A04(CharSequence charSequence) {
        0qQ.A0B(charSequence, 0);
        this.A08 = false;
        if (this.A01) {
            for (C331337Qp r1 : this.A05) {
                r1.A02 = true;
            }
            boolean z = this.A02;
            if (charSequence.length() != 0) {
                this.A06 = getCurrentTagOrUserName();
                C294435mR.A01(this, this.A05, charSequence, true, z);
            }
        }
        this.A08 = true;
    }

    public final void addTextChangedListener(TextWatcher textWatcher) {
        0qQ.A0B(textWatcher, 0);
        super.addTextChangedListener(textWatcher);
        if (textWatcher instanceof C331337Qp) {
            this.A05.add(textWatcher);
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        0qQ.A0B(editorInfo, 0);
        boolean z = this.A03;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (!z) {
            int i = editorInfo.imeOptions;
            int i2 = i & 255;
            if ((i2 & 4) != 0) {
                int i3 = i2 ^ i;
                editorInfo.imeOptions = i3;
                i = i3 | 4;
                editorInfo.imeOptions = i;
            }
            if ((1073741824 & i) != 0) {
                editorInfo.imeOptions = i & -1073741825;
            }
        }
        return onCreateInputConnection;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r1 == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onKeyPreIme(int r6, android.view.KeyEvent r7) {
        /*
            r5 = this;
            r4 = 1
            X.0qQ.A0B(r7, r4)
            r3 = 0
            r0 = 4
            if (r6 != r0) goto L_0x003e
            int r0 = r7.getAction()
            if (r0 != r4) goto L_0x003e
            java.util.ArrayList r0 = r5.getBackPressListeners()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x003e
            java.util.ArrayList r0 = r5.getBackPressListeners()
            java.util.Iterator r2 = r0.iterator()
            X.0qQ.A07(r2)
            r1 = 0
        L_0x0026:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r2.next()
            X.7Gr r0 = (X.C328897Gr) r0
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.onBackPressed()
            if (r0 != r4) goto L_0x0026
            r1 = 1
            goto L_0x0026
        L_0x003c:
            if (r1 != 0) goto L_0x0044
        L_0x003e:
            boolean r0 = super.onKeyPreIme(r6, r7)
            if (r0 == 0) goto L_0x0045
        L_0x0044:
            r3 = 1
        L_0x0045:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.textview.ComposerAutoCompleteTextView.onKeyPreIme(int, android.view.KeyEvent):boolean");
    }

    private final ArrayList getBackPressListeners() {
        return (ArrayList) this.A06.getValue();
    }

    public final boolean enoughToFilter() {
        C294425mQ r2 = this.A05;
        if (r2 == null) {
            r2 = C294425mQ.MENTION_AND_HASHTAG;
        }
        return C294435mR.A04(this, r2, this.A02, this.A02);
    }

    public String getCurrentTagOrUserName() {
        return C294435mR.A03(this, this.A05, this.A02);
    }

    public final boolean getShouldDelayReplaceTextToClickHandling() {
        return this.A01;
    }

    public final boolean getShouldEnableMetaAIAutoPopupParsing() {
        return this.A02;
    }

    public final void replaceText(CharSequence charSequence) {
        if (!this.A01) {
            A03(charSequence);
        }
    }

    public final CharSequence A00(Object obj) {
        CharSequence convertSelectionToString = convertSelectionToString(obj);
        if (convertSelectionToString == null) {
            return "";
        }
        return convertSelectionToString;
    }

    public final void A01(C328897Gr r2) {
        getBackPressListeners().add(r2);
    }

    public final void A02(C328897Gr r2) {
        getBackPressListeners().remove(r2);
    }

    public final boolean onTextContextMenuItem(int i) {
        AnonymousClass7J8 r0;
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
        if (i == 16908322 && (r0 = this.A00) != null) {
            AnonymousClass7J7 r02 = (AnonymousClass7J7) r0;
            C329067Hl r6 = r02.A01;
            FragmentActivity fragmentActivity = r02.A00;
            String trim = r6.A0b.A0Y.A00.trim();
            StringBuilder sb = new StringBuilder(64);
            AnonymousClass9B9.A00();
            sb.append(fragmentActivity.getString(2131960442));
            String obj = sb.toString();
            if (trim.indexOf(obj) != -1) {
                if (182.A06(0Tu.A05, r6.A1Z, 36330827709170458L)) {
                    C329307Ij r3 = r6.A0b;
                    r3.A0E = true;
                    C331337Qp r03 = r3.A0A;
                    if (r03 != null) {
                        r03.A03 = true;
                    }
                    OED oed = new OED(r6, trim, obj);
                    r3.A0Y.A00 = "";
                    r3.A0S.post(new PZG(oed, r3));
                }
            }
        }
        return onTextContextMenuItem;
    }

    public final void removeTextChangedListener(TextWatcher textWatcher) {
        super.removeTextChangedListener(textWatcher);
        if (textWatcher instanceof C331337Qp) {
            this.A05.remove(textWatcher);
        }
    }

    public final void setSelectionListener(Y8n y8n) {
        this.A04 = y8n;
    }

    public final void setShouldDelayReplaceTextToClickHandling(boolean z) {
        this.A01 = z;
    }

    public final void setShouldEnableMetaAIAutoPopupParsing(boolean z) {
        this.A02 = z;
    }

    public final void setShowNewLineButtonInKeyboard(boolean z) {
        this.A03 = z;
    }

    public final void setTextPasteListener(AnonymousClass7J8 r1) {
        this.A00 = r1;
    }

    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        0qQ.A0B(attributeSet, 2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        0qQ.A0B(attributeSet, 2);
    }
}
