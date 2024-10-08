package X;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.List;

public final class Pz9 implements Runnable {
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A00;
    public final /* synthetic */ List A01;

    public Pz9(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, List list) {
        this.A00 = shortcutInfoCompatSaverImpl;
        this.A01 = list;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|(1:4)|5|6|7|8|(15:10|11|12|13|(18:16|(1:18)|19|(1:21)|22|(1:24)|25|(1:27)|28|(1:30)|31|(3:33|(2:35|91)(1:92)|36)|90|37|(4:40|(2:42|96)(1:95)|93|38)|94|43|14)|89|44|45|46|49|(3:51|52|53)|54|55|60|61)(2:65|66)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x003c */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0046 A[SYNTHETIC, Splitter:B:10:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x019e A[Catch:{ Exception -> 0x01b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d1 A[SYNTHETIC, Splitter:B:72:0x01d1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            androidx.sharetarget.ShortcutInfoCompatSaverImpl r0 = r1.A00
            java.util.List r2 = r1.A01
            r0.A04(r2)
            java.io.File r5 = r0.A02
            java.lang.String r11 = "share_targets"
            java.lang.String r1 = r5.getPath()
            java.lang.String r0 = ".new"
            java.lang.String r0 = X.002.A0R(r1, r0)
            java.io.File r6 = new java.io.File
            r6.<init>(r0)
            java.lang.String r1 = r5.getPath()
            java.lang.String r0 = ".bak"
            java.lang.String r0 = X.002.A0R(r1, r0)
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            r7 = 0
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x01b5 }
            if (r0 == 0) goto L_0x0036
            X.Pz8.A00(r1, r5)     // Catch:{ Exception -> 0x01b5 }
        L_0x0036:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x003c }
            r4.<init>(r6)     // Catch:{ FileNotFoundException -> 0x003c }
            goto L_0x004b
        L_0x003c:
            java.io.File r0 = r6.getParentFile()     // Catch:{ Exception -> 0x01b5 }
            boolean r0 = r0.mkdirs()     // Catch:{ Exception -> 0x01b5 }
            if (r0 == 0) goto L_0x019e
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0186 }
            r4.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0186 }
        L_0x004b:
            java.io.BufferedOutputStream r10 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x01b7 }
            r10.<init>(r4)     // Catch:{ Exception -> 0x01b7 }
            org.xmlpull.v1.XmlSerializer r9 = android.util.Xml.newSerializer()     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r0 = "UTF_8"
            r9.setOutput(r10, r0)     // Catch:{ Exception -> 0x01b7 }
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x01b7 }
            r9.startDocument(r7, r0)     // Catch:{ Exception -> 0x01b7 }
            r9.startTag(r7, r11)     // Catch:{ Exception -> 0x01b7 }
            java.util.Iterator r16 = r2.iterator()     // Catch:{ Exception -> 0x01b7 }
        L_0x0068:
            boolean r0 = r16.hasNext()     // Catch:{ Exception -> 0x01b7 }
            if (r0 == 0) goto L_0x0159
            java.lang.Object r2 = r16.next()     // Catch:{ Exception -> 0x01b7 }
            X.PzC r2 = (X.PzC) r2     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r8 = "target"
            r9.startTag(r7, r8)     // Catch:{ Exception -> 0x01b7 }
            X.PzA r14 = r2.A00     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r1 = r14.A0D     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r0 = "id"
            X.Pz6.A01(r0, r1, r9)     // Catch:{ Exception -> 0x01b7 }
            java.lang.CharSequence r0 = r14.A0B     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r0 = "short_label"
            X.Pz6.A01(r0, r1, r9)     // Catch:{ Exception -> 0x01b7 }
            int r0 = r14.A02     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r0 = "rank"
            X.Pz6.A01(r0, r1, r9)     // Catch:{ Exception -> 0x01b7 }
            java.lang.CharSequence r0 = r14.A0C     // Catch:{ Exception -> 0x01b7 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x01b7 }
            if (r0 != 0) goto L_0x00ae
            java.lang.CharSequence r0 = r14.A0C     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r0 = "long_label"
            X.Pz6.A01(r0, r1, r9)     // Catch:{ Exception -> 0x01b7 }
        L_0x00ae:
            java.lang.CharSequence r0 = r14.A0A     // Catch:{ Exception -> 0x01b7 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x01b7 }
            if (r0 != 0) goto L_0x00c1
            java.lang.CharSequence r0 = r14.A0A     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r0 = "disabled_message"
            X.Pz6.A01(r0, r1, r9)     // Catch:{ Exception -> 0x01b7 }
        L_0x00c1:
            android.content.ComponentName r0 = r14.A04     // Catch:{ Exception -> 0x01b7 }
            if (r0 == 0) goto L_0x00ce
            java.lang.String r1 = r0.flattenToString()     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r0 = "component"
            X.Pz6.A01(r0, r1, r9)     // Catch:{ Exception -> 0x01b7 }
        L_0x00ce:
            java.lang.String r1 = r2.A02     // Catch:{ Exception -> 0x01b7 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x01b7 }
            if (r0 != 0) goto L_0x00db
            java.lang.String r0 = "icon_resource_name"
            X.Pz6.A01(r0, r1, r9)     // Catch:{ Exception -> 0x01b7 }
        L_0x00db:
            java.lang.String r1 = r2.A01     // Catch:{ Exception -> 0x01b7 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x01b7 }
            if (r0 != 0) goto L_0x00e8
            java.lang.String r0 = "icon_bitmap_path"
            X.Pz6.A01(r0, r1, r9)     // Catch:{ Exception -> 0x01b7 }
        L_0x00e8:
            android.content.Intent[] r1 = r14.A0P     // Catch:{ Exception -> 0x01b7 }
            int r0 = r1.length     // Catch:{ Exception -> 0x01b7 }
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ Exception -> 0x01b7 }
            android.content.Intent[] r13 = (android.content.Intent[]) r13     // Catch:{ Exception -> 0x01b7 }
            int r12 = r13.length     // Catch:{ Exception -> 0x01b7 }
            r3 = 0
        L_0x00f3:
            if (r3 >= r12) goto L_0x012d
            r15 = r13[r3]     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r2 = "intent"
            r9.startTag(r7, r2)     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r1 = r15.getAction()     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r0 = "action"
            X.Pz6.A01(r0, r1, r9)     // Catch:{ Exception -> 0x01b7 }
            android.content.ComponentName r0 = r15.getComponent()     // Catch:{ Exception -> 0x01b7 }
            if (r0 == 0) goto L_0x0127
            android.content.ComponentName r0 = r15.getComponent()     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r1 = r0.getPackageName()     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r0 = "targetPackage"
            X.Pz6.A01(r0, r1, r9)     // Catch:{ Exception -> 0x01b7 }
            android.content.ComponentName r0 = r15.getComponent()     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r1 = r0.getClassName()     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r0 = "targetClass"
            X.Pz6.A01(r0, r1, r9)     // Catch:{ Exception -> 0x01b7 }
        L_0x0127:
            r9.endTag(r7, r2)     // Catch:{ Exception -> 0x01b7 }
            int r3 = r3 + 1
            goto L_0x00f3
        L_0x012d:
            java.util.Set r0 = r14.A0F     // Catch:{ Exception -> 0x01b7 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ Exception -> 0x01b7 }
        L_0x0133:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x01b7 }
            if (r0 == 0) goto L_0x0154
            java.lang.Object r2 = r3.next()     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x01b7 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x01b7 }
            if (r0 != 0) goto L_0x0133
            java.lang.String r1 = "categories"
            r9.startTag(r7, r1)     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r0 = "name"
            X.Pz6.A01(r0, r2, r9)     // Catch:{ Exception -> 0x01b7 }
            r9.endTag(r7, r1)     // Catch:{ Exception -> 0x01b7 }
            goto L_0x0133
        L_0x0154:
            r9.endTag(r7, r8)     // Catch:{ Exception -> 0x01b7 }
            goto L_0x0068
        L_0x0159:
            r9.endTag(r7, r11)     // Catch:{ Exception -> 0x01b7 }
            r9.endDocument()     // Catch:{ Exception -> 0x01b7 }
            r10.flush()     // Catch:{ Exception -> 0x01b7 }
            r4.flush()     // Catch:{ Exception -> 0x01b7 }
            java.io.FileDescriptor r0 = r4.getFD()     // Catch:{ IOException -> 0x016e }
            r0.sync()     // Catch:{ IOException -> 0x016e }
            r0 = 1
            goto L_0x016f
        L_0x016e:
            r0 = 0
        L_0x016f:
            java.lang.String r2 = "AtomicFile"
            if (r0 != 0) goto L_0x0178
            java.lang.String r0 = "Failed to sync file output stream"
            android.util.Log.e(r2, r0)     // Catch:{ Exception -> 0x01b7 }
        L_0x0178:
            r4.close()     // Catch:{ IOException -> 0x017c }
            goto L_0x0182
        L_0x017c:
            r1 = move-exception
            java.lang.String r0 = "Failed to close file output stream"
            android.util.Log.e(r2, r0, r1)     // Catch:{ Exception -> 0x01b7 }
        L_0x0182:
            X.Pz8.A00(r6, r5)     // Catch:{ Exception -> 0x01b7 }
            return
        L_0x0186:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b5 }
            r1.<init>()     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r0 = "Failed to create new file "
            r1.append(r0)     // Catch:{ Exception -> 0x01b5 }
            r1.append(r6)     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x01b5 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x01b5 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x01b5 }
            goto L_0x01b4
        L_0x019e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b5 }
            r1.<init>()     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r0 = "Failed to create directory for "
            r1.append(r0)     // Catch:{ Exception -> 0x01b5 }
            r1.append(r6)     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x01b5 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x01b5 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x01b5 }
        L_0x01b4:
            throw r1     // Catch:{ Exception -> 0x01b5 }
        L_0x01b5:
            r3 = move-exception
            goto L_0x01b9
        L_0x01b7:
            r3 = move-exception
            r7 = r4
        L_0x01b9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Failed to write to file "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "ShortcutInfoCompatSaver"
            android.util.Log.e(r0, r1, r3)
            if (r7 == 0) goto L_0x0209
            java.io.FileDescriptor r0 = r7.getFD()     // Catch:{ IOException -> 0x01d9 }
            r0.sync()     // Catch:{ IOException -> 0x01d9 }
            goto L_0x01db
        L_0x01d9:
            r0 = 0
            goto L_0x01dc
        L_0x01db:
            r0 = 1
        L_0x01dc:
            java.lang.String r2 = "AtomicFile"
            if (r0 != 0) goto L_0x01e5
            java.lang.String r0 = "Failed to sync file output stream"
            android.util.Log.e(r2, r0)
        L_0x01e5:
            r7.close()     // Catch:{ IOException -> 0x01e9 }
            goto L_0x01ef
        L_0x01e9:
            r1 = move-exception
            java.lang.String r0 = "Failed to close file output stream"
            android.util.Log.e(r2, r0, r1)
        L_0x01ef:
            boolean r0 = r6.delete()
            if (r0 != 0) goto L_0x0209
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Failed to delete new file "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r2, r0)
        L_0x0209:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r5)
            java.lang.String r1 = r0.toString()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Pz9.run():void");
    }
}
