package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.WDk  reason: case insensitive filesystem */
public class C18932WDk implements AnonymousClass02N {
    public static final int[] A0O = {1, 4, 5, 3, 2, 0};
    public int A00 = 0;
    public Drawable A01;
    public View A02;
    public AnonymousClass2X5 A03;
    public C18934WDm A04;
    public CharSequence A05;
    public ArrayList A06;
    public ArrayList A07;
    public ArrayList A08;
    public CopyOnWriteArrayList A09 = new CopyOnWriteArrayList();
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D = false;
    public boolean A0E;
    public ArrayList A0F = new ArrayList();
    public ArrayList A0G;
    public boolean A0H = false;
    public boolean A0I = false;
    public boolean A0J = false;
    public boolean A0K;
    public boolean A0L = false;
    public final Context A0M;
    public final Resources A0N;

    public final void A05() {
        this.A0D = false;
        if (this.A0J) {
            this.A0J = false;
            A0D(this.A0L);
        }
    }

    public final void A08(Bundle bundle) {
        String str;
        MenuItem findItem;
        int itemId;
        if (this instanceof C14733U5v) {
            C18934WDm wDm = ((C14733U5v) this).A01;
            if (wDm == null || (itemId = wDm.getItemId()) == 0) {
                str = null;
            } else {
                str = 002.A0b("android:menu:actionviewstates", ":", itemId);
            }
        } else {
            str = "android:menu:actionviewstates";
        }
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(str);
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((C18932WDk) item.getSubMenu()).A08(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 > 0 && (findItem = findItem(i2)) != null) {
            findItem.expandActionView();
        }
    }

    public final void clearHeader() {
        this.A01 = null;
        this.A05 = null;
        this.A02 = null;
        A0D(false);
    }

    public final void close() {
        A0C(true);
    }

    public final void removeGroup(int i) {
        int i2 = 0;
        int size = size();
        while (i2 < size) {
            ArrayList arrayList = this.A07;
            if (((C18934WDm) arrayList.get(i2)).getGroupId() != i) {
                i2++;
            } else if (i2 >= 0) {
                int size2 = arrayList.size() - i2;
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    if (i3 >= size2 || ((C18934WDm) arrayList.get(i2)).getGroupId() != i) {
                        A0D(true);
                    } else {
                        if (i2 < arrayList.size()) {
                            arrayList.remove(i2);
                        }
                        i3 = i4;
                    }
                }
                A0D(true);
                return;
            } else {
                return;
            }
        }
    }

    public final C18932WDk A00() {
        if (this instanceof C14733U5v) {
            return ((C14733U5v) this).A00.A00();
        }
        return this;
    }

    public final C18934WDm A01(KeyEvent keyEvent, int i) {
        char numericShortcut;
        ArrayList arrayList = this.A0F;
        arrayList.clear();
        A0A(keyEvent, arrayList, i);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C18934WDm) arrayList.get(0);
        }
        boolean A0F2 = A0F();
        for (int i2 = 0; i2 < size; i2++) {
            C18934WDm wDm = (C18934WDm) arrayList.get(i2);
            if (A0F2) {
                numericShortcut = wDm.getAlphabeticShortcut();
            } else {
                numericShortcut = wDm.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((numericShortcut == cArr[0] && (metaState & 2) == 0) || ((numericShortcut == cArr[2] && (metaState & 2) != 0) || (A0F2 && numericShortcut == 8 && i == 67))) {
                return wDm;
            }
        }
        return null;
    }

    public final C18934WDm A02(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        int i5 = i3;
        int i6 = (-65536 & i3) >> 16;
        if (i6 >= 0) {
            int[] iArr = A0O;
            if (i6 < 6) {
                int i7 = (i3 & 65535) | (iArr[i6] << 16);
                C18934WDm wDm = new C18934WDm(this, charSequence, i, i2, i5, i7, this.A00);
                ArrayList arrayList = this.A07;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (((C18934WDm) arrayList.get(size)).A0P <= i7) {
                            i4 = size + 1;
                            break;
                        }
                    } else {
                        i4 = 0;
                        break;
                    }
                }
                arrayList.add(i4, wDm);
                A0D(true);
                return wDm;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public final ArrayList A03() {
        if (this.A0B) {
            ArrayList arrayList = this.A0G;
            arrayList.clear();
            ArrayList arrayList2 = this.A07;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                C18934WDm wDm = (C18934WDm) arrayList2.get(i);
                if (wDm.isVisible()) {
                    arrayList.add(wDm);
                }
            }
            this.A0B = false;
            this.A0A = true;
        }
        return this.A0G;
    }

    public final void A06() {
        if (!this.A0D) {
            this.A0D = true;
            this.A0J = false;
            this.A0L = false;
        }
    }

    public final void A07(Context context, X9H x9h) {
        this.A09.add(new WeakReference(x9h));
        x9h.CMm(context, this);
        this.A0A = true;
    }

    public final void A0A(KeyEvent keyEvent, List list, int i) {
        char numericShortcut;
        int numericModifiers;
        boolean A0F2 = A0F();
        KeyEvent keyEvent2 = keyEvent;
        int modifiers = keyEvent2.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        int i2 = i;
        if (keyEvent2.getKeyData(keyData) || i2 == 67) {
            ArrayList arrayList = this.A07;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                C18934WDm wDm = (C18934WDm) arrayList.get(i3);
                List list2 = list;
                if (wDm.hasSubMenu()) {
                    ((C18932WDk) wDm.getSubMenu()).A0A(keyEvent2, list2, i2);
                }
                if (A0F2) {
                    numericShortcut = wDm.getAlphabeticShortcut();
                    numericModifiers = wDm.getAlphabeticModifiers();
                } else {
                    numericShortcut = wDm.getNumericShortcut();
                    numericModifiers = wDm.getNumericModifiers();
                }
                if ((modifiers & 69647) == (numericModifiers & 69647) && numericShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((numericShortcut == cArr[0] || numericShortcut == cArr[2] || (A0F2 && numericShortcut == 8 && i2 == 67)) && wDm.isEnabled()) {
                        list2.add(wDm);
                    }
                }
            }
        }
    }

    public final void A0B(X9H x9h) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A09;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            Object obj = reference.get();
            if (obj == null || obj == x9h) {
                copyOnWriteArrayList.remove(reference);
            }
        }
    }

    public final void A0C(boolean z) {
        if (!this.A0I) {
            this.A0I = true;
            CopyOnWriteArrayList copyOnWriteArrayList = this.A09;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                X9H x9h = (X9H) reference.get();
                if (x9h == null) {
                    copyOnWriteArrayList.remove(reference);
                } else {
                    x9h.D4F(this, z);
                }
            }
            this.A0I = false;
        }
    }

    public final void A0D(boolean z) {
        if (!this.A0D) {
            if (z) {
                this.A0B = true;
                this.A0A = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.A09;
            if (!copyOnWriteArrayList.isEmpty()) {
                A06();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    Reference reference = (Reference) it.next();
                    X9H x9h = (X9H) reference.get();
                    if (x9h == null) {
                        copyOnWriteArrayList.remove(reference);
                    } else {
                        x9h.FKm(z);
                    }
                }
                A05();
                return;
            }
            return;
        }
        this.A0J = true;
        if (z) {
            this.A0L = true;
        }
    }

    public final boolean A0E() {
        if (this instanceof C14733U5v) {
            return ((C14733U5v) this).A00.A0E();
        }
        return this.A0H;
    }

    public final boolean A0F() {
        if (this instanceof C14733U5v) {
            return ((C14733U5v) this).A00.A0F();
        }
        return this.A0K;
    }

    public final boolean A0G() {
        if (this instanceof C14733U5v) {
            return ((C14733U5v) this).A00.A0G();
        }
        return this.A0E;
    }

    public boolean A0H(MenuItem menuItem, C18932WDk wDk) {
        AnonymousClass2X5 r0 = this.A03;
        if (r0 == null || !r0.DRK(menuItem, wDk)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [X.WDm, android.view.MenuItem] */
    /* JADX WARNING: type inference failed for: r1v6, types: [X.WDk, X.U5v] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (((X.U7Q) r4).A01.hasSubMenu() == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        if (r7 != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        if ((r11 & 1) == 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a9, code lost:
        if (r7 == false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0I(android.view.MenuItem r9, X.X9H r10, int r11) {
        /*
            r8 = this;
            X.WDm r9 = (X.C18934WDm) r9
            r3 = 0
            if (r9 == 0) goto L_0x00da
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x00da
            android.view.MenuItem$OnMenuItemClickListener r0 = r9.A09
            r7 = 1
            if (r0 == 0) goto L_0x00ac
            boolean r0 = r0.onMenuItemClick(r9)
            if (r0 == 0) goto L_0x00ac
        L_0x0016:
            X.02c r4 = r9.A0C
            r6 = 1
            if (r4 == 0) goto L_0x0027
            r0 = r4
            X.U7Q r0 = (X.U7Q) r0
            android.view.ActionProvider r0 = r0.A01
            boolean r0 = r0.hasSubMenu()
            r2 = 1
            if (r0 != 0) goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            boolean r0 = r9.A02()
            if (r0 == 0) goto L_0x0039
            boolean r0 = r9.expandActionView()
            r7 = r7 | r0
            if (r7 == 0) goto L_0x0038
        L_0x0035:
            r8.A0C(r6)
        L_0x0038:
            return r7
        L_0x0039:
            boolean r0 = r9.hasSubMenu()
            if (r0 != 0) goto L_0x0046
            if (r2 != 0) goto L_0x0046
            r0 = r11 & 1
            if (r0 != 0) goto L_0x0038
            goto L_0x0035
        L_0x0046:
            r0 = r11 & 4
            if (r0 != 0) goto L_0x004d
            r8.A0C(r3)
        L_0x004d:
            boolean r0 = r9.hasSubMenu()
            if (r0 != 0) goto L_0x0067
            android.content.Context r0 = r8.A0M
            X.U5v r1 = new X.U5v
            r1.<init>(r0)
            r1.A00 = r8
            r1.A01 = r9
            r9.A0B = r1
            java.lang.CharSequence r0 = r9.getTitle()
            r1.setHeaderTitle((java.lang.CharSequence) r0)
        L_0x0067:
            android.view.SubMenu r5 = r9.getSubMenu()
            X.U5v r5 = (X.C14733U5v) r5
            if (r2 == 0) goto L_0x0076
            X.U7Q r4 = (X.U7Q) r4
            android.view.ActionProvider r0 = r4.A01
            r0.onPrepareSubMenu(r5)
        L_0x0076:
            java.util.concurrent.CopyOnWriteArrayList r4 = r8.A09
            boolean r1 = r4.isEmpty()
            r0 = 0
            if (r1 != 0) goto L_0x00a8
            if (r10 == 0) goto L_0x0085
            boolean r0 = r10.Dnx(r5)
        L_0x0085:
            java.util.Iterator r3 = r4.iterator()
        L_0x0089:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x00a8
            java.lang.Object r2 = r3.next()
            java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2
            java.lang.Object r1 = r2.get()
            X.X9H r1 = (X.X9H) r1
            if (r1 != 0) goto L_0x00a1
            r4.remove(r2)
            goto L_0x0089
        L_0x00a1:
            if (r0 != 0) goto L_0x0089
            boolean r0 = r1.Dnx(r5)
            goto L_0x0089
        L_0x00a8:
            r7 = r7 | r0
            if (r7 != 0) goto L_0x0038
            goto L_0x0035
        L_0x00ac:
            X.WDk r2 = r9.A0A
            boolean r0 = r2.A0H(r9, r2)
            if (r0 != 0) goto L_0x0016
            android.content.Intent r1 = r9.A06
            if (r1 == 0) goto L_0x00c7
            android.content.Context r0 = r2.A0M     // Catch:{ ActivityNotFoundException -> 0x00bf }
            r0.startActivity(r1)     // Catch:{ ActivityNotFoundException -> 0x00bf }
            goto L_0x0016
        L_0x00bf:
            r2 = move-exception
            java.lang.String r1 = "MenuItemImpl"
            java.lang.String r0 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r1, r0, r2)
        L_0x00c7:
            X.02c r0 = r9.A0C
            if (r0 == 0) goto L_0x00d7
            X.U7Q r0 = (X.U7Q) r0
            android.view.ActionProvider r0 = r0.A01
            boolean r0 = r0.onPerformDefaultAction()
            if (r0 == 0) goto L_0x00d7
            goto L_0x0016
        L_0x00d7:
            r7 = 0
            goto L_0x0016
        L_0x00da:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18932WDk.A0I(android.view.MenuItem, X.X9H, int):boolean");
    }

    public final boolean A0J(C18934WDm wDm) {
        if (this instanceof C14733U5v) {
            return ((C14733U5v) this).A00.A0J(wDm);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.A09;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty() || this.A04 != wDm) {
            return false;
        }
        A06();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            X9H x9h = (X9H) reference.get();
            if (x9h == null) {
                copyOnWriteArrayList.remove(reference);
            } else {
                z = x9h.AIC(this, wDm);
                if (z) {
                    break;
                }
            }
        }
        A05();
        if (!z) {
            return z;
        }
        this.A04 = null;
        return z;
    }

    public final boolean A0K(C18934WDm wDm) {
        if (this instanceof C14733U5v) {
            return ((C14733U5v) this).A00.A0K(wDm);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.A09;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        A06();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            X9H x9h = (X9H) reference.get();
            if (x9h == null) {
                copyOnWriteArrayList.remove(reference);
            } else {
                z = x9h.ATe(this, wDm);
                if (z) {
                    break;
                }
            }
        }
        A05();
        if (!z) {
            return z;
        }
        this.A04 = wDm;
        return z;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.WDm, android.view.MenuItem] */
    public final MenuItem add(int i) {
        return A02(this.A0N.getString(i), 0, 0, 0);
    }

    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        Intent intent2;
        PackageManager packageManager = this.A0M.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int A0H2 = C51971G9r.A0H(queryIntentActivityOptions);
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < A0H2; i5++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i5);
            if (resolveInfo.specificIndex < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[resolveInfo.specificIndex];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent4 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent4;
            }
        }
        return A0H2;
    }

    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.A0N.getString(i));
    }

    public final void clear() {
        C18934WDm wDm = this.A04;
        if (wDm != null) {
            A0J(wDm);
        }
        this.A07.clear();
        A0D(true);
    }

    public final MenuItem getItem(int i) {
        return (MenuItem) this.A07.get(i);
    }

    public final boolean hasVisibleItems() {
        if (!this.A0C) {
            int size = size();
            int i = 0;
            while (i < size) {
                if (!((C18934WDm) this.A07.get(i)).isVisible()) {
                    i++;
                }
            }
            return false;
        }
        return true;
    }

    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.A07;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C18934WDm wDm = (C18934WDm) arrayList.get(i2);
            if (wDm.getGroupId() == i) {
                int i3 = wDm.A02 & -5;
                int i4 = 0;
                if (z2) {
                    i4 = 4;
                }
                wDm.A02 = i4 | i3;
                wDm.setCheckable(z);
            }
        }
    }

    public final void setGroupDividerEnabled(boolean z) {
        if (this instanceof C14733U5v) {
            ((C14733U5v) this).A00.setGroupDividerEnabled(z);
        } else {
            this.A0H = z;
        }
    }

    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.A07;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C18934WDm wDm = (C18934WDm) arrayList.get(i2);
            if (wDm.getGroupId() == i) {
                wDm.setEnabled(z);
            }
        }
    }

    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.A07;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C18934WDm wDm = (C18934WDm) arrayList.get(i2);
            if (wDm.getGroupId() == i) {
                int i3 = wDm.A02;
                int A012 = DbW.A01(z ? 1 : 0) | (i3 & -9);
                wDm.A02 = A012;
                if (i3 != A012) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            A0D(true);
        }
    }

    public final void setQwertyMode(boolean z) {
        if (this instanceof C14733U5v) {
            ((C14733U5v) this).A00.setQwertyMode(z);
            return;
        }
        this.A0K = z;
        A0D(false);
    }

    public final int size() {
        return this.A07.size();
    }

    public C18932WDk(Context context) {
        this.A0M = context;
        Resources resources = context.getResources();
        this.A0N = resources;
        this.A07 = new ArrayList();
        this.A0G = new ArrayList();
        this.A0B = true;
        this.A06 = new ArrayList();
        this.A08 = new ArrayList();
        this.A0A = true;
        boolean z = true;
        this.A0E = (resources.getConfiguration().keyboard == 1 || !ViewConfiguration.get(this.A0M).shouldShowMenuShortcutsWhenKeyboardPresent()) ? false : z;
    }

    public final void A04() {
        ArrayList A032 = A03();
        if (this.A0A) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.A09;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                X9H x9h = (X9H) reference.get();
                if (x9h == null) {
                    copyOnWriteArrayList.remove(reference);
                } else {
                    z |= x9h.AVm();
                }
            }
            if (z) {
                ArrayList arrayList = this.A06;
                arrayList.clear();
                ArrayList arrayList2 = this.A08;
                arrayList2.clear();
                int size = A032.size();
                for (int i = 0; i < size; i++) {
                    C18934WDm wDm = (C18934WDm) A032.get(i);
                    ArrayList arrayList3 = arrayList2;
                    if ((wDm.A02 & 32) == 32) {
                        arrayList3 = arrayList;
                    }
                    arrayList3.add(wDm);
                }
            } else {
                this.A06.clear();
                ArrayList arrayList4 = this.A08;
                arrayList4.clear();
                arrayList4.addAll(A03());
            }
            this.A0A = false;
        }
    }

    public final void A09(Bundle bundle) {
        String str;
        int itemId;
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C18932WDk) item.getSubMenu()).A09(bundle);
            }
        }
        if (sparseArray != null) {
            if (this instanceof C14733U5v) {
                C18934WDm wDm = ((C14733U5v) this).A01;
                if (wDm == null || (itemId = wDm.getItemId()) == 0) {
                    str = null;
                } else {
                    str = 002.A0b("android:menu:actionviewstates", ":", itemId);
                }
            } else {
                str = "android:menu:actionviewstates";
            }
            bundle.putSparseParcelableArray(str, sparseArray);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.view.MenuItem} */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.view.MenuItem] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.MenuItem findItem(int r5) {
        /*
            r4 = this;
            int r3 = r4.size()
            r2 = 0
        L_0x0005:
            if (r2 >= r3) goto L_0x0029
            java.util.ArrayList r0 = r4.A07
            java.lang.Object r1 = r0.get(r2)
            X.WDm r1 = (X.C18934WDm) r1
            int r0 = r1.getItemId()
            if (r0 == r5) goto L_0x0025
            boolean r0 = r1.hasSubMenu()
            if (r0 == 0) goto L_0x0026
            android.view.SubMenu r0 = r1.getSubMenu()
            android.view.MenuItem r1 = r0.findItem(r5)
            if (r1 == 0) goto L_0x0026
        L_0x0025:
            return r1
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x0005
        L_0x0029:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18932WDk.findItem(int):android.view.MenuItem");
    }

    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return AnonymousClass7TF.A1V(A01(keyEvent, i));
    }

    public final boolean performIdentifierAction(int i, int i2) {
        return A0I(findItem(i), (X9H) null, i2);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDm, android.view.MenuItem] */
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        ? A012 = A01(keyEvent, i);
        if (A012 != 0) {
            z = A0I(A012, (X9H) null, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            A0C(true);
        }
        return z;
    }

    public final void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (i2 < size) {
            ArrayList arrayList = this.A07;
            if (((C18934WDm) arrayList.get(i2)).getItemId() != i) {
                i2++;
            } else if (i2 >= 0 && i2 < arrayList.size()) {
                arrayList.remove(i2);
                A0D(true);
                return;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.WDm, android.view.MenuItem] */
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return A02(this.A0N.getString(i4), i, i2, i3);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDk, android.view.SubMenu, X.U5v] */
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C18934WDm A022 = A02(charSequence, i, i2, i3);
        ? wDk = new C18932WDk(this.A0M);
        wDk.A00 = this;
        wDk.A01 = A022;
        A022.A0B = wDk;
        wDk.setHeaderTitle(A022.getTitle());
        return wDk;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.WDm, android.view.MenuItem] */
    public final MenuItem add(CharSequence charSequence) {
        return A02(charSequence, 0, 0, 0);
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.WDm, android.view.MenuItem] */
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return A02(charSequence, i, i2, i3);
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.A0N.getString(i4));
    }
}
