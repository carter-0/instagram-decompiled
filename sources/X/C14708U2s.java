package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.U2s  reason: case insensitive filesystem */
public final class C14708U2s extends MenuInflater {
    public static final Class[] A04;
    public static final Class[] A05;
    public Context A00;
    public Object A01;
    public final Object[] A02;
    public final Object[] A03;

    public static Constructor A01(Context context, String str, Class[] clsArr) {
        Constructor<?> constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(clsArr);
        constructor.setAccessible(true);
        return constructor;
    }

    public static void A02(int i, Object obj) {
        if (i < 2) {
            return;
        }
        if (obj instanceof C18934WDm) {
            C18934WDm wDm = (C18934WDm) obj;
            wDm.A02 = (wDm.A02 & -5) | 4;
        } else if (obj instanceof C14732U5u) {
            C14732U5u u5u = (C14732U5u) obj;
            try {
                Method method = u5u.A00;
                if (method == null) {
                    method = u5u.A01.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                    u5u.A00 = method;
                }
                method.invoke(u5u.A01, new Object[]{true});
            } catch (Exception e) {
                Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: X.02c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: X.02c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: X.02c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03bc  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A03(android.util.AttributeSet r46, android.view.Menu r47, org.xmlpull.v1.XmlPullParser r48) {
        /*
            r45 = this;
            r5 = 0
            r6 = 0
            r7 = 0
            r41 = 0
            r25 = 0
            r9 = 0
            r10 = 0
            r23 = 0
            r22 = 0
            r4 = 0
            r20 = 0
            r26 = 0
            r29 = 0
            r18 = 0
            r24 = 0
            r8 = 0
            r19 = 0
            r28 = 0
            r27 = 0
            r3 = 0
            r21 = 0
            r32 = 0
            r1 = r5
            r2 = r5
            r38 = 0
            r33 = 0
            r31 = 0
            r30 = 0
            r40 = 1
            r39 = 1
            r43 = r48
            int r12 = r43.getEventType()
        L_0x0038:
            r37 = 2
            java.lang.String r36 = "menu"
            r11 = 1
            r0 = r37
            if (r12 != r0) goto L_0x04f5
            java.lang.String r12 = r43.getName()
            r0 = r36
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x051b
            int r13 = r43.next()
            r42 = r5
            r35 = 0
            r34 = 0
        L_0x0057:
            if (r13 == r11) goto L_0x04fb
            java.lang.String r15 = "item"
            java.lang.String r14 = "group"
            r12 = r45
            r16 = r47
            r0 = r37
            if (r13 == r0) goto L_0x0293
            r0 = 3
            if (r13 != r0) goto L_0x007a
            java.lang.String r13 = r43.getName()
            if (r34 == 0) goto L_0x0081
            r0 = r42
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0081
            r42 = r32
            r34 = 0
        L_0x007a:
            int r13 = r43.next()
            if (r35 == 0) goto L_0x0057
            return
        L_0x0081:
            boolean r0 = r13.equals(r14)
            if (r0 == 0) goto L_0x0094
            r38 = 0
            r33 = 0
            r31 = 0
            r30 = 0
            r40 = 1
            r39 = 1
            goto L_0x007a
        L_0x0094:
            boolean r0 = r13.equals(r15)
            if (r0 == 0) goto L_0x0287
            if (r41 != 0) goto L_0x007a
            if (r5 == 0) goto L_0x018b
            r0 = r5
            X.U7Q r0 = (X.U7Q) r0
            android.view.ActionProvider r0 = r0.A01
            boolean r0 = r0.hasSubMenu()
            if (r0 == 0) goto L_0x018b
            r41 = 1
            r15 = r38
            r14 = r29
            r13 = r28
            r0 = r16
            android.view.SubMenu r0 = r0.addSubMenu(r15, r14, r10, r13)
            android.view.MenuItem r13 = r0.getItem()
            r0 = r22
            android.view.MenuItem r14 = r13.setChecked(r0)
            r0 = r21
            android.view.MenuItem r14 = r14.setVisible(r0)
            r0 = r20
            android.view.MenuItem r14 = r14.setEnabled(r0)
            r16 = 0
            r0 = r23
            boolean r0 = X.JTQ.A1P(r0, r11)
            android.view.MenuItem r14 = r14.setCheckable(r0)
            r0 = r27
            android.view.MenuItem r14 = r14.setTitleCondensed(r0)
            r0 = r26
            r14.setIcon(r0)
            if (r19 < 0) goto L_0x00eb
            r0 = r19
            r13.setShowAsAction(r0)
        L_0x00eb:
            if (r18 == 0) goto L_0x0109
            android.content.Context r0 = r12.A00
            boolean r14 = r0.isRestricted()
            if (r14 != 0) goto L_0x0503
            java.lang.Object r15 = r12.A01
            if (r15 != 0) goto L_0x00ff
            java.lang.Object r15 = r12.A00(r0)
            r12.A01 = r15
        L_0x00ff:
            X.W88 r14 = new X.W88
            r0 = r18
            r14.<init>(r15, r0)
            r13.setOnMenuItemClickListener(r14)
        L_0x0109:
            r0 = r23
            A02(r0, r13)
            if (r6 == 0) goto L_0x0133
            java.lang.Class[] r14 = A05
            java.lang.Object[] r0 = r12.A03
            android.content.Context r12 = r12.A00     // Catch:{ Exception -> 0x011f }
            java.lang.reflect.Constructor r12 = A01(r12, r6, r14)     // Catch:{ Exception -> 0x011f }
            java.lang.Object r0 = r12.newInstance(r0)     // Catch:{ Exception -> 0x011f }
            goto L_0x012c
        L_0x011f:
            r14 = move-exception
            java.lang.String r0 = "Cannot instantiate class: "
            java.lang.String r12 = X.002.A0R(r0, r6)
            java.lang.String r0 = "SupportMenuInflater"
            android.util.Log.w(r0, r12, r14)
            r0 = 0
        L_0x012c:
            android.view.View r0 = (android.view.View) r0
            r13.setActionView(r0)
            r16 = 1
        L_0x0133:
            if (r7 <= 0) goto L_0x013a
            if (r16 != 0) goto L_0x017e
            r13.setActionView(r7)
        L_0x013a:
            X.AnonymousClass03G.A00(r13, r5)
            boolean r12 = r13 instanceof X.02O
            if (r12 == 0) goto L_0x016d
            r14 = r13
            X.02O r14 = (X.02O) r14
            r14.ESj(r4)
            r14.Eos(r3)
            r0 = r25
            r14.setAlphabeticShortcut(r9, r0)
            r0 = r24
            r14.setNumericShortcut(r8, r0)
        L_0x0154:
            if (r2 == 0) goto L_0x015e
            if (r12 == 0) goto L_0x0169
            r0 = r13
            X.02O r0 = (X.02O) r0
            r0.setIconTintMode(r2)
        L_0x015e:
            if (r1 == 0) goto L_0x007a
            if (r12 == 0) goto L_0x0186
            X.02O r13 = (X.02O) r13
            r13.setIconTintList(r1)
            goto L_0x007a
        L_0x0169:
            r13.setIconTintMode(r2)
            goto L_0x015e
        L_0x016d:
            r13.setContentDescription(r4)
            r13.setTooltipText(r3)
            r0 = r25
            r13.setAlphabeticShortcut(r9, r0)
            r0 = r24
            r13.setNumericShortcut(r8, r0)
            goto L_0x0154
        L_0x017e:
            java.lang.String r12 = "SupportMenuInflater"
            java.lang.String r0 = "Ignoring attribute 'itemActionViewLayout'. Action view already specified."
            android.util.Log.w(r12, r0)
            goto L_0x013a
        L_0x0186:
            r13.setIconTintList(r1)
            goto L_0x007a
        L_0x018b:
            r41 = 1
            r15 = r38
            r14 = r29
            r13 = r28
            r0 = r16
            android.view.MenuItem r13 = r0.add(r15, r14, r10, r13)
            r0 = r22
            android.view.MenuItem r14 = r13.setChecked(r0)
            r0 = r21
            android.view.MenuItem r14 = r14.setVisible(r0)
            r0 = r20
            android.view.MenuItem r14 = r14.setEnabled(r0)
            r16 = 0
            r0 = r23
            boolean r0 = X.JTQ.A1P(r0, r11)
            android.view.MenuItem r14 = r14.setCheckable(r0)
            r0 = r27
            android.view.MenuItem r14 = r14.setTitleCondensed(r0)
            r0 = r26
            r14.setIcon(r0)
            if (r19 < 0) goto L_0x01c9
            r0 = r19
            r13.setShowAsAction(r0)
        L_0x01c9:
            if (r18 == 0) goto L_0x01e7
            android.content.Context r0 = r12.A00
            boolean r14 = r0.isRestricted()
            if (r14 != 0) goto L_0x050b
            java.lang.Object r15 = r12.A01
            if (r15 != 0) goto L_0x01dd
            java.lang.Object r15 = r12.A00(r0)
            r12.A01 = r15
        L_0x01dd:
            X.W88 r14 = new X.W88
            r0 = r18
            r14.<init>(r15, r0)
            r13.setOnMenuItemClickListener(r14)
        L_0x01e7:
            r0 = r23
            A02(r0, r13)
            if (r6 == 0) goto L_0x0211
            java.lang.Class[] r14 = A05
            java.lang.Object[] r0 = r12.A03
            android.content.Context r12 = r12.A00     // Catch:{ Exception -> 0x01fd }
            java.lang.reflect.Constructor r12 = A01(r12, r6, r14)     // Catch:{ Exception -> 0x01fd }
            java.lang.Object r0 = r12.newInstance(r0)     // Catch:{ Exception -> 0x01fd }
            goto L_0x020a
        L_0x01fd:
            r14 = move-exception
            java.lang.String r0 = "Cannot instantiate class: "
            java.lang.String r12 = X.002.A0R(r0, r6)
            java.lang.String r0 = "SupportMenuInflater"
            android.util.Log.w(r0, r12, r14)
            r0 = 0
        L_0x020a:
            android.view.View r0 = (android.view.View) r0
            r13.setActionView(r0)
            r16 = 1
        L_0x0211:
            if (r7 <= 0) goto L_0x0218
            if (r16 != 0) goto L_0x027a
            r13.setActionView(r7)
        L_0x0218:
            if (r5 == 0) goto L_0x021d
            X.AnonymousClass03G.A00(r13, r5)
        L_0x021d:
            boolean r0 = r13 instanceof X.02O
            if (r0 == 0) goto L_0x0276
            r0 = r13
            X.02O r0 = (X.02O) r0
            r0.ESj(r4)
        L_0x0227:
            boolean r0 = r13 instanceof X.02O
            if (r0 == 0) goto L_0x0272
            r0 = r13
            X.02O r0 = (X.02O) r0
            r0.Eos(r3)
        L_0x0231:
            boolean r0 = r13 instanceof X.02O
            if (r0 == 0) goto L_0x026c
            r12 = r13
            X.02O r12 = (X.02O) r12
            r0 = r25
            r12.setAlphabeticShortcut(r9, r0)
        L_0x023d:
            boolean r0 = r13 instanceof X.02O
            if (r0 == 0) goto L_0x0266
            r12 = r13
            X.02O r12 = (X.02O) r12
            r0 = r24
            r12.setNumericShortcut(r8, r0)
        L_0x0249:
            if (r2 == 0) goto L_0x0255
            boolean r0 = r13 instanceof X.02O
            if (r0 == 0) goto L_0x0262
            r0 = r13
            X.02O r0 = (X.02O) r0
            r0.setIconTintMode(r2)
        L_0x0255:
            if (r1 == 0) goto L_0x007a
            boolean r0 = r13 instanceof X.02O
            if (r0 == 0) goto L_0x0282
            X.02O r13 = (X.02O) r13
            r13.setIconTintList(r1)
            goto L_0x007a
        L_0x0262:
            r13.setIconTintMode(r2)
            goto L_0x0255
        L_0x0266:
            r0 = r24
            r13.setNumericShortcut(r8, r0)
            goto L_0x0249
        L_0x026c:
            r0 = r25
            r13.setAlphabeticShortcut(r9, r0)
            goto L_0x023d
        L_0x0272:
            r13.setTooltipText(r3)
            goto L_0x0231
        L_0x0276:
            r13.setContentDescription(r4)
            goto L_0x0227
        L_0x027a:
            java.lang.String r12 = "SupportMenuInflater"
            java.lang.String r0 = "Ignoring attribute 'itemActionViewLayout'. Action view already specified."
            android.util.Log.w(r12, r0)
            goto L_0x0218
        L_0x0282:
            r13.setIconTintList(r1)
            goto L_0x007a
        L_0x0287:
            r0 = r36
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x007a
            r35 = 1
            goto L_0x007a
        L_0x0293:
            if (r34 != 0) goto L_0x007a
            java.lang.String r13 = r43.getName()
            boolean r0 = r13.equals(r14)
            r44 = r46
            if (r0 == 0) goto L_0x02ce
            android.content.Context r13 = r12.A00
            int[] r12 = X.AnonymousClass2Z3.A0F
            r0 = r44
            android.content.res.TypedArray r13 = r13.obtainStyledAttributes(r0, r12)
            r12 = 0
            int r38 = r13.getResourceId(r11, r12)
            r0 = 3
            int r33 = r13.getInt(r0, r12)
            r0 = 4
            int r31 = r13.getInt(r0, r12)
            r0 = 5
            int r30 = r13.getInt(r0, r12)
            r0 = r37
            boolean r40 = r13.getBoolean(r0, r11)
            boolean r39 = r13.getBoolean(r12, r11)
            r13.recycle()
            goto L_0x007a
        L_0x02ce:
            boolean r0 = r13.equals(r15)
            if (r0 == 0) goto L_0x03dd
            android.content.Context r3 = r12.A00
            int[] r1 = X.AnonymousClass2Z3.A0G
            r0 = r44
            android.content.res.TypedArray r0 = r3.obtainStyledAttributes(r0, r1)
            X.2Yi r1 = new X.2Yi
            r1.<init>(r3, r0)
            r4 = 0
            android.content.res.TypedArray r13 = r1.A02
            r0 = r37
            int r29 = r13.getResourceId(r0, r4)
            r5 = 5
            r0 = r33
            int r10 = r13.getInt(r5, r0)
            r5 = 6
            r0 = r31
            int r5 = r13.getInt(r5, r0)
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r10 = r10 & r0
            r0 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r0
            r10 = r10 | r5
            r0 = 7
            java.lang.CharSequence r28 = r13.getText(r0)
            r0 = 8
            java.lang.CharSequence r27 = r13.getText(r0)
            int r26 = r13.getResourceId(r4, r4)
            r0 = 9
            java.lang.String r0 = r13.getString(r0)
            if (r0 != 0) goto L_0x0381
            r9 = 0
        L_0x031a:
            r0 = 16
            r5 = 4096(0x1000, float:5.74E-42)
            int r25 = r13.getInt(r0, r5)
            r0 = 10
            java.lang.String r0 = r13.getString(r0)
            if (r0 != 0) goto L_0x037c
            r8 = 0
        L_0x032b:
            r0 = 20
            int r24 = r13.getInt(r0, r5)
            r5 = 11
            boolean r0 = r13.hasValue(r5)
            if (r0 == 0) goto L_0x0379
            boolean r23 = r13.getBoolean(r5, r4)
        L_0x033d:
            r0 = 3
            boolean r22 = r13.getBoolean(r0, r4)
            r5 = 4
            r0 = r40
            boolean r21 = r13.getBoolean(r5, r0)
            r0 = r39
            boolean r20 = r13.getBoolean(r11, r0)
            r0 = 21
            r14 = -1
            int r19 = r13.getInt(r0, r14)
            r0 = 12
            java.lang.String r18 = r13.getString(r0)
            r0 = 13
            int r7 = r13.getResourceId(r0, r4)
            r0 = 15
            java.lang.String r6 = r13.getString(r0)
            r0 = 14
            java.lang.String r5 = r13.getString(r0)
            if (r5 == 0) goto L_0x03a6
            if (r7 != 0) goto L_0x039f
            if (r6 != 0) goto L_0x039f
            java.lang.Class[] r0 = A04
            java.lang.Object[] r4 = r12.A02
            goto L_0x0386
        L_0x0379:
            r23 = r30
            goto L_0x033d
        L_0x037c:
            char r8 = r0.charAt(r4)
            goto L_0x032b
        L_0x0381:
            char r9 = r0.charAt(r4)
            goto L_0x031a
        L_0x0386:
            java.lang.reflect.Constructor r0 = A01(r3, r5, r0)     // Catch:{ Exception -> 0x038f }
            java.lang.Object r5 = r0.newInstance(r4)     // Catch:{ Exception -> 0x038f }
            goto L_0x039c
        L_0x038f:
            r4 = move-exception
            java.lang.String r0 = "Cannot instantiate class: "
            java.lang.String r3 = X.002.A0R(r0, r5)
            java.lang.String r0 = "SupportMenuInflater"
            android.util.Log.w(r0, r3, r4)
            r5 = 0
        L_0x039c:
            X.02c r5 = (X.AnonymousClass02c) r5
            goto L_0x03a8
        L_0x039f:
            java.lang.String r3 = "SupportMenuInflater"
            java.lang.String r0 = "Ignoring attribute 'actionProviderClass'. Action view already specified."
            android.util.Log.w(r3, r0)
        L_0x03a6:
            r5 = r32
        L_0x03a8:
            r0 = 17
            java.lang.CharSequence r4 = r13.getText(r0)
            r0 = 22
            java.lang.CharSequence r3 = r13.getText(r0)
            r12 = 19
            boolean r0 = r13.hasValue(r12)
            if (r0 == 0) goto L_0x03da
            int r0 = r13.getInt(r12, r14)
            android.graphics.PorterDuff$Mode r2 = X.AnonymousClass3NX.A00(r2, r0)
        L_0x03c4:
            r12 = 18
            boolean r0 = r13.hasValue(r12)
            if (r0 == 0) goto L_0x03d7
            android.content.res.ColorStateList r1 = r1.A01(r12)
        L_0x03d0:
            r13.recycle()
            r41 = 0
            goto L_0x007a
        L_0x03d7:
            r1 = r32
            goto L_0x03d0
        L_0x03da:
            r2 = r32
            goto L_0x03c4
        L_0x03dd:
            r0 = r36
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x04ef
            r41 = 1
            r15 = r38
            r14 = r29
            r13 = r28
            r0 = r16
            android.view.SubMenu r17 = r0.addSubMenu(r15, r14, r10, r13)
            android.view.MenuItem r13 = r17.getItem()
            r0 = r22
            android.view.MenuItem r14 = r13.setChecked(r0)
            r0 = r21
            android.view.MenuItem r14 = r14.setVisible(r0)
            r0 = r20
            android.view.MenuItem r14 = r14.setEnabled(r0)
            r16 = 0
            r0 = r23
            boolean r0 = X.JTQ.A1P(r0, r11)
            android.view.MenuItem r14 = r14.setCheckable(r0)
            r0 = r27
            android.view.MenuItem r14 = r14.setTitleCondensed(r0)
            r0 = r26
            r14.setIcon(r0)
            if (r19 < 0) goto L_0x0427
            r0 = r19
            r13.setShowAsAction(r0)
        L_0x0427:
            if (r18 == 0) goto L_0x0445
            android.content.Context r14 = r12.A00
            boolean r0 = r14.isRestricted()
            if (r0 != 0) goto L_0x0513
            java.lang.Object r15 = r12.A01
            if (r15 != 0) goto L_0x043b
            java.lang.Object r15 = r12.A00(r14)
            r12.A01 = r15
        L_0x043b:
            X.W88 r14 = new X.W88
            r0 = r18
            r14.<init>(r15, r0)
            r13.setOnMenuItemClickListener(r14)
        L_0x0445:
            r0 = r23
            A02(r0, r13)
            if (r6 == 0) goto L_0x0471
            java.lang.Class[] r0 = A05
            java.lang.Object[] r14 = r12.A03
            android.content.Context r15 = r12.A00     // Catch:{ Exception -> 0x045b }
            java.lang.reflect.Constructor r0 = A01(r15, r6, r0)     // Catch:{ Exception -> 0x045b }
            java.lang.Object r0 = r0.newInstance(r14)     // Catch:{ Exception -> 0x045b }
            goto L_0x046a
        L_0x045b:
            r16 = move-exception
            java.lang.String r0 = "Cannot instantiate class: "
            java.lang.String r15 = X.002.A0R(r0, r6)
            java.lang.String r14 = "SupportMenuInflater"
            r0 = r16
            android.util.Log.w(r14, r15, r0)
            r0 = 0
        L_0x046a:
            android.view.View r0 = (android.view.View) r0
            r13.setActionView(r0)
            r16 = 1
        L_0x0471:
            if (r7 <= 0) goto L_0x0478
            if (r16 != 0) goto L_0x04e7
            r13.setActionView(r7)
        L_0x0478:
            if (r5 == 0) goto L_0x047d
            X.AnonymousClass03G.A00(r13, r5)
        L_0x047d:
            boolean r0 = r13 instanceof X.02O
            if (r0 == 0) goto L_0x04e3
            r0 = r13
            X.02O r0 = (X.02O) r0
            r0.ESj(r4)
        L_0x0487:
            boolean r0 = r13 instanceof X.02O
            if (r0 == 0) goto L_0x04df
            r0 = r13
            X.02O r0 = (X.02O) r0
            r0.Eos(r3)
        L_0x0491:
            boolean r0 = r13 instanceof X.02O
            if (r0 == 0) goto L_0x04d9
            r14 = r13
            X.02O r14 = (X.02O) r14
            r0 = r25
            r14.setAlphabeticShortcut(r9, r0)
        L_0x049d:
            boolean r0 = r13 instanceof X.02O
            if (r0 == 0) goto L_0x04d3
            r14 = r13
            X.02O r14 = (X.02O) r14
            r0 = r24
            r14.setNumericShortcut(r8, r0)
        L_0x04a9:
            if (r2 == 0) goto L_0x04b5
            boolean r0 = r13 instanceof X.02O
            if (r0 == 0) goto L_0x04cf
            r0 = r13
            X.02O r0 = (X.02O) r0
            r0.setIconTintMode(r2)
        L_0x04b5:
            if (r1 == 0) goto L_0x04c0
            boolean r0 = r13 instanceof X.02O
            if (r0 == 0) goto L_0x04cb
            X.02O r13 = (X.02O) r13
            r13.setIconTintList(r1)
        L_0x04c0:
            r14 = r17
            r13 = r44
            r0 = r43
            r12.A03(r13, r14, r0)
            goto L_0x007a
        L_0x04cb:
            r13.setIconTintList(r1)
            goto L_0x04c0
        L_0x04cf:
            r13.setIconTintMode(r2)
            goto L_0x04b5
        L_0x04d3:
            r0 = r24
            r13.setNumericShortcut(r8, r0)
            goto L_0x04a9
        L_0x04d9:
            r0 = r25
            r13.setAlphabeticShortcut(r9, r0)
            goto L_0x049d
        L_0x04df:
            r13.setTooltipText(r3)
            goto L_0x0491
        L_0x04e3:
            r13.setContentDescription(r4)
            goto L_0x0487
        L_0x04e7:
            java.lang.String r14 = "SupportMenuInflater"
            java.lang.String r0 = "Ignoring attribute 'itemActionViewLayout'. Action view already specified."
            android.util.Log.w(r14, r0)
            goto L_0x0478
        L_0x04ef:
            r42 = r13
            r34 = 1
            goto L_0x007a
        L_0x04f5:
            int r12 = r43.next()
            if (r12 != r11) goto L_0x0038
        L_0x04fb:
            java.lang.String r1 = "Unexpected end of document"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0503:
            java.lang.String r1 = "The android:onClick attribute cannot be used within a restricted context"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x050b:
            java.lang.String r1 = "The android:onClick attribute cannot be used within a restricted context"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0513:
            java.lang.String r1 = "The android:onClick attribute cannot be used within a restricted context"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x051b:
            java.lang.String r0 = "Expecting menu, got "
            java.lang.RuntimeException r0 = X.Pxg.A0k(r0, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14708U2s.A03(android.util.AttributeSet, android.view.Menu, org.xmlpull.v1.XmlPullParser):void");
    }

    static {
        Class[] clsArr = {Context.class};
        A05 = clsArr;
        A04 = clsArr;
    }

    private Object A00(Object obj) {
        if ((obj instanceof Activity) || !(obj instanceof ContextWrapper)) {
            return obj;
        }
        return A00(((ContextWrapper) obj).getBaseContext());
    }

    public final void inflate(int i, Menu menu) {
        InflateException inflateException;
        if (!(menu instanceof AnonymousClass02N)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            XmlResourceParser layout = this.A00.getResources().getLayout(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(layout);
            if (menu instanceof C18932WDk) {
                C18932WDk wDk = (C18932WDk) menu;
                if (!wDk.A0D) {
                    wDk.A06();
                    z = true;
                }
            }
            A03(asAttributeSet, menu, layout);
            if (z) {
                ((C18932WDk) menu).A05();
            }
            if (layout != null) {
                layout.close();
                return;
            }
            return;
        } catch (XmlPullParserException e) {
            inflateException = new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            inflateException = new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (0 != 0) {
                ((C18932WDk) menu).A05();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
        throw inflateException;
    }

    public C14708U2s(Context context) {
        super(context);
        this.A00 = context;
        Object[] objArr = {context};
        this.A03 = objArr;
        this.A02 = objArr;
    }
}
