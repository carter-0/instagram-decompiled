package androidx.appcompat.widget;

import X.002;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C13988Tno;
import X.C13990Tnq;
import X.C14712U2y;
import X.C18084VlE;
import X.C18453Vs1;
import X.C19898WhT;
import X.C20823Wzx;
import X.C20824Wzy;
import X.C20935X5d;
import X.C66584MXp;
import X.C7401QBj;
import X.C74219Pr6;
import X.DbS;
import X.DbU;
import X.DbW;
import X.DbY;
import X.Pxd;
import X.Pxf;
import X.Q9E;
import X.SWO;
import X.U47;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat implements C20935X5d {
    public static final C18453Vs1 A0o;
    public SearchableInfo A00;
    public Bundle A01;
    public View.OnFocusChangeListener A02;
    public View.OnKeyListener A03;
    public C74219Pr6 A04;
    public Q9E A05;
    public CharSequence A06;
    public CharSequence A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public int[] A0D;
    public int[] A0E;
    public int A0F;
    public int A0G;
    public Rect A0H;
    public Rect A0I;
    public TextWatcher A0J;
    public View.OnClickListener A0K;
    public C20823Wzx A0L;
    public C20824Wzy A0M;
    public C14712U2y A0N;
    public CharSequence A0O;
    public Runnable A0P;
    public boolean A0Q;
    public boolean A0R;
    public final int A0S;
    public final int A0T;
    public final Intent A0U;
    public final Intent A0V;
    public final Drawable A0W;
    public final View A0X;
    public final View A0Y;
    public final ImageView A0Z;
    public final ImageView A0a;
    public final ImageView A0b;
    public final ImageView A0c;
    public final SearchAutoComplete A0d;
    public final Runnable A0e;
    public final WeakHashMap A0f;
    public final View.OnClickListener A0g;
    public final View A0h;
    public final View A0i;
    public final AdapterView.OnItemClickListener A0j;
    public final AdapterView.OnItemSelectedListener A0k;
    public final ImageView A0l;
    public final TextView.OnEditorActionListener A0m;
    public final CharSequence A0n;

    public class SearchAutoComplete extends U47 {
        public SearchView A00;
        public boolean A01;
        public int A02;
        public final Runnable A03;

        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.A00.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public final void performCompletion() {
        }

        public final void replaceText(CharSequence charSequence) {
        }

        public final void A00() {
            if (Build.VERSION.SDK_INT >= 29) {
                C18084VlE.A01(this);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            C18453Vs1 vs1 = SearchView.A0o;
            C18453Vs1.A00();
            Method method = vs1.A02;
            if (method != null) {
                try {
                    method.invoke(this, new Object[]{true});
                } catch (Exception unused) {
                }
            }
        }

        public final boolean enoughToFilter() {
            if (this.A02 <= 0 || super.enoughToFilter()) {
                return true;
            }
            return false;
        }

        public void setSearchView(SearchView searchView) {
            this.A00 = searchView;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.A03 = new C19898WhT(this);
            this.A02 = getThreshold();
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x001b A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private int getSearchViewTextMinWidthDp() {
            /*
                r4 = this;
                android.content.res.Resources r0 = r4.getResources()
                android.content.res.Configuration r3 = r0.getConfiguration()
                int r2 = r3.screenWidthDp
                int r1 = r3.screenHeightDp
                r0 = 960(0x3c0, float:1.345E-42)
                if (r2 < r0) goto L_0x001e
                r0 = 720(0x2d0, float:1.009E-42)
                if (r1 < r0) goto L_0x001b
                int r2 = r3.orientation
                r0 = 2
                r1 = 256(0x100, float:3.59E-43)
                if (r2 == r0) goto L_0x001d
            L_0x001b:
                r1 = 192(0xc0, float:2.69E-43)
            L_0x001d:
                return r1
            L_0x001e:
                r0 = 600(0x258, float:8.41E-43)
                r1 = 160(0xa0, float:2.24E-43)
                if (r2 < r0) goto L_0x001d
                goto L_0x001b
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.SearchAutoComplete.getSearchViewTextMinWidthDp():int");
        }

        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.A01) {
                Runnable runnable = this.A03;
                removeCallbacks(runnable);
                post(runnable);
            }
            return onCreateInputConnection;
        }

        public final void onFinishInflate() {
            int A06 = AnonymousClass0fD.A06(-1147866047);
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), C13988Tno.A0F(this)));
            AnonymousClass0fD.A0D(-1089760421, A06);
        }

        public final void onFocusChanged(boolean z, int i, Rect rect) {
            int A06 = AnonymousClass0fD.A06(-1522809998);
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.A00;
            SearchView.A04(searchView, searchView.A08);
            searchView.post(searchView.A0e);
            if (searchView.A0d.hasFocus()) {
                searchView.A08();
            }
            AnonymousClass0fD.A0D(1905687993, A06);
        }

        public final void onWindowFocusChanged(boolean z) {
            int A06 = AnonymousClass0fD.A06(1982325531);
            super.onWindowFocusChanged(z);
            if (z && this.A00.hasFocus() && getVisibility() == 0) {
                this.A01 = true;
                Context context = getContext();
                C18453Vs1 vs1 = SearchView.A0o;
                if (Pxf.A0G(context).orientation == 2) {
                    A00();
                }
            }
            AnonymousClass0fD.A0D(1323365746, A06);
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.A01 = false;
                removeCallbacks(this.A03);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.A01 = false;
                removeCallbacks(this.A03);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.A01 = true;
            }
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.A02 = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context) {
            this(context, (AttributeSet) null);
        }
    }

    public final void A0A() {
        A04(this, false);
        SearchAutoComplete searchAutoComplete = this.A0d;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.A0K;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public final void A0D(int i) {
        int i2;
        String A012;
        Cursor cursor = this.A05.A02;
        if (cursor != null && cursor.moveToPosition(i)) {
            Uri uri = null;
            try {
                String A013 = C7401QBj.A01(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (A013 == null) {
                    A013 = this.A00.getSuggestIntentAction();
                }
                if (A013 == null) {
                    A013 = "android.intent.action.SEARCH";
                }
                String A014 = C7401QBj.A01(cursor, cursor.getColumnIndex(Pxd.A00(894)));
                if (A014 == null) {
                    A014 = this.A00.getSuggestIntentData();
                }
                if (A014 != null && ((A012 = C7401QBj.A01(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) == null || (A014 = 002.A0g(A014, "/", Uri.encode(A012))) != null)) {
                    uri = Uri.parse(A014);
                }
                String A015 = C7401QBj.A01(cursor, cursor.getColumnIndex(Pxd.A00(895)));
                String A016 = C7401QBj.A01(cursor, cursor.getColumnIndex("suggest_intent_extra_data"));
                Intent A062 = DbY.A06(A013);
                if (uri != null) {
                    A062.setData(uri);
                }
                A062.putExtra("user_query", this.A07);
                if (A015 != null) {
                    A062.putExtra("query", A015);
                }
                if (A016 != null) {
                    A062.putExtra("intent_extra_data_key", A016);
                }
                Bundle bundle = this.A01;
                if (bundle != null) {
                    A062.putExtra("app_data", bundle);
                }
                A062.setComponent(this.A00.getSearchActivity());
                try {
                    getContext().startActivity(A062);
                } catch (RuntimeException e) {
                    Log.e("SearchView", AnonymousClass7TG.A0m(A062, "Failed launch activity: ", new StringBuilder()), e);
                }
            } catch (RuntimeException e2) {
                try {
                    i2 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i2 = -1;
                }
                Log.w("SearchView", 002.A0c("Search suggestions cursor at row ", " returned exception.", i2), e2);
            }
        }
        SearchAutoComplete searchAutoComplete = this.A0d;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void clearFocus() {
        this.A0Q = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.A0d;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.A0Q = false;
    }

    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new SWO(0);
        public boolean A00;

        public final String toString() {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("SearchView.SavedState{");
            A1A.append(Pxf.A0h(this));
            A1A.append(" isIconified=");
            return C66584MXp.A0b(A1A, this.A00);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            SearchView.super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.A00));
        }
    }

    static {
        C18453Vs1 vs1;
        if (Build.VERSION.SDK_INT < 29) {
            vs1 = new C18453Vs1();
        } else {
            vs1 = null;
        }
        A0o = vs1;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SearchView(android.content.Context r27, android.util.AttributeSet r28, int r29) {
        /*
            r26 = this;
            r10 = r26
            r3 = r27
            r2 = r28
            r1 = r29
            r10.<init>(r3, r2, r1)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.A0H = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.A0I = r0
            r18 = 2
            r0 = r18
            int[] r0 = new int[r0]
            r10.A0D = r0
            r0 = r18
            int[] r0 = new int[r0]
            r10.A0E = r0
            X.WhR r0 = new X.WhR
            r0.<init>(r10)
            r10.A0e = r0
            X.WhS r0 = new X.WhS
            r0.<init>(r10)
            r10.A0P = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r10.A0f = r0
            r12 = 1
            X.WAz r13 = new X.WAz
            r13.<init>(r10, r12)
            r10.A0g = r13
            r11 = 0
            X.WBP r0 = new X.WBP
            r0.<init>(r10, r11)
            r10.A03 = r0
            X.WDC r9 = new X.WDC
            r9.<init>(r10, r11)
            r10.A0m = r9
            X.WCe r8 = new X.WCe
            r8.<init>(r10, r11)
            r10.A0j = r8
            X.WCh r7 = new X.WCh
            r7.<init>(r10, r12)
            r10.A0k = r7
            X.W7b r0 = new X.W7b
            r0.<init>(r10, r11)
            r10.A0J = r0
            int[] r0 = X.AnonymousClass2Z3.A0K
            X.2Yi r6 = X.2Yi.A00(r3, r2, r0, r1, r11)
            android.content.res.TypedArray r5 = r6.A02
            r20 = r5
            r21 = r2
            r22 = r10
            r23 = r0
            r24 = r1
            r25 = r11
            r19 = r3
            X.03v.A06(r19, r20, r21, r22, r23, r24, r25)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r3)
            r1 = 9
            r0 = 2131623960(0x7f0e0018, float:1.8875086E38)
            int r0 = r5.getResourceId(r1, r0)
            r2.inflate(r0, r10, r12)
            r0 = 2131440821(0x7f0b34b5, float:1.8503636E38)
            android.view.View r4 = r10.findViewById(r0)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r4 = (androidx.appcompat.widget.SearchView.SearchAutoComplete) r4
            r10.A0d = r4
            r4.A00 = r10
            r0 = 2131440793(0x7f0b3499, float:1.850358E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A0h = r0
            r0 = 2131440814(0x7f0b34ae, float:1.8503622E38)
            android.view.View r15 = r10.findViewById(r0)
            r10.A0Y = r15
            r0 = 2131442028(0x7f0b396c, float:1.8506084E38)
            android.view.View r17 = r10.findViewById(r0)
            r0 = r17
            r10.A0i = r0
            r0 = 2131440788(0x7f0b3494, float:1.850357E38)
            android.widget.ImageView r14 = X.DbS.A0G(r10, r0)
            r10.A0b = r14
            r0 = 2131440806(0x7f0b34a6, float:1.8503606E38)
            android.widget.ImageView r3 = X.DbS.A0G(r10, r0)
            r10.A0a = r3
            r0 = 2131440789(0x7f0b3495, float:1.8503571E38)
            android.widget.ImageView r2 = X.DbS.A0G(r10, r0)
            r10.A0Z = r2
            r0 = 2131440828(0x7f0b34bc, float:1.850365E38)
            android.widget.ImageView r1 = X.DbS.A0G(r10, r0)
            r10.A0c = r1
            r0 = 2131440812(0x7f0b34ac, float:1.8503618E38)
            android.widget.ImageView r16 = X.DbS.A0G(r10, r0)
            r0 = r16
            r10.A0l = r0
            r0 = 10
            android.graphics.drawable.Drawable r0 = r6.A02(r0)
            r15.setBackground(r0)
            r0 = 14
            android.graphics.drawable.Drawable r0 = r6.A02(r0)
            r15 = r0
            r0 = r17
            r0.setBackground(r15)
            r0 = 13
            r15 = 13
            android.graphics.drawable.Drawable r0 = r6.A02(r0)
            r14.setImageDrawable(r0)
            r0 = 7
            android.graphics.drawable.Drawable r0 = r6.A02(r0)
            r3.setImageDrawable(r0)
            r0 = 4
            android.graphics.drawable.Drawable r0 = r6.A02(r0)
            r2.setImageDrawable(r0)
            r0 = 16
            android.graphics.drawable.Drawable r0 = r6.A02(r0)
            r1.setImageDrawable(r0)
            android.graphics.drawable.Drawable r15 = r6.A02(r15)
            r0 = r16
            r0.setImageDrawable(r15)
            r0 = 12
            android.graphics.drawable.Drawable r0 = r6.A02(r0)
            r10.A0W = r0
            android.content.res.Resources r6 = r10.getResources()
            r0 = 2131951977(0x7f130169, float:1.9540384E38)
            java.lang.String r0 = r6.getString(r0)
            r14.setTooltipText(r0)
            r6 = 15
            r0 = 2131623959(0x7f0e0017, float:1.8875084E38)
            int r0 = r5.getResourceId(r6, r0)
            r10.A0T = r0
            r0 = 5
            int r0 = r5.getResourceId(r0, r11)
            r10.A0S = r0
            r14.setOnClickListener(r13)
            r2.setOnClickListener(r13)
            r3.setOnClickListener(r13)
            r1.setOnClickListener(r13)
            r4.setOnClickListener(r13)
            android.text.TextWatcher r0 = r10.A0J
            r4.addTextChangedListener(r0)
            r4.setOnEditorActionListener(r9)
            r4.setOnItemClickListener(r8)
            r4.setOnItemSelectedListener(r7)
            android.view.View$OnKeyListener r0 = r10.A03
            r4.setOnKeyListener(r0)
            X.WBI r0 = new X.WBI
            r0.<init>(r10, r11)
            r4.setOnFocusChangeListener(r0)
            r0 = 8
            boolean r0 = r5.getBoolean(r0, r12)
            r10.setIconifiedByDefault(r0)
            r1 = -1
            int r0 = r5.getDimensionPixelSize(r12, r1)
            if (r0 == r1) goto L_0x0191
            r10.setMaxWidth(r0)
        L_0x0191:
            r0 = 6
            java.lang.CharSequence r0 = r5.getText(r0)
            r10.A0n = r0
            r0 = 11
            java.lang.CharSequence r0 = r5.getText(r0)
            r10.A0O = r0
            r0 = 3
            int r0 = r5.getInt(r0, r1)
            if (r0 == r1) goto L_0x01aa
            r10.setImeOptions(r0)
        L_0x01aa:
            r0 = r18
            int r0 = r5.getInt(r0, r1)
            if (r0 == r1) goto L_0x01b5
            r10.setInputType(r0)
        L_0x01b5:
            boolean r0 = r5.getBoolean(r11, r12)
            r10.setFocusable(r0)
            r5.recycle()
            java.lang.String r0 = "android.speech.action.WEB_SEARCH"
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r0)
            r10.A0V = r3
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r2)
            java.lang.String r1 = "android.speech.extra.LANGUAGE_MODEL"
            java.lang.String r0 = "web_search"
            r3.putExtra(r1, r0)
            java.lang.String r1 = "android.speech.action.RECOGNIZE_SPEECH"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            r10.A0U = r0
            r0.addFlags(r2)
            int r0 = r4.getDropDownAnchor()
            android.view.View r0 = r10.findViewById(r0)
            r10.A0X = r0
            if (r0 == 0) goto L_0x01ef
            X.WBX.A00(r0, r11, r10)
        L_0x01ef:
            boolean r0 = r10.A09
            A04(r10, r0)
            r10.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static void A01(SearchView searchView) {
        int[] iArr;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(searchView.A0d.getText());
        int i = 0;
        if (!z2 && (!searchView.A09 || searchView.A0R)) {
            z = false;
        }
        ImageView imageView = searchView.A0Z;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            if (z2) {
                iArr = View.ENABLED_STATE_SET;
            } else {
                iArr = View.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    public static void A02(SearchView searchView) {
        int i;
        if ((searchView.A0B || searchView.A0C) && !searchView.A08 && (searchView.A0a.getVisibility() == 0 || searchView.A0c.getVisibility() == 0)) {
            i = 0;
        } else {
            i = 8;
        }
        searchView.A0i.setVisibility(i);
    }

    public static void A03(SearchView searchView, boolean z) {
        int i;
        if (!searchView.A0B || searchView.A08 || !searchView.hasFocus() || (!z && searchView.A0C)) {
            i = 8;
        } else {
            i = 0;
        }
        searchView.A0a.setVisibility(i);
    }

    public static void A04(SearchView searchView, boolean z) {
        searchView.A08 = z;
        int i = 0;
        int A012 = DbW.A01(z ? 1 : 0);
        boolean A1a = C13990Tnq.A1a(searchView.A0d.getText());
        searchView.A0b.setVisibility(A012);
        A03(searchView, A1a);
        searchView.A0h.setVisibility(DbW.A00(z));
        ImageView imageView = searchView.A0l;
        if (imageView.getDrawable() == null || searchView.A09) {
            i = 8;
        }
        imageView.setVisibility(i);
        A01(searchView);
        boolean z2 = !A1a;
        int i2 = 8;
        if (searchView.A0C && !searchView.A08 && z2) {
            searchView.A0a.setVisibility(8);
            i2 = 0;
        }
        searchView.A0c.setVisibility(i2);
        A02(searchView);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        SearchAutoComplete searchAutoComplete = this.A0d;
        searchAutoComplete.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    public final void A08() {
        if (Build.VERSION.SDK_INT >= 29) {
            C18084VlE.A00(this.A0d);
            return;
        }
        C18453Vs1 vs1 = A0o;
        SearchAutoComplete searchAutoComplete = this.A0d;
        C18453Vs1.A00();
        Method method = vs1.A01;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        C18453Vs1.A00();
        Method method2 = vs1.A00;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void A09() {
        SearchAutoComplete searchAutoComplete = this.A0d;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            DbS.A1C(searchAutoComplete);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.A09) {
            clearFocus();
            A04(this, true);
        }
    }

    public final void A0B() {
        SearchAutoComplete searchAutoComplete = this.A0d;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.A04 != null) {
                text.toString();
            }
            if (this.A00 != null) {
                A0G(text.toString());
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void A0C() {
        int[] iArr;
        if (this.A0d.hasFocus()) {
            iArr = View.FOCUSED_STATE_SET;
        } else {
            iArr = View.EMPTY_STATE_SET;
        }
        Drawable background = this.A0Y.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.A0i.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void A0E(int i) {
        CharSequence AK1;
        Editable text = this.A0d.getText();
        Cursor cursor = this.A05.A02;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i) || (AK1 = this.A05.AK1(cursor)) == null) {
            setQuery(text);
        } else {
            setQuery(AK1);
        }
    }

    public final void A0G(String str) {
        Intent A062 = DbY.A06("android.intent.action.SEARCH");
        A062.putExtra("user_query", this.A07);
        if (str != null) {
            A062.putExtra("query", str);
        }
        Bundle bundle = this.A01;
        if (bundle != null) {
            A062.putExtra("app_data", bundle);
        }
        A062.setComponent(this.A00.getSearchActivity());
        getContext().startActivity(A062);
    }

    public int getImeOptions() {
        return this.A0d.getImeOptions();
    }

    public int getInputType() {
        return this.A0d.getInputType();
    }

    public int getMaxWidth() {
        return this.A0G;
    }

    public CharSequence getQuery() {
        return this.A0d.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.A0O;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.A00;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.A0n;
        }
        return getContext().getText(this.A00.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.A0S;
    }

    public int getSuggestionRowLayout() {
        return this.A0T;
    }

    public Q9E getSuggestionsAdapter() {
        return this.A05;
    }

    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.A0d;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.A07 = "";
        clearFocus();
        A04(this, true);
        searchAutoComplete.setImeOptions(this.A0F);
        this.A0R = false;
    }

    public final void onActionViewExpanded() {
        if (!this.A0R) {
            this.A0R = true;
            SearchAutoComplete searchAutoComplete = this.A0d;
            int imeOptions = searchAutoComplete.getImeOptions();
            this.A0F = imeOptions;
            searchAutoComplete.setImeOptions(imeOptions | 33554432);
            DbS.A1C(searchAutoComplete);
            A0A();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r0 > 0) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x0036
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r4 = android.view.View.MeasureSpec.getSize(r6)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r3) goto L_0x004c
            if (r0 == 0) goto L_0x0043
            if (r0 != r2) goto L_0x001e
            int r0 = r5.A0G
            if (r0 <= 0) goto L_0x001e
        L_0x001a:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x001e:
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            int r1 = android.view.View.MeasureSpec.getSize(r7)
            if (r0 == r3) goto L_0x003a
            if (r0 != 0) goto L_0x002e
            int r1 = r5.getPreferredHeight()
        L_0x002e:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
        L_0x0036:
            super.onMeasure(r6, r7)
            return
        L_0x003a:
            int r0 = r5.getPreferredHeight()
            int r1 = java.lang.Math.min(r0, r1)
            goto L_0x002e
        L_0x0043:
            int r4 = r5.A0G
            if (r4 > 0) goto L_0x001e
            int r4 = r5.getPreferredWidth()
            goto L_0x001e
        L_0x004c:
            int r0 = r5.A0G
            if (r0 > 0) goto L_0x001a
            int r0 = r5.getPreferredWidth()
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.A00);
        A04(this, savedState.A00);
        requestLayout();
    }

    public final boolean requestFocus(int i, Rect rect) {
        if (this.A0Q || !isFocusable()) {
            return false;
        }
        if (this.A08) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.A0d.requestFocus(i, rect);
        if (requestFocus) {
            A04(this, false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.A01 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            A09();
        } else {
            A0A();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.A09 != z) {
            this.A09 = z;
            A04(this, z);
            A00();
        }
    }

    public void setImeOptions(int i) {
        this.A0d.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.A0d.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.A0G = i;
        requestLayout();
    }

    public void setOnCloseListener(C20823Wzx wzx) {
        this.A0L = wzx;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.A02 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C74219Pr6 pr6) {
        this.A04 = pr6;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.A0K = onClickListener;
    }

    public void setOnSuggestionListener(C20824Wzy wzy) {
        this.A0M = wzy;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.A0O = charSequence;
        A00();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.A0A = z;
        Q9E q9e = this.A05;
        if (q9e instanceof C7401QBj) {
            C7401QBj qBj = (C7401QBj) q9e;
            int i = 1;
            if (z) {
                i = 2;
            }
            qBj.A03 = i;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        Intent intent;
        this.A00 = searchableInfo;
        if (searchableInfo != null) {
            SearchAutoComplete searchAutoComplete = this.A0d;
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.A00.getImeOptions());
            int inputType = this.A00.getInputType();
            int i = 1;
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.A00.getSuggestAuthority() != null) {
                    inputType = inputType | Constants.LOAD_RESULT_PGO_ATTEMPTED | Constants.LOAD_RESULT_WITH_VDEX_ODEX;
                }
            }
            searchAutoComplete.setInputType(inputType);
            Q9E q9e = this.A05;
            if (q9e != null) {
                q9e.AGi((Cursor) null);
            }
            if (this.A00.getSuggestAuthority() != null) {
                C7401QBj qBj = new C7401QBj(this.A00, getContext(), this, this.A0f);
                this.A05 = qBj;
                searchAutoComplete.setAdapter(qBj);
                C7401QBj qBj2 = (C7401QBj) this.A05;
                if (this.A0A) {
                    i = 2;
                }
                qBj2.A03 = i;
            }
            A00();
        }
        SearchableInfo searchableInfo2 = this.A00;
        boolean z = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.A00.getVoiceSearchLaunchWebSearch()) {
                intent = this.A0V;
            } else if (this.A00.getVoiceSearchLaunchRecognizer()) {
                intent = this.A0U;
            }
            if (!(intent == null || getContext().getPackageManager().resolveActivity(intent, Constants.LOAD_RESULT_PGO_ATTEMPTED) == null)) {
                z = true;
            }
        }
        this.A0C = z;
        if (z) {
            this.A0d.setPrivateImeOptions("nm");
        }
        A04(this, this.A08);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.A0B = z;
        A04(this, this.A08);
    }

    public void setSuggestionsAdapter(Q9E q9e) {
        this.A05 = q9e;
        this.A0d.setAdapter(q9e);
    }

    private void A00() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.A0d;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.A09 && (drawable = this.A0W) != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    private int getPreferredHeight() {
        return DbU.A05(this).getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
    }

    private int getPreferredWidth() {
        return DbU.A05(this).getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(333466634);
        removeCallbacks(this.A0e);
        post(this.A0P);
        super.onDetachedFromWindow();
        AnonymousClass0fD.A0D(512637819, A062);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.A0d;
            Rect rect = this.A0H;
            int[] iArr = this.A0D;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.A0E;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            rect.set(i6, i5, searchAutoComplete.getWidth() + i6, searchAutoComplete.getHeight() + i5);
            Rect rect2 = this.A0I;
            rect2.set(rect.left, 0, rect.right, i4 - i2);
            C14712U2y u2y = this.A0N;
            if (u2y == null) {
                C14712U2y u2y2 = new C14712U2y(rect2, rect, searchAutoComplete);
                this.A0N = u2y2;
                setTouchDelegate(u2y2);
                return;
            }
            u2y.A04.set(rect2);
            Rect rect3 = u2y.A03;
            rect3.set(rect2);
            int i7 = -u2y.A01;
            rect3.inset(i7, i7);
            u2y.A02.set(rect);
        }
    }

    public final Parcelable onSaveInstanceState() {
        AbsSavedState absSavedState = new AbsSavedState(super.onSaveInstanceState());
        absSavedState.A00 = this.A08;
        return absSavedState;
    }

    public final void onWindowFocusChanged(boolean z) {
        int A062 = AnonymousClass0fD.A06(-747092472);
        super.onWindowFocusChanged(z);
        post(this.A0e);
        AnonymousClass0fD.A0D(1559626855, A062);
    }

    public final void A0F(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }
}
