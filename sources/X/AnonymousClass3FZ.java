package X;

import com.facebook.graphql.enums.EnumHelper;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.3FZ  reason: invalid class name */
public abstract class AnonymousClass3FZ {
    public final JSONObject A00;

    public final AnonymousClass3FZ A00(Class cls, String str) {
        JSONObject optJSONObject = this.A00.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        try {
            return (AnonymousClass3FZ) cls.getConstructor(new Class[]{JSONObject.class}).newInstance(new Object[]{optJSONObject});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public final ImmutableList A01(String str) {
        JSONArray optJSONArray = this.A00.optJSONArray(str);
        if (optJSONArray == null) {
            return ImmutableList.of();
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i = 0; i < optJSONArray.length(); i++) {
            builder.add(optJSONArray.optString(i));
        }
        return builder.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        return com.google.common.collect.ImmutableList.of();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[ExcHandler: IllegalAccessException | NoSuchMethodException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:5:0x000f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.collect.ImmutableList A02(java.lang.String r6, java.lang.Class r7) {
        /*
            r5 = this;
            org.json.JSONObject r0 = r5.A00
            org.json.JSONArray r4 = r0.optJSONArray(r6)
            if (r4 != 0) goto L_0x000d
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            return r0
        L_0x000d:
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003c }
            java.lang.reflect.Constructor r3 = r7.getConstructor(r0)     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003c }
            com.google.common.collect.ImmutableList$Builder r2 = new com.google.common.collect.ImmutableList$Builder     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003c }
            r2.<init>()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003c }
            r1 = 0
        L_0x001d:
            int r0 = r4.length()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003c }
            if (r1 >= r0) goto L_0x0037
            org.json.JSONObject r0 = r4.optJSONObject(r1)     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003c }
            if (r0 == 0) goto L_0x0034
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ InstantiationException | InvocationTargetException -> 0x0034, IllegalAccessException | NoSuchMethodException -> 0x003c }
            java.lang.Object r0 = r3.newInstance(r0)     // Catch:{ InstantiationException | InvocationTargetException -> 0x0034, IllegalAccessException | NoSuchMethodException -> 0x003c }
            r2.add(r0)     // Catch:{ InstantiationException | InvocationTargetException -> 0x0034, IllegalAccessException | NoSuchMethodException -> 0x003c }
        L_0x0034:
            int r1 = r1 + 1
            goto L_0x001d
        L_0x0037:
            com.google.common.collect.ImmutableList r0 = r2.build()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003c }
            return r0
        L_0x003c:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3FZ.A02(java.lang.String, java.lang.Class):com.google.common.collect.ImmutableList");
    }

    public final ImmutableList A03(String str, Enum enumR) {
        JSONArray optJSONArray = this.A00.optJSONArray(str);
        if (optJSONArray == null) {
            return ImmutableList.of();
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i = 0; i < optJSONArray.length(); i++) {
            builder.add(EnumHelper.A00(optJSONArray.optString(i), enumR));
        }
        return builder.build();
    }

    public final Enum A04(String str, Enum enumR) {
        return EnumHelper.A00(this.A00.optString(str), enumR);
    }

    public final String A05(String str) {
        JSONObject jSONObject = this.A00;
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public final boolean A06(String str) {
        JSONObject jSONObject = this.A00;
        boolean z = true;
        if (jSONObject.optInt(str) != 1) {
            z = false;
        }
        return jSONObject.optBoolean(str, z);
    }

    public AnonymousClass3FZ(JSONObject jSONObject) {
        this.A00 = jSONObject;
    }
}
