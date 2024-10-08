package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3jc  reason: invalid class name and case insensitive filesystem */
public final class C249363jc extends C262154Ci {
    public static C249363jc A02;
    public final 1VZ A00;
    public final AnonymousClass1Qr A01;

    public final String AUt(String str, int[] iArr) {
        List<1Uv> list;
        AnonymousClass1Qr r3 = this.A01;
        AtomicReference atomicReference = r3.A07;
        if (atomicReference.get() != null) {
            list = (List) atomicReference.get();
        } else {
            if (!r3.A0D) {
                0wb.A03("string_resources_delegate", StringFormatUtil.formatStrLocaleSafe("StringResourcesDelegate used before initialized: resource %s requested", new Object[]{002.A0R("fbt hash ", str)}));
            }
            ArrayList arrayList = new ArrayList(1);
            if (r3.A0E) {
                Object obj = r3.A08.get();
                if (obj != null) {
                    arrayList.add(obj);
                }
                if (arrayList.isEmpty()) {
                    r3.A05.A00();
                }
            }
            list = arrayList;
            if (r3.A0D) {
                list = arrayList;
                if (r3.A0E) {
                    list = arrayList;
                    if (r3.A06()) {
                        atomicReference.set(arrayList);
                        list = arrayList;
                    }
                }
            }
        }
        for (1Uv A022 : list) {
            String A023 = A022.A02(str, iArr, 0);
            if (A023 != null) {
                return A023;
            }
        }
        1Qo r2 = r3.A04;
        0qQ.A0B(iArr, 2);
        2eJ.A00(r2, str, "unknown", iArr);
        return null;
    }

    public final Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        ((1WF) 1WF.A05.getValue()).A00(this, i);
        return super.getDrawableForDensity(i, i2, theme);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047 A[Catch:{ all -> 0x0145 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013f A[SYNTHETIC, Splitter:B:70:0x013f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.res.XmlResourceParser getLayout(int r15) {
        /*
            r14 = this;
            r12 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r12)
            if (r0 == 0) goto L_0x0010
            r1 = 1945279225(0x73f29af9, float:3.8442354E31)
            java.lang.String r0 = "DownloadedIgResources.getLayout"
            X.0fS.A01(r0, r1)
        L_0x0010:
            X.1VZ r5 = r14.A00     // Catch:{ all -> 0x019e }
            java.lang.String r4 = "BundledLayoutLoader failed to initialize"
            com.google.common.util.concurrent.SettableFuture r3 = r5.A07     // Catch:{ all -> 0x019e }
            java.lang.String r2 = "Required value was null."
            java.lang.String r1 = "LayoutUnpacker"
            if (r3 != 0) goto L_0x002e
            java.lang.String r0 = "init() was never called before getLayout()"
            X.0KC.A0E(r1, r0)     // Catch:{ all -> 0x019e }
            r5.A00()     // Catch:{ all -> 0x019e }
            com.google.common.util.concurrent.SettableFuture r3 = r5.A07     // Catch:{ all -> 0x019e }
            if (r3 != 0) goto L_0x0039
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x019e }
            r1.<init>(r2)     // Catch:{ all -> 0x019e }
        L_0x002d:
            throw r1     // Catch:{ all -> 0x019e }
        L_0x002e:
            boolean r0 = r3.isDone()     // Catch:{ all -> 0x019e }
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "mBundledLayoutLoaderFuture did not complete before getLayout() was called"
            X.0KC.A0E(r1, r0)     // Catch:{ all -> 0x019e }
        L_0x0039:
            java.lang.String r1 = "waitForFuture"
            r0 = -758743761(0xffffffffd2c67d2f, float:-4.26251878E11)
            X.0fh.A01(r1, r0)     // Catch:{ all -> 0x0145 }
            java.lang.Object r6 = r3.get()     // Catch:{ all -> 0x0145 }
            if (r6 == 0) goto L_0x013f
            X.1Vy r6 = (X.1Vy) r6     // Catch:{ all -> 0x0145 }
            r0 = 1117908841(0x42a1ef69, float:80.9676)
            X.0fh.A00(r0)     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            boolean r0 = r6.A0B     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            if (r0 == 0) goto L_0x00d7
            android.content.res.Resources r0 = r6.A04     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            java.lang.String r2 = r0.getString(r15)     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            X.0qQ.A07(r2)     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            java.lang.String r0 = "L|"
            r9 = 0
            r1 = 0
            boolean r0 = X.00p.A0k(r2, r0, r9)     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            if (r0 == 0) goto L_0x017e
            java.lang.String r1 = "0x"
            java.lang.String r0 = java.lang.Integer.toHexString(r15)     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            java.lang.String r7 = X.002.A0R(r1, r0)     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            X.2ck r8 = new X.2ck     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            r8.<init>(r2, r7)     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            int r0 = r8.A01     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            long r2 = (long) r0     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            r11 = 32
            long r2 = r2 << r11
            int r0 = r8.A00     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            long r2 = r2 | r0
            X.0eM r0 = r6.A09     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            java.lang.Object r10 = r0.getValue()     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            java.lang.Object[] r10 = (java.lang.Object[]) r10     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            long r0 = r2 >> r11
            int r11 = (int) r0     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            int r0 = r11 * 7919
            int r0 = r0 % 50
            int r0 = java.lang.Math.abs(r0)     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            r10 = r10[r0]     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            monitor-enter(r10)     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            X.1Vz r1 = r6.A05     // Catch:{ all -> 0x00d4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00d4 }
            java.lang.Object r3 = r1.get(r0)     // Catch:{ all -> 0x00d4 }
            r2 = 1
            if (r3 != 0) goto L_0x00a7
            java.lang.Object r3 = X.1Vy.A00(r8, r6, r7, r2)     // Catch:{ all -> 0x00d4 }
            r2 = 0
        L_0x00a7:
            java.lang.reflect.Method r1 = r6.A02     // Catch:{ Exception -> 0x00be }
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00be }
            java.lang.Object r1 = r1.invoke(r3, r0)     // Catch:{ Exception -> 0x00be }
            java.lang.String r0 = "null cannot be cast to non-null type android.content.res.XmlResourceParser"
            X.0qQ.A0C(r1, r0)     // Catch:{ Exception -> 0x00be }
            android.content.res.XmlResourceParser r1 = (android.content.res.XmlResourceParser) r1     // Catch:{ Exception -> 0x00be }
            monitor-exit(r10)     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            if (r2 != 0) goto L_0x017e
            X.1Vy.A01(r8, r6, r3)     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            goto L_0x017e
        L_0x00be:
            r2 = move-exception
            boolean r0 = r2 instanceof java.lang.IllegalAccessException     // Catch:{ all -> 0x00d4 }
            if (r0 != 0) goto L_0x00c8
            boolean r0 = r2 instanceof java.lang.reflect.InvocationTargetException     // Catch:{ all -> 0x00d4 }
            if (r0 != 0) goto L_0x00c8
            throw r2     // Catch:{ all -> 0x00d4 }
        L_0x00c8:
            java.lang.String r0 = "Could not create XmlResourceParser for bundled layout "
            java.lang.String r1 = X.002.A0R(r0, r7)     // Catch:{ all -> 0x00d4 }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00d4 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00d4 }
            throw r0     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            r1 = move-exception
            monitor-exit(r10)     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            goto L_0x014f
        L_0x00d7:
            monitor-enter(r6)     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            r1 = 0
            android.content.res.Resources r0 = r6.A04     // Catch:{ all -> 0x014d }
            java.lang.String r2 = r0.getString(r15)     // Catch:{ all -> 0x014d }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x014d }
            java.lang.String r0 = "L|"
            r8 = 0
            boolean r0 = X.00p.A0k(r2, r0, r8)     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x013d
            java.lang.String r1 = "0x"
            java.lang.String r0 = java.lang.Integer.toHexString(r15)     // Catch:{ all -> 0x014d }
            java.lang.String r7 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x014d }
            X.2ck r9 = new X.2ck     // Catch:{ all -> 0x014d }
            r9.<init>(r2, r7)     // Catch:{ all -> 0x014d }
            X.1Vz r10 = r6.A05     // Catch:{ all -> 0x014d }
            int r0 = r9.A01     // Catch:{ all -> 0x014d }
            long r2 = (long) r0     // Catch:{ all -> 0x014d }
            r0 = 32
            long r2 = r2 << r0
            int r0 = r9.A00     // Catch:{ all -> 0x014d }
            long r0 = (long) r0     // Catch:{ all -> 0x014d }
            long r2 = r2 | r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x014d }
            java.lang.Object r2 = r10.get(r0)     // Catch:{ all -> 0x014d }
            if (r2 != 0) goto L_0x0117
            java.lang.Object r2 = X.1Vy.A00(r9, r6, r7, r8)     // Catch:{ all -> 0x014d }
            X.1Vy.A01(r9, r6, r2)     // Catch:{ all -> 0x014d }
        L_0x0117:
            java.lang.reflect.Method r1 = r6.A02     // Catch:{ Exception -> 0x0127 }
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0127 }
            java.lang.Object r1 = r1.invoke(r2, r0)     // Catch:{ Exception -> 0x0127 }
            java.lang.String r0 = "null cannot be cast to non-null type android.content.res.XmlResourceParser"
            X.0qQ.A0C(r1, r0)     // Catch:{ Exception -> 0x0127 }
            android.content.res.XmlResourceParser r1 = (android.content.res.XmlResourceParser) r1     // Catch:{ Exception -> 0x0127 }
            goto L_0x013d
        L_0x0127:
            r2 = move-exception
            boolean r0 = r2 instanceof java.lang.IllegalAccessException     // Catch:{ all -> 0x014d }
            if (r0 != 0) goto L_0x0131
            boolean r0 = r2 instanceof java.lang.reflect.InvocationTargetException     // Catch:{ all -> 0x014d }
            if (r0 != 0) goto L_0x0131
            throw r2     // Catch:{ all -> 0x014d }
        L_0x0131:
            java.lang.String r0 = "Could not create XmlResourceParser for bundled layout "
            java.lang.String r1 = X.002.A0R(r0, r7)     // Catch:{ all -> 0x014d }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x014d }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x014d }
            throw r0     // Catch:{ all -> 0x014d }
        L_0x013d:
            monitor-exit(r6)     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            goto L_0x017e
        L_0x013f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0145 }
            r0.<init>(r2)     // Catch:{ all -> 0x0145 }
            throw r0     // Catch:{ all -> 0x0145 }
        L_0x0145:
            r1 = move-exception
            r0 = 877600817(0x344f2031, float:1.9290088E-7)
            X.0fh.A00(r0)     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
            goto L_0x014f
        L_0x014d:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
        L_0x014f:
            throw r1     // Catch:{ IOException -> 0x0160, InterruptedException -> 0x0158, ExecutionException -> 0x0150 }
        L_0x0150:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x019e }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x019e }
            goto L_0x002d
        L_0x0158:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x019e }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x019e }
            goto L_0x002d
        L_0x0160:
            r3 = move-exception
            X.1BA r2 = r5.A00     // Catch:{ all -> 0x019e }
            r1 = 2093722256(0x7ccbaa90, float:8.4599654E36)
            r0 = 0
            java.io.File r2 = r2.AXT(r0, r1)     // Catch:{ all -> 0x019e }
            java.lang.String r1 = "layouts.bin.sha256"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x019e }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x019e }
            r0.delete()     // Catch:{ all -> 0x019e }
            java.lang.String r0 = "Corruption detected in layout bundle"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x019e }
            r1.<init>(r0, r3)     // Catch:{ all -> 0x019e }
            goto L_0x002d
        L_0x017e:
            if (r1 != 0) goto L_0x0181
            r1 = 0
        L_0x0181:
            if (r1 == 0) goto L_0x0190
            boolean r0 = com.facebook.systrace.Systrace.A0E(r12)
            if (r0 == 0) goto L_0x018f
            r0 = -1480287501(0xffffffffa7c49af3, float:-5.4568924E-15)
        L_0x018c:
            X.0fS.A00(r0)
        L_0x018f:
            return r1
        L_0x0190:
            android.content.res.XmlResourceParser r1 = super.getLayout(r15)     // Catch:{ all -> 0x019e }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r12)
            if (r0 == 0) goto L_0x018f
            r0 = -1817730479(0xffffffff93a7a251, float:-4.2316783E-27)
            goto L_0x018c
        L_0x019e:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r12)
            if (r0 == 0) goto L_0x01ab
            r0 = -1226501588(0xffffffffb6e5122c, float:-6.8268473E-6)
            X.0fS.A00(r0)
        L_0x01ab:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C249363jc.getLayout(int):android.content.res.XmlResourceParser");
    }

    public final CharSequence getQuantityText(int i, int i2) {
        String A012;
        if (i != 0) {
            int charAt = super.getQuantityText(R.plurals.fake_plural, i2).charAt(0) - '0';
            if (charAt >= 0) {
                Integer[] numArr = C246703f6.A00;
                if (charAt < 6) {
                    Integer num = numArr[charAt];
                    AnonymousClass1Qr r3 = this.A01;
                    if ((-65536 & i) != R.plurals.accounts_selected) {
                        return r3.A02.getQuantityString(i, i2);
                    }
                    for (1Uv r0 : AnonymousClass1Qr.A00(r3, i)) {
                        if (r0 != null && (A012 = r0.A01(num, i, 0, i2)) != null) {
                            return A012;
                        }
                    }
                    try {
                        String quantityString = r3.A02.getQuantityString(i, i2);
                        r3.A04.A01(i, "arsc", i2);
                        return quantityString;
                    } catch (Resources.NotFoundException e) {
                        r3.A04.A01(i, "not_found_error", i2);
                        throw e;
                    }
                }
            }
            throw new RuntimeException("Requesting a PluralCategory that does not exists");
        }
        throw new Resources.NotFoundException("Resource id 0x0 requested, this probably means a string resource is missing");
    }

    public final String[] getStringArray(int i) {
        String[] A03;
        if (i != 0) {
            AnonymousClass1Qr r4 = this.A01;
            if ((-16777216 & i) != 2130706432) {
                return r4.A02.getStringArray(i);
            }
            for (1Uv r0 : AnonymousClass1Qr.A00(r4, i)) {
                if (r0 != null && (A03 = r0.A03(i, 0)) != null) {
                    return A03;
                }
            }
            try {
                String[] stringArray = r4.A02.getStringArray(i);
                r4.A04.A00(i, "arsc");
                return stringArray;
            } catch (Resources.NotFoundException e) {
                r4.A04.A00(i, "not_found_error");
                throw e;
            }
        } else {
            throw new Resources.NotFoundException("Resource id 0x0 requested, this probably means a string resource is missing");
        }
    }

    public final CharSequence getText(int i) {
        if (i != 0) {
            return this.A01.A02(i);
        }
        throw new Resources.NotFoundException("Resource id 0x0 requested, this probably means a string resource is missing");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C249363jc(android.content.Context r11, X.AnonymousClass1Qr r12, int r13, long r14, boolean r16, boolean r17) {
        /*
            r10 = this;
            android.content.res.Resources r5 = r11.getResources()
            android.content.Context r2 = r11.getApplicationContext()
            r0 = 36326133309912608(0x810e6d00003620, double:3.036131206562281E-306)
            X.0tM r0 = X.AnonymousClass0yP.A00(r0)
            boolean r0 = X.0yU.A07(r0)
            if (r0 == 0) goto L_0x0038
            android.content.res.AssetManager r2 = r5.getAssets()
        L_0x001b:
            android.util.DisplayMetrics r1 = r5.getDisplayMetrics()
            android.content.res.Configuration r0 = r5.getConfiguration()
            r10.<init>(r2, r1, r0)
            r10.A00 = r5
            r0 = 36326133309978145(0x810e6d00013621, double:3.036131206603727E-306)
            X.0tM r0 = X.AnonymousClass0yP.A00(r0)
            boolean r0 = X.0yU.A07(r0)
            if (r0 == 0) goto L_0x00da
            goto L_0x0041
        L_0x0038:
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.AssetManager r2 = r0.getAssets()
            goto L_0x001b
        L_0x0041:
            X.Rwq r4 = X.C10712Rwq.A04     // Catch:{ Exception -> 0x00d2 }
            if (r4 != 0) goto L_0x0088
            java.lang.String r0 = "android.content.res.ResourcesImpl"
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x00d2 }
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            r7 = 0
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r0 = "getImpl"
            java.lang.reflect.Method r6 = r2.getDeclaredMethod(r0, r1)     // Catch:{ Exception -> 0x00d2 }
            r4 = 1
            r6.setAccessible(r4)     // Catch:{ Exception -> 0x00d2 }
            java.lang.Class[] r1 = new java.lang.Class[]{r3}     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r0 = "setImpl"
            java.lang.reflect.Method r3 = r2.getDeclaredMethod(r0, r1)     // Catch:{ Exception -> 0x00d2 }
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r0 = "android.app.ResourcesManager"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x00d2 }
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r0 = "getInstance"
            java.lang.reflect.Method r1 = r2.getDeclaredMethod(r0, r1)     // Catch:{ Exception -> 0x00d2 }
            r1.setAccessible(r4)     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r0 = "mResourceReferences"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch:{ Exception -> 0x00d2 }
            r0.setAccessible(r4)     // Catch:{ Exception -> 0x00d2 }
            X.Rwq r4 = new X.Rwq     // Catch:{ Exception -> 0x00d2 }
            r4.<init>(r0, r6, r3, r1)     // Catch:{ Exception -> 0x00d2 }
            X.C10712Rwq.A04 = r4     // Catch:{ Exception -> 0x00d2 }
        L_0x0088:
            java.lang.reflect.Method r1 = r4.A02     // Catch:{ Exception -> 0x00d2 }
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00d2 }
            java.lang.Object r0 = r1.invoke(r5, r0)     // Catch:{ Exception -> 0x00d2 }
            java.lang.reflect.Method r1 = r4.A03     // Catch:{ Exception -> 0x00d2 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ Exception -> 0x00d2 }
            r1.invoke(r10, r0)     // Catch:{ Exception -> 0x00d2 }
            java.lang.reflect.Method r2 = r4.A01     // Catch:{ Exception -> 0x00d2 }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00d2 }
            r0 = 0
            java.lang.Object r1 = r2.invoke(r0, r1)     // Catch:{ Exception -> 0x00d2 }
            java.lang.reflect.Field r0 = r4.A00     // Catch:{ Exception -> 0x00d2 }
            java.lang.Object r2 = r0.get(r1)     // Catch:{ Exception -> 0x00d2 }
            if (r2 == 0) goto L_0x00c2
            java.lang.Class r1 = r2.getClass()     // Catch:{ Exception -> 0x00d2 }
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            boolean r0 = r1.isAssignableFrom(r0)     // Catch:{ Exception -> 0x00d2 }
            if (r0 == 0) goto L_0x00ca
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ Exception -> 0x00d2 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x00d2 }
            r0.<init>(r10)     // Catch:{ Exception -> 0x00d2 }
            r2.add(r0)     // Catch:{ Exception -> 0x00d2 }
            goto L_0x00da
        L_0x00c2:
            java.lang.String r0 = "Unexpected null value for mResourceReferences"
            java.lang.ReflectiveOperationException r1 = new java.lang.ReflectiveOperationException     // Catch:{ Exception -> 0x00d2 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00d2 }
            goto L_0x00d1
        L_0x00ca:
            java.lang.String r0 = "Unexpected type for mResourceReferences"
            java.lang.ReflectiveOperationException r1 = new java.lang.ReflectiveOperationException     // Catch:{ Exception -> 0x00d2 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00d2 }
        L_0x00d1:
            throw r1     // Catch:{ Exception -> 0x00d2 }
        L_0x00d2:
            r2 = move-exception
            java.lang.Class<X.4Ci> r1 = X.C262154Ci.class
            java.lang.String r0 = "Failed to synchronize IgResources"
            X.0KC.A05(r1, r0, r2)
        L_0x00da:
            r10.A01 = r12
            android.content.Context r3 = r11.getApplicationContext()
            android.content.res.Resources r4 = r11.getResources()
            X.0eM r0 = X.AnonymousClass1VP.A02
            java.lang.Object r5 = r0.getValue()
            X.1VP r5 = (X.AnonymousClass1VP) r5
            java.lang.Class<X.1VX> r1 = X.AnonymousClass1VX.class
            monitor-enter(r1)
            X.1VZ r2 = X.AnonymousClass1VX.A00     // Catch:{ all -> 0x0110 }
            if (r2 != 0) goto L_0x00ff
            X.1VZ r2 = new X.1VZ     // Catch:{ all -> 0x0110 }
            r6 = r14
            r8 = r16
            r9 = r17
            r2.<init>(r3, r4, r5, r6, r8, r9)     // Catch:{ all -> 0x0110 }
            X.AnonymousClass1VX.A00 = r2     // Catch:{ all -> 0x0110 }
        L_0x00ff:
            monitor-exit(r1)
            r10.A00 = r2
            r2.A00()
            X.0eM r0 = X.1WF.A05
            java.lang.Object r0 = r0.getValue()
            X.1WF r0 = (X.1WF) r0
            r0.A00 = r13
            return
        L_0x0110:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C249363jc.<init>(android.content.Context, X.1Qr, int, long, boolean, boolean):void");
    }

    public final void A03(Locale locale) {
        super.A03(locale);
        this.A01.A05();
    }

    public final String getQuantityString(int i, int i2, Object... objArr) {
        return String.format(this.A01.A03(), getQuantityText(i, i2).toString(), objArr);
    }

    public final String getString(int i) {
        return getText(i).toString();
    }

    public final CharSequence[] getTextArray(int i) {
        return getStringArray(i);
    }

    public final String getQuantityString(int i, int i2) {
        return getQuantityText(i, i2).toString();
    }

    public final String getString(int i, Object... objArr) {
        return String.format(this.A01.A03(), getText(i).toString(), objArr);
    }

    public final CharSequence getText(int i, CharSequence charSequence) {
        String A022;
        if (i == 0 || (A022 = this.A01.A02(i)) == null) {
            return charSequence;
        }
        return A022;
    }
}
