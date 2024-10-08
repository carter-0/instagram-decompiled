package com.instagram.ui.widget.searchedittext;

import X.0Tu;
import X.0mk;
import X.0nA;
import X.0oh;
import X.0qQ;
import X.1AW;
import X.2Yu;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass37O;
import X.AnonymousClass3HA;
import X.AnonymousClass4D6;
import X.AnonymousClass61R;
import X.AnonymousClass61W;
import X.AnonymousClass61X;
import X.AnonymousClass6A9;
import X.AnonymousClass87E;
import X.AnonymousClass8Z4;
import X.AnonymousClass9B2;
import X.C14137TqX;
import X.C14437TwL;
import X.C15825Uj8;
import X.C19768Wf9;
import X.C19769WfA;
import X.C20859X1l;
import X.C20860X1m;
import X.C20861X1n;
import X.C22539Y8k;
import X.C22540Y8l;
import X.C2364933y;
import X.C303756Aq;
import X.C49951FGg;
import X.C50116FPg;
import X.C51006Fmt;
import X.C51294Frn;
import X.C67398MnF;
import X.C69287Nin;
import X.C70572Rz;
import X.C71382cm;
import X.C74284PsC;
import X.FPZ;
import X.G5H;
import X.MT6;
import X.X5H;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.widget.search.SearchController;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class SearchEditText extends EditText implements TextView.OnEditorActionListener {
    public Drawable A00;
    public Drawable A01;
    public Drawable A02;
    public LayerDrawable A03;
    public LayerDrawable A04;
    public AnonymousClass61R A05;
    public AnonymousClass61R A06;
    public X5H A07;
    public C20859X1l A08;
    public C20860X1m A09;
    public C20861X1n A0A;
    public MT6 A0B;
    public AnonymousClass8Z4 A0C;
    public G5H A0D;
    public C74284PsC A0E;
    public AnonymousClass87E A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public Drawable A0Q;
    public Drawable A0R;
    public Drawable A0S;
    public InputMethodManager A0T;
    public C22539Y8k A0U;
    public C22540Y8l A0V;
    public AnonymousClass61X A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public Drawable[] A0g;
    public final ViewTreeObserver.OnGlobalLayoutListener A0h;
    public final C2364933y A0i;
    public final boolean A0j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SearchEditText(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        setFocusableInTouchMode(true);
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if ((!this.A0I || !this.A0H || this.A00 == null || !this.A0W.A05(motionEvent)) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        0qQ.A0B(editorInfo, 0);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.A0b) {
            int i = editorInfo.imeOptions;
            int i2 = i & 255;
            if ((i2 & 3) != 0) {
                int i3 = i2 ^ i;
                editorInfo.imeOptions = i3;
                i = i3 | 3;
                editorInfo.imeOptions = i;
            }
            if ((1073741824 & i) != 0) {
                editorInfo.imeOptions = i & -1073741825;
            }
        }
        this.A0i.AMD(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int keyCode;
        boolean z = false;
        if (i != 3 && i != 5 && i != 6) {
            return false;
        }
        A04();
        AnonymousClass8Z4 r3 = this.A0C;
        if (keyEvent != null && ((keyCode = keyEvent.getKeyCode()) == 23 || keyCode == 66 || keyCode == 160)) {
            z = true;
        }
        if (r3 != null && !z) {
            r3.onSearchSubmitted(this, getSearchString());
        }
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        0qQ.A0B(keyEvent, 1);
        if (keyEvent.getAction() == 0 && (i == 23 || i == 66 || i == 160)) {
            Editable text = getText();
            if (!(text == null || text.length() == 0)) {
                A04();
                AnonymousClass8Z4 r1 = this.A0C;
                if (r1 != null) {
                    r1.onSearchSubmitted(this, getSearchString());
                }
            }
            G5H g5h = this.A0D;
            if (g5h != null) {
                ((C51006Fmt) g5h).A00.A07.A04();
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        0qQ.A0B(charSequence, 0);
        super.onTextChanged(charSequence, i, i2, i3);
        AnonymousClass8Z4 r0 = this.A0C;
        if (r0 != null) {
            r0.onSearchTextChanged(this, charSequence, i, i2, i3);
        }
    }

    public static final LayerDrawable A00(SearchEditText searchEditText, boolean z) {
        Drawable drawable = searchEditText.A00;
        Drawable drawable2 = searchEditText.A02;
        Drawable drawable3 = searchEditText.A01;
        if (drawable == null || drawable2 == null || drawable3 == null) {
            return null;
        }
        if (!z) {
            drawable3 = drawable2;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable3, drawable});
        int dimensionPixelSize = searchEditText.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        int intrinsicWidth = drawable.getIntrinsicWidth() + dimensionPixelSize;
        int intrinsicWidth2 = dimensionPixelSize + drawable2.getIntrinsicWidth();
        int intrinsicHeight = (drawable2.getIntrinsicHeight() - drawable.getIntrinsicHeight()) / 2;
        layerDrawable.setLayerInset(0, intrinsicWidth, 0, 0, 0);
        layerDrawable.setLayerInset(1, 0, intrinsicHeight, intrinsicWidth2, intrinsicHeight);
        layerDrawable.setLayerGravity(1, 16);
        return layerDrawable;
    }

    private final Drawable getEndDrawable() {
        if (this.A0Y) {
            return this.A0Q;
        }
        if (!this.A0P) {
            if (this.A0O) {
                if (this.A0I) {
                    if (this.A0d) {
                        return this.A03;
                    }
                    return this.A04;
                }
            } else if (this.A0I && this.A0H) {
                return this.A00;
            } else {
                if (this.A0c) {
                    return this.A0S;
                }
                return null;
            }
        }
        if (this.A0d) {
            return this.A01;
        }
        return this.A02;
    }

    private final Drawable getStartDrawable() {
        if (this.A0M) {
            return this.A05;
        }
        if (this.A0N) {
            return this.A06;
        }
        if (this.A0L) {
            return this.A0R;
        }
        if (this.A0X) {
            return this.A0g[0];
        }
        return null;
    }

    public final void A03() {
        MT6 mt6 = this.A0B;
        if (mt6 != null) {
            mt6.onSearchCleared(getSearchString());
        }
        setText("");
        requestFocus();
        A06();
    }

    public final void A04() {
        this.A0T.hideSoftInputFromWindow(getWindowToken(), 0);
        this.A0f = false;
        C74284PsC psC = this.A0E;
        if (psC != null) {
            ((SearchController) psC).A06 = false;
        }
    }

    public final void A05() {
        if (!this.A0a) {
            this.A0e = true;
        } else {
            requestFocus();
        }
    }

    public final void A06() {
        if (!this.A0a) {
            this.A0f = true;
            getViewTreeObserver().addOnGlobalLayoutListener(new C50116FPg(this));
        } else if (!this.A0T.showSoftInput(this, 0)) {
            post(new C51294Frn(this));
        } else {
            C74284PsC psC = this.A0E;
            if (psC != null) {
                ((SearchController) psC).A06 = true;
            }
        }
    }

    public final void A07(int i, int i2, boolean z, long j) {
        if (i > 0) {
            this.A0M = z;
        } else {
            this.A0N = z;
        }
        if (z && !this.A0Z) {
            Resources resources = getResources();
            setPadding(resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), 0, resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material), 0);
            this.A0Z = true;
        }
        A01(this);
        if (z) {
            setCompoundDrawablePadding(getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
            postDelayed(new C67398MnF(this, i, i2), j);
        }
    }

    public final void A08(boolean z) {
        this.A0L = z;
        if (z && !this.A0Z) {
            Resources resources = getResources();
            setPadding(resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), 0, resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material), 0);
            this.A0Z = true;
        }
        A01(this);
        if (z) {
            setCompoundDrawablePadding(getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
        }
    }

    public final void A09(boolean z) {
        this.A0c = z;
        if (z) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
            if (this.A0b) {
                0nA.A0h(this, dimensionPixelSize, dimensionPixelSize2);
            } else {
                setPadding(dimensionPixelSize, 0, dimensionPixelSize2, 0);
            }
        }
        A01(this);
    }

    public final boolean A0A(float f) {
        Drawable drawable = this.A0R;
        if (drawable == null) {
            return false;
        }
        if (this.A0K) {
            if (f > ((float) ((getWidth() - getPaddingRight()) - drawable.getIntrinsicWidth()))) {
                return true;
            }
            return false;
        } else if (f < ((float) (getPaddingLeft() + drawable.getIntrinsicWidth()))) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean A0B(float f) {
        Drawable drawable = this.A02;
        if (drawable == null) {
            return false;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (this.A0K) {
            if (f < ((float) (getPaddingLeft() + intrinsicWidth))) {
                return true;
            }
            return false;
        } else if (f > ((float) ((getWidth() - getPaddingRight()) - intrinsicWidth))) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean A0C(float f) {
        Drawable drawable = this.A0S;
        if (drawable == null) {
            return false;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (this.A0K) {
            if (f < ((float) (getPaddingLeft() + intrinsicWidth))) {
                return true;
            }
            return false;
        } else if (f > ((float) ((getWidth() - getPaddingRight()) - intrinsicWidth))) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean A0D(float f) {
        Drawable drawable = this.A00;
        if (drawable == null) {
            return false;
        }
        if (this.A0K) {
            if (f < ((float) (getPaddingLeft() + drawable.getIntrinsicWidth()))) {
                return true;
            }
            return false;
        } else if (f > ((float) ((getWidth() - getPaddingRight()) - drawable.getIntrinsicWidth()))) {
            return true;
        } else {
            return false;
        }
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        Object obj = this.A0W.A00;
        0qQ.A0C(obj, "null cannot be cast to non-null type android.view.accessibility.AccessibilityNodeProvider");
        return (AccessibilityNodeProvider) obj;
    }

    public final int getClearButtonHeight() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return 0;
    }

    public final int getClearButtonWidth() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return 0;
    }

    public final boolean getMetaAIButtonEnabled() {
        return this.A0L;
    }

    public final boolean getMetaAISendButtonEnabled() {
        return this.A0P;
    }

    public final C74284PsC getOnKeyboardListener() {
        return this.A0E;
    }

    public final void setAllowTextSelection(boolean z) {
        FPZ fpz;
        this.A0G = z;
        if (z) {
            fpz = null;
        } else {
            fpz = FPZ.A00;
        }
        setOnLongClickListener(fpz);
    }

    public final void setClearButtonAlpha(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.mutate().setAlpha(i);
        }
    }

    public final void setClearButtonColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.mutate().setColorFilter(colorFilter);
        }
    }

    public final void setClearButtonEnabled(boolean z) {
        this.A0H = z;
        A01(this);
    }

    public final void setDisableButtonsForIntegrity(boolean z) {
        this.A0d = z;
        A01(this);
    }

    public final void setEndEmojiButton(String str) {
        if (this.A0Q == null && str != null && str.length() != 0) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
            Drawable B0r = this.A0i.B0r(str, dimensionPixelSize);
            this.A0Q = B0r;
            if (B0r != null) {
                B0r.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            }
        }
    }

    public final void setEndEmojiButtonEnabled(boolean z) {
        this.A0Y = z;
        A01(this);
    }

    public void setKeyListener(KeyListener keyListener) {
        this.A0i.AMI(keyListener, this);
        super.setKeyListener(keyListener);
    }

    public final void setMetaAIClearButtonEnabled(boolean z) {
        this.A0H = z;
        if (z) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
            if (this.A0b) {
                0nA.A0h(this, dimensionPixelSize, dimensionPixelSize2);
            } else {
                setPadding(dimensionPixelSize, 0, dimensionPixelSize2, 0);
            }
        }
        A01(this);
    }

    public final void setMultiLineSearchBarEnabled(boolean z) {
        this.A0b = z;
        if (z) {
            setSingleLine(false);
            setMaxLines(5);
            setInputType(getInputType() | Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
            getViewTreeObserver().addOnGlobalLayoutListener(this.A0h);
            setMinHeight(getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size));
        }
    }

    public final void setSearchIconEnabled(boolean z) {
        this.A0X = z;
        A01(this);
    }

    public static final void A01(SearchEditText searchEditText) {
        Drawable startDrawable = searchEditText.getStartDrawable();
        Drawable[] drawableArr = searchEditText.A0g;
        searchEditText.setCompoundDrawablesRelative(startDrawable, drawableArr[1], searchEditText.getEndDrawable(), drawableArr[3]);
    }

    public static final void A02(SearchEditText searchEditText, boolean z, boolean z2) {
        int i;
        Context context = searchEditText.getContext();
        if (z2) {
            searchEditText.A02 = context.getDrawable(R.drawable.instagram_search_meta_ai_sparkle_send_icon);
            i = R.drawable.instagram_search_meta_ai_sparkle_send_icon_disabled;
        } else {
            searchEditText.A02 = context.getDrawable(R.drawable.instagram_search_meta_ai_send_icon);
            i = R.drawable.instagram_search_meta_ai_send_icon_disabled;
        }
        Drawable drawable = context.getDrawable(i);
        searchEditText.A01 = drawable;
        Drawable drawable2 = searchEditText.A02;
        if (z && drawable2 != null && drawable != null) {
            Resources resources = searchEditText.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.container_height);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ai_sticker_creation_suggested_prompt_pill_height);
            drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize2);
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize2);
        }
    }

    public final String getSearchString() {
        Editable text = getText();
        0qQ.A07(text);
        String obj = text.toString();
        int length = obj.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            int A002 = 0qQ.A00(obj.charAt(i2), 32);
            boolean z2 = false;
            if (A002 <= 0) {
                z2 = true;
            }
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (!z2) {
                z = true;
            } else {
                i++;
            }
        }
        return obj.subSequence(i, length + 1).toString();
    }

    public final CharSequence getStrippedText() {
        Editable text = getText();
        0qQ.A07(text);
        if (text.length() == 0) {
            return text;
        }
        char charAt = text.charAt(0);
        if (charAt == '@' || charAt == '#') {
            return text.subSequence(1, text.length());
        }
        return text;
    }

    public final CharSequence getTextForSearch() {
        Editable text = getText();
        if (text == null || text.length() == 0) {
            0qQ.A0A(text);
            return text;
        } else if (text.length() != 1) {
            return text;
        } else {
            char charAt = text.charAt(0);
            if (charAt == '@' || charAt == '#') {
                return "";
            }
            return text;
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A0a = true;
        if (this.A0e) {
            A05();
            this.A0e = false;
        }
        if (this.A0f) {
            this.A0f = false;
            A06();
        }
    }

    public final boolean onPreDraw() {
        boolean z = false;
        if (getSearchString().length() == 0) {
            z = true;
        }
        if (this.A0I != z) {
            return super.onPreDraw();
        }
        this.A0I = !z;
        A01(this);
        return false;
    }

    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        AnonymousClass87E r0 = this.A0F;
        if (r0 != null) {
            r0.Dir(this, i, i2);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int i;
        int i2;
        DirectShareTarget directShareTarget;
        int A052 = AnonymousClass0fD.A05(-555547317);
        0qQ.A0B(motionEvent, 0);
        Drawable drawable = this.A00;
        if (!this.A0I || !this.A0H || drawable == null || !A0D(motionEvent.getX())) {
            if (this.A0O && this.A0I && drawable != null) {
                float x = motionEvent.getX();
                Drawable drawable2 = this.A02;
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                if (drawable2 != null && (!this.A0K ? !(x <= ((float) ((((getWidth() - getPaddingRight()) - drawable2.getIntrinsicWidth()) - dimensionPixelSize) - drawable.getIntrinsicWidth())) || x >= ((float) (((getWidth() - getPaddingRight()) - drawable2.getIntrinsicWidth()) - dimensionPixelSize))) : !(x >= ((float) (getPaddingLeft() + drawable2.getIntrinsicWidth() + dimensionPixelSize + drawable.getIntrinsicWidth())) || x <= ((float) (getPaddingLeft() + drawable2.getIntrinsicWidth() + dimensionPixelSize))))) {
                    if (motionEvent.getAction() == 1) {
                        A03();
                        AnonymousClass61X r1 = this.A0W;
                        AccessibilityManager accessibilityManager = r1.A03;
                        accessibilityManager.getClass();
                        if (accessibilityManager.isEnabled()) {
                            r1.A02.performAccessibilityAction(64, (Bundle) null);
                        }
                    }
                    i2 = -1387543203;
                }
            }
            C20859X1l x1l = this.A08;
            if ((this.A0P || this.A0O) && !this.A0d && x1l != null && A0B(motionEvent.getX())) {
                onTouchEvent = this.A0j;
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        clearFocus();
                    }
                    i = 1153785678;
                }
                C19768Wf9 wf9 = (C19768Wf9) x1l;
                C14137TqX.A04(wf9.A00, wf9.A01.getSearchString());
                i = 1153785678;
            } else if (this.A0c && A0C(motionEvent.getX())) {
                if (motionEvent.getAction() == 1) {
                    C20860X1m x1m = this.A09;
                    if (x1m != null) {
                        C14437TwL twL = (C14437TwL) ((C19769WfA) x1m).A00.A0h.getValue();
                        if (twL.A00 == null) {
                            AnonymousClass9B2.A04.A00(twL.A04, new C15825Uj8(twL), (AnonymousClass4D6) null, 2);
                        } else {
                            FragmentActivity fragmentActivity = twL.A01;
                            Context applicationContext = fragmentActivity.getApplicationContext();
                            0qQ.A07(applicationContext);
                            UserSession userSession = twL.A04;
                            AnonymousClass9B2 r0 = twL.A00;
                            if (r0 != null) {
                                directShareTarget = r0.A00();
                            } else {
                                directShareTarget = null;
                            }
                            C49951FGg.A02(applicationContext, fragmentActivity, twL.A02, userSession, C69287Nin.IG_SEARCH, directShareTarget);
                        }
                    }
                    clearFocus();
                }
                i2 = 1239851888;
            } else if (this.A0G || !this.A0J) {
                X5H x5h = this.A07;
                if (!this.A0L || this.A0d || x5h == null || !A0A(motionEvent.getX())) {
                    onTouchEvent = super.onTouchEvent(motionEvent);
                    i = -1874112109;
                } else {
                    onTouchEvent = this.A0j;
                    if (onTouchEvent) {
                        if (motionEvent.getAction() == 1) {
                            clearFocus();
                        }
                        i = -762862784;
                    }
                    x5h.DRy();
                    i = -762862784;
                }
            } else {
                requestFocus();
                A06();
                i2 = -757782844;
            }
            AnonymousClass0fD.A0C(i, A052);
            return onTouchEvent;
        }
        if (motionEvent.getAction() == 1) {
            A03();
            AnonymousClass61X r12 = this.A0W;
            AccessibilityManager accessibilityManager2 = r12.A03;
            accessibilityManager2.getClass();
            if (accessibilityManager2.isEnabled()) {
                r12.A02.performAccessibilityAction(64, (Bundle) null);
            }
        }
        i2 = 910530848;
        AnonymousClass0fD.A0C(i2, A052);
        return true;
    }

    public final void setEndEmojiListener(C22539Y8k y8k) {
        this.A0U = y8k;
    }

    public final void setFocusOnTouchEnabled(boolean z) {
        this.A0J = z;
    }

    public final void setMetaAIButtonListener(X5H x5h) {
        this.A07 = x5h;
    }

    public final void setMetaAISendButtonListener(C20859X1l x1l) {
        this.A08 = x1l;
    }

    public final void setMetaAIVoiceButtonListener(C20860X1m x1m) {
        this.A09 = x1m;
    }

    public final void setOnFilterTextListener(AnonymousClass8Z4 r1) {
        this.A0C = r1;
    }

    public final void setOnKeyboardListener(C74284PsC psC) {
        this.A0E = psC;
    }

    public final void setOnSelectionChangedListener(AnonymousClass87E r1) {
        this.A0F = r1;
    }

    public final void setSearchBarHeightChangedListener(C20861X1n x1n) {
        this.A0A = x1n;
    }

    public final void setSearchClearListener(MT6 mt6) {
        this.A0B = mt6;
    }

    public final void setSearchEnterKeyListener(G5H g5h) {
        this.A0D = g5h;
    }

    public final void setSearchIconColorStateList(ColorStateList colorStateList) {
        setCompoundDrawableTintList(colorStateList);
    }

    public final void setTextPasteListener(C22540Y8l y8l) {
        this.A0V = y8l;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.EditTextStyle);
        boolean z;
        Drawable mutate;
        0qQ.A0B(context, 1);
        C2364933y A002 = C70572Rz.A00();
        0qQ.A07(A002);
        this.A0i = A002;
        this.A0J = true;
        this.A0X = true;
        this.A0H = true;
        0Tu r8 = 0Tu.A05;
        this.A0j = 1AW.A06(r8, 18312877261732159L);
        this.A0h = new AnonymousClass6A9(this);
        KeyListener keyListener = getKeyListener();
        A002.AMI(keyListener, this);
        super.setKeyListener(keyListener);
        Context context2 = getContext();
        this.A0K = 0mk.A02(context2);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C71382cm.A26);
            0qQ.A07(obtainStyledAttributes);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                setContentDescription(context.getText(resourceId));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId2 != 0) {
                setHint(context.getText(resourceId2));
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId3 != 0) {
                setImeActionLabel(context.getText(resourceId3), getImeActionId());
            }
            int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId4 != 0) {
                setText(context.getText(resourceId4));
            }
            0oh.A07(context, (Typeface) null, this, AnonymousClass05K.A00);
            this.A0H = obtainStyledAttributes.getBoolean(5, true);
            z = obtainStyledAttributes.getBoolean(4, false);
            this.A0J = obtainStyledAttributes.getBoolean(6, this.A0J);
            obtainStyledAttributes.recycle();
        } else {
            z = false;
        }
        setImeOptions(33554432 | getImeOptions());
        setOnEditorActionListener(this);
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        this.A0g = compoundDrawablesRelative;
        Drawable drawable = compoundDrawablesRelative[2];
        if (drawable == null) {
            mutate = null;
        } else {
            mutate = drawable.mutate();
            0qQ.A07(mutate);
            mutate.setColorFilter(AnonymousClass37O.A00(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_icon))));
        }
        this.A00 = mutate;
        Drawable drawable2 = context.getDrawable(R.drawable.instagram_icons_exceptions_genai_agent_profile_filled_24);
        this.A0R = drawable2;
        if (drawable2 != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
            drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        }
        Resources resources = getResources();
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        AnonymousClass61R A003 = C303756Aq.A00(context2, 1AW.A06(r8, 18315849379103268L) ? R.raw.gen_ai_assets_meta_ai_fast_wink_fade_twist_fade_twist_thick_kf_700 : R.raw.mai_20dp_flip_twist);
        if (A003 != null) {
            this.A05 = A003;
            A003.setBounds(0, 0, dimensionPixelSize2, dimensionPixelSize2);
            AnonymousClass61R r9 = this.A05;
            if (r9 != null) {
                r9.A8s(new AnonymousClass61W(this));
            }
        }
        AnonymousClass61R A004 = C303756Aq.A00(context2, 1AW.A06(r8, 18315849379103268L) ? R.raw.gen_ai_assets_meta_ai_fast_fade_twist_thick_kf_700 : R.raw.mai_donut_ambient_spin_28dp_kf);
        if (A004 != null) {
            this.A06 = A004;
            A004.setBounds(0, 0, dimensionPixelSize2, dimensionPixelSize2);
            AnonymousClass61R r1 = this.A06;
            if (r1 != null) {
                r1.setVisible(true, true);
            }
        }
        this.A02 = context.getDrawable(R.drawable.instagram_search_meta_ai_send_icon);
        this.A01 = context.getDrawable(R.drawable.instagram_search_meta_ai_send_icon_disabled);
        A01(this);
        this.A0G = z;
        Object systemService = context2.getSystemService("input_method");
        if (systemService != null) {
            this.A0T = (InputMethodManager) systemService;
            this.A0W = new AnonymousClass61X(this);
            Drawable drawable3 = context.getDrawable(R.drawable.instagram_audio_wave_pano_outline_16);
            this.A0S = drawable3;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material), resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material));
            }
            if (!AnonymousClass3HA.A00(context)) {
                Drawable drawable4 = this.A0S;
                if (drawable4 != null) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP));
                    return;
                }
                return;
            }
            Drawable drawable5 = this.A0S;
            if (drawable5 != null) {
                drawable5.setColorFilter(AnonymousClass37O.A00(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_button_icon))));
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SearchEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
