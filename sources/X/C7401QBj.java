package X;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import com.instagram.android.R;
import java.util.WeakHashMap;

/* renamed from: X.QBj  reason: case insensitive filesystem */
public final class C7401QBj extends C7402QBk implements View.OnClickListener {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = 1;
    public int A04 = -1;
    public int A05 = -1;
    public int A06 = -1;
    public ColorStateList A07;
    public final int A08;
    public final SearchableInfo A09;
    public final Context A0A;
    public final SearchView A0B;
    public final WeakHashMap A0C;

    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00fa */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable A00(X.C7401QBj r11, java.lang.String r12) {
        /*
            r2 = 0
            if (r12 == 0) goto L_0x0164
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0164
            java.lang.String r0 = "0"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x0164
            int r6 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x0051, NotFoundException -> 0x0045 }
            java.lang.String r3 = "android.resource://"
            android.content.Context r5 = r11.A0A     // Catch:{ NumberFormatException -> 0x0051, NotFoundException -> 0x0045 }
            java.lang.String r1 = r5.getPackageName()     // Catch:{ NumberFormatException -> 0x0051, NotFoundException -> 0x0045 }
            java.lang.String r0 = "/"
            java.lang.String r4 = X.002.A07(r6, r3, r1, r0)     // Catch:{ NumberFormatException -> 0x0051, NotFoundException -> 0x0045 }
            java.util.WeakHashMap r3 = r11.A0C     // Catch:{ NumberFormatException -> 0x0051, NotFoundException -> 0x0045 }
            java.lang.Object r0 = r3.get(r4)     // Catch:{ NumberFormatException -> 0x0051, NotFoundException -> 0x0045 }
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0     // Catch:{ NumberFormatException -> 0x0051, NotFoundException -> 0x0045 }
            if (r0 != 0) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r0.newDrawable()     // Catch:{ NumberFormatException -> 0x0051, NotFoundException -> 0x0045 }
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 == 0) goto L_0x0037
            return r0
        L_0x0037:
            android.graphics.drawable.Drawable r1 = r5.getDrawable(r6)     // Catch:{ NumberFormatException -> 0x0051, NotFoundException -> 0x0045 }
            if (r1 == 0) goto L_0x0044
            android.graphics.drawable.Drawable$ConstantState r0 = r1.getConstantState()     // Catch:{ NumberFormatException -> 0x0051, NotFoundException -> 0x0045 }
            r3.put(r4, r0)     // Catch:{ NumberFormatException -> 0x0051, NotFoundException -> 0x0045 }
        L_0x0044:
            return r1
        L_0x0045:
            java.lang.String r0 = "Icon resource not found: "
            java.lang.String r1 = X.002.A0R(r0, r12)
            java.lang.String r0 = "SuggestionsAdapter"
            android.util.Log.w(r0, r1)
            return r2
        L_0x0051:
            java.util.WeakHashMap r4 = r11.A0C
            java.lang.Object r0 = r4.get(r12)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 == 0) goto L_0x005f
            android.graphics.drawable.Drawable r2 = r0.newDrawable()
        L_0x005f:
            if (r2 != 0) goto L_0x0164
            android.net.Uri r6 = android.net.Uri.parse(r12)
            java.lang.String r7 = "Error closing icon stream for "
            java.lang.String r5 = "SuggestionsAdapter"
            r3 = 0
            java.lang.String r1 = r6.getScheme()     // Catch:{ FileNotFoundException -> 0x0143 }
            java.lang.String r0 = "android.resource"
            boolean r0 = r0.equals(r1)     // Catch:{ FileNotFoundException -> 0x0143 }
            if (r0 == 0) goto L_0x0105
            java.lang.String r10 = r6.getAuthority()     // Catch:{ NotFoundException -> 0x00fa }
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ NotFoundException -> 0x00fa }
            if (r0 != 0) goto L_0x00e4
            android.content.Context r0 = r11.A0A     // Catch:{ NameNotFoundException -> 0x00d9 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00d9 }
            android.content.res.Resources r9 = r0.getResourcesForApplication(r10)     // Catch:{ NameNotFoundException -> 0x00d9 }
            java.util.List r8 = r6.getPathSegments()     // Catch:{ NotFoundException -> 0x00fa }
            if (r8 == 0) goto L_0x00ce
            int r7 = r8.size()     // Catch:{ NotFoundException -> 0x00fa }
            r2 = 0
            r1 = 1
            if (r7 != r1) goto L_0x00a1
            java.lang.String r0 = X.AnonymousClass7TE.A19(r8, r2)     // Catch:{ NumberFormatException -> 0x00ef }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00ef }
            goto L_0x00b0
        L_0x00a1:
            r0 = 2
            if (r7 != r0) goto L_0x00c3
            java.lang.String r1 = X.AnonymousClass7TE.A19(r8, r1)     // Catch:{ NotFoundException -> 0x00fa }
            java.lang.String r0 = X.AnonymousClass7TE.A19(r8, r2)     // Catch:{ NotFoundException -> 0x00fa }
            int r0 = r9.getIdentifier(r1, r0, r10)     // Catch:{ NotFoundException -> 0x00fa }
        L_0x00b0:
            if (r0 == 0) goto L_0x00b8
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)     // Catch:{ NotFoundException -> 0x00fa }
            goto L_0x015b
        L_0x00b8:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ NotFoundException -> 0x00fa }
            java.lang.String r0 = "No resource found for: "
            java.io.FileNotFoundException r0 = X.Pxj.A0b(r6, r0, r1)     // Catch:{ NotFoundException -> 0x00fa }
            goto L_0x00f9
        L_0x00c3:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ NotFoundException -> 0x00fa }
            java.lang.String r0 = "More than two path segments: "
            java.io.FileNotFoundException r0 = X.Pxj.A0b(r6, r0, r1)     // Catch:{ NotFoundException -> 0x00fa }
            goto L_0x00f9
        L_0x00ce:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ NotFoundException -> 0x00fa }
            java.lang.String r0 = "No path: "
            java.io.FileNotFoundException r0 = X.Pxj.A0b(r6, r0, r1)     // Catch:{ NotFoundException -> 0x00fa }
            goto L_0x00f9
        L_0x00d9:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ NotFoundException -> 0x00fa }
            java.lang.String r0 = "No package found for authority: "
            java.io.FileNotFoundException r0 = X.Pxj.A0b(r6, r0, r1)     // Catch:{ NotFoundException -> 0x00fa }
            goto L_0x00f9
        L_0x00e4:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ NotFoundException -> 0x00fa }
            java.lang.String r0 = "No authority: "
            java.io.FileNotFoundException r0 = X.Pxj.A0b(r6, r0, r1)     // Catch:{ NotFoundException -> 0x00fa }
            goto L_0x00f9
        L_0x00ef:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ NotFoundException -> 0x00fa }
            java.lang.String r0 = "Single path segment is not a resource ID: "
            java.io.FileNotFoundException r0 = X.Pxj.A0b(r6, r0, r1)     // Catch:{ NotFoundException -> 0x00fa }
        L_0x00f9:
            throw r0     // Catch:{ NotFoundException -> 0x00fa }
        L_0x00fa:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ FileNotFoundException -> 0x0143 }
            java.lang.String r0 = "Resource does not exist: "
            java.io.FileNotFoundException r0 = X.Pxj.A0b(r6, r0, r1)     // Catch:{ FileNotFoundException -> 0x0143 }
            goto L_0x0142
        L_0x0105:
            android.content.Context r0 = r11.A0A     // Catch:{ FileNotFoundException -> 0x0143 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0143 }
            java.io.InputStream r0 = r0.openInputStream(r6)     // Catch:{ FileNotFoundException -> 0x0143 }
            if (r0 == 0) goto L_0x0138
            android.graphics.drawable.Drawable r2 = android.graphics.drawable.Drawable.createFromStream(r0, r3)     // Catch:{ all -> 0x0126 }
            r0.close()     // Catch:{ IOException -> 0x0119 }
            goto L_0x015b
        L_0x0119:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()     // Catch:{ FileNotFoundException -> 0x0143 }
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r6, r7, r0)     // Catch:{ FileNotFoundException -> 0x0143 }
            android.util.Log.e(r5, r0, r1)     // Catch:{ FileNotFoundException -> 0x0143 }
            goto L_0x015b
        L_0x0126:
            r2 = move-exception
            r0.close()     // Catch:{ IOException -> 0x012b }
            goto L_0x0137
        L_0x012b:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()     // Catch:{ FileNotFoundException -> 0x0143 }
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r6, r7, r0)     // Catch:{ FileNotFoundException -> 0x0143 }
            android.util.Log.e(r5, r0, r1)     // Catch:{ FileNotFoundException -> 0x0143 }
        L_0x0137:
            throw r2     // Catch:{ FileNotFoundException -> 0x0143 }
        L_0x0138:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ FileNotFoundException -> 0x0143 }
            java.lang.String r0 = "Failed to open "
            java.io.FileNotFoundException r0 = X.Pxj.A0b(r6, r0, r1)     // Catch:{ FileNotFoundException -> 0x0143 }
        L_0x0142:
            throw r0     // Catch:{ FileNotFoundException -> 0x0143 }
        L_0x0143:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Icon not found: "
            r1.append(r0)
            r1.append(r6)
            X.Pxe.A1Y(r1)
            java.lang.String r0 = r2.getMessage()
            X.Pxg.A1Q(r0, r5, r1)
            r2 = r3
        L_0x015b:
            if (r2 == 0) goto L_0x0164
            android.graphics.drawable.Drawable$ConstantState r0 = r2.getConstantState()
            r4.put(r12, r0)
        L_0x0164:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7401QBj.A00(X.QBj, java.lang.String):android.graphics.drawable.Drawable");
    }

    public static String A01(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    public final boolean hasStableIds() {
        return false;
    }

    public C7401QBj(SearchableInfo searchableInfo, Context context, SearchView searchView, WeakHashMap weakHashMap) {
        int i = searchView.A0T;
        this.A05 = true;
        this.A02 = null;
        this.A06 = false;
        this.A01 = context;
        this.A00 = -1;
        this.A04 = new Q6M(this);
        this.A03 = new Q6N(this);
        this.A00 = i;
        this.A01 = i;
        this.A02 = (LayoutInflater) context.getSystemService("layout_inflater");
        this.A0B = searchView;
        this.A09 = searchableInfo;
        this.A08 = searchView.A0S;
        this.A0A = context;
        this.A0C = weakHashMap;
    }

    public final void AGi(Cursor cursor) {
        try {
            super.AGi(cursor);
            if (cursor != null) {
                this.A04 = cursor.getColumnIndex("suggest_text_1");
                this.A05 = cursor.getColumnIndex("suggest_text_2");
                this.A06 = cursor.getColumnIndex("suggest_text_2_url");
                this.A01 = cursor.getColumnIndex("suggest_icon_1");
                this.A02 = cursor.getColumnIndex("suggest_icon_2");
                this.A00 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View A0C2 = DbT.A0C(this.A02, viewGroup, this.A00);
            if (A0C2 != null) {
                ((C10713Rwr) A0C2.getTag()).A03.setText(e.toString());
            }
            return A0C2;
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            C7401QBj qBj = this;
            View A0C2 = DbT.A0C(qBj.A02, viewGroup, qBj.A01);
            A0C2.setTag(new C10713Rwr(A0C2));
            DbS.A0G(A0C2, R.id.edit_query).setImageResource(qBj.A08);
            ((C10713Rwr) A0C2.getTag()).A03.setText(e.toString());
            return A0C2;
        }
    }

    public final void notifyDataSetChanged() {
        Bundle extras;
        super.notifyDataSetChanged();
        Cursor cursor = this.A02;
        if (cursor != null && (extras = cursor.getExtras()) != null) {
            extras.getBoolean("in_progress");
        }
    }

    public final void notifyDataSetInvalidated() {
        Bundle extras;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.A02;
        if (cursor != null && (extras = cursor.getExtras()) != null) {
            extras.getBoolean("in_progress");
        }
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(1438073736);
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.A0B.A0F((CharSequence) tag);
        }
        AnonymousClass0fD.A0C(553628035, A052);
    }
}
