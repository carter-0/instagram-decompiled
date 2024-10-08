package X;

import android.app.SearchableInfo;
import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.instagram.android.R;

public abstract class Q9E extends BaseAdapter implements Tf0, Filterable {
    public int A00;
    public Context A01;
    public Cursor A02;
    public DataSetObserver A03;
    public Q6M A04;
    public boolean A05;
    public boolean A06;
    public Q9G A07;

    public final CharSequence AK1(Cursor cursor) {
        C7401QBj qBj = (C7401QBj) this;
        if (cursor != null) {
            String A012 = C7401QBj.A01(cursor, cursor.getColumnIndex("suggest_intent_query"));
            if (A012 == null) {
                SearchableInfo searchableInfo = qBj.A09;
                if ((!searchableInfo.shouldRewriteQueryFromData() || (A012 = C7401QBj.A01(cursor, cursor.getColumnIndex("suggest_intent_data"))) == null) && (!searchableInfo.shouldRewriteQueryFromText() || (A012 = C7401QBj.A01(cursor, cursor.getColumnIndex("suggest_text_1"))) == null)) {
                    return null;
                }
            }
            return A012;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0127, code lost:
        if (r0 != null) goto L_0x00a4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.database.Cursor r25, android.view.View r26) {
        /*
            r24 = this;
            r12 = r24
            X.QBj r12 = (X.C7401QBj) r12
            java.lang.Object r11 = r26.getTag()
            X.Rwr r11 = (X.C10713Rwr) r11
            int r1 = r12.A00
            r10 = 0
            r0 = -1
            r13 = r25
            if (r1 == r0) goto L_0x018f
            int r17 = r13.getInt(r1)
        L_0x0016:
            android.widget.TextView r9 = r11.A03
            if (r9 == 0) goto L_0x002e
            int r0 = r12.A04
            java.lang.String r0 = X.C7401QBj.A01(r13, r0)
            r9.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            int r0 = X.DbW.A00(r0)
            r9.setVisibility(r0)
        L_0x002e:
            android.widget.TextView r2 = r11.A04
            r8 = 2
            r7 = 1
            if (r2 == 0) goto L_0x009a
            int r0 = r12.A06
            java.lang.String r1 = X.C7401QBj.A01(r13, r0)
            if (r1 == 0) goto L_0x0187
            android.content.res.ColorStateList r0 = r12.A07
            if (r0 != 0) goto L_0x005d
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.Context r4 = r12.A0A
            android.content.res.Resources$Theme r3 = r4.getTheme()
            r0 = 2130971411(0x7f040b13, float:1.755156E38)
            r3.resolveAttribute(r0, r5, r7)
            android.content.res.Resources r3 = r4.getResources()
            int r0 = r5.resourceId
            android.content.res.ColorStateList r0 = r3.getColorStateList(r0)
            r12.A07 = r0
        L_0x005d:
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r1)
            r19 = 0
            android.content.res.ColorStateList r0 = r12.A07
            android.text.style.TextAppearanceSpan r3 = new android.text.style.TextAppearanceSpan
            r18 = r3
            r20 = r10
            r21 = r10
            r22 = r0
            r23 = r19
            r18.<init>(r19, r20, r21, r22, r23)
            int r1 = r1.length()
            r0 = 33
            r4.setSpan(r3, r10, r1, r0)
        L_0x007e:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x017d
            if (r9 == 0) goto L_0x008c
            r9.setSingleLine(r10)
            r9.setMaxLines(r8)
        L_0x008c:
            r2.setText(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            int r0 = X.DbW.A00(r0)
            r2.setVisibility(r0)
        L_0x009a:
            android.widget.ImageView r14 = r11.A00
            if (r14 == 0) goto L_0x00ad
            int r1 = r12.A01
            r0 = -1
            if (r1 != r0) goto L_0x00f8
            r0 = 0
        L_0x00a4:
            r1 = 4
            r14.setImageDrawable(r0)
            if (r0 != 0) goto L_0x00ee
            r14.setVisibility(r1)
        L_0x00ad:
            android.widget.ImageView r3 = r11.A01
            r2 = 8
            if (r3 == 0) goto L_0x00c1
            int r1 = r12.A02
            r0 = -1
            if (r1 != r0) goto L_0x00e5
            r0 = 0
        L_0x00b9:
            r3.setImageDrawable(r0)
            if (r0 != 0) goto L_0x00db
            r3.setVisibility(r2)
        L_0x00c1:
            int r0 = r12.A03
            if (r0 == r8) goto L_0x00cb
            if (r0 != r7) goto L_0x0193
            r0 = r17 & 1
            if (r0 == 0) goto L_0x0193
        L_0x00cb:
            android.widget.ImageView r1 = r11.A02
            r1.setVisibility(r10)
            java.lang.CharSequence r0 = r9.getText()
            r1.setTag(r0)
            X.AnonymousClass0fU.A00(r12, r1)
            return
        L_0x00db:
            r3.setVisibility(r10)
            r0.setVisible(r10, r10)
            r0.setVisible(r7, r10)
            goto L_0x00c1
        L_0x00e5:
            java.lang.String r0 = r13.getString(r1)
            android.graphics.drawable.Drawable r0 = X.C7401QBj.A00(r12, r0)
            goto L_0x00b9
        L_0x00ee:
            r14.setVisibility(r10)
            r0.setVisible(r10, r10)
            r0.setVisible(r7, r10)
            goto L_0x00ad
        L_0x00f8:
            java.lang.String r0 = r13.getString(r1)
            android.graphics.drawable.Drawable r0 = X.C7401QBj.A00(r12, r0)
            if (r0 != 0) goto L_0x00a4
            android.app.SearchableInfo r0 = r12.A09
            android.content.ComponentName r16 = r0.getSearchActivity()
            java.lang.String r6 = r16.flattenToShortString()
            java.util.WeakHashMap r5 = r12.A0C
            boolean r0 = r5.containsKey(r6)
            r4 = 0
            if (r0 == 0) goto L_0x012b
            java.lang.Object r1 = r5.get(r6)
            android.graphics.drawable.Drawable$ConstantState r1 = (android.graphics.drawable.Drawable.ConstantState) r1
            if (r1 == 0) goto L_0x0171
            android.content.Context r0 = r12.A0A
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.Drawable r0 = r1.newDrawable(r0)
        L_0x0127:
            if (r0 == 0) goto L_0x0171
            goto L_0x00a4
        L_0x012b:
            java.lang.String r3 = "SuggestionsAdapter"
            android.content.Context r0 = r12.A0A
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            r2 = 128(0x80, float:1.794E-43)
            r0 = r16
            android.content.pm.ActivityInfo r0 = r1.getActivityInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x013c }
            goto L_0x0146
        L_0x013c:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r3, r0)
            r0 = r4
            goto L_0x0168
        L_0x0146:
            int r2 = r0.getIconResource()
            if (r2 == 0) goto L_0x0167
            java.lang.String r15 = r16.getPackageName()
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r15, r2, r0)
            if (r0 != 0) goto L_0x016c
            java.lang.String r15 = "Invalid icon resource "
            java.lang.String r1 = " for "
            java.lang.String r0 = r16.flattenToShortString()
            java.lang.String r0 = X.002.A05(r2, r15, r1, r0)
            android.util.Log.w(r3, r0)
        L_0x0167:
            r0 = r4
        L_0x0168:
            r5.put(r6, r4)
            goto L_0x0127
        L_0x016c:
            android.graphics.drawable.Drawable$ConstantState r4 = r0.getConstantState()
            goto L_0x0168
        L_0x0171:
            android.content.Context r0 = r12.A0A
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
            goto L_0x00a4
        L_0x017d:
            if (r9 == 0) goto L_0x008c
            r9.setSingleLine(r7)
            r9.setMaxLines(r7)
            goto L_0x008c
        L_0x0187:
            int r0 = r12.A05
            java.lang.String r4 = X.C7401QBj.A01(r13, r0)
            goto L_0x007e
        L_0x018f:
            r17 = 0
            goto L_0x0016
        L_0x0193:
            android.widget.ImageView r0 = r11.A02
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q9E.A02(android.database.Cursor, android.view.View):void");
    }

    public void AGi(Cursor cursor) {
        Cursor cursor2 = this.A02;
        if (cursor != cursor2) {
            if (cursor2 != null) {
                Q6M q6m = this.A04;
                if (q6m != null) {
                    cursor2.unregisterContentObserver(q6m);
                }
                DataSetObserver dataSetObserver = this.A03;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.A02 = cursor;
            if (cursor != null) {
                Q6M q6m2 = this.A04;
                if (q6m2 != null) {
                    cursor.registerContentObserver(q6m2);
                }
                DataSetObserver dataSetObserver2 = this.A03;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.A00 = cursor.getColumnIndexOrThrow("_id");
                this.A06 = true;
                0fE.A00(this, 561553197);
            } else {
                this.A00 = -1;
                this.A06 = false;
                0fE.A01(this, 1995949606);
            }
            if (cursor2 != null) {
                cursor2.close();
            }
        }
    }

    public final int getCount() {
        Cursor cursor;
        if (!this.A06 || (cursor = this.A02) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.A06) {
            return null;
        }
        this.A02.moveToPosition(i);
        if (view == null) {
            C7402QBk qBk = (C7402QBk) this;
            view = DbT.A0C(qBk.A02, viewGroup, qBk.A00);
        }
        A02(this.A02, view);
        return view;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Q9G, android.widget.Filter] */
    public final Filter getFilter() {
        Q9G q9g = this.A07;
        if (q9g != null) {
            return q9g;
        }
        ? filter = new Filter();
        filter.A00 = this;
        this.A07 = filter;
        return filter;
    }

    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.A06 || (cursor = this.A02) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.A02;
    }

    public final long getItemId(int i) {
        Cursor cursor;
        if (!this.A06 || (cursor = this.A02) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.A02.getLong(this.A00);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.A06) {
            throw AnonymousClass7TE.A0z("this should only be called when the cursor is valid");
        } else if (this.A02.moveToPosition(i)) {
            if (view == null) {
                C7401QBj qBj = (C7401QBj) this;
                view = DbT.A0C(qBj.A02, viewGroup, qBj.A01);
                view.setTag(new C10713Rwr(view));
                DbS.A0G(view, R.id.edit_query).setImageResource(qBj.A08);
            }
            A02(this.A02, view);
            return view;
        } else {
            throw DbW.A0b("couldn't move cursor to position ", i);
        }
    }
}
