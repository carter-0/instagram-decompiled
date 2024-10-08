package com.instagram.pando.livetree;

import X.0dV;
import X.0kg;
import X.0qQ;
import X.0sP;
import X.0wb;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C44961Cnv;
import X.C51791G2a;
import X.C58698Iw7;
import X.C61082JwK;
import X.C62320sa;
import X.GL8;
import X.MJ3;
import com.facebook.jni.HybridClassBase;
import com.facebook.pando.PandoConsistencyServiceJNI;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public final class LiveTreeJNI extends HybridClassBase {
    public static final C44961Cnv Companion = new Object();
    public final Map fieldCache = new ConcurrentHashMap();
    public final Map reconciledFieldCache = new ConcurrentHashMap();

    public final class LiveTreeCallbacks {
        public final C62320sa clearCache;

        public LiveTreeCallbacks(C62320sa r2) {
            0qQ.A0B(r2, 1);
            this.clearCache = r2;
        }

        public final void onShouldClearCache() {
            this.clearCache.invoke();
        }
    }

    public static final native LiveTreeJNI create(String str, String str2, SupportedFieldsJNI supportedFieldsJNI);

    /* access modifiers changed from: private */
    public final native Boolean getOptionalBooleanValueNative(int i);

    /* access modifiers changed from: private */
    public final native Double getOptionalDoubleValueNative(int i);

    /* access modifiers changed from: private */
    public final native List getOptionalIntListNative(int i);

    /* access modifiers changed from: private */
    public final native Integer getOptionalIntValueNative(int i);

    /* access modifiers changed from: private */
    public final native List getOptionalLongListNative(int i);

    /* access modifiers changed from: private */
    public final native Long getOptionalLongValueNative(int i);

    /* access modifiers changed from: private */
    public final native List getOptionalStringListNative(int i);

    /* access modifiers changed from: private */
    public final native String getOptionalStringValueNative(int i);

    /* access modifiers changed from: private */
    public final native List getOptionalTreeListNative(int i, Class cls);

    /* access modifiers changed from: private */
    public final native TreeJNI getOptionalTreeValueNative(int i, Class cls);

    /* access modifiers changed from: private */
    public final native Object getOptionalUntypedIDFieldNative(int i);

    private final native void publishRootTreeNative(TreeJNI treeJNI);

    private final native void publishRootTreeUpdaterNative(TreeUpdaterJNI treeUpdaterJNI);

    private final native void setNullNative(int i);

    private final native void subscribeToUpdatesNative(PandoConsistencyServiceJNI pandoConsistencyServiceJNI, LiveTreeCallbacks liveTreeCallbacks, Executor executor);

    private final native void updateBooleanValueNative(int i, boolean z);

    private final native void updateDoubleValueNative(int i, double d);

    private final native void updateIntListNative(int i, List list);

    private final native void updateIntValueNative(int i, int i2);

    private final native void updateLongListNative(int i, List list);

    private final native void updateLongValueNative(int i, long j);

    private final native void updateStringListNative(int i, List list);

    private final native void updateStringValueNative(int i, String str);

    private final native void updateTreeListNative(int i, List list);

    private final native void updateTreeListWithUpdaterNative(int i, List list);

    private final native void updateTreeValueNative(int i, TreeJNI treeJNI);

    private final native void updateTreeValueWithUpdaterNative(int i, TreeUpdaterJNI treeUpdaterJNI);

    public final List getOptionalEnumListByHashCode(int i, 0sP r4) {
        0qQ.A0B(r4, 1);
        return (List) getValueFromCache(i, new GL8(i, 17, this, r4));
    }

    public final Object getOptionalEnumValueByHashCode(int i, 0sP r4) {
        0qQ.A0B(r4, 1);
        return getValueFromCache(i, new GL8(i, 18, this, r4));
    }

    public final List getOptionalTreeListByHashCode(int i, Class cls) {
        0qQ.A0B(cls, 1);
        return (List) getValueFromCache(i, new GL8(i, 19, this, cls));
    }

    public final Object getOptionalTreeValueByHashCode(int i, Class cls) {
        0qQ.A0B(cls, 1);
        return getValueFromCache(i, new GL8(i, 20, this, cls));
    }

    public final List getReconciledOptionalTreeListByHashCode(int i, Class cls, 0sP r9) {
        0sP r3 = r9;
        AnonymousClass7TG.A1O(cls, r9);
        return (List) getReconciledValueFromCache(i, new C58698Iw7(i, 14, (Object) r3, (Object) this, (Object) cls));
    }

    public final Object getReconciledOptionalTreeValueByHashCode(int i, Class cls, 0sP r9) {
        0sP r3 = r9;
        AnonymousClass7TG.A1O(cls, r9);
        return getReconciledValueFromCache(i, new C58698Iw7(i, 15, (Object) r3, (Object) this, (Object) cls));
    }

    public final native void publishBatchedUpdate();

    public final void publishRootTree(TreeJNI treeJNI) {
        0qQ.A0B(treeJNI, 0);
        clearCache();
        publishRootTreeNative(treeJNI);
    }

    public final void publishRootTreeUpdater(TreeUpdaterJNI treeUpdaterJNI) {
        0qQ.A0B(treeUpdaterJNI, 0);
        clearCache();
        publishRootTreeUpdaterNative(treeUpdaterJNI);
    }

    public final void setNullByHashCode(int i) {
        updateCacheByHashCode(i, (Object) null);
        setNullNative(i);
    }

    public final native void startBatchingUpdates();

    public final void updateEnumValueByHashCode(int i, Object obj, 0sP r4) {
        0qQ.A0B(r4, 2);
        updateCacheByHashCode(i, obj);
        updateStringValueNative(i, (String) r4.invoke(obj));
    }

    public final void updateIDValueByHashCode(int i, Object obj) {
        0qQ.A0B(obj, 1);
        updateStringValueByHashCode(i, obj.toString());
    }

    public final void updateIntListByHashCode(int i, List list) {
        0qQ.A0B(list, 1);
        updateCacheByHashCode(i, list);
        updateIntListNative(i, list);
    }

    public final void updateLongListByHashCode(int i, List list) {
        0qQ.A0B(list, 1);
        updateCacheByHashCode(i, list);
        updateLongListNative(i, list);
    }

    public final void updateOptionalEnumListByHashCode(int i, List list, 0sP r4) {
        0qQ.A0B(r4, 2);
        if (list == null) {
            setNullByHashCode(i);
        } else {
            updateEnumListByHashCode(i, list, r4);
        }
    }

    public final void updateOptionalEnumValueByHashCode(int i, Object obj, 0sP r4) {
        0qQ.A0B(r4, 2);
        if (obj == null) {
            setNullByHashCode(i);
        } else {
            updateEnumValueByHashCode(i, obj, r4);
        }
    }

    public final void updateOptionalTreeListByHashCode(int i, List list, C62320sa r4) {
        0qQ.A0B(r4, 2);
        updateCacheByHashCode(i, list);
        updateOptionalTreeListInLiveTree(i, list, r4);
    }

    public final void updateOptionalTreeValueByHashCode(int i, Object obj, C62320sa r4) {
        0qQ.A0B(r4, 2);
        updateCacheByHashCode(i, obj);
        updateOptionalTreeValueInLiveTree(i, obj, r4);
    }

    public final void updateReconciledOptionalTreeListByHashCode(int i, List list, C62320sa r4) {
        0qQ.A0B(r4, 2);
        updateReconciledCacheByHashCode(i, list);
        updateOptionalTreeListInLiveTree(i, list, r4);
    }

    public final void updateReconciledOptionalTreeValueByHashCode(int i, Object obj, C62320sa r4) {
        0qQ.A0B(r4, 2);
        updateReconciledCacheByHashCode(i, obj);
        updateOptionalTreeValueInLiveTree(i, obj, r4);
    }

    public final void updateStringListByHashCode(int i, List list) {
        0qQ.A0B(list, 1);
        updateCacheByHashCode(i, list);
        updateStringListNative(i, list);
    }

    public final void updateStringValueByHashCode(int i, String str) {
        0qQ.A0B(str, 1);
        updateCacheByHashCode(i, str);
        updateStringValueNative(i, str);
    }

    public final void updateTreeListByHashCode(int i, List list) {
        0qQ.A0B(list, 1);
        updateTreeListNative(i, list);
    }

    public final void updateTreeValueByHashCode(int i, TreeJNI treeJNI) {
        0qQ.A0B(treeJNI, 1);
        updateTreeValueNative(i, treeJNI);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.Cnv] */
    static {
        0dV.A0C("live-tree-jni");
    }

    /* access modifiers changed from: private */
    public final void clearCache() {
        this.fieldCache.clear();
        for (Map.Entry entry : this.reconciledFieldCache.entrySet()) {
            this.reconciledFieldCache.put(Integer.valueOf(AnonymousClass7TE.A0M(entry.getKey())), new C61082JwK(35, ((C61082JwK) entry.getValue()).A00, true));
        }
    }

    private final Object getReconciledValueFromCache(int i, C62320sa r7) {
        Object obj;
        Map map = this.reconciledFieldCache;
        Integer valueOf = Integer.valueOf(i);
        Object obj2 = map.get(valueOf);
        if (obj2 == null) {
            obj2 = new C61082JwK(r7.invoke());
            map.put(valueOf, obj2);
        }
        C61082JwK jwK = (C61082JwK) obj2;
        if (jwK.A01) {
            obj = r7.invoke();
            updateReconciledCacheByHashCode(i, obj);
        } else {
            obj = jwK.A00;
        }
        if (obj != null) {
            return obj;
        }
        return null;
    }

    private final Object getValueFromCache(int i, C62320sa r7) {
        Map map = this.fieldCache;
        Integer valueOf = Integer.valueOf(i);
        Object obj = map.get(valueOf);
        if (obj == null) {
            obj = new C61082JwK(r7.invoke());
            map.put(valueOf, obj);
        }
        Object obj2 = ((C61082JwK) obj).A00;
        if (obj2 != null) {
            return obj2;
        }
        return null;
    }

    private final void updateOptionalTreeListInLiveTree(int i, List list, C62320sa r6) {
        if (list == null) {
            setNullNative(i);
            return;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Object obj : list) {
                if (!(obj instanceof TreeJNI)) {
                    List list2 = (List) r6.invoke();
                    if (list2 != null) {
                        updateTreeListWithUpdaterNative(i, list2);
                        return;
                    } else {
                        0wb.A01(0kg.A0A, "LiveTreeJNI", "TreeUpaters returned null!");
                        return;
                    }
                }
            }
        }
        updateTreeListNative(i, list);
    }

    private final void updateOptionalTreeValueInLiveTree(int i, Object obj, C62320sa r4) {
        if (obj != null) {
            if (obj instanceof TreeJNI) {
                updateTreeValueNative(i, (TreeJNI) obj);
                return;
            }
            TreeUpdaterJNI treeUpdaterJNI = (TreeUpdaterJNI) r4.invoke();
            if (treeUpdaterJNI != null) {
                updateTreeValueWithUpdaterNative(i, treeUpdaterJNI);
                return;
            }
        }
        setNullNative(i);
    }

    public final Boolean getOptionalBooleanValueByHashCode(int i) {
        return (Boolean) getValueFromCache(i, new MJ3(i, 36, this));
    }

    public final Double getOptionalDoubleValueByHashCode(int i) {
        return (Double) getValueFromCache(i, new MJ3(i, 37, this));
    }

    public final Float getOptionalFloatValueByHashCode(int i) {
        return (Float) getValueFromCache(i, new MJ3(i, 38, this));
    }

    public final List getOptionalIDListByHashCode(int i) {
        return (List) getValueFromCache(i, new MJ3(i, 39, this));
    }

    public final String getOptionalIDValueByHashCode(int i) {
        return (String) getValueFromCache(i, new MJ3(i, 40, this));
    }

    public final List getOptionalIntListByHashCode(int i) {
        return (List) getValueFromCache(i, new MJ3(i, 41, this));
    }

    public final Integer getOptionalIntValueByHashCode(int i) {
        return (Integer) getValueFromCache(i, new MJ3(i, 42, this));
    }

    public final List getOptionalLongListByHashCode(int i) {
        return (List) getValueFromCache(i, new MJ3(i, 43, this));
    }

    public final Long getOptionalLongValueByHashCode(int i) {
        return (Long) getValueFromCache(i, new MJ3(i, 44, this));
    }

    public final List getOptionalStringListByHashCode(int i) {
        return (List) getValueFromCache(i, new MJ3(i, 45, this));
    }

    public final String getOptionalStringValueByHashCode(int i) {
        return (String) getValueFromCache(i, new MJ3(i, 46, this));
    }

    public final void updateOptionalBooleanValueByHashCode(int i, Boolean bool) {
        if (bool == null) {
            setNullByHashCode(i);
        } else {
            updateBooleanValueByHashCode(i, bool.booleanValue());
        }
    }

    public final void updateOptionalDoubleValueByHashCode(int i, Double d) {
        if (d == null) {
            setNullByHashCode(i);
        } else {
            updateDoubleValueByHashCode(i, d.doubleValue());
        }
    }

    public final void updateOptionalFloatValueByHashCode(int i, Float f) {
        if (f == null) {
            setNullByHashCode(i);
        } else {
            updateFloatValueByHashCode(i, f.floatValue());
        }
    }

    public final void updateOptionalIDListByHashCode(int i, List list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = AnonymousClass7TG.A0r(list);
            for (Object obj : list) {
                arrayList.add(obj.toString());
            }
        } else {
            arrayList = null;
        }
        updateOptionalStringListByHashCode(i, arrayList);
    }

    public final void updateOptionalIDValueByHashCode(int i, Object obj) {
        String str;
        if (obj != null) {
            str = obj.toString();
        } else {
            str = null;
        }
        updateOptionalStringValueByHashCode(i, str);
    }

    public final void updateOptionalIntListByHashCode(int i, List list) {
        if (list == null) {
            setNullByHashCode(i);
        } else {
            updateIntListByHashCode(i, list);
        }
    }

    public final void updateOptionalIntValueByHashCode(int i, Integer num) {
        if (num == null) {
            setNullByHashCode(i);
        } else {
            updateIntValueByHashCode(i, num.intValue());
        }
    }

    public final void updateOptionalLongListByHashCode(int i, List list) {
        if (list == null) {
            setNullByHashCode(i);
        } else {
            updateLongListByHashCode(i, list);
        }
    }

    public final void updateOptionalLongValueByHashCode(int i, Long l) {
        if (l == null) {
            setNullByHashCode(i);
        } else {
            updateLongValueByHashCode(i, l.longValue());
        }
    }

    public final void updateOptionalStringListByHashCode(int i, List list) {
        if (list == null) {
            setNullByHashCode(i);
        } else {
            updateStringListByHashCode(i, list);
        }
    }

    public final void updateOptionalStringValueByHashCode(int i, String str) {
        if (str == null) {
            setNullByHashCode(i);
        } else {
            updateStringValueByHashCode(i, str);
        }
    }

    public final void subscribeToUpdates(PandoConsistencyServiceJNI pandoConsistencyServiceJNI, Executor executor) {
        AnonymousClass7TG.A1N(pandoConsistencyServiceJNI, executor);
        subscribeToUpdatesNative(pandoConsistencyServiceJNI, new LiveTreeCallbacks(new C51791G2a(this, 8)), executor);
    }

    public final void updateBooleanValueByHashCode(int i, boolean z) {
        updateCacheByHashCode(i, Boolean.valueOf(z));
        updateBooleanValueNative(i, z);
    }

    public final void updateCacheByHashCode(int i, Object obj) {
        this.fieldCache.put(Integer.valueOf(i), new C61082JwK(obj));
    }

    public final void updateDoubleValueByHashCode(int i, double d) {
        updateCacheByHashCode(i, Double.valueOf(d));
        updateDoubleValueNative(i, d);
    }

    public final void updateEnumListByHashCode(int i, List list, 0sP r4) {
        AnonymousClass7TG.A1O(list, r4);
        updateCacheByHashCode(i, list);
        updateStringListNative(i, (List) r4.invoke(list));
    }

    public final void updateFloatValueByHashCode(int i, float f) {
        updateCacheByHashCode(i, Float.valueOf(f));
        updateDoubleValueNative(i, (double) f);
    }

    public final void updateIntValueByHashCode(int i, int i2) {
        updateCacheByHashCode(i, Integer.valueOf(i2));
        updateIntValueNative(i, i2);
    }

    public final void updateLongValueByHashCode(int i, long j) {
        updateCacheByHashCode(i, Long.valueOf(j));
        updateLongValueNative(i, j);
    }

    public final void updateReconciledCacheByHashCode(int i, Object obj) {
        this.reconciledFieldCache.put(Integer.valueOf(i), new C61082JwK(obj));
    }
}
