package com.facebook.react.bridge;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C12219SpM;
import X.C12220SpN;
import X.C13246TRm;
import X.C13947Tm7;
import X.C13948Tm8;
import X.C51973G9u;
import X.C66582MXn;
import X.DbT;
import X.JTO;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Arguments {
    public static Bundle toBundle(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        Bundle A0a = AnonymousClass7TE.A0a();
        while (keySetIterator.CKI()) {
            String Crc = keySetIterator.Crc();
            switch (readableMap.getType(Crc).ordinal()) {
                case 0:
                    A0a.putString(Crc, (String) null);
                    break;
                case 1:
                    A0a.putBoolean(Crc, readableMap.getBoolean(Crc));
                    break;
                case 2:
                    A0a.putDouble(Crc, readableMap.getDouble(Crc));
                    break;
                case 3:
                    A0a.putString(Crc, readableMap.getString(Crc));
                    break;
                case 4:
                    A0a.putBundle(Crc, toBundle(readableMap.getMap(Crc)));
                    break;
                case 5:
                    A0a.putSerializable(Crc, toList(readableMap.getArray(Crc)));
                    break;
                default:
                    throw Pxg.A0c("Could not convert object with key: ", Crc, ".");
            }
        }
        return A0a;
    }

    public static ArrayList toList(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (int i = 0; i < readableArray.size(); i++) {
            switch (readableArray.getType(i).ordinal()) {
                case 0:
                    A1C.add((Object) null);
                    break;
                case 1:
                    A1C.add(Boolean.valueOf(readableArray.getBoolean(i)));
                    break;
                case 2:
                    double d = readableArray.getDouble(i);
                    if (d != Math.rint(d)) {
                        Pxf.A1Q(A1C, d);
                        break;
                    } else {
                        AnonymousClass7TF.A1M(A1C, (int) d);
                        break;
                    }
                case 3:
                    A1C.add(readableArray.getString(i));
                    break;
                case 4:
                    A1C.add(toBundle(readableArray.getMap(i)));
                    break;
                case 5:
                    A1C.add(toList(readableArray.getArray(i)));
                    break;
                default:
                    throw AnonymousClass7TE.A0w("Could not convert object in array.");
            }
        }
        return A1C;
    }

    public static C13947Tm7 fromArray(Object obj) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        int i = 0;
        if (obj instanceof String[]) {
            String[] strArr = (String[]) obj;
            int length = strArr.length;
            while (i < length) {
                writableNativeArray.pushString(strArr[i]);
                i++;
            }
        } else if (obj instanceof Bundle[]) {
            Bundle[] bundleArr = (Bundle[]) obj;
            int length2 = bundleArr.length;
            while (i < length2) {
                writableNativeArray.pushMap(fromBundle(bundleArr[i]));
                i++;
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length;
            while (i < length3) {
                writableNativeArray.pushInt(iArr[i]);
                i++;
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length4 = fArr.length;
            while (i < length4) {
                writableNativeArray.pushDouble((double) fArr[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length5 = dArr.length;
            while (i < length5) {
                writableNativeArray.pushDouble(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length6 = zArr.length;
            while (i < length6) {
                writableNativeArray.pushBoolean(zArr[i]);
                i++;
            }
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            int length7 = parcelableArr.length;
            while (i < length7) {
                Parcelable parcelable = parcelableArr[i];
                if (parcelable instanceof Bundle) {
                    writableNativeArray.pushMap(fromBundle((Bundle) parcelable));
                    i++;
                } else {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("Unexpected array member type ");
                    throw C66582MXn.A0j(parcelable.getClass(), A1A);
                }
            }
        } else {
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            A1A2.append("Unknown array type ");
            throw C66582MXn.A0j(obj.getClass(), A1A2);
        }
        return writableNativeArray;
    }

    public static WritableNativeArray fromJavaArgs(Object[] objArr) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (ReadableNativeMap readableNativeMap : objArr) {
            if (readableNativeMap == null) {
                writableNativeArray.pushNull();
            } else {
                Class<?> cls = readableNativeMap.getClass();
                if (cls == Boolean.class) {
                    writableNativeArray.pushBoolean(AnonymousClass7TE.A1a(readableNativeMap));
                } else if (cls == Integer.class || cls == Double.class || cls == Float.class) {
                    writableNativeArray.pushDouble(((Number) readableNativeMap).doubleValue());
                } else if (cls == String.class) {
                    writableNativeArray.pushString(readableNativeMap.toString());
                } else if (cls == WritableNativeMap.class) {
                    writableNativeArray.pushMap(readableNativeMap);
                } else if (cls == WritableNativeArray.class) {
                    writableNativeArray.pushArray((ReadableNativeArray) readableNativeMap);
                } else {
                    throw AnonymousClass7TE.A15(AnonymousClass7TG.A0m(cls, "Cannot convert argument of type ", AnonymousClass7TE.A1A()));
                }
            }
        }
        return writableNativeArray;
    }

    public static C13947Tm7 fromList(List list) {
        C13947Tm7 fromList;
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (Object next : list) {
            if (next == null) {
                writableNativeArray.pushNull();
            } else {
                Class<?> cls = next.getClass();
                if (cls.isArray()) {
                    fromList = fromArray(next);
                } else if (next instanceof Bundle) {
                    writableNativeArray.pushMap(fromBundle((Bundle) next));
                } else if (next instanceof List) {
                    fromList = fromList((List) next);
                } else if (next instanceof String) {
                    writableNativeArray.pushString((String) next);
                } else if (next instanceof Integer) {
                    writableNativeArray.pushInt(AnonymousClass7TE.A0M(next));
                } else if (next instanceof Number) {
                    writableNativeArray.pushDouble(JTO.A00(next));
                } else if (next instanceof Boolean) {
                    writableNativeArray.pushBoolean(AnonymousClass7TE.A1a(next));
                } else {
                    throw C51973G9u.A0g(cls, "Unknown value type ", AnonymousClass7TE.A1A());
                }
                writableNativeArray.pushArray(fromList);
            }
        }
        return writableNativeArray;
    }

    public static WritableNativeArray makeNativeArray(List list) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (list != null) {
            for (Object makeNativeObject : list) {
                Object makeNativeObject2 = makeNativeObject(makeNativeObject);
                if (makeNativeObject2 == null) {
                    writableNativeArray.pushNull();
                } else if (makeNativeObject2 instanceof Boolean) {
                    writableNativeArray.pushBoolean(AnonymousClass7TE.A1a(makeNativeObject2));
                } else if (makeNativeObject2 instanceof Integer) {
                    writableNativeArray.pushInt(AnonymousClass7TE.A0M(makeNativeObject2));
                } else if (makeNativeObject2 instanceof Double) {
                    writableNativeArray.pushDouble(JTO.A00(makeNativeObject2));
                } else if (makeNativeObject2 instanceof String) {
                    writableNativeArray.pushString((String) makeNativeObject2);
                } else if (makeNativeObject2 instanceof WritableNativeArray) {
                    writableNativeArray.pushArray((ReadableNativeArray) makeNativeObject2);
                } else if (makeNativeObject2 instanceof WritableNativeMap) {
                    writableNativeArray.pushMap((ReadableNativeMap) makeNativeObject2);
                } else {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("Could not convert ");
                    throw C66582MXn.A0j(makeNativeObject2.getClass(), A1A);
                }
            }
        }
        return writableNativeArray;
    }

    public static Object makeNativeObject(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Float) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short)) {
            return Double.valueOf(JTO.A00(obj));
        }
        if (obj.getClass().isArray()) {
            return makeNativeArray(new C13246TRm(obj));
        }
        if (obj instanceof List) {
            return makeNativeArray((List) obj);
        }
        if (obj instanceof Map) {
            return makeNativeMap((Map) obj);
        }
        if (obj instanceof Bundle) {
            return makeNativeMap((Bundle) obj);
        }
        if (obj instanceof C12220SpN) {
            return makeNativeMap((Map) ((C12220SpN) obj).toHashMap());
        }
        if (obj instanceof C12219SpM) {
            return makeNativeArray(((C12219SpM) obj).toArrayList());
        }
        return obj;
    }

    public static void addEntry(WritableNativeMap writableNativeMap, String str, Object obj) {
        Object makeNativeObject = makeNativeObject(obj);
        if (makeNativeObject == null) {
            writableNativeMap.putNull(str);
        } else if (makeNativeObject instanceof Boolean) {
            writableNativeMap.putBoolean(str, AnonymousClass7TE.A1a(makeNativeObject));
        } else if (makeNativeObject instanceof Integer) {
            writableNativeMap.putInt(str, AnonymousClass7TE.A0M(makeNativeObject));
        } else if (makeNativeObject instanceof Number) {
            writableNativeMap.putDouble(str, JTO.A00(makeNativeObject));
        } else if (makeNativeObject instanceof String) {
            writableNativeMap.putString(str, (String) makeNativeObject);
        } else if (makeNativeObject instanceof WritableNativeArray) {
            writableNativeMap.putArray(str, (ReadableNativeArray) makeNativeObject);
        } else if (makeNativeObject instanceof WritableNativeMap) {
            writableNativeMap.putMap(str, (ReadableNativeMap) makeNativeObject);
        } else {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Could not convert ");
            throw C66582MXn.A0j(makeNativeObject.getClass(), A1A);
        }
    }

    public static C13948Tm8 fromBundle(Bundle bundle) {
        C13947Tm7 fromList;
        WritableNativeMap A0U = Pxe.A0U();
        Iterator A0t = Pxf.A0t(bundle);
        while (A0t.hasNext()) {
            String A18 = AnonymousClass7TE.A18(A0t);
            Object obj = bundle.get(A18);
            if (obj == null) {
                A0U.putNull(A18);
            } else {
                Class<?> cls = obj.getClass();
                if (cls.isArray()) {
                    fromList = fromArray(obj);
                } else if (obj instanceof String) {
                    A0U.putString(A18, (String) obj);
                } else if (obj instanceof Number) {
                    if (obj instanceof Integer) {
                        A0U.putInt(A18, AnonymousClass7TE.A0M(obj));
                    } else {
                        A0U.putDouble(A18, JTO.A00(obj));
                    }
                } else if (obj instanceof Boolean) {
                    A0U.putBoolean(A18, AnonymousClass7TE.A1a(obj));
                } else if (obj instanceof Bundle) {
                    A0U.putMap(A18, fromBundle((Bundle) obj));
                } else if (obj instanceof List) {
                    fromList = fromList((List) obj);
                } else {
                    throw C51973G9u.A0g(cls, "Could not convert ", AnonymousClass7TE.A1A());
                }
                A0U.putArray(A18, fromList);
            }
        }
        return A0U;
    }

    public static WritableNativeMap makeNativeMap(Map map) {
        WritableNativeMap A0U = Pxe.A0U();
        if (map != null) {
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                addEntry(A0U, DbT.A13(A1J), A1J.getValue());
            }
        }
        return A0U;
    }

    public static WritableNativeMap makeNativeMap(Bundle bundle) {
        WritableNativeMap A0U = Pxe.A0U();
        if (bundle != null) {
            Iterator A0t = Pxf.A0t(bundle);
            while (A0t.hasNext()) {
                String A18 = AnonymousClass7TE.A18(A0t);
                addEntry(A0U, A18, bundle.get(A18));
            }
        }
        return A0U;
    }
}
