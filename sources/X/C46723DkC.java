package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.instagram.android.R;
import com.instagram.ui.widget.searchedittext.SearchWithDeleteEditText;

/* renamed from: X.DkC  reason: case insensitive filesystem */
public final class C46723DkC extends AnonymousClass3Tj implements G5F {
    public G6W A00;
    public boolean A01;
    public boolean A02 = true;
    public final Runnable A03 = new C51295Fro(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46723DkC(Context context) {
        super(context, (AttributeSet) null, R.attr.TokenTextViewPillStyle);
        0qQ.A0B(context, 1);
        A00(AnonymousClass7TE.A0S(this));
        A00(context);
    }

    private final void A00(Context context) {
        super.setClickable(true);
        super.setFocusable(true);
        super.setFocusableInTouchMode(true);
        super.setOnTouchListener(new C50113FPd(this, 6));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C71382cm.A2K);
        0qQ.A07(obtainStyledAttributes);
        this.A02 = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    public final boolean onCheckIsTextEditor() {
        return true;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        0qQ.A0B(editorInfo, 0);
        editorInfo.inputType = 0;
        return new C46705Djb(new C46704Dja(this), this);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        0qQ.A0B(keyEvent, 1);
        G6W g6w = this.A00;
        if (g6w != null) {
            if (keyEvent.getKeyCode() == 67) {
                g6w.D8H(this);
            } else {
                C50423FbW fbW = ((C51009Fmw) g6w).A00;
                C50423FbW.A01(fbW);
                SearchWithDeleteEditText searchWithDeleteEditText = fbW.A07;
                searchWithDeleteEditText.requestFocus();
                searchWithDeleteEditText.dispatchKeyEvent(keyEvent);
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        G6W g6w;
        0qQ.A0B(accessibilityEvent, 0);
        if (accessibilityEvent.getEventType() == 1 && this.A01 && (g6w = this.A00) != null) {
            g6w.D8H(this);
        }
        super.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int A06 = AnonymousClass0fD.A06(252680800);
        super.onFocusChanged(z, i, rect);
        if (!isLayoutRequested()) {
            this.A03.run();
        }
        AnonymousClass0fD.A0D(-1681938911, A06);
    }

    public final void setOnDeleteKeyListener(G6W g6w) {
        this.A00 = g6w;
    }

    public final void setShouldShowX(boolean z) {
        this.A02 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46723DkC(Context context, int i) {
        super(context, (AttributeSet) null, R.attr.TokenTextViewPillStyleRedesign);
        0qQ.A0B(context, 1);
        A00(AnonymousClass7TE.A0S(this));
        A00(context);
    }
}
