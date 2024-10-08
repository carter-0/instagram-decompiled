package X;

import com.facebook.graphservice.interfaces.FromStringAble;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3lr  reason: invalid class name and case insensitive filesystem */
public abstract class C250663lr extends TreeJNI {
    public static final C254573sh Companion = new Object();
    public static final Map cachedASTs = new LinkedHashMap();
    public final AnonymousClass0eM indexAccessorCache$delegate = AnonymousClass0eN.A00(0eO.A03, new C377129Kq(this, 28));

    /* access modifiers changed from: private */
    public final boolean coerceBoolean(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            return Boolean.parseBoolean((String) obj);
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final int coerceInt(Object obj) {
        if (obj == null) {
            return 0;
        }
        if ((obj instanceof Integer) || (obj instanceof Number)) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            return Integer.parseInt((String) obj);
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public final boolean doesFulfillSpread(String str, String str2, String str3, String str4, String str5) {
        if ((str2 != null && 0qQ.A0K(getBooleanVariable(str2), true)) || (str3 != null && !0qQ.A0K(getBooleanVariable(str3), true))) {
            return false;
        }
        if (str != null && !isFulfilled(str)) {
            return false;
        }
        if (str4 != null) {
            return (str5 != null && 0qQ.A0K(getBooleanVariable(str5), false)) || isFieldSet(002.A0g("is_defer_fulfilled(fragment_name:\"", str4, "\")"));
        }
        return true;
    }

    public final int A00(String str) {
        return getCoercedIntField(2, str);
    }

    public final C250663lr A01(Class cls, int i) {
        return reinterpretRequired(0, cls, i);
    }

    public final C250663lr A02(Class cls, String str, int i) {
        return getOptionalTreeField(1, str, cls, i);
    }

    public final C250663lr A03(Class cls, String str, int i) {
        return getOptionalTreeField(0, str, cls, i);
    }

    public final C250663lr A04(Class cls, String str, int i) {
        return getOptionalTreeField(2, str, cls, i);
    }

    public final C250663lr A05(Class cls, String str, int i) {
        return getRequiredTreeField(0, str, cls, i);
    }

    public final ImmutableList A06(Class cls, String str, int i) {
        return getRequiredCompactedTreeListField(0, str, cls, i);
    }

    public final String A07(String str) {
        return getOptionalStringField(0, str);
    }

    public final String A08(String str) {
        return getOptionalStringField(1, str);
    }

    public final String A09(String str) {
        return getOptionalStringField(2, str);
    }

    public final String A0A(String str) {
        return getOptionalStringField(3, str);
    }

    public final String A0B(String str) {
        return getOptionalStringField(4, str);
    }

    public final String A0C(String str) {
        return getOptionalStringField(5, str);
    }

    public final List bubbledNullPaths(String str) {
        0qQ.A0B(str, 0);
        AnonymousClass4Kr[] r6 = cachedSelectionSet().A00;
        ArrayList<AnonymousClass4Kr> arrayList = new ArrayList<>();
        int length = r6.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            AnonymousClass4Kr r2 = r6[i];
            int i3 = i2 + 1;
            if (!isSelectionOptionalOrNonnull(i2, r2)) {
                arrayList.add(r2);
            }
            i++;
            i2 = i3;
        }
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
        for (AnonymousClass4Kr r22 : arrayList) {
            arrayList2.add(bubbledNullPathsForNullSelection(002.A0T(str, r22.AGY(), '.'), r22));
        }
        return 0Yv.A1F(arrayList2);
    }

    public final boolean getCoercedBooleanField(int i, String str) {
        0qQ.A0B(str, 1);
        return ((Boolean) intoWithCache(i, new C377609Mm(str, this, 1), new C377189Kw(this, 23))).booleanValue();
    }

    public final ImmutableList getCoercedCompactedBooleanListField(int i, String str) {
        0qQ.A0B(str, 1);
        return (ImmutableList) intoWithCache(i, new C73670Phj(str, this, 3), new TY5(this, 34));
    }

    public final ImmutableList getCoercedCompactedDoubleListField(int i, String str) {
        0qQ.A0B(str, 1);
        return (ImmutableList) intoWithCache(i, new C73670Phj(str, this, 4), new TY5(this, 35));
    }

    public final ImmutableList getCoercedCompactedEnumListField(int i, String str, Enum enumR) {
        0qQ.A0B(str, 1);
        0qQ.A0B(enumR, 2);
        return (ImmutableList) intoWithCache(i, new C73670Phj(str, this, 5), new TYA(30, (Object) this, (Object) enumR));
    }

    public final ImmutableList getCoercedCompactedIntListField(int i, String str) {
        0qQ.A0B(str, 1);
        return (ImmutableList) intoWithCache(i, new C73670Phj(str, this, 6), new TY5(this, 36));
    }

    public final ImmutableList getCoercedCompactedStringDefListField(int i, String str, String str2, String str3, FromStringAble fromStringAble) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        FromStringAble fromStringAble2 = fromStringAble;
        0qQ.A0B(fromStringAble, 4);
        return (ImmutableList) intoWithCache(i, new C73670Phj(str, this, 7), new C74192PqY((Object) this, (Object) fromStringAble2, str2, str3, 0));
    }

    public final ImmutableList getCoercedCompactedStringListField(int i, String str) {
        0qQ.A0B(str, 1);
        return (ImmutableList) intoWithCache(i, new C73670Phj(str, this, 8), new TY5(this, 37));
    }

    public final ImmutableList getCoercedCompactedTimeListField(int i, String str) {
        0qQ.A0B(str, 1);
        return (ImmutableList) intoWithCache(i, new C73670Phj(str, this, 9), new TY5(this, 38));
    }

    public final ImmutableList getCoercedCompactedTreeListField(int i, String str, Class cls, int i2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(cls, 2);
        Object intoWithCache = intoWithCache(i, new C58719IwS(cls, this, str, 1), C41689Ayg.A00);
        0qQ.A07(intoWithCache);
        return (ImmutableList) intoWithCache;
    }

    public final double getCoercedDoubleField(int i, String str) {
        0qQ.A0B(str, 1);
        return ((Number) intoWithCache(i, new C377609Mm(str, this, 2), new C377189Kw(this, 24))).doubleValue();
    }

    public final Enum getCoercedEnumField(int i, String str, Enum enumR) {
        0qQ.A0B(str, 1);
        0qQ.A0B(enumR, 2);
        Object intoWithCache = intoWithCache(i, new C73670Phj(str, this, 10), new TY5(enumR, 39));
        0qQ.A07(intoWithCache);
        return (Enum) intoWithCache;
    }

    public final int getCoercedIntField(int i, String str) {
        0qQ.A0B(str, 1);
        return ((Number) intoWithCache(i, new C377609Mm(str, this, 3), new C377189Kw(this, 25))).intValue();
    }

    public final String getCoercedStringDefField(int i, String str, String str2, String str3, FromStringAble fromStringAble) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        0qQ.A0B(fromStringAble, 4);
        Object intoWithCache = intoWithCache(i, new C73670Phj(str, this, 11), new C73950PmU(fromStringAble, str2, str3, 1));
        0qQ.A07(intoWithCache);
        return (String) intoWithCache;
    }

    public final long getCoercedTimeField(int i, String str) {
        0qQ.A0B(str, 1);
        return ((Number) intoWithCache(i, new C377609Mm(str, this, 4), new C377189Kw(this, 26))).longValue();
    }

    public final Boolean getOptionalBooleanField(int i, String str) {
        0qQ.A0B(str, 1);
        return (Boolean) withCache(i, new C73670Phj(str, this, 12));
    }

    public final ImmutableList getOptionalCompactedBooleanListField(int i, String str) {
        0qQ.A0B(str, 1);
        return (ImmutableList) withCache(i, new C73670Phj(str, this, 13));
    }

    public final ImmutableList getOptionalCompactedDoubleListField(int i, String str) {
        0qQ.A0B(str, 1);
        return (ImmutableList) withCache(i, new C73670Phj(str, this, 14));
    }

    public final ImmutableList getOptionalCompactedEnumListField(int i, String str, Enum enumR) {
        0qQ.A0B(str, 1);
        0qQ.A0B(enumR, 2);
        return (ImmutableList) intoWithCache(i, new C377609Mm(str, this, 5), new C377469Ly(25, (Object) this, (Object) enumR));
    }

    public final ImmutableList getOptionalCompactedIntListField(int i, String str) {
        0qQ.A0B(str, 1);
        return (ImmutableList) withCache(i, new C73670Phj(str, this, 15));
    }

    public final C45407Cvn getOptionalCompactedPaginableListEdgesField(int i, String str, Class cls, int i2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(cls, 2);
        return (C45407Cvn) withCache(i, new C58719IwS(cls, this, str, 2));
    }

    public final ImmutableList getOptionalCompactedStringDefListField(int i, String str, String str2, String str3, FromStringAble fromStringAble) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        FromStringAble fromStringAble2 = fromStringAble;
        0qQ.A0B(fromStringAble, 4);
        return (ImmutableList) intoWithCache(i, new C73670Phj(str, this, 16), new C74192PqY((Object) this, (Object) fromStringAble2, str2, str3, 1));
    }

    public final ImmutableList getOptionalCompactedStringListField(int i, String str) {
        0qQ.A0B(str, 1);
        return (ImmutableList) withCache(i, new C377609Mm(str, this, 6));
    }

    public final ImmutableList getOptionalCompactedTimeListField(int i, String str) {
        0qQ.A0B(str, 1);
        return (ImmutableList) withCache(i, new C73670Phj(str, this, 17));
    }

    public final ImmutableList getOptionalCompactedTreeListField(int i, String str, Class cls, int i2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(cls, 2);
        return (ImmutableList) withCache(i, new C377689Mu(this, cls, str, 0));
    }

    public final Double getOptionalDoubleField(int i, String str) {
        0qQ.A0B(str, 1);
        return (Double) withCache(i, new C73670Phj(str, this, 18));
    }

    public final Enum getOptionalEnumField(int i, String str, Enum enumR) {
        0qQ.A0B(str, 1);
        0qQ.A0B(enumR, 2);
        return (Enum) intoWithCache(i, new C377609Mm(str, this, 7), new C377189Kw(enumR, 27));
    }

    public final Integer getOptionalIntField(int i, String str) {
        0qQ.A0B(str, 1);
        return (Integer) withCache(i, new C73670Phj(str, this, 19));
    }

    public final C45407Cvn getOptionalPaginableListEdges(String str, Class cls) {
        ImmutableList optionalTreeList;
        0qQ.A0B(str, 0);
        0qQ.A0B(cls, 1);
        TreeJNI treeValue = getTreeValue("page_info", TreeJNI.class);
        if (treeValue == null || (optionalTreeList = getOptionalTreeList(str, cls)) == null) {
            return null;
        }
        String stringValue = getStringValue("*connection_state_key");
        if (stringValue == null) {
            stringValue = "";
        }
        treeValue.getBooleanValue("has_previous_page");
        boolean booleanValue = treeValue.getBooleanValue("has_next_page");
        getBooleanValue("*pending_prev_edge");
        boolean booleanValue2 = getBooleanValue("*pending_next_edge");
        getStringValue("*prev_page_uuid");
        String stringValue2 = getStringValue("*next_page_uuid");
        String stringValue3 = getStringValue("*query_schema");
        getBooleanValue("*had_error");
        getStringValue("*error_message");
        return new C45407Cvn(optionalTreeList, stringValue, stringValue2, stringValue3, booleanValue, booleanValue2);
    }

    public final String getOptionalStringDefField(int i, String str, String str2, String str3, FromStringAble fromStringAble) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        0qQ.A0B(fromStringAble, 4);
        return (String) intoWithCache(i, new C73670Phj(str, this, 20), new C73950PmU(fromStringAble, str2, str3, 2));
    }

    public final String getOptionalStringField(int i, String str) {
        0qQ.A0B(str, 1);
        return (String) withCache(i, new C377609Mm(str, this, 8));
    }

    public final Long getOptionalTimeField(int i, String str) {
        0qQ.A0B(str, 1);
        return (Long) withCache(i, new C73670Phj(str, this, 21));
    }

    public final C250663lr getOptionalTreeField(int i, String str, Class cls, int i2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(cls, 2);
        return (C250663lr) withCache(i, new C377689Mu(this, cls, str, 1));
    }

    public final C45407Cvn getPaginableListEdges(String str, Class cls) {
        boolean z;
        0qQ.A0B(str, 0);
        0qQ.A0B(cls, 1);
        TreeJNI treeValue = getTreeValue("page_info", TreeJNI.class);
        String stringValue = getStringValue("*connection_state_key");
        if (stringValue == null) {
            stringValue = "";
        }
        ImmutableList treeList = getTreeList(str, cls);
        0qQ.A07(treeList);
        if (treeValue != null) {
            treeValue.getBooleanValue("has_previous_page");
            z = treeValue.getBooleanValue("has_next_page");
        } else {
            z = false;
        }
        getBooleanValue("*pending_prev_edge");
        boolean booleanValue = getBooleanValue("*pending_next_edge");
        getStringValue("*prev_page_uuid");
        String stringValue2 = getStringValue("*next_page_uuid");
        String stringValue3 = getStringValue("*query_schema");
        getBooleanValue("*had_error");
        getStringValue("*error_message");
        return new C45407Cvn(treeList, stringValue, stringValue2, stringValue3, z, booleanValue);
    }

    public final boolean getRequiredBooleanField(int i, String str) {
        0qQ.A0B(str, 1);
        return ((Boolean) withCache(i, new C377609Mm(str, this, 9))).booleanValue();
    }

    public final ImmutableList getRequiredCompactedBooleanListField(int i, String str) {
        0qQ.A0B(str, 1);
        Object withCache = withCache(i, new C73670Phj(str, this, 22));
        0qQ.A07(withCache);
        return (ImmutableList) withCache;
    }

    public final ImmutableList getRequiredCompactedDoubleListField(int i, String str) {
        0qQ.A0B(str, 1);
        Object withCache = withCache(i, new C73670Phj(str, this, 23));
        0qQ.A07(withCache);
        return (ImmutableList) withCache;
    }

    public final ImmutableList getRequiredCompactedEnumListField(int i, String str, Enum enumR) {
        0qQ.A0B(str, 1);
        0qQ.A0B(enumR, 2);
        return (ImmutableList) intoWithCache(i, new C377609Mm(str, this, 10), new C377469Ly(26, (Object) this, (Object) enumR));
    }

    public final ImmutableList getRequiredCompactedIntListField(int i, String str) {
        0qQ.A0B(str, 1);
        Object withCache = withCache(i, new C73670Phj(str, this, 24));
        0qQ.A07(withCache);
        return (ImmutableList) withCache;
    }

    public final C45407Cvn getRequiredCompactedPaginableListEdgesField(int i, String str, Class cls, int i2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(cls, 2);
        return (C45407Cvn) withCache(i, new C377689Mu(this, cls, str, 2));
    }

    public final ImmutableList getRequiredCompactedStringDefListField(int i, String str, String str2, String str3, FromStringAble fromStringAble) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        FromStringAble fromStringAble2 = fromStringAble;
        0qQ.A0B(fromStringAble, 4);
        return (ImmutableList) intoWithCache(i, new C73670Phj(str, this, 25), new C74192PqY((Object) this, (Object) fromStringAble2, str2, str3, 2));
    }

    public final ImmutableList getRequiredCompactedStringListField(int i, String str) {
        0qQ.A0B(str, 1);
        Object withCache = withCache(i, new C377609Mm(str, this, 11));
        0qQ.A07(withCache);
        return (ImmutableList) withCache;
    }

    public final ImmutableList getRequiredCompactedTimeListField(int i, String str) {
        0qQ.A0B(str, 1);
        Object withCache = withCache(i, new C73670Phj(str, this, 26));
        0qQ.A07(withCache);
        return (ImmutableList) withCache;
    }

    public final ImmutableList getRequiredCompactedTreeListField(int i, String str, Class cls, int i2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(cls, 2);
        Object withCache = withCache(i, new C377689Mu(this, cls, str, 3));
        0qQ.A07(withCache);
        return (ImmutableList) withCache;
    }

    public final double getRequiredDoubleField(int i, String str) {
        0qQ.A0B(str, 1);
        return ((Number) withCache(i, new C377609Mm(str, this, 12))).doubleValue();
    }

    public final Enum getRequiredEnumField(int i, String str, Enum enumR) {
        0qQ.A0B(str, 1);
        0qQ.A0B(enumR, 2);
        Object intoWithCache = intoWithCache(i, new C377609Mm(str, this, 13), new C377189Kw(enumR, 28));
        0qQ.A07(intoWithCache);
        return (Enum) intoWithCache;
    }

    public final int getRequiredIntField(int i, String str) {
        0qQ.A0B(str, 1);
        return ((Number) withCache(i, new C377609Mm(str, this, 14))).intValue();
    }

    public final String getRequiredStringDefField(int i, String str, String str2, String str3, FromStringAble fromStringAble) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        0qQ.A0B(fromStringAble, 4);
        Object intoWithCache = intoWithCache(i, new C73670Phj(str, this, 27), new C73950PmU(fromStringAble, str2, str3, 3));
        0qQ.A07(intoWithCache);
        return (String) intoWithCache;
    }

    public final String getRequiredStringField(int i, String str) {
        0qQ.A0B(str, 1);
        return (String) withCache(i, new C377609Mm(str, this, 15));
    }

    public final long getRequiredTimeField(int i, String str) {
        0qQ.A0B(str, 1);
        return ((Number) withCache(i, new C377609Mm(str, this, 16))).longValue();
    }

    public final C250663lr getRequiredTreeField(int i, String str, Class cls, int i2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(cls, 2);
        return getOptionalTreeField(i, str, cls, i2);
    }

    public abstract AnonymousClass4Kx modelSelectionSet();

    public final C250663lr reinterpretIfFulfills(int i, Class cls, int i2, String str, String str2, String str3, String str4, String str5) {
        0qQ.A0B(cls, 1);
        return (C250663lr) withCache(i, new AnonymousClass9N9(this, cls, str, str2, str3, str4, str5, 0));
    }

    public final C250663lr reinterpretIfFulfillsType(int i, String str, Class cls, int i2) {
        0qQ.A0B(str, 1);
        Class cls2 = cls;
        0qQ.A0B(cls, 2);
        return reinterpretIfFulfills(i, cls2, i2, str, (String) null, (String) null, (String) null, (String) null);
    }

    public final C250663lr reinterpretOptional(int i, Class cls, int i2) {
        0qQ.A0B(cls, 1);
        return (C250663lr) intoWithCache(i, new AnonymousClass9M0(20, cls, this), C41690Ayh.A00);
    }

    public final C250663lr reinterpretPlugin(Class cls, int i) {
        0qQ.A0B(cls, 0);
        C250663lr r1 = (C250663lr) reinterpret(cls);
        if (!AnonymousClass1vU.A00 || r1 == null || r1.areAllSelectionsOptionalOrNonnull()) {
            return r1;
        }
        return null;
    }

    public final C250663lr reinterpretRequired(int i, Class cls, int i2) {
        0qQ.A0B(cls, 1);
        Object withCache = withCache(i, new AnonymousClass9M0(21, cls, this));
        0qQ.A07(withCache);
        return (C250663lr) withCache;
    }

    private final List bubbledNullPathsForInlineSpread(String str, C295925p8 r3) {
        C250663lr r0 = (C250663lr) reinterpret(r3.A01);
        if (r0 != null) {
            return r0.bubbledNullPaths(str);
        }
        List singletonList = Collections.singletonList(str);
        0qQ.A07(singletonList);
        return singletonList;
    }

    private final List bubbledNullPathsForNullLinkedField(String str, AnonymousClass4Kp r4) {
        C263334Kv A00 = V69.A00(r4.A01);
        if (A00 instanceof AnonymousClass4Ks) {
            C250663lr r0 = (C250663lr) getTreeValue(r4.A00, r4.A02);
            if (r0 != null) {
                return r0.bubbledNullPaths(str);
            }
            List singletonList = Collections.singletonList(str);
            0qQ.A07(singletonList);
            return singletonList;
        } else if ((A00 instanceof C289835eI) || (A00 instanceof C19054WIg)) {
            return bubbledNullPathsForNullLinkedListField(str, r4);
        } else {
            throw new RuntimeException();
        }
    }

    private final List bubbledNullPathsForNullLinkedListField(String str, AnonymousClass4Kp r9) {
        ImmutableList treeList = getTreeList(r9.A00, r9.A02);
        if (treeList == null) {
            List singletonList = Collections.singletonList(str);
            0qQ.A07(singletonList);
            return singletonList;
        }
        ArrayList arrayList = new ArrayList(0Yv.A1E(treeList, 10));
        int i = 0;
        Iterator it = treeList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('[');
            sb.append(i);
            sb.append(']');
            arrayList.add(((C250663lr) next).bubbledNullPaths(sb.toString()));
            i = i2;
        }
        return 0Yv.A1F(arrayList);
    }

    private final List bubbledNullPathsForNullSelection(String str, AnonymousClass4Kr r3) {
        AnonymousClass4Kr r0;
        if (r3 instanceof AnonymousClass4L7) {
            List singletonList = Collections.singletonList(str);
            0qQ.A07(singletonList);
            return singletonList;
        } else if (r3 instanceof AnonymousClass4Kp) {
            return bubbledNullPathsForNullLinkedField(str, (AnonymousClass4Kp) r3);
        } else {
            if (r3 instanceof C295925p8) {
                return bubbledNullPathsForInlineSpread(str, (C295925p8) r3);
            }
            if (r3 instanceof C348457yU) {
                r0 = ((C348457yU) r3).A00;
            } else if (r3 instanceof C295075nX) {
                r0 = ((C295075nX) r3).A00;
            } else if (r3 instanceof AnonymousClass612) {
                r0 = ((AnonymousClass612) r3).A00;
            } else if (r3 instanceof AVF) {
                r0 = ((AVF) r3).A00;
            } else {
                throw new RuntimeException();
            }
            return bubbledNullPathsForNullSelection(str, r0);
        }
    }

    /* access modifiers changed from: private */
    public final AnonymousClass4Kx cachedSelectionSet() {
        int i = this.typeTag;
        if (i == 0) {
            return modelSelectionSet();
        }
        Map map = cachedASTs;
        Integer valueOf = Integer.valueOf(i);
        Object obj = map.get(valueOf);
        if (obj == null) {
            obj = modelSelectionSet();
            map.put(valueOf, obj);
        }
        return (AnonymousClass4Kx) obj;
    }

    /* access modifiers changed from: private */
    public final double coerceDouble(Object obj) {
        if (obj == null) {
            return 0.0d;
        }
        if ((obj instanceof Double) || (obj instanceof Number)) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof String) {
            return Double.parseDouble((String) obj);
        }
        return 0.0d;
    }

    /* access modifiers changed from: private */
    public final ImmutableList coerceList(Object obj) {
        ImmutableList immutableList;
        if ((obj instanceof ImmutableList) && (immutableList = (ImmutableList) obj) != null) {
            return immutableList;
        }
        ImmutableList of = ImmutableList.of();
        0qQ.A07(of);
        return of;
    }

    /* access modifiers changed from: private */
    public final long coerceTime(Object obj) {
        if (obj == null) {
            return 0;
        }
        if ((obj instanceof Long) || (obj instanceof Number)) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof String) {
            return Long.parseLong((String) obj);
        }
        return 0;
    }

    private final Object[] getIndexAccessorCache() {
        return (Object[]) this.indexAccessorCache$delegate.getValue();
    }

    private final boolean isRequiredFulfilledInlineSpreadNonnull(int i, C295925p8 r4) {
        if (reinterpretOptional(i, r4.A01, r4.A00) != null) {
            return true;
        }
        return false;
    }

    private final boolean isRequiredLinkedFieldNonnull(int i, AnonymousClass4Kp r5, C263334Kv r6) {
        Object optionalCompactedPaginableListEdgesField;
        String str = r5.A00;
        if (r6 instanceof AnonymousClass4Ks) {
            optionalCompactedPaginableListEdgesField = getOptionalTreeField(i, str, r5.A02, r5.A00);
        } else if (r6 instanceof C289835eI) {
            optionalCompactedPaginableListEdgesField = getOptionalCompactedTreeListField(i, str, r5.A02, r5.A00);
        } else if (r6 instanceof C19054WIg) {
            optionalCompactedPaginableListEdgesField = getOptionalCompactedPaginableListEdgesField(i, str, r5.A02, r5.A00);
        } else {
            throw new RuntimeException();
        }
        if (optionalCompactedPaginableListEdgesField != null) {
            return true;
        }
        return false;
    }

    private final boolean isRequiredScalarFieldNonnull(AnonymousClass4L7 r2, AnonymousClass4L0 r3) {
        if ((r3 instanceof AnonymousClass4L2) || (r3 instanceof AnonymousClass4L5)) {
            return hasFieldValue(r2.A00);
        }
        throw new RuntimeException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean isSelectionExpectedToBeFulfilled(X.AnonymousClass4Kr r6) {
        /*
            r5 = this;
            boolean r2 = r6 instanceof X.AnonymousClass60T
            r4 = 0
            r0 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            if (r2 == 0) goto L_0x002d
            boolean r0 = r6 instanceof X.AnonymousClass60S
            if (r0 == 0) goto L_0x007c
            r3 = r6
            X.60S r3 = (X.AnonymousClass60S) r3
            boolean r0 = r3 instanceof X.C348457yU
            if (r0 == 0) goto L_0x002f
            X.7yU r6 = (X.C348457yU) r6
            java.lang.String r0 = r6.A01
            java.lang.Boolean r0 = r5.getBooleanVariable(r0)
            boolean r0 = X.0qQ.A0K(r0, r1)
        L_0x0021:
            if (r0 == 0) goto L_0x002e
        L_0x0023:
            X.4Kr r0 = r3.BHK()
            boolean r0 = r5.isSelectionExpectedToBeFulfilled(r0)
            if (r0 == 0) goto L_0x002e
        L_0x002d:
            r4 = 1
        L_0x002e:
            return r4
        L_0x002f:
            boolean r0 = r3 instanceof X.C295075nX
            if (r0 == 0) goto L_0x0042
            X.5nX r6 = (X.C295075nX) r6
            java.lang.String r0 = r6.A01
            java.lang.Boolean r0 = r5.getBooleanVariable(r0)
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x002e
            goto L_0x0023
        L_0x0042:
            boolean r0 = r3 instanceof X.AnonymousClass612
            if (r0 == 0) goto L_0x004f
            X.612 r6 = (X.AnonymousClass612) r6
            java.lang.String r0 = r6.A01
            boolean r0 = r5.isFulfilled(r0)
            goto L_0x0021
        L_0x004f:
            boolean r0 = r3 instanceof X.AVF
            if (r0 == 0) goto L_0x0076
            X.AVF r6 = (X.AVF) r6
            java.lang.String r0 = r6.A02
            if (r0 == 0) goto L_0x0067
            java.lang.Boolean r1 = r5.getBooleanVariable(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0023
        L_0x0067:
            java.lang.String r2 = "is_defer_fulfilled(fragment_name:\""
            java.lang.String r1 = r6.A01
            java.lang.String r0 = "\")"
            java.lang.String r0 = X.002.A0g(r2, r1, r0)
            boolean r0 = r5.isFieldSet(r0)
            goto L_0x0021
        L_0x0076:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x007c:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C250663lr.isSelectionExpectedToBeFulfilled(X.4Kr):boolean");
    }

    private final boolean isSelectionOptionalOrNonnull(int i, AnonymousClass4Kr r5) {
        AnonymousClass4Kr r0;
        boolean isSelectionOptionalOrNonnull;
        if (r5 instanceof AnonymousClass4L7) {
            AnonymousClass4L7 r52 = (AnonymousClass4L7) r5;
            AnonymousClass4L1 r1 = r52.A00;
            if (!(!(r1 instanceof AnonymousClass4L4))) {
                isSelectionOptionalOrNonnull = isRequiredScalarFieldNonnull(r52, C393139vx.A00(r1));
            }
            return true;
        } else if (r5 instanceof AnonymousClass4Kp) {
            AnonymousClass4Kp r53 = (AnonymousClass4Kp) r5;
            AnonymousClass4Kw r12 = r53.A01;
            if (!(!(r12 instanceof AnonymousClass4L4))) {
                isSelectionOptionalOrNonnull = isRequiredLinkedFieldNonnull(i, r53, V69.A00(r12));
            }
            return true;
        } else if (r5 instanceof C295925p8) {
            return isRequiredFulfilledInlineSpreadNonnull(i, (C295925p8) r5);
        } else {
            if (r5 instanceof C348457yU) {
                if (isSelectionExpectedToBeFulfilled(r5)) {
                    r0 = ((C348457yU) r5).A00;
                }
                return true;
            } else if (r5 instanceof C295075nX) {
                if (isSelectionExpectedToBeFulfilled(r5)) {
                    r0 = ((C295075nX) r5).A00;
                }
                return true;
            } else if (r5 instanceof AnonymousClass612) {
                if (isSelectionExpectedToBeFulfilled(r5)) {
                    r0 = ((AnonymousClass612) r5).A00;
                }
                return true;
            } else if (r5 instanceof AVF) {
                if (isSelectionExpectedToBeFulfilled(r5)) {
                    r0 = ((AVF) r5).A00;
                }
                return true;
            } else {
                throw new RuntimeException();
            }
            isSelectionOptionalOrNonnull = isSelectionOptionalOrNonnull(i, r0);
        }
        if (isSelectionOptionalOrNonnull) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final ImmutableList parseEnumList(ImmutableList immutableList, Enum enumR) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        C249803kO it = immutableList.iterator();
        while (it.hasNext()) {
            Enum parseEnum = TreeJNI.parseEnum((String) it.next(), enumR);
            0qQ.A07(parseEnum);
            builder.add(parseEnum);
        }
        ImmutableList build = builder.build();
        0qQ.A07(build);
        return build;
    }

    /* access modifiers changed from: private */
    public final ImmutableList parseStringDefList(ImmutableList immutableList, String str, String str2, FromStringAble fromStringAble) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        C249803kO it = immutableList.iterator();
        while (it.hasNext()) {
            TreeJNI.parseStringDef((String) it.next(), str, str2, fromStringAble);
            0qQ.A07(str2);
            builder.add(str2);
        }
        ImmutableList build = builder.build();
        0qQ.A07(build);
        return build;
    }

    private final Object withCache(int i, C62320sa r3) {
        return intoWithCache(i, r3, C254603sk.A00);
    }

    public final String A0D(String str) {
        return getOptionalStringField(8, str);
    }

    public C250663lr(int i) {
        super(i);
    }

    private final Object intoWithCache(int i, C62320sa r4, 0sP r5) {
        if (0qQ.A0K(getIndexAccessorCache()[i], AnonymousClass4Ky.A00)) {
            getIndexAccessorCache()[i] = r5.invoke(r4.invoke());
        }
        return getIndexAccessorCache()[i];
    }

    public final boolean areAllSelectionsOptionalOrNonnull() {
        Iterator it = 03t.A0L(cachedSelectionSet().A00).iterator();
        while (it.hasNext()) {
            0k0 r0 = (0k0) it.next();
            if (!isSelectionOptionalOrNonnull(r0.A00, (AnonymousClass4Kr) r0.A01)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [com.facebook.pando.TreeJNI$Edge, java.lang.Object] */
    public TreeJNI.Edge[] getEdgeFields() {
        AnonymousClass4Kr[] r8 = cachedSelectionSet().A00;
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass4Kr A00 : r8) {
            AnonymousClass4Kp A002 = AEC.A00(A00);
            if (A002 != null) {
                String str = A002.A00;
                Class cls = A002.A02;
                0qQ.A0C(cls, "null cannot be cast to non-null type java.lang.Class<out com.facebook.pando.TreeWithGraphQL>");
                boolean z = A002.A01.ACZ() instanceof AnonymousClass4L6;
                ? obj = new Object();
                obj.field = str;
                obj.treeClass = cls;
                obj.isPlural = z;
                arrayList.add(obj);
            }
        }
        return (TreeJNI.Edge[]) arrayList.toArray(new TreeJNI.Edge[0]);
    }

    public Class[] getInlineClasses() {
        Class CoW;
        AnonymousClass4Kr[] r5 = cachedSelectionSet().A00;
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass4Kr A02 : r5) {
            C295935p9 A022 = AEC.A02(A02);
            if (!(A022 == null || (CoW = A022.CoW()) == null)) {
                arrayList.add(CoW);
            }
        }
        return (Class[]) arrayList.toArray(new Class[0]);
    }

    public String[] getScalarFields() {
        AnonymousClass4Kr[] r5 = cachedSelectionSet().A00;
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass4Kr A01 : r5) {
            AnonymousClass4L7 A012 = AEC.A01(A01);
            if (A012 != null) {
                arrayList.add(A012.A00);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
