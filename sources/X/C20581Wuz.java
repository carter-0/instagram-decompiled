package X;

import android.graphics.Typeface;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: X.Wuz  reason: case insensitive filesystem */
public final class C20581Wuz extends HashMap {
    public final int A00;

    public C20581Wuz(int i) {
        int i2;
        Object obj;
        this.A00 = i;
        switch (i) {
            case 0:
                put("HelveticaNeue-Regular", Typeface.create("sans-serif", 0));
                put("HelveticaNeue-Bold", Typeface.create("sans-serif", 1));
                put("HelveticaNeue-CondensedBold", Typeface.create(AnonymousClass000.A00(3904), 1));
                put("HelveticaNeue-Light", Typeface.create("sans-serif-light", 0));
                put("HelveticaNeue-UltraLight", Typeface.create("sans-serif-thin", 0));
                put("HelveticaNeue-Medium", Typeface.create("sans-serif", 1));
                put("Georgia", Typeface.create("serif", 0));
                put("Roboto-Medium", Typeface.create("sans-serif-medium", 0));
                return;
            case 1:
                put("flow_name", "new_users_meta_flow");
                put("source", "source");
                i2 = "surface";
                obj = "instagram_android";
                break;
            default:
                A00(C51967G9n.A0k(), this, 0.5d);
                A00(C13988Tno.A0R(), this, 0.53d);
                A00(C66580MXl.A0q(), this, 0.57d);
                A00(3, this, 0.61d);
                A00(4, this, 0.65d);
                A00(5, this, 0.69d);
                A00(6, this, 0.72d);
                A00(7, this, 0.75d);
                A00(8, this, 0.78d);
                A00(9, this, 0.81d);
                A00(10, this, 0.84d);
                A00(11, this, 0.86d);
                A00(12, this, 0.88d);
                A00(13, this, 0.9d);
                A00(14, this, 0.91d);
                A00(15, this, 0.93d);
                A00(16, this, 0.94d);
                A00(17, this, 0.95d);
                A00(18, this, 0.96d);
                A00(19, this, 0.97d);
                i2 = 20;
                obj = Double.valueOf(0.98d);
                break;
        }
        put(i2, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r2 instanceof java.lang.String;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r0 != false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r2 == null) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        return super.containsKey(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ boolean containsKey(java.lang.Object r2) {
        /*
            r1 = this;
            int r0 = r1.A00
            switch(r0) {
                case 7: goto L_0x000b;
                case 8: goto L_0x000e;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r2 instanceof java.lang.String
        L_0x0007:
            if (r0 != 0) goto L_0x0010
            r0 = 0
            return r0
        L_0x000b:
            boolean r0 = r2 instanceof java.lang.Integer
            goto L_0x0007
        L_0x000e:
            if (r2 != 0) goto L_0x0005
        L_0x0010:
            boolean r0 = super.containsKey(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20581Wuz.containsKey(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r2 instanceof java.lang.String;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r0 != false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r2 == null) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        return super.containsValue(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ boolean containsValue(java.lang.Object r2) {
        /*
            r1 = this;
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0015;
                case 1: goto L_0x0005;
                case 2: goto L_0x000b;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x000b;
                case 7: goto L_0x0012;
                case 8: goto L_0x000b;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r2 instanceof java.lang.String
        L_0x0007:
            if (r0 != 0) goto L_0x000d
            r0 = 0
            return r0
        L_0x000b:
            if (r2 != 0) goto L_0x0005
        L_0x000d:
            boolean r0 = super.containsValue(r2)
            return r0
        L_0x0012:
            boolean r0 = r2 instanceof java.lang.Double
            goto L_0x0007
        L_0x0015:
            boolean r0 = r2 instanceof android.graphics.Typeface
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20581Wuz.containsValue(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r2 instanceof java.lang.String;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r0 != false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r2 == null) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        return super.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object r2) {
        /*
            r1 = this;
            int r0 = r1.A00
            switch(r0) {
                case 7: goto L_0x000b;
                case 8: goto L_0x000e;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r2 instanceof java.lang.String
        L_0x0007:
            if (r0 != 0) goto L_0x0010
            r0 = 0
            return r0
        L_0x000b:
            boolean r0 = r2 instanceof java.lang.Integer
            goto L_0x0007
        L_0x000e:
            if (r2 != 0) goto L_0x0005
        L_0x0010:
            java.lang.Object r0 = super.get(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20581Wuz.get(java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r2 instanceof java.lang.String;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r0 != false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r2 == null) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return super.getOrDefault(r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object getOrDefault(java.lang.Object r2, java.lang.Object r3) {
        /*
            r1 = this;
            int r0 = r1.A00
            switch(r0) {
                case 7: goto L_0x000a;
                case 8: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r2 instanceof java.lang.String
        L_0x0007:
            if (r0 != 0) goto L_0x000f
            return r3
        L_0x000a:
            boolean r0 = r2 instanceof java.lang.Integer
            goto L_0x0007
        L_0x000d:
            if (r2 != 0) goto L_0x0005
        L_0x000f:
            java.lang.Object r3 = super.getOrDefault(r2, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20581Wuz.getOrDefault(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r2 instanceof java.lang.String;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r0 != false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r2 == null) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        return super.remove(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object remove(java.lang.Object r2) {
        /*
            r1 = this;
            int r0 = r1.A00
            switch(r0) {
                case 7: goto L_0x000b;
                case 8: goto L_0x000e;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r2 instanceof java.lang.String
        L_0x0007:
            if (r0 != 0) goto L_0x0010
            r0 = 0
            return r0
        L_0x000b:
            boolean r0 = r2 instanceof java.lang.Integer
            goto L_0x0007
        L_0x000e:
            if (r2 != 0) goto L_0x0005
        L_0x0010:
            java.lang.Object r0 = super.remove(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20581Wuz.remove(java.lang.Object):java.lang.Object");
    }

    public static void A00(Object obj, AbstractMap abstractMap, double d) {
        abstractMap.put(obj, Double.valueOf(d));
    }

    public final /* bridge */ Set entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ Set keySet() {
        return super.keySet();
    }

    public final /* bridge */ int size() {
        return super.size();
    }

    public final /* bridge */ Collection values() {
        return super.values();
    }

    public C20581Wuz(C268194cw r3, int i) {
        this.A00 = i;
        put("params", r3.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        if (r0 != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        if (r4 == null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        return super.remove(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        r0 = r4 instanceof java.lang.String;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if ((r3 instanceof java.lang.String) == false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ boolean remove(java.lang.Object r3, java.lang.Object r4) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0022;
                case 1: goto L_0x0005;
                case 2: goto L_0x002c;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x002c;
                case 7: goto L_0x000b;
                case 8: goto L_0x0013;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r3 instanceof java.lang.String
            r1 = 0
            if (r0 != 0) goto L_0x0038
        L_0x000a:
            return r1
        L_0x000b:
            boolean r0 = r3 instanceof java.lang.Integer
            r1 = 0
            if (r0 == 0) goto L_0x000a
            boolean r0 = r4 instanceof java.lang.Double
            goto L_0x0029
        L_0x0013:
            if (r3 == 0) goto L_0x001b
            boolean r0 = r3 instanceof java.lang.String
            if (r0 != 0) goto L_0x001b
        L_0x0019:
            r1 = 0
            return r1
        L_0x001b:
            if (r4 == 0) goto L_0x0033
            boolean r0 = r4 instanceof java.lang.String
            if (r0 != 0) goto L_0x0033
            goto L_0x0019
        L_0x0022:
            boolean r0 = r3 instanceof java.lang.String
            r1 = 0
            if (r0 == 0) goto L_0x000a
            boolean r0 = r4 instanceof android.graphics.Typeface
        L_0x0029:
            if (r0 != 0) goto L_0x0033
            return r1
        L_0x002c:
            boolean r0 = r3 instanceof java.lang.String
            r1 = 0
            if (r0 == 0) goto L_0x000a
            if (r4 != 0) goto L_0x0038
        L_0x0033:
            boolean r1 = super.remove(r3, r4)
            return r1
        L_0x0038:
            boolean r0 = r4 instanceof java.lang.String
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20581Wuz.remove(java.lang.Object, java.lang.Object):boolean");
    }

    public C20581Wuz(JSONObject jSONObject) {
        this.A00 = 8;
        put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
    }
}
