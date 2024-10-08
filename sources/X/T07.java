package X;

public final class T07 implements C635813i {
    public final int A00;
    public final Object A01;

    public T07(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0165, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        X.1zE.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0169, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get() {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x002e;
                case 1: goto L_0x003d;
                case 2: goto L_0x0174;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.1Fc r4 = new X.1Fc
            r4.<init>()
            X.0eE r1 = X.AnonymousClass0t1.A01
            java.lang.Object r0 = r12.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.user.model.User r0 = r1.A01(r0)
            X.4Cl r0 = r0.A03
            java.lang.Boolean r0 = r0.Cc7()
            if (r0 == 0) goto L_0x002b
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = "True"
        L_0x0024:
            java.lang.String r0 = "remove_birthday_selfie"
            r4.A05(r0, r1)
            return r4
        L_0x002b:
            java.lang.String r1 = "False"
            goto L_0x0024
        L_0x002e:
            java.lang.Object r1 = r12.A01
            android.content.Context r1 = (android.content.Context) r1
            X.Sf1 r0 = new X.Sf1
            r0.<init>()
            X.SeZ r4 = new X.SeZ
            r4.<init>(r1, r0)
            return r4
        L_0x003d:
            java.lang.Object r5 = r12.A01
            X.Rtu r5 = (X.C10540Rtu) r5
            java.lang.String r3 = "Failed to parse manifest file"
            java.lang.String r9 = "dev_dod_folder"
            r6 = 0
            android.content.Context r0 = r5.A00     // Catch:{ IOException -> 0x0077 }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ IOException -> 0x0077 }
            java.lang.String[] r8 = r0.list(r9)     // Catch:{ IOException -> 0x0077 }
            if (r8 == 0) goto L_0x007f
            int r7 = r8.length     // Catch:{ IOException -> 0x0077 }
            r4 = 0
        L_0x0054:
            if (r4 >= r7) goto L_0x007f
            r2 = r8[r4]     // Catch:{ IOException -> 0x0077 }
            X.0qQ.A0A(r2)     // Catch:{ IOException -> 0x0077 }
            java.lang.String r0 = "manifest"
            r1 = 0
            boolean r0 = X.00p.A0k(r2, r0, r1)     // Catch:{ IOException -> 0x0077 }
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = ".json"
            boolean r0 = X.00p.A0i(r2, r0, r1)     // Catch:{ IOException -> 0x0077 }
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = java.io.File.separator     // Catch:{ IOException -> 0x0077 }
            java.lang.String r6 = X.002.A0g(r9, r0, r2)     // Catch:{ IOException -> 0x0077 }
            goto L_0x007f
        L_0x0074:
            int r4 = r4 + 1
            goto L_0x0054
        L_0x0077:
            r2 = move-exception
            java.lang.String r1 = "DebugDeveloperOverrides"
            java.lang.String r0 = "Failed to list APK assets"
            X.0KC.A0I(r1, r0, r2)
        L_0x007f:
            r4 = 0
            java.lang.String r2 = "DebugDeveloperOverrides"
            if (r6 != 0) goto L_0x008a
            java.lang.String r0 = "Manifest file is missing in APK assets"
            X.0KC.A0D(r2, r0)
            return r4
        L_0x008a:
            android.content.Context r7 = r5.A00
            java.io.File r0 = r7.getFilesDir()
            java.io.File r1 = X.JTO.A0s(r0, r6)
            java.lang.String r0 = "file"
            java.io.File r5 = X.JTO.A0s(r1, r0)
            java.io.File r8 = r5.getParentFile()
            if (r8 == 0) goto L_0x016f
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.concurrent.Executor r11 = X.0Dc.A07
            java.lang.String r9 = r5.getName()
            java.lang.String r1 = r5.getName()
            X.0Qa r0 = new X.0Qa
            r0.<init>(r6, r1)
            r10.add(r0)
            r6 = 0
        L_0x00b7:
            int r0 = r10.size()
            if (r6 >= r0) goto L_0x00ce
            java.lang.Object r1 = r10.get(r6)
            X.0Db r1 = (X.0Db) r1
            java.lang.String r0 = r1.A01
            java.io.File r0 = X.JTO.A0s(r8, r0)
            r1.A00 = r0
            int r6 = r6 + 1
            goto L_0x00b7
        L_0x00ce:
            X.0Dc r6 = new X.0Dc
            r6.<init>(r7, r8, r9, r10, r11)
            r6.A03()
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()     // Catch:{ IOException | JSONException -> 0x016a }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException | JSONException -> 0x016a }
            r0.<init>(r5)     // Catch:{ IOException | JSONException -> 0x016a }
            android.util.JsonReader r5 = new android.util.JsonReader     // Catch:{ IOException | JSONException -> 0x016a }
            r5.<init>(r0)     // Catch:{ IOException | JSONException -> 0x016a }
            r5.beginArray()     // Catch:{ all -> 0x0163 }
        L_0x00e7:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0163 }
            r8 = 0
            if (r0 == 0) goto L_0x0157
            r5.beginObject()     // Catch:{ all -> 0x0163 }
            r7 = r4
            r1 = r4
        L_0x00f3:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x013e
            java.lang.String r9 = r5.nextName()     // Catch:{ all -> 0x0163 }
            if (r9 == 0) goto L_0x013a
            int r10 = r9.hashCode()     // Catch:{ all -> 0x0163 }
            r0 = -1272046946(0xffffffffb42e1a9e, float:-1.6214696E-7)
            if (r10 == r0) goto L_0x012d
            r0 = -341064690(0xffffffffebabc40e, float:-4.153043E26)
            if (r10 == r0) goto L_0x011f
            r0 = 1901043637(0x714f9fb5, float:1.0281035E30)
            if (r10 != r0) goto L_0x013a
            java.lang.String r0 = "location"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x013a
            java.lang.String r1 = r5.nextString()     // Catch:{ all -> 0x0163 }
            goto L_0x00f3
        L_0x011f:
            java.lang.String r0 = "resource"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x013a
            java.lang.String r8 = r5.nextString()     // Catch:{ all -> 0x0163 }
            goto L_0x00f3
        L_0x012d:
            java.lang.String r0 = "flavor"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x013a
            java.lang.String r7 = r5.nextString()     // Catch:{ all -> 0x0163 }
            goto L_0x00f3
        L_0x013a:
            r5.skipValue()     // Catch:{ all -> 0x0163 }
            goto L_0x00f3
        L_0x013e:
            r5.endObject()     // Catch:{ all -> 0x0163 }
            if (r8 == 0) goto L_0x014f
            if (r7 == 0) goto L_0x014f
            if (r1 == 0) goto L_0x014f
            android.util.Pair r0 = X.Pxe.A0K(r8, r7)     // Catch:{ all -> 0x0163 }
            r6.put(r0, r1)     // Catch:{ all -> 0x0163 }
            goto L_0x00e7
        L_0x014f:
            java.lang.String r1 = "Manifest file is missing required fields"
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ all -> 0x0163 }
            r0.<init>(r1)     // Catch:{ all -> 0x0163 }
            throw r0     // Catch:{ all -> 0x0163 }
        L_0x0157:
            r5.endArray()     // Catch:{ all -> 0x0163 }
            r5.close()     // Catch:{ IOException | JSONException -> 0x016a }
            X.RoA r0 = new X.RoA     // Catch:{ IOException | JSONException -> 0x016a }
            r0.<init>(r6)     // Catch:{ IOException | JSONException -> 0x016a }
            return r0
        L_0x0163:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0165 }
        L_0x0165:
            r0 = move-exception
            X.1zE.A00(r5, r1)     // Catch:{ IOException | JSONException -> 0x016a }
            throw r0     // Catch:{ IOException | JSONException -> 0x016a }
        L_0x016a:
            r0 = move-exception
            X.0KC.A0I(r2, r3, r0)
            return r4
        L_0x016f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0174:
            java.lang.Object r5 = r12.A01
            java.lang.String[] r0 = java.util.Locale.getISOCountries()     // Catch:{ RuntimeException -> 0x01b6 }
            java.util.List r2 = java.util.Arrays.asList(r0)     // Catch:{ RuntimeException -> 0x01b6 }
            r1 = 3
            X.Szs r0 = new X.Szs     // Catch:{ RuntimeException -> 0x01b6 }
            r0.<init>((java.lang.Object) r5, (int) r1)     // Catch:{ RuntimeException -> 0x01b6 }
            java.util.List r1 = X.C256393vh.A02(r0, r2)     // Catch:{ RuntimeException -> 0x01b6 }
            r0 = 2
            X.Szs r3 = new X.Szs     // Catch:{ RuntimeException -> 0x01b6 }
            r3.<init>((java.lang.Object) r5, (int) r0)     // Catch:{ RuntimeException -> 0x01b6 }
            boolean r0 = r1 instanceof java.util.Collection     // Catch:{ RuntimeException -> 0x01b6 }
            if (r0 == 0) goto L_0x01a9
            java.util.Iterator r2 = r1.iterator()     // Catch:{ RuntimeException -> 0x01b6 }
            int r1 = r1.size()     // Catch:{ RuntimeException -> 0x01b6 }
            java.lang.String r0 = "expectedSize"
            X.1J2.A00(r1, r0)     // Catch:{ RuntimeException -> 0x01b6 }
            com.google.common.collect.ImmutableMap$Builder r0 = new com.google.common.collect.ImmutableMap$Builder     // Catch:{ RuntimeException -> 0x01b6 }
            r0.<init>(r1)     // Catch:{ RuntimeException -> 0x01b6 }
            com.google.common.collect.ImmutableMap r4 = X.C9739Rfx.A00(r3, r0, r2)     // Catch:{ RuntimeException -> 0x01b6 }
            return r4
        L_0x01a9:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ RuntimeException -> 0x01b6 }
            com.google.common.collect.ImmutableMap$Builder r0 = X.Pxf.A0Q()     // Catch:{ RuntimeException -> 0x01b6 }
            com.google.common.collect.ImmutableMap r0 = X.C9739Rfx.A00(r3, r0, r1)     // Catch:{ RuntimeException -> 0x01b6 }
            return r0
        L_0x01b6:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed to construct a unique ISO3 index of items: "
            r3.append(r0)
            java.lang.String[] r0 = java.util.Locale.getISOCountries()
            java.util.List r2 = java.util.Arrays.asList(r0)
            r1 = 3
            X.Szs r0 = new X.Szs
            r0.<init>((java.lang.Object) r5, (int) r1)
            java.util.List r0 = X.C256393vh.A02(r0, r2)
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r3)
            java.lang.RuntimeException r0 = X.Pxe.A0u(r0, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T07.get():java.lang.Object");
    }
}
