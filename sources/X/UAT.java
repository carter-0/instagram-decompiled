package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class UAT extends 2Rw implements X06 {
    public List A00;
    public List A01;
    public final Handler A02;
    public final Runnable A03 = new C19911Whg(this);
    public final List A04;
    public final PreferenceGroup A05;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.V4U] */
    private void A01(PreferenceGroup preferenceGroup, List list) {
        List list2;
        synchronized (preferenceGroup) {
            list2 = preferenceGroup.A07;
            Collections.sort(list2);
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) list2.get(i);
            list.add(preference);
            ? obj = new Object();
            obj.A02 = C66581MXm.A0y(preference);
            obj.A00 = preference.A01;
            obj.A01 = preference.A03;
            JTR.A1T(obj, this.A04);
            if (preference instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preference;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    A01(preferenceGroup2, list);
                }
            }
            preference.A07 = this;
        }
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [X.U9A, java.lang.Object, androidx.preference.Preference] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.ArrayList A00(androidx.preference.PreferenceGroup r13) {
        /*
            r12 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r9 = r13.A07
            int r8 = r9.size()
            r7 = 0
            r4 = 0
        L_0x0012:
            if (r7 >= r8) goto L_0x006f
            java.lang.Object r2 = r9.get(r7)
            androidx.preference.Preference r2 = (androidx.preference.Preference) r2
            boolean r0 = r2.A0Q
            if (r0 == 0) goto L_0x0032
            int r0 = r13.A00
            r3 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            if (r0 == r3) goto L_0x006b
            r1 = 1
            if (r4 < r0) goto L_0x006b
            r6.add(r2)
        L_0x002c:
            boolean r0 = r2 instanceof androidx.preference.PreferenceGroup
            if (r0 != 0) goto L_0x0035
            int r4 = r4 + 1
        L_0x0032:
            int r7 = r7 + 1
            goto L_0x0012
        L_0x0035:
            androidx.preference.PreferenceGroup r2 = (androidx.preference.PreferenceGroup) r2
            boolean r0 = r2 instanceof androidx.preference.PreferenceScreen
            if (r0 != 0) goto L_0x0032
            if (r1 == 0) goto L_0x0049
            int r0 = r2.A00
            if (r0 == r3) goto L_0x0049
            java.lang.String r1 = "Nesting an expandable group inside of another expandable group is not supported!"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0049:
            java.util.ArrayList r0 = r12.A00(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x0051:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r1 = r2.next()
            int r0 = r13.A00
            if (r0 == r3) goto L_0x0067
            if (r4 < r0) goto L_0x0067
            r6.add(r1)
        L_0x0064:
            int r4 = r4 + 1
            goto L_0x0051
        L_0x0067:
            r5.add(r1)
            goto L_0x0064
        L_0x006b:
            r5.add(r2)
            goto L_0x002c
        L_0x006f:
            int r1 = r13.A00
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L_0x010c
            if (r4 <= r1) goto L_0x010c
            android.content.Context r1 = r13.A0a
            long r2 = r13.A04
            r0 = 0
            X.U9A r4 = new X.U9A
            r4.<init>(r1, r0)
            r0 = 2131625380(0x7f0e05a4, float:1.8877966E38)
            r4.A01 = r0
            r7 = 2131237467(0x7f081a5b, float:1.8091185E38)
            android.content.Context r9 = r4.A0a
            android.graphics.drawable.Drawable r1 = X.C323656xt.A00(r9, r7)
            android.graphics.drawable.Drawable r0 = r4.A05
            if (r0 == r1) goto L_0x009c
            r4.A05 = r1
            r0 = 0
            r4.A00 = r0
            r4.A04()
        L_0x009c:
            r4.A00 = r7
            r0 = 2131961849(0x7f1327f9, float:1.9560407E38)
            java.lang.String r0 = r9.getString(r0)
            r4.A0F(r0)
            r1 = 999(0x3e7, float:1.4E-42)
            int r0 = r4.A02
            if (r1 == r0) goto L_0x00b3
            r4.A02 = r1
            r4.A07()
        L_0x00b3:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r11 = r6.iterator()
            r7 = 0
        L_0x00bd:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00f8
            java.lang.Object r10 = r11.next()
            androidx.preference.Preference r10 = (androidx.preference.Preference) r10
            java.lang.CharSequence r6 = r10.A0C
            boolean r1 = r10 instanceof androidx.preference.PreferenceGroup
            if (r1 == 0) goto L_0x00d8
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x00d8
            r8.add(r10)
        L_0x00d8:
            androidx.preference.PreferenceGroup r0 = r10.A0A
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x00e6
            if (r1 == 0) goto L_0x00bd
            r8.add(r10)
            goto L_0x00bd
        L_0x00e6:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x00bd
            if (r7 != 0) goto L_0x00f0
            r7 = r6
            goto L_0x00bd
        L_0x00f0:
            r0 = 2131974749(0x7f135a5d, float:1.958657E38)
            java.lang.String r7 = X.DbV.A0u(r9, r7, r6, r0)
            goto L_0x00bd
        L_0x00f8:
            r4.A0E(r7)
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 + r0
            r4.A00 = r2
            r1 = 0
            X.WEN r0 = new X.WEN
            r0.<init>(r1, r12, r13)
            r4.A08 = r0
            r5.add(r4)
        L_0x010c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UAT.A00(androidx.preference.PreferenceGroup):java.util.ArrayList");
    }

    public final Preference A02(int i) {
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        return (Preference) this.A00.get(i);
    }

    public final void A03() {
        for (Preference preference : this.A01) {
            preference.A07 = null;
        }
        ArrayList A0m = C51970G9q.A0m(this.A01);
        this.A01 = A0m;
        PreferenceGroup preferenceGroup = this.A05;
        A01(preferenceGroup, A0m);
        this.A00 = A00(preferenceGroup);
        notifyDataSetChanged();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r5, int i) {
        ColorStateList colorStateList;
        UEU ueu = (UEU) r5;
        Preference A022 = A02(i);
        Drawable background = ueu.itemView.getBackground();
        Drawable drawable = ueu.A03;
        if (background != drawable) {
            ueu.itemView.setBackground(drawable);
        }
        TextView textView = (TextView) ueu.A00(16908310);
        if (!(textView == null || (colorStateList = ueu.A00) == null || textView.getTextColors().equals(colorStateList))) {
            textView.setTextColor(colorStateList);
        }
        A022.A0D(ueu);
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        V4U v4u = (V4U) this.A04.get(i);
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C17166VKv.A00);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = C323656xt.A00(context, 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(v4u.A00, viewGroup, false);
        if (inflate.getBackground() == null) {
            inflate.setBackground(drawable);
        }
        ViewGroup A0E = DbS.A0E(inflate, 16908312);
        if (A0E != null) {
            int i2 = v4u.A01;
            if (i2 != 0) {
                from.inflate(i2, A0E);
            } else {
                A0E.setVisibility(8);
            }
        }
        return new UEU(inflate);
    }

    public UAT(PreferenceGroup preferenceGroup) {
        this.A05 = preferenceGroup;
        this.A02 = AnonymousClass7TF.A0D();
        preferenceGroup.A07 = this;
        this.A01 = new ArrayList();
        this.A00 = new ArrayList();
        this.A04 = new ArrayList();
        setHasStableIds(true);
        A03();
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(232106194);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-2117005126, A032);
        return size;
    }

    public final long getItemId(int i) {
        long j;
        int i2;
        int A032 = AnonymousClass0fD.A03(-2040957148);
        if (!hasStableIds()) {
            j = -1;
            i2 = 33051979;
        } else {
            Preference A022 = A02(i);
            if (A022 instanceof U9A) {
                j = ((U9A) A022).A00;
            } else {
                j = A022.A04;
            }
            i2 = -1590263008;
        }
        AnonymousClass0fD.A0A(i2, A032);
        return j;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.V4U] */
    public final int getItemViewType(int i) {
        int i2;
        int A032 = AnonymousClass0fD.A03(-118823241);
        Preference A022 = A02(i);
        ? obj = new Object();
        obj.A02 = C66581MXm.A0y(A022);
        obj.A00 = A022.A01;
        obj.A01 = A022.A03;
        List list = this.A04;
        int indexOf = list.indexOf(obj);
        if (indexOf != -1) {
            i2 = -734597709;
        } else {
            indexOf = list.size();
            list.add(obj);
            i2 = -962435373;
        }
        AnonymousClass0fD.A0A(i2, A032);
        return indexOf;
    }
}
