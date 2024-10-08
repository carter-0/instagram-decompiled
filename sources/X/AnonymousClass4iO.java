package X;

import android.net.Uri;
import com.facebook.common.json.FbJsonDeserializer;
import com.facebook.common.json.UriDeserializer;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.4iO  reason: invalid class name */
public abstract class AnonymousClass4iO {
    public static final FbJsonDeserializer A00 = new Object();
    public static final ConcurrentMap A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.facebook.common.json.FbJsonDeserializer] */
    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        A01 = concurrentHashMap;
        concurrentHashMap.put(C252503pD.class, JsonNodeDeserializer.A00);
        concurrentHashMap.put(String.class, StringDeserializer.A00);
        Class<Integer> cls = Integer.class;
        concurrentHashMap.put(cls, C271204iP.A00(cls, cls.getName()));
        Class<Long> cls2 = Long.class;
        concurrentHashMap.put(cls2, C271204iP.A00(cls2, cls2.getName()));
        Class<Boolean> cls3 = Boolean.class;
        concurrentHashMap.put(cls3, C271204iP.A00(cls3, cls3.getName()));
        Class<Float> cls4 = Float.class;
        concurrentHashMap.put(cls4, C271204iP.A00(cls4, cls4.getName()));
        Class<Double> cls5 = Double.class;
        concurrentHashMap.put(cls5, C271204iP.A00(cls5, cls5.getName()));
        concurrentHashMap.put(Uri.class, new UriDeserializer());
        concurrentHashMap.put(C267574bm.class, new TokenBufferDeserializer());
        concurrentHashMap.put(Object.class, new UntypedObjectDeserializer((C268894eF) null, (C268894eF) null));
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [java.lang.Object, com.facebook.common.json.TreeFragmentModelBase64Deserializer] */
    /* JADX WARNING: type inference failed for: r0v23, types: [com.facebook.common.json.FbJsonDeserializer] */
    /* JADX WARNING: type inference failed for: r0v27 */
    /* JADX WARNING: type inference failed for: r0v30 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (r0 == null) goto L_0x0062;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fasterxml.jackson.databind.JsonDeserializer A00(java.lang.Class r5) {
        /*
            java.util.concurrent.ConcurrentMap r4 = A01
            java.lang.Object r0 = r4.get(r5)
            com.fasterxml.jackson.databind.JsonDeserializer r0 = (com.fasterxml.jackson.databind.JsonDeserializer) r0
            com.facebook.common.json.FbJsonDeserializer r3 = A00
            if (r0 != r3) goto L_0x000e
            r0 = 0
        L_0x000d:
            return r0
        L_0x000e:
            if (r0 != 0) goto L_0x000d
            java.lang.Class<X.4iQ> r0 = X.C271214iQ.class
            boolean r0 = r0.isAssignableFrom(r5)
            if (r0 == 0) goto L_0x0026
            com.facebook.common.json.TypeModelBase64Deserializer r0 = new com.facebook.common.json.TypeModelBase64Deserializer
            r0.<init>()
        L_0x001d:
            r0.A00 = r5
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            r3 = r0
        L_0x0022:
            r4.putIfAbsent(r5, r3)
            return r0
        L_0x0026:
            java.lang.Class<X.3ls> r0 = X.C250673ls.class
            boolean r0 = r0.isAssignableFrom(r5)
            if (r0 == 0) goto L_0x0036
            com.facebook.common.json.TreeFragmentModelBase64Deserializer r0 = new com.facebook.common.json.TreeFragmentModelBase64Deserializer
            r0.<init>()
            r0.A00 = r5
            goto L_0x001f
        L_0x0036:
            java.lang.Class<X.4iR> r0 = X.C271224iR.class
            boolean r0 = r0.isAssignableFrom(r5)
            if (r0 == 0) goto L_0x0044
            com.facebook.common.json.FBJsonSelfDeserializer r0 = new com.facebook.common.json.FBJsonSelfDeserializer
            r0.<init>()
            goto L_0x001d
        L_0x0044:
            java.lang.String r2 = r5.getName()
            r1 = 36
            r0 = 95
            java.lang.String r1 = r2.replace(r1, r0)
            java.lang.String r0 = "Deserializer"
            java.lang.String r0 = r1.concat(r0)
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | ExceptionInInitializerError | IllegalAccessException | InstantiationException | NoClassDefFoundError -> 0x0062 }
            java.lang.Object r0 = r0.newInstance()     // Catch:{ ClassNotFoundException | ExceptionInInitializerError | IllegalAccessException | InstantiationException | NoClassDefFoundError -> 0x0062 }
            com.fasterxml.jackson.databind.JsonDeserializer r0 = (com.fasterxml.jackson.databind.JsonDeserializer) r0     // Catch:{ ClassNotFoundException | ExceptionInInitializerError | IllegalAccessException | InstantiationException | NoClassDefFoundError -> 0x0062 }
            if (r0 != 0) goto L_0x001f
        L_0x0062:
            java.lang.String r0 = "$Deserializer"
            java.lang.String r0 = r2.concat(r0)
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | ExceptionInInitializerError | IllegalAccessException | InstantiationException | NoClassDefFoundError -> 0x0073 }
            java.lang.Object r0 = r0.newInstance()     // Catch:{ ClassNotFoundException | ExceptionInInitializerError | IllegalAccessException | InstantiationException | NoClassDefFoundError -> 0x0073 }
            com.fasterxml.jackson.databind.JsonDeserializer r0 = (com.fasterxml.jackson.databind.JsonDeserializer) r0     // Catch:{ ClassNotFoundException | ExceptionInInitializerError | IllegalAccessException | InstantiationException | NoClassDefFoundError -> 0x0073 }
            goto L_0x001f
        L_0x0073:
            r0 = 0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4iO.A00(java.lang.Class):com.fasterxml.jackson.databind.JsonDeserializer");
    }
}
